package org.muml.eloquent.ocl.vql;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.SetType;
import org.eclipse.ocl.pivot.TupleType;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.library.AbstractOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

public class VQLOperation extends AbstractOperation {
	
	private String matcherClassFQN;
	
	public VQLOperation(@NonNull String matcherClassFQN) {
		this.matcherClassFQN = matcherClassFQN;
	}

	@Override
	public @Nullable Object dispatch(@NonNull Executor executor,
			@NonNull OperationCallExp callExp,
			@Nullable Object sourceValue) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public @Nullable Object basicEvaluate(@NonNull Executor executor,
			@NonNull TypedElement caller,
			@Nullable Object @NonNull [] sourceAndArgumentValues) {
		if (sourceAndArgumentValues.length < 2) {
			// should never happen...
			return null;
		}
		Object contextObject = sourceAndArgumentValues[1];
		if (contextObject == null || !(contextObject instanceof EObject)) {
			// cannot do much without a context object (null yields to
			// oclInvalid)
			return null;
		}
		int numArgs = sourceAndArgumentValues.length - 2;
		Object[] args = new Object[numArgs];
		System.arraycopy(sourceAndArgumentValues, 2, args, 0, numArgs);
		Collection<? extends IPatternMatch> matchResults = performMatch((EObject) contextObject,
				executor, args);
		Operation operation = ((OperationCallExp) caller)
				.getReferredOperation();
		return createResultSet(operation, matchResults);
	}
	
	protected @NonNull IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> loadQuerySpecification(@NonNull Executor executor) {
		List<ClassLoader> classLoaders = ((EnvironmentFactoryInternal) executor.getEnvironmentFactory())
				.getMetamodelManager().getImplementationManager().getClassLoaders();
		Class<?> clazz = null;
		for (ClassLoader classLoader : classLoaders) {
			try {
				clazz = classLoader.loadClass(matcherClassFQN);
			} catch (ClassNotFoundException e) {}
		}
		if (clazz == null) {
			throw new IllegalStateException("unable to get query");
		}
		Object querySpecification = null;
		try {
			Method method = clazz.getMethod("querySpecification");
			querySpecification = method.invoke(null);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
		if (querySpecification == null) {
			throw new IllegalStateException("querySpecification is null");
		}
		// using the IQuerySpecification<?> will not work, because it is not
		// possible to call matcher.getAllMatches(partialMatch) later
		@SuppressWarnings("unchecked")
		IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> cast =
				(IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>) querySpecification;
		return cast;
	}
	
	protected @NonNull Collection<@Nullable ? extends IPatternMatch> performMatch(@NonNull EObject contextObject,
			@NonNull Executor executor,
			@Nullable Object @NonNull [] sourceAndArgumentValues) {
		IQuerySpecification<? extends ViatraQueryMatcher<IPatternMatch>> querySpecification = loadQuerySpecification(executor);
		ViatraQueryMatcher<IPatternMatch> matcher;
		try {
			ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(contextObject));
			matcher = engine.getMatcher(querySpecification);
		} catch (ViatraQueryException e) {
			throw new RuntimeException(e);
		}
		Collection<IPatternMatch> matchResults;
		if (sourceAndArgumentValues.length > 0) {
			IPatternMatch partialMatch = matcher.newMatch(sourceAndArgumentValues);
			matchResults = matcher.getAllMatches(partialMatch);
		} else {
			matchResults = matcher.getAllMatches();
		}
		return ClassUtil.nonNull(matchResults);
	}
	
	protected @NonNull SetValue createResultSet(@NonNull Operation operation,
			@NonNull Collection<@Nullable ? extends IPatternMatch> matchResults) {
		Set<@NonNull TupleValue> resultSet = new HashSet<TupleValue>(matchResults.size());
		SetType setType = (SetType) operation.getType();
		TupleTypeId tupleTypeId = ((TupleType) setType.getElementType())
				.getTupleTypeId();
		for (IPatternMatch match : matchResults) {
			Map<@NonNull TuplePartId, @Nullable Object> partToValueMap = new HashMap<TuplePartId, Object>();
			for (TuplePartId partId : tupleTypeId.getPartIds()) {
				String partName = partId.getName();
				Object value = ClassUtil.nonNull(match).get(partName);
				partToValueMap.put(partId, value);
			}
			TupleValue tupleValue = createTupleValue(tupleTypeId,
					partToValueMap);
			resultSet.add(tupleValue);
		}
		return createSetValue(setType.getTypeId(), resultSet);
	}

}

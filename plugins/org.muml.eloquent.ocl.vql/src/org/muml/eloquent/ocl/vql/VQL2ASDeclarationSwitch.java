package org.muml.eloquent.ocl.vql;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.PrimitiveType;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.TypedElement;
import org.eclipse.ocl.pivot.internal.executor.ExecutorTuplePart;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.ClassType;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.util.EMFPatternLanguageSwitch;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.JavaType;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Parameter;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.util.PatternLanguageSwitch;

import com.google.common.base.Predicate;

public class VQL2ASDeclarationSwitch extends EMFPatternLanguageSwitch<Object> {
	
	private static final String unnamedPattern = "Pattern must have a name";
	
	private static final Predicate<Pattern> patternFilter =
			p -> !p.getModifiers().isPrivate();
	
	private PatternLanguageSwitch<Object> delegate = new PatternLanguageSwitch<Object>() {
		
		private static final String unexpectedElement =
				"Got unexpected element: %s";
		private static final String nonPrimitiveType =
				"Cannot handle non-primitive type: %s";
		
		private boolean parameterToTuplePart = true;
		
		class NoProxyExecutorTuplePart extends ExecutorTuplePart {

			public NoProxyExecutorTuplePart(@NonNull Type type, @NonNull String name) {
				super(type, name);
			}
			
			@Override
			public boolean eIsProxy() {
				/*
				 *  The super class throws an UnsupportedOperationException.
				 *  This method is called during PivotUtilInternal.refreshList
				 */
				return false;
			}
			
		}
		
		protected @NonNull String getFullyQualifiedMatcherClassName(Pattern pattern) {
			PatternModel model = (PatternModel) ClassUtil.nonNull(
				pattern.eContainer());
			String name = ClassUtil.nonNull(pattern.getName());
			if (name.length() == 0) {
				throw new IllegalStateException(unnamedPattern);
			}
			String fqn = getPackageName(model) + "." + toUpperCaseFirst(name);
			return fqn + "Matcher";
		}
		
		protected @NonNull Operation createOperation(Pattern pattern) {
			String operationName = ClassUtil.nonNull(pattern.getName());
			parameterToTuplePart = true;
			List<@NonNull TypedElement> tupleParts = new ArrayList<TypedElement>();
			doSwitchAll(tupleParts, pattern.getParameters());
			Type tupleType = converter.getTupleType(tupleParts);
			Type type = converter.getSetType(tupleType);
			Operation operation = PivotUtil.createOperation(operationName, type,
					null, null);
			operation.setIsStatic(true);
			return operation;
		}
		
		protected void addContextParameter(@NonNull Operation operation) {
			String parameterName = "contextObject";
			boolean uniqueName = false;
			while (!uniqueName) {
				uniqueName = true;
				for (org.eclipse.ocl.pivot.Parameter parameter : operation
						.getOwnedParameters()) {
					if (parameterName.equals(parameter.getName())) {
						parameterName += "X";
						uniqueName = false;
						break;
					}
				}
			}
			org.eclipse.ocl.pivot.Parameter parameter =
					PivotUtil.createParameter(parameterName,
							converter.getAnyType(), true);
			operation.getOwnedParameters().add(0, parameter);
		}
		
		@Override
		public List<Operation> casePattern(Pattern pattern) {
			// bound/unbound refers to the binding of parameters
			String matcherClassName = getFullyQualifiedMatcherClassName(pattern);
			Operation unboundOperation = createOperation(pattern);
			addContextParameter(unboundOperation);
			VQLOperation implementation = new VQLOperation(matcherClassName);
			unboundOperation.setImplementation(implementation);
			List<Operation> resultList = new ArrayList<Operation>();
			resultList.add(unboundOperation);
			if (!pattern.getParameters().isEmpty()) {
				// hmm this should be always the case...
				Operation boundOperation = createOperation(pattern);
				boundOperation.setImplementation(implementation);
				parameterToTuplePart = false;
				doSwitchAll(boundOperation.getOwnedParameters(),
						pattern.getParameters());
				addContextParameter(boundOperation);
				resultList.add(boundOperation);
			}
			return resultList;
		}
		
		@Override
		public TypedElement caseParameter(Parameter parameter) {
			Type type = (Type) VQL2ASDeclarationSwitch.this.doSwitch(parameter.getType());
			type = ClassUtil.nonNull(type);
			String name = ClassUtil.nonNull(parameter.getName());
			if (parameterToTuplePart) {
				return new NoProxyExecutorTuplePart(type, name);
			}
			return PivotUtil.createParameter(name, type, true);
		}
		
		@Override
		public PrimitiveType caseJavaType(JavaType javaType) {
			Class<?> javaClass = null;
			try {
				javaClass = Class.forName(javaType.getClassRef().getIdentifier());
			} catch (ClassNotFoundException e) {
				converter.error(String.format(nonPrimitiveType, javaType));
			}
			if (javaClass == null) {
				// logs another error in the default case...
				return null;
			}
			return converter.getPrimitiveType(javaClass);
		}
		
		@Override
		public Object defaultCase(EObject eObject) {
			// just log an error
			converter.error(String.format(unexpectedElement, eObject));
			return null;
		}
		
	};
	
	protected static @NonNull String toUpperCaseFirst(@NonNull String name) {
		String uName = name.substring(0, 1).toUpperCase(Locale.ROOT);
		if (name.length() >= 2) {
			uName += name.substring(1);
		}
		return uName;
	}
	
	private VQL2AS converter;
	
	public VQL2ASDeclarationSwitch(VQL2AS converter) {
		this.converter = converter;
	}
	
	protected @NonNull String getNsURI(PatternModel patternModel) {
		return ClassUtil.nonNull(converter.getURI().toString());
	}
	
	protected @NonNull String getNsPrefix(PatternModel patternModel) {
		return getPackageName(patternModel);
	}
	
	protected @NonNull String getPackageName(PatternModel patternModel) {
		/*
		 * Hrm according to
		 * org.eclipse.viatra.query.patternlanguage.emf.util.EMFPatternLanguageJvmModelInferrerUtil.getPackageName(Pattern)
		 * an empty ("") package name is possible, but this seems to break
		 * the viatra code generation => log an error at least 
		 */
		String pkgName = ClassUtil.nonNull(patternModel.getPackageName());
		if ("".equals(pkgName)) {
			converter.error("empty viatra package");
		}
		return pkgName;
	}
	
	protected org.eclipse.ocl.pivot.@NonNull Package createPackages(PatternModel patternModel) {
		String pkgName = getPackageName(patternModel);
		String nsURI = getNsURI(patternModel);
		String parts[] = pkgName.split("\\.");
		// set nsURI for the purpose of disambiguation (needed for the
		// import of multiple *.vql files)
		org.eclipse.ocl.pivot.Package pkg = PivotUtil.createPackage(parts[parts.length - 1],
				null, nsURI, null);
		for (int i = parts.length - 2; i >= 0; i--) {
			// eeek: createPackage expects a non null nsURI, but null is ok...
			org.eclipse.ocl.pivot.Package currentPkg = PivotUtil.createPackage(parts[i],
					null, null, null);
			currentPkg.getOwnedPackages().add(pkg);
			pkg = currentPkg;
		}
		return pkg;
	}
	
	protected org.eclipse.ocl.pivot.@NonNull Class createClass(@NonNull PatternModel patternModel) {
		Resource resource = ClassUtil.nonNull(patternModel.eResource());
		String filename = resource.getURI().trimFileExtension().lastSegment();
		String className = toUpperCaseFirst(ClassUtil.nonNull(filename)); 
		return PivotUtil.createClass(ClassUtil.nonNull(className));
	}
	
	@Override
	public Element casePatternModel(PatternModel patternModel) {
		Model model = converter.getASModel();
		org.eclipse.ocl.pivot.Package pkg = createPackages(patternModel);
		model.getOwnedPackages().add(pkg);
		for ( ; !pkg.getOwnedPackages().isEmpty(); pkg = pkg.getOwnedPackages().get(0))
			;
		org.eclipse.ocl.pivot.Class cls = createClass(patternModel);
		pkg.getOwnedClasses().add(cls);
		List<Pattern> patterns = patternModel.getPatterns().stream()
				.filter(patternFilter).collect(Collectors.toList());
		doSwitchAll(cls.getOwnedOperations(), patterns);
		return pkg;
	}
	
	@Override
	public Type caseClassType(ClassType classType) {
		return converter.getType(ClassUtil.nonNull(classType.getClassname()));
	}
	
	@Override
	public Object defaultCase(EObject eObject) {
		return delegate.doSwitch(eObject);
	}
	
	// based on from org.eclipse.ocl.pivot.internal.ecore.es2as.Ecore2ASDeclarationSwitch.doSwitchAll
	protected <T extends EObject> void doSwitchAll(List<T> pivotList,
			List<? extends EObject> eObjectList) {
		List<T> newElements = new ArrayList<T>();
		for (EObject eObject : eObjectList) {
			Object result = doSwitch(eObject);
			if (!(result instanceof List<?>)) {
				result = Collections.singletonList(result);
			}
			for (Object element : (List<?>) result) {
				@SuppressWarnings("unchecked")
				T cast = (T) element;
				newElements.add(cast);
			}
		}
		PivotUtilInternal.refreshList(pivotList, newElements);
	}

}

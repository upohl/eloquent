package org.muml.eloquent.algorithm.ilp.neos.cplex;

import java.util.HashMap;
import java.util.Map;

import org.muml.psm.allocation.ilp.ConstraintExpression;
import org.muml.psm.allocation.ilp.ObjectiveFunctionExpression;
import org.muml.psm.allocation.ilp.Variable;

/* hmm maybe we should provide an interface for this (which
 * encapsulates getName(...) and getObject(...)
 */
// enc
public class ILPNameEnvironment {
	
	private static final String variablePrefix = "var";
	private static final String constraintPrefix = "constraint";
	private static final String objectiveFunctionPrefix = "objective";
	private static final String noName = "unable to provide a name for %s";
	private static final String illegalBinding =
			"Binding \"%s\" to the name \"%s\" not possible";
	private static final String noBinding =
			"Name \"%s\" is not bound to any object";
	
	private Map<Object, String> nameMap;
	private Map<String, Object> nameRMap;
	
	public ILPNameEnvironment() {
		nameMap = new HashMap<Object, String>();
		nameRMap = new HashMap<String, Object>();
	}
	
	protected void bind(Object object, String name) {
		if (nameMap.containsKey(object) || nameRMap.containsKey(name)) {
			throw new IllegalStateException(String.format(illegalBinding,
					object, name));
		}
		nameMap.put(object, name);
		nameRMap.put(name, object);
	}
	
	public String getName(Object object) {
		String name = nameMap.get(object);
		if (name != null) {
			return name;
		}
		if (object instanceof Variable) {
			name = getNameFor((Variable) object);
		} else if (object instanceof ConstraintExpression) {
			name = getNameFor((ConstraintExpression) object);
		} else if (object instanceof ObjectiveFunctionExpression){
			name = getNameFor((ObjectiveFunctionExpression) object);
		} else {
			throw new IllegalArgumentException(String.format(noName, object));
		}
		bind(object, name);
		return name;
	}
	
	public Object getObject(String name) {
		Object object = nameRMap.get(name);
		if (object == null) {
			throw new IllegalArgumentException(String.format(noBinding, name));
		}
		return object;
	}
	
	protected String getNameFor(Variable variable) {
		return variablePrefix + nameMap.size();
	}
	
	protected String getNameFor(ConstraintExpression constraintExpression) {
		return constraintPrefix + nameMap.size();
	}
	
	protected String getNameFor(ObjectiveFunctionExpression objectiveFunctionExpression) {
		return objectiveFunctionPrefix + nameMap.size();
	}
}

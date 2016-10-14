package org.muml.psm.allocation.language.xtext.typing;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.CollectionType;
import org.eclipse.ocl.pivot.TupleType;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.internal.complete.CompleteEnvironmentInternal;
import org.eclipse.ocl.pivot.internal.complete.CompleteModelInternal;
import org.eclipse.ocl.pivot.internal.complete.StandardLibraryInternal;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
import org.eclipse.ocl.pivot.internal.manager.TupleTypeManager;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.values.TemplateParameterSubstitutions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;
import org.muml.psm.allocation.language.as.BoundWeightTupleDescriptor;
import org.muml.psm.allocation.language.as.EvaluatableElement;
import org.muml.psm.allocation.language.as.LocationConstraint;
import org.muml.psm.allocation.language.as.QoSDimension;
import org.muml.psm.allocation.language.as.RequiredHardwareResourceInstanceConstraint;
import org.muml.psm.allocation.language.as.ResourceConstraint;
import org.muml.psm.allocation.language.as.TupleDescriptor;
import org.muml.psm.allocation.language.as.TypedNamedPart;
import org.muml.psm.allocation.language.as.TypedPair;
import org.muml.psm.allocation.language.as.WeightTupleDescriptor;

@SuppressWarnings("all")
public class TypesUtil {
  private final static String missingEnvFac = "An EnvironmentFactory should be associated with %s";
  
  private final static String tupleName = "Tuple";
  
  /**
   * @NonNull
   */
  public static Type getType(final EnvironmentFactoryInternal envFactory, final EClass eClass) {
    org.eclipse.ocl.pivot.Class _xblockexpression = null;
    {
      final IdResolver idResolver = envFactory.getIdResolver();
      _xblockexpression = idResolver.getType(eClass);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static TupleType createTupleType(final EnvironmentFactoryInternal envFactory, final Map<String, Type> namedParts) {
    TupleType _xblockexpression = null;
    {
      CompleteModelInternal _completeModel = envFactory.getCompleteModel();
      final TupleTypeManager tupleTypeManager = _completeModel.getTupleManager();
      _xblockexpression = tupleTypeManager.getTupleType(TypesUtil.tupleName, namedParts);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static Type getRealType(final EnvironmentFactoryInternal envFactory) {
    StandardLibraryInternal _standardLibrary = envFactory.getStandardLibrary();
    return _standardLibrary.getRealType();
  }
  
  /**
   * @NonNull
   */
  public static CollectionType createSetType(final EnvironmentFactoryInternal envFactory, final Type type) {
    CompleteEnvironmentInternal _completeEnvironment = envFactory.getCompleteEnvironment();
    return _completeEnvironment.getSetType(type, false, null, null);
  }
  
  /**
   * @NonNull
   */
  public static EnvironmentFactoryInternal getEnvironmentFactory(final EObject object) {
    EnvironmentFactoryInternal _xblockexpression = null;
    {
      final EnvironmentFactoryInternal envFactory = PivotUtilInternal.findEnvironmentFactory(object);
      boolean _equals = Objects.equal(envFactory, null);
      if (_equals) {
        String _format = String.format(TypesUtil.missingEnvFac, object);
        throw new IllegalStateException(_format);
      }
      _xblockexpression = envFactory;
    }
    return _xblockexpression;
  }
  
  public static boolean conformsTo(final EnvironmentFactoryInternal envFactory, final Type actualType, final Type expectedType) {
    PivotMetamodelManager _metamodelManager = envFactory.getMetamodelManager();
    return _metamodelManager.conformsTo(actualType, TemplateParameterSubstitutions.EMPTY, expectedType, TemplateParameterSubstitutions.EMPTY);
  }
  
  public static Map<String, Type> convertToNamedParts(final List<TypedPair> typedPairs) {
    HashMap<String, Type> _xblockexpression = null;
    {
      final HashMap<String, Type> namedParts = CollectionLiterals.<String, Type>newHashMap();
      final Consumer<TypedPair> _function = (TypedPair typedPair) -> {
        TypedNamedPart _first = typedPair.getFirst();
        String _name = _first.getName();
        TypedNamedPart _first_1 = typedPair.getFirst();
        Type _type = _first_1.getType();
        namedParts.put(_name, _type);
        TypedNamedPart _second = typedPair.getSecond();
        String _name_1 = _second.getName();
        TypedNamedPart _second_1 = typedPair.getSecond();
        Type _type_1 = _second_1.getType();
        namedParts.put(_name_1, _type_1);
      };
      typedPairs.forEach(_function);
      _xblockexpression = namedParts;
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static TupleType createLocationConstraintTupleType(final EnvironmentFactoryInternal envFactory, final LocationConstraint constraint) {
    TupleType _xblockexpression = null;
    {
      TupleDescriptor _tupleDescriptor = constraint.getTupleDescriptor();
      EList<TypedPair> _typedPairs = _tupleDescriptor.getTypedPairs();
      final Map<String, Type> namedParts = TypesUtil.convertToNamedParts(_typedPairs);
      _xblockexpression = TypesUtil.createTupleType(envFactory, namedParts);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static Type createLocationConstraintType(final LocationConstraint constraint) {
    CollectionType _xblockexpression = null;
    {
      final EnvironmentFactoryInternal envFactory = TypesUtil.getEnvironmentFactory(constraint);
      TupleType _createLocationConstraintTupleType = TypesUtil.createLocationConstraintTupleType(envFactory, constraint);
      _xblockexpression = TypesUtil.createSetType(envFactory, _createLocationConstraintTupleType);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static TupleType createReqHWResInstanceConstraintTupleType(final EnvironmentFactoryInternal envFactory, final RequiredHardwareResourceInstanceConstraint constraint) {
    TupleType _xblockexpression = null;
    {
      TupleDescriptor _tupleDescriptor = constraint.getTupleDescriptor();
      EList<TypedPair> _typedPairs = _tupleDescriptor.getTypedPairs();
      final Map<String, Type> namedParts = TypesUtil.convertToNamedParts(_typedPairs);
      _xblockexpression = TypesUtil.createTupleType(envFactory, namedParts);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static Type createReqHWResInstanceConstraintType(final RequiredHardwareResourceInstanceConstraint constraint) {
    CollectionType _xblockexpression = null;
    {
      final EnvironmentFactoryInternal envFactory = TypesUtil.getEnvironmentFactory(constraint);
      TupleType _createReqHWResInstanceConstraintTupleType = TypesUtil.createReqHWResInstanceConstraintTupleType(envFactory, constraint);
      _xblockexpression = TypesUtil.createSetType(envFactory, _createReqHWResInstanceConstraintTupleType);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static TupleType createWeightTupleDescriptorTupleType(final EnvironmentFactoryInternal envFactory, final WeightTupleDescriptor tupleDescriptor) {
    TupleType _xblockexpression = null;
    {
      EList<TypedPair> _typedPairs = tupleDescriptor.getTypedPairs();
      final Map<String, Type> namedParts = TypesUtil.convertToNamedParts(_typedPairs);
      String _weight = tupleDescriptor.getWeight();
      Type _realType = TypesUtil.getRealType(envFactory);
      namedParts.put(_weight, _realType);
      _xblockexpression = TypesUtil.createTupleType(envFactory, namedParts);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static TupleType createResourceConstraintInnerTupleType(final EnvironmentFactoryInternal envFactory, final ResourceConstraint constraint) {
    BoundWeightTupleDescriptor _tupleDescriptor = constraint.getTupleDescriptor();
    return TypesUtil.createWeightTupleDescriptorTupleType(envFactory, _tupleDescriptor);
  }
  
  /**
   * @NonNull
   */
  public static TupleType createResourceConstraintOuterTupleType(final EnvironmentFactoryInternal envFactory, final ResourceConstraint constraint) {
    final Type innerTupleType = TypesUtil.createResourceConstraintInnerTupleType(envFactory, constraint);
    BoundWeightTupleDescriptor _tupleDescriptor = constraint.getTupleDescriptor();
    String _weight = _tupleDescriptor.getWeight();
    CollectionType _createSetType = TypesUtil.createSetType(envFactory, innerTupleType);
    Pair<String, CollectionType> _mappedTo = Pair.<String, CollectionType>of(_weight, _createSetType);
    BoundWeightTupleDescriptor _tupleDescriptor_1 = constraint.getTupleDescriptor();
    String _bound = _tupleDescriptor_1.getBound();
    Type _realType = TypesUtil.getRealType(envFactory);
    Pair<String, Type> _mappedTo_1 = Pair.<String, Type>of(_bound, _realType);
    final Map<String, Type> outerNamedParts = Collections.<String, Type>unmodifiableMap(CollectionLiterals.<String, Type>newHashMap(_mappedTo, _mappedTo_1));
    return TypesUtil.createTupleType(envFactory, outerNamedParts);
  }
  
  /**
   * @NonNull
   */
  public static Type createResourceConstraintType(final ResourceConstraint constraint) {
    CollectionType _xblockexpression = null;
    {
      final EnvironmentFactoryInternal envFactory = TypesUtil.getEnvironmentFactory(constraint);
      TupleType _createResourceConstraintOuterTupleType = TypesUtil.createResourceConstraintOuterTupleType(envFactory, constraint);
      _xblockexpression = TypesUtil.createSetType(envFactory, _createResourceConstraintOuterTupleType);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static TupleType createQoSDimensionTupleType(final EnvironmentFactoryInternal envFactory, final QoSDimension qosDimension) {
    WeightTupleDescriptor _tupleDescriptor = qosDimension.getTupleDescriptor();
    return TypesUtil.createWeightTupleDescriptorTupleType(envFactory, _tupleDescriptor);
  }
  
  /**
   * @NonNull
   */
  public static Type createQoSDimensionType(final QoSDimension qosDimension) {
    CollectionType _xblockexpression = null;
    {
      final EnvironmentFactoryInternal envFactory = TypesUtil.getEnvironmentFactory(qosDimension);
      TupleType _createQoSDimensionTupleType = TypesUtil.createQoSDimensionTupleType(envFactory, qosDimension);
      _xblockexpression = TypesUtil.createSetType(envFactory, _createQoSDimensionTupleType);
    }
    return _xblockexpression;
  }
  
  protected static Type _createType(final EvaluatableElement element) {
    throw new IllegalArgumentException(("unexpected element: " + element));
  }
  
  protected static Type _createType(final LocationConstraint constraint) {
    return TypesUtil.createLocationConstraintType(constraint);
  }
  
  protected static Type _createType(final RequiredHardwareResourceInstanceConstraint constraint) {
    return TypesUtil.createReqHWResInstanceConstraintType(constraint);
  }
  
  protected static Type _createType(final ResourceConstraint constraint) {
    return TypesUtil.createResourceConstraintType(constraint);
  }
  
  protected static Type _createType(final QoSDimension qosDimension) {
    return TypesUtil.createQoSDimensionType(qosDimension);
  }
  
  public static Type createType(final EvaluatableElement constraint) {
    if (constraint instanceof LocationConstraint) {
      return _createType((LocationConstraint)constraint);
    } else if (constraint instanceof RequiredHardwareResourceInstanceConstraint) {
      return _createType((RequiredHardwareResourceInstanceConstraint)constraint);
    } else if (constraint instanceof ResourceConstraint) {
      return _createType((ResourceConstraint)constraint);
    } else if (constraint instanceof QoSDimension) {
      return _createType((QoSDimension)constraint);
    } else if (constraint != null) {
      return _createType(constraint);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(constraint).toString());
    }
  }
}

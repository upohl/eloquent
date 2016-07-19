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
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.MapExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.muml.pim.instance.InstancePackage;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.EvaluatableElementCS;
import org.muml.psm.allocation.language.cs.LocationConstraintCS;
import org.muml.psm.allocation.language.cs.LocationTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.QoSDimensionCS;
import org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS;
import org.muml.psm.allocation.language.cs.ResourceConstraintCS;
import org.muml.psm.allocation.language.cs.ValueTupleDescriptorCS;
import org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS;

@SuppressWarnings("all")
public class TypesUtil {
  private final static String missingEnvFac = "An EnvironmentFactory should be associated with %s";
  
  private final static String tupleName = "Tuple";
  
  /**
   * @NonNull
   */
  public static TupleType createTupleTypeHelper(final EnvironmentFactoryInternal envFactory, final Map<String, EClass> namedParts) {
    TupleType _xblockexpression = null;
    {
      final Function1<EClass, Type> _function = new Function1<EClass, Type>() {
        public Type apply(final EClass eClass) {
          return TypesUtil.getType(envFactory, eClass);
        }
      };
      final Map<String, Type> newNamedParts = MapExtensions.<String, EClass, Type>mapValues(namedParts, _function);
      _xblockexpression = TypesUtil.createTupleType(envFactory, newNamedParts);
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
  
  /**
   * @NonNull
   */
  public static TupleType createLocationConstraintTupleType(final LocationConstraintCS locationConstraintCS) {
    EnvironmentFactoryInternal _environmentFactory = TypesUtil.getEnvironmentFactory(locationConstraintCS);
    LocationTupleDescriptorCS _tupleDescriptor = locationConstraintCS.getTupleDescriptor();
    return TypesUtil.createLocationConstraintTupleType(_environmentFactory, _tupleDescriptor);
  }
  
  /**
   * @NonNull
   */
  public static TupleType createLocationConstraintTupleType(final EnvironmentFactoryInternal envFactory, final LocationTupleDescriptorCS tupleDescriptor) {
    TupleType _xblockexpression = null;
    {
      String _instance = tupleDescriptor.getInstance();
      Pair<String, EClass> _mappedTo = Pair.<String, EClass>of(_instance, InstancePackage.Literals.COMPONENT_INSTANCE);
      String _secondInstance = tupleDescriptor.getSecondInstance();
      Pair<String, EClass> _mappedTo_1 = Pair.<String, EClass>of(_secondInstance, InstancePackage.Literals.COMPONENT_INSTANCE);
      final Map<String, EClass> namedParts = Collections.<String, EClass>unmodifiableMap(CollectionLiterals.<String, EClass>newHashMap(_mappedTo, _mappedTo_1));
      _xblockexpression = TypesUtil.createTupleTypeHelper(envFactory, namedParts);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static Type createLocationConstraintType(final LocationConstraintCS locationConstraintCS) {
    CollectionType _xblockexpression = null;
    {
      final EnvironmentFactoryInternal envFactory = TypesUtil.getEnvironmentFactory(locationConstraintCS);
      LocationTupleDescriptorCS _tupleDescriptor = locationConstraintCS.getTupleDescriptor();
      TupleType _createLocationConstraintTupleType = TypesUtil.createLocationConstraintTupleType(envFactory, _tupleDescriptor);
      _xblockexpression = TypesUtil.createSetType(envFactory, _createLocationConstraintTupleType);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static TupleType createReqHWResInstanceConstraintTupleType(final RequiredHardwareResourceInstanceConstraintCS constraintCS) {
    TupleType _xblockexpression = null;
    {
      final EnvironmentFactoryInternal envFactory = TypesUtil.getEnvironmentFactory(constraintCS);
      EList<ComponentResourceTupleDescriptorCS> _tupleDescriptors = constraintCS.getTupleDescriptors();
      _xblockexpression = TypesUtil.createReqHWResInstanceConstraintTupleType(envFactory, _tupleDescriptors);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static Map<String, EClass> createNamedPartsFromComponentResourceTupleDescriptors(final List<ComponentResourceTupleDescriptorCS> tupleDescriptorList) {
    HashMap<String, EClass> _xblockexpression = null;
    {
      final HashMap<String, EClass> namedParts = CollectionLiterals.<String, EClass>newHashMap();
      final Consumer<ComponentResourceTupleDescriptorCS> _function = new Consumer<ComponentResourceTupleDescriptorCS>() {
        public void accept(final ComponentResourceTupleDescriptorCS t) {
          String _instance = t.getInstance();
          Pair<String, EClass> _mappedTo = Pair.<String, EClass>of(_instance, InstancePackage.Literals.COMPONENT_INSTANCE);
          String _hwresinstance = t.getHwresinstance();
          Pair<String, EClass> _mappedTo_1 = Pair.<String, EClass>of(_hwresinstance, HwresourceinstancePackage.Literals.RESOURCE_INSTANCE);
          namedParts.putAll(
            Collections.<String, EClass>unmodifiableMap(CollectionLiterals.<String, EClass>newHashMap(_mappedTo, _mappedTo_1)));
        }
      };
      tupleDescriptorList.forEach(_function);
      _xblockexpression = namedParts;
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static TupleType createReqHWResInstanceConstraintTupleType(final EnvironmentFactoryInternal envFactory, final List<ComponentResourceTupleDescriptorCS> tupleDescriptorList) {
    TupleType _xblockexpression = null;
    {
      final Map<String, EClass> namedParts = TypesUtil.createNamedPartsFromComponentResourceTupleDescriptors(tupleDescriptorList);
      _xblockexpression = TypesUtil.createTupleTypeHelper(envFactory, namedParts);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static Type createReqHWResInstanceConstraintType(final RequiredHardwareResourceInstanceConstraintCS constraintCS) {
    CollectionType _xblockexpression = null;
    {
      final EnvironmentFactoryInternal envFactory = TypesUtil.getEnvironmentFactory(constraintCS);
      EList<ComponentResourceTupleDescriptorCS> _tupleDescriptors = constraintCS.getTupleDescriptors();
      TupleType _createReqHWResInstanceConstraintTupleType = TypesUtil.createReqHWResInstanceConstraintTupleType(envFactory, _tupleDescriptors);
      _xblockexpression = TypesUtil.createSetType(envFactory, _createReqHWResInstanceConstraintTupleType);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static TupleType createResourceConstraintInnerTupleType(final ResourceConstraintCS constraintCS) {
    TupleType _xblockexpression = null;
    {
      final EnvironmentFactoryInternal envFactory = TypesUtil.getEnvironmentFactory(constraintCS);
      _xblockexpression = TypesUtil.createWeightingComponentResourceTupleElementCSTupleType(envFactory, constraintCS);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static TupleType createResourceConstraintOuterTupleType(final EnvironmentFactoryInternal envFactory, final ResourceConstraintCS constraintCS) {
    TupleType _xblockexpression = null;
    {
      final Type innerTupleType = TypesUtil.createWeightingComponentResourceTupleElementCSTupleType(envFactory, constraintCS);
      ValueTupleDescriptorCS _weighting = constraintCS.getWeighting();
      String _value = _weighting.getValue();
      CollectionType _createSetType = TypesUtil.createSetType(envFactory, innerTupleType);
      Pair<String, CollectionType> _mappedTo = Pair.<String, CollectionType>of(_value, _createSetType);
      ValueTupleDescriptorCS _rhs = constraintCS.getRhs();
      String _value_1 = _rhs.getValue();
      Type _realType = TypesUtil.getRealType(envFactory);
      Pair<String, Type> _mappedTo_1 = Pair.<String, Type>of(_value_1, _realType);
      final Map<String, Type> namedParts = Collections.<String, Type>unmodifiableMap(CollectionLiterals.<String, Type>newHashMap(_mappedTo, _mappedTo_1));
      _xblockexpression = TypesUtil.createTupleType(envFactory, namedParts);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static TupleType createResourceConstraintOuterTupleType(final ResourceConstraintCS constraintCS) {
    TupleType _xblockexpression = null;
    {
      final EnvironmentFactoryInternal envFactory = TypesUtil.getEnvironmentFactory(constraintCS);
      _xblockexpression = TypesUtil.createResourceConstraintOuterTupleType(envFactory, constraintCS);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static Type createResourceConstraintType(final ResourceConstraintCS constraintCS) {
    CollectionType _xblockexpression = null;
    {
      final EnvironmentFactoryInternal envFactory = TypesUtil.getEnvironmentFactory(constraintCS);
      TupleType _createResourceConstraintOuterTupleType = TypesUtil.createResourceConstraintOuterTupleType(envFactory, constraintCS);
      _xblockexpression = TypesUtil.createSetType(envFactory, _createResourceConstraintOuterTupleType);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static TupleType createQoSDimensionTupleType(final QoSDimensionCS qosDimensionCS) {
    TupleType _xblockexpression = null;
    {
      final EnvironmentFactoryInternal envFactory = TypesUtil.getEnvironmentFactory(qosDimensionCS);
      _xblockexpression = TypesUtil.createWeightingComponentResourceTupleElementCSTupleType(envFactory, qosDimensionCS);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static Type createQoSDimensionType(final QoSDimensionCS qosDimensionCS) {
    CollectionType _xblockexpression = null;
    {
      final EnvironmentFactoryInternal envFactory = TypesUtil.getEnvironmentFactory(qosDimensionCS);
      TupleType _createWeightingComponentResourceTupleElementCSTupleType = TypesUtil.createWeightingComponentResourceTupleElementCSTupleType(envFactory, qosDimensionCS);
      _xblockexpression = TypesUtil.createSetType(envFactory, _createWeightingComponentResourceTupleElementCSTupleType);
    }
    return _xblockexpression;
  }
  
  /**
   * @NonNull
   */
  public static TupleType createWeightingComponentResourceTupleElementCSTupleType(final EnvironmentFactoryInternal envFactory, final WeightingComponentResourceTupleElementCS elementCS) {
    TupleType _xblockexpression = null;
    {
      Map<String, Type> namedParts = CollectionLiterals.<String, Type>newHashMap();
      EList<ComponentResourceTupleDescriptorCS> _tupleDescriptors = elementCS.getTupleDescriptors();
      Map<String, EClass> _createNamedPartsFromComponentResourceTupleDescriptors = TypesUtil.createNamedPartsFromComponentResourceTupleDescriptors(_tupleDescriptors);
      final Function1<EClass, Type> _function = new Function1<EClass, Type>() {
        public Type apply(final EClass eClass) {
          return TypesUtil.getType(envFactory, eClass);
        }
      };
      Map<String, Type> _mapValues = MapExtensions.<String, EClass, Type>mapValues(_createNamedPartsFromComponentResourceTupleDescriptors, _function);
      namedParts.putAll(_mapValues);
      ValueTupleDescriptorCS _weighting = elementCS.getWeighting();
      String _value = _weighting.getValue();
      Type _realType = TypesUtil.getRealType(envFactory);
      namedParts.put(_value, _realType);
      _xblockexpression = TypesUtil.createTupleType(envFactory, namedParts);
    }
    return _xblockexpression;
  }
  
  protected static Type _createType(final EvaluatableElementCS element) {
    throw new IllegalArgumentException(("unexpected element: " + element));
  }
  
  protected static Type _createType(final LocationConstraintCS constraintCS) {
    return TypesUtil.createLocationConstraintType(constraintCS);
  }
  
  protected static Type _createType(final RequiredHardwareResourceInstanceConstraintCS constraintCS) {
    return TypesUtil.createReqHWResInstanceConstraintType(constraintCS);
  }
  
  protected static Type _createType(final ResourceConstraintCS constraintCS) {
    return TypesUtil.createResourceConstraintType(constraintCS);
  }
  
  protected static Type _createType(final QoSDimensionCS qosDimensionCS) {
    return TypesUtil.createQoSDimensionType(qosDimensionCS);
  }
  
  public static Type createType(final EvaluatableElementCS constraintCS) {
    if (constraintCS instanceof LocationConstraintCS) {
      return _createType((LocationConstraintCS)constraintCS);
    } else if (constraintCS instanceof RequiredHardwareResourceInstanceConstraintCS) {
      return _createType((RequiredHardwareResourceInstanceConstraintCS)constraintCS);
    } else if (constraintCS instanceof ResourceConstraintCS) {
      return _createType((ResourceConstraintCS)constraintCS);
    } else if (constraintCS instanceof QoSDimensionCS) {
      return _createType((QoSDimensionCS)constraintCS);
    } else if (constraintCS != null) {
      return _createType(constraintCS);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(constraintCS).toString());
    }
  }
}

package de.uni_paderborn.fujaba.muml.allocation.language.typing;

import com.google.common.base.Objects;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationTupleDescriptorCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.ResourceConstraintCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.ValueTupleDescriptorCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.WeightingComponentResourceTupleElementCS;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.types.IdResolver;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.TupleTypeManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.MapExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class TypesUtil {
  private final static String tupleName = "Tuple";
  
  @NonNull
  public static TupleType createTupleTypeHelper(final MetaModelManager metaModelManager, final Map<String, EClass> namedParts) {
    TupleType _xblockexpression = null;
    {
      final Function1<EClass, Type> _function = new Function1<EClass, Type>() {
        public Type apply(final EClass eClass) {
          return TypesUtil.getType(metaModelManager, eClass);
        }
      };
      final Map<String, Type> newNamedParts = MapExtensions.<String, EClass, Type>mapValues(namedParts, _function);
      _xblockexpression = TypesUtil.createTupleType(metaModelManager, newNamedParts);
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static TupleType createTupleType(final MetaModelManager metaModelManager, final Map<String, Type> namedParts) {
    TupleType _xblockexpression = null;
    {
      final TupleTypeManager tupleTypeManager = metaModelManager.getTupleManager();
      _xblockexpression = tupleTypeManager.getTupleType(TypesUtil.tupleName, namedParts);
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static Type getType(final MetaModelManager metaModelManager, final EClass eClass) {
    Type _xblockexpression = null;
    {
      final IdResolver idResolver = metaModelManager.getIdResolver();
      final DomainType domainType = idResolver.getType(eClass);
      _xblockexpression = metaModelManager.getType(domainType);
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static Type getRealType(final MetaModelManager metaModelManager) {
    Type _xblockexpression = null;
    {
      final IdResolver idResolver = metaModelManager.getIdResolver();
      DomainStandardLibrary _standardLibrary = idResolver.getStandardLibrary();
      final DomainType domainType = _standardLibrary.getRealType();
      _xblockexpression = metaModelManager.getType(domainType);
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static CollectionType createSetType(final MetaModelManager metaModelManager, final Type type) {
    return metaModelManager.getSetType(type, null, null);
  }
  
  @NonNull
  public static MetaModelManager getMetaModelManager(final EObject object) {
    MetaModelManager _xblockexpression = null;
    {
      final MetaModelManager metaModelManager = PivotUtil.findMetaModelManager(object);
      boolean _equals = Objects.equal(metaModelManager, null);
      if (_equals) {
        throw new IllegalStateException(("A MetaModelManager should be associated with " + object));
      }
      _xblockexpression = metaModelManager;
    }
    return _xblockexpression;
  }
  
  public static boolean conformsTo(final MetaModelManager metaModelManager, final Type actualType, final Type expectedType) {
    return metaModelManager.conformsTo(actualType, expectedType, null);
  }
  
  @NonNull
  public static TupleType createLocationConstraintTupleType(final LocationConstraintCS locationConstraintCS) {
    MetaModelManager _metaModelManager = TypesUtil.getMetaModelManager(locationConstraintCS);
    LocationTupleDescriptorCS _tupleDescriptor = locationConstraintCS.getTupleDescriptor();
    return TypesUtil.createLocationConstraintTupleType(_metaModelManager, _tupleDescriptor);
  }
  
  @NonNull
  public static TupleType createLocationConstraintTupleType(final MetaModelManager metaModelManager, final LocationTupleDescriptorCS tupleDescriptor) {
    TupleType _xblockexpression = null;
    {
      String _instance = tupleDescriptor.getInstance();
      Pair<String, EClass> _mappedTo = Pair.<String, EClass>of(_instance, InstancePackage.Literals.COMPONENT_INSTANCE);
      String _secondInstance = tupleDescriptor.getSecondInstance();
      Pair<String, EClass> _mappedTo_1 = Pair.<String, EClass>of(_secondInstance, InstancePackage.Literals.COMPONENT_INSTANCE);
      final Map<String, EClass> namedParts = Collections.<String, EClass>unmodifiableMap(CollectionLiterals.<String, EClass>newHashMap(_mappedTo, _mappedTo_1));
      _xblockexpression = TypesUtil.createTupleTypeHelper(metaModelManager, namedParts);
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static Type createLocationConstraintType(final LocationConstraintCS locationConstraintCS) {
    CollectionType _xblockexpression = null;
    {
      final MetaModelManager metaModelManager = TypesUtil.getMetaModelManager(locationConstraintCS);
      LocationTupleDescriptorCS _tupleDescriptor = locationConstraintCS.getTupleDescriptor();
      TupleType _createLocationConstraintTupleType = TypesUtil.createLocationConstraintTupleType(metaModelManager, _tupleDescriptor);
      _xblockexpression = TypesUtil.createSetType(metaModelManager, _createLocationConstraintTupleType);
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static TupleType createReqHWResInstanceConstraintTupleType(final RequiredHardwareResourceInstanceConstraintCS constraintCS) {
    TupleType _xblockexpression = null;
    {
      final MetaModelManager metaModelManager = TypesUtil.getMetaModelManager(constraintCS);
      EList<ComponentResourceTupleDescriptorCS> _tupleDescriptors = constraintCS.getTupleDescriptors();
      _xblockexpression = TypesUtil.createReqHWResInstanceConstraintTupleType(metaModelManager, _tupleDescriptors);
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static Map<String, EClass> createNamedPartsFromComponentResourceTupleDescriptors(final List<ComponentResourceTupleDescriptorCS> tupleDescriptorList) {
    HashMap<String, EClass> _xblockexpression = null;
    {
      final HashMap<String, EClass> namedParts = CollectionLiterals.<String, EClass>newHashMap();
      final Procedure1<ComponentResourceTupleDescriptorCS> _function = new Procedure1<ComponentResourceTupleDescriptorCS>() {
        public void apply(final ComponentResourceTupleDescriptorCS t) {
          String _instance = t.getInstance();
          Pair<String, EClass> _mappedTo = Pair.<String, EClass>of(_instance, InstancePackage.Literals.COMPONENT_INSTANCE);
          String _hwresinstance = t.getHwresinstance();
          Pair<String, EClass> _mappedTo_1 = Pair.<String, EClass>of(_hwresinstance, HwresourceinstancePackage.Literals.RESOURCE_INSTANCE);
          namedParts.putAll(
            Collections.<String, EClass>unmodifiableMap(CollectionLiterals.<String, EClass>newHashMap(_mappedTo, _mappedTo_1)));
        }
      };
      IterableExtensions.<ComponentResourceTupleDescriptorCS>forEach(tupleDescriptorList, _function);
      _xblockexpression = namedParts;
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static TupleType createReqHWResInstanceConstraintTupleType(final MetaModelManager metaModelManager, final List<ComponentResourceTupleDescriptorCS> tupleDescriptorList) {
    TupleType _xblockexpression = null;
    {
      final Map<String, EClass> namedParts = TypesUtil.createNamedPartsFromComponentResourceTupleDescriptors(tupleDescriptorList);
      _xblockexpression = TypesUtil.createTupleTypeHelper(metaModelManager, namedParts);
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static Type createReqHWResInstanceConstraintType(final RequiredHardwareResourceInstanceConstraintCS constraintCS) {
    CollectionType _xblockexpression = null;
    {
      final MetaModelManager metaModelManager = TypesUtil.getMetaModelManager(constraintCS);
      EList<ComponentResourceTupleDescriptorCS> _tupleDescriptors = constraintCS.getTupleDescriptors();
      TupleType _createReqHWResInstanceConstraintTupleType = TypesUtil.createReqHWResInstanceConstraintTupleType(metaModelManager, _tupleDescriptors);
      _xblockexpression = TypesUtil.createSetType(metaModelManager, _createReqHWResInstanceConstraintTupleType);
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static TupleType createResourceConstraintInnerTupleType(final ResourceConstraintCS constraintCS) {
    TupleType _xblockexpression = null;
    {
      final MetaModelManager metaModelManager = TypesUtil.getMetaModelManager(constraintCS);
      _xblockexpression = TypesUtil.createWeightingComponentResourceTupleElementCSTupleType(metaModelManager, constraintCS);
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static TupleType createResourceConstraintOuterTupleType(final MetaModelManager metaModelManager, final ResourceConstraintCS constraintCS) {
    TupleType _xblockexpression = null;
    {
      final Type innerTupleType = TypesUtil.createWeightingComponentResourceTupleElementCSTupleType(metaModelManager, constraintCS);
      ValueTupleDescriptorCS _weighting = constraintCS.getWeighting();
      String _value = _weighting.getValue();
      CollectionType _createSetType = TypesUtil.createSetType(metaModelManager, innerTupleType);
      Pair<String, CollectionType> _mappedTo = Pair.<String, CollectionType>of(_value, _createSetType);
      ValueTupleDescriptorCS _rhs = constraintCS.getRhs();
      String _value_1 = _rhs.getValue();
      Type _realType = TypesUtil.getRealType(metaModelManager);
      Pair<String, Type> _mappedTo_1 = Pair.<String, Type>of(_value_1, _realType);
      final Map<String, Type> namedParts = Collections.<String, Type>unmodifiableMap(CollectionLiterals.<String, Type>newHashMap(_mappedTo, _mappedTo_1));
      _xblockexpression = TypesUtil.createTupleType(metaModelManager, namedParts);
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static TupleType createResourceConstraintOuterTupleType(final ResourceConstraintCS constraintCS) {
    TupleType _xblockexpression = null;
    {
      final MetaModelManager metaModelManager = TypesUtil.getMetaModelManager(constraintCS);
      _xblockexpression = TypesUtil.createResourceConstraintOuterTupleType(metaModelManager, constraintCS);
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static Type createResourceConstraintType(final ResourceConstraintCS constraintCS) {
    CollectionType _xblockexpression = null;
    {
      final MetaModelManager metaModelManager = TypesUtil.getMetaModelManager(constraintCS);
      TupleType _createResourceConstraintOuterTupleType = TypesUtil.createResourceConstraintOuterTupleType(metaModelManager, constraintCS);
      _xblockexpression = TypesUtil.createSetType(metaModelManager, _createResourceConstraintOuterTupleType);
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static TupleType createQoSDimensionTupleType(final QoSDimensionCS qosDimensionCS) {
    TupleType _xblockexpression = null;
    {
      final MetaModelManager metaModelManager = TypesUtil.getMetaModelManager(qosDimensionCS);
      _xblockexpression = TypesUtil.createWeightingComponentResourceTupleElementCSTupleType(metaModelManager, qosDimensionCS);
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static Type createQoSDimensionType(final QoSDimensionCS qosDimensionCS) {
    CollectionType _xblockexpression = null;
    {
      final MetaModelManager metaModelManager = TypesUtil.getMetaModelManager(qosDimensionCS);
      TupleType _createWeightingComponentResourceTupleElementCSTupleType = TypesUtil.createWeightingComponentResourceTupleElementCSTupleType(metaModelManager, qosDimensionCS);
      _xblockexpression = TypesUtil.createSetType(metaModelManager, _createWeightingComponentResourceTupleElementCSTupleType);
    }
    return _xblockexpression;
  }
  
  @NonNull
  public static TupleType createWeightingComponentResourceTupleElementCSTupleType(final MetaModelManager metaModelManager, final WeightingComponentResourceTupleElementCS elementCS) {
    TupleType _xblockexpression = null;
    {
      Map<String, Type> namedParts = CollectionLiterals.<String, Type>newHashMap();
      EList<ComponentResourceTupleDescriptorCS> _tupleDescriptors = elementCS.getTupleDescriptors();
      Map<String, EClass> _createNamedPartsFromComponentResourceTupleDescriptors = TypesUtil.createNamedPartsFromComponentResourceTupleDescriptors(_tupleDescriptors);
      final Function1<EClass, Type> _function = new Function1<EClass, Type>() {
        public Type apply(final EClass eClass) {
          return TypesUtil.getType(metaModelManager, eClass);
        }
      };
      Map<String, Type> _mapValues = MapExtensions.<String, EClass, Type>mapValues(_createNamedPartsFromComponentResourceTupleDescriptors, _function);
      namedParts.putAll(_mapValues);
      ValueTupleDescriptorCS _weighting = elementCS.getWeighting();
      String _value = _weighting.getValue();
      Type _realType = TypesUtil.getRealType(metaModelManager);
      namedParts.put(_value, _realType);
      _xblockexpression = TypesUtil.createTupleType(metaModelManager, namedParts);
    }
    return _xblockexpression;
  }
}

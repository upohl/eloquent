package de.uni_paderborn.fujaba.muml.allocation.language.build;

import com.google.common.base.Objects;
import de.uni_paderborn.fujaba.muml.allocation.language.build.GenerateVisitor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GenerateContainmentVisitor extends GenerateVisitor {
  /**
   * The uri to the cs genmodel
   */
  private String csGenModelURI;
  
  /**
   * The uri to the as genmodel
   */
  private String asGenModelURI;
  
  /**
   * The resource set
   */
  private ResourceSet resourceSet;
  
  /**
   * If a class name appears in this list, the generated visitor
   * calls the "primary" superclass' visitor and returns the value
   * of this call. It is only necessary to add the names of classes
   * that have an "external" primary super class (that is the super class
   * is not contained in the csModel (for contained classes, the super call
   * is always generated)).
   */
  private List<String> primarySuperCallWhitelist = CollectionLiterals.<String>newArrayList();
  
  public void setCsGenModelURI(final String csGenModelURI) {
    this.csGenModelURI = csGenModelURI;
  }
  
  public void setAsGenModelURI(final String asGenModelURI) {
    this.asGenModelURI = asGenModelURI;
  }
  
  public void setResourceSet(final ResourceSet resourceSet) {
    this.resourceSet = resourceSet;
  }
  
  public void addgeneratePrimarySuperCallFor(final String className) {
    this.primarySuperCallWhitelist.add(className);
  }
  
  public void checkConfiguration(final Issues issues) {
    super.checkConfiguration(issues);
    boolean _equals = Objects.equal(this.csGenModelURI, null);
    if (_equals) {
      issues.addError("csGenModelURI must not be null");
    }
    boolean _equals_1 = Objects.equal(this.asGenModelURI, null);
    if (_equals_1) {
      issues.addError("asGenModelURI must not be null");
    }
    boolean _equals_2 = Objects.equal(this.resourceSet, null);
    if (_equals_2) {
      issues.addError("resourceSet must not be null");
    }
  }
  
  public String generateImports() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import org.eclipse.jdt.annotation.NonNull;");
    _builder.newLine();
    _builder.append("import org.eclipse.jdt.annotation.Nullable;");
    _builder.newLine();
    _builder.append("import org.eclipse.ocl.examples.xtext.base.cs2as.Continuation;");
    _builder.newLine();
    _builder.append("import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;");
    _builder.newLine();
    String _generateImports = super.generateImports();
    _builder.append(_generateImports, "");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  private GenModel loadGenModel(final String genModelURI) {
    GenModel _xblockexpression = null;
    {
      URI _createURI = URI.createURI(genModelURI);
      final Resource resource = this.resourceSet.getResource(_createURI, 
        true);
      EList<EObject> _contents = resource.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((GenModel) _get);
    }
    return _xblockexpression;
  }
  
  private GenModel csGenModel;
  
  private GenModel asGenModel;
  
  protected String generateMethods() {
    String _xblockexpression = null;
    {
      GenModel _loadGenModel = this.loadGenModel(this.csGenModelURI);
      this.csGenModel = _loadGenModel;
      GenModel _loadGenModel_1 = this.loadGenModel(this.asGenModelURI);
      this.asGenModel = _loadGenModel_1;
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<GenPackage> _genPackages = this.csGenModel.getGenPackages();
        GenPackage _get = _genPackages.get(0);
        EList<GenClass> _genClasses = _get.getGenClasses();
        for(final GenClass genClass : _genClasses) {
          String _generateMethod = this.generateMethod(genClass);
          _builder.append(_generateMethod, "");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  protected String generateMethod(final GenClass genClass) {
    String _xblockexpression = null;
    {
      final EClass eClass = genClass.getEcoreClass();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("public @Nullable Continuation<?> visit");
      String _name = eClass.getName();
      _builder.append(_name, "");
      _builder.append("(@NonNull ");
      String _qualifiedInterfaceName = genClass.getQualifiedInterfaceName();
      _builder.append(_qualifiedInterfaceName, "");
      _builder.append(" csElement) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _generatePivot = this.generatePivot(genClass);
      _builder.append(_generatePivot, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _generateFeatures = this.generateFeatures(genClass);
      _builder.append(_generateFeatures, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _generateSecondarySuperCalls = this.generateSecondarySuperCalls(eClass);
      _builder.append(_generateSecondarySuperCalls, "\t");
      _builder.newLineIfNotEmpty();
      {
        boolean _primarySuperCallAllowed = this.primarySuperCallAllowed(eClass);
        if (_primarySuperCallAllowed) {
          _builder.append("\t");
          _builder.append("return ");
          EClass _primarySuperClass = this.getPrimarySuperClass(eClass);
          String _name_1 = _primarySuperClass.getName();
          String _generateVisitorCall = this.generateVisitorCall(_name_1);
          _builder.append(_generateVisitorCall, "\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("\t");
          _builder.append("return null;");
          _builder.newLine();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  private String generateVisitorCall(final String visitorClassName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("visit");
    GenClass _findGenClass = this.findGenClass(this.csGenModel, visitorClassName);
    String _name = _findGenClass.getName();
    _builder.append(_name, "");
    _builder.append("(csElement)");
    return _builder.toString();
  }
  
  private String generateSecondarySuperCalls(final EClass eClass) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EClass> _eSuperTypes = eClass.getESuperTypes();
      final Function1<EClass, Boolean> _function = new Function1<EClass, Boolean>() {
        public Boolean apply(final EClass superClass) {
          return Boolean.valueOf(GenerateContainmentVisitor.this.secondarySuperCallAllowed(eClass, superClass));
        }
      };
      Iterable<EClass> _filter = IterableExtensions.<EClass>filter(_eSuperTypes, _function);
      for(final EClass cls : _filter) {
        String _name = cls.getName();
        String _generateVisitorCall = this.generateVisitorCall(_name);
        _builder.append(_generateVisitorCall, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  private boolean secondarySuperCallAllowed(final EClass eClass, final EClass superClass) {
    boolean _and = false;
    EClass _primarySuperClass = this.getPrimarySuperClass(eClass);
    boolean _notEquals = (!Objects.equal(_primarySuperClass, superClass));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _sameResource = this.sameResource(eClass, superClass);
      _and = _sameResource;
    }
    return _and;
  }
  
  private boolean primarySuperCallAllowed(final EClass eClass) {
    boolean _xblockexpression = false;
    {
      final EClass primarySuperClass = this.getPrimarySuperClass(eClass);
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(primarySuperClass, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _or = false;
        boolean _sameResource = this.sameResource(eClass, primarySuperClass);
        if (_sameResource) {
          _or = true;
        } else {
          String _name = eClass.getName();
          boolean _contains = this.primarySuperCallWhitelist.contains(_name);
          _or = _contains;
        }
        _and = _or;
      }
      _xblockexpression = _and;
    }
    return _xblockexpression;
  }
  
  private boolean sameResource(final EClass first, final EClass second) {
    Resource _eResource = first.eResource();
    Resource _eResource_1 = second.eResource();
    return Objects.equal(_eResource, _eResource_1);
  }
  
  private EClass getPrimarySuperClass(final EClass eClass) {
    EList<EClass> _eSuperTypes = eClass.getESuperTypes();
    return IterableExtensions.<EClass>head(_eSuperTypes);
  }
  
  protected String generatePivot(final GenClass genClass) {
    String _xblockexpression = null;
    {
      final EClass eClass = genClass.getEcoreClass();
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _isAbstract = eClass.isAbstract();
        if (_isAbstract) {
          String _qualifiedPivotName = this.getQualifiedPivotName(eClass);
          _builder.append(_qualifiedPivotName, "");
          _builder.append(" ");
          String _pivotName = this.getPivotName();
          _builder.append(_pivotName, "");
          _builder.append(" = PivotUtil.getPivot(");
          String _qualifiedPivotName_1 = this.getQualifiedPivotName(eClass);
          _builder.append(_qualifiedPivotName_1, "");
          _builder.append(".class, csElement);");
          _builder.newLineIfNotEmpty();
        } else {
          String _qualifiedPivotName_2 = this.getQualifiedPivotName(eClass);
          _builder.append(_qualifiedPivotName_2, "");
          _builder.append(" ");
          String _pivotName_1 = this.getPivotName();
          _builder.append(_pivotName_1, "");
          _builder.append(" = context.refreshModelElement(");
          String _qualifiedPivotName_3 = this.getQualifiedPivotName(eClass);
          _builder.append(_qualifiedPivotName_3, "");
          _builder.append(".class, ");
          String _pivotName_2 = this.getPivotName(eClass);
          GenClass _findGenClass = this.findGenClass(this.asGenModel, _pivotName_2);
          String _qualifiedClassifierAccessor = _findGenClass.getQualifiedClassifierAccessor();
          _builder.append(_qualifiedClassifierAccessor, "");
          _builder.append(", csElement);");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  protected String generateFeatures(final GenClass genClass) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<GenFeature> _genFeatures = genClass.getGenFeatures();
      for(final GenFeature genFeature : _genFeatures) {
        String _generateFeature = this.generateFeature(genFeature);
        _builder.append(_generateFeature, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected String generateFeature(final GenFeature genFeature) {
    String _xifexpression = null;
    boolean _isReferenceType = genFeature.isReferenceType();
    if (_isReferenceType) {
      _xifexpression = this.generateReferenceFeature(genFeature);
    }
    return _xifexpression;
  }
  
  protected String generateReferenceFeature(final GenFeature genFeature) {
    String _xblockexpression = null;
    {
      EStructuralFeature _ecoreFeature = genFeature.getEcoreFeature();
      final EReference ref = ((EReference) _ecoreFeature);
      String _xifexpression = null;
      boolean _isMany = ref.isMany();
      if (_isMany) {
        _xifexpression = this.generateManyReference(genFeature);
      } else {
        _xifexpression = this.generateSingleReference(genFeature);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected String generateManyReference(final GenFeature genFeature) {
    String _xblockexpression = null;
    {
      EStructuralFeature _ecoreFeature = genFeature.getEcoreFeature();
      EClassifier _eType = _ecoreFeature.getEType();
      String _name = _eType.getName();
      final GenClass genClass = this.findGenClass(this.csGenModel, _name);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("for (");
      String _qualifiedInterfaceName = genClass.getQualifiedInterfaceName();
      _builder.append(_qualifiedInterfaceName, "");
      _builder.append(" it : csElement.");
      String _getAccessor = genFeature.getGetAccessor();
      _builder.append(_getAccessor, "");
      _builder.append("()) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _pivotName = this.getPivotName();
      _builder.append(_pivotName, "\t");
      _builder.append(".");
      String _setterName = this.getSetterName(genFeature);
      _builder.append(_setterName, "\t");
      _builder.append("(");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("PivotUtil.getPivot(");
      EClass _ecoreClass = genClass.getEcoreClass();
      String _qualifiedPivotName = this.getQualifiedPivotName(_ecoreClass);
      _builder.append(_qualifiedPivotName, "\t\t");
      _builder.append(".class, it)");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append(");");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  protected String generateSingleReference(final GenFeature genFeature) {
    String _xblockexpression = null;
    {
      EStructuralFeature _ecoreFeature = genFeature.getEcoreFeature();
      EClassifier _eType = _ecoreFeature.getEType();
      final EClass eClass = ((EClass) _eType);
      StringConcatenation _builder = new StringConcatenation();
      String _pivotName = this.getPivotName();
      _builder.append(_pivotName, "");
      _builder.append(".");
      String _setterName = this.getSetterName(genFeature);
      _builder.append(_setterName, "");
      _builder.append("(");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("PivotUtil.getPivot(");
      String _qualifiedPivotName = this.getQualifiedPivotName(eClass);
      _builder.append(_qualifiedPivotName, "\t");
      _builder.append(".class, csElement.");
      String _getAccessor = genFeature.getGetAccessor();
      _builder.append(_getAccessor, "\t");
      _builder.append("())");
      _builder.newLineIfNotEmpty();
      _builder.append(");");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  protected String getSetterName(final GenFeature genFeature) {
    String _xifexpression = null;
    EStructuralFeature _ecoreFeature = genFeature.getEcoreFeature();
    boolean _isMany = _ecoreFeature.isMany();
    if (_isMany) {
      StringConcatenation _builder = new StringConcatenation();
      String _getAccessor = genFeature.getGetAccessor();
      _builder.append(_getAccessor, "");
      _builder.append("().add");
      _xifexpression = _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("set");
      String _accessorName = genFeature.getAccessorName();
      _builder_1.append(_accessorName, "");
      _xifexpression = _builder_1.toString();
    }
    return _xifexpression;
  }
  
  protected String getPivotName() {
    return "pivotElement";
  }
  
  protected GenClass getGenClass(final EClass eClass) {
    EPackage _ePackage = eClass.getEPackage();
    final GenPackage genPackage = this.csGenModel.findGenPackage(_ePackage);
    EList<GenClass> _genClasses = genPackage.getGenClasses();
    for (final GenClass genClass : _genClasses) {
      EClass _ecoreClass = genClass.getEcoreClass();
      boolean _equals = Objects.equal(_ecoreClass, eClass);
      if (_equals) {
        return genClass;
      }
    }
    return null;
  }
  
  protected GenClass findGenClass(final GenModel genModel, final String className) {
    Object _xblockexpression = null;
    {
      List<GenPackage> _allGenAndUsedGenPackagesWithClassifiers = genModel.getAllGenAndUsedGenPackagesWithClassifiers();
      for (final GenPackage genPackage : _allGenAndUsedGenPackagesWithClassifiers) {
        EList<GenClass> _genClasses = genPackage.getGenClasses();
        for (final GenClass genClass : _genClasses) {
          EClass _ecoreClass = genClass.getEcoreClass();
          String _name = _ecoreClass.getName();
          boolean _equals = _name.equals(className);
          if (_equals) {
            return genClass;
          }
        }
      }
      InputOutput.<String>println(("EPROR: " + className));
      _xblockexpression = null;
    }
    return ((GenClass)_xblockexpression);
  }
  
  protected String getPivotName(final EClass eClass) {
    String _xblockexpression = null;
    {
      final Map<String, String> cs2pivot = new HashMap<String, String>();
      cs2pivot.put("ModelElementCS", "Element");
      cs2pivot.put("NamedElementCS", "NamedElement");
      cs2pivot.put("ContextCS", "ExpressionInOCL");
      String _elvis = null;
      String _name = eClass.getName();
      String _get = cs2pivot.get(_name);
      if (_get != null) {
        _elvis = _get;
      } else {
        String _name_1 = eClass.getName();
        String _replaceAll = _name_1.replaceAll("CS$", "");
        _elvis = _replaceAll;
      }
      _xblockexpression = _elvis;
    }
    return _xblockexpression;
  }
  
  protected String getQualifiedPivotName(final EClass eClass) {
    String _pivotName = this.getPivotName(eClass);
    GenClass _findGenClass = this.findGenClass(this.asGenModel, _pivotName);
    return _findGenClass.getQualifiedInterfaceName();
  }
}

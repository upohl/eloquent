package de.uni_paderborn.fujaba.muml.allocation.language.build;

import com.google.common.base.Objects;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class GenerateVisitor extends AbstractWorkflowComponent {
  private Logger log = Logger.getLogger(this.getClass());
  
  /**
   * The class name of the containment visitor
   */
  private String className;
  
  /**
   * The fully qualified name of the abstract containment visitor class
   */
  private String fqBaseClassName;
  
  /**
   * The qualified package name to which the generated visitor belongs to
   */
  private String packageName;
  
  /**
   * The filename
   */
  private String filename;
  
  public void setClassName(final String className) {
    this.className = className;
  }
  
  public void setFqBaseClassName(final String fqBaseClassName) {
    this.fqBaseClassName = fqBaseClassName;
  }
  
  public void setPackageName(final String packageName) {
    this.packageName = packageName;
  }
  
  public void setFilename(final String filename) {
    this.filename = filename;
  }
  
  public void checkConfiguration(final Issues issues) {
    boolean _equals = Objects.equal(this.className, null);
    if (_equals) {
      issues.addError("className must not be null");
    }
    boolean _equals_1 = Objects.equal(this.fqBaseClassName, null);
    if (_equals_1) {
      issues.addError("baseClassName must not be null");
    }
    boolean _equals_2 = Objects.equal(this.packageName, null);
    if (_equals_2) {
      issues.addError("packageName must not be null");
    }
    boolean _equals_3 = Objects.equal(this.filename, null);
    if (_equals_3) {
      issues.addError("filename must not be null");
    }
  }
  
  protected void invokeInternal(final WorkflowContext arg0, final ProgressMonitor arg1, final Issues arg2) {
    this.writeClassFile();
  }
  
  public void writeClassFile() {
    try {
      String _calculateFilename = this.calculateFilename();
      final File file = new File(_calculateFilename);
      final File directory = file.getParentFile();
      boolean _isDirectory = directory.isDirectory();
      boolean _not = (!_isDirectory);
      if (_not) {
        directory.mkdirs();
      }
      final FileWriter fileWriter = new FileWriter(file);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Generating visitor: ");
      String _path = file.getPath();
      _builder.append(_path, "");
      this.log.info(_builder);
      String _generateClass = this.generateClass();
      fileWriter.write(_generateClass);
      fileWriter.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String calculateFilename() {
    String _xblockexpression = null;
    {
      final URI filenameURI = URI.createURI(this.filename);
      final String projectName = filenameURI.segment(1);
      Map<String, URI> _platformResourceMap = EcorePlugin.getPlatformResourceMap();
      final URI projectURI = _platformResourceMap.get(projectName);
      URI _createURI = URI.createURI((("platform:/resource/" + projectName) + "/"), true);
      final URI relativeURI = filenameURI.deresolve(_createURI);
      URI _resolve = relativeURI.resolve(projectURI);
      _xblockexpression = _resolve.toFileString();
    }
    return _xblockexpression;
  }
  
  protected String generateClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    String _generateImports = this.generateImports();
    _builder.append(_generateImports, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("// generated code: do NOT edit (file is overwritten on regeneration)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(this.className, "");
    {
      boolean _notEquals = (!Objects.equal(this.fqBaseClassName, null));
      if (_notEquals) {
        _builder.append(" extends ");
        _builder.append(this.fqBaseClassName, "");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateConstructor = this.generateConstructor();
    _builder.append(_generateConstructor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _generateMethods = this.generateMethods();
    _builder.append(_generateMethods, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String generateImports() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import org.eclipse.ocl.examples.xtext.base.cs2as.CS2PivotConversion;");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String generateConstructor() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    _builder.append(this.className, "");
    _builder.append("(CS2PivotConversion context) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("super(context);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String generateMethods() {
    return "// no methods have been generated";
  }
}

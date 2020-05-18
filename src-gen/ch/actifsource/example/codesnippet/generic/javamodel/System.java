package ch.actifsource.example.codesnippet.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class System extends DynamicResource implements ISystem {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem>() {
    
    @Override
    public ISystem create() {
      return new System();
    }
    
    @Override
    public ISystem create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new System(resourceRepository, resource);
    }
  
  };

  public System() {
    super(ISystem.TYPE_ID);
  }
  
  public System(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystem.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet> selectCodeSnippet() {
    return _getList(ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet.class, ch.actifsource.example.codesnippet.generic.GenericPackage.System_codeSnippet);
  }

  public System setCodeSnippet(java.util.List<? extends ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet> codeSnippet) {
    _setList(ch.actifsource.example.codesnippet.generic.GenericPackage.System_codeSnippet, codeSnippet);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.codesnippet.generic.javamodel.IFunction> selectFunctions() {
    return _getList(ch.actifsource.example.codesnippet.generic.javamodel.IFunction.class, ch.actifsource.example.codesnippet.generic.GenericPackage.System_functions);
  }

  public System setFunctions(java.util.List<? extends ch.actifsource.example.codesnippet.generic.javamodel.IFunction> functions) {
    _setList(ch.actifsource.example.codesnippet.generic.GenericPackage.System_functions, functions);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public System setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.codesnippet.generic.javamodel.IVariable> selectVariable() {
    return _getList(ch.actifsource.example.codesnippet.generic.javamodel.IVariable.class, ch.actifsource.example.codesnippet.generic.GenericPackage.System_variable);
  }

  public System setVariable(java.util.List<? extends ch.actifsource.example.codesnippet.generic.javamodel.IVariable> variable) {
    _setList(ch.actifsource.example.codesnippet.generic.GenericPackage.System_variable, variable);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet.class, ch.actifsource.example.codesnippet.generic.GenericPackage.System_codeSnippet, visitor);
    _acceptList(ch.actifsource.example.codesnippet.generic.javamodel.IFunction.class, ch.actifsource.example.codesnippet.generic.GenericPackage.System_functions, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(ch.actifsource.example.codesnippet.generic.javamodel.IVariable.class, ch.actifsource.example.codesnippet.generic.GenericPackage.System_variable, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.codesnippet.generic.javamodel.ISystem selectToMeVariable(ch.actifsource.example.codesnippet.generic.javamodel.IVariable object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.codesnippet.generic.javamodel.ISystem.class, ch.actifsource.example.codesnippet.generic.GenericPackage.System_variable, object.getResource());
  }
  
  public static ch.actifsource.example.codesnippet.generic.javamodel.ISystem selectToMeFunctions(ch.actifsource.example.codesnippet.generic.javamodel.IFunction object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.codesnippet.generic.javamodel.ISystem.class, ch.actifsource.example.codesnippet.generic.GenericPackage.System_functions, object.getResource());
  }
  
  public static ch.actifsource.example.codesnippet.generic.javamodel.ISystem selectToMeCodeSnippet(ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.codesnippet.generic.javamodel.ISystem.class, ch.actifsource.example.codesnippet.generic.GenericPackage.System_codeSnippet, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,64f22b8a-98e0-11ea-8ef1-cb1cd2be9da3,Y8rdrWlaKnbXrPrQoZfMKt04gH4=] */

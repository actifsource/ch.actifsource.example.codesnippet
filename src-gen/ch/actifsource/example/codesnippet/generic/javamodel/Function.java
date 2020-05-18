package ch.actifsource.example.codesnippet.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Function extends DynamicResource implements IFunction {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunction> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunction>() {
    
    @Override
    public IFunction create() {
      return new Function();
    }
    
    @Override
    public IFunction create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Function(resourceRepository, resource);
    }
  
  };

  public Function() {
    super(IFunction.TYPE_ID);
  }
  
  public Function(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFunction.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends ch.actifsource.example.codesnippet.generic.javamodel.IParameter> selectParameter() {
    return _getList(ch.actifsource.example.codesnippet.generic.javamodel.IParameter.class, ch.actifsource.example.codesnippet.generic.GenericPackage.Function_parameter);
  }

  public Function setParameter(java.util.List<? extends ch.actifsource.example.codesnippet.generic.javamodel.IParameter> parameter) {
    _setList(ch.actifsource.example.codesnippet.generic.GenericPackage.Function_parameter, parameter);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Function setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.codesnippet.generic.javamodel.IParameter.class, ch.actifsource.example.codesnippet.generic.GenericPackage.Function_parameter, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.codesnippet.generic.javamodel.IFunction selectToMeParameter(ch.actifsource.example.codesnippet.generic.javamodel.IParameter object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.codesnippet.generic.javamodel.IFunction.class, ch.actifsource.example.codesnippet.generic.GenericPackage.Function_parameter, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,93a101c7-98e0-11ea-8ef1-cb1cd2be9da3,8V0WsOYEdQIBwxPcRsij5gKUfoI=] */

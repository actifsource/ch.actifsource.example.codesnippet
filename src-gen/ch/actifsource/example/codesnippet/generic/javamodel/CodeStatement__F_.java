package ch.actifsource.example.codesnippet.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CodeStatement__F_ extends DynamicResource implements ICodeStatement__F_ {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICodeStatement__F_> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICodeStatement__F_>() {
    
    @Override
    public ICodeStatement__F_ create() {
      return new CodeStatement__F_();
    }
    
    @Override
    public ICodeStatement__F_ create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CodeStatement__F_(resourceRepository, resource);
    }
  
  };

  public CodeStatement__F_() {
    super(ICodeStatement__F_.TYPE_ID);
  }
  
  public CodeStatement__F_(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICodeStatement__F_.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CodeStatement__F_ setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b73707b3-888c-11ee-8ced-2d7833d4fb90,Hlnv90bHMh1dqUm84dyTemCFzGU=] */

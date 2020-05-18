package ch.actifsource.example.codesnippet.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Variable extends DynamicResource implements IVariable {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVariable> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVariable>() {
    
    @Override
    public IVariable create() {
      return new Variable();
    }
    
    @Override
    public IVariable create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Variable(resourceRepository, resource);
    }
  
  };

  public Variable() {
    super(IVariable.TYPE_ID);
  }
  
  public Variable(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVariable.TYPE_ID);
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
  public ch.actifsource.example.codesnippet.generic.javamodel.IType selectType() {
    return _getSingle(ch.actifsource.example.codesnippet.generic.javamodel.IType.class, ch.actifsource.example.codesnippet.generic.GenericPackage.Variable_type);
  }

  public Variable setType(ch.actifsource.example.codesnippet.generic.javamodel.IType type) {
    _setSingle(ch.actifsource.example.codesnippet.generic.GenericPackage.Variable_type, type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Variable setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.example.codesnippet.generic.javamodel.IType.class, ch.actifsource.example.codesnippet.generic.GenericPackage.Variable_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ch.actifsource.example.codesnippet.generic.javamodel.IVariable> selectToMeType(ch.actifsource.example.codesnippet.generic.javamodel.IType object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.codesnippet.generic.javamodel.IVariable.class, ch.actifsource.example.codesnippet.generic.GenericPackage.Variable_type, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7da5691e-98e0-11ea-8ef1-cb1cd2be9da3,WVqcrVFGwWAXcxVlADs3++IbaLU=] */

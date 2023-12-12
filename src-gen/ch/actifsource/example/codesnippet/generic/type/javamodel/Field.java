package ch.actifsource.example.codesnippet.generic.type.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Field extends DynamicResource implements IField {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IField> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IField>() {
    
    @Override
    public IField create() {
      return new Field();
    }
    
    @Override
    public IField create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Field(resourceRepository, resource);
    }
  
  };

  public Field() {
    super(IField.TYPE_ID);
  }
  
  public Field(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IField.TYPE_ID);
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
  public ch.actifsource.example.codesnippet.generic.type.javamodel.IType selectType() {
    return _getSingle(ch.actifsource.example.codesnippet.generic.type.javamodel.IType.class, ch.actifsource.example.codesnippet.generic.type.TypePackage.Field_type);
  }

  public Field setType(ch.actifsource.example.codesnippet.generic.type.javamodel.IType type) {
    _setSingle(ch.actifsource.example.codesnippet.generic.type.TypePackage.Field_type, type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Field setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.example.codesnippet.generic.type.javamodel.IType.class, ch.actifsource.example.codesnippet.generic.type.TypePackage.Field_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ch.actifsource.example.codesnippet.generic.type.javamodel.IField> selectToMeType(ch.actifsource.example.codesnippet.generic.type.javamodel.IType object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.codesnippet.generic.type.javamodel.IField.class, ch.actifsource.example.codesnippet.generic.type.TypePackage.Field_type, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b337c5b5-98ea-11ee-80d1-c70d4d250c6f,D9nrPplTlKYyG1G5erxfg36oQ98=] */

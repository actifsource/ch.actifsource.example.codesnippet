package ch.actifsource.example.codesnippet.generic.type.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RecordType extends DynamicResource implements IRecordType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRecordType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRecordType>() {
    
    @Override
    public IRecordType create() {
      return new RecordType();
    }
    
    @Override
    public IRecordType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RecordType(resourceRepository, resource);
    }
  
  };

  public RecordType() {
    super(IRecordType.TYPE_ID);
  }
  
  public RecordType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRecordType.TYPE_ID);
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
  public java.util.List<? extends ch.actifsource.example.codesnippet.generic.type.javamodel.IField> selectFiled() {
    return _getList(ch.actifsource.example.codesnippet.generic.type.javamodel.IField.class, ch.actifsource.example.codesnippet.generic.type.TypePackage.RecordType_filed);
  }

  public RecordType setFiled(java.util.List<? extends ch.actifsource.example.codesnippet.generic.type.javamodel.IField> filed) {
    _setList(ch.actifsource.example.codesnippet.generic.type.TypePackage.RecordType_filed, filed);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RecordType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.codesnippet.generic.type.javamodel.IField.class, ch.actifsource.example.codesnippet.generic.type.TypePackage.RecordType_filed, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.codesnippet.generic.type.javamodel.IRecordType selectToMeFiled(ch.actifsource.example.codesnippet.generic.type.javamodel.IField object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.codesnippet.generic.type.javamodel.IRecordType.class, ch.actifsource.example.codesnippet.generic.type.TypePackage.RecordType_filed, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9c3d34e1-98ea-11ee-80d1-c70d4d250c6f,NXZExheVdWl9Ip0MBh8qoJhTrd8=] */

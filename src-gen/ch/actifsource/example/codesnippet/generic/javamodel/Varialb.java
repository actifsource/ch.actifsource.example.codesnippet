package ch.actifsource.example.codesnippet.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Varialb extends DynamicResource implements IVarialb {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVarialb> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVarialb>() {
    
    @Override
    public IVarialb create() {
      return new Varialb();
    }
    
    @Override
    public IVarialb create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Varialb(resourceRepository, resource);
    }
  
  };

  public Varialb() {
    super(IVarialb.TYPE_ID);
  }
  
  public Varialb(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVarialb.TYPE_ID);
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

  public Varialb setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0f270834-840e-11f0-94bf-45b00336fae7,dsTZOKHvp2metTvsEwWD2wSWj/4=] */

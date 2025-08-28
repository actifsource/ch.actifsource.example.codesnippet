package ch.actifsource.example.codesnippet.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FunctionBlockCall extends DynamicResource implements IFunctionBlockCall {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionBlockCall> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionBlockCall>() {
    
    @Override
    public IFunctionBlockCall create() {
      return new FunctionBlockCall();
    }
    
    @Override
    public IFunctionBlockCall create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FunctionBlockCall(resourceRepository, resource);
    }
  
  };

  public FunctionBlockCall() {
    super(IFunctionBlockCall.TYPE_ID);
  }
  
  public FunctionBlockCall(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFunctionBlockCall.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FunctionBlockCall setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0b561c45-8409-11f0-94bf-45b00336fae7,TIA29GsfLvSUVapsMaFvqo1HWag=] */

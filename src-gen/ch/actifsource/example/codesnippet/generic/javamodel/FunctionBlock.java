package ch.actifsource.example.codesnippet.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FunctionBlock extends DynamicResource implements IFunctionBlock {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionBlock> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionBlock>() {
    
    @Override
    public IFunctionBlock create() {
      return new FunctionBlock();
    }
    
    @Override
    public IFunctionBlock create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FunctionBlock(resourceRepository, resource);
    }
  
  };

  public FunctionBlock() {
    super(IFunctionBlock.TYPE_ID);
  }
  
  public FunctionBlock(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFunctionBlock.TYPE_ID);
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
  public ch.actifsource.example.codesnippet.generic.javamodel.IFunctionBlockCall selectCall() {
    return _getSingle(ch.actifsource.example.codesnippet.generic.javamodel.IFunctionBlockCall.class, ch.actifsource.example.codesnippet.generic.GenericPackage.FunctionBlock_call);
  }

  public FunctionBlock setCall(ch.actifsource.example.codesnippet.generic.javamodel.IFunctionBlockCall call) {
    _setSingle(ch.actifsource.example.codesnippet.generic.GenericPackage.FunctionBlock_call, call);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FunctionBlock setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.codesnippet.generic.javamodel.IVariable> selectVariable() {
    return _getList(ch.actifsource.example.codesnippet.generic.javamodel.IVariable.class, ch.actifsource.example.codesnippet.generic.GenericPackage.FunctionBlock_variable);
  }

  public FunctionBlock setVariable(java.util.List<? extends ch.actifsource.example.codesnippet.generic.javamodel.IVariable> variable) {
    _setList(ch.actifsource.example.codesnippet.generic.GenericPackage.FunctionBlock_variable, variable);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.example.codesnippet.generic.javamodel.IFunctionBlockCall.class, ch.actifsource.example.codesnippet.generic.GenericPackage.FunctionBlock_call, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(ch.actifsource.example.codesnippet.generic.javamodel.IVariable.class, ch.actifsource.example.codesnippet.generic.GenericPackage.FunctionBlock_variable, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.codesnippet.generic.javamodel.IFunctionBlock selectToMeVariable(ch.actifsource.example.codesnippet.generic.javamodel.IVariable object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.codesnippet.generic.javamodel.IFunctionBlock.class, ch.actifsource.example.codesnippet.generic.GenericPackage.FunctionBlock_variable, object.getResource());
  }
  
  public static ch.actifsource.example.codesnippet.generic.javamodel.IFunctionBlock selectToMeCall(ch.actifsource.example.codesnippet.generic.javamodel.IFunctionBlockCall object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.codesnippet.generic.javamodel.IFunctionBlock.class, ch.actifsource.example.codesnippet.generic.GenericPackage.FunctionBlock_call, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d38e538a-8408-11f0-94bf-45b00336fae7,olF5/EaBWNrM4UcVHxaY5EovMf8=] */

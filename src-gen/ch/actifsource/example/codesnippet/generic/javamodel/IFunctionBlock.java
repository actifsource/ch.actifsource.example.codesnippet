package ch.actifsource.example.codesnippet.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IFunctionBlock extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d38e538a-8408-11f0-94bf-45b00336fae7");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.example.codesnippet.generic.javamodel.IVariable> selectVariable();
  
  public ch.actifsource.example.codesnippet.generic.javamodel.IFunctionBlockCall selectCall();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d38e538a-8408-11f0-94bf-45b00336fae7,pJeFr+t42ivuHYjvLJYKnsldGZ0=] */

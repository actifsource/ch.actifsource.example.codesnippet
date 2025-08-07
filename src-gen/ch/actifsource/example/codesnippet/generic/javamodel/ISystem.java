package ch.actifsource.example.codesnippet.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * 
 */
public interface ISystem extends ch.actifsource.core.javamodel.INamedResource, ch.actifsource.core.javamodel.ICommentable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("64f22b8a-98e0-11ea-8ef1-cb1cd2be9da3");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.example.codesnippet.generic.javamodel.IVariable> selectVariable();
  
  public java.util.List<? extends ch.actifsource.example.codesnippet.generic.javamodel.IFunction> selectFunctions();
  
  public java.util.List<? extends ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet> selectCodeSnippet_CMinus();
  
  public java.util.List<? extends ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet> selectCodeSnippet_STMinus();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,64f22b8a-98e0-11ea-8ef1-cb1cd2be9da3,k/+kfYvcW1rJ8d/PwU+QFQw2pPQ=] */

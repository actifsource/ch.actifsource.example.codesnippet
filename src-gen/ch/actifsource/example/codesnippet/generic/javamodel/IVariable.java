package ch.actifsource.example.codesnippet.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * test comment variable class
 */
public interface IVariable extends ch.actifsource.core.javamodel.ICommentable, ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7da5691e-98e0-11ea-8ef1-cb1cd2be9da3");
  
  // relations
  
  public ch.actifsource.example.codesnippet.generic.type.javamodel.IType selectType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7da5691e-98e0-11ea-8ef1-cb1cd2be9da3,usuqPWxkz+cD5zMi4nJ/v8bomnA=] */

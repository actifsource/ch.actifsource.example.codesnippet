package ch.actifsource.example.codesnippet.generic;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5a510dbf-98e8-11ee-80d1-c70d4d250c6f,imports]] */

/* End Protected Region   [[5a510dbf-98e8-11ee-80d1-c70d4d250c6f,imports]] */

public class TokenToNameExtension {

  /* Begin Protected Region [[5a510dbf-98e8-11ee-80d1-c70d4d250c6f]] */
  
  /* End Protected Region   [[5a510dbf-98e8-11ee-80d1-c70d4d250c6f]] */


  public static interface INameProviderFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("677417be-98e8-11ee-80d1-c70d4d250c6f")
    public java.lang.String variableName(final ch.actifsource.core.javamodel.IResource variable);

    @IDynamicResourceExtension.MethodId("677417dd-98e8-11ee-80d1-c70d4d250c6f")
    public java.lang.String functionName(final ch.actifsource.core.javamodel.IResource function);

  }
  
  public static interface INameProviderFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NameProviderFunctionsImpl implements INameProviderFunctionsImpl {

    public static final INameProviderFunctionsImpl INSTANCE = new NameProviderFunctionsImpl();

    private NameProviderFunctionsImpl() {}

  }
  
  public static class NameProviderFunctions {

    private NameProviderFunctions() {}

  }

  public static interface IAbstractPostfixDotIdentifierFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f4fc213e-98e9-11ee-80d1-c70d4d250c6f")
    public java.lang.String variablePathName(final ch.actifsource.codesnippet.metamodel.template.INameProvider nameProvider, final ch.actifsource.codesnippet.metamodel.parsetree.cminus.javamodel.IExpression expression);

  }
  
  public static interface IAbstractPostfixDotIdentifierFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractPostfixDotIdentifierFunctionsImpl implements IAbstractPostfixDotIdentifierFunctionsImpl {

    public static final IAbstractPostfixDotIdentifierFunctionsImpl INSTANCE = new AbstractPostfixDotIdentifierFunctionsImpl();

    private AbstractPostfixDotIdentifierFunctionsImpl() {}

  }
  
  public static class AbstractPostfixDotIdentifierFunctions {

    private AbstractPostfixDotIdentifierFunctions() {}

  }

  public static interface IFunctionCallFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f4fc476f-98e9-11ee-80d1-c70d4d250c6f")
    public java.lang.String functionCallToC(final ch.actifsource.codesnippet.metamodel.template.INameProvider nameProvider);

  }
  
  public static interface IFunctionCallFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FunctionCallFunctionsImpl implements IFunctionCallFunctionsImpl {

    public static final IFunctionCallFunctionsImpl INSTANCE = new FunctionCallFunctionsImpl();

    private FunctionCallFunctionsImpl() {}

  }
  
  public static class FunctionCallFunctions {

    private FunctionCallFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5a510dbf-98e8-11ee-80d1-c70d4d250c6f,tFSf/YwMYcrZRWG94QCV9tKcwsI=] */

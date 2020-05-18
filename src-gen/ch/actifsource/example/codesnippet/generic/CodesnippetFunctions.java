package ch.actifsource.example.codesnippet.generic;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f84d3997-98e3-11ea-8ef1-cb1cd2be9da3,imports]] */

/* End Protected Region   [[f84d3997-98e3-11ea-8ef1-cb1cd2be9da3,imports]] */

public class CodesnippetFunctions {

  /* Begin Protected Region [[f84d3997-98e3-11ea-8ef1-cb1cd2be9da3]] */
  
  /* End Protected Region   [[f84d3997-98e3-11ea-8ef1-cb1cd2be9da3]] */


  public static interface IFunctionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("07f73c39-98e4-11ea-8ef1-cb1cd2be9da3")
    public java.lang.String codesnippetInitialFunction();

  }
  
  public static interface IFunctionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FunctionFunctionsImpl implements IFunctionFunctionsImpl {

    public static final IFunctionFunctionsImpl INSTANCE = new FunctionFunctionsImpl();

    private FunctionFunctionsImpl() {}

  }
  
  public static class FunctionFunctions {

    private FunctionFunctions() {}

  }

  public static interface IVariableFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4823c355-98e4-11ea-8ef1-cb1cd2be9da3")
    public java.lang.String codesnippetVariableName();

  }
  
  public static interface IVariableFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VariableFunctionsImpl implements IVariableFunctionsImpl {

    public static final IVariableFunctionsImpl INSTANCE = new VariableFunctionsImpl();

    private VariableFunctionsImpl() {}

  }
  
  public static class VariableFunctions {

    private VariableFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f84d3997-98e3-11ea-8ef1-cb1cd2be9da3,iyETRcKvYBYAWw2W7uwEtI8YW3g=] */

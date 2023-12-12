package ch.actifsource.example.codesnippet.generic;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f84d3997-98e3-11ea-8ef1-cb1cd2be9da3,imports]] */
import ch.actifsource.example.codesnippet.nameprovider.ExampleNameProvider_Literal;
import ch.actifsource.util.ObjectUtil;
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

  public static interface ISystemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d84e554f-98ec-11ee-80d1-c70d4d250c6f")
    public ch.actifsource.codesnippet.metamodel.template.INameProvider createSystemNameProvider();

  }
  
  public static interface ISystemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d84e554f-98ec-11ee-80d1-c70d4d250c6f")
    public ch.actifsource.codesnippet.metamodel.template.INameProvider createSystemNameProvider(final ch.actifsource.example.codesnippet.generic.javamodel.ISystem system);

  }
  
  public static class SystemFunctionsImpl implements ISystemFunctionsImpl {

    public static final ISystemFunctionsImpl INSTANCE = new SystemFunctionsImpl();

    private SystemFunctionsImpl() {}

    @Override
    public ch.actifsource.codesnippet.metamodel.template.INameProvider createSystemNameProvider(final ch.actifsource.example.codesnippet.generic.javamodel.ISystem system) {
      /* Begin Protected Region [[d84e554f-98ec-11ee-80d1-c70d4d250c6f]] */
      return new ExampleNameProvider_Literal(system);   
      /* End Protected Region   [[d84e554f-98ec-11ee-80d1-c70d4d250c6f]] */
    }

  }
  
  public static class SystemFunctions {

    private SystemFunctions() {}

    public static ch.actifsource.codesnippet.metamodel.template.INameProvider createSystemNameProvider(final ch.actifsource.example.codesnippet.generic.javamodel.ISystem system) {
      return DynamicResourceUtil.invoke(ISystemFunctionsImpl.class, SystemFunctionsImpl.INSTANCE, system).createSystemNameProvider(system);
    }

  }

  public static interface INameProviderFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f9b41414-98f2-11ee-80d1-c70d4d250c6f")
    public ch.actifsource.example.codesnippet.generic.javamodel.ISystem getSystem();

  }
  
  public static interface INameProviderFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f9b41414-98f2-11ee-80d1-c70d4d250c6f")
    public ch.actifsource.example.codesnippet.generic.javamodel.ISystem getSystem(final ch.actifsource.codesnippet.metamodel.template.INameProvider nameProvider);

  }
  
  public static class NameProviderFunctionsImpl implements INameProviderFunctionsImpl {

    public static final INameProviderFunctionsImpl INSTANCE = new NameProviderFunctionsImpl();

    private NameProviderFunctionsImpl() {}

    @Override
    public ch.actifsource.example.codesnippet.generic.javamodel.ISystem getSystem(final ch.actifsource.codesnippet.metamodel.template.INameProvider nameProvider) {
      /* Begin Protected Region [[f9b41414-98f2-11ee-80d1-c70d4d250c6f]] */
      ExampleNameProvider_Literal exampleNameProvider = ObjectUtil.castOrNull(nameProvider, ExampleNameProvider_Literal.class);
      if (exampleNameProvider == null) return null;
      return exampleNameProvider.getSystem();
      /* End Protected Region   [[f9b41414-98f2-11ee-80d1-c70d4d250c6f]] */
    }

  }
  
  public static class NameProviderFunctions {

    private NameProviderFunctions() {}

    public static ch.actifsource.example.codesnippet.generic.javamodel.ISystem getSystem(final ch.actifsource.codesnippet.metamodel.template.INameProvider nameProvider) {
      return DynamicResourceUtil.invoke(INameProviderFunctionsImpl.class, NameProviderFunctionsImpl.INSTANCE, nameProvider).getSystem(nameProvider);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f84d3997-98e3-11ea-8ef1-cb1cd2be9da3,LkHvJQPsvQzx9sDoW6bC41J+MYY=] */

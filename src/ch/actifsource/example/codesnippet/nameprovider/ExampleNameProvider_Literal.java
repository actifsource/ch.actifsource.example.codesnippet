package ch.actifsource.example.codesnippet.nameprovider;

import ch.actifsource.codesnippet.metamodel.template.INameProvider;
import ch.actifsource.core.util.LiteralAspectUtil;
import ch.actifsource.example.codesnippet.generic.javamodel.ISystem;

/**
 * Example name provider implementation. 
 */
public class ExampleNameProvider_Literal implements INameProvider {
  
  private ISystem fSystem;
  
  public ExampleNameProvider_Literal(ISystem system) {
    fSystem = system;
  }
  
  public ISystem getSystem() {
    return fSystem;
  }
  
  @Override
  public final String toString() {
    StringBuffer sb = new StringBuffer();
    LiteralAspectUtil.appendResource(sb, fSystem);
    return sb.toString();
  }
  
}

package ch.actifsource.example.codesnippet.aspects;

import java.util.List;
import ch.actifsource.codesnippet.metamodel.parsetree.ParsetreePackage;
import ch.actifsource.codesnippet.metamodel.parsetree.cminus.CminusPackage;
import ch.actifsource.codesnippet.parser.ParserUtil;
import ch.actifsource.core.INode;
import ch.actifsource.core.Statement;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.set.INodeList;
import ch.actifsource.core.set.NodeList;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.*;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency.NodeRole;
import ch.actifsource.example.codesnippet.generic.GenericPackage;
import ch.actifsource.util.inconsistency.InconsistencyType;

/**
 * Validate the code snippet
 */
public class TestCodeSnippetValidationAspect implements IResourceValidationAspect {
  
  /**
   * Returns all invalid expressions inside the code snippet.
   */
  public INodeList getInvalidExpressions(IReadJobExecutor executor, INode codesnippet) {
    Statement compilationUnit = Select.toMeStatementForRelationOrNull(executor, ParsetreePackage.AbstractCompilationUnit_source, codesnippet);
	  // TODO
	  return new NodeList();
  }

  @Override
  public void validate(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {  
	  IReadJobExecutor executor = context.getReadJobExecutor();
	  
	  for (Statement codesnippet :Select.statementsForRelation(executor, GenericPackage.System_codeSnippet_aE_CMinus, context.getResource())) {
  	  for (INode invalidExpression :getInvalidExpressions(executor, codesnippet.object())) {
  		  INode backLink = Select.objectForRelationOrNull(executor, CminusPackage.BackLink_backLink, invalidExpression);
  		  if (backLink == null) continue;
  		  
  		  for (INode error :ParserUtil.parseCodeSnippetBackLinkTokenRange(executor, codesnippet.object(), backLink)) {
  			  inconsistencyList.add(new ElementInconsistencyWrapper(codesnippet.getPackage(), codesnippet.object(), NodeRole.Subject, "Assignment type safety", InconsistencyType.Warning, error));	 
  		  }
  	  }
	  }
  }
  
}

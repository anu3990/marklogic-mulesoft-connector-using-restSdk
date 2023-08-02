package com.mulesoft.connectors.helloworld.internal.metadata.sample;

import com.mulesoft.connectivity.rest.commons.api.datasense.sampledata.RestSampleDataProvider;
import com.mulesoft.connectivity.rest.commons.internal.model.builder.common.EvaluationContextBuilderFactory;
import com.mulesoft.connectivity.rest.commons.internal.model.builder.sampledata.SampleDataResolverExpressionBuilder;
import com.mulesoft.connectivity.rest.commons.internal.model.common.EvaluationContext;

public class GetGreetingOperationSampleDataProvider extends RestSampleDataProvider {
  private static final String SCRIPT =
      "output application/json --- {\n" + "  \"todays-greeting\": \"test-greeting\"\n" + "}";

  @Override
  protected EvaluationContext buildEvaluationContext(
      EvaluationContextBuilderFactory builderFactory) {
    return builderFactory.operationContextBuilder().build();
  }

  @Override
  protected void build(SampleDataResolverExpressionBuilder builder) {
    builder.definition(
        definitionBuilder ->
            definitionBuilder.script(
                script -> script.scriptExpression(dw -> dw.expression(SCRIPT))));
  }
}

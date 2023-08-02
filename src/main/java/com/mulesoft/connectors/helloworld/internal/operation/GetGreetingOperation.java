package com.mulesoft.connectors.helloworld.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.NullOnNotFoundErrorRequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.helloworld.internal.metadata.GetGreetingOutputMetadataResolver;
import com.mulesoft.connectors.helloworld.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.helloworld.internal.metadata.sample.GetGreetingOperationSampleDataProvider;
import com.mulesoft.connectors.helloworld.internal.operation.refinement.GetGreetingOperationRefinement;
import java.io.InputStream;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.sdk.api.annotation.data.sample.SampleData;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class GetGreetingOperation extends GetGreetingOperationRefinement {
  public GetGreetingOperation() {
    super();
  }

  public GetGreetingOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * This operation makes an HTTP GET request to the /greeting endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(NullOnNotFoundErrorRequestErrorTypeProvider.class)
  @DisplayName("Get Greeting")
  @SampleData(GetGreetingOperationSampleDataProvider.class)
  @MediaType("application/json")
  @OutputResolver(
      output = GetGreetingOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getGreeting(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      CompletionCallback<InputStream, Object> callback) {
    super.getGreeting(config, connection, parameters, overrides, callback);
  }
}

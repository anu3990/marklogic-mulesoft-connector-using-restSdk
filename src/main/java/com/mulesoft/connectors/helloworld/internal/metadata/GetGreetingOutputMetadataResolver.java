package com.mulesoft.connectors.helloworld.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;
import com.mulesoft.connectors.helloworld.internal.extension.Helloworld;

public class GetGreetingOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/get-greeting-output-schema.json";
  }

  @Override
  public String getResolverName() {
    return "get-greeting-output-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return Helloworld.API_METADATA_CATEGORY;
  }
}

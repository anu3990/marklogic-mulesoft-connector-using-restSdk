package com.mulesoft.connectors.helloworld.internal.metadata;

import com.mulesoft.connectors.helloworld.internal.extension.Helloworld;

/**
 * Metadata output attributes resolver for {@link
 * com.mulesoft.connectivity.rest.commons.api.operation.HttpResponseAttributes}.
 */
public class HttpResponseAttributesMetadataResolver
    extends com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output
        .HttpResponseAttributesMetadataResolver {
  @Override
  public String getCategoryName() {
    return Helloworld.API_METADATA_CATEGORY;
  }
}

package com.mulesoft.connectors.helloworld.internal.connection.provider;

import com.mulesoft.connectors.helloworld.internal.connection.provider.refinement.UnsecuredConnectionProviderRefinement;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

/**
 * This is the last layer of the connection provider generation gap pattern. It is what finally gets
 * exposed as the connection provider, including all customizations made in the refinement layer.
 */
@Alias("unsecured")
@DisplayName("Unsecured Connection Provider")
public class UnsecuredConnectionProvider extends UnsecuredConnectionProviderRefinement {}

package com.mulesoft.connectors.helloworld.internal.config;

import com.mulesoft.connectors.helloworld.internal.config.refinement.HelloworldConfigurationRefinement;
import com.mulesoft.connectors.helloworld.internal.connection.provider.UnsecuredConnectionProvider;
import com.mulesoft.connectors.helloworld.internal.operation.GetGreetingOperation;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

@Configuration
@Operations({GetGreetingOperation.class})
@ConnectionProviders({UnsecuredConnectionProvider.class})
public class HelloworldConfiguration extends HelloworldConfigurationRefinement {}

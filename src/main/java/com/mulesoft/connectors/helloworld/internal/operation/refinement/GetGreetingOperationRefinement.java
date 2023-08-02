package com.mulesoft.connectors.helloworld.internal.operation.refinement;

import com.mulesoft.connectors.helloworld.internal.operation.base.GetGreetingOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetGreetingOperationRefinement extends GetGreetingOperationBase {
  public GetGreetingOperationRefinement() {
    super();
  }

  public GetGreetingOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}

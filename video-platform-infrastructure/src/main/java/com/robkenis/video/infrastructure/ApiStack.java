package com.robkenis.video.infrastructure;

import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;
import software.amazon.awscdk.services.apigatewayv2.HttpApi;
import software.constructs.Construct;

public class ApiStack extends Stack {

    public ApiStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        HttpApi.Builder.create(this, id).build();
    }
}

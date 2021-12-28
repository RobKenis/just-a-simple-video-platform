package com.robkenis.video.infrastructure;

import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;
import software.amazon.awscdk.services.apigatewayv2.HttpApi;
import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.Runtime;
import software.amazon.awscdk.services.logs.LogGroup;
import software.amazon.awscdk.services.logs.RetentionDays;
import software.constructs.Construct;

public class ApiStack extends Stack {

    public ApiStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        HttpApi httpApi = HttpApi.Builder.create(this, id).build();

        Function rooms = Function.Builder.create(this, "video-platform-rooms")
                .functionName("video-platform-rooms")
                .description("Manages rooms to watch some videos in")
                .runtime(Runtime.PROVIDED)
                .handler("Handler")
                .code(Code.fromAsset("../video-platform-rooms-lambda/build/function.zip"))
                .build();

        LogGroup.Builder.create(this, "video-platform-rooms-logs")
                .logGroupName("/aws/lambda/" + rooms.getFunctionName())
                .retention(RetentionDays.ONE_DAY)
                .build();
    }
}

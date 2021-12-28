package com.robkenis.video.lambda.rooms;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;

import javax.inject.Named;

@Named("HttpApiHandler")
public class HttpApiHandler implements RequestHandler<APIGatewayV2HTTPEvent, APIGatewayV2HTTPResponse> {

    @Override
    public APIGatewayV2HTTPResponse handleRequest(APIGatewayV2HTTPEvent input, Context context) {
        return APIGatewayV2HTTPResponse.builder()
                .withBody("Hello world")
                .withStatusCode(200)
                .build();
    }
}

package com.robkenis.video.infrastructure;

import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.Environment;
import software.amazon.awscdk.core.StackProps;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Application {

    public static void main(String[] args) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("../gradle.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        App app = new App();
        StackProps stackProps = new StackProps.Builder()
                .env(Environment.builder().region("us-east-1").build())
                .description("Part of just-a-simple-video-platform")
                .tags(Map.ofEntries(
                        Map.entry("environment", "dev"),
                        Map.entry("version", prop.getProperty("version"))
                ))
                .build();
        new ApiStack(app, "video-platform-api", stackProps);
        app.synth();
    }
}

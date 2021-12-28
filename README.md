# Just a simple video platform

## Project structure

```shell
.
|-- buildSrc
|   |-- build.gradle
|   `-- src
|       `-- main
|           `-- groovy
|               |-- com.robkenis.video.java-application-conventions.gradle
|               |-- com.robkenis.video.java-common-conventions.gradle
|               `-- com.robkenis.video.java-library-conventions.gradle
|-- gradle.properties
|-- video-platform-core
|   |-- build.gradle
|   `-- src
|       |-- main
|       |   `-- java
|       |       `-- com.robkenis.video.core
|-- video-platform-rooms
|   |-- build.gradle
|   `-- src
|       |-- main
|       |   `-- java
|       |       `-- com.robkenis.video.rooms
`-- video-platform-rooms-lambda
    |-- build.gradle
    `-- src
        `-- main
            |-- java
            |   `-- com.robkenis.video.lambda.rooms
            |                       `-- HttpApiHandler.java
            `-- resources
                `-- application.properties
```

## Building

```shell
$ gradle build -Dquarkus.package.type=native 
```

Configuration for the native build is found in [this build.gradle](video-platform-rooms-lambda/build.gradle)

## Deploying

Everything is deployed using [AWS CDK](https://aws.amazon.com/cdk/).

```shell
$ cdk deploy
```

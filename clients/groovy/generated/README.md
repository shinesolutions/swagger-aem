# 

Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

This Groovy package, using the [http-builder-ng library](https://http-builder-ng.github.io/http-builder-ng/), is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 3.5.0-pre.0
- Package version: 3.5.0-pre.0
- Build date: 2021-09-03T15:24:46.978+10:00[Australia/Melbourne]
- Build package: org.openapitools.codegen.languages.GroovyClientCodegen
For more information, please visit [http://shinesolutions.com](http://shinesolutions.com)

## Requirements

* Groovy 2.5.7
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

## Getting Started


```groovy
def apiInstance = new ConsoleApi()

apiInstance.getAemProductInfo()
    {
    // on success
    def result = (List&lt;String&gt;)it
    println result
    
}
    {
    // on failure
    statusCode, message ->
        println "${statusCode} ${message}"
};
```


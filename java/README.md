swaggeraem4j
------------

swaggeraem4j is a Java client generated from [Swagger AEM specification](https://github.com/shinesolutions/swagger-aem) using [Swagger Code Generator](https://github.com/swagger-api/swagger-codegen).

This Java client returns raw HTTP response AS-IS. Check out [aem4j](https://github.com/shinesolutions/aem4j) for an abstraction layer with resource-oriented API and convenient response handling.

| node-swagger-aem | Supported AEM          | Supported JDK       | Swagger Codegen CLI | Documentation                                                                   |
|------------------|------------------------|---------------------|---------------------|---------------------------------------------------------------------------------|
| 0.9.0            | 6.0, 6.1, 6.2          | 1.8                 | 20161104            | [API](https://shinesolutions.github.io/swagger-aem/java/0.9.0/index.html) |

Install
-------

    TODO

Usage
-----

TODO

Error handling
--------------

TODO

Development
-----------

To regenerate the client with a custom Swagger Codegen:

    SWAGGER_CODEGEN_CLI_JAR=/path/to/swagger-codegen-cli.jar make build

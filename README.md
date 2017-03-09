Swagger AEM
-----------

Swagger AEM is an OpenAPI specification for [Adobe Experience Manager (AEM)](http://www.adobe.com/au/marketing-cloud/enterprise-content-management.html) API.

This specification is used to generate client libraries for Ruby, Python, node.js, and Java using [Swagger Code Generator](https://github.com/swagger-api/swagger-codegen).

| Swagger AEM Spec | Supported AEM          | Documentation                                                                                                                                                            |
|------------------|------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1.1.6            | 6.2          | [Specification](https://shinesolutions.github.io/swagger-aem/api/1.1.6/index.html)
| 1.1.5            | 6.2          | [Specification](https://shinesolutions.github.io/swagger-aem/api/1.1.5/index.html) [Changes](https://github.com/shinesolutions/swagger-aem/blob/master/CHANGELOG.md#115) |
| 1.1.4            | 6.0, 6.1, 6.2          | [Specification](https://shinesolutions.github.io/swagger-aem/api/1.1.4/index.html) [Changes](https://github.com/shinesolutions/swagger-aem/blob/master/CHANGELOG.md#114) |
| 1.1.3            | 6.0, 6.1, 6.2          | [Specification](https://shinesolutions.github.io/swagger-aem/api/1.1.3/index.html) [Changes](https://github.com/shinesolutions/swagger-aem/blob/master/CHANGELOG.md#113) |
| 1.1.2            | 6.0, 6.1, 6.2          | [Specification](https://shinesolutions.github.io/swagger-aem/api/1.1.2/index.html) [Changes](https://github.com/shinesolutions/swagger-aem/blob/master/CHANGELOG.md#112) |
| 1.1.1            | 6.0, 6.1, 6.2          | [Specification](https://shinesolutions.github.io/swagger-aem/api/1.1.1/index.html) [Changes](https://github.com/shinesolutions/swagger-aem/blob/master/CHANGELOG.md#111) |
| 1.1              | 6.0, 6.1, 6.2          | [Specification](https://shinesolutions.github.io/swagger-aem/api/1.1/index.html) [Changes](https://github.com/shinesolutions/swagger-aem/blob/master/CHANGELOG.md#11)    |
| 1.0              | 6.0, 6.1, 6.2          | [Specification](https://shinesolutions.github.io/swagger-aem/api/1.0/index.html) [Changes](https://github.com/shinesolutions/swagger-aem/blob/master/CHANGELOG.md#10)    |

Generated Clients
-----------------

| Language   | Package                                                                                                                                                                                                                                                                 | Getting Started                                                                                                                                                                         | Status                                                                                                                                       |
|------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|
| Ruby       | [swagger_aem](https://rubygems.org/gems/swagger_aem) [![Published Version](https://badge.fury.io/rb/swagger_aem.svg)](https://rubygems.org/gems/swagger_aem)                                                                                                            | [README](https://github.com/shinesolutions/swagger-aem/blob/master/ruby/README.md) [CHANGELOG](https://github.com/shinesolutions/swagger-aem/blob/master/ruby/CHANGELOG.md)             | [![swagger_aem Build Status](https://img.shields.io/travis/shinesolutions/swagger-aem.svg)](http://travis-ci.org/shinesolutions/swagger-aem) |
| Python     | Work in progress                                                                                                                                                                                                                                                        | [README](https://github.com/shinesolutions/swagger-aem/blob/master/python/README.md) [CHANGELOG](https://github.com/shinesolutions/swagger-aem/blob/master/python/CHANGELOG.md)         |                                                                                                                                              |
| Java       | [swaggeraem4j](http://mvnrepository.com/artifact/com.shinesolutions/swaggeraem4j) [![Published Version](https://maven-badges.herokuapp.com/maven-central/com.shinesolutions/swaggeraem4j/badge.svg)](http://mvnrepository.com/artifact/com.shinesolutions/swaggeraem4j) | [README](https://github.com/shinesolutions/swagger-aem/blob/master/java/README.md) [CHANGELOG](https://github.com/shinesolutions/swagger-aem/blob/master/java/CHANGELOG.md)             |                                                                                                                                              |
| JavaScript | Work in progress                                                                                                                                                                                                                                                        | [README](https://github.com/shinesolutions/swagger-aem/blob/master/javascript/README.md) [CHANGELOG](https://github.com/shinesolutions/swagger-aem/blob/master/javascript/CHANGELOG.md) |                                                                                                                                              |

Development
-----------

To run build targets using `swagger-codegen` in your path:

    make <target>

If you want to use a custom `swagger-codegen-cli.jar`:

    SWAGGER_CODEGEN_CLI_JAR=/path/to/swagger-codegen-cli.jar make <target>

Testing
-------

Unit tests are generated by `swagger-codegen` along with the client code.

Integration tests are part of Swagger AEM and require an AEM instance running on port 4502.

Contribution
------------

Since swagger-aem contains multiple languages, add a `[ruby|python|javascript|java]` prefix to language-specific commits, this will help with filtering full commits log.

Tagging should also be prefixed with:

* `api` when the release is for the OpenAPI specification, e.g. `api-1.0.0`
* `ruby|python|javascript|java` when the release is for the generated client, e.g. `ruby-0.9.2`, `python-0.9.0`

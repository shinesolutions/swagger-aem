[![Build Status](https://img.shields.io/travis/shinesolutions/swagger-aem.svg)](http://travis-ci.org/shinesolutions/swagger-aem)

Swagger AEM
-----------

Swagger AEM is a [Swagger](http://swagger.io/) specification for [Adobe Experience Manager (AEM)](http://www.adobe.com/au/marketing-cloud/enterprise-content-management.html) API.

This specification is used to generate client libraries (currently only Ruby client, more languages support to follow).

API Spec documentation: [Latest](https://shinesolutions.github.io/swagger-aem/latest/api/index.html)

Generated Client
----------------

| Language | Getting Started                                                                                                                                                             | API                                                                           |   |   |
|----------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------|---|---|
| Ruby     | [README](https://github.com/shinesolutions/swagger-aem/blob/master/ruby/README.md) [CHANGELOG](https://github.com/shinesolutions/swagger-aem/blob/master/ruby/CHANGELOG.md) | [Latest](https://shinesolutions.github.io/swagger-aem/latest/ruby/index.html) |   |   |
|          |  

Development
-----------

To run build targets using `swagger-codegen` in your path:

    make <target>

If you want to use a custom `swagger-codegen-cli.jar`:

    SWAGGER_CODEGEN_JAR=/path/to/swagger-codegen-cli.jar make <target>

Testing
-------

Integration tests require an AEM instance running on port 4502.

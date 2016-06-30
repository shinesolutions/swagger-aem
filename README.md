Swagger AEM
-----------

Swagger AEM is a [Swagger](http://swagger.io/) specification for [Adobe Experience Manager (AEM)](http://www.adobe.com/au/marketing-cloud/enterprise-content-management.html) API.

This specification is used to generate client library in Ruby.

Development
-----------

To run the full build using a default `swagger-codegen` in your path:

    make

if you want to use your own `swagger-codegen-cli.jar`:

    SWAGGER_CODEGEN_JAR=/path/to/swagger-codegen-cli.jar make

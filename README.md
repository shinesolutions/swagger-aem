[![Build Status](https://img.shields.io/travis/shinesolutions/swagger-aem.svg)](http://travis-ci.org/shinesolutions/swagger-aem)

Swagger AEM
-----------

Swagger AEM is a [Swagger](http://swagger.io/) specification for [Adobe Experience Manager (AEM)](http://www.adobe.com/au/marketing-cloud/enterprise-content-management.html) API.

This specification is used to generate a client library in Ruby with more languages support to follow.

Install
-------

    gem install swagger_aem

Development
-----------

To run the full build using `swagger-codegen` in your path:

    make

if you want to use your own `swagger-codegen-cli.jar`:

    SWAGGER_CODEGEN_JAR=/path/to/swagger-codegen-cli.jar make

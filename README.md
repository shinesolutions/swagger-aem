Swagger AEM
-----------

Swagger AEM is an OpenAPI specification for [Adobe Experience Manager (AEM)](http://www.adobe.com/au/marketing-cloud/enterprise-content-management.html) API.

This specification is used to generate client libraries for Ruby, Python, node.js, and Java using [Swagger Code Generator](https://github.com/swagger-api/swagger-codegen).

Learn more about Swagger AEM:

* [Generated Clients](https://github.com/shinesolutions/swagger-aem#generated-clients)
* [Development](https://github.com/shinesolutions/swagger-aem#development)
* [Testing](https://github.com/shinesolutions/swagger-aem#testing)
* [FAQ](https://github.com/shinesolutions/swagger-aem#faq)
* [Versions History](https://github.com/shinesolutions/swagger-aem/blob/master/docs/versions.md)
* [Contribution](https://github.com/shinesolutions/swagger-aem#contribution)
* [Presentations](https://github.com/shinesolutions/swagger-aem/#presentations)

Swagger AEM is part of [AEM OpenCloud](https://aemopencloud.io) platform but it can be used as a stand-alone.

Generated Clients
-----------------

| Language   | Package                                                                                                                                                                                                                                                                 | Getting Started                                                                                                                                                                         | Status                                                                                                                                       |
|------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|
| Ruby       | [swagger_aem](https://rubygems.org/gems/swagger_aem) [![Published Version](https://badge.fury.io/rb/swagger_aem.svg)](https://rubygems.org/gems/swagger_aem)                                                                                                            | [README](https://github.com/shinesolutions/swagger-aem/blob/master/ruby/README.md) [CHANGELOG](https://github.com/shinesolutions/swagger-aem/blob/master/ruby/CHANGELOG.md)             | [![swagger_aem Build Status](https://img.shields.io/travis/shinesolutions/swagger-aem.svg)](http://travis-ci.org/shinesolutions/swagger-aem) |
| Python     | [swaggeraem](https://pypi.python.org/pypi/swaggeraem) [![Published Version](https://badge.fury.io/py/swaggeraem.svg)](https://pypi.python.org/pypi/swaggeraem)                                                                                                          | [README](https://github.com/shinesolutions/swagger-aem/blob/master/python/README.md) [CHANGELOG](https://github.com/shinesolutions/swagger-aem/blob/master/python/CHANGELOG.md)         |                                                                                                                                              |
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

Integration tests are part of Swagger AEM and require an AEM instance running on port 4502 with [Shine Solutions AEM Health Check](https://github.com/shinesolutions/aem-healthcheck) package installed.

FAQ
---

* __Q:__ Why does each OSGI config need to be declared as a single operation in the OpenAPI spec?<br/>
  __A:__ There are two reasons. The first one is to explicitly define which parameters are relevant for which OSGI config, which won't be clear when we have one operation for all OSGI configs with all parameters declared within that operation. The second one is to manage the usability of the generated code. A single operation will translate to a single method with all parameters supported, which is fine in generated Ruby client because it supports optional hash, but it's a problem with generated Java client because all parameters will be declared within the method signature where caller will have to pass in `null`s for the parameters that aren't relevant for the OSGI config being processed, on top of the risk of hitting maximum number of 255 parameters per method (as per [JVM Specification for Java SE 11](https://docs.oracle.com/javase/specs/jvms/se11/html/jvms-4.html#jvms-4.11)).


Contribution
------------

Since swagger-aem contains multiple languages, add a `[ruby|python|javascript|java]` prefix to language-specific commits, this will help with filtering full commits log.

Tagging should also be prefixed with:

* `api` when the release is for the OpenAPI specification, e.g. `api-1.0.0`
* `ruby|python|javascript|java` when the release is for the generated client, e.g. `ruby-0.9.2`, `python-0.9.0`

Presentations
-------------

* [Beyond AEM Curl Commands](https://www.slideshare.net/cliffano/beyond-aem-curl-commands) at [Adobe Immerse'18](https://immerse18.adobe-devs.adobeevents.com/)
* [Building An AEM API Clients Ecosystem](https://www.slideshare.net/cliffano/building-an-aem-api-clients-ecosystem/) at [Adobe Experience Cloud Meetup - 5th Edition](https://www.meetup.com/Melbourne-Adobe-Experience-Cloud/events/249851899/)

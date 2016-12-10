node-swagger-aem
----------------

node-swagger-aem is a node.js client generated from [Swagger AEM specification](https://github.com/shinesolutions/swagger-aem) using [Swagger Code Generator](https://github.com/swagger-api/swagger-codegen).

This node.js client returns raw HTTP response AS-IS. Check out [node-aem](https://github.com/shinesolutions/node-aem) for an abstraction layer with resource-oriented API and convenient response handling.

| node-swagger-aem | Supported AEM          | Supported node.js       | Swagger Codegen CLI | Documentation                                                                   |
|------------------|------------------------|-------------------------|---------------------|---------------------------------------------------------------------------------|
| 0.9.0            | 6.0, 6.1, 6.2          | 4.x, 6.x                | 20161104            | [API](https://shinesolutions.github.io/swagger-aem/javascript/0.9.0/index.html) |

Install
-------

    npm install node-swagger-aem

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

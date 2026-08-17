# php-base - PHP Slim 4 Server library for Adobe Experience Manager (AEM) API

* [OpenAPI Generator](https://openapi-generator.tech)
* [Slim 4 Documentation](https://www.slimframework.com/docs/v4/)

This server has been generated with [Slim PSR-7](https://github.com/slimphp/Slim-Psr7) implementation.
[PHP-DI](https://php-di.org/doc/frameworks/slim.html) package used as dependency container.

## Requirements

* Web server with URL rewriting
* PHP 8.1 or newer

This package contains `.htaccess` for Apache configuration.
If you use another server(Nginx, HHVM, IIS, lighttpd) check out [Web Servers](https://www.slimframework.com/docs/v3/start/web-servers.html) doc.

## Installation via [Composer](https://getcomposer.org/)

Navigate into your project's root directory and execute the bash command shown below.
This command downloads the Slim Framework and its third-party dependencies into your project's `vendor/` directory.
```bash
$ composer install
```

## Add configs

[PHP-DI package](https://php-di.org/doc/getting-started.html) helps to decouple configuration from implementation. App loads configuration files in straight order(`$env` can be `prod` or `dev`):
1. `config/$env/default.inc.php` (contains safe values, can be committed to vcs)
2. `config/$env/config.inc.php` (user config, excluded from vcs, can contain sensitive values, passwords etc.)
3. `lib/App/RegisterDependencies.php`

## Start devserver

Run the following command in terminal to start localhost web server, assuming `./php-slim-server/public/` is public-accessible directory with `index.php` file:
```bash
$ php -S localhost:8888 -t php-slim-server/public
```
> **Warning** This web server was designed to aid application development.
> It may also be useful for testing purposes or for application demonstrations that are run in controlled environments.
> It is not intended to be a full-featured web server. It should not be used on a public network.

## Tests

### PHPUnit

This package uses PHPUnit 8 or 9(depends from your PHP version) for unit testing.
[Test folder](tests) contains templates which you can fill with real test assertions.
How to write tests read at [2. Writing Tests for PHPUnit - PHPUnit 8.5 Manual](https://phpunit.readthedocs.io/en/8.5/writing-tests-for-phpunit.html).

#### Run

Command | Target
---- | ----
`$ composer test` | All tests
`$ composer test-apis` | Apis tests
`$ composer test-models` | Models tests

#### Config

Package contains fully functional config `./phpunit.xml.dist` file. Create `./phpunit.xml` in root folder to override it.

Quote from [3. The Command-Line Test Runner — PHPUnit 8.5 Manual](https://phpunit.readthedocs.io/en/8.5/textui.html#command-line-options):

> If phpunit.xml or phpunit.xml.dist (in that order) exist in the current working directory and --configuration is not used, the configuration will be automatically read from that file.

### PHP CodeSniffer

[PHP CodeSniffer Documentation](https://github.com/squizlabs/PHP_CodeSniffer/wiki). This tool helps to follow coding style and avoid common PHP coding mistakes.

#### Run

```bash
$ composer phpcs
```

#### Config

Package contains fully functional config `./phpcs.xml.dist` file. It checks source code against PSR-1 and PSR-2 coding standards.
Create `./phpcs.xml` in root folder to override it. More info at [Using a Default Configuration File](https://github.com/squizlabs/PHP_CodeSniffer/wiki/Advanced-Usage#using-a-default-configuration-file)

### PHPLint

[PHPLint Documentation](https://github.com/overtrue/phplint). Checks PHP syntax only.

#### Run

```bash
$ composer phplint
```

## Show errors

Switch your app environment to development
- When using with some webserver => in `public/.htaccess` file:
```ini
## .htaccess
<IfModule mod_env.c>
    SetEnv APP_ENV 'development'
</IfModule>
```

- Or when using whatever else, set `APP_ENV` environment variable like this:
```bash
export APP_ENV=development
```
or simply
```bash
export APP_ENV=dev
```

## Mock Server
Since this feature should be used for development only, change environment to `development` and send additional HTTP header `X-OpenAPIServer-Mock: ping` with any request to get mocked response.
CURL example:
```console
curl --request GET \
    --url 'http://localhost:8888/v2/pet/findByStatus?status=available' \
    --header 'accept: application/json' \
    --header 'X-OpenAPIServer-Mock: ping'
[{"id":-8738629417578509312,"category":{"id":-4162503862215270400,"name":"Lorem ipsum dol"},"name":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem i","photoUrls":["Lor"],"tags":[{"id":-3506202845849391104,"name":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectet"}],"status":"pending"}]
```

Used packages:
* [Openapi Data Mocker](https://github.com/ybelenko/openapi-data-mocker) - first implementation of OAS3 fake data generator.
* [Openapi Data Mocker Server Middleware](https://github.com/ybelenko/openapi-data-mocker-server-middleware) - PSR-15 HTTP server middleware.
* [Openapi Data Mocker Interfaces](https://github.com/ybelenko/openapi-data-mocker-interfaces) - package with mocking interfaces.

## Logging

Build contains pre-configured [`monolog/monolog`](https://github.com/Seldaek/monolog) package. Make sure that `logs` folder is writable.
Add required log handlers/processors/formatters in `lib/App/RegisterDependencies.php`.

## API Endpoints

All URIs are relative to *http://localhost*

> Important! Do not modify abstract API controllers directly! Instead extend them by implementation classes like:

```php
// src/Api/PetApi.php

namespace OpenAPIServer\Api;

use OpenAPIServer\Api\AbstractPetApi;
use Psr\Http\Message\ServerRequestInterface;
use Psr\Http\Message\ResponseInterface;

class PetApi extends AbstractPetApi
{
    public function addPet(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        // your implementation of addPet method here
    }
}
```

When you need to inject dependencies into API controller check [PHP-DI - Controllers as services](https://github.com/PHP-DI/Slim-Bridge#controllers-as-services) guide.

Place all your implementation classes in `./src` folder accordingly.
For instance, when abstract class located at `./lib/Api/AbstractPetApi.php` you need to create implementation class at `./src/Api/PetApi.php`.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AbstractConsoleApi* | **getAemProductInfo** | **GET** /system/console/status-productinfo.json | 
*AbstractConsoleApi* | **getConfigMgr** | **GET** /system/console/configMgr | 
*AbstractConsoleApi* | **postSamlConfiguration** | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 
*AbstractConsoleApi* | **getBundleInfo** | **GET** /system/console/bundles/{name}.json | 
*AbstractConsoleApi* | **postBundle** | **POST** /system/console/bundles/{name} | 
*AbstractConsoleApi* | **postJmxRepository** | **POST** /system/console/jmx/com.adobe.granite:type%3DRepository/op/{action} | 
*AbstractCqApi* | **getLoginPage** | **GET** /libs/granite/core/content/login.html | 
*AbstractCqApi* | **postCqActions** | **POST** /.cqactions.html | 
*AbstractCrxApi* | **getCrxdeStatus** | **GET** /crx/server/crx.default/jcr:root/.1.json | 
*AbstractCrxApi* | **getInstallStatus** | **GET** /crx/packmgr/installstatus.jsp | 
*AbstractCrxApi* | **getPackageManagerServlet** | **GET** /crx/packmgr/service/script.html | 
*AbstractCrxApi* | **postPackageService** | **POST** /crx/packmgr/service.jsp | 
*AbstractCrxApi* | **postPackageUpdate** | **POST** /crx/packmgr/update.jsp | 
*AbstractCrxApi* | **postSetPassword** | **POST** /crx/explorer/ui/setpassword.jsp | 
*AbstractCrxApi* | **postPackageServiceJson** | **POST** /crx/packmgr/service/.json/{path} | 
*AbstractCustomApi* | **getAemHealthCheck** | **GET** /system/health | 
*AbstractCustomApi* | **postConfigAemHealthCheckServlet** | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
*AbstractCustomApi* | **postConfigAemPasswordReset** | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 
*AbstractGraniteApi* | **sslSetup** | **POST** /libs/granite/security/post/sslSetup.html | 
*AbstractSlingApi* | **getQuery** | **GET** /bin/querybuilder.json | 
*AbstractSlingApi* | **getTruststore** | **GET** /etc/truststore/truststore.p12 | 
*AbstractSlingApi* | **getTruststoreInfo** | **GET** /libs/granite/security/truststore.json | 
*AbstractSlingApi* | **postAuthorizables** | **POST** /libs/granite/security/post/authorizables | 
*AbstractSlingApi* | **postConfigAdobeGraniteSamlAuthenticationHandler** | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
*AbstractSlingApi* | **postConfigApacheFelixJettyBasedHttpService** | **POST** /apps/system/config/org.apache.felix.http | 
*AbstractSlingApi* | **postConfigApacheHttpComponentsProxyConfiguration** | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
*AbstractSlingApi* | **postConfigApacheSlingDavExServlet** | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
*AbstractSlingApi* | **postConfigApacheSlingGetServlet** | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
*AbstractSlingApi* | **postConfigApacheSlingReferrerFilter** | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
*AbstractSlingApi* | **postQuery** | **POST** /bin/querybuilder.json | 
*AbstractSlingApi* | **postTreeActivation** | **POST** /libs/replication/treeactivation.html | 
*AbstractSlingApi* | **postTruststore** | **POST** /libs/granite/security/post/truststore | 
*AbstractSlingApi* | **postTruststorePKCS12** | **POST** /etc/truststore | 
*AbstractSlingApi* | **deleteAgent** | **DELETE** /etc/replication/agents.{runmode}/{name} | 
*AbstractSlingApi* | **deleteNode** | **DELETE** /{path}/{name} | 
*AbstractSlingApi* | **getAgent** | **GET** /etc/replication/agents.{runmode}/{name} | 
*AbstractSlingApi* | **getAgents** | **GET** /etc/replication/agents.{runmode}.-1.json | 
*AbstractSlingApi* | **getAuthorizableKeystore** | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
*AbstractSlingApi* | **getKeystore** | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
*AbstractSlingApi* | **getNode** | **GET** /{path}/{name} | 
*AbstractSlingApi* | **getPackage** | **GET** /etc/packages/{group}/{name}-{version}.zip | 
*AbstractSlingApi* | **getPackageFilter** | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
*AbstractSlingApi* | **postAgent** | **POST** /etc/replication/agents.{runmode}/{name} | 
*AbstractSlingApi* | **postAuthorizableKeystore** | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
*AbstractSlingApi* | **postConfigProperty** | **POST** /apps/system/config/{configNodeName} | 
*AbstractSlingApi* | **postNode** | **POST** /{path}/{name} | 
*AbstractSlingApi* | **postNodeRw** | **POST** /{path}/{name}.rw.html | 
*AbstractSlingApi* | **postPath** | **POST** /{path}/ | 


## Models

* OpenAPIServer\Model\BundleData
* OpenAPIServer\Model\BundleDataProp
* OpenAPIServer\Model\BundleInfo
* OpenAPIServer\Model\InstallStatus
* OpenAPIServer\Model\InstallStatusStatus
* OpenAPIServer\Model\KeystoreChainItems
* OpenAPIServer\Model\KeystoreInfo
* OpenAPIServer\Model\KeystoreItems
* OpenAPIServer\Model\SamlConfigurationInfo
* OpenAPIServer\Model\SamlConfigurationProperties
* OpenAPIServer\Model\SamlConfigurationPropertyItemsArray
* OpenAPIServer\Model\SamlConfigurationPropertyItemsBoolean
* OpenAPIServer\Model\SamlConfigurationPropertyItemsLong
* OpenAPIServer\Model\SamlConfigurationPropertyItemsString
* OpenAPIServer\Model\TruststoreInfo
* OpenAPIServer\Model\TruststoreItems


## Authentication

### Security schema `aemAuth`
> Important! To make Basic authentication work you need to extend [\OpenAPIServer\Auth\AbstractAuthenticator](./lib/Auth/AbstractAuthenticator.php) class by [\OpenAPIServer\Auth\BasicAuthenticator](./src/Auth/BasicAuthenticator.php) class.

### Advanced middleware configuration
Ref to used Slim Token Middleware [dyorg/slim-token-authentication](https://github.com/dyorg/slim-token-authentication/tree/1.x#readme)

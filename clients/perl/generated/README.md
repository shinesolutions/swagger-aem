# NAME

WWW::OpenAPIClient::Role - a Moose role for the Adobe Experience Manager (AEM) API

Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

# VERSION

Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 3.5.0-pre.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.PerlClientCodegen
For more information, please visit [http://shinesolutions.com](http://shinesolutions.com)

## A note on Moose

This role is the only component of the library that uses Moose. See
WWW::OpenAPIClient::ApiFactory for non-Moosey usage.

# SYNOPSIS

The Perl Generator in the OpenAPI Generator project builds a library of Perl modules to interact with
a web service defined by a OpenAPI Specification. See below for how to build the
library.

This module provides an interface to the generated library. All the classes,
objects, and methods (well, not quite \*all\*, see below) are flattened into this
role.

        package MyApp;
        use Moose;
        with 'WWW::OpenAPIClient::Role';

        package main;

        my $api = MyApp->new({ tokens => $tokens });

        my $pet = $api->get_pet_by_id(pet_id => $pet_id);


## Structure of the library

The library consists of a set of API classes, one for each endpoint. These APIs
implement the method calls available on each endpoint.

Additionally, there is a set of "object" classes, which represent the objects
returned by and sent to the methods on the endpoints.

An API factory class is provided, which builds instances of each endpoint API.

This Moose role flattens all the methods from the endpoint APIs onto the consuming
class. It also provides methods to retrieve the endpoint API objects, and the API
factory object, should you need it.

For documentation of all these methods, see AUTOMATIC DOCUMENTATION below.

## Configuring authentication

In the normal case, the OpenAPI Spec will describe what parameters are
required and where to put them. You just need to supply the tokens.

    my $tokens = {
        # basic
        username => $username,
        password => $password,

        # oauth
        access_token => $oauth_token,

        # keys
        $some_key => { token => $token,
                       prefix => $prefix,
                       in => $in,             # 'head||query',
                       },

        $another => { token => $token,
                      prefix => $prefix,
                      in => $in,              # 'head||query',
                      },
        ...,

        };

        my $api = MyApp->new({ tokens => $tokens });

Note these are all optional, as are `prefix` and `in`, and depend on the API
you are accessing. Usually `prefix` and `in` will be determined by the code generator from
the spec and you will not need to set them at run time. If not, `in` will
default to 'head' and `prefix` to the empty string.

The tokens will be placed in a L<WWW::OpenAPIClient::Configuration> instance
as follows, but you don't need to know about this.

- `$cfg->{username}`

    String. The username for basic auth.

- `$cfg->{password}`

    String. The password for basic auth.

- `$cfg->{api_key}`

    Hashref. Keyed on the name of each key (there can be multiple tokens).

            $cfg->{api_key} = {
                    secretKey => 'aaaabbbbccccdddd',
                    anotherKey => '1111222233334444',
                    };

- `$cfg->{api_key_prefix}`

    Hashref. Keyed on the name of each key (there can be multiple tokens). Note not
    all api keys require a prefix.

            $cfg->{api_key_prefix} = {
                    secretKey => 'string',
                    anotherKey => 'same or some other string',
                    };

- `$cfg->{access_token}`

    String. The OAuth access token.

# METHODS

## `base_url`

The generated code has the `base_url` already set as a default value. This method
returns the current value of `base_url`.

## `api_factory`

Returns an API factory object. You probably won't need to call this directly.

        $self->api_factory('Pet'); # returns a WWW::OpenAPIClient::PetApi instance

        $self->pet_api;            # the same

# MISSING METHODS

Most of the methods on the API are delegated to individual endpoint API objects
(e.g. Pet API, Store API, User API etc). Where different endpoint APIs use the
same method name (e.g. `new()`), these methods can't be delegated. So you need
to call `$api->pet_api->new()`.

In principle, every API is susceptible to the presence of a few, random, undelegatable
method names. In practice, because of the way method names are constructed, it's
unlikely in general that any methods will be undelegatable, except for:

        new()
        class_documentation()
        method_documentation()

To call these methods, you need to get a handle on the relevant object, either
by calling `$api->foo_api` or by retrieving an object, e.g.
`$api->get_pet_by_id(pet_id => $pet_id)`. They are class methods, so
you could also call them on class names.

# BUILDING YOUR LIBRARY

See the homepage `https://openapi-generator.tech` for full details.
But briefly, clone the git repository, build the codegen codebase, set up your build
config file, then run the API build script. You will need git, Java 7 or 8 and Apache
maven 3.0.3 or better already installed.

The config file should specify the project name for the generated library:

        {"moduleName":"WWW::MyProjectName"}

Your library files will be built under `WWW::MyProjectName`.

          $ git clone https://github.com/openapitools/openapi-generator
          $ cd openapi-generator
          $ mvn package
          $ java -jar modules/openapi-generator-cli/target/openapi-generator-cli.jar generate \
    -i [URL or file path to JSON OpenAPI API spec] \
    -g perl \
    -c /path/to/config/file.json \
    -o /path/to/output/folder

Bang, all done. Run the `autodoc` script in the `bin` directory to see the API
you just built.

# AUTOMATIC DOCUMENTATION

You can print out a summary of the generated API by running the included
`autodoc` script in the `bin` directory of your generated library. A few
output formats are supported:

          Usage: autodoc [OPTION]

    -w           wide format (default)
    -n           narrow format
    -p           POD format
    -H           HTML format
    -m           Markdown format
    -h           print this help message
    -c           your application class


The `-c` option allows you to load and inspect your own application. A dummy
namespace is used if you don't supply your own class.

# DOCUMENTATION FROM THE OpenAPI Spec

Additional documentation for each class and method may be provided by the OpenAPI
spec. If so, this is available via the `class_documentation()` and
`method_documentation()` methods on each generated object class, and the
`method_documentation()` method on the endpoint API classes:

        my $cmdoc = $api->pet_api->method_documentation->{$method_name};

        my $odoc = $api->get_pet_by_id->(pet_id => $pet_id)->class_documentation;
        my $omdoc = $api->get_pet_by_id->(pet_id => $pet_id)->method_documentation->{method_name};


Each of these calls returns a hashref with various useful pieces of information.

# Installation Prerequisites

Use [cpanm](https://metacpan.org/pod/distribution/App-cpanminus/bin/cpanm) to install the module dependencies:

```
cpanm --local-lib=~/perl5 local::lib && eval $(perl -I ~/perl5/lib/perl5/ -Mlocal::lib)
cpanm --quiet --no-interactive Class::Accessor Test::Exception Test::More Log::Any LWP::UserAgent URI::Query Module::Runtime DateTime Module::Find Moose::Role JSON
```

# LOAD THE MODULES

To load the API packages:
```perl
use WWW::OpenAPIClient::ConsoleApi;
use WWW::OpenAPIClient::CqApi;
use WWW::OpenAPIClient::CrxApi;
use WWW::OpenAPIClient::CustomApi;
use WWW::OpenAPIClient::GraniteApi;
use WWW::OpenAPIClient::SlingApi;

```

To load the models:
```perl
use WWW::OpenAPIClient::Object::BundleData;
use WWW::OpenAPIClient::Object::BundleDataProp;
use WWW::OpenAPIClient::Object::BundleInfo;
use WWW::OpenAPIClient::Object::InstallStatus;
use WWW::OpenAPIClient::Object::InstallStatusStatus;
use WWW::OpenAPIClient::Object::KeystoreChainItems;
use WWW::OpenAPIClient::Object::KeystoreInfo;
use WWW::OpenAPIClient::Object::KeystoreItems;
use WWW::OpenAPIClient::Object::SamlConfigurationInfo;
use WWW::OpenAPIClient::Object::SamlConfigurationProperties;
use WWW::OpenAPIClient::Object::SamlConfigurationPropertyItemsArray;
use WWW::OpenAPIClient::Object::SamlConfigurationPropertyItemsBoolean;
use WWW::OpenAPIClient::Object::SamlConfigurationPropertyItemsLong;
use WWW::OpenAPIClient::Object::SamlConfigurationPropertyItemsString;
use WWW::OpenAPIClient::Object::TruststoreInfo;
use WWW::OpenAPIClient::Object::TruststoreItems;

````

# GETTING STARTED
Put the Perl SDK under the 'lib' folder in your project directory, then run the following
```perl
#!/usr/bin/perl
use lib 'lib';
use strict;
use warnings;
# load the API package
use WWW::OpenAPIClient::ConsoleApi;
use WWW::OpenAPIClient::CqApi;
use WWW::OpenAPIClient::CrxApi;
use WWW::OpenAPIClient::CustomApi;
use WWW::OpenAPIClient::GraniteApi;
use WWW::OpenAPIClient::SlingApi;

# load the models
use WWW::OpenAPIClient::Object::BundleData;
use WWW::OpenAPIClient::Object::BundleDataProp;
use WWW::OpenAPIClient::Object::BundleInfo;
use WWW::OpenAPIClient::Object::InstallStatus;
use WWW::OpenAPIClient::Object::InstallStatusStatus;
use WWW::OpenAPIClient::Object::KeystoreChainItems;
use WWW::OpenAPIClient::Object::KeystoreInfo;
use WWW::OpenAPIClient::Object::KeystoreItems;
use WWW::OpenAPIClient::Object::SamlConfigurationInfo;
use WWW::OpenAPIClient::Object::SamlConfigurationProperties;
use WWW::OpenAPIClient::Object::SamlConfigurationPropertyItemsArray;
use WWW::OpenAPIClient::Object::SamlConfigurationPropertyItemsBoolean;
use WWW::OpenAPIClient::Object::SamlConfigurationPropertyItemsLong;
use WWW::OpenAPIClient::Object::SamlConfigurationPropertyItemsString;
use WWW::OpenAPIClient::Object::TruststoreInfo;
use WWW::OpenAPIClient::Object::TruststoreItems;

# for displaying the API response data
use Data::Dumper;


my $api_instance = WWW::OpenAPIClient::ConsoleApi->new(
    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);


eval {
    my $result = $api_instance->get_aem_product_info();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConsoleApi->get_aem_product_info: $@\n";
}

```

# DOCUMENTATION FOR API ENDPOINTS

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConsoleApi* | [**get_aem_product_info**](docs/ConsoleApi.md#get_aem_product_info) | **GET** /system/console/status-productinfo.json | 
*ConsoleApi* | [**get_bundle_info**](docs/ConsoleApi.md#get_bundle_info) | **GET** /system/console/bundles/{name}.json | 
*ConsoleApi* | [**get_config_mgr**](docs/ConsoleApi.md#get_config_mgr) | **GET** /system/console/configMgr | 
*ConsoleApi* | [**post_bundle**](docs/ConsoleApi.md#post_bundle) | **POST** /system/console/bundles/{name} | 
*ConsoleApi* | [**post_jmx_repository**](docs/ConsoleApi.md#post_jmx_repository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
*ConsoleApi* | [**post_saml_configuration**](docs/ConsoleApi.md#post_saml_configuration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 
*CqApi* | [**get_login_page**](docs/CqApi.md#get_login_page) | **GET** /libs/granite/core/content/login.html | 
*CqApi* | [**post_cq_actions**](docs/CqApi.md#post_cq_actions) | **POST** /.cqactions.html | 
*CrxApi* | [**get_crxde_status**](docs/CrxApi.md#get_crxde_status) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
*CrxApi* | [**get_install_status**](docs/CrxApi.md#get_install_status) | **GET** /crx/packmgr/installstatus.jsp | 
*CrxApi* | [**get_package_manager_servlet**](docs/CrxApi.md#get_package_manager_servlet) | **GET** /crx/packmgr/service/script.html | 
*CrxApi* | [**post_package_service**](docs/CrxApi.md#post_package_service) | **POST** /crx/packmgr/service.jsp | 
*CrxApi* | [**post_package_service_json**](docs/CrxApi.md#post_package_service_json) | **POST** /crx/packmgr/service/.json/{path} | 
*CrxApi* | [**post_package_update**](docs/CrxApi.md#post_package_update) | **POST** /crx/packmgr/update.jsp | 
*CrxApi* | [**post_set_password**](docs/CrxApi.md#post_set_password) | **POST** /crx/explorer/ui/setpassword.jsp | 
*CustomApi* | [**get_aem_health_check**](docs/CustomApi.md#get_aem_health_check) | **GET** /system/health | 
*CustomApi* | [**post_config_aem_health_check_servlet**](docs/CustomApi.md#post_config_aem_health_check_servlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
*CustomApi* | [**post_config_aem_password_reset**](docs/CustomApi.md#post_config_aem_password_reset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 
*GraniteApi* | [**ssl_setup**](docs/GraniteApi.md#ssl_setup) | **POST** /libs/granite/security/post/sslSetup.html | 
*SlingApi* | [**delete_agent**](docs/SlingApi.md#delete_agent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
*SlingApi* | [**delete_node**](docs/SlingApi.md#delete_node) | **DELETE** /{path}/{name} | 
*SlingApi* | [**get_agent**](docs/SlingApi.md#get_agent) | **GET** /etc/replication/agents.{runmode}/{name} | 
*SlingApi* | [**get_agents**](docs/SlingApi.md#get_agents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
*SlingApi* | [**get_authorizable_keystore**](docs/SlingApi.md#get_authorizable_keystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
*SlingApi* | [**get_keystore**](docs/SlingApi.md#get_keystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
*SlingApi* | [**get_node**](docs/SlingApi.md#get_node) | **GET** /{path}/{name} | 
*SlingApi* | [**get_package**](docs/SlingApi.md#get_package) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
*SlingApi* | [**get_package_filter**](docs/SlingApi.md#get_package_filter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
*SlingApi* | [**get_query**](docs/SlingApi.md#get_query) | **GET** /bin/querybuilder.json | 
*SlingApi* | [**get_truststore**](docs/SlingApi.md#get_truststore) | **GET** /etc/truststore/truststore.p12 | 
*SlingApi* | [**get_truststore_info**](docs/SlingApi.md#get_truststore_info) | **GET** /libs/granite/security/truststore.json | 
*SlingApi* | [**post_agent**](docs/SlingApi.md#post_agent) | **POST** /etc/replication/agents.{runmode}/{name} | 
*SlingApi* | [**post_authorizable_keystore**](docs/SlingApi.md#post_authorizable_keystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
*SlingApi* | [**post_authorizables**](docs/SlingApi.md#post_authorizables) | **POST** /libs/granite/security/post/authorizables | 
*SlingApi* | [**post_config_adobe_granite_saml_authentication_handler**](docs/SlingApi.md#post_config_adobe_granite_saml_authentication_handler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
*SlingApi* | [**post_config_apache_felix_jetty_based_http_service**](docs/SlingApi.md#post_config_apache_felix_jetty_based_http_service) | **POST** /apps/system/config/org.apache.felix.http | 
*SlingApi* | [**post_config_apache_http_components_proxy_configuration**](docs/SlingApi.md#post_config_apache_http_components_proxy_configuration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
*SlingApi* | [**post_config_apache_sling_dav_ex_servlet**](docs/SlingApi.md#post_config_apache_sling_dav_ex_servlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
*SlingApi* | [**post_config_apache_sling_get_servlet**](docs/SlingApi.md#post_config_apache_sling_get_servlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
*SlingApi* | [**post_config_apache_sling_referrer_filter**](docs/SlingApi.md#post_config_apache_sling_referrer_filter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
*SlingApi* | [**post_config_property**](docs/SlingApi.md#post_config_property) | **POST** /apps/system/config/{configNodeName} | 
*SlingApi* | [**post_node**](docs/SlingApi.md#post_node) | **POST** /{path}/{name} | 
*SlingApi* | [**post_node_rw**](docs/SlingApi.md#post_node_rw) | **POST** /{path}/{name}.rw.html | 
*SlingApi* | [**post_path**](docs/SlingApi.md#post_path) | **POST** /{path}/ | 
*SlingApi* | [**post_query**](docs/SlingApi.md#post_query) | **POST** /bin/querybuilder.json | 
*SlingApi* | [**post_tree_activation**](docs/SlingApi.md#post_tree_activation) | **POST** /etc/replication/treeactivation.html | 
*SlingApi* | [**post_truststore**](docs/SlingApi.md#post_truststore) | **POST** /libs/granite/security/post/truststore | 
*SlingApi* | [**post_truststore_pkcs12**](docs/SlingApi.md#post_truststore_pkcs12) | **POST** /etc/truststore | 


# DOCUMENTATION FOR MODELS
 - [WWW::OpenAPIClient::Object::BundleData](docs/BundleData.md)
 - [WWW::OpenAPIClient::Object::BundleDataProp](docs/BundleDataProp.md)
 - [WWW::OpenAPIClient::Object::BundleInfo](docs/BundleInfo.md)
 - [WWW::OpenAPIClient::Object::InstallStatus](docs/InstallStatus.md)
 - [WWW::OpenAPIClient::Object::InstallStatusStatus](docs/InstallStatusStatus.md)
 - [WWW::OpenAPIClient::Object::KeystoreChainItems](docs/KeystoreChainItems.md)
 - [WWW::OpenAPIClient::Object::KeystoreInfo](docs/KeystoreInfo.md)
 - [WWW::OpenAPIClient::Object::KeystoreItems](docs/KeystoreItems.md)
 - [WWW::OpenAPIClient::Object::SamlConfigurationInfo](docs/SamlConfigurationInfo.md)
 - [WWW::OpenAPIClient::Object::SamlConfigurationProperties](docs/SamlConfigurationProperties.md)
 - [WWW::OpenAPIClient::Object::SamlConfigurationPropertyItemsArray](docs/SamlConfigurationPropertyItemsArray.md)
 - [WWW::OpenAPIClient::Object::SamlConfigurationPropertyItemsBoolean](docs/SamlConfigurationPropertyItemsBoolean.md)
 - [WWW::OpenAPIClient::Object::SamlConfigurationPropertyItemsLong](docs/SamlConfigurationPropertyItemsLong.md)
 - [WWW::OpenAPIClient::Object::SamlConfigurationPropertyItemsString](docs/SamlConfigurationPropertyItemsString.md)
 - [WWW::OpenAPIClient::Object::TruststoreInfo](docs/TruststoreInfo.md)
 - [WWW::OpenAPIClient::Object::TruststoreItems](docs/TruststoreItems.md)


# DOCUMENTATION FOR AUTHORIZATION

## aemAuth

- **Type**: HTTP basic authentication


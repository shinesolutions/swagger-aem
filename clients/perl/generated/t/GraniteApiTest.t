=begin comment

Adobe Experience Manager (AEM) API

Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

The version of the OpenAPI document: 3.5.0-pre.0
Contact: opensource@shinesolutions.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator
# Please update the test cases below to test the API endpoints.
# Ref: https://openapi-generator.tech
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::OpenAPIClient::GraniteApi');

my $api = WWW::OpenAPIClient::GraniteApi->new();
isa_ok($api, 'WWW::OpenAPIClient::GraniteApi');

#
# ssl_setup test
#
# uncomment below and update the test
#my $ssl_setup_keystore_password = undef; # replace NULL with a proper value
#my $ssl_setup_keystore_password_confirm = undef; # replace NULL with a proper value
#my $ssl_setup_truststore_password = undef; # replace NULL with a proper value
#my $ssl_setup_truststore_password_confirm = undef; # replace NULL with a proper value
#my $ssl_setup_https_hostname = undef; # replace NULL with a proper value
#my $ssl_setup_https_port = undef; # replace NULL with a proper value
#my $ssl_setup_privatekey_file = undef; # replace NULL with a proper value
#my $ssl_setup_certificate_file = undef; # replace NULL with a proper value
#my $ssl_setup_result = $api->ssl_setup(keystore_password => $ssl_setup_keystore_password, keystore_password_confirm => $ssl_setup_keystore_password_confirm, truststore_password => $ssl_setup_truststore_password, truststore_password_confirm => $ssl_setup_truststore_password_confirm, https_hostname => $ssl_setup_https_hostname, https_port => $ssl_setup_https_port, privatekey_file => $ssl_setup_privatekey_file, certificate_file => $ssl_setup_certificate_file);

<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();


$app->GET('//system/console/status-productinfo.json', function(Application $app, Request $request) {
            return new Response('How about implementing getAemProductInfo as a GET method ?');
            });


$app->GET('//system/console/configMgr', function(Application $app, Request $request) {
            return new Response('How about implementing getConfigMgr as a GET method ?');
            });


$app->POST('//system/console/bundles/{name}', function(Application $app, Request $request, $name) {
            $action = $request->get('action');
            return new Response('How about implementing postBundle as a POST method ?');
            });


$app->POST('//system/console/jmx/com.adobe.granite:type=Repository/op/{action}', function(Application $app, Request $request, $action) {
            return new Response('How about implementing postJmxRepository as a POST method ?');
            });


$app->POST('//system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler', function(Application $app, Request $request) {
            $post = $request->get('post');
            $apply = $request->get('apply');
            $delete = $request->get('delete');
            $action = $request->get('action');
            $__location = $request->get('__location');
            $path = $request->get('path');
            $service/ranking = $request->get('service/ranking');
            $idp_url = $request->get('idp_url');
            $idp_cert_alias = $request->get('idp_cert_alias');
            $idp_http_redirect = $request->get('idp_http_redirect');
            $service_provider_entity_id = $request->get('service_provider_entity_id');
            $assertion_consumer_service_url = $request->get('assertion_consumer_service_url');
            $sp_private_key_alias = $request->get('sp_private_key_alias');
            $key_store_password = $request->get('key_store_password');
            $default_redirect_url = $request->get('default_redirect_url');
            $user_id_attribute = $request->get('user_id_attribute');
            $use_encryption = $request->get('use_encryption');
            $create_user = $request->get('create_user');
            $add_group_memberships = $request->get('add_group_memberships');
            $group_membership_attribute = $request->get('group_membership_attribute');
            $default_groups = $request->get('default_groups');
            $name_id_format = $request->get('name_id_format');
            $synchronize_attributes = $request->get('synchronize_attributes');
            $handle_logout = $request->get('handle_logout');
            $logout_url = $request->get('logout_url');
            $clock_tolerance = $request->get('clock_tolerance');
            $digest_method = $request->get('digest_method');
            $signature_method = $request->get('signature_method');
            $user_intermediate_path = $request->get('user_intermediate_path');
            $propertylist = $request->get('propertylist');
            return new Response('How about implementing postSamlConfiguration as a POST method ?');
            });


$app->GET('//libs/granite/core/content/login.html', function(Application $app, Request $request) {
            return new Response('How about implementing getLoginPage as a GET method ?');
            });


$app->POST('//.cqactions.html', function(Application $app, Request $request) {
            $authorizable_id = $request->get('authorizable_id');
            $changelog = $request->get('changelog');
            return new Response('How about implementing postCqActions as a POST method ?');
            });


$app->GET('//crx/server/crx.default/jcr:root/.1.json', function(Application $app, Request $request) {
            return new Response('How about implementing getCrxdeStatus as a GET method ?');
            });


$app->GET('//crx/packmgr/installstatus.jsp', function(Application $app, Request $request) {
            return new Response('How about implementing getInstallStatus as a GET method ?');
            });


$app->GET('//crx/packmgr/service/script.html', function(Application $app, Request $request) {
            return new Response('How about implementing getPackageManagerServlet as a GET method ?');
            });


$app->POST('//crx/packmgr/service.jsp', function(Application $app, Request $request) {
            $cmd = $request->get('cmd');
            return new Response('How about implementing postPackageService as a POST method ?');
            });


$app->POST('//crx/packmgr/service/.json/{path}', function(Application $app, Request $request, $path) {
            $cmd = $request->get('cmd');
            $group_name = $request->get('group_name');
            $package_name = $request->get('package_name');
            $package_version = $request->get('package_version');
            $_charset_ = $request->get('_charset_');
            $force = $request->get('force');
            $recursive = $request->get('recursive');
            $package = $request->get('package');
            return new Response('How about implementing postPackageServiceJson as a POST method ?');
            });


$app->POST('//crx/packmgr/update.jsp', function(Application $app, Request $request) {
            $group_name = $request->get('group_name');
            $package_name = $request->get('package_name');
            $version = $request->get('version');
            $path = $request->get('path');
            $filter = $request->get('filter');
            $_charset_ = $request->get('_charset_');
            return new Response('How about implementing postPackageUpdate as a POST method ?');
            });


$app->POST('//crx/explorer/ui/setpassword.jsp', function(Application $app, Request $request) {
            $old = $request->get('old');
            $plain = $request->get('plain');
            $verify = $request->get('verify');
            return new Response('How about implementing postSetPassword as a POST method ?');
            });


$app->GET('//system/health', function(Application $app, Request $request) {
            $tags = $request->get('tags');
            $combine_tags_or = $request->get('combine_tags_or');
            return new Response('How about implementing getAemHealthCheck as a GET method ?');
            });


$app->POST('//apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck', function(Application $app, Request $request) {
            $bundles/ignored = $request->get('bundles/ignored');
            $bundles/ignored@type_hint = $request->get('bundles/ignored@type_hint');
            return new Response('How about implementing postConfigAemHealthCheckServlet as a POST method ?');
            });


$app->POST('//apps/system/config/com.shinesolutions.aem.passwordreset.Activator', function(Application $app, Request $request) {
            $pwdreset/authorizables = $request->get('pwdreset/authorizables');
            $pwdreset/authorizables@type_hint = $request->get('pwdreset/authorizables@type_hint');
            return new Response('How about implementing postConfigAemPasswordReset as a POST method ?');
            });


$app->DELETE('//etc/replication/agents.{runmode}/{name}', function(Application $app, Request $request, $runmode, $name) {
            return new Response('How about implementing deleteAgent as a DELETE method ?');
            });


$app->DELETE('//{path}/{name}', function(Application $app, Request $request, $path, $name) {
            return new Response('How about implementing deleteNode as a DELETE method ?');
            });


$app->GET('//etc/replication/agents.{runmode}/{name}', function(Application $app, Request $request, $runmode, $name) {
            return new Response('How about implementing getAgent as a GET method ?');
            });


$app->GET('//etc/replication/agents.{runmode}.-1.json', function(Application $app, Request $request, $runmode) {
            return new Response('How about implementing getAgents as a GET method ?');
            });


$app->GET('//{intermediatePath}/{authorizableId}.ks.json', function(Application $app, Request $request, $intermediatePath, $authorizableId) {
            return new Response('How about implementing getAuthorizableKeystore as a GET method ?');
            });


$app->GET('//{intermediatePath}/{authorizableId}/keystore/store.p12', function(Application $app, Request $request, $intermediatePath, $authorizableId) {
            return new Response('How about implementing getKeystore as a GET method ?');
            });


$app->GET('//{path}/{name}', function(Application $app, Request $request, $path, $name) {
            return new Response('How about implementing getNode as a GET method ?');
            });


$app->GET('//etc/packages/{group}/{name}-{version}.zip', function(Application $app, Request $request, $group, $name, $version) {
            return new Response('How about implementing getPackage as a GET method ?');
            });


$app->GET('//etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json', function(Application $app, Request $request, $group, $name, $version) {
            return new Response('How about implementing getPackageFilter as a GET method ?');
            });


$app->GET('//bin/querybuilder.json', function(Application $app, Request $request) {
            $path = $request->get('path');
            $p/limit = $request->get('p/limit');
            $_1_property = $request->get('_1_property');
            $_1_property/value = $request->get('_1_property/value');
            return new Response('How about implementing getQuery as a GET method ?');
            });


$app->GET('//etc/truststore/truststore.p12', function(Application $app, Request $request) {
            return new Response('How about implementing getTruststore as a GET method ?');
            });


$app->GET('//libs/granite/security/truststore.json', function(Application $app, Request $request) {
            return new Response('How about implementing getTruststoreInfo as a GET method ?');
            });


$app->POST('//etc/replication/agents.{runmode}/{name}', function(Application $app, Request $request, $runmode, $name) {
            $jcr:content/cq:distribute = $request->get('jcr:content/cq:distribute');
            $jcr:content/cq:distribute@type_hint = $request->get('jcr:content/cq:distribute@type_hint');
            $jcr:content/cq:name = $request->get('jcr:content/cq:name');
            $jcr:content/cq:template = $request->get('jcr:content/cq:template');
            $jcr:content/enabled = $request->get('jcr:content/enabled');
            $jcr:content/jcr:description = $request->get('jcr:content/jcr:description');
            $jcr:content/jcr:last_modified = $request->get('jcr:content/jcr:last_modified');
            $jcr:content/jcr:last_modified_by = $request->get('jcr:content/jcr:last_modified_by');
            $jcr:content/jcr:mixin_types = $request->get('jcr:content/jcr:mixin_types');
            $jcr:content/jcr:title = $request->get('jcr:content/jcr:title');
            $jcr:content/log_level = $request->get('jcr:content/log_level');
            $jcr:content/no_status_update = $request->get('jcr:content/no_status_update');
            $jcr:content/no_versioning = $request->get('jcr:content/no_versioning');
            $jcr:content/protocol_connect_timeout = $request->get('jcr:content/protocol_connect_timeout');
            $jcr:content/protocol_http_connection_closed = $request->get('jcr:content/protocol_http_connection_closed');
            $jcr:content/protocol_http_expired = $request->get('jcr:content/protocol_http_expired');
            $jcr:content/protocol_http_headers = $request->get('jcr:content/protocol_http_headers');
            $jcr:content/protocol_http_headers@type_hint = $request->get('jcr:content/protocol_http_headers@type_hint');
            $jcr:content/protocol_http_method = $request->get('jcr:content/protocol_http_method');
            $jcr:content/protocol_https_relaxed = $request->get('jcr:content/protocol_https_relaxed');
            $jcr:content/protocol_interface = $request->get('jcr:content/protocol_interface');
            $jcr:content/protocol_socket_timeout = $request->get('jcr:content/protocol_socket_timeout');
            $jcr:content/protocol_version = $request->get('jcr:content/protocol_version');
            $jcr:content/proxy_ntlm_domain = $request->get('jcr:content/proxy_ntlm_domain');
            $jcr:content/proxy_ntlm_host = $request->get('jcr:content/proxy_ntlm_host');
            $jcr:content/proxy_host = $request->get('jcr:content/proxy_host');
            $jcr:content/proxy_password = $request->get('jcr:content/proxy_password');
            $jcr:content/proxy_port = $request->get('jcr:content/proxy_port');
            $jcr:content/proxy_user = $request->get('jcr:content/proxy_user');
            $jcr:content/queue_batch_max_size = $request->get('jcr:content/queue_batch_max_size');
            $jcr:content/queue_batch_mode = $request->get('jcr:content/queue_batch_mode');
            $jcr:content/queue_batch_wait_time = $request->get('jcr:content/queue_batch_wait_time');
            $jcr:content/retry_delay = $request->get('jcr:content/retry_delay');
            $jcr:content/reverse_replication = $request->get('jcr:content/reverse_replication');
            $jcr:content/serialization_type = $request->get('jcr:content/serialization_type');
            $jcr:content/sling:resource_type = $request->get('jcr:content/sling:resource_type');
            $jcr:content/ssl = $request->get('jcr:content/ssl');
            $jcr:content/transport_ntlm_domain = $request->get('jcr:content/transport_ntlm_domain');
            $jcr:content/transport_ntlm_host = $request->get('jcr:content/transport_ntlm_host');
            $jcr:content/transport_password = $request->get('jcr:content/transport_password');
            $jcr:content/transport_uri = $request->get('jcr:content/transport_uri');
            $jcr:content/transport_user = $request->get('jcr:content/transport_user');
            $jcr:content/trigger_distribute = $request->get('jcr:content/trigger_distribute');
            $jcr:content/trigger_modified = $request->get('jcr:content/trigger_modified');
            $jcr:content/trigger_on_off_time = $request->get('jcr:content/trigger_on_off_time');
            $jcr:content/trigger_receive = $request->get('jcr:content/trigger_receive');
            $jcr:content/trigger_specific = $request->get('jcr:content/trigger_specific');
            $jcr:content/user_id = $request->get('jcr:content/user_id');
            $jcr:primary_type = $request->get('jcr:primary_type');
            $:operation = $request->get(':operation');
            return new Response('How about implementing postAgent as a POST method ?');
            });


$app->POST('//{intermediatePath}/{authorizableId}.ks.html', function(Application $app, Request $request, $intermediatePath, $authorizableId) {
            $:operation = $request->get(':operation');
            $current_password = $request->get('current_password');
            $new_password = $request->get('new_password');
            $re_password = $request->get('re_password');
            $key_password = $request->get('key_password');
            $key_store_pass = $request->get('key_store_pass');
            $alias = $request->get('alias');
            $new_alias = $request->get('new_alias');
            $remove_alias = $request->get('remove_alias');
            $cert_chain = $request->get('cert_chain');
            $pk = $request->get('pk');
            $key_store = $request->get('key_store');
            return new Response('How about implementing postAuthorizableKeystore as a POST method ?');
            });


$app->POST('//libs/granite/security/post/authorizables', function(Application $app, Request $request) {
            $authorizable_id = $request->get('authorizable_id');
            $intermediate_path = $request->get('intermediate_path');
            $create_user = $request->get('create_user');
            $create_group = $request->get('create_group');
            $rep:password = $request->get('rep:password');
            $profile/given_name = $request->get('profile/given_name');
            return new Response('How about implementing postAuthorizables as a POST method ?');
            });


$app->POST('//apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config', function(Application $app, Request $request) {
            $key_store_password = $request->get('key_store_password');
            $key_store_password@type_hint = $request->get('key_store_password@type_hint');
            $service/ranking = $request->get('service/ranking');
            $service/ranking@type_hint = $request->get('service/ranking@type_hint');
            $idp_http_redirect = $request->get('idp_http_redirect');
            $idp_http_redirect@type_hint = $request->get('idp_http_redirect@type_hint');
            $create_user = $request->get('create_user');
            $create_user@type_hint = $request->get('create_user@type_hint');
            $default_redirect_url = $request->get('default_redirect_url');
            $default_redirect_url@type_hint = $request->get('default_redirect_url@type_hint');
            $user_id_attribute = $request->get('user_id_attribute');
            $user_id_attribute@type_hint = $request->get('user_id_attribute@type_hint');
            $default_groups = $request->get('default_groups');
            $default_groups@type_hint = $request->get('default_groups@type_hint');
            $idp_cert_alias = $request->get('idp_cert_alias');
            $idp_cert_alias@type_hint = $request->get('idp_cert_alias@type_hint');
            $add_group_memberships = $request->get('add_group_memberships');
            $add_group_memberships@type_hint = $request->get('add_group_memberships@type_hint');
            $path = $request->get('path');
            $path@type_hint = $request->get('path@type_hint');
            $synchronize_attributes = $request->get('synchronize_attributes');
            $synchronize_attributes@type_hint = $request->get('synchronize_attributes@type_hint');
            $clock_tolerance = $request->get('clock_tolerance');
            $clock_tolerance@type_hint = $request->get('clock_tolerance@type_hint');
            $group_membership_attribute = $request->get('group_membership_attribute');
            $group_membership_attribute@type_hint = $request->get('group_membership_attribute@type_hint');
            $idp_url = $request->get('idp_url');
            $idp_url@type_hint = $request->get('idp_url@type_hint');
            $logout_url = $request->get('logout_url');
            $logout_url@type_hint = $request->get('logout_url@type_hint');
            $service_provider_entity_id = $request->get('service_provider_entity_id');
            $service_provider_entity_id@type_hint = $request->get('service_provider_entity_id@type_hint');
            $assertion_consumer_service_url = $request->get('assertion_consumer_service_url');
            $assertion_consumer_service_url@type_hint = $request->get('assertion_consumer_service_url@type_hint');
            $handle_logout = $request->get('handle_logout');
            $handle_logout@type_hint = $request->get('handle_logout@type_hint');
            $sp_private_key_alias = $request->get('sp_private_key_alias');
            $sp_private_key_alias@type_hint = $request->get('sp_private_key_alias@type_hint');
            $use_encryption = $request->get('use_encryption');
            $use_encryption@type_hint = $request->get('use_encryption@type_hint');
            $name_id_format = $request->get('name_id_format');
            $name_id_format@type_hint = $request->get('name_id_format@type_hint');
            $digest_method = $request->get('digest_method');
            $digest_method@type_hint = $request->get('digest_method@type_hint');
            $signature_method = $request->get('signature_method');
            $signature_method@type_hint = $request->get('signature_method@type_hint');
            $user_intermediate_path = $request->get('user_intermediate_path');
            $user_intermediate_path@type_hint = $request->get('user_intermediate_path@type_hint');
            return new Response('How about implementing postConfigAdobeGraniteSamlAuthenticationHandler as a POST method ?');
            });


$app->POST('//apps/system/config/org.apache.felix.http', function(Application $app, Request $request) {
            $org/apache/felix/https/nio = $request->get('org/apache/felix/https/nio');
            $org/apache/felix/https/nio@type_hint = $request->get('org/apache/felix/https/nio@type_hint');
            $org/apache/felix/https/keystore = $request->get('org/apache/felix/https/keystore');
            $org/apache/felix/https/keystore@type_hint = $request->get('org/apache/felix/https/keystore@type_hint');
            $org/apache/felix/https/keystore/password = $request->get('org/apache/felix/https/keystore/password');
            $org/apache/felix/https/keystore/password@type_hint = $request->get('org/apache/felix/https/keystore/password@type_hint');
            $org/apache/felix/https/keystore/key = $request->get('org/apache/felix/https/keystore/key');
            $org/apache/felix/https/keystore/key@type_hint = $request->get('org/apache/felix/https/keystore/key@type_hint');
            $org/apache/felix/https/keystore/key/password = $request->get('org/apache/felix/https/keystore/key/password');
            $org/apache/felix/https/keystore/key/password@type_hint = $request->get('org/apache/felix/https/keystore/key/password@type_hint');
            $org/apache/felix/https/truststore = $request->get('org/apache/felix/https/truststore');
            $org/apache/felix/https/truststore@type_hint = $request->get('org/apache/felix/https/truststore@type_hint');
            $org/apache/felix/https/truststore/password = $request->get('org/apache/felix/https/truststore/password');
            $org/apache/felix/https/truststore/password@type_hint = $request->get('org/apache/felix/https/truststore/password@type_hint');
            $org/apache/felix/https/clientcertificate = $request->get('org/apache/felix/https/clientcertificate');
            $org/apache/felix/https/clientcertificate@type_hint = $request->get('org/apache/felix/https/clientcertificate@type_hint');
            $org/apache/felix/https/enable = $request->get('org/apache/felix/https/enable');
            $org/apache/felix/https/enable@type_hint = $request->get('org/apache/felix/https/enable@type_hint');
            $org/osgi/service/http/port/secure = $request->get('org/osgi/service/http/port/secure');
            $org/osgi/service/http/port/secure@type_hint = $request->get('org/osgi/service/http/port/secure@type_hint');
            return new Response('How about implementing postConfigApacheFelixJettyBasedHttpService as a POST method ?');
            });


$app->POST('//apps/system/config/org.apache.http.proxyconfigurator.config', function(Application $app, Request $request) {
            $proxy/host = $request->get('proxy/host');
            $proxy/host@type_hint = $request->get('proxy/host@type_hint');
            $proxy/port = $request->get('proxy/port');
            $proxy/port@type_hint = $request->get('proxy/port@type_hint');
            $proxy/exceptions = $request->get('proxy/exceptions');
            $proxy/exceptions@type_hint = $request->get('proxy/exceptions@type_hint');
            $proxy/enabled = $request->get('proxy/enabled');
            $proxy/enabled@type_hint = $request->get('proxy/enabled@type_hint');
            $proxy/user = $request->get('proxy/user');
            $proxy/user@type_hint = $request->get('proxy/user@type_hint');
            $proxy/password = $request->get('proxy/password');
            $proxy/password@type_hint = $request->get('proxy/password@type_hint');
            return new Response('How about implementing postConfigApacheHttpComponentsProxyConfiguration as a POST method ?');
            });


$app->POST('//apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet', function(Application $app, Request $request) {
            $alias = $request->get('alias');
            $alias@type_hint = $request->get('alias@type_hint');
            $dav/create_absolute_uri = $request->get('dav/create_absolute_uri');
            $dav/create_absolute_uri@type_hint = $request->get('dav/create_absolute_uri@type_hint');
            return new Response('How about implementing postConfigApacheSlingDavExServlet as a POST method ?');
            });


$app->POST('//apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet', function(Application $app, Request $request) {
            $json/maximumresults = $request->get('json/maximumresults');
            $json/maximumresults@type_hint = $request->get('json/maximumresults@type_hint');
            $enable/html = $request->get('enable/html');
            $enable/html@type_hint = $request->get('enable/html@type_hint');
            $enable/txt = $request->get('enable/txt');
            $enable/txt@type_hint = $request->get('enable/txt@type_hint');
            $enable/xml = $request->get('enable/xml');
            $enable/xml@type_hint = $request->get('enable/xml@type_hint');
            return new Response('How about implementing postConfigApacheSlingGetServlet as a POST method ?');
            });


$app->POST('//apps/system/config/org.apache.sling.security.impl.ReferrerFilter', function(Application $app, Request $request) {
            $allow/empty = $request->get('allow/empty');
            $allow/empty@type_hint = $request->get('allow/empty@type_hint');
            $allow/hosts = $request->get('allow/hosts');
            $allow/hosts@type_hint = $request->get('allow/hosts@type_hint');
            $allow/hosts/regexp = $request->get('allow/hosts/regexp');
            $allow/hosts/regexp@type_hint = $request->get('allow/hosts/regexp@type_hint');
            $filter/methods = $request->get('filter/methods');
            $filter/methods@type_hint = $request->get('filter/methods@type_hint');
            return new Response('How about implementing postConfigApacheSlingReferrerFilter as a POST method ?');
            });


$app->POST('//{path}/{name}', function(Application $app, Request $request, $path, $name) {
            $:operation = $request->get(':operation');
            $delete_authorizable = $request->get('delete_authorizable');
            $file = $request->get('file');
            return new Response('How about implementing postNode as a POST method ?');
            });


$app->POST('//{path}/{name}.rw.html', function(Application $app, Request $request, $path, $name) {
            $add_members = $request->get('add_members');
            return new Response('How about implementing postNodeRw as a POST method ?');
            });


$app->POST('//{path}/', function(Application $app, Request $request, $path) {
            $jcr:primary_type = $request->get('jcr:primary_type');
            $:name = $request->get(':name');
            return new Response('How about implementing postPath as a POST method ?');
            });


$app->POST('//bin/querybuilder.json', function(Application $app, Request $request) {
            $path = $request->get('path');
            $p/limit = $request->get('p/limit');
            $_1_property = $request->get('_1_property');
            $_1_property/value = $request->get('_1_property/value');
            return new Response('How about implementing postQuery as a POST method ?');
            });


$app->POST('//etc/replication/treeactivation.html', function(Application $app, Request $request) {
            $ignoredeactivated = $request->get('ignoredeactivated');
            $onlymodified = $request->get('onlymodified');
            $path = $request->get('path');
            return new Response('How about implementing postTreeActivation as a POST method ?');
            });


$app->POST('//libs/granite/security/post/truststore', function(Application $app, Request $request) {
            $:operation = $request->get(':operation');
            $new_password = $request->get('new_password');
            $re_password = $request->get('re_password');
            $key_store_type = $request->get('key_store_type');
            $remove_alias = $request->get('remove_alias');
            $certificate = $request->get('certificate');
            return new Response('How about implementing postTruststore as a POST method ?');
            });


$app->POST('//etc/truststore', function(Application $app, Request $request) {
            $truststore/p12 = $request->get('truststore/p12');
            return new Response('How about implementing postTruststorePKCS12 as a POST method ?');
            });


$app->run();

=begin
Adobe Experience Manager (AEM) API

Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

The version of the OpenAPI document: 3.5.0-pre.0
Contact: opensource@shinesolutions.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end
Rails.application.routes.draw do

  def add_openapi_route http_method, path, opts = {}
    full_path = path.gsub(/{(.*?)}/, ':\1')
    match full_path, to: "#{opts.fetch(:controller_name)}##{opts[:action_name]}", via: http_method
  end

  add_openapi_route 'GET', '/system/console/status-productinfo.json', controller_name: 'console', action_name: 'get_aem_product_info'
  add_openapi_route 'GET', '/system/console/bundles/{name}.json', controller_name: 'console', action_name: 'get_bundle_info'
  add_openapi_route 'GET', '/system/console/configMgr', controller_name: 'console', action_name: 'get_config_mgr'
  add_openapi_route 'POST', '/system/console/bundles/{name}', controller_name: 'console', action_name: 'post_bundle'
  add_openapi_route 'POST', '/system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action}', controller_name: 'console', action_name: 'post_jmx_repository'
  add_openapi_route 'POST', '/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler', controller_name: 'console', action_name: 'post_saml_configuration'
  add_openapi_route 'GET', '/libs/granite/core/content/login.html', controller_name: 'cq', action_name: 'get_login_page'
  add_openapi_route 'POST', '/.cqactions.html', controller_name: 'cq', action_name: 'post_cq_actions'
  add_openapi_route 'GET', '/crx/server/crx.default/jcr:root/.1.json', controller_name: 'crx', action_name: 'get_crxde_status'
  add_openapi_route 'GET', '/crx/packmgr/installstatus.jsp', controller_name: 'crx', action_name: 'get_install_status'
  add_openapi_route 'GET', '/crx/packmgr/service/script.html', controller_name: 'crx', action_name: 'get_package_manager_servlet'
  add_openapi_route 'POST', '/crx/packmgr/service.jsp', controller_name: 'crx', action_name: 'post_package_service'
  add_openapi_route 'POST', '/crx/packmgr/service/.json/{path}', controller_name: 'crx', action_name: 'post_package_service_json'
  add_openapi_route 'POST', '/crx/packmgr/update.jsp', controller_name: 'crx', action_name: 'post_package_update'
  add_openapi_route 'POST', '/crx/explorer/ui/setpassword.jsp', controller_name: 'crx', action_name: 'post_set_password'
  add_openapi_route 'GET', '/system/health', controller_name: 'custom', action_name: 'get_aem_health_check'
  add_openapi_route 'POST', '/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck', controller_name: 'custom', action_name: 'post_config_aem_health_check_servlet'
  add_openapi_route 'POST', '/apps/system/config/com.shinesolutions.aem.passwordreset.Activator', controller_name: 'custom', action_name: 'post_config_aem_password_reset'
  add_openapi_route 'POST', '/libs/granite/security/post/sslSetup.html', controller_name: 'granite', action_name: 'ssl_setup'
  add_openapi_route 'DELETE', '/etc/replication/agents.{runmode}/{name}', controller_name: 'sling', action_name: 'delete_agent'
  add_openapi_route 'DELETE', '/{path}/{name}', controller_name: 'sling', action_name: 'delete_node'
  add_openapi_route 'GET', '/etc/replication/agents.{runmode}/{name}', controller_name: 'sling', action_name: 'get_agent'
  add_openapi_route 'GET', '/etc/replication/agents.{runmode}.-1.json', controller_name: 'sling', action_name: 'get_agents'
  add_openapi_route 'GET', '/{intermediatePath}/{authorizableId}.ks.json', controller_name: 'sling', action_name: 'get_authorizable_keystore'
  add_openapi_route 'GET', '/{intermediatePath}/{authorizableId}/keystore/store.p12', controller_name: 'sling', action_name: 'get_keystore'
  add_openapi_route 'GET', '/{path}/{name}', controller_name: 'sling', action_name: 'get_node'
  add_openapi_route 'GET', '/etc/packages/{group}/{name}-{version}.zip', controller_name: 'sling', action_name: 'get_package'
  add_openapi_route 'GET', '/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json', controller_name: 'sling', action_name: 'get_package_filter'
  add_openapi_route 'GET', '/bin/querybuilder.json', controller_name: 'sling', action_name: 'get_query'
  add_openapi_route 'GET', '/etc/truststore/truststore.p12', controller_name: 'sling', action_name: 'get_truststore'
  add_openapi_route 'GET', '/libs/granite/security/truststore.json', controller_name: 'sling', action_name: 'get_truststore_info'
  add_openapi_route 'POST', '/etc/replication/agents.{runmode}/{name}', controller_name: 'sling', action_name: 'post_agent'
  add_openapi_route 'POST', '/{intermediatePath}/{authorizableId}.ks.html', controller_name: 'sling', action_name: 'post_authorizable_keystore'
  add_openapi_route 'POST', '/libs/granite/security/post/authorizables', controller_name: 'sling', action_name: 'post_authorizables'
  add_openapi_route 'POST', '/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config', controller_name: 'sling', action_name: 'post_config_adobe_granite_saml_authentication_handler'
  add_openapi_route 'POST', '/apps/system/config/org.apache.felix.http', controller_name: 'sling', action_name: 'post_config_apache_felix_jetty_based_http_service'
  add_openapi_route 'POST', '/apps/system/config/org.apache.http.proxyconfigurator.config', controller_name: 'sling', action_name: 'post_config_apache_http_components_proxy_configuration'
  add_openapi_route 'POST', '/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet', controller_name: 'sling', action_name: 'post_config_apache_sling_dav_ex_servlet'
  add_openapi_route 'POST', '/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet', controller_name: 'sling', action_name: 'post_config_apache_sling_get_servlet'
  add_openapi_route 'POST', '/apps/system/config/org.apache.sling.security.impl.ReferrerFilter', controller_name: 'sling', action_name: 'post_config_apache_sling_referrer_filter'
  add_openapi_route 'POST', '/apps/system/config/{configNodeName}', controller_name: 'sling', action_name: 'post_config_property'
  add_openapi_route 'POST', '/{path}/{name}', controller_name: 'sling', action_name: 'post_node'
  add_openapi_route 'POST', '/{path}/{name}.rw.html', controller_name: 'sling', action_name: 'post_node_rw'
  add_openapi_route 'POST', '/{path}/', controller_name: 'sling', action_name: 'post_path'
  add_openapi_route 'POST', '/bin/querybuilder.json', controller_name: 'sling', action_name: 'post_query'
  add_openapi_route 'POST', '/etc/replication/treeactivation.html', controller_name: 'sling', action_name: 'post_tree_activation'
  add_openapi_route 'POST', '/libs/granite/security/post/truststore', controller_name: 'sling', action_name: 'post_truststore'
  add_openapi_route 'POST', '/etc/truststore', controller_name: 'sling', action_name: 'post_truststore_pkcs12'
end

require 'json'


MyApp.add_route('DELETE', '//etc/replication/agents.{runmode}/{name}', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "delete_agent", 
  "responseClass" => "void",
  "endpoint" => "/etc/replication/agents.{runmode}/{name}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "runmode",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "name",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '//{path}/{name}', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "delete_node", 
  "responseClass" => "void",
  "endpoint" => "/{path}/{name}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "path",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "name",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '//etc/replication/agents.{runmode}/{name}', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "get_agent", 
  "responseClass" => "void",
  "endpoint" => "/etc/replication/agents.{runmode}/{name}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "runmode",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "name",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '//etc/replication/agents.{runmode}.-1.json', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "get_agents", 
  "responseClass" => "String",
  "endpoint" => "/etc/replication/agents.{runmode}.-1.json", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "runmode",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '//{intermediatePath}/{authorizableId}.ks.json', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "get_authorizable_keystore", 
  "responseClass" => "KeystoreInfo",
  "endpoint" => "/{intermediatePath}/{authorizableId}.ks.json", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "intermediate_path",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "authorizable_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '//{intermediatePath}/{authorizableId}/keystore/store.p12', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "get_keystore", 
  "responseClass" => "File",
  "endpoint" => "/{intermediatePath}/{authorizableId}/keystore/store.p12", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "intermediate_path",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "authorizable_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '//{path}/{name}', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "get_node", 
  "responseClass" => "void",
  "endpoint" => "/{path}/{name}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "path",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "name",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '//etc/packages/{group}/{name}-{version}.zip', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "get_package", 
  "responseClass" => "File",
  "endpoint" => "/etc/packages/{group}/{name}-{version}.zip", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "group",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "name",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '//etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "get_package_filter", 
  "responseClass" => "String",
  "endpoint" => "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "group",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "name",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '//bin/querybuilder.json', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "get_query", 
  "responseClass" => "String",
  "endpoint" => "/bin/querybuilder.json", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "path",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "p_limit",
      "description" => "",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_1_property",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_1_property_value",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '//etc/truststore/truststore.p12', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "get_truststore", 
  "responseClass" => "File",
  "endpoint" => "/etc/truststore/truststore.p12", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '//libs/granite/security/truststore.json', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "get_truststore_info", 
  "responseClass" => "TruststoreInfo",
  "endpoint" => "/libs/granite/security/truststore.json", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//etc/replication/agents.{runmode}/{name}', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_agent", 
  "responseClass" => "void",
  "endpoint" => "/etc/replication/agents.{runmode}/{name}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "jcrcontentcqdistribute",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentcqdistribute_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentcqname",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentcqtemplate",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentenabled",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentjcrdescription",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentjcrlast_modified",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentjcrlast_modified_by",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentjcrmixin_types",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentjcrtitle",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentlog_level",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentno_status_update",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentno_versioning",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentprotocol_connect_timeout",
      "description" => "",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentprotocol_http_connection_closed",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentprotocol_http_expired",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentprotocol_http_headers",
      "description" => "",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentprotocol_http_headers_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentprotocol_http_method",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentprotocol_https_relaxed",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentprotocol_interface",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentprotocol_socket_timeout",
      "description" => "",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentprotocol_version",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentproxy_ntlm_domain",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentproxy_ntlm_host",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentproxy_host",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentproxy_password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentproxy_port",
      "description" => "",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentproxy_user",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentqueue_batch_max_size",
      "description" => "",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentqueue_batch_mode",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentqueue_batch_wait_time",
      "description" => "",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentretry_delay",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentreverse_replication",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentserialization_type",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentslingresource_type",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentssl",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontenttransport_ntlm_domain",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontenttransport_ntlm_host",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontenttransport_password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontenttransport_uri",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontenttransport_user",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontenttrigger_distribute",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontenttrigger_modified",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontenttrigger_on_off_time",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontenttrigger_receive",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontenttrigger_specific",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrcontentuser_id",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "jcrprimary_type",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "operation",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "runmode",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "name",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//{intermediatePath}/{authorizableId}.ks.html', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_authorizable_keystore", 
  "responseClass" => "KeystoreInfo",
  "endpoint" => "/{intermediatePath}/{authorizableId}.ks.html", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "operation",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "current_password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "new_password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "re_password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "key_password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "key_store_pass",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_alias",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "new_alias",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "remove_alias",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "intermediate_path",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "authorizable_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//libs/granite/security/post/authorizables', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_authorizables", 
  "responseClass" => "String",
  "endpoint" => "/libs/granite/security/post/authorizables", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "authorizable_id",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "intermediate_path",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "create_user",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "create_group",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "reppassword",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "profilegiven_name",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_config_adobe_granite_saml_authentication_handler", 
  "responseClass" => "void",
  "endpoint" => "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "key_store_password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "key_store_password_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "service_ranking",
      "description" => "",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "service_ranking_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "idp_http_redirect",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "idp_http_redirect_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "create_user",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "create_user_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "default_redirect_url",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "default_redirect_url_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "user_id_attribute",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "user_id_attribute_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "default_groups",
      "description" => "",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "default_groups_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "idp_cert_alias",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "idp_cert_alias_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "add_group_memberships",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "add_group_memberships_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "path",
      "description" => "",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "path_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "synchronize_attributes",
      "description" => "",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "synchronize_attributes_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "clock_tolerance",
      "description" => "",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "clock_tolerance_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "group_membership_attribute",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "group_membership_attribute_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "idp_url",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "idp_url_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "logout_url",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "logout_url_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "service_provider_entity_id",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "service_provider_entity_id_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assertion_consumer_service_url",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assertion_consumer_service_url_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "handle_logout",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "handle_logout_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sp_private_key_alias",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "sp_private_key_alias_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "use_encryption",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "use_encryption_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name_id_format",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name_id_format_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "digest_method",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "digest_method_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "signature_method",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "signature_method_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "user_intermediate_path",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "user_intermediate_path_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//apps/system/config/org.apache.felix.http', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_config_apache_felix_jetty_based_http_service", 
  "responseClass" => "void",
  "endpoint" => "/apps/system/config/org.apache.felix.http", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "org_apache_felix_https_nio",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_nio_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_keystore",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_keystore_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_keystore_password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_keystore_password_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_keystore_key",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_keystore_key_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_keystore_key_password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_keystore_key_password_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_truststore",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_truststore_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_truststore_password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_truststore_password_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_clientcertificate",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_clientcertificate_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_enable",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_apache_felix_https_enable_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_osgi_service_http_port_secure",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "org_osgi_service_http_port_secure_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//apps/system/config/org.apache.http.proxyconfigurator.config', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_config_apache_http_components_proxy_configuration", 
  "responseClass" => "void",
  "endpoint" => "/apps/system/config/org.apache.http.proxyconfigurator.config", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "proxy_host",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "proxy_host_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "proxy_port",
      "description" => "",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "proxy_port_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "proxy_exceptions",
      "description" => "",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "proxy_exceptions_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "proxy_enabled",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "proxy_enabled_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "proxy_user",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "proxy_user_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "proxy_password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "proxy_password_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_config_apache_sling_dav_ex_servlet", 
  "responseClass" => "void",
  "endpoint" => "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "_alias",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "alias_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "dav_create_absolute_uri",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "dav_create_absolute_uri_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_config_apache_sling_get_servlet", 
  "responseClass" => "void",
  "endpoint" => "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "json_maximumresults",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "json_maximumresults_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_html",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_html_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_txt",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_txt_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_xml",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "enable_xml_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//apps/system/config/org.apache.sling.security.impl.ReferrerFilter', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_config_apache_sling_referrer_filter", 
  "responseClass" => "void",
  "endpoint" => "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "allow_empty",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "allow_empty_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "allow_hosts",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "allow_hosts_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "allow_hosts_regexp",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "allow_hosts_regexp_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_methods",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "filter_methods_type_hint",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//{path}/{name}', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_node", 
  "responseClass" => "void",
  "endpoint" => "/{path}/{name}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "operation",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "delete_authorizable",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "path",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "name",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//{path}/{name}.rw.html', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_node_rw", 
  "responseClass" => "void",
  "endpoint" => "/{path}/{name}.rw.html", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "add_members",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "path",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "name",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//{path}/', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_path", 
  "responseClass" => "void",
  "endpoint" => "/{path}/", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "jcrprimary_type",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "path",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//bin/querybuilder.json', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_query", 
  "responseClass" => "String",
  "endpoint" => "/bin/querybuilder.json", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "path",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "p_limit",
      "description" => "",
      "dataType" => "Float",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_1_property",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_1_property_value",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//etc/replication/treeactivation.html', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_tree_activation", 
  "responseClass" => "void",
  "endpoint" => "/etc/replication/treeactivation.html", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "ignoredeactivated",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "onlymodified",
      "description" => "",
      "dataType" => "boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "path",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//libs/granite/security/post/truststore', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_truststore", 
  "responseClass" => "String",
  "endpoint" => "/libs/granite/security/post/truststore", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "operation",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "new_password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "re_password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "key_store_type",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "remove_alias",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '//etc/truststore', {
  "resourcePath" => "/Sling",
  "summary" => "",
  "nickname" => "post_truststore_pkcs12", 
  "responseClass" => "String",
  "endpoint" => "/etc/truststore", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


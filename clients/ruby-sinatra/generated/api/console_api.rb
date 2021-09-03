require 'json'


MyApp.add_route('GET', '/system/console/status-productinfo.json', {
  "resourcePath" => "/Console",
  "summary" => "",
  "nickname" => "get_aem_product_info", 
  "responseClass" => "Array<String>",
  "endpoint" => "/system/console/status-productinfo.json", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/system/console/bundles/{name}.json', {
  "resourcePath" => "/Console",
  "summary" => "",
  "nickname" => "get_bundle_info", 
  "responseClass" => "BundleInfo",
  "endpoint" => "/system/console/bundles/{name}.json", 
  "notes" => "",
  "parameters" => [
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


MyApp.add_route('GET', '/system/console/configMgr', {
  "resourcePath" => "/Console",
  "summary" => "",
  "nickname" => "get_config_mgr", 
  "responseClass" => "String",
  "endpoint" => "/system/console/configMgr", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/system/console/bundles/{name}', {
  "resourcePath" => "/Console",
  "summary" => "",
  "nickname" => "post_bundle", 
  "responseClass" => "void",
  "endpoint" => "/system/console/bundles/{name}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "action",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
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


MyApp.add_route('POST', '/system/console/jmx/com.adobe.granite:type=Repository/op/{action}', {
  "resourcePath" => "/Console",
  "summary" => "",
  "nickname" => "post_jmx_repository", 
  "responseClass" => "void",
  "endpoint" => "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "action",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler', {
  "resourcePath" => "/Console",
  "summary" => "",
  "nickname" => "post_saml_configuration", 
  "responseClass" => "SamlConfigurationInfo",
  "endpoint" => "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "post",
      "description" => "",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "apply",
      "description" => "",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "delete",
      "description" => "",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "action",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "location",
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
      "name" => "service_ranking",
      "description" => "",
      "dataType" => "Integer",
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
      "name" => "idp_cert_alias",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "idp_http_redirect",
      "description" => "",
      "dataType" => "Boolean",
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
      "name" => "assertion_consumer_service_url",
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
      "name" => "key_store_password",
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
      "name" => "user_id_attribute",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "use_encryption",
      "description" => "",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "create_user",
      "description" => "",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "add_group_memberships",
      "description" => "",
      "dataType" => "Boolean",
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
      "name" => "default_groups",
      "description" => "",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
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
      "name" => "synchronize_attributes",
      "description" => "",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "handle_logout",
      "description" => "",
      "dataType" => "Boolean",
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
      "name" => "clock_tolerance",
      "description" => "",
      "dataType" => "Integer",
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
      "name" => "signature_method",
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
      "name" => "propertylist",
      "description" => "",
      "dataType" => "Array<String>",
      "collectionFormat" => "csv",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


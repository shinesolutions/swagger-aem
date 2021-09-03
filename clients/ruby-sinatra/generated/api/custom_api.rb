require 'json'


MyApp.add_route('GET', '/system/health', {
  "resourcePath" => "/Custom",
  "summary" => "",
  "nickname" => "get_aem_health_check", 
  "responseClass" => "String",
  "endpoint" => "/system/health", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "tags",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "combine_tags_or",
      "description" => "",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck', {
  "resourcePath" => "/Custom",
  "summary" => "",
  "nickname" => "post_config_aem_health_check_servlet", 
  "responseClass" => "void",
  "endpoint" => "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "bundles_ignored",
      "description" => "",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "bundles_ignored_type_hint",
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


MyApp.add_route('POST', '/apps/system/config/com.shinesolutions.aem.passwordreset.Activator', {
  "resourcePath" => "/Custom",
  "summary" => "",
  "nickname" => "post_config_aem_password_reset", 
  "responseClass" => "void",
  "endpoint" => "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "pwdreset_authorizables",
      "description" => "",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "pwdreset_authorizables_type_hint",
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


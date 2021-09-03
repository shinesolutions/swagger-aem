require 'json'


MyApp.add_route('GET', '/crx/server/crx.default/jcr:root/.1.json', {
  "resourcePath" => "/Crx",
  "summary" => "",
  "nickname" => "get_crxde_status", 
  "responseClass" => "String",
  "endpoint" => "/crx/server/crx.default/jcr:root/.1.json", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/crx/packmgr/installstatus.jsp', {
  "resourcePath" => "/Crx",
  "summary" => "",
  "nickname" => "get_install_status", 
  "responseClass" => "InstallStatus",
  "endpoint" => "/crx/packmgr/installstatus.jsp", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/crx/packmgr/service/script.html', {
  "resourcePath" => "/Crx",
  "summary" => "",
  "nickname" => "get_package_manager_servlet", 
  "responseClass" => "void",
  "endpoint" => "/crx/packmgr/service/script.html", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/crx/packmgr/service.jsp', {
  "resourcePath" => "/Crx",
  "summary" => "",
  "nickname" => "post_package_service", 
  "responseClass" => "String",
  "endpoint" => "/crx/packmgr/service.jsp", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "cmd",
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


MyApp.add_route('POST', '/crx/packmgr/service/.json/{path}', {
  "resourcePath" => "/Crx",
  "summary" => "",
  "nickname" => "post_package_service_json", 
  "responseClass" => "String",
  "endpoint" => "/crx/packmgr/service/.json/{path}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "cmd",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "group_name",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "package_name",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "package_version",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_charset_",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "force",
      "description" => "",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "recursive",
      "description" => "",
      "dataType" => "Boolean",
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


MyApp.add_route('POST', '/crx/packmgr/update.jsp', {
  "resourcePath" => "/Crx",
  "summary" => "",
  "nickname" => "post_package_update", 
  "responseClass" => "String",
  "endpoint" => "/crx/packmgr/update.jsp", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "group_name",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "package_name",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "version",
      "description" => "",
      "dataType" => "String",
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
    {
      "name" => "filter",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "_charset_",
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


MyApp.add_route('POST', '/crx/explorer/ui/setpassword.jsp', {
  "resourcePath" => "/Crx",
  "summary" => "",
  "nickname" => "post_set_password", 
  "responseClass" => "String",
  "endpoint" => "/crx/explorer/ui/setpassword.jsp", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "old",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "plain",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "verify",
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


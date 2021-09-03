require 'json'


MyApp.add_route('POST', '/libs/granite/security/post/sslSetup.html', {
  "resourcePath" => "/Granite",
  "summary" => "",
  "nickname" => "ssl_setup", 
  "responseClass" => "String",
  "endpoint" => "/libs/granite/security/post/sslSetup.html", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "keystore_password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "keystore_password_confirm",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "truststore_password",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "truststore_password_confirm",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "https_hostname",
      "description" => "",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "https_port",
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


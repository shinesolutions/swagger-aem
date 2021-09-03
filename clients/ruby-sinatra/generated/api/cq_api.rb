require 'json'


MyApp.add_route('GET', '/libs/granite/core/content/login.html', {
  "resourcePath" => "/Cq",
  "summary" => "",
  "nickname" => "get_login_page", 
  "responseClass" => "String",
  "endpoint" => "/libs/granite/core/content/login.html", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/.cqactions.html', {
  "resourcePath" => "/Cq",
  "summary" => "",
  "nickname" => "post_cq_actions", 
  "responseClass" => "void",
  "endpoint" => "/.cqactions.html", 
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
      "name" => "changelog",
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


package = "openapi-client"
version = "1.0.0-1"
source = {
	url = "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
}

description = {
	summary = "API client genreated by OpenAPI Generator",
	detailed = [[
Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API]],
	homepage = "https://openapi-generator.tech",
	license = "Unlicense",
	maintainer = "OpenAPI Generator contributors",
}

dependencies = {
	"lua >= 5.2",
	"http",
	"dkjson",
	"basexx"
}

build = {
	type = "builtin",
	modules = {
		["openapi-client.api.console_api"] = "openapi-client/api/console_api.lua";
		["openapi-client.api.cq_api"] = "openapi-client/api/cq_api.lua";
		["openapi-client.api.crx_api"] = "openapi-client/api/crx_api.lua";
		["openapi-client.api.custom_api"] = "openapi-client/api/custom_api.lua";
		["openapi-client.api.sling_api"] = "openapi-client/api/sling_api.lua";
		["openapi-client.model.install_status"] = "openapi-client/model/install_status.lua";
		["openapi-client.model.install_status_status"] = "openapi-client/model/install_status_status.lua";
		["openapi-client.model.keystore_chain_items"] = "openapi-client/model/keystore_chain_items.lua";
		["openapi-client.model.keystore_info"] = "openapi-client/model/keystore_info.lua";
		["openapi-client.model.keystore_items"] = "openapi-client/model/keystore_items.lua";
		["openapi-client.model.saml_configuration_info"] = "openapi-client/model/saml_configuration_info.lua";
		["openapi-client.model.saml_configuration_properties"] = "openapi-client/model/saml_configuration_properties.lua";
		["openapi-client.model.saml_configuration_property_items_array"] = "openapi-client/model/saml_configuration_property_items_array.lua";
		["openapi-client.model.saml_configuration_property_items_boolean"] = "openapi-client/model/saml_configuration_property_items_boolean.lua";
		["openapi-client.model.saml_configuration_property_items_long"] = "openapi-client/model/saml_configuration_property_items_long.lua";
		["openapi-client.model.saml_configuration_property_items_string"] = "openapi-client/model/saml_configuration_property_items_string.lua";
		["openapi-client.model.truststore_info"] = "openapi-client/model/truststore_info.lua";
		["openapi-client.model.truststore_items"] = "openapi-client/model/truststore_items.lua";
	}
}

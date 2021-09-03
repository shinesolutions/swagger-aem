package = "openapiclient"
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
		["openapiclient.api.console_api"] = "openapiclient/api/console_api.lua";
		["openapiclient.api.cq_api"] = "openapiclient/api/cq_api.lua";
		["openapiclient.api.crx_api"] = "openapiclient/api/crx_api.lua";
		["openapiclient.api.custom_api"] = "openapiclient/api/custom_api.lua";
		["openapiclient.api.granite_api"] = "openapiclient/api/granite_api.lua";
		["openapiclient.api.sling_api"] = "openapiclient/api/sling_api.lua";
		["openapiclient.model.bundle_data"] = "openapiclient/model/bundle_data.lua";
		["openapiclient.model.bundle_data_prop"] = "openapiclient/model/bundle_data_prop.lua";
		["openapiclient.model.bundle_info"] = "openapiclient/model/bundle_info.lua";
		["openapiclient.model.install_status"] = "openapiclient/model/install_status.lua";
		["openapiclient.model.install_status_status"] = "openapiclient/model/install_status_status.lua";
		["openapiclient.model.keystore_chain_items"] = "openapiclient/model/keystore_chain_items.lua";
		["openapiclient.model.keystore_info"] = "openapiclient/model/keystore_info.lua";
		["openapiclient.model.keystore_items"] = "openapiclient/model/keystore_items.lua";
		["openapiclient.model.saml_configuration_info"] = "openapiclient/model/saml_configuration_info.lua";
		["openapiclient.model.saml_configuration_properties"] = "openapiclient/model/saml_configuration_properties.lua";
		["openapiclient.model.saml_configuration_property_items_array"] = "openapiclient/model/saml_configuration_property_items_array.lua";
		["openapiclient.model.saml_configuration_property_items_boolean"] = "openapiclient/model/saml_configuration_property_items_boolean.lua";
		["openapiclient.model.saml_configuration_property_items_long"] = "openapiclient/model/saml_configuration_property_items_long.lua";
		["openapiclient.model.saml_configuration_property_items_string"] = "openapiclient/model/saml_configuration_property_items_string.lua";
		["openapiclient.model.truststore_info"] = "openapiclient/model/truststore_info.lua";
		["openapiclient.model.truststore_items"] = "openapiclient/model/truststore_items.lua";
	}
}

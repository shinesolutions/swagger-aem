--[[
  Adobe Experience Manager (AEM) API
 
  Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 
  OpenAPI spec version: 3.2.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- saml_configuration_property_items_array class
local saml_configuration_property_items_array = {}
local saml_configuration_property_items_array_mt = {
	__name = "saml_configuration_property_items_array";
	__index = saml_configuration_property_items_array;
}

local function cast_saml_configuration_property_items_array(t)
	return setmetatable(t, saml_configuration_property_items_array_mt)
end

local function new_saml_configuration_property_items_array(name, optional, is_set, type, values, description)
	return cast_saml_configuration_property_items_array({
		["name"] = name;
		["optional"] = optional;
		["is_set"] = is_set;
		["type"] = type;
		["values"] = values;
		["description"] = description;
	})
end

return {
	cast = cast_saml_configuration_property_items_array;
	new = new_saml_configuration_property_items_array;
}
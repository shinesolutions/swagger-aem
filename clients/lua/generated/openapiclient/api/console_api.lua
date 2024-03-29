--[[
  Adobe Experience Manager (AEM) API
 
  Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 
  The version of the OpenAPI document: 3.5.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

--package openapiclient

local http_request = require "http.request"
local http_util = require "http.util"
local dkjson = require "dkjson"
local basexx = require "basexx"

-- model import
local openapiclient_bundle_info = require "openapiclient.model.bundle_info"
local openapiclient_saml_configuration_info = require "openapiclient.model.saml_configuration_info"

local console_api = {}
local console_api_mt = {
	__name = "console_api";
	__index = console_api;
}

local function new_console_api(authority, basePath, schemes)
	local schemes_map = {}
	for _,v in ipairs(schemes) do
		schemes_map[v] = v
	end
	local default_scheme = schemes_map.https or schemes_map.http
	local host, port = http_util.split_authority(authority, default_scheme)
	return setmetatable({
		host = host;
		port = port;
		basePath = basePath or "http://localhost";
		schemes = schemes_map;
		default_scheme = default_scheme;
		http_username = nil;
		http_password = nil;
		api_key = {};
		access_token = nil;
	}, console_api_mt)
end

function console_api:get_aem_product_info()
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/system/console/status-productinfo.json",
			self.basePath);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	-- HTTP basic auth
	req.readers:upsert("authorization", "Basic " .. basexx.to_base64(self.http_username .. " " .. self.http_password))

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return result, headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function console_api:get_bundle_info(name)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/system/console/bundles/{name}.json",
			self.basePath, name);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	-- HTTP basic auth
	req.readers:upsert("authorization", "Basic " .. basexx.to_base64(self.http_username .. " " .. self.http_password))

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return openapiclient_bundle_info.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function console_api:get_config_mgr()
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/system/console/configMgr",
			self.basePath);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "text/xml" }
	req.headers:upsert("content-type", "text/xml")

	-- HTTP basic auth
	req.readers:upsert("authorization", "Basic " .. basexx.to_base64(self.http_username .. " " .. self.http_password))

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return result, headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function console_api:post_bundle(name, action)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/system/console/bundles/%s?action=%s",
			self.basePath, name, http_util.encodeURIComponent(action));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "POST")
	-- HTTP basic auth
	req.readers:upsert("authorization", "Basic " .. basexx.to_base64(self.http_username .. " " .. self.http_password))

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		return nil, headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function console_api:post_jmx_repository(action)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/system/console/jmx/com.adobe.granite:type=Repository/op/%s",
			self.basePath, action);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "POST")
	-- HTTP basic auth
	req.readers:upsert("authorization", "Basic " .. basexx.to_base64(self.http_username .. " " .. self.http_password))

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		return nil, headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function console_api:post_saml_configuration(post, apply, delete, action, location, path, service_ranking, idp_url, idp_cert_alias, idp_http_redirect, service_provider_entity_id, assertion_consumer_service_url, sp_private_key_alias, key_store_password, default_redirect_url, user_id_attribute, use_encryption, create_user, add_group_memberships, group_membership_attribute, default_groups, name_id_format, synchronize_attributes, handle_logout, logout_url, clock_tolerance, digest_method, signature_method, user_intermediate_path, propertylist)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler?post=%s&apply=%s&delete=%s&action=%s&$location=%s&path=%s&service.ranking=%s&idpUrl=%s&idpCertAlias=%s&idpHttpRedirect=%s&serviceProviderEntityId=%s&assertionConsumerServiceURL=%s&spPrivateKeyAlias=%s&keyStorePassword=%s&defaultRedirectUrl=%s&userIDAttribute=%s&useEncryption=%s&createUser=%s&addGroupMemberships=%s&groupMembershipAttribute=%s&defaultGroups=%s&nameIdFormat=%s&synchronizeAttributes=%s&handleLogout=%s&logoutUrl=%s&clockTolerance=%s&digestMethod=%s&signatureMethod=%s&userIntermediatePath=%s&propertylist=%s",
			self.basePath, http_util.encodeURIComponent(post), http_util.encodeURIComponent(apply), http_util.encodeURIComponent(delete), http_util.encodeURIComponent(action), http_util.encodeURIComponent(location), http_util.encodeURIComponent(path), http_util.encodeURIComponent(service_ranking), http_util.encodeURIComponent(idp_url), http_util.encodeURIComponent(idp_cert_alias), http_util.encodeURIComponent(idp_http_redirect), http_util.encodeURIComponent(service_provider_entity_id), http_util.encodeURIComponent(assertion_consumer_service_url), http_util.encodeURIComponent(sp_private_key_alias), http_util.encodeURIComponent(key_store_password), http_util.encodeURIComponent(default_redirect_url), http_util.encodeURIComponent(user_id_attribute), http_util.encodeURIComponent(use_encryption), http_util.encodeURIComponent(create_user), http_util.encodeURIComponent(add_group_memberships), http_util.encodeURIComponent(group_membership_attribute), http_util.encodeURIComponent(default_groups), http_util.encodeURIComponent(name_id_format), http_util.encodeURIComponent(synchronize_attributes), http_util.encodeURIComponent(handle_logout), http_util.encodeURIComponent(logout_url), http_util.encodeURIComponent(clock_tolerance), http_util.encodeURIComponent(digest_method), http_util.encodeURIComponent(signature_method), http_util.encodeURIComponent(user_intermediate_path), http_util.encodeURIComponent(propertylist));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "POST")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "text/plain" }
	req.headers:upsert("content-type", "text/plain")

	-- HTTP basic auth
	req.readers:upsert("authorization", "Basic " .. basexx.to_base64(self.http_username .. " " .. self.http_password))

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return openapiclient_saml_configuration_info.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

return {
	new = new_console_api;
}

=begin
#Adobe Experience Manager (AEM) API

#Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

The version of the OpenAPI document: 3.7.1-pre.0
Contact: opensource@shinesolutions.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.3.1

=end

require 'cgi'

module SwaggerAemClient
  class CustomApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # @param [Hash] opts the optional parameters
    # @option opts [String] :tags 
    # @option opts [Boolean] :combine_tags_or 
    # @return [String]
    def get_aem_health_check(opts = {})
      data, _status_code, _headers = get_aem_health_check_with_http_info(opts)
      data
    end

    # @param [Hash] opts the optional parameters
    # @option opts [String] :tags 
    # @option opts [Boolean] :combine_tags_or 
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def get_aem_health_check_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomApi.get_aem_health_check ...'
      end
      # resource path
      local_var_path = '/system/health'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'tags'] = opts[:'tags'] if !opts[:'tags'].nil?
      query_params[:'combineTagsOr'] = opts[:'combine_tags_or'] if !opts[:'combine_tags_or'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] || 'String' 

      # auth_names
      auth_names = opts[:auth_names] || ['aemAuth']

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomApi#get_aem_health_check\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :bundles_ignored 
    # @option opts [String] :bundles_ignored_type_hint 
    # @return [nil]
    def post_config_aem_health_check_servlet(opts = {})
      post_config_aem_health_check_servlet_with_http_info(opts)
      nil
    end

    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :bundles_ignored 
    # @option opts [String] :bundles_ignored_type_hint 
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def post_config_aem_health_check_servlet_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomApi.post_config_aem_health_check_servlet ...'
      end
      # resource path
      local_var_path = '/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'bundles.ignored'] = @api_client.build_collection_param(opts[:'bundles_ignored'], :multi) if !opts[:'bundles_ignored'].nil?
      query_params[:'bundles.ignored@TypeHint'] = opts[:'bundles_ignored_type_hint'] if !opts[:'bundles_ignored_type_hint'].nil?

      # header parameters
      header_params = opts[:header_params] || {}

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] 

      # auth_names
      auth_names = opts[:auth_names] || ['aemAuth']

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomApi#post_config_aem_health_check_servlet\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :pwdreset_authorizables 
    # @option opts [String] :pwdreset_authorizables_type_hint 
    # @return [nil]
    def post_config_aem_password_reset(opts = {})
      post_config_aem_password_reset_with_http_info(opts)
      nil
    end

    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :pwdreset_authorizables 
    # @option opts [String] :pwdreset_authorizables_type_hint 
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def post_config_aem_password_reset_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomApi.post_config_aem_password_reset ...'
      end
      # resource path
      local_var_path = '/apps/system/config/com.shinesolutions.aem.passwordreset.Activator'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'pwdreset.authorizables'] = @api_client.build_collection_param(opts[:'pwdreset_authorizables'], :multi) if !opts[:'pwdreset_authorizables'].nil?
      query_params[:'pwdreset.authorizables@TypeHint'] = opts[:'pwdreset_authorizables_type_hint'] if !opts[:'pwdreset_authorizables_type_hint'].nil?

      # header parameters
      header_params = opts[:header_params] || {}

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] 

      # auth_names
      auth_names = opts[:auth_names] || ['aemAuth']

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomApi#post_config_aem_password_reset\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end

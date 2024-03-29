=begin
#Adobe Experience Manager (AEM) API

#Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

The version of the OpenAPI document: 3.5.0-pre.0
Contact: opensource@shinesolutions.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerAemClient::ConsoleApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'ConsoleApi' do
  before do
    # run before each test
    @api_instance = SwaggerAemClient::ConsoleApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ConsoleApi' do
    it 'should create an instance of ConsoleApi' do
      expect(@api_instance).to be_instance_of(SwaggerAemClient::ConsoleApi)
    end
  end

  # unit tests for get_aem_product_info
  # @param [Hash] opts the optional parameters
  # @return [Array<String>]
  describe 'get_aem_product_info test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_bundle_info
  # @param name 
  # @param [Hash] opts the optional parameters
  # @return [BundleInfo]
  describe 'get_bundle_info test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_config_mgr
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'get_config_mgr test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_bundle
  # @param name 
  # @param action 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'post_bundle test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_jmx_repository
  # @param action 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'post_jmx_repository test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_saml_configuration
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :post 
  # @option opts [Boolean] :apply 
  # @option opts [Boolean] :delete 
  # @option opts [String] :action 
  # @option opts [String] :location 
  # @option opts [Array<String>] :path 
  # @option opts [Integer] :service_ranking 
  # @option opts [String] :idp_url 
  # @option opts [String] :idp_cert_alias 
  # @option opts [Boolean] :idp_http_redirect 
  # @option opts [String] :service_provider_entity_id 
  # @option opts [String] :assertion_consumer_service_url 
  # @option opts [String] :sp_private_key_alias 
  # @option opts [String] :key_store_password 
  # @option opts [String] :default_redirect_url 
  # @option opts [String] :user_id_attribute 
  # @option opts [Boolean] :use_encryption 
  # @option opts [Boolean] :create_user 
  # @option opts [Boolean] :add_group_memberships 
  # @option opts [String] :group_membership_attribute 
  # @option opts [Array<String>] :default_groups 
  # @option opts [String] :name_id_format 
  # @option opts [Array<String>] :synchronize_attributes 
  # @option opts [Boolean] :handle_logout 
  # @option opts [String] :logout_url 
  # @option opts [Integer] :clock_tolerance 
  # @option opts [String] :digest_method 
  # @option opts [String] :signature_method 
  # @option opts [String] :user_intermediate_path 
  # @option opts [Array<String>] :propertylist 
  # @return [SamlConfigurationInfo]
  describe 'post_saml_configuration test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end

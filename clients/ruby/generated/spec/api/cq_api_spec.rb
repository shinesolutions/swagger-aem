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

# Unit tests for SwaggerAemClient::CqApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'CqApi' do
  before do
    # run before each test
    @api_instance = SwaggerAemClient::CqApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CqApi' do
    it 'should create an instance of CqApi' do
      expect(@api_instance).to be_instance_of(SwaggerAemClient::CqApi)
    end
  end

  # unit tests for get_login_page
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'get_login_page test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_cq_actions
  # @param authorizable_id 
  # @param changelog 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'post_cq_actions test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end

=begin
#Adobe Experience Manager (AEM) API

#An Adobe Experience Manager (AEM) API specification

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerAemClient::ConsoleApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ConsoleApi' do
  before do
    # run before each test
    @instance = SwaggerAemClient::ConsoleApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ConsoleApi' do
    it 'should create an instact of ConsoleApi' do
      expect(@instance).to be_instance_of(SwaggerAemClient::ConsoleApi)
    end
  end

  # unit tests for post_bundle
  # 
  # 
  # @param name 
  # @param action 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'post_bundle test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_jmx_repository
  # 
  # 
  # @param action 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'post_jmx_repository test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
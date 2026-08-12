# Load the gem
require 'swagger_aem'

# Setup authorization
SwaggerAemClient.configure do |config|
  config.host = 'localhost:4502'
  config.username = 'admin'
  config.password = 'admin'
end

api_instance = SwaggerAemClient::CustomApi.new

begin
  # Get AEM health check
  result = api_instance.get_aem_health_check
  p result
rescue SwaggerAemClient::ApiError => e
  puts "Exception when calling CustomApi->get_aem_health_check: #{e}"
  raise
end

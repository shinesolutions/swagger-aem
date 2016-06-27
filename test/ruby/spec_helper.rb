$: << File.expand_path('../../../generated/ruby/lib', __FILE__)
require 'json'
require 'swagger_aem'

def init_client
  SwaggerAemClient.configure { |conf| [
    conf.host = 'http://localhost:4502',
    conf.username = 'admin',
    conf.password = 'admin',
    conf.debugging = false
  ]}
end

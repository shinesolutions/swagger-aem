$: << File.expand_path('../../../generated/ruby/lib', __FILE__)
require 'swagger_client'

def conf_client
  SwaggerClient.configure { |conf| [
    conf.host = 'http://localhost:4502',
    conf.username = 'admin',
    conf.password = 'admin',
    conf.debugging = false
  ]}
end

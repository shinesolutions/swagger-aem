require './lib/openapiing'

# only need to extend if you want special configuration!
class MyApp < OpenAPIing
  self.configure do |config|
    config.api_version = '3.2.0-pre.0' 
  end
end

# include the api files
Dir["./api/*.rb"].each { |file|
  require file
}

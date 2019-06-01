$: << File.expand_path('../../../ruby/generated/lib', __FILE__)
require 'swagger_aem'
require 'json'

def init_client
  SwaggerAemClient.configure { |conf| [

    protocol = ENV['aem_protocol'] || 'http',
    host = ENV['aem_host'] || 'localhost',
    port = ENV['aem_port'] ? ENV['aem_port'].to_i : 4502,

    conf.host = '%s://%s:%d' % [protocol, host, port],
    conf.username = ENV['aem_username'] || 'admin',
    conf.password =  ENV['aem_password'] || 'admin',
    conf.debugging = ENV['aem_debug'] ? ENV['aem_debug'] == 'true' : false,
    conf.params_encoding = :multi
  ]}
end

def find_authorizable_id(sling, path, name)
  begin
    data, status_code, headers = sling.get_query_with_http_info(
      path = path,
      p_limit = -1,
      _1_property = 'rep:authorizableId',
      _1_property_value = name
    )
    expect(status_code).to eq(200)

    data = JSON.parse(data)
    if data['success'] == true && data['hits'].length == 1
      authorizable_id = data['hits'][0]['name']
      return authorizable_id
    end
  rescue SwaggerAemClient::ApiError => err
    # ignore when authorizable does not exist
    expect(err.code).to eq(404)
  end
end

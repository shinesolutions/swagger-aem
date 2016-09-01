$: << File.expand_path('../../../ruby/generated/lib', __FILE__)
require 'json'
require 'swagger_aem'
require 'tmpdir'

def init_client
  SwaggerAemClient.configure { |conf| [
    conf.host = 'http://localhost:4502',
    conf.username = 'admin',
    conf.password = 'admin',
    conf.debugging = false,
    conf.params_encoding = :multi
  ]}
end

def find_authorizable_id(sling, path, name)
  begin
    data, status_code, headers = sling.post_query_with_http_info(
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

require_relative 'spec_helper'

describe 'Client' do
  before do
    SwaggerAemClient.configure { |conf| [
      protocol = ENV['aem_protocol'] || 'http',
      host = ENV['aem_host'] || 'localhost',
      port = ENV['aem_port'] ? ENV['aem_port'].to_i : 4502,

      conf.host = '%s://%s:%d' % [protocol, host, port],
      conf.username = 'someinexistingusername',
      conf.password = 'someinexistingpassword',
      conf.debugging = ENV['aem_debug'] ? ENV['aem_debug'] == 'true' : false,
      conf.params_encoding = :multi
    ]}
    @sling = SwaggerAemClient::SlingApi.new
  end

  after do
  end

  describe 'test api call' do

    it 'should error when credential is incorrect' do
      begin
        data, status_code, headers = @sling.post_tree_activation_with_http_info(
          ignoredeactivated = true,
          onlymodified = false,
          path = '/etc/designs/geometrixx'
        )
        fail
      rescue SwaggerAemClient::ApiError => err
        expect(err.code).to eq(401)
      end
    end

  end

end

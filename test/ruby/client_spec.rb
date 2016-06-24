require_relative 'spec_helper'

describe 'Client' do
  before do
    SwaggerClient.configure { |conf| [
      conf.host = 'http://localhost:4502',
      conf.username = 'someinexistingusername',
      conf.password = 'someinexistingpassword',
      conf.debugging = false
    ]}
    @sling = SwaggerClient::SlingApi.new
  end

  after do
  end

  describe 'test api call' do

    it 'should error when credential is incorrect' do
      begin
        data, status_code, headers = @sling.etc_replication_treeactivation_html_post_with_http_info(
          ignoredeactivated = true,
          onlymodified = false,
          path = '/etc/designs/geometrixx'
        )
        expect(status_code).to eq(200)
      rescue SwaggerClient::ApiError => err
        expect(err.code).to eq(401)
      end
    end

  end

end

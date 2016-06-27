require_relative 'spec_helper'

describe 'Node' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new
  end

  after do
  end

  describe 'test node create' do

    it 'should succeed when node does not exist' do
      data, status_code, headers = @sling.path_post_with_http_info(
        path = 'apps/system',
        jcrprimary_type = 'sling:Folder',
        name = 'somefolder'
      )
      expect([200, 201]).to include(status_code)
    end

    it 'should error when node already exists' do
      begin
        data, status_code, headers = @sling.path_post_with_http_info(
          path = 'apps/system',
          jcrprimary_type = 'sling:Folder',
          name = 'somefolder'
        )
      rescue SwaggerAemClient::ApiError => err
        expect(err.code).to eq(500)
      end
    end

  end
end

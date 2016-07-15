require_relative 'spec_helper'

describe 'Node' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new

    # ensure node doesn't exist prior to testing
    begin
      data, status_code, headers = @sling.delete_node_with_http_info(
        path = 'apps/system',
        name = 'somefolder'
      )
      # delete node when it exists
      expect(status_code).to eq(204)
    rescue SwaggerAemClient::ApiError => err
      # ignore when node does not exist
      expect(err.code).to eq(404)
    end
  end

  after do
  end

  describe 'test node create' do

    it 'should succeed when node does not exist' do
      data, status_code, headers = @sling.post_path_with_http_info(
        path = 'apps/system',
        jcrprimary_type = 'sling:Folder',
        name = 'somefolder'
      )
      expect([200, 201]).to include(status_code)
    end

    it 'should error when node already exists' do

      # create node
      data, status_code, headers = @sling.post_path_with_http_info(
        path = 'apps/system',
        jcrprimary_type = 'sling:Folder',
        name = 'somefolder'
      )
      expect([200, 201]).to include(status_code)

      # create the same node the second time
      begin
        data, status_code, headers = @sling.post_path_with_http_info(
          path = 'apps/system',
          jcrprimary_type = 'sling:Folder',
          name = 'somefolder'
        )
        fail
      rescue SwaggerAemClient::ApiError => err
        expect(err.code).to eq(500)
      end
    end

    it 'should succeed existence check when node already exists' do
      # node does not exist
      begin
        data, status_code, headers = @sling.get_node_with_http_info(
          path = 'apps/system',
          name = 'somefolder'
        )
        fail
      rescue SwaggerAemClient::ApiError => err
        expect(err.code).to eq(404)
      end

      # create node
      data, status_code, headers = @sling.post_path_with_http_info(
        path = 'apps/system',
        jcrprimary_type = 'sling:Folder',
        name = 'somefolder'
      )
      expect([200, 201]).to include(status_code)

      # node should exist
      # Swagger client automatically considers non-200 as an error
      begin
        data, status_code, headers = @sling.get_node_with_http_info(
          path = 'apps/system',
          name = 'somefolder'
        )
        fail
      rescue SwaggerAemClient::ApiError => err
        expect(err.code).to eq(302)
      end
    end

    describe 'test node delete' do

      it 'should succeed when node exists' do

        # ensure node exists prior to deletion
        data, status_code, headers = @sling.post_path_with_http_info(
          path = 'apps/system',
          jcrprimary_type = 'sling:Folder',
          name = 'somefolder'
        )
        expect([200, 201]).to include(status_code)

        data, status_code, headers = @sling.delete_node_with_http_info(
          path = 'apps/system',
          name = 'somefolder'
        )
        expect(status_code).to eq(204)
      end

    end

    describe 'test node exists' do

      it 'should succeed when node exists' do

        # ensure node exists prior to deletion
        data, status_code, headers = @sling.post_path_with_http_info(
          path = 'apps/system',
          jcrprimary_type = 'sling:Folder',
          name = 'somefolder'
        )
        expect([200, 201]).to include(status_code)

        begin
          data, status_code, headers = @sling.get_node_with_http_info(
            path = 'apps/system',
            name = 'somefolder'
          )
          fail
        rescue SwaggerAemClient::ApiError => err
          expect(err.code).to eq(302)
        end
      end

    end

  end
end

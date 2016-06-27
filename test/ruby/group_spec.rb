require_relative 'spec_helper'

describe 'Group' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new

    # ensure group doesn't exist prior to testing
    authorizable_id = find_authorizable_id(@sling, '/home/groups/s', 'somegroup')
    if authorizable_id
      data, status_code, headers = @sling.path_name_delete_with_http_info(
        path = 'home/groups/s',
        name = authorizable_id
      )
      expect(status_code).to eq(204)
    end

  end

  after do
  end

  describe 'test create group' do

    it 'should succeed when group does not exist' do
      data, status_code, headers = @sling.libs_granite_security_post_authorizables_post_with_http_info(
        authorizable_id = 'somegroup',
        intermediate_path = '/home/groups/s',
        {
          :create_group => '',
          :profilegiven_name => 'somegroup'
        }
      )
      expect(status_code).to eq(201)

      authorizable_id = find_authorizable_id(@sling, '/home/groups/s', 'somegroup')
      # group should exist
      begin
        data, status_code, headers = @sling.path_name_get_with_http_info(
          path = 'home/groups/s',
          name = authorizable_id
        )
      rescue SwaggerAemClient::ApiError => err
        # AEM 6.1 responds with 302 when a node exists
        # AEM 6.2 responds with 500 when a node exists
        expect([302, 500]).to include(err.code)
      end
    end

  end
end

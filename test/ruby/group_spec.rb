require_relative 'spec_helper'

describe 'Group' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new
    @cq = SwaggerAemClient::CqApi.new

    # ensure group doesn't exist prior to testing
    authorizable_id = find_authorizable_id(@sling, '/home/groups/s', 'somegroup')
    if authorizable_id
      data, status_code, headers = @sling.path_name_delete_with_http_info(
        path = 'home/groups/s',
        name = authorizable_id
      )
      expect(status_code).to eq(204)
    end

    # create group
    data, status_code, headers = @sling.libs_granite_security_post_authorizables_post_with_http_info(
      authorizable_id = 'somegroup',
      intermediate_path = '/home/groups/s',
      {
        :create_group => '',
        :profilegiven_name => 'somegroup'
      }
    )
    expect(status_code).to eq(201)

    @authorizable_id = find_authorizable_id(@sling, '/home/groups/s', 'somegroup')

  end

  after do
  end

  describe 'test group' do

    it 'should succeed existence check' do
      begin
        data, status_code, headers = @sling.path_name_get_with_http_info(
          path = 'home/groups/s',
          name = @authorizable_id
        )
      rescue SwaggerAemClient::ApiError => err
        # AEM 6.1 responds with 302 when a node exists
        # AEM 6.2 responds with 500 when a node exists
        expect([302, 500]).to include(err.code)
      end
    end

    it 'should succeed permission setting' do
      data, status_code, headers = @cq.cqactions_html_post_with_http_info(
        authorizable_id = 'somegroup',
        changelog = 'path:/etc/replication,read:true,modify:true'
      )
      expect(status_code).to eq(200)
    end

    it 'should succeed being added to another group' do

      # ensure member group doesn't exist prior to testing
      member_authorizable_id = find_authorizable_id(@sling, '/home/groups/s', 'somemembergroup')
      if member_authorizable_id
        data, status_code, headers = @sling.path_name_delete_with_http_info(
          path = 'home/groups/s',
          name = member_authorizable_id
        )
        expect(status_code).to eq(204)
      end

      # create member group
      data, status_code, headers = @sling.libs_granite_security_post_authorizables_post_with_http_info(
        authorizable_id = 'somemembergroup',
        intermediate_path = '/home/groups/s',
        {
          :create_group => '',
          :profilegiven_name => 'somemembergroup'
        }
      )
      expect(status_code).to eq(201)

      # add user as member to the group
      data, status_code, headers = @sling.path_name_rw_html_post_with_http_info(
        path = 'home/groups/s',
        name = @authorizable_id,
        {
          :add_members => 'somemembergroup'
        }
      )
      expect(status_code).to eq(200)

    end

  end
end

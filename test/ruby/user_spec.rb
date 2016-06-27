require_relative 'spec_helper'

describe 'User' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new
    @cq = SwaggerAemClient::CqApi.new
    @crx = SwaggerAemClient::CrxApi.new

    # ensure user doesn't exist prior to testing
    authorizable_id = find_authorizable_id(@sling, '/home/users/s', 'someuser')
    if authorizable_id
      data, status_code, headers = @sling.delete_node_with_http_info(
        path = 'home/users/s',
        name = authorizable_id
      )
      expect(status_code).to eq(204)
    end

    # create user
    data, status_code, headers = @sling.post_authorizables_with_http_info(
      authorizable_id = 'someuser',
      intermediate_path = '/home/users/s',
      {
        :create_user => '',
        :reppassword => 'somepassword'
      }
    )
    expect(status_code).to eq(201)

    @authorizable_id = find_authorizable_id(@sling, '/home/users/s', 'someuser')
  end

  after do
  end

  describe 'test user create' do

    it 'should succeed existence check' do
      begin
        data, status_code, headers = @sling.get_node_with_http_info(
          path = 'home/users/s',
          name = @authorizable_id
        )
      rescue SwaggerAemClient::ApiError => err
        # AEM 6.1 responds with 302 when a node exists
        # AEM 6.2 responds with 500 when a node exists
        expect([302, 500]).to include(err.code)
      end
    end

    it 'should succeed permission setting' do
      data, status_code, headers = @cq.post_cq_actions_with_http_info(
        authorizable_id = 'someuser',
        changelog = 'path:/etc/replication,read:true,modify:true'
      )
      expect(status_code).to eq(200)
    end

    it 'should succeed admin password change' do
      data, status_code, headers = @crx.post_set_password_with_http_info(
        old = 'admin',
        plain = 'admin',
        verify = 'admin'
      )
      expect(status_code).to eq(200)
    end

    it 'should succeed created user password change' do
      SwaggerAemClient.configure { |conf| [
        conf.host = 'http://localhost:4502',
        conf.username = 'someuser',
        conf.password = 'somepassword',
        conf.debugging = false
      ]}
      crx = SwaggerAemClient::CrxApi.new
      data, status_code, headers = crx.post_set_password_with_http_info(
        old = 'somepassword',
        plain = 'somenewpassword',
        verify = 'somenewpassword'
      )
      expect(status_code).to eq(200)
    end

    it 'should succeed being added to a group' do

      # ensure group doesn't exist prior to testing
      group_authorizable_id = find_authorizable_id(@sling, '/home/groups/s', 'somegroup')
      if group_authorizable_id
        data, status_code, headers = @sling.delete_node_with_http_info(
          path = 'home/groups/s',
          name = group_authorizable_id
        )
        expect(status_code).to eq(204)
      end

      # create group
      data, status_code, headers = @sling.post_authorizables_with_http_info(
        authorizable_id = 'somegroup',
        intermediate_path = '/home/groups/s',
        {
          :create_group => '',
          :profilegiven_name => 'somegroup'
        }
      )
      expect(status_code).to eq(201)
      group_authorizable_id = find_authorizable_id(@sling, '/home/groups/s', 'somegroup')

      # add user as member to the group
      data, status_code, headers = @sling.post_node_rw_with_http_info(
        path = 'home/groups/s',
        name = group_authorizable_id,
        {
          :add_members => 'someuser'
        }
      )
      expect(status_code).to eq(200)

    end

  end
end

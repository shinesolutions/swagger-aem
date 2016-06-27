require_relative 'spec_helper'

describe 'User' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new
    @cq = SwaggerAemClient::CqApi.new

    # ensure user doesn't exist prior to testing
    authorizable_id = find_authorizable_id(@sling, '/home/users/s', 'someuser')
    if authorizable_id
      data, status_code, headers = @sling.path_name_delete_with_http_info(
        path = 'home/users/s',
        name = authorizable_id
      )
      expect(status_code).to eq(204)
    end

    # create user
    data, status_code, headers = @sling.libs_granite_security_post_authorizables_post_with_http_info(
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

  describe 'test user' do

    it 'should succeed existence check' do
      begin
        data, status_code, headers = @sling.path_name_get_with_http_info(
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
      data, status_code, headers = @cq.cqactions_html_post_with_http_info(
        authorizable_id = 'someuser',
        changelog = 'path:/etc/replication,read:true,modify:true'
      )
      expect(status_code).to eq(200)
    end

  end
end

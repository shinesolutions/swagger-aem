require_relative 'spec_helper'

describe 'User' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new
  end

  after do
  end

  describe 'test create user' do

    it 'should succeed when user does not exist' do
      data, status_code, headers = @sling.libs_granite_security_post_authorizables_post_with_http_info(
        authorizable_id = 'someuser',
        intermediate_path = '/home/users/s',
        {
          :create_user => '',
          :reppassword => 'somepassword'
        }
      )
      expect(status_code).to eq(201)
    end

  end
end

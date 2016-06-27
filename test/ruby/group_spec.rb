require_relative 'spec_helper'

describe 'Group' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new
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
    end

  end
end

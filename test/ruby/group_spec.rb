require_relative 'spec_helper'

describe 'Group' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new

    # ensure group doesn't exist prior to testing

    # lookup for the group's authorizable ID
    begin
      data, status_code, headers = @sling.bin_querybuilder_json_post_with_http_info(
        path = '/home/groups/s',
        p_limit = -1,
        _1_property = 'rep:authorizableId',
        _1_property_value = 'somegroup'
      )
      expect(status_code).to eq(200)

      data = JSON.parse(data)
      if data['success'] == true && data['hits'].length == 1
        authorizable_id = data['hits'][0]['name']

        # delete the group if it exists
        data, status_code, headers = @sling.path_name_delete_with_http_info(
          path = 'home/groups/s',
          name = authorizable_id
        )
        # delete group when it exists
        expect(status_code).to eq(204)

      end
    rescue SwaggerAemClient::ApiError => err
      # ignore when group does not exist
      expect(err.code).to eq(404)
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
    end

  end
end

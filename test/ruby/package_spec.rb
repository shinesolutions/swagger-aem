require_relative 'spec_helper'

describe 'Package' do
  before do
    init_client
    @crx = SwaggerAemClient::CrxApi.new

    # create package
    data, status_code, headers = @crx.post_package_service_json_with_http_info(
      name = 'apps/system',
      cmd = 'create',
      group_name = 'somepackagegroup',
      package_name = 'somepackage',
      package_version = '1.2.3',
      charset = 'utf-8'
    )
    expect(status_code).to eq(200)
  end

  after do
  end

  describe 'test node create' do

    it 'should succeed when node does not exist' do
    end

  end
end

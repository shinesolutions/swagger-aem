require_relative 'spec_helper'

describe 'Path' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new
  end

  after do
  end

  describe 'test path activation' do

    it 'should succeed when path exists' do
      data, status_code, headers = @sling.post_tree_activation_with_http_info(
        ignoredeactivated = true,
        onlymodified = false,
        path = '/etc/designs/geometrixx'
      )
      # expect(status_code).to eq(200)
    end

    # tree activation returns 200 regardless whether the path exists or not
    it 'should still succeed when path does not exist' do
      data, status_code, headers = @sling.post_tree_activation_with_http_info(
        ignoredeactivated = true,
        onlymodified = false,
        path = '/some/inexisting/path'
      )
      expect(status_code).to eq(200)
    end

  end

end

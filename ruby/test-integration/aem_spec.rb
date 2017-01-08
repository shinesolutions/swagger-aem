require_relative 'spec_helper'

describe 'Aem' do
  before do
    init_client
    @cq = SwaggerAemClient::CqApi.new
  end

  after do
  end

  describe 'test get login page' do

    it 'should succeed and contain readyness detection' do
      data, status_code, headers = @cq.get_login_page_with_http_info()
      expect(status_code).to eq(200)
    end

  end
end

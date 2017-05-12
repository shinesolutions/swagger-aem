require_relative 'spec_helper'

describe 'Aem' do
  before do
    init_client
    @cq = SwaggerAemClient::CqApi.new
    @custom = SwaggerAemClient::CustomApi.new
    @sling = SwaggerAemClient::SlingApi.new
  end

  after do
  end

  describe 'test get login page' do

    it 'should succeed and contain readyness detection' do
      data, status_code, headers = @cq.get_login_page_with_http_info()
      expect(status_code).to eq(200)
      expect(data).to include('QUICKSTART_HOMEPAGE')
    end

  end

  describe 'test get health check' do

    it 'should succeed' do
      data, status_code, headers = @custom.get_aem_health_check_with_http_info(
        opts = {
          :tags => 'shallow',
          :combinetagsor => false
        }
      )
      expect(status_code).to eq(200)
      json = JSON.parse(data)
      expect(json['results'][0]['status']).to eq('OK')
    end

  end

  describe 'test agents list' do

    it 'should succeed' do
      data, status_code, headers = @sling.get_agents_with_http_info('author')
      expect(status_code).to eq(200)
    end

  end

end

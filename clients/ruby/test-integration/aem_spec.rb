require_relative 'spec_helper'

describe 'Aem' do
  before do
    init_client
    @cq = SwaggerAemClient::CqApi.new
    @custom = SwaggerAemClient::CustomApi.new
    @sling = SwaggerAemClient::SlingApi.new
    @crx = SwaggerAemClient::CrxApi.new
    @console = SwaggerAemClient::ConsoleApi.new
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

  describe 'test get CRXDE Status page' do

    it 'should succeed' do
      begin
        data, status_code, headers = @crx.get_crxde_status_with_http_info()
        expect(status_code).to be_in(200, 404)
        json = JSON.parse(data)
        expect(json['jcr:primaryType']).to eq('rep:root')
      rescue SwaggerAemClient::ApiError => err
        expect([404]).to include(err.code)
        expect(err.response_body).to include('<head><title>404 Resource at \'/crx/server/crx.default/jcr:root/.1.json\' not found: No resource found</title></head>')
      end
    end

  end

  describe 'test get aem product info' do

    it 'should succeed and contain readyness detection' do
      data, status_code, headers = @console.get_aem_product_info_with_http_info()
      expect(status_code).to eq(200)
      expect(data.length).to be >= 1
    end

  end

  describe 'test get CRX Package Manager Servlet service state' do

    it 'should succeed and contain readyness detection' do
      begin
        @crx.get_package_manager_servlet_with_http_info()
      rescue SwaggerAemClient::ApiError => err
        expect([405]).to include(err.code)
      end
    end

  end
end

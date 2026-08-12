require 'swagger_aem'

describe 'SwaggerAemClientHealthCheck' do
  before do
  end

  after do
  end

  describe 'test get_aem_health_check' do
    it 'should call' do
      SwaggerAemClient.configure do |config|
        config.host = 'localhost:4502'
        config.username = 'admin'
        config.password = 'admin'
      end

      api_instance = SwaggerAemClient::CustomApi.new

      # Stub the underlying HTTP call so no real AEM server is needed
      allow(api_instance.api_client).to receive(:call_api)
        .with(:GET, '/system/health', anything)
        .and_return(['OK', 200, {}])

      begin
        result = api_instance.get_aem_health_check
        expect(result).to eq('OK')
      rescue SwaggerAemClient::ApiError => e
        puts "Error when calling CustomApi->get_aem_health_check: #{e}"
        fail
      end
    end
  end

end

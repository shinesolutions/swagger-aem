require_relative 'spec_helper'

describe 'Bundle' do
  before do
    conf_client
    @console = SwaggerClient::ConsoleApi.new
  end

  after do
  end

  describe 'test bundle stop' do

    it 'should succeed when bundle exists' do
      data, status_code, headers = @console.system_console_bundles_name_post_with_http_info(
        name = 'com.adobe.cq.social.cq-social-forum',
        action = 'stop'
      )
      expect(status_code).to eq(200)
    end

    it 'should error when bundle does not exist' do
      begin
        data, status_code, headers = @console.system_console_bundles_name_post_with_http_info(
          name = 'someinexistingbundle',
          action = 'stop'
        )
      rescue SwaggerClient::ApiError => err
        expect(err.code).to eq(404)
      end
    end

  end

  describe 'test bundle start' do

    it 'should succeed when bundle exists' do
      data, status_code, headers = @console.system_console_bundles_name_post_with_http_info(
        name = 'com.adobe.cq.social.cq-social-forum',
        action = 'start'
      )
      expect(status_code).to eq(200)
    end

    it 'should error when bundle does not exist' do
      begin
        data, status_code, headers = @console.system_console_bundles_name_post_with_http_info(
          name = 'someinexistingbundle',
          action = 'start'
        )
      rescue SwaggerClient::ApiError => err
        expect(err.code).to eq(404)
      end
    end

  end
end

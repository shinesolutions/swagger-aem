require_relative 'spec_helper'

describe 'Bundle' do
  before do
    init_client
    @console = SwaggerAemClient::ConsoleApi.new
  end

  after do
  end

  describe 'test bundle stop' do

    it 'should succeed when bundle exists' do
      data, status_code, headers = @console.post_bundle_with_http_info(
        name = 'com.adobe.cq.social.cq-social-forum',
        action = 'stop'
      )
      expect(status_code).to eq(200)
    end

    it 'should error when bundle does not exist' do
      begin
        data, status_code, headers = @console.post_bundle_with_http_info(
          name = 'someinexistingbundle',
          action = 'stop'
        )
      rescue SwaggerAemClient::ApiError => err
        expect(err.code).to eq(404)
      end
    end

  end

  describe 'test bundle start' do

    it 'should succeed when bundle exists' do
      data, status_code, headers = @console.post_bundle_with_http_info(
        name = 'com.adobe.cq.social.cq-social-forum',
        action = 'start'
      )
      expect(status_code).to eq(200)
    end

    it 'should error when bundle does not exist' do
      begin
        data, status_code, headers = @console.post_bundle_with_http_info(
          name = 'someinexistingbundle',
          action = 'start'
        )
      rescue SwaggerAemClient::ApiError => err
        expect(err.code).to eq(404)
      end
    end

  end
end

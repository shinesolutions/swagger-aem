require_relative 'spec_helper'

describe 'Repository' do
  before do
    init_client
    @console = SwaggerClient::ConsoleApi.new
  end

  after do
  end

  describe 'test block repository writes' do

    it 'should succeed' do
      data, status_code, headers = @console.system_console_jmx_com_adobe_granitetype_repository_op_action_post_with_http_info(
        action = 'blockRepositoryWrites'
      )
      expect(status_code).to eq(200)
    end

  end

  describe 'test unblock repository writes' do

    it 'should succeed' do
      data, status_code, headers = @console.system_console_jmx_com_adobe_granitetype_repository_op_action_post_with_http_info(
        action = 'unblockRepositoryWrites'
      )
      expect(status_code).to eq(200)
    end

  end

end

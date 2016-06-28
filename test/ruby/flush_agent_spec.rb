require_relative 'spec_helper'

describe 'Flush Agent' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new

    # ensure agent doesn't exist prior to testing
    begin
      data, status_code, headers = @sling.delete_agent_with_http_info(
        runmode = 'author',
        name = 'some-flush-agent'
      )
      # delete agent when it exists
      expect([200, 204]).to include(status_code)
    rescue SwaggerAemClient::ApiError => err
      # ignore when agent does not exist
      expect(err.code).to eq(404)
    end

    begin
      data, status_code, headers = @sling.get_agent_with_http_info(
        runmode = 'author',
        name = 'some-flush-agent'
      )
    rescue SwaggerAemClient::ApiError => err
      expect(err.code).to eq(404)
    end

  end

  after do
  end

  describe 'test create' do

    it 'should succeed an update' do

      # create a new flush agent
      data, status_code, headers = @sling.post_agent_with_http_info(
        runmode = 'author',
        name = 'some-flush-agent',
        {
          :jcrprimary_type => 'cq:Page',
          :jcrcontentcqname => 'some-flush-agent',
          :jcrcontentjcrtitle => 'Some Flush Agent Title',
          :jcrcontentjcrdescription => 'Some Flush Agent Description',
          :jcrcontentslingresource_type => '/libs/cq/replication/components/agent',
          :jcrcontenttransport_uri => 'http://somehost:8080/dispatcher/invalidate.cache',
          :jcrcontentlog_level => 'error',
          :jcrcontentno_versioning => true,
          :jcrcontentprotocol_http_headers => ['CQ-Action:{action}', 'CQ-Handle:{path}', 'CQ-Path:{path}'],
          :jcrcontentprotocol_http_headers_type_hint => 'String[]',
          :jcrcontentprotocol_http_method => 'GET',
          :jcrcontentretry_delay => '30000',
          :jcrcontentserialization_type => 'flush',
          :jcrcontentjcrmixin_types => 'cq:ReplicationStatus',
          :jcrcontenttrigger_receive => true,
          :jcrcontenttrigger_specific => true,
          :jcrcontentcqtemplate => '/libs/cq/replication/templates/agent',
          :jcrcontentenabled => true
        }
      )
      expect(status_code).to eq(201)

      # update an existing flush agent
      data, status_code, headers = @sling.post_agent_with_http_info(
        runmode = 'author',
        name = 'some-flush-agent',
        {
          :jcrprimary_type => 'cq:Page',
          :jcrcontentcqname => 'some-flush-agent',
          :jcrcontentjcrtitle => 'Some New Flush Agent Title',
          :jcrcontentjcrdescription => 'Some New Flush Agent Description'        }
      )
      expect(status_code).to eq(200)
    end

  end
end

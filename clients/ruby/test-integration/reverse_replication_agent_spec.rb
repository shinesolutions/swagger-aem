require_relative 'spec_helper'

describe 'Reverse Replication Agent' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new

    # ensure agent doesn't exist prior to testing
    begin
      data, status_code, headers = @sling.delete_agent_with_http_info(
        runmode = 'author',
        name = 'some-reverse-replication-agent'
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
        name = 'some-reverse-replication-agent'
      )
      fail
    rescue SwaggerAemClient::ApiError => err
      expect(err.code).to eq(404)
    end

  end

  after do
  end

  it 'should succeed an update' do

    # create a new replication agent
    data, status_code, headers = @sling.post_agent_with_http_info(
      runmode = 'author',
      name = 'some-reverse-replication-agent',
      {
        :jcrprimary_type => 'cq:Page',
        :jcrcontentcqname => 'some-reverse-replication-agent',
        :jcrcontentjcrtitle => 'Some Reverse Replication Agent Title',
        :jcrcontentjcrdescription => 'Some Reverse Replication Agent Description',
        :jcrcontentslingresource_type => '/libs/cq/replication/components/agent',
        :jcrcontentserialization_type => 'durbo',
        :jcrcontenttransport_uri => 'http://somehost:8080/bin/receive?sling:authRequestLogin=1',
        :jcrcontenttransport_user => 'admin',
        :jcrcontenttransport_password => 'admin',
        :jcrcontentlog_level => 'error',
        :jcrcontentretry_delay => '30000',
        :jcrcontentcqtemplate => '/libs/cq/replication/templates/agent',
        :jcrcontentenabled => true,
        :jcrcontentreverse_replication => true
      }
    )
    expect(status_code).to eq(201)

    # update an existing reverse replication agent
    data, status_code, headers = @sling.post_agent_with_http_info(
      runmode = 'author',
      name = 'some-reverse-replication-agent',
      {
        :jcrprimary_type => 'cq:Page',
        :jcrcontentcqname => 'some-reverse-replication-agent',
        :jcrcontentjcrtitle => 'Some New Reverse Replication Agent Title',
        :jcrcontentjcrdescription => 'Some New Reverse Replication Agent Description'        }
    )
    expect(status_code).to eq(200)
  end
end

require_relative 'spec_helper'

describe 'Outbox Replication Agent' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new

    # ensure agent doesn't exist prior to testing
    begin
      data, status_code, headers = @sling.delete_agent_with_http_info(
        runmode = 'publish',
        name = 'some-outbox-replication-agent'
      )
      # delete agent when it exists
      expect([200, 204]).to include(status_code)
    rescue SwaggerAemClient::ApiError => err
      # ignore when agent does not exist
      expect(err.code).to eq(404)
    end

    begin
      data, status_code, headers = @sling.get_agent_with_http_info(
        runmode = 'publish',
        name = 'some-outbox-replication-agent'
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
      runmode = 'publish',
      name = 'some-outbox-replication-agent',
      {
        :jcrprimary_type => 'cq:Page',
        :jcrcontentcqname => 'some-outbox-replication-agent',
        :jcrcontentjcrtitle => 'Some Outbox Replication Agent Title',
        :jcrcontentjcrdescription => 'Some Outbox Replication Agent Description',
        :jcrcontentslingresource_type => 'cq/replication/components/agent',
        :jcrcontenttransport_uri => 'repo://var/replication/outbox',
        :jcrcontentno_versioning => true,
        :jcrcontentlog_level => 'error',
        :jcrcontentcqtemplate => '/libs/cq/replication/templates/agent',
        :jcrcontentenabled => true,
        :jcrcontenttrigger_distribute => true,
        :jcrcontenttrigger_modified => true,
        :jcrcontenttrigger_specific => true,
        :jcrcontentuser_id => 'admin'
      }
    )
    expect(status_code).to eq(201)

    # update an existing outbox replication agent
    data, status_code, headers = @sling.post_agent_with_http_info(
      runmode = 'publish',
      name = 'some-outbox-replication-agent',
      {
        :jcrprimary_type => 'cq:Page',
        :jcrcontentcqname => 'some-outbox-replication-agent',
        :jcrcontentjcrtitle => 'Some New Outbox Replication Agent Title',
        :jcrcontentjcrdescription => 'Some New Outbox Replication Agent Description'        }
    )
    expect(status_code).to eq(200)
  end
end

require_relative 'spec_helper'

describe 'Certificate' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new

    # ensure certificate doesn't exist prior to testing
    begin
      data, status_code, headers = @sling.post_node_with_http_info(
        path = '/etc/truststore/',
        name = 'truststore.p12',
        {
          :operation => 'delete'
        }
      )
      # delete truststore when it exists
      expect([200, 204]).to include(status_code)
    rescue SwaggerAemClient::ApiError => err
      # ignore when truststore does not exist
      expect([403, 404]).to include(err.code)
    end

    # create certificate
    data, status_code, headers = @sling.post_truststore_with_http_info(
      {
        :new_password => 'somepassword',
        :re_password  => 'somepassword',
        :operation    => 'createStore'
      }
    )
    expect([200, 201]).to include(status_code)
  end

  after do
  end

  describe 'test upload and delete cert' do

    it 'should succeed upload and deletion by alias' do
      # upload the cert chain in fixtures (generated from `make fixtures`)
      File.open("./test-integration/fixtures/cert_chain.crt", 'r') { |cert_file|
        data, status_code, headers = @sling.post_truststore_with_http_info(
          {
            :key_store_type => 'jks',
            :certificate => cert_file
          }
        )
        expect(status_code).to eq(200)
      }

      # retrieve truststore info, it should have the uploaded cert
      data, status_code, headers = @sling.get_truststore_info_with_http_info
      expect(status_code).to eq(200)
      expect(data.aliases.size).to eq(1)
      cert_alias = data.aliases[0]._alias

      # remove the cert using the alias
      data, status_code, headers = @sling.post_truststore_with_http_info(
        {
          :remove_alias => cert_alias
        }
      )
      expect(status_code).to eq(200)

      # retrieve truststore info, it should no longer have the uploaded cert
      data, status_code, headers = @sling.get_truststore_info_with_http_info
      expect(status_code).to eq(200)
      expect(data.aliases.size).to eq(0)
    end

  end

end

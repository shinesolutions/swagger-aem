require_relative 'spec_helper'

describe 'Truststore' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new

    # ensure truststore doesn't exist prior to testing
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

    # create truststore
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

  describe 'test create' do

    it 'should succeed existence check' do
      data, status_code, headers = @sling.get_truststore_informations_with_http_info
      expect(status_code).to eq(200)
    end

  end

  describe 'test download and upload' do

    it 'should succeed downloading created truststore and uploading it' do
      # download truststore
      data, status_code, headers = @sling.get_truststore_with_http_info
      expect(status_code).to eq(200)

      # data is a temporary file created by Swagger API client
      FileUtils.cp(data.path, "#{@temp_dir}/sometruststore.p12")
      expect(File.file? "#{@temp_dir}/sometruststore.p12").to be(true)
      download_data = data

      File.open("#{@temp_dir}/sometruststore.p12", 'r') { |file|
        # upload truststore
        data, status_code, headers = @sling.post_truststore_pkcs12_with_http_info(
          {
            :truststore_p12 => file
          }
        )
        expect(status_code).to eq(200)
      }

      # delete temporary downloaded truststore file
      download_data.delete
    end

  end

end

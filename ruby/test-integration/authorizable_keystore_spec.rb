require_relative 'spec_helper'

describe 'Authorizable Keystore' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new

    # ensure authorizable keystore doesn't exist prior to testing
    begin
      data, status_code, headers = @sling.post_node_with_http_info(
        path = '/home/users/system/authentication-service',
        name = 'store.p12',
        {
          :operation => 'delete'
        }
      )
      # delete authorizable keystore when it exists
      expect([200, 204]).to include(status_code)
    rescue SwaggerAemClient::ApiError => err
      # ignore when authorizable keystore does not exist
      expect([403, 404]).to include(err.code)
    end

    # create authorizable keystore
    data, status_code, headers = @sling.post_authorizable_keystore_with_http_info(
      intermediate_path = '/home/users/system',
      authorizable_id = 'authentication-service',
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
      data, status_code, headers = @sling.get_authorizable_keystore_with_http_info(
        intermediate_path = '/home/users/system',
        authorizable_id = 'authentication-service'
      )
      expect(status_code).to eq(200)
    end

  end

  describe 'test change password' do

    it 'should succeed' do
      data, status_code, headers = @sling.post_authorizable_keystore_with_http_info(
        intermediate_path = '/home/users/system',
        authorizable_id = 'authentication-service',
        {
          :current_password => 'somepassword',
          :new_password => 'somenewpassword',
          :re_password => 'somenewpassword'
        }
      )
      expect(status_code).to eq(200)
    end

  end

  describe 'test download and upload' do

    it 'should succeed' do
      # upload a cert chain to the keystore
      # this cert chain is needed otherwise uploading an empty keystore wouldn't work
      File.open("./test-integration/fixtures/example_keystore_cert_chain.crt", 'r') { |keystore_cert_chain_file|
        File.open("./test-integration/fixtures/example_keystore_private_key.der", 'r') { |keystore_private_key_file|
          data, status_code, headers = @sling.post_authorizable_keystore_with_http_info(
            intermediate_path = '/home/users/system',
            authorizable_id = 'authentication-service',
            {
              :_alias => 'somecertchainalias',
              :cert_chain => keystore_cert_chain_file,
              :pk => keystore_private_key_file
            }
          )
          expect(status_code).to eq(200)
        }
      }

      # download keystore
      data, status_code, headers = @sling.get_keystore_with_http_info(
        intermediate_path = '/home/users/system',
        authorizable_id = 'authentication-service'
      )
      expect(status_code).to eq(200)

      # data is a temporary file created by Swagger API client
      FileUtils.cp(data.path, "#{@temp_dir}/somekeystore.pkcs12")
      expect(File.file? "#{@temp_dir}/somekeystore.pkcs12").to be(true)
      download_data = data

      # # upload the downloaded keystore
      # File.open("#{@temp_dir}/somekeystore.pkcs12", 'r') { |file|
      #   data, status_code, headers = @sling.post_authorizable_keystore_with_http_info(
      #     intermediate_path = '/home/users/system',
      #     authorizable_id = 'authentication-service',
      #     {
      #       :new_alias => 'somealias',
      #       :key_store => file,
      #       :key_store_pass => 'somekeystorepassword',
      #       :_alias => 'somecertchainalias',
      #       :key_password => 'somekeypassword'
      #     }
      #   )
      #   expect(status_code).to eq(200)
      # }

      download_data.delete
    end

  end

  describe 'test upload and delete certificate chain' do

    it 'should succeed' do
      File.open("./test-integration/fixtures/example_keystore_cert_chain.crt", 'r') { |keystore_cert_chain_file|
        File.open("./test-integration/fixtures/example_keystore_private_key.der", 'r') { |keystore_private_key_file|
          data, status_code, headers = @sling.post_authorizable_keystore_with_http_info(
            intermediate_path = '/home/users/system',
            authorizable_id = 'authentication-service',
            {
              :_alias => 'somecertchainalias',
              :cert_chain => keystore_cert_chain_file,
              :pk => keystore_private_key_file
            }
          )
          expect(status_code).to eq(200)
        }
      }

      data, status_code, headers = @sling.post_authorizable_keystore_with_http_info(
        intermediate_path = '/home/users/system',
        authorizable_id = 'authentication-service',
        {
          :remove_alias => 'somecertchainalias'
        }
      )
      expect(status_code).to eq(200)
    end

  end

end

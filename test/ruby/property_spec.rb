require_relative 'spec_helper'

describe 'Property' do
  before do
    init_client
    @sling = SwaggerAemClient::SlingApi.new

    # ensure config.author already exists
    begin
      data, status_code, headers = @sling.post_path_with_http_info(
        path = 'apps/system',
        jcrprimary_type = 'sling:Folder',
        name = 'config.author'
      )
      # create config.author when it does not exist
      expect([200, 201]).to include(status_code)
    rescue SwaggerAemClient::ApiError => err
      # ignore when it already exists
      expect(err.code).to eq(500)
    end
  end

  after do
  end

  describe 'test create SSL OSGI config properties' do

    it 'should succeed' do

      # ensure http OSGI config node exists
      begin
        data, status_code, headers = @sling.post_path_with_http_info(
          path = 'apps/system/config.author',
          jcrprimary_type = 'sling:OsgiConfig',
          name = 'org.apache.felix.http'
        )
        # create config.author when it does not exist
        expect([200, 201]).to include(status_code)
      rescue SwaggerAemClient::ApiError => err
        # ignore when it already exists
        expect(err.code).to eq(500)
      end

      data, status_code, headers = @sling.post_config_with_http_info(
        runmode = 'author',
        name = 'org.apache.felix.http',
        opts = {
          :org_apache_felix_https_nio => true,
          :org_apache_felix_https_nio_type_hint => 'Boolean',
          :org_apache_felix_https_keystore => '/some/path/to/keystore',
          :org_apache_felix_https_keystore_type_hint => 'String',
          :org_apache_felix_https_keystore_password => 'somepassword',
          :org_apache_felix_https_keystore_password_type_hint => 'String',
          :org_apache_felix_https_keystore_key => 'somekey',
          :org_apache_felix_https_keystore_key_type_hint => 'String',
          :org_apache_felix_https_keystore_key_password => 'somekeypassword',
          :org_apache_felix_https_keystore_key_password_type_hint => 'String',
          :org_apache_felix_https_truststore => '/some/path/to/truststore',
          :org_apache_felix_https_truststore_key_type_hint => 'String',
          :org_apache_felix_https_truststore_password => 'sometruststorepassword',
          :org_apache_felix_https_truststore_password_type_hint => 'String',
          :org_apache_felix_https_clientcertificate => 'none',
          :org_apache_felix_https_clientcertificate_type_hint => 'String',
          :org_apache_felix_https_enable => false,
          :org_apache_felix_https_enable_type_hint => 'Boolean',
          :org_osgi_service_http_port_secure => 4503,
          :org_osgi_service_http_port_secure_type_hint => 'Long'
        }
      )
      expect([200, 201]).to include(status_code)
    end

  end
end

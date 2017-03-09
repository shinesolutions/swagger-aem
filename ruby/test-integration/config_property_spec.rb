require_relative 'spec_helper'

describe 'ConfigProperty' do
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

  describe 'test create Apache Felix Jetty Based HTTP Service properties' do

    it 'should succeed when path node already exists' do

      # ensure http OSGI config node exists
      begin
        data, status_code, headers = @sling.post_path_with_http_info(
          path = 'apps/system/config.author',
          jcrprimary_type = 'sling:OsgiConfig',
          name = 'org.apache.felix.http'
        )
        # create config when it does not exist
        expect([200, 201]).to include(status_code)
      rescue SwaggerAemClient::ApiError => err
        # ignore when it already exists
        expect(err.code).to eq(500)
      end

      data, status_code, headers = @sling.post_config_apache_felix_jetty_based_http_service_with_http_info(
        runmode = 'author',
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
          :org_apache_felix_https_truststore_type_hint => 'String',
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

  describe 'test create Apache Sling GET Servlet properties' do

    it 'should succeed when path node already exists' do

      # ensure http OSGI config node exists
      begin
        data, status_code, headers = @sling.post_path_with_http_info(
          path = 'apps/system/config.author',
          jcrprimary_type = 'sling:OsgiConfig',
          name = 'org.apache.sling.servlets.get.DefaultGetServlet'
        )
        # create config when it does not exist
        expect([200, 201]).to include(status_code)
      rescue SwaggerAemClient::ApiError => err
        # ignore when it already exists
        expect(err.code).to eq(500)
      end

      data, status_code, headers = @sling.post_config_apache_sling_get_servlet_with_http_info(
        runmode = 'author',
        opts = {
          :json_maximumresults => '100',
          :json_maximumresults_type_hint => 'String',
          :enable_html => false,
          :enable_html_type_hint => 'Boolean',
          :enable_txt => false,
          :enable_txt_type_hint => 'Boolean',
          :enable_xml => false,
          :enable_xml_type_hint => 'Boolean'
        }
      )
      expect([200, 201]).to include(status_code)
    end

  end

  describe 'test create Apache Sling Referrer Filter properties' do

    it 'should succeed when path node already exists' do

      # ensure http OSGI config node exists
      begin
        data, status_code, headers = @sling.post_path_with_http_info(
          path = 'apps/system/config.author',
          jcrprimary_type = 'sling:OsgiConfig',
          name = 'org.apache.sling.security.impl.ReferrerFilter'
        )
        # create config when it does not exist
        expect([200, 201]).to include(status_code)
      rescue SwaggerAemClient::ApiError => err
        # ignore when it already exists
        expect(err.code).to eq(500)
      end

      data, status_code, headers = @sling.post_config_apache_sling_referrer_filter_with_http_info(
        runmode = 'author',
        opts = {
          :allow_empty => false,
          :allow_empty_type_hint => 'Boolean',
          :allow_hosts => '',
          :allow_hosts_type_hint => 'String',
          :allow_hosts_regexp => '',
          :allow_hosts_regexp_type_hint => 'String'
        }
      )
      expect([200, 201]).to include(status_code)
    end

  end

  describe 'test create Apache Sling DavEx Servlet properties' do

    it 'should succeed when path node already exists' do

      # ensure http OSGI config node exists
      begin
        data, status_code, headers = @sling.post_path_with_http_info(
          path = 'apps/system/config.author',
          jcrprimary_type = 'sling:OsgiConfig',
          name = 'org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet'
        )
        # create config when it does not exist
        expect([200, 201]).to include(status_code)
      rescue SwaggerAemClient::ApiError => err
        # ignore when it already exists
        expect(err.code).to eq(500)
      end

      data, status_code, headers = @sling.post_config_apache_sling_dav_ex_servlet_with_http_info(
        runmode = 'author',
        opts = {
          :alias => '/crx/server',
          :alias_type_hint => 'String',
          :dav_create_absolute_uri => true,
          :dav_create_absolute_uri_type_hint => 'Boolean',
        }
      )
      expect([200, 201]).to include(status_code)
    end

  end

end

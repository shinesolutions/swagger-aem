require_relative 'spec_helper'

describe 'Saml' do
  before do
    init_client
    @console = SwaggerAemClient::ConsoleApi.new
    @sling = SwaggerAemClient::SlingApi.new

    # ensure saml doesn't exist prior to testing
    begin
      data, status_code, headers = @console.post_saml_configuration_with_http_info(
        {
          :apply => true,
          :delete => true
        }
      )

      # delete saml when it exists
      expect([200, 204]).to include(status_code)

      data, status_code, headers = @console.post_saml_configuration_with_http_info(
        {
          :post => true
        }
      )
      expect(status_code).to eq(200)
      expect(data.properties.idp_cert_alias.is_set).to eq(false)

      # ensure saml osgi config doesn't exist prior to testing
      data, status_code, headers = @sling.delete_node_with_http_info(
        path = 'apps/system/config',
        name = 'com.adobe.granite.auth.saml.SamlAuthenticationHandler.config'
      )
      # delete node when it exists
      expect(status_code).to eq(204)
    rescue SwaggerAemClient::ApiError => err
      # ignore when saml does not exist
      expect([403, 404]).to include(err.code)
    end
  end

  after do
    # ensure saml configuration exists before deletion
    data, status_code, headers = @console.post_saml_configuration_with_http_info(
      {
        :post => true
      }
    )
    expect(status_code).to eq(200)
    expect(data.properties.idp_cert_alias.is_set).to eq(true)

    # ensure saml configuraiton is deleted after testing
    data, status_code, headers = @console.post_saml_configuration_with_http_info(
      {
        :apply => true,
        :delete => true
      }
    )

    # delete saml when it exists
    expect([200, 204]).to include(status_code)

    # ensure saml configuration is deleted
    data, status_code, headers = @console.post_saml_configuration_with_http_info(
      {
        :post => true
      }
    )
    expect(status_code).to eq(200)
    expect(data.properties.idp_cert_alias.is_set).to eq(false)
  end

  describe 'test create' do

    it 'should succeed' do
      # saml shouldn't exist at first
      data, status_code, headers = @console.post_saml_configuration_with_http_info(
        {
          :post => true
        }
      )
      expect(status_code).to eq(200)
      expect(data.properties.idp_cert_alias.is_set).to eq(false)

      # Creating empty SAML configuration as sling:OsgiConfig
      data, status_code, headers = @sling.post_path_with_http_info(
        path = 'apps/system/config',
        jcrprimary_type = 'sling:OsgiConfig',
        name = 'com.adobe.granite.auth.saml.SamlAuthenticationHandler.config'
      )
      expect([200, 201])

      # Check if empty SAML configuration exists
      begin
        data, status_code, headers = @sling.get_node_with_http_info(
          path = 'apps/system/config',
          name = 'com.adobe.granite.auth.saml.SamlAuthenticationHandler.config'
        )
        fail
      rescue SwaggerAemClient::ApiError => err
        expect(err.code).to eq(302)
      end


      begin
        data, status_code, headers = @sling.get_node_with_http_info(
          path = 'apps/system/config',
          name = 'com.adobe.granite.auth.saml.SamlAuthenticationHandler.config'
        )
        fail
      rescue SwaggerAemClient::ApiError => err
        expect(err.code).to eq(302)
      end

      data, status_code, headers = @sling.post_config_adobe_granite_saml_authentication_handler_with_http_info(
        opts = {
          :key_store_password => 'somepassword',
          :key_store_password_type_hint => 'String',
          :service_ranking => 5002,
          :service_ranking_type_hint => 'Long',
          :idp_http_redirect => true,
          :idp_http_redirect_type_hint => 'Boolean',
          :create_user => true,
          :create_user_type_hint => 'Boolean',
          :default_redirect_url => '/sites.html',
          :default_redirect_url_type_hint => 'String',
          :user_id_attribute => 'NameID',
          :user_id_attribute_type_hint => 'String',
          :default_groups => [
            'def-groups'
          ],
          :default_groups_type_hint => 'String[]',
          :idp_cert_alias => 'alias_1234',
          :idp_cert_alias_type_hint => 'String',
          :add_group_memberships => true,
          :add_group_memberships_type_hint => 'Boolean',
          :path => ['/'],
          :path_type_hint => 'String[]',
          :synchronize_attributes =>  [
                'http://schemas.xmlsoap.org/ws/2005/05/identity/claims/givenname\=profile/givenName',
                'http://schemas.xmlsoap.org/ws/2005/05/identity/claims/surname\=profile/familyName',
                'http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress\=profile/email'
              ],
          :synchronize_attributes_type_hint => 'String[]',
          :clock_tolerance => 60,
          :clock_tolerance_type_hint => 'Long',
          :group_membership_attribute => 'http://temp/variable/aem-groups',
          :group_membership_attribute_type_hint => 'String',
          :idp_url => 'https://federation.prod.com/adfs/ls/IdpInitiatedSignOn.aspx?RequestBinding\=HTTPPost&loginToRp\=https://prod-aemauthor.com/saml_login',
          :idp_url_type_hint => 'String',
          :logout_url => 'https://federation.prod.com/adfs/ls/IdpInitiatedSignOn.aspx',
          :logout_url_type_hint => 'String',
          :service_provider_entity_id => 'https://prod-aemauthor.com/saml_login',
          :service_provider_entity_id_type_hint => 'String',
          :handle_logout => true,
          :handle_logout_type_hint => 'Boolean',
          :sp_private_key_alias_type_hint => 'String',
          :use_encryption => false,
          :use_encryption_type_hint => 'Boolean',
          :name_id_format => 'urn:oasis:names:tc:SAML:2.0:nameid-format:transient',
          :name_id_format_type_hint => 'String',
          :digest_method => 'http://www.w3.org/2001/04/xmlenc#sha256',
          :digest_method_type_hint => 'String',
          :signature_method => 'http://www.w3.org/2001/04/xmldsig-more#rsa-sha256',
          :signature_method_type_hint => 'String'
        }
      )
      expect([200, 201]).to include(status_code)

      data, status_code, headers = @console.post_saml_configuration_with_http_info(
        {
          :post => true
        }
      )
      expect([200, 201]).to include(status_code)

      while data.properties.idp_cert_alias.is_set.eql? false
        data, status_code, headers = @console.post_saml_configuration_with_http_info(
          {
            :post => true
          }
        )
        p 'SAML is not configured yet.'
        sleep 2
      end

      expect(data.properties.idp_cert_alias.is_set).to eq(true)

      # create saml

      begin
        data, status_code, headers = @console.post_saml_configuration_with_http_info(
          {
            :post => false,
            :apply => true,
            :action => "ajaxConfigManager",
            :location => nil,
            :path => [
              "/"
            ],
            :service_ranking => 5002,
            :idp_url => "https://federation.prod.com/adfs/ls/IdpInitiatedSignOn.aspx?RequestBinding\=HTTPPost&loginToRp\=https://prod-aemauthor.com/saml_login",
            :idp_cert_alias => "alias_1234",
            :idp_http_redirect => true,
            :service_provider_entity_id => "https://prod-aemauthor.com/saml_login",
            :key_store_password => "unmodified",
            :default_redirect_url => "/sites.html",
            :user_id_attribute => "NameID",
            :use_encryption => false,
            :create_user => true,
            :add_group_memberships => true,
            :group_membership_attribute => "http://temp/variable/aem-groups",
            :default_groups => [
              "def-groups"
            ],
            :name_id_format => "urn:oasis:names:tc:SAML:2.0:nameid-format:transient",
            :synchronize_attributes => [
              "http://schemas.xmlsoap.org/ws/2005/05/identity/claims/givenname\\=profile/givenName",
              "http://schemas.xmlsoap.org/ws/2005/05/identity/claims/surname\\=profile/familyName",
              "http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress\\=profile/email"
            ],
            :handle_logout => true,
            :logout_url => "https://federation.prod.com/adfs/ls/IdpInitiatedSignOn.aspx",
            :clock_tolerance => 60,
            :digest_method => "http://www.w3.org/2001/04/xmlenc#sha256",
            :signature_method => "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256",
            :propertylist => [
              :path,
              :"service.ranking",
              :idpUrl,
              :idpCertAlias,
              :idpHttpRedirect,
              :serviceProviderEntityId,
              :assertionConsumerServiceURL,
              :spPrivateKeyAlias,
              :keyStorePassword,
              :defaultRedirectUrl,
              :userIDAttribute,
              :useEncryption,
              :createUser,
              :userIntermediatePath,
              :addGroupMemberships,
              :groupMembershipAttribute,
              :defaultGroups,
              :nameIdFormat,
              :synchronizeAttributes,
              :handleLogout,
              :logoutUrl,
              :clockTolerance,
              :digestMethod,
              :signatureMethod
            ]
          }
        )
        fail
      rescue SwaggerAemClient::ApiError => err
        expect(err.code).to eq(302)
      end

      # saml should exist after creation
      data, status_code, headers = @console.post_saml_configuration_with_http_info(
        {
          :post => true
        }
      )
      expect(status_code).to eq(200)
      expect(data.properties.idp_cert_alias.is_set).to eq(true)
    end
  end
end

require_relative 'spec_helper'

describe 'Saml' do
  before do
    init_client
    @console = SwaggerAemClient::ConsoleApi.new

    # ensure saml doesn't exist prior to testing
    begin
      data, status_code, headers = @console.post_saml_configuration_with_http_info(
        {
          :delete => ''
        }
      )
      # delete saml when it exists
      expect([200, 204]).to include(status_code)
    rescue SwaggerAemClient::ApiError => err
      # ignore when saml does not exist
      expect([403, 404]).to include(err.code)
    end
  end

  after do
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

      # create saml
      data, status_code, headers = @console.post_saml_configuration_with_http_info(
        {
          :post => true,
          :key_store_password => 'somepassword',
          :service_ranking => 5002,
          :idp_http_redirect => true,
          :create_user => true,
          :default_redirect_url => '/sites.html',
          :user_id_attribute => 'NameID',
          :default_groups => ['def-groups'],
          :idp_cert_alias => 'alias_1234',
          :add_group_memberships => true,
          :path => ['/'],
          :synchronize_attributes => [
            'http://schemas.xmlsoap.org/ws/2005/05/identity/claims/givenname\=profile/givenName',
            'http://schemas.xmlsoap.org/ws/2005/05/identity/claims/surname\=profile/familyName',
            'http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress\=profile/email'
          ],
          :clock_tolerance => 60,
          :group_membership_attribute => 'http://temp/variable/aem-groups',
          :idp_url => 'https://federation.prod.com/adfs/ls/IdpInitiatedSignOn.aspx?RequestBinding\=HTTPPost&loginToRp\=https://prod-aemauthor.com/saml_login',
          :logout_url => 'https://federation.prod.com/adfs/ls/IdpInitiatedSignOn.aspx',
          :service_provider_entity_id => 'https://prod-aemauthor.com/saml_login',
          :handle_logout => true,
          :sp_private_key_alias => '',
          :use_encryption => false,
          :name_id_format => 'urn:oasis:names:tc:SAML:2.0:nameid-format:transient',
          :digest_method => 'http://www.w3.org/2001/04/xmlenc#sha256',
          :signature_method	=> 'http://www.w3.org/2001/04/xmldsig-more#rsa-sha256'
        }
      )
      expect(status_code).to eq(200)

      # saml should exist after creation
      data, status_code, headers = @console.post_saml_configuration_with_http_info(
        {
          :post => true
        }
      )
      expect(status_code).to eq(200)
    end

  end

end

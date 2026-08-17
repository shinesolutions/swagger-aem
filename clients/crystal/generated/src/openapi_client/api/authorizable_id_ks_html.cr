require "json"

module OpenAPIClient
  module Api
  class AuthorizableIdKsHtml
    def initialize(@conn : Connection); end

    # 
    def create(intermediate_path : String, authorizable_id : String, cert_chain : ::File? = nil, pk : ::File? = nil, key_store : ::File? = nil, *, _operation : String? = nil, current_password : String? = nil, new_password : String? = nil, re_password : String? = nil, key_password : String? = nil, key_store_pass : String? = nil, _alias : String? = nil, new_alias : String? = nil, remove_alias : String? = nil) : Response(OpenAPIClient::KeystoreInfo)
      @conn.request(OpenAPIClient::KeystoreInfo,
        method: :POST,
        path: "/{intermediatePath}/{authorizableId}.ks.html".sub("{intermediatePath}", OpenAPIClient.enc(intermediate_path)).sub("{authorizableId}", OpenAPIClient.enc(authorizable_id)),
        query: { ":operation" => _operation, "currentPassword" => current_password, "newPassword" => new_password, "rePassword" => re_password, "keyPassword" => key_password, "keyStorePass" => key_store_pass, "alias" => _alias, "newAlias" => new_alias, "removeAlias" => remove_alias },
        form: Hash(String, Crest::ParamsValue){ "cert-chain" => cert_chain, "pk" => pk, "keyStore" => key_store },
        accept: %w[text/plain],
        raw: true,
        auth: %w[aemAuth])
    end
  end
  end

end

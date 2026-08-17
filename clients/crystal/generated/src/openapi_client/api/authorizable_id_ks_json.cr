require "json"

module OpenAPIClient
  module Api
  class AuthorizableIdKsJson
    def initialize(@conn : Connection); end

    # 
    def list(intermediate_path : String, authorizable_id : String) : Response(OpenAPIClient::KeystoreInfo)
      @conn.request(OpenAPIClient::KeystoreInfo,
        method: :GET,
        path: "/{intermediatePath}/{authorizableId}.ks.json".sub("{intermediatePath}", OpenAPIClient.enc(intermediate_path)).sub("{authorizableId}", OpenAPIClient.enc(authorizable_id)),
        accept: %w[text/plain],
        raw: true,
        auth: %w[aemAuth])
    end
  end
  end

end

require "json"

module OpenAPIClient
  module Api
  class Keystore
    def initialize(@conn : Connection); end

    # 
    def store_p12(intermediate_path : String, authorizable_id : String) : Response(::File)
      @conn.request(::File,
        method: :GET,
        path: "/{intermediatePath}/{authorizableId}/keystore/store.p12".sub("{intermediatePath}", OpenAPIClient.enc(intermediate_path)).sub("{authorizableId}", OpenAPIClient.enc(authorizable_id)),
        accept: %w[application/octet-stream],
        raw: true,
        auth: %w[aemAuth])
    end
  end
  end

end

require "json"

module OpenAPIClient
  module Api
  class Root
    def initialize(@conn : Connection); end

    # 
    def create(path : String, *, jcr_primary_type : String? = nil, _name : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/{path}/".sub("{path}", OpenAPIClient.enc(path)),
        query: { "jcr:primaryType" => jcr_primary_type, ":name" => _name },
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def create_post(path : String, name : String, file : ::File? = nil, *, _operation : String? = nil, delete_authorizable : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/{path}/{name}".sub("{path}", OpenAPIClient.enc(path)).sub("{name}", OpenAPIClient.enc(name)),
        query: { ":operation" => _operation, "deleteAuthorizable" => delete_authorizable },
        form: Hash(String, Crest::ParamsValue){ "file" => file },
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def delete(path : String, name : String) : Response(Nil)
      @conn.request(Nil,
        method: :DELETE,
        path: "/{path}/{name}".sub("{path}", OpenAPIClient.enc(path)).sub("{name}", OpenAPIClient.enc(name)),
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def get(path : String, name : String) : Response(Nil)
      @conn.request(Nil,
        method: :GET,
        path: "/{path}/{name}".sub("{path}", OpenAPIClient.enc(path)).sub("{name}", OpenAPIClient.enc(name)),
        accept: %w[],
        auth: %w[aemAuth])
    end
  end
  end

end

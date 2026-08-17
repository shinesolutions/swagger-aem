require "json"

module OpenAPIClient
  module Api
  class NameRwHtml
    def initialize(@conn : Connection); end

    # 
    def create(path : String, name : String, *, add_members : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/{path}/{name}.rw.html".sub("{path}", OpenAPIClient.enc(path)).sub("{name}", OpenAPIClient.enc(name)),
        query: { "addMembers" => add_members },
        accept: %w[],
        auth: %w[aemAuth])
    end
  end
  end

end

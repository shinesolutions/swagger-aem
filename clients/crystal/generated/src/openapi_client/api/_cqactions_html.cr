require "json"

module OpenAPIClient
  module Api
  class CqactionsHtml
    def initialize(@conn : Connection); end

    # 
    def create(*, authorizable_id : String? = nil, changelog : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/.cqactions.html",
        query: { "authorizableId" => authorizable_id, "changelog" => changelog },
        accept: %w[],
        auth: %w[aemAuth])
    end
  end
  end

end

require "json"

module OpenAPIClient
  module Api
  class Bin
    def initialize(@conn : Connection); end

    # 
    def querybuilder_json(*, path : String? = nil, p_limit : Float64? = nil, _1_property : String? = nil, _1_property_value : String? = nil) : Response(String)
      @conn.request(String,
        method: :GET,
        path: "/bin/querybuilder.json",
        query: { "path" => path, "p.limit" => p_limit, "1_property" => _1_property, "1_property.value" => _1_property_value },
        accept: %w[application/json],
        auth: %w[aemAuth])
    end

    # 
    def querybuilder_json_post(*, path : String? = nil, p_limit : Float64? = nil, _1_property : String? = nil, _1_property_value : String? = nil) : Response(String)
      @conn.request(String,
        method: :POST,
        path: "/bin/querybuilder.json",
        query: { "path" => path, "p.limit" => p_limit, "1_property" => _1_property, "1_property.value" => _1_property_value },
        accept: %w[application/json],
        auth: %w[aemAuth])
    end
  end
  end

end

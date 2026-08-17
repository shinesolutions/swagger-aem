require "json"

module OpenAPIClient
  module Api
  class Etc::Packages
    def initialize(@conn : Connection); end

    # 
    def name_version_zip(group : String, name : String, version : String) : Response(::File)
      @conn.request(::File,
        method: :GET,
        path: "/etc/packages/{group}/{name}-{version}.zip".sub("{group}", OpenAPIClient.enc(group)).sub("{name}", OpenAPIClient.enc(name)).sub("{version}", OpenAPIClient.enc(version)),
        accept: %w[application/octet-stream],
        raw: true,
        auth: %w[aemAuth])
    end

    # 
    def name_version_zip_jcr_content_vlt_definition_filter_tidy_2_json(group : String, name : String, version : String) : Response(String)
      @conn.request(String,
        method: :GET,
        path: "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json".sub("{group}", OpenAPIClient.enc(group)).sub("{name}", OpenAPIClient.enc(name)).sub("{version}", OpenAPIClient.enc(version)),
        accept: %w[application/json],
        auth: %w[aemAuth])
    end
  end
  end

end

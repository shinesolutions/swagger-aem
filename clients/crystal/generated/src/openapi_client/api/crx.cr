require "json"

module OpenAPIClient
  module Api
  class Crx
    def initialize(@conn : Connection); end

    # 
    def explorer_ui_setpassword_jsp(*, old : String? = nil, plain : String? = nil, verify : String? = nil) : Response(String)
      @conn.request(String,
        method: :POST,
        path: "/crx/explorer/ui/setpassword.jsp",
        query: { "old" => old, "plain" => plain, "verify" => verify },
        accept: %w[text/plain],
        raw: true,
        auth: %w[aemAuth])
    end

    # 
    def packmgr_installstatus_jsp() : Response(OpenAPIClient::InstallStatus)
      @conn.request(OpenAPIClient::InstallStatus,
        method: :GET,
        path: "/crx/packmgr/installstatus.jsp",
        accept: %w[application/json],
        auth: %w[aemAuth])
    end

    # 
    def packmgr_service__json(path : String, package : ::File? = nil, *, cmd : String? = nil, group_name : String? = nil, package_name : String? = nil, package_version : String? = nil, _charset_ : String? = nil, force : Bool? = nil, recursive : Bool? = nil) : Response(String)
      @conn.request(String,
        method: :POST,
        path: "/crx/packmgr/service/.json/{path}".sub("{path}", OpenAPIClient.enc(path)),
        query: { "cmd" => cmd, "groupName" => group_name, "packageName" => package_name, "packageVersion" => package_version, "_charset_" => _charset_, "force" => force, "recursive" => recursive },
        form: Hash(String, Crest::ParamsValue){ "package" => package },
        accept: %w[application/json],
        auth: %w[aemAuth])
    end

    # 
    def packmgr_service_jsp(*, cmd : String? = nil) : Response(String)
      @conn.request(String,
        method: :POST,
        path: "/crx/packmgr/service.jsp",
        query: { "cmd" => cmd },
        accept: %w[text/xml],
        raw: true,
        auth: %w[aemAuth])
    end

    # 
    def packmgr_service_script_html() : Response(Nil)
      @conn.request(Nil,
        method: :GET,
        path: "/crx/packmgr/service/script.html",
        accept: %w[text/html],
        raw: true,
        auth: %w[aemAuth])
    end

    # 
    def packmgr_update_jsp(*, group_name : String? = nil, package_name : String? = nil, version : String? = nil, path : String? = nil, filter : String? = nil, _charset_ : String? = nil) : Response(String)
      @conn.request(String,
        method: :POST,
        path: "/crx/packmgr/update.jsp",
        query: { "groupName" => group_name, "packageName" => package_name, "version" => version, "path" => path, "filter" => filter, "_charset_" => _charset_ },
        accept: %w[application/json],
        auth: %w[aemAuth])
    end

    # 
    def server_crx_default_jcr_root__1_json() : Response(String)
      @conn.request(String,
        method: :GET,
        path: "/crx/server/crx.default/jcr:root/.1.json",
        accept: %w[plain/text],
        raw: true,
        auth: %w[aemAuth])
    end
  end
  end

end

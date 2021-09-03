-module(openapi_router).

-export([get_paths/1, get_validator_state/0]).

-type operations() :: #{
    Method :: binary() => openapi_api:operation_id()
}.

-type init_opts()  :: {
    Operations :: operations(),
    LogicHandler :: atom(),
    ValidatorMod :: module()
}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: atom()) ->  [{'_',[{
    Path :: string(),
    Handler :: atom(),
    InitOpts :: init_opts()
}]}].

get_paths(LogicHandler) ->
    ValidatorState = prepare_validator(),
    PreparedPaths = maps:fold(
        fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
            [{Path, Handler, Operations} | Acc]
        end,
        [],
        group_paths()
    ),
    [
        {'_',
            [{P, H, {O, LogicHandler, ValidatorState}} || {P, H, O} <- PreparedPaths]
        }
    ].

group_paths() ->
    maps:fold(
        fun(OperationID, #{path := Path, method := Method, handler := Handler}, Acc) ->
            case maps:find(Path, Acc) of
                {ok, PathInfo0 = #{operations := Operations0}} ->
                    Operations = Operations0#{Method => OperationID},
                    PathInfo = PathInfo0#{operations => Operations},
                    Acc#{Path => PathInfo};
                error ->
                    Operations = #{Method => OperationID},
                    PathInfo = #{handler => Handler, operations => Operations},
                    Acc#{Path => PathInfo}
            end
        end,
        #{},
        get_operations()
    ).

get_operations() ->
    #{ 
        'GetAemProductInfo' => #{
            path => "/system/console/status-productinfo.json",
            method => <<"GET">>,
            handler => 'openapi_console_handler'
        },
        'GetBundleInfo' => #{
            path => "/system/console/bundles/:name.json",
            method => <<"GET">>,
            handler => 'openapi_console_handler'
        },
        'GetConfigMgr' => #{
            path => "/system/console/configMgr",
            method => <<"GET">>,
            handler => 'openapi_console_handler'
        },
        'PostBundle' => #{
            path => "/system/console/bundles/:name",
            method => <<"POST">>,
            handler => 'openapi_console_handler'
        },
        'PostJmxRepository' => #{
            path => "/system/console/jmx/com.adobe.granite:type=Repository/op/:action",
            method => <<"POST">>,
            handler => 'openapi_console_handler'
        },
        'PostSamlConfiguration' => #{
            path => "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler",
            method => <<"POST">>,
            handler => 'openapi_console_handler'
        },
        'GetLoginPage' => #{
            path => "/libs/granite/core/content/login.html",
            method => <<"GET">>,
            handler => 'openapi_cq_handler'
        },
        'PostCqActions' => #{
            path => "/.cqactions.html",
            method => <<"POST">>,
            handler => 'openapi_cq_handler'
        },
        'GetCrxdeStatus' => #{
            path => "/crx/server/crx.default/jcr:root/.1.json",
            method => <<"GET">>,
            handler => 'openapi_crx_handler'
        },
        'GetInstallStatus' => #{
            path => "/crx/packmgr/installstatus.jsp",
            method => <<"GET">>,
            handler => 'openapi_crx_handler'
        },
        'GetPackageManagerServlet' => #{
            path => "/crx/packmgr/service/script.html",
            method => <<"GET">>,
            handler => 'openapi_crx_handler'
        },
        'PostPackageService' => #{
            path => "/crx/packmgr/service.jsp",
            method => <<"POST">>,
            handler => 'openapi_crx_handler'
        },
        'PostPackageServiceJson' => #{
            path => "/crx/packmgr/service/.json/:path",
            method => <<"POST">>,
            handler => 'openapi_crx_handler'
        },
        'PostPackageUpdate' => #{
            path => "/crx/packmgr/update.jsp",
            method => <<"POST">>,
            handler => 'openapi_crx_handler'
        },
        'PostSetPassword' => #{
            path => "/crx/explorer/ui/setpassword.jsp",
            method => <<"POST">>,
            handler => 'openapi_crx_handler'
        },
        'GetAemHealthCheck' => #{
            path => "/system/health",
            method => <<"GET">>,
            handler => 'openapi_custom_handler'
        },
        'PostConfigAemHealthCheckServlet' => #{
            path => "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_custom_handler'
        },
        'PostConfigAemPasswordReset' => #{
            path => "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator",
            method => <<"POST">>,
            handler => 'openapi_custom_handler'
        },
        'SslSetup' => #{
            path => "/libs/granite/security/post/sslSetup.html",
            method => <<"POST">>,
            handler => 'openapi_granite_handler'
        },
        'DeleteAgent' => #{
            path => "/etc/replication/agents.:runmode/:name",
            method => <<"DELETE">>,
            handler => 'openapi_sling_handler'
        },
        'DeleteNode' => #{
            path => "/:path/:name",
            method => <<"DELETE">>,
            handler => 'openapi_sling_handler'
        },
        'GetAgent' => #{
            path => "/etc/replication/agents.:runmode/:name",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
        'GetAgents' => #{
            path => "/etc/replication/agents.:runmode.-1.json",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
        'GetAuthorizableKeystore' => #{
            path => "/:intermediatePath/:authorizableId.ks.json",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
        'GetKeystore' => #{
            path => "/:intermediatePath/:authorizableId/keystore/store.p12",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
        'GetNode' => #{
            path => "/:path/:name",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
        'GetPackage' => #{
            path => "/etc/packages/:group/:name-:version.zip",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
        'GetPackageFilter' => #{
            path => "/etc/packages/:group/:name-:version.zip/jcr:content/vlt:definition/filter.tidy.2.json",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
        'GetQuery' => #{
            path => "/bin/querybuilder.json",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
        'GetTruststore' => #{
            path => "/etc/truststore/truststore.p12",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
        'GetTruststoreInfo' => #{
            path => "/libs/granite/security/truststore.json",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
        'PostAgent' => #{
            path => "/etc/replication/agents.:runmode/:name",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostAuthorizableKeystore' => #{
            path => "/:intermediatePath/:authorizableId.ks.html",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostAuthorizables' => #{
            path => "/libs/granite/security/post/authorizables",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostConfigAdobeGraniteSamlAuthenticationHandler' => #{
            path => "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostConfigApacheFelixJettyBasedHttpService' => #{
            path => "/apps/system/config/org.apache.felix.http",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostConfigApacheHttpComponentsProxyConfiguration' => #{
            path => "/apps/system/config/org.apache.http.proxyconfigurator.config",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostConfigApacheSlingDavExServlet' => #{
            path => "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostConfigApacheSlingGetServlet' => #{
            path => "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostConfigApacheSlingReferrerFilter' => #{
            path => "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostConfigProperty' => #{
            path => "/apps/system/config/:configNodeName",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostNode' => #{
            path => "/:path/:name",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostNodeRw' => #{
            path => "/:path/:name.rw.html",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostPath' => #{
            path => "/:path/",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostQuery' => #{
            path => "/bin/querybuilder.json",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostTreeActivation' => #{
            path => "/etc/replication/treeactivation.html",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostTruststore' => #{
            path => "/libs/granite/security/post/truststore",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
        'PostTruststorePKCS12' => #{
            path => "/etc/truststore",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        }
    }.

get_validator_state() ->
    persistent_term:get({?MODULE, validator_state}).


prepare_validator() ->
    R = jsx:decode(element(2, file:read_file(get_openapi_path()))),
    JesseState = jesse_state:new(R, [{default_schema_ver, <<"http://json-schema.org/draft-04/schema#">>}]),
    persistent_term:put({?MODULE, validator_state}, JesseState),
    ?MODULE.


get_openapi_path() ->
    {ok, AppName} = application:get_application(?MODULE),
    filename:join(openapi_utils:priv_dir(AppName), "openapi.json").



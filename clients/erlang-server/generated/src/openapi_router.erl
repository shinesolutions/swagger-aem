-module(openapi_router).

-export([get_paths/1]).

-type method() :: binary().
-type operations() :: #{method() => openapi_api:operation_id()}.
-type init_opts()  :: {operations(), module()}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: module()) -> cowboy_router:routes().
get_paths(LogicHandler) ->
    PreparedPaths = maps:fold(
                      fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
                              [{Path, Handler, Operations} | Acc]
                      end, [], group_paths()
                     ),
    [{'_', [{P, H, {O, LogicHandler}} || {P, H, O} <- PreparedPaths]}].

group_paths() ->
    maps:fold(
      fun(OperationID, #{servers := Servers, base_path := BasePath, path := Path,
                         method := Method, handler := Handler}, Acc) ->
              FullPaths = build_full_paths(Servers, BasePath, Path),
              merge_paths(FullPaths, OperationID, Method, Handler, Acc)
      end, #{}, get_operations()).

build_full_paths([], BasePath, Path) ->
    [lists:append([BasePath, Path])];
build_full_paths(Servers, _BasePath, Path) ->
    [lists:append([Server, Path]) || Server <- Servers ].

merge_paths(FullPaths, OperationID, Method, Handler, Acc) ->
    lists:foldl(
      fun(Path, Acc0) ->
              case maps:find(Path, Acc0) of
                  {ok, PathInfo0 = #{operations := Operations0}} ->
                      Operations = Operations0#{Method => OperationID},
                      PathInfo = PathInfo0#{operations => Operations},
                      Acc0#{Path => PathInfo};
                  error ->
                      Operations = #{Method => OperationID},
                      PathInfo = #{handler => Handler, operations => Operations},
                      Acc0#{Path => PathInfo}
              end
      end, Acc, FullPaths).

get_operations() ->
    #{ 
       'getAemProductInfo' => #{
            servers => [],
            base_path => "",
            path => "/system/console/status-productinfo.json",
            method => <<"GET">>,
            handler => 'openapi_console_handler'
        },
       'getBundleInfo' => #{
            servers => [],
            base_path => "",
            path => "/system/console/bundles/:name.json",
            method => <<"GET">>,
            handler => 'openapi_console_handler'
        },
       'getConfigMgr' => #{
            servers => [],
            base_path => "",
            path => "/system/console/configMgr",
            method => <<"GET">>,
            handler => 'openapi_console_handler'
        },
       'postBundle' => #{
            servers => [],
            base_path => "",
            path => "/system/console/bundles/:name",
            method => <<"POST">>,
            handler => 'openapi_console_handler'
        },
       'postJmxRepository' => #{
            servers => [],
            base_path => "",
            path => "/system/console/jmx/com.adobe.granite:type=Repository/op/:action",
            method => <<"POST">>,
            handler => 'openapi_console_handler'
        },
       'postSamlConfiguration' => #{
            servers => [],
            base_path => "",
            path => "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler",
            method => <<"POST">>,
            handler => 'openapi_console_handler'
        },
       'getLoginPage' => #{
            servers => [],
            base_path => "",
            path => "/libs/granite/core/content/login.html",
            method => <<"GET">>,
            handler => 'openapi_cq_handler'
        },
       'postCqActions' => #{
            servers => [],
            base_path => "",
            path => "/.cqactions.html",
            method => <<"POST">>,
            handler => 'openapi_cq_handler'
        },
       'getCrxdeStatus' => #{
            servers => [],
            base_path => "",
            path => "/crx/server/crx.default/jcr:root/.1.json",
            method => <<"GET">>,
            handler => 'openapi_crx_handler'
        },
       'getInstallStatus' => #{
            servers => [],
            base_path => "",
            path => "/crx/packmgr/installstatus.jsp",
            method => <<"GET">>,
            handler => 'openapi_crx_handler'
        },
       'getPackageManagerServlet' => #{
            servers => [],
            base_path => "",
            path => "/crx/packmgr/service/script.html",
            method => <<"GET">>,
            handler => 'openapi_crx_handler'
        },
       'postPackageService' => #{
            servers => [],
            base_path => "",
            path => "/crx/packmgr/service.jsp",
            method => <<"POST">>,
            handler => 'openapi_crx_handler'
        },
       'postPackageServiceJson' => #{
            servers => [],
            base_path => "",
            path => "/crx/packmgr/service/.json/:path",
            method => <<"POST">>,
            handler => 'openapi_crx_handler'
        },
       'postPackageUpdate' => #{
            servers => [],
            base_path => "",
            path => "/crx/packmgr/update.jsp",
            method => <<"POST">>,
            handler => 'openapi_crx_handler'
        },
       'postSetPassword' => #{
            servers => [],
            base_path => "",
            path => "/crx/explorer/ui/setpassword.jsp",
            method => <<"POST">>,
            handler => 'openapi_crx_handler'
        },
       'getAemHealthCheck' => #{
            servers => [],
            base_path => "",
            path => "/system/health",
            method => <<"GET">>,
            handler => 'openapi_custom_handler'
        },
       'postConfigAemHealthCheckServlet' => #{
            servers => [],
            base_path => "",
            path => "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_custom_handler'
        },
       'postConfigAemPasswordReset' => #{
            servers => [],
            base_path => "",
            path => "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator",
            method => <<"POST">>,
            handler => 'openapi_custom_handler'
        },
       'sslSetup' => #{
            servers => [],
            base_path => "",
            path => "/libs/granite/security/post/sslSetup.html",
            method => <<"POST">>,
            handler => 'openapi_granite_handler'
        },
       'deleteAgent' => #{
            servers => [],
            base_path => "",
            path => "/etc/replication/agents.:runmode/:name",
            method => <<"DELETE">>,
            handler => 'openapi_sling_handler'
        },
       'deleteNode' => #{
            servers => [],
            base_path => "",
            path => "/:path/:name",
            method => <<"DELETE">>,
            handler => 'openapi_sling_handler'
        },
       'getAgent' => #{
            servers => [],
            base_path => "",
            path => "/etc/replication/agents.:runmode/:name",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
       'getAgents' => #{
            servers => [],
            base_path => "",
            path => "/etc/replication/agents.:runmode.-1.json",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
       'getAuthorizableKeystore' => #{
            servers => [],
            base_path => "",
            path => "/:intermediatePath/:authorizableId.ks.json",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
       'getKeystore' => #{
            servers => [],
            base_path => "",
            path => "/:intermediatePath/:authorizableId/keystore/store.p12",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
       'getNode' => #{
            servers => [],
            base_path => "",
            path => "/:path/:name",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
       'getPackage' => #{
            servers => [],
            base_path => "",
            path => "/etc/packages/:group/:name-:version.zip",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
       'getPackageFilter' => #{
            servers => [],
            base_path => "",
            path => "/etc/packages/:group/:name-:version.zip/jcr:content/vlt:definition/filter.tidy.2.json",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
       'getQuery' => #{
            servers => [],
            base_path => "",
            path => "/bin/querybuilder.json",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
       'getTruststore' => #{
            servers => [],
            base_path => "",
            path => "/etc/truststore/truststore.p12",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
       'getTruststoreInfo' => #{
            servers => [],
            base_path => "",
            path => "/libs/granite/security/truststore.json",
            method => <<"GET">>,
            handler => 'openapi_sling_handler'
        },
       'postAgent' => #{
            servers => [],
            base_path => "",
            path => "/etc/replication/agents.:runmode/:name",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postAuthorizableKeystore' => #{
            servers => [],
            base_path => "",
            path => "/:intermediatePath/:authorizableId.ks.html",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postAuthorizables' => #{
            servers => [],
            base_path => "",
            path => "/libs/granite/security/post/authorizables",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postConfigAdobeGraniteSamlAuthenticationHandler' => #{
            servers => [],
            base_path => "",
            path => "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postConfigApacheFelixJettyBasedHttpService' => #{
            servers => [],
            base_path => "",
            path => "/apps/system/config/org.apache.felix.http",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postConfigApacheHttpComponentsProxyConfiguration' => #{
            servers => [],
            base_path => "",
            path => "/apps/system/config/org.apache.http.proxyconfigurator.config",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postConfigApacheSlingDavExServlet' => #{
            servers => [],
            base_path => "",
            path => "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postConfigApacheSlingGetServlet' => #{
            servers => [],
            base_path => "",
            path => "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postConfigApacheSlingReferrerFilter' => #{
            servers => [],
            base_path => "",
            path => "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postConfigProperty' => #{
            servers => [],
            base_path => "",
            path => "/apps/system/config/:configNodeName",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postNode' => #{
            servers => [],
            base_path => "",
            path => "/:path/:name",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postNodeRw' => #{
            servers => [],
            base_path => "",
            path => "/:path/:name.rw.html",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postPath' => #{
            servers => [],
            base_path => "",
            path => "/:path/",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postQuery' => #{
            servers => [],
            base_path => "",
            path => "/bin/querybuilder.json",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postTreeActivation' => #{
            servers => [],
            base_path => "",
            path => "/libs/replication/treeactivation.html",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postTruststore' => #{
            servers => [],
            base_path => "",
            path => "/libs/granite/security/post/truststore",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        },
       'postTruststorePKCS12' => #{
            servers => [],
            base_path => "",
            path => "/etc/truststore",
            method => <<"POST">>,
            handler => 'openapi_sling_handler'
        }
    }.

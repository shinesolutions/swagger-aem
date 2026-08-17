-module(openapi_statem).

-behaviour(proper_statem).

-include("openapi.hrl").
-include_lib("proper/include/proper_common.hrl").
-include_lib("stdlib/include/assert.hrl").

-compile(export_all).
-compile(nowarn_export_all).

-include("openapi_statem.hrl").

%%==============================================================================
%% The statem's property
%%==============================================================================

prop_main() ->
  setup(),
  ?FORALL( Cmds
         , proper_statem:commands(?MODULE)
         , begin
             cleanup(),
             { History
             , State
             , Result
             } = proper_statem:run_commands(?MODULE, Cmds),
             ?WHENFAIL(
                io:format("History: ~p\nState: ~p\nResult: ~p\nCmds: ~p\n",
                          [ History
                          , State
                          , Result
                          , proper_statem:command_names(Cmds)
                          ]),
                proper:aggregate( proper_statem:command_names(Cmds)
                                , Result =:= ok
                                )
               )
           end
         ).

%%==============================================================================
%% Setup
%%==============================================================================

setup() -> ok.

%%==============================================================================
%% Cleanup
%%==============================================================================

cleanup() -> ok.

%%==============================================================================
%% Initial State
%%==============================================================================

initial_state() -> #{}.

%%==============================================================================
%% delete_agent
%%==============================================================================

delete_agent(Runmode, Name) ->
  openapi_api:delete_agent(Runmode, Name).

delete_agent_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% delete_node
%%==============================================================================

delete_node(Path, Name) ->
  openapi_api:delete_node(Path, Name).

delete_node_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% get_agent
%%==============================================================================

get_agent(Runmode, Name) ->
  openapi_api:get_agent(Runmode, Name).

get_agent_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% get_agents
%%==============================================================================

get_agents(Runmode) ->
  openapi_api:get_agents(Runmode).

get_agents_args(_S) ->
  [binary()].

%%==============================================================================
%% get_authorizable_keystore
%%==============================================================================

get_authorizable_keystore(IntermediatePath, AuthorizableId) ->
  openapi_api:get_authorizable_keystore(IntermediatePath, AuthorizableId).

get_authorizable_keystore_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% get_keystore
%%==============================================================================

get_keystore(IntermediatePath, AuthorizableId) ->
  openapi_api:get_keystore(IntermediatePath, AuthorizableId).

get_keystore_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% get_node
%%==============================================================================

get_node(Path, Name) ->
  openapi_api:get_node(Path, Name).

get_node_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% get_package
%%==============================================================================

get_package(Group, Name, Version) ->
  openapi_api:get_package(Group, Name, Version).

get_package_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% get_package_filter
%%==============================================================================

get_package_filter(Group, Name, Version) ->
  openapi_api:get_package_filter(Group, Name, Version).

get_package_filter_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% get_query
%%==============================================================================

get_query(Path, PLimit, 1Property, 1PropertyValue) ->
  openapi_api:get_query(Path, PLimit, 1Property, 1PropertyValue).

get_query_args(_S) ->
  [binary(), integer(), binary(), binary()].

%%==============================================================================
%% get_truststore
%%==============================================================================

get_truststore() ->
  openapi_api:get_truststore().

get_truststore_args(_S) ->
  [].

%%==============================================================================
%% get_truststore_info
%%==============================================================================

get_truststore_info() ->
  openapi_api:get_truststore_info().

get_truststore_info_args(_S) ->
  [].

%%==============================================================================
%% post_agent
%%==============================================================================

post_agent(Runmode, Name) ->
  openapi_api:post_agent(Runmode, Name).

post_agent_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% post_authorizable_keystore
%%==============================================================================

post_authorizable_keystore(IntermediatePath, AuthorizableId) ->
  openapi_api:post_authorizable_keystore(IntermediatePath, AuthorizableId).

post_authorizable_keystore_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% post_authorizables
%%==============================================================================

post_authorizables(AuthorizableId, IntermediatePath) ->
  openapi_api:post_authorizables(AuthorizableId, IntermediatePath).

post_authorizables_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% post_config_adobe_granite_saml_authentication_handler
%%==============================================================================

post_config_adobe_granite_saml_authentication_handler() ->
  openapi_api:post_config_adobe_granite_saml_authentication_handler().

post_config_adobe_granite_saml_authentication_handler_args(_S) ->
  [].

%%==============================================================================
%% post_config_apache_felix_jetty_based_http_service
%%==============================================================================

post_config_apache_felix_jetty_based_http_service() ->
  openapi_api:post_config_apache_felix_jetty_based_http_service().

post_config_apache_felix_jetty_based_http_service_args(_S) ->
  [].

%%==============================================================================
%% post_config_apache_http_components_proxy_configuration
%%==============================================================================

post_config_apache_http_components_proxy_configuration() ->
  openapi_api:post_config_apache_http_components_proxy_configuration().

post_config_apache_http_components_proxy_configuration_args(_S) ->
  [].

%%==============================================================================
%% post_config_apache_sling_dav_ex_servlet
%%==============================================================================

post_config_apache_sling_dav_ex_servlet() ->
  openapi_api:post_config_apache_sling_dav_ex_servlet().

post_config_apache_sling_dav_ex_servlet_args(_S) ->
  [].

%%==============================================================================
%% post_config_apache_sling_get_servlet
%%==============================================================================

post_config_apache_sling_get_servlet() ->
  openapi_api:post_config_apache_sling_get_servlet().

post_config_apache_sling_get_servlet_args(_S) ->
  [].

%%==============================================================================
%% post_config_apache_sling_referrer_filter
%%==============================================================================

post_config_apache_sling_referrer_filter() ->
  openapi_api:post_config_apache_sling_referrer_filter().

post_config_apache_sling_referrer_filter_args(_S) ->
  [].

%%==============================================================================
%% post_config_property
%%==============================================================================

post_config_property(ConfigNodeName) ->
  openapi_api:post_config_property(ConfigNodeName).

post_config_property_args(_S) ->
  [binary()].

%%==============================================================================
%% post_node
%%==============================================================================

post_node(Path, Name) ->
  openapi_api:post_node(Path, Name).

post_node_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% post_node_rw
%%==============================================================================

post_node_rw(Path, Name) ->
  openapi_api:post_node_rw(Path, Name).

post_node_rw_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% post_path
%%==============================================================================

post_path(Path, JcrPrimaryType, Name) ->
  openapi_api:post_path(Path, JcrPrimaryType, Name).

post_path_args(_S) ->
  [binary(), binary(), binary()].

%%==============================================================================
%% post_query
%%==============================================================================

post_query(Path, PLimit, 1Property, 1PropertyValue) ->
  openapi_api:post_query(Path, PLimit, 1Property, 1PropertyValue).

post_query_args(_S) ->
  [binary(), integer(), binary(), binary()].

%%==============================================================================
%% post_tree_activation
%%==============================================================================

post_tree_activation(Ignoredeactivated, Onlymodified, Path, Cmd) ->
  openapi_api:post_tree_activation(Ignoredeactivated, Onlymodified, Path, Cmd).

post_tree_activation_args(_S) ->
  [boolean(), boolean(), binary(), binary()].

%%==============================================================================
%% post_truststore
%%==============================================================================

post_truststore() ->
  openapi_api:post_truststore().

post_truststore_args(_S) ->
  [].

%%==============================================================================
%% post_truststore_pkcs12
%%==============================================================================

post_truststore_pkcs12() ->
  openapi_api:post_truststore_pkcs12().

post_truststore_pkcs12_args(_S) ->
  [].


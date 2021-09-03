-module(openapi_console_api).

-export([get_aem_product_info/1, get_aem_product_info/2,
         get_bundle_info/2, get_bundle_info/3,
         get_config_mgr/1, get_config_mgr/2,
         post_bundle/3, post_bundle/4,
         post_jmx_repository/2, post_jmx_repository/3,
         post_saml_configuration/1, post_saml_configuration/2]).

-define(BASE_URL, <<"">>).

%% @doc 
%% 
-spec get_aem_product_info(ctx:ctx()) -> {ok, [binary()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_aem_product_info(Ctx) ->
    get_aem_product_info(Ctx, #{}).

-spec get_aem_product_info(ctx:ctx(), maps:map()) -> {ok, [binary()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_aem_product_info(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/system/console/status-productinfo.json">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec get_bundle_info(ctx:ctx(), binary()) -> {ok, openapi_bundle_info:openapi_bundle_info(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_bundle_info(Ctx, Name) ->
    get_bundle_info(Ctx, Name, #{}).

-spec get_bundle_info(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_bundle_info:openapi_bundle_info(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_bundle_info(Ctx, Name, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/system/console/bundles/", Name, ".json">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec get_config_mgr(ctx:ctx()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_config_mgr(Ctx) ->
    get_config_mgr(Ctx, #{}).

-spec get_config_mgr(ctx:ctx(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_config_mgr(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/system/console/configMgr">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_bundle(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_bundle(Ctx, Name, Action) ->
    post_bundle(Ctx, Name, Action, #{}).

-spec post_bundle(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_bundle(Ctx, Name, Action, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/system/console/bundles/", Name, "">>],
    QS = lists:flatten([{<<"action">>, Action}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_jmx_repository(ctx:ctx(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_jmx_repository(Ctx, Action) ->
    post_jmx_repository(Ctx, Action, #{}).

-spec post_jmx_repository(ctx:ctx(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_jmx_repository(Ctx, Action, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/system/console/jmx/com.adobe.granite:type=Repository/op/", Action, "">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_saml_configuration(ctx:ctx()) -> {ok, openapi_saml_configuration_info:openapi_saml_configuration_info(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_saml_configuration(Ctx) ->
    post_saml_configuration(Ctx, #{}).

-spec post_saml_configuration(ctx:ctx(), maps:map()) -> {ok, openapi_saml_configuration_info:openapi_saml_configuration_info(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_saml_configuration(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['post', 'apply', 'delete', 'action', '$location', 'path', 'service.ranking', 'idpUrl', 'idpCertAlias', 'idpHttpRedirect', 'serviceProviderEntityId', 'assertionConsumerServiceURL', 'spPrivateKeyAlias', 'keyStorePassword', 'defaultRedirectUrl', 'userIDAttribute', 'useEncryption', 'createUser', 'addGroupMemberships', 'groupMembershipAttribute', 'defaultGroups', 'nameIdFormat', 'synchronizeAttributes', 'handleLogout', 'logoutUrl', 'clockTolerance', 'digestMethod', 'signatureMethod', 'userIntermediatePath', 'propertylist'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).



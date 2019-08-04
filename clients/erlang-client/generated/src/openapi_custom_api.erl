-module(openapi_custom_api).

-export([get_aem_health_check/1, get_aem_health_check/2,
         post_config_aem_health_check_servlet/1, post_config_aem_health_check_servlet/2,
         post_config_aem_password_reset/1, post_config_aem_password_reset/2]).

-define(BASE_URL, "/").

%% @doc 
%% 
-spec get_aem_health_check(ctx:ctx()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_aem_health_check(Ctx) ->
    get_aem_health_check(Ctx, #{}).

-spec get_aem_health_check(ctx:ctx(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_aem_health_check(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/system/health"],
    QS = lists:flatten([])++openapi_utils:optional_params(['tags', 'combineTagsOr'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_config_aem_health_check_servlet(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_aem_health_check_servlet(Ctx) ->
    post_config_aem_health_check_servlet(Ctx, #{}).

-spec post_config_aem_health_check_servlet(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_aem_health_check_servlet(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck"],
    QS = lists:flatten([])++openapi_utils:optional_params(['bundles.ignored', 'bundles.ignored@TypeHint'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_config_aem_password_reset(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_aem_password_reset(Ctx) ->
    post_config_aem_password_reset(Ctx, #{}).

-spec post_config_aem_password_reset(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_aem_password_reset(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/apps/system/config/com.shinesolutions.aem.passwordreset.Activator"],
    QS = lists:flatten([])++openapi_utils:optional_params(['pwdreset.authorizables', 'pwdreset.authorizables@TypeHint'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).



-module(openapi_crx_api).

-export([get_crxde_status/1, get_crxde_status/2,
         get_install_status/1, get_install_status/2,
         get_package_manager_servlet/1, get_package_manager_servlet/2,
         post_package_service/2, post_package_service/3,
         post_package_service_json/3, post_package_service_json/4,
         post_package_update/5, post_package_update/6,
         post_set_password/4, post_set_password/5]).

-define(BASE_URL, <<"">>).

%% @doc 
%% 
-spec get_crxde_status(ctx:ctx()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_crxde_status(Ctx) ->
    get_crxde_status(Ctx, #{}).

-spec get_crxde_status(ctx:ctx(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_crxde_status(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/crx/server/crx.default/jcr:root/.1.json">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec get_install_status(ctx:ctx()) -> {ok, openapi_install_status:openapi_install_status(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_install_status(Ctx) ->
    get_install_status(Ctx, #{}).

-spec get_install_status(ctx:ctx(), maps:map()) -> {ok, openapi_install_status:openapi_install_status(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_install_status(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/crx/packmgr/installstatus.jsp">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec get_package_manager_servlet(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_package_manager_servlet(Ctx) ->
    get_package_manager_servlet(Ctx, #{}).

-spec get_package_manager_servlet(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_package_manager_servlet(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/crx/packmgr/service/script.html">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_package_service(ctx:ctx(), binary()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_package_service(Ctx, Cmd) ->
    post_package_service(Ctx, Cmd, #{}).

-spec post_package_service(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_package_service(Ctx, Cmd, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/crx/packmgr/service.jsp">>],
    QS = lists:flatten([{<<"cmd">>, Cmd}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_package_service_json(ctx:ctx(), binary(), binary()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_package_service_json(Ctx, Path, Cmd) ->
    post_package_service_json(Ctx, Path, Cmd, #{}).

-spec post_package_service_json(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_package_service_json(Ctx, Path, Cmd, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/crx/packmgr/service/.json/", Path, "">>],
    QS = lists:flatten([{<<"cmd">>, Cmd}])++openapi_utils:optional_params(['groupName', 'packageName', 'packageVersion', '_charset_', 'force', 'recursive'], _OptionalParams),
    Headers = [],
    Body1 = {form, []++openapi_utils:optional_params(['package'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_package_update(ctx:ctx(), binary(), binary(), binary(), binary()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_package_update(Ctx, GroupName, PackageName, Version, Path) ->
    post_package_update(Ctx, GroupName, PackageName, Version, Path, #{}).

-spec post_package_update(ctx:ctx(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_package_update(Ctx, GroupName, PackageName, Version, Path, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/crx/packmgr/update.jsp">>],
    QS = lists:flatten([{<<"groupName">>, GroupName}, {<<"packageName">>, PackageName}, {<<"version">>, Version}, {<<"path">>, Path}])++openapi_utils:optional_params(['filter', '_charset_'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_set_password(ctx:ctx(), binary(), binary(), binary()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_set_password(Ctx, Old, Plain, Verify) ->
    post_set_password(Ctx, Old, Plain, Verify, #{}).

-spec post_set_password(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_set_password(Ctx, Old, Plain, Verify, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/crx/explorer/ui/setpassword.jsp">>],
    QS = lists:flatten([{<<"old">>, Old}, {<<"plain">>, Plain}, {<<"verify">>, Verify}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).



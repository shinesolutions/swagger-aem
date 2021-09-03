-module(openapi_granite_api).

-export([ssl_setup/7, ssl_setup/8]).

-define(BASE_URL, <<"">>).

%% @doc 
%% 
-spec ssl_setup(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ssl_setup(Ctx, KeystorePassword, KeystorePasswordConfirm, TruststorePassword, TruststorePasswordConfirm, HttpsHostname, HttpsPort) ->
    ssl_setup(Ctx, KeystorePassword, KeystorePasswordConfirm, TruststorePassword, TruststorePasswordConfirm, HttpsHostname, HttpsPort, #{}).

-spec ssl_setup(ctx:ctx(), binary(), binary(), binary(), binary(), binary(), binary(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ssl_setup(Ctx, KeystorePassword, KeystorePasswordConfirm, TruststorePassword, TruststorePasswordConfirm, HttpsHostname, HttpsPort, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = [<<"/libs/granite/security/post/sslSetup.html">>],
    QS = lists:flatten([{<<"keystorePassword">>, KeystorePassword}, {<<"keystorePasswordConfirm">>, KeystorePasswordConfirm}, {<<"truststorePassword">>, TruststorePassword}, {<<"truststorePasswordConfirm">>, TruststorePasswordConfirm}, {<<"httpsHostname">>, HttpsHostname}, {<<"httpsPort">>, HttpsPort}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = {form, []++openapi_utils:optional_params(['privatekeyFile', 'certificateFile'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).



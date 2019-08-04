-module(openapi_sling_api).

-export([delete_agent/3, delete_agent/4,
         delete_node/3, delete_node/4,
         get_agent/3, get_agent/4,
         get_agents/2, get_agents/3,
         get_authorizable_keystore/3, get_authorizable_keystore/4,
         get_keystore/3, get_keystore/4,
         get_node/3, get_node/4,
         get_package/4, get_package/5,
         get_package_filter/4, get_package_filter/5,
         get_query/5, get_query/6,
         get_truststore/1, get_truststore/2,
         get_truststore_info/1, get_truststore_info/2,
         post_agent/3, post_agent/4,
         post_authorizable_keystore/3, post_authorizable_keystore/4,
         post_authorizables/3, post_authorizables/4,
         post_config_adobe_granite_saml_authentication_handler/1, post_config_adobe_granite_saml_authentication_handler/2,
         post_config_apache_felix_jetty_based_http_service/1, post_config_apache_felix_jetty_based_http_service/2,
         post_config_apache_http_components_proxy_configuration/1, post_config_apache_http_components_proxy_configuration/2,
         post_config_apache_sling_dav_ex_servlet/1, post_config_apache_sling_dav_ex_servlet/2,
         post_config_apache_sling_get_servlet/1, post_config_apache_sling_get_servlet/2,
         post_config_apache_sling_referrer_filter/1, post_config_apache_sling_referrer_filter/2,
         post_node/3, post_node/4,
         post_node_rw/3, post_node_rw/4,
         post_path/4, post_path/5,
         post_query/5, post_query/6,
         post_tree_activation/4, post_tree_activation/5,
         post_truststore/1, post_truststore/2,
         post_truststore_pkcs12/1, post_truststore_pkcs12/2]).

-define(BASE_URL, "/").

%% @doc 
%% 
-spec delete_agent(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_agent(Ctx, Runmode, Name) ->
    delete_agent(Ctx, Runmode, Name, #{}).

-spec delete_agent(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_agent(Ctx, Runmode, Name, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/etc/replication/agents.", Runmode, "/", Name, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec delete_node(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_node(Ctx, Path, Name) ->
    delete_node(Ctx, Path, Name, #{}).

-spec delete_node(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
delete_node(Ctx, Path, Name, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = delete,
    Path = ["/", Path, "/", Name, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec get_agent(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_agent(Ctx, Runmode, Name) ->
    get_agent(Ctx, Runmode, Name, #{}).

-spec get_agent(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_agent(Ctx, Runmode, Name, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/etc/replication/agents.", Runmode, "/", Name, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec get_agents(ctx:ctx(), binary()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_agents(Ctx, Runmode) ->
    get_agents(Ctx, Runmode, #{}).

-spec get_agents(ctx:ctx(), binary(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_agents(Ctx, Runmode, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/etc/replication/agents.", Runmode, ".-1.json"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec get_authorizable_keystore(ctx:ctx(), binary(), binary()) -> {ok, openapi_keystore_info:openapi_keystore_info(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_authorizable_keystore(Ctx, IntermediatePath, AuthorizableId) ->
    get_authorizable_keystore(Ctx, IntermediatePath, AuthorizableId, #{}).

-spec get_authorizable_keystore(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_keystore_info:openapi_keystore_info(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_authorizable_keystore(Ctx, IntermediatePath, AuthorizableId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/", IntermediatePath, "/", AuthorizableId, ".ks.json"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec get_keystore(ctx:ctx(), binary(), binary()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_keystore(Ctx, IntermediatePath, AuthorizableId) ->
    get_keystore(Ctx, IntermediatePath, AuthorizableId, #{}).

-spec get_keystore(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_keystore(Ctx, IntermediatePath, AuthorizableId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/", IntermediatePath, "/", AuthorizableId, "/keystore/store.p12"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec get_node(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_node(Ctx, Path, Name) ->
    get_node(Ctx, Path, Name, #{}).

-spec get_node(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_node(Ctx, Path, Name, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/", Path, "/", Name, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec get_package(ctx:ctx(), binary(), binary(), binary()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_package(Ctx, Group, Name, Version) ->
    get_package(Ctx, Group, Name, Version, #{}).

-spec get_package(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_package(Ctx, Group, Name, Version, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/etc/packages/", Group, "/", Name, "-", Version, ".zip"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec get_package_filter(ctx:ctx(), binary(), binary(), binary()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_package_filter(Ctx, Group, Name, Version) ->
    get_package_filter(Ctx, Group, Name, Version, #{}).

-spec get_package_filter(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_package_filter(Ctx, Group, Name, Version, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/etc/packages/", Group, "/", Name, "-", Version, ".zip/jcr:content/vlt:definition/filter.tidy.2.json"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec get_query(ctx:ctx(), binary(), integer(), binary(), binary()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_query(Ctx, Path, PLimit, 1Property, 1PropertyValue) ->
    get_query(Ctx, Path, PLimit, 1Property, 1PropertyValue, #{}).

-spec get_query(ctx:ctx(), binary(), integer(), binary(), binary(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_query(Ctx, Path, PLimit, 1Property, 1PropertyValue, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/bin/querybuilder.json"],
    QS = lists:flatten([{<<"path">>, Path}, {<<"p.limit">>, PLimit}, {<<"1_property">>, 1Property}, {<<"1_property.value">>, 1PropertyValue}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec get_truststore(ctx:ctx()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_truststore(Ctx) ->
    get_truststore(Ctx, #{}).

-spec get_truststore(ctx:ctx(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_truststore(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/etc/truststore/truststore.p12"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec get_truststore_info(ctx:ctx()) -> {ok, openapi_truststore_info:openapi_truststore_info(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_truststore_info(Ctx) ->
    get_truststore_info(Ctx, #{}).

-spec get_truststore_info(ctx:ctx(), maps:map()) -> {ok, openapi_truststore_info:openapi_truststore_info(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_truststore_info(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/libs/granite/security/truststore.json"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_agent(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_agent(Ctx, Runmode, Name) ->
    post_agent(Ctx, Runmode, Name, #{}).

-spec post_agent(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_agent(Ctx, Runmode, Name, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/etc/replication/agents.", Runmode, "/", Name, ""],
    QS = lists:flatten([])++openapi_utils:optional_params(['jcr:content/cq:distribute', 'jcr:content/cq:distribute@TypeHint', 'jcr:content/cq:name', 'jcr:content/cq:template', 'jcr:content/enabled', 'jcr:content/jcr:description', 'jcr:content/jcr:lastModified', 'jcr:content/jcr:lastModifiedBy', 'jcr:content/jcr:mixinTypes', 'jcr:content/jcr:title', 'jcr:content/logLevel', 'jcr:content/noStatusUpdate', 'jcr:content/noVersioning', 'jcr:content/protocolConnectTimeout', 'jcr:content/protocolHTTPConnectionClosed', 'jcr:content/protocolHTTPExpired', 'jcr:content/protocolHTTPHeaders', 'jcr:content/protocolHTTPHeaders@TypeHint', 'jcr:content/protocolHTTPMethod', 'jcr:content/protocolHTTPSRelaxed', 'jcr:content/protocolInterface', 'jcr:content/protocolSocketTimeout', 'jcr:content/protocolVersion', 'jcr:content/proxyNTLMDomain', 'jcr:content/proxyNTLMHost', 'jcr:content/proxyHost', 'jcr:content/proxyPassword', 'jcr:content/proxyPort', 'jcr:content/proxyUser', 'jcr:content/queueBatchMaxSize', 'jcr:content/queueBatchMode', 'jcr:content/queueBatchWaitTime', 'jcr:content/retryDelay', 'jcr:content/reverseReplication', 'jcr:content/serializationType', 'jcr:content/sling:resourceType', 'jcr:content/ssl', 'jcr:content/transportNTLMDomain', 'jcr:content/transportNTLMHost', 'jcr:content/transportPassword', 'jcr:content/transportUri', 'jcr:content/transportUser', 'jcr:content/triggerDistribute', 'jcr:content/triggerModified', 'jcr:content/triggerOnOffTime', 'jcr:content/triggerReceive', 'jcr:content/triggerSpecific', 'jcr:content/userId', 'jcr:primaryType', ':operation'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_authorizable_keystore(ctx:ctx(), binary(), binary()) -> {ok, openapi_keystore_info:openapi_keystore_info(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_authorizable_keystore(Ctx, IntermediatePath, AuthorizableId) ->
    post_authorizable_keystore(Ctx, IntermediatePath, AuthorizableId, #{}).

-spec post_authorizable_keystore(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_keystore_info:openapi_keystore_info(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_authorizable_keystore(Ctx, IntermediatePath, AuthorizableId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/", IntermediatePath, "/", AuthorizableId, ".ks.html"],
    QS = lists:flatten([])++openapi_utils:optional_params([':operation', 'currentPassword', 'newPassword', 'rePassword', 'keyPassword', 'keyStorePass', 'alias', 'newAlias', 'removeAlias'], _OptionalParams),
    Headers = [],
    Body1 = {form, []++openapi_utils:optional_params(['cert-chain', 'pk', 'keyStore'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_authorizables(ctx:ctx(), binary(), binary()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_authorizables(Ctx, AuthorizableId, IntermediatePath) ->
    post_authorizables(Ctx, AuthorizableId, IntermediatePath, #{}).

-spec post_authorizables(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_authorizables(Ctx, AuthorizableId, IntermediatePath, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/libs/granite/security/post/authorizables"],
    QS = lists:flatten([{<<"authorizableId">>, AuthorizableId}, {<<"intermediatePath">>, IntermediatePath}])++openapi_utils:optional_params([, 'createUser', 'createGroup', 'rep:password', 'profile/givenName'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_config_adobe_granite_saml_authentication_handler(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_adobe_granite_saml_authentication_handler(Ctx) ->
    post_config_adobe_granite_saml_authentication_handler(Ctx, #{}).

-spec post_config_adobe_granite_saml_authentication_handler(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_adobe_granite_saml_authentication_handler(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config"],
    QS = lists:flatten([])++openapi_utils:optional_params(['keyStorePassword', 'keyStorePassword@TypeHint', 'service.ranking', 'service.ranking@TypeHint', 'idpHttpRedirect', 'idpHttpRedirect@TypeHint', 'createUser', 'createUser@TypeHint', 'defaultRedirectUrl', 'defaultRedirectUrl@TypeHint', 'userIDAttribute', 'userIDAttribute@TypeHint', 'defaultGroups', 'defaultGroups@TypeHint', 'idpCertAlias', 'idpCertAlias@TypeHint', 'addGroupMemberships', 'addGroupMemberships@TypeHint', 'path', 'path@TypeHint', 'synchronizeAttributes', 'synchronizeAttributes@TypeHint', 'clockTolerance', 'clockTolerance@TypeHint', 'groupMembershipAttribute', 'groupMembershipAttribute@TypeHint', 'idpUrl', 'idpUrl@TypeHint', 'logoutUrl', 'logoutUrl@TypeHint', 'serviceProviderEntityId', 'serviceProviderEntityId@TypeHint', 'assertionConsumerServiceURL', 'assertionConsumerServiceURL@TypeHint', 'handleLogout', 'handleLogout@TypeHint', 'spPrivateKeyAlias', 'spPrivateKeyAlias@TypeHint', 'useEncryption', 'useEncryption@TypeHint', 'nameIdFormat', 'nameIdFormat@TypeHint', 'digestMethod', 'digestMethod@TypeHint', 'signatureMethod', 'signatureMethod@TypeHint', 'userIntermediatePath', 'userIntermediatePath@TypeHint'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_config_apache_felix_jetty_based_http_service(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_apache_felix_jetty_based_http_service(Ctx) ->
    post_config_apache_felix_jetty_based_http_service(Ctx, #{}).

-spec post_config_apache_felix_jetty_based_http_service(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_apache_felix_jetty_based_http_service(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/apps/system/config/org.apache.felix.http"],
    QS = lists:flatten([])++openapi_utils:optional_params(['org.apache.felix.https.nio', 'org.apache.felix.https.nio@TypeHint', 'org.apache.felix.https.keystore', 'org.apache.felix.https.keystore@TypeHint', 'org.apache.felix.https.keystore.password', 'org.apache.felix.https.keystore.password@TypeHint', 'org.apache.felix.https.keystore.key', 'org.apache.felix.https.keystore.key@TypeHint', 'org.apache.felix.https.keystore.key.password', 'org.apache.felix.https.keystore.key.password@TypeHint', 'org.apache.felix.https.truststore', 'org.apache.felix.https.truststore@TypeHint', 'org.apache.felix.https.truststore.password', 'org.apache.felix.https.truststore.password@TypeHint', 'org.apache.felix.https.clientcertificate', 'org.apache.felix.https.clientcertificate@TypeHint', 'org.apache.felix.https.enable', 'org.apache.felix.https.enable@TypeHint', 'org.osgi.service.http.port.secure', 'org.osgi.service.http.port.secure@TypeHint'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_config_apache_http_components_proxy_configuration(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_apache_http_components_proxy_configuration(Ctx) ->
    post_config_apache_http_components_proxy_configuration(Ctx, #{}).

-spec post_config_apache_http_components_proxy_configuration(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_apache_http_components_proxy_configuration(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/apps/system/config/org.apache.http.proxyconfigurator.config"],
    QS = lists:flatten([])++openapi_utils:optional_params(['proxy.host', 'proxy.host@TypeHint', 'proxy.port', 'proxy.port@TypeHint', 'proxy.exceptions', 'proxy.exceptions@TypeHint', 'proxy.enabled', 'proxy.enabled@TypeHint', 'proxy.user', 'proxy.user@TypeHint', 'proxy.password', 'proxy.password@TypeHint'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_config_apache_sling_dav_ex_servlet(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_apache_sling_dav_ex_servlet(Ctx) ->
    post_config_apache_sling_dav_ex_servlet(Ctx, #{}).

-spec post_config_apache_sling_dav_ex_servlet(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_apache_sling_dav_ex_servlet(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet"],
    QS = lists:flatten([])++openapi_utils:optional_params(['alias', 'alias@TypeHint', 'dav.create-absolute-uri', 'dav.create-absolute-uri@TypeHint'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_config_apache_sling_get_servlet(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_apache_sling_get_servlet(Ctx) ->
    post_config_apache_sling_get_servlet(Ctx, #{}).

-spec post_config_apache_sling_get_servlet(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_apache_sling_get_servlet(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet"],
    QS = lists:flatten([])++openapi_utils:optional_params(['json.maximumresults', 'json.maximumresults@TypeHint', 'enable.html', 'enable.html@TypeHint', 'enable.txt', 'enable.txt@TypeHint', 'enable.xml', 'enable.xml@TypeHint'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_config_apache_sling_referrer_filter(ctx:ctx()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_apache_sling_referrer_filter(Ctx) ->
    post_config_apache_sling_referrer_filter(Ctx, #{}).

-spec post_config_apache_sling_referrer_filter(ctx:ctx(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_config_apache_sling_referrer_filter(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/apps/system/config/org.apache.sling.security.impl.ReferrerFilter"],
    QS = lists:flatten([])++openapi_utils:optional_params(['allow.empty', 'allow.empty@TypeHint', 'allow.hosts', 'allow.hosts@TypeHint', 'allow.hosts.regexp', 'allow.hosts.regexp@TypeHint', 'filter.methods', 'filter.methods@TypeHint'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_node(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_node(Ctx, Path, Name) ->
    post_node(Ctx, Path, Name, #{}).

-spec post_node(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_node(Ctx, Path, Name, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/", Path, "/", Name, ""],
    QS = lists:flatten([])++openapi_utils:optional_params([':operation', 'deleteAuthorizable'], _OptionalParams),
    Headers = [],
    Body1 = {form, []++openapi_utils:optional_params(['file'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_node_rw(ctx:ctx(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_node_rw(Ctx, Path, Name) ->
    post_node_rw(Ctx, Path, Name, #{}).

-spec post_node_rw(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_node_rw(Ctx, Path, Name, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/", Path, "/", Name, ".rw.html"],
    QS = lists:flatten([])++openapi_utils:optional_params(['addMembers'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_path(ctx:ctx(), binary(), binary(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_path(Ctx, Path, JcrprimaryType, Name) ->
    post_path(Ctx, Path, JcrprimaryType, Name, #{}).

-spec post_path(ctx:ctx(), binary(), binary(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_path(Ctx, Path, JcrprimaryType, Name, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/", Path, "/"],
    QS = lists:flatten([{<<"jcr:primaryType">>, JcrprimaryType}, {<<":name">>, Name}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_query(ctx:ctx(), binary(), integer(), binary(), binary()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_query(Ctx, Path, PLimit, 1Property, 1PropertyValue) ->
    post_query(Ctx, Path, PLimit, 1Property, 1PropertyValue, #{}).

-spec post_query(ctx:ctx(), binary(), integer(), binary(), binary(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_query(Ctx, Path, PLimit, 1Property, 1PropertyValue, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/bin/querybuilder.json"],
    QS = lists:flatten([{<<"path">>, Path}, {<<"p.limit">>, PLimit}, {<<"1_property">>, 1Property}, {<<"1_property.value">>, 1PropertyValue}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_tree_activation(ctx:ctx(), boolean(), boolean(), binary()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_tree_activation(Ctx, Ignoredeactivated, Onlymodified, Path) ->
    post_tree_activation(Ctx, Ignoredeactivated, Onlymodified, Path, #{}).

-spec post_tree_activation(ctx:ctx(), boolean(), boolean(), binary(), maps:map()) -> {ok, [], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_tree_activation(Ctx, Ignoredeactivated, Onlymodified, Path, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/etc/replication/treeactivation.html"],
    QS = lists:flatten([{<<"ignoredeactivated">>, Ignoredeactivated}, {<<"onlymodified">>, Onlymodified}, {<<"path">>, Path}])++openapi_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_truststore(ctx:ctx()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_truststore(Ctx) ->
    post_truststore(Ctx, #{}).

-spec post_truststore(ctx:ctx(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_truststore(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/libs/granite/security/post/truststore"],
    QS = lists:flatten([])++openapi_utils:optional_params([':operation', 'newPassword', 'rePassword', 'keyStoreType', 'removeAlias'], _OptionalParams),
    Headers = [],
    Body1 = {form, []++openapi_utils:optional_params(['certificate'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc 
%% 
-spec post_truststore_pkcs12(ctx:ctx()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_truststore_pkcs12(Ctx) ->
    post_truststore_pkcs12(Ctx, #{}).

-spec post_truststore_pkcs12(ctx:ctx(), maps:map()) -> {ok, binary(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
post_truststore_pkcs12(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = post,
    Path = ["/etc/truststore"],
    QS = [],
    Headers = [],
    Body1 = {form, []++openapi_utils:optional_params(['truststore.p12'], _OptionalParams)},
    ContentTypeHeader = openapi_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).



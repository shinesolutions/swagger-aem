-module(openapi_api).

-export([ delete_agent/2
        , delete_node/2
        , get_agent/2
        , get_agents/1
        , get_authorizable_keystore/2
        , get_keystore/2
        , get_node/2
        , get_package/3
        , get_package_filter/3
        , get_query/4
        , get_truststore/0
        , get_truststore_info/0
        , post_agent/2
        , post_authorizable_keystore/2
        , post_authorizables/2
        , post_config_adobe_granite_saml_authentication_handler/0
        , post_config_apache_felix_jetty_based_http_service/0
        , post_config_apache_http_components_proxy_configuration/0
        , post_config_apache_sling_dav_ex_servlet/0
        , post_config_apache_sling_get_servlet/0
        , post_config_apache_sling_referrer_filter/0
        , post_config_property/1
        , post_node/2
        , post_node_rw/2
        , post_path/3
        , post_query/4
        , post_tree_activation/4
        , post_truststore/0
        , post_truststore_pkcs12/0
        ]).

-define(BASE_URL, "").

%% @doc 
%% 
-spec delete_agent(binary(), binary()) ->
  openapi_utils:response().
delete_agent(Runmode, Name) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/etc/replication/agents.", Runmode, "/", Name, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc 
%% 
-spec delete_node(binary(), binary()) ->
  openapi_utils:response().
delete_node(Path, Name) ->
  Method      = delete,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/", Path, "/", Name, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc 
%% 
-spec get_agent(binary(), binary()) ->
  openapi_utils:response().
get_agent(Runmode, Name) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/etc/replication/agents.", Runmode, "/", Name, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc 
%% 
-spec get_agents(binary()) ->
  openapi_utils:response().
get_agents(Runmode) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/etc/replication/agents.", Runmode, ".-1.json"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc 
%% 
-spec get_authorizable_keystore(binary(), binary()) ->
  openapi_utils:response().
get_authorizable_keystore(IntermediatePath, AuthorizableId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/", IntermediatePath, "/", AuthorizableId, ".ks.json"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc 
%% 
-spec get_keystore(binary(), binary()) ->
  openapi_utils:response().
get_keystore(IntermediatePath, AuthorizableId) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/", IntermediatePath, "/", AuthorizableId, "/keystore/store.p12"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc 
%% 
-spec get_node(binary(), binary()) ->
  openapi_utils:response().
get_node(Path, Name) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/", Path, "/", Name, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc 
%% 
-spec get_package(binary(), binary(), binary()) ->
  openapi_utils:response().
get_package(Group, Name, Version) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/etc/packages/", Group, "/", Name, "-", Version, ".zip"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc 
%% 
-spec get_package_filter(binary(), binary(), binary()) ->
  openapi_utils:response().
get_package_filter(Group, Name, Version) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/etc/packages/", Group, "/", Name, "-", Version, ".zip/jcr:content/vlt:definition/filter.tidy.2.json"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc 
%% 
-spec get_query(binary(), integer(), binary(), binary()) ->
  openapi_utils:response().
get_query(Path, PLimit, 1Property, 1PropertyValue) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/bin/querybuilder.json"],
  QueryString = [<<"path=">>, Path, <<"&">>, <<"p.limit=">>, PLimit, <<"&">>, <<"1_property=">>, 1Property, <<"&">>, <<"1_property.value=">>, 1PropertyValue, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc 
%% 
-spec get_truststore() ->
  openapi_utils:response().
get_truststore() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/etc/truststore/truststore.p12"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc 
%% 
-spec get_truststore_info() ->
  openapi_utils:response().
get_truststore_info() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/libs/granite/security/truststore.json"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc 
%% 
-spec post_agent(binary(), binary()) ->
  openapi_utils:response().
post_agent(Runmode, Name) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/etc/replication/agents.", Runmode, "/", Name, ""],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"jcr:content/cq:distribute=">>, JcrContentCqDistribute, <<"&">>, <<"jcr:content/cq:distribute@TypeHint=">>, JcrContentCqDistributeTypeHint, <<"&">>, <<"jcr:content/cq:name=">>, JcrContentCqName, <<"&">>, <<"jcr:content/cq:template=">>, JcrContentCqTemplate, <<"&">>, <<"jcr:content/aliasUpdate=">>, JcrContentAliasUpdate, <<"&">>, <<"jcr:content/enabled=">>, JcrContentEnabled, <<"&">>, <<"jcr:content/jcr:description=">>, JcrContentJcrDescription, <<"&">>, <<"jcr:content/jcr:lastModified=">>, JcrContentJcrLastModified, <<"&">>, <<"jcr:content/jcr:lastModifiedBy=">>, JcrContentJcrLastModifiedBy, <<"&">>, <<"jcr:content/jcr:mixinTypes=">>, JcrContentJcrMixinTypes, <<"&">>, <<"jcr:content/jcr:title=">>, JcrContentJcrTitle, <<"&">>, <<"jcr:content/logLevel=">>, JcrContentLogLevel, <<"&">>, <<"jcr:content/noStatusUpdate=">>, JcrContentNoStatusUpdate, <<"&">>, <<"jcr:content/noVersioning=">>, JcrContentNoVersioning, <<"&">>, <<"jcr:content/protocolConnectTimeout=">>, JcrContentProtocolConnectTimeout, <<"&">>, <<"jcr:content/protocolHTTPConnectionClosed=">>, JcrContentProtocolHTTPConnectionClosed, <<"&">>, <<"jcr:content/protocolHTTPExpired=">>, JcrContentProtocolHTTPExpired, <<"&">>, <<"jcr:content/protocolHTTPHeaders=">>, JcrContentProtocolHTTPHeaders, <<"&">>, <<"jcr:content/protocolHTTPHeaders@TypeHint=">>, JcrContentProtocolHTTPHeadersTypeHint, <<"&">>, <<"jcr:content/protocolHTTPMethod=">>, JcrContentProtocolHTTPMethod, <<"&">>, <<"jcr:content/protocolHTTPSRelaxed=">>, JcrContentProtocolHTTPSRelaxed, <<"&">>, <<"jcr:content/protocolInterface=">>, JcrContentProtocolInterface, <<"&">>, <<"jcr:content/protocolSocketTimeout=">>, JcrContentProtocolSocketTimeout, <<"&">>, <<"jcr:content/protocolVersion=">>, JcrContentProtocolVersion, <<"&">>, <<"jcr:content/proxyNTLMDomain=">>, JcrContentProxyNTLMDomain, <<"&">>, <<"jcr:content/proxyNTLMHost=">>, JcrContentProxyNTLMHost, <<"&">>, <<"jcr:content/proxyHost=">>, JcrContentProxyHost, <<"&">>, <<"jcr:content/proxyPassword=">>, JcrContentProxyPassword, <<"&">>, <<"jcr:content/proxyPort=">>, JcrContentProxyPort, <<"&">>, <<"jcr:content/proxyUser=">>, JcrContentProxyUser, <<"&">>, <<"jcr:content/queueBatchMaxSize=">>, JcrContentQueueBatchMaxSize, <<"&">>, <<"jcr:content/queueBatchMode=">>, JcrContentQueueBatchMode, <<"&">>, <<"jcr:content/queueBatchWaitTime=">>, JcrContentQueueBatchWaitTime, <<"&">>, <<"jcr:content/retryDelay=">>, JcrContentRetryDelay, <<"&">>, <<"jcr:content/reverseReplication=">>, JcrContentReverseReplication, <<"&">>, <<"jcr:content/serializationType=">>, JcrContentSerializationType, <<"&">>, <<"jcr:content/sling:resourceType=">>, JcrContentSlingResourceType, <<"&">>, <<"jcr:content/ssl=">>, JcrContentSsl, <<"&">>, <<"jcr:content/transportNTLMDomain=">>, JcrContentTransportNTLMDomain, <<"&">>, <<"jcr:content/transportNTLMHost=">>, JcrContentTransportNTLMHost, <<"&">>, <<"jcr:content/transportPassword=">>, JcrContentTransportPassword, <<"&">>, <<"jcr:content/transportUri=">>, JcrContentTransportUri, <<"&">>, <<"jcr:content/transportUser=">>, JcrContentTransportUser, <<"&">>, <<"jcr:content/triggerDistribute=">>, JcrContentTriggerDistribute, <<"&">>, <<"jcr:content/triggerModified=">>, JcrContentTriggerModified, <<"&">>, <<"jcr:content/triggerOnOffTime=">>, JcrContentTriggerOnOffTime, <<"&">>, <<"jcr:content/triggerReceive=">>, JcrContentTriggerReceive, <<"&">>, <<"jcr:content/triggerSpecific=">>, JcrContentTriggerSpecific, <<"&">>, <<"jcr:content/userId=">>, JcrContentUserId, <<"&">>, <<"jcr:primaryType=">>, JcrPrimaryType, <<"&">>, <<":operation=">>, Operation, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_authorizable_keystore(binary(), binary()) ->
  openapi_utils:response().
post_authorizable_keystore(IntermediatePath, AuthorizableId) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/", IntermediatePath, "/", AuthorizableId, ".ks.html"],
  Body        = {form, []++openapi_utils:optional_params(['cert-chain', 'pk', 'keyStore'], _OptionalParams)},
  ContentType = hd(["multipart/form-data"]),
  QueryString = [<<":operation=">>, Operation, <<"&">>, <<"currentPassword=">>, CurrentPassword, <<"&">>, <<"newPassword=">>, NewPassword, <<"&">>, <<"rePassword=">>, RePassword, <<"&">>, <<"keyPassword=">>, KeyPassword, <<"&">>, <<"keyStorePass=">>, KeyStorePass, <<"&">>, <<"alias=">>, Alias, <<"&">>, <<"newAlias=">>, NewAlias, <<"&">>, <<"removeAlias=">>, RemoveAlias, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_authorizables(binary(), binary()) ->
  openapi_utils:response().
post_authorizables(AuthorizableId, IntermediatePath) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/libs/granite/security/post/authorizables"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"authorizableId=">>, AuthorizableId, <<"&">>, <<"intermediatePath=">>, IntermediatePath, <<"&">>, <<"createUser=">>, CreateUser, <<"&">>, <<"createGroup=">>, CreateGroup, <<"&">>, <<"rep:password=">>, RepPassword, <<"&">>, <<"profile/givenName=">>, ProfileGivenName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_config_adobe_granite_saml_authentication_handler() ->
  openapi_utils:response().
post_config_adobe_granite_saml_authentication_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"keyStorePassword=">>, KeyStorePassword, <<"&">>, <<"keyStorePassword@TypeHint=">>, KeyStorePasswordTypeHint, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"service.ranking@TypeHint=">>, ServiceRankingTypeHint, <<"&">>, <<"idpHttpRedirect=">>, IdpHttpRedirect, <<"&">>, <<"idpHttpRedirect@TypeHint=">>, IdpHttpRedirectTypeHint, <<"&">>, <<"createUser=">>, CreateUser, <<"&">>, <<"createUser@TypeHint=">>, CreateUserTypeHint, <<"&">>, <<"defaultRedirectUrl=">>, DefaultRedirectUrl, <<"&">>, <<"defaultRedirectUrl@TypeHint=">>, DefaultRedirectUrlTypeHint, <<"&">>, <<"userIDAttribute=">>, UserIDAttribute, <<"&">>, <<"userIDAttribute@TypeHint=">>, UserIDAttributeTypeHint, <<"&">>, <<"defaultGroups=">>, DefaultGroups, <<"&">>, <<"defaultGroups@TypeHint=">>, DefaultGroupsTypeHint, <<"&">>, <<"idpCertAlias=">>, IdpCertAlias, <<"&">>, <<"idpCertAlias@TypeHint=">>, IdpCertAliasTypeHint, <<"&">>, <<"addGroupMemberships=">>, AddGroupMemberships, <<"&">>, <<"addGroupMemberships@TypeHint=">>, AddGroupMembershipsTypeHint, <<"&">>, <<"path=">>, Path, <<"&">>, <<"path@TypeHint=">>, PathTypeHint, <<"&">>, <<"synchronizeAttributes=">>, SynchronizeAttributes, <<"&">>, <<"synchronizeAttributes@TypeHint=">>, SynchronizeAttributesTypeHint, <<"&">>, <<"clockTolerance=">>, ClockTolerance, <<"&">>, <<"clockTolerance@TypeHint=">>, ClockToleranceTypeHint, <<"&">>, <<"groupMembershipAttribute=">>, GroupMembershipAttribute, <<"&">>, <<"groupMembershipAttribute@TypeHint=">>, GroupMembershipAttributeTypeHint, <<"&">>, <<"idpUrl=">>, IdpUrl, <<"&">>, <<"idpUrl@TypeHint=">>, IdpUrlTypeHint, <<"&">>, <<"logoutUrl=">>, LogoutUrl, <<"&">>, <<"logoutUrl@TypeHint=">>, LogoutUrlTypeHint, <<"&">>, <<"serviceProviderEntityId=">>, ServiceProviderEntityId, <<"&">>, <<"serviceProviderEntityId@TypeHint=">>, ServiceProviderEntityIdTypeHint, <<"&">>, <<"assertionConsumerServiceURL=">>, AssertionConsumerServiceURL, <<"&">>, <<"assertionConsumerServiceURL@TypeHint=">>, AssertionConsumerServiceURLTypeHint, <<"&">>, <<"handleLogout=">>, HandleLogout, <<"&">>, <<"handleLogout@TypeHint=">>, HandleLogoutTypeHint, <<"&">>, <<"spPrivateKeyAlias=">>, SpPrivateKeyAlias, <<"&">>, <<"spPrivateKeyAlias@TypeHint=">>, SpPrivateKeyAliasTypeHint, <<"&">>, <<"useEncryption=">>, UseEncryption, <<"&">>, <<"useEncryption@TypeHint=">>, UseEncryptionTypeHint, <<"&">>, <<"nameIdFormat=">>, NameIdFormat, <<"&">>, <<"nameIdFormat@TypeHint=">>, NameIdFormatTypeHint, <<"&">>, <<"digestMethod=">>, DigestMethod, <<"&">>, <<"digestMethod@TypeHint=">>, DigestMethodTypeHint, <<"&">>, <<"signatureMethod=">>, SignatureMethod, <<"&">>, <<"signatureMethod@TypeHint=">>, SignatureMethodTypeHint, <<"&">>, <<"userIntermediatePath=">>, UserIntermediatePath, <<"&">>, <<"userIntermediatePath@TypeHint=">>, UserIntermediatePathTypeHint, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_config_apache_felix_jetty_based_http_service() ->
  openapi_utils:response().
post_config_apache_felix_jetty_based_http_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/apps/system/config/org.apache.felix.http"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"org.apache.felix.https.nio=">>, OrgApacheFelixHttpsNio, <<"&">>, <<"org.apache.felix.https.nio@TypeHint=">>, OrgApacheFelixHttpsNioTypeHint, <<"&">>, <<"org.apache.felix.https.keystore=">>, OrgApacheFelixHttpsKeystore, <<"&">>, <<"org.apache.felix.https.keystore@TypeHint=">>, OrgApacheFelixHttpsKeystoreTypeHint, <<"&">>, <<"org.apache.felix.https.keystore.password=">>, OrgApacheFelixHttpsKeystorePassword, <<"&">>, <<"org.apache.felix.https.keystore.password@TypeHint=">>, OrgApacheFelixHttpsKeystorePasswordTypeHint, <<"&">>, <<"org.apache.felix.https.keystore.key=">>, OrgApacheFelixHttpsKeystoreKey, <<"&">>, <<"org.apache.felix.https.keystore.key@TypeHint=">>, OrgApacheFelixHttpsKeystoreKeyTypeHint, <<"&">>, <<"org.apache.felix.https.keystore.key.password=">>, OrgApacheFelixHttpsKeystoreKeyPassword, <<"&">>, <<"org.apache.felix.https.keystore.key.password@TypeHint=">>, OrgApacheFelixHttpsKeystoreKeyPasswordTypeHint, <<"&">>, <<"org.apache.felix.https.truststore=">>, OrgApacheFelixHttpsTruststore, <<"&">>, <<"org.apache.felix.https.truststore@TypeHint=">>, OrgApacheFelixHttpsTruststoreTypeHint, <<"&">>, <<"org.apache.felix.https.truststore.password=">>, OrgApacheFelixHttpsTruststorePassword, <<"&">>, <<"org.apache.felix.https.truststore.password@TypeHint=">>, OrgApacheFelixHttpsTruststorePasswordTypeHint, <<"&">>, <<"org.apache.felix.https.clientcertificate=">>, OrgApacheFelixHttpsClientcertificate, <<"&">>, <<"org.apache.felix.https.clientcertificate@TypeHint=">>, OrgApacheFelixHttpsClientcertificateTypeHint, <<"&">>, <<"org.apache.felix.https.enable=">>, OrgApacheFelixHttpsEnable, <<"&">>, <<"org.apache.felix.https.enable@TypeHint=">>, OrgApacheFelixHttpsEnableTypeHint, <<"&">>, <<"org.osgi.service.http.port.secure=">>, OrgOsgiServiceHttpPortSecure, <<"&">>, <<"org.osgi.service.http.port.secure@TypeHint=">>, OrgOsgiServiceHttpPortSecureTypeHint, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_config_apache_http_components_proxy_configuration() ->
  openapi_utils:response().
post_config_apache_http_components_proxy_configuration() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/apps/system/config/org.apache.http.proxyconfigurator.config"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"proxy.host=">>, ProxyHost, <<"&">>, <<"proxy.host@TypeHint=">>, ProxyHostTypeHint, <<"&">>, <<"proxy.port=">>, ProxyPort, <<"&">>, <<"proxy.port@TypeHint=">>, ProxyPortTypeHint, <<"&">>, <<"proxy.exceptions=">>, ProxyExceptions, <<"&">>, <<"proxy.exceptions@TypeHint=">>, ProxyExceptionsTypeHint, <<"&">>, <<"proxy.enabled=">>, ProxyEnabled, <<"&">>, <<"proxy.enabled@TypeHint=">>, ProxyEnabledTypeHint, <<"&">>, <<"proxy.user=">>, ProxyUser, <<"&">>, <<"proxy.user@TypeHint=">>, ProxyUserTypeHint, <<"&">>, <<"proxy.password=">>, ProxyPassword, <<"&">>, <<"proxy.password@TypeHint=">>, ProxyPasswordTypeHint, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_config_apache_sling_dav_ex_servlet() ->
  openapi_utils:response().
post_config_apache_sling_dav_ex_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"alias=">>, Alias, <<"&">>, <<"alias@TypeHint=">>, AliasTypeHint, <<"&">>, <<"dav.create-absolute-uri=">>, DavCreateAbsoluteUri, <<"&">>, <<"dav.create-absolute-uri@TypeHint=">>, DavCreateAbsoluteUriTypeHint, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_config_apache_sling_get_servlet() ->
  openapi_utils:response().
post_config_apache_sling_get_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"json.maximumresults=">>, JsonMaximumresults, <<"&">>, <<"json.maximumresults@TypeHint=">>, JsonMaximumresultsTypeHint, <<"&">>, <<"enable.html=">>, EnableHtml, <<"&">>, <<"enable.html@TypeHint=">>, EnableHtmlTypeHint, <<"&">>, <<"enable.txt=">>, EnableTxt, <<"&">>, <<"enable.txt@TypeHint=">>, EnableTxtTypeHint, <<"&">>, <<"enable.xml=">>, EnableXml, <<"&">>, <<"enable.xml@TypeHint=">>, EnableXmlTypeHint, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_config_apache_sling_referrer_filter() ->
  openapi_utils:response().
post_config_apache_sling_referrer_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/apps/system/config/org.apache.sling.security.impl.ReferrerFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"allow.empty=">>, AllowEmpty, <<"&">>, <<"allow.empty@TypeHint=">>, AllowEmptyTypeHint, <<"&">>, <<"allow.hosts=">>, AllowHosts, <<"&">>, <<"allow.hosts@TypeHint=">>, AllowHostsTypeHint, <<"&">>, <<"allow.hosts.regexp=">>, AllowHostsRegexp, <<"&">>, <<"allow.hosts.regexp@TypeHint=">>, AllowHostsRegexpTypeHint, <<"&">>, <<"filter.methods=">>, FilterMethods, <<"&">>, <<"filter.methods@TypeHint=">>, FilterMethodsTypeHint, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_config_property(binary()) ->
  openapi_utils:response().
post_config_property(ConfigNodeName) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/apps/system/config/", ConfigNodeName, ""],
  Body        = [],
  ContentType = "text/plain",

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_node(binary(), binary()) ->
  openapi_utils:response().
post_node(Path, Name) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/", Path, "/", Name, ""],
  Body        = {form, []++openapi_utils:optional_params(['file'], _OptionalParams)},
  ContentType = hd(["multipart/form-data"]),
  QueryString = [<<":operation=">>, Operation, <<"&">>, <<"deleteAuthorizable=">>, DeleteAuthorizable, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_node_rw(binary(), binary()) ->
  openapi_utils:response().
post_node_rw(Path, Name) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/", Path, "/", Name, ".rw.html"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"addMembers=">>, AddMembers, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_path(binary(), binary(), binary()) ->
  openapi_utils:response().
post_path(Path, JcrPrimaryType, Name) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/", Path, "/"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"jcr:primaryType=">>, JcrPrimaryType, <<"&">>, <<":name=">>, Name, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_query(binary(), integer(), binary(), binary()) ->
  openapi_utils:response().
post_query(Path, PLimit, 1Property, 1PropertyValue) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/bin/querybuilder.json"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"path=">>, Path, <<"&">>, <<"p.limit=">>, PLimit, <<"&">>, <<"1_property=">>, 1Property, <<"&">>, <<"1_property.value=">>, 1PropertyValue, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_tree_activation(boolean(), boolean(), binary(), binary()) ->
  openapi_utils:response().
post_tree_activation(Ignoredeactivated, Onlymodified, Path, Cmd) ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/libs/replication/treeactivation.html"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"ignoredeactivated=">>, Ignoredeactivated, <<"&">>, <<"onlymodified=">>, Onlymodified, <<"&">>, <<"path=">>, Path, <<"&">>, <<"cmd=">>, Cmd, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_truststore() ->
  openapi_utils:response().
post_truststore() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/libs/granite/security/post/truststore"],
  Body        = {form, []++openapi_utils:optional_params(['certificate'], _OptionalParams)},
  ContentType = hd(["multipart/form-data"]),
  QueryString = [<<":operation=">>, Operation, <<"&">>, <<"newPassword=">>, NewPassword, <<"&">>, <<"rePassword=">>, RePassword, <<"&">>, <<"keyStoreType=">>, KeyStoreType, <<"&">>, <<"removeAlias=">>, RemoveAlias, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec post_truststore_pkcs12() ->
  openapi_utils:response().
post_truststore_pkcs12() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/etc/truststore"],
  Body        = {form, []++openapi_utils:optional_params(['truststore.p12'], _OptionalParams)},
  ContentType = hd(["multipart/form-data"]),

  openapi_utils:request(Method, [Host, ?BASE_URL, Path], jsx:encode(Body), ContentType).


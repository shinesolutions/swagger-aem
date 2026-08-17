-module(openapi_api).
-moduledoc """
This module offers an API for JSON schema validation, using `jesse` under the hood.

If validation is desired, a jesse state can be loaded using `prepare_validator/1`,
and request and response can be validated using `populate_request/3`
and `validate_response/4` respectively.

For example, the user-defined `Module:accept_callback/4` can be implemented as follows:
```
-spec accept_callback(
        Class :: openapi_api:class(),
        OperationID :: openapi_api:operation_id(),
        Req :: cowboy_req:req(),
        Context :: openapi_logic_handler:context()) ->
    {openapi_logic_handler:accept_callback_return(),
     cowboy_req:req(),
     openapi_logic_handler:context()}.
accept_callback(Class, OperationID, Req0, Context0) ->
    ValidatorState = openapi_api:prepare_validator(),
    case openapi_api:populate_request(OperationID, Req0, ValidatorState) of
        {ok, Model, Req1} ->
            Context1 = maps:merge(Context0, Model),
            case do_accept_callback(Class, OperationID, Req1, Context1) of
                {false, Req2, Context2} ->
                    {false, Req2, Context2};
                {{true, Code, Body}, Req2, Context2} ->
                    case validate_response(OperationID, Code, Body, ValidatorState) of
                        ok ->
                            process_response({ok, Code, Body}, Req2, Context2);
                        {error, Reason} ->
                            process_response({error, Reason}, Req2, Context2)
                    end
            end;
        {error, Reason, Req1} ->
            process_response({error, Reason}, Req1, Context0)
    end.
```
""".

-export([prepare_validator/0, prepare_validator/1, prepare_validator/2]).
-export([populate_request/3, validate_response/4]).

-ignore_xref([populate_request/3, validate_response/4]).
-ignore_xref([prepare_validator/0, prepare_validator/1, prepare_validator/2]).

-type class() ::
    'console'
    | 'cq'
    | 'crx'
    | 'custom'
    | 'granite'
    | 'sling'.


-type operation_id() ::
    'getAemProductInfo' | %% 
    'getBundleInfo' | %% 
    'getConfigMgr' | %% 
    'postBundle' | %% 
    'postJmxRepository' | %% 
    'postSamlConfiguration' | %% 
    'getLoginPage' | %% 
    'postCqActions' | %% 
    'getCrxdeStatus' | %% 
    'getInstallStatus' | %% 
    'getPackageManagerServlet' | %% 
    'postPackageService' | %% 
    'postPackageServiceJson' | %% 
    'postPackageUpdate' | %% 
    'postSetPassword' | %% 
    'getAemHealthCheck' | %% 
    'postConfigAemHealthCheckServlet' | %% 
    'postConfigAemPasswordReset' | %% 
    'sslSetup' | %% 
    'deleteAgent' | %% 
    'deleteNode' | %% 
    'getAgent' | %% 
    'getAgents' | %% 
    'getAuthorizableKeystore' | %% 
    'getKeystore' | %% 
    'getNode' | %% 
    'getPackage' | %% 
    'getPackageFilter' | %% 
    'getQuery' | %% 
    'getTruststore' | %% 
    'getTruststoreInfo' | %% 
    'postAgent' | %% 
    'postAuthorizableKeystore' | %% 
    'postAuthorizables' | %% 
    'postConfigAdobeGraniteSamlAuthenticationHandler' | %% 
    'postConfigApacheFelixJettyBasedHttpService' | %% 
    'postConfigApacheHttpComponentsProxyConfiguration' | %% 
    'postConfigApacheSlingDavExServlet' | %% 
    'postConfigApacheSlingGetServlet' | %% 
    'postConfigApacheSlingReferrerFilter' | %% 
    'postConfigProperty' | %% 
    'postNode' | %% 
    'postNodeRw' | %% 
    'postPath' | %% 
    'postQuery' | %% 
    'postTreeActivation' | %% 
    'postTruststore' | %% 
    'postTruststorePKCS12' | %% 
    {error, unknown_operation}.

-type request_param() :: atom().

-export_type([class/0, operation_id/0]).

-dialyzer({nowarn_function, [validate_response_body/4]}).

-type rule() ::
    {type, binary} |
    {type, byte} |
    {type, integer} |
    {type, float} |
    {type, boolean} |
    {type, date} |
    {type, datetime} |
    {enum, [atom()]} |
    {max, Max :: number()} |
    {exclusive_max, Max :: number()} |
    {min, Min :: number()} |
    {exclusive_min, Min :: number()} |
    {max_length, MaxLength :: integer()} |
    {min_length, MaxLength :: integer()} |
    {pattern, Pattern :: string()} |
    {schema, object | list, binary()} |
    schema |
    required |
    not_required.

-doc #{equiv => prepare_validator/2}.
-spec prepare_validator() -> jesse_state:state().
prepare_validator() ->
    prepare_validator(<<"http://json-schema.org/draft-06/schema#">>).

-doc #{equiv => prepare_validator/2}.
-spec prepare_validator(binary()) -> jesse_state:state().
prepare_validator(SchemaVer) ->
    prepare_validator(get_openapi_path(), SchemaVer).

-doc """
Loads the JSON schema and the desired validation draft into a `t:jesse_state:state/0`.
""".
-spec prepare_validator(file:name_all(), binary()) -> jesse_state:state().
prepare_validator(OpenApiPath, SchemaVer) ->
    {ok, FileContents} = file:read_file(OpenApiPath),
    R = json:decode(FileContents),
    jesse_state:new(R, [{default_schema_ver, SchemaVer}]).

-doc """
Automatically loads the entire body from the cowboy req
and validates the JSON body against the schema.
""".
-spec populate_request(
        OperationID :: operation_id(),
        Req :: cowboy_req:req(),
        ValidatorState :: jesse_state:state()) ->
    {ok, Model :: #{}, Req :: cowboy_req:req()} |
    {error, Reason :: any(), Req :: cowboy_req:req()}.
populate_request(OperationID, Req, ValidatorState) ->
    Params = request_params(OperationID),
    populate_request_params(OperationID, Params, Req, ValidatorState, #{}).

-doc """
Validates that the provided `Code` and `Body` comply with the `ValidatorState` schema
for the `OperationID` operation.
""".
-spec validate_response(
        OperationID :: operation_id(),
        Code :: 200..599,
        Body :: jesse:json_term(),
        ValidatorState :: jesse_state:state()) ->
    ok | {ok, term()} | [ok | {ok, term()}] | no_return().
validate_response('getAemProductInfo', 0, Body, ValidatorState) ->
    validate_response_body('list', 'string', Body, ValidatorState);
validate_response('getBundleInfo', 200, Body, ValidatorState) ->
    validate_response_body('BundleInfo', 'BundleInfo', Body, ValidatorState);
validate_response('getBundleInfo', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('getConfigMgr', 200, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('getConfigMgr', 5XX, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postBundle', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postJmxRepository', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postSamlConfiguration', 200, Body, ValidatorState) ->
    validate_response_body('SamlConfigurationInfo', 'SamlConfigurationInfo', Body, ValidatorState);
validate_response('postSamlConfiguration', 302, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('postSamlConfiguration', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('getLoginPage', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('postCqActions', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('getCrxdeStatus', 200, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('getCrxdeStatus', 404, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('getInstallStatus', 200, Body, ValidatorState) ->
    validate_response_body('InstallStatus', 'InstallStatus', Body, ValidatorState);
validate_response('getInstallStatus', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('getPackageManagerServlet', 404, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('getPackageManagerServlet', 405, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('postPackageService', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('postPackageServiceJson', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('postPackageUpdate', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('postSetPassword', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('getAemHealthCheck', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('postConfigAemHealthCheckServlet', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postConfigAemPasswordReset', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('sslSetup', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('deleteAgent', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('deleteNode', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('getAgent', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('getAgents', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('getAuthorizableKeystore', 200, Body, ValidatorState) ->
    validate_response_body('KeystoreInfo', 'KeystoreInfo', Body, ValidatorState);
validate_response('getAuthorizableKeystore', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('getKeystore', 0, Body, ValidatorState) ->
    validate_response_body('file', 'file', Body, ValidatorState);
validate_response('getNode', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('getPackage', 0, Body, ValidatorState) ->
    validate_response_body('file', 'file', Body, ValidatorState);
validate_response('getPackageFilter', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('getQuery', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('getTruststore', 0, Body, ValidatorState) ->
    validate_response_body('file', 'file', Body, ValidatorState);
validate_response('getTruststoreInfo', 200, Body, ValidatorState) ->
    validate_response_body('TruststoreInfo', 'TruststoreInfo', Body, ValidatorState);
validate_response('getTruststoreInfo', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('postAgent', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postAuthorizableKeystore', 200, Body, ValidatorState) ->
    validate_response_body('KeystoreInfo', 'KeystoreInfo', Body, ValidatorState);
validate_response('postAuthorizableKeystore', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('postAuthorizables', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('postConfigAdobeGraniteSamlAuthenticationHandler', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postConfigApacheFelixJettyBasedHttpService', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postConfigApacheHttpComponentsProxyConfiguration', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postConfigApacheSlingDavExServlet', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postConfigApacheSlingGetServlet', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postConfigApacheSlingReferrerFilter', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postConfigProperty', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postNode', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postNodeRw', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postPath', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postQuery', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('postTreeActivation', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('postTruststore', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('postTruststorePKCS12', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response(_OperationID, _Code, _Body, _ValidatorState) ->
    ok.

%%%
-spec request_params(OperationID :: operation_id()) -> [Param :: request_param()].
request_params('getAemProductInfo') ->
    [
    ];
request_params('getBundleInfo') ->
    [
        'name'
    ];
request_params('getConfigMgr') ->
    [
    ];
request_params('postBundle') ->
    [
        'name',
        'action'
    ];
request_params('postJmxRepository') ->
    [
        'action'
    ];
request_params('postSamlConfiguration') ->
    [
        'post',
        'apply',
        'delete',
        'action',
        '$location',
        'path',
        'service.ranking',
        'idpUrl',
        'idpCertAlias',
        'idpHttpRedirect',
        'serviceProviderEntityId',
        'assertionConsumerServiceURL',
        'spPrivateKeyAlias',
        'keyStorePassword',
        'defaultRedirectUrl',
        'userIDAttribute',
        'useEncryption',
        'createUser',
        'addGroupMemberships',
        'groupMembershipAttribute',
        'defaultGroups',
        'nameIdFormat',
        'synchronizeAttributes',
        'handleLogout',
        'logoutUrl',
        'clockTolerance',
        'digestMethod',
        'signatureMethod',
        'userIntermediatePath',
        'propertylist'
    ];
request_params('getLoginPage') ->
    [
    ];
request_params('postCqActions') ->
    [
        'authorizableId',
        'changelog'
    ];
request_params('getCrxdeStatus') ->
    [
    ];
request_params('getInstallStatus') ->
    [
    ];
request_params('getPackageManagerServlet') ->
    [
    ];
request_params('postPackageService') ->
    [
        'cmd'
    ];
request_params('postPackageServiceJson') ->
    [
        'path',
        'cmd',
        'groupName',
        'packageName',
        'packageVersion',
        '_charset_',
        'force',
        'recursive',
        'package'
    ];
request_params('postPackageUpdate') ->
    [
        'groupName',
        'packageName',
        'version',
        'path',
        'filter',
        '_charset_'
    ];
request_params('postSetPassword') ->
    [
        'old',
        'plain',
        'verify'
    ];
request_params('getAemHealthCheck') ->
    [
        'tags',
        'combineTagsOr'
    ];
request_params('postConfigAemHealthCheckServlet') ->
    [
        'bundles.ignored',
        'bundles.ignored@TypeHint'
    ];
request_params('postConfigAemPasswordReset') ->
    [
        'pwdreset.authorizables',
        'pwdreset.authorizables@TypeHint'
    ];
request_params('sslSetup') ->
    [
        'keystorePassword',
        'keystorePasswordConfirm',
        'truststorePassword',
        'truststorePasswordConfirm',
        'httpsHostname',
        'httpsPort',
        'privatekeyFile',
        'certificateFile'
    ];
request_params('deleteAgent') ->
    [
        'runmode',
        'name'
    ];
request_params('deleteNode') ->
    [
        'path',
        'name'
    ];
request_params('getAgent') ->
    [
        'runmode',
        'name'
    ];
request_params('getAgents') ->
    [
        'runmode'
    ];
request_params('getAuthorizableKeystore') ->
    [
        'intermediatePath',
        'authorizableId'
    ];
request_params('getKeystore') ->
    [
        'intermediatePath',
        'authorizableId'
    ];
request_params('getNode') ->
    [
        'path',
        'name'
    ];
request_params('getPackage') ->
    [
        'group',
        'name',
        'version'
    ];
request_params('getPackageFilter') ->
    [
        'group',
        'name',
        'version'
    ];
request_params('getQuery') ->
    [
        'path',
        'p.limit',
        '1_property',
        '1_property.value'
    ];
request_params('getTruststore') ->
    [
    ];
request_params('getTruststoreInfo') ->
    [
    ];
request_params('postAgent') ->
    [
        'runmode',
        'name',
        'jcr:content/cq:distribute',
        'jcr:content/cq:distribute@TypeHint',
        'jcr:content/cq:name',
        'jcr:content/cq:template',
        'jcr:content/aliasUpdate',
        'jcr:content/enabled',
        'jcr:content/jcr:description',
        'jcr:content/jcr:lastModified',
        'jcr:content/jcr:lastModifiedBy',
        'jcr:content/jcr:mixinTypes',
        'jcr:content/jcr:title',
        'jcr:content/logLevel',
        'jcr:content/noStatusUpdate',
        'jcr:content/noVersioning',
        'jcr:content/protocolConnectTimeout',
        'jcr:content/protocolHTTPConnectionClosed',
        'jcr:content/protocolHTTPExpired',
        'jcr:content/protocolHTTPHeaders',
        'jcr:content/protocolHTTPHeaders@TypeHint',
        'jcr:content/protocolHTTPMethod',
        'jcr:content/protocolHTTPSRelaxed',
        'jcr:content/protocolInterface',
        'jcr:content/protocolSocketTimeout',
        'jcr:content/protocolVersion',
        'jcr:content/proxyNTLMDomain',
        'jcr:content/proxyNTLMHost',
        'jcr:content/proxyHost',
        'jcr:content/proxyPassword',
        'jcr:content/proxyPort',
        'jcr:content/proxyUser',
        'jcr:content/queueBatchMaxSize',
        'jcr:content/queueBatchMode',
        'jcr:content/queueBatchWaitTime',
        'jcr:content/retryDelay',
        'jcr:content/reverseReplication',
        'jcr:content/serializationType',
        'jcr:content/sling:resourceType',
        'jcr:content/ssl',
        'jcr:content/transportNTLMDomain',
        'jcr:content/transportNTLMHost',
        'jcr:content/transportPassword',
        'jcr:content/transportUri',
        'jcr:content/transportUser',
        'jcr:content/triggerDistribute',
        'jcr:content/triggerModified',
        'jcr:content/triggerOnOffTime',
        'jcr:content/triggerReceive',
        'jcr:content/triggerSpecific',
        'jcr:content/userId',
        'jcr:primaryType',
        ':operation'
    ];
request_params('postAuthorizableKeystore') ->
    [
        'intermediatePath',
        'authorizableId',
        ':operation',
        'currentPassword',
        'newPassword',
        'rePassword',
        'keyPassword',
        'keyStorePass',
        'alias',
        'newAlias',
        'removeAlias',
        'cert-chain',
        'pk',
        'keyStore'
    ];
request_params('postAuthorizables') ->
    [
        'authorizableId',
        'intermediatePath',
        'createUser',
        'createGroup',
        'rep:password',
        'profile/givenName'
    ];
request_params('postConfigAdobeGraniteSamlAuthenticationHandler') ->
    [
        'keyStorePassword',
        'keyStorePassword@TypeHint',
        'service.ranking',
        'service.ranking@TypeHint',
        'idpHttpRedirect',
        'idpHttpRedirect@TypeHint',
        'createUser',
        'createUser@TypeHint',
        'defaultRedirectUrl',
        'defaultRedirectUrl@TypeHint',
        'userIDAttribute',
        'userIDAttribute@TypeHint',
        'defaultGroups',
        'defaultGroups@TypeHint',
        'idpCertAlias',
        'idpCertAlias@TypeHint',
        'addGroupMemberships',
        'addGroupMemberships@TypeHint',
        'path',
        'path@TypeHint',
        'synchronizeAttributes',
        'synchronizeAttributes@TypeHint',
        'clockTolerance',
        'clockTolerance@TypeHint',
        'groupMembershipAttribute',
        'groupMembershipAttribute@TypeHint',
        'idpUrl',
        'idpUrl@TypeHint',
        'logoutUrl',
        'logoutUrl@TypeHint',
        'serviceProviderEntityId',
        'serviceProviderEntityId@TypeHint',
        'assertionConsumerServiceURL',
        'assertionConsumerServiceURL@TypeHint',
        'handleLogout',
        'handleLogout@TypeHint',
        'spPrivateKeyAlias',
        'spPrivateKeyAlias@TypeHint',
        'useEncryption',
        'useEncryption@TypeHint',
        'nameIdFormat',
        'nameIdFormat@TypeHint',
        'digestMethod',
        'digestMethod@TypeHint',
        'signatureMethod',
        'signatureMethod@TypeHint',
        'userIntermediatePath',
        'userIntermediatePath@TypeHint'
    ];
request_params('postConfigApacheFelixJettyBasedHttpService') ->
    [
        'org.apache.felix.https.nio',
        'org.apache.felix.https.nio@TypeHint',
        'org.apache.felix.https.keystore',
        'org.apache.felix.https.keystore@TypeHint',
        'org.apache.felix.https.keystore.password',
        'org.apache.felix.https.keystore.password@TypeHint',
        'org.apache.felix.https.keystore.key',
        'org.apache.felix.https.keystore.key@TypeHint',
        'org.apache.felix.https.keystore.key.password',
        'org.apache.felix.https.keystore.key.password@TypeHint',
        'org.apache.felix.https.truststore',
        'org.apache.felix.https.truststore@TypeHint',
        'org.apache.felix.https.truststore.password',
        'org.apache.felix.https.truststore.password@TypeHint',
        'org.apache.felix.https.clientcertificate',
        'org.apache.felix.https.clientcertificate@TypeHint',
        'org.apache.felix.https.enable',
        'org.apache.felix.https.enable@TypeHint',
        'org.osgi.service.http.port.secure',
        'org.osgi.service.http.port.secure@TypeHint'
    ];
request_params('postConfigApacheHttpComponentsProxyConfiguration') ->
    [
        'proxy.host',
        'proxy.host@TypeHint',
        'proxy.port',
        'proxy.port@TypeHint',
        'proxy.exceptions',
        'proxy.exceptions@TypeHint',
        'proxy.enabled',
        'proxy.enabled@TypeHint',
        'proxy.user',
        'proxy.user@TypeHint',
        'proxy.password',
        'proxy.password@TypeHint'
    ];
request_params('postConfigApacheSlingDavExServlet') ->
    [
        'alias',
        'alias@TypeHint',
        'dav.create-absolute-uri',
        'dav.create-absolute-uri@TypeHint'
    ];
request_params('postConfigApacheSlingGetServlet') ->
    [
        'json.maximumresults',
        'json.maximumresults@TypeHint',
        'enable.html',
        'enable.html@TypeHint',
        'enable.txt',
        'enable.txt@TypeHint',
        'enable.xml',
        'enable.xml@TypeHint'
    ];
request_params('postConfigApacheSlingReferrerFilter') ->
    [
        'allow.empty',
        'allow.empty@TypeHint',
        'allow.hosts',
        'allow.hosts@TypeHint',
        'allow.hosts.regexp',
        'allow.hosts.regexp@TypeHint',
        'filter.methods',
        'filter.methods@TypeHint'
    ];
request_params('postConfigProperty') ->
    [
        'configNodeName'
    ];
request_params('postNode') ->
    [
        'path',
        'name',
        ':operation',
        'deleteAuthorizable',
        'file'
    ];
request_params('postNodeRw') ->
    [
        'path',
        'name',
        'addMembers'
    ];
request_params('postPath') ->
    [
        'path',
        'jcr:primaryType',
        ':name'
    ];
request_params('postQuery') ->
    [
        'path',
        'p.limit',
        '1_property',
        '1_property.value'
    ];
request_params('postTreeActivation') ->
    [
        'ignoredeactivated',
        'onlymodified',
        'path',
        'cmd'
    ];
request_params('postTruststore') ->
    [
        ':operation',
        'newPassword',
        'rePassword',
        'keyStoreType',
        'removeAlias',
        'certificate'
    ];
request_params('postTruststorePKCS12') ->
    [
        'truststore.p12'
    ];
request_params(_) ->
    error(unknown_operation).

-spec request_param_info(OperationID :: operation_id(), Name :: request_param()) ->
    #{source => qs_val | binding | header | body, rules => [rule()]}.
request_param_info('getBundleInfo', 'name') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postBundle', 'name') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postBundle', 'action') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postJmxRepository', 'action') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postSamlConfiguration', 'post') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'apply') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'delete') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'action') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', '$location') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'path') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'service.ranking') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'idpUrl') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'idpCertAlias') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'idpHttpRedirect') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'serviceProviderEntityId') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'assertionConsumerServiceURL') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'spPrivateKeyAlias') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'keyStorePassword') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'defaultRedirectUrl') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'userIDAttribute') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'useEncryption') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'createUser') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'addGroupMemberships') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'groupMembershipAttribute') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'defaultGroups') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'nameIdFormat') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'synchronizeAttributes') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'handleLogout') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'logoutUrl') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'clockTolerance') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'digestMethod') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'signatureMethod') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'userIntermediatePath') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSamlConfiguration', 'propertylist') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postCqActions', 'authorizableId') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postCqActions', 'changelog') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postPackageService', 'cmd') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postPackageServiceJson', 'path') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postPackageServiceJson', 'cmd') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postPackageServiceJson', 'groupName') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postPackageServiceJson', 'packageName') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postPackageServiceJson', 'packageVersion') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postPackageServiceJson', '_charset_') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postPackageServiceJson', 'force') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postPackageServiceJson', 'recursive') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postPackageServiceJson', 'package') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postPackageUpdate', 'groupName') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postPackageUpdate', 'packageName') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postPackageUpdate', 'version') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postPackageUpdate', 'path') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postPackageUpdate', 'filter') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postPackageUpdate', '_charset_') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postSetPassword', 'old') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postSetPassword', 'plain') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postSetPassword', 'verify') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getAemHealthCheck', 'tags') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('getAemHealthCheck', 'combineTagsOr') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postConfigAemHealthCheckServlet', 'bundles.ignored') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postConfigAemHealthCheckServlet', 'bundles.ignored@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAemPasswordReset', 'pwdreset.authorizables') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postConfigAemPasswordReset', 'pwdreset.authorizables@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('sslSetup', 'keystorePassword') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('sslSetup', 'keystorePasswordConfirm') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('sslSetup', 'truststorePassword') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('sslSetup', 'truststorePasswordConfirm') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('sslSetup', 'httpsHostname') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('sslSetup', 'httpsPort') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('sslSetup', 'privatekeyFile') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('sslSetup', 'certificateFile') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('deleteAgent', 'runmode') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('deleteAgent', 'name') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('deleteNode', 'path') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('deleteNode', 'name') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getAgent', 'runmode') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getAgent', 'name') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getAgents', 'runmode') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getAuthorizableKeystore', 'intermediatePath') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getAuthorizableKeystore', 'authorizableId') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getKeystore', 'intermediatePath') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getKeystore', 'authorizableId') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getNode', 'path') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getNode', 'name') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getPackage', 'group') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getPackage', 'name') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getPackage', 'version') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getPackageFilter', 'group') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getPackageFilter', 'name') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getPackageFilter', 'version') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getQuery', 'path') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getQuery', 'p.limit') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('getQuery', '1_property') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('getQuery', '1_property.value') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postAgent', 'runmode') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postAgent', 'name') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postAgent', 'jcr:content/cq:distribute') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/cq:distribute@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/cq:name') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/cq:template') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/aliasUpdate') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/enabled') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/jcr:description') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/jcr:lastModified') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/jcr:lastModifiedBy') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/jcr:mixinTypes') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/jcr:title') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/logLevel') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/noStatusUpdate') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/noVersioning') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/protocolConnectTimeout') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/protocolHTTPConnectionClosed') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/protocolHTTPExpired') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/protocolHTTPHeaders') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/protocolHTTPHeaders@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/protocolHTTPMethod') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/protocolHTTPSRelaxed') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/protocolInterface') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/protocolSocketTimeout') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/protocolVersion') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/proxyNTLMDomain') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/proxyNTLMHost') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/proxyHost') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/proxyPassword') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/proxyPort') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/proxyUser') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/queueBatchMaxSize') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/queueBatchMode') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/queueBatchWaitTime') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/retryDelay') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/reverseReplication') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/serializationType') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/sling:resourceType') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/ssl') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/transportNTLMDomain') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/transportNTLMHost') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/transportPassword') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/transportUri') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/transportUser') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/triggerDistribute') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/triggerModified') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/triggerOnOffTime') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/triggerReceive') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/triggerSpecific') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:content/userId') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', 'jcr:primaryType') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAgent', ':operation') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizableKeystore', 'intermediatePath') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postAuthorizableKeystore', 'authorizableId') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postAuthorizableKeystore', ':operation') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizableKeystore', 'currentPassword') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizableKeystore', 'newPassword') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizableKeystore', 'rePassword') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizableKeystore', 'keyPassword') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizableKeystore', 'keyStorePass') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizableKeystore', 'alias') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizableKeystore', 'newAlias') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizableKeystore', 'removeAlias') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizableKeystore', 'cert-chain') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizableKeystore', 'pk') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizableKeystore', 'keyStore') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizables', 'authorizableId') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postAuthorizables', 'intermediatePath') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postAuthorizables', 'createUser') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizables', 'createGroup') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizables', 'rep:password') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postAuthorizables', 'profile/givenName') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'keyStorePassword') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'keyStorePassword@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'service.ranking') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'service.ranking@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'idpHttpRedirect') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'idpHttpRedirect@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'createUser') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'createUser@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'defaultRedirectUrl') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'defaultRedirectUrl@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'userIDAttribute') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'userIDAttribute@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'defaultGroups') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'defaultGroups@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'idpCertAlias') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'idpCertAlias@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'addGroupMemberships') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'addGroupMemberships@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'path') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'path@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'synchronizeAttributes') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'synchronizeAttributes@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'clockTolerance') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'clockTolerance@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'groupMembershipAttribute') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'groupMembershipAttribute@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'idpUrl') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'idpUrl@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'logoutUrl') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'logoutUrl@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'serviceProviderEntityId') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'serviceProviderEntityId@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'assertionConsumerServiceURL') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'assertionConsumerServiceURL@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'handleLogout') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'handleLogout@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'spPrivateKeyAlias') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'spPrivateKeyAlias@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'useEncryption') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'useEncryption@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'nameIdFormat') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'nameIdFormat@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'digestMethod') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'digestMethod@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'signatureMethod') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'signatureMethod@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'userIntermediatePath') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigAdobeGraniteSamlAuthenticationHandler', 'userIntermediatePath@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.nio') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.nio@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore.password') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore.password@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore.key') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore.key@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore.key.password') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore.key.password@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.truststore') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.truststore@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.truststore.password') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.truststore.password@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.clientcertificate') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.clientcertificate@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.enable') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.enable@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.osgi.service.http.port.secure') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheFelixJettyBasedHttpService', 'org.osgi.service.http.port.secure@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheHttpComponentsProxyConfiguration', 'proxy.host') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheHttpComponentsProxyConfiguration', 'proxy.host@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheHttpComponentsProxyConfiguration', 'proxy.port') ->
    #{
        source => qs_val,
        rules => [
            {type, integer},
            not_required
        ]
    };
request_param_info('postConfigApacheHttpComponentsProxyConfiguration', 'proxy.port@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheHttpComponentsProxyConfiguration', 'proxy.exceptions') ->
    #{
        source => qs_val,
        rules => [
            not_required
        ]
    };
request_param_info('postConfigApacheHttpComponentsProxyConfiguration', 'proxy.exceptions@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheHttpComponentsProxyConfiguration', 'proxy.enabled') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postConfigApacheHttpComponentsProxyConfiguration', 'proxy.enabled@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheHttpComponentsProxyConfiguration', 'proxy.user') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheHttpComponentsProxyConfiguration', 'proxy.user@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheHttpComponentsProxyConfiguration', 'proxy.password') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheHttpComponentsProxyConfiguration', 'proxy.password@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingDavExServlet', 'alias') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingDavExServlet', 'alias@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingDavExServlet', 'dav.create-absolute-uri') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingDavExServlet', 'dav.create-absolute-uri@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingGetServlet', 'json.maximumresults') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingGetServlet', 'json.maximumresults@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingGetServlet', 'enable.html') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingGetServlet', 'enable.html@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingGetServlet', 'enable.txt') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingGetServlet', 'enable.txt@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingGetServlet', 'enable.xml') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingGetServlet', 'enable.xml@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingReferrerFilter', 'allow.empty') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingReferrerFilter', 'allow.empty@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingReferrerFilter', 'allow.hosts') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingReferrerFilter', 'allow.hosts@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingReferrerFilter', 'allow.hosts.regexp') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingReferrerFilter', 'allow.hosts.regexp@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingReferrerFilter', 'filter.methods') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigApacheSlingReferrerFilter', 'filter.methods@TypeHint') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postConfigProperty', 'configNodeName') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postNode', 'path') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postNode', 'name') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postNode', ':operation') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postNode', 'deleteAuthorizable') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postNode', 'file') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postNodeRw', 'path') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postNodeRw', 'name') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postNodeRw', 'addMembers') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postPath', 'path') ->
    #{
        source => binding,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postPath', 'jcr:primaryType') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postPath', ':name') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postQuery', 'path') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postQuery', 'p.limit') ->
    #{
        source => qs_val,
        rules => [
            required
        ]
    };
request_param_info('postQuery', '1_property') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postQuery', '1_property.value') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postTreeActivation', 'ignoredeactivated') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            required
        ]
    };
request_param_info('postTreeActivation', 'onlymodified') ->
    #{
        source => qs_val,
        rules => [
            {type, boolean},
            required
        ]
    };
request_param_info('postTreeActivation', 'path') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postTreeActivation', 'cmd') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            required
        ]
    };
request_param_info('postTruststore', ':operation') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postTruststore', 'newPassword') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postTruststore', 'rePassword') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postTruststore', 'keyStoreType') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postTruststore', 'removeAlias') ->
    #{
        source => qs_val,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postTruststore', 'certificate') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info('postTruststorePKCS12', 'truststore.p12') ->
    #{
        source => body,
        rules => [
            {type, binary},
            not_required
        ]
    };
request_param_info(OperationID, Name) ->
    error({unknown_param, OperationID, Name}).

-spec populate_request_params(
        operation_id(), [request_param()], cowboy_req:req(), jesse_state:state(), map()) ->
    {ok, map(), cowboy_req:req()} | {error, _, cowboy_req:req()}.
populate_request_params(_, [], Req, _, Model) ->
    {ok, Model, Req};
populate_request_params(OperationID, [ReqParamName | T], Req0, ValidatorState, Model0) ->
    case populate_request_param(OperationID, ReqParamName, Req0, ValidatorState) of
        {ok, V, Req} ->
            Model = Model0#{ReqParamName => V},
            populate_request_params(OperationID, T, Req, ValidatorState, Model);
        Error ->
            Error
    end.

-spec populate_request_param(
        operation_id(), request_param(), cowboy_req:req(), jesse_state:state()) ->
    {ok, term(), cowboy_req:req()} | {error, term(), cowboy_req:req()}.
populate_request_param(OperationID, ReqParamName, Req0, ValidatorState) ->
    #{rules := Rules, source := Source} = request_param_info(OperationID, ReqParamName),
    case get_value(Source, ReqParamName, Req0) of
        {error, Reason, Req} ->
            {error, Reason, Req};
        {Value, Req} ->
            case prepare_param(Rules, ReqParamName, Value, ValidatorState) of
                {ok, Result} -> {ok, Result, Req};
                {error, Reason} ->
                    {error, Reason, Req}
            end
    end.

validate_response_body(list, ReturnBaseType, Body, ValidatorState) ->
    [
        validate(schema, Item, ReturnBaseType, ValidatorState)
    || Item <- Body];

validate_response_body(_, ReturnBaseType, Body, ValidatorState) ->
    validate(schema, Body, ReturnBaseType, ValidatorState).

-spec validate(rule(), term(), request_param(), jesse_state:state()) ->
    ok | {ok, term()}.
validate(required, undefined, ReqParamName, _) ->
    validation_error(required, ReqParamName, undefined);
validate(required, _Value, _, _) ->
    ok;
validate(not_required, _Value, _, _) ->
    ok;
validate(_, undefined, _, _) ->
    ok;
validate({type, boolean}, Value, _, _) when is_boolean(Value) ->
    ok;
validate({type, integer}, Value, _, _) when is_integer(Value) ->
    ok;
validate({type, float}, Value, _, _) when is_float(Value) ->
    ok;
validate({type, binary}, Value, _, _) when is_binary(Value) ->
    ok;
validate({max, Max}, Value, _, _) when Value =< Max ->
    ok;
validate({min, Min}, Value, _, _) when Min =< Value ->
    ok;
validate({exclusive_max, Max}, Value, _, _) when Value < Max ->
    ok;
validate({exclusive_min, Min}, Value, _, _) when Min < Value ->
    ok;
validate({max_length, MaxLength}, Value, _, _) when is_binary(Value), byte_size(Value) =< MaxLength ->
    ok;
validate({min_length, MinLength}, Value, _, _) when is_binary(Value), MinLength =< byte_size(Value) ->
    ok;
validate(Rule = {type, byte}, Value, ReqParamName, _) when is_binary(Value) ->
    try base64:decode(Value) of
        Decoded -> {ok, Decoded}
    catch error:_Error -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, boolean}, Value, ReqParamName, _) when is_binary(Value) ->
    case to_binary(string:lowercase(Value)) of
        <<"true">> -> {ok, true};
        <<"false">> -> {ok, false};
        _ -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, integer}, Value, ReqParamName, _) when is_binary(Value) ->
    try
        {ok, binary_to_integer(Value)}
    catch
        error:badarg ->
            validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, float}, Value, ReqParamName, _) when is_binary(Value) ->
    try
        {ok, binary_to_float(Value)}
    catch
        error:badarg ->
            validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, date}, Value, ReqParamName, _) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {type, datetime}, Value, ReqParamName, _) ->
    try calendar:rfc3339_to_system_time(binary_to_list(Value)) of
        _ -> ok
    catch error:_Error -> validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {enum, Values}, Value, ReqParamName, _) ->
    try
        FormattedValue = erlang:binary_to_existing_atom(Value, utf8),
        case lists:member(FormattedValue, Values) of
            true -> {ok, FormattedValue};
            false -> validation_error(Rule, ReqParamName, Value)
        end
    catch
        error:badarg ->
            validation_error(Rule, ReqParamName, Value)
    end;
validate(Rule = {pattern, Pattern}, Value, ReqParamName, _) ->
    {ok, MP} = re:compile(Pattern),
    case re:run(Value, MP) of
        {match, _} -> ok;
        _ -> validation_error(Rule, ReqParamName, Value)
    end;
validate(schema, Value, ReqParamName, ValidatorState) ->
    Definition = iolist_to_binary(["#/components/schemas/", atom_to_binary(ReqParamName, utf8)]),
    validate({schema, object, Definition}, Value, ReqParamName, ValidatorState);
validate({schema, list, Definition}, Value, ReqParamName, ValidatorState) ->
    lists:foreach(
      fun(Item) ->
              validate({schema, object, Definition}, Item, ReqParamName, ValidatorState)
      end, Value);
validate(Rule = {schema, object, Definition}, Value, ReqParamName, ValidatorState) ->
    try
        _ = validate_with_schema(Value, Definition, ValidatorState),
        ok
    catch
        throw:[{schema_invalid, _, Error} | _] ->
            Info = #{
                type => schema_invalid,
                error => Error
            },
            validation_error(Rule, ReqParamName, Value, Info);
        throw:[{data_invalid, Schema, Error, _, Path} | _] ->
            Info = #{
                type => data_invalid,
                error => Error,
                schema => Schema,
                path => Path
            },
            validation_error(Rule, ReqParamName, Value, Info)
    end;
validate(Rule, Value, ReqParamName, _) ->
    validation_error(Rule, ReqParamName, Value).

-spec validation_error(rule(), request_param(), term()) -> no_return().
validation_error(ViolatedRule, Name, Value) ->
    validation_error(ViolatedRule, Name, Value, #{}).

-spec validation_error(rule(), request_param(), term(), Info :: #{_ := _}) -> no_return().
validation_error(ViolatedRule, Name, Value, Info) ->
    throw({wrong_param, Name, Value, ViolatedRule, Info}).

-spec get_value(body | qs_val | header | binding, request_param(), cowboy_req:req()) ->
    {any(), cowboy_req:req()} |
    {error, any(), cowboy_req:req()}.
get_value(body, _Name, Req0) ->
    {ok, Body, Req} = read_entire_body(Req0),
    case prepare_body(Body) of
        {error, Reason} ->
            {error, Reason, Req};
        Value ->
            {Value, Req}
    end;
get_value(qs_val, Name, Req) ->
    QS = cowboy_req:parse_qs(Req),
    Value = get_opt(to_qs(Name), QS),
    {Value, Req};
get_value(header, Name, Req) ->
    Headers = cowboy_req:headers(Req),
    Value = maps:get(to_header(Name), Headers, undefined),
    {Value, Req};
get_value(binding, Name, Req) ->
    Value = cowboy_req:binding(Name, Req),
    {Value, Req}.

-spec read_entire_body(cowboy_req:req()) -> {ok, binary(), cowboy_req:req()}.
read_entire_body(Req) ->
    read_entire_body(Req, []).

-spec read_entire_body(cowboy_req:req(), iodata()) -> {ok, binary(), cowboy_req:req()}.
read_entire_body(Request, Acc) -> % {
    case cowboy_req:read_body(Request) of
        {ok, Data, NewRequest} ->
            {ok, iolist_to_binary(lists:reverse([Data | Acc])), NewRequest};
        {more, Data, NewRequest} ->
            read_entire_body(NewRequest, [Data | Acc])
    end.

prepare_body(<<>>) ->
    <<>>;
prepare_body(Body) ->
    try
        json:decode(Body)
    catch
        error:Error ->
            {error, {invalid_json, Body, Error}}
    end.

validate_with_schema(Body, Definition, ValidatorState) ->
    jesse_schema_validator:validate_with_state(
        [{<<"$ref">>, Definition}],
        Body,
        ValidatorState
    ).

-spec prepare_param([rule()], request_param(), term(), jesse_state:state()) ->
    {ok, term()} | {error, Reason :: any()}.
prepare_param(Rules, ReqParamName, Value, ValidatorState) ->
    Fun = fun(Rule, Acc) ->
        case validate(Rule, Acc, ReqParamName, ValidatorState) of
            ok -> Acc;
            {ok, Prepared} -> Prepared
        end
    end,
    try
        Result = lists:foldl(Fun, Value, Rules),
        {ok, Result}
    catch
        throw:Reason ->
            {error, Reason}
    end.

-spec to_binary(iodata()) -> binary().
to_binary(V) when is_binary(V)  -> V;
to_binary(V) when is_list(V)    -> iolist_to_binary(V).

-spec to_header(request_param()) -> binary().
to_header(Name) ->
    to_binary(string:lowercase(atom_to_binary(Name, utf8))).

-spec to_qs(request_param()) -> binary().
to_qs(Name) ->
    atom_to_binary(Name, utf8).

-spec get_opt(any(), []) -> any().
get_opt(Key, Opts) ->
    get_opt(Key, Opts, undefined).

-spec get_opt(any(), [], any()) -> any().
get_opt(Key, Opts, Default) ->
    case lists:keyfind(Key, 1, Opts) of
        {_, Value} -> Value;
        false -> Default
    end.

get_openapi_path() ->
    {ok, AppName} = application:get_application(?MODULE),
    filename:join(priv_dir(AppName), "openapi.json").

-include_lib("kernel/include/file.hrl").

-spec priv_dir(Application :: atom()) -> file:name_all().
priv_dir(AppName) ->
    case code:priv_dir(AppName) of
        Value when is_list(Value) ->
            Value ++ "/";
        _Error ->
            select_priv_dir([filename:join(["apps", atom_to_list(AppName), "priv"]), "priv"])
     end.

select_priv_dir(Paths) ->
    case lists:dropwhile(fun test_priv_dir/1, Paths) of
        [Path | _] -> Path;
        _          -> exit(no_priv_dir)
    end.

test_priv_dir(Path) ->
    case file:read_file_info(Path) of
        {ok, #file_info{type = directory}} ->
            false;
        _ ->
            true
    end.

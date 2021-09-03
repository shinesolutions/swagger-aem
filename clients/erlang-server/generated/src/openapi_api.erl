-module(openapi_api).

-export([request_params/1]).
-export([request_param_info/2]).
-export([populate_request/3]).
-export([validate_response/4]).
%% exported to silence openapi complains
-export([get_value/3, validate_response_body/4]).

-type operation_id() :: atom().
-type request_param() :: atom().

-export_type([operation_id/0]).

-spec request_params(OperationID :: operation_id()) -> [Param :: request_param()].


request_params('GetAemProductInfo') ->
    [
    ];

request_params('GetBundleInfo') ->
    [
        'name'
    ];

request_params('GetConfigMgr') ->
    [
    ];

request_params('PostBundle') ->
    [
        'name',
        'action'
    ];

request_params('PostJmxRepository') ->
    [
        'action'
    ];

request_params('PostSamlConfiguration') ->
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


request_params('GetLoginPage') ->
    [
    ];

request_params('PostCqActions') ->
    [
        'authorizableId',
        'changelog'
    ];


request_params('GetCrxdeStatus') ->
    [
    ];

request_params('GetInstallStatus') ->
    [
    ];

request_params('GetPackageManagerServlet') ->
    [
    ];

request_params('PostPackageService') ->
    [
        'cmd'
    ];

request_params('PostPackageServiceJson') ->
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

request_params('PostPackageUpdate') ->
    [
        'groupName',
        'packageName',
        'version',
        'path',
        'filter',
        '_charset_'
    ];

request_params('PostSetPassword') ->
    [
        'old',
        'plain',
        'verify'
    ];


request_params('GetAemHealthCheck') ->
    [
        'tags',
        'combineTagsOr'
    ];

request_params('PostConfigAemHealthCheckServlet') ->
    [
        'bundles.ignored',
        'bundles.ignored@TypeHint'
    ];

request_params('PostConfigAemPasswordReset') ->
    [
        'pwdreset.authorizables',
        'pwdreset.authorizables@TypeHint'
    ];


request_params('SslSetup') ->
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


request_params('DeleteAgent') ->
    [
        'runmode',
        'name'
    ];

request_params('DeleteNode') ->
    [
        'path',
        'name'
    ];

request_params('GetAgent') ->
    [
        'runmode',
        'name'
    ];

request_params('GetAgents') ->
    [
        'runmode'
    ];

request_params('GetAuthorizableKeystore') ->
    [
        'intermediatePath',
        'authorizableId'
    ];

request_params('GetKeystore') ->
    [
        'intermediatePath',
        'authorizableId'
    ];

request_params('GetNode') ->
    [
        'path',
        'name'
    ];

request_params('GetPackage') ->
    [
        'group',
        'name',
        'version'
    ];

request_params('GetPackageFilter') ->
    [
        'group',
        'name',
        'version'
    ];

request_params('GetQuery') ->
    [
        'path',
        'p.limit',
        '1_property',
        '1_property.value'
    ];

request_params('GetTruststore') ->
    [
    ];

request_params('GetTruststoreInfo') ->
    [
    ];

request_params('PostAgent') ->
    [
        'runmode',
        'name',
        'jcr:content/cq:distribute',
        'jcr:content/cq:distribute@TypeHint',
        'jcr:content/cq:name',
        'jcr:content/cq:template',
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

request_params('PostAuthorizableKeystore') ->
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

request_params('PostAuthorizables') ->
    [
        'authorizableId',
        'intermediatePath',
        'createUser',
        'createGroup',
        'rep:password',
        'profile/givenName'
    ];

request_params('PostConfigAdobeGraniteSamlAuthenticationHandler') ->
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

request_params('PostConfigApacheFelixJettyBasedHttpService') ->
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

request_params('PostConfigApacheHttpComponentsProxyConfiguration') ->
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

request_params('PostConfigApacheSlingDavExServlet') ->
    [
        'alias',
        'alias@TypeHint',
        'dav.create-absolute-uri',
        'dav.create-absolute-uri@TypeHint'
    ];

request_params('PostConfigApacheSlingGetServlet') ->
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

request_params('PostConfigApacheSlingReferrerFilter') ->
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

request_params('PostConfigProperty') ->
    [
        'configNodeName'
    ];

request_params('PostNode') ->
    [
        'path',
        'name',
        ':operation',
        'deleteAuthorizable',
        'file'
    ];

request_params('PostNodeRw') ->
    [
        'path',
        'name',
        'addMembers'
    ];

request_params('PostPath') ->
    [
        'path',
        'jcr:primaryType',
        ':name'
    ];

request_params('PostQuery') ->
    [
        'path',
        'p.limit',
        '1_property',
        '1_property.value'
    ];

request_params('PostTreeActivation') ->
    [
        'ignoredeactivated',
        'onlymodified',
        'path'
    ];

request_params('PostTruststore') ->
    [
        ':operation',
        'newPassword',
        'rePassword',
        'keyStoreType',
        'removeAlias',
        'certificate'
    ];

request_params('PostTruststorePKCS12') ->
    [
        'truststore.p12'
    ];

request_params(_) ->
    error(unknown_operation).

-type rule() ::
    {type, 'binary'} |
    {type, 'integer'} |
    {type, 'float'} |
    {type, 'binary'} |
    {type, 'boolean'} |
    {type, 'date'} |
    {type, 'datetime'} |
    {enum, [atom()]} |
    {max, Max :: number()} |
    {exclusive_max, Max :: number()} |
    {min, Min :: number()} |
    {exclusive_min, Min :: number()} |
    {max_length, MaxLength :: integer()} |
    {min_length, MaxLength :: integer()} |
    {pattern, Pattern :: string()} |
    schema |
    required |
    not_required.

-spec request_param_info(OperationID :: operation_id(), Name :: request_param()) -> #{
    source => qs_val | binding | header | body,
    rules => [rule()]
}.



request_param_info('GetBundleInfo', 'name') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostBundle', 'name') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostBundle', 'action') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostJmxRepository', 'action') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostSamlConfiguration', 'post') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'apply') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'delete') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'action') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', '$location') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'path') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'service.ranking') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'idpUrl') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'idpCertAlias') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'idpHttpRedirect') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'serviceProviderEntityId') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'assertionConsumerServiceURL') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'spPrivateKeyAlias') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'keyStorePassword') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'defaultRedirectUrl') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'userIDAttribute') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'useEncryption') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'createUser') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'addGroupMemberships') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'groupMembershipAttribute') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'defaultGroups') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'nameIdFormat') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'synchronizeAttributes') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'handleLogout') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'logoutUrl') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'clockTolerance') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'digestMethod') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'signatureMethod') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'userIntermediatePath') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSamlConfiguration', 'propertylist') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };


request_param_info('PostCqActions', 'authorizableId') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostCqActions', 'changelog') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };


request_param_info('PostPackageService', 'cmd') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostPackageServiceJson', 'path') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostPackageServiceJson', 'cmd') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostPackageServiceJson', 'groupName') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostPackageServiceJson', 'packageName') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostPackageServiceJson', 'packageVersion') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostPackageServiceJson', '_charset_') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostPackageServiceJson', 'force') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostPackageServiceJson', 'recursive') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostPackageServiceJson', 'package') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostPackageUpdate', 'groupName') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostPackageUpdate', 'packageName') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostPackageUpdate', 'version') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostPackageUpdate', 'path') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostPackageUpdate', 'filter') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostPackageUpdate', '_charset_') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostSetPassword', 'old') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostSetPassword', 'plain') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostSetPassword', 'verify') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };


request_param_info('GetAemHealthCheck', 'tags') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('GetAemHealthCheck', 'combineTagsOr') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostConfigAemHealthCheckServlet', 'bundles.ignored') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('PostConfigAemHealthCheckServlet', 'bundles.ignored@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAemPasswordReset', 'pwdreset.authorizables') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('PostConfigAemPasswordReset', 'pwdreset.authorizables@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };


request_param_info('SslSetup', 'keystorePassword') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('SslSetup', 'keystorePasswordConfirm') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('SslSetup', 'truststorePassword') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('SslSetup', 'truststorePasswordConfirm') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('SslSetup', 'httpsHostname') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('SslSetup', 'httpsPort') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('SslSetup', 'privatekeyFile') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('SslSetup', 'certificateFile') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };


request_param_info('DeleteAgent', 'runmode') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteAgent', 'name') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteNode', 'path') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteNode', 'name') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAgent', 'runmode') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAgent', 'name') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAgents', 'runmode') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAuthorizableKeystore', 'intermediatePath') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAuthorizableKeystore', 'authorizableId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetKeystore', 'intermediatePath') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetKeystore', 'authorizableId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetNode', 'path') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetNode', 'name') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPackage', 'group') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPackage', 'name') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPackage', 'version') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPackageFilter', 'group') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPackageFilter', 'name') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetPackageFilter', 'version') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetQuery', 'path') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetQuery', 'p.limit') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('GetQuery', '1_property') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetQuery', '1_property.value') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostAgent', 'runmode') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostAgent', 'name') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostAgent', 'jcr:content/cq:distribute') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/cq:distribute@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/cq:name') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/cq:template') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/enabled') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/jcr:description') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/jcr:lastModified') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/jcr:lastModifiedBy') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/jcr:mixinTypes') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/jcr:title') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/logLevel') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/noStatusUpdate') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/noVersioning') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/protocolConnectTimeout') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/protocolHTTPConnectionClosed') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/protocolHTTPExpired') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/protocolHTTPHeaders') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/protocolHTTPHeaders@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/protocolHTTPMethod') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/protocolHTTPSRelaxed') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/protocolInterface') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/protocolSocketTimeout') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/protocolVersion') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/proxyNTLMDomain') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/proxyNTLMHost') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/proxyHost') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/proxyPassword') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/proxyPort') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/proxyUser') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/queueBatchMaxSize') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/queueBatchMode') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/queueBatchWaitTime') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/retryDelay') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/reverseReplication') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/serializationType') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/sling:resourceType') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/ssl') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/transportNTLMDomain') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/transportNTLMHost') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/transportPassword') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/transportUri') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/transportUser') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/triggerDistribute') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/triggerModified') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/triggerOnOffTime') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/triggerReceive') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/triggerSpecific') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:content/userId') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', 'jcr:primaryType') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAgent', ':operation') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizableKeystore', 'intermediatePath') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostAuthorizableKeystore', 'authorizableId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostAuthorizableKeystore', ':operation') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizableKeystore', 'currentPassword') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizableKeystore', 'newPassword') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizableKeystore', 'rePassword') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizableKeystore', 'keyPassword') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizableKeystore', 'keyStorePass') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizableKeystore', 'alias') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizableKeystore', 'newAlias') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizableKeystore', 'removeAlias') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizableKeystore', 'cert-chain') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizableKeystore', 'pk') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizableKeystore', 'keyStore') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizables', 'authorizableId') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostAuthorizables', 'intermediatePath') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostAuthorizables', 'createUser') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizables', 'createGroup') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizables', 'rep:password') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostAuthorizables', 'profile/givenName') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'keyStorePassword') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'keyStorePassword@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'service.ranking') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'service.ranking@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'idpHttpRedirect') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'idpHttpRedirect@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'createUser') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'createUser@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'defaultRedirectUrl') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'defaultRedirectUrl@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'userIDAttribute') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'userIDAttribute@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'defaultGroups') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'defaultGroups@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'idpCertAlias') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'idpCertAlias@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'addGroupMemberships') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'addGroupMemberships@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'path') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'path@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'synchronizeAttributes') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'synchronizeAttributes@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'clockTolerance') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'clockTolerance@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'groupMembershipAttribute') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'groupMembershipAttribute@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'idpUrl') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'idpUrl@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'logoutUrl') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'logoutUrl@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'serviceProviderEntityId') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'serviceProviderEntityId@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'assertionConsumerServiceURL') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'assertionConsumerServiceURL@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'handleLogout') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'handleLogout@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'spPrivateKeyAlias') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'spPrivateKeyAlias@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'useEncryption') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'useEncryption@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'nameIdFormat') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'nameIdFormat@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'digestMethod') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'digestMethod@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'signatureMethod') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'signatureMethod@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'userIntermediatePath') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigAdobeGraniteSamlAuthenticationHandler', 'userIntermediatePath@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.nio') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.nio@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore.password') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore.password@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore.key') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore.key@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore.key.password') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.keystore.key.password@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.truststore') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.truststore@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.truststore.password') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.truststore.password@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.clientcertificate') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.clientcertificate@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.enable') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.apache.felix.https.enable@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.osgi.service.http.port.secure') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheFelixJettyBasedHttpService', 'org.osgi.service.http.port.secure@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheHttpComponentsProxyConfiguration', 'proxy.host') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheHttpComponentsProxyConfiguration', 'proxy.host@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheHttpComponentsProxyConfiguration', 'proxy.port') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PostConfigApacheHttpComponentsProxyConfiguration', 'proxy.port@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheHttpComponentsProxyConfiguration', 'proxy.exceptions') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('PostConfigApacheHttpComponentsProxyConfiguration', 'proxy.exceptions@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheHttpComponentsProxyConfiguration', 'proxy.enabled') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostConfigApacheHttpComponentsProxyConfiguration', 'proxy.enabled@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheHttpComponentsProxyConfiguration', 'proxy.user') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheHttpComponentsProxyConfiguration', 'proxy.user@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheHttpComponentsProxyConfiguration', 'proxy.password') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheHttpComponentsProxyConfiguration', 'proxy.password@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingDavExServlet', 'alias') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingDavExServlet', 'alias@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingDavExServlet', 'dav.create-absolute-uri') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingDavExServlet', 'dav.create-absolute-uri@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingGetServlet', 'json.maximumresults') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingGetServlet', 'json.maximumresults@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingGetServlet', 'enable.html') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingGetServlet', 'enable.html@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingGetServlet', 'enable.txt') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingGetServlet', 'enable.txt@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingGetServlet', 'enable.xml') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingGetServlet', 'enable.xml@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingReferrerFilter', 'allow.empty') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingReferrerFilter', 'allow.empty@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingReferrerFilter', 'allow.hosts') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingReferrerFilter', 'allow.hosts@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingReferrerFilter', 'allow.hosts.regexp') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingReferrerFilter', 'allow.hosts.regexp@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingReferrerFilter', 'filter.methods') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigApacheSlingReferrerFilter', 'filter.methods@TypeHint') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostConfigProperty', 'configNodeName') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostNode', 'path') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostNode', 'name') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostNode', ':operation') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostNode', 'deleteAuthorizable') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostNode', 'file') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostNodeRw', 'path') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostNodeRw', 'name') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostNodeRw', 'addMembers') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostPath', 'path') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostPath', 'jcr:primaryType') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostPath', ':name') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostQuery', 'path') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostQuery', 'p.limit') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('PostQuery', '1_property') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostQuery', '1_property.value') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostTreeActivation', 'ignoredeactivated') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            required
        ]
    };

request_param_info('PostTreeActivation', 'onlymodified') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            required
        ]
    };

request_param_info('PostTreeActivation', 'path') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PostTruststore', ':operation') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostTruststore', 'newPassword') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostTruststore', 'rePassword') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostTruststore', 'keyStoreType') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostTruststore', 'removeAlias') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostTruststore', 'certificate') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PostTruststorePKCS12', 'truststore.p12') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info(OperationID, Name) ->
    error({unknown_param, OperationID, Name}).

-spec populate_request(
    OperationID :: operation_id(),
    Req :: cowboy_req:req(),
    ValidatorState :: jesse_state:state()
) ->
    {ok, Model :: #{}, Req :: cowboy_req:req()} |
    {error, Reason :: any(), Req :: cowboy_req:req()}.

populate_request(OperationID, Req, ValidatorState) ->
    Params = request_params(OperationID),
    populate_request_params(OperationID, Params, Req, ValidatorState, #{}).

populate_request_params(_, [], Req, _, Model) ->
    {ok, Model, Req};

populate_request_params(OperationID, [FieldParams | T], Req0, ValidatorState, Model) ->
    case populate_request_param(OperationID, FieldParams, Req0, ValidatorState) of
        {ok, K, V, Req} ->
            populate_request_params(OperationID, T, Req, ValidatorState, maps:put(K, V, Model));
        Error ->
            Error
    end.

populate_request_param(OperationID, Name, Req0, ValidatorState) ->
    #{rules := Rules, source := Source} = request_param_info(OperationID, Name),
    case get_value(Source, Name, Req0) of
        {error, Reason, Req} ->
            {error, Reason, Req};
        {Value, Req} ->
            case prepare_param(Rules, Name, Value, ValidatorState) of
                {ok, Result} -> {ok, Name, Result, Req};
                {error, Reason} ->
                    {error, Reason, Req}
            end
    end.

-spec validate_response(
    OperationID :: operation_id(),
    Code :: 200..599,
    Body :: jesse:json_term(),
    ValidatorState :: jesse_state:state()
) -> ok | no_return().


validate_response('GetAemProductInfo', 0, Body, ValidatorState) ->
    validate_response_body('list', 'string', Body, ValidatorState);

validate_response('GetBundleInfo', 200, Body, ValidatorState) ->
    validate_response_body('BundleInfo', 'BundleInfo', Body, ValidatorState);
validate_response('GetBundleInfo', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetConfigMgr', 200, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('GetConfigMgr', 5XX, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostBundle', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostJmxRepository', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostSamlConfiguration', 200, Body, ValidatorState) ->
    validate_response_body('SamlConfigurationInfo', 'SamlConfigurationInfo', Body, ValidatorState);
validate_response('PostSamlConfiguration', 302, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('PostSamlConfiguration', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('GetLoginPage', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PostCqActions', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);


validate_response('GetCrxdeStatus', 200, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('GetCrxdeStatus', 404, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetInstallStatus', 200, Body, ValidatorState) ->
    validate_response_body('InstallStatus', 'InstallStatus', Body, ValidatorState);
validate_response('GetInstallStatus', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetPackageManagerServlet', 404, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('GetPackageManagerServlet', 405, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PostPackageService', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PostPackageServiceJson', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PostPackageUpdate', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PostSetPassword', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('GetAemHealthCheck', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PostConfigAemHealthCheckServlet', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostConfigAemPasswordReset', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);


validate_response('SslSetup', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('DeleteAgent', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('DeleteNode', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('GetAgent', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('GetAgents', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetAuthorizableKeystore', 200, Body, ValidatorState) ->
    validate_response_body('KeystoreInfo', 'KeystoreInfo', Body, ValidatorState);
validate_response('GetAuthorizableKeystore', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetKeystore', 0, Body, ValidatorState) ->
    validate_response_body('file', 'file', Body, ValidatorState);

validate_response('GetNode', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('GetPackage', 0, Body, ValidatorState) ->
    validate_response_body('file', 'file', Body, ValidatorState);

validate_response('GetPackageFilter', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetQuery', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetTruststore', 0, Body, ValidatorState) ->
    validate_response_body('file', 'file', Body, ValidatorState);

validate_response('GetTruststoreInfo', 200, Body, ValidatorState) ->
    validate_response_body('TruststoreInfo', 'TruststoreInfo', Body, ValidatorState);
validate_response('GetTruststoreInfo', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PostAgent', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostAuthorizableKeystore', 200, Body, ValidatorState) ->
    validate_response_body('KeystoreInfo', 'KeystoreInfo', Body, ValidatorState);
validate_response('PostAuthorizableKeystore', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PostAuthorizables', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PostConfigAdobeGraniteSamlAuthenticationHandler', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostConfigApacheFelixJettyBasedHttpService', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostConfigApacheHttpComponentsProxyConfiguration', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostConfigApacheSlingDavExServlet', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostConfigApacheSlingGetServlet', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostConfigApacheSlingReferrerFilter', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostConfigProperty', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostNode', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostNodeRw', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostPath', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostQuery', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PostTreeActivation', 0, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);

validate_response('PostTruststore', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PostTruststorePKCS12', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response(_OperationID, _Code, _Body, _ValidatorState) ->
    ok.

validate_response_body('list', ReturnBaseType, Body, ValidatorState) ->
    [
        validate(schema, ReturnBaseType, Item, ValidatorState)
    || Item <- Body];

validate_response_body(_, ReturnBaseType, Body, ValidatorState) ->
    validate(schema, ReturnBaseType, Body, ValidatorState).

%%%
validate(Rule = required, Name, Value, _ValidatorState) ->
    case Value of
        undefined -> validation_error(Rule, Name);
        _ -> ok
    end;

validate(not_required, _Name, _Value, _ValidatorState) ->
    ok;

validate(_, _Name, undefined, _ValidatorState) ->
    ok;

validate(Rule = {type, 'integer'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_int(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'float'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_float(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'binary'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(_Rule = {type, 'boolean'}, _Name, Value, _ValidatorState) when is_boolean(Value) ->
    {ok, Value};

validate(Rule = {type, 'boolean'}, Name, Value, _ValidatorState) ->
    V = binary_to_lower(Value),
    try
        case binary_to_existing_atom(V, utf8) of
            B when is_boolean(B) -> {ok, B};
            _ -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'date'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {type, 'datetime'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {enum, Values}, Name, Value, _ValidatorState) ->
    try
        FormattedValue = erlang:binary_to_existing_atom(Value, utf8),
        case lists:member(FormattedValue, Values) of
            true -> {ok, FormattedValue};
            false -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {max, Max}, Name, Value, _ValidatorState) ->
    case Value =< Max of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_max, ExclusiveMax}, Name, Value, _ValidatorState) ->
    case Value > ExclusiveMax of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min, Min}, Name, Value, _ValidatorState) ->
    case Value >= Min of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_min, ExclusiveMin}, Name, Value, _ValidatorState) ->
    case Value =< ExclusiveMin of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {max_length, MaxLength}, Name, Value, _ValidatorState) ->
    case size(Value) =< MaxLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min_length, MinLength}, Name, Value, _ValidatorState) ->
    case size(Value) >= MinLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {pattern, Pattern}, Name, Value, _ValidatorState) ->
    {ok, MP} = re:compile(Pattern),
    case re:run(Value, MP) of
        {match, _} -> ok;
        _ -> validation_error(Rule, Name)
    end;

validate(Rule = schema, Name, Value, ValidatorState) ->
    Definition =  list_to_binary("#/components/schemas/" ++ openapi_utils:to_list(Name)),
    try
        _ = validate_with_schema(Value, Definition, ValidatorState),
        ok
    catch
        throw:[{schema_invalid, _, Error} | _] ->
            Info = #{
                type => schema_invalid,
                error => Error
            },
            validation_error(Rule, Name, Info);
        throw:[{data_invalid, Schema, Error, _, Path} | _] ->
            Info = #{
                type => data_invalid,
                error => Error,
                schema => Schema,
                path => Path
            },
            validation_error(Rule, Name, Info)
    end;

validate(Rule, Name, _Value, _ValidatorState) ->
    error_logger:info_msg("Can't validate ~p with ~p", [Name, Rule]),
    error({unknown_validation_rule, Rule}).

-spec validation_error(Rule :: any(), Name :: any()) -> no_return().

validation_error(ViolatedRule, Name) ->
    validation_error(ViolatedRule, Name, #{}).

-spec validation_error(Rule :: any(), Name :: any(), Info :: #{}) -> no_return().

validation_error(ViolatedRule, Name, Info) ->
    throw({wrong_param, Name, ViolatedRule, Info}).

-spec get_value(body | qs_val | header | binding, Name :: any(), Req0 :: cowboy_req:req()) ->
    {Value :: any(), Req :: cowboy_req:req()} | 
    {error, Reason :: any(), Req :: cowboy_req:req()}.
get_value(body, _Name, Req0) ->
    {ok, Body, Req} = cowboy_req:read_body(Req0),
    case prepare_body(Body) of
        {error, Reason} ->
            {error, Reason, Req};
        Value ->
            {Value, Req}
    end;

get_value(qs_val, Name, Req) ->
    QS = cowboy_req:parse_qs(Req),
    Value = openapi_utils:get_opt(openapi_utils:to_qs(Name), QS),
    {Value, Req};

get_value(header, Name, Req) ->
    Headers = cowboy_req:headers(Req),
    Value =  maps:get(openapi_utils:to_header(Name), Headers, undefined),
    {Value, Req};

get_value(binding, Name, Req) ->
    Value = cowboy_req:binding(openapi_utils:to_binding(Name), Req),
    {Value, Req}.

prepare_body(Body) ->
    case Body of
        <<"">> -> <<"">>;
        _ ->
            try
                jsx:decode(Body, [return_maps]) 
            catch
              error:_ ->
                {error, {invalid_body, not_json, Body}}
            end
    end.

validate_with_schema(Body, Definition, ValidatorState) ->
    jesse_schema_validator:validate_with_state(
        [{<<"$ref">>, Definition}],
        Body,
        ValidatorState
    ).

prepare_param(Rules, Name, Value, ValidatorState) ->
    try
        Result = lists:foldl(
            fun(Rule, Acc) ->
                case validate(Rule, Name, Acc, ValidatorState) of
                    ok -> Acc;
                    {ok, Prepared} -> Prepared
                end
            end,
            Value,
            Rules
        ),
        {ok, Result}
    catch
        throw:Reason ->
            {error, Reason}
    end.

binary_to_lower(V) when is_binary(V) ->
    list_to_binary(string:to_lower(openapi_utils:to_list(V))).

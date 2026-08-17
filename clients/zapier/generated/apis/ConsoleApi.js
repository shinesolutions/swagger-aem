const samples = require('../samples/ConsoleApi');
const BundleInfo = require('../models/BundleInfo');
const SamlConfigurationInfo = require('../models/SamlConfigurationInfo');
const utils = require('../utils/utils');

module.exports = {
    getAemProductInfo: {
        key: 'getAemProductInfo',
        noun: 'console',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/system/console/status-productinfo.json'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getAemProductInfo', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    getBundleInfo: {
        key: 'getBundleInfo',
        noun: 'console',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'name',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...BundleInfo.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/system/console/bundles/{name}.json'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getBundleInfo', response.json);
                    return results;
                })
            },
            sample: samples['BundleInfoSample']
        }
    },
    getConfigMgr: {
        key: 'getConfigMgr',
        noun: 'console',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/system/console/configMgr'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'text/xml',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getConfigMgr', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    postBundle: {
        key: 'postBundle',
        noun: 'console',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'name',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'action',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/system/console/bundles/{name}'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': '',
                    },
                    params: {
                        'action': bundle.inputData?.['action'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postBundle', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postJmxRepository: {
        key: 'postJmxRepository',
        noun: 'console',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'action',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/system/console/jmx/com.adobe.granite:type=Repository/op/{action}'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': '',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postJmxRepository', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postSamlConfiguration: {
        key: 'postSamlConfiguration',
        noun: 'console',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'post',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'apply',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'delete',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'action',
                    label: '',
                    type: 'string',
                },
                {
                    key: '$location',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'path',
                    label: '',
                    type: 'string',
                }
                {
                    key: 'service.ranking',
                    label: '',
                    type: 'integer',
                },
                {
                    key: 'idpUrl',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'idpCertAlias',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'idpHttpRedirect',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'serviceProviderEntityId',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'assertionConsumerServiceURL',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'spPrivateKeyAlias',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'keyStorePassword',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'defaultRedirectUrl',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'userIDAttribute',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'useEncryption',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'createUser',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'addGroupMemberships',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'groupMembershipAttribute',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'defaultGroups',
                    label: '',
                    type: 'string',
                }
                {
                    key: 'nameIdFormat',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'synchronizeAttributes',
                    label: '',
                    type: 'string',
                }
                {
                    key: 'handleLogout',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'logoutUrl',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'clockTolerance',
                    label: '',
                    type: 'integer',
                },
                {
                    key: 'digestMethod',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'signatureMethod',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'userIntermediatePath',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'propertylist',
                    label: '',
                    type: 'string',
                }
            ],
            outputFields: [
                ...SamlConfigurationInfo.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'text/plain',
                    },
                    params: {
                        'post': bundle.inputData?.['post'],
                        'apply': bundle.inputData?.['apply'],
                        'delete': bundle.inputData?.['delete'],
                        'action': bundle.inputData?.['action'],
                        '$location': bundle.inputData?.['$location'],
                        'path': bundle.inputData?.['path'],
                        'service.ranking': bundle.inputData?.['service.ranking'],
                        'idpUrl': bundle.inputData?.['idpUrl'],
                        'idpCertAlias': bundle.inputData?.['idpCertAlias'],
                        'idpHttpRedirect': bundle.inputData?.['idpHttpRedirect'],
                        'serviceProviderEntityId': bundle.inputData?.['serviceProviderEntityId'],
                        'assertionConsumerServiceURL': bundle.inputData?.['assertionConsumerServiceURL'],
                        'spPrivateKeyAlias': bundle.inputData?.['spPrivateKeyAlias'],
                        'keyStorePassword': bundle.inputData?.['keyStorePassword'],
                        'defaultRedirectUrl': bundle.inputData?.['defaultRedirectUrl'],
                        'userIDAttribute': bundle.inputData?.['userIDAttribute'],
                        'useEncryption': bundle.inputData?.['useEncryption'],
                        'createUser': bundle.inputData?.['createUser'],
                        'addGroupMemberships': bundle.inputData?.['addGroupMemberships'],
                        'groupMembershipAttribute': bundle.inputData?.['groupMembershipAttribute'],
                        'defaultGroups': bundle.inputData?.['defaultGroups'],
                        'nameIdFormat': bundle.inputData?.['nameIdFormat'],
                        'synchronizeAttributes': bundle.inputData?.['synchronizeAttributes'],
                        'handleLogout': bundle.inputData?.['handleLogout'],
                        'logoutUrl': bundle.inputData?.['logoutUrl'],
                        'clockTolerance': bundle.inputData?.['clockTolerance'],
                        'digestMethod': bundle.inputData?.['digestMethod'],
                        'signatureMethod': bundle.inputData?.['signatureMethod'],
                        'userIntermediatePath': bundle.inputData?.['userIntermediatePath'],
                        'propertylist': bundle.inputData?.['propertylist'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postSamlConfiguration', response.json);
                    return results;
                })
            },
            sample: samples['SamlConfigurationInfoSample']
        }
    },
}

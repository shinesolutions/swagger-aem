const samples = require('../samples/SlingApi');
const KeystoreInfo = require('../models/KeystoreInfo');
const TruststoreInfo = require('../models/TruststoreInfo');
const utils = require('../utils/utils');
const FormData = require('form-data');
const FormData = require('form-data');
const FormData = require('form-data');
const FormData = require('form-data');

module.exports = {
    deleteAgent: {
        key: 'deleteAgent',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'runmode',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'name',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/etc/replication/agents.{runmode}/{name}'),
                    method: 'DELETE',
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteAgent', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    deleteNode: {
        key: 'deleteNode',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'path',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'name',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/{path}/{name}'),
                    method: 'DELETE',
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'deleteNode', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    getAgent: {
        key: 'getAgent',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'runmode',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'name',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/etc/replication/agents.{runmode}/{name}'),
                    method: 'GET',
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getAgent', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    getAgents: {
        key: 'getAgents',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'runmode',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/etc/replication/agents.{runmode}.-1.json'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getAgents', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    getAuthorizableKeystore: {
        key: 'getAuthorizableKeystore',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'intermediatePath',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'authorizableId',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...KeystoreInfo.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/{intermediatePath}/{authorizableId}.ks.json'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'text/plain',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getAuthorizableKeystore', response.json);
                    return results;
                })
            },
            sample: samples['KeystoreInfoSample']
        }
    },
    getKeystore: {
        key: 'getKeystore',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'intermediatePath',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'authorizableId',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/{intermediatePath}/{authorizableId}/keystore/store.p12'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/octet-stream',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getKeystore', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    getNode: {
        key: 'getNode',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'path',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'name',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/{path}/{name}'),
                    method: 'GET',
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getNode', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    getPackage: {
        key: 'getPackage',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'group',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'name',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'version',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/etc/packages/{group}/{name}-{version}.zip'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/octet-stream',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getPackage', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    getPackageFilter: {
        key: 'getPackageFilter',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'group',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'name',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'version',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getPackageFilter', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    getQuery: {
        key: 'getQuery',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'path',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'p.limit',
                    label: '',
                    type: 'number',
                    required: true,
                },
                {
                    key: '1_property',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: '1_property.value',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/bin/querybuilder.json'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'path': bundle.inputData?.['path'],
                        'p.limit': bundle.inputData?.['p.limit'],
                        '1_property': bundle.inputData?.['1_property'],
                        '1_property.value': bundle.inputData?.['1_property.value'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getQuery', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    getTruststore: {
        key: 'getTruststore',
        noun: 'sling',
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
                    url: utils.replacePathParameters('http://localhost/etc/truststore/truststore.p12'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/octet-stream',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getTruststore', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    getTruststoreInfo: {
        key: 'getTruststoreInfo',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
            ],
            outputFields: [
                ...TruststoreInfo.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/libs/granite/security/truststore.json'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getTruststoreInfo', response.json);
                    return results;
                })
            },
            sample: samples['TruststoreInfoSample']
        }
    },
    postAgent: {
        key: 'postAgent',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'runmode',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'name',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'jcr:content/cq:distribute',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'jcr:content/cq:distribute@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/cq:name',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/cq:template',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/aliasUpdate',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'jcr:content/enabled',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'jcr:content/jcr:description',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/jcr:lastModified',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/jcr:lastModifiedBy',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/jcr:mixinTypes',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/jcr:title',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/logLevel',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/noStatusUpdate',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'jcr:content/noVersioning',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'jcr:content/protocolConnectTimeout',
                    label: '',
                    type: 'number',
                },
                {
                    key: 'jcr:content/protocolHTTPConnectionClosed',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'jcr:content/protocolHTTPExpired',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/protocolHTTPHeaders',
                    label: '',
                    type: 'string',
                }
                {
                    key: 'jcr:content/protocolHTTPHeaders@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/protocolHTTPMethod',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/protocolHTTPSRelaxed',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'jcr:content/protocolInterface',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/protocolSocketTimeout',
                    label: '',
                    type: 'number',
                },
                {
                    key: 'jcr:content/protocolVersion',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/proxyNTLMDomain',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/proxyNTLMHost',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/proxyHost',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/proxyPassword',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/proxyPort',
                    label: '',
                    type: 'number',
                },
                {
                    key: 'jcr:content/proxyUser',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/queueBatchMaxSize',
                    label: '',
                    type: 'number',
                },
                {
                    key: 'jcr:content/queueBatchMode',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/queueBatchWaitTime',
                    label: '',
                    type: 'number',
                },
                {
                    key: 'jcr:content/retryDelay',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/reverseReplication',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'jcr:content/serializationType',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/sling:resourceType',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/ssl',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/transportNTLMDomain',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/transportNTLMHost',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/transportPassword',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/transportUri',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/transportUser',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:content/triggerDistribute',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'jcr:content/triggerModified',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'jcr:content/triggerOnOffTime',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'jcr:content/triggerReceive',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'jcr:content/triggerSpecific',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'jcr:content/userId',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'jcr:primaryType',
                    label: '',
                    type: 'string',
                },
                {
                    key: ':operation',
                    label: '',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/etc/replication/agents.{runmode}/{name}'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': '',
                    },
                    params: {
                        'jcr:content/cq:distribute': bundle.inputData?.['jcr:content/cq:distribute'],
                        'jcr:content/cq:distribute@TypeHint': bundle.inputData?.['jcr:content/cq:distribute@TypeHint'],
                        'jcr:content/cq:name': bundle.inputData?.['jcr:content/cq:name'],
                        'jcr:content/cq:template': bundle.inputData?.['jcr:content/cq:template'],
                        'jcr:content/aliasUpdate': bundle.inputData?.['jcr:content/aliasUpdate'],
                        'jcr:content/enabled': bundle.inputData?.['jcr:content/enabled'],
                        'jcr:content/jcr:description': bundle.inputData?.['jcr:content/jcr:description'],
                        'jcr:content/jcr:lastModified': bundle.inputData?.['jcr:content/jcr:lastModified'],
                        'jcr:content/jcr:lastModifiedBy': bundle.inputData?.['jcr:content/jcr:lastModifiedBy'],
                        'jcr:content/jcr:mixinTypes': bundle.inputData?.['jcr:content/jcr:mixinTypes'],
                        'jcr:content/jcr:title': bundle.inputData?.['jcr:content/jcr:title'],
                        'jcr:content/logLevel': bundle.inputData?.['jcr:content/logLevel'],
                        'jcr:content/noStatusUpdate': bundle.inputData?.['jcr:content/noStatusUpdate'],
                        'jcr:content/noVersioning': bundle.inputData?.['jcr:content/noVersioning'],
                        'jcr:content/protocolConnectTimeout': bundle.inputData?.['jcr:content/protocolConnectTimeout'],
                        'jcr:content/protocolHTTPConnectionClosed': bundle.inputData?.['jcr:content/protocolHTTPConnectionClosed'],
                        'jcr:content/protocolHTTPExpired': bundle.inputData?.['jcr:content/protocolHTTPExpired'],
                        'jcr:content/protocolHTTPHeaders': bundle.inputData?.['jcr:content/protocolHTTPHeaders'],
                        'jcr:content/protocolHTTPHeaders@TypeHint': bundle.inputData?.['jcr:content/protocolHTTPHeaders@TypeHint'],
                        'jcr:content/protocolHTTPMethod': bundle.inputData?.['jcr:content/protocolHTTPMethod'],
                        'jcr:content/protocolHTTPSRelaxed': bundle.inputData?.['jcr:content/protocolHTTPSRelaxed'],
                        'jcr:content/protocolInterface': bundle.inputData?.['jcr:content/protocolInterface'],
                        'jcr:content/protocolSocketTimeout': bundle.inputData?.['jcr:content/protocolSocketTimeout'],
                        'jcr:content/protocolVersion': bundle.inputData?.['jcr:content/protocolVersion'],
                        'jcr:content/proxyNTLMDomain': bundle.inputData?.['jcr:content/proxyNTLMDomain'],
                        'jcr:content/proxyNTLMHost': bundle.inputData?.['jcr:content/proxyNTLMHost'],
                        'jcr:content/proxyHost': bundle.inputData?.['jcr:content/proxyHost'],
                        'jcr:content/proxyPassword': bundle.inputData?.['jcr:content/proxyPassword'],
                        'jcr:content/proxyPort': bundle.inputData?.['jcr:content/proxyPort'],
                        'jcr:content/proxyUser': bundle.inputData?.['jcr:content/proxyUser'],
                        'jcr:content/queueBatchMaxSize': bundle.inputData?.['jcr:content/queueBatchMaxSize'],
                        'jcr:content/queueBatchMode': bundle.inputData?.['jcr:content/queueBatchMode'],
                        'jcr:content/queueBatchWaitTime': bundle.inputData?.['jcr:content/queueBatchWaitTime'],
                        'jcr:content/retryDelay': bundle.inputData?.['jcr:content/retryDelay'],
                        'jcr:content/reverseReplication': bundle.inputData?.['jcr:content/reverseReplication'],
                        'jcr:content/serializationType': bundle.inputData?.['jcr:content/serializationType'],
                        'jcr:content/sling:resourceType': bundle.inputData?.['jcr:content/sling:resourceType'],
                        'jcr:content/ssl': bundle.inputData?.['jcr:content/ssl'],
                        'jcr:content/transportNTLMDomain': bundle.inputData?.['jcr:content/transportNTLMDomain'],
                        'jcr:content/transportNTLMHost': bundle.inputData?.['jcr:content/transportNTLMHost'],
                        'jcr:content/transportPassword': bundle.inputData?.['jcr:content/transportPassword'],
                        'jcr:content/transportUri': bundle.inputData?.['jcr:content/transportUri'],
                        'jcr:content/transportUser': bundle.inputData?.['jcr:content/transportUser'],
                        'jcr:content/triggerDistribute': bundle.inputData?.['jcr:content/triggerDistribute'],
                        'jcr:content/triggerModified': bundle.inputData?.['jcr:content/triggerModified'],
                        'jcr:content/triggerOnOffTime': bundle.inputData?.['jcr:content/triggerOnOffTime'],
                        'jcr:content/triggerReceive': bundle.inputData?.['jcr:content/triggerReceive'],
                        'jcr:content/triggerSpecific': bundle.inputData?.['jcr:content/triggerSpecific'],
                        'jcr:content/userId': bundle.inputData?.['jcr:content/userId'],
                        'jcr:primaryType': bundle.inputData?.['jcr:primaryType'],
                        ':operation': bundle.inputData?.[':operation'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postAgent', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postAuthorizableKeystore: {
        key: 'postAuthorizableKeystore',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'intermediatePath',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'authorizableId',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: ':operation',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'currentPassword',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'newPassword',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'rePassword',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'keyPassword',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'keyStorePass',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'alias',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'newAlias',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'removeAlias',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'cert-chain',
                    label: '',
                    type: 'file',
                },
                {
                    key: 'pk',
                    label: '',
                    type: 'file',
                },
                {
                    key: 'keyStore',
                    label: '',
                    type: 'file',
                },
            ],
            outputFields: [
                ...KeystoreInfo.fields('', false),
            ],
            perform: async (z, bundle) => {
                const formData = new FormData()
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['cert-chain'].split('/').slice(-1)[0]
                formData.append('cert-chain', (await (await z.request({url: bundle.inputData?.['cert-chain'], method: 'GET', raw: true})).buffer()), { filename: filename })
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['pk'].split('/').slice(-1)[0]
                formData.append('pk', (await (await z.request({url: bundle.inputData?.['pk'], method: 'GET', raw: true})).buffer()), { filename: filename })
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['keyStore'].split('/').slice(-1)[0]
                formData.append('keyStore', (await (await z.request({url: bundle.inputData?.['keyStore'], method: 'GET', raw: true})).buffer()), { filename: filename })
                const options = {
                    url: utils.replacePathParameters('http://localhost/{intermediatePath}/{authorizableId}.ks.html'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        
                        'Accept': 'text/plain',
                    },
                    params: {
                        ':operation': bundle.inputData?.[':operation'],
                        'currentPassword': bundle.inputData?.['currentPassword'],
                        'newPassword': bundle.inputData?.['newPassword'],
                        'rePassword': bundle.inputData?.['rePassword'],
                        'keyPassword': bundle.inputData?.['keyPassword'],
                        'keyStorePass': bundle.inputData?.['keyStorePass'],
                        'alias': bundle.inputData?.['alias'],
                        'newAlias': bundle.inputData?.['newAlias'],
                        'removeAlias': bundle.inputData?.['removeAlias'],
                    },
                    body: formData,
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postAuthorizableKeystore', response.json);
                    return results;
                })
            },
            sample: samples['KeystoreInfoSample']
        }
    },
    postAuthorizables: {
        key: 'postAuthorizables',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'authorizableId',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'intermediatePath',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'createUser',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'createGroup',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'rep:password',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'profile/givenName',
                    label: '',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/libs/granite/security/post/authorizables'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'text/html',
                    },
                    params: {
                        'authorizableId': bundle.inputData?.['authorizableId'],
                        'intermediatePath': bundle.inputData?.['intermediatePath'],
                        'createUser': bundle.inputData?.['createUser'],
                        'createGroup': bundle.inputData?.['createGroup'],
                        'rep:password': bundle.inputData?.['rep:password'],
                        'profile/givenName': bundle.inputData?.['profile/givenName'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postAuthorizables', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    postConfigAdobeGraniteSamlAuthenticationHandler: {
        key: 'postConfigAdobeGraniteSamlAuthenticationHandler',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'keyStorePassword',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'keyStorePassword@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'service.ranking',
                    label: '',
                    type: 'integer',
                },
                {
                    key: 'service.ranking@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'idpHttpRedirect',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'idpHttpRedirect@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'createUser',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'createUser@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'defaultRedirectUrl',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'defaultRedirectUrl@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'userIDAttribute',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'userIDAttribute@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'defaultGroups',
                    label: '',
                    type: 'string',
                }
                {
                    key: 'defaultGroups@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'idpCertAlias',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'idpCertAlias@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'addGroupMemberships',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'addGroupMemberships@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'path',
                    label: '',
                    type: 'string',
                }
                {
                    key: 'path@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'synchronizeAttributes',
                    label: '',
                    type: 'string',
                }
                {
                    key: 'synchronizeAttributes@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'clockTolerance',
                    label: '',
                    type: 'integer',
                },
                {
                    key: 'clockTolerance@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'groupMembershipAttribute',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'groupMembershipAttribute@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'idpUrl',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'idpUrl@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'logoutUrl',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'logoutUrl@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'serviceProviderEntityId',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'serviceProviderEntityId@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'assertionConsumerServiceURL',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'assertionConsumerServiceURL@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'handleLogout',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'handleLogout@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'spPrivateKeyAlias',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'spPrivateKeyAlias@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'useEncryption',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'useEncryption@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'nameIdFormat',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'nameIdFormat@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'digestMethod',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'digestMethod@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'signatureMethod',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'signatureMethod@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'userIntermediatePath',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'userIntermediatePath@TypeHint',
                    label: '',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': '',
                    },
                    params: {
                        'keyStorePassword': bundle.inputData?.['keyStorePassword'],
                        'keyStorePassword@TypeHint': bundle.inputData?.['keyStorePassword@TypeHint'],
                        'service.ranking': bundle.inputData?.['service.ranking'],
                        'service.ranking@TypeHint': bundle.inputData?.['service.ranking@TypeHint'],
                        'idpHttpRedirect': bundle.inputData?.['idpHttpRedirect'],
                        'idpHttpRedirect@TypeHint': bundle.inputData?.['idpHttpRedirect@TypeHint'],
                        'createUser': bundle.inputData?.['createUser'],
                        'createUser@TypeHint': bundle.inputData?.['createUser@TypeHint'],
                        'defaultRedirectUrl': bundle.inputData?.['defaultRedirectUrl'],
                        'defaultRedirectUrl@TypeHint': bundle.inputData?.['defaultRedirectUrl@TypeHint'],
                        'userIDAttribute': bundle.inputData?.['userIDAttribute'],
                        'userIDAttribute@TypeHint': bundle.inputData?.['userIDAttribute@TypeHint'],
                        'defaultGroups': bundle.inputData?.['defaultGroups'],
                        'defaultGroups@TypeHint': bundle.inputData?.['defaultGroups@TypeHint'],
                        'idpCertAlias': bundle.inputData?.['idpCertAlias'],
                        'idpCertAlias@TypeHint': bundle.inputData?.['idpCertAlias@TypeHint'],
                        'addGroupMemberships': bundle.inputData?.['addGroupMemberships'],
                        'addGroupMemberships@TypeHint': bundle.inputData?.['addGroupMemberships@TypeHint'],
                        'path': bundle.inputData?.['path'],
                        'path@TypeHint': bundle.inputData?.['path@TypeHint'],
                        'synchronizeAttributes': bundle.inputData?.['synchronizeAttributes'],
                        'synchronizeAttributes@TypeHint': bundle.inputData?.['synchronizeAttributes@TypeHint'],
                        'clockTolerance': bundle.inputData?.['clockTolerance'],
                        'clockTolerance@TypeHint': bundle.inputData?.['clockTolerance@TypeHint'],
                        'groupMembershipAttribute': bundle.inputData?.['groupMembershipAttribute'],
                        'groupMembershipAttribute@TypeHint': bundle.inputData?.['groupMembershipAttribute@TypeHint'],
                        'idpUrl': bundle.inputData?.['idpUrl'],
                        'idpUrl@TypeHint': bundle.inputData?.['idpUrl@TypeHint'],
                        'logoutUrl': bundle.inputData?.['logoutUrl'],
                        'logoutUrl@TypeHint': bundle.inputData?.['logoutUrl@TypeHint'],
                        'serviceProviderEntityId': bundle.inputData?.['serviceProviderEntityId'],
                        'serviceProviderEntityId@TypeHint': bundle.inputData?.['serviceProviderEntityId@TypeHint'],
                        'assertionConsumerServiceURL': bundle.inputData?.['assertionConsumerServiceURL'],
                        'assertionConsumerServiceURL@TypeHint': bundle.inputData?.['assertionConsumerServiceURL@TypeHint'],
                        'handleLogout': bundle.inputData?.['handleLogout'],
                        'handleLogout@TypeHint': bundle.inputData?.['handleLogout@TypeHint'],
                        'spPrivateKeyAlias': bundle.inputData?.['spPrivateKeyAlias'],
                        'spPrivateKeyAlias@TypeHint': bundle.inputData?.['spPrivateKeyAlias@TypeHint'],
                        'useEncryption': bundle.inputData?.['useEncryption'],
                        'useEncryption@TypeHint': bundle.inputData?.['useEncryption@TypeHint'],
                        'nameIdFormat': bundle.inputData?.['nameIdFormat'],
                        'nameIdFormat@TypeHint': bundle.inputData?.['nameIdFormat@TypeHint'],
                        'digestMethod': bundle.inputData?.['digestMethod'],
                        'digestMethod@TypeHint': bundle.inputData?.['digestMethod@TypeHint'],
                        'signatureMethod': bundle.inputData?.['signatureMethod'],
                        'signatureMethod@TypeHint': bundle.inputData?.['signatureMethod@TypeHint'],
                        'userIntermediatePath': bundle.inputData?.['userIntermediatePath'],
                        'userIntermediatePath@TypeHint': bundle.inputData?.['userIntermediatePath@TypeHint'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postConfigAdobeGraniteSamlAuthenticationHandler', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postConfigApacheFelixJettyBasedHttpService: {
        key: 'postConfigApacheFelixJettyBasedHttpService',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'org.apache.felix.https.nio',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'org.apache.felix.https.nio@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.apache.felix.https.keystore',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.apache.felix.https.keystore@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.apache.felix.https.keystore.password',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.apache.felix.https.keystore.password@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.apache.felix.https.keystore.key',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.apache.felix.https.keystore.key@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.apache.felix.https.keystore.key.password',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.apache.felix.https.keystore.key.password@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.apache.felix.https.truststore',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.apache.felix.https.truststore@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.apache.felix.https.truststore.password',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.apache.felix.https.truststore.password@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.apache.felix.https.clientcertificate',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.apache.felix.https.clientcertificate@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.apache.felix.https.enable',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'org.apache.felix.https.enable@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.osgi.service.http.port.secure',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'org.osgi.service.http.port.secure@TypeHint',
                    label: '',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/apps/system/config/org.apache.felix.http'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': '',
                    },
                    params: {
                        'org.apache.felix.https.nio': bundle.inputData?.['org.apache.felix.https.nio'],
                        'org.apache.felix.https.nio@TypeHint': bundle.inputData?.['org.apache.felix.https.nio@TypeHint'],
                        'org.apache.felix.https.keystore': bundle.inputData?.['org.apache.felix.https.keystore'],
                        'org.apache.felix.https.keystore@TypeHint': bundle.inputData?.['org.apache.felix.https.keystore@TypeHint'],
                        'org.apache.felix.https.keystore.password': bundle.inputData?.['org.apache.felix.https.keystore.password'],
                        'org.apache.felix.https.keystore.password@TypeHint': bundle.inputData?.['org.apache.felix.https.keystore.password@TypeHint'],
                        'org.apache.felix.https.keystore.key': bundle.inputData?.['org.apache.felix.https.keystore.key'],
                        'org.apache.felix.https.keystore.key@TypeHint': bundle.inputData?.['org.apache.felix.https.keystore.key@TypeHint'],
                        'org.apache.felix.https.keystore.key.password': bundle.inputData?.['org.apache.felix.https.keystore.key.password'],
                        'org.apache.felix.https.keystore.key.password@TypeHint': bundle.inputData?.['org.apache.felix.https.keystore.key.password@TypeHint'],
                        'org.apache.felix.https.truststore': bundle.inputData?.['org.apache.felix.https.truststore'],
                        'org.apache.felix.https.truststore@TypeHint': bundle.inputData?.['org.apache.felix.https.truststore@TypeHint'],
                        'org.apache.felix.https.truststore.password': bundle.inputData?.['org.apache.felix.https.truststore.password'],
                        'org.apache.felix.https.truststore.password@TypeHint': bundle.inputData?.['org.apache.felix.https.truststore.password@TypeHint'],
                        'org.apache.felix.https.clientcertificate': bundle.inputData?.['org.apache.felix.https.clientcertificate'],
                        'org.apache.felix.https.clientcertificate@TypeHint': bundle.inputData?.['org.apache.felix.https.clientcertificate@TypeHint'],
                        'org.apache.felix.https.enable': bundle.inputData?.['org.apache.felix.https.enable'],
                        'org.apache.felix.https.enable@TypeHint': bundle.inputData?.['org.apache.felix.https.enable@TypeHint'],
                        'org.osgi.service.http.port.secure': bundle.inputData?.['org.osgi.service.http.port.secure'],
                        'org.osgi.service.http.port.secure@TypeHint': bundle.inputData?.['org.osgi.service.http.port.secure@TypeHint'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postConfigApacheFelixJettyBasedHttpService', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postConfigApacheHttpComponentsProxyConfiguration: {
        key: 'postConfigApacheHttpComponentsProxyConfiguration',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'proxy.host',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'proxy.host@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'proxy.port',
                    label: '',
                    type: 'integer',
                },
                {
                    key: 'proxy.port@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'proxy.exceptions',
                    label: '',
                    type: 'string',
                }
                {
                    key: 'proxy.exceptions@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'proxy.enabled',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'proxy.enabled@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'proxy.user',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'proxy.user@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'proxy.password',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'proxy.password@TypeHint',
                    label: '',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/apps/system/config/org.apache.http.proxyconfigurator.config'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': '',
                    },
                    params: {
                        'proxy.host': bundle.inputData?.['proxy.host'],
                        'proxy.host@TypeHint': bundle.inputData?.['proxy.host@TypeHint'],
                        'proxy.port': bundle.inputData?.['proxy.port'],
                        'proxy.port@TypeHint': bundle.inputData?.['proxy.port@TypeHint'],
                        'proxy.exceptions': bundle.inputData?.['proxy.exceptions'],
                        'proxy.exceptions@TypeHint': bundle.inputData?.['proxy.exceptions@TypeHint'],
                        'proxy.enabled': bundle.inputData?.['proxy.enabled'],
                        'proxy.enabled@TypeHint': bundle.inputData?.['proxy.enabled@TypeHint'],
                        'proxy.user': bundle.inputData?.['proxy.user'],
                        'proxy.user@TypeHint': bundle.inputData?.['proxy.user@TypeHint'],
                        'proxy.password': bundle.inputData?.['proxy.password'],
                        'proxy.password@TypeHint': bundle.inputData?.['proxy.password@TypeHint'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postConfigApacheHttpComponentsProxyConfiguration', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postConfigApacheSlingDavExServlet: {
        key: 'postConfigApacheSlingDavExServlet',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'alias',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'alias@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'dav.create-absolute-uri',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'dav.create-absolute-uri@TypeHint',
                    label: '',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': '',
                    },
                    params: {
                        'alias': bundle.inputData?.['alias'],
                        'alias@TypeHint': bundle.inputData?.['alias@TypeHint'],
                        'dav.create-absolute-uri': bundle.inputData?.['dav.create-absolute-uri'],
                        'dav.create-absolute-uri@TypeHint': bundle.inputData?.['dav.create-absolute-uri@TypeHint'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postConfigApacheSlingDavExServlet', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postConfigApacheSlingGetServlet: {
        key: 'postConfigApacheSlingGetServlet',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'json.maximumresults',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'json.maximumresults@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'enable.html',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'enable.html@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'enable.txt',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'enable.txt@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'enable.xml',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'enable.xml@TypeHint',
                    label: '',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': '',
                    },
                    params: {
                        'json.maximumresults': bundle.inputData?.['json.maximumresults'],
                        'json.maximumresults@TypeHint': bundle.inputData?.['json.maximumresults@TypeHint'],
                        'enable.html': bundle.inputData?.['enable.html'],
                        'enable.html@TypeHint': bundle.inputData?.['enable.html@TypeHint'],
                        'enable.txt': bundle.inputData?.['enable.txt'],
                        'enable.txt@TypeHint': bundle.inputData?.['enable.txt@TypeHint'],
                        'enable.xml': bundle.inputData?.['enable.xml'],
                        'enable.xml@TypeHint': bundle.inputData?.['enable.xml@TypeHint'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postConfigApacheSlingGetServlet', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postConfigApacheSlingReferrerFilter: {
        key: 'postConfigApacheSlingReferrerFilter',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'allow.empty',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'allow.empty@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'allow.hosts',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'allow.hosts@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'allow.hosts.regexp',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'allow.hosts.regexp@TypeHint',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'filter.methods',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'filter.methods@TypeHint',
                    label: '',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/apps/system/config/org.apache.sling.security.impl.ReferrerFilter'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': '',
                    },
                    params: {
                        'allow.empty': bundle.inputData?.['allow.empty'],
                        'allow.empty@TypeHint': bundle.inputData?.['allow.empty@TypeHint'],
                        'allow.hosts': bundle.inputData?.['allow.hosts'],
                        'allow.hosts@TypeHint': bundle.inputData?.['allow.hosts@TypeHint'],
                        'allow.hosts.regexp': bundle.inputData?.['allow.hosts.regexp'],
                        'allow.hosts.regexp@TypeHint': bundle.inputData?.['allow.hosts.regexp@TypeHint'],
                        'filter.methods': bundle.inputData?.['filter.methods'],
                        'filter.methods@TypeHint': bundle.inputData?.['filter.methods@TypeHint'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postConfigApacheSlingReferrerFilter', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postConfigProperty: {
        key: 'postConfigProperty',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'configNodeName',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/apps/system/config/{configNodeName}'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postConfigProperty', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postNode: {
        key: 'postNode',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'path',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'name',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: ':operation',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'deleteAuthorizable',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'file',
                    label: '',
                    type: 'file',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const formData = new FormData()
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['file'].split('/').slice(-1)[0]
                formData.append('file', (await (await z.request({url: bundle.inputData?.['file'], method: 'GET', raw: true})).buffer()), { filename: filename })
                const options = {
                    url: utils.replacePathParameters('http://localhost/{path}/{name}'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        
                        'Accept': '',
                    },
                    params: {
                        ':operation': bundle.inputData?.[':operation'],
                        'deleteAuthorizable': bundle.inputData?.['deleteAuthorizable'],
                    },
                    body: formData,
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postNode', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postNodeRw: {
        key: 'postNodeRw',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'path',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'name',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'addMembers',
                    label: '',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/{path}/{name}.rw.html'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': '',
                    },
                    params: {
                        'addMembers': bundle.inputData?.['addMembers'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postNodeRw', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postPath: {
        key: 'postPath',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'path',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'jcr:primaryType',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: ':name',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/{path}/'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': '',
                    },
                    params: {
                        'jcr:primaryType': bundle.inputData?.['jcr:primaryType'],
                        ':name': bundle.inputData?.[':name'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postPath', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postQuery: {
        key: 'postQuery',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'path',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'p.limit',
                    label: '',
                    type: 'number',
                    required: true,
                },
                {
                    key: '1_property',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: '1_property.value',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/bin/querybuilder.json'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'path': bundle.inputData?.['path'],
                        'p.limit': bundle.inputData?.['p.limit'],
                        '1_property': bundle.inputData?.['1_property'],
                        '1_property.value': bundle.inputData?.['1_property.value'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postQuery', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    postTreeActivation: {
        key: 'postTreeActivation',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'ignoredeactivated',
                    label: '',
                    type: 'boolean',
                    required: true,
                },
                {
                    key: 'onlymodified',
                    label: '',
                    type: 'boolean',
                    required: true,
                },
                {
                    key: 'path',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'cmd',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/libs/replication/treeactivation.html'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': '',
                    },
                    params: {
                        'ignoredeactivated': bundle.inputData?.['ignoredeactivated'],
                        'onlymodified': bundle.inputData?.['onlymodified'],
                        'path': bundle.inputData?.['path'],
                        'cmd': bundle.inputData?.['cmd'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postTreeActivation', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postTruststore: {
        key: 'postTruststore',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: ':operation',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'newPassword',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'rePassword',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'keyStoreType',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'removeAlias',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'certificate',
                    label: '',
                    type: 'file',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const formData = new FormData()
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['certificate'].split('/').slice(-1)[0]
                formData.append('certificate', (await (await z.request({url: bundle.inputData?.['certificate'], method: 'GET', raw: true})).buffer()), { filename: filename })
                const options = {
                    url: utils.replacePathParameters('http://localhost/libs/granite/security/post/truststore'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        
                        'Accept': 'text/plain',
                    },
                    params: {
                        ':operation': bundle.inputData?.[':operation'],
                        'newPassword': bundle.inputData?.['newPassword'],
                        'rePassword': bundle.inputData?.['rePassword'],
                        'keyStoreType': bundle.inputData?.['keyStoreType'],
                        'removeAlias': bundle.inputData?.['removeAlias'],
                    },
                    body: formData,
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postTruststore', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    postTruststorePKCS12: {
        key: 'postTruststorePKCS12',
        noun: 'sling',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'truststore.p12',
                    label: '',
                    type: 'file',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const formData = new FormData()
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['truststore.p12'].split('/').slice(-1)[0]
                formData.append('truststore.p12', (await (await z.request({url: bundle.inputData?.['truststore.p12'], method: 'GET', raw: true})).buffer()), { filename: filename })
                const options = {
                    url: utils.replacePathParameters('http://localhost/etc/truststore'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        
                        'Accept': 'text/plain',
                    },
                    params: {
                    },
                    body: formData,
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postTruststorePKCS12', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
}

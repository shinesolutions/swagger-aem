const samples = require('../samples/CustomApi');
const utils = require('../utils/utils');

module.exports = {
    getAemHealthCheck: {
        key: 'getAemHealthCheck',
        noun: 'custom',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'tags',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'combineTagsOr',
                    label: '',
                    type: 'boolean',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/system/health'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'tags': bundle.inputData?.['tags'],
                        'combineTagsOr': bundle.inputData?.['combineTagsOr'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getAemHealthCheck', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    postConfigAemHealthCheckServlet: {
        key: 'postConfigAemHealthCheckServlet',
        noun: 'custom',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'bundles.ignored',
                    label: '',
                    type: 'string',
                }
                {
                    key: 'bundles.ignored@TypeHint',
                    label: '',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': '',
                    },
                    params: {
                        'bundles.ignored': bundle.inputData?.['bundles.ignored'],
                        'bundles.ignored@TypeHint': bundle.inputData?.['bundles.ignored@TypeHint'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postConfigAemHealthCheckServlet', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postConfigAemPasswordReset: {
        key: 'postConfigAemPasswordReset',
        noun: 'custom',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'pwdreset.authorizables',
                    label: '',
                    type: 'string',
                }
                {
                    key: 'pwdreset.authorizables@TypeHint',
                    label: '',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/apps/system/config/com.shinesolutions.aem.passwordreset.Activator'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': '',
                    },
                    params: {
                        'pwdreset.authorizables': bundle.inputData?.['pwdreset.authorizables'],
                        'pwdreset.authorizables@TypeHint': bundle.inputData?.['pwdreset.authorizables@TypeHint'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postConfigAemPasswordReset', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
}

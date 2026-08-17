const samples = require('../samples/CrxApi');
const InstallStatus = require('../models/InstallStatus');
const utils = require('../utils/utils');
const FormData = require('form-data');

module.exports = {
    getCrxdeStatus: {
        key: 'getCrxdeStatus',
        noun: 'crx',
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
                    url: utils.replacePathParameters('http://localhost/crx/server/crx.default/jcr:root/.1.json'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'plain/text',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getCrxdeStatus', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    getInstallStatus: {
        key: 'getInstallStatus',
        noun: 'crx',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
            ],
            outputFields: [
                ...InstallStatus.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/crx/packmgr/installstatus.jsp'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getInstallStatus', response.json);
                    return results;
                })
            },
            sample: samples['InstallStatusSample']
        }
    },
    getPackageManagerServlet: {
        key: 'getPackageManagerServlet',
        noun: 'crx',
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
                    url: utils.replacePathParameters('http://localhost/crx/packmgr/service/script.html'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'text/html',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getPackageManagerServlet', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
    postPackageService: {
        key: 'postPackageService',
        noun: 'crx',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
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
                    url: utils.replacePathParameters('http://localhost/crx/packmgr/service.jsp'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'text/xml',
                    },
                    params: {
                        'cmd': bundle.inputData?.['cmd'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postPackageService', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    postPackageServiceJson: {
        key: 'postPackageServiceJson',
        noun: 'crx',
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
                    key: 'cmd',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'groupName',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'packageName',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'packageVersion',
                    label: '',
                    type: 'string',
                },
                {
                    key: '_charset_',
                    label: '',
                    type: 'string',
                },
                {
                    key: 'force',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'recursive',
                    label: '',
                    type: 'boolean',
                },
                {
                    key: 'package',
                    label: '',
                    type: 'file',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const formData = new FormData()
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['package'].split('/').slice(-1)[0]
                formData.append('package', (await (await z.request({url: bundle.inputData?.['package'], method: 'GET', raw: true})).buffer()), { filename: filename })
                const options = {
                    url: utils.replacePathParameters('http://localhost/crx/packmgr/service/.json/{path}'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        
                        'Accept': 'application/json',
                    },
                    params: {
                        'cmd': bundle.inputData?.['cmd'],
                        'groupName': bundle.inputData?.['groupName'],
                        'packageName': bundle.inputData?.['packageName'],
                        'packageVersion': bundle.inputData?.['packageVersion'],
                        '_charset_': bundle.inputData?.['_charset_'],
                        'force': bundle.inputData?.['force'],
                        'recursive': bundle.inputData?.['recursive'],
                    },
                    body: formData,
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postPackageServiceJson', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    postPackageUpdate: {
        key: 'postPackageUpdate',
        noun: 'crx',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'groupName',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'packageName',
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
                {
                    key: 'path',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'filter',
                    label: '',
                    type: 'string',
                },
                {
                    key: '_charset_',
                    label: '',
                    type: 'string',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/crx/packmgr/update.jsp'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'groupName': bundle.inputData?.['groupName'],
                        'packageName': bundle.inputData?.['packageName'],
                        'version': bundle.inputData?.['version'],
                        'path': bundle.inputData?.['path'],
                        'filter': bundle.inputData?.['filter'],
                        '_charset_': bundle.inputData?.['_charset_'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postPackageUpdate', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    postSetPassword: {
        key: 'postSetPassword',
        noun: 'crx',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'old',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'plain',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'verify',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/crx/explorer/ui/setpassword.jsp'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'text/plain',
                    },
                    params: {
                        'old': bundle.inputData?.['old'],
                        'plain': bundle.inputData?.['plain'],
                        'verify': bundle.inputData?.['verify'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postSetPassword', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
}

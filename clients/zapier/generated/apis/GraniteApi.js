const samples = require('../samples/GraniteApi');
const utils = require('../utils/utils');
const FormData = require('form-data');

module.exports = {
    sslSetup: {
        key: 'sslSetup',
        noun: 'granite',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'keystorePassword',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'keystorePasswordConfirm',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'truststorePassword',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'truststorePasswordConfirm',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'httpsHostname',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'httpsPort',
                    label: '',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'privatekeyFile',
                    label: '',
                    type: 'file',
                },
                {
                    key: 'certificateFile',
                    label: '',
                    type: 'file',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const formData = new FormData()
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['privatekeyFile'].split('/').slice(-1)[0]
                formData.append('privatekeyFile', (await (await z.request({url: bundle.inputData?.['privatekeyFile'], method: 'GET', raw: true})).buffer()), { filename: filename })
                const filename = bundle.inputData?.['filename'] || bundle.inputData?.['certificateFile'].split('/').slice(-1)[0]
                formData.append('certificateFile', (await (await z.request({url: bundle.inputData?.['certificateFile'], method: 'GET', raw: true})).buffer()), { filename: filename })
                const options = {
                    url: utils.replacePathParameters('http://localhost/libs/granite/security/post/sslSetup.html'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        
                        'Accept': 'text/plain',
                    },
                    params: {
                        'keystorePassword': bundle.inputData?.['keystorePassword'],
                        'keystorePasswordConfirm': bundle.inputData?.['keystorePasswordConfirm'],
                        'truststorePassword': bundle.inputData?.['truststorePassword'],
                        'truststorePasswordConfirm': bundle.inputData?.['truststorePasswordConfirm'],
                        'httpsHostname': bundle.inputData?.['httpsHostname'],
                        'httpsPort': bundle.inputData?.['httpsPort'],
                    },
                    body: formData,
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'sslSetup', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
}

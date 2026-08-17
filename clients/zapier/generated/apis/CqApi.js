const samples = require('../samples/CqApi');
const utils = require('../utils/utils');

module.exports = {
    getLoginPage: {
        key: 'getLoginPage',
        noun: 'cq',
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
                    url: utils.replacePathParameters('http://localhost/libs/granite/core/content/login.html'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getLoginPage', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    postCqActions: {
        key: 'postCqActions',
        noun: 'cq',
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
                    key: 'changelog',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('http://localhost/.cqactions.html'),
                    method: 'POST',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': '',
                    },
                    params: {
                        'authorizableId': bundle.inputData?.['authorizableId'],
                        'changelog': bundle.inputData?.['changelog'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'postCqActions', response.json);
                    return results;
                })
            },
            sample: { data: {} }
        }
    },
}

const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `property name - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}optional`,
                label: `True if optional - [${labelPrefix}optional]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_set`,
                label: `True if property is set - [${labelPrefix}is_set]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}type`,
                label: `Property type, 1=String, 3=long, 11=boolean, 12=Password - [${labelPrefix}type]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}value`,
                label: `Property value - [${labelPrefix}value]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}description`,
                label: `Property description - [${labelPrefix}description]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'optional': bundle.inputData?.[`${keyPrefix}optional`],
            'is_set': bundle.inputData?.[`${keyPrefix}is_set`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
        }
    },
}

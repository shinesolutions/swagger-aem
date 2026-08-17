const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}alias`,
                label: `Truststore alias name - [${labelPrefix}alias]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}entryType`,
                label: `[${labelPrefix}entryType]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}subject`,
                label: `e.g. \"CN=localhost\" - [${labelPrefix}subject]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}issuer`,
                label: `e.g. \"CN=Admin\" - [${labelPrefix}issuer]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}notBefore`,
                label: `e.g. \"Sun Jul 01 12:00:00 AEST 2018\" - [${labelPrefix}notBefore]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}notAfter`,
                label: `e.g. \"Sun Jun 30 23:59:50 AEST 2019\" - [${labelPrefix}notAfter]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}serialNumber`,
                label: `18165099476682912368 - [${labelPrefix}serialNumber]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'alias': bundle.inputData?.[`${keyPrefix}alias`],
            'entryType': bundle.inputData?.[`${keyPrefix}entryType`],
            'subject': bundle.inputData?.[`${keyPrefix}subject`],
            'issuer': bundle.inputData?.[`${keyPrefix}issuer`],
            'notBefore': bundle.inputData?.[`${keyPrefix}notBefore`],
            'notAfter': bundle.inputData?.[`${keyPrefix}notAfter`],
            'serialNumber': bundle.inputData?.[`${keyPrefix}serialNumber`],
        }
    },
}

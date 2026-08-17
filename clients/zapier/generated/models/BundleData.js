const utils = require('../utils/utils');
const BundleDataProp = require('../models/BundleDataProp');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Bundle ID - [${labelPrefix}id]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `Bundle name - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}fragment`,
                label: `Is bundle a fragment - [${labelPrefix}fragment]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}stateRaw`,
                label: `Numeric raw bundle state value - [${labelPrefix}stateRaw]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}state`,
                label: `Bundle state value - [${labelPrefix}state]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}version`,
                label: `Bundle version - [${labelPrefix}version]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}symbolicName`,
                label: `Bundle symbolic name - [${labelPrefix}symbolicName]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}category`,
                label: `Bundle category - [${labelPrefix}category]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}props`,
                label: `[${labelPrefix}props]`,
                children: BundleDataProp.fields(`${keyPrefix}props${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'fragment': bundle.inputData?.[`${keyPrefix}fragment`],
            'stateRaw': bundle.inputData?.[`${keyPrefix}stateRaw`],
            'state': bundle.inputData?.[`${keyPrefix}state`],
            'version': bundle.inputData?.[`${keyPrefix}version`],
            'symbolicName': bundle.inputData?.[`${keyPrefix}symbolicName`],
            'category': bundle.inputData?.[`${keyPrefix}category`],
            'props': utils.childMapping(bundle.inputData?.[`${keyPrefix}props`], `${keyPrefix}props`, BundleDataProp),
        }
    },
}

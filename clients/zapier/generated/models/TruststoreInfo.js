const utils = require('../utils/utils');
const TruststoreItems = require('../models/TruststoreItems');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}aliases`,
                label: `[${labelPrefix}aliases]`,
                children: TruststoreItems.fields(`${keyPrefix}aliases${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}exists`,
                label: `False if truststore don't exist - [${labelPrefix}exists]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'aliases': utils.childMapping(bundle.inputData?.[`${keyPrefix}aliases`], `${keyPrefix}aliases`, TruststoreItems),
            'exists': bundle.inputData?.[`${keyPrefix}exists`],
        }
    },
}

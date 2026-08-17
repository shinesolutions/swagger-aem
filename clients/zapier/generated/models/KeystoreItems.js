const utils = require('../utils/utils');
const KeystoreChainItems = require('../models/KeystoreChainItems');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}alias`,
                label: `Keystore alias name - [${labelPrefix}alias]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}entryType`,
                label: `e.g. \"privateKey\" - [${labelPrefix}entryType]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}algorithm`,
                label: `e.g. \"RSA\" - [${labelPrefix}algorithm]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}format`,
                label: `e.g. \"PKCS#8\" - [${labelPrefix}format]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}chain`,
                label: `[${labelPrefix}chain]`,
                children: KeystoreChainItems.fields(`${keyPrefix}chain${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'alias': bundle.inputData?.[`${keyPrefix}alias`],
            'entryType': bundle.inputData?.[`${keyPrefix}entryType`],
            'algorithm': bundle.inputData?.[`${keyPrefix}algorithm`],
            'format': bundle.inputData?.[`${keyPrefix}format`],
            'chain': utils.childMapping(bundle.inputData?.[`${keyPrefix}chain`], `${keyPrefix}chain`, KeystoreChainItems),
        }
    },
}

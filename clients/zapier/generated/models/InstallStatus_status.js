const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}finished`,
                label: `[${labelPrefix}finished]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}itemCount`,
                label: `[${labelPrefix}itemCount]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'finished': bundle.inputData?.[`${keyPrefix}finished`],
            'itemCount': bundle.inputData?.[`${keyPrefix}itemCount`],
        }
    },
}

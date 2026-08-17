const utils = require('../utils/utils');
const BundleData = require('../models/BundleData');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                label: `Status description of all bundles - [${labelPrefix}status]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}s`,
                label: `[${labelPrefix}s]`,
                list: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                children: BundleData.fields(`${keyPrefix}data${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            's': bundle.inputData?.[`${keyPrefix}s`],
            'data': utils.childMapping(bundle.inputData?.[`${keyPrefix}data`], `${keyPrefix}data`, BundleData),
        }
    },
}

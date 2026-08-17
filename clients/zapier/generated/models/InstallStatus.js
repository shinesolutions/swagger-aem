const utils = require('../utils/utils');
const InstallStatus_status = require('../models/InstallStatus_status');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...InstallStatus_status.fields(`${keyPrefix}status`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': utils.removeIfEmpty(InstallStatus_status.mapping(bundle, `${keyPrefix}status`)),
        }
    },
}

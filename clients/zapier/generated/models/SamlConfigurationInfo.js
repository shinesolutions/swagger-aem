const utils = require('../utils/utils');
const SamlConfigurationProperties = require('../models/SamlConfigurationProperties');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}pid`,
                label: `Persistent Identity (PID) - [${labelPrefix}pid]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}title`,
                label: `Title - [${labelPrefix}title]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `Title - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}bundle_location`,
                label: `needed for configuration binding - [${labelPrefix}bundle_location]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}service_location`,
                label: `needed for configuraiton binding - [${labelPrefix}service_location]`,
                type: 'string',
            },
            ...SamlConfigurationProperties.fields(`${keyPrefix}properties`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'pid': bundle.inputData?.[`${keyPrefix}pid`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'bundle_location': bundle.inputData?.[`${keyPrefix}bundle_location`],
            'service_location': bundle.inputData?.[`${keyPrefix}service_location`],
            'properties': utils.removeIfEmpty(SamlConfigurationProperties.mapping(bundle, `${keyPrefix}properties`)),
        }
    },
}

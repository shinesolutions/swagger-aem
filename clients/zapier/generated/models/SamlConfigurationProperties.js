const utils = require('../utils/utils');
const SamlConfigurationPropertyItemsArray = require('../models/SamlConfigurationPropertyItemsArray');
const SamlConfigurationPropertyItemsBoolean = require('../models/SamlConfigurationPropertyItemsBoolean');
const SamlConfigurationPropertyItemsLong = require('../models/SamlConfigurationPropertyItemsLong');
const SamlConfigurationPropertyItemsString = require('../models/SamlConfigurationPropertyItemsString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...SamlConfigurationPropertyItemsArray.fields(`${keyPrefix}path`, isInput),
            ...SamlConfigurationPropertyItemsLong.fields(`${keyPrefix}service.ranking`, isInput),
            ...SamlConfigurationPropertyItemsString.fields(`${keyPrefix}idpUrl`, isInput),
            ...SamlConfigurationPropertyItemsString.fields(`${keyPrefix}idpCertAlias`, isInput),
            ...SamlConfigurationPropertyItemsBoolean.fields(`${keyPrefix}idpHttpRedirect`, isInput),
            ...SamlConfigurationPropertyItemsString.fields(`${keyPrefix}serviceProviderEntityId`, isInput),
            ...SamlConfigurationPropertyItemsString.fields(`${keyPrefix}assertionConsumerServiceURL`, isInput),
            ...SamlConfigurationPropertyItemsString.fields(`${keyPrefix}spPrivateKeyAlias`, isInput),
            ...SamlConfigurationPropertyItemsString.fields(`${keyPrefix}keyStorePassword`, isInput),
            ...SamlConfigurationPropertyItemsString.fields(`${keyPrefix}defaultRedirectUrl`, isInput),
            ...SamlConfigurationPropertyItemsString.fields(`${keyPrefix}userIDAttribute`, isInput),
            ...SamlConfigurationPropertyItemsBoolean.fields(`${keyPrefix}useEncryption`, isInput),
            ...SamlConfigurationPropertyItemsBoolean.fields(`${keyPrefix}createUser`, isInput),
            ...SamlConfigurationPropertyItemsBoolean.fields(`${keyPrefix}addGroupMemberships`, isInput),
            ...SamlConfigurationPropertyItemsString.fields(`${keyPrefix}groupMembershipAttribute`, isInput),
            ...SamlConfigurationPropertyItemsArray.fields(`${keyPrefix}defaultGroups`, isInput),
            ...SamlConfigurationPropertyItemsString.fields(`${keyPrefix}nameIdFormat`, isInput),
            ...SamlConfigurationPropertyItemsArray.fields(`${keyPrefix}synchronizeAttributes`, isInput),
            ...SamlConfigurationPropertyItemsBoolean.fields(`${keyPrefix}handleLogout`, isInput),
            ...SamlConfigurationPropertyItemsString.fields(`${keyPrefix}logoutUrl`, isInput),
            ...SamlConfigurationPropertyItemsLong.fields(`${keyPrefix}clockTolerance`, isInput),
            ...SamlConfigurationPropertyItemsString.fields(`${keyPrefix}digestMethod`, isInput),
            ...SamlConfigurationPropertyItemsString.fields(`${keyPrefix}signatureMethod`, isInput),
            ...SamlConfigurationPropertyItemsString.fields(`${keyPrefix}userIntermediatePath`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'path': utils.removeIfEmpty(SamlConfigurationPropertyItemsArray.mapping(bundle, `${keyPrefix}path`)),
            'service.ranking': utils.removeIfEmpty(SamlConfigurationPropertyItemsLong.mapping(bundle, `${keyPrefix}service.ranking`)),
            'idpUrl': utils.removeIfEmpty(SamlConfigurationPropertyItemsString.mapping(bundle, `${keyPrefix}idpUrl`)),
            'idpCertAlias': utils.removeIfEmpty(SamlConfigurationPropertyItemsString.mapping(bundle, `${keyPrefix}idpCertAlias`)),
            'idpHttpRedirect': utils.removeIfEmpty(SamlConfigurationPropertyItemsBoolean.mapping(bundle, `${keyPrefix}idpHttpRedirect`)),
            'serviceProviderEntityId': utils.removeIfEmpty(SamlConfigurationPropertyItemsString.mapping(bundle, `${keyPrefix}serviceProviderEntityId`)),
            'assertionConsumerServiceURL': utils.removeIfEmpty(SamlConfigurationPropertyItemsString.mapping(bundle, `${keyPrefix}assertionConsumerServiceURL`)),
            'spPrivateKeyAlias': utils.removeIfEmpty(SamlConfigurationPropertyItemsString.mapping(bundle, `${keyPrefix}spPrivateKeyAlias`)),
            'keyStorePassword': utils.removeIfEmpty(SamlConfigurationPropertyItemsString.mapping(bundle, `${keyPrefix}keyStorePassword`)),
            'defaultRedirectUrl': utils.removeIfEmpty(SamlConfigurationPropertyItemsString.mapping(bundle, `${keyPrefix}defaultRedirectUrl`)),
            'userIDAttribute': utils.removeIfEmpty(SamlConfigurationPropertyItemsString.mapping(bundle, `${keyPrefix}userIDAttribute`)),
            'useEncryption': utils.removeIfEmpty(SamlConfigurationPropertyItemsBoolean.mapping(bundle, `${keyPrefix}useEncryption`)),
            'createUser': utils.removeIfEmpty(SamlConfigurationPropertyItemsBoolean.mapping(bundle, `${keyPrefix}createUser`)),
            'addGroupMemberships': utils.removeIfEmpty(SamlConfigurationPropertyItemsBoolean.mapping(bundle, `${keyPrefix}addGroupMemberships`)),
            'groupMembershipAttribute': utils.removeIfEmpty(SamlConfigurationPropertyItemsString.mapping(bundle, `${keyPrefix}groupMembershipAttribute`)),
            'defaultGroups': utils.removeIfEmpty(SamlConfigurationPropertyItemsArray.mapping(bundle, `${keyPrefix}defaultGroups`)),
            'nameIdFormat': utils.removeIfEmpty(SamlConfigurationPropertyItemsString.mapping(bundle, `${keyPrefix}nameIdFormat`)),
            'synchronizeAttributes': utils.removeIfEmpty(SamlConfigurationPropertyItemsArray.mapping(bundle, `${keyPrefix}synchronizeAttributes`)),
            'handleLogout': utils.removeIfEmpty(SamlConfigurationPropertyItemsBoolean.mapping(bundle, `${keyPrefix}handleLogout`)),
            'logoutUrl': utils.removeIfEmpty(SamlConfigurationPropertyItemsString.mapping(bundle, `${keyPrefix}logoutUrl`)),
            'clockTolerance': utils.removeIfEmpty(SamlConfigurationPropertyItemsLong.mapping(bundle, `${keyPrefix}clockTolerance`)),
            'digestMethod': utils.removeIfEmpty(SamlConfigurationPropertyItemsString.mapping(bundle, `${keyPrefix}digestMethod`)),
            'signatureMethod': utils.removeIfEmpty(SamlConfigurationPropertyItemsString.mapping(bundle, `${keyPrefix}signatureMethod`)),
            'userIntermediatePath': utils.removeIfEmpty(SamlConfigurationPropertyItemsString.mapping(bundle, `${keyPrefix}userIntermediatePath`)),
        }
    },
}

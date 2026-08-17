/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* returns List
* */
const getAemProductInfo = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* name String 
* returns BundleInfo
* */
const getBundleInfo = ({ name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* returns String
* */
const getConfigMgr = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* name String 
* action String 
* no response value expected for this operation
* */
const postBundle = ({ name, action }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        action,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* action String 
* no response value expected for this operation
* */
const postJmxRepository = ({ action }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* post Boolean  (optional)
* apply Boolean  (optional)
* _delete Boolean  (optional)
* action String  (optional)
* Dollarlocation String  (optional)
* path List  (optional)
* servicePeriodranking Integer  (optional)
* idpUrl String  (optional)
* idpCertAlias String  (optional)
* idpHttpRedirect Boolean  (optional)
* serviceProviderEntityId String  (optional)
* assertionConsumerServiceURL String  (optional)
* spPrivateKeyAlias String  (optional)
* keyStorePassword String  (optional)
* defaultRedirectUrl String  (optional)
* userIDAttribute String  (optional)
* useEncryption Boolean  (optional)
* createUser Boolean  (optional)
* addGroupMemberships Boolean  (optional)
* groupMembershipAttribute String  (optional)
* defaultGroups List  (optional)
* nameIdFormat String  (optional)
* synchronizeAttributes List  (optional)
* handleLogout Boolean  (optional)
* logoutUrl String  (optional)
* clockTolerance Integer  (optional)
* digestMethod String  (optional)
* signatureMethod String  (optional)
* userIntermediatePath String  (optional)
* propertylist List  (optional)
* returns SamlConfigurationInfo
* */
const postSamlConfiguration = ({ post, apply, _delete, action, Dollarlocation, path, servicePeriodranking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        post,
        apply,
        _delete,
        action,
        Dollarlocation,
        path,
        servicePeriodranking,
        idpUrl,
        idpCertAlias,
        idpHttpRedirect,
        serviceProviderEntityId,
        assertionConsumerServiceURL,
        spPrivateKeyAlias,
        keyStorePassword,
        defaultRedirectUrl,
        userIDAttribute,
        useEncryption,
        createUser,
        addGroupMemberships,
        groupMembershipAttribute,
        defaultGroups,
        nameIdFormat,
        synchronizeAttributes,
        handleLogout,
        logoutUrl,
        clockTolerance,
        digestMethod,
        signatureMethod,
        userIntermediatePath,
        propertylist,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  getAemProductInfo,
  getBundleInfo,
  getConfigMgr,
  postBundle,
  postJmxRepository,
  postSamlConfiguration,
};

'use strict';


/**
 *
 * returns List
 **/
exports.getAemProductInfo = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 *
 * returns String
 **/
exports.getConfigMgr = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 *
 * name String 
 * action String 
 * no response value expected for this operation
 **/
exports.postBundle = function(name,action) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 *
 * action String 
 * no response value expected for this operation
 **/
exports.postJmxRepository = function(action) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


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
 **/
exports.postSamlConfiguration = function(post,apply,_delete,action,Dollarlocation,path,servicePeriodranking,idpUrl,idpCertAlias,idpHttpRedirect,serviceProviderEntityId,assertionConsumerServiceURL,spPrivateKeyAlias,keyStorePassword,defaultRedirectUrl,userIDAttribute,useEncryption,createUser,addGroupMemberships,groupMembershipAttribute,defaultGroups,nameIdFormat,synchronizeAttributes,handleLogout,logoutUrl,clockTolerance,digestMethod,signatureMethod,userIntermediatePath,propertylist) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


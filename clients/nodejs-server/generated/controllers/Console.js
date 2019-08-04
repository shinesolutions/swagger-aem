'use strict';

var utils = require('../utils/writer.js');
var Console = require('../service/ConsoleService');

module.exports.getAemProductInfo = function getAemProductInfo (req, res, next) {
  Console.getAemProductInfo()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getConfigMgr = function getConfigMgr (req, res, next) {
  Console.getConfigMgr()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postBundle = function postBundle (req, res, next) {
  var name = req.swagger.params['name'].value;
  var action = req.swagger.params['action'].value;
  Console.postBundle(name,action)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postJmxRepository = function postJmxRepository (req, res, next) {
  var action = req.swagger.params['action'].value;
  Console.postJmxRepository(action)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postSamlConfiguration = function postSamlConfiguration (req, res, next) {
  var post = req.swagger.params['post'].value;
  var apply = req.swagger.params['apply'].value;
  var _delete = req.swagger.params['delete'].value;
  var action = req.swagger.params['action'].value;
  var Dollarlocation = req.swagger.params['$location'].value;
  var path = req.swagger.params['path'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var idpUrl = req.swagger.params['idpUrl'].value;
  var idpCertAlias = req.swagger.params['idpCertAlias'].value;
  var idpHttpRedirect = req.swagger.params['idpHttpRedirect'].value;
  var serviceProviderEntityId = req.swagger.params['serviceProviderEntityId'].value;
  var assertionConsumerServiceURL = req.swagger.params['assertionConsumerServiceURL'].value;
  var spPrivateKeyAlias = req.swagger.params['spPrivateKeyAlias'].value;
  var keyStorePassword = req.swagger.params['keyStorePassword'].value;
  var defaultRedirectUrl = req.swagger.params['defaultRedirectUrl'].value;
  var userIDAttribute = req.swagger.params['userIDAttribute'].value;
  var useEncryption = req.swagger.params['useEncryption'].value;
  var createUser = req.swagger.params['createUser'].value;
  var addGroupMemberships = req.swagger.params['addGroupMemberships'].value;
  var groupMembershipAttribute = req.swagger.params['groupMembershipAttribute'].value;
  var defaultGroups = req.swagger.params['defaultGroups'].value;
  var nameIdFormat = req.swagger.params['nameIdFormat'].value;
  var synchronizeAttributes = req.swagger.params['synchronizeAttributes'].value;
  var handleLogout = req.swagger.params['handleLogout'].value;
  var logoutUrl = req.swagger.params['logoutUrl'].value;
  var clockTolerance = req.swagger.params['clockTolerance'].value;
  var digestMethod = req.swagger.params['digestMethod'].value;
  var signatureMethod = req.swagger.params['signatureMethod'].value;
  var userIntermediatePath = req.swagger.params['userIntermediatePath'].value;
  var propertylist = req.swagger.params['propertylist'].value;
  Console.postSamlConfiguration(post,apply,_delete,action,Dollarlocation,path,servicePeriodranking,idpUrl,idpCertAlias,idpHttpRedirect,serviceProviderEntityId,assertionConsumerServiceURL,spPrivateKeyAlias,keyStorePassword,defaultRedirectUrl,userIDAttribute,useEncryption,createUser,addGroupMemberships,groupMembershipAttribute,defaultGroups,nameIdFormat,synchronizeAttributes,handleLogout,logoutUrl,clockTolerance,digestMethod,signatureMethod,userIntermediatePath,propertylist)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

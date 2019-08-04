'use strict';

var utils = require('../utils/writer.js');
var Crx = require('../service/CrxService');

module.exports.getCrxdeStatus = function getCrxdeStatus (req, res, next) {
  Crx.getCrxdeStatus()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getInstallStatus = function getInstallStatus (req, res, next) {
  Crx.getInstallStatus()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getPackageManagerServlet = function getPackageManagerServlet (req, res, next) {
  Crx.getPackageManagerServlet()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postPackageService = function postPackageService (req, res, next) {
  var cmd = req.swagger.params['cmd'].value;
  Crx.postPackageService(cmd)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postPackageServiceJson = function postPackageServiceJson (req, res, next) {
  var path = req.swagger.params['path'].value;
  var cmd = req.swagger.params['cmd'].value;
  var groupName = req.swagger.params['groupName'].value;
  var packageName = req.swagger.params['packageName'].value;
  var packageVersion = req.swagger.params['packageVersion'].value;
  var UnderscorecharsetUnderscore = req.swagger.params['_charset_'].value;
  var force = req.swagger.params['force'].value;
  var recursive = req.swagger.params['recursive'].value;
  var package = req.swagger.params['package'].value;
  Crx.postPackageServiceJson(path,cmd,groupName,packageName,packageVersion,UnderscorecharsetUnderscore,force,recursive,package)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postPackageUpdate = function postPackageUpdate (req, res, next) {
  var groupName = req.swagger.params['groupName'].value;
  var packageName = req.swagger.params['packageName'].value;
  var version = req.swagger.params['version'].value;
  var path = req.swagger.params['path'].value;
  var filter = req.swagger.params['filter'].value;
  var UnderscorecharsetUnderscore = req.swagger.params['_charset_'].value;
  Crx.postPackageUpdate(groupName,packageName,version,path,filter,UnderscorecharsetUnderscore)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postSetPassword = function postSetPassword (req, res, next) {
  var old = req.swagger.params['old'].value;
  var plain = req.swagger.params['plain'].value;
  var verify = req.swagger.params['verify'].value;
  Crx.postSetPassword(old,plain,verify)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

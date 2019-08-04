'use strict';

var utils = require('../utils/writer.js');
var Custom = require('../service/CustomService');

module.exports.getAemHealthCheck = function getAemHealthCheck (req, res, next) {
  var tags = req.swagger.params['tags'].value;
  var combineTagsOr = req.swagger.params['combineTagsOr'].value;
  Custom.getAemHealthCheck(tags,combineTagsOr)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postConfigAemHealthCheckServlet = function postConfigAemHealthCheckServlet (req, res, next) {
  var bundlesPeriodignored = req.swagger.params['bundles.ignored'].value;
  var bundlesPeriodignoredAtTypeHint = req.swagger.params['bundles.ignored@TypeHint'].value;
  Custom.postConfigAemHealthCheckServlet(bundlesPeriodignored,bundlesPeriodignoredAtTypeHint)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postConfigAemPasswordReset = function postConfigAemPasswordReset (req, res, next) {
  var pwdresetPeriodauthorizables = req.swagger.params['pwdreset.authorizables'].value;
  var pwdresetPeriodauthorizablesAtTypeHint = req.swagger.params['pwdreset.authorizables@TypeHint'].value;
  Custom.postConfigAemPasswordReset(pwdresetPeriodauthorizables,pwdresetPeriodauthorizablesAtTypeHint)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

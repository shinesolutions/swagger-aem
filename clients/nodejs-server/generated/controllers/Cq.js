'use strict';

var utils = require('../utils/writer.js');
var Cq = require('../service/CqService');

module.exports.getLoginPage = function getLoginPage (req, res, next) {
  Cq.getLoginPage()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postCqActions = function postCqActions (req, res, next) {
  var authorizableId = req.swagger.params['authorizableId'].value;
  var changelog = req.swagger.params['changelog'].value;
  Cq.postCqActions(authorizableId,changelog)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

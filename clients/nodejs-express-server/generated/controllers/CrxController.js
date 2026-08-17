/**
 * The CrxController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CrxService');
const getCrxdeStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCrxdeStatus);
};

const getInstallStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.getInstallStatus);
};

const getPackageManagerServlet = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPackageManagerServlet);
};

const postPackageService = async (request, response) => {
  await Controller.handleRequest(request, response, service.postPackageService);
};

const postPackageServiceJson = async (request, response) => {
  await Controller.handleRequest(request, response, service.postPackageServiceJson);
};

const postPackageUpdate = async (request, response) => {
  await Controller.handleRequest(request, response, service.postPackageUpdate);
};

const postSetPassword = async (request, response) => {
  await Controller.handleRequest(request, response, service.postSetPassword);
};


module.exports = {
  getCrxdeStatus,
  getInstallStatus,
  getPackageManagerServlet,
  postPackageService,
  postPackageServiceJson,
  postPackageUpdate,
  postSetPassword,
};

/**
 * The SlingController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/SlingService');
const deleteAgent = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteAgent);
};

const deleteNode = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteNode);
};

const getAgent = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAgent);
};

const getAgents = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAgents);
};

const getAuthorizableKeystore = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAuthorizableKeystore);
};

const getKeystore = async (request, response) => {
  await Controller.handleRequest(request, response, service.getKeystore);
};

const getNode = async (request, response) => {
  await Controller.handleRequest(request, response, service.getNode);
};

const getPackage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPackage);
};

const getPackageFilter = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPackageFilter);
};

const getQuery = async (request, response) => {
  await Controller.handleRequest(request, response, service.getQuery);
};

const getTruststore = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTruststore);
};

const getTruststoreInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTruststoreInfo);
};

const postAgent = async (request, response) => {
  await Controller.handleRequest(request, response, service.postAgent);
};

const postAuthorizableKeystore = async (request, response) => {
  await Controller.handleRequest(request, response, service.postAuthorizableKeystore);
};

const postAuthorizables = async (request, response) => {
  await Controller.handleRequest(request, response, service.postAuthorizables);
};

const postConfigAdobeGraniteSamlAuthenticationHandler = async (request, response) => {
  await Controller.handleRequest(request, response, service.postConfigAdobeGraniteSamlAuthenticationHandler);
};

const postConfigApacheFelixJettyBasedHttpService = async (request, response) => {
  await Controller.handleRequest(request, response, service.postConfigApacheFelixJettyBasedHttpService);
};

const postConfigApacheHttpComponentsProxyConfiguration = async (request, response) => {
  await Controller.handleRequest(request, response, service.postConfigApacheHttpComponentsProxyConfiguration);
};

const postConfigApacheSlingDavExServlet = async (request, response) => {
  await Controller.handleRequest(request, response, service.postConfigApacheSlingDavExServlet);
};

const postConfigApacheSlingGetServlet = async (request, response) => {
  await Controller.handleRequest(request, response, service.postConfigApacheSlingGetServlet);
};

const postConfigApacheSlingReferrerFilter = async (request, response) => {
  await Controller.handleRequest(request, response, service.postConfigApacheSlingReferrerFilter);
};

const postConfigProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.postConfigProperty);
};

const postNode = async (request, response) => {
  await Controller.handleRequest(request, response, service.postNode);
};

const postNodeRw = async (request, response) => {
  await Controller.handleRequest(request, response, service.postNodeRw);
};

const postPath = async (request, response) => {
  await Controller.handleRequest(request, response, service.postPath);
};

const postQuery = async (request, response) => {
  await Controller.handleRequest(request, response, service.postQuery);
};

const postTreeActivation = async (request, response) => {
  await Controller.handleRequest(request, response, service.postTreeActivation);
};

const postTruststore = async (request, response) => {
  await Controller.handleRequest(request, response, service.postTruststore);
};

const postTruststorePKCS12 = async (request, response) => {
  await Controller.handleRequest(request, response, service.postTruststorePKCS12);
};


module.exports = {
  deleteAgent,
  deleteNode,
  getAgent,
  getAgents,
  getAuthorizableKeystore,
  getKeystore,
  getNode,
  getPackage,
  getPackageFilter,
  getQuery,
  getTruststore,
  getTruststoreInfo,
  postAgent,
  postAuthorizableKeystore,
  postAuthorizables,
  postConfigAdobeGraniteSamlAuthenticationHandler,
  postConfigApacheFelixJettyBasedHttpService,
  postConfigApacheHttpComponentsProxyConfiguration,
  postConfigApacheSlingDavExServlet,
  postConfigApacheSlingGetServlet,
  postConfigApacheSlingReferrerFilter,
  postConfigProperty,
  postNode,
  postNodeRw,
  postPath,
  postQuery,
  postTreeActivation,
  postTruststore,
  postTruststorePKCS12,
};

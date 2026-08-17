const ConsoleApi = require('../apis/ConsoleApi');
const CqApi = require('../apis/CqApi');
const CrxApi = require('../apis/CrxApi');
const CustomApi = require('../apis/CustomApi');
const GraniteApi = require('../apis/GraniteApi');
const SlingApi = require('../apis/SlingApi');
const { triggerMiddleware, isTrigger, searchMiddleware, hasSearchRequisites, isSearchAction, isCreateAction, createMiddleware } = require('../utils/utils');

const actions = {
    [ConsoleApi.getAemProductInfo.key]: ConsoleApi.getAemProductInfo,
    [ConsoleApi.getBundleInfo.key]: ConsoleApi.getBundleInfo,
    [ConsoleApi.getConfigMgr.key]: ConsoleApi.getConfigMgr,
    [ConsoleApi.postBundle.key]: ConsoleApi.postBundle,
    [ConsoleApi.postJmxRepository.key]: ConsoleApi.postJmxRepository,
    [ConsoleApi.postSamlConfiguration.key]: ConsoleApi.postSamlConfiguration,
    [CqApi.getLoginPage.key]: CqApi.getLoginPage,
    [CqApi.postCqActions.key]: CqApi.postCqActions,
    [CrxApi.getCrxdeStatus.key]: CrxApi.getCrxdeStatus,
    [CrxApi.getInstallStatus.key]: CrxApi.getInstallStatus,
    [CrxApi.getPackageManagerServlet.key]: CrxApi.getPackageManagerServlet,
    [CrxApi.postPackageService.key]: CrxApi.postPackageService,
    [CrxApi.postPackageServiceJson.key]: CrxApi.postPackageServiceJson,
    [CrxApi.postPackageUpdate.key]: CrxApi.postPackageUpdate,
    [CrxApi.postSetPassword.key]: CrxApi.postSetPassword,
    [CustomApi.getAemHealthCheck.key]: CustomApi.getAemHealthCheck,
    [CustomApi.postConfigAemHealthCheckServlet.key]: CustomApi.postConfigAemHealthCheckServlet,
    [CustomApi.postConfigAemPasswordReset.key]: CustomApi.postConfigAemPasswordReset,
    [GraniteApi.sslSetup.key]: GraniteApi.sslSetup,
    [SlingApi.deleteAgent.key]: SlingApi.deleteAgent,
    [SlingApi.deleteNode.key]: SlingApi.deleteNode,
    [SlingApi.getAgent.key]: SlingApi.getAgent,
    [SlingApi.getAgents.key]: SlingApi.getAgents,
    [SlingApi.getAuthorizableKeystore.key]: SlingApi.getAuthorizableKeystore,
    [SlingApi.getKeystore.key]: SlingApi.getKeystore,
    [SlingApi.getNode.key]: SlingApi.getNode,
    [SlingApi.getPackage.key]: SlingApi.getPackage,
    [SlingApi.getPackageFilter.key]: SlingApi.getPackageFilter,
    [SlingApi.getQuery.key]: SlingApi.getQuery,
    [SlingApi.getTruststore.key]: SlingApi.getTruststore,
    [SlingApi.getTruststoreInfo.key]: SlingApi.getTruststoreInfo,
    [SlingApi.postAgent.key]: SlingApi.postAgent,
    [SlingApi.postAuthorizableKeystore.key]: SlingApi.postAuthorizableKeystore,
    [SlingApi.postAuthorizables.key]: SlingApi.postAuthorizables,
    [SlingApi.postConfigAdobeGraniteSamlAuthenticationHandler.key]: SlingApi.postConfigAdobeGraniteSamlAuthenticationHandler,
    [SlingApi.postConfigApacheFelixJettyBasedHttpService.key]: SlingApi.postConfigApacheFelixJettyBasedHttpService,
    [SlingApi.postConfigApacheHttpComponentsProxyConfiguration.key]: SlingApi.postConfigApacheHttpComponentsProxyConfiguration,
    [SlingApi.postConfigApacheSlingDavExServlet.key]: SlingApi.postConfigApacheSlingDavExServlet,
    [SlingApi.postConfigApacheSlingGetServlet.key]: SlingApi.postConfigApacheSlingGetServlet,
    [SlingApi.postConfigApacheSlingReferrerFilter.key]: SlingApi.postConfigApacheSlingReferrerFilter,
    [SlingApi.postConfigProperty.key]: SlingApi.postConfigProperty,
    [SlingApi.postNode.key]: SlingApi.postNode,
    [SlingApi.postNodeRw.key]: SlingApi.postNodeRw,
    [SlingApi.postPath.key]: SlingApi.postPath,
    [SlingApi.postQuery.key]: SlingApi.postQuery,
    [SlingApi.postTreeActivation.key]: SlingApi.postTreeActivation,
    [SlingApi.postTruststore.key]: SlingApi.postTruststore,
    [SlingApi.postTruststorePKCS12.key]: SlingApi.postTruststorePKCS12,
}

module.exports = {
    searchActions: () => Object.entries(actions).reduce((actions, [key, value]) => isSearchAction(key) && hasSearchRequisites(value) ? {...actions, [key]: searchMiddleware(value)} : actions, {}),
    createActions: () => Object.entries(actions).reduce((actions, [key, value]) => isCreateAction(key) ? {...actions, [key]: createMiddleware(value)} : actions, {}),
    triggers: () => Object.entries(actions).reduce((actions, [key, value]) => isTrigger(key) ? {...actions, [key]: triggerMiddleware(value)} : actions, {}),
}

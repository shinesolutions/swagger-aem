'use strict';

var utils = require('../utils/writer.js');
var Sling = require('../service/SlingService');

module.exports.deleteAgent = function deleteAgent (req, res, next) {
  var runmode = req.swagger.params['runmode'].value;
  var name = req.swagger.params['name'].value;
  Sling.deleteAgent(runmode,name)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.deleteNode = function deleteNode (req, res, next) {
  var path = req.swagger.params['path'].value;
  var name = req.swagger.params['name'].value;
  Sling.deleteNode(path,name)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAgent = function getAgent (req, res, next) {
  var runmode = req.swagger.params['runmode'].value;
  var name = req.swagger.params['name'].value;
  Sling.getAgent(runmode,name)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAgents = function getAgents (req, res, next) {
  var runmode = req.swagger.params['runmode'].value;
  Sling.getAgents(runmode)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAuthorizableKeystore = function getAuthorizableKeystore (req, res, next) {
  var intermediatePath = req.swagger.params['intermediatePath'].value;
  var authorizableId = req.swagger.params['authorizableId'].value;
  Sling.getAuthorizableKeystore(intermediatePath,authorizableId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getKeystore = function getKeystore (req, res, next) {
  var intermediatePath = req.swagger.params['intermediatePath'].value;
  var authorizableId = req.swagger.params['authorizableId'].value;
  Sling.getKeystore(intermediatePath,authorizableId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getNode = function getNode (req, res, next) {
  var path = req.swagger.params['path'].value;
  var name = req.swagger.params['name'].value;
  Sling.getNode(path,name)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getPackage = function getPackage (req, res, next) {
  var group = req.swagger.params['group'].value;
  var name = req.swagger.params['name'].value;
  var version = req.swagger.params['version'].value;
  Sling.getPackage(group,name,version)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getPackageFilter = function getPackageFilter (req, res, next) {
  var group = req.swagger.params['group'].value;
  var name = req.swagger.params['name'].value;
  var version = req.swagger.params['version'].value;
  Sling.getPackageFilter(group,name,version)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getQuery = function getQuery (req, res, next) {
  var path = req.swagger.params['path'].value;
  var pPeriodlimit = req.swagger.params['p.limit'].value;
  var 1Underscoreproperty = req.swagger.params['1_property'].value;
  var 1UnderscorepropertyPeriodvalue = req.swagger.params['1_property.value'].value;
  Sling.getQuery(path,pPeriodlimit,1Underscoreproperty,1UnderscorepropertyPeriodvalue)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getTruststore = function getTruststore (req, res, next) {
  Sling.getTruststore()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getTruststoreInfo = function getTruststoreInfo (req, res, next) {
  Sling.getTruststoreInfo()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postAgent = function postAgent (req, res, next) {
  var runmode = req.swagger.params['runmode'].value;
  var name = req.swagger.params['name'].value;
  var jcrContentSlashcqDistribute = req.swagger.params['jcr:content/cq:distribute'].value;
  var jcrContentSlashcqDistributeAtTypeHint = req.swagger.params['jcr:content/cq:distribute@TypeHint'].value;
  var jcrContentSlashcqName = req.swagger.params['jcr:content/cq:name'].value;
  var jcrContentSlashcqTemplate = req.swagger.params['jcr:content/cq:template'].value;
  var jcrContentSlashenabled = req.swagger.params['jcr:content/enabled'].value;
  var jcrContentSlashjcrDescription = req.swagger.params['jcr:content/jcr:description'].value;
  var jcrContentSlashjcrLastModified = req.swagger.params['jcr:content/jcr:lastModified'].value;
  var jcrContentSlashjcrLastModifiedBy = req.swagger.params['jcr:content/jcr:lastModifiedBy'].value;
  var jcrContentSlashjcrMixinTypes = req.swagger.params['jcr:content/jcr:mixinTypes'].value;
  var jcrContentSlashjcrTitle = req.swagger.params['jcr:content/jcr:title'].value;
  var jcrContentSlashlogLevel = req.swagger.params['jcr:content/logLevel'].value;
  var jcrContentSlashnoStatusUpdate = req.swagger.params['jcr:content/noStatusUpdate'].value;
  var jcrContentSlashnoVersioning = req.swagger.params['jcr:content/noVersioning'].value;
  var jcrContentSlashprotocolConnectTimeout = req.swagger.params['jcr:content/protocolConnectTimeout'].value;
  var jcrContentSlashprotocolHTTPConnectionClosed = req.swagger.params['jcr:content/protocolHTTPConnectionClosed'].value;
  var jcrContentSlashprotocolHTTPExpired = req.swagger.params['jcr:content/protocolHTTPExpired'].value;
  var jcrContentSlashprotocolHTTPHeaders = req.swagger.params['jcr:content/protocolHTTPHeaders'].value;
  var jcrContentSlashprotocolHTTPHeadersAtTypeHint = req.swagger.params['jcr:content/protocolHTTPHeaders@TypeHint'].value;
  var jcrContentSlashprotocolHTTPMethod = req.swagger.params['jcr:content/protocolHTTPMethod'].value;
  var jcrContentSlashprotocolHTTPSRelaxed = req.swagger.params['jcr:content/protocolHTTPSRelaxed'].value;
  var jcrContentSlashprotocolInterface = req.swagger.params['jcr:content/protocolInterface'].value;
  var jcrContentSlashprotocolSocketTimeout = req.swagger.params['jcr:content/protocolSocketTimeout'].value;
  var jcrContentSlashprotocolVersion = req.swagger.params['jcr:content/protocolVersion'].value;
  var jcrContentSlashproxyNTLMDomain = req.swagger.params['jcr:content/proxyNTLMDomain'].value;
  var jcrContentSlashproxyNTLMHost = req.swagger.params['jcr:content/proxyNTLMHost'].value;
  var jcrContentSlashproxyHost = req.swagger.params['jcr:content/proxyHost'].value;
  var jcrContentSlashproxyPassword = req.swagger.params['jcr:content/proxyPassword'].value;
  var jcrContentSlashproxyPort = req.swagger.params['jcr:content/proxyPort'].value;
  var jcrContentSlashproxyUser = req.swagger.params['jcr:content/proxyUser'].value;
  var jcrContentSlashqueueBatchMaxSize = req.swagger.params['jcr:content/queueBatchMaxSize'].value;
  var jcrContentSlashqueueBatchMode = req.swagger.params['jcr:content/queueBatchMode'].value;
  var jcrContentSlashqueueBatchWaitTime = req.swagger.params['jcr:content/queueBatchWaitTime'].value;
  var jcrContentSlashretryDelay = req.swagger.params['jcr:content/retryDelay'].value;
  var jcrContentSlashreverseReplication = req.swagger.params['jcr:content/reverseReplication'].value;
  var jcrContentSlashserializationType = req.swagger.params['jcr:content/serializationType'].value;
  var jcrContentSlashslingResourceType = req.swagger.params['jcr:content/sling:resourceType'].value;
  var jcrContentSlashssl = req.swagger.params['jcr:content/ssl'].value;
  var jcrContentSlashtransportNTLMDomain = req.swagger.params['jcr:content/transportNTLMDomain'].value;
  var jcrContentSlashtransportNTLMHost = req.swagger.params['jcr:content/transportNTLMHost'].value;
  var jcrContentSlashtransportPassword = req.swagger.params['jcr:content/transportPassword'].value;
  var jcrContentSlashtransportUri = req.swagger.params['jcr:content/transportUri'].value;
  var jcrContentSlashtransportUser = req.swagger.params['jcr:content/transportUser'].value;
  var jcrContentSlashtriggerDistribute = req.swagger.params['jcr:content/triggerDistribute'].value;
  var jcrContentSlashtriggerModified = req.swagger.params['jcr:content/triggerModified'].value;
  var jcrContentSlashtriggerOnOffTime = req.swagger.params['jcr:content/triggerOnOffTime'].value;
  var jcrContentSlashtriggerReceive = req.swagger.params['jcr:content/triggerReceive'].value;
  var jcrContentSlashtriggerSpecific = req.swagger.params['jcr:content/triggerSpecific'].value;
  var jcrContentSlashuserId = req.swagger.params['jcr:content/userId'].value;
  var jcrPrimaryType = req.swagger.params['jcr:primaryType'].value;
  var operation = req.swagger.params[':operation'].value;
  Sling.postAgent(runmode,name,jcrContentSlashcqDistribute,jcrContentSlashcqDistributeAtTypeHint,jcrContentSlashcqName,jcrContentSlashcqTemplate,jcrContentSlashenabled,jcrContentSlashjcrDescription,jcrContentSlashjcrLastModified,jcrContentSlashjcrLastModifiedBy,jcrContentSlashjcrMixinTypes,jcrContentSlashjcrTitle,jcrContentSlashlogLevel,jcrContentSlashnoStatusUpdate,jcrContentSlashnoVersioning,jcrContentSlashprotocolConnectTimeout,jcrContentSlashprotocolHTTPConnectionClosed,jcrContentSlashprotocolHTTPExpired,jcrContentSlashprotocolHTTPHeaders,jcrContentSlashprotocolHTTPHeadersAtTypeHint,jcrContentSlashprotocolHTTPMethod,jcrContentSlashprotocolHTTPSRelaxed,jcrContentSlashprotocolInterface,jcrContentSlashprotocolSocketTimeout,jcrContentSlashprotocolVersion,jcrContentSlashproxyNTLMDomain,jcrContentSlashproxyNTLMHost,jcrContentSlashproxyHost,jcrContentSlashproxyPassword,jcrContentSlashproxyPort,jcrContentSlashproxyUser,jcrContentSlashqueueBatchMaxSize,jcrContentSlashqueueBatchMode,jcrContentSlashqueueBatchWaitTime,jcrContentSlashretryDelay,jcrContentSlashreverseReplication,jcrContentSlashserializationType,jcrContentSlashslingResourceType,jcrContentSlashssl,jcrContentSlashtransportNTLMDomain,jcrContentSlashtransportNTLMHost,jcrContentSlashtransportPassword,jcrContentSlashtransportUri,jcrContentSlashtransportUser,jcrContentSlashtriggerDistribute,jcrContentSlashtriggerModified,jcrContentSlashtriggerOnOffTime,jcrContentSlashtriggerReceive,jcrContentSlashtriggerSpecific,jcrContentSlashuserId,jcrPrimaryType,operation)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postAuthorizableKeystore = function postAuthorizableKeystore (req, res, next) {
  var intermediatePath = req.swagger.params['intermediatePath'].value;
  var authorizableId = req.swagger.params['authorizableId'].value;
  var operation = req.swagger.params[':operation'].value;
  var currentPassword = req.swagger.params['currentPassword'].value;
  var newPassword = req.swagger.params['newPassword'].value;
  var rePassword = req.swagger.params['rePassword'].value;
  var keyPassword = req.swagger.params['keyPassword'].value;
  var keyStorePass = req.swagger.params['keyStorePass'].value;
  var alias = req.swagger.params['alias'].value;
  var newAlias = req.swagger.params['newAlias'].value;
  var removeAlias = req.swagger.params['removeAlias'].value;
  var certChain = req.swagger.params['cert-chain'].value;
  var pk = req.swagger.params['pk'].value;
  var keyStore = req.swagger.params['keyStore'].value;
  Sling.postAuthorizableKeystore(intermediatePath,authorizableId,operation,currentPassword,newPassword,rePassword,keyPassword,keyStorePass,alias,newAlias,removeAlias,certChain,pk,keyStore)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postAuthorizables = function postAuthorizables (req, res, next) {
  var authorizableId = req.swagger.params['authorizableId'].value;
  var intermediatePath = req.swagger.params['intermediatePath'].value;
  var createUser = req.swagger.params['createUser'].value;
  var createGroup = req.swagger.params['createGroup'].value;
  var repPassword = req.swagger.params['rep:password'].value;
  var profileSlashgivenName = req.swagger.params['profile/givenName'].value;
  Sling.postAuthorizables(authorizableId,intermediatePath,createUser,createGroup,repPassword,profileSlashgivenName)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postConfigAdobeGraniteSamlAuthenticationHandler = function postConfigAdobeGraniteSamlAuthenticationHandler (req, res, next) {
  var keyStorePassword = req.swagger.params['keyStorePassword'].value;
  var keyStorePasswordAtTypeHint = req.swagger.params['keyStorePassword@TypeHint'].value;
  var servicePeriodranking = req.swagger.params['service.ranking'].value;
  var servicePeriodrankingAtTypeHint = req.swagger.params['service.ranking@TypeHint'].value;
  var idpHttpRedirect = req.swagger.params['idpHttpRedirect'].value;
  var idpHttpRedirectAtTypeHint = req.swagger.params['idpHttpRedirect@TypeHint'].value;
  var createUser = req.swagger.params['createUser'].value;
  var createUserAtTypeHint = req.swagger.params['createUser@TypeHint'].value;
  var defaultRedirectUrl = req.swagger.params['defaultRedirectUrl'].value;
  var defaultRedirectUrlAtTypeHint = req.swagger.params['defaultRedirectUrl@TypeHint'].value;
  var userIDAttribute = req.swagger.params['userIDAttribute'].value;
  var userIDAttributeAtTypeHint = req.swagger.params['userIDAttribute@TypeHint'].value;
  var defaultGroups = req.swagger.params['defaultGroups'].value;
  var defaultGroupsAtTypeHint = req.swagger.params['defaultGroups@TypeHint'].value;
  var idpCertAlias = req.swagger.params['idpCertAlias'].value;
  var idpCertAliasAtTypeHint = req.swagger.params['idpCertAlias@TypeHint'].value;
  var addGroupMemberships = req.swagger.params['addGroupMemberships'].value;
  var addGroupMembershipsAtTypeHint = req.swagger.params['addGroupMemberships@TypeHint'].value;
  var path = req.swagger.params['path'].value;
  var pathAtTypeHint = req.swagger.params['path@TypeHint'].value;
  var synchronizeAttributes = req.swagger.params['synchronizeAttributes'].value;
  var synchronizeAttributesAtTypeHint = req.swagger.params['synchronizeAttributes@TypeHint'].value;
  var clockTolerance = req.swagger.params['clockTolerance'].value;
  var clockToleranceAtTypeHint = req.swagger.params['clockTolerance@TypeHint'].value;
  var groupMembershipAttribute = req.swagger.params['groupMembershipAttribute'].value;
  var groupMembershipAttributeAtTypeHint = req.swagger.params['groupMembershipAttribute@TypeHint'].value;
  var idpUrl = req.swagger.params['idpUrl'].value;
  var idpUrlAtTypeHint = req.swagger.params['idpUrl@TypeHint'].value;
  var logoutUrl = req.swagger.params['logoutUrl'].value;
  var logoutUrlAtTypeHint = req.swagger.params['logoutUrl@TypeHint'].value;
  var serviceProviderEntityId = req.swagger.params['serviceProviderEntityId'].value;
  var serviceProviderEntityIdAtTypeHint = req.swagger.params['serviceProviderEntityId@TypeHint'].value;
  var assertionConsumerServiceURL = req.swagger.params['assertionConsumerServiceURL'].value;
  var assertionConsumerServiceURLAtTypeHint = req.swagger.params['assertionConsumerServiceURL@TypeHint'].value;
  var handleLogout = req.swagger.params['handleLogout'].value;
  var handleLogoutAtTypeHint = req.swagger.params['handleLogout@TypeHint'].value;
  var spPrivateKeyAlias = req.swagger.params['spPrivateKeyAlias'].value;
  var spPrivateKeyAliasAtTypeHint = req.swagger.params['spPrivateKeyAlias@TypeHint'].value;
  var useEncryption = req.swagger.params['useEncryption'].value;
  var useEncryptionAtTypeHint = req.swagger.params['useEncryption@TypeHint'].value;
  var nameIdFormat = req.swagger.params['nameIdFormat'].value;
  var nameIdFormatAtTypeHint = req.swagger.params['nameIdFormat@TypeHint'].value;
  var digestMethod = req.swagger.params['digestMethod'].value;
  var digestMethodAtTypeHint = req.swagger.params['digestMethod@TypeHint'].value;
  var signatureMethod = req.swagger.params['signatureMethod'].value;
  var signatureMethodAtTypeHint = req.swagger.params['signatureMethod@TypeHint'].value;
  var userIntermediatePath = req.swagger.params['userIntermediatePath'].value;
  var userIntermediatePathAtTypeHint = req.swagger.params['userIntermediatePath@TypeHint'].value;
  Sling.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword,keyStorePasswordAtTypeHint,servicePeriodranking,servicePeriodrankingAtTypeHint,idpHttpRedirect,idpHttpRedirectAtTypeHint,createUser,createUserAtTypeHint,defaultRedirectUrl,defaultRedirectUrlAtTypeHint,userIDAttribute,userIDAttributeAtTypeHint,defaultGroups,defaultGroupsAtTypeHint,idpCertAlias,idpCertAliasAtTypeHint,addGroupMemberships,addGroupMembershipsAtTypeHint,path,pathAtTypeHint,synchronizeAttributes,synchronizeAttributesAtTypeHint,clockTolerance,clockToleranceAtTypeHint,groupMembershipAttribute,groupMembershipAttributeAtTypeHint,idpUrl,idpUrlAtTypeHint,logoutUrl,logoutUrlAtTypeHint,serviceProviderEntityId,serviceProviderEntityIdAtTypeHint,assertionConsumerServiceURL,assertionConsumerServiceURLAtTypeHint,handleLogout,handleLogoutAtTypeHint,spPrivateKeyAlias,spPrivateKeyAliasAtTypeHint,useEncryption,useEncryptionAtTypeHint,nameIdFormat,nameIdFormatAtTypeHint,digestMethod,digestMethodAtTypeHint,signatureMethod,signatureMethodAtTypeHint,userIntermediatePath,userIntermediatePathAtTypeHint)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postConfigApacheFelixJettyBasedHttpService = function postConfigApacheFelixJettyBasedHttpService (req, res, next) {
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodnio = req.swagger.params['org.apache.felix.https.nio'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint = req.swagger.params['org.apache.felix.https.nio@TypeHint'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore = req.swagger.params['org.apache.felix.https.keystore'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint = req.swagger.params['org.apache.felix.https.keystore@TypeHint'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword = req.swagger.params['org.apache.felix.https.keystore.password'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint = req.swagger.params['org.apache.felix.https.keystore.password@TypeHint'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey = req.swagger.params['org.apache.felix.https.keystore.key'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint = req.swagger.params['org.apache.felix.https.keystore.key@TypeHint'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword = req.swagger.params['org.apache.felix.https.keystore.key.password'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint = req.swagger.params['org.apache.felix.https.keystore.key.password@TypeHint'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore = req.swagger.params['org.apache.felix.https.truststore'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint = req.swagger.params['org.apache.felix.https.truststore@TypeHint'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword = req.swagger.params['org.apache.felix.https.truststore.password'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint = req.swagger.params['org.apache.felix.https.truststore.password@TypeHint'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate = req.swagger.params['org.apache.felix.https.clientcertificate'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint = req.swagger.params['org.apache.felix.https.clientcertificate@TypeHint'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodenable = req.swagger.params['org.apache.felix.https.enable'].value;
  var orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint = req.swagger.params['org.apache.felix.https.enable@TypeHint'].value;
  var orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure = req.swagger.params['org.osgi.service.http.port.secure'].value;
  var orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint = req.swagger.params['org.osgi.service.http.port.secure@TypeHint'].value;
  Sling.postConfigApacheFelixJettyBasedHttpService(orgPeriodapachePeriodfelixPeriodhttpsPeriodnio,orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore,orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword,orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate,orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodenable,orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint,orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure,orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postConfigApacheHttpComponentsProxyConfiguration = function postConfigApacheHttpComponentsProxyConfiguration (req, res, next) {
  var proxyPeriodhost = req.swagger.params['proxy.host'].value;
  var proxyPeriodhostAtTypeHint = req.swagger.params['proxy.host@TypeHint'].value;
  var proxyPeriodport = req.swagger.params['proxy.port'].value;
  var proxyPeriodportAtTypeHint = req.swagger.params['proxy.port@TypeHint'].value;
  var proxyPeriodexceptions = req.swagger.params['proxy.exceptions'].value;
  var proxyPeriodexceptionsAtTypeHint = req.swagger.params['proxy.exceptions@TypeHint'].value;
  var proxyPeriodenabled = req.swagger.params['proxy.enabled'].value;
  var proxyPeriodenabledAtTypeHint = req.swagger.params['proxy.enabled@TypeHint'].value;
  var proxyPerioduser = req.swagger.params['proxy.user'].value;
  var proxyPerioduserAtTypeHint = req.swagger.params['proxy.user@TypeHint'].value;
  var proxyPeriodpassword = req.swagger.params['proxy.password'].value;
  var proxyPeriodpasswordAtTypeHint = req.swagger.params['proxy.password@TypeHint'].value;
  Sling.postConfigApacheHttpComponentsProxyConfiguration(proxyPeriodhost,proxyPeriodhostAtTypeHint,proxyPeriodport,proxyPeriodportAtTypeHint,proxyPeriodexceptions,proxyPeriodexceptionsAtTypeHint,proxyPeriodenabled,proxyPeriodenabledAtTypeHint,proxyPerioduser,proxyPerioduserAtTypeHint,proxyPeriodpassword,proxyPeriodpasswordAtTypeHint)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postConfigApacheSlingDavExServlet = function postConfigApacheSlingDavExServlet (req, res, next) {
  var alias = req.swagger.params['alias'].value;
  var aliasAtTypeHint = req.swagger.params['alias@TypeHint'].value;
  var davPeriodcreateAbsoluteUri = req.swagger.params['dav.create-absolute-uri'].value;
  var davPeriodcreateAbsoluteUriAtTypeHint = req.swagger.params['dav.create-absolute-uri@TypeHint'].value;
  Sling.postConfigApacheSlingDavExServlet(alias,aliasAtTypeHint,davPeriodcreateAbsoluteUri,davPeriodcreateAbsoluteUriAtTypeHint)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postConfigApacheSlingGetServlet = function postConfigApacheSlingGetServlet (req, res, next) {
  var jsonPeriodmaximumresults = req.swagger.params['json.maximumresults'].value;
  var jsonPeriodmaximumresultsAtTypeHint = req.swagger.params['json.maximumresults@TypeHint'].value;
  var enablePeriodhtml = req.swagger.params['enable.html'].value;
  var enablePeriodhtmlAtTypeHint = req.swagger.params['enable.html@TypeHint'].value;
  var enablePeriodtxt = req.swagger.params['enable.txt'].value;
  var enablePeriodtxtAtTypeHint = req.swagger.params['enable.txt@TypeHint'].value;
  var enablePeriodxml = req.swagger.params['enable.xml'].value;
  var enablePeriodxmlAtTypeHint = req.swagger.params['enable.xml@TypeHint'].value;
  Sling.postConfigApacheSlingGetServlet(jsonPeriodmaximumresults,jsonPeriodmaximumresultsAtTypeHint,enablePeriodhtml,enablePeriodhtmlAtTypeHint,enablePeriodtxt,enablePeriodtxtAtTypeHint,enablePeriodxml,enablePeriodxmlAtTypeHint)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postConfigApacheSlingReferrerFilter = function postConfigApacheSlingReferrerFilter (req, res, next) {
  var allowPeriodempty = req.swagger.params['allow.empty'].value;
  var allowPeriodemptyAtTypeHint = req.swagger.params['allow.empty@TypeHint'].value;
  var allowPeriodhosts = req.swagger.params['allow.hosts'].value;
  var allowPeriodhostsAtTypeHint = req.swagger.params['allow.hosts@TypeHint'].value;
  var allowPeriodhostsPeriodregexp = req.swagger.params['allow.hosts.regexp'].value;
  var allowPeriodhostsPeriodregexpAtTypeHint = req.swagger.params['allow.hosts.regexp@TypeHint'].value;
  var filterPeriodmethods = req.swagger.params['filter.methods'].value;
  var filterPeriodmethodsAtTypeHint = req.swagger.params['filter.methods@TypeHint'].value;
  Sling.postConfigApacheSlingReferrerFilter(allowPeriodempty,allowPeriodemptyAtTypeHint,allowPeriodhosts,allowPeriodhostsAtTypeHint,allowPeriodhostsPeriodregexp,allowPeriodhostsPeriodregexpAtTypeHint,filterPeriodmethods,filterPeriodmethodsAtTypeHint)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postNode = function postNode (req, res, next) {
  var path = req.swagger.params['path'].value;
  var name = req.swagger.params['name'].value;
  var operation = req.swagger.params[':operation'].value;
  var deleteAuthorizable = req.swagger.params['deleteAuthorizable'].value;
  var file = req.swagger.params['file'].value;
  Sling.postNode(path,name,operation,deleteAuthorizable,file)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postNodeRw = function postNodeRw (req, res, next) {
  var path = req.swagger.params['path'].value;
  var name = req.swagger.params['name'].value;
  var addMembers = req.swagger.params['addMembers'].value;
  Sling.postNodeRw(path,name,addMembers)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postPath = function postPath (req, res, next) {
  var path = req.swagger.params['path'].value;
  var jcrPrimaryType = req.swagger.params['jcr:primaryType'].value;
  var name = req.swagger.params[':name'].value;
  Sling.postPath(path,jcrPrimaryType,name)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postQuery = function postQuery (req, res, next) {
  var path = req.swagger.params['path'].value;
  var pPeriodlimit = req.swagger.params['p.limit'].value;
  var 1Underscoreproperty = req.swagger.params['1_property'].value;
  var 1UnderscorepropertyPeriodvalue = req.swagger.params['1_property.value'].value;
  Sling.postQuery(path,pPeriodlimit,1Underscoreproperty,1UnderscorepropertyPeriodvalue)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postTreeActivation = function postTreeActivation (req, res, next) {
  var ignoredeactivated = req.swagger.params['ignoredeactivated'].value;
  var onlymodified = req.swagger.params['onlymodified'].value;
  var path = req.swagger.params['path'].value;
  Sling.postTreeActivation(ignoredeactivated,onlymodified,path)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postTruststore = function postTruststore (req, res, next) {
  var operation = req.swagger.params[':operation'].value;
  var newPassword = req.swagger.params['newPassword'].value;
  var rePassword = req.swagger.params['rePassword'].value;
  var keyStoreType = req.swagger.params['keyStoreType'].value;
  var removeAlias = req.swagger.params['removeAlias'].value;
  var certificate = req.swagger.params['certificate'].value;
  Sling.postTruststore(operation,newPassword,rePassword,keyStoreType,removeAlias,certificate)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.postTruststorePKCS12 = function postTruststorePKCS12 (req, res, next) {
  var truststorePeriodp12 = req.swagger.params['truststore.p12'].value;
  Sling.postTruststorePKCS12(truststorePeriodp12)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

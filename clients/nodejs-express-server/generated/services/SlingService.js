/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* runmode String 
* name String 
* no response value expected for this operation
* */
const deleteAgent = ({ runmode, name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        runmode,
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
* path String 
* name String 
* no response value expected for this operation
* */
const deleteNode = ({ path, name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        path,
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
* runmode String 
* name String 
* no response value expected for this operation
* */
const getAgent = ({ runmode, name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        runmode,
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
* runmode String 
* returns String
* */
const getAgents = ({ runmode }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        runmode,
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
* intermediatePath String 
* authorizableId String 
* returns KeystoreInfo
* */
const getAuthorizableKeystore = ({ intermediatePath, authorizableId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        intermediatePath,
        authorizableId,
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
* intermediatePath String 
* authorizableId String 
* returns File
* */
const getKeystore = ({ intermediatePath, authorizableId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        intermediatePath,
        authorizableId,
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
* path String 
* name String 
* no response value expected for this operation
* */
const getNode = ({ path, name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        path,
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
* group String 
* name String 
* version String 
* returns File
* */
const getPackage = ({ group, name, version }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        group,
        name,
        version,
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
* group String 
* name String 
* version String 
* returns String
* */
const getPackageFilter = ({ group, name, version }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        group,
        name,
        version,
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
* path String 
* pPeriodlimit BigDecimal 
* 1Underscoreproperty String 
* 1UnderscorepropertyPeriodvalue String 
* returns String
* */
const getQuery = ({ path, pPeriodlimit, 1Underscoreproperty, 1UnderscorepropertyPeriodvalue }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        path,
        pPeriodlimit,
        1Underscoreproperty,
        1UnderscorepropertyPeriodvalue,
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
* returns File
* */
const getTruststore = () => new Promise(
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
* returns TruststoreInfo
* */
const getTruststoreInfo = () => new Promise(
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
* runmode String 
* name String 
* jcrContentSlashcqDistribute Boolean  (optional)
* jcrContentSlashcqDistributeAtTypeHint String  (optional)
* jcrContentSlashcqName String  (optional)
* jcrContentSlashcqTemplate String  (optional)
* jcrContentSlashaliasUpdate Boolean  (optional)
* jcrContentSlashenabled Boolean  (optional)
* jcrContentSlashjcrDescription String  (optional)
* jcrContentSlashjcrLastModified String  (optional)
* jcrContentSlashjcrLastModifiedBy String  (optional)
* jcrContentSlashjcrMixinTypes String  (optional)
* jcrContentSlashjcrTitle String  (optional)
* jcrContentSlashlogLevel String  (optional)
* jcrContentSlashnoStatusUpdate Boolean  (optional)
* jcrContentSlashnoVersioning Boolean  (optional)
* jcrContentSlashprotocolConnectTimeout BigDecimal  (optional)
* jcrContentSlashprotocolHTTPConnectionClosed Boolean  (optional)
* jcrContentSlashprotocolHTTPExpired String  (optional)
* jcrContentSlashprotocolHTTPHeaders List  (optional)
* jcrContentSlashprotocolHTTPHeadersAtTypeHint String  (optional)
* jcrContentSlashprotocolHTTPMethod String  (optional)
* jcrContentSlashprotocolHTTPSRelaxed Boolean  (optional)
* jcrContentSlashprotocolInterface String  (optional)
* jcrContentSlashprotocolSocketTimeout BigDecimal  (optional)
* jcrContentSlashprotocolVersion String  (optional)
* jcrContentSlashproxyNTLMDomain String  (optional)
* jcrContentSlashproxyNTLMHost String  (optional)
* jcrContentSlashproxyHost String  (optional)
* jcrContentSlashproxyPassword String  (optional)
* jcrContentSlashproxyPort BigDecimal  (optional)
* jcrContentSlashproxyUser String  (optional)
* jcrContentSlashqueueBatchMaxSize BigDecimal  (optional)
* jcrContentSlashqueueBatchMode String  (optional)
* jcrContentSlashqueueBatchWaitTime BigDecimal  (optional)
* jcrContentSlashretryDelay String  (optional)
* jcrContentSlashreverseReplication Boolean  (optional)
* jcrContentSlashserializationType String  (optional)
* jcrContentSlashslingResourceType String  (optional)
* jcrContentSlashssl String  (optional)
* jcrContentSlashtransportNTLMDomain String  (optional)
* jcrContentSlashtransportNTLMHost String  (optional)
* jcrContentSlashtransportPassword String  (optional)
* jcrContentSlashtransportUri String  (optional)
* jcrContentSlashtransportUser String  (optional)
* jcrContentSlashtriggerDistribute Boolean  (optional)
* jcrContentSlashtriggerModified Boolean  (optional)
* jcrContentSlashtriggerOnOffTime Boolean  (optional)
* jcrContentSlashtriggerReceive Boolean  (optional)
* jcrContentSlashtriggerSpecific Boolean  (optional)
* jcrContentSlashuserId String  (optional)
* jcrPrimaryType String  (optional)
* operation String  (optional)
* no response value expected for this operation
* */
const postAgent = ({ runmode, name, jcrContentSlashcqDistribute, jcrContentSlashcqDistributeAtTypeHint, jcrContentSlashcqName, jcrContentSlashcqTemplate, jcrContentSlashaliasUpdate, jcrContentSlashenabled, jcrContentSlashjcrDescription, jcrContentSlashjcrLastModified, jcrContentSlashjcrLastModifiedBy, jcrContentSlashjcrMixinTypes, jcrContentSlashjcrTitle, jcrContentSlashlogLevel, jcrContentSlashnoStatusUpdate, jcrContentSlashnoVersioning, jcrContentSlashprotocolConnectTimeout, jcrContentSlashprotocolHTTPConnectionClosed, jcrContentSlashprotocolHTTPExpired, jcrContentSlashprotocolHTTPHeaders, jcrContentSlashprotocolHTTPHeadersAtTypeHint, jcrContentSlashprotocolHTTPMethod, jcrContentSlashprotocolHTTPSRelaxed, jcrContentSlashprotocolInterface, jcrContentSlashprotocolSocketTimeout, jcrContentSlashprotocolVersion, jcrContentSlashproxyNTLMDomain, jcrContentSlashproxyNTLMHost, jcrContentSlashproxyHost, jcrContentSlashproxyPassword, jcrContentSlashproxyPort, jcrContentSlashproxyUser, jcrContentSlashqueueBatchMaxSize, jcrContentSlashqueueBatchMode, jcrContentSlashqueueBatchWaitTime, jcrContentSlashretryDelay, jcrContentSlashreverseReplication, jcrContentSlashserializationType, jcrContentSlashslingResourceType, jcrContentSlashssl, jcrContentSlashtransportNTLMDomain, jcrContentSlashtransportNTLMHost, jcrContentSlashtransportPassword, jcrContentSlashtransportUri, jcrContentSlashtransportUser, jcrContentSlashtriggerDistribute, jcrContentSlashtriggerModified, jcrContentSlashtriggerOnOffTime, jcrContentSlashtriggerReceive, jcrContentSlashtriggerSpecific, jcrContentSlashuserId, jcrPrimaryType, operation }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        runmode,
        name,
        jcrContentSlashcqDistribute,
        jcrContentSlashcqDistributeAtTypeHint,
        jcrContentSlashcqName,
        jcrContentSlashcqTemplate,
        jcrContentSlashaliasUpdate,
        jcrContentSlashenabled,
        jcrContentSlashjcrDescription,
        jcrContentSlashjcrLastModified,
        jcrContentSlashjcrLastModifiedBy,
        jcrContentSlashjcrMixinTypes,
        jcrContentSlashjcrTitle,
        jcrContentSlashlogLevel,
        jcrContentSlashnoStatusUpdate,
        jcrContentSlashnoVersioning,
        jcrContentSlashprotocolConnectTimeout,
        jcrContentSlashprotocolHTTPConnectionClosed,
        jcrContentSlashprotocolHTTPExpired,
        jcrContentSlashprotocolHTTPHeaders,
        jcrContentSlashprotocolHTTPHeadersAtTypeHint,
        jcrContentSlashprotocolHTTPMethod,
        jcrContentSlashprotocolHTTPSRelaxed,
        jcrContentSlashprotocolInterface,
        jcrContentSlashprotocolSocketTimeout,
        jcrContentSlashprotocolVersion,
        jcrContentSlashproxyNTLMDomain,
        jcrContentSlashproxyNTLMHost,
        jcrContentSlashproxyHost,
        jcrContentSlashproxyPassword,
        jcrContentSlashproxyPort,
        jcrContentSlashproxyUser,
        jcrContentSlashqueueBatchMaxSize,
        jcrContentSlashqueueBatchMode,
        jcrContentSlashqueueBatchWaitTime,
        jcrContentSlashretryDelay,
        jcrContentSlashreverseReplication,
        jcrContentSlashserializationType,
        jcrContentSlashslingResourceType,
        jcrContentSlashssl,
        jcrContentSlashtransportNTLMDomain,
        jcrContentSlashtransportNTLMHost,
        jcrContentSlashtransportPassword,
        jcrContentSlashtransportUri,
        jcrContentSlashtransportUser,
        jcrContentSlashtriggerDistribute,
        jcrContentSlashtriggerModified,
        jcrContentSlashtriggerOnOffTime,
        jcrContentSlashtriggerReceive,
        jcrContentSlashtriggerSpecific,
        jcrContentSlashuserId,
        jcrPrimaryType,
        operation,
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
* intermediatePath String 
* authorizableId String 
* operation String  (optional)
* currentPassword String  (optional)
* newPassword String  (optional)
* rePassword String  (optional)
* keyPassword String  (optional)
* keyStorePass String  (optional)
* alias String  (optional)
* newAlias String  (optional)
* removeAlias String  (optional)
* certChain File  (optional)
* pk File  (optional)
* keyStore File  (optional)
* returns KeystoreInfo
* */
const postAuthorizableKeystore = ({ intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        intermediatePath,
        authorizableId,
        operation,
        currentPassword,
        newPassword,
        rePassword,
        keyPassword,
        keyStorePass,
        alias,
        newAlias,
        removeAlias,
        certChain,
        pk,
        keyStore,
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
* authorizableId String 
* intermediatePath String 
* createUser String  (optional)
* createGroup String  (optional)
* repPassword String  (optional)
* profileSlashgivenName String  (optional)
* returns String
* */
const postAuthorizables = ({ authorizableId, intermediatePath, createUser, createGroup, repPassword, profileSlashgivenName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorizableId,
        intermediatePath,
        createUser,
        createGroup,
        repPassword,
        profileSlashgivenName,
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
* keyStorePassword String  (optional)
* keyStorePasswordAtTypeHint String  (optional)
* servicePeriodranking Integer  (optional)
* servicePeriodrankingAtTypeHint String  (optional)
* idpHttpRedirect Boolean  (optional)
* idpHttpRedirectAtTypeHint String  (optional)
* createUser Boolean  (optional)
* createUserAtTypeHint String  (optional)
* defaultRedirectUrl String  (optional)
* defaultRedirectUrlAtTypeHint String  (optional)
* userIDAttribute String  (optional)
* userIDAttributeAtTypeHint String  (optional)
* defaultGroups List  (optional)
* defaultGroupsAtTypeHint String  (optional)
* idpCertAlias String  (optional)
* idpCertAliasAtTypeHint String  (optional)
* addGroupMemberships Boolean  (optional)
* addGroupMembershipsAtTypeHint String  (optional)
* path List  (optional)
* pathAtTypeHint String  (optional)
* synchronizeAttributes List  (optional)
* synchronizeAttributesAtTypeHint String  (optional)
* clockTolerance Integer  (optional)
* clockToleranceAtTypeHint String  (optional)
* groupMembershipAttribute String  (optional)
* groupMembershipAttributeAtTypeHint String  (optional)
* idpUrl String  (optional)
* idpUrlAtTypeHint String  (optional)
* logoutUrl String  (optional)
* logoutUrlAtTypeHint String  (optional)
* serviceProviderEntityId String  (optional)
* serviceProviderEntityIdAtTypeHint String  (optional)
* assertionConsumerServiceURL String  (optional)
* assertionConsumerServiceURLAtTypeHint String  (optional)
* handleLogout Boolean  (optional)
* handleLogoutAtTypeHint String  (optional)
* spPrivateKeyAlias String  (optional)
* spPrivateKeyAliasAtTypeHint String  (optional)
* useEncryption Boolean  (optional)
* useEncryptionAtTypeHint String  (optional)
* nameIdFormat String  (optional)
* nameIdFormatAtTypeHint String  (optional)
* digestMethod String  (optional)
* digestMethodAtTypeHint String  (optional)
* signatureMethod String  (optional)
* signatureMethodAtTypeHint String  (optional)
* userIntermediatePath String  (optional)
* userIntermediatePathAtTypeHint String  (optional)
* no response value expected for this operation
* */
const postConfigAdobeGraniteSamlAuthenticationHandler = ({ keyStorePassword, keyStorePasswordAtTypeHint, servicePeriodranking, servicePeriodrankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        keyStorePassword,
        keyStorePasswordAtTypeHint,
        servicePeriodranking,
        servicePeriodrankingAtTypeHint,
        idpHttpRedirect,
        idpHttpRedirectAtTypeHint,
        createUser,
        createUserAtTypeHint,
        defaultRedirectUrl,
        defaultRedirectUrlAtTypeHint,
        userIDAttribute,
        userIDAttributeAtTypeHint,
        defaultGroups,
        defaultGroupsAtTypeHint,
        idpCertAlias,
        idpCertAliasAtTypeHint,
        addGroupMemberships,
        addGroupMembershipsAtTypeHint,
        path,
        pathAtTypeHint,
        synchronizeAttributes,
        synchronizeAttributesAtTypeHint,
        clockTolerance,
        clockToleranceAtTypeHint,
        groupMembershipAttribute,
        groupMembershipAttributeAtTypeHint,
        idpUrl,
        idpUrlAtTypeHint,
        logoutUrl,
        logoutUrlAtTypeHint,
        serviceProviderEntityId,
        serviceProviderEntityIdAtTypeHint,
        assertionConsumerServiceURL,
        assertionConsumerServiceURLAtTypeHint,
        handleLogout,
        handleLogoutAtTypeHint,
        spPrivateKeyAlias,
        spPrivateKeyAliasAtTypeHint,
        useEncryption,
        useEncryptionAtTypeHint,
        nameIdFormat,
        nameIdFormatAtTypeHint,
        digestMethod,
        digestMethodAtTypeHint,
        signatureMethod,
        signatureMethodAtTypeHint,
        userIntermediatePath,
        userIntermediatePathAtTypeHint,
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
* orgPeriodapachePeriodfelixPeriodhttpsPeriodnio Boolean  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint String  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore String  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint String  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword String  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint String  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey String  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint String  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword String  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint String  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore String  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint String  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword String  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint String  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate String  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint String  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodenable Boolean  (optional)
* orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint String  (optional)
* orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure String  (optional)
* orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint String  (optional)
* no response value expected for this operation
* */
const postConfigApacheFelixJettyBasedHttpService = ({ orgPeriodapachePeriodfelixPeriodhttpsPeriodnio, orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodenable, orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        orgPeriodapachePeriodfelixPeriodhttpsPeriodnio,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodenable,
        orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint,
        orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure,
        orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint,
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
* proxyPeriodhost String  (optional)
* proxyPeriodhostAtTypeHint String  (optional)
* proxyPeriodport Integer  (optional)
* proxyPeriodportAtTypeHint String  (optional)
* proxyPeriodexceptions List  (optional)
* proxyPeriodexceptionsAtTypeHint String  (optional)
* proxyPeriodenabled Boolean  (optional)
* proxyPeriodenabledAtTypeHint String  (optional)
* proxyPerioduser String  (optional)
* proxyPerioduserAtTypeHint String  (optional)
* proxyPeriodpassword String  (optional)
* proxyPeriodpasswordAtTypeHint String  (optional)
* no response value expected for this operation
* */
const postConfigApacheHttpComponentsProxyConfiguration = ({ proxyPeriodhost, proxyPeriodhostAtTypeHint, proxyPeriodport, proxyPeriodportAtTypeHint, proxyPeriodexceptions, proxyPeriodexceptionsAtTypeHint, proxyPeriodenabled, proxyPeriodenabledAtTypeHint, proxyPerioduser, proxyPerioduserAtTypeHint, proxyPeriodpassword, proxyPeriodpasswordAtTypeHint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        proxyPeriodhost,
        proxyPeriodhostAtTypeHint,
        proxyPeriodport,
        proxyPeriodportAtTypeHint,
        proxyPeriodexceptions,
        proxyPeriodexceptionsAtTypeHint,
        proxyPeriodenabled,
        proxyPeriodenabledAtTypeHint,
        proxyPerioduser,
        proxyPerioduserAtTypeHint,
        proxyPeriodpassword,
        proxyPeriodpasswordAtTypeHint,
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
* alias String  (optional)
* aliasAtTypeHint String  (optional)
* davPeriodcreateAbsoluteUri Boolean  (optional)
* davPeriodcreateAbsoluteUriAtTypeHint String  (optional)
* no response value expected for this operation
* */
const postConfigApacheSlingDavExServlet = ({ alias, aliasAtTypeHint, davPeriodcreateAbsoluteUri, davPeriodcreateAbsoluteUriAtTypeHint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        alias,
        aliasAtTypeHint,
        davPeriodcreateAbsoluteUri,
        davPeriodcreateAbsoluteUriAtTypeHint,
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
* jsonPeriodmaximumresults String  (optional)
* jsonPeriodmaximumresultsAtTypeHint String  (optional)
* enablePeriodhtml Boolean  (optional)
* enablePeriodhtmlAtTypeHint String  (optional)
* enablePeriodtxt Boolean  (optional)
* enablePeriodtxtAtTypeHint String  (optional)
* enablePeriodxml Boolean  (optional)
* enablePeriodxmlAtTypeHint String  (optional)
* no response value expected for this operation
* */
const postConfigApacheSlingGetServlet = ({ jsonPeriodmaximumresults, jsonPeriodmaximumresultsAtTypeHint, enablePeriodhtml, enablePeriodhtmlAtTypeHint, enablePeriodtxt, enablePeriodtxtAtTypeHint, enablePeriodxml, enablePeriodxmlAtTypeHint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        jsonPeriodmaximumresults,
        jsonPeriodmaximumresultsAtTypeHint,
        enablePeriodhtml,
        enablePeriodhtmlAtTypeHint,
        enablePeriodtxt,
        enablePeriodtxtAtTypeHint,
        enablePeriodxml,
        enablePeriodxmlAtTypeHint,
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
* allowPeriodempty Boolean  (optional)
* allowPeriodemptyAtTypeHint String  (optional)
* allowPeriodhosts String  (optional)
* allowPeriodhostsAtTypeHint String  (optional)
* allowPeriodhostsPeriodregexp String  (optional)
* allowPeriodhostsPeriodregexpAtTypeHint String  (optional)
* filterPeriodmethods String  (optional)
* filterPeriodmethodsAtTypeHint String  (optional)
* no response value expected for this operation
* */
const postConfigApacheSlingReferrerFilter = ({ allowPeriodempty, allowPeriodemptyAtTypeHint, allowPeriodhosts, allowPeriodhostsAtTypeHint, allowPeriodhostsPeriodregexp, allowPeriodhostsPeriodregexpAtTypeHint, filterPeriodmethods, filterPeriodmethodsAtTypeHint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        allowPeriodempty,
        allowPeriodemptyAtTypeHint,
        allowPeriodhosts,
        allowPeriodhostsAtTypeHint,
        allowPeriodhostsPeriodregexp,
        allowPeriodhostsPeriodregexpAtTypeHint,
        filterPeriodmethods,
        filterPeriodmethodsAtTypeHint,
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
* configNodeName String 
* no response value expected for this operation
* */
const postConfigProperty = ({ configNodeName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        configNodeName,
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
* path String 
* name String 
* operation String  (optional)
* deleteAuthorizable String  (optional)
* file File  (optional)
* no response value expected for this operation
* */
const postNode = ({ path, name, operation, deleteAuthorizable, file }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        path,
        name,
        operation,
        deleteAuthorizable,
        file,
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
* path String 
* name String 
* addMembers String  (optional)
* no response value expected for this operation
* */
const postNodeRw = ({ path, name, addMembers }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        path,
        name,
        addMembers,
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
* path String 
* jcrPrimaryType String 
* name String 
* no response value expected for this operation
* */
const postPath = ({ path, jcrPrimaryType, name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        path,
        jcrPrimaryType,
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
* path String 
* pPeriodlimit BigDecimal 
* 1Underscoreproperty String 
* 1UnderscorepropertyPeriodvalue String 
* returns String
* */
const postQuery = ({ path, pPeriodlimit, 1Underscoreproperty, 1UnderscorepropertyPeriodvalue }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        path,
        pPeriodlimit,
        1Underscoreproperty,
        1UnderscorepropertyPeriodvalue,
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
* ignoredeactivated Boolean 
* onlymodified Boolean 
* path String 
* cmd String 
* no response value expected for this operation
* */
const postTreeActivation = ({ ignoredeactivated, onlymodified, path, cmd }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        ignoredeactivated,
        onlymodified,
        path,
        cmd,
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
* operation String  (optional)
* newPassword String  (optional)
* rePassword String  (optional)
* keyStoreType String  (optional)
* removeAlias String  (optional)
* certificate File  (optional)
* returns String
* */
const postTruststore = ({ operation, newPassword, rePassword, keyStoreType, removeAlias, certificate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        operation,
        newPassword,
        rePassword,
        keyStoreType,
        removeAlias,
        certificate,
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
* truststorePeriodp12 File  (optional)
* returns String
* */
const postTruststorePKCS12 = ({ truststorePeriodp12 }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        truststorePeriodp12,
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

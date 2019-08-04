'use strict';


/**
 *
 * runmode String 
 * name String 
 * no response value expected for this operation
 **/
exports.deleteAgent = function(runmode,name) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 *
 * path String 
 * name String 
 * no response value expected for this operation
 **/
exports.deleteNode = function(path,name) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 *
 * runmode String 
 * name String 
 * no response value expected for this operation
 **/
exports.getAgent = function(runmode,name) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 *
 * runmode String 
 * returns String
 **/
exports.getAgents = function(runmode) {
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
 * intermediatePath String 
 * authorizableId String 
 * returns KeystoreInfo
 **/
exports.getAuthorizableKeystore = function(intermediatePath,authorizableId) {
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
 * intermediatePath String 
 * authorizableId String 
 * returns File
 **/
exports.getKeystore = function(intermediatePath,authorizableId) {
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
 * path String 
 * name String 
 * no response value expected for this operation
 **/
exports.getNode = function(path,name) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 *
 * group String 
 * name String 
 * version String 
 * returns File
 **/
exports.getPackage = function(group,name,version) {
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
 * group String 
 * name String 
 * version String 
 * returns String
 **/
exports.getPackageFilter = function(group,name,version) {
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
 * path String 
 * pPeriodlimit BigDecimal 
 * 1Underscoreproperty String 
 * 1UnderscorepropertyPeriodvalue String 
 * returns String
 **/
exports.getQuery = function(path,pPeriodlimit,1Underscoreproperty,1UnderscorepropertyPeriodvalue) {
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
 * returns File
 **/
exports.getTruststore = function() {
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
 * returns TruststoreInfo
 **/
exports.getTruststoreInfo = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "aliases" : [ {
    "entryType" : "entryType",
    "notAfter" : "notAfter",
    "serialNumber" : 0,
    "subject" : "subject",
    "alias" : "alias",
    "issuer" : "issuer",
    "notBefore" : "notBefore"
  }, {
    "entryType" : "entryType",
    "notAfter" : "notAfter",
    "serialNumber" : 0,
    "subject" : "subject",
    "alias" : "alias",
    "issuer" : "issuer",
    "notBefore" : "notBefore"
  } ],
  "exists" : true
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 *
 * runmode String 
 * name String 
 * jcrContentSlashcqDistribute Boolean  (optional)
 * jcrContentSlashcqDistributeAtTypeHint String  (optional)
 * jcrContentSlashcqName String  (optional)
 * jcrContentSlashcqTemplate String  (optional)
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
 **/
exports.postAgent = function(runmode,name,jcrContentSlashcqDistribute,jcrContentSlashcqDistributeAtTypeHint,jcrContentSlashcqName,jcrContentSlashcqTemplate,jcrContentSlashenabled,jcrContentSlashjcrDescription,jcrContentSlashjcrLastModified,jcrContentSlashjcrLastModifiedBy,jcrContentSlashjcrMixinTypes,jcrContentSlashjcrTitle,jcrContentSlashlogLevel,jcrContentSlashnoStatusUpdate,jcrContentSlashnoVersioning,jcrContentSlashprotocolConnectTimeout,jcrContentSlashprotocolHTTPConnectionClosed,jcrContentSlashprotocolHTTPExpired,jcrContentSlashprotocolHTTPHeaders,jcrContentSlashprotocolHTTPHeadersAtTypeHint,jcrContentSlashprotocolHTTPMethod,jcrContentSlashprotocolHTTPSRelaxed,jcrContentSlashprotocolInterface,jcrContentSlashprotocolSocketTimeout,jcrContentSlashprotocolVersion,jcrContentSlashproxyNTLMDomain,jcrContentSlashproxyNTLMHost,jcrContentSlashproxyHost,jcrContentSlashproxyPassword,jcrContentSlashproxyPort,jcrContentSlashproxyUser,jcrContentSlashqueueBatchMaxSize,jcrContentSlashqueueBatchMode,jcrContentSlashqueueBatchWaitTime,jcrContentSlashretryDelay,jcrContentSlashreverseReplication,jcrContentSlashserializationType,jcrContentSlashslingResourceType,jcrContentSlashssl,jcrContentSlashtransportNTLMDomain,jcrContentSlashtransportNTLMHost,jcrContentSlashtransportPassword,jcrContentSlashtransportUri,jcrContentSlashtransportUser,jcrContentSlashtriggerDistribute,jcrContentSlashtriggerModified,jcrContentSlashtriggerOnOffTime,jcrContentSlashtriggerReceive,jcrContentSlashtriggerSpecific,jcrContentSlashuserId,jcrPrimaryType,operation) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


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
 **/
exports.postAuthorizableKeystore = function(intermediatePath,authorizableId,operation,currentPassword,newPassword,rePassword,keyPassword,keyStorePass,alias,newAlias,removeAlias,certChain,pk,keyStore) {
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
 * authorizableId String 
 * intermediatePath String 
 * createUser String  (optional)
 * createGroup String  (optional)
 * repPassword String  (optional)
 * profileSlashgivenName String  (optional)
 * returns String
 **/
exports.postAuthorizables = function(authorizableId,intermediatePath,createUser,createGroup,repPassword,profileSlashgivenName) {
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
 **/
exports.postConfigAdobeGraniteSamlAuthenticationHandler = function(keyStorePassword,keyStorePasswordAtTypeHint,servicePeriodranking,servicePeriodrankingAtTypeHint,idpHttpRedirect,idpHttpRedirectAtTypeHint,createUser,createUserAtTypeHint,defaultRedirectUrl,defaultRedirectUrlAtTypeHint,userIDAttribute,userIDAttributeAtTypeHint,defaultGroups,defaultGroupsAtTypeHint,idpCertAlias,idpCertAliasAtTypeHint,addGroupMemberships,addGroupMembershipsAtTypeHint,path,pathAtTypeHint,synchronizeAttributes,synchronizeAttributesAtTypeHint,clockTolerance,clockToleranceAtTypeHint,groupMembershipAttribute,groupMembershipAttributeAtTypeHint,idpUrl,idpUrlAtTypeHint,logoutUrl,logoutUrlAtTypeHint,serviceProviderEntityId,serviceProviderEntityIdAtTypeHint,assertionConsumerServiceURL,assertionConsumerServiceURLAtTypeHint,handleLogout,handleLogoutAtTypeHint,spPrivateKeyAlias,spPrivateKeyAliasAtTypeHint,useEncryption,useEncryptionAtTypeHint,nameIdFormat,nameIdFormatAtTypeHint,digestMethod,digestMethodAtTypeHint,signatureMethod,signatureMethodAtTypeHint,userIntermediatePath,userIntermediatePathAtTypeHint) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


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
 **/
exports.postConfigApacheFelixJettyBasedHttpService = function(orgPeriodapachePeriodfelixPeriodhttpsPeriodnio,orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword,orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore,orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword,orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate,orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint,orgPeriodapachePeriodfelixPeriodhttpsPeriodenable,orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint,orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure,orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


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
 **/
exports.postConfigApacheHttpComponentsProxyConfiguration = function(proxyPeriodhost,proxyPeriodhostAtTypeHint,proxyPeriodport,proxyPeriodportAtTypeHint,proxyPeriodexceptions,proxyPeriodexceptionsAtTypeHint,proxyPeriodenabled,proxyPeriodenabledAtTypeHint,proxyPerioduser,proxyPerioduserAtTypeHint,proxyPeriodpassword,proxyPeriodpasswordAtTypeHint) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 *
 * alias String  (optional)
 * aliasAtTypeHint String  (optional)
 * davPeriodcreateAbsoluteUri Boolean  (optional)
 * davPeriodcreateAbsoluteUriAtTypeHint String  (optional)
 * no response value expected for this operation
 **/
exports.postConfigApacheSlingDavExServlet = function(alias,aliasAtTypeHint,davPeriodcreateAbsoluteUri,davPeriodcreateAbsoluteUriAtTypeHint) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


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
 **/
exports.postConfigApacheSlingGetServlet = function(jsonPeriodmaximumresults,jsonPeriodmaximumresultsAtTypeHint,enablePeriodhtml,enablePeriodhtmlAtTypeHint,enablePeriodtxt,enablePeriodtxtAtTypeHint,enablePeriodxml,enablePeriodxmlAtTypeHint) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


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
 **/
exports.postConfigApacheSlingReferrerFilter = function(allowPeriodempty,allowPeriodemptyAtTypeHint,allowPeriodhosts,allowPeriodhostsAtTypeHint,allowPeriodhostsPeriodregexp,allowPeriodhostsPeriodregexpAtTypeHint,filterPeriodmethods,filterPeriodmethodsAtTypeHint) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 *
 * path String 
 * name String 
 * operation String  (optional)
 * deleteAuthorizable String  (optional)
 * file File  (optional)
 * no response value expected for this operation
 **/
exports.postNode = function(path,name,operation,deleteAuthorizable,file) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 *
 * path String 
 * name String 
 * addMembers String  (optional)
 * no response value expected for this operation
 **/
exports.postNodeRw = function(path,name,addMembers) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 *
 * path String 
 * jcrPrimaryType String 
 * name String 
 * no response value expected for this operation
 **/
exports.postPath = function(path,jcrPrimaryType,name) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 *
 * path String 
 * pPeriodlimit BigDecimal 
 * 1Underscoreproperty String 
 * 1UnderscorepropertyPeriodvalue String 
 * returns String
 **/
exports.postQuery = function(path,pPeriodlimit,1Underscoreproperty,1UnderscorepropertyPeriodvalue) {
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
 * ignoredeactivated Boolean 
 * onlymodified Boolean 
 * path String 
 * no response value expected for this operation
 **/
exports.postTreeActivation = function(ignoredeactivated,onlymodified,path) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 *
 * operation String  (optional)
 * newPassword String  (optional)
 * rePassword String  (optional)
 * keyStoreType String  (optional)
 * removeAlias String  (optional)
 * certificate File  (optional)
 * returns String
 **/
exports.postTruststore = function(operation,newPassword,rePassword,keyStoreType,removeAlias,certificate) {
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
 * truststorePeriodp12 File  (optional)
 * returns String
 **/
exports.postTruststorePKCS12 = function(truststorePeriodp12) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


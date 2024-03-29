#import <Foundation/Foundation.h>
#import "OAIKeystoreInfo.h"
#import "OAITruststoreInfo.h"
#import "OAIApi.h"

/**
* Adobe Experience Manager (AEM) API
* Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
*
* The version of the OpenAPI document: 3.5.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/



@interface OAISlingApi: NSObject <OAIApi>

extern NSString* kOAISlingApiErrorDomain;
extern NSInteger kOAISlingApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// 
/// 
///
/// @param runmode 
/// @param name 
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) deleteAgentWithRunmode: (NSString*) runmode
    name: (NSString*) name
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param path 
/// @param name 
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) deleteNodeWithPath: (NSString*) path
    name: (NSString*) name
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param runmode 
/// @param name 
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) getAgentWithRunmode: (NSString*) runmode
    name: (NSString*) name
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param runmode 
/// 
///  code:0 message:"Default response"
///
/// @return NSString*
-(NSURLSessionTask*) getAgentsWithRunmode: (NSString*) runmode
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// 
/// 
///
/// @param intermediatePath 
/// @param authorizableId 
/// 
///  code:200 message:"Retrieved Authorizable Keystore info",
///  code:0 message:"Default response"
///
/// @return OAIKeystoreInfo*
-(NSURLSessionTask*) getAuthorizableKeystoreWithIntermediatePath: (NSString*) intermediatePath
    authorizableId: (NSString*) authorizableId
    completionHandler: (void (^)(OAIKeystoreInfo* output, NSError* error)) handler;


/// 
/// 
///
/// @param intermediatePath 
/// @param authorizableId 
/// 
///  code:0 message:"Default response"
///
/// @return NSURL*
-(NSURLSessionTask*) getKeystoreWithIntermediatePath: (NSString*) intermediatePath
    authorizableId: (NSString*) authorizableId
    completionHandler: (void (^)(NSURL* output, NSError* error)) handler;


/// 
/// 
///
/// @param path 
/// @param name 
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) getNodeWithPath: (NSString*) path
    name: (NSString*) name
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param group 
/// @param name 
/// @param version 
/// 
///  code:0 message:"Default response"
///
/// @return NSURL*
-(NSURLSessionTask*) getPackageWithGroup: (NSString*) group
    name: (NSString*) name
    version: (NSString*) version
    completionHandler: (void (^)(NSURL* output, NSError* error)) handler;


/// 
/// 
///
/// @param group 
/// @param name 
/// @param version 
/// 
///  code:0 message:"Default response"
///
/// @return NSString*
-(NSURLSessionTask*) getPackageFilterWithGroup: (NSString*) group
    name: (NSString*) name
    version: (NSString*) version
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// 
/// 
///
/// @param path 
/// @param pLimit 
/// @param _1property 
/// @param _1propertyValue 
/// 
///  code:0 message:"Default response"
///
/// @return NSString*
-(NSURLSessionTask*) getQueryWithPath: (NSString*) path
    pLimit: (NSNumber*) pLimit
    _1property: (NSString*) _1property
    _1propertyValue: (NSString*) _1propertyValue
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// 
/// 
///
/// 
///  code:0 message:"Default response"
///
/// @return NSURL*
-(NSURLSessionTask*) getTruststoreWithCompletionHandler: 
    (void (^)(NSURL* output, NSError* error)) handler;


/// 
/// 
///
/// 
///  code:200 message:"Retrieved AEM Truststore info",
///  code:0 message:"Default response"
///
/// @return OAITruststoreInfo*
-(NSURLSessionTask*) getTruststoreInfoWithCompletionHandler: 
    (void (^)(OAITruststoreInfo* output, NSError* error)) handler;


/// 
/// 
///
/// @param runmode 
/// @param name 
/// @param jcrcontentCqdistribute  (optional)
/// @param jcrcontentCqdistributeTypeHint  (optional)
/// @param jcrcontentCqname  (optional)
/// @param jcrcontentCqtemplate  (optional)
/// @param jcrcontentEnabled  (optional)
/// @param jcrcontentJcrdescription  (optional)
/// @param jcrcontentJcrlastModified  (optional)
/// @param jcrcontentJcrlastModifiedBy  (optional)
/// @param jcrcontentJcrmixinTypes  (optional)
/// @param jcrcontentJcrtitle  (optional)
/// @param jcrcontentLogLevel  (optional)
/// @param jcrcontentNoStatusUpdate  (optional)
/// @param jcrcontentNoVersioning  (optional)
/// @param jcrcontentProtocolConnectTimeout  (optional)
/// @param jcrcontentProtocolHTTPConnectionClosed  (optional)
/// @param jcrcontentProtocolHTTPExpired  (optional)
/// @param jcrcontentProtocolHTTPHeaders  (optional)
/// @param jcrcontentProtocolHTTPHeadersTypeHint  (optional)
/// @param jcrcontentProtocolHTTPMethod  (optional)
/// @param jcrcontentProtocolHTTPSRelaxed  (optional)
/// @param jcrcontentProtocolInterface  (optional)
/// @param jcrcontentProtocolSocketTimeout  (optional)
/// @param jcrcontentProtocolVersion  (optional)
/// @param jcrcontentProxyNTLMDomain  (optional)
/// @param jcrcontentProxyNTLMHost  (optional)
/// @param jcrcontentProxyHost  (optional)
/// @param jcrcontentProxyPassword  (optional)
/// @param jcrcontentProxyPort  (optional)
/// @param jcrcontentProxyUser  (optional)
/// @param jcrcontentQueueBatchMaxSize  (optional)
/// @param jcrcontentQueueBatchMode  (optional)
/// @param jcrcontentQueueBatchWaitTime  (optional)
/// @param jcrcontentRetryDelay  (optional)
/// @param jcrcontentReverseReplication  (optional)
/// @param jcrcontentSerializationType  (optional)
/// @param jcrcontentSlingresourceType  (optional)
/// @param jcrcontentSsl  (optional)
/// @param jcrcontentTransportNTLMDomain  (optional)
/// @param jcrcontentTransportNTLMHost  (optional)
/// @param jcrcontentTransportPassword  (optional)
/// @param jcrcontentTransportUri  (optional)
/// @param jcrcontentTransportUser  (optional)
/// @param jcrcontentTriggerDistribute  (optional)
/// @param jcrcontentTriggerModified  (optional)
/// @param jcrcontentTriggerOnOffTime  (optional)
/// @param jcrcontentTriggerReceive  (optional)
/// @param jcrcontentTriggerSpecific  (optional)
/// @param jcrcontentUserId  (optional)
/// @param jcrprimaryType  (optional)
/// @param operation  (optional)
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) postAgentWithRunmode: (NSString*) runmode
    name: (NSString*) name
    jcrcontentCqdistribute: (NSNumber*) jcrcontentCqdistribute
    jcrcontentCqdistributeTypeHint: (NSString*) jcrcontentCqdistributeTypeHint
    jcrcontentCqname: (NSString*) jcrcontentCqname
    jcrcontentCqtemplate: (NSString*) jcrcontentCqtemplate
    jcrcontentEnabled: (NSNumber*) jcrcontentEnabled
    jcrcontentJcrdescription: (NSString*) jcrcontentJcrdescription
    jcrcontentJcrlastModified: (NSString*) jcrcontentJcrlastModified
    jcrcontentJcrlastModifiedBy: (NSString*) jcrcontentJcrlastModifiedBy
    jcrcontentJcrmixinTypes: (NSString*) jcrcontentJcrmixinTypes
    jcrcontentJcrtitle: (NSString*) jcrcontentJcrtitle
    jcrcontentLogLevel: (NSString*) jcrcontentLogLevel
    jcrcontentNoStatusUpdate: (NSNumber*) jcrcontentNoStatusUpdate
    jcrcontentNoVersioning: (NSNumber*) jcrcontentNoVersioning
    jcrcontentProtocolConnectTimeout: (NSNumber*) jcrcontentProtocolConnectTimeout
    jcrcontentProtocolHTTPConnectionClosed: (NSNumber*) jcrcontentProtocolHTTPConnectionClosed
    jcrcontentProtocolHTTPExpired: (NSString*) jcrcontentProtocolHTTPExpired
    jcrcontentProtocolHTTPHeaders: (NSArray<NSString*>*) jcrcontentProtocolHTTPHeaders
    jcrcontentProtocolHTTPHeadersTypeHint: (NSString*) jcrcontentProtocolHTTPHeadersTypeHint
    jcrcontentProtocolHTTPMethod: (NSString*) jcrcontentProtocolHTTPMethod
    jcrcontentProtocolHTTPSRelaxed: (NSNumber*) jcrcontentProtocolHTTPSRelaxed
    jcrcontentProtocolInterface: (NSString*) jcrcontentProtocolInterface
    jcrcontentProtocolSocketTimeout: (NSNumber*) jcrcontentProtocolSocketTimeout
    jcrcontentProtocolVersion: (NSString*) jcrcontentProtocolVersion
    jcrcontentProxyNTLMDomain: (NSString*) jcrcontentProxyNTLMDomain
    jcrcontentProxyNTLMHost: (NSString*) jcrcontentProxyNTLMHost
    jcrcontentProxyHost: (NSString*) jcrcontentProxyHost
    jcrcontentProxyPassword: (NSString*) jcrcontentProxyPassword
    jcrcontentProxyPort: (NSNumber*) jcrcontentProxyPort
    jcrcontentProxyUser: (NSString*) jcrcontentProxyUser
    jcrcontentQueueBatchMaxSize: (NSNumber*) jcrcontentQueueBatchMaxSize
    jcrcontentQueueBatchMode: (NSString*) jcrcontentQueueBatchMode
    jcrcontentQueueBatchWaitTime: (NSNumber*) jcrcontentQueueBatchWaitTime
    jcrcontentRetryDelay: (NSString*) jcrcontentRetryDelay
    jcrcontentReverseReplication: (NSNumber*) jcrcontentReverseReplication
    jcrcontentSerializationType: (NSString*) jcrcontentSerializationType
    jcrcontentSlingresourceType: (NSString*) jcrcontentSlingresourceType
    jcrcontentSsl: (NSString*) jcrcontentSsl
    jcrcontentTransportNTLMDomain: (NSString*) jcrcontentTransportNTLMDomain
    jcrcontentTransportNTLMHost: (NSString*) jcrcontentTransportNTLMHost
    jcrcontentTransportPassword: (NSString*) jcrcontentTransportPassword
    jcrcontentTransportUri: (NSString*) jcrcontentTransportUri
    jcrcontentTransportUser: (NSString*) jcrcontentTransportUser
    jcrcontentTriggerDistribute: (NSNumber*) jcrcontentTriggerDistribute
    jcrcontentTriggerModified: (NSNumber*) jcrcontentTriggerModified
    jcrcontentTriggerOnOffTime: (NSNumber*) jcrcontentTriggerOnOffTime
    jcrcontentTriggerReceive: (NSNumber*) jcrcontentTriggerReceive
    jcrcontentTriggerSpecific: (NSNumber*) jcrcontentTriggerSpecific
    jcrcontentUserId: (NSString*) jcrcontentUserId
    jcrprimaryType: (NSString*) jcrprimaryType
    operation: (NSString*) operation
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param intermediatePath 
/// @param authorizableId 
/// @param operation  (optional)
/// @param currentPassword  (optional)
/// @param varNewPassword  (optional)
/// @param rePassword  (optional)
/// @param keyPassword  (optional)
/// @param keyStorePass  (optional)
/// @param alias  (optional)
/// @param varNewAlias  (optional)
/// @param removeAlias  (optional)
/// @param certChain  (optional)
/// @param pk  (optional)
/// @param keyStore  (optional)
/// 
///  code:200 message:"Retrieved Authorizable Keystore info",
///  code:0 message:"Default response"
///
/// @return OAIKeystoreInfo*
-(NSURLSessionTask*) postAuthorizableKeystoreWithIntermediatePath: (NSString*) intermediatePath
    authorizableId: (NSString*) authorizableId
    operation: (NSString*) operation
    currentPassword: (NSString*) currentPassword
    varNewPassword: (NSString*) varNewPassword
    rePassword: (NSString*) rePassword
    keyPassword: (NSString*) keyPassword
    keyStorePass: (NSString*) keyStorePass
    alias: (NSString*) alias
    varNewAlias: (NSString*) varNewAlias
    removeAlias: (NSString*) removeAlias
    certChain: (NSURL*) certChain
    pk: (NSURL*) pk
    keyStore: (NSURL*) keyStore
    completionHandler: (void (^)(OAIKeystoreInfo* output, NSError* error)) handler;


/// 
/// 
///
/// @param authorizableId 
/// @param intermediatePath 
/// @param createUser  (optional)
/// @param createGroup  (optional)
/// @param reppassword  (optional)
/// @param profileGivenName  (optional)
/// 
///  code:0 message:"Default response"
///
/// @return NSString*
-(NSURLSessionTask*) postAuthorizablesWithAuthorizableId: (NSString*) authorizableId
    intermediatePath: (NSString*) intermediatePath
    createUser: (NSString*) createUser
    createGroup: (NSString*) createGroup
    reppassword: (NSString*) reppassword
    profileGivenName: (NSString*) profileGivenName
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// 
/// 
///
/// @param keyStorePassword  (optional)
/// @param keyStorePasswordTypeHint  (optional)
/// @param serviceRanking  (optional)
/// @param serviceRankingTypeHint  (optional)
/// @param idpHttpRedirect  (optional)
/// @param idpHttpRedirectTypeHint  (optional)
/// @param createUser  (optional)
/// @param createUserTypeHint  (optional)
/// @param defaultRedirectUrl  (optional)
/// @param defaultRedirectUrlTypeHint  (optional)
/// @param userIDAttribute  (optional)
/// @param userIDAttributeTypeHint  (optional)
/// @param defaultGroups  (optional)
/// @param defaultGroupsTypeHint  (optional)
/// @param idpCertAlias  (optional)
/// @param idpCertAliasTypeHint  (optional)
/// @param addGroupMemberships  (optional)
/// @param addGroupMembershipsTypeHint  (optional)
/// @param path  (optional)
/// @param pathTypeHint  (optional)
/// @param synchronizeAttributes  (optional)
/// @param synchronizeAttributesTypeHint  (optional)
/// @param clockTolerance  (optional)
/// @param clockToleranceTypeHint  (optional)
/// @param groupMembershipAttribute  (optional)
/// @param groupMembershipAttributeTypeHint  (optional)
/// @param idpUrl  (optional)
/// @param idpUrlTypeHint  (optional)
/// @param logoutUrl  (optional)
/// @param logoutUrlTypeHint  (optional)
/// @param serviceProviderEntityId  (optional)
/// @param serviceProviderEntityIdTypeHint  (optional)
/// @param assertionConsumerServiceURL  (optional)
/// @param assertionConsumerServiceURLTypeHint  (optional)
/// @param handleLogout  (optional)
/// @param handleLogoutTypeHint  (optional)
/// @param spPrivateKeyAlias  (optional)
/// @param spPrivateKeyAliasTypeHint  (optional)
/// @param useEncryption  (optional)
/// @param useEncryptionTypeHint  (optional)
/// @param nameIdFormat  (optional)
/// @param nameIdFormatTypeHint  (optional)
/// @param digestMethod  (optional)
/// @param digestMethodTypeHint  (optional)
/// @param signatureMethod  (optional)
/// @param signatureMethodTypeHint  (optional)
/// @param userIntermediatePath  (optional)
/// @param userIntermediatePathTypeHint  (optional)
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) postConfigAdobeGraniteSamlAuthenticationHandlerWithKeyStorePassword: (NSString*) keyStorePassword
    keyStorePasswordTypeHint: (NSString*) keyStorePasswordTypeHint
    serviceRanking: (NSNumber*) serviceRanking
    serviceRankingTypeHint: (NSString*) serviceRankingTypeHint
    idpHttpRedirect: (NSNumber*) idpHttpRedirect
    idpHttpRedirectTypeHint: (NSString*) idpHttpRedirectTypeHint
    createUser: (NSNumber*) createUser
    createUserTypeHint: (NSString*) createUserTypeHint
    defaultRedirectUrl: (NSString*) defaultRedirectUrl
    defaultRedirectUrlTypeHint: (NSString*) defaultRedirectUrlTypeHint
    userIDAttribute: (NSString*) userIDAttribute
    userIDAttributeTypeHint: (NSString*) userIDAttributeTypeHint
    defaultGroups: (NSArray<NSString*>*) defaultGroups
    defaultGroupsTypeHint: (NSString*) defaultGroupsTypeHint
    idpCertAlias: (NSString*) idpCertAlias
    idpCertAliasTypeHint: (NSString*) idpCertAliasTypeHint
    addGroupMemberships: (NSNumber*) addGroupMemberships
    addGroupMembershipsTypeHint: (NSString*) addGroupMembershipsTypeHint
    path: (NSArray<NSString*>*) path
    pathTypeHint: (NSString*) pathTypeHint
    synchronizeAttributes: (NSArray<NSString*>*) synchronizeAttributes
    synchronizeAttributesTypeHint: (NSString*) synchronizeAttributesTypeHint
    clockTolerance: (NSNumber*) clockTolerance
    clockToleranceTypeHint: (NSString*) clockToleranceTypeHint
    groupMembershipAttribute: (NSString*) groupMembershipAttribute
    groupMembershipAttributeTypeHint: (NSString*) groupMembershipAttributeTypeHint
    idpUrl: (NSString*) idpUrl
    idpUrlTypeHint: (NSString*) idpUrlTypeHint
    logoutUrl: (NSString*) logoutUrl
    logoutUrlTypeHint: (NSString*) logoutUrlTypeHint
    serviceProviderEntityId: (NSString*) serviceProviderEntityId
    serviceProviderEntityIdTypeHint: (NSString*) serviceProviderEntityIdTypeHint
    assertionConsumerServiceURL: (NSString*) assertionConsumerServiceURL
    assertionConsumerServiceURLTypeHint: (NSString*) assertionConsumerServiceURLTypeHint
    handleLogout: (NSNumber*) handleLogout
    handleLogoutTypeHint: (NSString*) handleLogoutTypeHint
    spPrivateKeyAlias: (NSString*) spPrivateKeyAlias
    spPrivateKeyAliasTypeHint: (NSString*) spPrivateKeyAliasTypeHint
    useEncryption: (NSNumber*) useEncryption
    useEncryptionTypeHint: (NSString*) useEncryptionTypeHint
    nameIdFormat: (NSString*) nameIdFormat
    nameIdFormatTypeHint: (NSString*) nameIdFormatTypeHint
    digestMethod: (NSString*) digestMethod
    digestMethodTypeHint: (NSString*) digestMethodTypeHint
    signatureMethod: (NSString*) signatureMethod
    signatureMethodTypeHint: (NSString*) signatureMethodTypeHint
    userIntermediatePath: (NSString*) userIntermediatePath
    userIntermediatePathTypeHint: (NSString*) userIntermediatePathTypeHint
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param orgApacheFelixHttpsNio  (optional)
/// @param orgApacheFelixHttpsNioTypeHint  (optional)
/// @param orgApacheFelixHttpsKeystore  (optional)
/// @param orgApacheFelixHttpsKeystoreTypeHint  (optional)
/// @param orgApacheFelixHttpsKeystorePassword  (optional)
/// @param orgApacheFelixHttpsKeystorePasswordTypeHint  (optional)
/// @param orgApacheFelixHttpsKeystoreKey  (optional)
/// @param orgApacheFelixHttpsKeystoreKeyTypeHint  (optional)
/// @param orgApacheFelixHttpsKeystoreKeyPassword  (optional)
/// @param orgApacheFelixHttpsKeystoreKeyPasswordTypeHint  (optional)
/// @param orgApacheFelixHttpsTruststore  (optional)
/// @param orgApacheFelixHttpsTruststoreTypeHint  (optional)
/// @param orgApacheFelixHttpsTruststorePassword  (optional)
/// @param orgApacheFelixHttpsTruststorePasswordTypeHint  (optional)
/// @param orgApacheFelixHttpsClientcertificate  (optional)
/// @param orgApacheFelixHttpsClientcertificateTypeHint  (optional)
/// @param orgApacheFelixHttpsEnable  (optional)
/// @param orgApacheFelixHttpsEnableTypeHint  (optional)
/// @param orgOsgiServiceHttpPortSecure  (optional)
/// @param orgOsgiServiceHttpPortSecureTypeHint  (optional)
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) postConfigApacheFelixJettyBasedHttpServiceWithOrgApacheFelixHttpsNio: (NSNumber*) orgApacheFelixHttpsNio
    orgApacheFelixHttpsNioTypeHint: (NSString*) orgApacheFelixHttpsNioTypeHint
    orgApacheFelixHttpsKeystore: (NSString*) orgApacheFelixHttpsKeystore
    orgApacheFelixHttpsKeystoreTypeHint: (NSString*) orgApacheFelixHttpsKeystoreTypeHint
    orgApacheFelixHttpsKeystorePassword: (NSString*) orgApacheFelixHttpsKeystorePassword
    orgApacheFelixHttpsKeystorePasswordTypeHint: (NSString*) orgApacheFelixHttpsKeystorePasswordTypeHint
    orgApacheFelixHttpsKeystoreKey: (NSString*) orgApacheFelixHttpsKeystoreKey
    orgApacheFelixHttpsKeystoreKeyTypeHint: (NSString*) orgApacheFelixHttpsKeystoreKeyTypeHint
    orgApacheFelixHttpsKeystoreKeyPassword: (NSString*) orgApacheFelixHttpsKeystoreKeyPassword
    orgApacheFelixHttpsKeystoreKeyPasswordTypeHint: (NSString*) orgApacheFelixHttpsKeystoreKeyPasswordTypeHint
    orgApacheFelixHttpsTruststore: (NSString*) orgApacheFelixHttpsTruststore
    orgApacheFelixHttpsTruststoreTypeHint: (NSString*) orgApacheFelixHttpsTruststoreTypeHint
    orgApacheFelixHttpsTruststorePassword: (NSString*) orgApacheFelixHttpsTruststorePassword
    orgApacheFelixHttpsTruststorePasswordTypeHint: (NSString*) orgApacheFelixHttpsTruststorePasswordTypeHint
    orgApacheFelixHttpsClientcertificate: (NSString*) orgApacheFelixHttpsClientcertificate
    orgApacheFelixHttpsClientcertificateTypeHint: (NSString*) orgApacheFelixHttpsClientcertificateTypeHint
    orgApacheFelixHttpsEnable: (NSNumber*) orgApacheFelixHttpsEnable
    orgApacheFelixHttpsEnableTypeHint: (NSString*) orgApacheFelixHttpsEnableTypeHint
    orgOsgiServiceHttpPortSecure: (NSString*) orgOsgiServiceHttpPortSecure
    orgOsgiServiceHttpPortSecureTypeHint: (NSString*) orgOsgiServiceHttpPortSecureTypeHint
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param proxyHost  (optional)
/// @param proxyHostTypeHint  (optional)
/// @param proxyPort  (optional)
/// @param proxyPortTypeHint  (optional)
/// @param proxyExceptions  (optional)
/// @param proxyExceptionsTypeHint  (optional)
/// @param proxyEnabled  (optional)
/// @param proxyEnabledTypeHint  (optional)
/// @param proxyUser  (optional)
/// @param proxyUserTypeHint  (optional)
/// @param proxyPassword  (optional)
/// @param proxyPasswordTypeHint  (optional)
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) postConfigApacheHttpComponentsProxyConfigurationWithProxyHost: (NSString*) proxyHost
    proxyHostTypeHint: (NSString*) proxyHostTypeHint
    proxyPort: (NSNumber*) proxyPort
    proxyPortTypeHint: (NSString*) proxyPortTypeHint
    proxyExceptions: (NSArray<NSString*>*) proxyExceptions
    proxyExceptionsTypeHint: (NSString*) proxyExceptionsTypeHint
    proxyEnabled: (NSNumber*) proxyEnabled
    proxyEnabledTypeHint: (NSString*) proxyEnabledTypeHint
    proxyUser: (NSString*) proxyUser
    proxyUserTypeHint: (NSString*) proxyUserTypeHint
    proxyPassword: (NSString*) proxyPassword
    proxyPasswordTypeHint: (NSString*) proxyPasswordTypeHint
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param alias  (optional)
/// @param aliasTypeHint  (optional)
/// @param davCreateAbsoluteUri  (optional)
/// @param davCreateAbsoluteUriTypeHint  (optional)
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) postConfigApacheSlingDavExServletWithAlias: (NSString*) alias
    aliasTypeHint: (NSString*) aliasTypeHint
    davCreateAbsoluteUri: (NSNumber*) davCreateAbsoluteUri
    davCreateAbsoluteUriTypeHint: (NSString*) davCreateAbsoluteUriTypeHint
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param jsonMaximumresults  (optional)
/// @param jsonMaximumresultsTypeHint  (optional)
/// @param enableHtml  (optional)
/// @param enableHtmlTypeHint  (optional)
/// @param enableTxt  (optional)
/// @param enableTxtTypeHint  (optional)
/// @param enableXml  (optional)
/// @param enableXmlTypeHint  (optional)
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) postConfigApacheSlingGetServletWithJsonMaximumresults: (NSString*) jsonMaximumresults
    jsonMaximumresultsTypeHint: (NSString*) jsonMaximumresultsTypeHint
    enableHtml: (NSNumber*) enableHtml
    enableHtmlTypeHint: (NSString*) enableHtmlTypeHint
    enableTxt: (NSNumber*) enableTxt
    enableTxtTypeHint: (NSString*) enableTxtTypeHint
    enableXml: (NSNumber*) enableXml
    enableXmlTypeHint: (NSString*) enableXmlTypeHint
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param allowEmpty  (optional)
/// @param allowEmptyTypeHint  (optional)
/// @param allowHosts  (optional)
/// @param allowHostsTypeHint  (optional)
/// @param allowHostsRegexp  (optional)
/// @param allowHostsRegexpTypeHint  (optional)
/// @param filterMethods  (optional)
/// @param filterMethodsTypeHint  (optional)
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) postConfigApacheSlingReferrerFilterWithAllowEmpty: (NSNumber*) allowEmpty
    allowEmptyTypeHint: (NSString*) allowEmptyTypeHint
    allowHosts: (NSString*) allowHosts
    allowHostsTypeHint: (NSString*) allowHostsTypeHint
    allowHostsRegexp: (NSString*) allowHostsRegexp
    allowHostsRegexpTypeHint: (NSString*) allowHostsRegexpTypeHint
    filterMethods: (NSString*) filterMethods
    filterMethodsTypeHint: (NSString*) filterMethodsTypeHint
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param configNodeName 
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) postConfigPropertyWithConfigNodeName: (NSString*) configNodeName
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param path 
/// @param name 
/// @param operation  (optional)
/// @param deleteAuthorizable  (optional)
/// @param file  (optional)
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) postNodeWithPath: (NSString*) path
    name: (NSString*) name
    operation: (NSString*) operation
    deleteAuthorizable: (NSString*) deleteAuthorizable
    file: (NSURL*) file
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param path 
/// @param name 
/// @param addMembers  (optional)
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) postNodeRwWithPath: (NSString*) path
    name: (NSString*) name
    addMembers: (NSString*) addMembers
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param path 
/// @param jcrprimaryType 
/// @param name 
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) postPathWithPath: (NSString*) path
    jcrprimaryType: (NSString*) jcrprimaryType
    name: (NSString*) name
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param path 
/// @param pLimit 
/// @param _1property 
/// @param _1propertyValue 
/// 
///  code:0 message:"Default response"
///
/// @return NSString*
-(NSURLSessionTask*) postQueryWithPath: (NSString*) path
    pLimit: (NSNumber*) pLimit
    _1property: (NSString*) _1property
    _1propertyValue: (NSString*) _1propertyValue
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// 
/// 
///
/// @param ignoredeactivated 
/// @param onlymodified 
/// @param path 
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) postTreeActivationWithIgnoredeactivated: (NSNumber*) ignoredeactivated
    onlymodified: (NSNumber*) onlymodified
    path: (NSString*) path
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param operation  (optional)
/// @param varNewPassword  (optional)
/// @param rePassword  (optional)
/// @param keyStoreType  (optional)
/// @param removeAlias  (optional)
/// @param certificate  (optional)
/// 
///  code:0 message:"Default response"
///
/// @return NSString*
-(NSURLSessionTask*) postTruststoreWithOperation: (NSString*) operation
    varNewPassword: (NSString*) varNewPassword
    rePassword: (NSString*) rePassword
    keyStoreType: (NSString*) keyStoreType
    removeAlias: (NSString*) removeAlias
    certificate: (NSURL*) certificate
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// 
/// 
///
/// @param truststoreP12  (optional)
/// 
///  code:0 message:"Default response"
///
/// @return NSString*
-(NSURLSessionTask*) postTruststorePKCS12WithTruststoreP12: (NSURL*) truststoreP12
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;



@end

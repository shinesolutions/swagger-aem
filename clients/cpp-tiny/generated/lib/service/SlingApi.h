#ifndef TINY_CPP_CLIENT_SlingApi_H_
#define TINY_CPP_CLIENT_SlingApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "KeystoreInfo.h"
#include "TruststoreInfo.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class SlingApi : public Service {
public:
    SlingApi() = default;

    virtual ~SlingApi();

    /**
    * .
    *
    * 
    * \param runmode  *Required*
    * \param name  *Required*
    */
    Response<
            String
        >
    deleteAgent(
            
            std::string runmode
            , 
            
            std::string name
            
    );
    /**
    * .
    *
    * 
    * \param path  *Required*
    * \param name  *Required*
    */
    Response<
            String
        >
    deleteNode(
            
            std::string path
            , 
            
            std::string name
            
    );
    /**
    * .
    *
    * 
    * \param runmode  *Required*
    * \param name  *Required*
    */
    Response<
            String
        >
    getAgent(
            
            std::string runmode
            , 
            
            std::string name
            
    );
    /**
    * .
    *
    * 
    * \param runmode  *Required*
    */
    Response<
                std::string
        >
    getAgents(
            
            std::string runmode
            
    );
    /**
    * .
    *
    * 
    * \param intermediatePath  *Required*
    * \param authorizableId  *Required*
    */
    Response<
                KeystoreInfo
        >
    getAuthorizableKeystore(
            
            std::string intermediatePath
            , 
            
            std::string authorizableId
            
    );
    /**
    * .
    *
    * 
    * \param intermediatePath  *Required*
    * \param authorizableId  *Required*
    */
    Response<
                std::string
        >
    getKeystore(
            
            std::string intermediatePath
            , 
            
            std::string authorizableId
            
    );
    /**
    * .
    *
    * 
    * \param path  *Required*
    * \param name  *Required*
    */
    Response<
            String
        >
    getNode(
            
            std::string path
            , 
            
            std::string name
            
    );
    /**
    * .
    *
    * 
    * \param group  *Required*
    * \param name  *Required*
    * \param version  *Required*
    */
    Response<
                std::string
        >
    getPackage(
            
            std::string group
            , 
            
            std::string name
            , 
            
            std::string version
            
    );
    /**
    * .
    *
    * 
    * \param group  *Required*
    * \param name  *Required*
    * \param version  *Required*
    */
    Response<
                std::string
        >
    getPackageFilter(
            
            std::string group
            , 
            
            std::string name
            , 
            
            std::string version
            
    );
    /**
    * .
    *
    * 
    * \param path  *Required*
    * \param pPeriodlimit  *Required*
    * \param r_1_property  *Required*
    * \param r_1_property_value  *Required*
    */
    Response<
                std::string
        >
    getQuery(
            
            std::string path
            , 
            
            long pPeriodlimit
            , 
            
            std::string r_1_property
            , 
            
            std::string r_1_property_value
            
    );
    /**
    * .
    *
    * 
    */
    Response<
                std::string
        >
    getTruststore(
    );
    /**
    * .
    *
    * 
    */
    Response<
                TruststoreInfo
        >
    getTruststoreInfo(
    );
    /**
    * .
    *
    * 
    * \param runmode  *Required*
    * \param name  *Required*
    * \param jcrContentSlashcqDistribute 
    * \param jcrContentSlashcqDistributeAtTypeHint 
    * \param jcrContentSlashcqName 
    * \param jcrContentSlashcqTemplate 
    * \param jcrContentSlashaliasUpdate 
    * \param jcrContentSlashenabled 
    * \param jcrContentSlashjcrDescription 
    * \param jcrContentSlashjcrLastModified 
    * \param jcrContentSlashjcrLastModifiedBy 
    * \param jcrContentSlashjcrMixinTypes 
    * \param jcrContentSlashjcrTitle 
    * \param jcrContentSlashlogLevel 
    * \param jcrContentSlashnoStatusUpdate 
    * \param jcrContentSlashnoVersioning 
    * \param jcrContentSlashprotocolConnectTimeout 
    * \param jcrContentSlashprotocolHTTPConnectionClosed 
    * \param jcrContentSlashprotocolHTTPExpired 
    * \param jcrContentSlashprotocolHTTPHeaders 
    * \param jcrContentSlashprotocolHTTPHeadersAtTypeHint 
    * \param jcrContentSlashprotocolHTTPMethod 
    * \param jcrContentSlashprotocolHTTPSRelaxed 
    * \param jcrContentSlashprotocolInterface 
    * \param jcrContentSlashprotocolSocketTimeout 
    * \param jcrContentSlashprotocolVersion 
    * \param jcrContentSlashproxyNTLMDomain 
    * \param jcrContentSlashproxyNTLMHost 
    * \param jcrContentSlashproxyHost 
    * \param jcrContentSlashproxyPassword 
    * \param jcrContentSlashproxyPort 
    * \param jcrContentSlashproxyUser 
    * \param jcrContentSlashqueueBatchMaxSize 
    * \param jcrContentSlashqueueBatchMode 
    * \param jcrContentSlashqueueBatchWaitTime 
    * \param jcrContentSlashretryDelay 
    * \param jcrContentSlashreverseReplication 
    * \param jcrContentSlashserializationType 
    * \param jcrContentSlashslingResourceType 
    * \param jcrContentSlashssl 
    * \param jcrContentSlashtransportNTLMDomain 
    * \param jcrContentSlashtransportNTLMHost 
    * \param jcrContentSlashtransportPassword 
    * \param jcrContentSlashtransportUri 
    * \param jcrContentSlashtransportUser 
    * \param jcrContentSlashtriggerDistribute 
    * \param jcrContentSlashtriggerModified 
    * \param jcrContentSlashtriggerOnOffTime 
    * \param jcrContentSlashtriggerReceive 
    * \param jcrContentSlashtriggerSpecific 
    * \param jcrContentSlashuserId 
    * \param jcrPrimaryType 
    * \param operation 
    */
    Response<
            String
        >
    postAgent(
            
            std::string runmode
            , 
            
            std::string name
            , 
            
            bool jcrContentSlashcqDistribute
            , 
            
            std::string jcrContentSlashcqDistributeAtTypeHint
            , 
            
            std::string jcrContentSlashcqName
            , 
            
            std::string jcrContentSlashcqTemplate
            , 
            
            bool jcrContentSlashaliasUpdate
            , 
            
            bool jcrContentSlashenabled
            , 
            
            std::string jcrContentSlashjcrDescription
            , 
            
            std::string jcrContentSlashjcrLastModified
            , 
            
            std::string jcrContentSlashjcrLastModifiedBy
            , 
            
            std::string jcrContentSlashjcrMixinTypes
            , 
            
            std::string jcrContentSlashjcrTitle
            , 
            
            std::string jcrContentSlashlogLevel
            , 
            
            bool jcrContentSlashnoStatusUpdate
            , 
            
            bool jcrContentSlashnoVersioning
            , 
            
            long jcrContentSlashprotocolConnectTimeout
            , 
            
            bool jcrContentSlashprotocolHTTPConnectionClosed
            , 
            
            std::string jcrContentSlashprotocolHTTPExpired
            , 
            std::list<std::string> jcrContentSlashprotocolHTTPHeaders
            
            , 
            
            std::string jcrContentSlashprotocolHTTPHeadersAtTypeHint
            , 
            
            std::string jcrContentSlashprotocolHTTPMethod
            , 
            
            bool jcrContentSlashprotocolHTTPSRelaxed
            , 
            
            std::string jcrContentSlashprotocolInterface
            , 
            
            long jcrContentSlashprotocolSocketTimeout
            , 
            
            std::string jcrContentSlashprotocolVersion
            , 
            
            std::string jcrContentSlashproxyNTLMDomain
            , 
            
            std::string jcrContentSlashproxyNTLMHost
            , 
            
            std::string jcrContentSlashproxyHost
            , 
            
            std::string jcrContentSlashproxyPassword
            , 
            
            long jcrContentSlashproxyPort
            , 
            
            std::string jcrContentSlashproxyUser
            , 
            
            long jcrContentSlashqueueBatchMaxSize
            , 
            
            std::string jcrContentSlashqueueBatchMode
            , 
            
            long jcrContentSlashqueueBatchWaitTime
            , 
            
            std::string jcrContentSlashretryDelay
            , 
            
            bool jcrContentSlashreverseReplication
            , 
            
            std::string jcrContentSlashserializationType
            , 
            
            std::string jcrContentSlashslingResourceType
            , 
            
            std::string jcrContentSlashssl
            , 
            
            std::string jcrContentSlashtransportNTLMDomain
            , 
            
            std::string jcrContentSlashtransportNTLMHost
            , 
            
            std::string jcrContentSlashtransportPassword
            , 
            
            std::string jcrContentSlashtransportUri
            , 
            
            std::string jcrContentSlashtransportUser
            , 
            
            bool jcrContentSlashtriggerDistribute
            , 
            
            bool jcrContentSlashtriggerModified
            , 
            
            bool jcrContentSlashtriggerOnOffTime
            , 
            
            bool jcrContentSlashtriggerReceive
            , 
            
            bool jcrContentSlashtriggerSpecific
            , 
            
            std::string jcrContentSlashuserId
            , 
            
            std::string jcrPrimaryType
            , 
            
            std::string operation
            
    );
    /**
    * .
    *
    * 
    * \param intermediatePath  *Required*
    * \param authorizableId  *Required*
    * \param operation 
    * \param currentPassword 
    * \param newPassword 
    * \param rePassword 
    * \param keyPassword 
    * \param keyStorePass 
    * \param alias 
    * \param newAlias 
    * \param removeAlias 
    * \param certChain 
    * \param pk 
    * \param keyStore 
    */
    Response<
                KeystoreInfo
        >
    postAuthorizableKeystore(
            
            std::string intermediatePath
            , 
            
            std::string authorizableId
            , 
            
            std::string operation
            , 
            
            std::string currentPassword
            , 
            
            std::string newPassword
            , 
            
            std::string rePassword
            , 
            
            std::string keyPassword
            , 
            
            std::string keyStorePass
            , 
            
            std::string alias
            , 
            
            std::string newAlias
            , 
            
            std::string removeAlias
            , 
            
            std::string certChain
            , 
            
            std::string pk
            , 
            
            std::string keyStore
            
    );
    /**
    * .
    *
    * 
    * \param authorizableId  *Required*
    * \param intermediatePath  *Required*
    * \param createUser 
    * \param createGroup 
    * \param repPassword 
    * \param profileSlashgivenName 
    */
    Response<
                std::string
        >
    postAuthorizables(
            
            std::string authorizableId
            , 
            
            std::string intermediatePath
            , 
            
            std::string createUser
            , 
            
            std::string createGroup
            , 
            
            std::string repPassword
            , 
            
            std::string profileSlashgivenName
            
    );
    /**
    * .
    *
    * 
    * \param keyStorePassword 
    * \param keyStorePasswordAtTypeHint 
    * \param servicePeriodranking 
    * \param servicePeriodrankingAtTypeHint 
    * \param idpHttpRedirect 
    * \param idpHttpRedirectAtTypeHint 
    * \param createUser 
    * \param createUserAtTypeHint 
    * \param defaultRedirectUrl 
    * \param defaultRedirectUrlAtTypeHint 
    * \param userIDAttribute 
    * \param userIDAttributeAtTypeHint 
    * \param defaultGroups 
    * \param defaultGroupsAtTypeHint 
    * \param idpCertAlias 
    * \param idpCertAliasAtTypeHint 
    * \param addGroupMemberships 
    * \param addGroupMembershipsAtTypeHint 
    * \param path 
    * \param pathAtTypeHint 
    * \param synchronizeAttributes 
    * \param synchronizeAttributesAtTypeHint 
    * \param clockTolerance 
    * \param clockToleranceAtTypeHint 
    * \param groupMembershipAttribute 
    * \param groupMembershipAttributeAtTypeHint 
    * \param idpUrl 
    * \param idpUrlAtTypeHint 
    * \param logoutUrl 
    * \param logoutUrlAtTypeHint 
    * \param serviceProviderEntityId 
    * \param serviceProviderEntityIdAtTypeHint 
    * \param assertionConsumerServiceURL 
    * \param assertionConsumerServiceURLAtTypeHint 
    * \param handleLogout 
    * \param handleLogoutAtTypeHint 
    * \param spPrivateKeyAlias 
    * \param spPrivateKeyAliasAtTypeHint 
    * \param useEncryption 
    * \param useEncryptionAtTypeHint 
    * \param nameIdFormat 
    * \param nameIdFormatAtTypeHint 
    * \param digestMethod 
    * \param digestMethodAtTypeHint 
    * \param signatureMethod 
    * \param signatureMethodAtTypeHint 
    * \param userIntermediatePath 
    * \param userIntermediatePathAtTypeHint 
    */
    Response<
            String
        >
    postConfigAdobeGraniteSamlAuthenticationHandler(
            
            std::string keyStorePassword
            , 
            
            std::string keyStorePasswordAtTypeHint
            , 
            
            int servicePeriodranking
            , 
            
            std::string servicePeriodrankingAtTypeHint
            , 
            
            bool idpHttpRedirect
            , 
            
            std::string idpHttpRedirectAtTypeHint
            , 
            
            bool createUser
            , 
            
            std::string createUserAtTypeHint
            , 
            
            std::string defaultRedirectUrl
            , 
            
            std::string defaultRedirectUrlAtTypeHint
            , 
            
            std::string userIDAttribute
            , 
            
            std::string userIDAttributeAtTypeHint
            , 
            std::list<std::string> defaultGroups
            
            , 
            
            std::string defaultGroupsAtTypeHint
            , 
            
            std::string idpCertAlias
            , 
            
            std::string idpCertAliasAtTypeHint
            , 
            
            bool addGroupMemberships
            , 
            
            std::string addGroupMembershipsAtTypeHint
            , 
            std::list<std::string> path
            
            , 
            
            std::string pathAtTypeHint
            , 
            std::list<std::string> synchronizeAttributes
            
            , 
            
            std::string synchronizeAttributesAtTypeHint
            , 
            
            int clockTolerance
            , 
            
            std::string clockToleranceAtTypeHint
            , 
            
            std::string groupMembershipAttribute
            , 
            
            std::string groupMembershipAttributeAtTypeHint
            , 
            
            std::string idpUrl
            , 
            
            std::string idpUrlAtTypeHint
            , 
            
            std::string logoutUrl
            , 
            
            std::string logoutUrlAtTypeHint
            , 
            
            std::string serviceProviderEntityId
            , 
            
            std::string serviceProviderEntityIdAtTypeHint
            , 
            
            std::string assertionConsumerServiceURL
            , 
            
            std::string assertionConsumerServiceURLAtTypeHint
            , 
            
            bool handleLogout
            , 
            
            std::string handleLogoutAtTypeHint
            , 
            
            std::string spPrivateKeyAlias
            , 
            
            std::string spPrivateKeyAliasAtTypeHint
            , 
            
            bool useEncryption
            , 
            
            std::string useEncryptionAtTypeHint
            , 
            
            std::string nameIdFormat
            , 
            
            std::string nameIdFormatAtTypeHint
            , 
            
            std::string digestMethod
            , 
            
            std::string digestMethodAtTypeHint
            , 
            
            std::string signatureMethod
            , 
            
            std::string signatureMethodAtTypeHint
            , 
            
            std::string userIntermediatePath
            , 
            
            std::string userIntermediatePathAtTypeHint
            
    );
    /**
    * .
    *
    * 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodnio 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodenable 
    * \param orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint 
    * \param orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure 
    * \param orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint 
    */
    Response<
            String
        >
    postConfigApacheFelixJettyBasedHttpService(
            
            bool orgPeriodapachePeriodfelixPeriodhttpsPeriodnio
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint
            , 
            
            bool orgPeriodapachePeriodfelixPeriodhttpsPeriodenable
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint
            , 
            
            std::string orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure
            , 
            
            std::string orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint
            
    );
    /**
    * .
    *
    * 
    * \param proxyPeriodhost 
    * \param proxyPeriodhostAtTypeHint 
    * \param proxyPeriodport 
    * \param proxyPeriodportAtTypeHint 
    * \param proxyPeriodexceptions 
    * \param proxyPeriodexceptionsAtTypeHint 
    * \param proxyPeriodenabled 
    * \param proxyPeriodenabledAtTypeHint 
    * \param proxyPerioduser 
    * \param proxyPerioduserAtTypeHint 
    * \param proxyPeriodpassword 
    * \param proxyPeriodpasswordAtTypeHint 
    */
    Response<
            String
        >
    postConfigApacheHttpComponentsProxyConfiguration(
            
            std::string proxyPeriodhost
            , 
            
            std::string proxyPeriodhostAtTypeHint
            , 
            
            int proxyPeriodport
            , 
            
            std::string proxyPeriodportAtTypeHint
            , 
            std::list<std::string> proxyPeriodexceptions
            
            , 
            
            std::string proxyPeriodexceptionsAtTypeHint
            , 
            
            bool proxyPeriodenabled
            , 
            
            std::string proxyPeriodenabledAtTypeHint
            , 
            
            std::string proxyPerioduser
            , 
            
            std::string proxyPerioduserAtTypeHint
            , 
            
            std::string proxyPeriodpassword
            , 
            
            std::string proxyPeriodpasswordAtTypeHint
            
    );
    /**
    * .
    *
    * 
    * \param alias 
    * \param aliasAtTypeHint 
    * \param davPeriodcreateAbsoluteUri 
    * \param davPeriodcreateAbsoluteUriAtTypeHint 
    */
    Response<
            String
        >
    postConfigApacheSlingDavExServlet(
            
            std::string alias
            , 
            
            std::string aliasAtTypeHint
            , 
            
            bool davPeriodcreateAbsoluteUri
            , 
            
            std::string davPeriodcreateAbsoluteUriAtTypeHint
            
    );
    /**
    * .
    *
    * 
    * \param jsonPeriodmaximumresults 
    * \param jsonPeriodmaximumresultsAtTypeHint 
    * \param enablePeriodhtml 
    * \param enablePeriodhtmlAtTypeHint 
    * \param enablePeriodtxt 
    * \param enablePeriodtxtAtTypeHint 
    * \param enablePeriodxml 
    * \param enablePeriodxmlAtTypeHint 
    */
    Response<
            String
        >
    postConfigApacheSlingGetServlet(
            
            std::string jsonPeriodmaximumresults
            , 
            
            std::string jsonPeriodmaximumresultsAtTypeHint
            , 
            
            bool enablePeriodhtml
            , 
            
            std::string enablePeriodhtmlAtTypeHint
            , 
            
            bool enablePeriodtxt
            , 
            
            std::string enablePeriodtxtAtTypeHint
            , 
            
            bool enablePeriodxml
            , 
            
            std::string enablePeriodxmlAtTypeHint
            
    );
    /**
    * .
    *
    * 
    * \param allowPeriodempty 
    * \param allowPeriodemptyAtTypeHint 
    * \param allowPeriodhosts 
    * \param allowPeriodhostsAtTypeHint 
    * \param allowPeriodhostsPeriodregexp 
    * \param allowPeriodhostsPeriodregexpAtTypeHint 
    * \param filterPeriodmethods 
    * \param filterPeriodmethodsAtTypeHint 
    */
    Response<
            String
        >
    postConfigApacheSlingReferrerFilter(
            
            bool allowPeriodempty
            , 
            
            std::string allowPeriodemptyAtTypeHint
            , 
            
            std::string allowPeriodhosts
            , 
            
            std::string allowPeriodhostsAtTypeHint
            , 
            
            std::string allowPeriodhostsPeriodregexp
            , 
            
            std::string allowPeriodhostsPeriodregexpAtTypeHint
            , 
            
            std::string filterPeriodmethods
            , 
            
            std::string filterPeriodmethodsAtTypeHint
            
    );
    /**
    * .
    *
    * 
    * \param configNodeName  *Required*
    */
    Response<
            String
        >
    postConfigProperty(
            
            std::string configNodeName
            
    );
    /**
    * .
    *
    * 
    * \param path  *Required*
    * \param name  *Required*
    * \param operation 
    * \param deleteAuthorizable 
    * \param file 
    */
    Response<
            String
        >
    postNode(
            
            std::string path
            , 
            
            std::string name
            , 
            
            std::string operation
            , 
            
            std::string deleteAuthorizable
            , 
            
            std::string file
            
    );
    /**
    * .
    *
    * 
    * \param path  *Required*
    * \param name  *Required*
    * \param addMembers 
    */
    Response<
            String
        >
    postNodeRw(
            
            std::string path
            , 
            
            std::string name
            , 
            
            std::string addMembers
            
    );
    /**
    * .
    *
    * 
    * \param path  *Required*
    * \param jcrPrimaryType  *Required*
    * \param name  *Required*
    */
    Response<
            String
        >
    postPath(
            
            std::string path
            , 
            
            std::string jcrPrimaryType
            , 
            
            std::string name
            
    );
    /**
    * .
    *
    * 
    * \param path  *Required*
    * \param pPeriodlimit  *Required*
    * \param r_1_property  *Required*
    * \param r_1_property_value  *Required*
    */
    Response<
                std::string
        >
    postQuery(
            
            std::string path
            , 
            
            long pPeriodlimit
            , 
            
            std::string r_1_property
            , 
            
            std::string r_1_property_value
            
    );
    /**
    * .
    *
    * 
    * \param ignoredeactivated  *Required*
    * \param onlymodified  *Required*
    * \param path  *Required*
    * \param cmd  *Required*
    */
    Response<
            String
        >
    postTreeActivation(
            
            bool ignoredeactivated
            , 
            
            bool onlymodified
            , 
            
            std::string path
            , 
            
            std::string cmd
            
    );
    /**
    * .
    *
    * 
    * \param operation 
    * \param newPassword 
    * \param rePassword 
    * \param keyStoreType 
    * \param removeAlias 
    * \param certificate 
    */
    Response<
                std::string
        >
    postTruststore(
            
            std::string operation
            , 
            
            std::string newPassword
            , 
            
            std::string rePassword
            , 
            
            std::string keyStoreType
            , 
            
            std::string removeAlias
            , 
            
            std::string certificate
            
    );
    /**
    * .
    *
    * 
    * \param truststorePeriodp12 
    */
    Response<
                std::string
        >
    postTruststorePKCS12(
            
            std::string truststorePeriodp12
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_SlingApi_H_ */
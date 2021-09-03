#ifndef _SlingManager_H_
#define _SlingManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "KeystoreInfo.h"
#include "TruststoreInfo.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Sling Sling
 * \ingroup Operations
 *  @{
 */
class SlingManager {
public:
	SlingManager();
	virtual ~SlingManager();

/*! \brief . *Synchronous*
 *
 * 
 * \param runmode  *Required*
 * \param name  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteAgentSync(char * accessToken,
	std::string runmode, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param runmode  *Required*
 * \param name  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteAgentAsync(char * accessToken,
	std::string runmode, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param path  *Required*
 * \param name  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteNodeSync(char * accessToken,
	std::string path, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param path  *Required*
 * \param name  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteNodeAsync(char * accessToken,
	std::string path, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param runmode  *Required*
 * \param name  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAgentSync(char * accessToken,
	std::string runmode, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param runmode  *Required*
 * \param name  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAgentAsync(char * accessToken,
	std::string runmode, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param runmode  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAgentsSync(char * accessToken,
	std::string runmode, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param runmode  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAgentsAsync(char * accessToken,
	std::string runmode, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param intermediatePath  *Required*
 * \param authorizableId  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAuthorizableKeystoreSync(char * accessToken,
	std::string intermediatePath, std::string authorizableId, 
	void(* handler)(KeystoreInfo, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param intermediatePath  *Required*
 * \param authorizableId  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAuthorizableKeystoreAsync(char * accessToken,
	std::string intermediatePath, std::string authorizableId, 
	void(* handler)(KeystoreInfo, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param intermediatePath  *Required*
 * \param authorizableId  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getKeystoreSync(char * accessToken,
	std::string intermediatePath, std::string authorizableId, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param intermediatePath  *Required*
 * \param authorizableId  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getKeystoreAsync(char * accessToken,
	std::string intermediatePath, std::string authorizableId, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param path  *Required*
 * \param name  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getNodeSync(char * accessToken,
	std::string path, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param path  *Required*
 * \param name  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getNodeAsync(char * accessToken,
	std::string path, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param group  *Required*
 * \param name  *Required*
 * \param version  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getPackageSync(char * accessToken,
	std::string group, std::string name, std::string version, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param group  *Required*
 * \param name  *Required*
 * \param version  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getPackageAsync(char * accessToken,
	std::string group, std::string name, std::string version, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param group  *Required*
 * \param name  *Required*
 * \param version  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getPackageFilterSync(char * accessToken,
	std::string group, std::string name, std::string version, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param group  *Required*
 * \param name  *Required*
 * \param version  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getPackageFilterAsync(char * accessToken,
	std::string group, std::string name, std::string version, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param path  *Required*
 * \param pPeriodlimit  *Required*
 * \param r_1_property  *Required*
 * \param r_1_property_value  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getQuerySync(char * accessToken,
	std::string path, long long pPeriodlimit, std::string r_1_property, std::string r_1_property_value, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param path  *Required*
 * \param pPeriodlimit  *Required*
 * \param r_1_property  *Required*
 * \param r_1_property_value  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getQueryAsync(char * accessToken,
	std::string path, long long pPeriodlimit, std::string r_1_property, std::string r_1_property_value, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getTruststoreSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getTruststoreAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getTruststoreInfoSync(char * accessToken,
	
	void(* handler)(TruststoreInfo, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getTruststoreInfoAsync(char * accessToken,
	
	void(* handler)(TruststoreInfo, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param runmode  *Required*
 * \param name  *Required*
 * \param jcrContentSlashcqDistribute 
 * \param jcrContentSlashcqDistributeAtTypeHint 
 * \param jcrContentSlashcqName 
 * \param jcrContentSlashcqTemplate 
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postAgentSync(char * accessToken,
	std::string runmode, std::string name, bool jcrContentSlashcqDistribute, std::string jcrContentSlashcqDistributeAtTypeHint, std::string jcrContentSlashcqName, std::string jcrContentSlashcqTemplate, bool jcrContentSlashenabled, std::string jcrContentSlashjcrDescription, std::string jcrContentSlashjcrLastModified, std::string jcrContentSlashjcrLastModifiedBy, std::string jcrContentSlashjcrMixinTypes, std::string jcrContentSlashjcrTitle, std::string jcrContentSlashlogLevel, bool jcrContentSlashnoStatusUpdate, bool jcrContentSlashnoVersioning, long long jcrContentSlashprotocolConnectTimeout, bool jcrContentSlashprotocolHTTPConnectionClosed, std::string jcrContentSlashprotocolHTTPExpired, std::list<std::string> jcrContentSlashprotocolHTTPHeaders, std::string jcrContentSlashprotocolHTTPHeadersAtTypeHint, std::string jcrContentSlashprotocolHTTPMethod, bool jcrContentSlashprotocolHTTPSRelaxed, std::string jcrContentSlashprotocolInterface, long long jcrContentSlashprotocolSocketTimeout, std::string jcrContentSlashprotocolVersion, std::string jcrContentSlashproxyNTLMDomain, std::string jcrContentSlashproxyNTLMHost, std::string jcrContentSlashproxyHost, std::string jcrContentSlashproxyPassword, long long jcrContentSlashproxyPort, std::string jcrContentSlashproxyUser, long long jcrContentSlashqueueBatchMaxSize, std::string jcrContentSlashqueueBatchMode, long long jcrContentSlashqueueBatchWaitTime, std::string jcrContentSlashretryDelay, bool jcrContentSlashreverseReplication, std::string jcrContentSlashserializationType, std::string jcrContentSlashslingResourceType, std::string jcrContentSlashssl, std::string jcrContentSlashtransportNTLMDomain, std::string jcrContentSlashtransportNTLMHost, std::string jcrContentSlashtransportPassword, std::string jcrContentSlashtransportUri, std::string jcrContentSlashtransportUser, bool jcrContentSlashtriggerDistribute, bool jcrContentSlashtriggerModified, bool jcrContentSlashtriggerOnOffTime, bool jcrContentSlashtriggerReceive, bool jcrContentSlashtriggerSpecific, std::string jcrContentSlashuserId, std::string jcrPrimaryType, std::string operation, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param runmode  *Required*
 * \param name  *Required*
 * \param jcrContentSlashcqDistribute 
 * \param jcrContentSlashcqDistributeAtTypeHint 
 * \param jcrContentSlashcqName 
 * \param jcrContentSlashcqTemplate 
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postAgentAsync(char * accessToken,
	std::string runmode, std::string name, bool jcrContentSlashcqDistribute, std::string jcrContentSlashcqDistributeAtTypeHint, std::string jcrContentSlashcqName, std::string jcrContentSlashcqTemplate, bool jcrContentSlashenabled, std::string jcrContentSlashjcrDescription, std::string jcrContentSlashjcrLastModified, std::string jcrContentSlashjcrLastModifiedBy, std::string jcrContentSlashjcrMixinTypes, std::string jcrContentSlashjcrTitle, std::string jcrContentSlashlogLevel, bool jcrContentSlashnoStatusUpdate, bool jcrContentSlashnoVersioning, long long jcrContentSlashprotocolConnectTimeout, bool jcrContentSlashprotocolHTTPConnectionClosed, std::string jcrContentSlashprotocolHTTPExpired, std::list<std::string> jcrContentSlashprotocolHTTPHeaders, std::string jcrContentSlashprotocolHTTPHeadersAtTypeHint, std::string jcrContentSlashprotocolHTTPMethod, bool jcrContentSlashprotocolHTTPSRelaxed, std::string jcrContentSlashprotocolInterface, long long jcrContentSlashprotocolSocketTimeout, std::string jcrContentSlashprotocolVersion, std::string jcrContentSlashproxyNTLMDomain, std::string jcrContentSlashproxyNTLMHost, std::string jcrContentSlashproxyHost, std::string jcrContentSlashproxyPassword, long long jcrContentSlashproxyPort, std::string jcrContentSlashproxyUser, long long jcrContentSlashqueueBatchMaxSize, std::string jcrContentSlashqueueBatchMode, long long jcrContentSlashqueueBatchWaitTime, std::string jcrContentSlashretryDelay, bool jcrContentSlashreverseReplication, std::string jcrContentSlashserializationType, std::string jcrContentSlashslingResourceType, std::string jcrContentSlashssl, std::string jcrContentSlashtransportNTLMDomain, std::string jcrContentSlashtransportNTLMHost, std::string jcrContentSlashtransportPassword, std::string jcrContentSlashtransportUri, std::string jcrContentSlashtransportUser, bool jcrContentSlashtriggerDistribute, bool jcrContentSlashtriggerModified, bool jcrContentSlashtriggerOnOffTime, bool jcrContentSlashtriggerReceive, bool jcrContentSlashtriggerSpecific, std::string jcrContentSlashuserId, std::string jcrPrimaryType, std::string operation, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postAuthorizableKeystoreSync(char * accessToken,
	std::string intermediatePath, std::string authorizableId, std::string operation, std::string currentPassword, std::string newPassword, std::string rePassword, std::string keyPassword, std::string keyStorePass, std::string alias, std::string newAlias, std::string removeAlias, std::string certChain, std::string pk, std::string keyStore, 
	void(* handler)(KeystoreInfo, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postAuthorizableKeystoreAsync(char * accessToken,
	std::string intermediatePath, std::string authorizableId, std::string operation, std::string currentPassword, std::string newPassword, std::string rePassword, std::string keyPassword, std::string keyStorePass, std::string alias, std::string newAlias, std::string removeAlias, std::string certChain, std::string pk, std::string keyStore, 
	void(* handler)(KeystoreInfo, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param authorizableId  *Required*
 * \param intermediatePath  *Required*
 * \param createUser 
 * \param createGroup 
 * \param repPassword 
 * \param profileSlashgivenName 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postAuthorizablesSync(char * accessToken,
	std::string authorizableId, std::string intermediatePath, std::string createUser, std::string createGroup, std::string repPassword, std::string profileSlashgivenName, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param authorizableId  *Required*
 * \param intermediatePath  *Required*
 * \param createUser 
 * \param createGroup 
 * \param repPassword 
 * \param profileSlashgivenName 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postAuthorizablesAsync(char * accessToken,
	std::string authorizableId, std::string intermediatePath, std::string createUser, std::string createGroup, std::string repPassword, std::string profileSlashgivenName, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigAdobeGraniteSamlAuthenticationHandlerSync(char * accessToken,
	std::string keyStorePassword, std::string keyStorePasswordAtTypeHint, int servicePeriodranking, std::string servicePeriodrankingAtTypeHint, bool idpHttpRedirect, std::string idpHttpRedirectAtTypeHint, bool createUser, std::string createUserAtTypeHint, std::string defaultRedirectUrl, std::string defaultRedirectUrlAtTypeHint, std::string userIDAttribute, std::string userIDAttributeAtTypeHint, std::list<std::string> defaultGroups, std::string defaultGroupsAtTypeHint, std::string idpCertAlias, std::string idpCertAliasAtTypeHint, bool addGroupMemberships, std::string addGroupMembershipsAtTypeHint, std::list<std::string> path, std::string pathAtTypeHint, std::list<std::string> synchronizeAttributes, std::string synchronizeAttributesAtTypeHint, int clockTolerance, std::string clockToleranceAtTypeHint, std::string groupMembershipAttribute, std::string groupMembershipAttributeAtTypeHint, std::string idpUrl, std::string idpUrlAtTypeHint, std::string logoutUrl, std::string logoutUrlAtTypeHint, std::string serviceProviderEntityId, std::string serviceProviderEntityIdAtTypeHint, std::string assertionConsumerServiceURL, std::string assertionConsumerServiceURLAtTypeHint, bool handleLogout, std::string handleLogoutAtTypeHint, std::string spPrivateKeyAlias, std::string spPrivateKeyAliasAtTypeHint, bool useEncryption, std::string useEncryptionAtTypeHint, std::string nameIdFormat, std::string nameIdFormatAtTypeHint, std::string digestMethod, std::string digestMethodAtTypeHint, std::string signatureMethod, std::string signatureMethodAtTypeHint, std::string userIntermediatePath, std::string userIntermediatePathAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigAdobeGraniteSamlAuthenticationHandlerAsync(char * accessToken,
	std::string keyStorePassword, std::string keyStorePasswordAtTypeHint, int servicePeriodranking, std::string servicePeriodrankingAtTypeHint, bool idpHttpRedirect, std::string idpHttpRedirectAtTypeHint, bool createUser, std::string createUserAtTypeHint, std::string defaultRedirectUrl, std::string defaultRedirectUrlAtTypeHint, std::string userIDAttribute, std::string userIDAttributeAtTypeHint, std::list<std::string> defaultGroups, std::string defaultGroupsAtTypeHint, std::string idpCertAlias, std::string idpCertAliasAtTypeHint, bool addGroupMemberships, std::string addGroupMembershipsAtTypeHint, std::list<std::string> path, std::string pathAtTypeHint, std::list<std::string> synchronizeAttributes, std::string synchronizeAttributesAtTypeHint, int clockTolerance, std::string clockToleranceAtTypeHint, std::string groupMembershipAttribute, std::string groupMembershipAttributeAtTypeHint, std::string idpUrl, std::string idpUrlAtTypeHint, std::string logoutUrl, std::string logoutUrlAtTypeHint, std::string serviceProviderEntityId, std::string serviceProviderEntityIdAtTypeHint, std::string assertionConsumerServiceURL, std::string assertionConsumerServiceURLAtTypeHint, bool handleLogout, std::string handleLogoutAtTypeHint, std::string spPrivateKeyAlias, std::string spPrivateKeyAliasAtTypeHint, bool useEncryption, std::string useEncryptionAtTypeHint, std::string nameIdFormat, std::string nameIdFormatAtTypeHint, std::string digestMethod, std::string digestMethodAtTypeHint, std::string signatureMethod, std::string signatureMethodAtTypeHint, std::string userIntermediatePath, std::string userIntermediatePathAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigApacheFelixJettyBasedHttpServiceSync(char * accessToken,
	bool orgPeriodapachePeriodfelixPeriodhttpsPeriodnio, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint, bool orgPeriodapachePeriodfelixPeriodhttpsPeriodenable, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint, std::string orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure, std::string orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigApacheFelixJettyBasedHttpServiceAsync(char * accessToken,
	bool orgPeriodapachePeriodfelixPeriodhttpsPeriodnio, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint, bool orgPeriodapachePeriodfelixPeriodhttpsPeriodenable, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint, std::string orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure, std::string orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigApacheHttpComponentsProxyConfigurationSync(char * accessToken,
	std::string proxyPeriodhost, std::string proxyPeriodhostAtTypeHint, int proxyPeriodport, std::string proxyPeriodportAtTypeHint, std::list<std::string> proxyPeriodexceptions, std::string proxyPeriodexceptionsAtTypeHint, bool proxyPeriodenabled, std::string proxyPeriodenabledAtTypeHint, std::string proxyPerioduser, std::string proxyPerioduserAtTypeHint, std::string proxyPeriodpassword, std::string proxyPeriodpasswordAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigApacheHttpComponentsProxyConfigurationAsync(char * accessToken,
	std::string proxyPeriodhost, std::string proxyPeriodhostAtTypeHint, int proxyPeriodport, std::string proxyPeriodportAtTypeHint, std::list<std::string> proxyPeriodexceptions, std::string proxyPeriodexceptionsAtTypeHint, bool proxyPeriodenabled, std::string proxyPeriodenabledAtTypeHint, std::string proxyPerioduser, std::string proxyPerioduserAtTypeHint, std::string proxyPeriodpassword, std::string proxyPeriodpasswordAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param alias 
 * \param aliasAtTypeHint 
 * \param davPeriodcreateAbsoluteUri 
 * \param davPeriodcreateAbsoluteUriAtTypeHint 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigApacheSlingDavExServletSync(char * accessToken,
	std::string alias, std::string aliasAtTypeHint, bool davPeriodcreateAbsoluteUri, std::string davPeriodcreateAbsoluteUriAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param alias 
 * \param aliasAtTypeHint 
 * \param davPeriodcreateAbsoluteUri 
 * \param davPeriodcreateAbsoluteUriAtTypeHint 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigApacheSlingDavExServletAsync(char * accessToken,
	std::string alias, std::string aliasAtTypeHint, bool davPeriodcreateAbsoluteUri, std::string davPeriodcreateAbsoluteUriAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigApacheSlingGetServletSync(char * accessToken,
	std::string jsonPeriodmaximumresults, std::string jsonPeriodmaximumresultsAtTypeHint, bool enablePeriodhtml, std::string enablePeriodhtmlAtTypeHint, bool enablePeriodtxt, std::string enablePeriodtxtAtTypeHint, bool enablePeriodxml, std::string enablePeriodxmlAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigApacheSlingGetServletAsync(char * accessToken,
	std::string jsonPeriodmaximumresults, std::string jsonPeriodmaximumresultsAtTypeHint, bool enablePeriodhtml, std::string enablePeriodhtmlAtTypeHint, bool enablePeriodtxt, std::string enablePeriodtxtAtTypeHint, bool enablePeriodxml, std::string enablePeriodxmlAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigApacheSlingReferrerFilterSync(char * accessToken,
	bool allowPeriodempty, std::string allowPeriodemptyAtTypeHint, std::string allowPeriodhosts, std::string allowPeriodhostsAtTypeHint, std::string allowPeriodhostsPeriodregexp, std::string allowPeriodhostsPeriodregexpAtTypeHint, std::string filterPeriodmethods, std::string filterPeriodmethodsAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigApacheSlingReferrerFilterAsync(char * accessToken,
	bool allowPeriodempty, std::string allowPeriodemptyAtTypeHint, std::string allowPeriodhosts, std::string allowPeriodhostsAtTypeHint, std::string allowPeriodhostsPeriodregexp, std::string allowPeriodhostsPeriodregexpAtTypeHint, std::string filterPeriodmethods, std::string filterPeriodmethodsAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param configNodeName  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigPropertySync(char * accessToken,
	std::string configNodeName, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param configNodeName  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigPropertyAsync(char * accessToken,
	std::string configNodeName, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param path  *Required*
 * \param name  *Required*
 * \param operation 
 * \param deleteAuthorizable 
 * \param file 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postNodeSync(char * accessToken,
	std::string path, std::string name, std::string operation, std::string deleteAuthorizable, std::string file, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param path  *Required*
 * \param name  *Required*
 * \param operation 
 * \param deleteAuthorizable 
 * \param file 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postNodeAsync(char * accessToken,
	std::string path, std::string name, std::string operation, std::string deleteAuthorizable, std::string file, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param path  *Required*
 * \param name  *Required*
 * \param addMembers 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postNodeRwSync(char * accessToken,
	std::string path, std::string name, std::string addMembers, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param path  *Required*
 * \param name  *Required*
 * \param addMembers 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postNodeRwAsync(char * accessToken,
	std::string path, std::string name, std::string addMembers, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param path  *Required*
 * \param jcrPrimaryType  *Required*
 * \param name  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postPathSync(char * accessToken,
	std::string path, std::string jcrPrimaryType, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param path  *Required*
 * \param jcrPrimaryType  *Required*
 * \param name  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postPathAsync(char * accessToken,
	std::string path, std::string jcrPrimaryType, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param path  *Required*
 * \param pPeriodlimit  *Required*
 * \param r_1_property  *Required*
 * \param r_1_property_value  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postQuerySync(char * accessToken,
	std::string path, long long pPeriodlimit, std::string r_1_property, std::string r_1_property_value, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param path  *Required*
 * \param pPeriodlimit  *Required*
 * \param r_1_property  *Required*
 * \param r_1_property_value  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postQueryAsync(char * accessToken,
	std::string path, long long pPeriodlimit, std::string r_1_property, std::string r_1_property_value, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param ignoredeactivated  *Required*
 * \param onlymodified  *Required*
 * \param path  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postTreeActivationSync(char * accessToken,
	bool ignoredeactivated, bool onlymodified, std::string path, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param ignoredeactivated  *Required*
 * \param onlymodified  *Required*
 * \param path  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postTreeActivationAsync(char * accessToken,
	bool ignoredeactivated, bool onlymodified, std::string path, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param operation 
 * \param newPassword 
 * \param rePassword 
 * \param keyStoreType 
 * \param removeAlias 
 * \param certificate 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postTruststoreSync(char * accessToken,
	std::string operation, std::string newPassword, std::string rePassword, std::string keyStoreType, std::string removeAlias, std::string certificate, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param operation 
 * \param newPassword 
 * \param rePassword 
 * \param keyStoreType 
 * \param removeAlias 
 * \param certificate 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postTruststoreAsync(char * accessToken,
	std::string operation, std::string newPassword, std::string rePassword, std::string keyStoreType, std::string removeAlias, std::string certificate, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param truststorePeriodp12 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postTruststorePKCS12Sync(char * accessToken,
	std::string truststorePeriodp12, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param truststorePeriodp12 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postTruststorePKCS12Async(char * accessToken,
	std::string truststorePeriodp12, 
	void(* handler)(std::string, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "http://localhost";
	}
};
/** @}*/

}
}
#endif /* SlingManager_H_ */

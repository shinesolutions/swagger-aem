#ifndef _ConsoleManager_H_
#define _ConsoleManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "BundleInfo.h"
#include "SamlConfigurationInfo.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Console Console
 * \ingroup Operations
 *  @{
 */
class ConsoleManager {
public:
	ConsoleManager();
	virtual ~ConsoleManager();

/*! \brief . *Synchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAemProductInfoSync(char * accessToken,
	
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAemProductInfoAsync(char * accessToken,
	
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param name  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBundleInfoSync(char * accessToken,
	std::string name, 
	void(* handler)(BundleInfo, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param name  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBundleInfoAsync(char * accessToken,
	std::string name, 
	void(* handler)(BundleInfo, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getConfigMgrSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getConfigMgrAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param name  *Required*
 * \param action  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postBundleSync(char * accessToken,
	std::string name, std::string action, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param name  *Required*
 * \param action  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postBundleAsync(char * accessToken,
	std::string name, std::string action, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param action  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postJmxRepositorySync(char * accessToken,
	std::string action, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param action  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postJmxRepositoryAsync(char * accessToken,
	std::string action, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param post 
 * \param apply 
 * \param r_delete 
 * \param action 
 * \param Dollarlocation 
 * \param path 
 * \param servicePeriodranking 
 * \param idpUrl 
 * \param idpCertAlias 
 * \param idpHttpRedirect 
 * \param serviceProviderEntityId 
 * \param assertionConsumerServiceURL 
 * \param spPrivateKeyAlias 
 * \param keyStorePassword 
 * \param defaultRedirectUrl 
 * \param userIDAttribute 
 * \param useEncryption 
 * \param createUser 
 * \param addGroupMemberships 
 * \param groupMembershipAttribute 
 * \param defaultGroups 
 * \param nameIdFormat 
 * \param synchronizeAttributes 
 * \param handleLogout 
 * \param logoutUrl 
 * \param clockTolerance 
 * \param digestMethod 
 * \param signatureMethod 
 * \param userIntermediatePath 
 * \param propertylist 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postSamlConfigurationSync(char * accessToken,
	bool post, bool apply, bool r_delete, std::string action, std::string Dollarlocation, std::list<std::string> path, int servicePeriodranking, std::string idpUrl, std::string idpCertAlias, bool idpHttpRedirect, std::string serviceProviderEntityId, std::string assertionConsumerServiceURL, std::string spPrivateKeyAlias, std::string keyStorePassword, std::string defaultRedirectUrl, std::string userIDAttribute, bool useEncryption, bool createUser, bool addGroupMemberships, std::string groupMembershipAttribute, std::list<std::string> defaultGroups, std::string nameIdFormat, std::list<std::string> synchronizeAttributes, bool handleLogout, std::string logoutUrl, int clockTolerance, std::string digestMethod, std::string signatureMethod, std::string userIntermediatePath, std::list<std::string> propertylist, 
	void(* handler)(SamlConfigurationInfo, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param post 
 * \param apply 
 * \param r_delete 
 * \param action 
 * \param Dollarlocation 
 * \param path 
 * \param servicePeriodranking 
 * \param idpUrl 
 * \param idpCertAlias 
 * \param idpHttpRedirect 
 * \param serviceProviderEntityId 
 * \param assertionConsumerServiceURL 
 * \param spPrivateKeyAlias 
 * \param keyStorePassword 
 * \param defaultRedirectUrl 
 * \param userIDAttribute 
 * \param useEncryption 
 * \param createUser 
 * \param addGroupMemberships 
 * \param groupMembershipAttribute 
 * \param defaultGroups 
 * \param nameIdFormat 
 * \param synchronizeAttributes 
 * \param handleLogout 
 * \param logoutUrl 
 * \param clockTolerance 
 * \param digestMethod 
 * \param signatureMethod 
 * \param userIntermediatePath 
 * \param propertylist 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postSamlConfigurationAsync(char * accessToken,
	bool post, bool apply, bool r_delete, std::string action, std::string Dollarlocation, std::list<std::string> path, int servicePeriodranking, std::string idpUrl, std::string idpCertAlias, bool idpHttpRedirect, std::string serviceProviderEntityId, std::string assertionConsumerServiceURL, std::string spPrivateKeyAlias, std::string keyStorePassword, std::string defaultRedirectUrl, std::string userIDAttribute, bool useEncryption, bool createUser, bool addGroupMemberships, std::string groupMembershipAttribute, std::list<std::string> defaultGroups, std::string nameIdFormat, std::list<std::string> synchronizeAttributes, bool handleLogout, std::string logoutUrl, int clockTolerance, std::string digestMethod, std::string signatureMethod, std::string userIntermediatePath, std::list<std::string> propertylist, 
	void(* handler)(SamlConfigurationInfo, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "http://localhost";
	}
};
/** @}*/

}
}
#endif /* ConsoleManager_H_ */

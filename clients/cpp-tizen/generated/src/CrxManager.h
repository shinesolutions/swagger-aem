#ifndef _CrxManager_H_
#define _CrxManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "InstallStatus.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Crx Crx
 * \ingroup Operations
 *  @{
 */
class CrxManager {
public:
	CrxManager();
	virtual ~CrxManager();

/*! \brief . *Synchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getCrxdeStatusSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getCrxdeStatusAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getInstallStatusSync(char * accessToken,
	
	void(* handler)(InstallStatus, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getInstallStatusAsync(char * accessToken,
	
	void(* handler)(InstallStatus, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getPackageManagerServletSync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getPackageManagerServletAsync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param cmd  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postPackageServiceSync(char * accessToken,
	std::string cmd, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param cmd  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postPackageServiceAsync(char * accessToken,
	std::string cmd, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param path  *Required*
 * \param cmd  *Required*
 * \param groupName 
 * \param packageName 
 * \param packageVersion 
 * \param charset 
 * \param force 
 * \param recursive 
 * \param package 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postPackageServiceJsonSync(char * accessToken,
	std::string path, std::string cmd, std::string groupName, std::string packageName, std::string packageVersion, std::string charset, bool force, bool recursive, std::string package, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param path  *Required*
 * \param cmd  *Required*
 * \param groupName 
 * \param packageName 
 * \param packageVersion 
 * \param charset 
 * \param force 
 * \param recursive 
 * \param package 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postPackageServiceJsonAsync(char * accessToken,
	std::string path, std::string cmd, std::string groupName, std::string packageName, std::string packageVersion, std::string charset, bool force, bool recursive, std::string package, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param groupName  *Required*
 * \param packageName  *Required*
 * \param version  *Required*
 * \param path  *Required*
 * \param filter 
 * \param charset 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postPackageUpdateSync(char * accessToken,
	std::string groupName, std::string packageName, std::string version, std::string path, std::string filter, std::string charset, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param groupName  *Required*
 * \param packageName  *Required*
 * \param version  *Required*
 * \param path  *Required*
 * \param filter 
 * \param charset 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postPackageUpdateAsync(char * accessToken,
	std::string groupName, std::string packageName, std::string version, std::string path, std::string filter, std::string charset, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param old  *Required*
 * \param plain  *Required*
 * \param verify  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postSetPasswordSync(char * accessToken,
	std::string old, std::string plain, std::string verify, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param old  *Required*
 * \param plain  *Required*
 * \param verify  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postSetPasswordAsync(char * accessToken,
	std::string old, std::string plain, std::string verify, 
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
#endif /* CrxManager_H_ */

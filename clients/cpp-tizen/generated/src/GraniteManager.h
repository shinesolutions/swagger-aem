#ifndef _GraniteManager_H_
#define _GraniteManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Granite Granite
 * \ingroup Operations
 *  @{
 */
class GraniteManager {
public:
	GraniteManager();
	virtual ~GraniteManager();

/*! \brief . *Synchronous*
 *
 * 
 * \param keystorePassword  *Required*
 * \param keystorePasswordConfirm  *Required*
 * \param truststorePassword  *Required*
 * \param truststorePasswordConfirm  *Required*
 * \param httpsHostname  *Required*
 * \param httpsPort  *Required*
 * \param privatekeyFile 
 * \param certificateFile 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool sslSetupSync(char * accessToken,
	std::string keystorePassword, std::string keystorePasswordConfirm, std::string truststorePassword, std::string truststorePasswordConfirm, std::string httpsHostname, std::string httpsPort, std::string privatekeyFile, std::string certificateFile, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param keystorePassword  *Required*
 * \param keystorePasswordConfirm  *Required*
 * \param truststorePassword  *Required*
 * \param truststorePasswordConfirm  *Required*
 * \param httpsHostname  *Required*
 * \param httpsPort  *Required*
 * \param privatekeyFile 
 * \param certificateFile 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool sslSetupAsync(char * accessToken,
	std::string keystorePassword, std::string keystorePasswordConfirm, std::string truststorePassword, std::string truststorePasswordConfirm, std::string httpsHostname, std::string httpsPort, std::string privatekeyFile, std::string certificateFile, 
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
#endif /* GraniteManager_H_ */

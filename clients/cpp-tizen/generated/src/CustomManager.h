#ifndef _CustomManager_H_
#define _CustomManager_H_

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
/** \addtogroup Custom Custom
 * \ingroup Operations
 *  @{
 */
class CustomManager {
public:
	CustomManager();
	virtual ~CustomManager();

/*! \brief . *Synchronous*
 *
 * 
 * \param tags 
 * \param combineTagsOr 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAemHealthCheckSync(char * accessToken,
	std::string tags, bool combineTagsOr, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param tags 
 * \param combineTagsOr 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAemHealthCheckAsync(char * accessToken,
	std::string tags, bool combineTagsOr, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param bundlesPeriodignored 
 * \param bundlesPeriodignoredAtTypeHint 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigAemHealthCheckServletSync(char * accessToken,
	std::list<std::string> bundlesPeriodignored, std::string bundlesPeriodignoredAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param bundlesPeriodignored 
 * \param bundlesPeriodignoredAtTypeHint 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigAemHealthCheckServletAsync(char * accessToken,
	std::list<std::string> bundlesPeriodignored, std::string bundlesPeriodignoredAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param pwdresetPeriodauthorizables 
 * \param pwdresetPeriodauthorizablesAtTypeHint 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigAemPasswordResetSync(char * accessToken,
	std::list<std::string> pwdresetPeriodauthorizables, std::string pwdresetPeriodauthorizablesAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param pwdresetPeriodauthorizables 
 * \param pwdresetPeriodauthorizablesAtTypeHint 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool postConfigAemPasswordResetAsync(char * accessToken,
	std::list<std::string> pwdresetPeriodauthorizables, std::string pwdresetPeriodauthorizablesAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData);



	static std::string getBasePath()
	{
		return "http://localhost";
	}
};
/** @}*/

}
}
#endif /* CustomManager_H_ */

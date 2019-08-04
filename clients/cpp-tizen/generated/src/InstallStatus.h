/*
 * InstallStatus.h
 *
 * 
 */

#ifndef _InstallStatus_H_
#define _InstallStatus_H_


#include <string>
#include "InstallStatus_status.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InstallStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	InstallStatus();
	InstallStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InstallStatus();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	InstallStatus_status getStatus();

	/*! \brief Set 
	 */
	void setStatus(InstallStatus_status  status);

private:
	InstallStatus_status status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _InstallStatus_H_ */

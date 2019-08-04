/*
 * InstallStatus_status.h
 *
 * 
 */

#ifndef _InstallStatus_status_H_
#define _InstallStatus_status_H_


#include <string>
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

class InstallStatus_status : public Object {
public:
	/*! \brief Constructor.
	 */
	InstallStatus_status();
	InstallStatus_status(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InstallStatus_status();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	bool getFinished();

	/*! \brief Set 
	 */
	void setFinished(bool  finished);
	/*! \brief Get 
	 */
	int getItemCount();

	/*! \brief Set 
	 */
	void setItemCount(int  itemCount);

private:
	bool finished;
	int itemCount;
	void __init();
	void __cleanup();

};
}
}

#endif /* _InstallStatus_status_H_ */

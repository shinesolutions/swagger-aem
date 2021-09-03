/*
 * BundleDataProp.h
 *
 * 
 */

#ifndef _BundleDataProp_H_
#define _BundleDataProp_H_


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

class BundleDataProp : public Object {
public:
	/*! \brief Constructor.
	 */
	BundleDataProp();
	BundleDataProp(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BundleDataProp();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Bundle data key
	 */
	std::string getKey();

	/*! \brief Set Bundle data key
	 */
	void setKey(std::string  key);
	/*! \brief Get Bundle data value
	 */
	std::string getValue();

	/*! \brief Set Bundle data value
	 */
	void setValue(std::string  value);

private:
	std::string key;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BundleDataProp_H_ */

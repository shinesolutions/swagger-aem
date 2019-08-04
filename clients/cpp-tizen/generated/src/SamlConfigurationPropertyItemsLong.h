/*
 * SamlConfigurationPropertyItemsLong.h
 *
 * 
 */

#ifndef _SamlConfigurationPropertyItemsLong_H_
#define _SamlConfigurationPropertyItemsLong_H_


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

class SamlConfigurationPropertyItemsLong : public Object {
public:
	/*! \brief Constructor.
	 */
	SamlConfigurationPropertyItemsLong();
	SamlConfigurationPropertyItemsLong(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SamlConfigurationPropertyItemsLong();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get property name
	 */
	std::string getName();

	/*! \brief Set property name
	 */
	void setName(std::string  name);
	/*! \brief Get True if optional
	 */
	bool getOptional();

	/*! \brief Set True if optional
	 */
	void setOptional(bool  optional);
	/*! \brief Get True if property is set
	 */
	bool getIsSet();

	/*! \brief Set True if property is set
	 */
	void setIsSet(bool  is_set);
	/*! \brief Get Property type, 1=String, 3=long, 11=boolean, 12=Password
	 */
	int getType();

	/*! \brief Set Property type, 1=String, 3=long, 11=boolean, 12=Password
	 */
	void setType(int  type);
	/*! \brief Get Property value
	 */
	int getValue();

	/*! \brief Set Property value
	 */
	void setValue(int  value);
	/*! \brief Get Property description
	 */
	std::string getDescription();

	/*! \brief Set Property description
	 */
	void setDescription(std::string  description);

private:
	std::string name;
	bool optional;
	bool is_set;
	int type;
	int value;
	std::string description;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SamlConfigurationPropertyItemsLong_H_ */

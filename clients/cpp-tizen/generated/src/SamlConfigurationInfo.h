/*
 * SamlConfigurationInfo.h
 *
 * 
 */

#ifndef _SamlConfigurationInfo_H_
#define _SamlConfigurationInfo_H_


#include <string>
#include "SamlConfigurationProperties.h"
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

class SamlConfigurationInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	SamlConfigurationInfo();
	SamlConfigurationInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SamlConfigurationInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Persistent Identity (PID)
	 */
	std::string getPid();

	/*! \brief Set Persistent Identity (PID)
	 */
	void setPid(std::string  pid);
	/*! \brief Get Title
	 */
	std::string getTitle();

	/*! \brief Set Title
	 */
	void setTitle(std::string  title);
	/*! \brief Get Title
	 */
	std::string getDescription();

	/*! \brief Set Title
	 */
	void setDescription(std::string  description);
	/*! \brief Get needed for configuration binding
	 */
	std::string getBundleLocation();

	/*! \brief Set needed for configuration binding
	 */
	void setBundleLocation(std::string  bundle_location);
	/*! \brief Get needed for configuraiton binding
	 */
	std::string getServiceLocation();

	/*! \brief Set needed for configuraiton binding
	 */
	void setServiceLocation(std::string  service_location);
	/*! \brief Get 
	 */
	SamlConfigurationProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(SamlConfigurationProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	std::string bundle_location;
	std::string service_location;
	SamlConfigurationProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SamlConfigurationInfo_H_ */

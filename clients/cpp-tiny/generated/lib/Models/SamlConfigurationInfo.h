
/*
 * SamlConfigurationInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SamlConfigurationInfo_H_
#define TINY_CPP_CLIENT_SamlConfigurationInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "SamlConfigurationProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SamlConfigurationInfo{
public:

    /*! \brief Constructor.
	 */
    SamlConfigurationInfo();
    SamlConfigurationInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SamlConfigurationInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Persistent Identity (PID)
	 */
	std::string getPid();

	/*! \brief Set Persistent Identity (PID)
	 */
	void setPid(std::string pid);
	/*! \brief Get Title
	 */
	std::string getTitle();

	/*! \brief Set Title
	 */
	void setTitle(std::string title);
	/*! \brief Get Title
	 */
	std::string getDescription();

	/*! \brief Set Title
	 */
	void setDescription(std::string description);
	/*! \brief Get needed for configuration binding
	 */
	std::string getBundleLocation();

	/*! \brief Set needed for configuration binding
	 */
	void setBundleLocation(std::string bundle_location);
	/*! \brief Get needed for configuraiton binding
	 */
	std::string getServiceLocation();

	/*! \brief Set needed for configuraiton binding
	 */
	void setServiceLocation(std::string service_location);
	/*! \brief Get 
	 */
	SamlConfigurationProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(SamlConfigurationProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    std::string bundle_location{};
    std::string service_location{};
    SamlConfigurationProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_SamlConfigurationInfo_H_ */

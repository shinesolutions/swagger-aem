
/*
 * SamlConfigurationPropertyItemsArray.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SamlConfigurationPropertyItemsArray_H_
#define TINY_CPP_CLIENT_SamlConfigurationPropertyItemsArray_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SamlConfigurationPropertyItemsArray{
public:

    /*! \brief Constructor.
	 */
    SamlConfigurationPropertyItemsArray();
    SamlConfigurationPropertyItemsArray(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SamlConfigurationPropertyItemsArray();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get property name
	 */
	std::string getName();

	/*! \brief Set property name
	 */
	void setName(std::string name);
	/*! \brief Get True if optional
	 */
	bool isOptional();

	/*! \brief Set True if optional
	 */
	void setOptional(bool optional);
	/*! \brief Get True if property is set
	 */
	bool isIsSet();

	/*! \brief Set True if property is set
	 */
	void setIsSet(bool is_set);
	/*! \brief Get Property type, 1=String, 3=long, 11=boolean, 12=Password
	 */
	int getType();

	/*! \brief Set Property type, 1=String, 3=long, 11=boolean, 12=Password
	 */
	void setType(int type);
	/*! \brief Get Property value
	 */
	std::list<std::string> getValues();

	/*! \brief Set Property value
	 */
	void setValues(std::list<std::string> values);
	/*! \brief Get Property description
	 */
	std::string getDescription();

	/*! \brief Set Property description
	 */
	void setDescription(std::string description);


    private:
    std::string name{};
    bool optional{};
    bool is_set{};
    int type{};
    std::list<std::string> values;
    std::string description{};
};
}

#endif /* TINY_CPP_CLIENT_SamlConfigurationPropertyItemsArray_H_ */

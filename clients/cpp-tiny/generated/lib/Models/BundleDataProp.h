
/*
 * BundleDataProp.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BundleDataProp_H_
#define TINY_CPP_CLIENT_BundleDataProp_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BundleDataProp{
public:

    /*! \brief Constructor.
	 */
    BundleDataProp();
    BundleDataProp(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BundleDataProp();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Bundle data key
	 */
	std::string getKey();

	/*! \brief Set Bundle data key
	 */
	void setKey(std::string key);
	/*! \brief Get Bundle data value
	 */
	std::string getValue();

	/*! \brief Set Bundle data value
	 */
	void setValue(std::string value);


    private:
    std::string key{};
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_BundleDataProp_H_ */

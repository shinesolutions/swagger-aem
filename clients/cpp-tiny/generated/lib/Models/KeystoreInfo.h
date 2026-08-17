
/*
 * KeystoreInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_KeystoreInfo_H_
#define TINY_CPP_CLIENT_KeystoreInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "KeystoreItems.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class KeystoreInfo{
public:

    /*! \brief Constructor.
	 */
    KeystoreInfo();
    KeystoreInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeystoreInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<KeystoreItems> getAliases();

	/*! \brief Set 
	 */
	void setAliases(std::list<KeystoreItems> aliases);
	/*! \brief Get False if truststore don't exist
	 */
	bool isExists();

	/*! \brief Set False if truststore don't exist
	 */
	void setExists(bool exists);


    private:
    std::list<KeystoreItems> aliases;
    bool exists{};
};
}

#endif /* TINY_CPP_CLIENT_KeystoreInfo_H_ */

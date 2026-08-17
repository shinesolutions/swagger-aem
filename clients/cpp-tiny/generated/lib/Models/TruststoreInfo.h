
/*
 * TruststoreInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TruststoreInfo_H_
#define TINY_CPP_CLIENT_TruststoreInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TruststoreItems.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TruststoreInfo{
public:

    /*! \brief Constructor.
	 */
    TruststoreInfo();
    TruststoreInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TruststoreInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<TruststoreItems> getAliases();

	/*! \brief Set 
	 */
	void setAliases(std::list<TruststoreItems> aliases);
	/*! \brief Get False if truststore don't exist
	 */
	bool isExists();

	/*! \brief Set False if truststore don't exist
	 */
	void setExists(bool exists);


    private:
    std::list<TruststoreItems> aliases;
    bool exists{};
};
}

#endif /* TINY_CPP_CLIENT_TruststoreInfo_H_ */


/*
 * KeystoreItems.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_KeystoreItems_H_
#define TINY_CPP_CLIENT_KeystoreItems_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "KeystoreChainItems.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class KeystoreItems{
public:

    /*! \brief Constructor.
	 */
    KeystoreItems();
    KeystoreItems(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~KeystoreItems();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Keystore alias name
	 */
	std::string getAlias();

	/*! \brief Set Keystore alias name
	 */
	void setAlias(std::string alias);
	/*! \brief Get e.g. \"privateKey\"
	 */
	std::string getEntryType();

	/*! \brief Set e.g. \"privateKey\"
	 */
	void setEntryType(std::string entryType);
	/*! \brief Get e.g. \"RSA\"
	 */
	std::string getAlgorithm();

	/*! \brief Set e.g. \"RSA\"
	 */
	void setAlgorithm(std::string algorithm);
	/*! \brief Get e.g. \"PKCS#8\"
	 */
	std::string getFormat();

	/*! \brief Set e.g. \"PKCS#8\"
	 */
	void setFormat(std::string format);
	/*! \brief Get 
	 */
	std::list<KeystoreChainItems> getChain();

	/*! \brief Set 
	 */
	void setChain(std::list<KeystoreChainItems> chain);


    private:
    std::string alias{};
    std::string entryType{};
    std::string algorithm{};
    std::string format{};
    std::list<KeystoreChainItems> chain;
};
}

#endif /* TINY_CPP_CLIENT_KeystoreItems_H_ */

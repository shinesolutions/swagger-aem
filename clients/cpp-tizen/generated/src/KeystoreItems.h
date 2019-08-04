/*
 * KeystoreItems.h
 *
 * 
 */

#ifndef _KeystoreItems_H_
#define _KeystoreItems_H_


#include <string>
#include "KeystoreChainItems.h"
#include <list>
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

class KeystoreItems : public Object {
public:
	/*! \brief Constructor.
	 */
	KeystoreItems();
	KeystoreItems(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeystoreItems();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Keystore alias name
	 */
	std::string getAlias();

	/*! \brief Set Keystore alias name
	 */
	void setAlias(std::string  alias);
	/*! \brief Get e.g. \"privateKey\"
	 */
	std::string getEntryType();

	/*! \brief Set e.g. \"privateKey\"
	 */
	void setEntryType(std::string  entryType);
	/*! \brief Get e.g. \"RSA\"
	 */
	std::string getAlgorithm();

	/*! \brief Set e.g. \"RSA\"
	 */
	void setAlgorithm(std::string  algorithm);
	/*! \brief Get e.g. \"PKCS#8\"
	 */
	std::string getFormat();

	/*! \brief Set e.g. \"PKCS#8\"
	 */
	void setFormat(std::string  format);
	/*! \brief Get 
	 */
	std::list<KeystoreChainItems> getChain();

	/*! \brief Set 
	 */
	void setChain(std::list <KeystoreChainItems> chain);

private:
	std::string alias;
	std::string entryType;
	std::string algorithm;
	std::string format;
	std::list <KeystoreChainItems>chain;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeystoreItems_H_ */

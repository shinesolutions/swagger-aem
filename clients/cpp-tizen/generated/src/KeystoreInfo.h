/*
 * KeystoreInfo.h
 *
 * 
 */

#ifndef _KeystoreInfo_H_
#define _KeystoreInfo_H_


#include <string>
#include "KeystoreItems.h"
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

class KeystoreInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	KeystoreInfo();
	KeystoreInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeystoreInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<KeystoreItems> getAliases();

	/*! \brief Set 
	 */
	void setAliases(std::list <KeystoreItems> aliases);
	/*! \brief Get False if truststore don't exist
	 */
	bool getExists();

	/*! \brief Set False if truststore don't exist
	 */
	void setExists(bool  exists);

private:
	std::list <KeystoreItems>aliases;
	bool exists;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeystoreInfo_H_ */

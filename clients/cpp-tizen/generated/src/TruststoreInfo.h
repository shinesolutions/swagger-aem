/*
 * TruststoreInfo.h
 *
 * 
 */

#ifndef _TruststoreInfo_H_
#define _TruststoreInfo_H_


#include <string>
#include "TruststoreItems.h"
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

class TruststoreInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	TruststoreInfo();
	TruststoreInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TruststoreInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<TruststoreItems> getAliases();

	/*! \brief Set 
	 */
	void setAliases(std::list <TruststoreItems> aliases);
	/*! \brief Get False if truststore don't exist
	 */
	bool getExists();

	/*! \brief Set False if truststore don't exist
	 */
	void setExists(bool  exists);

private:
	std::list <TruststoreItems>aliases;
	bool exists;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TruststoreInfo_H_ */

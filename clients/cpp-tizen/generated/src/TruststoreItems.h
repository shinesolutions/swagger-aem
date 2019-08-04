/*
 * TruststoreItems.h
 *
 * 
 */

#ifndef _TruststoreItems_H_
#define _TruststoreItems_H_


#include <string>
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

class TruststoreItems : public Object {
public:
	/*! \brief Constructor.
	 */
	TruststoreItems();
	TruststoreItems(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TruststoreItems();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Truststore alias name
	 */
	std::string getAlias();

	/*! \brief Set Truststore alias name
	 */
	void setAlias(std::string  alias);
	/*! \brief Get 
	 */
	std::string getEntryType();

	/*! \brief Set 
	 */
	void setEntryType(std::string  entryType);
	/*! \brief Get e.g. \"CN=localhost\"
	 */
	std::string getSubject();

	/*! \brief Set e.g. \"CN=localhost\"
	 */
	void setSubject(std::string  subject);
	/*! \brief Get e.g. \"CN=Admin\"
	 */
	std::string getIssuer();

	/*! \brief Set e.g. \"CN=Admin\"
	 */
	void setIssuer(std::string  issuer);
	/*! \brief Get e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
	 */
	std::string getNotBefore();

	/*! \brief Set e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
	 */
	void setNotBefore(std::string  notBefore);
	/*! \brief Get e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
	 */
	std::string getNotAfter();

	/*! \brief Set e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
	 */
	void setNotAfter(std::string  notAfter);
	/*! \brief Get 18165099476682912368
	 */
	int getSerialNumber();

	/*! \brief Set 18165099476682912368
	 */
	void setSerialNumber(int  serialNumber);

private:
	std::string alias;
	std::string entryType;
	std::string subject;
	std::string issuer;
	std::string notBefore;
	std::string notAfter;
	int serialNumber;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TruststoreItems_H_ */

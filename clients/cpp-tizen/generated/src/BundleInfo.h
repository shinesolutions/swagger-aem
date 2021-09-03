/*
 * BundleInfo.h
 *
 * 
 */

#ifndef _BundleInfo_H_
#define _BundleInfo_H_


#include <string>
#include "BundleData.h"
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

class BundleInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	BundleInfo();
	BundleInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BundleInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Status description of all bundles
	 */
	std::string getStatus();

	/*! \brief Set Status description of all bundles
	 */
	void setStatus(std::string  status);
	/*! \brief Get 
	 */
	std::list<int> getS();

	/*! \brief Set 
	 */
	void setS(std::list <int> s);
	/*! \brief Get 
	 */
	std::list<BundleData> getData();

	/*! \brief Set 
	 */
	void setData(std::list <BundleData> data);

private:
	std::string status;
	std::list <int>s;
	std::list <BundleData>data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BundleInfo_H_ */

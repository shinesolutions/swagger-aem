/*
 * BundleData.h
 *
 * 
 */

#ifndef _BundleData_H_
#define _BundleData_H_


#include <string>
#include "BundleDataProp.h"
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

class BundleData : public Object {
public:
	/*! \brief Constructor.
	 */
	BundleData();
	BundleData(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BundleData();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Bundle ID
	 */
	int getId();

	/*! \brief Set Bundle ID
	 */
	void setId(int  id);
	/*! \brief Get Bundle name
	 */
	std::string getName();

	/*! \brief Set Bundle name
	 */
	void setName(std::string  name);
	/*! \brief Get Is bundle a fragment
	 */
	bool getFragment();

	/*! \brief Set Is bundle a fragment
	 */
	void setFragment(bool  fragment);
	/*! \brief Get Numeric raw bundle state value
	 */
	int getStateRaw();

	/*! \brief Set Numeric raw bundle state value
	 */
	void setStateRaw(int  stateRaw);
	/*! \brief Get Bundle state value
	 */
	std::string getState();

	/*! \brief Set Bundle state value
	 */
	void setState(std::string  state);
	/*! \brief Get Bundle version
	 */
	std::string getVersion();

	/*! \brief Set Bundle version
	 */
	void setVersion(std::string  version);
	/*! \brief Get Bundle symbolic name
	 */
	std::string getSymbolicName();

	/*! \brief Set Bundle symbolic name
	 */
	void setSymbolicName(std::string  symbolicName);
	/*! \brief Get Bundle category
	 */
	std::string getCategory();

	/*! \brief Set Bundle category
	 */
	void setCategory(std::string  category);
	/*! \brief Get 
	 */
	std::list<BundleDataProp> getProps();

	/*! \brief Set 
	 */
	void setProps(std::list <BundleDataProp> props);

private:
	int id;
	std::string name;
	bool fragment;
	int stateRaw;
	std::string state;
	std::string version;
	std::string symbolicName;
	std::string category;
	std::list <BundleDataProp>props;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BundleData_H_ */

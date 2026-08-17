
/*
 * BundleInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BundleInfo_H_
#define TINY_CPP_CLIENT_BundleInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BundleData.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BundleInfo{
public:

    /*! \brief Constructor.
	 */
    BundleInfo();
    BundleInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BundleInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Status description of all bundles
	 */
	std::string getStatus();

	/*! \brief Set Status description of all bundles
	 */
	void setStatus(std::string status);
	/*! \brief Get 
	 */
	std::list<int> getS();

	/*! \brief Set 
	 */
	void setS(std::list<int> s);
	/*! \brief Get 
	 */
	std::list<BundleData> getData();

	/*! \brief Set 
	 */
	void setData(std::list<BundleData> data);


    private:
    std::string status{};
    std::list<int> s;
    std::list<BundleData> data;
};
}

#endif /* TINY_CPP_CLIENT_BundleInfo_H_ */


/*
 * InstallStatus.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_InstallStatus_H_
#define TINY_CPP_CLIENT_InstallStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "InstallStatus_status.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InstallStatus{
public:

    /*! \brief Constructor.
	 */
    InstallStatus();
    InstallStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InstallStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	InstallStatus_status getStatus();

	/*! \brief Set 
	 */
	void setStatus(InstallStatus_status status);


    private:
    InstallStatus_status status;
};
}

#endif /* TINY_CPP_CLIENT_InstallStatus_H_ */

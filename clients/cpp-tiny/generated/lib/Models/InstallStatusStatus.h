
/*
 * InstallStatus_status.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_InstallStatus_status_H_
#define TINY_CPP_CLIENT_InstallStatus_status_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InstallStatus_status{
public:

    /*! \brief Constructor.
	 */
    InstallStatus_status();
    InstallStatus_status(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InstallStatus_status();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	bool isFinished();

	/*! \brief Set 
	 */
	void setFinished(bool finished);
	/*! \brief Get 
	 */
	int getItemCount();

	/*! \brief Set 
	 */
	void setItemCount(int itemCount);


    private:
    bool finished{};
    int itemCount{};
};
}

#endif /* TINY_CPP_CLIENT_InstallStatus_status_H_ */

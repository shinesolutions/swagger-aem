#ifndef TINY_CPP_CLIENT_CqApi_H_
#define TINY_CPP_CLIENT_CqApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>


namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CqApi : public Service {
public:
    CqApi() = default;

    virtual ~CqApi();

    /**
    * .
    *
    * 
    */
    Response<
                std::string
        >
    getLoginPage(
    );
    /**
    * .
    *
    * 
    * \param authorizableId  *Required*
    * \param changelog  *Required*
    */
    Response<
            String
        >
    postCqActions(
            
            std::string authorizableId
            , 
            
            std::string changelog
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CqApi_H_ */
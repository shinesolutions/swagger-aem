#ifndef TINY_CPP_CLIENT_CustomApi_H_
#define TINY_CPP_CLIENT_CustomApi_H_


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

class CustomApi : public Service {
public:
    CustomApi() = default;

    virtual ~CustomApi();

    /**
    * .
    *
    * 
    * \param tags 
    * \param combineTagsOr 
    */
    Response<
                std::string
        >
    getAemHealthCheck(
            
            std::string tags
            , 
            
            bool combineTagsOr
            
    );
    /**
    * .
    *
    * 
    * \param bundlesPeriodignored 
    * \param bundlesPeriodignoredAtTypeHint 
    */
    Response<
            String
        >
    postConfigAemHealthCheckServlet(
            std::list<std::string> bundlesPeriodignored
            
            , 
            
            std::string bundlesPeriodignoredAtTypeHint
            
    );
    /**
    * .
    *
    * 
    * \param pwdresetPeriodauthorizables 
    * \param pwdresetPeriodauthorizablesAtTypeHint 
    */
    Response<
            String
        >
    postConfigAemPasswordReset(
            std::list<std::string> pwdresetPeriodauthorizables
            
            , 
            
            std::string pwdresetPeriodauthorizablesAtTypeHint
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CustomApi_H_ */
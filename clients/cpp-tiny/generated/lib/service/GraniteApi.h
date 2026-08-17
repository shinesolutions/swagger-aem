#ifndef TINY_CPP_CLIENT_GraniteApi_H_
#define TINY_CPP_CLIENT_GraniteApi_H_


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

class GraniteApi : public Service {
public:
    GraniteApi() = default;

    virtual ~GraniteApi();

    /**
    * .
    *
    * 
    * \param keystorePassword  *Required*
    * \param keystorePasswordConfirm  *Required*
    * \param truststorePassword  *Required*
    * \param truststorePasswordConfirm  *Required*
    * \param httpsHostname  *Required*
    * \param httpsPort  *Required*
    * \param privatekeyFile 
    * \param certificateFile 
    */
    Response<
                std::string
        >
    sslSetup(
            
            std::string keystorePassword
            , 
            
            std::string keystorePasswordConfirm
            , 
            
            std::string truststorePassword
            , 
            
            std::string truststorePasswordConfirm
            , 
            
            std::string httpsHostname
            , 
            
            std::string httpsPort
            , 
            
            std::string privatekeyFile
            , 
            
            std::string certificateFile
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_GraniteApi_H_ */
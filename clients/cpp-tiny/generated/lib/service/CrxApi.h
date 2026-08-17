#ifndef TINY_CPP_CLIENT_CrxApi_H_
#define TINY_CPP_CLIENT_CrxApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "InstallStatus.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CrxApi : public Service {
public:
    CrxApi() = default;

    virtual ~CrxApi();

    /**
    * .
    *
    * 
    */
    Response<
                std::string
        >
    getCrxdeStatus(
    );
    /**
    * .
    *
    * 
    */
    Response<
                InstallStatus
        >
    getInstallStatus(
    );
    /**
    * .
    *
    * 
    */
    Response<
            String
        >
    getPackageManagerServlet(
    );
    /**
    * .
    *
    * 
    * \param cmd  *Required*
    */
    Response<
                std::string
        >
    postPackageService(
            
            std::string cmd
            
    );
    /**
    * .
    *
    * 
    * \param path  *Required*
    * \param cmd  *Required*
    * \param groupName 
    * \param packageName 
    * \param packageVersion 
    * \param charset 
    * \param force 
    * \param recursive 
    * \param package 
    */
    Response<
                std::string
        >
    postPackageServiceJson(
            
            std::string path
            , 
            
            std::string cmd
            , 
            
            std::string groupName
            , 
            
            std::string packageName
            , 
            
            std::string packageVersion
            , 
            
            std::string charset
            , 
            
            bool force
            , 
            
            bool recursive
            , 
            
            std::string package
            
    );
    /**
    * .
    *
    * 
    * \param groupName  *Required*
    * \param packageName  *Required*
    * \param version  *Required*
    * \param path  *Required*
    * \param filter 
    * \param charset 
    */
    Response<
                std::string
        >
    postPackageUpdate(
            
            std::string groupName
            , 
            
            std::string packageName
            , 
            
            std::string version
            , 
            
            std::string path
            , 
            
            std::string filter
            , 
            
            std::string charset
            
    );
    /**
    * .
    *
    * 
    * \param old  *Required*
    * \param plain  *Required*
    * \param verify  *Required*
    */
    Response<
                std::string
        >
    postSetPassword(
            
            std::string old
            , 
            
            std::string plain
            , 
            
            std::string verify
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CrxApi_H_ */
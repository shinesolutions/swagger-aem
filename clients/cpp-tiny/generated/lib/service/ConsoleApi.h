#ifndef TINY_CPP_CLIENT_ConsoleApi_H_
#define TINY_CPP_CLIENT_ConsoleApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "BundleInfo.h"
#include "SamlConfigurationInfo.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ConsoleApi : public Service {
public:
    ConsoleApi() = default;

    virtual ~ConsoleApi();

    /**
    * .
    *
    * 
    */
    Response<
                    std::list<std::string>
        >
    getAemProductInfo(
    );
    /**
    * .
    *
    * 
    * \param name  *Required*
    */
    Response<
                BundleInfo
        >
    getBundleInfo(
            
            std::string name
            
    );
    /**
    * .
    *
    * 
    */
    Response<
                std::string
        >
    getConfigMgr(
    );
    /**
    * .
    *
    * 
    * \param name  *Required*
    * \param action  *Required*
    */
    Response<
            String
        >
    postBundle(
            
            std::string name
            , 
            
            std::string action
            
    );
    /**
    * .
    *
    * 
    * \param action  *Required*
    */
    Response<
            String
        >
    postJmxRepository(
            
            std::string action
            
    );
    /**
    * .
    *
    * 
    * \param post 
    * \param apply 
    * \param r_delete 
    * \param action 
    * \param Dollarlocation 
    * \param path 
    * \param servicePeriodranking 
    * \param idpUrl 
    * \param idpCertAlias 
    * \param idpHttpRedirect 
    * \param serviceProviderEntityId 
    * \param assertionConsumerServiceURL 
    * \param spPrivateKeyAlias 
    * \param keyStorePassword 
    * \param defaultRedirectUrl 
    * \param userIDAttribute 
    * \param useEncryption 
    * \param createUser 
    * \param addGroupMemberships 
    * \param groupMembershipAttribute 
    * \param defaultGroups 
    * \param nameIdFormat 
    * \param synchronizeAttributes 
    * \param handleLogout 
    * \param logoutUrl 
    * \param clockTolerance 
    * \param digestMethod 
    * \param signatureMethod 
    * \param userIntermediatePath 
    * \param propertylist 
    */
    Response<
                SamlConfigurationInfo
        >
    postSamlConfiguration(
            
            bool post
            , 
            
            bool apply
            , 
            
            bool r_delete
            , 
            
            std::string action
            , 
            
            std::string Dollarlocation
            , 
            std::list<std::string> path
            
            , 
            
            int servicePeriodranking
            , 
            
            std::string idpUrl
            , 
            
            std::string idpCertAlias
            , 
            
            bool idpHttpRedirect
            , 
            
            std::string serviceProviderEntityId
            , 
            
            std::string assertionConsumerServiceURL
            , 
            
            std::string spPrivateKeyAlias
            , 
            
            std::string keyStorePassword
            , 
            
            std::string defaultRedirectUrl
            , 
            
            std::string userIDAttribute
            , 
            
            bool useEncryption
            , 
            
            bool createUser
            , 
            
            bool addGroupMemberships
            , 
            
            std::string groupMembershipAttribute
            , 
            std::list<std::string> defaultGroups
            
            , 
            
            std::string nameIdFormat
            , 
            std::list<std::string> synchronizeAttributes
            
            , 
            
            bool handleLogout
            , 
            
            std::string logoutUrl
            , 
            
            int clockTolerance
            , 
            
            std::string digestMethod
            , 
            
            std::string signatureMethod
            , 
            
            std::string userIntermediatePath
            , 
            std::list<std::string> propertylist
            
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ConsoleApi_H_ */
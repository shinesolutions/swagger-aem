/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.2.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ConsoleApi.h
 *
 * 
 */

#ifndef ConsoleApi_H_
#define ConsoleApi_H_


#include <memory>
#include <utility>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/service.hpp>

#include "BundleInfo.h"
#include "SamlConfigurationInfo.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ConsoleApiSystemConsoleStatus-productinfo.jsonResource: public restbed::Resource
{
public:
	ConsoleApiSystemConsoleStatus-productinfo.jsonResource();
    virtual ~ConsoleApiSystemConsoleStatus-productinfo.jsonResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_GET(
		std::function<std::pair<int, std::string>(
			
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		
	)> handler_GET_;


};

/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ConsoleApiSystemConsoleBundles{name}.jsonResource: public restbed::Resource
{
public:
	ConsoleApiSystemConsoleBundles{name}.jsonResource();
    virtual ~ConsoleApiSystemConsoleBundles{name}.jsonResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_GET(
		std::function<std::pair<int, std::string>(
			std::string const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		std::string const &
	)> handler_GET_;


	std::string name{};
};

/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ConsoleApiSystemConsoleConfigMgrResource: public restbed::Resource
{
public:
	ConsoleApiSystemConsoleConfigMgrResource();
    virtual ~ConsoleApiSystemConsoleConfigMgrResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_GET(
		std::function<std::pair<int, std::string>(
			
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		
	)> handler_GET_;


};

/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ConsoleApiSystemConsoleBundlesNameResource: public restbed::Resource
{
public:
	ConsoleApiSystemConsoleBundlesNameResource();
    virtual ~ConsoleApiSystemConsoleBundlesNameResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_POST(
		std::function<std::pair<int, std::string>(
			std::string const &, std::string const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		std::string const &, std::string const &
	)> handler_POST_;


	std::string name{};
	std::string action{};
};

/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ConsoleApiSystemConsoleJmxCom.adobe.granite:type&#x3D;RepositoryOpActionResource: public restbed::Resource
{
public:
	ConsoleApiSystemConsoleJmxCom.adobe.granite:type&#x3D;RepositoryOpActionResource();
    virtual ~ConsoleApiSystemConsoleJmxCom.adobe.granite:type&#x3D;RepositoryOpActionResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_POST(
		std::function<std::pair<int, std::string>(
			std::string const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		std::string const &
	)> handler_POST_;


	std::string action{};
};

/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ConsoleApiSystemConsoleConfigMgrCom.adobe.granite.auth.saml.SamlAuthenticationHandlerResource: public restbed::Resource
{
public:
	ConsoleApiSystemConsoleConfigMgrCom.adobe.granite.auth.saml.SamlAuthenticationHandlerResource();
    virtual ~ConsoleApiSystemConsoleConfigMgrCom.adobe.granite.auth.saml.SamlAuthenticationHandlerResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_POST(
		std::function<std::pair<int, std::string>(
			bool const &, bool const &, bool const &, std::string const &, std::string const &, std::vector<std::string> const &, int32_t const &, std::string const &, std::string const &, bool const &, std::string const &, std::string const &, std::string const &, std::string const &, std::string const &, std::string const &, bool const &, bool const &, bool const &, std::string const &, std::vector<std::string> const &, std::string const &, std::vector<std::string> const &, bool const &, std::string const &, int32_t const &, std::string const &, std::string const &, std::string const &, std::vector<std::string> const &
		)> handler
	);


private:
	std::function<std::pair<int, std::string>(
		bool const &, bool const &, bool const &, std::string const &, std::string const &, std::vector<std::string> const &, int32_t const &, std::string const &, std::string const &, bool const &, std::string const &, std::string const &, std::string const &, std::string const &, std::string const &, std::string const &, bool const &, bool const &, bool const &, std::string const &, std::vector<std::string> const &, std::string const &, std::vector<std::string> const &, bool const &, std::string const &, int32_t const &, std::string const &, std::string const &, std::string const &, std::vector<std::string> const &
	)> handler_POST_;


	bool post{};
	bool apply{};
	bool r_delete{};
	std::string action{};
	std::string Dollarlocation{};
	std::vector<std::string> path{};
	int32_t servicePeriodranking{};
	std::string idpUrl{};
	std::string idpCertAlias{};
	bool idpHttpRedirect{};
	std::string serviceProviderEntityId{};
	std::string assertionConsumerServiceURL{};
	std::string spPrivateKeyAlias{};
	std::string keyStorePassword{};
	std::string defaultRedirectUrl{};
	std::string userIDAttribute{};
	bool useEncryption{};
	bool createUser{};
	bool addGroupMemberships{};
	std::string groupMembershipAttribute{};
	std::vector<std::string> defaultGroups{};
	std::string nameIdFormat{};
	std::vector<std::string> synchronizeAttributes{};
	bool handleLogout{};
	std::string logoutUrl{};
	int32_t clockTolerance{};
	std::string digestMethod{};
	std::string signatureMethod{};
	std::string userIntermediatePath{};
	std::vector<std::string> propertylist{};
};


//
// The restbed service to actually implement the REST server
//
class  ConsoleApi: public restbed::Service
{
public:
	ConsoleApi();
	~ConsoleApi();
	void startService(int const& port);
	void stopService();
	
protected:
	std::shared_ptr<ConsoleApiSystemConsoleStatus-productinfo.jsonResource> m_spConsoleApiSystemConsoleStatus-productinfo.jsonResource;
	std::shared_ptr<ConsoleApiSystemConsoleBundles{name}.jsonResource> m_spConsoleApiSystemConsoleBundles{name}.jsonResource;
	std::shared_ptr<ConsoleApiSystemConsoleConfigMgrResource> m_spConsoleApiSystemConsoleConfigMgrResource;
	std::shared_ptr<ConsoleApiSystemConsoleBundlesNameResource> m_spConsoleApiSystemConsoleBundlesNameResource;
	std::shared_ptr<ConsoleApiSystemConsoleJmxCom.adobe.granite:type&#x3D;RepositoryOpActionResource> m_spConsoleApiSystemConsoleJmxCom.adobe.granite:type&#x3D;RepositoryOpActionResource;
	std::shared_ptr<ConsoleApiSystemConsoleConfigMgrCom.adobe.granite.auth.saml.SamlAuthenticationHandlerResource> m_spConsoleApiSystemConsoleConfigMgrCom.adobe.granite.auth.saml.SamlAuthenticationHandlerResource;
};


}
}
}
}

#endif /* ConsoleApi_H_ */


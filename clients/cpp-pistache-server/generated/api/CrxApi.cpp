/**
* Adobe Experience Manager (AEM) API
* Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
*
* The version of the OpenAPI document: 3.5.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

#include "CrxApi.h"
#include "Helpers.h"

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::helpers;
using namespace org::openapitools::server::model;

const std::string CrxApi::base = "";

CrxApi::CrxApi(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : router(rtr)
{
}

void CrxApi::init() {
    setupRoutes();
}

void CrxApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Get(*router, base + "/crx/server/crx.default/jcr:root/.1.json", Routes::bind(&CrxApi::get_crxde_status_handler, this));
    Routes::Get(*router, base + "/crx/packmgr/installstatus.jsp", Routes::bind(&CrxApi::get_install_status_handler, this));
    Routes::Get(*router, base + "/crx/packmgr/service/script.html", Routes::bind(&CrxApi::get_package_manager_servlet_handler, this));
    Routes::Post(*router, base + "/crx/packmgr/service.jsp", Routes::bind(&CrxApi::post_package_service_handler, this));
    Routes::Post(*router, base + "/crx/packmgr/service/.json/:path", Routes::bind(&CrxApi::post_package_service_json_handler, this));
    Routes::Post(*router, base + "/crx/packmgr/update.jsp", Routes::bind(&CrxApi::post_package_update_handler, this));
    Routes::Post(*router, base + "/crx/explorer/ui/setpassword.jsp", Routes::bind(&CrxApi::post_set_password_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&CrxApi::crx_api_default_handler, this));
}

std::pair<Pistache::Http::Code, std::string> CrxApi::handleParsingException(const std::exception& ex) const noexcept
{
    try {
        throw;
    } catch (nlohmann::detail::exception &e) {
        return std::make_pair(Pistache::Http::Code::Bad_Request, e.what());
    } catch (org::openapitools::server::helpers::ValidationException &e) {
        return std::make_pair(Pistache::Http::Code::Bad_Request, e.what());
    } catch (std::exception &e) {
        return std::make_pair(Pistache::Http::Code::Internal_Server_Error, e.what());
    }
}

std::pair<Pistache::Http::Code, std::string> CrxApi::handleOperationException(const std::exception& ex) const noexcept
{
    return std::make_pair(Pistache::Http::Code::Internal_Server_Error, ex.what());
}

void CrxApi::get_crxde_status_handler(const Pistache::Rest::Request &, Pistache::Http::ResponseWriter response) {
    try {


    try {
        this->get_crxde_status(response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleOperationException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void CrxApi::get_install_status_handler(const Pistache::Rest::Request &, Pistache::Http::ResponseWriter response) {
    try {


    try {
        this->get_install_status(response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleOperationException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void CrxApi::get_package_manager_servlet_handler(const Pistache::Rest::Request &, Pistache::Http::ResponseWriter response) {
    try {


    try {
        this->get_package_manager_servlet(response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleOperationException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void CrxApi::post_package_service_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {


    // Getting the query params
    auto cmdQuery = request.query().get("cmd");
    Pistache::Optional<std::string> cmd;
    if(!cmdQuery.isEmpty()){
        std::string valueQuery_instance;
        if(fromStringValue(cmdQuery.get(), valueQuery_instance)){
            cmd = Pistache::Some(valueQuery_instance);
        }
    }
    
    try {
        this->post_package_service(cmd, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleOperationException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void CrxApi::post_package_service_json_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    try {
      this->post_package_service_json(request, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleOperationException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void CrxApi::post_package_update_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {


    // Getting the query params
    auto groupNameQuery = request.query().get("groupName");
    Pistache::Optional<std::string> groupName;
    if(!groupNameQuery.isEmpty()){
        std::string valueQuery_instance;
        if(fromStringValue(groupNameQuery.get(), valueQuery_instance)){
            groupName = Pistache::Some(valueQuery_instance);
        }
    }
    auto packageNameQuery = request.query().get("packageName");
    Pistache::Optional<std::string> packageName;
    if(!packageNameQuery.isEmpty()){
        std::string valueQuery_instance;
        if(fromStringValue(packageNameQuery.get(), valueQuery_instance)){
            packageName = Pistache::Some(valueQuery_instance);
        }
    }
    auto versionQuery = request.query().get("version");
    Pistache::Optional<std::string> version;
    if(!versionQuery.isEmpty()){
        std::string valueQuery_instance;
        if(fromStringValue(versionQuery.get(), valueQuery_instance)){
            version = Pistache::Some(valueQuery_instance);
        }
    }
    auto pathQuery = request.query().get("path");
    Pistache::Optional<std::string> path;
    if(!pathQuery.isEmpty()){
        std::string valueQuery_instance;
        if(fromStringValue(pathQuery.get(), valueQuery_instance)){
            path = Pistache::Some(valueQuery_instance);
        }
    }
    auto filterQuery = request.query().get("filter");
    Pistache::Optional<std::string> filter;
    if(!filterQuery.isEmpty()){
        std::string valueQuery_instance;
        if(fromStringValue(filterQuery.get(), valueQuery_instance)){
            filter = Pistache::Some(valueQuery_instance);
        }
    }
    auto charsetQuery = request.query().get("_charset_");
    Pistache::Optional<std::string> charset;
    if(!charsetQuery.isEmpty()){
        std::string valueQuery_instance;
        if(fromStringValue(charsetQuery.get(), valueQuery_instance)){
            charset = Pistache::Some(valueQuery_instance);
        }
    }
    
    try {
        this->post_package_update(groupName, packageName, version, path, filter, charset, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleOperationException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void CrxApi::post_set_password_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {


    // Getting the query params
    auto oldQuery = request.query().get("old");
    Pistache::Optional<std::string> old;
    if(!oldQuery.isEmpty()){
        std::string valueQuery_instance;
        if(fromStringValue(oldQuery.get(), valueQuery_instance)){
            old = Pistache::Some(valueQuery_instance);
        }
    }
    auto plainQuery = request.query().get("plain");
    Pistache::Optional<std::string> plain;
    if(!plainQuery.isEmpty()){
        std::string valueQuery_instance;
        if(fromStringValue(plainQuery.get(), valueQuery_instance)){
            plain = Pistache::Some(valueQuery_instance);
        }
    }
    auto verifyQuery = request.query().get("verify");
    Pistache::Optional<std::string> verify;
    if(!verifyQuery.isEmpty()){
        std::string valueQuery_instance;
        if(fromStringValue(verifyQuery.get(), valueQuery_instance)){
            verify = Pistache::Some(valueQuery_instance);
        }
    }
    
    try {
        this->post_set_password(old, plain, verify, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        const std::pair<Pistache::Http::Code, std::string> errorInfo = this->handleOperationException(e);
        response.send(errorInfo.first, errorInfo.second);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}

void CrxApi::crx_api_default_handler(const Pistache::Rest::Request &, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
}

} // namespace org::openapitools::server::api


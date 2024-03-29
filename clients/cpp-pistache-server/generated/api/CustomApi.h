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
/*
 * CustomApi.h
 *
 * 
 */

#ifndef CustomApi_H_
#define CustomApi_H_


#include <pistache/http.h>
#include <pistache/router.h>
#include <pistache/http_headers.h>
#include <pistache/optional.h>
#include <nlohmann/json.hpp>
#include <utility>

#include <string>

namespace org::openapitools::server::api
{

class  CustomApi {
public:
    explicit CustomApi(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    virtual ~CustomApi() = default;
    void init();

    static const std::string base;

private:
    void setupRoutes();

    void get_aem_health_check_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void post_config_aem_health_check_servlet_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void post_config_aem_password_reset_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void custom_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);

    const std::shared_ptr<Pistache::Rest::Router> router;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during Parameter parsing and validation.
    /// May be overriden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleParsingException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during processing of the request in handler functions.
    /// May be overriden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleOperationException(const std::exception& ex) const noexcept;

    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="tags"> (optional, default to &quot;&quot;)</param>
    /// <param name="combineTagsOr"> (optional, default to false)</param>
    virtual void get_aem_health_check(const Pistache::Optional<std::string> &tags, const Pistache::Optional<bool> &combineTagsOr, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="bundlesPeriodignored"> (optional, default to std::vector&lt;std::shared_ptr&lt;std::string&gt;&gt;())</param>
    /// <param name="bundlesPeriodignoredAtTypeHint"> (optional, default to &quot;&quot;)</param>
    virtual void post_config_aem_health_check_servlet(const Pistache::Optional<std::vector<std::string>> &bundlesPeriodignored, const Pistache::Optional<std::string> &bundlesPeriodignoredAtTypeHint, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="pwdresetPeriodauthorizables"> (optional, default to std::vector&lt;std::shared_ptr&lt;std::string&gt;&gt;())</param>
    /// <param name="pwdresetPeriodauthorizablesAtTypeHint"> (optional, default to &quot;&quot;)</param>
    virtual void post_config_aem_password_reset(const Pistache::Optional<std::vector<std::string>> &pwdresetPeriodauthorizables, const Pistache::Optional<std::string> &pwdresetPeriodauthorizablesAtTypeHint, Pistache::Http::ResponseWriter &response) = 0;

};

} // namespace org::openapitools::server::api

#endif /* CustomApi_H_ */


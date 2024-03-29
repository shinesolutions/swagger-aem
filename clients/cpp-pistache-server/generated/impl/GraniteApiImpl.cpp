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

#include "GraniteApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {



GraniteApiImpl::GraniteApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : GraniteApi(rtr)
{
}

void GraniteApiImpl::ssl_setup(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter &response){
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}


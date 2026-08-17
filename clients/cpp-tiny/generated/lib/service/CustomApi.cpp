#include "CustomApi.h"

using namespace Tiny;



        Response<
            std::string
        >
        CustomApi::
        getAemHealthCheck(
            
            std::string tags
            , 
            
            bool combineTagsOr
            
        )
        {
            std::string url = basepath + "/system/health"; //


            // Headers  | 

            // Query    | tags combineTagsOr 
            addQueryParam("tags",tags);
            addQueryParam("combineTagsOr",combineTagsOr);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        CustomApi::
        postConfigAemHealthCheckServlet(
            std::list<std::string> bundlesPeriodignored
            
            , 
            
            std::string bundlesPeriodignoredAtTypeHint
            
        )
        {
            std::string url = basepath + "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck"; //


            // Headers  | 

            // Query    | bundlesPeriodignored bundlesPeriodignoredAtTypeHint 
            for (auto &x : bundlesPeriodignored){
                addQueryParam("bundles.ignored", std::string(x));
            }
            addQueryParam("bundles.ignored@TypeHint",bundlesPeriodignoredAtTypeHint);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        CustomApi::
        postConfigAemPasswordReset(
            std::list<std::string> pwdresetPeriodauthorizables
            
            , 
            
            std::string pwdresetPeriodauthorizablesAtTypeHint
            
        )
        {
            std::string url = basepath + "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator"; //


            // Headers  | 

            // Query    | pwdresetPeriodauthorizables pwdresetPeriodauthorizablesAtTypeHint 
            for (auto &x : pwdresetPeriodauthorizables){
                addQueryParam("pwdreset.authorizables", std::string(x));
            }
            addQueryParam("pwdreset.authorizables@TypeHint",pwdresetPeriodauthorizablesAtTypeHint);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }




#include "CqApi.h"

using namespace Tiny;



        Response<
            std::string
        >
        CqApi::
        getLoginPage(
        )
        {
            std::string url = basepath + "/libs/granite/core/content/login.html"; //


            // Headers  | 

            // Query    | 

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
        CqApi::
        postCqActions(
            
            std::string authorizableId
            , 
            
            std::string changelog
            
        )
        {
            std::string url = basepath + "/.cqactions.html"; //


            // Headers  | 

            // Query    | authorizableId changelog 
            addQueryParam("authorizableId",authorizableId);
            addQueryParam("changelog",changelog);

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




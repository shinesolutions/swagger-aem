#include "GraniteApi.h"

using namespace Tiny;



        Response<
            std::string
        >
        GraniteApi::
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
            
        )
        {
            std::string url = basepath + "/libs/granite/security/post/sslSetup.html"; //


            // Headers  | 

            // Query    | keystorePassword keystorePasswordConfirm truststorePassword truststorePasswordConfirm httpsHostname httpsPort 
            addQueryParam("keystorePassword",keystorePassword);
            addQueryParam("keystorePasswordConfirm",keystorePasswordConfirm);
            addQueryParam("truststorePassword",truststorePassword);
            addQueryParam("truststorePasswordConfirm",truststorePasswordConfirm);
            addQueryParam("httpsHostname",httpsHostname);
            addQueryParam("httpsPort",httpsPort);

            // Form     | privatekeyFile certificateFile 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("privatekeyFile",privatekeyFile);
            addFormParam("certificateFile",certificateFile);




            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }




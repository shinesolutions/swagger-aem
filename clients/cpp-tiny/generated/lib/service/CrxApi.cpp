#include "CrxApi.h"

using namespace Tiny;



        Response<
            std::string
        >
        CrxApi::
        getCrxdeStatus(
        )
        {
            std::string url = basepath + "/crx/server/crx.default/jcr:root/.1.json"; //


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
            InstallStatus
        >
        CrxApi::
        getInstallStatus(
        )
        {
            std::string url = basepath + "/crx/packmgr/installstatus.jsp"; //


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




            InstallStatus obj(output_string);


            Response<InstallStatus> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        CrxApi::
        getPackageManagerServlet(
        )
        {
            std::string url = basepath + "/crx/packmgr/service/script.html"; //


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


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            std::string
        >
        CrxApi::
        postPackageService(
            
            std::string cmd
            
        )
        {
            std::string url = basepath + "/crx/packmgr/service.jsp"; //


            // Headers  | 

            // Query    | cmd 
            addQueryParam("cmd",cmd);

            // Form     | 





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

        Response<
            std::string
        >
        CrxApi::
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
            
        )
        {
            std::string url = basepath + "/crx/packmgr/service/.json/{path}"; //path 


            // Headers  | 

            // Query    | cmd groupName packageName packageVersion charset force recursive 
            addQueryParam("cmd",cmd);
            addQueryParam("groupName",groupName);
            addQueryParam("packageName",packageName);
            addQueryParam("packageVersion",packageVersion);
            addQueryParam("_charset_",charset);
            addQueryParam("force",force);
            addQueryParam("recursive",recursive);

            // Form     | package 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("package",package);


                std::string s_path("{");
                s_path.append("path");
                s_path.append("}");

                int pos = url.find(s_path);

                url.erase(pos, s_path.length());
                url.insert(pos, stringify(path));


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

        Response<
            std::string
        >
        CrxApi::
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
            
        )
        {
            std::string url = basepath + "/crx/packmgr/update.jsp"; //


            // Headers  | 

            // Query    | groupName packageName version path filter charset 
            addQueryParam("groupName",groupName);
            addQueryParam("packageName",packageName);
            addQueryParam("version",version);
            addQueryParam("path",path);
            addQueryParam("filter",filter);
            addQueryParam("_charset_",charset);

            // Form     | 





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

        Response<
            std::string
        >
        CrxApi::
        postSetPassword(
            
            std::string old
            , 
            
            std::string plain
            , 
            
            std::string verify
            
        )
        {
            std::string url = basepath + "/crx/explorer/ui/setpassword.jsp"; //


            // Headers  | 

            // Query    | old plain verify 
            addQueryParam("old",old);
            addQueryParam("plain",plain);
            addQueryParam("verify",verify);

            // Form     | 





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




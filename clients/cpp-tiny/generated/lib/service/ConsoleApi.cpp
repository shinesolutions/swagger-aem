#include "ConsoleApi.h"

using namespace Tiny;



        Response<
            std::list<std::string>
        >
        ConsoleApi::
        getAemProductInfo(
        )
        {
            std::string url = basepath + "/system/console/status-productinfo.json"; //


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



            std::list<std::string> obj = std::list<std::string>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                std::string tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<std::string>> response(obj, httpCode);
            return response;
        }

        Response<
            BundleInfo
        >
        ConsoleApi::
        getBundleInfo(
            
            std::string name
            
        )
        {
            std::string url = basepath + "/system/console/bundles/{name}.json"; //name 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_name("{");
                s_name.append("name");
                s_name.append("}");

                int pos = url.find(s_name);

                url.erase(pos, s_name.length());
                url.insert(pos, stringify(name));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BundleInfo obj(output_string);


            Response<BundleInfo> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        ConsoleApi::
        getConfigMgr(
        )
        {
            std::string url = basepath + "/system/console/configMgr"; //


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
        ConsoleApi::
        postBundle(
            
            std::string name
            , 
            
            std::string action
            
        )
        {
            std::string url = basepath + "/system/console/bundles/{name}"; //name 


            // Headers  | 

            // Query    | action 
            addQueryParam("action",action);

            // Form     | 



                std::string s_name("{");
                s_name.append("name");
                s_name.append("}");

                int pos = url.find(s_name);

                url.erase(pos, s_name.length());
                url.insert(pos, stringify(name));


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
        ConsoleApi::
        postJmxRepository(
            
            std::string action
            
        )
        {
            std::string url = basepath + "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}"; //action 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_action("{");
                s_action.append("action");
                s_action.append("}");

                int pos = url.find(s_action);

                url.erase(pos, s_action.length());
                url.insert(pos, stringify(action));


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
            SamlConfigurationInfo
        >
        ConsoleApi::
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
            
            
        )
        {
            std::string url = basepath + "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler"; //


            // Headers  | 

            // Query    | post apply r_delete action Dollarlocation path servicePeriodranking idpUrl idpCertAlias idpHttpRedirect serviceProviderEntityId assertionConsumerServiceURL spPrivateKeyAlias keyStorePassword defaultRedirectUrl userIDAttribute useEncryption createUser addGroupMemberships groupMembershipAttribute defaultGroups nameIdFormat synchronizeAttributes handleLogout logoutUrl clockTolerance digestMethod signatureMethod userIntermediatePath propertylist 
            addQueryParam("post",post);
            addQueryParam("apply",apply);
            addQueryParam("delete",r_delete);
            addQueryParam("action",action);
            addQueryParam("$location",Dollarlocation);
            for (auto &x : path){
                addQueryParam("path", std::string(x));
            }
            addQueryParam("service.ranking",servicePeriodranking);
            addQueryParam("idpUrl",idpUrl);
            addQueryParam("idpCertAlias",idpCertAlias);
            addQueryParam("idpHttpRedirect",idpHttpRedirect);
            addQueryParam("serviceProviderEntityId",serviceProviderEntityId);
            addQueryParam("assertionConsumerServiceURL",assertionConsumerServiceURL);
            addQueryParam("spPrivateKeyAlias",spPrivateKeyAlias);
            addQueryParam("keyStorePassword",keyStorePassword);
            addQueryParam("defaultRedirectUrl",defaultRedirectUrl);
            addQueryParam("userIDAttribute",userIDAttribute);
            addQueryParam("useEncryption",useEncryption);
            addQueryParam("createUser",createUser);
            addQueryParam("addGroupMemberships",addGroupMemberships);
            addQueryParam("groupMembershipAttribute",groupMembershipAttribute);
            for (auto &x : defaultGroups){
                addQueryParam("defaultGroups", std::string(x));
            }
            addQueryParam("nameIdFormat",nameIdFormat);
            for (auto &x : synchronizeAttributes){
                addQueryParam("synchronizeAttributes", std::string(x));
            }
            addQueryParam("handleLogout",handleLogout);
            addQueryParam("logoutUrl",logoutUrl);
            addQueryParam("clockTolerance",clockTolerance);
            addQueryParam("digestMethod",digestMethod);
            addQueryParam("signatureMethod",signatureMethod);
            addQueryParam("userIntermediatePath",userIntermediatePath);
            for (auto &x : propertylist){
                addQueryParam("propertylist", std::string(x));
            }

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            SamlConfigurationInfo obj(output_string);


            Response<SamlConfigurationInfo> response(obj, httpCode);
            return response;
        }




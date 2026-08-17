#include "SlingApi.h"

using namespace Tiny;



        Response<
            String
        >
        SlingApi::
        deleteAgent(
            
            std::string runmode
            , 
            
            std::string name
            
        )
        {
            std::string url = basepath + "/etc/replication/agents.{runmode}/{name}"; //runmode name 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_runmode("{");
                s_runmode.append("runmode");
                s_runmode.append("}");

                int pos = url.find(s_runmode);

                url.erase(pos, s_runmode.length());
                url.insert(pos, stringify(runmode));
                std::string s_name("{");
                s_name.append("name");
                s_name.append("}");

                int pos = url.find(s_name);

                url.erase(pos, s_name.length());
                url.insert(pos, stringify(name));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        SlingApi::
        deleteNode(
            
            std::string path
            , 
            
            std::string name
            
        )
        {
            std::string url = basepath + "/{path}/{name}"; //path name 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_path("{");
                s_path.append("path");
                s_path.append("}");

                int pos = url.find(s_path);

                url.erase(pos, s_path.length());
                url.insert(pos, stringify(path));
                std::string s_name("{");
                s_name.append("name");
                s_name.append("}");

                int pos = url.find(s_name);

                url.erase(pos, s_name.length());
                url.insert(pos, stringify(name));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            String
        >
        SlingApi::
        getAgent(
            
            std::string runmode
            , 
            
            std::string name
            
        )
        {
            std::string url = basepath + "/etc/replication/agents.{runmode}/{name}"; //runmode name 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_runmode("{");
                s_runmode.append("runmode");
                s_runmode.append("}");

                int pos = url.find(s_runmode);

                url.erase(pos, s_runmode.length());
                url.insert(pos, stringify(runmode));
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


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            std::string
        >
        SlingApi::
        getAgents(
            
            std::string runmode
            
        )
        {
            std::string url = basepath + "/etc/replication/agents.{runmode}.-1.json"; //runmode 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_runmode("{");
                s_runmode.append("runmode");
                s_runmode.append("}");

                int pos = url.find(s_runmode);

                url.erase(pos, s_runmode.length());
                url.insert(pos, stringify(runmode));


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
            KeystoreInfo
        >
        SlingApi::
        getAuthorizableKeystore(
            
            std::string intermediatePath
            , 
            
            std::string authorizableId
            
        )
        {
            std::string url = basepath + "/{intermediatePath}/{authorizableId}.ks.json"; //intermediatePath authorizableId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_intermediatePath("{");
                s_intermediatePath.append("intermediatePath");
                s_intermediatePath.append("}");

                int pos = url.find(s_intermediatePath);

                url.erase(pos, s_intermediatePath.length());
                url.insert(pos, stringify(intermediatePath));
                std::string s_authorizableId("{");
                s_authorizableId.append("authorizableId");
                s_authorizableId.append("}");

                int pos = url.find(s_authorizableId);

                url.erase(pos, s_authorizableId.length());
                url.insert(pos, stringify(authorizableId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            KeystoreInfo obj(output_string);


            Response<KeystoreInfo> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        SlingApi::
        getKeystore(
            
            std::string intermediatePath
            , 
            
            std::string authorizableId
            
        )
        {
            std::string url = basepath + "/{intermediatePath}/{authorizableId}/keystore/store.p12"; //intermediatePath authorizableId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_intermediatePath("{");
                s_intermediatePath.append("intermediatePath");
                s_intermediatePath.append("}");

                int pos = url.find(s_intermediatePath);

                url.erase(pos, s_intermediatePath.length());
                url.insert(pos, stringify(intermediatePath));
                std::string s_authorizableId("{");
                s_authorizableId.append("authorizableId");
                s_authorizableId.append("}");

                int pos = url.find(s_authorizableId);

                url.erase(pos, s_authorizableId.length());
                url.insert(pos, stringify(authorizableId));


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
        SlingApi::
        getNode(
            
            std::string path
            , 
            
            std::string name
            
        )
        {
            std::string url = basepath + "/{path}/{name}"; //path name 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_path("{");
                s_path.append("path");
                s_path.append("}");

                int pos = url.find(s_path);

                url.erase(pos, s_path.length());
                url.insert(pos, stringify(path));
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


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            std::string
        >
        SlingApi::
        getPackage(
            
            std::string group
            , 
            
            std::string name
            , 
            
            std::string version
            
        )
        {
            std::string url = basepath + "/etc/packages/{group}/{name}-{version}.zip"; //group name version 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_group("{");
                s_group.append("group");
                s_group.append("}");

                int pos = url.find(s_group);

                url.erase(pos, s_group.length());
                url.insert(pos, stringify(group));
                std::string s_name("{");
                s_name.append("name");
                s_name.append("}");

                int pos = url.find(s_name);

                url.erase(pos, s_name.length());
                url.insert(pos, stringify(name));
                std::string s_version("{");
                s_version.append("version");
                s_version.append("}");

                int pos = url.find(s_version);

                url.erase(pos, s_version.length());
                url.insert(pos, stringify(version));


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
            std::string
        >
        SlingApi::
        getPackageFilter(
            
            std::string group
            , 
            
            std::string name
            , 
            
            std::string version
            
        )
        {
            std::string url = basepath + "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json"; //group name version 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_group("{");
                s_group.append("group");
                s_group.append("}");

                int pos = url.find(s_group);

                url.erase(pos, s_group.length());
                url.insert(pos, stringify(group));
                std::string s_name("{");
                s_name.append("name");
                s_name.append("}");

                int pos = url.find(s_name);

                url.erase(pos, s_name.length());
                url.insert(pos, stringify(name));
                std::string s_version("{");
                s_version.append("version");
                s_version.append("}");

                int pos = url.find(s_version);

                url.erase(pos, s_version.length());
                url.insert(pos, stringify(version));


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
            std::string
        >
        SlingApi::
        getQuery(
            
            std::string path
            , 
            
            long pPeriodlimit
            , 
            
            std::string r_1_property
            , 
            
            std::string r_1_property_value
            
        )
        {
            std::string url = basepath + "/bin/querybuilder.json"; //


            // Headers  | 

            // Query    | path pPeriodlimit r_1_property r_1_property_value 
            addQueryParam("path",path);
            addQueryParam("p.limit",pPeriodlimit);
            addQueryParam("1_property",r_1_property);
            addQueryParam("1_property.value",r_1_property_value);

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
            std::string
        >
        SlingApi::
        getTruststore(
        )
        {
            std::string url = basepath + "/etc/truststore/truststore.p12"; //


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
            TruststoreInfo
        >
        SlingApi::
        getTruststoreInfo(
        )
        {
            std::string url = basepath + "/libs/granite/security/truststore.json"; //


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




            TruststoreInfo obj(output_string);


            Response<TruststoreInfo> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        SlingApi::
        postAgent(
            
            std::string runmode
            , 
            
            std::string name
            , 
            
            bool jcrContentSlashcqDistribute
            , 
            
            std::string jcrContentSlashcqDistributeAtTypeHint
            , 
            
            std::string jcrContentSlashcqName
            , 
            
            std::string jcrContentSlashcqTemplate
            , 
            
            bool jcrContentSlashaliasUpdate
            , 
            
            bool jcrContentSlashenabled
            , 
            
            std::string jcrContentSlashjcrDescription
            , 
            
            std::string jcrContentSlashjcrLastModified
            , 
            
            std::string jcrContentSlashjcrLastModifiedBy
            , 
            
            std::string jcrContentSlashjcrMixinTypes
            , 
            
            std::string jcrContentSlashjcrTitle
            , 
            
            std::string jcrContentSlashlogLevel
            , 
            
            bool jcrContentSlashnoStatusUpdate
            , 
            
            bool jcrContentSlashnoVersioning
            , 
            
            long jcrContentSlashprotocolConnectTimeout
            , 
            
            bool jcrContentSlashprotocolHTTPConnectionClosed
            , 
            
            std::string jcrContentSlashprotocolHTTPExpired
            , 
            std::list<std::string> jcrContentSlashprotocolHTTPHeaders
            
            , 
            
            std::string jcrContentSlashprotocolHTTPHeadersAtTypeHint
            , 
            
            std::string jcrContentSlashprotocolHTTPMethod
            , 
            
            bool jcrContentSlashprotocolHTTPSRelaxed
            , 
            
            std::string jcrContentSlashprotocolInterface
            , 
            
            long jcrContentSlashprotocolSocketTimeout
            , 
            
            std::string jcrContentSlashprotocolVersion
            , 
            
            std::string jcrContentSlashproxyNTLMDomain
            , 
            
            std::string jcrContentSlashproxyNTLMHost
            , 
            
            std::string jcrContentSlashproxyHost
            , 
            
            std::string jcrContentSlashproxyPassword
            , 
            
            long jcrContentSlashproxyPort
            , 
            
            std::string jcrContentSlashproxyUser
            , 
            
            long jcrContentSlashqueueBatchMaxSize
            , 
            
            std::string jcrContentSlashqueueBatchMode
            , 
            
            long jcrContentSlashqueueBatchWaitTime
            , 
            
            std::string jcrContentSlashretryDelay
            , 
            
            bool jcrContentSlashreverseReplication
            , 
            
            std::string jcrContentSlashserializationType
            , 
            
            std::string jcrContentSlashslingResourceType
            , 
            
            std::string jcrContentSlashssl
            , 
            
            std::string jcrContentSlashtransportNTLMDomain
            , 
            
            std::string jcrContentSlashtransportNTLMHost
            , 
            
            std::string jcrContentSlashtransportPassword
            , 
            
            std::string jcrContentSlashtransportUri
            , 
            
            std::string jcrContentSlashtransportUser
            , 
            
            bool jcrContentSlashtriggerDistribute
            , 
            
            bool jcrContentSlashtriggerModified
            , 
            
            bool jcrContentSlashtriggerOnOffTime
            , 
            
            bool jcrContentSlashtriggerReceive
            , 
            
            bool jcrContentSlashtriggerSpecific
            , 
            
            std::string jcrContentSlashuserId
            , 
            
            std::string jcrPrimaryType
            , 
            
            std::string operation
            
        )
        {
            std::string url = basepath + "/etc/replication/agents.{runmode}/{name}"; //runmode name 


            // Headers  | 

            // Query    | jcrContentSlashcqDistribute jcrContentSlashcqDistributeAtTypeHint jcrContentSlashcqName jcrContentSlashcqTemplate jcrContentSlashaliasUpdate jcrContentSlashenabled jcrContentSlashjcrDescription jcrContentSlashjcrLastModified jcrContentSlashjcrLastModifiedBy jcrContentSlashjcrMixinTypes jcrContentSlashjcrTitle jcrContentSlashlogLevel jcrContentSlashnoStatusUpdate jcrContentSlashnoVersioning jcrContentSlashprotocolConnectTimeout jcrContentSlashprotocolHTTPConnectionClosed jcrContentSlashprotocolHTTPExpired jcrContentSlashprotocolHTTPHeaders jcrContentSlashprotocolHTTPHeadersAtTypeHint jcrContentSlashprotocolHTTPMethod jcrContentSlashprotocolHTTPSRelaxed jcrContentSlashprotocolInterface jcrContentSlashprotocolSocketTimeout jcrContentSlashprotocolVersion jcrContentSlashproxyNTLMDomain jcrContentSlashproxyNTLMHost jcrContentSlashproxyHost jcrContentSlashproxyPassword jcrContentSlashproxyPort jcrContentSlashproxyUser jcrContentSlashqueueBatchMaxSize jcrContentSlashqueueBatchMode jcrContentSlashqueueBatchWaitTime jcrContentSlashretryDelay jcrContentSlashreverseReplication jcrContentSlashserializationType jcrContentSlashslingResourceType jcrContentSlashssl jcrContentSlashtransportNTLMDomain jcrContentSlashtransportNTLMHost jcrContentSlashtransportPassword jcrContentSlashtransportUri jcrContentSlashtransportUser jcrContentSlashtriggerDistribute jcrContentSlashtriggerModified jcrContentSlashtriggerOnOffTime jcrContentSlashtriggerReceive jcrContentSlashtriggerSpecific jcrContentSlashuserId jcrPrimaryType operation 
            addQueryParam("jcr:content/cq:distribute",jcrContentSlashcqDistribute);
            addQueryParam("jcr:content/cq:distribute@TypeHint",jcrContentSlashcqDistributeAtTypeHint);
            addQueryParam("jcr:content/cq:name",jcrContentSlashcqName);
            addQueryParam("jcr:content/cq:template",jcrContentSlashcqTemplate);
            addQueryParam("jcr:content/aliasUpdate",jcrContentSlashaliasUpdate);
            addQueryParam("jcr:content/enabled",jcrContentSlashenabled);
            addQueryParam("jcr:content/jcr:description",jcrContentSlashjcrDescription);
            addQueryParam("jcr:content/jcr:lastModified",jcrContentSlashjcrLastModified);
            addQueryParam("jcr:content/jcr:lastModifiedBy",jcrContentSlashjcrLastModifiedBy);
            addQueryParam("jcr:content/jcr:mixinTypes",jcrContentSlashjcrMixinTypes);
            addQueryParam("jcr:content/jcr:title",jcrContentSlashjcrTitle);
            addQueryParam("jcr:content/logLevel",jcrContentSlashlogLevel);
            addQueryParam("jcr:content/noStatusUpdate",jcrContentSlashnoStatusUpdate);
            addQueryParam("jcr:content/noVersioning",jcrContentSlashnoVersioning);
            addQueryParam("jcr:content/protocolConnectTimeout",jcrContentSlashprotocolConnectTimeout);
            addQueryParam("jcr:content/protocolHTTPConnectionClosed",jcrContentSlashprotocolHTTPConnectionClosed);
            addQueryParam("jcr:content/protocolHTTPExpired",jcrContentSlashprotocolHTTPExpired);
            for (auto &x : jcrContentSlashprotocolHTTPHeaders){
                addQueryParam("jcr:content/protocolHTTPHeaders", std::string(x));
            }
            addQueryParam("jcr:content/protocolHTTPHeaders@TypeHint",jcrContentSlashprotocolHTTPHeadersAtTypeHint);
            addQueryParam("jcr:content/protocolHTTPMethod",jcrContentSlashprotocolHTTPMethod);
            addQueryParam("jcr:content/protocolHTTPSRelaxed",jcrContentSlashprotocolHTTPSRelaxed);
            addQueryParam("jcr:content/protocolInterface",jcrContentSlashprotocolInterface);
            addQueryParam("jcr:content/protocolSocketTimeout",jcrContentSlashprotocolSocketTimeout);
            addQueryParam("jcr:content/protocolVersion",jcrContentSlashprotocolVersion);
            addQueryParam("jcr:content/proxyNTLMDomain",jcrContentSlashproxyNTLMDomain);
            addQueryParam("jcr:content/proxyNTLMHost",jcrContentSlashproxyNTLMHost);
            addQueryParam("jcr:content/proxyHost",jcrContentSlashproxyHost);
            addQueryParam("jcr:content/proxyPassword",jcrContentSlashproxyPassword);
            addQueryParam("jcr:content/proxyPort",jcrContentSlashproxyPort);
            addQueryParam("jcr:content/proxyUser",jcrContentSlashproxyUser);
            addQueryParam("jcr:content/queueBatchMaxSize",jcrContentSlashqueueBatchMaxSize);
            addQueryParam("jcr:content/queueBatchMode",jcrContentSlashqueueBatchMode);
            addQueryParam("jcr:content/queueBatchWaitTime",jcrContentSlashqueueBatchWaitTime);
            addQueryParam("jcr:content/retryDelay",jcrContentSlashretryDelay);
            addQueryParam("jcr:content/reverseReplication",jcrContentSlashreverseReplication);
            addQueryParam("jcr:content/serializationType",jcrContentSlashserializationType);
            addQueryParam("jcr:content/sling:resourceType",jcrContentSlashslingResourceType);
            addQueryParam("jcr:content/ssl",jcrContentSlashssl);
            addQueryParam("jcr:content/transportNTLMDomain",jcrContentSlashtransportNTLMDomain);
            addQueryParam("jcr:content/transportNTLMHost",jcrContentSlashtransportNTLMHost);
            addQueryParam("jcr:content/transportPassword",jcrContentSlashtransportPassword);
            addQueryParam("jcr:content/transportUri",jcrContentSlashtransportUri);
            addQueryParam("jcr:content/transportUser",jcrContentSlashtransportUser);
            addQueryParam("jcr:content/triggerDistribute",jcrContentSlashtriggerDistribute);
            addQueryParam("jcr:content/triggerModified",jcrContentSlashtriggerModified);
            addQueryParam("jcr:content/triggerOnOffTime",jcrContentSlashtriggerOnOffTime);
            addQueryParam("jcr:content/triggerReceive",jcrContentSlashtriggerReceive);
            addQueryParam("jcr:content/triggerSpecific",jcrContentSlashtriggerSpecific);
            addQueryParam("jcr:content/userId",jcrContentSlashuserId);
            addQueryParam("jcr:primaryType",jcrPrimaryType);
            addQueryParam(":operation",operation);

            // Form     | 



                std::string s_runmode("{");
                s_runmode.append("runmode");
                s_runmode.append("}");

                int pos = url.find(s_runmode);

                url.erase(pos, s_runmode.length());
                url.insert(pos, stringify(runmode));
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
            KeystoreInfo
        >
        SlingApi::
        postAuthorizableKeystore(
            
            std::string intermediatePath
            , 
            
            std::string authorizableId
            , 
            
            std::string operation
            , 
            
            std::string currentPassword
            , 
            
            std::string newPassword
            , 
            
            std::string rePassword
            , 
            
            std::string keyPassword
            , 
            
            std::string keyStorePass
            , 
            
            std::string alias
            , 
            
            std::string newAlias
            , 
            
            std::string removeAlias
            , 
            
            std::string certChain
            , 
            
            std::string pk
            , 
            
            std::string keyStore
            
        )
        {
            std::string url = basepath + "/{intermediatePath}/{authorizableId}.ks.html"; //intermediatePath authorizableId 


            // Headers  | 

            // Query    | operation currentPassword newPassword rePassword keyPassword keyStorePass alias newAlias removeAlias 
            addQueryParam(":operation",operation);
            addQueryParam("currentPassword",currentPassword);
            addQueryParam("newPassword",newPassword);
            addQueryParam("rePassword",rePassword);
            addQueryParam("keyPassword",keyPassword);
            addQueryParam("keyStorePass",keyStorePass);
            addQueryParam("alias",alias);
            addQueryParam("newAlias",newAlias);
            addQueryParam("removeAlias",removeAlias);

            // Form     | certChain pk keyStore 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("cert-chain",certChain);
            addFormParam("pk",pk);
            addFormParam("keyStore",keyStore);


                std::string s_intermediatePath("{");
                s_intermediatePath.append("intermediatePath");
                s_intermediatePath.append("}");

                int pos = url.find(s_intermediatePath);

                url.erase(pos, s_intermediatePath.length());
                url.insert(pos, stringify(intermediatePath));
                std::string s_authorizableId("{");
                s_authorizableId.append("authorizableId");
                s_authorizableId.append("}");

                int pos = url.find(s_authorizableId);

                url.erase(pos, s_authorizableId.length());
                url.insert(pos, stringify(authorizableId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            KeystoreInfo obj(output_string);


            Response<KeystoreInfo> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        SlingApi::
        postAuthorizables(
            
            std::string authorizableId
            , 
            
            std::string intermediatePath
            , 
            
            std::string createUser
            , 
            
            std::string createGroup
            , 
            
            std::string repPassword
            , 
            
            std::string profileSlashgivenName
            
        )
        {
            std::string url = basepath + "/libs/granite/security/post/authorizables"; //


            // Headers  | 

            // Query    | authorizableId intermediatePath createUser createGroup repPassword profileSlashgivenName 
            addQueryParam("authorizableId",authorizableId);
            addQueryParam("intermediatePath",intermediatePath);
            addQueryParam("createUser",createUser);
            addQueryParam("createGroup",createGroup);
            addQueryParam("rep:password",repPassword);
            addQueryParam("profile/givenName",profileSlashgivenName);

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
            String
        >
        SlingApi::
        postConfigAdobeGraniteSamlAuthenticationHandler(
            
            std::string keyStorePassword
            , 
            
            std::string keyStorePasswordAtTypeHint
            , 
            
            int servicePeriodranking
            , 
            
            std::string servicePeriodrankingAtTypeHint
            , 
            
            bool idpHttpRedirect
            , 
            
            std::string idpHttpRedirectAtTypeHint
            , 
            
            bool createUser
            , 
            
            std::string createUserAtTypeHint
            , 
            
            std::string defaultRedirectUrl
            , 
            
            std::string defaultRedirectUrlAtTypeHint
            , 
            
            std::string userIDAttribute
            , 
            
            std::string userIDAttributeAtTypeHint
            , 
            std::list<std::string> defaultGroups
            
            , 
            
            std::string defaultGroupsAtTypeHint
            , 
            
            std::string idpCertAlias
            , 
            
            std::string idpCertAliasAtTypeHint
            , 
            
            bool addGroupMemberships
            , 
            
            std::string addGroupMembershipsAtTypeHint
            , 
            std::list<std::string> path
            
            , 
            
            std::string pathAtTypeHint
            , 
            std::list<std::string> synchronizeAttributes
            
            , 
            
            std::string synchronizeAttributesAtTypeHint
            , 
            
            int clockTolerance
            , 
            
            std::string clockToleranceAtTypeHint
            , 
            
            std::string groupMembershipAttribute
            , 
            
            std::string groupMembershipAttributeAtTypeHint
            , 
            
            std::string idpUrl
            , 
            
            std::string idpUrlAtTypeHint
            , 
            
            std::string logoutUrl
            , 
            
            std::string logoutUrlAtTypeHint
            , 
            
            std::string serviceProviderEntityId
            , 
            
            std::string serviceProviderEntityIdAtTypeHint
            , 
            
            std::string assertionConsumerServiceURL
            , 
            
            std::string assertionConsumerServiceURLAtTypeHint
            , 
            
            bool handleLogout
            , 
            
            std::string handleLogoutAtTypeHint
            , 
            
            std::string spPrivateKeyAlias
            , 
            
            std::string spPrivateKeyAliasAtTypeHint
            , 
            
            bool useEncryption
            , 
            
            std::string useEncryptionAtTypeHint
            , 
            
            std::string nameIdFormat
            , 
            
            std::string nameIdFormatAtTypeHint
            , 
            
            std::string digestMethod
            , 
            
            std::string digestMethodAtTypeHint
            , 
            
            std::string signatureMethod
            , 
            
            std::string signatureMethodAtTypeHint
            , 
            
            std::string userIntermediatePath
            , 
            
            std::string userIntermediatePathAtTypeHint
            
        )
        {
            std::string url = basepath + "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config"; //


            // Headers  | 

            // Query    | keyStorePassword keyStorePasswordAtTypeHint servicePeriodranking servicePeriodrankingAtTypeHint idpHttpRedirect idpHttpRedirectAtTypeHint createUser createUserAtTypeHint defaultRedirectUrl defaultRedirectUrlAtTypeHint userIDAttribute userIDAttributeAtTypeHint defaultGroups defaultGroupsAtTypeHint idpCertAlias idpCertAliasAtTypeHint addGroupMemberships addGroupMembershipsAtTypeHint path pathAtTypeHint synchronizeAttributes synchronizeAttributesAtTypeHint clockTolerance clockToleranceAtTypeHint groupMembershipAttribute groupMembershipAttributeAtTypeHint idpUrl idpUrlAtTypeHint logoutUrl logoutUrlAtTypeHint serviceProviderEntityId serviceProviderEntityIdAtTypeHint assertionConsumerServiceURL assertionConsumerServiceURLAtTypeHint handleLogout handleLogoutAtTypeHint spPrivateKeyAlias spPrivateKeyAliasAtTypeHint useEncryption useEncryptionAtTypeHint nameIdFormat nameIdFormatAtTypeHint digestMethod digestMethodAtTypeHint signatureMethod signatureMethodAtTypeHint userIntermediatePath userIntermediatePathAtTypeHint 
            addQueryParam("keyStorePassword",keyStorePassword);
            addQueryParam("keyStorePassword@TypeHint",keyStorePasswordAtTypeHint);
            addQueryParam("service.ranking",servicePeriodranking);
            addQueryParam("service.ranking@TypeHint",servicePeriodrankingAtTypeHint);
            addQueryParam("idpHttpRedirect",idpHttpRedirect);
            addQueryParam("idpHttpRedirect@TypeHint",idpHttpRedirectAtTypeHint);
            addQueryParam("createUser",createUser);
            addQueryParam("createUser@TypeHint",createUserAtTypeHint);
            addQueryParam("defaultRedirectUrl",defaultRedirectUrl);
            addQueryParam("defaultRedirectUrl@TypeHint",defaultRedirectUrlAtTypeHint);
            addQueryParam("userIDAttribute",userIDAttribute);
            addQueryParam("userIDAttribute@TypeHint",userIDAttributeAtTypeHint);
            for (auto &x : defaultGroups){
                addQueryParam("defaultGroups", std::string(x));
            }
            addQueryParam("defaultGroups@TypeHint",defaultGroupsAtTypeHint);
            addQueryParam("idpCertAlias",idpCertAlias);
            addQueryParam("idpCertAlias@TypeHint",idpCertAliasAtTypeHint);
            addQueryParam("addGroupMemberships",addGroupMemberships);
            addQueryParam("addGroupMemberships@TypeHint",addGroupMembershipsAtTypeHint);
            for (auto &x : path){
                addQueryParam("path", std::string(x));
            }
            addQueryParam("path@TypeHint",pathAtTypeHint);
            for (auto &x : synchronizeAttributes){
                addQueryParam("synchronizeAttributes", std::string(x));
            }
            addQueryParam("synchronizeAttributes@TypeHint",synchronizeAttributesAtTypeHint);
            addQueryParam("clockTolerance",clockTolerance);
            addQueryParam("clockTolerance@TypeHint",clockToleranceAtTypeHint);
            addQueryParam("groupMembershipAttribute",groupMembershipAttribute);
            addQueryParam("groupMembershipAttribute@TypeHint",groupMembershipAttributeAtTypeHint);
            addQueryParam("idpUrl",idpUrl);
            addQueryParam("idpUrl@TypeHint",idpUrlAtTypeHint);
            addQueryParam("logoutUrl",logoutUrl);
            addQueryParam("logoutUrl@TypeHint",logoutUrlAtTypeHint);
            addQueryParam("serviceProviderEntityId",serviceProviderEntityId);
            addQueryParam("serviceProviderEntityId@TypeHint",serviceProviderEntityIdAtTypeHint);
            addQueryParam("assertionConsumerServiceURL",assertionConsumerServiceURL);
            addQueryParam("assertionConsumerServiceURL@TypeHint",assertionConsumerServiceURLAtTypeHint);
            addQueryParam("handleLogout",handleLogout);
            addQueryParam("handleLogout@TypeHint",handleLogoutAtTypeHint);
            addQueryParam("spPrivateKeyAlias",spPrivateKeyAlias);
            addQueryParam("spPrivateKeyAlias@TypeHint",spPrivateKeyAliasAtTypeHint);
            addQueryParam("useEncryption",useEncryption);
            addQueryParam("useEncryption@TypeHint",useEncryptionAtTypeHint);
            addQueryParam("nameIdFormat",nameIdFormat);
            addQueryParam("nameIdFormat@TypeHint",nameIdFormatAtTypeHint);
            addQueryParam("digestMethod",digestMethod);
            addQueryParam("digestMethod@TypeHint",digestMethodAtTypeHint);
            addQueryParam("signatureMethod",signatureMethod);
            addQueryParam("signatureMethod@TypeHint",signatureMethodAtTypeHint);
            addQueryParam("userIntermediatePath",userIntermediatePath);
            addQueryParam("userIntermediatePath@TypeHint",userIntermediatePathAtTypeHint);

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
        SlingApi::
        postConfigApacheFelixJettyBasedHttpService(
            
            bool orgPeriodapachePeriodfelixPeriodhttpsPeriodnio
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint
            , 
            
            bool orgPeriodapachePeriodfelixPeriodhttpsPeriodenable
            , 
            
            std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint
            , 
            
            std::string orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure
            , 
            
            std::string orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint
            
        )
        {
            std::string url = basepath + "/apps/system/config/org.apache.felix.http"; //


            // Headers  | 

            // Query    | orgPeriodapachePeriodfelixPeriodhttpsPeriodnio orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint orgPeriodapachePeriodfelixPeriodhttpsPeriodenable orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint 
            addQueryParam("org.apache.felix.https.nio",orgPeriodapachePeriodfelixPeriodhttpsPeriodnio);
            addQueryParam("org.apache.felix.https.nio@TypeHint",orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint);
            addQueryParam("org.apache.felix.https.keystore",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore);
            addQueryParam("org.apache.felix.https.keystore@TypeHint",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint);
            addQueryParam("org.apache.felix.https.keystore.password",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword);
            addQueryParam("org.apache.felix.https.keystore.password@TypeHint",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint);
            addQueryParam("org.apache.felix.https.keystore.key",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey);
            addQueryParam("org.apache.felix.https.keystore.key@TypeHint",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint);
            addQueryParam("org.apache.felix.https.keystore.key.password",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword);
            addQueryParam("org.apache.felix.https.keystore.key.password@TypeHint",orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint);
            addQueryParam("org.apache.felix.https.truststore",orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore);
            addQueryParam("org.apache.felix.https.truststore@TypeHint",orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint);
            addQueryParam("org.apache.felix.https.truststore.password",orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword);
            addQueryParam("org.apache.felix.https.truststore.password@TypeHint",orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint);
            addQueryParam("org.apache.felix.https.clientcertificate",orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate);
            addQueryParam("org.apache.felix.https.clientcertificate@TypeHint",orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint);
            addQueryParam("org.apache.felix.https.enable",orgPeriodapachePeriodfelixPeriodhttpsPeriodenable);
            addQueryParam("org.apache.felix.https.enable@TypeHint",orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint);
            addQueryParam("org.osgi.service.http.port.secure",orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure);
            addQueryParam("org.osgi.service.http.port.secure@TypeHint",orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint);

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
        SlingApi::
        postConfigApacheHttpComponentsProxyConfiguration(
            
            std::string proxyPeriodhost
            , 
            
            std::string proxyPeriodhostAtTypeHint
            , 
            
            int proxyPeriodport
            , 
            
            std::string proxyPeriodportAtTypeHint
            , 
            std::list<std::string> proxyPeriodexceptions
            
            , 
            
            std::string proxyPeriodexceptionsAtTypeHint
            , 
            
            bool proxyPeriodenabled
            , 
            
            std::string proxyPeriodenabledAtTypeHint
            , 
            
            std::string proxyPerioduser
            , 
            
            std::string proxyPerioduserAtTypeHint
            , 
            
            std::string proxyPeriodpassword
            , 
            
            std::string proxyPeriodpasswordAtTypeHint
            
        )
        {
            std::string url = basepath + "/apps/system/config/org.apache.http.proxyconfigurator.config"; //


            // Headers  | 

            // Query    | proxyPeriodhost proxyPeriodhostAtTypeHint proxyPeriodport proxyPeriodportAtTypeHint proxyPeriodexceptions proxyPeriodexceptionsAtTypeHint proxyPeriodenabled proxyPeriodenabledAtTypeHint proxyPerioduser proxyPerioduserAtTypeHint proxyPeriodpassword proxyPeriodpasswordAtTypeHint 
            addQueryParam("proxy.host",proxyPeriodhost);
            addQueryParam("proxy.host@TypeHint",proxyPeriodhostAtTypeHint);
            addQueryParam("proxy.port",proxyPeriodport);
            addQueryParam("proxy.port@TypeHint",proxyPeriodportAtTypeHint);
            for (auto &x : proxyPeriodexceptions){
                addQueryParam("proxy.exceptions", std::string(x));
            }
            addQueryParam("proxy.exceptions@TypeHint",proxyPeriodexceptionsAtTypeHint);
            addQueryParam("proxy.enabled",proxyPeriodenabled);
            addQueryParam("proxy.enabled@TypeHint",proxyPeriodenabledAtTypeHint);
            addQueryParam("proxy.user",proxyPerioduser);
            addQueryParam("proxy.user@TypeHint",proxyPerioduserAtTypeHint);
            addQueryParam("proxy.password",proxyPeriodpassword);
            addQueryParam("proxy.password@TypeHint",proxyPeriodpasswordAtTypeHint);

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
        SlingApi::
        postConfigApacheSlingDavExServlet(
            
            std::string alias
            , 
            
            std::string aliasAtTypeHint
            , 
            
            bool davPeriodcreateAbsoluteUri
            , 
            
            std::string davPeriodcreateAbsoluteUriAtTypeHint
            
        )
        {
            std::string url = basepath + "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet"; //


            // Headers  | 

            // Query    | alias aliasAtTypeHint davPeriodcreateAbsoluteUri davPeriodcreateAbsoluteUriAtTypeHint 
            addQueryParam("alias",alias);
            addQueryParam("alias@TypeHint",aliasAtTypeHint);
            addQueryParam("dav.create-absolute-uri",davPeriodcreateAbsoluteUri);
            addQueryParam("dav.create-absolute-uri@TypeHint",davPeriodcreateAbsoluteUriAtTypeHint);

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
        SlingApi::
        postConfigApacheSlingGetServlet(
            
            std::string jsonPeriodmaximumresults
            , 
            
            std::string jsonPeriodmaximumresultsAtTypeHint
            , 
            
            bool enablePeriodhtml
            , 
            
            std::string enablePeriodhtmlAtTypeHint
            , 
            
            bool enablePeriodtxt
            , 
            
            std::string enablePeriodtxtAtTypeHint
            , 
            
            bool enablePeriodxml
            , 
            
            std::string enablePeriodxmlAtTypeHint
            
        )
        {
            std::string url = basepath + "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet"; //


            // Headers  | 

            // Query    | jsonPeriodmaximumresults jsonPeriodmaximumresultsAtTypeHint enablePeriodhtml enablePeriodhtmlAtTypeHint enablePeriodtxt enablePeriodtxtAtTypeHint enablePeriodxml enablePeriodxmlAtTypeHint 
            addQueryParam("json.maximumresults",jsonPeriodmaximumresults);
            addQueryParam("json.maximumresults@TypeHint",jsonPeriodmaximumresultsAtTypeHint);
            addQueryParam("enable.html",enablePeriodhtml);
            addQueryParam("enable.html@TypeHint",enablePeriodhtmlAtTypeHint);
            addQueryParam("enable.txt",enablePeriodtxt);
            addQueryParam("enable.txt@TypeHint",enablePeriodtxtAtTypeHint);
            addQueryParam("enable.xml",enablePeriodxml);
            addQueryParam("enable.xml@TypeHint",enablePeriodxmlAtTypeHint);

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
        SlingApi::
        postConfigApacheSlingReferrerFilter(
            
            bool allowPeriodempty
            , 
            
            std::string allowPeriodemptyAtTypeHint
            , 
            
            std::string allowPeriodhosts
            , 
            
            std::string allowPeriodhostsAtTypeHint
            , 
            
            std::string allowPeriodhostsPeriodregexp
            , 
            
            std::string allowPeriodhostsPeriodregexpAtTypeHint
            , 
            
            std::string filterPeriodmethods
            , 
            
            std::string filterPeriodmethodsAtTypeHint
            
        )
        {
            std::string url = basepath + "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter"; //


            // Headers  | 

            // Query    | allowPeriodempty allowPeriodemptyAtTypeHint allowPeriodhosts allowPeriodhostsAtTypeHint allowPeriodhostsPeriodregexp allowPeriodhostsPeriodregexpAtTypeHint filterPeriodmethods filterPeriodmethodsAtTypeHint 
            addQueryParam("allow.empty",allowPeriodempty);
            addQueryParam("allow.empty@TypeHint",allowPeriodemptyAtTypeHint);
            addQueryParam("allow.hosts",allowPeriodhosts);
            addQueryParam("allow.hosts@TypeHint",allowPeriodhostsAtTypeHint);
            addQueryParam("allow.hosts.regexp",allowPeriodhostsPeriodregexp);
            addQueryParam("allow.hosts.regexp@TypeHint",allowPeriodhostsPeriodregexpAtTypeHint);
            addQueryParam("filter.methods",filterPeriodmethods);
            addQueryParam("filter.methods@TypeHint",filterPeriodmethodsAtTypeHint);

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
        SlingApi::
        postConfigProperty(
            
            std::string configNodeName
            
        )
        {
            std::string url = basepath + "/apps/system/config/{configNodeName}"; //configNodeName 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_configNodeName("{");
                s_configNodeName.append("configNodeName");
                s_configNodeName.append("}");

                int pos = url.find(s_configNodeName);

                url.erase(pos, s_configNodeName.length());
                url.insert(pos, stringify(configNodeName));


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
        SlingApi::
        postNode(
            
            std::string path
            , 
            
            std::string name
            , 
            
            std::string operation
            , 
            
            std::string deleteAuthorizable
            , 
            
            std::string file
            
        )
        {
            std::string url = basepath + "/{path}/{name}"; //path name 


            // Headers  | 

            // Query    | operation deleteAuthorizable 
            addQueryParam(":operation",operation);
            addQueryParam("deleteAuthorizable",deleteAuthorizable);

            // Form     | file 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("file",file);


                std::string s_path("{");
                s_path.append("path");
                s_path.append("}");

                int pos = url.find(s_path);

                url.erase(pos, s_path.length());
                url.insert(pos, stringify(path));
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
        SlingApi::
        postNodeRw(
            
            std::string path
            , 
            
            std::string name
            , 
            
            std::string addMembers
            
        )
        {
            std::string url = basepath + "/{path}/{name}.rw.html"; //path name 


            // Headers  | 

            // Query    | addMembers 
            addQueryParam("addMembers",addMembers);

            // Form     | 



                std::string s_path("{");
                s_path.append("path");
                s_path.append("}");

                int pos = url.find(s_path);

                url.erase(pos, s_path.length());
                url.insert(pos, stringify(path));
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
        SlingApi::
        postPath(
            
            std::string path
            , 
            
            std::string jcrPrimaryType
            , 
            
            std::string name
            
        )
        {
            std::string url = basepath + "/{path}/"; //path 


            // Headers  | 

            // Query    | jcrPrimaryType name 
            addQueryParam("jcr:primaryType",jcrPrimaryType);
            addQueryParam(":name",name);

            // Form     | 



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


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            std::string
        >
        SlingApi::
        postQuery(
            
            std::string path
            , 
            
            long pPeriodlimit
            , 
            
            std::string r_1_property
            , 
            
            std::string r_1_property_value
            
        )
        {
            std::string url = basepath + "/bin/querybuilder.json"; //


            // Headers  | 

            // Query    | path pPeriodlimit r_1_property r_1_property_value 
            addQueryParam("path",path);
            addQueryParam("p.limit",pPeriodlimit);
            addQueryParam("1_property",r_1_property);
            addQueryParam("1_property.value",r_1_property_value);

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
            String
        >
        SlingApi::
        postTreeActivation(
            
            bool ignoredeactivated
            , 
            
            bool onlymodified
            , 
            
            std::string path
            , 
            
            std::string cmd
            
        )
        {
            std::string url = basepath + "/libs/replication/treeactivation.html"; //


            // Headers  | 

            // Query    | ignoredeactivated onlymodified path cmd 
            addQueryParam("ignoredeactivated",ignoredeactivated);
            addQueryParam("onlymodified",onlymodified);
            addQueryParam("path",path);
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


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            std::string
        >
        SlingApi::
        postTruststore(
            
            std::string operation
            , 
            
            std::string newPassword
            , 
            
            std::string rePassword
            , 
            
            std::string keyStoreType
            , 
            
            std::string removeAlias
            , 
            
            std::string certificate
            
        )
        {
            std::string url = basepath + "/libs/granite/security/post/truststore"; //


            // Headers  | 

            // Query    | operation newPassword rePassword keyStoreType removeAlias 
            addQueryParam(":operation",operation);
            addQueryParam("newPassword",newPassword);
            addQueryParam("rePassword",rePassword);
            addQueryParam("keyStoreType",keyStoreType);
            addQueryParam("removeAlias",removeAlias);

            // Form     | certificate 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("certificate",certificate);




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
        SlingApi::
        postTruststorePKCS12(
            
            std::string truststorePeriodp12
            
        )
        {
            std::string url = basepath + "/etc/truststore"; //


            // Headers  | 

            // Query    | 

            // Form     | truststorePeriodp12 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("truststore.p12",truststorePeriodp12);




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




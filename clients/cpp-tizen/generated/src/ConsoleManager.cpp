#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "ConsoleManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


ConsoleManager::ConsoleManager()
{

}

ConsoleManager::~ConsoleManager()
{

}

static gboolean __ConsoleManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __ConsoleManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__ConsoleManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool getAemProductInfoProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<std::string>, Error, void* )
	= reinterpret_cast<void(*)(std::list<std::string>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<std::string> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			std::string singlemodel;
			singlemodel.fromJson(singlenodestr);
			out.push_front(singlemodel);
			g_free(static_cast<gpointer>(singlenodestr));
			json_node_free(myJson);
		}
		json_array_unref (jsonarray);
		json_node_free(pJson);


	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getAemProductInfoHelper(char * accessToken,
	
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/system/console/status-productinfo.json");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(ConsoleManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAemProductInfoProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (ConsoleManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAemProductInfoProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ConsoleManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ConsoleManager::getAemProductInfoAsync(char * accessToken,
	
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData)
{
	return getAemProductInfoHelper(accessToken,
	
	handler, userData, true);
}

bool ConsoleManager::getAemProductInfoSync(char * accessToken,
	
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData)
{
	return getAemProductInfoHelper(accessToken,
	
	handler, userData, false);
}

static bool getBundleInfoProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(BundleInfo, Error, void* )
	= reinterpret_cast<void(*)(BundleInfo, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	BundleInfo out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("BundleInfo")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "BundleInfo", "BundleInfo");
			json_node_free(pJson);

			if ("BundleInfo" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getBundleInfoHelper(char * accessToken,
	std::string name, 
	void(* handler)(BundleInfo, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/system/console/bundles/{name}.json");
	int pos;

	string s_name("{");
	s_name.append("name");
	s_name.append("}");
	pos = url.find(s_name);
	url.erase(pos, s_name.length());
	url.insert(pos, stringify(&name, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(ConsoleManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getBundleInfoProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (ConsoleManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getBundleInfoProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ConsoleManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ConsoleManager::getBundleInfoAsync(char * accessToken,
	std::string name, 
	void(* handler)(BundleInfo, Error, void* )
	, void* userData)
{
	return getBundleInfoHelper(accessToken,
	name, 
	handler, userData, true);
}

bool ConsoleManager::getBundleInfoSync(char * accessToken,
	std::string name, 
	void(* handler)(BundleInfo, Error, void* )
	, void* userData)
{
	return getBundleInfoHelper(accessToken,
	name, 
	handler, userData, false);
}

static bool getConfigMgrProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::string, Error, void* )
	= reinterpret_cast<void(*)(std::string, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	std::string out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("std::string")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "std::string", "std::string");
			json_node_free(pJson);

			if ("std::string" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getConfigMgrHelper(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/system/console/configMgr");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(ConsoleManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getConfigMgrProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (ConsoleManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getConfigMgrProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ConsoleManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ConsoleManager::getConfigMgrAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getConfigMgrHelper(accessToken,
	
	handler, userData, true);
}

bool ConsoleManager::getConfigMgrSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getConfigMgrHelper(accessToken,
	
	handler, userData, false);
}

static bool postBundleProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool postBundleHelper(char * accessToken,
	std::string name, std::string action, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&action, "std::string");
	queryParams.insert(pair<string, string>("action", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/system/console/bundles/{name}");
	int pos;

	string s_name("{");
	s_name.append("name");
	s_name.append("}");
	pos = url.find(s_name);
	url.erase(pos, s_name.length());
	url.insert(pos, stringify(&name, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(ConsoleManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postBundleProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (ConsoleManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postBundleProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ConsoleManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ConsoleManager::postBundleAsync(char * accessToken,
	std::string name, std::string action, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postBundleHelper(accessToken,
	name, action, 
	handler, userData, true);
}

bool ConsoleManager::postBundleSync(char * accessToken,
	std::string name, std::string action, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postBundleHelper(accessToken,
	name, action, 
	handler, userData, false);
}

static bool postJmxRepositoryProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool postJmxRepositoryHelper(char * accessToken,
	std::string action, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/system/console/jmx/com.adobe.granite:type=Repository/op/{action}");
	int pos;

	string s_action("{");
	s_action.append("action");
	s_action.append("}");
	pos = url.find(s_action);
	url.erase(pos, s_action.length());
	url.insert(pos, stringify(&action, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(ConsoleManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postJmxRepositoryProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (ConsoleManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postJmxRepositoryProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ConsoleManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ConsoleManager::postJmxRepositoryAsync(char * accessToken,
	std::string action, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postJmxRepositoryHelper(accessToken,
	action, 
	handler, userData, true);
}

bool ConsoleManager::postJmxRepositorySync(char * accessToken,
	std::string action, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postJmxRepositoryHelper(accessToken,
	action, 
	handler, userData, false);
}

static bool postSamlConfigurationProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SamlConfigurationInfo, Error, void* )
	= reinterpret_cast<void(*)(SamlConfigurationInfo, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SamlConfigurationInfo out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SamlConfigurationInfo")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SamlConfigurationInfo", "SamlConfigurationInfo");
			json_node_free(pJson);

			if ("SamlConfigurationInfo" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool postSamlConfigurationHelper(char * accessToken,
	bool post, bool apply, bool r_delete, std::string action, std::string Dollarlocation, std::list<std::string> path, int servicePeriodranking, std::string idpUrl, std::string idpCertAlias, bool idpHttpRedirect, std::string serviceProviderEntityId, std::string assertionConsumerServiceURL, std::string spPrivateKeyAlias, std::string keyStorePassword, std::string defaultRedirectUrl, std::string userIDAttribute, bool useEncryption, bool createUser, bool addGroupMemberships, std::string groupMembershipAttribute, std::list<std::string> defaultGroups, std::string nameIdFormat, std::list<std::string> synchronizeAttributes, bool handleLogout, std::string logoutUrl, int clockTolerance, std::string digestMethod, std::string signatureMethod, std::string userIntermediatePath, std::list<std::string> propertylist, 
	void(* handler)(SamlConfigurationInfo, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&post, "bool");
	queryParams.insert(pair<string, string>("post", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("post");
	}


	itemAtq = stringify(&apply, "bool");
	queryParams.insert(pair<string, string>("apply", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("apply");
	}


	itemAtq = stringify(&r_delete, "bool");
	queryParams.insert(pair<string, string>("delete", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("delete");
	}


	itemAtq = stringify(&action, "std::string");
	queryParams.insert(pair<string, string>("action", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("action");
	}


	itemAtq = stringify(&Dollarlocation, "std::string");
	queryParams.insert(pair<string, string>("$location", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("$location");
	}

	for (std::list
	<std::string>::iterator queryIter = path.begin(); queryIter != path.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("path", itemAt));
	}
	

	itemAtq = stringify(&servicePeriodranking, "int");
	queryParams.insert(pair<string, string>("service.ranking", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("service.ranking");
	}


	itemAtq = stringify(&idpUrl, "std::string");
	queryParams.insert(pair<string, string>("idpUrl", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("idpUrl");
	}


	itemAtq = stringify(&idpCertAlias, "std::string");
	queryParams.insert(pair<string, string>("idpCertAlias", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("idpCertAlias");
	}


	itemAtq = stringify(&idpHttpRedirect, "bool");
	queryParams.insert(pair<string, string>("idpHttpRedirect", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("idpHttpRedirect");
	}


	itemAtq = stringify(&serviceProviderEntityId, "std::string");
	queryParams.insert(pair<string, string>("serviceProviderEntityId", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("serviceProviderEntityId");
	}


	itemAtq = stringify(&assertionConsumerServiceURL, "std::string");
	queryParams.insert(pair<string, string>("assertionConsumerServiceURL", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("assertionConsumerServiceURL");
	}


	itemAtq = stringify(&spPrivateKeyAlias, "std::string");
	queryParams.insert(pair<string, string>("spPrivateKeyAlias", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("spPrivateKeyAlias");
	}


	itemAtq = stringify(&keyStorePassword, "std::string");
	queryParams.insert(pair<string, string>("keyStorePassword", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("keyStorePassword");
	}


	itemAtq = stringify(&defaultRedirectUrl, "std::string");
	queryParams.insert(pair<string, string>("defaultRedirectUrl", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("defaultRedirectUrl");
	}


	itemAtq = stringify(&userIDAttribute, "std::string");
	queryParams.insert(pair<string, string>("userIDAttribute", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("userIDAttribute");
	}


	itemAtq = stringify(&useEncryption, "bool");
	queryParams.insert(pair<string, string>("useEncryption", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("useEncryption");
	}


	itemAtq = stringify(&createUser, "bool");
	queryParams.insert(pair<string, string>("createUser", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("createUser");
	}


	itemAtq = stringify(&addGroupMemberships, "bool");
	queryParams.insert(pair<string, string>("addGroupMemberships", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("addGroupMemberships");
	}


	itemAtq = stringify(&groupMembershipAttribute, "std::string");
	queryParams.insert(pair<string, string>("groupMembershipAttribute", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("groupMembershipAttribute");
	}

	for (std::list
	<std::string>::iterator queryIter = defaultGroups.begin(); queryIter != defaultGroups.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("defaultGroups", itemAt));
	}
	

	itemAtq = stringify(&nameIdFormat, "std::string");
	queryParams.insert(pair<string, string>("nameIdFormat", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("nameIdFormat");
	}

	for (std::list
	<std::string>::iterator queryIter = synchronizeAttributes.begin(); queryIter != synchronizeAttributes.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("synchronizeAttributes", itemAt));
	}
	

	itemAtq = stringify(&handleLogout, "bool");
	queryParams.insert(pair<string, string>("handleLogout", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("handleLogout");
	}


	itemAtq = stringify(&logoutUrl, "std::string");
	queryParams.insert(pair<string, string>("logoutUrl", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("logoutUrl");
	}


	itemAtq = stringify(&clockTolerance, "int");
	queryParams.insert(pair<string, string>("clockTolerance", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("clockTolerance");
	}


	itemAtq = stringify(&digestMethod, "std::string");
	queryParams.insert(pair<string, string>("digestMethod", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("digestMethod");
	}


	itemAtq = stringify(&signatureMethod, "std::string");
	queryParams.insert(pair<string, string>("signatureMethod", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("signatureMethod");
	}


	itemAtq = stringify(&userIntermediatePath, "std::string");
	queryParams.insert(pair<string, string>("userIntermediatePath", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("userIntermediatePath");
	}

	for (std::list
	<std::string>::iterator queryIter = propertylist.begin(); queryIter != propertylist.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("propertylist", itemAt));
	}
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(ConsoleManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postSamlConfigurationProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (ConsoleManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postSamlConfigurationProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ConsoleManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ConsoleManager::postSamlConfigurationAsync(char * accessToken,
	bool post, bool apply, bool r_delete, std::string action, std::string Dollarlocation, std::list<std::string> path, int servicePeriodranking, std::string idpUrl, std::string idpCertAlias, bool idpHttpRedirect, std::string serviceProviderEntityId, std::string assertionConsumerServiceURL, std::string spPrivateKeyAlias, std::string keyStorePassword, std::string defaultRedirectUrl, std::string userIDAttribute, bool useEncryption, bool createUser, bool addGroupMemberships, std::string groupMembershipAttribute, std::list<std::string> defaultGroups, std::string nameIdFormat, std::list<std::string> synchronizeAttributes, bool handleLogout, std::string logoutUrl, int clockTolerance, std::string digestMethod, std::string signatureMethod, std::string userIntermediatePath, std::list<std::string> propertylist, 
	void(* handler)(SamlConfigurationInfo, Error, void* )
	, void* userData)
{
	return postSamlConfigurationHelper(accessToken,
	post, apply, r_delete, action, Dollarlocation, path, servicePeriodranking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist, 
	handler, userData, true);
}

bool ConsoleManager::postSamlConfigurationSync(char * accessToken,
	bool post, bool apply, bool r_delete, std::string action, std::string Dollarlocation, std::list<std::string> path, int servicePeriodranking, std::string idpUrl, std::string idpCertAlias, bool idpHttpRedirect, std::string serviceProviderEntityId, std::string assertionConsumerServiceURL, std::string spPrivateKeyAlias, std::string keyStorePassword, std::string defaultRedirectUrl, std::string userIDAttribute, bool useEncryption, bool createUser, bool addGroupMemberships, std::string groupMembershipAttribute, std::list<std::string> defaultGroups, std::string nameIdFormat, std::list<std::string> synchronizeAttributes, bool handleLogout, std::string logoutUrl, int clockTolerance, std::string digestMethod, std::string signatureMethod, std::string userIntermediatePath, std::list<std::string> propertylist, 
	void(* handler)(SamlConfigurationInfo, Error, void* )
	, void* userData)
{
	return postSamlConfigurationHelper(accessToken,
	post, apply, r_delete, action, Dollarlocation, path, servicePeriodranking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist, 
	handler, userData, false);
}


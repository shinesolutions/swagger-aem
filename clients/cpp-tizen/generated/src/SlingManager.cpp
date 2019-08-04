#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "SlingManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


SlingManager::SlingManager()
{

}

SlingManager::~SlingManager()
{

}

static gboolean __SlingManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __SlingManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__SlingManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool deleteAgentProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool deleteAgentHelper(char * accessToken,
	std::string runmode, std::string name, 
	
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

	string url("/etc/replication/agents.{runmode}/{name}");
	int pos;

	string s_runmode("{");
	s_runmode.append("runmode");
	s_runmode.append("}");
	pos = url.find(s_runmode);
	url.erase(pos, s_runmode.length());
	url.insert(pos, stringify(&runmode, "std::string"));
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
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteAgentProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteAgentProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::deleteAgentAsync(char * accessToken,
	std::string runmode, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deleteAgentHelper(accessToken,
	runmode, name, 
	handler, userData, true);
}

bool SlingManager::deleteAgentSync(char * accessToken,
	std::string runmode, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deleteAgentHelper(accessToken,
	runmode, name, 
	handler, userData, false);
}

static bool deleteNodeProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool deleteNodeHelper(char * accessToken,
	std::string path, std::string name, 
	
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

	string url("/{path}/{name}");
	int pos;

	string s_path("{");
	s_path.append("path");
	s_path.append("}");
	pos = url.find(s_path);
	url.erase(pos, s_path.length());
	url.insert(pos, stringify(&path, "std::string"));
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
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteNodeProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteNodeProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::deleteNodeAsync(char * accessToken,
	std::string path, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deleteNodeHelper(accessToken,
	path, name, 
	handler, userData, true);
}

bool SlingManager::deleteNodeSync(char * accessToken,
	std::string path, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deleteNodeHelper(accessToken,
	path, name, 
	handler, userData, false);
}

static bool getAgentProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getAgentHelper(char * accessToken,
	std::string runmode, std::string name, 
	
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

	string url("/etc/replication/agents.{runmode}/{name}");
	int pos;

	string s_runmode("{");
	s_runmode.append("runmode");
	s_runmode.append("}");
	pos = url.find(s_runmode);
	url.erase(pos, s_runmode.length());
	url.insert(pos, stringify(&runmode, "std::string"));
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAgentProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAgentProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::getAgentAsync(char * accessToken,
	std::string runmode, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return getAgentHelper(accessToken,
	runmode, name, 
	handler, userData, true);
}

bool SlingManager::getAgentSync(char * accessToken,
	std::string runmode, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return getAgentHelper(accessToken,
	runmode, name, 
	handler, userData, false);
}

static bool getAgentsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getAgentsHelper(char * accessToken,
	std::string runmode, 
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

	string url("/etc/replication/agents.{runmode}.-1.json");
	int pos;

	string s_runmode("{");
	s_runmode.append("runmode");
	s_runmode.append("}");
	pos = url.find(s_runmode);
	url.erase(pos, s_runmode.length());
	url.insert(pos, stringify(&runmode, "std::string"));

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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAgentsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAgentsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::getAgentsAsync(char * accessToken,
	std::string runmode, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getAgentsHelper(accessToken,
	runmode, 
	handler, userData, true);
}

bool SlingManager::getAgentsSync(char * accessToken,
	std::string runmode, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getAgentsHelper(accessToken,
	runmode, 
	handler, userData, false);
}

static bool getAuthorizableKeystoreProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(KeystoreInfo, Error, void* )
	= reinterpret_cast<void(*)(KeystoreInfo, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	KeystoreInfo out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("KeystoreInfo")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "KeystoreInfo", "KeystoreInfo");
			json_node_free(pJson);

			if ("KeystoreInfo" == "std::string") {
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

static bool getAuthorizableKeystoreHelper(char * accessToken,
	std::string intermediatePath, std::string authorizableId, 
	void(* handler)(KeystoreInfo, Error, void* )
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

	string url("/{intermediatePath}/{authorizableId}.ks.json");
	int pos;

	string s_intermediatePath("{");
	s_intermediatePath.append("intermediatePath");
	s_intermediatePath.append("}");
	pos = url.find(s_intermediatePath);
	url.erase(pos, s_intermediatePath.length());
	url.insert(pos, stringify(&intermediatePath, "std::string"));
	string s_authorizableId("{");
	s_authorizableId.append("authorizableId");
	s_authorizableId.append("}");
	pos = url.find(s_authorizableId);
	url.erase(pos, s_authorizableId.length());
	url.insert(pos, stringify(&authorizableId, "std::string"));

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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAuthorizableKeystoreProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAuthorizableKeystoreProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::getAuthorizableKeystoreAsync(char * accessToken,
	std::string intermediatePath, std::string authorizableId, 
	void(* handler)(KeystoreInfo, Error, void* )
	, void* userData)
{
	return getAuthorizableKeystoreHelper(accessToken,
	intermediatePath, authorizableId, 
	handler, userData, true);
}

bool SlingManager::getAuthorizableKeystoreSync(char * accessToken,
	std::string intermediatePath, std::string authorizableId, 
	void(* handler)(KeystoreInfo, Error, void* )
	, void* userData)
{
	return getAuthorizableKeystoreHelper(accessToken,
	intermediatePath, authorizableId, 
	handler, userData, false);
}

static bool getKeystoreProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getKeystoreHelper(char * accessToken,
	std::string intermediatePath, std::string authorizableId, 
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

	string url("/{intermediatePath}/{authorizableId}/keystore/store.p12");
	int pos;

	string s_intermediatePath("{");
	s_intermediatePath.append("intermediatePath");
	s_intermediatePath.append("}");
	pos = url.find(s_intermediatePath);
	url.erase(pos, s_intermediatePath.length());
	url.insert(pos, stringify(&intermediatePath, "std::string"));
	string s_authorizableId("{");
	s_authorizableId.append("authorizableId");
	s_authorizableId.append("}");
	pos = url.find(s_authorizableId);
	url.erase(pos, s_authorizableId.length());
	url.insert(pos, stringify(&authorizableId, "std::string"));

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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getKeystoreProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getKeystoreProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::getKeystoreAsync(char * accessToken,
	std::string intermediatePath, std::string authorizableId, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getKeystoreHelper(accessToken,
	intermediatePath, authorizableId, 
	handler, userData, true);
}

bool SlingManager::getKeystoreSync(char * accessToken,
	std::string intermediatePath, std::string authorizableId, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getKeystoreHelper(accessToken,
	intermediatePath, authorizableId, 
	handler, userData, false);
}

static bool getNodeProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getNodeHelper(char * accessToken,
	std::string path, std::string name, 
	
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

	string url("/{path}/{name}");
	int pos;

	string s_path("{");
	s_path.append("path");
	s_path.append("}");
	pos = url.find(s_path);
	url.erase(pos, s_path.length());
	url.insert(pos, stringify(&path, "std::string"));
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getNodeProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getNodeProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::getNodeAsync(char * accessToken,
	std::string path, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return getNodeHelper(accessToken,
	path, name, 
	handler, userData, true);
}

bool SlingManager::getNodeSync(char * accessToken,
	std::string path, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return getNodeHelper(accessToken,
	path, name, 
	handler, userData, false);
}

static bool getPackageProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getPackageHelper(char * accessToken,
	std::string group, std::string name, std::string version, 
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

	string url("/etc/packages/{group}/{name}-{version}.zip");
	int pos;

	string s_group("{");
	s_group.append("group");
	s_group.append("}");
	pos = url.find(s_group);
	url.erase(pos, s_group.length());
	url.insert(pos, stringify(&group, "std::string"));
	string s_name("{");
	s_name.append("name");
	s_name.append("}");
	pos = url.find(s_name);
	url.erase(pos, s_name.length());
	url.insert(pos, stringify(&name, "std::string"));
	string s_version("{");
	s_version.append("version");
	s_version.append("}");
	pos = url.find(s_version);
	url.erase(pos, s_version.length());
	url.insert(pos, stringify(&version, "std::string"));

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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getPackageProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getPackageProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::getPackageAsync(char * accessToken,
	std::string group, std::string name, std::string version, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getPackageHelper(accessToken,
	group, name, version, 
	handler, userData, true);
}

bool SlingManager::getPackageSync(char * accessToken,
	std::string group, std::string name, std::string version, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getPackageHelper(accessToken,
	group, name, version, 
	handler, userData, false);
}

static bool getPackageFilterProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getPackageFilterHelper(char * accessToken,
	std::string group, std::string name, std::string version, 
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

	string url("/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json");
	int pos;

	string s_group("{");
	s_group.append("group");
	s_group.append("}");
	pos = url.find(s_group);
	url.erase(pos, s_group.length());
	url.insert(pos, stringify(&group, "std::string"));
	string s_name("{");
	s_name.append("name");
	s_name.append("}");
	pos = url.find(s_name);
	url.erase(pos, s_name.length());
	url.insert(pos, stringify(&name, "std::string"));
	string s_version("{");
	s_version.append("version");
	s_version.append("}");
	pos = url.find(s_version);
	url.erase(pos, s_version.length());
	url.insert(pos, stringify(&version, "std::string"));

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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getPackageFilterProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getPackageFilterProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::getPackageFilterAsync(char * accessToken,
	std::string group, std::string name, std::string version, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getPackageFilterHelper(accessToken,
	group, name, version, 
	handler, userData, true);
}

bool SlingManager::getPackageFilterSync(char * accessToken,
	std::string group, std::string name, std::string version, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getPackageFilterHelper(accessToken,
	group, name, version, 
	handler, userData, false);
}

static bool getQueryProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getQueryHelper(char * accessToken,
	std::string path, long long pPeriodlimit, std::string _1_property, std::string _1_property_value, 
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
	

	itemAtq = stringify(&path, "std::string");
	queryParams.insert(pair<string, string>("path", itemAtq));


	itemAtq = stringify(&pPeriodlimit, "long long");
	queryParams.insert(pair<string, string>("p.limit", itemAtq));


	itemAtq = stringify(&_1_property, "std::string");
	queryParams.insert(pair<string, string>("1_property", itemAtq));


	itemAtq = stringify(&_1_property_value, "std::string");
	queryParams.insert(pair<string, string>("1_property.value", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/bin/querybuilder.json");
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getQueryProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getQueryProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::getQueryAsync(char * accessToken,
	std::string path, long long pPeriodlimit, std::string _1_property, std::string _1_property_value, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getQueryHelper(accessToken,
	path, pPeriodlimit, _1_property, _1_property_value, 
	handler, userData, true);
}

bool SlingManager::getQuerySync(char * accessToken,
	std::string path, long long pPeriodlimit, std::string _1_property, std::string _1_property_value, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getQueryHelper(accessToken,
	path, pPeriodlimit, _1_property, _1_property_value, 
	handler, userData, false);
}

static bool getTruststoreProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getTruststoreHelper(char * accessToken,
	
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

	string url("/etc/truststore/truststore.p12");
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getTruststoreProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getTruststoreProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::getTruststoreAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getTruststoreHelper(accessToken,
	
	handler, userData, true);
}

bool SlingManager::getTruststoreSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getTruststoreHelper(accessToken,
	
	handler, userData, false);
}

static bool getTruststoreInfoProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(TruststoreInfo, Error, void* )
	= reinterpret_cast<void(*)(TruststoreInfo, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	TruststoreInfo out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("TruststoreInfo")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "TruststoreInfo", "TruststoreInfo");
			json_node_free(pJson);

			if ("TruststoreInfo" == "std::string") {
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

static bool getTruststoreInfoHelper(char * accessToken,
	
	void(* handler)(TruststoreInfo, Error, void* )
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

	string url("/libs/granite/security/truststore.json");
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getTruststoreInfoProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getTruststoreInfoProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::getTruststoreInfoAsync(char * accessToken,
	
	void(* handler)(TruststoreInfo, Error, void* )
	, void* userData)
{
	return getTruststoreInfoHelper(accessToken,
	
	handler, userData, true);
}

bool SlingManager::getTruststoreInfoSync(char * accessToken,
	
	void(* handler)(TruststoreInfo, Error, void* )
	, void* userData)
{
	return getTruststoreInfoHelper(accessToken,
	
	handler, userData, false);
}

static bool postAgentProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postAgentHelper(char * accessToken,
	std::string runmode, std::string name, bool jcrContentSlashcqDistribute, std::string jcrContentSlashcqDistributeAtTypeHint, std::string jcrContentSlashcqName, std::string jcrContentSlashcqTemplate, bool jcrContentSlashenabled, std::string jcrContentSlashjcrDescription, std::string jcrContentSlashjcrLastModified, std::string jcrContentSlashjcrLastModifiedBy, std::string jcrContentSlashjcrMixinTypes, std::string jcrContentSlashjcrTitle, std::string jcrContentSlashlogLevel, bool jcrContentSlashnoStatusUpdate, bool jcrContentSlashnoVersioning, long long jcrContentSlashprotocolConnectTimeout, bool jcrContentSlashprotocolHTTPConnectionClosed, std::string jcrContentSlashprotocolHTTPExpired, std::list<std::string> jcrContentSlashprotocolHTTPHeaders, std::string jcrContentSlashprotocolHTTPHeadersAtTypeHint, std::string jcrContentSlashprotocolHTTPMethod, bool jcrContentSlashprotocolHTTPSRelaxed, std::string jcrContentSlashprotocolInterface, long long jcrContentSlashprotocolSocketTimeout, std::string jcrContentSlashprotocolVersion, std::string jcrContentSlashproxyNTLMDomain, std::string jcrContentSlashproxyNTLMHost, std::string jcrContentSlashproxyHost, std::string jcrContentSlashproxyPassword, long long jcrContentSlashproxyPort, std::string jcrContentSlashproxyUser, long long jcrContentSlashqueueBatchMaxSize, std::string jcrContentSlashqueueBatchMode, long long jcrContentSlashqueueBatchWaitTime, std::string jcrContentSlashretryDelay, bool jcrContentSlashreverseReplication, std::string jcrContentSlashserializationType, std::string jcrContentSlashslingResourceType, std::string jcrContentSlashssl, std::string jcrContentSlashtransportNTLMDomain, std::string jcrContentSlashtransportNTLMHost, std::string jcrContentSlashtransportPassword, std::string jcrContentSlashtransportUri, std::string jcrContentSlashtransportUser, bool jcrContentSlashtriggerDistribute, bool jcrContentSlashtriggerModified, bool jcrContentSlashtriggerOnOffTime, bool jcrContentSlashtriggerReceive, bool jcrContentSlashtriggerSpecific, std::string jcrContentSlashuserId, std::string jcrPrimaryType, std::string operation, 
	
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
	

	itemAtq = stringify(&jcrContentSlashcqDistribute, "bool");
	queryParams.insert(pair<string, string>("jcr:content/cq:distribute", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/cq:distribute");
	}


	itemAtq = stringify(&jcrContentSlashcqDistributeAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/cq:distribute@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/cq:distribute@TypeHint");
	}


	itemAtq = stringify(&jcrContentSlashcqName, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/cq:name", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/cq:name");
	}


	itemAtq = stringify(&jcrContentSlashcqTemplate, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/cq:template", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/cq:template");
	}


	itemAtq = stringify(&jcrContentSlashenabled, "bool");
	queryParams.insert(pair<string, string>("jcr:content/enabled", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/enabled");
	}


	itemAtq = stringify(&jcrContentSlashjcrDescription, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/jcr:description", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/jcr:description");
	}


	itemAtq = stringify(&jcrContentSlashjcrLastModified, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/jcr:lastModified", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/jcr:lastModified");
	}


	itemAtq = stringify(&jcrContentSlashjcrLastModifiedBy, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/jcr:lastModifiedBy", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/jcr:lastModifiedBy");
	}


	itemAtq = stringify(&jcrContentSlashjcrMixinTypes, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/jcr:mixinTypes", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/jcr:mixinTypes");
	}


	itemAtq = stringify(&jcrContentSlashjcrTitle, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/jcr:title", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/jcr:title");
	}


	itemAtq = stringify(&jcrContentSlashlogLevel, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/logLevel", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/logLevel");
	}


	itemAtq = stringify(&jcrContentSlashnoStatusUpdate, "bool");
	queryParams.insert(pair<string, string>("jcr:content/noStatusUpdate", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/noStatusUpdate");
	}


	itemAtq = stringify(&jcrContentSlashnoVersioning, "bool");
	queryParams.insert(pair<string, string>("jcr:content/noVersioning", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/noVersioning");
	}


	itemAtq = stringify(&jcrContentSlashprotocolConnectTimeout, "long long");
	queryParams.insert(pair<string, string>("jcr:content/protocolConnectTimeout", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/protocolConnectTimeout");
	}


	itemAtq = stringify(&jcrContentSlashprotocolHTTPConnectionClosed, "bool");
	queryParams.insert(pair<string, string>("jcr:content/protocolHTTPConnectionClosed", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/protocolHTTPConnectionClosed");
	}


	itemAtq = stringify(&jcrContentSlashprotocolHTTPExpired, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/protocolHTTPExpired", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/protocolHTTPExpired");
	}

	for (std::list
	<std::string>::iterator queryIter = jcrContentSlashprotocolHTTPHeaders.begin(); queryIter != jcrContentSlashprotocolHTTPHeaders.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("jcrContentSlashprotocolHTTPHeaders", itemAt));
	}
	

	itemAtq = stringify(&jcrContentSlashprotocolHTTPHeadersAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/protocolHTTPHeaders@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/protocolHTTPHeaders@TypeHint");
	}


	itemAtq = stringify(&jcrContentSlashprotocolHTTPMethod, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/protocolHTTPMethod", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/protocolHTTPMethod");
	}


	itemAtq = stringify(&jcrContentSlashprotocolHTTPSRelaxed, "bool");
	queryParams.insert(pair<string, string>("jcr:content/protocolHTTPSRelaxed", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/protocolHTTPSRelaxed");
	}


	itemAtq = stringify(&jcrContentSlashprotocolInterface, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/protocolInterface", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/protocolInterface");
	}


	itemAtq = stringify(&jcrContentSlashprotocolSocketTimeout, "long long");
	queryParams.insert(pair<string, string>("jcr:content/protocolSocketTimeout", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/protocolSocketTimeout");
	}


	itemAtq = stringify(&jcrContentSlashprotocolVersion, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/protocolVersion", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/protocolVersion");
	}


	itemAtq = stringify(&jcrContentSlashproxyNTLMDomain, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/proxyNTLMDomain", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/proxyNTLMDomain");
	}


	itemAtq = stringify(&jcrContentSlashproxyNTLMHost, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/proxyNTLMHost", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/proxyNTLMHost");
	}


	itemAtq = stringify(&jcrContentSlashproxyHost, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/proxyHost", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/proxyHost");
	}


	itemAtq = stringify(&jcrContentSlashproxyPassword, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/proxyPassword", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/proxyPassword");
	}


	itemAtq = stringify(&jcrContentSlashproxyPort, "long long");
	queryParams.insert(pair<string, string>("jcr:content/proxyPort", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/proxyPort");
	}


	itemAtq = stringify(&jcrContentSlashproxyUser, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/proxyUser", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/proxyUser");
	}


	itemAtq = stringify(&jcrContentSlashqueueBatchMaxSize, "long long");
	queryParams.insert(pair<string, string>("jcr:content/queueBatchMaxSize", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/queueBatchMaxSize");
	}


	itemAtq = stringify(&jcrContentSlashqueueBatchMode, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/queueBatchMode", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/queueBatchMode");
	}


	itemAtq = stringify(&jcrContentSlashqueueBatchWaitTime, "long long");
	queryParams.insert(pair<string, string>("jcr:content/queueBatchWaitTime", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/queueBatchWaitTime");
	}


	itemAtq = stringify(&jcrContentSlashretryDelay, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/retryDelay", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/retryDelay");
	}


	itemAtq = stringify(&jcrContentSlashreverseReplication, "bool");
	queryParams.insert(pair<string, string>("jcr:content/reverseReplication", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/reverseReplication");
	}


	itemAtq = stringify(&jcrContentSlashserializationType, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/serializationType", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/serializationType");
	}


	itemAtq = stringify(&jcrContentSlashslingResourceType, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/sling:resourceType", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/sling:resourceType");
	}


	itemAtq = stringify(&jcrContentSlashssl, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/ssl", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/ssl");
	}


	itemAtq = stringify(&jcrContentSlashtransportNTLMDomain, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/transportNTLMDomain", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/transportNTLMDomain");
	}


	itemAtq = stringify(&jcrContentSlashtransportNTLMHost, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/transportNTLMHost", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/transportNTLMHost");
	}


	itemAtq = stringify(&jcrContentSlashtransportPassword, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/transportPassword", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/transportPassword");
	}


	itemAtq = stringify(&jcrContentSlashtransportUri, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/transportUri", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/transportUri");
	}


	itemAtq = stringify(&jcrContentSlashtransportUser, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/transportUser", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/transportUser");
	}


	itemAtq = stringify(&jcrContentSlashtriggerDistribute, "bool");
	queryParams.insert(pair<string, string>("jcr:content/triggerDistribute", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/triggerDistribute");
	}


	itemAtq = stringify(&jcrContentSlashtriggerModified, "bool");
	queryParams.insert(pair<string, string>("jcr:content/triggerModified", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/triggerModified");
	}


	itemAtq = stringify(&jcrContentSlashtriggerOnOffTime, "bool");
	queryParams.insert(pair<string, string>("jcr:content/triggerOnOffTime", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/triggerOnOffTime");
	}


	itemAtq = stringify(&jcrContentSlashtriggerReceive, "bool");
	queryParams.insert(pair<string, string>("jcr:content/triggerReceive", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/triggerReceive");
	}


	itemAtq = stringify(&jcrContentSlashtriggerSpecific, "bool");
	queryParams.insert(pair<string, string>("jcr:content/triggerSpecific", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/triggerSpecific");
	}


	itemAtq = stringify(&jcrContentSlashuserId, "std::string");
	queryParams.insert(pair<string, string>("jcr:content/userId", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:content/userId");
	}


	itemAtq = stringify(&jcrPrimaryType, "std::string");
	queryParams.insert(pair<string, string>("jcr:primaryType", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("jcr:primaryType");
	}


	itemAtq = stringify(&operation, "std::string");
	queryParams.insert(pair<string, string>(":operation", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase(":operation");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/etc/replication/agents.{runmode}/{name}");
	int pos;

	string s_runmode("{");
	s_runmode.append("runmode");
	s_runmode.append("}");
	pos = url.find(s_runmode);
	url.erase(pos, s_runmode.length());
	url.insert(pos, stringify(&runmode, "std::string"));
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postAgentProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postAgentProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postAgentAsync(char * accessToken,
	std::string runmode, std::string name, bool jcrContentSlashcqDistribute, std::string jcrContentSlashcqDistributeAtTypeHint, std::string jcrContentSlashcqName, std::string jcrContentSlashcqTemplate, bool jcrContentSlashenabled, std::string jcrContentSlashjcrDescription, std::string jcrContentSlashjcrLastModified, std::string jcrContentSlashjcrLastModifiedBy, std::string jcrContentSlashjcrMixinTypes, std::string jcrContentSlashjcrTitle, std::string jcrContentSlashlogLevel, bool jcrContentSlashnoStatusUpdate, bool jcrContentSlashnoVersioning, long long jcrContentSlashprotocolConnectTimeout, bool jcrContentSlashprotocolHTTPConnectionClosed, std::string jcrContentSlashprotocolHTTPExpired, std::list<std::string> jcrContentSlashprotocolHTTPHeaders, std::string jcrContentSlashprotocolHTTPHeadersAtTypeHint, std::string jcrContentSlashprotocolHTTPMethod, bool jcrContentSlashprotocolHTTPSRelaxed, std::string jcrContentSlashprotocolInterface, long long jcrContentSlashprotocolSocketTimeout, std::string jcrContentSlashprotocolVersion, std::string jcrContentSlashproxyNTLMDomain, std::string jcrContentSlashproxyNTLMHost, std::string jcrContentSlashproxyHost, std::string jcrContentSlashproxyPassword, long long jcrContentSlashproxyPort, std::string jcrContentSlashproxyUser, long long jcrContentSlashqueueBatchMaxSize, std::string jcrContentSlashqueueBatchMode, long long jcrContentSlashqueueBatchWaitTime, std::string jcrContentSlashretryDelay, bool jcrContentSlashreverseReplication, std::string jcrContentSlashserializationType, std::string jcrContentSlashslingResourceType, std::string jcrContentSlashssl, std::string jcrContentSlashtransportNTLMDomain, std::string jcrContentSlashtransportNTLMHost, std::string jcrContentSlashtransportPassword, std::string jcrContentSlashtransportUri, std::string jcrContentSlashtransportUser, bool jcrContentSlashtriggerDistribute, bool jcrContentSlashtriggerModified, bool jcrContentSlashtriggerOnOffTime, bool jcrContentSlashtriggerReceive, bool jcrContentSlashtriggerSpecific, std::string jcrContentSlashuserId, std::string jcrPrimaryType, std::string operation, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postAgentHelper(accessToken,
	runmode, name, jcrContentSlashcqDistribute, jcrContentSlashcqDistributeAtTypeHint, jcrContentSlashcqName, jcrContentSlashcqTemplate, jcrContentSlashenabled, jcrContentSlashjcrDescription, jcrContentSlashjcrLastModified, jcrContentSlashjcrLastModifiedBy, jcrContentSlashjcrMixinTypes, jcrContentSlashjcrTitle, jcrContentSlashlogLevel, jcrContentSlashnoStatusUpdate, jcrContentSlashnoVersioning, jcrContentSlashprotocolConnectTimeout, jcrContentSlashprotocolHTTPConnectionClosed, jcrContentSlashprotocolHTTPExpired, jcrContentSlashprotocolHTTPHeaders, jcrContentSlashprotocolHTTPHeadersAtTypeHint, jcrContentSlashprotocolHTTPMethod, jcrContentSlashprotocolHTTPSRelaxed, jcrContentSlashprotocolInterface, jcrContentSlashprotocolSocketTimeout, jcrContentSlashprotocolVersion, jcrContentSlashproxyNTLMDomain, jcrContentSlashproxyNTLMHost, jcrContentSlashproxyHost, jcrContentSlashproxyPassword, jcrContentSlashproxyPort, jcrContentSlashproxyUser, jcrContentSlashqueueBatchMaxSize, jcrContentSlashqueueBatchMode, jcrContentSlashqueueBatchWaitTime, jcrContentSlashretryDelay, jcrContentSlashreverseReplication, jcrContentSlashserializationType, jcrContentSlashslingResourceType, jcrContentSlashssl, jcrContentSlashtransportNTLMDomain, jcrContentSlashtransportNTLMHost, jcrContentSlashtransportPassword, jcrContentSlashtransportUri, jcrContentSlashtransportUser, jcrContentSlashtriggerDistribute, jcrContentSlashtriggerModified, jcrContentSlashtriggerOnOffTime, jcrContentSlashtriggerReceive, jcrContentSlashtriggerSpecific, jcrContentSlashuserId, jcrPrimaryType, operation, 
	handler, userData, true);
}

bool SlingManager::postAgentSync(char * accessToken,
	std::string runmode, std::string name, bool jcrContentSlashcqDistribute, std::string jcrContentSlashcqDistributeAtTypeHint, std::string jcrContentSlashcqName, std::string jcrContentSlashcqTemplate, bool jcrContentSlashenabled, std::string jcrContentSlashjcrDescription, std::string jcrContentSlashjcrLastModified, std::string jcrContentSlashjcrLastModifiedBy, std::string jcrContentSlashjcrMixinTypes, std::string jcrContentSlashjcrTitle, std::string jcrContentSlashlogLevel, bool jcrContentSlashnoStatusUpdate, bool jcrContentSlashnoVersioning, long long jcrContentSlashprotocolConnectTimeout, bool jcrContentSlashprotocolHTTPConnectionClosed, std::string jcrContentSlashprotocolHTTPExpired, std::list<std::string> jcrContentSlashprotocolHTTPHeaders, std::string jcrContentSlashprotocolHTTPHeadersAtTypeHint, std::string jcrContentSlashprotocolHTTPMethod, bool jcrContentSlashprotocolHTTPSRelaxed, std::string jcrContentSlashprotocolInterface, long long jcrContentSlashprotocolSocketTimeout, std::string jcrContentSlashprotocolVersion, std::string jcrContentSlashproxyNTLMDomain, std::string jcrContentSlashproxyNTLMHost, std::string jcrContentSlashproxyHost, std::string jcrContentSlashproxyPassword, long long jcrContentSlashproxyPort, std::string jcrContentSlashproxyUser, long long jcrContentSlashqueueBatchMaxSize, std::string jcrContentSlashqueueBatchMode, long long jcrContentSlashqueueBatchWaitTime, std::string jcrContentSlashretryDelay, bool jcrContentSlashreverseReplication, std::string jcrContentSlashserializationType, std::string jcrContentSlashslingResourceType, std::string jcrContentSlashssl, std::string jcrContentSlashtransportNTLMDomain, std::string jcrContentSlashtransportNTLMHost, std::string jcrContentSlashtransportPassword, std::string jcrContentSlashtransportUri, std::string jcrContentSlashtransportUser, bool jcrContentSlashtriggerDistribute, bool jcrContentSlashtriggerModified, bool jcrContentSlashtriggerOnOffTime, bool jcrContentSlashtriggerReceive, bool jcrContentSlashtriggerSpecific, std::string jcrContentSlashuserId, std::string jcrPrimaryType, std::string operation, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postAgentHelper(accessToken,
	runmode, name, jcrContentSlashcqDistribute, jcrContentSlashcqDistributeAtTypeHint, jcrContentSlashcqName, jcrContentSlashcqTemplate, jcrContentSlashenabled, jcrContentSlashjcrDescription, jcrContentSlashjcrLastModified, jcrContentSlashjcrLastModifiedBy, jcrContentSlashjcrMixinTypes, jcrContentSlashjcrTitle, jcrContentSlashlogLevel, jcrContentSlashnoStatusUpdate, jcrContentSlashnoVersioning, jcrContentSlashprotocolConnectTimeout, jcrContentSlashprotocolHTTPConnectionClosed, jcrContentSlashprotocolHTTPExpired, jcrContentSlashprotocolHTTPHeaders, jcrContentSlashprotocolHTTPHeadersAtTypeHint, jcrContentSlashprotocolHTTPMethod, jcrContentSlashprotocolHTTPSRelaxed, jcrContentSlashprotocolInterface, jcrContentSlashprotocolSocketTimeout, jcrContentSlashprotocolVersion, jcrContentSlashproxyNTLMDomain, jcrContentSlashproxyNTLMHost, jcrContentSlashproxyHost, jcrContentSlashproxyPassword, jcrContentSlashproxyPort, jcrContentSlashproxyUser, jcrContentSlashqueueBatchMaxSize, jcrContentSlashqueueBatchMode, jcrContentSlashqueueBatchWaitTime, jcrContentSlashretryDelay, jcrContentSlashreverseReplication, jcrContentSlashserializationType, jcrContentSlashslingResourceType, jcrContentSlashssl, jcrContentSlashtransportNTLMDomain, jcrContentSlashtransportNTLMHost, jcrContentSlashtransportPassword, jcrContentSlashtransportUri, jcrContentSlashtransportUser, jcrContentSlashtriggerDistribute, jcrContentSlashtriggerModified, jcrContentSlashtriggerOnOffTime, jcrContentSlashtriggerReceive, jcrContentSlashtriggerSpecific, jcrContentSlashuserId, jcrPrimaryType, operation, 
	handler, userData, false);
}

static bool postAuthorizableKeystoreProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(KeystoreInfo, Error, void* )
	= reinterpret_cast<void(*)(KeystoreInfo, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	KeystoreInfo out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("KeystoreInfo")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "KeystoreInfo", "KeystoreInfo");
			json_node_free(pJson);

			if ("KeystoreInfo" == "std::string") {
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

static bool postAuthorizableKeystoreHelper(char * accessToken,
	std::string intermediatePath, std::string authorizableId, std::string operation, std::string currentPassword, std::string newPassword, std::string rePassword, std::string keyPassword, std::string keyStorePass, std::string alias, std::string newAlias, std::string removeAlias, std::string certChain, std::string pk, std::string keyStore, 
	void(* handler)(KeystoreInfo, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&operation, "std::string");
	queryParams.insert(pair<string, string>(":operation", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase(":operation");
	}


	itemAtq = stringify(&currentPassword, "std::string");
	queryParams.insert(pair<string, string>("currentPassword", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("currentPassword");
	}


	itemAtq = stringify(&newPassword, "std::string");
	queryParams.insert(pair<string, string>("newPassword", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("newPassword");
	}


	itemAtq = stringify(&rePassword, "std::string");
	queryParams.insert(pair<string, string>("rePassword", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("rePassword");
	}


	itemAtq = stringify(&keyPassword, "std::string");
	queryParams.insert(pair<string, string>("keyPassword", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("keyPassword");
	}


	itemAtq = stringify(&keyStorePass, "std::string");
	queryParams.insert(pair<string, string>("keyStorePass", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("keyStorePass");
	}


	itemAtq = stringify(&alias, "std::string");
	queryParams.insert(pair<string, string>("alias", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("alias");
	}


	itemAtq = stringify(&newAlias, "std::string");
	queryParams.insert(pair<string, string>("newAlias", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("newAlias");
	}


	itemAtq = stringify(&removeAlias, "std::string");
	queryParams.insert(pair<string, string>("removeAlias", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("removeAlias");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/{intermediatePath}/{authorizableId}.ks.html");
	int pos;

	string s_intermediatePath("{");
	s_intermediatePath.append("intermediatePath");
	s_intermediatePath.append("}");
	pos = url.find(s_intermediatePath);
	url.erase(pos, s_intermediatePath.length());
	url.insert(pos, stringify(&intermediatePath, "std::string"));
	string s_authorizableId("{");
	s_authorizableId.append("authorizableId");
	s_authorizableId.append("}");
	pos = url.find(s_authorizableId);
	url.erase(pos, s_authorizableId.length());
	url.insert(pos, stringify(&authorizableId, "std::string"));

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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postAuthorizableKeystoreProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postAuthorizableKeystoreProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postAuthorizableKeystoreAsync(char * accessToken,
	std::string intermediatePath, std::string authorizableId, std::string operation, std::string currentPassword, std::string newPassword, std::string rePassword, std::string keyPassword, std::string keyStorePass, std::string alias, std::string newAlias, std::string removeAlias, std::string certChain, std::string pk, std::string keyStore, 
	void(* handler)(KeystoreInfo, Error, void* )
	, void* userData)
{
	return postAuthorizableKeystoreHelper(accessToken,
	intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore, 
	handler, userData, true);
}

bool SlingManager::postAuthorizableKeystoreSync(char * accessToken,
	std::string intermediatePath, std::string authorizableId, std::string operation, std::string currentPassword, std::string newPassword, std::string rePassword, std::string keyPassword, std::string keyStorePass, std::string alias, std::string newAlias, std::string removeAlias, std::string certChain, std::string pk, std::string keyStore, 
	void(* handler)(KeystoreInfo, Error, void* )
	, void* userData)
{
	return postAuthorizableKeystoreHelper(accessToken,
	intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore, 
	handler, userData, false);
}

static bool postAuthorizablesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postAuthorizablesHelper(char * accessToken,
	std::string authorizableId, std::string intermediatePath, std::string createUser, std::string createGroup, std::string repPassword, std::string profileSlashgivenName, 
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
	

	itemAtq = stringify(&authorizableId, "std::string");
	queryParams.insert(pair<string, string>("authorizableId", itemAtq));


	itemAtq = stringify(&intermediatePath, "std::string");
	queryParams.insert(pair<string, string>("intermediatePath", itemAtq));


	itemAtq = stringify(&createUser, "std::string");
	queryParams.insert(pair<string, string>("createUser", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("createUser");
	}


	itemAtq = stringify(&createGroup, "std::string");
	queryParams.insert(pair<string, string>("createGroup", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("createGroup");
	}


	itemAtq = stringify(&repPassword, "std::string");
	queryParams.insert(pair<string, string>("rep:password", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("rep:password");
	}


	itemAtq = stringify(&profileSlashgivenName, "std::string");
	queryParams.insert(pair<string, string>("profile/givenName", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("profile/givenName");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/libs/granite/security/post/authorizables");
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postAuthorizablesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postAuthorizablesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postAuthorizablesAsync(char * accessToken,
	std::string authorizableId, std::string intermediatePath, std::string createUser, std::string createGroup, std::string repPassword, std::string profileSlashgivenName, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postAuthorizablesHelper(accessToken,
	authorizableId, intermediatePath, createUser, createGroup, repPassword, profileSlashgivenName, 
	handler, userData, true);
}

bool SlingManager::postAuthorizablesSync(char * accessToken,
	std::string authorizableId, std::string intermediatePath, std::string createUser, std::string createGroup, std::string repPassword, std::string profileSlashgivenName, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postAuthorizablesHelper(accessToken,
	authorizableId, intermediatePath, createUser, createGroup, repPassword, profileSlashgivenName, 
	handler, userData, false);
}

static bool postConfigAdobeGraniteSamlAuthenticationHandlerProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postConfigAdobeGraniteSamlAuthenticationHandlerHelper(char * accessToken,
	std::string keyStorePassword, std::string keyStorePasswordAtTypeHint, int servicePeriodranking, std::string servicePeriodrankingAtTypeHint, bool idpHttpRedirect, std::string idpHttpRedirectAtTypeHint, bool createUser, std::string createUserAtTypeHint, std::string defaultRedirectUrl, std::string defaultRedirectUrlAtTypeHint, std::string userIDAttribute, std::string userIDAttributeAtTypeHint, std::list<std::string> defaultGroups, std::string defaultGroupsAtTypeHint, std::string idpCertAlias, std::string idpCertAliasAtTypeHint, bool addGroupMemberships, std::string addGroupMembershipsAtTypeHint, std::list<std::string> path, std::string pathAtTypeHint, std::list<std::string> synchronizeAttributes, std::string synchronizeAttributesAtTypeHint, int clockTolerance, std::string clockToleranceAtTypeHint, std::string groupMembershipAttribute, std::string groupMembershipAttributeAtTypeHint, std::string idpUrl, std::string idpUrlAtTypeHint, std::string logoutUrl, std::string logoutUrlAtTypeHint, std::string serviceProviderEntityId, std::string serviceProviderEntityIdAtTypeHint, std::string assertionConsumerServiceURL, std::string assertionConsumerServiceURLAtTypeHint, bool handleLogout, std::string handleLogoutAtTypeHint, std::string spPrivateKeyAlias, std::string spPrivateKeyAliasAtTypeHint, bool useEncryption, std::string useEncryptionAtTypeHint, std::string nameIdFormat, std::string nameIdFormatAtTypeHint, std::string digestMethod, std::string digestMethodAtTypeHint, std::string signatureMethod, std::string signatureMethodAtTypeHint, std::string userIntermediatePath, std::string userIntermediatePathAtTypeHint, 
	
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
	

	itemAtq = stringify(&keyStorePassword, "std::string");
	queryParams.insert(pair<string, string>("keyStorePassword", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("keyStorePassword");
	}


	itemAtq = stringify(&keyStorePasswordAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("keyStorePassword@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("keyStorePassword@TypeHint");
	}


	itemAtq = stringify(&servicePeriodranking, "int");
	queryParams.insert(pair<string, string>("service.ranking", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("service.ranking");
	}


	itemAtq = stringify(&servicePeriodrankingAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("service.ranking@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("service.ranking@TypeHint");
	}


	itemAtq = stringify(&idpHttpRedirect, "bool");
	queryParams.insert(pair<string, string>("idpHttpRedirect", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("idpHttpRedirect");
	}


	itemAtq = stringify(&idpHttpRedirectAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("idpHttpRedirect@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("idpHttpRedirect@TypeHint");
	}


	itemAtq = stringify(&createUser, "bool");
	queryParams.insert(pair<string, string>("createUser", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("createUser");
	}


	itemAtq = stringify(&createUserAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("createUser@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("createUser@TypeHint");
	}


	itemAtq = stringify(&defaultRedirectUrl, "std::string");
	queryParams.insert(pair<string, string>("defaultRedirectUrl", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("defaultRedirectUrl");
	}


	itemAtq = stringify(&defaultRedirectUrlAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("defaultRedirectUrl@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("defaultRedirectUrl@TypeHint");
	}


	itemAtq = stringify(&userIDAttribute, "std::string");
	queryParams.insert(pair<string, string>("userIDAttribute", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("userIDAttribute");
	}


	itemAtq = stringify(&userIDAttributeAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("userIDAttribute@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("userIDAttribute@TypeHint");
	}

	for (std::list
	<std::string>::iterator queryIter = defaultGroups.begin(); queryIter != defaultGroups.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("defaultGroups", itemAt));
	}
	

	itemAtq = stringify(&defaultGroupsAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("defaultGroups@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("defaultGroups@TypeHint");
	}


	itemAtq = stringify(&idpCertAlias, "std::string");
	queryParams.insert(pair<string, string>("idpCertAlias", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("idpCertAlias");
	}


	itemAtq = stringify(&idpCertAliasAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("idpCertAlias@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("idpCertAlias@TypeHint");
	}


	itemAtq = stringify(&addGroupMemberships, "bool");
	queryParams.insert(pair<string, string>("addGroupMemberships", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("addGroupMemberships");
	}


	itemAtq = stringify(&addGroupMembershipsAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("addGroupMemberships@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("addGroupMemberships@TypeHint");
	}

	for (std::list
	<std::string>::iterator queryIter = path.begin(); queryIter != path.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("path", itemAt));
	}
	

	itemAtq = stringify(&pathAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("path@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("path@TypeHint");
	}

	for (std::list
	<std::string>::iterator queryIter = synchronizeAttributes.begin(); queryIter != synchronizeAttributes.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("synchronizeAttributes", itemAt));
	}
	

	itemAtq = stringify(&synchronizeAttributesAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("synchronizeAttributes@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("synchronizeAttributes@TypeHint");
	}


	itemAtq = stringify(&clockTolerance, "int");
	queryParams.insert(pair<string, string>("clockTolerance", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("clockTolerance");
	}


	itemAtq = stringify(&clockToleranceAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("clockTolerance@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("clockTolerance@TypeHint");
	}


	itemAtq = stringify(&groupMembershipAttribute, "std::string");
	queryParams.insert(pair<string, string>("groupMembershipAttribute", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("groupMembershipAttribute");
	}


	itemAtq = stringify(&groupMembershipAttributeAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("groupMembershipAttribute@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("groupMembershipAttribute@TypeHint");
	}


	itemAtq = stringify(&idpUrl, "std::string");
	queryParams.insert(pair<string, string>("idpUrl", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("idpUrl");
	}


	itemAtq = stringify(&idpUrlAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("idpUrl@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("idpUrl@TypeHint");
	}


	itemAtq = stringify(&logoutUrl, "std::string");
	queryParams.insert(pair<string, string>("logoutUrl", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("logoutUrl");
	}


	itemAtq = stringify(&logoutUrlAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("logoutUrl@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("logoutUrl@TypeHint");
	}


	itemAtq = stringify(&serviceProviderEntityId, "std::string");
	queryParams.insert(pair<string, string>("serviceProviderEntityId", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("serviceProviderEntityId");
	}


	itemAtq = stringify(&serviceProviderEntityIdAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("serviceProviderEntityId@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("serviceProviderEntityId@TypeHint");
	}


	itemAtq = stringify(&assertionConsumerServiceURL, "std::string");
	queryParams.insert(pair<string, string>("assertionConsumerServiceURL", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("assertionConsumerServiceURL");
	}


	itemAtq = stringify(&assertionConsumerServiceURLAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("assertionConsumerServiceURL@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("assertionConsumerServiceURL@TypeHint");
	}


	itemAtq = stringify(&handleLogout, "bool");
	queryParams.insert(pair<string, string>("handleLogout", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("handleLogout");
	}


	itemAtq = stringify(&handleLogoutAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("handleLogout@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("handleLogout@TypeHint");
	}


	itemAtq = stringify(&spPrivateKeyAlias, "std::string");
	queryParams.insert(pair<string, string>("spPrivateKeyAlias", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("spPrivateKeyAlias");
	}


	itemAtq = stringify(&spPrivateKeyAliasAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("spPrivateKeyAlias@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("spPrivateKeyAlias@TypeHint");
	}


	itemAtq = stringify(&useEncryption, "bool");
	queryParams.insert(pair<string, string>("useEncryption", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("useEncryption");
	}


	itemAtq = stringify(&useEncryptionAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("useEncryption@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("useEncryption@TypeHint");
	}


	itemAtq = stringify(&nameIdFormat, "std::string");
	queryParams.insert(pair<string, string>("nameIdFormat", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("nameIdFormat");
	}


	itemAtq = stringify(&nameIdFormatAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("nameIdFormat@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("nameIdFormat@TypeHint");
	}


	itemAtq = stringify(&digestMethod, "std::string");
	queryParams.insert(pair<string, string>("digestMethod", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("digestMethod");
	}


	itemAtq = stringify(&digestMethodAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("digestMethod@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("digestMethod@TypeHint");
	}


	itemAtq = stringify(&signatureMethod, "std::string");
	queryParams.insert(pair<string, string>("signatureMethod", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("signatureMethod");
	}


	itemAtq = stringify(&signatureMethodAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("signatureMethod@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("signatureMethod@TypeHint");
	}


	itemAtq = stringify(&userIntermediatePath, "std::string");
	queryParams.insert(pair<string, string>("userIntermediatePath", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("userIntermediatePath");
	}


	itemAtq = stringify(&userIntermediatePathAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("userIntermediatePath@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("userIntermediatePath@TypeHint");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config");
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postConfigAdobeGraniteSamlAuthenticationHandlerProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postConfigAdobeGraniteSamlAuthenticationHandlerProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postConfigAdobeGraniteSamlAuthenticationHandlerAsync(char * accessToken,
	std::string keyStorePassword, std::string keyStorePasswordAtTypeHint, int servicePeriodranking, std::string servicePeriodrankingAtTypeHint, bool idpHttpRedirect, std::string idpHttpRedirectAtTypeHint, bool createUser, std::string createUserAtTypeHint, std::string defaultRedirectUrl, std::string defaultRedirectUrlAtTypeHint, std::string userIDAttribute, std::string userIDAttributeAtTypeHint, std::list<std::string> defaultGroups, std::string defaultGroupsAtTypeHint, std::string idpCertAlias, std::string idpCertAliasAtTypeHint, bool addGroupMemberships, std::string addGroupMembershipsAtTypeHint, std::list<std::string> path, std::string pathAtTypeHint, std::list<std::string> synchronizeAttributes, std::string synchronizeAttributesAtTypeHint, int clockTolerance, std::string clockToleranceAtTypeHint, std::string groupMembershipAttribute, std::string groupMembershipAttributeAtTypeHint, std::string idpUrl, std::string idpUrlAtTypeHint, std::string logoutUrl, std::string logoutUrlAtTypeHint, std::string serviceProviderEntityId, std::string serviceProviderEntityIdAtTypeHint, std::string assertionConsumerServiceURL, std::string assertionConsumerServiceURLAtTypeHint, bool handleLogout, std::string handleLogoutAtTypeHint, std::string spPrivateKeyAlias, std::string spPrivateKeyAliasAtTypeHint, bool useEncryption, std::string useEncryptionAtTypeHint, std::string nameIdFormat, std::string nameIdFormatAtTypeHint, std::string digestMethod, std::string digestMethodAtTypeHint, std::string signatureMethod, std::string signatureMethodAtTypeHint, std::string userIntermediatePath, std::string userIntermediatePathAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigAdobeGraniteSamlAuthenticationHandlerHelper(accessToken,
	keyStorePassword, keyStorePasswordAtTypeHint, servicePeriodranking, servicePeriodrankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint, 
	handler, userData, true);
}

bool SlingManager::postConfigAdobeGraniteSamlAuthenticationHandlerSync(char * accessToken,
	std::string keyStorePassword, std::string keyStorePasswordAtTypeHint, int servicePeriodranking, std::string servicePeriodrankingAtTypeHint, bool idpHttpRedirect, std::string idpHttpRedirectAtTypeHint, bool createUser, std::string createUserAtTypeHint, std::string defaultRedirectUrl, std::string defaultRedirectUrlAtTypeHint, std::string userIDAttribute, std::string userIDAttributeAtTypeHint, std::list<std::string> defaultGroups, std::string defaultGroupsAtTypeHint, std::string idpCertAlias, std::string idpCertAliasAtTypeHint, bool addGroupMemberships, std::string addGroupMembershipsAtTypeHint, std::list<std::string> path, std::string pathAtTypeHint, std::list<std::string> synchronizeAttributes, std::string synchronizeAttributesAtTypeHint, int clockTolerance, std::string clockToleranceAtTypeHint, std::string groupMembershipAttribute, std::string groupMembershipAttributeAtTypeHint, std::string idpUrl, std::string idpUrlAtTypeHint, std::string logoutUrl, std::string logoutUrlAtTypeHint, std::string serviceProviderEntityId, std::string serviceProviderEntityIdAtTypeHint, std::string assertionConsumerServiceURL, std::string assertionConsumerServiceURLAtTypeHint, bool handleLogout, std::string handleLogoutAtTypeHint, std::string spPrivateKeyAlias, std::string spPrivateKeyAliasAtTypeHint, bool useEncryption, std::string useEncryptionAtTypeHint, std::string nameIdFormat, std::string nameIdFormatAtTypeHint, std::string digestMethod, std::string digestMethodAtTypeHint, std::string signatureMethod, std::string signatureMethodAtTypeHint, std::string userIntermediatePath, std::string userIntermediatePathAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigAdobeGraniteSamlAuthenticationHandlerHelper(accessToken,
	keyStorePassword, keyStorePasswordAtTypeHint, servicePeriodranking, servicePeriodrankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint, 
	handler, userData, false);
}

static bool postConfigApacheFelixJettyBasedHttpServiceProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postConfigApacheFelixJettyBasedHttpServiceHelper(char * accessToken,
	bool orgPeriodapachePeriodfelixPeriodhttpsPeriodnio, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint, bool orgPeriodapachePeriodfelixPeriodhttpsPeriodenable, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint, std::string orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure, std::string orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint, 
	
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
	

	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodnio, "bool");
	queryParams.insert(pair<string, string>("org.apache.felix.https.nio", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.nio");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.nio@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.nio@TypeHint");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.keystore", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.keystore");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.keystore@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.keystore@TypeHint");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.keystore.password", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.keystore.password");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.keystore.password@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.keystore.password@TypeHint");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.keystore.key", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.keystore.key");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.keystore.key@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.keystore.key@TypeHint");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.keystore.key.password", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.keystore.key.password");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.keystore.key.password@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.keystore.key.password@TypeHint");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.truststore", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.truststore");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.truststore@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.truststore@TypeHint");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.truststore.password", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.truststore.password");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.truststore.password@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.truststore.password@TypeHint");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.clientcertificate", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.clientcertificate");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.clientcertificate@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.clientcertificate@TypeHint");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodenable, "bool");
	queryParams.insert(pair<string, string>("org.apache.felix.https.enable", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.enable");
	}


	itemAtq = stringify(&orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("org.apache.felix.https.enable@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.apache.felix.https.enable@TypeHint");
	}


	itemAtq = stringify(&orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure, "std::string");
	queryParams.insert(pair<string, string>("org.osgi.service.http.port.secure", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.osgi.service.http.port.secure");
	}


	itemAtq = stringify(&orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("org.osgi.service.http.port.secure@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("org.osgi.service.http.port.secure@TypeHint");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/apps/system/config/org.apache.felix.http");
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postConfigApacheFelixJettyBasedHttpServiceProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postConfigApacheFelixJettyBasedHttpServiceProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postConfigApacheFelixJettyBasedHttpServiceAsync(char * accessToken,
	bool orgPeriodapachePeriodfelixPeriodhttpsPeriodnio, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint, bool orgPeriodapachePeriodfelixPeriodhttpsPeriodenable, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint, std::string orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure, std::string orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigApacheFelixJettyBasedHttpServiceHelper(accessToken,
	orgPeriodapachePeriodfelixPeriodhttpsPeriodnio, orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodenable, orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint, 
	handler, userData, true);
}

bool SlingManager::postConfigApacheFelixJettyBasedHttpServiceSync(char * accessToken,
	bool orgPeriodapachePeriodfelixPeriodhttpsPeriodnio, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint, bool orgPeriodapachePeriodfelixPeriodhttpsPeriodenable, std::string orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint, std::string orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure, std::string orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigApacheFelixJettyBasedHttpServiceHelper(accessToken,
	orgPeriodapachePeriodfelixPeriodhttpsPeriodnio, orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodenable, orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint, 
	handler, userData, false);
}

static bool postConfigApacheHttpComponentsProxyConfigurationProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postConfigApacheHttpComponentsProxyConfigurationHelper(char * accessToken,
	std::string proxyPeriodhost, std::string proxyPeriodhostAtTypeHint, int proxyPeriodport, std::string proxyPeriodportAtTypeHint, std::list<std::string> proxyPeriodexceptions, std::string proxyPeriodexceptionsAtTypeHint, bool proxyPeriodenabled, std::string proxyPeriodenabledAtTypeHint, std::string proxyPerioduser, std::string proxyPerioduserAtTypeHint, std::string proxyPeriodpassword, std::string proxyPeriodpasswordAtTypeHint, 
	
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
	

	itemAtq = stringify(&proxyPeriodhost, "std::string");
	queryParams.insert(pair<string, string>("proxy.host", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("proxy.host");
	}


	itemAtq = stringify(&proxyPeriodhostAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("proxy.host@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("proxy.host@TypeHint");
	}


	itemAtq = stringify(&proxyPeriodport, "int");
	queryParams.insert(pair<string, string>("proxy.port", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("proxy.port");
	}


	itemAtq = stringify(&proxyPeriodportAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("proxy.port@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("proxy.port@TypeHint");
	}

	for (std::list
	<std::string>::iterator queryIter = proxyPeriodexceptions.begin(); queryIter != proxyPeriodexceptions.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("proxyPeriodexceptions", itemAt));
	}
	

	itemAtq = stringify(&proxyPeriodexceptionsAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("proxy.exceptions@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("proxy.exceptions@TypeHint");
	}


	itemAtq = stringify(&proxyPeriodenabled, "bool");
	queryParams.insert(pair<string, string>("proxy.enabled", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("proxy.enabled");
	}


	itemAtq = stringify(&proxyPeriodenabledAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("proxy.enabled@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("proxy.enabled@TypeHint");
	}


	itemAtq = stringify(&proxyPerioduser, "std::string");
	queryParams.insert(pair<string, string>("proxy.user", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("proxy.user");
	}


	itemAtq = stringify(&proxyPerioduserAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("proxy.user@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("proxy.user@TypeHint");
	}


	itemAtq = stringify(&proxyPeriodpassword, "std::string");
	queryParams.insert(pair<string, string>("proxy.password", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("proxy.password");
	}


	itemAtq = stringify(&proxyPeriodpasswordAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("proxy.password@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("proxy.password@TypeHint");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/apps/system/config/org.apache.http.proxyconfigurator.config");
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postConfigApacheHttpComponentsProxyConfigurationProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postConfigApacheHttpComponentsProxyConfigurationProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postConfigApacheHttpComponentsProxyConfigurationAsync(char * accessToken,
	std::string proxyPeriodhost, std::string proxyPeriodhostAtTypeHint, int proxyPeriodport, std::string proxyPeriodportAtTypeHint, std::list<std::string> proxyPeriodexceptions, std::string proxyPeriodexceptionsAtTypeHint, bool proxyPeriodenabled, std::string proxyPeriodenabledAtTypeHint, std::string proxyPerioduser, std::string proxyPerioduserAtTypeHint, std::string proxyPeriodpassword, std::string proxyPeriodpasswordAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigApacheHttpComponentsProxyConfigurationHelper(accessToken,
	proxyPeriodhost, proxyPeriodhostAtTypeHint, proxyPeriodport, proxyPeriodportAtTypeHint, proxyPeriodexceptions, proxyPeriodexceptionsAtTypeHint, proxyPeriodenabled, proxyPeriodenabledAtTypeHint, proxyPerioduser, proxyPerioduserAtTypeHint, proxyPeriodpassword, proxyPeriodpasswordAtTypeHint, 
	handler, userData, true);
}

bool SlingManager::postConfigApacheHttpComponentsProxyConfigurationSync(char * accessToken,
	std::string proxyPeriodhost, std::string proxyPeriodhostAtTypeHint, int proxyPeriodport, std::string proxyPeriodportAtTypeHint, std::list<std::string> proxyPeriodexceptions, std::string proxyPeriodexceptionsAtTypeHint, bool proxyPeriodenabled, std::string proxyPeriodenabledAtTypeHint, std::string proxyPerioduser, std::string proxyPerioduserAtTypeHint, std::string proxyPeriodpassword, std::string proxyPeriodpasswordAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigApacheHttpComponentsProxyConfigurationHelper(accessToken,
	proxyPeriodhost, proxyPeriodhostAtTypeHint, proxyPeriodport, proxyPeriodportAtTypeHint, proxyPeriodexceptions, proxyPeriodexceptionsAtTypeHint, proxyPeriodenabled, proxyPeriodenabledAtTypeHint, proxyPerioduser, proxyPerioduserAtTypeHint, proxyPeriodpassword, proxyPeriodpasswordAtTypeHint, 
	handler, userData, false);
}

static bool postConfigApacheSlingDavExServletProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postConfigApacheSlingDavExServletHelper(char * accessToken,
	std::string alias, std::string aliasAtTypeHint, bool davPeriodcreateAbsoluteUri, std::string davPeriodcreateAbsoluteUriAtTypeHint, 
	
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
	

	itemAtq = stringify(&alias, "std::string");
	queryParams.insert(pair<string, string>("alias", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("alias");
	}


	itemAtq = stringify(&aliasAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("alias@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("alias@TypeHint");
	}


	itemAtq = stringify(&davPeriodcreateAbsoluteUri, "bool");
	queryParams.insert(pair<string, string>("dav.create-absolute-uri", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("dav.create-absolute-uri");
	}


	itemAtq = stringify(&davPeriodcreateAbsoluteUriAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("dav.create-absolute-uri@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("dav.create-absolute-uri@TypeHint");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet");
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postConfigApacheSlingDavExServletProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postConfigApacheSlingDavExServletProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postConfigApacheSlingDavExServletAsync(char * accessToken,
	std::string alias, std::string aliasAtTypeHint, bool davPeriodcreateAbsoluteUri, std::string davPeriodcreateAbsoluteUriAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigApacheSlingDavExServletHelper(accessToken,
	alias, aliasAtTypeHint, davPeriodcreateAbsoluteUri, davPeriodcreateAbsoluteUriAtTypeHint, 
	handler, userData, true);
}

bool SlingManager::postConfigApacheSlingDavExServletSync(char * accessToken,
	std::string alias, std::string aliasAtTypeHint, bool davPeriodcreateAbsoluteUri, std::string davPeriodcreateAbsoluteUriAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigApacheSlingDavExServletHelper(accessToken,
	alias, aliasAtTypeHint, davPeriodcreateAbsoluteUri, davPeriodcreateAbsoluteUriAtTypeHint, 
	handler, userData, false);
}

static bool postConfigApacheSlingGetServletProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postConfigApacheSlingGetServletHelper(char * accessToken,
	std::string jsonPeriodmaximumresults, std::string jsonPeriodmaximumresultsAtTypeHint, bool enablePeriodhtml, std::string enablePeriodhtmlAtTypeHint, bool enablePeriodtxt, std::string enablePeriodtxtAtTypeHint, bool enablePeriodxml, std::string enablePeriodxmlAtTypeHint, 
	
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
	

	itemAtq = stringify(&jsonPeriodmaximumresults, "std::string");
	queryParams.insert(pair<string, string>("json.maximumresults", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("json.maximumresults");
	}


	itemAtq = stringify(&jsonPeriodmaximumresultsAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("json.maximumresults@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("json.maximumresults@TypeHint");
	}


	itemAtq = stringify(&enablePeriodhtml, "bool");
	queryParams.insert(pair<string, string>("enable.html", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable.html");
	}


	itemAtq = stringify(&enablePeriodhtmlAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("enable.html@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable.html@TypeHint");
	}


	itemAtq = stringify(&enablePeriodtxt, "bool");
	queryParams.insert(pair<string, string>("enable.txt", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable.txt");
	}


	itemAtq = stringify(&enablePeriodtxtAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("enable.txt@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable.txt@TypeHint");
	}


	itemAtq = stringify(&enablePeriodxml, "bool");
	queryParams.insert(pair<string, string>("enable.xml", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable.xml");
	}


	itemAtq = stringify(&enablePeriodxmlAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("enable.xml@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("enable.xml@TypeHint");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet");
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postConfigApacheSlingGetServletProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postConfigApacheSlingGetServletProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postConfigApacheSlingGetServletAsync(char * accessToken,
	std::string jsonPeriodmaximumresults, std::string jsonPeriodmaximumresultsAtTypeHint, bool enablePeriodhtml, std::string enablePeriodhtmlAtTypeHint, bool enablePeriodtxt, std::string enablePeriodtxtAtTypeHint, bool enablePeriodxml, std::string enablePeriodxmlAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigApacheSlingGetServletHelper(accessToken,
	jsonPeriodmaximumresults, jsonPeriodmaximumresultsAtTypeHint, enablePeriodhtml, enablePeriodhtmlAtTypeHint, enablePeriodtxt, enablePeriodtxtAtTypeHint, enablePeriodxml, enablePeriodxmlAtTypeHint, 
	handler, userData, true);
}

bool SlingManager::postConfigApacheSlingGetServletSync(char * accessToken,
	std::string jsonPeriodmaximumresults, std::string jsonPeriodmaximumresultsAtTypeHint, bool enablePeriodhtml, std::string enablePeriodhtmlAtTypeHint, bool enablePeriodtxt, std::string enablePeriodtxtAtTypeHint, bool enablePeriodxml, std::string enablePeriodxmlAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigApacheSlingGetServletHelper(accessToken,
	jsonPeriodmaximumresults, jsonPeriodmaximumresultsAtTypeHint, enablePeriodhtml, enablePeriodhtmlAtTypeHint, enablePeriodtxt, enablePeriodtxtAtTypeHint, enablePeriodxml, enablePeriodxmlAtTypeHint, 
	handler, userData, false);
}

static bool postConfigApacheSlingReferrerFilterProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postConfigApacheSlingReferrerFilterHelper(char * accessToken,
	bool allowPeriodempty, std::string allowPeriodemptyAtTypeHint, std::string allowPeriodhosts, std::string allowPeriodhostsAtTypeHint, std::string allowPeriodhostsPeriodregexp, std::string allowPeriodhostsPeriodregexpAtTypeHint, std::string filterPeriodmethods, std::string filterPeriodmethodsAtTypeHint, 
	
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
	

	itemAtq = stringify(&allowPeriodempty, "bool");
	queryParams.insert(pair<string, string>("allow.empty", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("allow.empty");
	}


	itemAtq = stringify(&allowPeriodemptyAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("allow.empty@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("allow.empty@TypeHint");
	}


	itemAtq = stringify(&allowPeriodhosts, "std::string");
	queryParams.insert(pair<string, string>("allow.hosts", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("allow.hosts");
	}


	itemAtq = stringify(&allowPeriodhostsAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("allow.hosts@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("allow.hosts@TypeHint");
	}


	itemAtq = stringify(&allowPeriodhostsPeriodregexp, "std::string");
	queryParams.insert(pair<string, string>("allow.hosts.regexp", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("allow.hosts.regexp");
	}


	itemAtq = stringify(&allowPeriodhostsPeriodregexpAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("allow.hosts.regexp@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("allow.hosts.regexp@TypeHint");
	}


	itemAtq = stringify(&filterPeriodmethods, "std::string");
	queryParams.insert(pair<string, string>("filter.methods", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("filter.methods");
	}


	itemAtq = stringify(&filterPeriodmethodsAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("filter.methods@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("filter.methods@TypeHint");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/apps/system/config/org.apache.sling.security.impl.ReferrerFilter");
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postConfigApacheSlingReferrerFilterProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postConfigApacheSlingReferrerFilterProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postConfigApacheSlingReferrerFilterAsync(char * accessToken,
	bool allowPeriodempty, std::string allowPeriodemptyAtTypeHint, std::string allowPeriodhosts, std::string allowPeriodhostsAtTypeHint, std::string allowPeriodhostsPeriodregexp, std::string allowPeriodhostsPeriodregexpAtTypeHint, std::string filterPeriodmethods, std::string filterPeriodmethodsAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigApacheSlingReferrerFilterHelper(accessToken,
	allowPeriodempty, allowPeriodemptyAtTypeHint, allowPeriodhosts, allowPeriodhostsAtTypeHint, allowPeriodhostsPeriodregexp, allowPeriodhostsPeriodregexpAtTypeHint, filterPeriodmethods, filterPeriodmethodsAtTypeHint, 
	handler, userData, true);
}

bool SlingManager::postConfigApacheSlingReferrerFilterSync(char * accessToken,
	bool allowPeriodempty, std::string allowPeriodemptyAtTypeHint, std::string allowPeriodhosts, std::string allowPeriodhostsAtTypeHint, std::string allowPeriodhostsPeriodregexp, std::string allowPeriodhostsPeriodregexpAtTypeHint, std::string filterPeriodmethods, std::string filterPeriodmethodsAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigApacheSlingReferrerFilterHelper(accessToken,
	allowPeriodempty, allowPeriodemptyAtTypeHint, allowPeriodhosts, allowPeriodhostsAtTypeHint, allowPeriodhostsPeriodregexp, allowPeriodhostsPeriodregexpAtTypeHint, filterPeriodmethods, filterPeriodmethodsAtTypeHint, 
	handler, userData, false);
}

static bool postNodeProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postNodeHelper(char * accessToken,
	std::string path, std::string name, std::string operation, std::string deleteAuthorizable, std::string file, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&operation, "std::string");
	queryParams.insert(pair<string, string>(":operation", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase(":operation");
	}


	itemAtq = stringify(&deleteAuthorizable, "std::string");
	queryParams.insert(pair<string, string>("deleteAuthorizable", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("deleteAuthorizable");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/{path}/{name}");
	int pos;

	string s_path("{");
	s_path.append("path");
	s_path.append("}");
	pos = url.find(s_path);
	url.erase(pos, s_path.length());
	url.insert(pos, stringify(&path, "std::string"));
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postNodeProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postNodeProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postNodeAsync(char * accessToken,
	std::string path, std::string name, std::string operation, std::string deleteAuthorizable, std::string file, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postNodeHelper(accessToken,
	path, name, operation, deleteAuthorizable, file, 
	handler, userData, true);
}

bool SlingManager::postNodeSync(char * accessToken,
	std::string path, std::string name, std::string operation, std::string deleteAuthorizable, std::string file, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postNodeHelper(accessToken,
	path, name, operation, deleteAuthorizable, file, 
	handler, userData, false);
}

static bool postNodeRwProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postNodeRwHelper(char * accessToken,
	std::string path, std::string name, std::string addMembers, 
	
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
	

	itemAtq = stringify(&addMembers, "std::string");
	queryParams.insert(pair<string, string>("addMembers", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("addMembers");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/{path}/{name}.rw.html");
	int pos;

	string s_path("{");
	s_path.append("path");
	s_path.append("}");
	pos = url.find(s_path);
	url.erase(pos, s_path.length());
	url.insert(pos, stringify(&path, "std::string"));
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postNodeRwProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postNodeRwProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postNodeRwAsync(char * accessToken,
	std::string path, std::string name, std::string addMembers, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postNodeRwHelper(accessToken,
	path, name, addMembers, 
	handler, userData, true);
}

bool SlingManager::postNodeRwSync(char * accessToken,
	std::string path, std::string name, std::string addMembers, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postNodeRwHelper(accessToken,
	path, name, addMembers, 
	handler, userData, false);
}

static bool postPathProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postPathHelper(char * accessToken,
	std::string path, std::string jcrPrimaryType, std::string name, 
	
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
	

	itemAtq = stringify(&jcrPrimaryType, "std::string");
	queryParams.insert(pair<string, string>("jcr:primaryType", itemAtq));


	itemAtq = stringify(&name, "std::string");
	queryParams.insert(pair<string, string>(":name", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/{path}/");
	int pos;

	string s_path("{");
	s_path.append("path");
	s_path.append("}");
	pos = url.find(s_path);
	url.erase(pos, s_path.length());
	url.insert(pos, stringify(&path, "std::string"));

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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postPathProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postPathProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postPathAsync(char * accessToken,
	std::string path, std::string jcrPrimaryType, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postPathHelper(accessToken,
	path, jcrPrimaryType, name, 
	handler, userData, true);
}

bool SlingManager::postPathSync(char * accessToken,
	std::string path, std::string jcrPrimaryType, std::string name, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postPathHelper(accessToken,
	path, jcrPrimaryType, name, 
	handler, userData, false);
}

static bool postQueryProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postQueryHelper(char * accessToken,
	std::string path, long long pPeriodlimit, std::string _1_property, std::string _1_property_value, 
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
	

	itemAtq = stringify(&path, "std::string");
	queryParams.insert(pair<string, string>("path", itemAtq));


	itemAtq = stringify(&pPeriodlimit, "long long");
	queryParams.insert(pair<string, string>("p.limit", itemAtq));


	itemAtq = stringify(&_1_property, "std::string");
	queryParams.insert(pair<string, string>("1_property", itemAtq));


	itemAtq = stringify(&_1_property_value, "std::string");
	queryParams.insert(pair<string, string>("1_property.value", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/bin/querybuilder.json");
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postQueryProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postQueryProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postQueryAsync(char * accessToken,
	std::string path, long long pPeriodlimit, std::string _1_property, std::string _1_property_value, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postQueryHelper(accessToken,
	path, pPeriodlimit, _1_property, _1_property_value, 
	handler, userData, true);
}

bool SlingManager::postQuerySync(char * accessToken,
	std::string path, long long pPeriodlimit, std::string _1_property, std::string _1_property_value, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postQueryHelper(accessToken,
	path, pPeriodlimit, _1_property, _1_property_value, 
	handler, userData, false);
}

static bool postTreeActivationProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postTreeActivationHelper(char * accessToken,
	bool ignoredeactivated, bool onlymodified, std::string path, 
	
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
	

	itemAtq = stringify(&ignoredeactivated, "bool");
	queryParams.insert(pair<string, string>("ignoredeactivated", itemAtq));


	itemAtq = stringify(&onlymodified, "bool");
	queryParams.insert(pair<string, string>("onlymodified", itemAtq));


	itemAtq = stringify(&path, "std::string");
	queryParams.insert(pair<string, string>("path", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/etc/replication/treeactivation.html");
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postTreeActivationProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postTreeActivationProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postTreeActivationAsync(char * accessToken,
	bool ignoredeactivated, bool onlymodified, std::string path, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postTreeActivationHelper(accessToken,
	ignoredeactivated, onlymodified, path, 
	handler, userData, true);
}

bool SlingManager::postTreeActivationSync(char * accessToken,
	bool ignoredeactivated, bool onlymodified, std::string path, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postTreeActivationHelper(accessToken,
	ignoredeactivated, onlymodified, path, 
	handler, userData, false);
}

static bool postTruststoreProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postTruststoreHelper(char * accessToken,
	std::string operation, std::string newPassword, std::string rePassword, std::string keyStoreType, std::string removeAlias, std::string certificate, 
	void(* handler)(std::string, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&operation, "std::string");
	queryParams.insert(pair<string, string>(":operation", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase(":operation");
	}


	itemAtq = stringify(&newPassword, "std::string");
	queryParams.insert(pair<string, string>("newPassword", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("newPassword");
	}


	itemAtq = stringify(&rePassword, "std::string");
	queryParams.insert(pair<string, string>("rePassword", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("rePassword");
	}


	itemAtq = stringify(&keyStoreType, "std::string");
	queryParams.insert(pair<string, string>("keyStoreType", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("keyStoreType");
	}


	itemAtq = stringify(&removeAlias, "std::string");
	queryParams.insert(pair<string, string>("removeAlias", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("removeAlias");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/libs/granite/security/post/truststore");
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postTruststoreProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postTruststoreProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postTruststoreAsync(char * accessToken,
	std::string operation, std::string newPassword, std::string rePassword, std::string keyStoreType, std::string removeAlias, std::string certificate, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postTruststoreHelper(accessToken,
	operation, newPassword, rePassword, keyStoreType, removeAlias, certificate, 
	handler, userData, true);
}

bool SlingManager::postTruststoreSync(char * accessToken,
	std::string operation, std::string newPassword, std::string rePassword, std::string keyStoreType, std::string removeAlias, std::string certificate, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postTruststoreHelper(accessToken,
	operation, newPassword, rePassword, keyStoreType, removeAlias, certificate, 
	handler, userData, false);
}

static bool postTruststorePKCS12Processor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postTruststorePKCS12Helper(char * accessToken,
	std::string truststorePeriodp12, 
	void(* handler)(std::string, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/etc/truststore");
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
		NetClient::easycurl(SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postTruststorePKCS12Processor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SlingManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postTruststorePKCS12Processor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SlingManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SlingManager::postTruststorePKCS12Async(char * accessToken,
	std::string truststorePeriodp12, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postTruststorePKCS12Helper(accessToken,
	truststorePeriodp12, 
	handler, userData, true);
}

bool SlingManager::postTruststorePKCS12Sync(char * accessToken,
	std::string truststorePeriodp12, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postTruststorePKCS12Helper(accessToken,
	truststorePeriodp12, 
	handler, userData, false);
}


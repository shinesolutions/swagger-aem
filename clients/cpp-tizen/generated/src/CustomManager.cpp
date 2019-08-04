#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "CustomManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


CustomManager::CustomManager()
{

}

CustomManager::~CustomManager()
{

}

static gboolean __CustomManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __CustomManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__CustomManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool getAemHealthCheckProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getAemHealthCheckHelper(char * accessToken,
	std::string tags, bool combineTagsOr, 
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
	

	itemAtq = stringify(&tags, "std::string");
	queryParams.insert(pair<string, string>("tags", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("tags");
	}


	itemAtq = stringify(&combineTagsOr, "bool");
	queryParams.insert(pair<string, string>("combineTagsOr", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("combineTagsOr");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/system/health");
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
		NetClient::easycurl(CustomManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAemHealthCheckProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CustomManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAemHealthCheckProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CustomManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CustomManager::getAemHealthCheckAsync(char * accessToken,
	std::string tags, bool combineTagsOr, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getAemHealthCheckHelper(accessToken,
	tags, combineTagsOr, 
	handler, userData, true);
}

bool CustomManager::getAemHealthCheckSync(char * accessToken,
	std::string tags, bool combineTagsOr, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getAemHealthCheckHelper(accessToken,
	tags, combineTagsOr, 
	handler, userData, false);
}

static bool postConfigAemHealthCheckServletProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postConfigAemHealthCheckServletHelper(char * accessToken,
	std::list<std::string> bundlesPeriodignored, std::string bundlesPeriodignoredAtTypeHint, 
	
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
	
	for (std::list
	<std::string>::iterator queryIter = bundlesPeriodignored.begin(); queryIter != bundlesPeriodignored.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("bundlesPeriodignored", itemAt));
	}
	

	itemAtq = stringify(&bundlesPeriodignoredAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("bundles.ignored@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bundles.ignored@TypeHint");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck");
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
		NetClient::easycurl(CustomManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postConfigAemHealthCheckServletProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CustomManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postConfigAemHealthCheckServletProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CustomManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CustomManager::postConfigAemHealthCheckServletAsync(char * accessToken,
	std::list<std::string> bundlesPeriodignored, std::string bundlesPeriodignoredAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigAemHealthCheckServletHelper(accessToken,
	bundlesPeriodignored, bundlesPeriodignoredAtTypeHint, 
	handler, userData, true);
}

bool CustomManager::postConfigAemHealthCheckServletSync(char * accessToken,
	std::list<std::string> bundlesPeriodignored, std::string bundlesPeriodignoredAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigAemHealthCheckServletHelper(accessToken,
	bundlesPeriodignored, bundlesPeriodignoredAtTypeHint, 
	handler, userData, false);
}

static bool postConfigAemPasswordResetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postConfigAemPasswordResetHelper(char * accessToken,
	std::list<std::string> pwdresetPeriodauthorizables, std::string pwdresetPeriodauthorizablesAtTypeHint, 
	
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
	
	for (std::list
	<std::string>::iterator queryIter = pwdresetPeriodauthorizables.begin(); queryIter != pwdresetPeriodauthorizables.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("pwdresetPeriodauthorizables", itemAt));
	}
	

	itemAtq = stringify(&pwdresetPeriodauthorizablesAtTypeHint, "std::string");
	queryParams.insert(pair<string, string>("pwdreset.authorizables@TypeHint", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pwdreset.authorizables@TypeHint");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/apps/system/config/com.shinesolutions.aem.passwordreset.Activator");
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
		NetClient::easycurl(CustomManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postConfigAemPasswordResetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CustomManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postConfigAemPasswordResetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CustomManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CustomManager::postConfigAemPasswordResetAsync(char * accessToken,
	std::list<std::string> pwdresetPeriodauthorizables, std::string pwdresetPeriodauthorizablesAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigAemPasswordResetHelper(accessToken,
	pwdresetPeriodauthorizables, pwdresetPeriodauthorizablesAtTypeHint, 
	handler, userData, true);
}

bool CustomManager::postConfigAemPasswordResetSync(char * accessToken,
	std::list<std::string> pwdresetPeriodauthorizables, std::string pwdresetPeriodauthorizablesAtTypeHint, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return postConfigAemPasswordResetHelper(accessToken,
	pwdresetPeriodauthorizables, pwdresetPeriodauthorizablesAtTypeHint, 
	handler, userData, false);
}


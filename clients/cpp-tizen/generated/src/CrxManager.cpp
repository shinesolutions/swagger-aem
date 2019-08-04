#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "CrxManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


CrxManager::CrxManager()
{

}

CrxManager::~CrxManager()
{

}

static gboolean __CrxManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __CrxManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__CrxManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool getCrxdeStatusProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getCrxdeStatusHelper(char * accessToken,
	
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

	string url("/crx/server/crx.default/jcr:root/.1.json");
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
		NetClient::easycurl(CrxManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCrxdeStatusProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CrxManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCrxdeStatusProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CrxManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CrxManager::getCrxdeStatusAsync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getCrxdeStatusHelper(accessToken,
	
	handler, userData, true);
}

bool CrxManager::getCrxdeStatusSync(char * accessToken,
	
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return getCrxdeStatusHelper(accessToken,
	
	handler, userData, false);
}

static bool getInstallStatusProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(InstallStatus, Error, void* )
	= reinterpret_cast<void(*)(InstallStatus, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	InstallStatus out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("InstallStatus")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "InstallStatus", "InstallStatus");
			json_node_free(pJson);

			if ("InstallStatus" == "std::string") {
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

static bool getInstallStatusHelper(char * accessToken,
	
	void(* handler)(InstallStatus, Error, void* )
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

	string url("/crx/packmgr/installstatus.jsp");
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
		NetClient::easycurl(CrxManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getInstallStatusProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CrxManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getInstallStatusProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CrxManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CrxManager::getInstallStatusAsync(char * accessToken,
	
	void(* handler)(InstallStatus, Error, void* )
	, void* userData)
{
	return getInstallStatusHelper(accessToken,
	
	handler, userData, true);
}

bool CrxManager::getInstallStatusSync(char * accessToken,
	
	void(* handler)(InstallStatus, Error, void* )
	, void* userData)
{
	return getInstallStatusHelper(accessToken,
	
	handler, userData, false);
}

static bool getPackageManagerServletProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool getPackageManagerServletHelper(char * accessToken,
	
	
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

	string url("/crx/packmgr/service/script.html");
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
		NetClient::easycurl(CrxManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getPackageManagerServletProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CrxManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getPackageManagerServletProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CrxManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CrxManager::getPackageManagerServletAsync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData)
{
	return getPackageManagerServletHelper(accessToken,
	
	handler, userData, true);
}

bool CrxManager::getPackageManagerServletSync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData)
{
	return getPackageManagerServletHelper(accessToken,
	
	handler, userData, false);
}

static bool postPackageServiceProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postPackageServiceHelper(char * accessToken,
	std::string cmd, 
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
	

	itemAtq = stringify(&cmd, "std::string");
	queryParams.insert(pair<string, string>("cmd", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/crx/packmgr/service.jsp");
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
		NetClient::easycurl(CrxManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postPackageServiceProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CrxManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postPackageServiceProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CrxManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CrxManager::postPackageServiceAsync(char * accessToken,
	std::string cmd, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postPackageServiceHelper(accessToken,
	cmd, 
	handler, userData, true);
}

bool CrxManager::postPackageServiceSync(char * accessToken,
	std::string cmd, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postPackageServiceHelper(accessToken,
	cmd, 
	handler, userData, false);
}

static bool postPackageServiceJsonProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postPackageServiceJsonHelper(char * accessToken,
	std::string path, std::string cmd, std::string groupName, std::string packageName, std::string packageVersion, std::string charset, bool force, bool recursive, std::string package, 
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
	

	itemAtq = stringify(&cmd, "std::string");
	queryParams.insert(pair<string, string>("cmd", itemAtq));


	itemAtq = stringify(&groupName, "std::string");
	queryParams.insert(pair<string, string>("groupName", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("groupName");
	}


	itemAtq = stringify(&packageName, "std::string");
	queryParams.insert(pair<string, string>("packageName", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("packageName");
	}


	itemAtq = stringify(&packageVersion, "std::string");
	queryParams.insert(pair<string, string>("packageVersion", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("packageVersion");
	}


	itemAtq = stringify(&charset, "std::string");
	queryParams.insert(pair<string, string>("_charset_", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("_charset_");
	}


	itemAtq = stringify(&force, "bool");
	queryParams.insert(pair<string, string>("force", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("force");
	}


	itemAtq = stringify(&recursive, "bool");
	queryParams.insert(pair<string, string>("recursive", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("recursive");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/crx/packmgr/service/.json/{path}");
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
		NetClient::easycurl(CrxManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postPackageServiceJsonProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CrxManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postPackageServiceJsonProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CrxManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CrxManager::postPackageServiceJsonAsync(char * accessToken,
	std::string path, std::string cmd, std::string groupName, std::string packageName, std::string packageVersion, std::string charset, bool force, bool recursive, std::string package, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postPackageServiceJsonHelper(accessToken,
	path, cmd, groupName, packageName, packageVersion, charset, force, recursive, package, 
	handler, userData, true);
}

bool CrxManager::postPackageServiceJsonSync(char * accessToken,
	std::string path, std::string cmd, std::string groupName, std::string packageName, std::string packageVersion, std::string charset, bool force, bool recursive, std::string package, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postPackageServiceJsonHelper(accessToken,
	path, cmd, groupName, packageName, packageVersion, charset, force, recursive, package, 
	handler, userData, false);
}

static bool postPackageUpdateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postPackageUpdateHelper(char * accessToken,
	std::string groupName, std::string packageName, std::string version, std::string path, std::string filter, std::string charset, 
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
	

	itemAtq = stringify(&groupName, "std::string");
	queryParams.insert(pair<string, string>("groupName", itemAtq));


	itemAtq = stringify(&packageName, "std::string");
	queryParams.insert(pair<string, string>("packageName", itemAtq));


	itemAtq = stringify(&version, "std::string");
	queryParams.insert(pair<string, string>("version", itemAtq));


	itemAtq = stringify(&path, "std::string");
	queryParams.insert(pair<string, string>("path", itemAtq));


	itemAtq = stringify(&filter, "std::string");
	queryParams.insert(pair<string, string>("filter", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("filter");
	}


	itemAtq = stringify(&charset, "std::string");
	queryParams.insert(pair<string, string>("_charset_", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("_charset_");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/crx/packmgr/update.jsp");
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
		NetClient::easycurl(CrxManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postPackageUpdateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CrxManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postPackageUpdateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CrxManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CrxManager::postPackageUpdateAsync(char * accessToken,
	std::string groupName, std::string packageName, std::string version, std::string path, std::string filter, std::string charset, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postPackageUpdateHelper(accessToken,
	groupName, packageName, version, path, filter, charset, 
	handler, userData, true);
}

bool CrxManager::postPackageUpdateSync(char * accessToken,
	std::string groupName, std::string packageName, std::string version, std::string path, std::string filter, std::string charset, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postPackageUpdateHelper(accessToken,
	groupName, packageName, version, path, filter, charset, 
	handler, userData, false);
}

static bool postSetPasswordProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool postSetPasswordHelper(char * accessToken,
	std::string old, std::string plain, std::string verify, 
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
	

	itemAtq = stringify(&old, "std::string");
	queryParams.insert(pair<string, string>("old", itemAtq));


	itemAtq = stringify(&plain, "std::string");
	queryParams.insert(pair<string, string>("plain", itemAtq));


	itemAtq = stringify(&verify, "std::string");
	queryParams.insert(pair<string, string>("verify", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/crx/explorer/ui/setpassword.jsp");
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
		NetClient::easycurl(CrxManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = postSetPasswordProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (CrxManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), postSetPasswordProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CrxManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CrxManager::postSetPasswordAsync(char * accessToken,
	std::string old, std::string plain, std::string verify, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postSetPasswordHelper(accessToken,
	old, plain, verify, 
	handler, userData, true);
}

bool CrxManager::postSetPasswordSync(char * accessToken,
	std::string old, std::string plain, std::string verify, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return postSetPasswordHelper(accessToken,
	old, plain, verify, 
	handler, userData, false);
}


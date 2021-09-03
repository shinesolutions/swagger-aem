#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "GraniteManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


GraniteManager::GraniteManager()
{

}

GraniteManager::~GraniteManager()
{

}

static gboolean __GraniteManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __GraniteManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__GraniteManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool sslSetupProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool sslSetupHelper(char * accessToken,
	std::string keystorePassword, std::string keystorePasswordConfirm, std::string truststorePassword, std::string truststorePasswordConfirm, std::string httpsHostname, std::string httpsPort, std::string privatekeyFile, std::string certificateFile, 
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
	

	itemAtq = stringify(&keystorePassword, "std::string");
	queryParams.insert(pair<string, string>("keystorePassword", itemAtq));


	itemAtq = stringify(&keystorePasswordConfirm, "std::string");
	queryParams.insert(pair<string, string>("keystorePasswordConfirm", itemAtq));


	itemAtq = stringify(&truststorePassword, "std::string");
	queryParams.insert(pair<string, string>("truststorePassword", itemAtq));


	itemAtq = stringify(&truststorePasswordConfirm, "std::string");
	queryParams.insert(pair<string, string>("truststorePasswordConfirm", itemAtq));


	itemAtq = stringify(&httpsHostname, "std::string");
	queryParams.insert(pair<string, string>("httpsHostname", itemAtq));


	itemAtq = stringify(&httpsPort, "std::string");
	queryParams.insert(pair<string, string>("httpsPort", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/libs/granite/security/post/sslSetup.html");
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
		NetClient::easycurl(GraniteManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = sslSetupProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (GraniteManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), sslSetupProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __GraniteManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool GraniteManager::sslSetupAsync(char * accessToken,
	std::string keystorePassword, std::string keystorePasswordConfirm, std::string truststorePassword, std::string truststorePasswordConfirm, std::string httpsHostname, std::string httpsPort, std::string privatekeyFile, std::string certificateFile, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return sslSetupHelper(accessToken,
	keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile, 
	handler, userData, true);
}

bool GraniteManager::sslSetupSync(char * accessToken,
	std::string keystorePassword, std::string keystorePasswordConfirm, std::string truststorePassword, std::string truststorePasswordConfirm, std::string httpsHostname, std::string httpsPort, std::string privatekeyFile, std::string certificateFile, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return sslSetupHelper(accessToken,
	keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile, 
	handler, userData, false);
}


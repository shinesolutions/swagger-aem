#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "CrxAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


char*
CrxAPI_getCrxdeStatus(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/crx/server/crx.default/jcr:root/.1.json");




    list_addElement(localVarHeaderType,"plain/text"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","CRXDE is enabled");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","CRXDE is disabled");
    //}
    //primitive return type simple string
    char* elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300)
        elementToReturn = strdup((char*)apiClient->dataReceived);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

install_status_t*
CrxAPI_getInstallStatus(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/crx/packmgr/installstatus.jsp");




    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Retrieved CRX package manager install status");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Default response");
    //}
    //nonprimitive not container
    install_status_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CrxAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = install_status_parseFromJSON(CrxAPIlocalVarJSON);
        cJSON_Delete(CrxAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

void
CrxAPI_getPackageManagerServlet(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/crx/packmgr/service/script.html");




    list_addElement(localVarHeaderType,"text/html"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Package Manager Servlet is disabled");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 405) {
    //    printf("%s\n","Package Manager Servlet is active");
    //}
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);

}

char*
CrxAPI_postPackageService(apiClient_t *apiClient, char *cmd)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/crx/packmgr/service.jsp");





    // query parameters
    char *keyQuery_cmd = NULL;
    char * valueQuery_cmd = NULL;
    keyValuePair_t *keyPairQuery_cmd = 0;
    if (cmd)
    {
        keyQuery_cmd = strdup("cmd");
        valueQuery_cmd = strdup((cmd));
        keyPairQuery_cmd = keyValuePair_create(keyQuery_cmd, valueQuery_cmd);
        list_addElement(localVarQueryParameters,keyPairQuery_cmd);
    }
    list_addElement(localVarHeaderType,"text/xml"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Default response");
    //}
    //primitive return type simple string
    char* elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300)
        elementToReturn = strdup((char*)apiClient->dataReceived);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_cmd){
        free(keyQuery_cmd);
        keyQuery_cmd = NULL;
    }
    if(valueQuery_cmd){
        free(valueQuery_cmd);
        valueQuery_cmd = NULL;
    }
    if(keyPairQuery_cmd){
        keyValuePair_free(keyPairQuery_cmd);
        keyPairQuery_cmd = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

char*
CrxAPI_postPackageServiceJson(apiClient_t *apiClient, char *path, char *cmd, char *groupName, char *packageName, char *packageVersion, char *_charset_, int *force, int *recursive, binary_t* package)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_createList();
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/crx/packmgr/service/.json/{path}");

    if(!path)
        goto end;


    // Path Params
    long sizeOfPathParams_path = strlen(path)+3 + sizeof("{ path }") - 1;
    if(path == NULL) {
        goto end;
    }
    char* localVarToReplace_path = malloc(sizeOfPathParams_path);
    sprintf(localVarToReplace_path, "{%s}", "path");

    localVarPath = strReplace(localVarPath, localVarToReplace_path, path);



    // query parameters
    char *keyQuery_cmd = NULL;
    char * valueQuery_cmd = NULL;
    keyValuePair_t *keyPairQuery_cmd = 0;
    if (cmd)
    {
        keyQuery_cmd = strdup("cmd");
        valueQuery_cmd = strdup((cmd));
        keyPairQuery_cmd = keyValuePair_create(keyQuery_cmd, valueQuery_cmd);
        list_addElement(localVarQueryParameters,keyPairQuery_cmd);
    }

    // query parameters
    char *keyQuery_groupName = NULL;
    char * valueQuery_groupName = NULL;
    keyValuePair_t *keyPairQuery_groupName = 0;
    if (groupName)
    {
        keyQuery_groupName = strdup("groupName");
        valueQuery_groupName = strdup((groupName));
        keyPairQuery_groupName = keyValuePair_create(keyQuery_groupName, valueQuery_groupName);
        list_addElement(localVarQueryParameters,keyPairQuery_groupName);
    }

    // query parameters
    char *keyQuery_packageName = NULL;
    char * valueQuery_packageName = NULL;
    keyValuePair_t *keyPairQuery_packageName = 0;
    if (packageName)
    {
        keyQuery_packageName = strdup("packageName");
        valueQuery_packageName = strdup((packageName));
        keyPairQuery_packageName = keyValuePair_create(keyQuery_packageName, valueQuery_packageName);
        list_addElement(localVarQueryParameters,keyPairQuery_packageName);
    }

    // query parameters
    char *keyQuery_packageVersion = NULL;
    char * valueQuery_packageVersion = NULL;
    keyValuePair_t *keyPairQuery_packageVersion = 0;
    if (packageVersion)
    {
        keyQuery_packageVersion = strdup("packageVersion");
        valueQuery_packageVersion = strdup((packageVersion));
        keyPairQuery_packageVersion = keyValuePair_create(keyQuery_packageVersion, valueQuery_packageVersion);
        list_addElement(localVarQueryParameters,keyPairQuery_packageVersion);
    }

    // query parameters
    char *keyQuery__charset_ = NULL;
    char * valueQuery__charset_ = NULL;
    keyValuePair_t *keyPairQuery__charset_ = 0;
    if (_charset_)
    {
        keyQuery__charset_ = strdup("_charset_");
        valueQuery__charset_ = strdup((_charset_));
        keyPairQuery__charset_ = keyValuePair_create(keyQuery__charset_, valueQuery__charset_);
        list_addElement(localVarQueryParameters,keyPairQuery__charset_);
    }

    // query parameters
    char *keyQuery_force = NULL;
    char * valueQuery_force = NULL;
    keyValuePair_t *keyPairQuery_force = 0;
    if (force)
    {
        keyQuery_force = strdup("force");
        valueQuery_force = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_force, MAX_NUMBER_LENGTH, "%d", *force);
        keyPairQuery_force = keyValuePair_create(keyQuery_force, valueQuery_force);
        list_addElement(localVarQueryParameters,keyPairQuery_force);
    }

    // query parameters
    char *keyQuery_recursive = NULL;
    char * valueQuery_recursive = NULL;
    keyValuePair_t *keyPairQuery_recursive = 0;
    if (recursive)
    {
        keyQuery_recursive = strdup("recursive");
        valueQuery_recursive = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_recursive, MAX_NUMBER_LENGTH, "%d", *recursive);
        keyPairQuery_recursive = keyValuePair_create(keyQuery_recursive, valueQuery_recursive);
        list_addElement(localVarQueryParameters,keyPairQuery_recursive);
    }

    // form parameters
    char *keyForm_package = NULL;
    binary_t* valueForm_package = 0;
    keyValuePair_t *keyPairForm_package = 0;
    if (package != NULL)
    {
        keyForm_package = strdup("package");
        valueForm_package = package;
        keyPairForm_package = keyValuePair_create(keyForm_package, &valueForm_package);
        list_addElement(localVarFormParameters,keyPairForm_package); //file adding
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"multipart/form-data"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Default response");
    //}
    //primitive return type simple string
    char* elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300)
        elementToReturn = strdup((char*)apiClient->dataReceived);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    list_freeList(localVarFormParameters);
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_path);
    if(keyQuery_cmd){
        free(keyQuery_cmd);
        keyQuery_cmd = NULL;
    }
    if(valueQuery_cmd){
        free(valueQuery_cmd);
        valueQuery_cmd = NULL;
    }
    if(keyPairQuery_cmd){
        keyValuePair_free(keyPairQuery_cmd);
        keyPairQuery_cmd = NULL;
    }
    if(keyQuery_groupName){
        free(keyQuery_groupName);
        keyQuery_groupName = NULL;
    }
    if(valueQuery_groupName){
        free(valueQuery_groupName);
        valueQuery_groupName = NULL;
    }
    if(keyPairQuery_groupName){
        keyValuePair_free(keyPairQuery_groupName);
        keyPairQuery_groupName = NULL;
    }
    if(keyQuery_packageName){
        free(keyQuery_packageName);
        keyQuery_packageName = NULL;
    }
    if(valueQuery_packageName){
        free(valueQuery_packageName);
        valueQuery_packageName = NULL;
    }
    if(keyPairQuery_packageName){
        keyValuePair_free(keyPairQuery_packageName);
        keyPairQuery_packageName = NULL;
    }
    if(keyQuery_packageVersion){
        free(keyQuery_packageVersion);
        keyQuery_packageVersion = NULL;
    }
    if(valueQuery_packageVersion){
        free(valueQuery_packageVersion);
        valueQuery_packageVersion = NULL;
    }
    if(keyPairQuery_packageVersion){
        keyValuePair_free(keyPairQuery_packageVersion);
        keyPairQuery_packageVersion = NULL;
    }
    if(keyQuery__charset_){
        free(keyQuery__charset_);
        keyQuery__charset_ = NULL;
    }
    if(valueQuery__charset_){
        free(valueQuery__charset_);
        valueQuery__charset_ = NULL;
    }
    if(keyPairQuery__charset_){
        keyValuePair_free(keyPairQuery__charset_);
        keyPairQuery__charset_ = NULL;
    }
    if(keyQuery_force){
        free(keyQuery_force);
        keyQuery_force = NULL;
    }
    if(valueQuery_force){
        free(valueQuery_force);
        valueQuery_force = NULL;
    }
    if(keyPairQuery_force){
        keyValuePair_free(keyPairQuery_force);
        keyPairQuery_force = NULL;
    }
    if(keyQuery_recursive){
        free(keyQuery_recursive);
        keyQuery_recursive = NULL;
    }
    if(valueQuery_recursive){
        free(valueQuery_recursive);
        valueQuery_recursive = NULL;
    }
    if(keyPairQuery_recursive){
        keyValuePair_free(keyPairQuery_recursive);
        keyPairQuery_recursive = NULL;
    }
    if (keyForm_package) {
        free(keyForm_package);
        keyForm_package = NULL;
    }
//    free(fileVar_package->data);
//    free(fileVar_package);
    free(keyPairForm_package);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

char*
CrxAPI_postPackageUpdate(apiClient_t *apiClient, char *groupName, char *packageName, char *version, char *path, char *filter, char *_charset_)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/crx/packmgr/update.jsp");





    // query parameters
    char *keyQuery_groupName = NULL;
    char * valueQuery_groupName = NULL;
    keyValuePair_t *keyPairQuery_groupName = 0;
    if (groupName)
    {
        keyQuery_groupName = strdup("groupName");
        valueQuery_groupName = strdup((groupName));
        keyPairQuery_groupName = keyValuePair_create(keyQuery_groupName, valueQuery_groupName);
        list_addElement(localVarQueryParameters,keyPairQuery_groupName);
    }

    // query parameters
    char *keyQuery_packageName = NULL;
    char * valueQuery_packageName = NULL;
    keyValuePair_t *keyPairQuery_packageName = 0;
    if (packageName)
    {
        keyQuery_packageName = strdup("packageName");
        valueQuery_packageName = strdup((packageName));
        keyPairQuery_packageName = keyValuePair_create(keyQuery_packageName, valueQuery_packageName);
        list_addElement(localVarQueryParameters,keyPairQuery_packageName);
    }

    // query parameters
    char *keyQuery_version = NULL;
    char * valueQuery_version = NULL;
    keyValuePair_t *keyPairQuery_version = 0;
    if (version)
    {
        keyQuery_version = strdup("version");
        valueQuery_version = strdup((version));
        keyPairQuery_version = keyValuePair_create(keyQuery_version, valueQuery_version);
        list_addElement(localVarQueryParameters,keyPairQuery_version);
    }

    // query parameters
    char *keyQuery_path = NULL;
    char * valueQuery_path = NULL;
    keyValuePair_t *keyPairQuery_path = 0;
    if (path)
    {
        keyQuery_path = strdup("path");
        valueQuery_path = strdup((path));
        keyPairQuery_path = keyValuePair_create(keyQuery_path, valueQuery_path);
        list_addElement(localVarQueryParameters,keyPairQuery_path);
    }

    // query parameters
    char *keyQuery_filter = NULL;
    char * valueQuery_filter = NULL;
    keyValuePair_t *keyPairQuery_filter = 0;
    if (filter)
    {
        keyQuery_filter = strdup("filter");
        valueQuery_filter = strdup((filter));
        keyPairQuery_filter = keyValuePair_create(keyQuery_filter, valueQuery_filter);
        list_addElement(localVarQueryParameters,keyPairQuery_filter);
    }

    // query parameters
    char *keyQuery__charset_ = NULL;
    char * valueQuery__charset_ = NULL;
    keyValuePair_t *keyPairQuery__charset_ = 0;
    if (_charset_)
    {
        keyQuery__charset_ = strdup("_charset_");
        valueQuery__charset_ = strdup((_charset_));
        keyPairQuery__charset_ = keyValuePair_create(keyQuery__charset_, valueQuery__charset_);
        list_addElement(localVarQueryParameters,keyPairQuery__charset_);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Default response");
    //}
    //primitive return type simple string
    char* elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300)
        elementToReturn = strdup((char*)apiClient->dataReceived);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_groupName){
        free(keyQuery_groupName);
        keyQuery_groupName = NULL;
    }
    if(valueQuery_groupName){
        free(valueQuery_groupName);
        valueQuery_groupName = NULL;
    }
    if(keyPairQuery_groupName){
        keyValuePair_free(keyPairQuery_groupName);
        keyPairQuery_groupName = NULL;
    }
    if(keyQuery_packageName){
        free(keyQuery_packageName);
        keyQuery_packageName = NULL;
    }
    if(valueQuery_packageName){
        free(valueQuery_packageName);
        valueQuery_packageName = NULL;
    }
    if(keyPairQuery_packageName){
        keyValuePair_free(keyPairQuery_packageName);
        keyPairQuery_packageName = NULL;
    }
    if(keyQuery_version){
        free(keyQuery_version);
        keyQuery_version = NULL;
    }
    if(valueQuery_version){
        free(valueQuery_version);
        valueQuery_version = NULL;
    }
    if(keyPairQuery_version){
        keyValuePair_free(keyPairQuery_version);
        keyPairQuery_version = NULL;
    }
    if(keyQuery_path){
        free(keyQuery_path);
        keyQuery_path = NULL;
    }
    if(valueQuery_path){
        free(valueQuery_path);
        valueQuery_path = NULL;
    }
    if(keyPairQuery_path){
        keyValuePair_free(keyPairQuery_path);
        keyPairQuery_path = NULL;
    }
    if(keyQuery_filter){
        free(keyQuery_filter);
        keyQuery_filter = NULL;
    }
    if(valueQuery_filter){
        free(valueQuery_filter);
        valueQuery_filter = NULL;
    }
    if(keyPairQuery_filter){
        keyValuePair_free(keyPairQuery_filter);
        keyPairQuery_filter = NULL;
    }
    if(keyQuery__charset_){
        free(keyQuery__charset_);
        keyQuery__charset_ = NULL;
    }
    if(valueQuery__charset_){
        free(valueQuery__charset_);
        valueQuery__charset_ = NULL;
    }
    if(keyPairQuery__charset_){
        keyValuePair_free(keyPairQuery__charset_);
        keyPairQuery__charset_ = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

char*
CrxAPI_postSetPassword(apiClient_t *apiClient, char *old, char *plain, char *verify)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/crx/explorer/ui/setpassword.jsp");





    // query parameters
    char *keyQuery_old = NULL;
    char * valueQuery_old = NULL;
    keyValuePair_t *keyPairQuery_old = 0;
    if (old)
    {
        keyQuery_old = strdup("old");
        valueQuery_old = strdup((old));
        keyPairQuery_old = keyValuePair_create(keyQuery_old, valueQuery_old);
        list_addElement(localVarQueryParameters,keyPairQuery_old);
    }

    // query parameters
    char *keyQuery_plain = NULL;
    char * valueQuery_plain = NULL;
    keyValuePair_t *keyPairQuery_plain = 0;
    if (plain)
    {
        keyQuery_plain = strdup("plain");
        valueQuery_plain = strdup((plain));
        keyPairQuery_plain = keyValuePair_create(keyQuery_plain, valueQuery_plain);
        list_addElement(localVarQueryParameters,keyPairQuery_plain);
    }

    // query parameters
    char *keyQuery_verify = NULL;
    char * valueQuery_verify = NULL;
    keyValuePair_t *keyPairQuery_verify = 0;
    if (verify)
    {
        keyQuery_verify = strdup("verify");
        valueQuery_verify = strdup((verify));
        keyPairQuery_verify = keyValuePair_create(keyQuery_verify, valueQuery_verify);
        list_addElement(localVarQueryParameters,keyPairQuery_verify);
    }
    list_addElement(localVarHeaderType,"text/plain"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Default response");
    //}
    //primitive return type simple string
    char* elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300)
        elementToReturn = strdup((char*)apiClient->dataReceived);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_old){
        free(keyQuery_old);
        keyQuery_old = NULL;
    }
    if(valueQuery_old){
        free(valueQuery_old);
        valueQuery_old = NULL;
    }
    if(keyPairQuery_old){
        keyValuePair_free(keyPairQuery_old);
        keyPairQuery_old = NULL;
    }
    if(keyQuery_plain){
        free(keyQuery_plain);
        keyQuery_plain = NULL;
    }
    if(valueQuery_plain){
        free(valueQuery_plain);
        valueQuery_plain = NULL;
    }
    if(keyPairQuery_plain){
        keyValuePair_free(keyPairQuery_plain);
        keyPairQuery_plain = NULL;
    }
    if(keyQuery_verify){
        free(keyQuery_verify);
        keyQuery_verify = NULL;
    }
    if(valueQuery_verify){
        free(valueQuery_verify);
        valueQuery_verify = NULL;
    }
    if(keyPairQuery_verify){
        keyValuePair_free(keyPairQuery_verify);
        keyPairQuery_verify = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}


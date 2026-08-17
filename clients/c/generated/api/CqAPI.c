#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "CqAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


char*
CqAPI_getLoginPage(apiClient_t *apiClient)
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
    char *localVarPath = strdup("/libs/granite/core/content/login.html");




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
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

void
CqAPI_postCqActions(apiClient_t *apiClient, char *authorizableId, char *changelog)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = NULL;
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/.cqactions.html");





    // query parameters
    char *keyQuery_authorizableId = NULL;
    char * valueQuery_authorizableId = NULL;
    keyValuePair_t *keyPairQuery_authorizableId = 0;
    if (authorizableId)
    {
        keyQuery_authorizableId = strdup("authorizableId");
        valueQuery_authorizableId = strdup((authorizableId));
        keyPairQuery_authorizableId = keyValuePair_create(keyQuery_authorizableId, valueQuery_authorizableId);
        list_addElement(localVarQueryParameters,keyPairQuery_authorizableId);
    }

    // query parameters
    char *keyQuery_changelog = NULL;
    char * valueQuery_changelog = NULL;
    keyValuePair_t *keyPairQuery_changelog = 0;
    if (changelog)
    {
        keyQuery_changelog = strdup("changelog");
        valueQuery_changelog = strdup((changelog));
        keyPairQuery_changelog = keyValuePair_create(keyQuery_changelog, valueQuery_changelog);
        list_addElement(localVarQueryParameters,keyPairQuery_changelog);
    }
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
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    
    
    free(localVarPath);
    if(keyQuery_authorizableId){
        free(keyQuery_authorizableId);
        keyQuery_authorizableId = NULL;
    }
    if(valueQuery_authorizableId){
        free(valueQuery_authorizableId);
        valueQuery_authorizableId = NULL;
    }
    if(keyPairQuery_authorizableId){
        keyValuePair_free(keyPairQuery_authorizableId);
        keyPairQuery_authorizableId = NULL;
    }
    if(keyQuery_authorizableId){
        free(keyQuery_authorizableId);
        keyQuery_authorizableId = NULL;
    }
    if(keyPairQuery_authorizableId){
        keyValuePair_free(keyPairQuery_authorizableId);
        keyPairQuery_authorizableId = NULL;
    }
    if(keyQuery_changelog){
        free(keyQuery_changelog);
        keyQuery_changelog = NULL;
    }
    if(valueQuery_changelog){
        free(valueQuery_changelog);
        valueQuery_changelog = NULL;
    }
    if(keyPairQuery_changelog){
        keyValuePair_free(keyPairQuery_changelog);
        keyPairQuery_changelog = NULL;
    }
    if(keyQuery_changelog){
        free(keyQuery_changelog);
        keyQuery_changelog = NULL;
    }
    if(keyPairQuery_changelog){
        keyValuePair_free(keyPairQuery_changelog);
        keyPairQuery_changelog = NULL;
    }

}


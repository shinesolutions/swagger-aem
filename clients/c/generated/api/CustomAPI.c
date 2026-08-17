#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "CustomAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


char*
CustomAPI_getAemHealthCheck(apiClient_t *apiClient, char *tags, int *combineTagsOr)
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
    char *localVarPath = strdup("/system/health");





    // query parameters
    char *keyQuery_tags = NULL;
    char * valueQuery_tags = NULL;
    keyValuePair_t *keyPairQuery_tags = 0;
    if (tags)
    {
        keyQuery_tags = strdup("tags");
        valueQuery_tags = strdup((tags));
        keyPairQuery_tags = keyValuePair_create(keyQuery_tags, valueQuery_tags);
        list_addElement(localVarQueryParameters,keyPairQuery_tags);
    }

    // query parameters
    char *keyQuery_combineTagsOr = NULL;
    char * valueQuery_combineTagsOr = NULL;
    keyValuePair_t *keyPairQuery_combineTagsOr = 0;
    if (combineTagsOr)
    {
        keyQuery_combineTagsOr = strdup("combineTagsOr");
        valueQuery_combineTagsOr = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_combineTagsOr, MAX_NUMBER_LENGTH, "%d", *combineTagsOr);
        keyPairQuery_combineTagsOr = keyValuePair_create(keyQuery_combineTagsOr, valueQuery_combineTagsOr);
        list_addElement(localVarQueryParameters,keyPairQuery_combineTagsOr);
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
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_tags){
        free(keyQuery_tags);
        keyQuery_tags = NULL;
    }
    if(valueQuery_tags){
        free(valueQuery_tags);
        valueQuery_tags = NULL;
    }
    if(keyPairQuery_tags){
        keyValuePair_free(keyPairQuery_tags);
        keyPairQuery_tags = NULL;
    }
    if(keyQuery_combineTagsOr){
        free(keyQuery_combineTagsOr);
        keyQuery_combineTagsOr = NULL;
    }
    if(valueQuery_combineTagsOr){
        free(valueQuery_combineTagsOr);
        valueQuery_combineTagsOr = NULL;
    }
    if(keyPairQuery_combineTagsOr){
        keyValuePair_free(keyPairQuery_combineTagsOr);
        keyPairQuery_combineTagsOr = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

void
CustomAPI_postConfigAemHealthCheckServlet(apiClient_t *apiClient, list_t *bundles.ignored, char *bundles.ignored@TypeHint)
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
    char *localVarPath = strdup("/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck");





    // query parameters
    if (bundles.ignored)
    {
        list_addElement(localVarQueryParameters,bundles.ignored);
    }

    // query parameters
    char *keyQuery_bundles.ignored@TypeHint = NULL;
    char * valueQuery_bundles.ignored@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_bundles.ignored@TypeHint = 0;
    if (bundles.ignored@TypeHint)
    {
        keyQuery_bundles.ignored@TypeHint = strdup("bundles.ignored@TypeHint");
        valueQuery_bundles.ignored@TypeHint = strdup((bundles.ignored@TypeHint));
        keyPairQuery_bundles.ignored@TypeHint = keyValuePair_create(keyQuery_bundles.ignored@TypeHint, valueQuery_bundles.ignored@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_bundles.ignored@TypeHint);
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
    if(keyQuery_bundles.ignored@TypeHint){
        free(keyQuery_bundles.ignored@TypeHint);
        keyQuery_bundles.ignored@TypeHint = NULL;
    }
    if(valueQuery_bundles.ignored@TypeHint){
        free(valueQuery_bundles.ignored@TypeHint);
        valueQuery_bundles.ignored@TypeHint = NULL;
    }
    if(keyPairQuery_bundles.ignored@TypeHint){
        keyValuePair_free(keyPairQuery_bundles.ignored@TypeHint);
        keyPairQuery_bundles.ignored@TypeHint = NULL;
    }
    if(keyQuery_bundles.ignored@TypeHint){
        free(keyQuery_bundles.ignored@TypeHint);
        keyQuery_bundles.ignored@TypeHint = NULL;
    }
    if(keyPairQuery_bundles.ignored@TypeHint){
        keyValuePair_free(keyPairQuery_bundles.ignored@TypeHint);
        keyPairQuery_bundles.ignored@TypeHint = NULL;
    }

}

void
CustomAPI_postConfigAemPasswordReset(apiClient_t *apiClient, list_t *pwdreset.authorizables, char *pwdreset.authorizables@TypeHint)
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
    char *localVarPath = strdup("/apps/system/config/com.shinesolutions.aem.passwordreset.Activator");





    // query parameters
    if (pwdreset.authorizables)
    {
        list_addElement(localVarQueryParameters,pwdreset.authorizables);
    }

    // query parameters
    char *keyQuery_pwdreset.authorizables@TypeHint = NULL;
    char * valueQuery_pwdreset.authorizables@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_pwdreset.authorizables@TypeHint = 0;
    if (pwdreset.authorizables@TypeHint)
    {
        keyQuery_pwdreset.authorizables@TypeHint = strdup("pwdreset.authorizables@TypeHint");
        valueQuery_pwdreset.authorizables@TypeHint = strdup((pwdreset.authorizables@TypeHint));
        keyPairQuery_pwdreset.authorizables@TypeHint = keyValuePair_create(keyQuery_pwdreset.authorizables@TypeHint, valueQuery_pwdreset.authorizables@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_pwdreset.authorizables@TypeHint);
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
    if(keyQuery_pwdreset.authorizables@TypeHint){
        free(keyQuery_pwdreset.authorizables@TypeHint);
        keyQuery_pwdreset.authorizables@TypeHint = NULL;
    }
    if(valueQuery_pwdreset.authorizables@TypeHint){
        free(valueQuery_pwdreset.authorizables@TypeHint);
        valueQuery_pwdreset.authorizables@TypeHint = NULL;
    }
    if(keyPairQuery_pwdreset.authorizables@TypeHint){
        keyValuePair_free(keyPairQuery_pwdreset.authorizables@TypeHint);
        keyPairQuery_pwdreset.authorizables@TypeHint = NULL;
    }
    if(keyQuery_pwdreset.authorizables@TypeHint){
        free(keyQuery_pwdreset.authorizables@TypeHint);
        keyQuery_pwdreset.authorizables@TypeHint = NULL;
    }
    if(keyPairQuery_pwdreset.authorizables@TypeHint){
        keyValuePair_free(keyPairQuery_pwdreset.authorizables@TypeHint);
        keyPairQuery_pwdreset.authorizables@TypeHint = NULL;
    }

}


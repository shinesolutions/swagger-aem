#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "ConsoleAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


list_t*
ConsoleAPI_getAemProductInfo(apiClient_t *apiClient)
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
    char *localVarPath = strdup("/system/console/status-productinfo.json");




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
    //primitive return type not simple
    list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *localVarJSON = cJSON_Parse(apiClient->dataReceived);
        cJSON *VarJSON;
        elementToReturn = list_createList();
        cJSON_ArrayForEach(VarJSON, localVarJSON){
            keyValuePair_t *keyPair = keyValuePair_create(strdup(VarJSON->string), cJSON_Print(VarJSON));
            list_addElement(elementToReturn, keyPair);
        }
        cJSON_Delete(localVarJSON);
    }

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

bundle_info_t*
ConsoleAPI_getBundleInfo(apiClient_t *apiClient, char *name)
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
    char *localVarPath = strdup("/system/console/bundles/{name}.json");

    if(!name)
        goto end;


    // Path Params
    long sizeOfPathParams_name = strlen(name)+3 + sizeof("{ name }") - 1;
    if(name == NULL) {
        goto end;
    }
    char* localVarToReplace_name = malloc(sizeOfPathParams_name);
    sprintf(localVarToReplace_name, "{%s}", "name");

    localVarPath = strReplace(localVarPath, localVarToReplace_name, name);


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
    //    printf("%s\n","Retrieved bundle info");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Default response");
    //}
    //nonprimitive not container
    bundle_info_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ConsoleAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = bundle_info_parseFromJSON(ConsoleAPIlocalVarJSON);
        cJSON_Delete(ConsoleAPIlocalVarJSON);
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
    free(localVarToReplace_name);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

char*
ConsoleAPI_getConfigMgr(apiClient_t *apiClient)
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
    char *localVarPath = strdup("/system/console/configMgr");




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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 5XX) {
    //    printf("%s\n","Unexpected error.");
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
ConsoleAPI_postBundle(apiClient_t *apiClient, char *name, char *action)
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
    char *localVarPath = strdup("/system/console/bundles/{name}");

    if(!name)
        goto end;


    // Path Params
    long sizeOfPathParams_name = strlen(name)+3 + sizeof("{ name }") - 1;
    if(name == NULL) {
        goto end;
    }
    char* localVarToReplace_name = malloc(sizeOfPathParams_name);
    sprintf(localVarToReplace_name, "{%s}", "name");

    localVarPath = strReplace(localVarPath, localVarToReplace_name, name);



    // query parameters
    char *keyQuery_action = NULL;
    char * valueQuery_action = NULL;
    keyValuePair_t *keyPairQuery_action = 0;
    if (action)
    {
        keyQuery_action = strdup("action");
        valueQuery_action = strdup((action));
        keyPairQuery_action = keyValuePair_create(keyQuery_action, valueQuery_action);
        list_addElement(localVarQueryParameters,keyPairQuery_action);
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
    free(localVarToReplace_name);
    if(keyQuery_action){
        free(keyQuery_action);
        keyQuery_action = NULL;
    }
    if(valueQuery_action){
        free(valueQuery_action);
        valueQuery_action = NULL;
    }
    if(keyPairQuery_action){
        keyValuePair_free(keyPairQuery_action);
        keyPairQuery_action = NULL;
    }
    if(keyQuery_action){
        free(keyQuery_action);
        keyQuery_action = NULL;
    }
    if(keyPairQuery_action){
        keyValuePair_free(keyPairQuery_action);
        keyPairQuery_action = NULL;
    }

}

void
ConsoleAPI_postJmxRepository(apiClient_t *apiClient, char *action)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = NULL;
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/system/console/jmx/com.adobe.granite:type=Repository/op/{action}");

    if(!action)
        goto end;


    // Path Params
    long sizeOfPathParams_action = strlen(action)+3 + sizeof("{ action }") - 1;
    if(action == NULL) {
        goto end;
    }
    char* localVarToReplace_action = malloc(sizeOfPathParams_action);
    sprintf(localVarToReplace_action, "{%s}", "action");

    localVarPath = strReplace(localVarPath, localVarToReplace_action, action);


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
    
    
    
    
    
    free(localVarPath);
    free(localVarToReplace_action);

}

saml_configuration_info_t*
ConsoleAPI_postSamlConfiguration(apiClient_t *apiClient, int *post, int *apply, int *_delete, char *action, char *$location, list_t *path, int *service.ranking, char *idpUrl, char *idpCertAlias, int *idpHttpRedirect, char *serviceProviderEntityId, char *assertionConsumerServiceURL, char *spPrivateKeyAlias, char *keyStorePassword, char *defaultRedirectUrl, char *userIDAttribute, int *useEncryption, int *createUser, int *addGroupMemberships, char *groupMembershipAttribute, list_t *defaultGroups, char *nameIdFormat, list_t *synchronizeAttributes, int *handleLogout, char *logoutUrl, int *clockTolerance, char *digestMethod, char *signatureMethod, char *userIntermediatePath, list_t *propertylist)
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
    char *localVarPath = strdup("/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler");





    // query parameters
    char *keyQuery_post = NULL;
    char * valueQuery_post = NULL;
    keyValuePair_t *keyPairQuery_post = 0;
    if (post)
    {
        keyQuery_post = strdup("post");
        valueQuery_post = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_post, MAX_NUMBER_LENGTH, "%d", *post);
        keyPairQuery_post = keyValuePair_create(keyQuery_post, valueQuery_post);
        list_addElement(localVarQueryParameters,keyPairQuery_post);
    }

    // query parameters
    char *keyQuery_apply = NULL;
    char * valueQuery_apply = NULL;
    keyValuePair_t *keyPairQuery_apply = 0;
    if (apply)
    {
        keyQuery_apply = strdup("apply");
        valueQuery_apply = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_apply, MAX_NUMBER_LENGTH, "%d", *apply);
        keyPairQuery_apply = keyValuePair_create(keyQuery_apply, valueQuery_apply);
        list_addElement(localVarQueryParameters,keyPairQuery_apply);
    }

    // query parameters
    char *keyQuery__delete = NULL;
    char * valueQuery__delete = NULL;
    keyValuePair_t *keyPairQuery__delete = 0;
    if (_delete)
    {
        keyQuery__delete = strdup("delete");
        valueQuery__delete = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery__delete, MAX_NUMBER_LENGTH, "%d", *_delete);
        keyPairQuery__delete = keyValuePair_create(keyQuery__delete, valueQuery__delete);
        list_addElement(localVarQueryParameters,keyPairQuery__delete);
    }

    // query parameters
    char *keyQuery_action = NULL;
    char * valueQuery_action = NULL;
    keyValuePair_t *keyPairQuery_action = 0;
    if (action)
    {
        keyQuery_action = strdup("action");
        valueQuery_action = strdup((action));
        keyPairQuery_action = keyValuePair_create(keyQuery_action, valueQuery_action);
        list_addElement(localVarQueryParameters,keyPairQuery_action);
    }

    // query parameters
    char *keyQuery_$location = NULL;
    char * valueQuery_$location = NULL;
    keyValuePair_t *keyPairQuery_$location = 0;
    if ($location)
    {
        keyQuery_$location = strdup("$location");
        valueQuery_$location = strdup(($location));
        keyPairQuery_$location = keyValuePair_create(keyQuery_$location, valueQuery_$location);
        list_addElement(localVarQueryParameters,keyPairQuery_$location);
    }

    // query parameters
    if (path)
    {
        list_addElement(localVarQueryParameters,path);
    }

    // query parameters
    char *keyQuery_service.ranking = NULL;
    char * valueQuery_service.ranking = NULL;
    keyValuePair_t *keyPairQuery_service.ranking = 0;
    if (service.ranking)
    {
        keyQuery_service.ranking = strdup("service.ranking");
        valueQuery_service.ranking = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_service.ranking, MAX_NUMBER_LENGTH, "%d", *service.ranking);
        keyPairQuery_service.ranking = keyValuePair_create(keyQuery_service.ranking, valueQuery_service.ranking);
        list_addElement(localVarQueryParameters,keyPairQuery_service.ranking);
    }

    // query parameters
    char *keyQuery_idpUrl = NULL;
    char * valueQuery_idpUrl = NULL;
    keyValuePair_t *keyPairQuery_idpUrl = 0;
    if (idpUrl)
    {
        keyQuery_idpUrl = strdup("idpUrl");
        valueQuery_idpUrl = strdup((idpUrl));
        keyPairQuery_idpUrl = keyValuePair_create(keyQuery_idpUrl, valueQuery_idpUrl);
        list_addElement(localVarQueryParameters,keyPairQuery_idpUrl);
    }

    // query parameters
    char *keyQuery_idpCertAlias = NULL;
    char * valueQuery_idpCertAlias = NULL;
    keyValuePair_t *keyPairQuery_idpCertAlias = 0;
    if (idpCertAlias)
    {
        keyQuery_idpCertAlias = strdup("idpCertAlias");
        valueQuery_idpCertAlias = strdup((idpCertAlias));
        keyPairQuery_idpCertAlias = keyValuePair_create(keyQuery_idpCertAlias, valueQuery_idpCertAlias);
        list_addElement(localVarQueryParameters,keyPairQuery_idpCertAlias);
    }

    // query parameters
    char *keyQuery_idpHttpRedirect = NULL;
    char * valueQuery_idpHttpRedirect = NULL;
    keyValuePair_t *keyPairQuery_idpHttpRedirect = 0;
    if (idpHttpRedirect)
    {
        keyQuery_idpHttpRedirect = strdup("idpHttpRedirect");
        valueQuery_idpHttpRedirect = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_idpHttpRedirect, MAX_NUMBER_LENGTH, "%d", *idpHttpRedirect);
        keyPairQuery_idpHttpRedirect = keyValuePair_create(keyQuery_idpHttpRedirect, valueQuery_idpHttpRedirect);
        list_addElement(localVarQueryParameters,keyPairQuery_idpHttpRedirect);
    }

    // query parameters
    char *keyQuery_serviceProviderEntityId = NULL;
    char * valueQuery_serviceProviderEntityId = NULL;
    keyValuePair_t *keyPairQuery_serviceProviderEntityId = 0;
    if (serviceProviderEntityId)
    {
        keyQuery_serviceProviderEntityId = strdup("serviceProviderEntityId");
        valueQuery_serviceProviderEntityId = strdup((serviceProviderEntityId));
        keyPairQuery_serviceProviderEntityId = keyValuePair_create(keyQuery_serviceProviderEntityId, valueQuery_serviceProviderEntityId);
        list_addElement(localVarQueryParameters,keyPairQuery_serviceProviderEntityId);
    }

    // query parameters
    char *keyQuery_assertionConsumerServiceURL = NULL;
    char * valueQuery_assertionConsumerServiceURL = NULL;
    keyValuePair_t *keyPairQuery_assertionConsumerServiceURL = 0;
    if (assertionConsumerServiceURL)
    {
        keyQuery_assertionConsumerServiceURL = strdup("assertionConsumerServiceURL");
        valueQuery_assertionConsumerServiceURL = strdup((assertionConsumerServiceURL));
        keyPairQuery_assertionConsumerServiceURL = keyValuePair_create(keyQuery_assertionConsumerServiceURL, valueQuery_assertionConsumerServiceURL);
        list_addElement(localVarQueryParameters,keyPairQuery_assertionConsumerServiceURL);
    }

    // query parameters
    char *keyQuery_spPrivateKeyAlias = NULL;
    char * valueQuery_spPrivateKeyAlias = NULL;
    keyValuePair_t *keyPairQuery_spPrivateKeyAlias = 0;
    if (spPrivateKeyAlias)
    {
        keyQuery_spPrivateKeyAlias = strdup("spPrivateKeyAlias");
        valueQuery_spPrivateKeyAlias = strdup((spPrivateKeyAlias));
        keyPairQuery_spPrivateKeyAlias = keyValuePair_create(keyQuery_spPrivateKeyAlias, valueQuery_spPrivateKeyAlias);
        list_addElement(localVarQueryParameters,keyPairQuery_spPrivateKeyAlias);
    }

    // query parameters
    char *keyQuery_keyStorePassword = NULL;
    char * valueQuery_keyStorePassword = NULL;
    keyValuePair_t *keyPairQuery_keyStorePassword = 0;
    if (keyStorePassword)
    {
        keyQuery_keyStorePassword = strdup("keyStorePassword");
        valueQuery_keyStorePassword = strdup((keyStorePassword));
        keyPairQuery_keyStorePassword = keyValuePair_create(keyQuery_keyStorePassword, valueQuery_keyStorePassword);
        list_addElement(localVarQueryParameters,keyPairQuery_keyStorePassword);
    }

    // query parameters
    char *keyQuery_defaultRedirectUrl = NULL;
    char * valueQuery_defaultRedirectUrl = NULL;
    keyValuePair_t *keyPairQuery_defaultRedirectUrl = 0;
    if (defaultRedirectUrl)
    {
        keyQuery_defaultRedirectUrl = strdup("defaultRedirectUrl");
        valueQuery_defaultRedirectUrl = strdup((defaultRedirectUrl));
        keyPairQuery_defaultRedirectUrl = keyValuePair_create(keyQuery_defaultRedirectUrl, valueQuery_defaultRedirectUrl);
        list_addElement(localVarQueryParameters,keyPairQuery_defaultRedirectUrl);
    }

    // query parameters
    char *keyQuery_userIDAttribute = NULL;
    char * valueQuery_userIDAttribute = NULL;
    keyValuePair_t *keyPairQuery_userIDAttribute = 0;
    if (userIDAttribute)
    {
        keyQuery_userIDAttribute = strdup("userIDAttribute");
        valueQuery_userIDAttribute = strdup((userIDAttribute));
        keyPairQuery_userIDAttribute = keyValuePair_create(keyQuery_userIDAttribute, valueQuery_userIDAttribute);
        list_addElement(localVarQueryParameters,keyPairQuery_userIDAttribute);
    }

    // query parameters
    char *keyQuery_useEncryption = NULL;
    char * valueQuery_useEncryption = NULL;
    keyValuePair_t *keyPairQuery_useEncryption = 0;
    if (useEncryption)
    {
        keyQuery_useEncryption = strdup("useEncryption");
        valueQuery_useEncryption = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_useEncryption, MAX_NUMBER_LENGTH, "%d", *useEncryption);
        keyPairQuery_useEncryption = keyValuePair_create(keyQuery_useEncryption, valueQuery_useEncryption);
        list_addElement(localVarQueryParameters,keyPairQuery_useEncryption);
    }

    // query parameters
    char *keyQuery_createUser = NULL;
    char * valueQuery_createUser = NULL;
    keyValuePair_t *keyPairQuery_createUser = 0;
    if (createUser)
    {
        keyQuery_createUser = strdup("createUser");
        valueQuery_createUser = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_createUser, MAX_NUMBER_LENGTH, "%d", *createUser);
        keyPairQuery_createUser = keyValuePair_create(keyQuery_createUser, valueQuery_createUser);
        list_addElement(localVarQueryParameters,keyPairQuery_createUser);
    }

    // query parameters
    char *keyQuery_addGroupMemberships = NULL;
    char * valueQuery_addGroupMemberships = NULL;
    keyValuePair_t *keyPairQuery_addGroupMemberships = 0;
    if (addGroupMemberships)
    {
        keyQuery_addGroupMemberships = strdup("addGroupMemberships");
        valueQuery_addGroupMemberships = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_addGroupMemberships, MAX_NUMBER_LENGTH, "%d", *addGroupMemberships);
        keyPairQuery_addGroupMemberships = keyValuePair_create(keyQuery_addGroupMemberships, valueQuery_addGroupMemberships);
        list_addElement(localVarQueryParameters,keyPairQuery_addGroupMemberships);
    }

    // query parameters
    char *keyQuery_groupMembershipAttribute = NULL;
    char * valueQuery_groupMembershipAttribute = NULL;
    keyValuePair_t *keyPairQuery_groupMembershipAttribute = 0;
    if (groupMembershipAttribute)
    {
        keyQuery_groupMembershipAttribute = strdup("groupMembershipAttribute");
        valueQuery_groupMembershipAttribute = strdup((groupMembershipAttribute));
        keyPairQuery_groupMembershipAttribute = keyValuePair_create(keyQuery_groupMembershipAttribute, valueQuery_groupMembershipAttribute);
        list_addElement(localVarQueryParameters,keyPairQuery_groupMembershipAttribute);
    }

    // query parameters
    if (defaultGroups)
    {
        list_addElement(localVarQueryParameters,defaultGroups);
    }

    // query parameters
    char *keyQuery_nameIdFormat = NULL;
    char * valueQuery_nameIdFormat = NULL;
    keyValuePair_t *keyPairQuery_nameIdFormat = 0;
    if (nameIdFormat)
    {
        keyQuery_nameIdFormat = strdup("nameIdFormat");
        valueQuery_nameIdFormat = strdup((nameIdFormat));
        keyPairQuery_nameIdFormat = keyValuePair_create(keyQuery_nameIdFormat, valueQuery_nameIdFormat);
        list_addElement(localVarQueryParameters,keyPairQuery_nameIdFormat);
    }

    // query parameters
    if (synchronizeAttributes)
    {
        list_addElement(localVarQueryParameters,synchronizeAttributes);
    }

    // query parameters
    char *keyQuery_handleLogout = NULL;
    char * valueQuery_handleLogout = NULL;
    keyValuePair_t *keyPairQuery_handleLogout = 0;
    if (handleLogout)
    {
        keyQuery_handleLogout = strdup("handleLogout");
        valueQuery_handleLogout = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_handleLogout, MAX_NUMBER_LENGTH, "%d", *handleLogout);
        keyPairQuery_handleLogout = keyValuePair_create(keyQuery_handleLogout, valueQuery_handleLogout);
        list_addElement(localVarQueryParameters,keyPairQuery_handleLogout);
    }

    // query parameters
    char *keyQuery_logoutUrl = NULL;
    char * valueQuery_logoutUrl = NULL;
    keyValuePair_t *keyPairQuery_logoutUrl = 0;
    if (logoutUrl)
    {
        keyQuery_logoutUrl = strdup("logoutUrl");
        valueQuery_logoutUrl = strdup((logoutUrl));
        keyPairQuery_logoutUrl = keyValuePair_create(keyQuery_logoutUrl, valueQuery_logoutUrl);
        list_addElement(localVarQueryParameters,keyPairQuery_logoutUrl);
    }

    // query parameters
    char *keyQuery_clockTolerance = NULL;
    char * valueQuery_clockTolerance = NULL;
    keyValuePair_t *keyPairQuery_clockTolerance = 0;
    if (clockTolerance)
    {
        keyQuery_clockTolerance = strdup("clockTolerance");
        valueQuery_clockTolerance = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_clockTolerance, MAX_NUMBER_LENGTH, "%d", *clockTolerance);
        keyPairQuery_clockTolerance = keyValuePair_create(keyQuery_clockTolerance, valueQuery_clockTolerance);
        list_addElement(localVarQueryParameters,keyPairQuery_clockTolerance);
    }

    // query parameters
    char *keyQuery_digestMethod = NULL;
    char * valueQuery_digestMethod = NULL;
    keyValuePair_t *keyPairQuery_digestMethod = 0;
    if (digestMethod)
    {
        keyQuery_digestMethod = strdup("digestMethod");
        valueQuery_digestMethod = strdup((digestMethod));
        keyPairQuery_digestMethod = keyValuePair_create(keyQuery_digestMethod, valueQuery_digestMethod);
        list_addElement(localVarQueryParameters,keyPairQuery_digestMethod);
    }

    // query parameters
    char *keyQuery_signatureMethod = NULL;
    char * valueQuery_signatureMethod = NULL;
    keyValuePair_t *keyPairQuery_signatureMethod = 0;
    if (signatureMethod)
    {
        keyQuery_signatureMethod = strdup("signatureMethod");
        valueQuery_signatureMethod = strdup((signatureMethod));
        keyPairQuery_signatureMethod = keyValuePair_create(keyQuery_signatureMethod, valueQuery_signatureMethod);
        list_addElement(localVarQueryParameters,keyPairQuery_signatureMethod);
    }

    // query parameters
    char *keyQuery_userIntermediatePath = NULL;
    char * valueQuery_userIntermediatePath = NULL;
    keyValuePair_t *keyPairQuery_userIntermediatePath = 0;
    if (userIntermediatePath)
    {
        keyQuery_userIntermediatePath = strdup("userIntermediatePath");
        valueQuery_userIntermediatePath = strdup((userIntermediatePath));
        keyPairQuery_userIntermediatePath = keyValuePair_create(keyQuery_userIntermediatePath, valueQuery_userIntermediatePath);
        list_addElement(localVarQueryParameters,keyPairQuery_userIntermediatePath);
    }

    // query parameters
    if (propertylist)
    {
        list_addElement(localVarQueryParameters,propertylist);
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
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Retrieved AEM SAML Configuration");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 302) {
    //    printf("%s\n","Default response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Default response");
    //}
    //nonprimitive not container
    saml_configuration_info_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ConsoleAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = saml_configuration_info_parseFromJSON(ConsoleAPIlocalVarJSON);
        cJSON_Delete(ConsoleAPIlocalVarJSON);
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
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_post){
        free(keyQuery_post);
        keyQuery_post = NULL;
    }
    if(valueQuery_post){
        free(valueQuery_post);
        valueQuery_post = NULL;
    }
    if(keyPairQuery_post){
        keyValuePair_free(keyPairQuery_post);
        keyPairQuery_post = NULL;
    }
    if(keyQuery_apply){
        free(keyQuery_apply);
        keyQuery_apply = NULL;
    }
    if(valueQuery_apply){
        free(valueQuery_apply);
        valueQuery_apply = NULL;
    }
    if(keyPairQuery_apply){
        keyValuePair_free(keyPairQuery_apply);
        keyPairQuery_apply = NULL;
    }
    if(keyQuery__delete){
        free(keyQuery__delete);
        keyQuery__delete = NULL;
    }
    if(valueQuery__delete){
        free(valueQuery__delete);
        valueQuery__delete = NULL;
    }
    if(keyPairQuery__delete){
        keyValuePair_free(keyPairQuery__delete);
        keyPairQuery__delete = NULL;
    }
    if(keyQuery_action){
        free(keyQuery_action);
        keyQuery_action = NULL;
    }
    if(valueQuery_action){
        free(valueQuery_action);
        valueQuery_action = NULL;
    }
    if(keyPairQuery_action){
        keyValuePair_free(keyPairQuery_action);
        keyPairQuery_action = NULL;
    }
    if(keyQuery_$location){
        free(keyQuery_$location);
        keyQuery_$location = NULL;
    }
    if(valueQuery_$location){
        free(valueQuery_$location);
        valueQuery_$location = NULL;
    }
    if(keyPairQuery_$location){
        keyValuePair_free(keyPairQuery_$location);
        keyPairQuery_$location = NULL;
    }
    if(keyQuery_service.ranking){
        free(keyQuery_service.ranking);
        keyQuery_service.ranking = NULL;
    }
    if(valueQuery_service.ranking){
        free(valueQuery_service.ranking);
        valueQuery_service.ranking = NULL;
    }
    if(keyPairQuery_service.ranking){
        keyValuePair_free(keyPairQuery_service.ranking);
        keyPairQuery_service.ranking = NULL;
    }
    if(keyQuery_idpUrl){
        free(keyQuery_idpUrl);
        keyQuery_idpUrl = NULL;
    }
    if(valueQuery_idpUrl){
        free(valueQuery_idpUrl);
        valueQuery_idpUrl = NULL;
    }
    if(keyPairQuery_idpUrl){
        keyValuePair_free(keyPairQuery_idpUrl);
        keyPairQuery_idpUrl = NULL;
    }
    if(keyQuery_idpCertAlias){
        free(keyQuery_idpCertAlias);
        keyQuery_idpCertAlias = NULL;
    }
    if(valueQuery_idpCertAlias){
        free(valueQuery_idpCertAlias);
        valueQuery_idpCertAlias = NULL;
    }
    if(keyPairQuery_idpCertAlias){
        keyValuePair_free(keyPairQuery_idpCertAlias);
        keyPairQuery_idpCertAlias = NULL;
    }
    if(keyQuery_idpHttpRedirect){
        free(keyQuery_idpHttpRedirect);
        keyQuery_idpHttpRedirect = NULL;
    }
    if(valueQuery_idpHttpRedirect){
        free(valueQuery_idpHttpRedirect);
        valueQuery_idpHttpRedirect = NULL;
    }
    if(keyPairQuery_idpHttpRedirect){
        keyValuePair_free(keyPairQuery_idpHttpRedirect);
        keyPairQuery_idpHttpRedirect = NULL;
    }
    if(keyQuery_serviceProviderEntityId){
        free(keyQuery_serviceProviderEntityId);
        keyQuery_serviceProviderEntityId = NULL;
    }
    if(valueQuery_serviceProviderEntityId){
        free(valueQuery_serviceProviderEntityId);
        valueQuery_serviceProviderEntityId = NULL;
    }
    if(keyPairQuery_serviceProviderEntityId){
        keyValuePair_free(keyPairQuery_serviceProviderEntityId);
        keyPairQuery_serviceProviderEntityId = NULL;
    }
    if(keyQuery_assertionConsumerServiceURL){
        free(keyQuery_assertionConsumerServiceURL);
        keyQuery_assertionConsumerServiceURL = NULL;
    }
    if(valueQuery_assertionConsumerServiceURL){
        free(valueQuery_assertionConsumerServiceURL);
        valueQuery_assertionConsumerServiceURL = NULL;
    }
    if(keyPairQuery_assertionConsumerServiceURL){
        keyValuePair_free(keyPairQuery_assertionConsumerServiceURL);
        keyPairQuery_assertionConsumerServiceURL = NULL;
    }
    if(keyQuery_spPrivateKeyAlias){
        free(keyQuery_spPrivateKeyAlias);
        keyQuery_spPrivateKeyAlias = NULL;
    }
    if(valueQuery_spPrivateKeyAlias){
        free(valueQuery_spPrivateKeyAlias);
        valueQuery_spPrivateKeyAlias = NULL;
    }
    if(keyPairQuery_spPrivateKeyAlias){
        keyValuePair_free(keyPairQuery_spPrivateKeyAlias);
        keyPairQuery_spPrivateKeyAlias = NULL;
    }
    if(keyQuery_keyStorePassword){
        free(keyQuery_keyStorePassword);
        keyQuery_keyStorePassword = NULL;
    }
    if(valueQuery_keyStorePassword){
        free(valueQuery_keyStorePassword);
        valueQuery_keyStorePassword = NULL;
    }
    if(keyPairQuery_keyStorePassword){
        keyValuePair_free(keyPairQuery_keyStorePassword);
        keyPairQuery_keyStorePassword = NULL;
    }
    if(keyQuery_defaultRedirectUrl){
        free(keyQuery_defaultRedirectUrl);
        keyQuery_defaultRedirectUrl = NULL;
    }
    if(valueQuery_defaultRedirectUrl){
        free(valueQuery_defaultRedirectUrl);
        valueQuery_defaultRedirectUrl = NULL;
    }
    if(keyPairQuery_defaultRedirectUrl){
        keyValuePair_free(keyPairQuery_defaultRedirectUrl);
        keyPairQuery_defaultRedirectUrl = NULL;
    }
    if(keyQuery_userIDAttribute){
        free(keyQuery_userIDAttribute);
        keyQuery_userIDAttribute = NULL;
    }
    if(valueQuery_userIDAttribute){
        free(valueQuery_userIDAttribute);
        valueQuery_userIDAttribute = NULL;
    }
    if(keyPairQuery_userIDAttribute){
        keyValuePair_free(keyPairQuery_userIDAttribute);
        keyPairQuery_userIDAttribute = NULL;
    }
    if(keyQuery_useEncryption){
        free(keyQuery_useEncryption);
        keyQuery_useEncryption = NULL;
    }
    if(valueQuery_useEncryption){
        free(valueQuery_useEncryption);
        valueQuery_useEncryption = NULL;
    }
    if(keyPairQuery_useEncryption){
        keyValuePair_free(keyPairQuery_useEncryption);
        keyPairQuery_useEncryption = NULL;
    }
    if(keyQuery_createUser){
        free(keyQuery_createUser);
        keyQuery_createUser = NULL;
    }
    if(valueQuery_createUser){
        free(valueQuery_createUser);
        valueQuery_createUser = NULL;
    }
    if(keyPairQuery_createUser){
        keyValuePair_free(keyPairQuery_createUser);
        keyPairQuery_createUser = NULL;
    }
    if(keyQuery_addGroupMemberships){
        free(keyQuery_addGroupMemberships);
        keyQuery_addGroupMemberships = NULL;
    }
    if(valueQuery_addGroupMemberships){
        free(valueQuery_addGroupMemberships);
        valueQuery_addGroupMemberships = NULL;
    }
    if(keyPairQuery_addGroupMemberships){
        keyValuePair_free(keyPairQuery_addGroupMemberships);
        keyPairQuery_addGroupMemberships = NULL;
    }
    if(keyQuery_groupMembershipAttribute){
        free(keyQuery_groupMembershipAttribute);
        keyQuery_groupMembershipAttribute = NULL;
    }
    if(valueQuery_groupMembershipAttribute){
        free(valueQuery_groupMembershipAttribute);
        valueQuery_groupMembershipAttribute = NULL;
    }
    if(keyPairQuery_groupMembershipAttribute){
        keyValuePair_free(keyPairQuery_groupMembershipAttribute);
        keyPairQuery_groupMembershipAttribute = NULL;
    }
    if(keyQuery_nameIdFormat){
        free(keyQuery_nameIdFormat);
        keyQuery_nameIdFormat = NULL;
    }
    if(valueQuery_nameIdFormat){
        free(valueQuery_nameIdFormat);
        valueQuery_nameIdFormat = NULL;
    }
    if(keyPairQuery_nameIdFormat){
        keyValuePair_free(keyPairQuery_nameIdFormat);
        keyPairQuery_nameIdFormat = NULL;
    }
    if(keyQuery_handleLogout){
        free(keyQuery_handleLogout);
        keyQuery_handleLogout = NULL;
    }
    if(valueQuery_handleLogout){
        free(valueQuery_handleLogout);
        valueQuery_handleLogout = NULL;
    }
    if(keyPairQuery_handleLogout){
        keyValuePair_free(keyPairQuery_handleLogout);
        keyPairQuery_handleLogout = NULL;
    }
    if(keyQuery_logoutUrl){
        free(keyQuery_logoutUrl);
        keyQuery_logoutUrl = NULL;
    }
    if(valueQuery_logoutUrl){
        free(valueQuery_logoutUrl);
        valueQuery_logoutUrl = NULL;
    }
    if(keyPairQuery_logoutUrl){
        keyValuePair_free(keyPairQuery_logoutUrl);
        keyPairQuery_logoutUrl = NULL;
    }
    if(keyQuery_clockTolerance){
        free(keyQuery_clockTolerance);
        keyQuery_clockTolerance = NULL;
    }
    if(valueQuery_clockTolerance){
        free(valueQuery_clockTolerance);
        valueQuery_clockTolerance = NULL;
    }
    if(keyPairQuery_clockTolerance){
        keyValuePair_free(keyPairQuery_clockTolerance);
        keyPairQuery_clockTolerance = NULL;
    }
    if(keyQuery_digestMethod){
        free(keyQuery_digestMethod);
        keyQuery_digestMethod = NULL;
    }
    if(valueQuery_digestMethod){
        free(valueQuery_digestMethod);
        valueQuery_digestMethod = NULL;
    }
    if(keyPairQuery_digestMethod){
        keyValuePair_free(keyPairQuery_digestMethod);
        keyPairQuery_digestMethod = NULL;
    }
    if(keyQuery_signatureMethod){
        free(keyQuery_signatureMethod);
        keyQuery_signatureMethod = NULL;
    }
    if(valueQuery_signatureMethod){
        free(valueQuery_signatureMethod);
        valueQuery_signatureMethod = NULL;
    }
    if(keyPairQuery_signatureMethod){
        keyValuePair_free(keyPairQuery_signatureMethod);
        keyPairQuery_signatureMethod = NULL;
    }
    if(keyQuery_userIntermediatePath){
        free(keyQuery_userIntermediatePath);
        keyQuery_userIntermediatePath = NULL;
    }
    if(valueQuery_userIntermediatePath){
        free(valueQuery_userIntermediatePath);
        valueQuery_userIntermediatePath = NULL;
    }
    if(keyPairQuery_userIntermediatePath){
        keyValuePair_free(keyPairQuery_userIntermediatePath);
        keyPairQuery_userIntermediatePath = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}


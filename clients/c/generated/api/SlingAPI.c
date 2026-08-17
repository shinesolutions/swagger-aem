#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "SlingAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


void
SlingAPI_deleteAgent(apiClient_t *apiClient, char *runmode, char *name)
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
    char *localVarPath = strdup("/etc/replication/agents.{runmode}/{name}");

    if(!runmode)
        goto end;
    if(!name)
        goto end;


    // Path Params
    long sizeOfPathParams_runmode = strlen(runmode)+3 + strlen(name)+3 + sizeof("{ runmode }") - 1;
    if(runmode == NULL) {
        goto end;
    }
    char* localVarToReplace_runmode = malloc(sizeOfPathParams_runmode);
    sprintf(localVarToReplace_runmode, "{%s}", "runmode");

    localVarPath = strReplace(localVarPath, localVarToReplace_runmode, runmode);

    // Path Params
    long sizeOfPathParams_name = strlen(runmode)+3 + strlen(name)+3 + sizeof("{ name }") - 1;
    if(name == NULL) {
        goto end;
    }
    char* localVarToReplace_name = malloc(sizeOfPathParams_name);
    sprintf(localVarToReplace_name, "{%s}", "name");

    localVarPath = strReplace(localVarPath, localVarToReplace_name, name);


    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "DELETE");

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
    free(localVarToReplace_runmode);
    free(localVarToReplace_name);

}

void
SlingAPI_deleteNode(apiClient_t *apiClient, char *path, char *name)
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
    char *localVarPath = strdup("/{path}/{name}");

    if(!path)
        goto end;
    if(!name)
        goto end;


    // Path Params
    long sizeOfPathParams_path = strlen(path)+3 + strlen(name)+3 + sizeof("{ path }") - 1;
    if(path == NULL) {
        goto end;
    }
    char* localVarToReplace_path = malloc(sizeOfPathParams_path);
    sprintf(localVarToReplace_path, "{%s}", "path");

    localVarPath = strReplace(localVarPath, localVarToReplace_path, path);

    // Path Params
    long sizeOfPathParams_name = strlen(path)+3 + strlen(name)+3 + sizeof("{ name }") - 1;
    if(name == NULL) {
        goto end;
    }
    char* localVarToReplace_name = malloc(sizeOfPathParams_name);
    sprintf(localVarToReplace_name, "{%s}", "name");

    localVarPath = strReplace(localVarPath, localVarToReplace_name, name);


    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "DELETE");

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
    free(localVarToReplace_path);
    free(localVarToReplace_name);

}

void
SlingAPI_getAgent(apiClient_t *apiClient, char *runmode, char *name)
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
    char *localVarPath = strdup("/etc/replication/agents.{runmode}/{name}");

    if(!runmode)
        goto end;
    if(!name)
        goto end;


    // Path Params
    long sizeOfPathParams_runmode = strlen(runmode)+3 + strlen(name)+3 + sizeof("{ runmode }") - 1;
    if(runmode == NULL) {
        goto end;
    }
    char* localVarToReplace_runmode = malloc(sizeOfPathParams_runmode);
    sprintf(localVarToReplace_runmode, "{%s}", "runmode");

    localVarPath = strReplace(localVarPath, localVarToReplace_runmode, runmode);

    // Path Params
    long sizeOfPathParams_name = strlen(runmode)+3 + strlen(name)+3 + sizeof("{ name }") - 1;
    if(name == NULL) {
        goto end;
    }
    char* localVarToReplace_name = malloc(sizeOfPathParams_name);
    sprintf(localVarToReplace_name, "{%s}", "name");

    localVarPath = strReplace(localVarPath, localVarToReplace_name, name);


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
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    
    
    free(localVarPath);
    free(localVarToReplace_runmode);
    free(localVarToReplace_name);

}

char*
SlingAPI_getAgents(apiClient_t *apiClient, char *runmode)
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
    char *localVarPath = strdup("/etc/replication/agents.{runmode}.-1.json");

    if(!runmode)
        goto end;


    // Path Params
    long sizeOfPathParams_runmode = strlen(runmode)+3 + sizeof("{ runmode }") - 1;
    if(runmode == NULL) {
        goto end;
    }
    char* localVarToReplace_runmode = malloc(sizeOfPathParams_runmode);
    sprintf(localVarToReplace_runmode, "{%s}", "runmode");

    localVarPath = strReplace(localVarPath, localVarToReplace_runmode, runmode);


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
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_runmode);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

keystore_info_t*
SlingAPI_getAuthorizableKeystore(apiClient_t *apiClient, char *intermediatePath, char *authorizableId)
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
    char *localVarPath = strdup("/{intermediatePath}/{authorizableId}.ks.json");

    if(!intermediatePath)
        goto end;
    if(!authorizableId)
        goto end;


    // Path Params
    long sizeOfPathParams_intermediatePath = strlen(intermediatePath)+3 + strlen(authorizableId)+3 + sizeof("{ intermediatePath }") - 1;
    if(intermediatePath == NULL) {
        goto end;
    }
    char* localVarToReplace_intermediatePath = malloc(sizeOfPathParams_intermediatePath);
    sprintf(localVarToReplace_intermediatePath, "{%s}", "intermediatePath");

    localVarPath = strReplace(localVarPath, localVarToReplace_intermediatePath, intermediatePath);

    // Path Params
    long sizeOfPathParams_authorizableId = strlen(intermediatePath)+3 + strlen(authorizableId)+3 + sizeof("{ authorizableId }") - 1;
    if(authorizableId == NULL) {
        goto end;
    }
    char* localVarToReplace_authorizableId = malloc(sizeOfPathParams_authorizableId);
    sprintf(localVarToReplace_authorizableId, "{%s}", "authorizableId");

    localVarPath = strReplace(localVarPath, localVarToReplace_authorizableId, authorizableId);


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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Retrieved Authorizable Keystore info");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Default response");
    //}
    //nonprimitive not container
    keystore_info_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *SlingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = keystore_info_parseFromJSON(SlingAPIlocalVarJSON);
        cJSON_Delete(SlingAPIlocalVarJSON);
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
    free(localVarToReplace_intermediatePath);
    free(localVarToReplace_authorizableId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

binary_t*
SlingAPI_getKeystore(apiClient_t *apiClient, char *intermediatePath, char *authorizableId)
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
    char *localVarPath = strdup("/{intermediatePath}/{authorizableId}/keystore/store.p12");

    if(!intermediatePath)
        goto end;
    if(!authorizableId)
        goto end;


    // Path Params
    long sizeOfPathParams_intermediatePath = strlen(intermediatePath)+3 + strlen(authorizableId)+3 + sizeof("{ intermediatePath }") - 1;
    if(intermediatePath == NULL) {
        goto end;
    }
    char* localVarToReplace_intermediatePath = malloc(sizeOfPathParams_intermediatePath);
    sprintf(localVarToReplace_intermediatePath, "{%s}", "intermediatePath");

    localVarPath = strReplace(localVarPath, localVarToReplace_intermediatePath, intermediatePath);

    // Path Params
    long sizeOfPathParams_authorizableId = strlen(intermediatePath)+3 + strlen(authorizableId)+3 + sizeof("{ authorizableId }") - 1;
    if(authorizableId == NULL) {
        goto end;
    }
    char* localVarToReplace_authorizableId = malloc(sizeOfPathParams_authorizableId);
    sprintf(localVarToReplace_authorizableId, "{%s}", "authorizableId");

    localVarPath = strReplace(localVarPath, localVarToReplace_authorizableId, authorizableId);


    list_addElement(localVarHeaderType,"application/octet-stream"); //produces
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
    //primitive return type simple binary
    binary_t* elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300)
        elementToReturn = instantiate_binary_t(apiClient->dataReceived, apiClient->dataReceivedLen);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_intermediatePath);
    free(localVarToReplace_authorizableId);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

void
SlingAPI_getNode(apiClient_t *apiClient, char *path, char *name)
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
    char *localVarPath = strdup("/{path}/{name}");

    if(!path)
        goto end;
    if(!name)
        goto end;


    // Path Params
    long sizeOfPathParams_path = strlen(path)+3 + strlen(name)+3 + sizeof("{ path }") - 1;
    if(path == NULL) {
        goto end;
    }
    char* localVarToReplace_path = malloc(sizeOfPathParams_path);
    sprintf(localVarToReplace_path, "{%s}", "path");

    localVarPath = strReplace(localVarPath, localVarToReplace_path, path);

    // Path Params
    long sizeOfPathParams_name = strlen(path)+3 + strlen(name)+3 + sizeof("{ name }") - 1;
    if(name == NULL) {
        goto end;
    }
    char* localVarToReplace_name = malloc(sizeOfPathParams_name);
    sprintf(localVarToReplace_name, "{%s}", "name");

    localVarPath = strReplace(localVarPath, localVarToReplace_name, name);


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
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    
    
    free(localVarPath);
    free(localVarToReplace_path);
    free(localVarToReplace_name);

}

binary_t*
SlingAPI_getPackage(apiClient_t *apiClient, char *group, char *name, char *version)
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
    char *localVarPath = strdup("/etc/packages/{group}/{name}-{version}.zip");

    if(!group)
        goto end;
    if(!name)
        goto end;
    if(!version)
        goto end;


    // Path Params
    long sizeOfPathParams_group = strlen(group)+3 + strlen(name)+3 + strlen(version)+3 + sizeof("{ group }") - 1;
    if(group == NULL) {
        goto end;
    }
    char* localVarToReplace_group = malloc(sizeOfPathParams_group);
    sprintf(localVarToReplace_group, "{%s}", "group");

    localVarPath = strReplace(localVarPath, localVarToReplace_group, group);

    // Path Params
    long sizeOfPathParams_name = strlen(group)+3 + strlen(name)+3 + strlen(version)+3 + sizeof("{ name }") - 1;
    if(name == NULL) {
        goto end;
    }
    char* localVarToReplace_name = malloc(sizeOfPathParams_name);
    sprintf(localVarToReplace_name, "{%s}", "name");

    localVarPath = strReplace(localVarPath, localVarToReplace_name, name);

    // Path Params
    long sizeOfPathParams_version = strlen(group)+3 + strlen(name)+3 + strlen(version)+3 + sizeof("{ version }") - 1;
    if(version == NULL) {
        goto end;
    }
    char* localVarToReplace_version = malloc(sizeOfPathParams_version);
    sprintf(localVarToReplace_version, "{%s}", "version");

    localVarPath = strReplace(localVarPath, localVarToReplace_version, version);


    list_addElement(localVarHeaderType,"application/octet-stream"); //produces
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
    //primitive return type simple binary
    binary_t* elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300)
        elementToReturn = instantiate_binary_t(apiClient->dataReceived, apiClient->dataReceivedLen);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_group);
    free(localVarToReplace_name);
    free(localVarToReplace_version);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

char*
SlingAPI_getPackageFilter(apiClient_t *apiClient, char *group, char *name, char *version)
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
    char *localVarPath = strdup("/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json");

    if(!group)
        goto end;
    if(!name)
        goto end;
    if(!version)
        goto end;


    // Path Params
    long sizeOfPathParams_group = strlen(group)+3 + strlen(name)+3 + strlen(version)+3 + sizeof("{ group }") - 1;
    if(group == NULL) {
        goto end;
    }
    char* localVarToReplace_group = malloc(sizeOfPathParams_group);
    sprintf(localVarToReplace_group, "{%s}", "group");

    localVarPath = strReplace(localVarPath, localVarToReplace_group, group);

    // Path Params
    long sizeOfPathParams_name = strlen(group)+3 + strlen(name)+3 + strlen(version)+3 + sizeof("{ name }") - 1;
    if(name == NULL) {
        goto end;
    }
    char* localVarToReplace_name = malloc(sizeOfPathParams_name);
    sprintf(localVarToReplace_name, "{%s}", "name");

    localVarPath = strReplace(localVarPath, localVarToReplace_name, name);

    // Path Params
    long sizeOfPathParams_version = strlen(group)+3 + strlen(name)+3 + strlen(version)+3 + sizeof("{ version }") - 1;
    if(version == NULL) {
        goto end;
    }
    char* localVarToReplace_version = malloc(sizeOfPathParams_version);
    sprintf(localVarToReplace_version, "{%s}", "version");

    localVarPath = strReplace(localVarPath, localVarToReplace_version, version);


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
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_group);
    free(localVarToReplace_name);
    free(localVarToReplace_version);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

char*
SlingAPI_getQuery(apiClient_t *apiClient, char *path, double p.limit, char *_1_property, char *_1_property.value)
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
    char *localVarPath = strdup("/bin/querybuilder.json");





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
    char *keyQuery_p.limit = NULL;
    double valueQuery_p.limit ;
    keyValuePair_t *keyPairQuery_p.limit = 0;
    if (p.limit)
    {
        keyQuery_p.limit = strdup("p.limit");
        valueQuery_p.limit = (p.limit);
        keyPairQuery_p.limit = keyValuePair_create(keyQuery_p.limit, &valueQuery_p.limit);
        list_addElement(localVarQueryParameters,keyPairQuery_p.limit);
    }

    // query parameters
    char *keyQuery__1_property = NULL;
    char * valueQuery__1_property = NULL;
    keyValuePair_t *keyPairQuery__1_property = 0;
    if (_1_property)
    {
        keyQuery__1_property = strdup("1_property");
        valueQuery__1_property = strdup((_1_property));
        keyPairQuery__1_property = keyValuePair_create(keyQuery__1_property, valueQuery__1_property);
        list_addElement(localVarQueryParameters,keyPairQuery__1_property);
    }

    // query parameters
    char *keyQuery__1_property.value = NULL;
    char * valueQuery__1_property.value = NULL;
    keyValuePair_t *keyPairQuery__1_property.value = 0;
    if (_1_property.value)
    {
        keyQuery__1_property.value = strdup("1_property.value");
        valueQuery__1_property.value = strdup((_1_property.value));
        keyPairQuery__1_property.value = keyValuePair_create(keyQuery__1_property.value, valueQuery__1_property.value);
        list_addElement(localVarQueryParameters,keyPairQuery__1_property.value);
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
    if(keyQuery_p.limit){
        free(keyQuery_p.limit);
        keyQuery_p.limit = NULL;
    }
    if(keyPairQuery_p.limit){
        keyValuePair_free(keyPairQuery_p.limit);
        keyPairQuery_p.limit = NULL;
    }
    if(keyQuery__1_property){
        free(keyQuery__1_property);
        keyQuery__1_property = NULL;
    }
    if(valueQuery__1_property){
        free(valueQuery__1_property);
        valueQuery__1_property = NULL;
    }
    if(keyPairQuery__1_property){
        keyValuePair_free(keyPairQuery__1_property);
        keyPairQuery__1_property = NULL;
    }
    if(keyQuery__1_property.value){
        free(keyQuery__1_property.value);
        keyQuery__1_property.value = NULL;
    }
    if(valueQuery__1_property.value){
        free(valueQuery__1_property.value);
        valueQuery__1_property.value = NULL;
    }
    if(keyPairQuery__1_property.value){
        keyValuePair_free(keyPairQuery__1_property.value);
        keyPairQuery__1_property.value = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

binary_t*
SlingAPI_getTruststore(apiClient_t *apiClient)
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
    char *localVarPath = strdup("/etc/truststore/truststore.p12");




    list_addElement(localVarHeaderType,"application/octet-stream"); //produces
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
    //primitive return type simple binary
    binary_t* elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300)
        elementToReturn = instantiate_binary_t(apiClient->dataReceived, apiClient->dataReceivedLen);

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

truststore_info_t*
SlingAPI_getTruststoreInfo(apiClient_t *apiClient)
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
    char *localVarPath = strdup("/libs/granite/security/truststore.json");




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
    //    printf("%s\n","Retrieved AEM Truststore info");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Default response");
    //}
    //nonprimitive not container
    truststore_info_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *SlingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = truststore_info_parseFromJSON(SlingAPIlocalVarJSON);
        cJSON_Delete(SlingAPIlocalVarJSON);
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
SlingAPI_postAgent(apiClient_t *apiClient, char *runmode, char *name, int *jcr:content/cq:distribute, char *jcr:content/cq:distribute@TypeHint, char *jcr:content/cq:name, char *jcr:content/cq:template, int *jcr:content/aliasUpdate, int *jcr:content/enabled, char *jcr:content/jcr:description, char *jcr:content/jcr:lastModified, char *jcr:content/jcr:lastModifiedBy, char *jcr:content/jcr:mixinTypes, char *jcr:content/jcr:title, char *jcr:content/logLevel, int *jcr:content/noStatusUpdate, int *jcr:content/noVersioning, double jcr:content/protocolConnectTimeout, int *jcr:content/protocolHTTPConnectionClosed, char *jcr:content/protocolHTTPExpired, list_t *jcr:content/protocolHTTPHeaders, char *jcr:content/protocolHTTPHeaders@TypeHint, char *jcr:content/protocolHTTPMethod, int *jcr:content/protocolHTTPSRelaxed, char *jcr:content/protocolInterface, double jcr:content/protocolSocketTimeout, char *jcr:content/protocolVersion, char *jcr:content/proxyNTLMDomain, char *jcr:content/proxyNTLMHost, char *jcr:content/proxyHost, char *jcr:content/proxyPassword, double jcr:content/proxyPort, char *jcr:content/proxyUser, double jcr:content/queueBatchMaxSize, char *jcr:content/queueBatchMode, double jcr:content/queueBatchWaitTime, char *jcr:content/retryDelay, int *jcr:content/reverseReplication, char *jcr:content/serializationType, char *jcr:content/sling:resourceType, char *jcr:content/ssl, char *jcr:content/transportNTLMDomain, char *jcr:content/transportNTLMHost, char *jcr:content/transportPassword, char *jcr:content/transportUri, char *jcr:content/transportUser, int *jcr:content/triggerDistribute, int *jcr:content/triggerModified, int *jcr:content/triggerOnOffTime, int *jcr:content/triggerReceive, int *jcr:content/triggerSpecific, char *jcr:content/userId, char *jcr:primaryType, char *:operation)
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
    char *localVarPath = strdup("/etc/replication/agents.{runmode}/{name}");

    if(!runmode)
        goto end;
    if(!name)
        goto end;


    // Path Params
    long sizeOfPathParams_runmode = strlen(runmode)+3 + strlen(name)+3 + sizeof("{ runmode }") - 1;
    if(runmode == NULL) {
        goto end;
    }
    char* localVarToReplace_runmode = malloc(sizeOfPathParams_runmode);
    sprintf(localVarToReplace_runmode, "{%s}", "runmode");

    localVarPath = strReplace(localVarPath, localVarToReplace_runmode, runmode);

    // Path Params
    long sizeOfPathParams_name = strlen(runmode)+3 + strlen(name)+3 + sizeof("{ name }") - 1;
    if(name == NULL) {
        goto end;
    }
    char* localVarToReplace_name = malloc(sizeOfPathParams_name);
    sprintf(localVarToReplace_name, "{%s}", "name");

    localVarPath = strReplace(localVarPath, localVarToReplace_name, name);



    // query parameters
    char *keyQuery_jcr:content/cq:distribute = NULL;
    char * valueQuery_jcr:content/cq:distribute = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/cq:distribute = 0;
    if (jcr:content/cq:distribute)
    {
        keyQuery_jcr:content/cq:distribute = strdup("jcr:content/cq:distribute");
        valueQuery_jcr:content/cq:distribute = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_jcr:content/cq:distribute, MAX_NUMBER_LENGTH, "%d", *jcr:content/cq:distribute);
        keyPairQuery_jcr:content/cq:distribute = keyValuePair_create(keyQuery_jcr:content/cq:distribute, valueQuery_jcr:content/cq:distribute);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/cq:distribute);
    }

    // query parameters
    char *keyQuery_jcr:content/cq:distribute@TypeHint = NULL;
    char * valueQuery_jcr:content/cq:distribute@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/cq:distribute@TypeHint = 0;
    if (jcr:content/cq:distribute@TypeHint)
    {
        keyQuery_jcr:content/cq:distribute@TypeHint = strdup("jcr:content/cq:distribute@TypeHint");
        valueQuery_jcr:content/cq:distribute@TypeHint = strdup((jcr:content/cq:distribute@TypeHint));
        keyPairQuery_jcr:content/cq:distribute@TypeHint = keyValuePair_create(keyQuery_jcr:content/cq:distribute@TypeHint, valueQuery_jcr:content/cq:distribute@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/cq:distribute@TypeHint);
    }

    // query parameters
    char *keyQuery_jcr:content/cq:name = NULL;
    char * valueQuery_jcr:content/cq:name = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/cq:name = 0;
    if (jcr:content/cq:name)
    {
        keyQuery_jcr:content/cq:name = strdup("jcr:content/cq:name");
        valueQuery_jcr:content/cq:name = strdup((jcr:content/cq:name));
        keyPairQuery_jcr:content/cq:name = keyValuePair_create(keyQuery_jcr:content/cq:name, valueQuery_jcr:content/cq:name);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/cq:name);
    }

    // query parameters
    char *keyQuery_jcr:content/cq:template = NULL;
    char * valueQuery_jcr:content/cq:template = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/cq:template = 0;
    if (jcr:content/cq:template)
    {
        keyQuery_jcr:content/cq:template = strdup("jcr:content/cq:template");
        valueQuery_jcr:content/cq:template = strdup((jcr:content/cq:template));
        keyPairQuery_jcr:content/cq:template = keyValuePair_create(keyQuery_jcr:content/cq:template, valueQuery_jcr:content/cq:template);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/cq:template);
    }

    // query parameters
    char *keyQuery_jcr:content/aliasUpdate = NULL;
    char * valueQuery_jcr:content/aliasUpdate = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/aliasUpdate = 0;
    if (jcr:content/aliasUpdate)
    {
        keyQuery_jcr:content/aliasUpdate = strdup("jcr:content/aliasUpdate");
        valueQuery_jcr:content/aliasUpdate = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_jcr:content/aliasUpdate, MAX_NUMBER_LENGTH, "%d", *jcr:content/aliasUpdate);
        keyPairQuery_jcr:content/aliasUpdate = keyValuePair_create(keyQuery_jcr:content/aliasUpdate, valueQuery_jcr:content/aliasUpdate);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/aliasUpdate);
    }

    // query parameters
    char *keyQuery_jcr:content/enabled = NULL;
    char * valueQuery_jcr:content/enabled = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/enabled = 0;
    if (jcr:content/enabled)
    {
        keyQuery_jcr:content/enabled = strdup("jcr:content/enabled");
        valueQuery_jcr:content/enabled = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_jcr:content/enabled, MAX_NUMBER_LENGTH, "%d", *jcr:content/enabled);
        keyPairQuery_jcr:content/enabled = keyValuePair_create(keyQuery_jcr:content/enabled, valueQuery_jcr:content/enabled);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/enabled);
    }

    // query parameters
    char *keyQuery_jcr:content/jcr:description = NULL;
    char * valueQuery_jcr:content/jcr:description = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/jcr:description = 0;
    if (jcr:content/jcr:description)
    {
        keyQuery_jcr:content/jcr:description = strdup("jcr:content/jcr:description");
        valueQuery_jcr:content/jcr:description = strdup((jcr:content/jcr:description));
        keyPairQuery_jcr:content/jcr:description = keyValuePair_create(keyQuery_jcr:content/jcr:description, valueQuery_jcr:content/jcr:description);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/jcr:description);
    }

    // query parameters
    char *keyQuery_jcr:content/jcr:lastModified = NULL;
    char * valueQuery_jcr:content/jcr:lastModified = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/jcr:lastModified = 0;
    if (jcr:content/jcr:lastModified)
    {
        keyQuery_jcr:content/jcr:lastModified = strdup("jcr:content/jcr:lastModified");
        valueQuery_jcr:content/jcr:lastModified = strdup((jcr:content/jcr:lastModified));
        keyPairQuery_jcr:content/jcr:lastModified = keyValuePair_create(keyQuery_jcr:content/jcr:lastModified, valueQuery_jcr:content/jcr:lastModified);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/jcr:lastModified);
    }

    // query parameters
    char *keyQuery_jcr:content/jcr:lastModifiedBy = NULL;
    char * valueQuery_jcr:content/jcr:lastModifiedBy = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/jcr:lastModifiedBy = 0;
    if (jcr:content/jcr:lastModifiedBy)
    {
        keyQuery_jcr:content/jcr:lastModifiedBy = strdup("jcr:content/jcr:lastModifiedBy");
        valueQuery_jcr:content/jcr:lastModifiedBy = strdup((jcr:content/jcr:lastModifiedBy));
        keyPairQuery_jcr:content/jcr:lastModifiedBy = keyValuePair_create(keyQuery_jcr:content/jcr:lastModifiedBy, valueQuery_jcr:content/jcr:lastModifiedBy);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/jcr:lastModifiedBy);
    }

    // query parameters
    char *keyQuery_jcr:content/jcr:mixinTypes = NULL;
    char * valueQuery_jcr:content/jcr:mixinTypes = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/jcr:mixinTypes = 0;
    if (jcr:content/jcr:mixinTypes)
    {
        keyQuery_jcr:content/jcr:mixinTypes = strdup("jcr:content/jcr:mixinTypes");
        valueQuery_jcr:content/jcr:mixinTypes = strdup((jcr:content/jcr:mixinTypes));
        keyPairQuery_jcr:content/jcr:mixinTypes = keyValuePair_create(keyQuery_jcr:content/jcr:mixinTypes, valueQuery_jcr:content/jcr:mixinTypes);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/jcr:mixinTypes);
    }

    // query parameters
    char *keyQuery_jcr:content/jcr:title = NULL;
    char * valueQuery_jcr:content/jcr:title = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/jcr:title = 0;
    if (jcr:content/jcr:title)
    {
        keyQuery_jcr:content/jcr:title = strdup("jcr:content/jcr:title");
        valueQuery_jcr:content/jcr:title = strdup((jcr:content/jcr:title));
        keyPairQuery_jcr:content/jcr:title = keyValuePair_create(keyQuery_jcr:content/jcr:title, valueQuery_jcr:content/jcr:title);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/jcr:title);
    }

    // query parameters
    char *keyQuery_jcr:content/logLevel = NULL;
    char * valueQuery_jcr:content/logLevel = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/logLevel = 0;
    if (jcr:content/logLevel)
    {
        keyQuery_jcr:content/logLevel = strdup("jcr:content/logLevel");
        valueQuery_jcr:content/logLevel = strdup((jcr:content/logLevel));
        keyPairQuery_jcr:content/logLevel = keyValuePair_create(keyQuery_jcr:content/logLevel, valueQuery_jcr:content/logLevel);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/logLevel);
    }

    // query parameters
    char *keyQuery_jcr:content/noStatusUpdate = NULL;
    char * valueQuery_jcr:content/noStatusUpdate = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/noStatusUpdate = 0;
    if (jcr:content/noStatusUpdate)
    {
        keyQuery_jcr:content/noStatusUpdate = strdup("jcr:content/noStatusUpdate");
        valueQuery_jcr:content/noStatusUpdate = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_jcr:content/noStatusUpdate, MAX_NUMBER_LENGTH, "%d", *jcr:content/noStatusUpdate);
        keyPairQuery_jcr:content/noStatusUpdate = keyValuePair_create(keyQuery_jcr:content/noStatusUpdate, valueQuery_jcr:content/noStatusUpdate);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/noStatusUpdate);
    }

    // query parameters
    char *keyQuery_jcr:content/noVersioning = NULL;
    char * valueQuery_jcr:content/noVersioning = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/noVersioning = 0;
    if (jcr:content/noVersioning)
    {
        keyQuery_jcr:content/noVersioning = strdup("jcr:content/noVersioning");
        valueQuery_jcr:content/noVersioning = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_jcr:content/noVersioning, MAX_NUMBER_LENGTH, "%d", *jcr:content/noVersioning);
        keyPairQuery_jcr:content/noVersioning = keyValuePair_create(keyQuery_jcr:content/noVersioning, valueQuery_jcr:content/noVersioning);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/noVersioning);
    }

    // query parameters
    char *keyQuery_jcr:content/protocolConnectTimeout = NULL;
    double valueQuery_jcr:content/protocolConnectTimeout ;
    keyValuePair_t *keyPairQuery_jcr:content/protocolConnectTimeout = 0;
    if (jcr:content/protocolConnectTimeout)
    {
        keyQuery_jcr:content/protocolConnectTimeout = strdup("jcr:content/protocolConnectTimeout");
        valueQuery_jcr:content/protocolConnectTimeout = (jcr:content/protocolConnectTimeout);
        keyPairQuery_jcr:content/protocolConnectTimeout = keyValuePair_create(keyQuery_jcr:content/protocolConnectTimeout, &valueQuery_jcr:content/protocolConnectTimeout);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/protocolConnectTimeout);
    }

    // query parameters
    char *keyQuery_jcr:content/protocolHTTPConnectionClosed = NULL;
    char * valueQuery_jcr:content/protocolHTTPConnectionClosed = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/protocolHTTPConnectionClosed = 0;
    if (jcr:content/protocolHTTPConnectionClosed)
    {
        keyQuery_jcr:content/protocolHTTPConnectionClosed = strdup("jcr:content/protocolHTTPConnectionClosed");
        valueQuery_jcr:content/protocolHTTPConnectionClosed = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_jcr:content/protocolHTTPConnectionClosed, MAX_NUMBER_LENGTH, "%d", *jcr:content/protocolHTTPConnectionClosed);
        keyPairQuery_jcr:content/protocolHTTPConnectionClosed = keyValuePair_create(keyQuery_jcr:content/protocolHTTPConnectionClosed, valueQuery_jcr:content/protocolHTTPConnectionClosed);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/protocolHTTPConnectionClosed);
    }

    // query parameters
    char *keyQuery_jcr:content/protocolHTTPExpired = NULL;
    char * valueQuery_jcr:content/protocolHTTPExpired = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/protocolHTTPExpired = 0;
    if (jcr:content/protocolHTTPExpired)
    {
        keyQuery_jcr:content/protocolHTTPExpired = strdup("jcr:content/protocolHTTPExpired");
        valueQuery_jcr:content/protocolHTTPExpired = strdup((jcr:content/protocolHTTPExpired));
        keyPairQuery_jcr:content/protocolHTTPExpired = keyValuePair_create(keyQuery_jcr:content/protocolHTTPExpired, valueQuery_jcr:content/protocolHTTPExpired);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/protocolHTTPExpired);
    }

    // query parameters
    if (jcr:content/protocolHTTPHeaders)
    {
        list_addElement(localVarQueryParameters,jcr:content/protocolHTTPHeaders);
    }

    // query parameters
    char *keyQuery_jcr:content/protocolHTTPHeaders@TypeHint = NULL;
    char * valueQuery_jcr:content/protocolHTTPHeaders@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/protocolHTTPHeaders@TypeHint = 0;
    if (jcr:content/protocolHTTPHeaders@TypeHint)
    {
        keyQuery_jcr:content/protocolHTTPHeaders@TypeHint = strdup("jcr:content/protocolHTTPHeaders@TypeHint");
        valueQuery_jcr:content/protocolHTTPHeaders@TypeHint = strdup((jcr:content/protocolHTTPHeaders@TypeHint));
        keyPairQuery_jcr:content/protocolHTTPHeaders@TypeHint = keyValuePair_create(keyQuery_jcr:content/protocolHTTPHeaders@TypeHint, valueQuery_jcr:content/protocolHTTPHeaders@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/protocolHTTPHeaders@TypeHint);
    }

    // query parameters
    char *keyQuery_jcr:content/protocolHTTPMethod = NULL;
    char * valueQuery_jcr:content/protocolHTTPMethod = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/protocolHTTPMethod = 0;
    if (jcr:content/protocolHTTPMethod)
    {
        keyQuery_jcr:content/protocolHTTPMethod = strdup("jcr:content/protocolHTTPMethod");
        valueQuery_jcr:content/protocolHTTPMethod = strdup((jcr:content/protocolHTTPMethod));
        keyPairQuery_jcr:content/protocolHTTPMethod = keyValuePair_create(keyQuery_jcr:content/protocolHTTPMethod, valueQuery_jcr:content/protocolHTTPMethod);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/protocolHTTPMethod);
    }

    // query parameters
    char *keyQuery_jcr:content/protocolHTTPSRelaxed = NULL;
    char * valueQuery_jcr:content/protocolHTTPSRelaxed = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/protocolHTTPSRelaxed = 0;
    if (jcr:content/protocolHTTPSRelaxed)
    {
        keyQuery_jcr:content/protocolHTTPSRelaxed = strdup("jcr:content/protocolHTTPSRelaxed");
        valueQuery_jcr:content/protocolHTTPSRelaxed = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_jcr:content/protocolHTTPSRelaxed, MAX_NUMBER_LENGTH, "%d", *jcr:content/protocolHTTPSRelaxed);
        keyPairQuery_jcr:content/protocolHTTPSRelaxed = keyValuePair_create(keyQuery_jcr:content/protocolHTTPSRelaxed, valueQuery_jcr:content/protocolHTTPSRelaxed);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/protocolHTTPSRelaxed);
    }

    // query parameters
    char *keyQuery_jcr:content/protocolInterface = NULL;
    char * valueQuery_jcr:content/protocolInterface = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/protocolInterface = 0;
    if (jcr:content/protocolInterface)
    {
        keyQuery_jcr:content/protocolInterface = strdup("jcr:content/protocolInterface");
        valueQuery_jcr:content/protocolInterface = strdup((jcr:content/protocolInterface));
        keyPairQuery_jcr:content/protocolInterface = keyValuePair_create(keyQuery_jcr:content/protocolInterface, valueQuery_jcr:content/protocolInterface);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/protocolInterface);
    }

    // query parameters
    char *keyQuery_jcr:content/protocolSocketTimeout = NULL;
    double valueQuery_jcr:content/protocolSocketTimeout ;
    keyValuePair_t *keyPairQuery_jcr:content/protocolSocketTimeout = 0;
    if (jcr:content/protocolSocketTimeout)
    {
        keyQuery_jcr:content/protocolSocketTimeout = strdup("jcr:content/protocolSocketTimeout");
        valueQuery_jcr:content/protocolSocketTimeout = (jcr:content/protocolSocketTimeout);
        keyPairQuery_jcr:content/protocolSocketTimeout = keyValuePair_create(keyQuery_jcr:content/protocolSocketTimeout, &valueQuery_jcr:content/protocolSocketTimeout);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/protocolSocketTimeout);
    }

    // query parameters
    char *keyQuery_jcr:content/protocolVersion = NULL;
    char * valueQuery_jcr:content/protocolVersion = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/protocolVersion = 0;
    if (jcr:content/protocolVersion)
    {
        keyQuery_jcr:content/protocolVersion = strdup("jcr:content/protocolVersion");
        valueQuery_jcr:content/protocolVersion = strdup((jcr:content/protocolVersion));
        keyPairQuery_jcr:content/protocolVersion = keyValuePair_create(keyQuery_jcr:content/protocolVersion, valueQuery_jcr:content/protocolVersion);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/protocolVersion);
    }

    // query parameters
    char *keyQuery_jcr:content/proxyNTLMDomain = NULL;
    char * valueQuery_jcr:content/proxyNTLMDomain = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/proxyNTLMDomain = 0;
    if (jcr:content/proxyNTLMDomain)
    {
        keyQuery_jcr:content/proxyNTLMDomain = strdup("jcr:content/proxyNTLMDomain");
        valueQuery_jcr:content/proxyNTLMDomain = strdup((jcr:content/proxyNTLMDomain));
        keyPairQuery_jcr:content/proxyNTLMDomain = keyValuePair_create(keyQuery_jcr:content/proxyNTLMDomain, valueQuery_jcr:content/proxyNTLMDomain);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/proxyNTLMDomain);
    }

    // query parameters
    char *keyQuery_jcr:content/proxyNTLMHost = NULL;
    char * valueQuery_jcr:content/proxyNTLMHost = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/proxyNTLMHost = 0;
    if (jcr:content/proxyNTLMHost)
    {
        keyQuery_jcr:content/proxyNTLMHost = strdup("jcr:content/proxyNTLMHost");
        valueQuery_jcr:content/proxyNTLMHost = strdup((jcr:content/proxyNTLMHost));
        keyPairQuery_jcr:content/proxyNTLMHost = keyValuePair_create(keyQuery_jcr:content/proxyNTLMHost, valueQuery_jcr:content/proxyNTLMHost);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/proxyNTLMHost);
    }

    // query parameters
    char *keyQuery_jcr:content/proxyHost = NULL;
    char * valueQuery_jcr:content/proxyHost = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/proxyHost = 0;
    if (jcr:content/proxyHost)
    {
        keyQuery_jcr:content/proxyHost = strdup("jcr:content/proxyHost");
        valueQuery_jcr:content/proxyHost = strdup((jcr:content/proxyHost));
        keyPairQuery_jcr:content/proxyHost = keyValuePair_create(keyQuery_jcr:content/proxyHost, valueQuery_jcr:content/proxyHost);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/proxyHost);
    }

    // query parameters
    char *keyQuery_jcr:content/proxyPassword = NULL;
    char * valueQuery_jcr:content/proxyPassword = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/proxyPassword = 0;
    if (jcr:content/proxyPassword)
    {
        keyQuery_jcr:content/proxyPassword = strdup("jcr:content/proxyPassword");
        valueQuery_jcr:content/proxyPassword = strdup((jcr:content/proxyPassword));
        keyPairQuery_jcr:content/proxyPassword = keyValuePair_create(keyQuery_jcr:content/proxyPassword, valueQuery_jcr:content/proxyPassword);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/proxyPassword);
    }

    // query parameters
    char *keyQuery_jcr:content/proxyPort = NULL;
    double valueQuery_jcr:content/proxyPort ;
    keyValuePair_t *keyPairQuery_jcr:content/proxyPort = 0;
    if (jcr:content/proxyPort)
    {
        keyQuery_jcr:content/proxyPort = strdup("jcr:content/proxyPort");
        valueQuery_jcr:content/proxyPort = (jcr:content/proxyPort);
        keyPairQuery_jcr:content/proxyPort = keyValuePair_create(keyQuery_jcr:content/proxyPort, &valueQuery_jcr:content/proxyPort);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/proxyPort);
    }

    // query parameters
    char *keyQuery_jcr:content/proxyUser = NULL;
    char * valueQuery_jcr:content/proxyUser = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/proxyUser = 0;
    if (jcr:content/proxyUser)
    {
        keyQuery_jcr:content/proxyUser = strdup("jcr:content/proxyUser");
        valueQuery_jcr:content/proxyUser = strdup((jcr:content/proxyUser));
        keyPairQuery_jcr:content/proxyUser = keyValuePair_create(keyQuery_jcr:content/proxyUser, valueQuery_jcr:content/proxyUser);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/proxyUser);
    }

    // query parameters
    char *keyQuery_jcr:content/queueBatchMaxSize = NULL;
    double valueQuery_jcr:content/queueBatchMaxSize ;
    keyValuePair_t *keyPairQuery_jcr:content/queueBatchMaxSize = 0;
    if (jcr:content/queueBatchMaxSize)
    {
        keyQuery_jcr:content/queueBatchMaxSize = strdup("jcr:content/queueBatchMaxSize");
        valueQuery_jcr:content/queueBatchMaxSize = (jcr:content/queueBatchMaxSize);
        keyPairQuery_jcr:content/queueBatchMaxSize = keyValuePair_create(keyQuery_jcr:content/queueBatchMaxSize, &valueQuery_jcr:content/queueBatchMaxSize);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/queueBatchMaxSize);
    }

    // query parameters
    char *keyQuery_jcr:content/queueBatchMode = NULL;
    char * valueQuery_jcr:content/queueBatchMode = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/queueBatchMode = 0;
    if (jcr:content/queueBatchMode)
    {
        keyQuery_jcr:content/queueBatchMode = strdup("jcr:content/queueBatchMode");
        valueQuery_jcr:content/queueBatchMode = strdup((jcr:content/queueBatchMode));
        keyPairQuery_jcr:content/queueBatchMode = keyValuePair_create(keyQuery_jcr:content/queueBatchMode, valueQuery_jcr:content/queueBatchMode);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/queueBatchMode);
    }

    // query parameters
    char *keyQuery_jcr:content/queueBatchWaitTime = NULL;
    double valueQuery_jcr:content/queueBatchWaitTime ;
    keyValuePair_t *keyPairQuery_jcr:content/queueBatchWaitTime = 0;
    if (jcr:content/queueBatchWaitTime)
    {
        keyQuery_jcr:content/queueBatchWaitTime = strdup("jcr:content/queueBatchWaitTime");
        valueQuery_jcr:content/queueBatchWaitTime = (jcr:content/queueBatchWaitTime);
        keyPairQuery_jcr:content/queueBatchWaitTime = keyValuePair_create(keyQuery_jcr:content/queueBatchWaitTime, &valueQuery_jcr:content/queueBatchWaitTime);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/queueBatchWaitTime);
    }

    // query parameters
    char *keyQuery_jcr:content/retryDelay = NULL;
    char * valueQuery_jcr:content/retryDelay = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/retryDelay = 0;
    if (jcr:content/retryDelay)
    {
        keyQuery_jcr:content/retryDelay = strdup("jcr:content/retryDelay");
        valueQuery_jcr:content/retryDelay = strdup((jcr:content/retryDelay));
        keyPairQuery_jcr:content/retryDelay = keyValuePair_create(keyQuery_jcr:content/retryDelay, valueQuery_jcr:content/retryDelay);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/retryDelay);
    }

    // query parameters
    char *keyQuery_jcr:content/reverseReplication = NULL;
    char * valueQuery_jcr:content/reverseReplication = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/reverseReplication = 0;
    if (jcr:content/reverseReplication)
    {
        keyQuery_jcr:content/reverseReplication = strdup("jcr:content/reverseReplication");
        valueQuery_jcr:content/reverseReplication = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_jcr:content/reverseReplication, MAX_NUMBER_LENGTH, "%d", *jcr:content/reverseReplication);
        keyPairQuery_jcr:content/reverseReplication = keyValuePair_create(keyQuery_jcr:content/reverseReplication, valueQuery_jcr:content/reverseReplication);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/reverseReplication);
    }

    // query parameters
    char *keyQuery_jcr:content/serializationType = NULL;
    char * valueQuery_jcr:content/serializationType = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/serializationType = 0;
    if (jcr:content/serializationType)
    {
        keyQuery_jcr:content/serializationType = strdup("jcr:content/serializationType");
        valueQuery_jcr:content/serializationType = strdup((jcr:content/serializationType));
        keyPairQuery_jcr:content/serializationType = keyValuePair_create(keyQuery_jcr:content/serializationType, valueQuery_jcr:content/serializationType);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/serializationType);
    }

    // query parameters
    char *keyQuery_jcr:content/sling:resourceType = NULL;
    char * valueQuery_jcr:content/sling:resourceType = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/sling:resourceType = 0;
    if (jcr:content/sling:resourceType)
    {
        keyQuery_jcr:content/sling:resourceType = strdup("jcr:content/sling:resourceType");
        valueQuery_jcr:content/sling:resourceType = strdup((jcr:content/sling:resourceType));
        keyPairQuery_jcr:content/sling:resourceType = keyValuePair_create(keyQuery_jcr:content/sling:resourceType, valueQuery_jcr:content/sling:resourceType);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/sling:resourceType);
    }

    // query parameters
    char *keyQuery_jcr:content/ssl = NULL;
    char * valueQuery_jcr:content/ssl = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/ssl = 0;
    if (jcr:content/ssl)
    {
        keyQuery_jcr:content/ssl = strdup("jcr:content/ssl");
        valueQuery_jcr:content/ssl = strdup((jcr:content/ssl));
        keyPairQuery_jcr:content/ssl = keyValuePair_create(keyQuery_jcr:content/ssl, valueQuery_jcr:content/ssl);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/ssl);
    }

    // query parameters
    char *keyQuery_jcr:content/transportNTLMDomain = NULL;
    char * valueQuery_jcr:content/transportNTLMDomain = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/transportNTLMDomain = 0;
    if (jcr:content/transportNTLMDomain)
    {
        keyQuery_jcr:content/transportNTLMDomain = strdup("jcr:content/transportNTLMDomain");
        valueQuery_jcr:content/transportNTLMDomain = strdup((jcr:content/transportNTLMDomain));
        keyPairQuery_jcr:content/transportNTLMDomain = keyValuePair_create(keyQuery_jcr:content/transportNTLMDomain, valueQuery_jcr:content/transportNTLMDomain);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/transportNTLMDomain);
    }

    // query parameters
    char *keyQuery_jcr:content/transportNTLMHost = NULL;
    char * valueQuery_jcr:content/transportNTLMHost = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/transportNTLMHost = 0;
    if (jcr:content/transportNTLMHost)
    {
        keyQuery_jcr:content/transportNTLMHost = strdup("jcr:content/transportNTLMHost");
        valueQuery_jcr:content/transportNTLMHost = strdup((jcr:content/transportNTLMHost));
        keyPairQuery_jcr:content/transportNTLMHost = keyValuePair_create(keyQuery_jcr:content/transportNTLMHost, valueQuery_jcr:content/transportNTLMHost);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/transportNTLMHost);
    }

    // query parameters
    char *keyQuery_jcr:content/transportPassword = NULL;
    char * valueQuery_jcr:content/transportPassword = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/transportPassword = 0;
    if (jcr:content/transportPassword)
    {
        keyQuery_jcr:content/transportPassword = strdup("jcr:content/transportPassword");
        valueQuery_jcr:content/transportPassword = strdup((jcr:content/transportPassword));
        keyPairQuery_jcr:content/transportPassword = keyValuePair_create(keyQuery_jcr:content/transportPassword, valueQuery_jcr:content/transportPassword);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/transportPassword);
    }

    // query parameters
    char *keyQuery_jcr:content/transportUri = NULL;
    char * valueQuery_jcr:content/transportUri = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/transportUri = 0;
    if (jcr:content/transportUri)
    {
        keyQuery_jcr:content/transportUri = strdup("jcr:content/transportUri");
        valueQuery_jcr:content/transportUri = strdup((jcr:content/transportUri));
        keyPairQuery_jcr:content/transportUri = keyValuePair_create(keyQuery_jcr:content/transportUri, valueQuery_jcr:content/transportUri);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/transportUri);
    }

    // query parameters
    char *keyQuery_jcr:content/transportUser = NULL;
    char * valueQuery_jcr:content/transportUser = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/transportUser = 0;
    if (jcr:content/transportUser)
    {
        keyQuery_jcr:content/transportUser = strdup("jcr:content/transportUser");
        valueQuery_jcr:content/transportUser = strdup((jcr:content/transportUser));
        keyPairQuery_jcr:content/transportUser = keyValuePair_create(keyQuery_jcr:content/transportUser, valueQuery_jcr:content/transportUser);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/transportUser);
    }

    // query parameters
    char *keyQuery_jcr:content/triggerDistribute = NULL;
    char * valueQuery_jcr:content/triggerDistribute = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/triggerDistribute = 0;
    if (jcr:content/triggerDistribute)
    {
        keyQuery_jcr:content/triggerDistribute = strdup("jcr:content/triggerDistribute");
        valueQuery_jcr:content/triggerDistribute = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_jcr:content/triggerDistribute, MAX_NUMBER_LENGTH, "%d", *jcr:content/triggerDistribute);
        keyPairQuery_jcr:content/triggerDistribute = keyValuePair_create(keyQuery_jcr:content/triggerDistribute, valueQuery_jcr:content/triggerDistribute);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/triggerDistribute);
    }

    // query parameters
    char *keyQuery_jcr:content/triggerModified = NULL;
    char * valueQuery_jcr:content/triggerModified = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/triggerModified = 0;
    if (jcr:content/triggerModified)
    {
        keyQuery_jcr:content/triggerModified = strdup("jcr:content/triggerModified");
        valueQuery_jcr:content/triggerModified = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_jcr:content/triggerModified, MAX_NUMBER_LENGTH, "%d", *jcr:content/triggerModified);
        keyPairQuery_jcr:content/triggerModified = keyValuePair_create(keyQuery_jcr:content/triggerModified, valueQuery_jcr:content/triggerModified);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/triggerModified);
    }

    // query parameters
    char *keyQuery_jcr:content/triggerOnOffTime = NULL;
    char * valueQuery_jcr:content/triggerOnOffTime = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/triggerOnOffTime = 0;
    if (jcr:content/triggerOnOffTime)
    {
        keyQuery_jcr:content/triggerOnOffTime = strdup("jcr:content/triggerOnOffTime");
        valueQuery_jcr:content/triggerOnOffTime = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_jcr:content/triggerOnOffTime, MAX_NUMBER_LENGTH, "%d", *jcr:content/triggerOnOffTime);
        keyPairQuery_jcr:content/triggerOnOffTime = keyValuePair_create(keyQuery_jcr:content/triggerOnOffTime, valueQuery_jcr:content/triggerOnOffTime);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/triggerOnOffTime);
    }

    // query parameters
    char *keyQuery_jcr:content/triggerReceive = NULL;
    char * valueQuery_jcr:content/triggerReceive = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/triggerReceive = 0;
    if (jcr:content/triggerReceive)
    {
        keyQuery_jcr:content/triggerReceive = strdup("jcr:content/triggerReceive");
        valueQuery_jcr:content/triggerReceive = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_jcr:content/triggerReceive, MAX_NUMBER_LENGTH, "%d", *jcr:content/triggerReceive);
        keyPairQuery_jcr:content/triggerReceive = keyValuePair_create(keyQuery_jcr:content/triggerReceive, valueQuery_jcr:content/triggerReceive);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/triggerReceive);
    }

    // query parameters
    char *keyQuery_jcr:content/triggerSpecific = NULL;
    char * valueQuery_jcr:content/triggerSpecific = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/triggerSpecific = 0;
    if (jcr:content/triggerSpecific)
    {
        keyQuery_jcr:content/triggerSpecific = strdup("jcr:content/triggerSpecific");
        valueQuery_jcr:content/triggerSpecific = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_jcr:content/triggerSpecific, MAX_NUMBER_LENGTH, "%d", *jcr:content/triggerSpecific);
        keyPairQuery_jcr:content/triggerSpecific = keyValuePair_create(keyQuery_jcr:content/triggerSpecific, valueQuery_jcr:content/triggerSpecific);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/triggerSpecific);
    }

    // query parameters
    char *keyQuery_jcr:content/userId = NULL;
    char * valueQuery_jcr:content/userId = NULL;
    keyValuePair_t *keyPairQuery_jcr:content/userId = 0;
    if (jcr:content/userId)
    {
        keyQuery_jcr:content/userId = strdup("jcr:content/userId");
        valueQuery_jcr:content/userId = strdup((jcr:content/userId));
        keyPairQuery_jcr:content/userId = keyValuePair_create(keyQuery_jcr:content/userId, valueQuery_jcr:content/userId);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:content/userId);
    }

    // query parameters
    char *keyQuery_jcr:primaryType = NULL;
    char * valueQuery_jcr:primaryType = NULL;
    keyValuePair_t *keyPairQuery_jcr:primaryType = 0;
    if (jcr:primaryType)
    {
        keyQuery_jcr:primaryType = strdup("jcr:primaryType");
        valueQuery_jcr:primaryType = strdup((jcr:primaryType));
        keyPairQuery_jcr:primaryType = keyValuePair_create(keyQuery_jcr:primaryType, valueQuery_jcr:primaryType);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:primaryType);
    }

    // query parameters
    char *keyQuery_:operation = NULL;
    char * valueQuery_:operation = NULL;
    keyValuePair_t *keyPairQuery_:operation = 0;
    if (:operation)
    {
        keyQuery_:operation = strdup(":operation");
        valueQuery_:operation = strdup((:operation));
        keyPairQuery_:operation = keyValuePair_create(keyQuery_:operation, valueQuery_:operation);
        list_addElement(localVarQueryParameters,keyPairQuery_:operation);
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
    free(localVarToReplace_runmode);
    free(localVarToReplace_name);
    if(keyQuery_jcr:content/cq:distribute@TypeHint){
        free(keyQuery_jcr:content/cq:distribute@TypeHint);
        keyQuery_jcr:content/cq:distribute@TypeHint = NULL;
    }
    if(valueQuery_jcr:content/cq:distribute@TypeHint){
        free(valueQuery_jcr:content/cq:distribute@TypeHint);
        valueQuery_jcr:content/cq:distribute@TypeHint = NULL;
    }
    if(keyPairQuery_jcr:content/cq:distribute@TypeHint){
        keyValuePair_free(keyPairQuery_jcr:content/cq:distribute@TypeHint);
        keyPairQuery_jcr:content/cq:distribute@TypeHint = NULL;
    }
    if(keyQuery_jcr:content/cq:distribute@TypeHint){
        free(keyQuery_jcr:content/cq:distribute@TypeHint);
        keyQuery_jcr:content/cq:distribute@TypeHint = NULL;
    }
    if(keyPairQuery_jcr:content/cq:distribute@TypeHint){
        keyValuePair_free(keyPairQuery_jcr:content/cq:distribute@TypeHint);
        keyPairQuery_jcr:content/cq:distribute@TypeHint = NULL;
    }
    if(keyQuery_jcr:content/cq:name){
        free(keyQuery_jcr:content/cq:name);
        keyQuery_jcr:content/cq:name = NULL;
    }
    if(valueQuery_jcr:content/cq:name){
        free(valueQuery_jcr:content/cq:name);
        valueQuery_jcr:content/cq:name = NULL;
    }
    if(keyPairQuery_jcr:content/cq:name){
        keyValuePair_free(keyPairQuery_jcr:content/cq:name);
        keyPairQuery_jcr:content/cq:name = NULL;
    }
    if(keyQuery_jcr:content/cq:name){
        free(keyQuery_jcr:content/cq:name);
        keyQuery_jcr:content/cq:name = NULL;
    }
    if(keyPairQuery_jcr:content/cq:name){
        keyValuePair_free(keyPairQuery_jcr:content/cq:name);
        keyPairQuery_jcr:content/cq:name = NULL;
    }
    if(keyQuery_jcr:content/cq:template){
        free(keyQuery_jcr:content/cq:template);
        keyQuery_jcr:content/cq:template = NULL;
    }
    if(valueQuery_jcr:content/cq:template){
        free(valueQuery_jcr:content/cq:template);
        valueQuery_jcr:content/cq:template = NULL;
    }
    if(keyPairQuery_jcr:content/cq:template){
        keyValuePair_free(keyPairQuery_jcr:content/cq:template);
        keyPairQuery_jcr:content/cq:template = NULL;
    }
    if(keyQuery_jcr:content/cq:template){
        free(keyQuery_jcr:content/cq:template);
        keyQuery_jcr:content/cq:template = NULL;
    }
    if(keyPairQuery_jcr:content/cq:template){
        keyValuePair_free(keyPairQuery_jcr:content/cq:template);
        keyPairQuery_jcr:content/cq:template = NULL;
    }
    if(keyQuery_jcr:content/jcr:description){
        free(keyQuery_jcr:content/jcr:description);
        keyQuery_jcr:content/jcr:description = NULL;
    }
    if(valueQuery_jcr:content/jcr:description){
        free(valueQuery_jcr:content/jcr:description);
        valueQuery_jcr:content/jcr:description = NULL;
    }
    if(keyPairQuery_jcr:content/jcr:description){
        keyValuePair_free(keyPairQuery_jcr:content/jcr:description);
        keyPairQuery_jcr:content/jcr:description = NULL;
    }
    if(keyQuery_jcr:content/jcr:description){
        free(keyQuery_jcr:content/jcr:description);
        keyQuery_jcr:content/jcr:description = NULL;
    }
    if(keyPairQuery_jcr:content/jcr:description){
        keyValuePair_free(keyPairQuery_jcr:content/jcr:description);
        keyPairQuery_jcr:content/jcr:description = NULL;
    }
    if(keyQuery_jcr:content/jcr:lastModified){
        free(keyQuery_jcr:content/jcr:lastModified);
        keyQuery_jcr:content/jcr:lastModified = NULL;
    }
    if(valueQuery_jcr:content/jcr:lastModified){
        free(valueQuery_jcr:content/jcr:lastModified);
        valueQuery_jcr:content/jcr:lastModified = NULL;
    }
    if(keyPairQuery_jcr:content/jcr:lastModified){
        keyValuePair_free(keyPairQuery_jcr:content/jcr:lastModified);
        keyPairQuery_jcr:content/jcr:lastModified = NULL;
    }
    if(keyQuery_jcr:content/jcr:lastModified){
        free(keyQuery_jcr:content/jcr:lastModified);
        keyQuery_jcr:content/jcr:lastModified = NULL;
    }
    if(keyPairQuery_jcr:content/jcr:lastModified){
        keyValuePair_free(keyPairQuery_jcr:content/jcr:lastModified);
        keyPairQuery_jcr:content/jcr:lastModified = NULL;
    }
    if(keyQuery_jcr:content/jcr:lastModifiedBy){
        free(keyQuery_jcr:content/jcr:lastModifiedBy);
        keyQuery_jcr:content/jcr:lastModifiedBy = NULL;
    }
    if(valueQuery_jcr:content/jcr:lastModifiedBy){
        free(valueQuery_jcr:content/jcr:lastModifiedBy);
        valueQuery_jcr:content/jcr:lastModifiedBy = NULL;
    }
    if(keyPairQuery_jcr:content/jcr:lastModifiedBy){
        keyValuePair_free(keyPairQuery_jcr:content/jcr:lastModifiedBy);
        keyPairQuery_jcr:content/jcr:lastModifiedBy = NULL;
    }
    if(keyQuery_jcr:content/jcr:lastModifiedBy){
        free(keyQuery_jcr:content/jcr:lastModifiedBy);
        keyQuery_jcr:content/jcr:lastModifiedBy = NULL;
    }
    if(keyPairQuery_jcr:content/jcr:lastModifiedBy){
        keyValuePair_free(keyPairQuery_jcr:content/jcr:lastModifiedBy);
        keyPairQuery_jcr:content/jcr:lastModifiedBy = NULL;
    }
    if(keyQuery_jcr:content/jcr:mixinTypes){
        free(keyQuery_jcr:content/jcr:mixinTypes);
        keyQuery_jcr:content/jcr:mixinTypes = NULL;
    }
    if(valueQuery_jcr:content/jcr:mixinTypes){
        free(valueQuery_jcr:content/jcr:mixinTypes);
        valueQuery_jcr:content/jcr:mixinTypes = NULL;
    }
    if(keyPairQuery_jcr:content/jcr:mixinTypes){
        keyValuePair_free(keyPairQuery_jcr:content/jcr:mixinTypes);
        keyPairQuery_jcr:content/jcr:mixinTypes = NULL;
    }
    if(keyQuery_jcr:content/jcr:mixinTypes){
        free(keyQuery_jcr:content/jcr:mixinTypes);
        keyQuery_jcr:content/jcr:mixinTypes = NULL;
    }
    if(keyPairQuery_jcr:content/jcr:mixinTypes){
        keyValuePair_free(keyPairQuery_jcr:content/jcr:mixinTypes);
        keyPairQuery_jcr:content/jcr:mixinTypes = NULL;
    }
    if(keyQuery_jcr:content/jcr:title){
        free(keyQuery_jcr:content/jcr:title);
        keyQuery_jcr:content/jcr:title = NULL;
    }
    if(valueQuery_jcr:content/jcr:title){
        free(valueQuery_jcr:content/jcr:title);
        valueQuery_jcr:content/jcr:title = NULL;
    }
    if(keyPairQuery_jcr:content/jcr:title){
        keyValuePair_free(keyPairQuery_jcr:content/jcr:title);
        keyPairQuery_jcr:content/jcr:title = NULL;
    }
    if(keyQuery_jcr:content/jcr:title){
        free(keyQuery_jcr:content/jcr:title);
        keyQuery_jcr:content/jcr:title = NULL;
    }
    if(keyPairQuery_jcr:content/jcr:title){
        keyValuePair_free(keyPairQuery_jcr:content/jcr:title);
        keyPairQuery_jcr:content/jcr:title = NULL;
    }
    if(keyQuery_jcr:content/logLevel){
        free(keyQuery_jcr:content/logLevel);
        keyQuery_jcr:content/logLevel = NULL;
    }
    if(valueQuery_jcr:content/logLevel){
        free(valueQuery_jcr:content/logLevel);
        valueQuery_jcr:content/logLevel = NULL;
    }
    if(keyPairQuery_jcr:content/logLevel){
        keyValuePair_free(keyPairQuery_jcr:content/logLevel);
        keyPairQuery_jcr:content/logLevel = NULL;
    }
    if(keyQuery_jcr:content/logLevel){
        free(keyQuery_jcr:content/logLevel);
        keyQuery_jcr:content/logLevel = NULL;
    }
    if(keyPairQuery_jcr:content/logLevel){
        keyValuePair_free(keyPairQuery_jcr:content/logLevel);
        keyPairQuery_jcr:content/logLevel = NULL;
    }
    if(keyQuery_jcr:content/protocolHTTPExpired){
        free(keyQuery_jcr:content/protocolHTTPExpired);
        keyQuery_jcr:content/protocolHTTPExpired = NULL;
    }
    if(valueQuery_jcr:content/protocolHTTPExpired){
        free(valueQuery_jcr:content/protocolHTTPExpired);
        valueQuery_jcr:content/protocolHTTPExpired = NULL;
    }
    if(keyPairQuery_jcr:content/protocolHTTPExpired){
        keyValuePair_free(keyPairQuery_jcr:content/protocolHTTPExpired);
        keyPairQuery_jcr:content/protocolHTTPExpired = NULL;
    }
    if(keyQuery_jcr:content/protocolHTTPExpired){
        free(keyQuery_jcr:content/protocolHTTPExpired);
        keyQuery_jcr:content/protocolHTTPExpired = NULL;
    }
    if(keyPairQuery_jcr:content/protocolHTTPExpired){
        keyValuePair_free(keyPairQuery_jcr:content/protocolHTTPExpired);
        keyPairQuery_jcr:content/protocolHTTPExpired = NULL;
    }
    if(keyQuery_jcr:content/protocolHTTPHeaders@TypeHint){
        free(keyQuery_jcr:content/protocolHTTPHeaders@TypeHint);
        keyQuery_jcr:content/protocolHTTPHeaders@TypeHint = NULL;
    }
    if(valueQuery_jcr:content/protocolHTTPHeaders@TypeHint){
        free(valueQuery_jcr:content/protocolHTTPHeaders@TypeHint);
        valueQuery_jcr:content/protocolHTTPHeaders@TypeHint = NULL;
    }
    if(keyPairQuery_jcr:content/protocolHTTPHeaders@TypeHint){
        keyValuePair_free(keyPairQuery_jcr:content/protocolHTTPHeaders@TypeHint);
        keyPairQuery_jcr:content/protocolHTTPHeaders@TypeHint = NULL;
    }
    if(keyQuery_jcr:content/protocolHTTPHeaders@TypeHint){
        free(keyQuery_jcr:content/protocolHTTPHeaders@TypeHint);
        keyQuery_jcr:content/protocolHTTPHeaders@TypeHint = NULL;
    }
    if(keyPairQuery_jcr:content/protocolHTTPHeaders@TypeHint){
        keyValuePair_free(keyPairQuery_jcr:content/protocolHTTPHeaders@TypeHint);
        keyPairQuery_jcr:content/protocolHTTPHeaders@TypeHint = NULL;
    }
    if(keyQuery_jcr:content/protocolHTTPMethod){
        free(keyQuery_jcr:content/protocolHTTPMethod);
        keyQuery_jcr:content/protocolHTTPMethod = NULL;
    }
    if(valueQuery_jcr:content/protocolHTTPMethod){
        free(valueQuery_jcr:content/protocolHTTPMethod);
        valueQuery_jcr:content/protocolHTTPMethod = NULL;
    }
    if(keyPairQuery_jcr:content/protocolHTTPMethod){
        keyValuePair_free(keyPairQuery_jcr:content/protocolHTTPMethod);
        keyPairQuery_jcr:content/protocolHTTPMethod = NULL;
    }
    if(keyQuery_jcr:content/protocolHTTPMethod){
        free(keyQuery_jcr:content/protocolHTTPMethod);
        keyQuery_jcr:content/protocolHTTPMethod = NULL;
    }
    if(keyPairQuery_jcr:content/protocolHTTPMethod){
        keyValuePair_free(keyPairQuery_jcr:content/protocolHTTPMethod);
        keyPairQuery_jcr:content/protocolHTTPMethod = NULL;
    }
    if(keyQuery_jcr:content/protocolInterface){
        free(keyQuery_jcr:content/protocolInterface);
        keyQuery_jcr:content/protocolInterface = NULL;
    }
    if(valueQuery_jcr:content/protocolInterface){
        free(valueQuery_jcr:content/protocolInterface);
        valueQuery_jcr:content/protocolInterface = NULL;
    }
    if(keyPairQuery_jcr:content/protocolInterface){
        keyValuePair_free(keyPairQuery_jcr:content/protocolInterface);
        keyPairQuery_jcr:content/protocolInterface = NULL;
    }
    if(keyQuery_jcr:content/protocolInterface){
        free(keyQuery_jcr:content/protocolInterface);
        keyQuery_jcr:content/protocolInterface = NULL;
    }
    if(keyPairQuery_jcr:content/protocolInterface){
        keyValuePair_free(keyPairQuery_jcr:content/protocolInterface);
        keyPairQuery_jcr:content/protocolInterface = NULL;
    }
    if(keyQuery_jcr:content/protocolVersion){
        free(keyQuery_jcr:content/protocolVersion);
        keyQuery_jcr:content/protocolVersion = NULL;
    }
    if(valueQuery_jcr:content/protocolVersion){
        free(valueQuery_jcr:content/protocolVersion);
        valueQuery_jcr:content/protocolVersion = NULL;
    }
    if(keyPairQuery_jcr:content/protocolVersion){
        keyValuePair_free(keyPairQuery_jcr:content/protocolVersion);
        keyPairQuery_jcr:content/protocolVersion = NULL;
    }
    if(keyQuery_jcr:content/protocolVersion){
        free(keyQuery_jcr:content/protocolVersion);
        keyQuery_jcr:content/protocolVersion = NULL;
    }
    if(keyPairQuery_jcr:content/protocolVersion){
        keyValuePair_free(keyPairQuery_jcr:content/protocolVersion);
        keyPairQuery_jcr:content/protocolVersion = NULL;
    }
    if(keyQuery_jcr:content/proxyNTLMDomain){
        free(keyQuery_jcr:content/proxyNTLMDomain);
        keyQuery_jcr:content/proxyNTLMDomain = NULL;
    }
    if(valueQuery_jcr:content/proxyNTLMDomain){
        free(valueQuery_jcr:content/proxyNTLMDomain);
        valueQuery_jcr:content/proxyNTLMDomain = NULL;
    }
    if(keyPairQuery_jcr:content/proxyNTLMDomain){
        keyValuePair_free(keyPairQuery_jcr:content/proxyNTLMDomain);
        keyPairQuery_jcr:content/proxyNTLMDomain = NULL;
    }
    if(keyQuery_jcr:content/proxyNTLMDomain){
        free(keyQuery_jcr:content/proxyNTLMDomain);
        keyQuery_jcr:content/proxyNTLMDomain = NULL;
    }
    if(keyPairQuery_jcr:content/proxyNTLMDomain){
        keyValuePair_free(keyPairQuery_jcr:content/proxyNTLMDomain);
        keyPairQuery_jcr:content/proxyNTLMDomain = NULL;
    }
    if(keyQuery_jcr:content/proxyNTLMHost){
        free(keyQuery_jcr:content/proxyNTLMHost);
        keyQuery_jcr:content/proxyNTLMHost = NULL;
    }
    if(valueQuery_jcr:content/proxyNTLMHost){
        free(valueQuery_jcr:content/proxyNTLMHost);
        valueQuery_jcr:content/proxyNTLMHost = NULL;
    }
    if(keyPairQuery_jcr:content/proxyNTLMHost){
        keyValuePair_free(keyPairQuery_jcr:content/proxyNTLMHost);
        keyPairQuery_jcr:content/proxyNTLMHost = NULL;
    }
    if(keyQuery_jcr:content/proxyNTLMHost){
        free(keyQuery_jcr:content/proxyNTLMHost);
        keyQuery_jcr:content/proxyNTLMHost = NULL;
    }
    if(keyPairQuery_jcr:content/proxyNTLMHost){
        keyValuePair_free(keyPairQuery_jcr:content/proxyNTLMHost);
        keyPairQuery_jcr:content/proxyNTLMHost = NULL;
    }
    if(keyQuery_jcr:content/proxyHost){
        free(keyQuery_jcr:content/proxyHost);
        keyQuery_jcr:content/proxyHost = NULL;
    }
    if(valueQuery_jcr:content/proxyHost){
        free(valueQuery_jcr:content/proxyHost);
        valueQuery_jcr:content/proxyHost = NULL;
    }
    if(keyPairQuery_jcr:content/proxyHost){
        keyValuePair_free(keyPairQuery_jcr:content/proxyHost);
        keyPairQuery_jcr:content/proxyHost = NULL;
    }
    if(keyQuery_jcr:content/proxyHost){
        free(keyQuery_jcr:content/proxyHost);
        keyQuery_jcr:content/proxyHost = NULL;
    }
    if(keyPairQuery_jcr:content/proxyHost){
        keyValuePair_free(keyPairQuery_jcr:content/proxyHost);
        keyPairQuery_jcr:content/proxyHost = NULL;
    }
    if(keyQuery_jcr:content/proxyPassword){
        free(keyQuery_jcr:content/proxyPassword);
        keyQuery_jcr:content/proxyPassword = NULL;
    }
    if(valueQuery_jcr:content/proxyPassword){
        free(valueQuery_jcr:content/proxyPassword);
        valueQuery_jcr:content/proxyPassword = NULL;
    }
    if(keyPairQuery_jcr:content/proxyPassword){
        keyValuePair_free(keyPairQuery_jcr:content/proxyPassword);
        keyPairQuery_jcr:content/proxyPassword = NULL;
    }
    if(keyQuery_jcr:content/proxyPassword){
        free(keyQuery_jcr:content/proxyPassword);
        keyQuery_jcr:content/proxyPassword = NULL;
    }
    if(keyPairQuery_jcr:content/proxyPassword){
        keyValuePair_free(keyPairQuery_jcr:content/proxyPassword);
        keyPairQuery_jcr:content/proxyPassword = NULL;
    }
    if(keyQuery_jcr:content/proxyUser){
        free(keyQuery_jcr:content/proxyUser);
        keyQuery_jcr:content/proxyUser = NULL;
    }
    if(valueQuery_jcr:content/proxyUser){
        free(valueQuery_jcr:content/proxyUser);
        valueQuery_jcr:content/proxyUser = NULL;
    }
    if(keyPairQuery_jcr:content/proxyUser){
        keyValuePair_free(keyPairQuery_jcr:content/proxyUser);
        keyPairQuery_jcr:content/proxyUser = NULL;
    }
    if(keyQuery_jcr:content/proxyUser){
        free(keyQuery_jcr:content/proxyUser);
        keyQuery_jcr:content/proxyUser = NULL;
    }
    if(keyPairQuery_jcr:content/proxyUser){
        keyValuePair_free(keyPairQuery_jcr:content/proxyUser);
        keyPairQuery_jcr:content/proxyUser = NULL;
    }
    if(keyQuery_jcr:content/queueBatchMode){
        free(keyQuery_jcr:content/queueBatchMode);
        keyQuery_jcr:content/queueBatchMode = NULL;
    }
    if(valueQuery_jcr:content/queueBatchMode){
        free(valueQuery_jcr:content/queueBatchMode);
        valueQuery_jcr:content/queueBatchMode = NULL;
    }
    if(keyPairQuery_jcr:content/queueBatchMode){
        keyValuePair_free(keyPairQuery_jcr:content/queueBatchMode);
        keyPairQuery_jcr:content/queueBatchMode = NULL;
    }
    if(keyQuery_jcr:content/queueBatchMode){
        free(keyQuery_jcr:content/queueBatchMode);
        keyQuery_jcr:content/queueBatchMode = NULL;
    }
    if(keyPairQuery_jcr:content/queueBatchMode){
        keyValuePair_free(keyPairQuery_jcr:content/queueBatchMode);
        keyPairQuery_jcr:content/queueBatchMode = NULL;
    }
    if(keyQuery_jcr:content/retryDelay){
        free(keyQuery_jcr:content/retryDelay);
        keyQuery_jcr:content/retryDelay = NULL;
    }
    if(valueQuery_jcr:content/retryDelay){
        free(valueQuery_jcr:content/retryDelay);
        valueQuery_jcr:content/retryDelay = NULL;
    }
    if(keyPairQuery_jcr:content/retryDelay){
        keyValuePair_free(keyPairQuery_jcr:content/retryDelay);
        keyPairQuery_jcr:content/retryDelay = NULL;
    }
    if(keyQuery_jcr:content/retryDelay){
        free(keyQuery_jcr:content/retryDelay);
        keyQuery_jcr:content/retryDelay = NULL;
    }
    if(keyPairQuery_jcr:content/retryDelay){
        keyValuePair_free(keyPairQuery_jcr:content/retryDelay);
        keyPairQuery_jcr:content/retryDelay = NULL;
    }
    if(keyQuery_jcr:content/serializationType){
        free(keyQuery_jcr:content/serializationType);
        keyQuery_jcr:content/serializationType = NULL;
    }
    if(valueQuery_jcr:content/serializationType){
        free(valueQuery_jcr:content/serializationType);
        valueQuery_jcr:content/serializationType = NULL;
    }
    if(keyPairQuery_jcr:content/serializationType){
        keyValuePair_free(keyPairQuery_jcr:content/serializationType);
        keyPairQuery_jcr:content/serializationType = NULL;
    }
    if(keyQuery_jcr:content/serializationType){
        free(keyQuery_jcr:content/serializationType);
        keyQuery_jcr:content/serializationType = NULL;
    }
    if(keyPairQuery_jcr:content/serializationType){
        keyValuePair_free(keyPairQuery_jcr:content/serializationType);
        keyPairQuery_jcr:content/serializationType = NULL;
    }
    if(keyQuery_jcr:content/sling:resourceType){
        free(keyQuery_jcr:content/sling:resourceType);
        keyQuery_jcr:content/sling:resourceType = NULL;
    }
    if(valueQuery_jcr:content/sling:resourceType){
        free(valueQuery_jcr:content/sling:resourceType);
        valueQuery_jcr:content/sling:resourceType = NULL;
    }
    if(keyPairQuery_jcr:content/sling:resourceType){
        keyValuePair_free(keyPairQuery_jcr:content/sling:resourceType);
        keyPairQuery_jcr:content/sling:resourceType = NULL;
    }
    if(keyQuery_jcr:content/sling:resourceType){
        free(keyQuery_jcr:content/sling:resourceType);
        keyQuery_jcr:content/sling:resourceType = NULL;
    }
    if(keyPairQuery_jcr:content/sling:resourceType){
        keyValuePair_free(keyPairQuery_jcr:content/sling:resourceType);
        keyPairQuery_jcr:content/sling:resourceType = NULL;
    }
    if(keyQuery_jcr:content/ssl){
        free(keyQuery_jcr:content/ssl);
        keyQuery_jcr:content/ssl = NULL;
    }
    if(valueQuery_jcr:content/ssl){
        free(valueQuery_jcr:content/ssl);
        valueQuery_jcr:content/ssl = NULL;
    }
    if(keyPairQuery_jcr:content/ssl){
        keyValuePair_free(keyPairQuery_jcr:content/ssl);
        keyPairQuery_jcr:content/ssl = NULL;
    }
    if(keyQuery_jcr:content/ssl){
        free(keyQuery_jcr:content/ssl);
        keyQuery_jcr:content/ssl = NULL;
    }
    if(keyPairQuery_jcr:content/ssl){
        keyValuePair_free(keyPairQuery_jcr:content/ssl);
        keyPairQuery_jcr:content/ssl = NULL;
    }
    if(keyQuery_jcr:content/transportNTLMDomain){
        free(keyQuery_jcr:content/transportNTLMDomain);
        keyQuery_jcr:content/transportNTLMDomain = NULL;
    }
    if(valueQuery_jcr:content/transportNTLMDomain){
        free(valueQuery_jcr:content/transportNTLMDomain);
        valueQuery_jcr:content/transportNTLMDomain = NULL;
    }
    if(keyPairQuery_jcr:content/transportNTLMDomain){
        keyValuePair_free(keyPairQuery_jcr:content/transportNTLMDomain);
        keyPairQuery_jcr:content/transportNTLMDomain = NULL;
    }
    if(keyQuery_jcr:content/transportNTLMDomain){
        free(keyQuery_jcr:content/transportNTLMDomain);
        keyQuery_jcr:content/transportNTLMDomain = NULL;
    }
    if(keyPairQuery_jcr:content/transportNTLMDomain){
        keyValuePair_free(keyPairQuery_jcr:content/transportNTLMDomain);
        keyPairQuery_jcr:content/transportNTLMDomain = NULL;
    }
    if(keyQuery_jcr:content/transportNTLMHost){
        free(keyQuery_jcr:content/transportNTLMHost);
        keyQuery_jcr:content/transportNTLMHost = NULL;
    }
    if(valueQuery_jcr:content/transportNTLMHost){
        free(valueQuery_jcr:content/transportNTLMHost);
        valueQuery_jcr:content/transportNTLMHost = NULL;
    }
    if(keyPairQuery_jcr:content/transportNTLMHost){
        keyValuePair_free(keyPairQuery_jcr:content/transportNTLMHost);
        keyPairQuery_jcr:content/transportNTLMHost = NULL;
    }
    if(keyQuery_jcr:content/transportNTLMHost){
        free(keyQuery_jcr:content/transportNTLMHost);
        keyQuery_jcr:content/transportNTLMHost = NULL;
    }
    if(keyPairQuery_jcr:content/transportNTLMHost){
        keyValuePair_free(keyPairQuery_jcr:content/transportNTLMHost);
        keyPairQuery_jcr:content/transportNTLMHost = NULL;
    }
    if(keyQuery_jcr:content/transportPassword){
        free(keyQuery_jcr:content/transportPassword);
        keyQuery_jcr:content/transportPassword = NULL;
    }
    if(valueQuery_jcr:content/transportPassword){
        free(valueQuery_jcr:content/transportPassword);
        valueQuery_jcr:content/transportPassword = NULL;
    }
    if(keyPairQuery_jcr:content/transportPassword){
        keyValuePair_free(keyPairQuery_jcr:content/transportPassword);
        keyPairQuery_jcr:content/transportPassword = NULL;
    }
    if(keyQuery_jcr:content/transportPassword){
        free(keyQuery_jcr:content/transportPassword);
        keyQuery_jcr:content/transportPassword = NULL;
    }
    if(keyPairQuery_jcr:content/transportPassword){
        keyValuePair_free(keyPairQuery_jcr:content/transportPassword);
        keyPairQuery_jcr:content/transportPassword = NULL;
    }
    if(keyQuery_jcr:content/transportUri){
        free(keyQuery_jcr:content/transportUri);
        keyQuery_jcr:content/transportUri = NULL;
    }
    if(valueQuery_jcr:content/transportUri){
        free(valueQuery_jcr:content/transportUri);
        valueQuery_jcr:content/transportUri = NULL;
    }
    if(keyPairQuery_jcr:content/transportUri){
        keyValuePair_free(keyPairQuery_jcr:content/transportUri);
        keyPairQuery_jcr:content/transportUri = NULL;
    }
    if(keyQuery_jcr:content/transportUri){
        free(keyQuery_jcr:content/transportUri);
        keyQuery_jcr:content/transportUri = NULL;
    }
    if(keyPairQuery_jcr:content/transportUri){
        keyValuePair_free(keyPairQuery_jcr:content/transportUri);
        keyPairQuery_jcr:content/transportUri = NULL;
    }
    if(keyQuery_jcr:content/transportUser){
        free(keyQuery_jcr:content/transportUser);
        keyQuery_jcr:content/transportUser = NULL;
    }
    if(valueQuery_jcr:content/transportUser){
        free(valueQuery_jcr:content/transportUser);
        valueQuery_jcr:content/transportUser = NULL;
    }
    if(keyPairQuery_jcr:content/transportUser){
        keyValuePair_free(keyPairQuery_jcr:content/transportUser);
        keyPairQuery_jcr:content/transportUser = NULL;
    }
    if(keyQuery_jcr:content/transportUser){
        free(keyQuery_jcr:content/transportUser);
        keyQuery_jcr:content/transportUser = NULL;
    }
    if(keyPairQuery_jcr:content/transportUser){
        keyValuePair_free(keyPairQuery_jcr:content/transportUser);
        keyPairQuery_jcr:content/transportUser = NULL;
    }
    if(keyQuery_jcr:content/userId){
        free(keyQuery_jcr:content/userId);
        keyQuery_jcr:content/userId = NULL;
    }
    if(valueQuery_jcr:content/userId){
        free(valueQuery_jcr:content/userId);
        valueQuery_jcr:content/userId = NULL;
    }
    if(keyPairQuery_jcr:content/userId){
        keyValuePair_free(keyPairQuery_jcr:content/userId);
        keyPairQuery_jcr:content/userId = NULL;
    }
    if(keyQuery_jcr:content/userId){
        free(keyQuery_jcr:content/userId);
        keyQuery_jcr:content/userId = NULL;
    }
    if(keyPairQuery_jcr:content/userId){
        keyValuePair_free(keyPairQuery_jcr:content/userId);
        keyPairQuery_jcr:content/userId = NULL;
    }
    if(keyQuery_jcr:primaryType){
        free(keyQuery_jcr:primaryType);
        keyQuery_jcr:primaryType = NULL;
    }
    if(valueQuery_jcr:primaryType){
        free(valueQuery_jcr:primaryType);
        valueQuery_jcr:primaryType = NULL;
    }
    if(keyPairQuery_jcr:primaryType){
        keyValuePair_free(keyPairQuery_jcr:primaryType);
        keyPairQuery_jcr:primaryType = NULL;
    }
    if(keyQuery_jcr:primaryType){
        free(keyQuery_jcr:primaryType);
        keyQuery_jcr:primaryType = NULL;
    }
    if(keyPairQuery_jcr:primaryType){
        keyValuePair_free(keyPairQuery_jcr:primaryType);
        keyPairQuery_jcr:primaryType = NULL;
    }
    if(keyQuery_:operation){
        free(keyQuery_:operation);
        keyQuery_:operation = NULL;
    }
    if(valueQuery_:operation){
        free(valueQuery_:operation);
        valueQuery_:operation = NULL;
    }
    if(keyPairQuery_:operation){
        keyValuePair_free(keyPairQuery_:operation);
        keyPairQuery_:operation = NULL;
    }
    if(keyQuery_:operation){
        free(keyQuery_:operation);
        keyQuery_:operation = NULL;
    }
    if(keyPairQuery_:operation){
        keyValuePair_free(keyPairQuery_:operation);
        keyPairQuery_:operation = NULL;
    }

}

keystore_info_t*
SlingAPI_postAuthorizableKeystore(apiClient_t *apiClient, char *intermediatePath, char *authorizableId, char *:operation, char *currentPassword, char *newPassword, char *rePassword, char *keyPassword, char *keyStorePass, char *alias, char *newAlias, char *removeAlias, binary_t* cert_chain, binary_t* pk, binary_t* keyStore)
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
    char *localVarPath = strdup("/{intermediatePath}/{authorizableId}.ks.html");

    if(!intermediatePath)
        goto end;
    if(!authorizableId)
        goto end;


    // Path Params
    long sizeOfPathParams_intermediatePath = strlen(intermediatePath)+3 + strlen(authorizableId)+3 + sizeof("{ intermediatePath }") - 1;
    if(intermediatePath == NULL) {
        goto end;
    }
    char* localVarToReplace_intermediatePath = malloc(sizeOfPathParams_intermediatePath);
    sprintf(localVarToReplace_intermediatePath, "{%s}", "intermediatePath");

    localVarPath = strReplace(localVarPath, localVarToReplace_intermediatePath, intermediatePath);

    // Path Params
    long sizeOfPathParams_authorizableId = strlen(intermediatePath)+3 + strlen(authorizableId)+3 + sizeof("{ authorizableId }") - 1;
    if(authorizableId == NULL) {
        goto end;
    }
    char* localVarToReplace_authorizableId = malloc(sizeOfPathParams_authorizableId);
    sprintf(localVarToReplace_authorizableId, "{%s}", "authorizableId");

    localVarPath = strReplace(localVarPath, localVarToReplace_authorizableId, authorizableId);



    // query parameters
    char *keyQuery_:operation = NULL;
    char * valueQuery_:operation = NULL;
    keyValuePair_t *keyPairQuery_:operation = 0;
    if (:operation)
    {
        keyQuery_:operation = strdup(":operation");
        valueQuery_:operation = strdup((:operation));
        keyPairQuery_:operation = keyValuePair_create(keyQuery_:operation, valueQuery_:operation);
        list_addElement(localVarQueryParameters,keyPairQuery_:operation);
    }

    // query parameters
    char *keyQuery_currentPassword = NULL;
    char * valueQuery_currentPassword = NULL;
    keyValuePair_t *keyPairQuery_currentPassword = 0;
    if (currentPassword)
    {
        keyQuery_currentPassword = strdup("currentPassword");
        valueQuery_currentPassword = strdup((currentPassword));
        keyPairQuery_currentPassword = keyValuePair_create(keyQuery_currentPassword, valueQuery_currentPassword);
        list_addElement(localVarQueryParameters,keyPairQuery_currentPassword);
    }

    // query parameters
    char *keyQuery_newPassword = NULL;
    char * valueQuery_newPassword = NULL;
    keyValuePair_t *keyPairQuery_newPassword = 0;
    if (newPassword)
    {
        keyQuery_newPassword = strdup("newPassword");
        valueQuery_newPassword = strdup((newPassword));
        keyPairQuery_newPassword = keyValuePair_create(keyQuery_newPassword, valueQuery_newPassword);
        list_addElement(localVarQueryParameters,keyPairQuery_newPassword);
    }

    // query parameters
    char *keyQuery_rePassword = NULL;
    char * valueQuery_rePassword = NULL;
    keyValuePair_t *keyPairQuery_rePassword = 0;
    if (rePassword)
    {
        keyQuery_rePassword = strdup("rePassword");
        valueQuery_rePassword = strdup((rePassword));
        keyPairQuery_rePassword = keyValuePair_create(keyQuery_rePassword, valueQuery_rePassword);
        list_addElement(localVarQueryParameters,keyPairQuery_rePassword);
    }

    // query parameters
    char *keyQuery_keyPassword = NULL;
    char * valueQuery_keyPassword = NULL;
    keyValuePair_t *keyPairQuery_keyPassword = 0;
    if (keyPassword)
    {
        keyQuery_keyPassword = strdup("keyPassword");
        valueQuery_keyPassword = strdup((keyPassword));
        keyPairQuery_keyPassword = keyValuePair_create(keyQuery_keyPassword, valueQuery_keyPassword);
        list_addElement(localVarQueryParameters,keyPairQuery_keyPassword);
    }

    // query parameters
    char *keyQuery_keyStorePass = NULL;
    char * valueQuery_keyStorePass = NULL;
    keyValuePair_t *keyPairQuery_keyStorePass = 0;
    if (keyStorePass)
    {
        keyQuery_keyStorePass = strdup("keyStorePass");
        valueQuery_keyStorePass = strdup((keyStorePass));
        keyPairQuery_keyStorePass = keyValuePair_create(keyQuery_keyStorePass, valueQuery_keyStorePass);
        list_addElement(localVarQueryParameters,keyPairQuery_keyStorePass);
    }

    // query parameters
    char *keyQuery_alias = NULL;
    char * valueQuery_alias = NULL;
    keyValuePair_t *keyPairQuery_alias = 0;
    if (alias)
    {
        keyQuery_alias = strdup("alias");
        valueQuery_alias = strdup((alias));
        keyPairQuery_alias = keyValuePair_create(keyQuery_alias, valueQuery_alias);
        list_addElement(localVarQueryParameters,keyPairQuery_alias);
    }

    // query parameters
    char *keyQuery_newAlias = NULL;
    char * valueQuery_newAlias = NULL;
    keyValuePair_t *keyPairQuery_newAlias = 0;
    if (newAlias)
    {
        keyQuery_newAlias = strdup("newAlias");
        valueQuery_newAlias = strdup((newAlias));
        keyPairQuery_newAlias = keyValuePair_create(keyQuery_newAlias, valueQuery_newAlias);
        list_addElement(localVarQueryParameters,keyPairQuery_newAlias);
    }

    // query parameters
    char *keyQuery_removeAlias = NULL;
    char * valueQuery_removeAlias = NULL;
    keyValuePair_t *keyPairQuery_removeAlias = 0;
    if (removeAlias)
    {
        keyQuery_removeAlias = strdup("removeAlias");
        valueQuery_removeAlias = strdup((removeAlias));
        keyPairQuery_removeAlias = keyValuePair_create(keyQuery_removeAlias, valueQuery_removeAlias);
        list_addElement(localVarQueryParameters,keyPairQuery_removeAlias);
    }

    // form parameters
    char *keyForm_cert_chain = NULL;
    binary_t* valueForm_cert_chain = 0;
    keyValuePair_t *keyPairForm_cert_chain = 0;
    if (cert_chain != NULL)
    {
        keyForm_cert_chain = strdup("cert-chain");
        valueForm_cert_chain = cert_chain;
        keyPairForm_cert_chain = keyValuePair_create(keyForm_cert_chain, &valueForm_cert_chain);
        list_addElement(localVarFormParameters,keyPairForm_cert_chain); //file adding
    }

    // form parameters
    char *keyForm_pk = NULL;
    binary_t* valueForm_pk = 0;
    keyValuePair_t *keyPairForm_pk = 0;
    if (pk != NULL)
    {
        keyForm_pk = strdup("pk");
        valueForm_pk = pk;
        keyPairForm_pk = keyValuePair_create(keyForm_pk, &valueForm_pk);
        list_addElement(localVarFormParameters,keyPairForm_pk); //file adding
    }

    // form parameters
    char *keyForm_keyStore = NULL;
    binary_t* valueForm_keyStore = 0;
    keyValuePair_t *keyPairForm_keyStore = 0;
    if (keyStore != NULL)
    {
        keyForm_keyStore = strdup("keyStore");
        valueForm_keyStore = keyStore;
        keyPairForm_keyStore = keyValuePair_create(keyForm_keyStore, &valueForm_keyStore);
        list_addElement(localVarFormParameters,keyPairForm_keyStore); //file adding
    }
    list_addElement(localVarHeaderType,"text/plain"); //produces
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
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Retrieved Authorizable Keystore info");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Default response");
    //}
    //nonprimitive not container
    keystore_info_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *SlingAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = keystore_info_parseFromJSON(SlingAPIlocalVarJSON);
        cJSON_Delete(SlingAPIlocalVarJSON);
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
    
    list_freeList(localVarFormParameters);
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_intermediatePath);
    free(localVarToReplace_authorizableId);
    if(keyQuery_:operation){
        free(keyQuery_:operation);
        keyQuery_:operation = NULL;
    }
    if(valueQuery_:operation){
        free(valueQuery_:operation);
        valueQuery_:operation = NULL;
    }
    if(keyPairQuery_:operation){
        keyValuePair_free(keyPairQuery_:operation);
        keyPairQuery_:operation = NULL;
    }
    if(keyQuery_currentPassword){
        free(keyQuery_currentPassword);
        keyQuery_currentPassword = NULL;
    }
    if(valueQuery_currentPassword){
        free(valueQuery_currentPassword);
        valueQuery_currentPassword = NULL;
    }
    if(keyPairQuery_currentPassword){
        keyValuePair_free(keyPairQuery_currentPassword);
        keyPairQuery_currentPassword = NULL;
    }
    if(keyQuery_newPassword){
        free(keyQuery_newPassword);
        keyQuery_newPassword = NULL;
    }
    if(valueQuery_newPassword){
        free(valueQuery_newPassword);
        valueQuery_newPassword = NULL;
    }
    if(keyPairQuery_newPassword){
        keyValuePair_free(keyPairQuery_newPassword);
        keyPairQuery_newPassword = NULL;
    }
    if(keyQuery_rePassword){
        free(keyQuery_rePassword);
        keyQuery_rePassword = NULL;
    }
    if(valueQuery_rePassword){
        free(valueQuery_rePassword);
        valueQuery_rePassword = NULL;
    }
    if(keyPairQuery_rePassword){
        keyValuePair_free(keyPairQuery_rePassword);
        keyPairQuery_rePassword = NULL;
    }
    if(keyQuery_keyPassword){
        free(keyQuery_keyPassword);
        keyQuery_keyPassword = NULL;
    }
    if(valueQuery_keyPassword){
        free(valueQuery_keyPassword);
        valueQuery_keyPassword = NULL;
    }
    if(keyPairQuery_keyPassword){
        keyValuePair_free(keyPairQuery_keyPassword);
        keyPairQuery_keyPassword = NULL;
    }
    if(keyQuery_keyStorePass){
        free(keyQuery_keyStorePass);
        keyQuery_keyStorePass = NULL;
    }
    if(valueQuery_keyStorePass){
        free(valueQuery_keyStorePass);
        valueQuery_keyStorePass = NULL;
    }
    if(keyPairQuery_keyStorePass){
        keyValuePair_free(keyPairQuery_keyStorePass);
        keyPairQuery_keyStorePass = NULL;
    }
    if(keyQuery_alias){
        free(keyQuery_alias);
        keyQuery_alias = NULL;
    }
    if(valueQuery_alias){
        free(valueQuery_alias);
        valueQuery_alias = NULL;
    }
    if(keyPairQuery_alias){
        keyValuePair_free(keyPairQuery_alias);
        keyPairQuery_alias = NULL;
    }
    if(keyQuery_newAlias){
        free(keyQuery_newAlias);
        keyQuery_newAlias = NULL;
    }
    if(valueQuery_newAlias){
        free(valueQuery_newAlias);
        valueQuery_newAlias = NULL;
    }
    if(keyPairQuery_newAlias){
        keyValuePair_free(keyPairQuery_newAlias);
        keyPairQuery_newAlias = NULL;
    }
    if(keyQuery_removeAlias){
        free(keyQuery_removeAlias);
        keyQuery_removeAlias = NULL;
    }
    if(valueQuery_removeAlias){
        free(valueQuery_removeAlias);
        valueQuery_removeAlias = NULL;
    }
    if(keyPairQuery_removeAlias){
        keyValuePair_free(keyPairQuery_removeAlias);
        keyPairQuery_removeAlias = NULL;
    }
    if (keyForm_cert_chain) {
        free(keyForm_cert_chain);
        keyForm_cert_chain = NULL;
    }
//    free(fileVar_cert_chain->data);
//    free(fileVar_cert_chain);
    free(keyPairForm_cert_chain);
    if (keyForm_pk) {
        free(keyForm_pk);
        keyForm_pk = NULL;
    }
//    free(fileVar_pk->data);
//    free(fileVar_pk);
    free(keyPairForm_pk);
    if (keyForm_keyStore) {
        free(keyForm_keyStore);
        keyForm_keyStore = NULL;
    }
//    free(fileVar_keyStore->data);
//    free(fileVar_keyStore);
    free(keyPairForm_keyStore);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

char*
SlingAPI_postAuthorizables(apiClient_t *apiClient, char *authorizableId, char *intermediatePath, char *createUser, char *createGroup, char *rep:password, char *profile/givenName)
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
    char *localVarPath = strdup("/libs/granite/security/post/authorizables");





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
    char *keyQuery_intermediatePath = NULL;
    char * valueQuery_intermediatePath = NULL;
    keyValuePair_t *keyPairQuery_intermediatePath = 0;
    if (intermediatePath)
    {
        keyQuery_intermediatePath = strdup("intermediatePath");
        valueQuery_intermediatePath = strdup((intermediatePath));
        keyPairQuery_intermediatePath = keyValuePair_create(keyQuery_intermediatePath, valueQuery_intermediatePath);
        list_addElement(localVarQueryParameters,keyPairQuery_intermediatePath);
    }

    // query parameters
    char *keyQuery_createUser = NULL;
    char * valueQuery_createUser = NULL;
    keyValuePair_t *keyPairQuery_createUser = 0;
    if (createUser)
    {
        keyQuery_createUser = strdup("createUser");
        valueQuery_createUser = strdup((createUser));
        keyPairQuery_createUser = keyValuePair_create(keyQuery_createUser, valueQuery_createUser);
        list_addElement(localVarQueryParameters,keyPairQuery_createUser);
    }

    // query parameters
    char *keyQuery_createGroup = NULL;
    char * valueQuery_createGroup = NULL;
    keyValuePair_t *keyPairQuery_createGroup = 0;
    if (createGroup)
    {
        keyQuery_createGroup = strdup("createGroup");
        valueQuery_createGroup = strdup((createGroup));
        keyPairQuery_createGroup = keyValuePair_create(keyQuery_createGroup, valueQuery_createGroup);
        list_addElement(localVarQueryParameters,keyPairQuery_createGroup);
    }

    // query parameters
    char *keyQuery_rep:password = NULL;
    char * valueQuery_rep:password = NULL;
    keyValuePair_t *keyPairQuery_rep:password = 0;
    if (rep:password)
    {
        keyQuery_rep:password = strdup("rep:password");
        valueQuery_rep:password = strdup((rep:password));
        keyPairQuery_rep:password = keyValuePair_create(keyQuery_rep:password, valueQuery_rep:password);
        list_addElement(localVarQueryParameters,keyPairQuery_rep:password);
    }

    // query parameters
    char *keyQuery_profile/givenName = NULL;
    char * valueQuery_profile/givenName = NULL;
    keyValuePair_t *keyPairQuery_profile/givenName = 0;
    if (profile/givenName)
    {
        keyQuery_profile/givenName = strdup("profile/givenName");
        valueQuery_profile/givenName = strdup((profile/givenName));
        keyPairQuery_profile/givenName = keyValuePair_create(keyQuery_profile/givenName, valueQuery_profile/givenName);
        list_addElement(localVarQueryParameters,keyPairQuery_profile/givenName);
    }
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
    if(keyQuery_intermediatePath){
        free(keyQuery_intermediatePath);
        keyQuery_intermediatePath = NULL;
    }
    if(valueQuery_intermediatePath){
        free(valueQuery_intermediatePath);
        valueQuery_intermediatePath = NULL;
    }
    if(keyPairQuery_intermediatePath){
        keyValuePair_free(keyPairQuery_intermediatePath);
        keyPairQuery_intermediatePath = NULL;
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
    if(keyQuery_createGroup){
        free(keyQuery_createGroup);
        keyQuery_createGroup = NULL;
    }
    if(valueQuery_createGroup){
        free(valueQuery_createGroup);
        valueQuery_createGroup = NULL;
    }
    if(keyPairQuery_createGroup){
        keyValuePair_free(keyPairQuery_createGroup);
        keyPairQuery_createGroup = NULL;
    }
    if(keyQuery_rep:password){
        free(keyQuery_rep:password);
        keyQuery_rep:password = NULL;
    }
    if(valueQuery_rep:password){
        free(valueQuery_rep:password);
        valueQuery_rep:password = NULL;
    }
    if(keyPairQuery_rep:password){
        keyValuePair_free(keyPairQuery_rep:password);
        keyPairQuery_rep:password = NULL;
    }
    if(keyQuery_profile/givenName){
        free(keyQuery_profile/givenName);
        keyQuery_profile/givenName = NULL;
    }
    if(valueQuery_profile/givenName){
        free(valueQuery_profile/givenName);
        valueQuery_profile/givenName = NULL;
    }
    if(keyPairQuery_profile/givenName){
        keyValuePair_free(keyPairQuery_profile/givenName);
        keyPairQuery_profile/givenName = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

void
SlingAPI_postConfigAdobeGraniteSamlAuthenticationHandler(apiClient_t *apiClient, char *keyStorePassword, char *keyStorePassword@TypeHint, int *service.ranking, char *service.ranking@TypeHint, int *idpHttpRedirect, char *idpHttpRedirect@TypeHint, int *createUser, char *createUser@TypeHint, char *defaultRedirectUrl, char *defaultRedirectUrl@TypeHint, char *userIDAttribute, char *userIDAttribute@TypeHint, list_t *defaultGroups, char *defaultGroups@TypeHint, char *idpCertAlias, char *idpCertAlias@TypeHint, int *addGroupMemberships, char *addGroupMemberships@TypeHint, list_t *path, char *path@TypeHint, list_t *synchronizeAttributes, char *synchronizeAttributes@TypeHint, int *clockTolerance, char *clockTolerance@TypeHint, char *groupMembershipAttribute, char *groupMembershipAttribute@TypeHint, char *idpUrl, char *idpUrl@TypeHint, char *logoutUrl, char *logoutUrl@TypeHint, char *serviceProviderEntityId, char *serviceProviderEntityId@TypeHint, char *assertionConsumerServiceURL, char *assertionConsumerServiceURL@TypeHint, int *handleLogout, char *handleLogout@TypeHint, char *spPrivateKeyAlias, char *spPrivateKeyAlias@TypeHint, int *useEncryption, char *useEncryption@TypeHint, char *nameIdFormat, char *nameIdFormat@TypeHint, char *digestMethod, char *digestMethod@TypeHint, char *signatureMethod, char *signatureMethod@TypeHint, char *userIntermediatePath, char *userIntermediatePath@TypeHint)
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
    char *localVarPath = strdup("/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config");





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
    char *keyQuery_keyStorePassword@TypeHint = NULL;
    char * valueQuery_keyStorePassword@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_keyStorePassword@TypeHint = 0;
    if (keyStorePassword@TypeHint)
    {
        keyQuery_keyStorePassword@TypeHint = strdup("keyStorePassword@TypeHint");
        valueQuery_keyStorePassword@TypeHint = strdup((keyStorePassword@TypeHint));
        keyPairQuery_keyStorePassword@TypeHint = keyValuePair_create(keyQuery_keyStorePassword@TypeHint, valueQuery_keyStorePassword@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_keyStorePassword@TypeHint);
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
    char *keyQuery_service.ranking@TypeHint = NULL;
    char * valueQuery_service.ranking@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_service.ranking@TypeHint = 0;
    if (service.ranking@TypeHint)
    {
        keyQuery_service.ranking@TypeHint = strdup("service.ranking@TypeHint");
        valueQuery_service.ranking@TypeHint = strdup((service.ranking@TypeHint));
        keyPairQuery_service.ranking@TypeHint = keyValuePair_create(keyQuery_service.ranking@TypeHint, valueQuery_service.ranking@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_service.ranking@TypeHint);
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
    char *keyQuery_idpHttpRedirect@TypeHint = NULL;
    char * valueQuery_idpHttpRedirect@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_idpHttpRedirect@TypeHint = 0;
    if (idpHttpRedirect@TypeHint)
    {
        keyQuery_idpHttpRedirect@TypeHint = strdup("idpHttpRedirect@TypeHint");
        valueQuery_idpHttpRedirect@TypeHint = strdup((idpHttpRedirect@TypeHint));
        keyPairQuery_idpHttpRedirect@TypeHint = keyValuePair_create(keyQuery_idpHttpRedirect@TypeHint, valueQuery_idpHttpRedirect@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_idpHttpRedirect@TypeHint);
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
    char *keyQuery_createUser@TypeHint = NULL;
    char * valueQuery_createUser@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_createUser@TypeHint = 0;
    if (createUser@TypeHint)
    {
        keyQuery_createUser@TypeHint = strdup("createUser@TypeHint");
        valueQuery_createUser@TypeHint = strdup((createUser@TypeHint));
        keyPairQuery_createUser@TypeHint = keyValuePair_create(keyQuery_createUser@TypeHint, valueQuery_createUser@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_createUser@TypeHint);
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
    char *keyQuery_defaultRedirectUrl@TypeHint = NULL;
    char * valueQuery_defaultRedirectUrl@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_defaultRedirectUrl@TypeHint = 0;
    if (defaultRedirectUrl@TypeHint)
    {
        keyQuery_defaultRedirectUrl@TypeHint = strdup("defaultRedirectUrl@TypeHint");
        valueQuery_defaultRedirectUrl@TypeHint = strdup((defaultRedirectUrl@TypeHint));
        keyPairQuery_defaultRedirectUrl@TypeHint = keyValuePair_create(keyQuery_defaultRedirectUrl@TypeHint, valueQuery_defaultRedirectUrl@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_defaultRedirectUrl@TypeHint);
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
    char *keyQuery_userIDAttribute@TypeHint = NULL;
    char * valueQuery_userIDAttribute@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_userIDAttribute@TypeHint = 0;
    if (userIDAttribute@TypeHint)
    {
        keyQuery_userIDAttribute@TypeHint = strdup("userIDAttribute@TypeHint");
        valueQuery_userIDAttribute@TypeHint = strdup((userIDAttribute@TypeHint));
        keyPairQuery_userIDAttribute@TypeHint = keyValuePair_create(keyQuery_userIDAttribute@TypeHint, valueQuery_userIDAttribute@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_userIDAttribute@TypeHint);
    }

    // query parameters
    if (defaultGroups)
    {
        list_addElement(localVarQueryParameters,defaultGroups);
    }

    // query parameters
    char *keyQuery_defaultGroups@TypeHint = NULL;
    char * valueQuery_defaultGroups@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_defaultGroups@TypeHint = 0;
    if (defaultGroups@TypeHint)
    {
        keyQuery_defaultGroups@TypeHint = strdup("defaultGroups@TypeHint");
        valueQuery_defaultGroups@TypeHint = strdup((defaultGroups@TypeHint));
        keyPairQuery_defaultGroups@TypeHint = keyValuePair_create(keyQuery_defaultGroups@TypeHint, valueQuery_defaultGroups@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_defaultGroups@TypeHint);
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
    char *keyQuery_idpCertAlias@TypeHint = NULL;
    char * valueQuery_idpCertAlias@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_idpCertAlias@TypeHint = 0;
    if (idpCertAlias@TypeHint)
    {
        keyQuery_idpCertAlias@TypeHint = strdup("idpCertAlias@TypeHint");
        valueQuery_idpCertAlias@TypeHint = strdup((idpCertAlias@TypeHint));
        keyPairQuery_idpCertAlias@TypeHint = keyValuePair_create(keyQuery_idpCertAlias@TypeHint, valueQuery_idpCertAlias@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_idpCertAlias@TypeHint);
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
    char *keyQuery_addGroupMemberships@TypeHint = NULL;
    char * valueQuery_addGroupMemberships@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_addGroupMemberships@TypeHint = 0;
    if (addGroupMemberships@TypeHint)
    {
        keyQuery_addGroupMemberships@TypeHint = strdup("addGroupMemberships@TypeHint");
        valueQuery_addGroupMemberships@TypeHint = strdup((addGroupMemberships@TypeHint));
        keyPairQuery_addGroupMemberships@TypeHint = keyValuePair_create(keyQuery_addGroupMemberships@TypeHint, valueQuery_addGroupMemberships@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_addGroupMemberships@TypeHint);
    }

    // query parameters
    if (path)
    {
        list_addElement(localVarQueryParameters,path);
    }

    // query parameters
    char *keyQuery_path@TypeHint = NULL;
    char * valueQuery_path@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_path@TypeHint = 0;
    if (path@TypeHint)
    {
        keyQuery_path@TypeHint = strdup("path@TypeHint");
        valueQuery_path@TypeHint = strdup((path@TypeHint));
        keyPairQuery_path@TypeHint = keyValuePair_create(keyQuery_path@TypeHint, valueQuery_path@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_path@TypeHint);
    }

    // query parameters
    if (synchronizeAttributes)
    {
        list_addElement(localVarQueryParameters,synchronizeAttributes);
    }

    // query parameters
    char *keyQuery_synchronizeAttributes@TypeHint = NULL;
    char * valueQuery_synchronizeAttributes@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_synchronizeAttributes@TypeHint = 0;
    if (synchronizeAttributes@TypeHint)
    {
        keyQuery_synchronizeAttributes@TypeHint = strdup("synchronizeAttributes@TypeHint");
        valueQuery_synchronizeAttributes@TypeHint = strdup((synchronizeAttributes@TypeHint));
        keyPairQuery_synchronizeAttributes@TypeHint = keyValuePair_create(keyQuery_synchronizeAttributes@TypeHint, valueQuery_synchronizeAttributes@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_synchronizeAttributes@TypeHint);
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
    char *keyQuery_clockTolerance@TypeHint = NULL;
    char * valueQuery_clockTolerance@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_clockTolerance@TypeHint = 0;
    if (clockTolerance@TypeHint)
    {
        keyQuery_clockTolerance@TypeHint = strdup("clockTolerance@TypeHint");
        valueQuery_clockTolerance@TypeHint = strdup((clockTolerance@TypeHint));
        keyPairQuery_clockTolerance@TypeHint = keyValuePair_create(keyQuery_clockTolerance@TypeHint, valueQuery_clockTolerance@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_clockTolerance@TypeHint);
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
    char *keyQuery_groupMembershipAttribute@TypeHint = NULL;
    char * valueQuery_groupMembershipAttribute@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_groupMembershipAttribute@TypeHint = 0;
    if (groupMembershipAttribute@TypeHint)
    {
        keyQuery_groupMembershipAttribute@TypeHint = strdup("groupMembershipAttribute@TypeHint");
        valueQuery_groupMembershipAttribute@TypeHint = strdup((groupMembershipAttribute@TypeHint));
        keyPairQuery_groupMembershipAttribute@TypeHint = keyValuePair_create(keyQuery_groupMembershipAttribute@TypeHint, valueQuery_groupMembershipAttribute@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_groupMembershipAttribute@TypeHint);
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
    char *keyQuery_idpUrl@TypeHint = NULL;
    char * valueQuery_idpUrl@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_idpUrl@TypeHint = 0;
    if (idpUrl@TypeHint)
    {
        keyQuery_idpUrl@TypeHint = strdup("idpUrl@TypeHint");
        valueQuery_idpUrl@TypeHint = strdup((idpUrl@TypeHint));
        keyPairQuery_idpUrl@TypeHint = keyValuePair_create(keyQuery_idpUrl@TypeHint, valueQuery_idpUrl@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_idpUrl@TypeHint);
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
    char *keyQuery_logoutUrl@TypeHint = NULL;
    char * valueQuery_logoutUrl@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_logoutUrl@TypeHint = 0;
    if (logoutUrl@TypeHint)
    {
        keyQuery_logoutUrl@TypeHint = strdup("logoutUrl@TypeHint");
        valueQuery_logoutUrl@TypeHint = strdup((logoutUrl@TypeHint));
        keyPairQuery_logoutUrl@TypeHint = keyValuePair_create(keyQuery_logoutUrl@TypeHint, valueQuery_logoutUrl@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_logoutUrl@TypeHint);
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
    char *keyQuery_serviceProviderEntityId@TypeHint = NULL;
    char * valueQuery_serviceProviderEntityId@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_serviceProviderEntityId@TypeHint = 0;
    if (serviceProviderEntityId@TypeHint)
    {
        keyQuery_serviceProviderEntityId@TypeHint = strdup("serviceProviderEntityId@TypeHint");
        valueQuery_serviceProviderEntityId@TypeHint = strdup((serviceProviderEntityId@TypeHint));
        keyPairQuery_serviceProviderEntityId@TypeHint = keyValuePair_create(keyQuery_serviceProviderEntityId@TypeHint, valueQuery_serviceProviderEntityId@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_serviceProviderEntityId@TypeHint);
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
    char *keyQuery_assertionConsumerServiceURL@TypeHint = NULL;
    char * valueQuery_assertionConsumerServiceURL@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_assertionConsumerServiceURL@TypeHint = 0;
    if (assertionConsumerServiceURL@TypeHint)
    {
        keyQuery_assertionConsumerServiceURL@TypeHint = strdup("assertionConsumerServiceURL@TypeHint");
        valueQuery_assertionConsumerServiceURL@TypeHint = strdup((assertionConsumerServiceURL@TypeHint));
        keyPairQuery_assertionConsumerServiceURL@TypeHint = keyValuePair_create(keyQuery_assertionConsumerServiceURL@TypeHint, valueQuery_assertionConsumerServiceURL@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_assertionConsumerServiceURL@TypeHint);
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
    char *keyQuery_handleLogout@TypeHint = NULL;
    char * valueQuery_handleLogout@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_handleLogout@TypeHint = 0;
    if (handleLogout@TypeHint)
    {
        keyQuery_handleLogout@TypeHint = strdup("handleLogout@TypeHint");
        valueQuery_handleLogout@TypeHint = strdup((handleLogout@TypeHint));
        keyPairQuery_handleLogout@TypeHint = keyValuePair_create(keyQuery_handleLogout@TypeHint, valueQuery_handleLogout@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_handleLogout@TypeHint);
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
    char *keyQuery_spPrivateKeyAlias@TypeHint = NULL;
    char * valueQuery_spPrivateKeyAlias@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_spPrivateKeyAlias@TypeHint = 0;
    if (spPrivateKeyAlias@TypeHint)
    {
        keyQuery_spPrivateKeyAlias@TypeHint = strdup("spPrivateKeyAlias@TypeHint");
        valueQuery_spPrivateKeyAlias@TypeHint = strdup((spPrivateKeyAlias@TypeHint));
        keyPairQuery_spPrivateKeyAlias@TypeHint = keyValuePair_create(keyQuery_spPrivateKeyAlias@TypeHint, valueQuery_spPrivateKeyAlias@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_spPrivateKeyAlias@TypeHint);
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
    char *keyQuery_useEncryption@TypeHint = NULL;
    char * valueQuery_useEncryption@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_useEncryption@TypeHint = 0;
    if (useEncryption@TypeHint)
    {
        keyQuery_useEncryption@TypeHint = strdup("useEncryption@TypeHint");
        valueQuery_useEncryption@TypeHint = strdup((useEncryption@TypeHint));
        keyPairQuery_useEncryption@TypeHint = keyValuePair_create(keyQuery_useEncryption@TypeHint, valueQuery_useEncryption@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_useEncryption@TypeHint);
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
    char *keyQuery_nameIdFormat@TypeHint = NULL;
    char * valueQuery_nameIdFormat@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_nameIdFormat@TypeHint = 0;
    if (nameIdFormat@TypeHint)
    {
        keyQuery_nameIdFormat@TypeHint = strdup("nameIdFormat@TypeHint");
        valueQuery_nameIdFormat@TypeHint = strdup((nameIdFormat@TypeHint));
        keyPairQuery_nameIdFormat@TypeHint = keyValuePair_create(keyQuery_nameIdFormat@TypeHint, valueQuery_nameIdFormat@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_nameIdFormat@TypeHint);
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
    char *keyQuery_digestMethod@TypeHint = NULL;
    char * valueQuery_digestMethod@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_digestMethod@TypeHint = 0;
    if (digestMethod@TypeHint)
    {
        keyQuery_digestMethod@TypeHint = strdup("digestMethod@TypeHint");
        valueQuery_digestMethod@TypeHint = strdup((digestMethod@TypeHint));
        keyPairQuery_digestMethod@TypeHint = keyValuePair_create(keyQuery_digestMethod@TypeHint, valueQuery_digestMethod@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_digestMethod@TypeHint);
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
    char *keyQuery_signatureMethod@TypeHint = NULL;
    char * valueQuery_signatureMethod@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_signatureMethod@TypeHint = 0;
    if (signatureMethod@TypeHint)
    {
        keyQuery_signatureMethod@TypeHint = strdup("signatureMethod@TypeHint");
        valueQuery_signatureMethod@TypeHint = strdup((signatureMethod@TypeHint));
        keyPairQuery_signatureMethod@TypeHint = keyValuePair_create(keyQuery_signatureMethod@TypeHint, valueQuery_signatureMethod@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_signatureMethod@TypeHint);
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
    char *keyQuery_userIntermediatePath@TypeHint = NULL;
    char * valueQuery_userIntermediatePath@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_userIntermediatePath@TypeHint = 0;
    if (userIntermediatePath@TypeHint)
    {
        keyQuery_userIntermediatePath@TypeHint = strdup("userIntermediatePath@TypeHint");
        valueQuery_userIntermediatePath@TypeHint = strdup((userIntermediatePath@TypeHint));
        keyPairQuery_userIntermediatePath@TypeHint = keyValuePair_create(keyQuery_userIntermediatePath@TypeHint, valueQuery_userIntermediatePath@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_userIntermediatePath@TypeHint);
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
    if(keyQuery_keyStorePassword){
        free(keyQuery_keyStorePassword);
        keyQuery_keyStorePassword = NULL;
    }
    if(keyPairQuery_keyStorePassword){
        keyValuePair_free(keyPairQuery_keyStorePassword);
        keyPairQuery_keyStorePassword = NULL;
    }
    if(keyQuery_keyStorePassword@TypeHint){
        free(keyQuery_keyStorePassword@TypeHint);
        keyQuery_keyStorePassword@TypeHint = NULL;
    }
    if(valueQuery_keyStorePassword@TypeHint){
        free(valueQuery_keyStorePassword@TypeHint);
        valueQuery_keyStorePassword@TypeHint = NULL;
    }
    if(keyPairQuery_keyStorePassword@TypeHint){
        keyValuePair_free(keyPairQuery_keyStorePassword@TypeHint);
        keyPairQuery_keyStorePassword@TypeHint = NULL;
    }
    if(keyQuery_keyStorePassword@TypeHint){
        free(keyQuery_keyStorePassword@TypeHint);
        keyQuery_keyStorePassword@TypeHint = NULL;
    }
    if(keyPairQuery_keyStorePassword@TypeHint){
        keyValuePair_free(keyPairQuery_keyStorePassword@TypeHint);
        keyPairQuery_keyStorePassword@TypeHint = NULL;
    }
    if(keyQuery_service.ranking@TypeHint){
        free(keyQuery_service.ranking@TypeHint);
        keyQuery_service.ranking@TypeHint = NULL;
    }
    if(valueQuery_service.ranking@TypeHint){
        free(valueQuery_service.ranking@TypeHint);
        valueQuery_service.ranking@TypeHint = NULL;
    }
    if(keyPairQuery_service.ranking@TypeHint){
        keyValuePair_free(keyPairQuery_service.ranking@TypeHint);
        keyPairQuery_service.ranking@TypeHint = NULL;
    }
    if(keyQuery_service.ranking@TypeHint){
        free(keyQuery_service.ranking@TypeHint);
        keyQuery_service.ranking@TypeHint = NULL;
    }
    if(keyPairQuery_service.ranking@TypeHint){
        keyValuePair_free(keyPairQuery_service.ranking@TypeHint);
        keyPairQuery_service.ranking@TypeHint = NULL;
    }
    if(keyQuery_idpHttpRedirect@TypeHint){
        free(keyQuery_idpHttpRedirect@TypeHint);
        keyQuery_idpHttpRedirect@TypeHint = NULL;
    }
    if(valueQuery_idpHttpRedirect@TypeHint){
        free(valueQuery_idpHttpRedirect@TypeHint);
        valueQuery_idpHttpRedirect@TypeHint = NULL;
    }
    if(keyPairQuery_idpHttpRedirect@TypeHint){
        keyValuePair_free(keyPairQuery_idpHttpRedirect@TypeHint);
        keyPairQuery_idpHttpRedirect@TypeHint = NULL;
    }
    if(keyQuery_idpHttpRedirect@TypeHint){
        free(keyQuery_idpHttpRedirect@TypeHint);
        keyQuery_idpHttpRedirect@TypeHint = NULL;
    }
    if(keyPairQuery_idpHttpRedirect@TypeHint){
        keyValuePair_free(keyPairQuery_idpHttpRedirect@TypeHint);
        keyPairQuery_idpHttpRedirect@TypeHint = NULL;
    }
    if(keyQuery_createUser@TypeHint){
        free(keyQuery_createUser@TypeHint);
        keyQuery_createUser@TypeHint = NULL;
    }
    if(valueQuery_createUser@TypeHint){
        free(valueQuery_createUser@TypeHint);
        valueQuery_createUser@TypeHint = NULL;
    }
    if(keyPairQuery_createUser@TypeHint){
        keyValuePair_free(keyPairQuery_createUser@TypeHint);
        keyPairQuery_createUser@TypeHint = NULL;
    }
    if(keyQuery_createUser@TypeHint){
        free(keyQuery_createUser@TypeHint);
        keyQuery_createUser@TypeHint = NULL;
    }
    if(keyPairQuery_createUser@TypeHint){
        keyValuePair_free(keyPairQuery_createUser@TypeHint);
        keyPairQuery_createUser@TypeHint = NULL;
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
    if(keyQuery_defaultRedirectUrl){
        free(keyQuery_defaultRedirectUrl);
        keyQuery_defaultRedirectUrl = NULL;
    }
    if(keyPairQuery_defaultRedirectUrl){
        keyValuePair_free(keyPairQuery_defaultRedirectUrl);
        keyPairQuery_defaultRedirectUrl = NULL;
    }
    if(keyQuery_defaultRedirectUrl@TypeHint){
        free(keyQuery_defaultRedirectUrl@TypeHint);
        keyQuery_defaultRedirectUrl@TypeHint = NULL;
    }
    if(valueQuery_defaultRedirectUrl@TypeHint){
        free(valueQuery_defaultRedirectUrl@TypeHint);
        valueQuery_defaultRedirectUrl@TypeHint = NULL;
    }
    if(keyPairQuery_defaultRedirectUrl@TypeHint){
        keyValuePair_free(keyPairQuery_defaultRedirectUrl@TypeHint);
        keyPairQuery_defaultRedirectUrl@TypeHint = NULL;
    }
    if(keyQuery_defaultRedirectUrl@TypeHint){
        free(keyQuery_defaultRedirectUrl@TypeHint);
        keyQuery_defaultRedirectUrl@TypeHint = NULL;
    }
    if(keyPairQuery_defaultRedirectUrl@TypeHint){
        keyValuePair_free(keyPairQuery_defaultRedirectUrl@TypeHint);
        keyPairQuery_defaultRedirectUrl@TypeHint = NULL;
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
    if(keyQuery_userIDAttribute){
        free(keyQuery_userIDAttribute);
        keyQuery_userIDAttribute = NULL;
    }
    if(keyPairQuery_userIDAttribute){
        keyValuePair_free(keyPairQuery_userIDAttribute);
        keyPairQuery_userIDAttribute = NULL;
    }
    if(keyQuery_userIDAttribute@TypeHint){
        free(keyQuery_userIDAttribute@TypeHint);
        keyQuery_userIDAttribute@TypeHint = NULL;
    }
    if(valueQuery_userIDAttribute@TypeHint){
        free(valueQuery_userIDAttribute@TypeHint);
        valueQuery_userIDAttribute@TypeHint = NULL;
    }
    if(keyPairQuery_userIDAttribute@TypeHint){
        keyValuePair_free(keyPairQuery_userIDAttribute@TypeHint);
        keyPairQuery_userIDAttribute@TypeHint = NULL;
    }
    if(keyQuery_userIDAttribute@TypeHint){
        free(keyQuery_userIDAttribute@TypeHint);
        keyQuery_userIDAttribute@TypeHint = NULL;
    }
    if(keyPairQuery_userIDAttribute@TypeHint){
        keyValuePair_free(keyPairQuery_userIDAttribute@TypeHint);
        keyPairQuery_userIDAttribute@TypeHint = NULL;
    }
    if(keyQuery_defaultGroups@TypeHint){
        free(keyQuery_defaultGroups@TypeHint);
        keyQuery_defaultGroups@TypeHint = NULL;
    }
    if(valueQuery_defaultGroups@TypeHint){
        free(valueQuery_defaultGroups@TypeHint);
        valueQuery_defaultGroups@TypeHint = NULL;
    }
    if(keyPairQuery_defaultGroups@TypeHint){
        keyValuePair_free(keyPairQuery_defaultGroups@TypeHint);
        keyPairQuery_defaultGroups@TypeHint = NULL;
    }
    if(keyQuery_defaultGroups@TypeHint){
        free(keyQuery_defaultGroups@TypeHint);
        keyQuery_defaultGroups@TypeHint = NULL;
    }
    if(keyPairQuery_defaultGroups@TypeHint){
        keyValuePair_free(keyPairQuery_defaultGroups@TypeHint);
        keyPairQuery_defaultGroups@TypeHint = NULL;
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
    if(keyQuery_idpCertAlias){
        free(keyQuery_idpCertAlias);
        keyQuery_idpCertAlias = NULL;
    }
    if(keyPairQuery_idpCertAlias){
        keyValuePair_free(keyPairQuery_idpCertAlias);
        keyPairQuery_idpCertAlias = NULL;
    }
    if(keyQuery_idpCertAlias@TypeHint){
        free(keyQuery_idpCertAlias@TypeHint);
        keyQuery_idpCertAlias@TypeHint = NULL;
    }
    if(valueQuery_idpCertAlias@TypeHint){
        free(valueQuery_idpCertAlias@TypeHint);
        valueQuery_idpCertAlias@TypeHint = NULL;
    }
    if(keyPairQuery_idpCertAlias@TypeHint){
        keyValuePair_free(keyPairQuery_idpCertAlias@TypeHint);
        keyPairQuery_idpCertAlias@TypeHint = NULL;
    }
    if(keyQuery_idpCertAlias@TypeHint){
        free(keyQuery_idpCertAlias@TypeHint);
        keyQuery_idpCertAlias@TypeHint = NULL;
    }
    if(keyPairQuery_idpCertAlias@TypeHint){
        keyValuePair_free(keyPairQuery_idpCertAlias@TypeHint);
        keyPairQuery_idpCertAlias@TypeHint = NULL;
    }
    if(keyQuery_addGroupMemberships@TypeHint){
        free(keyQuery_addGroupMemberships@TypeHint);
        keyQuery_addGroupMemberships@TypeHint = NULL;
    }
    if(valueQuery_addGroupMemberships@TypeHint){
        free(valueQuery_addGroupMemberships@TypeHint);
        valueQuery_addGroupMemberships@TypeHint = NULL;
    }
    if(keyPairQuery_addGroupMemberships@TypeHint){
        keyValuePair_free(keyPairQuery_addGroupMemberships@TypeHint);
        keyPairQuery_addGroupMemberships@TypeHint = NULL;
    }
    if(keyQuery_addGroupMemberships@TypeHint){
        free(keyQuery_addGroupMemberships@TypeHint);
        keyQuery_addGroupMemberships@TypeHint = NULL;
    }
    if(keyPairQuery_addGroupMemberships@TypeHint){
        keyValuePair_free(keyPairQuery_addGroupMemberships@TypeHint);
        keyPairQuery_addGroupMemberships@TypeHint = NULL;
    }
    if(keyQuery_path@TypeHint){
        free(keyQuery_path@TypeHint);
        keyQuery_path@TypeHint = NULL;
    }
    if(valueQuery_path@TypeHint){
        free(valueQuery_path@TypeHint);
        valueQuery_path@TypeHint = NULL;
    }
    if(keyPairQuery_path@TypeHint){
        keyValuePair_free(keyPairQuery_path@TypeHint);
        keyPairQuery_path@TypeHint = NULL;
    }
    if(keyQuery_path@TypeHint){
        free(keyQuery_path@TypeHint);
        keyQuery_path@TypeHint = NULL;
    }
    if(keyPairQuery_path@TypeHint){
        keyValuePair_free(keyPairQuery_path@TypeHint);
        keyPairQuery_path@TypeHint = NULL;
    }
    if(keyQuery_synchronizeAttributes@TypeHint){
        free(keyQuery_synchronizeAttributes@TypeHint);
        keyQuery_synchronizeAttributes@TypeHint = NULL;
    }
    if(valueQuery_synchronizeAttributes@TypeHint){
        free(valueQuery_synchronizeAttributes@TypeHint);
        valueQuery_synchronizeAttributes@TypeHint = NULL;
    }
    if(keyPairQuery_synchronizeAttributes@TypeHint){
        keyValuePair_free(keyPairQuery_synchronizeAttributes@TypeHint);
        keyPairQuery_synchronizeAttributes@TypeHint = NULL;
    }
    if(keyQuery_synchronizeAttributes@TypeHint){
        free(keyQuery_synchronizeAttributes@TypeHint);
        keyQuery_synchronizeAttributes@TypeHint = NULL;
    }
    if(keyPairQuery_synchronizeAttributes@TypeHint){
        keyValuePair_free(keyPairQuery_synchronizeAttributes@TypeHint);
        keyPairQuery_synchronizeAttributes@TypeHint = NULL;
    }
    if(keyQuery_clockTolerance@TypeHint){
        free(keyQuery_clockTolerance@TypeHint);
        keyQuery_clockTolerance@TypeHint = NULL;
    }
    if(valueQuery_clockTolerance@TypeHint){
        free(valueQuery_clockTolerance@TypeHint);
        valueQuery_clockTolerance@TypeHint = NULL;
    }
    if(keyPairQuery_clockTolerance@TypeHint){
        keyValuePair_free(keyPairQuery_clockTolerance@TypeHint);
        keyPairQuery_clockTolerance@TypeHint = NULL;
    }
    if(keyQuery_clockTolerance@TypeHint){
        free(keyQuery_clockTolerance@TypeHint);
        keyQuery_clockTolerance@TypeHint = NULL;
    }
    if(keyPairQuery_clockTolerance@TypeHint){
        keyValuePair_free(keyPairQuery_clockTolerance@TypeHint);
        keyPairQuery_clockTolerance@TypeHint = NULL;
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
    if(keyQuery_groupMembershipAttribute){
        free(keyQuery_groupMembershipAttribute);
        keyQuery_groupMembershipAttribute = NULL;
    }
    if(keyPairQuery_groupMembershipAttribute){
        keyValuePair_free(keyPairQuery_groupMembershipAttribute);
        keyPairQuery_groupMembershipAttribute = NULL;
    }
    if(keyQuery_groupMembershipAttribute@TypeHint){
        free(keyQuery_groupMembershipAttribute@TypeHint);
        keyQuery_groupMembershipAttribute@TypeHint = NULL;
    }
    if(valueQuery_groupMembershipAttribute@TypeHint){
        free(valueQuery_groupMembershipAttribute@TypeHint);
        valueQuery_groupMembershipAttribute@TypeHint = NULL;
    }
    if(keyPairQuery_groupMembershipAttribute@TypeHint){
        keyValuePair_free(keyPairQuery_groupMembershipAttribute@TypeHint);
        keyPairQuery_groupMembershipAttribute@TypeHint = NULL;
    }
    if(keyQuery_groupMembershipAttribute@TypeHint){
        free(keyQuery_groupMembershipAttribute@TypeHint);
        keyQuery_groupMembershipAttribute@TypeHint = NULL;
    }
    if(keyPairQuery_groupMembershipAttribute@TypeHint){
        keyValuePair_free(keyPairQuery_groupMembershipAttribute@TypeHint);
        keyPairQuery_groupMembershipAttribute@TypeHint = NULL;
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
    if(keyQuery_idpUrl){
        free(keyQuery_idpUrl);
        keyQuery_idpUrl = NULL;
    }
    if(keyPairQuery_idpUrl){
        keyValuePair_free(keyPairQuery_idpUrl);
        keyPairQuery_idpUrl = NULL;
    }
    if(keyQuery_idpUrl@TypeHint){
        free(keyQuery_idpUrl@TypeHint);
        keyQuery_idpUrl@TypeHint = NULL;
    }
    if(valueQuery_idpUrl@TypeHint){
        free(valueQuery_idpUrl@TypeHint);
        valueQuery_idpUrl@TypeHint = NULL;
    }
    if(keyPairQuery_idpUrl@TypeHint){
        keyValuePair_free(keyPairQuery_idpUrl@TypeHint);
        keyPairQuery_idpUrl@TypeHint = NULL;
    }
    if(keyQuery_idpUrl@TypeHint){
        free(keyQuery_idpUrl@TypeHint);
        keyQuery_idpUrl@TypeHint = NULL;
    }
    if(keyPairQuery_idpUrl@TypeHint){
        keyValuePair_free(keyPairQuery_idpUrl@TypeHint);
        keyPairQuery_idpUrl@TypeHint = NULL;
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
    if(keyQuery_logoutUrl){
        free(keyQuery_logoutUrl);
        keyQuery_logoutUrl = NULL;
    }
    if(keyPairQuery_logoutUrl){
        keyValuePair_free(keyPairQuery_logoutUrl);
        keyPairQuery_logoutUrl = NULL;
    }
    if(keyQuery_logoutUrl@TypeHint){
        free(keyQuery_logoutUrl@TypeHint);
        keyQuery_logoutUrl@TypeHint = NULL;
    }
    if(valueQuery_logoutUrl@TypeHint){
        free(valueQuery_logoutUrl@TypeHint);
        valueQuery_logoutUrl@TypeHint = NULL;
    }
    if(keyPairQuery_logoutUrl@TypeHint){
        keyValuePair_free(keyPairQuery_logoutUrl@TypeHint);
        keyPairQuery_logoutUrl@TypeHint = NULL;
    }
    if(keyQuery_logoutUrl@TypeHint){
        free(keyQuery_logoutUrl@TypeHint);
        keyQuery_logoutUrl@TypeHint = NULL;
    }
    if(keyPairQuery_logoutUrl@TypeHint){
        keyValuePair_free(keyPairQuery_logoutUrl@TypeHint);
        keyPairQuery_logoutUrl@TypeHint = NULL;
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
    if(keyQuery_serviceProviderEntityId){
        free(keyQuery_serviceProviderEntityId);
        keyQuery_serviceProviderEntityId = NULL;
    }
    if(keyPairQuery_serviceProviderEntityId){
        keyValuePair_free(keyPairQuery_serviceProviderEntityId);
        keyPairQuery_serviceProviderEntityId = NULL;
    }
    if(keyQuery_serviceProviderEntityId@TypeHint){
        free(keyQuery_serviceProviderEntityId@TypeHint);
        keyQuery_serviceProviderEntityId@TypeHint = NULL;
    }
    if(valueQuery_serviceProviderEntityId@TypeHint){
        free(valueQuery_serviceProviderEntityId@TypeHint);
        valueQuery_serviceProviderEntityId@TypeHint = NULL;
    }
    if(keyPairQuery_serviceProviderEntityId@TypeHint){
        keyValuePair_free(keyPairQuery_serviceProviderEntityId@TypeHint);
        keyPairQuery_serviceProviderEntityId@TypeHint = NULL;
    }
    if(keyQuery_serviceProviderEntityId@TypeHint){
        free(keyQuery_serviceProviderEntityId@TypeHint);
        keyQuery_serviceProviderEntityId@TypeHint = NULL;
    }
    if(keyPairQuery_serviceProviderEntityId@TypeHint){
        keyValuePair_free(keyPairQuery_serviceProviderEntityId@TypeHint);
        keyPairQuery_serviceProviderEntityId@TypeHint = NULL;
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
    if(keyQuery_assertionConsumerServiceURL){
        free(keyQuery_assertionConsumerServiceURL);
        keyQuery_assertionConsumerServiceURL = NULL;
    }
    if(keyPairQuery_assertionConsumerServiceURL){
        keyValuePair_free(keyPairQuery_assertionConsumerServiceURL);
        keyPairQuery_assertionConsumerServiceURL = NULL;
    }
    if(keyQuery_assertionConsumerServiceURL@TypeHint){
        free(keyQuery_assertionConsumerServiceURL@TypeHint);
        keyQuery_assertionConsumerServiceURL@TypeHint = NULL;
    }
    if(valueQuery_assertionConsumerServiceURL@TypeHint){
        free(valueQuery_assertionConsumerServiceURL@TypeHint);
        valueQuery_assertionConsumerServiceURL@TypeHint = NULL;
    }
    if(keyPairQuery_assertionConsumerServiceURL@TypeHint){
        keyValuePair_free(keyPairQuery_assertionConsumerServiceURL@TypeHint);
        keyPairQuery_assertionConsumerServiceURL@TypeHint = NULL;
    }
    if(keyQuery_assertionConsumerServiceURL@TypeHint){
        free(keyQuery_assertionConsumerServiceURL@TypeHint);
        keyQuery_assertionConsumerServiceURL@TypeHint = NULL;
    }
    if(keyPairQuery_assertionConsumerServiceURL@TypeHint){
        keyValuePair_free(keyPairQuery_assertionConsumerServiceURL@TypeHint);
        keyPairQuery_assertionConsumerServiceURL@TypeHint = NULL;
    }
    if(keyQuery_handleLogout@TypeHint){
        free(keyQuery_handleLogout@TypeHint);
        keyQuery_handleLogout@TypeHint = NULL;
    }
    if(valueQuery_handleLogout@TypeHint){
        free(valueQuery_handleLogout@TypeHint);
        valueQuery_handleLogout@TypeHint = NULL;
    }
    if(keyPairQuery_handleLogout@TypeHint){
        keyValuePair_free(keyPairQuery_handleLogout@TypeHint);
        keyPairQuery_handleLogout@TypeHint = NULL;
    }
    if(keyQuery_handleLogout@TypeHint){
        free(keyQuery_handleLogout@TypeHint);
        keyQuery_handleLogout@TypeHint = NULL;
    }
    if(keyPairQuery_handleLogout@TypeHint){
        keyValuePair_free(keyPairQuery_handleLogout@TypeHint);
        keyPairQuery_handleLogout@TypeHint = NULL;
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
    if(keyQuery_spPrivateKeyAlias){
        free(keyQuery_spPrivateKeyAlias);
        keyQuery_spPrivateKeyAlias = NULL;
    }
    if(keyPairQuery_spPrivateKeyAlias){
        keyValuePair_free(keyPairQuery_spPrivateKeyAlias);
        keyPairQuery_spPrivateKeyAlias = NULL;
    }
    if(keyQuery_spPrivateKeyAlias@TypeHint){
        free(keyQuery_spPrivateKeyAlias@TypeHint);
        keyQuery_spPrivateKeyAlias@TypeHint = NULL;
    }
    if(valueQuery_spPrivateKeyAlias@TypeHint){
        free(valueQuery_spPrivateKeyAlias@TypeHint);
        valueQuery_spPrivateKeyAlias@TypeHint = NULL;
    }
    if(keyPairQuery_spPrivateKeyAlias@TypeHint){
        keyValuePair_free(keyPairQuery_spPrivateKeyAlias@TypeHint);
        keyPairQuery_spPrivateKeyAlias@TypeHint = NULL;
    }
    if(keyQuery_spPrivateKeyAlias@TypeHint){
        free(keyQuery_spPrivateKeyAlias@TypeHint);
        keyQuery_spPrivateKeyAlias@TypeHint = NULL;
    }
    if(keyPairQuery_spPrivateKeyAlias@TypeHint){
        keyValuePair_free(keyPairQuery_spPrivateKeyAlias@TypeHint);
        keyPairQuery_spPrivateKeyAlias@TypeHint = NULL;
    }
    if(keyQuery_useEncryption@TypeHint){
        free(keyQuery_useEncryption@TypeHint);
        keyQuery_useEncryption@TypeHint = NULL;
    }
    if(valueQuery_useEncryption@TypeHint){
        free(valueQuery_useEncryption@TypeHint);
        valueQuery_useEncryption@TypeHint = NULL;
    }
    if(keyPairQuery_useEncryption@TypeHint){
        keyValuePair_free(keyPairQuery_useEncryption@TypeHint);
        keyPairQuery_useEncryption@TypeHint = NULL;
    }
    if(keyQuery_useEncryption@TypeHint){
        free(keyQuery_useEncryption@TypeHint);
        keyQuery_useEncryption@TypeHint = NULL;
    }
    if(keyPairQuery_useEncryption@TypeHint){
        keyValuePair_free(keyPairQuery_useEncryption@TypeHint);
        keyPairQuery_useEncryption@TypeHint = NULL;
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
    if(keyQuery_nameIdFormat){
        free(keyQuery_nameIdFormat);
        keyQuery_nameIdFormat = NULL;
    }
    if(keyPairQuery_nameIdFormat){
        keyValuePair_free(keyPairQuery_nameIdFormat);
        keyPairQuery_nameIdFormat = NULL;
    }
    if(keyQuery_nameIdFormat@TypeHint){
        free(keyQuery_nameIdFormat@TypeHint);
        keyQuery_nameIdFormat@TypeHint = NULL;
    }
    if(valueQuery_nameIdFormat@TypeHint){
        free(valueQuery_nameIdFormat@TypeHint);
        valueQuery_nameIdFormat@TypeHint = NULL;
    }
    if(keyPairQuery_nameIdFormat@TypeHint){
        keyValuePair_free(keyPairQuery_nameIdFormat@TypeHint);
        keyPairQuery_nameIdFormat@TypeHint = NULL;
    }
    if(keyQuery_nameIdFormat@TypeHint){
        free(keyQuery_nameIdFormat@TypeHint);
        keyQuery_nameIdFormat@TypeHint = NULL;
    }
    if(keyPairQuery_nameIdFormat@TypeHint){
        keyValuePair_free(keyPairQuery_nameIdFormat@TypeHint);
        keyPairQuery_nameIdFormat@TypeHint = NULL;
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
    if(keyQuery_digestMethod){
        free(keyQuery_digestMethod);
        keyQuery_digestMethod = NULL;
    }
    if(keyPairQuery_digestMethod){
        keyValuePair_free(keyPairQuery_digestMethod);
        keyPairQuery_digestMethod = NULL;
    }
    if(keyQuery_digestMethod@TypeHint){
        free(keyQuery_digestMethod@TypeHint);
        keyQuery_digestMethod@TypeHint = NULL;
    }
    if(valueQuery_digestMethod@TypeHint){
        free(valueQuery_digestMethod@TypeHint);
        valueQuery_digestMethod@TypeHint = NULL;
    }
    if(keyPairQuery_digestMethod@TypeHint){
        keyValuePair_free(keyPairQuery_digestMethod@TypeHint);
        keyPairQuery_digestMethod@TypeHint = NULL;
    }
    if(keyQuery_digestMethod@TypeHint){
        free(keyQuery_digestMethod@TypeHint);
        keyQuery_digestMethod@TypeHint = NULL;
    }
    if(keyPairQuery_digestMethod@TypeHint){
        keyValuePair_free(keyPairQuery_digestMethod@TypeHint);
        keyPairQuery_digestMethod@TypeHint = NULL;
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
    if(keyQuery_signatureMethod){
        free(keyQuery_signatureMethod);
        keyQuery_signatureMethod = NULL;
    }
    if(keyPairQuery_signatureMethod){
        keyValuePair_free(keyPairQuery_signatureMethod);
        keyPairQuery_signatureMethod = NULL;
    }
    if(keyQuery_signatureMethod@TypeHint){
        free(keyQuery_signatureMethod@TypeHint);
        keyQuery_signatureMethod@TypeHint = NULL;
    }
    if(valueQuery_signatureMethod@TypeHint){
        free(valueQuery_signatureMethod@TypeHint);
        valueQuery_signatureMethod@TypeHint = NULL;
    }
    if(keyPairQuery_signatureMethod@TypeHint){
        keyValuePair_free(keyPairQuery_signatureMethod@TypeHint);
        keyPairQuery_signatureMethod@TypeHint = NULL;
    }
    if(keyQuery_signatureMethod@TypeHint){
        free(keyQuery_signatureMethod@TypeHint);
        keyQuery_signatureMethod@TypeHint = NULL;
    }
    if(keyPairQuery_signatureMethod@TypeHint){
        keyValuePair_free(keyPairQuery_signatureMethod@TypeHint);
        keyPairQuery_signatureMethod@TypeHint = NULL;
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
    if(keyQuery_userIntermediatePath){
        free(keyQuery_userIntermediatePath);
        keyQuery_userIntermediatePath = NULL;
    }
    if(keyPairQuery_userIntermediatePath){
        keyValuePair_free(keyPairQuery_userIntermediatePath);
        keyPairQuery_userIntermediatePath = NULL;
    }
    if(keyQuery_userIntermediatePath@TypeHint){
        free(keyQuery_userIntermediatePath@TypeHint);
        keyQuery_userIntermediatePath@TypeHint = NULL;
    }
    if(valueQuery_userIntermediatePath@TypeHint){
        free(valueQuery_userIntermediatePath@TypeHint);
        valueQuery_userIntermediatePath@TypeHint = NULL;
    }
    if(keyPairQuery_userIntermediatePath@TypeHint){
        keyValuePair_free(keyPairQuery_userIntermediatePath@TypeHint);
        keyPairQuery_userIntermediatePath@TypeHint = NULL;
    }
    if(keyQuery_userIntermediatePath@TypeHint){
        free(keyQuery_userIntermediatePath@TypeHint);
        keyQuery_userIntermediatePath@TypeHint = NULL;
    }
    if(keyPairQuery_userIntermediatePath@TypeHint){
        keyValuePair_free(keyPairQuery_userIntermediatePath@TypeHint);
        keyPairQuery_userIntermediatePath@TypeHint = NULL;
    }

}

void
SlingAPI_postConfigApacheFelixJettyBasedHttpService(apiClient_t *apiClient, int *org.apache.felix.https.nio, char *org.apache.felix.https.nio@TypeHint, char *org.apache.felix.https.keystore, char *org.apache.felix.https.keystore@TypeHint, char *org.apache.felix.https.keystore.password, char *org.apache.felix.https.keystore.password@TypeHint, char *org.apache.felix.https.keystore.key, char *org.apache.felix.https.keystore.key@TypeHint, char *org.apache.felix.https.keystore.key.password, char *org.apache.felix.https.keystore.key.password@TypeHint, char *org.apache.felix.https.truststore, char *org.apache.felix.https.truststore@TypeHint, char *org.apache.felix.https.truststore.password, char *org.apache.felix.https.truststore.password@TypeHint, char *org.apache.felix.https.clientcertificate, char *org.apache.felix.https.clientcertificate@TypeHint, int *org.apache.felix.https.enable, char *org.apache.felix.https.enable@TypeHint, char *org.osgi.service.http.port.secure, char *org.osgi.service.http.port.secure@TypeHint)
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
    char *localVarPath = strdup("/apps/system/config/org.apache.felix.http");





    // query parameters
    char *keyQuery_org.apache.felix.https.nio = NULL;
    char * valueQuery_org.apache.felix.https.nio = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.nio = 0;
    if (org.apache.felix.https.nio)
    {
        keyQuery_org.apache.felix.https.nio = strdup("org.apache.felix.https.nio");
        valueQuery_org.apache.felix.https.nio = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_org.apache.felix.https.nio, MAX_NUMBER_LENGTH, "%d", *org.apache.felix.https.nio);
        keyPairQuery_org.apache.felix.https.nio = keyValuePair_create(keyQuery_org.apache.felix.https.nio, valueQuery_org.apache.felix.https.nio);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.nio);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.nio@TypeHint = NULL;
    char * valueQuery_org.apache.felix.https.nio@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.nio@TypeHint = 0;
    if (org.apache.felix.https.nio@TypeHint)
    {
        keyQuery_org.apache.felix.https.nio@TypeHint = strdup("org.apache.felix.https.nio@TypeHint");
        valueQuery_org.apache.felix.https.nio@TypeHint = strdup((org.apache.felix.https.nio@TypeHint));
        keyPairQuery_org.apache.felix.https.nio@TypeHint = keyValuePair_create(keyQuery_org.apache.felix.https.nio@TypeHint, valueQuery_org.apache.felix.https.nio@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.nio@TypeHint);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.keystore = NULL;
    char * valueQuery_org.apache.felix.https.keystore = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.keystore = 0;
    if (org.apache.felix.https.keystore)
    {
        keyQuery_org.apache.felix.https.keystore = strdup("org.apache.felix.https.keystore");
        valueQuery_org.apache.felix.https.keystore = strdup((org.apache.felix.https.keystore));
        keyPairQuery_org.apache.felix.https.keystore = keyValuePair_create(keyQuery_org.apache.felix.https.keystore, valueQuery_org.apache.felix.https.keystore);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.keystore);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.keystore@TypeHint = NULL;
    char * valueQuery_org.apache.felix.https.keystore@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.keystore@TypeHint = 0;
    if (org.apache.felix.https.keystore@TypeHint)
    {
        keyQuery_org.apache.felix.https.keystore@TypeHint = strdup("org.apache.felix.https.keystore@TypeHint");
        valueQuery_org.apache.felix.https.keystore@TypeHint = strdup((org.apache.felix.https.keystore@TypeHint));
        keyPairQuery_org.apache.felix.https.keystore@TypeHint = keyValuePair_create(keyQuery_org.apache.felix.https.keystore@TypeHint, valueQuery_org.apache.felix.https.keystore@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.keystore@TypeHint);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.keystore.password = NULL;
    char * valueQuery_org.apache.felix.https.keystore.password = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.keystore.password = 0;
    if (org.apache.felix.https.keystore.password)
    {
        keyQuery_org.apache.felix.https.keystore.password = strdup("org.apache.felix.https.keystore.password");
        valueQuery_org.apache.felix.https.keystore.password = strdup((org.apache.felix.https.keystore.password));
        keyPairQuery_org.apache.felix.https.keystore.password = keyValuePair_create(keyQuery_org.apache.felix.https.keystore.password, valueQuery_org.apache.felix.https.keystore.password);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.keystore.password);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.keystore.password@TypeHint = NULL;
    char * valueQuery_org.apache.felix.https.keystore.password@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.keystore.password@TypeHint = 0;
    if (org.apache.felix.https.keystore.password@TypeHint)
    {
        keyQuery_org.apache.felix.https.keystore.password@TypeHint = strdup("org.apache.felix.https.keystore.password@TypeHint");
        valueQuery_org.apache.felix.https.keystore.password@TypeHint = strdup((org.apache.felix.https.keystore.password@TypeHint));
        keyPairQuery_org.apache.felix.https.keystore.password@TypeHint = keyValuePair_create(keyQuery_org.apache.felix.https.keystore.password@TypeHint, valueQuery_org.apache.felix.https.keystore.password@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.keystore.password@TypeHint);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.keystore.key = NULL;
    char * valueQuery_org.apache.felix.https.keystore.key = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.keystore.key = 0;
    if (org.apache.felix.https.keystore.key)
    {
        keyQuery_org.apache.felix.https.keystore.key = strdup("org.apache.felix.https.keystore.key");
        valueQuery_org.apache.felix.https.keystore.key = strdup((org.apache.felix.https.keystore.key));
        keyPairQuery_org.apache.felix.https.keystore.key = keyValuePair_create(keyQuery_org.apache.felix.https.keystore.key, valueQuery_org.apache.felix.https.keystore.key);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.keystore.key);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.keystore.key@TypeHint = NULL;
    char * valueQuery_org.apache.felix.https.keystore.key@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.keystore.key@TypeHint = 0;
    if (org.apache.felix.https.keystore.key@TypeHint)
    {
        keyQuery_org.apache.felix.https.keystore.key@TypeHint = strdup("org.apache.felix.https.keystore.key@TypeHint");
        valueQuery_org.apache.felix.https.keystore.key@TypeHint = strdup((org.apache.felix.https.keystore.key@TypeHint));
        keyPairQuery_org.apache.felix.https.keystore.key@TypeHint = keyValuePair_create(keyQuery_org.apache.felix.https.keystore.key@TypeHint, valueQuery_org.apache.felix.https.keystore.key@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.keystore.key@TypeHint);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.keystore.key.password = NULL;
    char * valueQuery_org.apache.felix.https.keystore.key.password = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.keystore.key.password = 0;
    if (org.apache.felix.https.keystore.key.password)
    {
        keyQuery_org.apache.felix.https.keystore.key.password = strdup("org.apache.felix.https.keystore.key.password");
        valueQuery_org.apache.felix.https.keystore.key.password = strdup((org.apache.felix.https.keystore.key.password));
        keyPairQuery_org.apache.felix.https.keystore.key.password = keyValuePair_create(keyQuery_org.apache.felix.https.keystore.key.password, valueQuery_org.apache.felix.https.keystore.key.password);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.keystore.key.password);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.keystore.key.password@TypeHint = NULL;
    char * valueQuery_org.apache.felix.https.keystore.key.password@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.keystore.key.password@TypeHint = 0;
    if (org.apache.felix.https.keystore.key.password@TypeHint)
    {
        keyQuery_org.apache.felix.https.keystore.key.password@TypeHint = strdup("org.apache.felix.https.keystore.key.password@TypeHint");
        valueQuery_org.apache.felix.https.keystore.key.password@TypeHint = strdup((org.apache.felix.https.keystore.key.password@TypeHint));
        keyPairQuery_org.apache.felix.https.keystore.key.password@TypeHint = keyValuePair_create(keyQuery_org.apache.felix.https.keystore.key.password@TypeHint, valueQuery_org.apache.felix.https.keystore.key.password@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.keystore.key.password@TypeHint);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.truststore = NULL;
    char * valueQuery_org.apache.felix.https.truststore = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.truststore = 0;
    if (org.apache.felix.https.truststore)
    {
        keyQuery_org.apache.felix.https.truststore = strdup("org.apache.felix.https.truststore");
        valueQuery_org.apache.felix.https.truststore = strdup((org.apache.felix.https.truststore));
        keyPairQuery_org.apache.felix.https.truststore = keyValuePair_create(keyQuery_org.apache.felix.https.truststore, valueQuery_org.apache.felix.https.truststore);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.truststore);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.truststore@TypeHint = NULL;
    char * valueQuery_org.apache.felix.https.truststore@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.truststore@TypeHint = 0;
    if (org.apache.felix.https.truststore@TypeHint)
    {
        keyQuery_org.apache.felix.https.truststore@TypeHint = strdup("org.apache.felix.https.truststore@TypeHint");
        valueQuery_org.apache.felix.https.truststore@TypeHint = strdup((org.apache.felix.https.truststore@TypeHint));
        keyPairQuery_org.apache.felix.https.truststore@TypeHint = keyValuePair_create(keyQuery_org.apache.felix.https.truststore@TypeHint, valueQuery_org.apache.felix.https.truststore@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.truststore@TypeHint);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.truststore.password = NULL;
    char * valueQuery_org.apache.felix.https.truststore.password = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.truststore.password = 0;
    if (org.apache.felix.https.truststore.password)
    {
        keyQuery_org.apache.felix.https.truststore.password = strdup("org.apache.felix.https.truststore.password");
        valueQuery_org.apache.felix.https.truststore.password = strdup((org.apache.felix.https.truststore.password));
        keyPairQuery_org.apache.felix.https.truststore.password = keyValuePair_create(keyQuery_org.apache.felix.https.truststore.password, valueQuery_org.apache.felix.https.truststore.password);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.truststore.password);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.truststore.password@TypeHint = NULL;
    char * valueQuery_org.apache.felix.https.truststore.password@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.truststore.password@TypeHint = 0;
    if (org.apache.felix.https.truststore.password@TypeHint)
    {
        keyQuery_org.apache.felix.https.truststore.password@TypeHint = strdup("org.apache.felix.https.truststore.password@TypeHint");
        valueQuery_org.apache.felix.https.truststore.password@TypeHint = strdup((org.apache.felix.https.truststore.password@TypeHint));
        keyPairQuery_org.apache.felix.https.truststore.password@TypeHint = keyValuePair_create(keyQuery_org.apache.felix.https.truststore.password@TypeHint, valueQuery_org.apache.felix.https.truststore.password@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.truststore.password@TypeHint);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.clientcertificate = NULL;
    char * valueQuery_org.apache.felix.https.clientcertificate = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.clientcertificate = 0;
    if (org.apache.felix.https.clientcertificate)
    {
        keyQuery_org.apache.felix.https.clientcertificate = strdup("org.apache.felix.https.clientcertificate");
        valueQuery_org.apache.felix.https.clientcertificate = strdup((org.apache.felix.https.clientcertificate));
        keyPairQuery_org.apache.felix.https.clientcertificate = keyValuePair_create(keyQuery_org.apache.felix.https.clientcertificate, valueQuery_org.apache.felix.https.clientcertificate);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.clientcertificate);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.clientcertificate@TypeHint = NULL;
    char * valueQuery_org.apache.felix.https.clientcertificate@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.clientcertificate@TypeHint = 0;
    if (org.apache.felix.https.clientcertificate@TypeHint)
    {
        keyQuery_org.apache.felix.https.clientcertificate@TypeHint = strdup("org.apache.felix.https.clientcertificate@TypeHint");
        valueQuery_org.apache.felix.https.clientcertificate@TypeHint = strdup((org.apache.felix.https.clientcertificate@TypeHint));
        keyPairQuery_org.apache.felix.https.clientcertificate@TypeHint = keyValuePair_create(keyQuery_org.apache.felix.https.clientcertificate@TypeHint, valueQuery_org.apache.felix.https.clientcertificate@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.clientcertificate@TypeHint);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.enable = NULL;
    char * valueQuery_org.apache.felix.https.enable = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.enable = 0;
    if (org.apache.felix.https.enable)
    {
        keyQuery_org.apache.felix.https.enable = strdup("org.apache.felix.https.enable");
        valueQuery_org.apache.felix.https.enable = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_org.apache.felix.https.enable, MAX_NUMBER_LENGTH, "%d", *org.apache.felix.https.enable);
        keyPairQuery_org.apache.felix.https.enable = keyValuePair_create(keyQuery_org.apache.felix.https.enable, valueQuery_org.apache.felix.https.enable);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.enable);
    }

    // query parameters
    char *keyQuery_org.apache.felix.https.enable@TypeHint = NULL;
    char * valueQuery_org.apache.felix.https.enable@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_org.apache.felix.https.enable@TypeHint = 0;
    if (org.apache.felix.https.enable@TypeHint)
    {
        keyQuery_org.apache.felix.https.enable@TypeHint = strdup("org.apache.felix.https.enable@TypeHint");
        valueQuery_org.apache.felix.https.enable@TypeHint = strdup((org.apache.felix.https.enable@TypeHint));
        keyPairQuery_org.apache.felix.https.enable@TypeHint = keyValuePair_create(keyQuery_org.apache.felix.https.enable@TypeHint, valueQuery_org.apache.felix.https.enable@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_org.apache.felix.https.enable@TypeHint);
    }

    // query parameters
    char *keyQuery_org.osgi.service.http.port.secure = NULL;
    char * valueQuery_org.osgi.service.http.port.secure = NULL;
    keyValuePair_t *keyPairQuery_org.osgi.service.http.port.secure = 0;
    if (org.osgi.service.http.port.secure)
    {
        keyQuery_org.osgi.service.http.port.secure = strdup("org.osgi.service.http.port.secure");
        valueQuery_org.osgi.service.http.port.secure = strdup((org.osgi.service.http.port.secure));
        keyPairQuery_org.osgi.service.http.port.secure = keyValuePair_create(keyQuery_org.osgi.service.http.port.secure, valueQuery_org.osgi.service.http.port.secure);
        list_addElement(localVarQueryParameters,keyPairQuery_org.osgi.service.http.port.secure);
    }

    // query parameters
    char *keyQuery_org.osgi.service.http.port.secure@TypeHint = NULL;
    char * valueQuery_org.osgi.service.http.port.secure@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_org.osgi.service.http.port.secure@TypeHint = 0;
    if (org.osgi.service.http.port.secure@TypeHint)
    {
        keyQuery_org.osgi.service.http.port.secure@TypeHint = strdup("org.osgi.service.http.port.secure@TypeHint");
        valueQuery_org.osgi.service.http.port.secure@TypeHint = strdup((org.osgi.service.http.port.secure@TypeHint));
        keyPairQuery_org.osgi.service.http.port.secure@TypeHint = keyValuePair_create(keyQuery_org.osgi.service.http.port.secure@TypeHint, valueQuery_org.osgi.service.http.port.secure@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_org.osgi.service.http.port.secure@TypeHint);
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
    if(keyQuery_org.apache.felix.https.nio@TypeHint){
        free(keyQuery_org.apache.felix.https.nio@TypeHint);
        keyQuery_org.apache.felix.https.nio@TypeHint = NULL;
    }
    if(valueQuery_org.apache.felix.https.nio@TypeHint){
        free(valueQuery_org.apache.felix.https.nio@TypeHint);
        valueQuery_org.apache.felix.https.nio@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.nio@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.nio@TypeHint);
        keyPairQuery_org.apache.felix.https.nio@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.nio@TypeHint){
        free(keyQuery_org.apache.felix.https.nio@TypeHint);
        keyQuery_org.apache.felix.https.nio@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.nio@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.nio@TypeHint);
        keyPairQuery_org.apache.felix.https.nio@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore){
        free(keyQuery_org.apache.felix.https.keystore);
        keyQuery_org.apache.felix.https.keystore = NULL;
    }
    if(valueQuery_org.apache.felix.https.keystore){
        free(valueQuery_org.apache.felix.https.keystore);
        valueQuery_org.apache.felix.https.keystore = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore);
        keyPairQuery_org.apache.felix.https.keystore = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore){
        free(keyQuery_org.apache.felix.https.keystore);
        keyQuery_org.apache.felix.https.keystore = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore);
        keyPairQuery_org.apache.felix.https.keystore = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore@TypeHint){
        free(keyQuery_org.apache.felix.https.keystore@TypeHint);
        keyQuery_org.apache.felix.https.keystore@TypeHint = NULL;
    }
    if(valueQuery_org.apache.felix.https.keystore@TypeHint){
        free(valueQuery_org.apache.felix.https.keystore@TypeHint);
        valueQuery_org.apache.felix.https.keystore@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore@TypeHint);
        keyPairQuery_org.apache.felix.https.keystore@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore@TypeHint){
        free(keyQuery_org.apache.felix.https.keystore@TypeHint);
        keyQuery_org.apache.felix.https.keystore@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore@TypeHint);
        keyPairQuery_org.apache.felix.https.keystore@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore.password){
        free(keyQuery_org.apache.felix.https.keystore.password);
        keyQuery_org.apache.felix.https.keystore.password = NULL;
    }
    if(valueQuery_org.apache.felix.https.keystore.password){
        free(valueQuery_org.apache.felix.https.keystore.password);
        valueQuery_org.apache.felix.https.keystore.password = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore.password){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore.password);
        keyPairQuery_org.apache.felix.https.keystore.password = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore.password){
        free(keyQuery_org.apache.felix.https.keystore.password);
        keyQuery_org.apache.felix.https.keystore.password = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore.password){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore.password);
        keyPairQuery_org.apache.felix.https.keystore.password = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore.password@TypeHint){
        free(keyQuery_org.apache.felix.https.keystore.password@TypeHint);
        keyQuery_org.apache.felix.https.keystore.password@TypeHint = NULL;
    }
    if(valueQuery_org.apache.felix.https.keystore.password@TypeHint){
        free(valueQuery_org.apache.felix.https.keystore.password@TypeHint);
        valueQuery_org.apache.felix.https.keystore.password@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore.password@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore.password@TypeHint);
        keyPairQuery_org.apache.felix.https.keystore.password@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore.password@TypeHint){
        free(keyQuery_org.apache.felix.https.keystore.password@TypeHint);
        keyQuery_org.apache.felix.https.keystore.password@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore.password@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore.password@TypeHint);
        keyPairQuery_org.apache.felix.https.keystore.password@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore.key){
        free(keyQuery_org.apache.felix.https.keystore.key);
        keyQuery_org.apache.felix.https.keystore.key = NULL;
    }
    if(valueQuery_org.apache.felix.https.keystore.key){
        free(valueQuery_org.apache.felix.https.keystore.key);
        valueQuery_org.apache.felix.https.keystore.key = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore.key){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore.key);
        keyPairQuery_org.apache.felix.https.keystore.key = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore.key){
        free(keyQuery_org.apache.felix.https.keystore.key);
        keyQuery_org.apache.felix.https.keystore.key = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore.key){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore.key);
        keyPairQuery_org.apache.felix.https.keystore.key = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore.key@TypeHint){
        free(keyQuery_org.apache.felix.https.keystore.key@TypeHint);
        keyQuery_org.apache.felix.https.keystore.key@TypeHint = NULL;
    }
    if(valueQuery_org.apache.felix.https.keystore.key@TypeHint){
        free(valueQuery_org.apache.felix.https.keystore.key@TypeHint);
        valueQuery_org.apache.felix.https.keystore.key@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore.key@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore.key@TypeHint);
        keyPairQuery_org.apache.felix.https.keystore.key@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore.key@TypeHint){
        free(keyQuery_org.apache.felix.https.keystore.key@TypeHint);
        keyQuery_org.apache.felix.https.keystore.key@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore.key@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore.key@TypeHint);
        keyPairQuery_org.apache.felix.https.keystore.key@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore.key.password){
        free(keyQuery_org.apache.felix.https.keystore.key.password);
        keyQuery_org.apache.felix.https.keystore.key.password = NULL;
    }
    if(valueQuery_org.apache.felix.https.keystore.key.password){
        free(valueQuery_org.apache.felix.https.keystore.key.password);
        valueQuery_org.apache.felix.https.keystore.key.password = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore.key.password){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore.key.password);
        keyPairQuery_org.apache.felix.https.keystore.key.password = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore.key.password){
        free(keyQuery_org.apache.felix.https.keystore.key.password);
        keyQuery_org.apache.felix.https.keystore.key.password = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore.key.password){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore.key.password);
        keyPairQuery_org.apache.felix.https.keystore.key.password = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore.key.password@TypeHint){
        free(keyQuery_org.apache.felix.https.keystore.key.password@TypeHint);
        keyQuery_org.apache.felix.https.keystore.key.password@TypeHint = NULL;
    }
    if(valueQuery_org.apache.felix.https.keystore.key.password@TypeHint){
        free(valueQuery_org.apache.felix.https.keystore.key.password@TypeHint);
        valueQuery_org.apache.felix.https.keystore.key.password@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore.key.password@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore.key.password@TypeHint);
        keyPairQuery_org.apache.felix.https.keystore.key.password@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.keystore.key.password@TypeHint){
        free(keyQuery_org.apache.felix.https.keystore.key.password@TypeHint);
        keyQuery_org.apache.felix.https.keystore.key.password@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.keystore.key.password@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.keystore.key.password@TypeHint);
        keyPairQuery_org.apache.felix.https.keystore.key.password@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.truststore){
        free(keyQuery_org.apache.felix.https.truststore);
        keyQuery_org.apache.felix.https.truststore = NULL;
    }
    if(valueQuery_org.apache.felix.https.truststore){
        free(valueQuery_org.apache.felix.https.truststore);
        valueQuery_org.apache.felix.https.truststore = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.truststore){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.truststore);
        keyPairQuery_org.apache.felix.https.truststore = NULL;
    }
    if(keyQuery_org.apache.felix.https.truststore){
        free(keyQuery_org.apache.felix.https.truststore);
        keyQuery_org.apache.felix.https.truststore = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.truststore){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.truststore);
        keyPairQuery_org.apache.felix.https.truststore = NULL;
    }
    if(keyQuery_org.apache.felix.https.truststore@TypeHint){
        free(keyQuery_org.apache.felix.https.truststore@TypeHint);
        keyQuery_org.apache.felix.https.truststore@TypeHint = NULL;
    }
    if(valueQuery_org.apache.felix.https.truststore@TypeHint){
        free(valueQuery_org.apache.felix.https.truststore@TypeHint);
        valueQuery_org.apache.felix.https.truststore@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.truststore@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.truststore@TypeHint);
        keyPairQuery_org.apache.felix.https.truststore@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.truststore@TypeHint){
        free(keyQuery_org.apache.felix.https.truststore@TypeHint);
        keyQuery_org.apache.felix.https.truststore@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.truststore@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.truststore@TypeHint);
        keyPairQuery_org.apache.felix.https.truststore@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.truststore.password){
        free(keyQuery_org.apache.felix.https.truststore.password);
        keyQuery_org.apache.felix.https.truststore.password = NULL;
    }
    if(valueQuery_org.apache.felix.https.truststore.password){
        free(valueQuery_org.apache.felix.https.truststore.password);
        valueQuery_org.apache.felix.https.truststore.password = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.truststore.password){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.truststore.password);
        keyPairQuery_org.apache.felix.https.truststore.password = NULL;
    }
    if(keyQuery_org.apache.felix.https.truststore.password){
        free(keyQuery_org.apache.felix.https.truststore.password);
        keyQuery_org.apache.felix.https.truststore.password = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.truststore.password){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.truststore.password);
        keyPairQuery_org.apache.felix.https.truststore.password = NULL;
    }
    if(keyQuery_org.apache.felix.https.truststore.password@TypeHint){
        free(keyQuery_org.apache.felix.https.truststore.password@TypeHint);
        keyQuery_org.apache.felix.https.truststore.password@TypeHint = NULL;
    }
    if(valueQuery_org.apache.felix.https.truststore.password@TypeHint){
        free(valueQuery_org.apache.felix.https.truststore.password@TypeHint);
        valueQuery_org.apache.felix.https.truststore.password@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.truststore.password@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.truststore.password@TypeHint);
        keyPairQuery_org.apache.felix.https.truststore.password@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.truststore.password@TypeHint){
        free(keyQuery_org.apache.felix.https.truststore.password@TypeHint);
        keyQuery_org.apache.felix.https.truststore.password@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.truststore.password@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.truststore.password@TypeHint);
        keyPairQuery_org.apache.felix.https.truststore.password@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.clientcertificate){
        free(keyQuery_org.apache.felix.https.clientcertificate);
        keyQuery_org.apache.felix.https.clientcertificate = NULL;
    }
    if(valueQuery_org.apache.felix.https.clientcertificate){
        free(valueQuery_org.apache.felix.https.clientcertificate);
        valueQuery_org.apache.felix.https.clientcertificate = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.clientcertificate){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.clientcertificate);
        keyPairQuery_org.apache.felix.https.clientcertificate = NULL;
    }
    if(keyQuery_org.apache.felix.https.clientcertificate){
        free(keyQuery_org.apache.felix.https.clientcertificate);
        keyQuery_org.apache.felix.https.clientcertificate = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.clientcertificate){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.clientcertificate);
        keyPairQuery_org.apache.felix.https.clientcertificate = NULL;
    }
    if(keyQuery_org.apache.felix.https.clientcertificate@TypeHint){
        free(keyQuery_org.apache.felix.https.clientcertificate@TypeHint);
        keyQuery_org.apache.felix.https.clientcertificate@TypeHint = NULL;
    }
    if(valueQuery_org.apache.felix.https.clientcertificate@TypeHint){
        free(valueQuery_org.apache.felix.https.clientcertificate@TypeHint);
        valueQuery_org.apache.felix.https.clientcertificate@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.clientcertificate@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.clientcertificate@TypeHint);
        keyPairQuery_org.apache.felix.https.clientcertificate@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.clientcertificate@TypeHint){
        free(keyQuery_org.apache.felix.https.clientcertificate@TypeHint);
        keyQuery_org.apache.felix.https.clientcertificate@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.clientcertificate@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.clientcertificate@TypeHint);
        keyPairQuery_org.apache.felix.https.clientcertificate@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.enable@TypeHint){
        free(keyQuery_org.apache.felix.https.enable@TypeHint);
        keyQuery_org.apache.felix.https.enable@TypeHint = NULL;
    }
    if(valueQuery_org.apache.felix.https.enable@TypeHint){
        free(valueQuery_org.apache.felix.https.enable@TypeHint);
        valueQuery_org.apache.felix.https.enable@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.enable@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.enable@TypeHint);
        keyPairQuery_org.apache.felix.https.enable@TypeHint = NULL;
    }
    if(keyQuery_org.apache.felix.https.enable@TypeHint){
        free(keyQuery_org.apache.felix.https.enable@TypeHint);
        keyQuery_org.apache.felix.https.enable@TypeHint = NULL;
    }
    if(keyPairQuery_org.apache.felix.https.enable@TypeHint){
        keyValuePair_free(keyPairQuery_org.apache.felix.https.enable@TypeHint);
        keyPairQuery_org.apache.felix.https.enable@TypeHint = NULL;
    }
    if(keyQuery_org.osgi.service.http.port.secure){
        free(keyQuery_org.osgi.service.http.port.secure);
        keyQuery_org.osgi.service.http.port.secure = NULL;
    }
    if(valueQuery_org.osgi.service.http.port.secure){
        free(valueQuery_org.osgi.service.http.port.secure);
        valueQuery_org.osgi.service.http.port.secure = NULL;
    }
    if(keyPairQuery_org.osgi.service.http.port.secure){
        keyValuePair_free(keyPairQuery_org.osgi.service.http.port.secure);
        keyPairQuery_org.osgi.service.http.port.secure = NULL;
    }
    if(keyQuery_org.osgi.service.http.port.secure){
        free(keyQuery_org.osgi.service.http.port.secure);
        keyQuery_org.osgi.service.http.port.secure = NULL;
    }
    if(keyPairQuery_org.osgi.service.http.port.secure){
        keyValuePair_free(keyPairQuery_org.osgi.service.http.port.secure);
        keyPairQuery_org.osgi.service.http.port.secure = NULL;
    }
    if(keyQuery_org.osgi.service.http.port.secure@TypeHint){
        free(keyQuery_org.osgi.service.http.port.secure@TypeHint);
        keyQuery_org.osgi.service.http.port.secure@TypeHint = NULL;
    }
    if(valueQuery_org.osgi.service.http.port.secure@TypeHint){
        free(valueQuery_org.osgi.service.http.port.secure@TypeHint);
        valueQuery_org.osgi.service.http.port.secure@TypeHint = NULL;
    }
    if(keyPairQuery_org.osgi.service.http.port.secure@TypeHint){
        keyValuePair_free(keyPairQuery_org.osgi.service.http.port.secure@TypeHint);
        keyPairQuery_org.osgi.service.http.port.secure@TypeHint = NULL;
    }
    if(keyQuery_org.osgi.service.http.port.secure@TypeHint){
        free(keyQuery_org.osgi.service.http.port.secure@TypeHint);
        keyQuery_org.osgi.service.http.port.secure@TypeHint = NULL;
    }
    if(keyPairQuery_org.osgi.service.http.port.secure@TypeHint){
        keyValuePair_free(keyPairQuery_org.osgi.service.http.port.secure@TypeHint);
        keyPairQuery_org.osgi.service.http.port.secure@TypeHint = NULL;
    }

}

void
SlingAPI_postConfigApacheHttpComponentsProxyConfiguration(apiClient_t *apiClient, char *proxy.host, char *proxy.host@TypeHint, int *proxy.port, char *proxy.port@TypeHint, list_t *proxy.exceptions, char *proxy.exceptions@TypeHint, int *proxy.enabled, char *proxy.enabled@TypeHint, char *proxy.user, char *proxy.user@TypeHint, char *proxy.password, char *proxy.password@TypeHint)
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
    char *localVarPath = strdup("/apps/system/config/org.apache.http.proxyconfigurator.config");





    // query parameters
    char *keyQuery_proxy.host = NULL;
    char * valueQuery_proxy.host = NULL;
    keyValuePair_t *keyPairQuery_proxy.host = 0;
    if (proxy.host)
    {
        keyQuery_proxy.host = strdup("proxy.host");
        valueQuery_proxy.host = strdup((proxy.host));
        keyPairQuery_proxy.host = keyValuePair_create(keyQuery_proxy.host, valueQuery_proxy.host);
        list_addElement(localVarQueryParameters,keyPairQuery_proxy.host);
    }

    // query parameters
    char *keyQuery_proxy.host@TypeHint = NULL;
    char * valueQuery_proxy.host@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_proxy.host@TypeHint = 0;
    if (proxy.host@TypeHint)
    {
        keyQuery_proxy.host@TypeHint = strdup("proxy.host@TypeHint");
        valueQuery_proxy.host@TypeHint = strdup((proxy.host@TypeHint));
        keyPairQuery_proxy.host@TypeHint = keyValuePair_create(keyQuery_proxy.host@TypeHint, valueQuery_proxy.host@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_proxy.host@TypeHint);
    }

    // query parameters
    char *keyQuery_proxy.port = NULL;
    char * valueQuery_proxy.port = NULL;
    keyValuePair_t *keyPairQuery_proxy.port = 0;
    if (proxy.port)
    {
        keyQuery_proxy.port = strdup("proxy.port");
        valueQuery_proxy.port = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_proxy.port, MAX_NUMBER_LENGTH, "%d", *proxy.port);
        keyPairQuery_proxy.port = keyValuePair_create(keyQuery_proxy.port, valueQuery_proxy.port);
        list_addElement(localVarQueryParameters,keyPairQuery_proxy.port);
    }

    // query parameters
    char *keyQuery_proxy.port@TypeHint = NULL;
    char * valueQuery_proxy.port@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_proxy.port@TypeHint = 0;
    if (proxy.port@TypeHint)
    {
        keyQuery_proxy.port@TypeHint = strdup("proxy.port@TypeHint");
        valueQuery_proxy.port@TypeHint = strdup((proxy.port@TypeHint));
        keyPairQuery_proxy.port@TypeHint = keyValuePair_create(keyQuery_proxy.port@TypeHint, valueQuery_proxy.port@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_proxy.port@TypeHint);
    }

    // query parameters
    if (proxy.exceptions)
    {
        list_addElement(localVarQueryParameters,proxy.exceptions);
    }

    // query parameters
    char *keyQuery_proxy.exceptions@TypeHint = NULL;
    char * valueQuery_proxy.exceptions@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_proxy.exceptions@TypeHint = 0;
    if (proxy.exceptions@TypeHint)
    {
        keyQuery_proxy.exceptions@TypeHint = strdup("proxy.exceptions@TypeHint");
        valueQuery_proxy.exceptions@TypeHint = strdup((proxy.exceptions@TypeHint));
        keyPairQuery_proxy.exceptions@TypeHint = keyValuePair_create(keyQuery_proxy.exceptions@TypeHint, valueQuery_proxy.exceptions@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_proxy.exceptions@TypeHint);
    }

    // query parameters
    char *keyQuery_proxy.enabled = NULL;
    char * valueQuery_proxy.enabled = NULL;
    keyValuePair_t *keyPairQuery_proxy.enabled = 0;
    if (proxy.enabled)
    {
        keyQuery_proxy.enabled = strdup("proxy.enabled");
        valueQuery_proxy.enabled = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_proxy.enabled, MAX_NUMBER_LENGTH, "%d", *proxy.enabled);
        keyPairQuery_proxy.enabled = keyValuePair_create(keyQuery_proxy.enabled, valueQuery_proxy.enabled);
        list_addElement(localVarQueryParameters,keyPairQuery_proxy.enabled);
    }

    // query parameters
    char *keyQuery_proxy.enabled@TypeHint = NULL;
    char * valueQuery_proxy.enabled@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_proxy.enabled@TypeHint = 0;
    if (proxy.enabled@TypeHint)
    {
        keyQuery_proxy.enabled@TypeHint = strdup("proxy.enabled@TypeHint");
        valueQuery_proxy.enabled@TypeHint = strdup((proxy.enabled@TypeHint));
        keyPairQuery_proxy.enabled@TypeHint = keyValuePair_create(keyQuery_proxy.enabled@TypeHint, valueQuery_proxy.enabled@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_proxy.enabled@TypeHint);
    }

    // query parameters
    char *keyQuery_proxy.user = NULL;
    char * valueQuery_proxy.user = NULL;
    keyValuePair_t *keyPairQuery_proxy.user = 0;
    if (proxy.user)
    {
        keyQuery_proxy.user = strdup("proxy.user");
        valueQuery_proxy.user = strdup((proxy.user));
        keyPairQuery_proxy.user = keyValuePair_create(keyQuery_proxy.user, valueQuery_proxy.user);
        list_addElement(localVarQueryParameters,keyPairQuery_proxy.user);
    }

    // query parameters
    char *keyQuery_proxy.user@TypeHint = NULL;
    char * valueQuery_proxy.user@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_proxy.user@TypeHint = 0;
    if (proxy.user@TypeHint)
    {
        keyQuery_proxy.user@TypeHint = strdup("proxy.user@TypeHint");
        valueQuery_proxy.user@TypeHint = strdup((proxy.user@TypeHint));
        keyPairQuery_proxy.user@TypeHint = keyValuePair_create(keyQuery_proxy.user@TypeHint, valueQuery_proxy.user@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_proxy.user@TypeHint);
    }

    // query parameters
    char *keyQuery_proxy.password = NULL;
    char * valueQuery_proxy.password = NULL;
    keyValuePair_t *keyPairQuery_proxy.password = 0;
    if (proxy.password)
    {
        keyQuery_proxy.password = strdup("proxy.password");
        valueQuery_proxy.password = strdup((proxy.password));
        keyPairQuery_proxy.password = keyValuePair_create(keyQuery_proxy.password, valueQuery_proxy.password);
        list_addElement(localVarQueryParameters,keyPairQuery_proxy.password);
    }

    // query parameters
    char *keyQuery_proxy.password@TypeHint = NULL;
    char * valueQuery_proxy.password@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_proxy.password@TypeHint = 0;
    if (proxy.password@TypeHint)
    {
        keyQuery_proxy.password@TypeHint = strdup("proxy.password@TypeHint");
        valueQuery_proxy.password@TypeHint = strdup((proxy.password@TypeHint));
        keyPairQuery_proxy.password@TypeHint = keyValuePair_create(keyQuery_proxy.password@TypeHint, valueQuery_proxy.password@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_proxy.password@TypeHint);
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
    if(keyQuery_proxy.host){
        free(keyQuery_proxy.host);
        keyQuery_proxy.host = NULL;
    }
    if(valueQuery_proxy.host){
        free(valueQuery_proxy.host);
        valueQuery_proxy.host = NULL;
    }
    if(keyPairQuery_proxy.host){
        keyValuePair_free(keyPairQuery_proxy.host);
        keyPairQuery_proxy.host = NULL;
    }
    if(keyQuery_proxy.host){
        free(keyQuery_proxy.host);
        keyQuery_proxy.host = NULL;
    }
    if(keyPairQuery_proxy.host){
        keyValuePair_free(keyPairQuery_proxy.host);
        keyPairQuery_proxy.host = NULL;
    }
    if(keyQuery_proxy.host@TypeHint){
        free(keyQuery_proxy.host@TypeHint);
        keyQuery_proxy.host@TypeHint = NULL;
    }
    if(valueQuery_proxy.host@TypeHint){
        free(valueQuery_proxy.host@TypeHint);
        valueQuery_proxy.host@TypeHint = NULL;
    }
    if(keyPairQuery_proxy.host@TypeHint){
        keyValuePair_free(keyPairQuery_proxy.host@TypeHint);
        keyPairQuery_proxy.host@TypeHint = NULL;
    }
    if(keyQuery_proxy.host@TypeHint){
        free(keyQuery_proxy.host@TypeHint);
        keyQuery_proxy.host@TypeHint = NULL;
    }
    if(keyPairQuery_proxy.host@TypeHint){
        keyValuePair_free(keyPairQuery_proxy.host@TypeHint);
        keyPairQuery_proxy.host@TypeHint = NULL;
    }
    if(keyQuery_proxy.port@TypeHint){
        free(keyQuery_proxy.port@TypeHint);
        keyQuery_proxy.port@TypeHint = NULL;
    }
    if(valueQuery_proxy.port@TypeHint){
        free(valueQuery_proxy.port@TypeHint);
        valueQuery_proxy.port@TypeHint = NULL;
    }
    if(keyPairQuery_proxy.port@TypeHint){
        keyValuePair_free(keyPairQuery_proxy.port@TypeHint);
        keyPairQuery_proxy.port@TypeHint = NULL;
    }
    if(keyQuery_proxy.port@TypeHint){
        free(keyQuery_proxy.port@TypeHint);
        keyQuery_proxy.port@TypeHint = NULL;
    }
    if(keyPairQuery_proxy.port@TypeHint){
        keyValuePair_free(keyPairQuery_proxy.port@TypeHint);
        keyPairQuery_proxy.port@TypeHint = NULL;
    }
    if(keyQuery_proxy.exceptions@TypeHint){
        free(keyQuery_proxy.exceptions@TypeHint);
        keyQuery_proxy.exceptions@TypeHint = NULL;
    }
    if(valueQuery_proxy.exceptions@TypeHint){
        free(valueQuery_proxy.exceptions@TypeHint);
        valueQuery_proxy.exceptions@TypeHint = NULL;
    }
    if(keyPairQuery_proxy.exceptions@TypeHint){
        keyValuePair_free(keyPairQuery_proxy.exceptions@TypeHint);
        keyPairQuery_proxy.exceptions@TypeHint = NULL;
    }
    if(keyQuery_proxy.exceptions@TypeHint){
        free(keyQuery_proxy.exceptions@TypeHint);
        keyQuery_proxy.exceptions@TypeHint = NULL;
    }
    if(keyPairQuery_proxy.exceptions@TypeHint){
        keyValuePair_free(keyPairQuery_proxy.exceptions@TypeHint);
        keyPairQuery_proxy.exceptions@TypeHint = NULL;
    }
    if(keyQuery_proxy.enabled@TypeHint){
        free(keyQuery_proxy.enabled@TypeHint);
        keyQuery_proxy.enabled@TypeHint = NULL;
    }
    if(valueQuery_proxy.enabled@TypeHint){
        free(valueQuery_proxy.enabled@TypeHint);
        valueQuery_proxy.enabled@TypeHint = NULL;
    }
    if(keyPairQuery_proxy.enabled@TypeHint){
        keyValuePair_free(keyPairQuery_proxy.enabled@TypeHint);
        keyPairQuery_proxy.enabled@TypeHint = NULL;
    }
    if(keyQuery_proxy.enabled@TypeHint){
        free(keyQuery_proxy.enabled@TypeHint);
        keyQuery_proxy.enabled@TypeHint = NULL;
    }
    if(keyPairQuery_proxy.enabled@TypeHint){
        keyValuePair_free(keyPairQuery_proxy.enabled@TypeHint);
        keyPairQuery_proxy.enabled@TypeHint = NULL;
    }
    if(keyQuery_proxy.user){
        free(keyQuery_proxy.user);
        keyQuery_proxy.user = NULL;
    }
    if(valueQuery_proxy.user){
        free(valueQuery_proxy.user);
        valueQuery_proxy.user = NULL;
    }
    if(keyPairQuery_proxy.user){
        keyValuePair_free(keyPairQuery_proxy.user);
        keyPairQuery_proxy.user = NULL;
    }
    if(keyQuery_proxy.user){
        free(keyQuery_proxy.user);
        keyQuery_proxy.user = NULL;
    }
    if(keyPairQuery_proxy.user){
        keyValuePair_free(keyPairQuery_proxy.user);
        keyPairQuery_proxy.user = NULL;
    }
    if(keyQuery_proxy.user@TypeHint){
        free(keyQuery_proxy.user@TypeHint);
        keyQuery_proxy.user@TypeHint = NULL;
    }
    if(valueQuery_proxy.user@TypeHint){
        free(valueQuery_proxy.user@TypeHint);
        valueQuery_proxy.user@TypeHint = NULL;
    }
    if(keyPairQuery_proxy.user@TypeHint){
        keyValuePair_free(keyPairQuery_proxy.user@TypeHint);
        keyPairQuery_proxy.user@TypeHint = NULL;
    }
    if(keyQuery_proxy.user@TypeHint){
        free(keyQuery_proxy.user@TypeHint);
        keyQuery_proxy.user@TypeHint = NULL;
    }
    if(keyPairQuery_proxy.user@TypeHint){
        keyValuePair_free(keyPairQuery_proxy.user@TypeHint);
        keyPairQuery_proxy.user@TypeHint = NULL;
    }
    if(keyQuery_proxy.password){
        free(keyQuery_proxy.password);
        keyQuery_proxy.password = NULL;
    }
    if(valueQuery_proxy.password){
        free(valueQuery_proxy.password);
        valueQuery_proxy.password = NULL;
    }
    if(keyPairQuery_proxy.password){
        keyValuePair_free(keyPairQuery_proxy.password);
        keyPairQuery_proxy.password = NULL;
    }
    if(keyQuery_proxy.password){
        free(keyQuery_proxy.password);
        keyQuery_proxy.password = NULL;
    }
    if(keyPairQuery_proxy.password){
        keyValuePair_free(keyPairQuery_proxy.password);
        keyPairQuery_proxy.password = NULL;
    }
    if(keyQuery_proxy.password@TypeHint){
        free(keyQuery_proxy.password@TypeHint);
        keyQuery_proxy.password@TypeHint = NULL;
    }
    if(valueQuery_proxy.password@TypeHint){
        free(valueQuery_proxy.password@TypeHint);
        valueQuery_proxy.password@TypeHint = NULL;
    }
    if(keyPairQuery_proxy.password@TypeHint){
        keyValuePair_free(keyPairQuery_proxy.password@TypeHint);
        keyPairQuery_proxy.password@TypeHint = NULL;
    }
    if(keyQuery_proxy.password@TypeHint){
        free(keyQuery_proxy.password@TypeHint);
        keyQuery_proxy.password@TypeHint = NULL;
    }
    if(keyPairQuery_proxy.password@TypeHint){
        keyValuePair_free(keyPairQuery_proxy.password@TypeHint);
        keyPairQuery_proxy.password@TypeHint = NULL;
    }

}

void
SlingAPI_postConfigApacheSlingDavExServlet(apiClient_t *apiClient, char *alias, char *alias@TypeHint, int *dav.create_absolute_uri, char *dav.create_absolute_uri@TypeHint)
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
    char *localVarPath = strdup("/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet");





    // query parameters
    char *keyQuery_alias = NULL;
    char * valueQuery_alias = NULL;
    keyValuePair_t *keyPairQuery_alias = 0;
    if (alias)
    {
        keyQuery_alias = strdup("alias");
        valueQuery_alias = strdup((alias));
        keyPairQuery_alias = keyValuePair_create(keyQuery_alias, valueQuery_alias);
        list_addElement(localVarQueryParameters,keyPairQuery_alias);
    }

    // query parameters
    char *keyQuery_alias@TypeHint = NULL;
    char * valueQuery_alias@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_alias@TypeHint = 0;
    if (alias@TypeHint)
    {
        keyQuery_alias@TypeHint = strdup("alias@TypeHint");
        valueQuery_alias@TypeHint = strdup((alias@TypeHint));
        keyPairQuery_alias@TypeHint = keyValuePair_create(keyQuery_alias@TypeHint, valueQuery_alias@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_alias@TypeHint);
    }

    // query parameters
    char *keyQuery_dav.create_absolute_uri = NULL;
    char * valueQuery_dav.create_absolute_uri = NULL;
    keyValuePair_t *keyPairQuery_dav.create_absolute_uri = 0;
    if (dav.create_absolute_uri)
    {
        keyQuery_dav.create_absolute_uri = strdup("dav.create-absolute-uri");
        valueQuery_dav.create_absolute_uri = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_dav.create_absolute_uri, MAX_NUMBER_LENGTH, "%d", *dav.create_absolute_uri);
        keyPairQuery_dav.create_absolute_uri = keyValuePair_create(keyQuery_dav.create_absolute_uri, valueQuery_dav.create_absolute_uri);
        list_addElement(localVarQueryParameters,keyPairQuery_dav.create_absolute_uri);
    }

    // query parameters
    char *keyQuery_dav.create_absolute_uri@TypeHint = NULL;
    char * valueQuery_dav.create_absolute_uri@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_dav.create_absolute_uri@TypeHint = 0;
    if (dav.create_absolute_uri@TypeHint)
    {
        keyQuery_dav.create_absolute_uri@TypeHint = strdup("dav.create-absolute-uri@TypeHint");
        valueQuery_dav.create_absolute_uri@TypeHint = strdup((dav.create_absolute_uri@TypeHint));
        keyPairQuery_dav.create_absolute_uri@TypeHint = keyValuePair_create(keyQuery_dav.create_absolute_uri@TypeHint, valueQuery_dav.create_absolute_uri@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_dav.create_absolute_uri@TypeHint);
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
    if(keyQuery_alias){
        free(keyQuery_alias);
        keyQuery_alias = NULL;
    }
    if(valueQuery_alias){
        free(valueQuery_alias);
        valueQuery_alias = NULL;
    }
    if(keyPairQuery_alias){
        keyValuePair_free(keyPairQuery_alias);
        keyPairQuery_alias = NULL;
    }
    if(keyQuery_alias){
        free(keyQuery_alias);
        keyQuery_alias = NULL;
    }
    if(keyPairQuery_alias){
        keyValuePair_free(keyPairQuery_alias);
        keyPairQuery_alias = NULL;
    }
    if(keyQuery_alias@TypeHint){
        free(keyQuery_alias@TypeHint);
        keyQuery_alias@TypeHint = NULL;
    }
    if(valueQuery_alias@TypeHint){
        free(valueQuery_alias@TypeHint);
        valueQuery_alias@TypeHint = NULL;
    }
    if(keyPairQuery_alias@TypeHint){
        keyValuePair_free(keyPairQuery_alias@TypeHint);
        keyPairQuery_alias@TypeHint = NULL;
    }
    if(keyQuery_alias@TypeHint){
        free(keyQuery_alias@TypeHint);
        keyQuery_alias@TypeHint = NULL;
    }
    if(keyPairQuery_alias@TypeHint){
        keyValuePair_free(keyPairQuery_alias@TypeHint);
        keyPairQuery_alias@TypeHint = NULL;
    }
    if(keyQuery_dav.create_absolute_uri@TypeHint){
        free(keyQuery_dav.create_absolute_uri@TypeHint);
        keyQuery_dav.create_absolute_uri@TypeHint = NULL;
    }
    if(valueQuery_dav.create_absolute_uri@TypeHint){
        free(valueQuery_dav.create_absolute_uri@TypeHint);
        valueQuery_dav.create_absolute_uri@TypeHint = NULL;
    }
    if(keyPairQuery_dav.create_absolute_uri@TypeHint){
        keyValuePair_free(keyPairQuery_dav.create_absolute_uri@TypeHint);
        keyPairQuery_dav.create_absolute_uri@TypeHint = NULL;
    }
    if(keyQuery_dav.create_absolute_uri@TypeHint){
        free(keyQuery_dav.create_absolute_uri@TypeHint);
        keyQuery_dav.create_absolute_uri@TypeHint = NULL;
    }
    if(keyPairQuery_dav.create_absolute_uri@TypeHint){
        keyValuePair_free(keyPairQuery_dav.create_absolute_uri@TypeHint);
        keyPairQuery_dav.create_absolute_uri@TypeHint = NULL;
    }

}

void
SlingAPI_postConfigApacheSlingGetServlet(apiClient_t *apiClient, char *json.maximumresults, char *json.maximumresults@TypeHint, int *enable.html, char *enable.html@TypeHint, int *enable.txt, char *enable.txt@TypeHint, int *enable.xml, char *enable.xml@TypeHint)
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
    char *localVarPath = strdup("/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet");





    // query parameters
    char *keyQuery_json.maximumresults = NULL;
    char * valueQuery_json.maximumresults = NULL;
    keyValuePair_t *keyPairQuery_json.maximumresults = 0;
    if (json.maximumresults)
    {
        keyQuery_json.maximumresults = strdup("json.maximumresults");
        valueQuery_json.maximumresults = strdup((json.maximumresults));
        keyPairQuery_json.maximumresults = keyValuePair_create(keyQuery_json.maximumresults, valueQuery_json.maximumresults);
        list_addElement(localVarQueryParameters,keyPairQuery_json.maximumresults);
    }

    // query parameters
    char *keyQuery_json.maximumresults@TypeHint = NULL;
    char * valueQuery_json.maximumresults@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_json.maximumresults@TypeHint = 0;
    if (json.maximumresults@TypeHint)
    {
        keyQuery_json.maximumresults@TypeHint = strdup("json.maximumresults@TypeHint");
        valueQuery_json.maximumresults@TypeHint = strdup((json.maximumresults@TypeHint));
        keyPairQuery_json.maximumresults@TypeHint = keyValuePair_create(keyQuery_json.maximumresults@TypeHint, valueQuery_json.maximumresults@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_json.maximumresults@TypeHint);
    }

    // query parameters
    char *keyQuery_enable.html = NULL;
    char * valueQuery_enable.html = NULL;
    keyValuePair_t *keyPairQuery_enable.html = 0;
    if (enable.html)
    {
        keyQuery_enable.html = strdup("enable.html");
        valueQuery_enable.html = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable.html, MAX_NUMBER_LENGTH, "%d", *enable.html);
        keyPairQuery_enable.html = keyValuePair_create(keyQuery_enable.html, valueQuery_enable.html);
        list_addElement(localVarQueryParameters,keyPairQuery_enable.html);
    }

    // query parameters
    char *keyQuery_enable.html@TypeHint = NULL;
    char * valueQuery_enable.html@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_enable.html@TypeHint = 0;
    if (enable.html@TypeHint)
    {
        keyQuery_enable.html@TypeHint = strdup("enable.html@TypeHint");
        valueQuery_enable.html@TypeHint = strdup((enable.html@TypeHint));
        keyPairQuery_enable.html@TypeHint = keyValuePair_create(keyQuery_enable.html@TypeHint, valueQuery_enable.html@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_enable.html@TypeHint);
    }

    // query parameters
    char *keyQuery_enable.txt = NULL;
    char * valueQuery_enable.txt = NULL;
    keyValuePair_t *keyPairQuery_enable.txt = 0;
    if (enable.txt)
    {
        keyQuery_enable.txt = strdup("enable.txt");
        valueQuery_enable.txt = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable.txt, MAX_NUMBER_LENGTH, "%d", *enable.txt);
        keyPairQuery_enable.txt = keyValuePair_create(keyQuery_enable.txt, valueQuery_enable.txt);
        list_addElement(localVarQueryParameters,keyPairQuery_enable.txt);
    }

    // query parameters
    char *keyQuery_enable.txt@TypeHint = NULL;
    char * valueQuery_enable.txt@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_enable.txt@TypeHint = 0;
    if (enable.txt@TypeHint)
    {
        keyQuery_enable.txt@TypeHint = strdup("enable.txt@TypeHint");
        valueQuery_enable.txt@TypeHint = strdup((enable.txt@TypeHint));
        keyPairQuery_enable.txt@TypeHint = keyValuePair_create(keyQuery_enable.txt@TypeHint, valueQuery_enable.txt@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_enable.txt@TypeHint);
    }

    // query parameters
    char *keyQuery_enable.xml = NULL;
    char * valueQuery_enable.xml = NULL;
    keyValuePair_t *keyPairQuery_enable.xml = 0;
    if (enable.xml)
    {
        keyQuery_enable.xml = strdup("enable.xml");
        valueQuery_enable.xml = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable.xml, MAX_NUMBER_LENGTH, "%d", *enable.xml);
        keyPairQuery_enable.xml = keyValuePair_create(keyQuery_enable.xml, valueQuery_enable.xml);
        list_addElement(localVarQueryParameters,keyPairQuery_enable.xml);
    }

    // query parameters
    char *keyQuery_enable.xml@TypeHint = NULL;
    char * valueQuery_enable.xml@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_enable.xml@TypeHint = 0;
    if (enable.xml@TypeHint)
    {
        keyQuery_enable.xml@TypeHint = strdup("enable.xml@TypeHint");
        valueQuery_enable.xml@TypeHint = strdup((enable.xml@TypeHint));
        keyPairQuery_enable.xml@TypeHint = keyValuePair_create(keyQuery_enable.xml@TypeHint, valueQuery_enable.xml@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_enable.xml@TypeHint);
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
    if(keyQuery_json.maximumresults){
        free(keyQuery_json.maximumresults);
        keyQuery_json.maximumresults = NULL;
    }
    if(valueQuery_json.maximumresults){
        free(valueQuery_json.maximumresults);
        valueQuery_json.maximumresults = NULL;
    }
    if(keyPairQuery_json.maximumresults){
        keyValuePair_free(keyPairQuery_json.maximumresults);
        keyPairQuery_json.maximumresults = NULL;
    }
    if(keyQuery_json.maximumresults){
        free(keyQuery_json.maximumresults);
        keyQuery_json.maximumresults = NULL;
    }
    if(keyPairQuery_json.maximumresults){
        keyValuePair_free(keyPairQuery_json.maximumresults);
        keyPairQuery_json.maximumresults = NULL;
    }
    if(keyQuery_json.maximumresults@TypeHint){
        free(keyQuery_json.maximumresults@TypeHint);
        keyQuery_json.maximumresults@TypeHint = NULL;
    }
    if(valueQuery_json.maximumresults@TypeHint){
        free(valueQuery_json.maximumresults@TypeHint);
        valueQuery_json.maximumresults@TypeHint = NULL;
    }
    if(keyPairQuery_json.maximumresults@TypeHint){
        keyValuePair_free(keyPairQuery_json.maximumresults@TypeHint);
        keyPairQuery_json.maximumresults@TypeHint = NULL;
    }
    if(keyQuery_json.maximumresults@TypeHint){
        free(keyQuery_json.maximumresults@TypeHint);
        keyQuery_json.maximumresults@TypeHint = NULL;
    }
    if(keyPairQuery_json.maximumresults@TypeHint){
        keyValuePair_free(keyPairQuery_json.maximumresults@TypeHint);
        keyPairQuery_json.maximumresults@TypeHint = NULL;
    }
    if(keyQuery_enable.html@TypeHint){
        free(keyQuery_enable.html@TypeHint);
        keyQuery_enable.html@TypeHint = NULL;
    }
    if(valueQuery_enable.html@TypeHint){
        free(valueQuery_enable.html@TypeHint);
        valueQuery_enable.html@TypeHint = NULL;
    }
    if(keyPairQuery_enable.html@TypeHint){
        keyValuePair_free(keyPairQuery_enable.html@TypeHint);
        keyPairQuery_enable.html@TypeHint = NULL;
    }
    if(keyQuery_enable.html@TypeHint){
        free(keyQuery_enable.html@TypeHint);
        keyQuery_enable.html@TypeHint = NULL;
    }
    if(keyPairQuery_enable.html@TypeHint){
        keyValuePair_free(keyPairQuery_enable.html@TypeHint);
        keyPairQuery_enable.html@TypeHint = NULL;
    }
    if(keyQuery_enable.txt@TypeHint){
        free(keyQuery_enable.txt@TypeHint);
        keyQuery_enable.txt@TypeHint = NULL;
    }
    if(valueQuery_enable.txt@TypeHint){
        free(valueQuery_enable.txt@TypeHint);
        valueQuery_enable.txt@TypeHint = NULL;
    }
    if(keyPairQuery_enable.txt@TypeHint){
        keyValuePair_free(keyPairQuery_enable.txt@TypeHint);
        keyPairQuery_enable.txt@TypeHint = NULL;
    }
    if(keyQuery_enable.txt@TypeHint){
        free(keyQuery_enable.txt@TypeHint);
        keyQuery_enable.txt@TypeHint = NULL;
    }
    if(keyPairQuery_enable.txt@TypeHint){
        keyValuePair_free(keyPairQuery_enable.txt@TypeHint);
        keyPairQuery_enable.txt@TypeHint = NULL;
    }
    if(keyQuery_enable.xml@TypeHint){
        free(keyQuery_enable.xml@TypeHint);
        keyQuery_enable.xml@TypeHint = NULL;
    }
    if(valueQuery_enable.xml@TypeHint){
        free(valueQuery_enable.xml@TypeHint);
        valueQuery_enable.xml@TypeHint = NULL;
    }
    if(keyPairQuery_enable.xml@TypeHint){
        keyValuePair_free(keyPairQuery_enable.xml@TypeHint);
        keyPairQuery_enable.xml@TypeHint = NULL;
    }
    if(keyQuery_enable.xml@TypeHint){
        free(keyQuery_enable.xml@TypeHint);
        keyQuery_enable.xml@TypeHint = NULL;
    }
    if(keyPairQuery_enable.xml@TypeHint){
        keyValuePair_free(keyPairQuery_enable.xml@TypeHint);
        keyPairQuery_enable.xml@TypeHint = NULL;
    }

}

void
SlingAPI_postConfigApacheSlingReferrerFilter(apiClient_t *apiClient, int *allow.empty, char *allow.empty@TypeHint, char *allow.hosts, char *allow.hosts@TypeHint, char *allow.hosts.regexp, char *allow.hosts.regexp@TypeHint, char *filter.methods, char *filter.methods@TypeHint)
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
    char *localVarPath = strdup("/apps/system/config/org.apache.sling.security.impl.ReferrerFilter");





    // query parameters
    char *keyQuery_allow.empty = NULL;
    char * valueQuery_allow.empty = NULL;
    keyValuePair_t *keyPairQuery_allow.empty = 0;
    if (allow.empty)
    {
        keyQuery_allow.empty = strdup("allow.empty");
        valueQuery_allow.empty = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_allow.empty, MAX_NUMBER_LENGTH, "%d", *allow.empty);
        keyPairQuery_allow.empty = keyValuePair_create(keyQuery_allow.empty, valueQuery_allow.empty);
        list_addElement(localVarQueryParameters,keyPairQuery_allow.empty);
    }

    // query parameters
    char *keyQuery_allow.empty@TypeHint = NULL;
    char * valueQuery_allow.empty@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_allow.empty@TypeHint = 0;
    if (allow.empty@TypeHint)
    {
        keyQuery_allow.empty@TypeHint = strdup("allow.empty@TypeHint");
        valueQuery_allow.empty@TypeHint = strdup((allow.empty@TypeHint));
        keyPairQuery_allow.empty@TypeHint = keyValuePair_create(keyQuery_allow.empty@TypeHint, valueQuery_allow.empty@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_allow.empty@TypeHint);
    }

    // query parameters
    char *keyQuery_allow.hosts = NULL;
    char * valueQuery_allow.hosts = NULL;
    keyValuePair_t *keyPairQuery_allow.hosts = 0;
    if (allow.hosts)
    {
        keyQuery_allow.hosts = strdup("allow.hosts");
        valueQuery_allow.hosts = strdup((allow.hosts));
        keyPairQuery_allow.hosts = keyValuePair_create(keyQuery_allow.hosts, valueQuery_allow.hosts);
        list_addElement(localVarQueryParameters,keyPairQuery_allow.hosts);
    }

    // query parameters
    char *keyQuery_allow.hosts@TypeHint = NULL;
    char * valueQuery_allow.hosts@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_allow.hosts@TypeHint = 0;
    if (allow.hosts@TypeHint)
    {
        keyQuery_allow.hosts@TypeHint = strdup("allow.hosts@TypeHint");
        valueQuery_allow.hosts@TypeHint = strdup((allow.hosts@TypeHint));
        keyPairQuery_allow.hosts@TypeHint = keyValuePair_create(keyQuery_allow.hosts@TypeHint, valueQuery_allow.hosts@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_allow.hosts@TypeHint);
    }

    // query parameters
    char *keyQuery_allow.hosts.regexp = NULL;
    char * valueQuery_allow.hosts.regexp = NULL;
    keyValuePair_t *keyPairQuery_allow.hosts.regexp = 0;
    if (allow.hosts.regexp)
    {
        keyQuery_allow.hosts.regexp = strdup("allow.hosts.regexp");
        valueQuery_allow.hosts.regexp = strdup((allow.hosts.regexp));
        keyPairQuery_allow.hosts.regexp = keyValuePair_create(keyQuery_allow.hosts.regexp, valueQuery_allow.hosts.regexp);
        list_addElement(localVarQueryParameters,keyPairQuery_allow.hosts.regexp);
    }

    // query parameters
    char *keyQuery_allow.hosts.regexp@TypeHint = NULL;
    char * valueQuery_allow.hosts.regexp@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_allow.hosts.regexp@TypeHint = 0;
    if (allow.hosts.regexp@TypeHint)
    {
        keyQuery_allow.hosts.regexp@TypeHint = strdup("allow.hosts.regexp@TypeHint");
        valueQuery_allow.hosts.regexp@TypeHint = strdup((allow.hosts.regexp@TypeHint));
        keyPairQuery_allow.hosts.regexp@TypeHint = keyValuePair_create(keyQuery_allow.hosts.regexp@TypeHint, valueQuery_allow.hosts.regexp@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_allow.hosts.regexp@TypeHint);
    }

    // query parameters
    char *keyQuery_filter.methods = NULL;
    char * valueQuery_filter.methods = NULL;
    keyValuePair_t *keyPairQuery_filter.methods = 0;
    if (filter.methods)
    {
        keyQuery_filter.methods = strdup("filter.methods");
        valueQuery_filter.methods = strdup((filter.methods));
        keyPairQuery_filter.methods = keyValuePair_create(keyQuery_filter.methods, valueQuery_filter.methods);
        list_addElement(localVarQueryParameters,keyPairQuery_filter.methods);
    }

    // query parameters
    char *keyQuery_filter.methods@TypeHint = NULL;
    char * valueQuery_filter.methods@TypeHint = NULL;
    keyValuePair_t *keyPairQuery_filter.methods@TypeHint = 0;
    if (filter.methods@TypeHint)
    {
        keyQuery_filter.methods@TypeHint = strdup("filter.methods@TypeHint");
        valueQuery_filter.methods@TypeHint = strdup((filter.methods@TypeHint));
        keyPairQuery_filter.methods@TypeHint = keyValuePair_create(keyQuery_filter.methods@TypeHint, valueQuery_filter.methods@TypeHint);
        list_addElement(localVarQueryParameters,keyPairQuery_filter.methods@TypeHint);
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
    if(keyQuery_allow.empty@TypeHint){
        free(keyQuery_allow.empty@TypeHint);
        keyQuery_allow.empty@TypeHint = NULL;
    }
    if(valueQuery_allow.empty@TypeHint){
        free(valueQuery_allow.empty@TypeHint);
        valueQuery_allow.empty@TypeHint = NULL;
    }
    if(keyPairQuery_allow.empty@TypeHint){
        keyValuePair_free(keyPairQuery_allow.empty@TypeHint);
        keyPairQuery_allow.empty@TypeHint = NULL;
    }
    if(keyQuery_allow.empty@TypeHint){
        free(keyQuery_allow.empty@TypeHint);
        keyQuery_allow.empty@TypeHint = NULL;
    }
    if(keyPairQuery_allow.empty@TypeHint){
        keyValuePair_free(keyPairQuery_allow.empty@TypeHint);
        keyPairQuery_allow.empty@TypeHint = NULL;
    }
    if(keyQuery_allow.hosts){
        free(keyQuery_allow.hosts);
        keyQuery_allow.hosts = NULL;
    }
    if(valueQuery_allow.hosts){
        free(valueQuery_allow.hosts);
        valueQuery_allow.hosts = NULL;
    }
    if(keyPairQuery_allow.hosts){
        keyValuePair_free(keyPairQuery_allow.hosts);
        keyPairQuery_allow.hosts = NULL;
    }
    if(keyQuery_allow.hosts){
        free(keyQuery_allow.hosts);
        keyQuery_allow.hosts = NULL;
    }
    if(keyPairQuery_allow.hosts){
        keyValuePair_free(keyPairQuery_allow.hosts);
        keyPairQuery_allow.hosts = NULL;
    }
    if(keyQuery_allow.hosts@TypeHint){
        free(keyQuery_allow.hosts@TypeHint);
        keyQuery_allow.hosts@TypeHint = NULL;
    }
    if(valueQuery_allow.hosts@TypeHint){
        free(valueQuery_allow.hosts@TypeHint);
        valueQuery_allow.hosts@TypeHint = NULL;
    }
    if(keyPairQuery_allow.hosts@TypeHint){
        keyValuePair_free(keyPairQuery_allow.hosts@TypeHint);
        keyPairQuery_allow.hosts@TypeHint = NULL;
    }
    if(keyQuery_allow.hosts@TypeHint){
        free(keyQuery_allow.hosts@TypeHint);
        keyQuery_allow.hosts@TypeHint = NULL;
    }
    if(keyPairQuery_allow.hosts@TypeHint){
        keyValuePair_free(keyPairQuery_allow.hosts@TypeHint);
        keyPairQuery_allow.hosts@TypeHint = NULL;
    }
    if(keyQuery_allow.hosts.regexp){
        free(keyQuery_allow.hosts.regexp);
        keyQuery_allow.hosts.regexp = NULL;
    }
    if(valueQuery_allow.hosts.regexp){
        free(valueQuery_allow.hosts.regexp);
        valueQuery_allow.hosts.regexp = NULL;
    }
    if(keyPairQuery_allow.hosts.regexp){
        keyValuePair_free(keyPairQuery_allow.hosts.regexp);
        keyPairQuery_allow.hosts.regexp = NULL;
    }
    if(keyQuery_allow.hosts.regexp){
        free(keyQuery_allow.hosts.regexp);
        keyQuery_allow.hosts.regexp = NULL;
    }
    if(keyPairQuery_allow.hosts.regexp){
        keyValuePair_free(keyPairQuery_allow.hosts.regexp);
        keyPairQuery_allow.hosts.regexp = NULL;
    }
    if(keyQuery_allow.hosts.regexp@TypeHint){
        free(keyQuery_allow.hosts.regexp@TypeHint);
        keyQuery_allow.hosts.regexp@TypeHint = NULL;
    }
    if(valueQuery_allow.hosts.regexp@TypeHint){
        free(valueQuery_allow.hosts.regexp@TypeHint);
        valueQuery_allow.hosts.regexp@TypeHint = NULL;
    }
    if(keyPairQuery_allow.hosts.regexp@TypeHint){
        keyValuePair_free(keyPairQuery_allow.hosts.regexp@TypeHint);
        keyPairQuery_allow.hosts.regexp@TypeHint = NULL;
    }
    if(keyQuery_allow.hosts.regexp@TypeHint){
        free(keyQuery_allow.hosts.regexp@TypeHint);
        keyQuery_allow.hosts.regexp@TypeHint = NULL;
    }
    if(keyPairQuery_allow.hosts.regexp@TypeHint){
        keyValuePair_free(keyPairQuery_allow.hosts.regexp@TypeHint);
        keyPairQuery_allow.hosts.regexp@TypeHint = NULL;
    }
    if(keyQuery_filter.methods){
        free(keyQuery_filter.methods);
        keyQuery_filter.methods = NULL;
    }
    if(valueQuery_filter.methods){
        free(valueQuery_filter.methods);
        valueQuery_filter.methods = NULL;
    }
    if(keyPairQuery_filter.methods){
        keyValuePair_free(keyPairQuery_filter.methods);
        keyPairQuery_filter.methods = NULL;
    }
    if(keyQuery_filter.methods){
        free(keyQuery_filter.methods);
        keyQuery_filter.methods = NULL;
    }
    if(keyPairQuery_filter.methods){
        keyValuePair_free(keyPairQuery_filter.methods);
        keyPairQuery_filter.methods = NULL;
    }
    if(keyQuery_filter.methods@TypeHint){
        free(keyQuery_filter.methods@TypeHint);
        keyQuery_filter.methods@TypeHint = NULL;
    }
    if(valueQuery_filter.methods@TypeHint){
        free(valueQuery_filter.methods@TypeHint);
        valueQuery_filter.methods@TypeHint = NULL;
    }
    if(keyPairQuery_filter.methods@TypeHint){
        keyValuePair_free(keyPairQuery_filter.methods@TypeHint);
        keyPairQuery_filter.methods@TypeHint = NULL;
    }
    if(keyQuery_filter.methods@TypeHint){
        free(keyQuery_filter.methods@TypeHint);
        keyQuery_filter.methods@TypeHint = NULL;
    }
    if(keyPairQuery_filter.methods@TypeHint){
        keyValuePair_free(keyPairQuery_filter.methods@TypeHint);
        keyPairQuery_filter.methods@TypeHint = NULL;
    }

}

void
SlingAPI_postConfigProperty(apiClient_t *apiClient, char *configNodeName)
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
    char *localVarPath = strdup("/apps/system/config/{configNodeName}");

    if(!configNodeName)
        goto end;


    // Path Params
    long sizeOfPathParams_configNodeName = strlen(configNodeName)+3 + sizeof("{ configNodeName }") - 1;
    if(configNodeName == NULL) {
        goto end;
    }
    char* localVarToReplace_configNodeName = malloc(sizeOfPathParams_configNodeName);
    sprintf(localVarToReplace_configNodeName, "{%s}", "configNodeName");

    localVarPath = strReplace(localVarPath, localVarToReplace_configNodeName, configNodeName);


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
    free(localVarToReplace_configNodeName);

}

void
SlingAPI_postNode(apiClient_t *apiClient, char *path, char *name, char *:operation, char *deleteAuthorizable, binary_t* file)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_createList();
    list_t *localVarHeaderType = NULL;
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/{path}/{name}");

    if(!path)
        goto end;
    if(!name)
        goto end;


    // Path Params
    long sizeOfPathParams_path = strlen(path)+3 + strlen(name)+3 + sizeof("{ path }") - 1;
    if(path == NULL) {
        goto end;
    }
    char* localVarToReplace_path = malloc(sizeOfPathParams_path);
    sprintf(localVarToReplace_path, "{%s}", "path");

    localVarPath = strReplace(localVarPath, localVarToReplace_path, path);

    // Path Params
    long sizeOfPathParams_name = strlen(path)+3 + strlen(name)+3 + sizeof("{ name }") - 1;
    if(name == NULL) {
        goto end;
    }
    char* localVarToReplace_name = malloc(sizeOfPathParams_name);
    sprintf(localVarToReplace_name, "{%s}", "name");

    localVarPath = strReplace(localVarPath, localVarToReplace_name, name);



    // query parameters
    char *keyQuery_:operation = NULL;
    char * valueQuery_:operation = NULL;
    keyValuePair_t *keyPairQuery_:operation = 0;
    if (:operation)
    {
        keyQuery_:operation = strdup(":operation");
        valueQuery_:operation = strdup((:operation));
        keyPairQuery_:operation = keyValuePair_create(keyQuery_:operation, valueQuery_:operation);
        list_addElement(localVarQueryParameters,keyPairQuery_:operation);
    }

    // query parameters
    char *keyQuery_deleteAuthorizable = NULL;
    char * valueQuery_deleteAuthorizable = NULL;
    keyValuePair_t *keyPairQuery_deleteAuthorizable = 0;
    if (deleteAuthorizable)
    {
        keyQuery_deleteAuthorizable = strdup("deleteAuthorizable");
        valueQuery_deleteAuthorizable = strdup((deleteAuthorizable));
        keyPairQuery_deleteAuthorizable = keyValuePair_create(keyQuery_deleteAuthorizable, valueQuery_deleteAuthorizable);
        list_addElement(localVarQueryParameters,keyPairQuery_deleteAuthorizable);
    }

    // form parameters
    char *keyForm_file = NULL;
    binary_t* valueForm_file = 0;
    keyValuePair_t *keyPairForm_file = 0;
    if (file != NULL)
    {
        keyForm_file = strdup("file");
        valueForm_file = file;
        keyPairForm_file = keyValuePair_create(keyForm_file, &valueForm_file);
        list_addElement(localVarFormParameters,keyPairForm_file); //file adding
    }
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
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    list_freeList(localVarFormParameters);
    
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_path);
    free(localVarToReplace_name);
    if(keyQuery_:operation){
        free(keyQuery_:operation);
        keyQuery_:operation = NULL;
    }
    if(valueQuery_:operation){
        free(valueQuery_:operation);
        valueQuery_:operation = NULL;
    }
    if(keyPairQuery_:operation){
        keyValuePair_free(keyPairQuery_:operation);
        keyPairQuery_:operation = NULL;
    }
    if(keyQuery_:operation){
        free(keyQuery_:operation);
        keyQuery_:operation = NULL;
    }
    if(keyPairQuery_:operation){
        keyValuePair_free(keyPairQuery_:operation);
        keyPairQuery_:operation = NULL;
    }
    if(keyQuery_deleteAuthorizable){
        free(keyQuery_deleteAuthorizable);
        keyQuery_deleteAuthorizable = NULL;
    }
    if(valueQuery_deleteAuthorizable){
        free(valueQuery_deleteAuthorizable);
        valueQuery_deleteAuthorizable = NULL;
    }
    if(keyPairQuery_deleteAuthorizable){
        keyValuePair_free(keyPairQuery_deleteAuthorizable);
        keyPairQuery_deleteAuthorizable = NULL;
    }
    if(keyQuery_deleteAuthorizable){
        free(keyQuery_deleteAuthorizable);
        keyQuery_deleteAuthorizable = NULL;
    }
    if(keyPairQuery_deleteAuthorizable){
        keyValuePair_free(keyPairQuery_deleteAuthorizable);
        keyPairQuery_deleteAuthorizable = NULL;
    }
    if (keyForm_file) {
        free(keyForm_file);
        keyForm_file = NULL;
    }
//    free(fileVar_file->data);
//    free(fileVar_file);

}

void
SlingAPI_postNodeRw(apiClient_t *apiClient, char *path, char *name, char *addMembers)
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
    char *localVarPath = strdup("/{path}/{name}.rw.html");

    if(!path)
        goto end;
    if(!name)
        goto end;


    // Path Params
    long sizeOfPathParams_path = strlen(path)+3 + strlen(name)+3 + sizeof("{ path }") - 1;
    if(path == NULL) {
        goto end;
    }
    char* localVarToReplace_path = malloc(sizeOfPathParams_path);
    sprintf(localVarToReplace_path, "{%s}", "path");

    localVarPath = strReplace(localVarPath, localVarToReplace_path, path);

    // Path Params
    long sizeOfPathParams_name = strlen(path)+3 + strlen(name)+3 + sizeof("{ name }") - 1;
    if(name == NULL) {
        goto end;
    }
    char* localVarToReplace_name = malloc(sizeOfPathParams_name);
    sprintf(localVarToReplace_name, "{%s}", "name");

    localVarPath = strReplace(localVarPath, localVarToReplace_name, name);



    // query parameters
    char *keyQuery_addMembers = NULL;
    char * valueQuery_addMembers = NULL;
    keyValuePair_t *keyPairQuery_addMembers = 0;
    if (addMembers)
    {
        keyQuery_addMembers = strdup("addMembers");
        valueQuery_addMembers = strdup((addMembers));
        keyPairQuery_addMembers = keyValuePair_create(keyQuery_addMembers, valueQuery_addMembers);
        list_addElement(localVarQueryParameters,keyPairQuery_addMembers);
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
    free(localVarToReplace_path);
    free(localVarToReplace_name);
    if(keyQuery_addMembers){
        free(keyQuery_addMembers);
        keyQuery_addMembers = NULL;
    }
    if(valueQuery_addMembers){
        free(valueQuery_addMembers);
        valueQuery_addMembers = NULL;
    }
    if(keyPairQuery_addMembers){
        keyValuePair_free(keyPairQuery_addMembers);
        keyPairQuery_addMembers = NULL;
    }
    if(keyQuery_addMembers){
        free(keyQuery_addMembers);
        keyQuery_addMembers = NULL;
    }
    if(keyPairQuery_addMembers){
        keyValuePair_free(keyPairQuery_addMembers);
        keyPairQuery_addMembers = NULL;
    }

}

void
SlingAPI_postPath(apiClient_t *apiClient, char *path, char *jcr:primaryType, char *:name)
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
    char *localVarPath = strdup("/{path}/");

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
    char *keyQuery_jcr:primaryType = NULL;
    char * valueQuery_jcr:primaryType = NULL;
    keyValuePair_t *keyPairQuery_jcr:primaryType = 0;
    if (jcr:primaryType)
    {
        keyQuery_jcr:primaryType = strdup("jcr:primaryType");
        valueQuery_jcr:primaryType = strdup((jcr:primaryType));
        keyPairQuery_jcr:primaryType = keyValuePair_create(keyQuery_jcr:primaryType, valueQuery_jcr:primaryType);
        list_addElement(localVarQueryParameters,keyPairQuery_jcr:primaryType);
    }

    // query parameters
    char *keyQuery_:name = NULL;
    char * valueQuery_:name = NULL;
    keyValuePair_t *keyPairQuery_:name = 0;
    if (:name)
    {
        keyQuery_:name = strdup(":name");
        valueQuery_:name = strdup((:name));
        keyPairQuery_:name = keyValuePair_create(keyQuery_:name, valueQuery_:name);
        list_addElement(localVarQueryParameters,keyPairQuery_:name);
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
    free(localVarToReplace_path);
    if(keyQuery_jcr:primaryType){
        free(keyQuery_jcr:primaryType);
        keyQuery_jcr:primaryType = NULL;
    }
    if(valueQuery_jcr:primaryType){
        free(valueQuery_jcr:primaryType);
        valueQuery_jcr:primaryType = NULL;
    }
    if(keyPairQuery_jcr:primaryType){
        keyValuePair_free(keyPairQuery_jcr:primaryType);
        keyPairQuery_jcr:primaryType = NULL;
    }
    if(keyQuery_jcr:primaryType){
        free(keyQuery_jcr:primaryType);
        keyQuery_jcr:primaryType = NULL;
    }
    if(keyPairQuery_jcr:primaryType){
        keyValuePair_free(keyPairQuery_jcr:primaryType);
        keyPairQuery_jcr:primaryType = NULL;
    }
    if(keyQuery_:name){
        free(keyQuery_:name);
        keyQuery_:name = NULL;
    }
    if(valueQuery_:name){
        free(valueQuery_:name);
        valueQuery_:name = NULL;
    }
    if(keyPairQuery_:name){
        keyValuePair_free(keyPairQuery_:name);
        keyPairQuery_:name = NULL;
    }
    if(keyQuery_:name){
        free(keyQuery_:name);
        keyQuery_:name = NULL;
    }
    if(keyPairQuery_:name){
        keyValuePair_free(keyPairQuery_:name);
        keyPairQuery_:name = NULL;
    }

}

char*
SlingAPI_postQuery(apiClient_t *apiClient, char *path, double p.limit, char *_1_property, char *_1_property.value)
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
    char *localVarPath = strdup("/bin/querybuilder.json");





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
    char *keyQuery_p.limit = NULL;
    double valueQuery_p.limit ;
    keyValuePair_t *keyPairQuery_p.limit = 0;
    if (p.limit)
    {
        keyQuery_p.limit = strdup("p.limit");
        valueQuery_p.limit = (p.limit);
        keyPairQuery_p.limit = keyValuePair_create(keyQuery_p.limit, &valueQuery_p.limit);
        list_addElement(localVarQueryParameters,keyPairQuery_p.limit);
    }

    // query parameters
    char *keyQuery__1_property = NULL;
    char * valueQuery__1_property = NULL;
    keyValuePair_t *keyPairQuery__1_property = 0;
    if (_1_property)
    {
        keyQuery__1_property = strdup("1_property");
        valueQuery__1_property = strdup((_1_property));
        keyPairQuery__1_property = keyValuePair_create(keyQuery__1_property, valueQuery__1_property);
        list_addElement(localVarQueryParameters,keyPairQuery__1_property);
    }

    // query parameters
    char *keyQuery__1_property.value = NULL;
    char * valueQuery__1_property.value = NULL;
    keyValuePair_t *keyPairQuery__1_property.value = 0;
    if (_1_property.value)
    {
        keyQuery__1_property.value = strdup("1_property.value");
        valueQuery__1_property.value = strdup((_1_property.value));
        keyPairQuery__1_property.value = keyValuePair_create(keyQuery__1_property.value, valueQuery__1_property.value);
        list_addElement(localVarQueryParameters,keyPairQuery__1_property.value);
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
    if(keyQuery_p.limit){
        free(keyQuery_p.limit);
        keyQuery_p.limit = NULL;
    }
    if(keyPairQuery_p.limit){
        keyValuePair_free(keyPairQuery_p.limit);
        keyPairQuery_p.limit = NULL;
    }
    if(keyQuery__1_property){
        free(keyQuery__1_property);
        keyQuery__1_property = NULL;
    }
    if(valueQuery__1_property){
        free(valueQuery__1_property);
        valueQuery__1_property = NULL;
    }
    if(keyPairQuery__1_property){
        keyValuePair_free(keyPairQuery__1_property);
        keyPairQuery__1_property = NULL;
    }
    if(keyQuery__1_property.value){
        free(keyQuery__1_property.value);
        keyQuery__1_property.value = NULL;
    }
    if(valueQuery__1_property.value){
        free(valueQuery__1_property.value);
        valueQuery__1_property.value = NULL;
    }
    if(keyPairQuery__1_property.value){
        keyValuePair_free(keyPairQuery__1_property.value);
        keyPairQuery__1_property.value = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

void
SlingAPI_postTreeActivation(apiClient_t *apiClient, int *ignoredeactivated, int *onlymodified, char *path, char *cmd)
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
    char *localVarPath = strdup("/libs/replication/treeactivation.html");





    // query parameters
    char *keyQuery_ignoredeactivated = NULL;
    char * valueQuery_ignoredeactivated = NULL;
    keyValuePair_t *keyPairQuery_ignoredeactivated = 0;
    if (ignoredeactivated)
    {
        keyQuery_ignoredeactivated = strdup("ignoredeactivated");
        valueQuery_ignoredeactivated = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_ignoredeactivated, MAX_NUMBER_LENGTH, "%d", *ignoredeactivated);
        keyPairQuery_ignoredeactivated = keyValuePair_create(keyQuery_ignoredeactivated, valueQuery_ignoredeactivated);
        list_addElement(localVarQueryParameters,keyPairQuery_ignoredeactivated);
    }

    // query parameters
    char *keyQuery_onlymodified = NULL;
    char * valueQuery_onlymodified = NULL;
    keyValuePair_t *keyPairQuery_onlymodified = 0;
    if (onlymodified)
    {
        keyQuery_onlymodified = strdup("onlymodified");
        valueQuery_onlymodified = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_onlymodified, MAX_NUMBER_LENGTH, "%d", *onlymodified);
        keyPairQuery_onlymodified = keyValuePair_create(keyQuery_onlymodified, valueQuery_onlymodified);
        list_addElement(localVarQueryParameters,keyPairQuery_onlymodified);
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
    if(keyQuery_path){
        free(keyQuery_path);
        keyQuery_path = NULL;
    }
    if(keyPairQuery_path){
        keyValuePair_free(keyPairQuery_path);
        keyPairQuery_path = NULL;
    }
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
    if(keyQuery_cmd){
        free(keyQuery_cmd);
        keyQuery_cmd = NULL;
    }
    if(keyPairQuery_cmd){
        keyValuePair_free(keyPairQuery_cmd);
        keyPairQuery_cmd = NULL;
    }

}

char*
SlingAPI_postTruststore(apiClient_t *apiClient, char *:operation, char *newPassword, char *rePassword, char *keyStoreType, char *removeAlias, binary_t* certificate)
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
    char *localVarPath = strdup("/libs/granite/security/post/truststore");





    // query parameters
    char *keyQuery_:operation = NULL;
    char * valueQuery_:operation = NULL;
    keyValuePair_t *keyPairQuery_:operation = 0;
    if (:operation)
    {
        keyQuery_:operation = strdup(":operation");
        valueQuery_:operation = strdup((:operation));
        keyPairQuery_:operation = keyValuePair_create(keyQuery_:operation, valueQuery_:operation);
        list_addElement(localVarQueryParameters,keyPairQuery_:operation);
    }

    // query parameters
    char *keyQuery_newPassword = NULL;
    char * valueQuery_newPassword = NULL;
    keyValuePair_t *keyPairQuery_newPassword = 0;
    if (newPassword)
    {
        keyQuery_newPassword = strdup("newPassword");
        valueQuery_newPassword = strdup((newPassword));
        keyPairQuery_newPassword = keyValuePair_create(keyQuery_newPassword, valueQuery_newPassword);
        list_addElement(localVarQueryParameters,keyPairQuery_newPassword);
    }

    // query parameters
    char *keyQuery_rePassword = NULL;
    char * valueQuery_rePassword = NULL;
    keyValuePair_t *keyPairQuery_rePassword = 0;
    if (rePassword)
    {
        keyQuery_rePassword = strdup("rePassword");
        valueQuery_rePassword = strdup((rePassword));
        keyPairQuery_rePassword = keyValuePair_create(keyQuery_rePassword, valueQuery_rePassword);
        list_addElement(localVarQueryParameters,keyPairQuery_rePassword);
    }

    // query parameters
    char *keyQuery_keyStoreType = NULL;
    char * valueQuery_keyStoreType = NULL;
    keyValuePair_t *keyPairQuery_keyStoreType = 0;
    if (keyStoreType)
    {
        keyQuery_keyStoreType = strdup("keyStoreType");
        valueQuery_keyStoreType = strdup((keyStoreType));
        keyPairQuery_keyStoreType = keyValuePair_create(keyQuery_keyStoreType, valueQuery_keyStoreType);
        list_addElement(localVarQueryParameters,keyPairQuery_keyStoreType);
    }

    // query parameters
    char *keyQuery_removeAlias = NULL;
    char * valueQuery_removeAlias = NULL;
    keyValuePair_t *keyPairQuery_removeAlias = 0;
    if (removeAlias)
    {
        keyQuery_removeAlias = strdup("removeAlias");
        valueQuery_removeAlias = strdup((removeAlias));
        keyPairQuery_removeAlias = keyValuePair_create(keyQuery_removeAlias, valueQuery_removeAlias);
        list_addElement(localVarQueryParameters,keyPairQuery_removeAlias);
    }

    // form parameters
    char *keyForm_certificate = NULL;
    binary_t* valueForm_certificate = 0;
    keyValuePair_t *keyPairForm_certificate = 0;
    if (certificate != NULL)
    {
        keyForm_certificate = strdup("certificate");
        valueForm_certificate = certificate;
        keyPairForm_certificate = keyValuePair_create(keyForm_certificate, &valueForm_certificate);
        list_addElement(localVarFormParameters,keyPairForm_certificate); //file adding
    }
    list_addElement(localVarHeaderType,"text/plain"); //produces
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
    if(keyQuery_:operation){
        free(keyQuery_:operation);
        keyQuery_:operation = NULL;
    }
    if(valueQuery_:operation){
        free(valueQuery_:operation);
        valueQuery_:operation = NULL;
    }
    if(keyPairQuery_:operation){
        keyValuePair_free(keyPairQuery_:operation);
        keyPairQuery_:operation = NULL;
    }
    if(keyQuery_newPassword){
        free(keyQuery_newPassword);
        keyQuery_newPassword = NULL;
    }
    if(valueQuery_newPassword){
        free(valueQuery_newPassword);
        valueQuery_newPassword = NULL;
    }
    if(keyPairQuery_newPassword){
        keyValuePair_free(keyPairQuery_newPassword);
        keyPairQuery_newPassword = NULL;
    }
    if(keyQuery_rePassword){
        free(keyQuery_rePassword);
        keyQuery_rePassword = NULL;
    }
    if(valueQuery_rePassword){
        free(valueQuery_rePassword);
        valueQuery_rePassword = NULL;
    }
    if(keyPairQuery_rePassword){
        keyValuePair_free(keyPairQuery_rePassword);
        keyPairQuery_rePassword = NULL;
    }
    if(keyQuery_keyStoreType){
        free(keyQuery_keyStoreType);
        keyQuery_keyStoreType = NULL;
    }
    if(valueQuery_keyStoreType){
        free(valueQuery_keyStoreType);
        valueQuery_keyStoreType = NULL;
    }
    if(keyPairQuery_keyStoreType){
        keyValuePair_free(keyPairQuery_keyStoreType);
        keyPairQuery_keyStoreType = NULL;
    }
    if(keyQuery_removeAlias){
        free(keyQuery_removeAlias);
        keyQuery_removeAlias = NULL;
    }
    if(valueQuery_removeAlias){
        free(valueQuery_removeAlias);
        valueQuery_removeAlias = NULL;
    }
    if(keyPairQuery_removeAlias){
        keyValuePair_free(keyPairQuery_removeAlias);
        keyPairQuery_removeAlias = NULL;
    }
    if (keyForm_certificate) {
        free(keyForm_certificate);
        keyForm_certificate = NULL;
    }
//    free(fileVar_certificate->data);
//    free(fileVar_certificate);
    free(keyPairForm_certificate);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

char*
SlingAPI_postTruststorePKCS12(apiClient_t *apiClient, binary_t* truststore.p12)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_createList();
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/etc/truststore");





    // form parameters
    char *keyForm_truststore.p12 = NULL;
    binary_t* valueForm_truststore.p12 = 0;
    keyValuePair_t *keyPairForm_truststore.p12 = 0;
    if (truststore.p12 != NULL)
    {
        keyForm_truststore.p12 = strdup("truststore.p12");
        valueForm_truststore.p12 = truststore.p12;
        keyPairForm_truststore.p12 = keyValuePair_create(keyForm_truststore.p12, &valueForm_truststore.p12);
        list_addElement(localVarFormParameters,keyPairForm_truststore.p12); //file adding
    }
    list_addElement(localVarHeaderType,"text/plain"); //produces
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
    
    
    list_freeList(localVarFormParameters);
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (keyForm_truststore.p12) {
        free(keyForm_truststore.p12);
        keyForm_truststore.p12 = NULL;
    }
//    free(fileVar_truststore.p12->data);
//    free(fileVar_truststore.p12);
    free(keyPairForm_truststore.p12);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}


#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "GraniteAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


char*
GraniteAPI_sslSetup(apiClient_t *apiClient, char *keystorePassword, char *keystorePasswordConfirm, char *truststorePassword, char *truststorePasswordConfirm, char *httpsHostname, char *httpsPort, binary_t* privatekeyFile, binary_t* certificateFile)
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
    char *localVarPath = strdup("/libs/granite/security/post/sslSetup.html");





    // query parameters
    char *keyQuery_keystorePassword = NULL;
    char * valueQuery_keystorePassword = NULL;
    keyValuePair_t *keyPairQuery_keystorePassword = 0;
    if (keystorePassword)
    {
        keyQuery_keystorePassword = strdup("keystorePassword");
        valueQuery_keystorePassword = strdup((keystorePassword));
        keyPairQuery_keystorePassword = keyValuePair_create(keyQuery_keystorePassword, valueQuery_keystorePassword);
        list_addElement(localVarQueryParameters,keyPairQuery_keystorePassword);
    }

    // query parameters
    char *keyQuery_keystorePasswordConfirm = NULL;
    char * valueQuery_keystorePasswordConfirm = NULL;
    keyValuePair_t *keyPairQuery_keystorePasswordConfirm = 0;
    if (keystorePasswordConfirm)
    {
        keyQuery_keystorePasswordConfirm = strdup("keystorePasswordConfirm");
        valueQuery_keystorePasswordConfirm = strdup((keystorePasswordConfirm));
        keyPairQuery_keystorePasswordConfirm = keyValuePair_create(keyQuery_keystorePasswordConfirm, valueQuery_keystorePasswordConfirm);
        list_addElement(localVarQueryParameters,keyPairQuery_keystorePasswordConfirm);
    }

    // query parameters
    char *keyQuery_truststorePassword = NULL;
    char * valueQuery_truststorePassword = NULL;
    keyValuePair_t *keyPairQuery_truststorePassword = 0;
    if (truststorePassword)
    {
        keyQuery_truststorePassword = strdup("truststorePassword");
        valueQuery_truststorePassword = strdup((truststorePassword));
        keyPairQuery_truststorePassword = keyValuePair_create(keyQuery_truststorePassword, valueQuery_truststorePassword);
        list_addElement(localVarQueryParameters,keyPairQuery_truststorePassword);
    }

    // query parameters
    char *keyQuery_truststorePasswordConfirm = NULL;
    char * valueQuery_truststorePasswordConfirm = NULL;
    keyValuePair_t *keyPairQuery_truststorePasswordConfirm = 0;
    if (truststorePasswordConfirm)
    {
        keyQuery_truststorePasswordConfirm = strdup("truststorePasswordConfirm");
        valueQuery_truststorePasswordConfirm = strdup((truststorePasswordConfirm));
        keyPairQuery_truststorePasswordConfirm = keyValuePair_create(keyQuery_truststorePasswordConfirm, valueQuery_truststorePasswordConfirm);
        list_addElement(localVarQueryParameters,keyPairQuery_truststorePasswordConfirm);
    }

    // query parameters
    char *keyQuery_httpsHostname = NULL;
    char * valueQuery_httpsHostname = NULL;
    keyValuePair_t *keyPairQuery_httpsHostname = 0;
    if (httpsHostname)
    {
        keyQuery_httpsHostname = strdup("httpsHostname");
        valueQuery_httpsHostname = strdup((httpsHostname));
        keyPairQuery_httpsHostname = keyValuePair_create(keyQuery_httpsHostname, valueQuery_httpsHostname);
        list_addElement(localVarQueryParameters,keyPairQuery_httpsHostname);
    }

    // query parameters
    char *keyQuery_httpsPort = NULL;
    char * valueQuery_httpsPort = NULL;
    keyValuePair_t *keyPairQuery_httpsPort = 0;
    if (httpsPort)
    {
        keyQuery_httpsPort = strdup("httpsPort");
        valueQuery_httpsPort = strdup((httpsPort));
        keyPairQuery_httpsPort = keyValuePair_create(keyQuery_httpsPort, valueQuery_httpsPort);
        list_addElement(localVarQueryParameters,keyPairQuery_httpsPort);
    }

    // form parameters
    char *keyForm_privatekeyFile = NULL;
    binary_t* valueForm_privatekeyFile = 0;
    keyValuePair_t *keyPairForm_privatekeyFile = 0;
    if (privatekeyFile != NULL)
    {
        keyForm_privatekeyFile = strdup("privatekeyFile");
        valueForm_privatekeyFile = privatekeyFile;
        keyPairForm_privatekeyFile = keyValuePair_create(keyForm_privatekeyFile, &valueForm_privatekeyFile);
        list_addElement(localVarFormParameters,keyPairForm_privatekeyFile); //file adding
    }

    // form parameters
    char *keyForm_certificateFile = NULL;
    binary_t* valueForm_certificateFile = 0;
    keyValuePair_t *keyPairForm_certificateFile = 0;
    if (certificateFile != NULL)
    {
        keyForm_certificateFile = strdup("certificateFile");
        valueForm_certificateFile = certificateFile;
        keyPairForm_certificateFile = keyValuePair_create(keyForm_certificateFile, &valueForm_certificateFile);
        list_addElement(localVarFormParameters,keyPairForm_certificateFile); //file adding
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
    if(keyQuery_keystorePassword){
        free(keyQuery_keystorePassword);
        keyQuery_keystorePassword = NULL;
    }
    if(valueQuery_keystorePassword){
        free(valueQuery_keystorePassword);
        valueQuery_keystorePassword = NULL;
    }
    if(keyPairQuery_keystorePassword){
        keyValuePair_free(keyPairQuery_keystorePassword);
        keyPairQuery_keystorePassword = NULL;
    }
    if(keyQuery_keystorePasswordConfirm){
        free(keyQuery_keystorePasswordConfirm);
        keyQuery_keystorePasswordConfirm = NULL;
    }
    if(valueQuery_keystorePasswordConfirm){
        free(valueQuery_keystorePasswordConfirm);
        valueQuery_keystorePasswordConfirm = NULL;
    }
    if(keyPairQuery_keystorePasswordConfirm){
        keyValuePair_free(keyPairQuery_keystorePasswordConfirm);
        keyPairQuery_keystorePasswordConfirm = NULL;
    }
    if(keyQuery_truststorePassword){
        free(keyQuery_truststorePassword);
        keyQuery_truststorePassword = NULL;
    }
    if(valueQuery_truststorePassword){
        free(valueQuery_truststorePassword);
        valueQuery_truststorePassword = NULL;
    }
    if(keyPairQuery_truststorePassword){
        keyValuePair_free(keyPairQuery_truststorePassword);
        keyPairQuery_truststorePassword = NULL;
    }
    if(keyQuery_truststorePasswordConfirm){
        free(keyQuery_truststorePasswordConfirm);
        keyQuery_truststorePasswordConfirm = NULL;
    }
    if(valueQuery_truststorePasswordConfirm){
        free(valueQuery_truststorePasswordConfirm);
        valueQuery_truststorePasswordConfirm = NULL;
    }
    if(keyPairQuery_truststorePasswordConfirm){
        keyValuePair_free(keyPairQuery_truststorePasswordConfirm);
        keyPairQuery_truststorePasswordConfirm = NULL;
    }
    if(keyQuery_httpsHostname){
        free(keyQuery_httpsHostname);
        keyQuery_httpsHostname = NULL;
    }
    if(valueQuery_httpsHostname){
        free(valueQuery_httpsHostname);
        valueQuery_httpsHostname = NULL;
    }
    if(keyPairQuery_httpsHostname){
        keyValuePair_free(keyPairQuery_httpsHostname);
        keyPairQuery_httpsHostname = NULL;
    }
    if(keyQuery_httpsPort){
        free(keyQuery_httpsPort);
        keyQuery_httpsPort = NULL;
    }
    if(valueQuery_httpsPort){
        free(valueQuery_httpsPort);
        valueQuery_httpsPort = NULL;
    }
    if(keyPairQuery_httpsPort){
        keyValuePair_free(keyPairQuery_httpsPort);
        keyPairQuery_httpsPort = NULL;
    }
    if (keyForm_privatekeyFile) {
        free(keyForm_privatekeyFile);
        keyForm_privatekeyFile = NULL;
    }
//    free(fileVar_privatekeyFile->data);
//    free(fileVar_privatekeyFile);
    free(keyPairForm_privatekeyFile);
    if (keyForm_certificateFile) {
        free(keyForm_certificateFile);
        keyForm_certificateFile = NULL;
    }
//    free(fileVar_certificateFile->data);
//    free(fileVar_certificateFile);
    free(keyPairForm_certificateFile);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}


#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/install_status.h"


char*
CrxAPI_getCrxdeStatus(apiClient_t *apiClient);


install_status_t*
CrxAPI_getInstallStatus(apiClient_t *apiClient);


void
CrxAPI_getPackageManagerServlet(apiClient_t *apiClient);


char*
CrxAPI_postPackageService(apiClient_t *apiClient, char *cmd);


char*
CrxAPI_postPackageServiceJson(apiClient_t *apiClient, char *path, char *cmd, char *groupName, char *packageName, char *packageVersion, char *_charset_, int *force, int *recursive, binary_t* package);


char*
CrxAPI_postPackageUpdate(apiClient_t *apiClient, char *groupName, char *packageName, char *version, char *path, char *filter, char *_charset_);


char*
CrxAPI_postSetPassword(apiClient_t *apiClient, char *old, char *plain, char *verify);



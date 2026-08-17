#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"


char*
CqAPI_getLoginPage(apiClient_t *apiClient);


void
CqAPI_postCqActions(apiClient_t *apiClient, char *authorizableId, char *changelog);



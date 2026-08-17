#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"


char*
GraniteAPI_sslSetup(apiClient_t *apiClient, char *keystorePassword, char *keystorePasswordConfirm, char *truststorePassword, char *truststorePasswordConfirm, char *httpsHostname, char *httpsPort, binary_t* privatekeyFile, binary_t* certificateFile);



#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/bundle_info.h"
#include "../model/saml_configuration_info.h"


list_t*
ConsoleAPI_getAemProductInfo(apiClient_t *apiClient);


bundle_info_t*
ConsoleAPI_getBundleInfo(apiClient_t *apiClient, char *name);


char*
ConsoleAPI_getConfigMgr(apiClient_t *apiClient);


void
ConsoleAPI_postBundle(apiClient_t *apiClient, char *name, char *action);


void
ConsoleAPI_postJmxRepository(apiClient_t *apiClient, char *action);


saml_configuration_info_t*
ConsoleAPI_postSamlConfiguration(apiClient_t *apiClient, int *post, int *apply, int *_delete, char *action, char *$location, list_t *path, int *service.ranking, char *idpUrl, char *idpCertAlias, int *idpHttpRedirect, char *serviceProviderEntityId, char *assertionConsumerServiceURL, char *spPrivateKeyAlias, char *keyStorePassword, char *defaultRedirectUrl, char *userIDAttribute, int *useEncryption, int *createUser, int *addGroupMemberships, char *groupMembershipAttribute, list_t *defaultGroups, char *nameIdFormat, list_t *synchronizeAttributes, int *handleLogout, char *logoutUrl, int *clockTolerance, char *digestMethod, char *signatureMethod, char *userIntermediatePath, list_t *propertylist);



/*
 * saml_configuration_info.h
 *
 * 
 */

#ifndef _saml_configuration_info_H_
#define _saml_configuration_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct saml_configuration_info_t saml_configuration_info_t;

#include "saml_configuration_properties.h"



typedef struct saml_configuration_info_t {
    char *pid; // string
    char *title; // string
    char *description; // string
    char *bundle_location; // string
    char *service_location; // string
    struct saml_configuration_properties_t *properties; //model

    int _library_owned; // Is the library responsible for freeing this object?
} saml_configuration_info_t;

__attribute__((deprecated)) saml_configuration_info_t *saml_configuration_info_create(
    char *pid,
    char *title,
    char *description,
    char *bundle_location,
    char *service_location,
    saml_configuration_properties_t *properties
);

void saml_configuration_info_free(saml_configuration_info_t *saml_configuration_info);

saml_configuration_info_t *saml_configuration_info_parseFromJSON(cJSON *saml_configuration_infoJSON);

cJSON *saml_configuration_info_convertToJSON(saml_configuration_info_t *saml_configuration_info);

#endif /* _saml_configuration_info_H_ */


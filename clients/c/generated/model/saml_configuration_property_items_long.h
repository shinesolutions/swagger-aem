/*
 * saml_configuration_property_items_long.h
 *
 * 
 */

#ifndef _saml_configuration_property_items_long_H_
#define _saml_configuration_property_items_long_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct saml_configuration_property_items_long_t saml_configuration_property_items_long_t;




typedef struct saml_configuration_property_items_long_t {
    char *name; // string
    int *optional; //boolean
    int *is_set; //boolean
    int *type; //numeric
    int *value; //numeric
    char *description; // string

    int _library_owned; // Is the library responsible for freeing this object?
} saml_configuration_property_items_long_t;

__attribute__((deprecated)) saml_configuration_property_items_long_t *saml_configuration_property_items_long_create(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    int *value,
    char *description
);

void saml_configuration_property_items_long_free(saml_configuration_property_items_long_t *saml_configuration_property_items_long);

saml_configuration_property_items_long_t *saml_configuration_property_items_long_parseFromJSON(cJSON *saml_configuration_property_items_longJSON);

cJSON *saml_configuration_property_items_long_convertToJSON(saml_configuration_property_items_long_t *saml_configuration_property_items_long);

#endif /* _saml_configuration_property_items_long_H_ */


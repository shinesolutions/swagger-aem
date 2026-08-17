/*
 * saml_configuration_property_items_boolean.h
 *
 * 
 */

#ifndef _saml_configuration_property_items_boolean_H_
#define _saml_configuration_property_items_boolean_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct saml_configuration_property_items_boolean_t saml_configuration_property_items_boolean_t;




typedef struct saml_configuration_property_items_boolean_t {
    char *name; // string
    int *optional; //boolean
    int *is_set; //boolean
    int *type; //numeric
    int *value; //boolean
    char *description; // string

    int _library_owned; // Is the library responsible for freeing this object?
} saml_configuration_property_items_boolean_t;

__attribute__((deprecated)) saml_configuration_property_items_boolean_t *saml_configuration_property_items_boolean_create(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    int *value,
    char *description
);

void saml_configuration_property_items_boolean_free(saml_configuration_property_items_boolean_t *saml_configuration_property_items_boolean);

saml_configuration_property_items_boolean_t *saml_configuration_property_items_boolean_parseFromJSON(cJSON *saml_configuration_property_items_booleanJSON);

cJSON *saml_configuration_property_items_boolean_convertToJSON(saml_configuration_property_items_boolean_t *saml_configuration_property_items_boolean);

#endif /* _saml_configuration_property_items_boolean_H_ */


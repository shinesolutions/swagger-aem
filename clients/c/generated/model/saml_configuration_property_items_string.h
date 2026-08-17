/*
 * saml_configuration_property_items_string.h
 *
 * 
 */

#ifndef _saml_configuration_property_items_string_H_
#define _saml_configuration_property_items_string_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct saml_configuration_property_items_string_t saml_configuration_property_items_string_t;




typedef struct saml_configuration_property_items_string_t {
    char *name; // string
    int *optional; //boolean
    int *is_set; //boolean
    int *type; //numeric
    char *value; // string
    char *description; // string

    int _library_owned; // Is the library responsible for freeing this object?
} saml_configuration_property_items_string_t;

__attribute__((deprecated)) saml_configuration_property_items_string_t *saml_configuration_property_items_string_create(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    char *value,
    char *description
);

void saml_configuration_property_items_string_free(saml_configuration_property_items_string_t *saml_configuration_property_items_string);

saml_configuration_property_items_string_t *saml_configuration_property_items_string_parseFromJSON(cJSON *saml_configuration_property_items_stringJSON);

cJSON *saml_configuration_property_items_string_convertToJSON(saml_configuration_property_items_string_t *saml_configuration_property_items_string);

#endif /* _saml_configuration_property_items_string_H_ */


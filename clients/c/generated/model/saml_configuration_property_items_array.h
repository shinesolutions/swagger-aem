/*
 * saml_configuration_property_items_array.h
 *
 * 
 */

#ifndef _saml_configuration_property_items_array_H_
#define _saml_configuration_property_items_array_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct saml_configuration_property_items_array_t saml_configuration_property_items_array_t;




typedef struct saml_configuration_property_items_array_t {
    char *name; // string
    int *optional; //boolean
    int *is_set; //boolean
    int *type; //numeric
    list_t *values; //primitive container
    char *description; // string

    int _library_owned; // Is the library responsible for freeing this object?
} saml_configuration_property_items_array_t;

__attribute__((deprecated)) saml_configuration_property_items_array_t *saml_configuration_property_items_array_create(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    list_t *values,
    char *description
);

void saml_configuration_property_items_array_free(saml_configuration_property_items_array_t *saml_configuration_property_items_array);

saml_configuration_property_items_array_t *saml_configuration_property_items_array_parseFromJSON(cJSON *saml_configuration_property_items_arrayJSON);

cJSON *saml_configuration_property_items_array_convertToJSON(saml_configuration_property_items_array_t *saml_configuration_property_items_array);

#endif /* _saml_configuration_property_items_array_H_ */


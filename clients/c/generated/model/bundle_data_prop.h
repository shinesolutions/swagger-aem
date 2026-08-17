/*
 * bundle_data_prop.h
 *
 * 
 */

#ifndef _bundle_data_prop_H_
#define _bundle_data_prop_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bundle_data_prop_t bundle_data_prop_t;




typedef struct bundle_data_prop_t {
    char *key; // string
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} bundle_data_prop_t;

__attribute__((deprecated)) bundle_data_prop_t *bundle_data_prop_create(
    char *key,
    char *value
);

void bundle_data_prop_free(bundle_data_prop_t *bundle_data_prop);

bundle_data_prop_t *bundle_data_prop_parseFromJSON(cJSON *bundle_data_propJSON);

cJSON *bundle_data_prop_convertToJSON(bundle_data_prop_t *bundle_data_prop);

#endif /* _bundle_data_prop_H_ */


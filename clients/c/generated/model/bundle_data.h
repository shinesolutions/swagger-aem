/*
 * bundle_data.h
 *
 * 
 */

#ifndef _bundle_data_H_
#define _bundle_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bundle_data_t bundle_data_t;

#include "bundle_data_prop.h"



typedef struct bundle_data_t {
    int *id; //numeric
    char *name; // string
    int *fragment; //boolean
    int *state_raw; //numeric
    char *state; // string
    char *version; // string
    char *symbolic_name; // string
    char *category; // string
    list_t *props; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} bundle_data_t;

__attribute__((deprecated)) bundle_data_t *bundle_data_create(
    int *id,
    char *name,
    int *fragment,
    int *state_raw,
    char *state,
    char *version,
    char *symbolic_name,
    char *category,
    list_t *props
);

void bundle_data_free(bundle_data_t *bundle_data);

bundle_data_t *bundle_data_parseFromJSON(cJSON *bundle_dataJSON);

cJSON *bundle_data_convertToJSON(bundle_data_t *bundle_data);

#endif /* _bundle_data_H_ */


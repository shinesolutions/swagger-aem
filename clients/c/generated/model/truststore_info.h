/*
 * truststore_info.h
 *
 * 
 */

#ifndef _truststore_info_H_
#define _truststore_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct truststore_info_t truststore_info_t;

#include "truststore_items.h"



typedef struct truststore_info_t {
    list_t *aliases; //nonprimitive container
    int *exists; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} truststore_info_t;

__attribute__((deprecated)) truststore_info_t *truststore_info_create(
    list_t *aliases,
    int *exists
);

void truststore_info_free(truststore_info_t *truststore_info);

truststore_info_t *truststore_info_parseFromJSON(cJSON *truststore_infoJSON);

cJSON *truststore_info_convertToJSON(truststore_info_t *truststore_info);

#endif /* _truststore_info_H_ */


/*
 * bundle_info.h
 *
 * 
 */

#ifndef _bundle_info_H_
#define _bundle_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bundle_info_t bundle_info_t;

#include "bundle_data.h"



typedef struct bundle_info_t {
    char *status; // string
    list_t *s; //primitive container
    list_t *data; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} bundle_info_t;

__attribute__((deprecated)) bundle_info_t *bundle_info_create(
    char *status,
    list_t *s,
    list_t *data
);

void bundle_info_free(bundle_info_t *bundle_info);

bundle_info_t *bundle_info_parseFromJSON(cJSON *bundle_infoJSON);

cJSON *bundle_info_convertToJSON(bundle_info_t *bundle_info);

#endif /* _bundle_info_H_ */


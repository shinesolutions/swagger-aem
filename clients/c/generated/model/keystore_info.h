/*
 * keystore_info.h
 *
 * 
 */

#ifndef _keystore_info_H_
#define _keystore_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keystore_info_t keystore_info_t;

#include "keystore_items.h"



typedef struct keystore_info_t {
    list_t *aliases; //nonprimitive container
    int *exists; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} keystore_info_t;

__attribute__((deprecated)) keystore_info_t *keystore_info_create(
    list_t *aliases,
    int *exists
);

void keystore_info_free(keystore_info_t *keystore_info);

keystore_info_t *keystore_info_parseFromJSON(cJSON *keystore_infoJSON);

cJSON *keystore_info_convertToJSON(keystore_info_t *keystore_info);

#endif /* _keystore_info_H_ */


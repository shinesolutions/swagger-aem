/*
 * keystore_items.h
 *
 * 
 */

#ifndef _keystore_items_H_
#define _keystore_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keystore_items_t keystore_items_t;

#include "keystore_chain_items.h"



typedef struct keystore_items_t {
    char *alias; // string
    char *entry_type; // string
    char *algorithm; // string
    char *format; // string
    list_t *chain; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} keystore_items_t;

__attribute__((deprecated)) keystore_items_t *keystore_items_create(
    char *alias,
    char *entry_type,
    char *algorithm,
    char *format,
    list_t *chain
);

void keystore_items_free(keystore_items_t *keystore_items);

keystore_items_t *keystore_items_parseFromJSON(cJSON *keystore_itemsJSON);

cJSON *keystore_items_convertToJSON(keystore_items_t *keystore_items);

#endif /* _keystore_items_H_ */


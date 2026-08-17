/*
 * keystore_chain_items.h
 *
 * 
 */

#ifndef _keystore_chain_items_H_
#define _keystore_chain_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keystore_chain_items_t keystore_chain_items_t;




typedef struct keystore_chain_items_t {
    char *subject; // string
    char *issuer; // string
    char *not_before; // string
    char *not_after; // string
    int *serial_number; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} keystore_chain_items_t;

__attribute__((deprecated)) keystore_chain_items_t *keystore_chain_items_create(
    char *subject,
    char *issuer,
    char *not_before,
    char *not_after,
    int *serial_number
);

void keystore_chain_items_free(keystore_chain_items_t *keystore_chain_items);

keystore_chain_items_t *keystore_chain_items_parseFromJSON(cJSON *keystore_chain_itemsJSON);

cJSON *keystore_chain_items_convertToJSON(keystore_chain_items_t *keystore_chain_items);

#endif /* _keystore_chain_items_H_ */


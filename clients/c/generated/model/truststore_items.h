/*
 * truststore_items.h
 *
 * 
 */

#ifndef _truststore_items_H_
#define _truststore_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct truststore_items_t truststore_items_t;




typedef struct truststore_items_t {
    char *alias; // string
    char *entry_type; // string
    char *subject; // string
    char *issuer; // string
    char *not_before; // string
    char *not_after; // string
    int *serial_number; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} truststore_items_t;

__attribute__((deprecated)) truststore_items_t *truststore_items_create(
    char *alias,
    char *entry_type,
    char *subject,
    char *issuer,
    char *not_before,
    char *not_after,
    int *serial_number
);

void truststore_items_free(truststore_items_t *truststore_items);

truststore_items_t *truststore_items_parseFromJSON(cJSON *truststore_itemsJSON);

cJSON *truststore_items_convertToJSON(truststore_items_t *truststore_items);

#endif /* _truststore_items_H_ */


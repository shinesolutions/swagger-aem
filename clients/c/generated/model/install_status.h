/*
 * install_status.h
 *
 * 
 */

#ifndef _install_status_H_
#define _install_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct install_status_t install_status_t;

#include "install_status_status.h"



typedef struct install_status_t {
    struct install_status_status_t *status; //model

    int _library_owned; // Is the library responsible for freeing this object?
} install_status_t;

__attribute__((deprecated)) install_status_t *install_status_create(
    install_status_status_t *status
);

void install_status_free(install_status_t *install_status);

install_status_t *install_status_parseFromJSON(cJSON *install_statusJSON);

cJSON *install_status_convertToJSON(install_status_t *install_status);

#endif /* _install_status_H_ */


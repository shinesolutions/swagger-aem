#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "install_status.h"



static install_status_t *install_status_create_internal(
    install_status_status_t *status
    ) {
    install_status_t *install_status_local_var = malloc(sizeof(install_status_t));
    if (!install_status_local_var) {
        return NULL;
    }
    memset(install_status_local_var, 0, sizeof(install_status_t));
    install_status_local_var->_library_owned = 1;
    install_status_local_var->status = status;
    return install_status_local_var;
}

__attribute__((deprecated)) install_status_t *install_status_create(
    install_status_status_t *status
    ) {
    install_status_t *result = install_status_create_internal (
        status
        );
    if (!result) {
    }
    return result;
}

void install_status_free(install_status_t *install_status) {
    if(NULL == install_status){
        return ;
    }
    if(install_status->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "install_status_free");
        return ;
    }
    listEntry_t *listEntry;
    if (install_status->status) {
        install_status_status_free(install_status->status);
        install_status->status = NULL;
    }
    free(install_status);
}

cJSON *install_status_convertToJSON(install_status_t *install_status) {
    cJSON *item = cJSON_CreateObject();

    // install_status->status
    if(install_status->status) {
    cJSON *status_local_JSON = install_status_status_convertToJSON(install_status->status);
    if(status_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

install_status_t *install_status_parseFromJSON(cJSON *install_statusJSON){

    install_status_t *install_status_local_var = NULL;

    // define the local variable for install_status->status
    install_status_status_t *status_local_nonprim = NULL;

    // install_status->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(install_statusJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = install_status_status_parseFromJSON(status); //nonprimitive
    }



    install_status_local_var = install_status_create_internal (
        status ? status_local_nonprim : NULL
        );

    if (!install_status_local_var) {
        goto end;
    }

    return install_status_local_var;
end:
    if (status_local_nonprim) {
        install_status_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}

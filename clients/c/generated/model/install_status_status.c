#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "install_status_status.h"



static install_status_status_t *install_status_status_create_internal(
    int *finished,
    int *item_count
    ) {
    install_status_status_t *install_status_status_local_var = malloc(sizeof(install_status_status_t));
    if (!install_status_status_local_var) {
        return NULL;
    }
    memset(install_status_status_local_var, 0, sizeof(install_status_status_t));
    install_status_status_local_var->_library_owned = 1;
    install_status_status_local_var->finished = finished;
    install_status_status_local_var->item_count = item_count;
    return install_status_status_local_var;
}

__attribute__((deprecated)) install_status_status_t *install_status_status_create(
    int *finished,
    int *item_count
    ) {
    int *finished_copy = NULL;
    if (finished) {
        finished_copy = malloc(sizeof(int));
        if (finished_copy) *finished_copy = *finished;
    }
    int *item_count_copy = NULL;
    if (item_count) {
        item_count_copy = malloc(sizeof(int));
        if (item_count_copy) *item_count_copy = *item_count;
    }
    install_status_status_t *result = install_status_status_create_internal (
        finished_copy,
        item_count_copy
        );
    if (!result) {
        free(finished_copy);
        free(item_count_copy);
    }
    return result;
}

void install_status_status_free(install_status_status_t *install_status_status) {
    if(NULL == install_status_status){
        return ;
    }
    if(install_status_status->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "install_status_status_free");
        return ;
    }
    listEntry_t *listEntry;
    if (install_status_status->finished) {
        free(install_status_status->finished);
        install_status_status->finished = NULL;
    }
    if (install_status_status->item_count) {
        free(install_status_status->item_count);
        install_status_status->item_count = NULL;
    }
    free(install_status_status);
}

cJSON *install_status_status_convertToJSON(install_status_status_t *install_status_status) {
    cJSON *item = cJSON_CreateObject();

    // install_status_status->finished
    if(install_status_status->finished) {
    if(cJSON_AddBoolToObject(item, "finished", *install_status_status->finished) == NULL) {
    goto fail; //Bool
    }
    }


    // install_status_status->item_count
    if(install_status_status->item_count) {
    if(cJSON_AddNumberToObject(item, "itemCount", *install_status_status->item_count) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

install_status_status_t *install_status_status_parseFromJSON(cJSON *install_status_statusJSON){

    install_status_status_t *install_status_status_local_var = NULL;

    // define the local variable for install_status_status->finished
    int *finished_local_var = NULL;

    // define the local variable for install_status_status->item_count
    int *item_count_local_var = NULL;

    // install_status_status->finished
    cJSON *finished = cJSON_GetObjectItemCaseSensitive(install_status_statusJSON, "finished");
    if (cJSON_IsNull(finished)) {
        finished = NULL;
    }
    if (finished) { 
    if(!cJSON_IsBool(finished))
    {
    goto end; //Bool
    }
    finished_local_var = malloc(sizeof(int));
    if(!finished_local_var)
    {
        goto end;
    }
    *finished_local_var = finished->valueint;
    }

    // install_status_status->item_count
    cJSON *item_count = cJSON_GetObjectItemCaseSensitive(install_status_statusJSON, "itemCount");
    if (cJSON_IsNull(item_count)) {
        item_count = NULL;
    }
    if (item_count) { 
    if(!cJSON_IsNumber(item_count))
    {
    goto end; //Numeric
    }
    item_count_local_var = malloc(sizeof(int));
    if(!item_count_local_var)
    {
        goto end;
    }
    *item_count_local_var = item_count->valuedouble;
    }



    install_status_status_local_var = install_status_status_create_internal (
        finished_local_var,
        item_count_local_var
        );

    if (!install_status_status_local_var) {
        goto end;
    }

    return install_status_status_local_var;
end:
    if (finished_local_var) {
        free(finished_local_var);
        finished_local_var = NULL;
    }
    if (item_count_local_var) {
        free(item_count_local_var);
        item_count_local_var = NULL;
    }
    return NULL;

}

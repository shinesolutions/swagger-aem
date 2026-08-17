#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "truststore_info.h"



static truststore_info_t *truststore_info_create_internal(
    list_t *aliases,
    int *exists
    ) {
    truststore_info_t *truststore_info_local_var = malloc(sizeof(truststore_info_t));
    if (!truststore_info_local_var) {
        return NULL;
    }
    memset(truststore_info_local_var, 0, sizeof(truststore_info_t));
    truststore_info_local_var->_library_owned = 1;
    truststore_info_local_var->aliases = aliases;
    truststore_info_local_var->exists = exists;
    return truststore_info_local_var;
}

__attribute__((deprecated)) truststore_info_t *truststore_info_create(
    list_t *aliases,
    int *exists
    ) {
    int *exists_copy = NULL;
    if (exists) {
        exists_copy = malloc(sizeof(int));
        if (exists_copy) *exists_copy = *exists;
    }
    truststore_info_t *result = truststore_info_create_internal (
        aliases,
        exists_copy
        );
    if (!result) {
        free(exists_copy);
    }
    return result;
}

void truststore_info_free(truststore_info_t *truststore_info) {
    if(NULL == truststore_info){
        return ;
    }
    if(truststore_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "truststore_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (truststore_info->aliases) {
        list_ForEach(listEntry, truststore_info->aliases) {
            truststore_items_free(listEntry->data);
        }
        list_freeList(truststore_info->aliases);
        truststore_info->aliases = NULL;
    }
    if (truststore_info->exists) {
        free(truststore_info->exists);
        truststore_info->exists = NULL;
    }
    free(truststore_info);
}

cJSON *truststore_info_convertToJSON(truststore_info_t *truststore_info) {
    cJSON *item = cJSON_CreateObject();

    // truststore_info->aliases
    if(truststore_info->aliases) {
    cJSON *aliases = cJSON_AddArrayToObject(item, "aliases");
    if(aliases == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *aliasesListEntry;
    if (truststore_info->aliases) {
    list_ForEach(aliasesListEntry, truststore_info->aliases) {
    cJSON *itemLocal = truststore_items_convertToJSON(aliasesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(aliases, itemLocal);
    }
    }
    }


    // truststore_info->exists
    if(truststore_info->exists) {
    if(cJSON_AddBoolToObject(item, "exists", *truststore_info->exists) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

truststore_info_t *truststore_info_parseFromJSON(cJSON *truststore_infoJSON){

    truststore_info_t *truststore_info_local_var = NULL;

    // define the local list for truststore_info->aliases
    list_t *aliasesList = NULL;

    // define the local variable for truststore_info->exists
    int *exists_local_var = NULL;

    // truststore_info->aliases
    cJSON *aliases = cJSON_GetObjectItemCaseSensitive(truststore_infoJSON, "aliases");
    if (cJSON_IsNull(aliases)) {
        aliases = NULL;
    }
    if (aliases) { 
    cJSON *aliases_local_nonprimitive = NULL;
    if(!cJSON_IsArray(aliases)){
        goto end; //nonprimitive container
    }

    aliasesList = list_createList();

    cJSON_ArrayForEach(aliases_local_nonprimitive,aliases )
    {
        if(!cJSON_IsObject(aliases_local_nonprimitive)){
            goto end;
        }
        truststore_items_t *aliasesItem = truststore_items_parseFromJSON(aliases_local_nonprimitive);

        list_addElement(aliasesList, aliasesItem);
    }
    }

    // truststore_info->exists
    cJSON *exists = cJSON_GetObjectItemCaseSensitive(truststore_infoJSON, "exists");
    if (cJSON_IsNull(exists)) {
        exists = NULL;
    }
    if (exists) { 
    if(!cJSON_IsBool(exists))
    {
    goto end; //Bool
    }
    exists_local_var = malloc(sizeof(int));
    if(!exists_local_var)
    {
        goto end;
    }
    *exists_local_var = exists->valueint;
    }



    truststore_info_local_var = truststore_info_create_internal (
        aliases ? aliasesList : NULL,
        exists_local_var
        );

    if (!truststore_info_local_var) {
        goto end;
    }

    return truststore_info_local_var;
end:
    if (aliasesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, aliasesList) {
            truststore_items_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(aliasesList);
        aliasesList = NULL;
    }
    if (exists_local_var) {
        free(exists_local_var);
        exists_local_var = NULL;
    }
    return NULL;

}

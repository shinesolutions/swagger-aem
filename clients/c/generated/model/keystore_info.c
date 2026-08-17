#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keystore_info.h"



static keystore_info_t *keystore_info_create_internal(
    list_t *aliases,
    int *exists
    ) {
    keystore_info_t *keystore_info_local_var = malloc(sizeof(keystore_info_t));
    if (!keystore_info_local_var) {
        return NULL;
    }
    memset(keystore_info_local_var, 0, sizeof(keystore_info_t));
    keystore_info_local_var->_library_owned = 1;
    keystore_info_local_var->aliases = aliases;
    keystore_info_local_var->exists = exists;
    return keystore_info_local_var;
}

__attribute__((deprecated)) keystore_info_t *keystore_info_create(
    list_t *aliases,
    int *exists
    ) {
    int *exists_copy = NULL;
    if (exists) {
        exists_copy = malloc(sizeof(int));
        if (exists_copy) *exists_copy = *exists;
    }
    keystore_info_t *result = keystore_info_create_internal (
        aliases,
        exists_copy
        );
    if (!result) {
        free(exists_copy);
    }
    return result;
}

void keystore_info_free(keystore_info_t *keystore_info) {
    if(NULL == keystore_info){
        return ;
    }
    if(keystore_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "keystore_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (keystore_info->aliases) {
        list_ForEach(listEntry, keystore_info->aliases) {
            keystore_items_free(listEntry->data);
        }
        list_freeList(keystore_info->aliases);
        keystore_info->aliases = NULL;
    }
    if (keystore_info->exists) {
        free(keystore_info->exists);
        keystore_info->exists = NULL;
    }
    free(keystore_info);
}

cJSON *keystore_info_convertToJSON(keystore_info_t *keystore_info) {
    cJSON *item = cJSON_CreateObject();

    // keystore_info->aliases
    if(keystore_info->aliases) {
    cJSON *aliases = cJSON_AddArrayToObject(item, "aliases");
    if(aliases == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *aliasesListEntry;
    if (keystore_info->aliases) {
    list_ForEach(aliasesListEntry, keystore_info->aliases) {
    cJSON *itemLocal = keystore_items_convertToJSON(aliasesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(aliases, itemLocal);
    }
    }
    }


    // keystore_info->exists
    if(keystore_info->exists) {
    if(cJSON_AddBoolToObject(item, "exists", *keystore_info->exists) == NULL) {
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

keystore_info_t *keystore_info_parseFromJSON(cJSON *keystore_infoJSON){

    keystore_info_t *keystore_info_local_var = NULL;

    // define the local list for keystore_info->aliases
    list_t *aliasesList = NULL;

    // define the local variable for keystore_info->exists
    int *exists_local_var = NULL;

    // keystore_info->aliases
    cJSON *aliases = cJSON_GetObjectItemCaseSensitive(keystore_infoJSON, "aliases");
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
        keystore_items_t *aliasesItem = keystore_items_parseFromJSON(aliases_local_nonprimitive);

        list_addElement(aliasesList, aliasesItem);
    }
    }

    // keystore_info->exists
    cJSON *exists = cJSON_GetObjectItemCaseSensitive(keystore_infoJSON, "exists");
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



    keystore_info_local_var = keystore_info_create_internal (
        aliases ? aliasesList : NULL,
        exists_local_var
        );

    if (!keystore_info_local_var) {
        goto end;
    }

    return keystore_info_local_var;
end:
    if (aliasesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, aliasesList) {
            keystore_items_free(listEntry->data);
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

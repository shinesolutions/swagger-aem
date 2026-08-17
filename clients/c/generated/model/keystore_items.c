#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keystore_items.h"



static keystore_items_t *keystore_items_create_internal(
    char *alias,
    char *entry_type,
    char *algorithm,
    char *format,
    list_t *chain
    ) {
    keystore_items_t *keystore_items_local_var = malloc(sizeof(keystore_items_t));
    if (!keystore_items_local_var) {
        return NULL;
    }
    memset(keystore_items_local_var, 0, sizeof(keystore_items_t));
    keystore_items_local_var->_library_owned = 1;
    keystore_items_local_var->alias = alias;
    keystore_items_local_var->entry_type = entry_type;
    keystore_items_local_var->algorithm = algorithm;
    keystore_items_local_var->format = format;
    keystore_items_local_var->chain = chain;
    return keystore_items_local_var;
}

__attribute__((deprecated)) keystore_items_t *keystore_items_create(
    char *alias,
    char *entry_type,
    char *algorithm,
    char *format,
    list_t *chain
    ) {
    keystore_items_t *result = keystore_items_create_internal (
        alias,
        entry_type,
        algorithm,
        format,
        chain
        );
    if (!result) {
    }
    return result;
}

void keystore_items_free(keystore_items_t *keystore_items) {
    if(NULL == keystore_items){
        return ;
    }
    if(keystore_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "keystore_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (keystore_items->alias) {
        free(keystore_items->alias);
        keystore_items->alias = NULL;
    }
    if (keystore_items->entry_type) {
        free(keystore_items->entry_type);
        keystore_items->entry_type = NULL;
    }
    if (keystore_items->algorithm) {
        free(keystore_items->algorithm);
        keystore_items->algorithm = NULL;
    }
    if (keystore_items->format) {
        free(keystore_items->format);
        keystore_items->format = NULL;
    }
    if (keystore_items->chain) {
        list_ForEach(listEntry, keystore_items->chain) {
            keystore_chain_items_free(listEntry->data);
        }
        list_freeList(keystore_items->chain);
        keystore_items->chain = NULL;
    }
    free(keystore_items);
}

cJSON *keystore_items_convertToJSON(keystore_items_t *keystore_items) {
    cJSON *item = cJSON_CreateObject();

    // keystore_items->alias
    if(keystore_items->alias) {
    if(cJSON_AddStringToObject(item, "alias", keystore_items->alias) == NULL) {
    goto fail; //String
    }
    }


    // keystore_items->entry_type
    if(keystore_items->entry_type) {
    if(cJSON_AddStringToObject(item, "entryType", keystore_items->entry_type) == NULL) {
    goto fail; //String
    }
    }


    // keystore_items->algorithm
    if(keystore_items->algorithm) {
    if(cJSON_AddStringToObject(item, "algorithm", keystore_items->algorithm) == NULL) {
    goto fail; //String
    }
    }


    // keystore_items->format
    if(keystore_items->format) {
    if(cJSON_AddStringToObject(item, "format", keystore_items->format) == NULL) {
    goto fail; //String
    }
    }


    // keystore_items->chain
    if(keystore_items->chain) {
    cJSON *chain = cJSON_AddArrayToObject(item, "chain");
    if(chain == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *chainListEntry;
    if (keystore_items->chain) {
    list_ForEach(chainListEntry, keystore_items->chain) {
    cJSON *itemLocal = keystore_chain_items_convertToJSON(chainListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(chain, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

keystore_items_t *keystore_items_parseFromJSON(cJSON *keystore_itemsJSON){

    keystore_items_t *keystore_items_local_var = NULL;

    char *alias_local_str = NULL;

    char *entry_type_local_str = NULL;

    char *algorithm_local_str = NULL;

    char *format_local_str = NULL;

    // define the local list for keystore_items->chain
    list_t *chainList = NULL;

    // keystore_items->alias
    cJSON *alias = cJSON_GetObjectItemCaseSensitive(keystore_itemsJSON, "alias");
    if (cJSON_IsNull(alias)) {
        alias = NULL;
    }
    if (alias) { 
    if(!cJSON_IsString(alias) && !cJSON_IsNull(alias))
    {
    goto end; //String
    }
    }

    // keystore_items->entry_type
    cJSON *entry_type = cJSON_GetObjectItemCaseSensitive(keystore_itemsJSON, "entryType");
    if (cJSON_IsNull(entry_type)) {
        entry_type = NULL;
    }
    if (entry_type) { 
    if(!cJSON_IsString(entry_type) && !cJSON_IsNull(entry_type))
    {
    goto end; //String
    }
    }

    // keystore_items->algorithm
    cJSON *algorithm = cJSON_GetObjectItemCaseSensitive(keystore_itemsJSON, "algorithm");
    if (cJSON_IsNull(algorithm)) {
        algorithm = NULL;
    }
    if (algorithm) { 
    if(!cJSON_IsString(algorithm) && !cJSON_IsNull(algorithm))
    {
    goto end; //String
    }
    }

    // keystore_items->format
    cJSON *format = cJSON_GetObjectItemCaseSensitive(keystore_itemsJSON, "format");
    if (cJSON_IsNull(format)) {
        format = NULL;
    }
    if (format) { 
    if(!cJSON_IsString(format) && !cJSON_IsNull(format))
    {
    goto end; //String
    }
    }

    // keystore_items->chain
    cJSON *chain = cJSON_GetObjectItemCaseSensitive(keystore_itemsJSON, "chain");
    if (cJSON_IsNull(chain)) {
        chain = NULL;
    }
    if (chain) { 
    cJSON *chain_local_nonprimitive = NULL;
    if(!cJSON_IsArray(chain)){
        goto end; //nonprimitive container
    }

    chainList = list_createList();

    cJSON_ArrayForEach(chain_local_nonprimitive,chain )
    {
        if(!cJSON_IsObject(chain_local_nonprimitive)){
            goto end;
        }
        keystore_chain_items_t *chainItem = keystore_chain_items_parseFromJSON(chain_local_nonprimitive);

        list_addElement(chainList, chainItem);
    }
    }


    if (alias && !cJSON_IsNull(alias)) alias_local_str = strdup(alias->valuestring);
    if (entry_type && !cJSON_IsNull(entry_type)) entry_type_local_str = strdup(entry_type->valuestring);
    if (algorithm && !cJSON_IsNull(algorithm)) algorithm_local_str = strdup(algorithm->valuestring);
    if (format && !cJSON_IsNull(format)) format_local_str = strdup(format->valuestring);

    keystore_items_local_var = keystore_items_create_internal (
        alias_local_str,
        entry_type_local_str,
        algorithm_local_str,
        format_local_str,
        chain ? chainList : NULL
        );

    if (!keystore_items_local_var) {
        goto end;
    }

    return keystore_items_local_var;
end:
    if (alias_local_str) {
        free(alias_local_str);
        alias_local_str = NULL;
    }
    if (entry_type_local_str) {
        free(entry_type_local_str);
        entry_type_local_str = NULL;
    }
    if (algorithm_local_str) {
        free(algorithm_local_str);
        algorithm_local_str = NULL;
    }
    if (format_local_str) {
        free(format_local_str);
        format_local_str = NULL;
    }
    if (chainList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, chainList) {
            keystore_chain_items_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(chainList);
        chainList = NULL;
    }
    return NULL;

}

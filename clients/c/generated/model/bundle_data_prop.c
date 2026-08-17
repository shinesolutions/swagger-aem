#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bundle_data_prop.h"



static bundle_data_prop_t *bundle_data_prop_create_internal(
    char *key,
    char *value
    ) {
    bundle_data_prop_t *bundle_data_prop_local_var = malloc(sizeof(bundle_data_prop_t));
    if (!bundle_data_prop_local_var) {
        return NULL;
    }
    memset(bundle_data_prop_local_var, 0, sizeof(bundle_data_prop_t));
    bundle_data_prop_local_var->_library_owned = 1;
    bundle_data_prop_local_var->key = key;
    bundle_data_prop_local_var->value = value;
    return bundle_data_prop_local_var;
}

__attribute__((deprecated)) bundle_data_prop_t *bundle_data_prop_create(
    char *key,
    char *value
    ) {
    bundle_data_prop_t *result = bundle_data_prop_create_internal (
        key,
        value
        );
    if (!result) {
    }
    return result;
}

void bundle_data_prop_free(bundle_data_prop_t *bundle_data_prop) {
    if(NULL == bundle_data_prop){
        return ;
    }
    if(bundle_data_prop->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bundle_data_prop_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bundle_data_prop->key) {
        free(bundle_data_prop->key);
        bundle_data_prop->key = NULL;
    }
    if (bundle_data_prop->value) {
        free(bundle_data_prop->value);
        bundle_data_prop->value = NULL;
    }
    free(bundle_data_prop);
}

cJSON *bundle_data_prop_convertToJSON(bundle_data_prop_t *bundle_data_prop) {
    cJSON *item = cJSON_CreateObject();

    // bundle_data_prop->key
    if(bundle_data_prop->key) {
    if(cJSON_AddStringToObject(item, "key", bundle_data_prop->key) == NULL) {
    goto fail; //String
    }
    }


    // bundle_data_prop->value
    if(bundle_data_prop->value) {
    if(cJSON_AddStringToObject(item, "value", bundle_data_prop->value) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

bundle_data_prop_t *bundle_data_prop_parseFromJSON(cJSON *bundle_data_propJSON){

    bundle_data_prop_t *bundle_data_prop_local_var = NULL;

    char *key_local_str = NULL;

    char *value_local_str = NULL;

    // bundle_data_prop->key
    cJSON *key = cJSON_GetObjectItemCaseSensitive(bundle_data_propJSON, "key");
    if (cJSON_IsNull(key)) {
        key = NULL;
    }
    if (key) { 
    if(!cJSON_IsString(key) && !cJSON_IsNull(key))
    {
    goto end; //String
    }
    }

    // bundle_data_prop->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(bundle_data_propJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }


    if (key && !cJSON_IsNull(key)) key_local_str = strdup(key->valuestring);
    if (value && !cJSON_IsNull(value)) value_local_str = strdup(value->valuestring);

    bundle_data_prop_local_var = bundle_data_prop_create_internal (
        key_local_str,
        value_local_str
        );

    if (!bundle_data_prop_local_var) {
        goto end;
    }

    return bundle_data_prop_local_var;
end:
    if (key_local_str) {
        free(key_local_str);
        key_local_str = NULL;
    }
    if (value_local_str) {
        free(value_local_str);
        value_local_str = NULL;
    }
    return NULL;

}

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bundle_data.h"



static bundle_data_t *bundle_data_create_internal(
    int *id,
    char *name,
    int *fragment,
    int *state_raw,
    char *state,
    char *version,
    char *symbolic_name,
    char *category,
    list_t *props
    ) {
    bundle_data_t *bundle_data_local_var = malloc(sizeof(bundle_data_t));
    if (!bundle_data_local_var) {
        return NULL;
    }
    memset(bundle_data_local_var, 0, sizeof(bundle_data_t));
    bundle_data_local_var->_library_owned = 1;
    bundle_data_local_var->id = id;
    bundle_data_local_var->name = name;
    bundle_data_local_var->fragment = fragment;
    bundle_data_local_var->state_raw = state_raw;
    bundle_data_local_var->state = state;
    bundle_data_local_var->version = version;
    bundle_data_local_var->symbolic_name = symbolic_name;
    bundle_data_local_var->category = category;
    bundle_data_local_var->props = props;
    return bundle_data_local_var;
}

__attribute__((deprecated)) bundle_data_t *bundle_data_create(
    int *id,
    char *name,
    int *fragment,
    int *state_raw,
    char *state,
    char *version,
    char *symbolic_name,
    char *category,
    list_t *props
    ) {
    int *id_copy = NULL;
    if (id) {
        id_copy = malloc(sizeof(int));
        if (id_copy) *id_copy = *id;
    }
    int *fragment_copy = NULL;
    if (fragment) {
        fragment_copy = malloc(sizeof(int));
        if (fragment_copy) *fragment_copy = *fragment;
    }
    int *state_raw_copy = NULL;
    if (state_raw) {
        state_raw_copy = malloc(sizeof(int));
        if (state_raw_copy) *state_raw_copy = *state_raw;
    }
    bundle_data_t *result = bundle_data_create_internal (
        id_copy,
        name,
        fragment_copy,
        state_raw_copy,
        state,
        version,
        symbolic_name,
        category,
        props
        );
    if (!result) {
        free(id_copy);
        free(fragment_copy);
        free(state_raw_copy);
    }
    return result;
}

void bundle_data_free(bundle_data_t *bundle_data) {
    if(NULL == bundle_data){
        return ;
    }
    if(bundle_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bundle_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bundle_data->id) {
        free(bundle_data->id);
        bundle_data->id = NULL;
    }
    if (bundle_data->name) {
        free(bundle_data->name);
        bundle_data->name = NULL;
    }
    if (bundle_data->fragment) {
        free(bundle_data->fragment);
        bundle_data->fragment = NULL;
    }
    if (bundle_data->state_raw) {
        free(bundle_data->state_raw);
        bundle_data->state_raw = NULL;
    }
    if (bundle_data->state) {
        free(bundle_data->state);
        bundle_data->state = NULL;
    }
    if (bundle_data->version) {
        free(bundle_data->version);
        bundle_data->version = NULL;
    }
    if (bundle_data->symbolic_name) {
        free(bundle_data->symbolic_name);
        bundle_data->symbolic_name = NULL;
    }
    if (bundle_data->category) {
        free(bundle_data->category);
        bundle_data->category = NULL;
    }
    if (bundle_data->props) {
        list_ForEach(listEntry, bundle_data->props) {
            bundle_data_prop_free(listEntry->data);
        }
        list_freeList(bundle_data->props);
        bundle_data->props = NULL;
    }
    free(bundle_data);
}

cJSON *bundle_data_convertToJSON(bundle_data_t *bundle_data) {
    cJSON *item = cJSON_CreateObject();

    // bundle_data->id
    if(bundle_data->id) {
    if(cJSON_AddNumberToObject(item, "id", *bundle_data->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // bundle_data->name
    if(bundle_data->name) {
    if(cJSON_AddStringToObject(item, "name", bundle_data->name) == NULL) {
    goto fail; //String
    }
    }


    // bundle_data->fragment
    if(bundle_data->fragment) {
    if(cJSON_AddBoolToObject(item, "fragment", *bundle_data->fragment) == NULL) {
    goto fail; //Bool
    }
    }


    // bundle_data->state_raw
    if(bundle_data->state_raw) {
    if(cJSON_AddNumberToObject(item, "stateRaw", *bundle_data->state_raw) == NULL) {
    goto fail; //Numeric
    }
    }


    // bundle_data->state
    if(bundle_data->state) {
    if(cJSON_AddStringToObject(item, "state", bundle_data->state) == NULL) {
    goto fail; //String
    }
    }


    // bundle_data->version
    if(bundle_data->version) {
    if(cJSON_AddStringToObject(item, "version", bundle_data->version) == NULL) {
    goto fail; //String
    }
    }


    // bundle_data->symbolic_name
    if(bundle_data->symbolic_name) {
    if(cJSON_AddStringToObject(item, "symbolicName", bundle_data->symbolic_name) == NULL) {
    goto fail; //String
    }
    }


    // bundle_data->category
    if(bundle_data->category) {
    if(cJSON_AddStringToObject(item, "category", bundle_data->category) == NULL) {
    goto fail; //String
    }
    }


    // bundle_data->props
    if(bundle_data->props) {
    cJSON *props = cJSON_AddArrayToObject(item, "props");
    if(props == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *propsListEntry;
    if (bundle_data->props) {
    list_ForEach(propsListEntry, bundle_data->props) {
    cJSON *itemLocal = bundle_data_prop_convertToJSON(propsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(props, itemLocal);
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

bundle_data_t *bundle_data_parseFromJSON(cJSON *bundle_dataJSON){

    bundle_data_t *bundle_data_local_var = NULL;

    // define the local variable for bundle_data->id
    int *id_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for bundle_data->fragment
    int *fragment_local_var = NULL;

    // define the local variable for bundle_data->state_raw
    int *state_raw_local_var = NULL;

    char *state_local_str = NULL;

    char *version_local_str = NULL;

    char *symbolic_name_local_str = NULL;

    char *category_local_str = NULL;

    // define the local list for bundle_data->props
    list_t *propsList = NULL;

    // bundle_data->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(bundle_dataJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    id_local_var = malloc(sizeof(int));
    if(!id_local_var)
    {
        goto end;
    }
    *id_local_var = id->valuedouble;
    }

    // bundle_data->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(bundle_dataJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // bundle_data->fragment
    cJSON *fragment = cJSON_GetObjectItemCaseSensitive(bundle_dataJSON, "fragment");
    if (cJSON_IsNull(fragment)) {
        fragment = NULL;
    }
    if (fragment) { 
    if(!cJSON_IsBool(fragment))
    {
    goto end; //Bool
    }
    fragment_local_var = malloc(sizeof(int));
    if(!fragment_local_var)
    {
        goto end;
    }
    *fragment_local_var = fragment->valueint;
    }

    // bundle_data->state_raw
    cJSON *state_raw = cJSON_GetObjectItemCaseSensitive(bundle_dataJSON, "stateRaw");
    if (cJSON_IsNull(state_raw)) {
        state_raw = NULL;
    }
    if (state_raw) { 
    if(!cJSON_IsNumber(state_raw))
    {
    goto end; //Numeric
    }
    state_raw_local_var = malloc(sizeof(int));
    if(!state_raw_local_var)
    {
        goto end;
    }
    *state_raw_local_var = state_raw->valuedouble;
    }

    // bundle_data->state
    cJSON *state = cJSON_GetObjectItemCaseSensitive(bundle_dataJSON, "state");
    if (cJSON_IsNull(state)) {
        state = NULL;
    }
    if (state) { 
    if(!cJSON_IsString(state) && !cJSON_IsNull(state))
    {
    goto end; //String
    }
    }

    // bundle_data->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(bundle_dataJSON, "version");
    if (cJSON_IsNull(version)) {
        version = NULL;
    }
    if (version) { 
    if(!cJSON_IsString(version) && !cJSON_IsNull(version))
    {
    goto end; //String
    }
    }

    // bundle_data->symbolic_name
    cJSON *symbolic_name = cJSON_GetObjectItemCaseSensitive(bundle_dataJSON, "symbolicName");
    if (cJSON_IsNull(symbolic_name)) {
        symbolic_name = NULL;
    }
    if (symbolic_name) { 
    if(!cJSON_IsString(symbolic_name) && !cJSON_IsNull(symbolic_name))
    {
    goto end; //String
    }
    }

    // bundle_data->category
    cJSON *category = cJSON_GetObjectItemCaseSensitive(bundle_dataJSON, "category");
    if (cJSON_IsNull(category)) {
        category = NULL;
    }
    if (category) { 
    if(!cJSON_IsString(category) && !cJSON_IsNull(category))
    {
    goto end; //String
    }
    }

    // bundle_data->props
    cJSON *props = cJSON_GetObjectItemCaseSensitive(bundle_dataJSON, "props");
    if (cJSON_IsNull(props)) {
        props = NULL;
    }
    if (props) { 
    cJSON *props_local_nonprimitive = NULL;
    if(!cJSON_IsArray(props)){
        goto end; //nonprimitive container
    }

    propsList = list_createList();

    cJSON_ArrayForEach(props_local_nonprimitive,props )
    {
        if(!cJSON_IsObject(props_local_nonprimitive)){
            goto end;
        }
        bundle_data_prop_t *propsItem = bundle_data_prop_parseFromJSON(props_local_nonprimitive);

        list_addElement(propsList, propsItem);
    }
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (state && !cJSON_IsNull(state)) state_local_str = strdup(state->valuestring);
    if (version && !cJSON_IsNull(version)) version_local_str = strdup(version->valuestring);
    if (symbolic_name && !cJSON_IsNull(symbolic_name)) symbolic_name_local_str = strdup(symbolic_name->valuestring);
    if (category && !cJSON_IsNull(category)) category_local_str = strdup(category->valuestring);

    bundle_data_local_var = bundle_data_create_internal (
        id_local_var,
        name_local_str,
        fragment_local_var,
        state_raw_local_var,
        state_local_str,
        version_local_str,
        symbolic_name_local_str,
        category_local_str,
        props ? propsList : NULL
        );

    if (!bundle_data_local_var) {
        goto end;
    }

    return bundle_data_local_var;
end:
    if (id_local_var) {
        free(id_local_var);
        id_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (fragment_local_var) {
        free(fragment_local_var);
        fragment_local_var = NULL;
    }
    if (state_raw_local_var) {
        free(state_raw_local_var);
        state_raw_local_var = NULL;
    }
    if (state_local_str) {
        free(state_local_str);
        state_local_str = NULL;
    }
    if (version_local_str) {
        free(version_local_str);
        version_local_str = NULL;
    }
    if (symbolic_name_local_str) {
        free(symbolic_name_local_str);
        symbolic_name_local_str = NULL;
    }
    if (category_local_str) {
        free(category_local_str);
        category_local_str = NULL;
    }
    if (propsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, propsList) {
            bundle_data_prop_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(propsList);
        propsList = NULL;
    }
    return NULL;

}

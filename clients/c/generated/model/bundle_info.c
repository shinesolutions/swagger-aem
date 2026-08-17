#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bundle_info.h"



static bundle_info_t *bundle_info_create_internal(
    char *status,
    list_t *s,
    list_t *data
    ) {
    bundle_info_t *bundle_info_local_var = malloc(sizeof(bundle_info_t));
    if (!bundle_info_local_var) {
        return NULL;
    }
    memset(bundle_info_local_var, 0, sizeof(bundle_info_t));
    bundle_info_local_var->_library_owned = 1;
    bundle_info_local_var->status = status;
    bundle_info_local_var->s = s;
    bundle_info_local_var->data = data;
    return bundle_info_local_var;
}

__attribute__((deprecated)) bundle_info_t *bundle_info_create(
    char *status,
    list_t *s,
    list_t *data
    ) {
    bundle_info_t *result = bundle_info_create_internal (
        status,
        s,
        data
        );
    if (!result) {
    }
    return result;
}

void bundle_info_free(bundle_info_t *bundle_info) {
    if(NULL == bundle_info){
        return ;
    }
    if(bundle_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bundle_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bundle_info->status) {
        free(bundle_info->status);
        bundle_info->status = NULL;
    }
    if (bundle_info->s) {
        list_ForEach(listEntry, bundle_info->s) {
            free(listEntry->data);
        }
        list_freeList(bundle_info->s);
        bundle_info->s = NULL;
    }
    if (bundle_info->data) {
        list_ForEach(listEntry, bundle_info->data) {
            bundle_data_free(listEntry->data);
        }
        list_freeList(bundle_info->data);
        bundle_info->data = NULL;
    }
    free(bundle_info);
}

cJSON *bundle_info_convertToJSON(bundle_info_t *bundle_info) {
    cJSON *item = cJSON_CreateObject();

    // bundle_info->status
    if(bundle_info->status) {
    if(cJSON_AddStringToObject(item, "status", bundle_info->status) == NULL) {
    goto fail; //String
    }
    }


    // bundle_info->s
    if(bundle_info->s) {
    cJSON *s = cJSON_AddArrayToObject(item, "s");
    if(s == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *sListEntry;
    list_ForEach(sListEntry, bundle_info->s) {
    if(cJSON_AddNumberToObject(s, "", *(double *)sListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // bundle_info->data
    if(bundle_info->data) {
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (bundle_info->data) {
    list_ForEach(dataListEntry, bundle_info->data) {
    cJSON *itemLocal = bundle_data_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
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

bundle_info_t *bundle_info_parseFromJSON(cJSON *bundle_infoJSON){

    bundle_info_t *bundle_info_local_var = NULL;

    char *status_local_str = NULL;

    // define the local list for bundle_info->s
    list_t *sList = NULL;

    // define the local list for bundle_info->data
    list_t *dataList = NULL;

    // bundle_info->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(bundle_infoJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    if(!cJSON_IsString(status) && !cJSON_IsNull(status))
    {
    goto end; //String
    }
    }

    // bundle_info->s
    cJSON *s = cJSON_GetObjectItemCaseSensitive(bundle_infoJSON, "s");
    if (cJSON_IsNull(s)) {
        s = NULL;
    }
    if (s) { 
    cJSON *s_local = NULL;
    if(!cJSON_IsArray(s)) {
        goto end;//primitive container
    }
    sList = list_createList();

    cJSON_ArrayForEach(s_local, s)
    {
        if(!cJSON_IsNumber(s_local))
        {
            goto end;
        }
        double *s_local_value = calloc(1, sizeof(double));
        if(!s_local_value)
        {
            goto end;
        }
        *s_local_value = s_local->valuedouble;
        list_addElement(sList , s_local_value);
    }
    }

    // bundle_info->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(bundle_infoJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
    cJSON *data_local_nonprimitive = NULL;
    if(!cJSON_IsArray(data)){
        goto end; //nonprimitive container
    }

    dataList = list_createList();

    cJSON_ArrayForEach(data_local_nonprimitive,data )
    {
        if(!cJSON_IsObject(data_local_nonprimitive)){
            goto end;
        }
        bundle_data_t *dataItem = bundle_data_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }
    }


    if (status && !cJSON_IsNull(status)) status_local_str = strdup(status->valuestring);

    bundle_info_local_var = bundle_info_create_internal (
        status_local_str,
        s ? sList : NULL,
        data ? dataList : NULL
        );

    if (!bundle_info_local_var) {
        goto end;
    }

    return bundle_info_local_var;
end:
    if (status_local_str) {
        free(status_local_str);
        status_local_str = NULL;
    }
    if (sList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, sList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(sList);
        sList = NULL;
    }
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            bundle_data_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}

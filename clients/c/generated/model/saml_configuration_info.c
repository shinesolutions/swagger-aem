#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "saml_configuration_info.h"



static saml_configuration_info_t *saml_configuration_info_create_internal(
    char *pid,
    char *title,
    char *description,
    char *bundle_location,
    char *service_location,
    saml_configuration_properties_t *properties
    ) {
    saml_configuration_info_t *saml_configuration_info_local_var = malloc(sizeof(saml_configuration_info_t));
    if (!saml_configuration_info_local_var) {
        return NULL;
    }
    memset(saml_configuration_info_local_var, 0, sizeof(saml_configuration_info_t));
    saml_configuration_info_local_var->_library_owned = 1;
    saml_configuration_info_local_var->pid = pid;
    saml_configuration_info_local_var->title = title;
    saml_configuration_info_local_var->description = description;
    saml_configuration_info_local_var->bundle_location = bundle_location;
    saml_configuration_info_local_var->service_location = service_location;
    saml_configuration_info_local_var->properties = properties;
    return saml_configuration_info_local_var;
}

__attribute__((deprecated)) saml_configuration_info_t *saml_configuration_info_create(
    char *pid,
    char *title,
    char *description,
    char *bundle_location,
    char *service_location,
    saml_configuration_properties_t *properties
    ) {
    saml_configuration_info_t *result = saml_configuration_info_create_internal (
        pid,
        title,
        description,
        bundle_location,
        service_location,
        properties
        );
    if (!result) {
    }
    return result;
}

void saml_configuration_info_free(saml_configuration_info_t *saml_configuration_info) {
    if(NULL == saml_configuration_info){
        return ;
    }
    if(saml_configuration_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "saml_configuration_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (saml_configuration_info->pid) {
        free(saml_configuration_info->pid);
        saml_configuration_info->pid = NULL;
    }
    if (saml_configuration_info->title) {
        free(saml_configuration_info->title);
        saml_configuration_info->title = NULL;
    }
    if (saml_configuration_info->description) {
        free(saml_configuration_info->description);
        saml_configuration_info->description = NULL;
    }
    if (saml_configuration_info->bundle_location) {
        free(saml_configuration_info->bundle_location);
        saml_configuration_info->bundle_location = NULL;
    }
    if (saml_configuration_info->service_location) {
        free(saml_configuration_info->service_location);
        saml_configuration_info->service_location = NULL;
    }
    if (saml_configuration_info->properties) {
        saml_configuration_properties_free(saml_configuration_info->properties);
        saml_configuration_info->properties = NULL;
    }
    free(saml_configuration_info);
}

cJSON *saml_configuration_info_convertToJSON(saml_configuration_info_t *saml_configuration_info) {
    cJSON *item = cJSON_CreateObject();

    // saml_configuration_info->pid
    if(saml_configuration_info->pid) {
    if(cJSON_AddStringToObject(item, "pid", saml_configuration_info->pid) == NULL) {
    goto fail; //String
    }
    }


    // saml_configuration_info->title
    if(saml_configuration_info->title) {
    if(cJSON_AddStringToObject(item, "title", saml_configuration_info->title) == NULL) {
    goto fail; //String
    }
    }


    // saml_configuration_info->description
    if(saml_configuration_info->description) {
    if(cJSON_AddStringToObject(item, "description", saml_configuration_info->description) == NULL) {
    goto fail; //String
    }
    }


    // saml_configuration_info->bundle_location
    if(saml_configuration_info->bundle_location) {
    if(cJSON_AddStringToObject(item, "bundle_location", saml_configuration_info->bundle_location) == NULL) {
    goto fail; //String
    }
    }


    // saml_configuration_info->service_location
    if(saml_configuration_info->service_location) {
    if(cJSON_AddStringToObject(item, "service_location", saml_configuration_info->service_location) == NULL) {
    goto fail; //String
    }
    }


    // saml_configuration_info->properties
    if(saml_configuration_info->properties) {
    cJSON *properties_local_JSON = saml_configuration_properties_convertToJSON(saml_configuration_info->properties);
    if(properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "properties", properties_local_JSON);
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

saml_configuration_info_t *saml_configuration_info_parseFromJSON(cJSON *saml_configuration_infoJSON){

    saml_configuration_info_t *saml_configuration_info_local_var = NULL;

    char *pid_local_str = NULL;

    char *title_local_str = NULL;

    char *description_local_str = NULL;

    char *bundle_location_local_str = NULL;

    char *service_location_local_str = NULL;

    // define the local variable for saml_configuration_info->properties
    saml_configuration_properties_t *properties_local_nonprim = NULL;

    // saml_configuration_info->pid
    cJSON *pid = cJSON_GetObjectItemCaseSensitive(saml_configuration_infoJSON, "pid");
    if (cJSON_IsNull(pid)) {
        pid = NULL;
    }
    if (pid) { 
    if(!cJSON_IsString(pid) && !cJSON_IsNull(pid))
    {
    goto end; //String
    }
    }

    // saml_configuration_info->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(saml_configuration_infoJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // saml_configuration_info->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(saml_configuration_infoJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // saml_configuration_info->bundle_location
    cJSON *bundle_location = cJSON_GetObjectItemCaseSensitive(saml_configuration_infoJSON, "bundle_location");
    if (cJSON_IsNull(bundle_location)) {
        bundle_location = NULL;
    }
    if (bundle_location) { 
    if(!cJSON_IsString(bundle_location) && !cJSON_IsNull(bundle_location))
    {
    goto end; //String
    }
    }

    // saml_configuration_info->service_location
    cJSON *service_location = cJSON_GetObjectItemCaseSensitive(saml_configuration_infoJSON, "service_location");
    if (cJSON_IsNull(service_location)) {
        service_location = NULL;
    }
    if (service_location) { 
    if(!cJSON_IsString(service_location) && !cJSON_IsNull(service_location))
    {
    goto end; //String
    }
    }

    // saml_configuration_info->properties
    cJSON *properties = cJSON_GetObjectItemCaseSensitive(saml_configuration_infoJSON, "properties");
    if (cJSON_IsNull(properties)) {
        properties = NULL;
    }
    if (properties) { 
    properties_local_nonprim = saml_configuration_properties_parseFromJSON(properties); //nonprimitive
    }


    if (pid && !cJSON_IsNull(pid)) pid_local_str = strdup(pid->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (bundle_location && !cJSON_IsNull(bundle_location)) bundle_location_local_str = strdup(bundle_location->valuestring);
    if (service_location && !cJSON_IsNull(service_location)) service_location_local_str = strdup(service_location->valuestring);

    saml_configuration_info_local_var = saml_configuration_info_create_internal (
        pid_local_str,
        title_local_str,
        description_local_str,
        bundle_location_local_str,
        service_location_local_str,
        properties ? properties_local_nonprim : NULL
        );

    if (!saml_configuration_info_local_var) {
        goto end;
    }

    return saml_configuration_info_local_var;
end:
    if (pid_local_str) {
        free(pid_local_str);
        pid_local_str = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (bundle_location_local_str) {
        free(bundle_location_local_str);
        bundle_location_local_str = NULL;
    }
    if (service_location_local_str) {
        free(service_location_local_str);
        service_location_local_str = NULL;
    }
    if (properties_local_nonprim) {
        saml_configuration_properties_free(properties_local_nonprim);
        properties_local_nonprim = NULL;
    }
    return NULL;

}

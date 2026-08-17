#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "saml_configuration_property_items_array.h"



static saml_configuration_property_items_array_t *saml_configuration_property_items_array_create_internal(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    list_t *values,
    char *description
    ) {
    saml_configuration_property_items_array_t *saml_configuration_property_items_array_local_var = malloc(sizeof(saml_configuration_property_items_array_t));
    if (!saml_configuration_property_items_array_local_var) {
        return NULL;
    }
    memset(saml_configuration_property_items_array_local_var, 0, sizeof(saml_configuration_property_items_array_t));
    saml_configuration_property_items_array_local_var->_library_owned = 1;
    saml_configuration_property_items_array_local_var->name = name;
    saml_configuration_property_items_array_local_var->optional = optional;
    saml_configuration_property_items_array_local_var->is_set = is_set;
    saml_configuration_property_items_array_local_var->type = type;
    saml_configuration_property_items_array_local_var->values = values;
    saml_configuration_property_items_array_local_var->description = description;
    return saml_configuration_property_items_array_local_var;
}

__attribute__((deprecated)) saml_configuration_property_items_array_t *saml_configuration_property_items_array_create(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    list_t *values,
    char *description
    ) {
    int *optional_copy = NULL;
    if (optional) {
        optional_copy = malloc(sizeof(int));
        if (optional_copy) *optional_copy = *optional;
    }
    int *is_set_copy = NULL;
    if (is_set) {
        is_set_copy = malloc(sizeof(int));
        if (is_set_copy) *is_set_copy = *is_set;
    }
    int *type_copy = NULL;
    if (type) {
        type_copy = malloc(sizeof(int));
        if (type_copy) *type_copy = *type;
    }
    saml_configuration_property_items_array_t *result = saml_configuration_property_items_array_create_internal (
        name,
        optional_copy,
        is_set_copy,
        type_copy,
        values,
        description
        );
    if (!result) {
        free(optional_copy);
        free(is_set_copy);
        free(type_copy);
    }
    return result;
}

void saml_configuration_property_items_array_free(saml_configuration_property_items_array_t *saml_configuration_property_items_array) {
    if(NULL == saml_configuration_property_items_array){
        return ;
    }
    if(saml_configuration_property_items_array->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "saml_configuration_property_items_array_free");
        return ;
    }
    listEntry_t *listEntry;
    if (saml_configuration_property_items_array->name) {
        free(saml_configuration_property_items_array->name);
        saml_configuration_property_items_array->name = NULL;
    }
    if (saml_configuration_property_items_array->optional) {
        free(saml_configuration_property_items_array->optional);
        saml_configuration_property_items_array->optional = NULL;
    }
    if (saml_configuration_property_items_array->is_set) {
        free(saml_configuration_property_items_array->is_set);
        saml_configuration_property_items_array->is_set = NULL;
    }
    if (saml_configuration_property_items_array->type) {
        free(saml_configuration_property_items_array->type);
        saml_configuration_property_items_array->type = NULL;
    }
    if (saml_configuration_property_items_array->values) {
        list_ForEach(listEntry, saml_configuration_property_items_array->values) {
            free(listEntry->data);
        }
        list_freeList(saml_configuration_property_items_array->values);
        saml_configuration_property_items_array->values = NULL;
    }
    if (saml_configuration_property_items_array->description) {
        free(saml_configuration_property_items_array->description);
        saml_configuration_property_items_array->description = NULL;
    }
    free(saml_configuration_property_items_array);
}

cJSON *saml_configuration_property_items_array_convertToJSON(saml_configuration_property_items_array_t *saml_configuration_property_items_array) {
    cJSON *item = cJSON_CreateObject();

    // saml_configuration_property_items_array->name
    if(saml_configuration_property_items_array->name) {
    if(cJSON_AddStringToObject(item, "name", saml_configuration_property_items_array->name) == NULL) {
    goto fail; //String
    }
    }


    // saml_configuration_property_items_array->optional
    if(saml_configuration_property_items_array->optional) {
    if(cJSON_AddBoolToObject(item, "optional", *saml_configuration_property_items_array->optional) == NULL) {
    goto fail; //Bool
    }
    }


    // saml_configuration_property_items_array->is_set
    if(saml_configuration_property_items_array->is_set) {
    if(cJSON_AddBoolToObject(item, "is_set", *saml_configuration_property_items_array->is_set) == NULL) {
    goto fail; //Bool
    }
    }


    // saml_configuration_property_items_array->type
    if(saml_configuration_property_items_array->type) {
    if(cJSON_AddNumberToObject(item, "type", *saml_configuration_property_items_array->type) == NULL) {
    goto fail; //Numeric
    }
    }


    // saml_configuration_property_items_array->values
    if(saml_configuration_property_items_array->values) {
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *valuesListEntry;
    list_ForEach(valuesListEntry, saml_configuration_property_items_array->values) {
    if(cJSON_AddStringToObject(values, "", valuesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // saml_configuration_property_items_array->description
    if(saml_configuration_property_items_array->description) {
    if(cJSON_AddStringToObject(item, "description", saml_configuration_property_items_array->description) == NULL) {
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

saml_configuration_property_items_array_t *saml_configuration_property_items_array_parseFromJSON(cJSON *saml_configuration_property_items_arrayJSON){

    saml_configuration_property_items_array_t *saml_configuration_property_items_array_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for saml_configuration_property_items_array->optional
    int *optional_local_var = NULL;

    // define the local variable for saml_configuration_property_items_array->is_set
    int *is_set_local_var = NULL;

    // define the local variable for saml_configuration_property_items_array->type
    int *type_local_var = NULL;

    // define the local list for saml_configuration_property_items_array->values
    list_t *valuesList = NULL;

    char *description_local_str = NULL;

    // saml_configuration_property_items_array->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(saml_configuration_property_items_arrayJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // saml_configuration_property_items_array->optional
    cJSON *optional = cJSON_GetObjectItemCaseSensitive(saml_configuration_property_items_arrayJSON, "optional");
    if (cJSON_IsNull(optional)) {
        optional = NULL;
    }
    if (optional) { 
    if(!cJSON_IsBool(optional))
    {
    goto end; //Bool
    }
    optional_local_var = malloc(sizeof(int));
    if(!optional_local_var)
    {
        goto end;
    }
    *optional_local_var = optional->valueint;
    }

    // saml_configuration_property_items_array->is_set
    cJSON *is_set = cJSON_GetObjectItemCaseSensitive(saml_configuration_property_items_arrayJSON, "is_set");
    if (cJSON_IsNull(is_set)) {
        is_set = NULL;
    }
    if (is_set) { 
    if(!cJSON_IsBool(is_set))
    {
    goto end; //Bool
    }
    is_set_local_var = malloc(sizeof(int));
    if(!is_set_local_var)
    {
        goto end;
    }
    *is_set_local_var = is_set->valueint;
    }

    // saml_configuration_property_items_array->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(saml_configuration_property_items_arrayJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsNumber(type))
    {
    goto end; //Numeric
    }
    type_local_var = malloc(sizeof(int));
    if(!type_local_var)
    {
        goto end;
    }
    *type_local_var = type->valuedouble;
    }

    // saml_configuration_property_items_array->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(saml_configuration_property_items_arrayJSON, "values");
    if (cJSON_IsNull(values)) {
        values = NULL;
    }
    if (values) { 
    cJSON *values_local = NULL;
    if(!cJSON_IsArray(values)) {
        goto end;//primitive container
    }
    valuesList = list_createList();

    cJSON_ArrayForEach(values_local, values)
    {
        if(!cJSON_IsString(values_local))
        {
            goto end;
        }
        list_addElement(valuesList , strdup(values_local->valuestring));
    }
    }

    // saml_configuration_property_items_array->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(saml_configuration_property_items_arrayJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);

    saml_configuration_property_items_array_local_var = saml_configuration_property_items_array_create_internal (
        name_local_str,
        optional_local_var,
        is_set_local_var,
        type_local_var,
        values ? valuesList : NULL,
        description_local_str
        );

    if (!saml_configuration_property_items_array_local_var) {
        goto end;
    }

    return saml_configuration_property_items_array_local_var;
end:
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (optional_local_var) {
        free(optional_local_var);
        optional_local_var = NULL;
    }
    if (is_set_local_var) {
        free(is_set_local_var);
        is_set_local_var = NULL;
    }
    if (type_local_var) {
        free(type_local_var);
        type_local_var = NULL;
    }
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    return NULL;

}

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "saml_configuration_property_items_string.h"



static saml_configuration_property_items_string_t *saml_configuration_property_items_string_create_internal(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    char *value,
    char *description
    ) {
    saml_configuration_property_items_string_t *saml_configuration_property_items_string_local_var = malloc(sizeof(saml_configuration_property_items_string_t));
    if (!saml_configuration_property_items_string_local_var) {
        return NULL;
    }
    memset(saml_configuration_property_items_string_local_var, 0, sizeof(saml_configuration_property_items_string_t));
    saml_configuration_property_items_string_local_var->_library_owned = 1;
    saml_configuration_property_items_string_local_var->name = name;
    saml_configuration_property_items_string_local_var->optional = optional;
    saml_configuration_property_items_string_local_var->is_set = is_set;
    saml_configuration_property_items_string_local_var->type = type;
    saml_configuration_property_items_string_local_var->value = value;
    saml_configuration_property_items_string_local_var->description = description;
    return saml_configuration_property_items_string_local_var;
}

__attribute__((deprecated)) saml_configuration_property_items_string_t *saml_configuration_property_items_string_create(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    char *value,
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
    saml_configuration_property_items_string_t *result = saml_configuration_property_items_string_create_internal (
        name,
        optional_copy,
        is_set_copy,
        type_copy,
        value,
        description
        );
    if (!result) {
        free(optional_copy);
        free(is_set_copy);
        free(type_copy);
    }
    return result;
}

void saml_configuration_property_items_string_free(saml_configuration_property_items_string_t *saml_configuration_property_items_string) {
    if(NULL == saml_configuration_property_items_string){
        return ;
    }
    if(saml_configuration_property_items_string->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "saml_configuration_property_items_string_free");
        return ;
    }
    listEntry_t *listEntry;
    if (saml_configuration_property_items_string->name) {
        free(saml_configuration_property_items_string->name);
        saml_configuration_property_items_string->name = NULL;
    }
    if (saml_configuration_property_items_string->optional) {
        free(saml_configuration_property_items_string->optional);
        saml_configuration_property_items_string->optional = NULL;
    }
    if (saml_configuration_property_items_string->is_set) {
        free(saml_configuration_property_items_string->is_set);
        saml_configuration_property_items_string->is_set = NULL;
    }
    if (saml_configuration_property_items_string->type) {
        free(saml_configuration_property_items_string->type);
        saml_configuration_property_items_string->type = NULL;
    }
    if (saml_configuration_property_items_string->value) {
        free(saml_configuration_property_items_string->value);
        saml_configuration_property_items_string->value = NULL;
    }
    if (saml_configuration_property_items_string->description) {
        free(saml_configuration_property_items_string->description);
        saml_configuration_property_items_string->description = NULL;
    }
    free(saml_configuration_property_items_string);
}

cJSON *saml_configuration_property_items_string_convertToJSON(saml_configuration_property_items_string_t *saml_configuration_property_items_string) {
    cJSON *item = cJSON_CreateObject();

    // saml_configuration_property_items_string->name
    if(saml_configuration_property_items_string->name) {
    if(cJSON_AddStringToObject(item, "name", saml_configuration_property_items_string->name) == NULL) {
    goto fail; //String
    }
    }


    // saml_configuration_property_items_string->optional
    if(saml_configuration_property_items_string->optional) {
    if(cJSON_AddBoolToObject(item, "optional", *saml_configuration_property_items_string->optional) == NULL) {
    goto fail; //Bool
    }
    }


    // saml_configuration_property_items_string->is_set
    if(saml_configuration_property_items_string->is_set) {
    if(cJSON_AddBoolToObject(item, "is_set", *saml_configuration_property_items_string->is_set) == NULL) {
    goto fail; //Bool
    }
    }


    // saml_configuration_property_items_string->type
    if(saml_configuration_property_items_string->type) {
    if(cJSON_AddNumberToObject(item, "type", *saml_configuration_property_items_string->type) == NULL) {
    goto fail; //Numeric
    }
    }


    // saml_configuration_property_items_string->value
    if(saml_configuration_property_items_string->value) {
    if(cJSON_AddStringToObject(item, "value", saml_configuration_property_items_string->value) == NULL) {
    goto fail; //String
    }
    }


    // saml_configuration_property_items_string->description
    if(saml_configuration_property_items_string->description) {
    if(cJSON_AddStringToObject(item, "description", saml_configuration_property_items_string->description) == NULL) {
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

saml_configuration_property_items_string_t *saml_configuration_property_items_string_parseFromJSON(cJSON *saml_configuration_property_items_stringJSON){

    saml_configuration_property_items_string_t *saml_configuration_property_items_string_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for saml_configuration_property_items_string->optional
    int *optional_local_var = NULL;

    // define the local variable for saml_configuration_property_items_string->is_set
    int *is_set_local_var = NULL;

    // define the local variable for saml_configuration_property_items_string->type
    int *type_local_var = NULL;

    char *value_local_str = NULL;

    char *description_local_str = NULL;

    // saml_configuration_property_items_string->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(saml_configuration_property_items_stringJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // saml_configuration_property_items_string->optional
    cJSON *optional = cJSON_GetObjectItemCaseSensitive(saml_configuration_property_items_stringJSON, "optional");
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

    // saml_configuration_property_items_string->is_set
    cJSON *is_set = cJSON_GetObjectItemCaseSensitive(saml_configuration_property_items_stringJSON, "is_set");
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

    // saml_configuration_property_items_string->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(saml_configuration_property_items_stringJSON, "type");
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

    // saml_configuration_property_items_string->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(saml_configuration_property_items_stringJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }

    // saml_configuration_property_items_string->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(saml_configuration_property_items_stringJSON, "description");
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
    if (value && !cJSON_IsNull(value)) value_local_str = strdup(value->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);

    saml_configuration_property_items_string_local_var = saml_configuration_property_items_string_create_internal (
        name_local_str,
        optional_local_var,
        is_set_local_var,
        type_local_var,
        value_local_str,
        description_local_str
        );

    if (!saml_configuration_property_items_string_local_var) {
        goto end;
    }

    return saml_configuration_property_items_string_local_var;
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
    if (value_local_str) {
        free(value_local_str);
        value_local_str = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    return NULL;

}

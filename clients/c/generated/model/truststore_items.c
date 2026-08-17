#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "truststore_items.h"



static truststore_items_t *truststore_items_create_internal(
    char *alias,
    char *entry_type,
    char *subject,
    char *issuer,
    char *not_before,
    char *not_after,
    int *serial_number
    ) {
    truststore_items_t *truststore_items_local_var = malloc(sizeof(truststore_items_t));
    if (!truststore_items_local_var) {
        return NULL;
    }
    memset(truststore_items_local_var, 0, sizeof(truststore_items_t));
    truststore_items_local_var->_library_owned = 1;
    truststore_items_local_var->alias = alias;
    truststore_items_local_var->entry_type = entry_type;
    truststore_items_local_var->subject = subject;
    truststore_items_local_var->issuer = issuer;
    truststore_items_local_var->not_before = not_before;
    truststore_items_local_var->not_after = not_after;
    truststore_items_local_var->serial_number = serial_number;
    return truststore_items_local_var;
}

__attribute__((deprecated)) truststore_items_t *truststore_items_create(
    char *alias,
    char *entry_type,
    char *subject,
    char *issuer,
    char *not_before,
    char *not_after,
    int *serial_number
    ) {
    int *serial_number_copy = NULL;
    if (serial_number) {
        serial_number_copy = malloc(sizeof(int));
        if (serial_number_copy) *serial_number_copy = *serial_number;
    }
    truststore_items_t *result = truststore_items_create_internal (
        alias,
        entry_type,
        subject,
        issuer,
        not_before,
        not_after,
        serial_number_copy
        );
    if (!result) {
        free(serial_number_copy);
    }
    return result;
}

void truststore_items_free(truststore_items_t *truststore_items) {
    if(NULL == truststore_items){
        return ;
    }
    if(truststore_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "truststore_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (truststore_items->alias) {
        free(truststore_items->alias);
        truststore_items->alias = NULL;
    }
    if (truststore_items->entry_type) {
        free(truststore_items->entry_type);
        truststore_items->entry_type = NULL;
    }
    if (truststore_items->subject) {
        free(truststore_items->subject);
        truststore_items->subject = NULL;
    }
    if (truststore_items->issuer) {
        free(truststore_items->issuer);
        truststore_items->issuer = NULL;
    }
    if (truststore_items->not_before) {
        free(truststore_items->not_before);
        truststore_items->not_before = NULL;
    }
    if (truststore_items->not_after) {
        free(truststore_items->not_after);
        truststore_items->not_after = NULL;
    }
    if (truststore_items->serial_number) {
        free(truststore_items->serial_number);
        truststore_items->serial_number = NULL;
    }
    free(truststore_items);
}

cJSON *truststore_items_convertToJSON(truststore_items_t *truststore_items) {
    cJSON *item = cJSON_CreateObject();

    // truststore_items->alias
    if(truststore_items->alias) {
    if(cJSON_AddStringToObject(item, "alias", truststore_items->alias) == NULL) {
    goto fail; //String
    }
    }


    // truststore_items->entry_type
    if(truststore_items->entry_type) {
    if(cJSON_AddStringToObject(item, "entryType", truststore_items->entry_type) == NULL) {
    goto fail; //String
    }
    }


    // truststore_items->subject
    if(truststore_items->subject) {
    if(cJSON_AddStringToObject(item, "subject", truststore_items->subject) == NULL) {
    goto fail; //String
    }
    }


    // truststore_items->issuer
    if(truststore_items->issuer) {
    if(cJSON_AddStringToObject(item, "issuer", truststore_items->issuer) == NULL) {
    goto fail; //String
    }
    }


    // truststore_items->not_before
    if(truststore_items->not_before) {
    if(cJSON_AddStringToObject(item, "notBefore", truststore_items->not_before) == NULL) {
    goto fail; //String
    }
    }


    // truststore_items->not_after
    if(truststore_items->not_after) {
    if(cJSON_AddStringToObject(item, "notAfter", truststore_items->not_after) == NULL) {
    goto fail; //String
    }
    }


    // truststore_items->serial_number
    if(truststore_items->serial_number) {
    if(cJSON_AddNumberToObject(item, "serialNumber", *truststore_items->serial_number) == NULL) {
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

truststore_items_t *truststore_items_parseFromJSON(cJSON *truststore_itemsJSON){

    truststore_items_t *truststore_items_local_var = NULL;

    char *alias_local_str = NULL;

    char *entry_type_local_str = NULL;

    char *subject_local_str = NULL;

    char *issuer_local_str = NULL;

    char *not_before_local_str = NULL;

    char *not_after_local_str = NULL;

    // define the local variable for truststore_items->serial_number
    int *serial_number_local_var = NULL;

    // truststore_items->alias
    cJSON *alias = cJSON_GetObjectItemCaseSensitive(truststore_itemsJSON, "alias");
    if (cJSON_IsNull(alias)) {
        alias = NULL;
    }
    if (alias) { 
    if(!cJSON_IsString(alias) && !cJSON_IsNull(alias))
    {
    goto end; //String
    }
    }

    // truststore_items->entry_type
    cJSON *entry_type = cJSON_GetObjectItemCaseSensitive(truststore_itemsJSON, "entryType");
    if (cJSON_IsNull(entry_type)) {
        entry_type = NULL;
    }
    if (entry_type) { 
    if(!cJSON_IsString(entry_type) && !cJSON_IsNull(entry_type))
    {
    goto end; //String
    }
    }

    // truststore_items->subject
    cJSON *subject = cJSON_GetObjectItemCaseSensitive(truststore_itemsJSON, "subject");
    if (cJSON_IsNull(subject)) {
        subject = NULL;
    }
    if (subject) { 
    if(!cJSON_IsString(subject) && !cJSON_IsNull(subject))
    {
    goto end; //String
    }
    }

    // truststore_items->issuer
    cJSON *issuer = cJSON_GetObjectItemCaseSensitive(truststore_itemsJSON, "issuer");
    if (cJSON_IsNull(issuer)) {
        issuer = NULL;
    }
    if (issuer) { 
    if(!cJSON_IsString(issuer) && !cJSON_IsNull(issuer))
    {
    goto end; //String
    }
    }

    // truststore_items->not_before
    cJSON *not_before = cJSON_GetObjectItemCaseSensitive(truststore_itemsJSON, "notBefore");
    if (cJSON_IsNull(not_before)) {
        not_before = NULL;
    }
    if (not_before) { 
    if(!cJSON_IsString(not_before) && !cJSON_IsNull(not_before))
    {
    goto end; //String
    }
    }

    // truststore_items->not_after
    cJSON *not_after = cJSON_GetObjectItemCaseSensitive(truststore_itemsJSON, "notAfter");
    if (cJSON_IsNull(not_after)) {
        not_after = NULL;
    }
    if (not_after) { 
    if(!cJSON_IsString(not_after) && !cJSON_IsNull(not_after))
    {
    goto end; //String
    }
    }

    // truststore_items->serial_number
    cJSON *serial_number = cJSON_GetObjectItemCaseSensitive(truststore_itemsJSON, "serialNumber");
    if (cJSON_IsNull(serial_number)) {
        serial_number = NULL;
    }
    if (serial_number) { 
    if(!cJSON_IsNumber(serial_number))
    {
    goto end; //Numeric
    }
    serial_number_local_var = malloc(sizeof(int));
    if(!serial_number_local_var)
    {
        goto end;
    }
    *serial_number_local_var = serial_number->valuedouble;
    }


    if (alias && !cJSON_IsNull(alias)) alias_local_str = strdup(alias->valuestring);
    if (entry_type && !cJSON_IsNull(entry_type)) entry_type_local_str = strdup(entry_type->valuestring);
    if (subject && !cJSON_IsNull(subject)) subject_local_str = strdup(subject->valuestring);
    if (issuer && !cJSON_IsNull(issuer)) issuer_local_str = strdup(issuer->valuestring);
    if (not_before && !cJSON_IsNull(not_before)) not_before_local_str = strdup(not_before->valuestring);
    if (not_after && !cJSON_IsNull(not_after)) not_after_local_str = strdup(not_after->valuestring);

    truststore_items_local_var = truststore_items_create_internal (
        alias_local_str,
        entry_type_local_str,
        subject_local_str,
        issuer_local_str,
        not_before_local_str,
        not_after_local_str,
        serial_number_local_var
        );

    if (!truststore_items_local_var) {
        goto end;
    }

    return truststore_items_local_var;
end:
    if (alias_local_str) {
        free(alias_local_str);
        alias_local_str = NULL;
    }
    if (entry_type_local_str) {
        free(entry_type_local_str);
        entry_type_local_str = NULL;
    }
    if (subject_local_str) {
        free(subject_local_str);
        subject_local_str = NULL;
    }
    if (issuer_local_str) {
        free(issuer_local_str);
        issuer_local_str = NULL;
    }
    if (not_before_local_str) {
        free(not_before_local_str);
        not_before_local_str = NULL;
    }
    if (not_after_local_str) {
        free(not_after_local_str);
        not_after_local_str = NULL;
    }
    if (serial_number_local_var) {
        free(serial_number_local_var);
        serial_number_local_var = NULL;
    }
    return NULL;

}

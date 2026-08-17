#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keystore_chain_items.h"



static keystore_chain_items_t *keystore_chain_items_create_internal(
    char *subject,
    char *issuer,
    char *not_before,
    char *not_after,
    int *serial_number
    ) {
    keystore_chain_items_t *keystore_chain_items_local_var = malloc(sizeof(keystore_chain_items_t));
    if (!keystore_chain_items_local_var) {
        return NULL;
    }
    memset(keystore_chain_items_local_var, 0, sizeof(keystore_chain_items_t));
    keystore_chain_items_local_var->_library_owned = 1;
    keystore_chain_items_local_var->subject = subject;
    keystore_chain_items_local_var->issuer = issuer;
    keystore_chain_items_local_var->not_before = not_before;
    keystore_chain_items_local_var->not_after = not_after;
    keystore_chain_items_local_var->serial_number = serial_number;
    return keystore_chain_items_local_var;
}

__attribute__((deprecated)) keystore_chain_items_t *keystore_chain_items_create(
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
    keystore_chain_items_t *result = keystore_chain_items_create_internal (
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

void keystore_chain_items_free(keystore_chain_items_t *keystore_chain_items) {
    if(NULL == keystore_chain_items){
        return ;
    }
    if(keystore_chain_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "keystore_chain_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (keystore_chain_items->subject) {
        free(keystore_chain_items->subject);
        keystore_chain_items->subject = NULL;
    }
    if (keystore_chain_items->issuer) {
        free(keystore_chain_items->issuer);
        keystore_chain_items->issuer = NULL;
    }
    if (keystore_chain_items->not_before) {
        free(keystore_chain_items->not_before);
        keystore_chain_items->not_before = NULL;
    }
    if (keystore_chain_items->not_after) {
        free(keystore_chain_items->not_after);
        keystore_chain_items->not_after = NULL;
    }
    if (keystore_chain_items->serial_number) {
        free(keystore_chain_items->serial_number);
        keystore_chain_items->serial_number = NULL;
    }
    free(keystore_chain_items);
}

cJSON *keystore_chain_items_convertToJSON(keystore_chain_items_t *keystore_chain_items) {
    cJSON *item = cJSON_CreateObject();

    // keystore_chain_items->subject
    if(keystore_chain_items->subject) {
    if(cJSON_AddStringToObject(item, "subject", keystore_chain_items->subject) == NULL) {
    goto fail; //String
    }
    }


    // keystore_chain_items->issuer
    if(keystore_chain_items->issuer) {
    if(cJSON_AddStringToObject(item, "issuer", keystore_chain_items->issuer) == NULL) {
    goto fail; //String
    }
    }


    // keystore_chain_items->not_before
    if(keystore_chain_items->not_before) {
    if(cJSON_AddStringToObject(item, "notBefore", keystore_chain_items->not_before) == NULL) {
    goto fail; //String
    }
    }


    // keystore_chain_items->not_after
    if(keystore_chain_items->not_after) {
    if(cJSON_AddStringToObject(item, "notAfter", keystore_chain_items->not_after) == NULL) {
    goto fail; //String
    }
    }


    // keystore_chain_items->serial_number
    if(keystore_chain_items->serial_number) {
    if(cJSON_AddNumberToObject(item, "serialNumber", *keystore_chain_items->serial_number) == NULL) {
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

keystore_chain_items_t *keystore_chain_items_parseFromJSON(cJSON *keystore_chain_itemsJSON){

    keystore_chain_items_t *keystore_chain_items_local_var = NULL;

    char *subject_local_str = NULL;

    char *issuer_local_str = NULL;

    char *not_before_local_str = NULL;

    char *not_after_local_str = NULL;

    // define the local variable for keystore_chain_items->serial_number
    int *serial_number_local_var = NULL;

    // keystore_chain_items->subject
    cJSON *subject = cJSON_GetObjectItemCaseSensitive(keystore_chain_itemsJSON, "subject");
    if (cJSON_IsNull(subject)) {
        subject = NULL;
    }
    if (subject) { 
    if(!cJSON_IsString(subject) && !cJSON_IsNull(subject))
    {
    goto end; //String
    }
    }

    // keystore_chain_items->issuer
    cJSON *issuer = cJSON_GetObjectItemCaseSensitive(keystore_chain_itemsJSON, "issuer");
    if (cJSON_IsNull(issuer)) {
        issuer = NULL;
    }
    if (issuer) { 
    if(!cJSON_IsString(issuer) && !cJSON_IsNull(issuer))
    {
    goto end; //String
    }
    }

    // keystore_chain_items->not_before
    cJSON *not_before = cJSON_GetObjectItemCaseSensitive(keystore_chain_itemsJSON, "notBefore");
    if (cJSON_IsNull(not_before)) {
        not_before = NULL;
    }
    if (not_before) { 
    if(!cJSON_IsString(not_before) && !cJSON_IsNull(not_before))
    {
    goto end; //String
    }
    }

    // keystore_chain_items->not_after
    cJSON *not_after = cJSON_GetObjectItemCaseSensitive(keystore_chain_itemsJSON, "notAfter");
    if (cJSON_IsNull(not_after)) {
        not_after = NULL;
    }
    if (not_after) { 
    if(!cJSON_IsString(not_after) && !cJSON_IsNull(not_after))
    {
    goto end; //String
    }
    }

    // keystore_chain_items->serial_number
    cJSON *serial_number = cJSON_GetObjectItemCaseSensitive(keystore_chain_itemsJSON, "serialNumber");
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


    if (subject && !cJSON_IsNull(subject)) subject_local_str = strdup(subject->valuestring);
    if (issuer && !cJSON_IsNull(issuer)) issuer_local_str = strdup(issuer->valuestring);
    if (not_before && !cJSON_IsNull(not_before)) not_before_local_str = strdup(not_before->valuestring);
    if (not_after && !cJSON_IsNull(not_after)) not_after_local_str = strdup(not_after->valuestring);

    keystore_chain_items_local_var = keystore_chain_items_create_internal (
        subject_local_str,
        issuer_local_str,
        not_before_local_str,
        not_after_local_str,
        serial_number_local_var
        );

    if (!keystore_chain_items_local_var) {
        goto end;
    }

    return keystore_chain_items_local_var;
end:
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

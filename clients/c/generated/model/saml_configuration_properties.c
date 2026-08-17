#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "saml_configuration_properties.h"



static saml_configuration_properties_t *saml_configuration_properties_create_internal(
    saml_configuration_property_items_array_t *path,
    saml_configuration_property_items_long_t *service_ranking,
    saml_configuration_property_items_string_t *idp_url,
    saml_configuration_property_items_string_t *idp_cert_alias,
    saml_configuration_property_items_boolean_t *idp_http_redirect,
    saml_configuration_property_items_string_t *service_provider_entity_id,
    saml_configuration_property_items_string_t *assertion_consumer_service_url,
    saml_configuration_property_items_string_t *sp_private_key_alias,
    saml_configuration_property_items_string_t *key_store_password,
    saml_configuration_property_items_string_t *default_redirect_url,
    saml_configuration_property_items_string_t *user_id_attribute,
    saml_configuration_property_items_boolean_t *use_encryption,
    saml_configuration_property_items_boolean_t *create_user,
    saml_configuration_property_items_boolean_t *add_group_memberships,
    saml_configuration_property_items_string_t *group_membership_attribute,
    saml_configuration_property_items_array_t *default_groups,
    saml_configuration_property_items_string_t *name_id_format,
    saml_configuration_property_items_array_t *synchronize_attributes,
    saml_configuration_property_items_boolean_t *handle_logout,
    saml_configuration_property_items_string_t *logout_url,
    saml_configuration_property_items_long_t *clock_tolerance,
    saml_configuration_property_items_string_t *digest_method,
    saml_configuration_property_items_string_t *signature_method,
    saml_configuration_property_items_string_t *user_intermediate_path
    ) {
    saml_configuration_properties_t *saml_configuration_properties_local_var = malloc(sizeof(saml_configuration_properties_t));
    if (!saml_configuration_properties_local_var) {
        return NULL;
    }
    memset(saml_configuration_properties_local_var, 0, sizeof(saml_configuration_properties_t));
    saml_configuration_properties_local_var->_library_owned = 1;
    saml_configuration_properties_local_var->path = path;
    saml_configuration_properties_local_var->service_ranking = service_ranking;
    saml_configuration_properties_local_var->idp_url = idp_url;
    saml_configuration_properties_local_var->idp_cert_alias = idp_cert_alias;
    saml_configuration_properties_local_var->idp_http_redirect = idp_http_redirect;
    saml_configuration_properties_local_var->service_provider_entity_id = service_provider_entity_id;
    saml_configuration_properties_local_var->assertion_consumer_service_url = assertion_consumer_service_url;
    saml_configuration_properties_local_var->sp_private_key_alias = sp_private_key_alias;
    saml_configuration_properties_local_var->key_store_password = key_store_password;
    saml_configuration_properties_local_var->default_redirect_url = default_redirect_url;
    saml_configuration_properties_local_var->user_id_attribute = user_id_attribute;
    saml_configuration_properties_local_var->use_encryption = use_encryption;
    saml_configuration_properties_local_var->create_user = create_user;
    saml_configuration_properties_local_var->add_group_memberships = add_group_memberships;
    saml_configuration_properties_local_var->group_membership_attribute = group_membership_attribute;
    saml_configuration_properties_local_var->default_groups = default_groups;
    saml_configuration_properties_local_var->name_id_format = name_id_format;
    saml_configuration_properties_local_var->synchronize_attributes = synchronize_attributes;
    saml_configuration_properties_local_var->handle_logout = handle_logout;
    saml_configuration_properties_local_var->logout_url = logout_url;
    saml_configuration_properties_local_var->clock_tolerance = clock_tolerance;
    saml_configuration_properties_local_var->digest_method = digest_method;
    saml_configuration_properties_local_var->signature_method = signature_method;
    saml_configuration_properties_local_var->user_intermediate_path = user_intermediate_path;
    return saml_configuration_properties_local_var;
}

__attribute__((deprecated)) saml_configuration_properties_t *saml_configuration_properties_create(
    saml_configuration_property_items_array_t *path,
    saml_configuration_property_items_long_t *service_ranking,
    saml_configuration_property_items_string_t *idp_url,
    saml_configuration_property_items_string_t *idp_cert_alias,
    saml_configuration_property_items_boolean_t *idp_http_redirect,
    saml_configuration_property_items_string_t *service_provider_entity_id,
    saml_configuration_property_items_string_t *assertion_consumer_service_url,
    saml_configuration_property_items_string_t *sp_private_key_alias,
    saml_configuration_property_items_string_t *key_store_password,
    saml_configuration_property_items_string_t *default_redirect_url,
    saml_configuration_property_items_string_t *user_id_attribute,
    saml_configuration_property_items_boolean_t *use_encryption,
    saml_configuration_property_items_boolean_t *create_user,
    saml_configuration_property_items_boolean_t *add_group_memberships,
    saml_configuration_property_items_string_t *group_membership_attribute,
    saml_configuration_property_items_array_t *default_groups,
    saml_configuration_property_items_string_t *name_id_format,
    saml_configuration_property_items_array_t *synchronize_attributes,
    saml_configuration_property_items_boolean_t *handle_logout,
    saml_configuration_property_items_string_t *logout_url,
    saml_configuration_property_items_long_t *clock_tolerance,
    saml_configuration_property_items_string_t *digest_method,
    saml_configuration_property_items_string_t *signature_method,
    saml_configuration_property_items_string_t *user_intermediate_path
    ) {
    saml_configuration_properties_t *result = saml_configuration_properties_create_internal (
        path,
        service_ranking,
        idp_url,
        idp_cert_alias,
        idp_http_redirect,
        service_provider_entity_id,
        assertion_consumer_service_url,
        sp_private_key_alias,
        key_store_password,
        default_redirect_url,
        user_id_attribute,
        use_encryption,
        create_user,
        add_group_memberships,
        group_membership_attribute,
        default_groups,
        name_id_format,
        synchronize_attributes,
        handle_logout,
        logout_url,
        clock_tolerance,
        digest_method,
        signature_method,
        user_intermediate_path
        );
    if (!result) {
    }
    return result;
}

void saml_configuration_properties_free(saml_configuration_properties_t *saml_configuration_properties) {
    if(NULL == saml_configuration_properties){
        return ;
    }
    if(saml_configuration_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "saml_configuration_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (saml_configuration_properties->path) {
        saml_configuration_property_items_array_free(saml_configuration_properties->path);
        saml_configuration_properties->path = NULL;
    }
    if (saml_configuration_properties->service_ranking) {
        saml_configuration_property_items_long_free(saml_configuration_properties->service_ranking);
        saml_configuration_properties->service_ranking = NULL;
    }
    if (saml_configuration_properties->idp_url) {
        saml_configuration_property_items_string_free(saml_configuration_properties->idp_url);
        saml_configuration_properties->idp_url = NULL;
    }
    if (saml_configuration_properties->idp_cert_alias) {
        saml_configuration_property_items_string_free(saml_configuration_properties->idp_cert_alias);
        saml_configuration_properties->idp_cert_alias = NULL;
    }
    if (saml_configuration_properties->idp_http_redirect) {
        saml_configuration_property_items_boolean_free(saml_configuration_properties->idp_http_redirect);
        saml_configuration_properties->idp_http_redirect = NULL;
    }
    if (saml_configuration_properties->service_provider_entity_id) {
        saml_configuration_property_items_string_free(saml_configuration_properties->service_provider_entity_id);
        saml_configuration_properties->service_provider_entity_id = NULL;
    }
    if (saml_configuration_properties->assertion_consumer_service_url) {
        saml_configuration_property_items_string_free(saml_configuration_properties->assertion_consumer_service_url);
        saml_configuration_properties->assertion_consumer_service_url = NULL;
    }
    if (saml_configuration_properties->sp_private_key_alias) {
        saml_configuration_property_items_string_free(saml_configuration_properties->sp_private_key_alias);
        saml_configuration_properties->sp_private_key_alias = NULL;
    }
    if (saml_configuration_properties->key_store_password) {
        saml_configuration_property_items_string_free(saml_configuration_properties->key_store_password);
        saml_configuration_properties->key_store_password = NULL;
    }
    if (saml_configuration_properties->default_redirect_url) {
        saml_configuration_property_items_string_free(saml_configuration_properties->default_redirect_url);
        saml_configuration_properties->default_redirect_url = NULL;
    }
    if (saml_configuration_properties->user_id_attribute) {
        saml_configuration_property_items_string_free(saml_configuration_properties->user_id_attribute);
        saml_configuration_properties->user_id_attribute = NULL;
    }
    if (saml_configuration_properties->use_encryption) {
        saml_configuration_property_items_boolean_free(saml_configuration_properties->use_encryption);
        saml_configuration_properties->use_encryption = NULL;
    }
    if (saml_configuration_properties->create_user) {
        saml_configuration_property_items_boolean_free(saml_configuration_properties->create_user);
        saml_configuration_properties->create_user = NULL;
    }
    if (saml_configuration_properties->add_group_memberships) {
        saml_configuration_property_items_boolean_free(saml_configuration_properties->add_group_memberships);
        saml_configuration_properties->add_group_memberships = NULL;
    }
    if (saml_configuration_properties->group_membership_attribute) {
        saml_configuration_property_items_string_free(saml_configuration_properties->group_membership_attribute);
        saml_configuration_properties->group_membership_attribute = NULL;
    }
    if (saml_configuration_properties->default_groups) {
        saml_configuration_property_items_array_free(saml_configuration_properties->default_groups);
        saml_configuration_properties->default_groups = NULL;
    }
    if (saml_configuration_properties->name_id_format) {
        saml_configuration_property_items_string_free(saml_configuration_properties->name_id_format);
        saml_configuration_properties->name_id_format = NULL;
    }
    if (saml_configuration_properties->synchronize_attributes) {
        saml_configuration_property_items_array_free(saml_configuration_properties->synchronize_attributes);
        saml_configuration_properties->synchronize_attributes = NULL;
    }
    if (saml_configuration_properties->handle_logout) {
        saml_configuration_property_items_boolean_free(saml_configuration_properties->handle_logout);
        saml_configuration_properties->handle_logout = NULL;
    }
    if (saml_configuration_properties->logout_url) {
        saml_configuration_property_items_string_free(saml_configuration_properties->logout_url);
        saml_configuration_properties->logout_url = NULL;
    }
    if (saml_configuration_properties->clock_tolerance) {
        saml_configuration_property_items_long_free(saml_configuration_properties->clock_tolerance);
        saml_configuration_properties->clock_tolerance = NULL;
    }
    if (saml_configuration_properties->digest_method) {
        saml_configuration_property_items_string_free(saml_configuration_properties->digest_method);
        saml_configuration_properties->digest_method = NULL;
    }
    if (saml_configuration_properties->signature_method) {
        saml_configuration_property_items_string_free(saml_configuration_properties->signature_method);
        saml_configuration_properties->signature_method = NULL;
    }
    if (saml_configuration_properties->user_intermediate_path) {
        saml_configuration_property_items_string_free(saml_configuration_properties->user_intermediate_path);
        saml_configuration_properties->user_intermediate_path = NULL;
    }
    free(saml_configuration_properties);
}

cJSON *saml_configuration_properties_convertToJSON(saml_configuration_properties_t *saml_configuration_properties) {
    cJSON *item = cJSON_CreateObject();

    // saml_configuration_properties->path
    if(saml_configuration_properties->path) {
    cJSON *path_local_JSON = saml_configuration_property_items_array_convertToJSON(saml_configuration_properties->path);
    if(path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path", path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->service_ranking
    if(saml_configuration_properties->service_ranking) {
    cJSON *service_ranking_local_JSON = saml_configuration_property_items_long_convertToJSON(saml_configuration_properties->service_ranking);
    if(service_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.ranking", service_ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->idp_url
    if(saml_configuration_properties->idp_url) {
    cJSON *idp_url_local_JSON = saml_configuration_property_items_string_convertToJSON(saml_configuration_properties->idp_url);
    if(idp_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "idpUrl", idp_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->idp_cert_alias
    if(saml_configuration_properties->idp_cert_alias) {
    cJSON *idp_cert_alias_local_JSON = saml_configuration_property_items_string_convertToJSON(saml_configuration_properties->idp_cert_alias);
    if(idp_cert_alias_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "idpCertAlias", idp_cert_alias_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->idp_http_redirect
    if(saml_configuration_properties->idp_http_redirect) {
    cJSON *idp_http_redirect_local_JSON = saml_configuration_property_items_boolean_convertToJSON(saml_configuration_properties->idp_http_redirect);
    if(idp_http_redirect_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "idpHttpRedirect", idp_http_redirect_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->service_provider_entity_id
    if(saml_configuration_properties->service_provider_entity_id) {
    cJSON *service_provider_entity_id_local_JSON = saml_configuration_property_items_string_convertToJSON(saml_configuration_properties->service_provider_entity_id);
    if(service_provider_entity_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "serviceProviderEntityId", service_provider_entity_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->assertion_consumer_service_url
    if(saml_configuration_properties->assertion_consumer_service_url) {
    cJSON *assertion_consumer_service_url_local_JSON = saml_configuration_property_items_string_convertToJSON(saml_configuration_properties->assertion_consumer_service_url);
    if(assertion_consumer_service_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "assertionConsumerServiceURL", assertion_consumer_service_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->sp_private_key_alias
    if(saml_configuration_properties->sp_private_key_alias) {
    cJSON *sp_private_key_alias_local_JSON = saml_configuration_property_items_string_convertToJSON(saml_configuration_properties->sp_private_key_alias);
    if(sp_private_key_alias_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "spPrivateKeyAlias", sp_private_key_alias_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->key_store_password
    if(saml_configuration_properties->key_store_password) {
    cJSON *key_store_password_local_JSON = saml_configuration_property_items_string_convertToJSON(saml_configuration_properties->key_store_password);
    if(key_store_password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "keyStorePassword", key_store_password_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->default_redirect_url
    if(saml_configuration_properties->default_redirect_url) {
    cJSON *default_redirect_url_local_JSON = saml_configuration_property_items_string_convertToJSON(saml_configuration_properties->default_redirect_url);
    if(default_redirect_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultRedirectUrl", default_redirect_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->user_id_attribute
    if(saml_configuration_properties->user_id_attribute) {
    cJSON *user_id_attribute_local_JSON = saml_configuration_property_items_string_convertToJSON(saml_configuration_properties->user_id_attribute);
    if(user_id_attribute_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "userIDAttribute", user_id_attribute_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->use_encryption
    if(saml_configuration_properties->use_encryption) {
    cJSON *use_encryption_local_JSON = saml_configuration_property_items_boolean_convertToJSON(saml_configuration_properties->use_encryption);
    if(use_encryption_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "useEncryption", use_encryption_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->create_user
    if(saml_configuration_properties->create_user) {
    cJSON *create_user_local_JSON = saml_configuration_property_items_boolean_convertToJSON(saml_configuration_properties->create_user);
    if(create_user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "createUser", create_user_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->add_group_memberships
    if(saml_configuration_properties->add_group_memberships) {
    cJSON *add_group_memberships_local_JSON = saml_configuration_property_items_boolean_convertToJSON(saml_configuration_properties->add_group_memberships);
    if(add_group_memberships_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "addGroupMemberships", add_group_memberships_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->group_membership_attribute
    if(saml_configuration_properties->group_membership_attribute) {
    cJSON *group_membership_attribute_local_JSON = saml_configuration_property_items_string_convertToJSON(saml_configuration_properties->group_membership_attribute);
    if(group_membership_attribute_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "groupMembershipAttribute", group_membership_attribute_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->default_groups
    if(saml_configuration_properties->default_groups) {
    cJSON *default_groups_local_JSON = saml_configuration_property_items_array_convertToJSON(saml_configuration_properties->default_groups);
    if(default_groups_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultGroups", default_groups_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->name_id_format
    if(saml_configuration_properties->name_id_format) {
    cJSON *name_id_format_local_JSON = saml_configuration_property_items_string_convertToJSON(saml_configuration_properties->name_id_format);
    if(name_id_format_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "nameIdFormat", name_id_format_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->synchronize_attributes
    if(saml_configuration_properties->synchronize_attributes) {
    cJSON *synchronize_attributes_local_JSON = saml_configuration_property_items_array_convertToJSON(saml_configuration_properties->synchronize_attributes);
    if(synchronize_attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "synchronizeAttributes", synchronize_attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->handle_logout
    if(saml_configuration_properties->handle_logout) {
    cJSON *handle_logout_local_JSON = saml_configuration_property_items_boolean_convertToJSON(saml_configuration_properties->handle_logout);
    if(handle_logout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "handleLogout", handle_logout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->logout_url
    if(saml_configuration_properties->logout_url) {
    cJSON *logout_url_local_JSON = saml_configuration_property_items_string_convertToJSON(saml_configuration_properties->logout_url);
    if(logout_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "logoutUrl", logout_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->clock_tolerance
    if(saml_configuration_properties->clock_tolerance) {
    cJSON *clock_tolerance_local_JSON = saml_configuration_property_items_long_convertToJSON(saml_configuration_properties->clock_tolerance);
    if(clock_tolerance_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "clockTolerance", clock_tolerance_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->digest_method
    if(saml_configuration_properties->digest_method) {
    cJSON *digest_method_local_JSON = saml_configuration_property_items_string_convertToJSON(saml_configuration_properties->digest_method);
    if(digest_method_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "digestMethod", digest_method_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->signature_method
    if(saml_configuration_properties->signature_method) {
    cJSON *signature_method_local_JSON = saml_configuration_property_items_string_convertToJSON(saml_configuration_properties->signature_method);
    if(signature_method_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "signatureMethod", signature_method_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // saml_configuration_properties->user_intermediate_path
    if(saml_configuration_properties->user_intermediate_path) {
    cJSON *user_intermediate_path_local_JSON = saml_configuration_property_items_string_convertToJSON(saml_configuration_properties->user_intermediate_path);
    if(user_intermediate_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "userIntermediatePath", user_intermediate_path_local_JSON);
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

saml_configuration_properties_t *saml_configuration_properties_parseFromJSON(cJSON *saml_configuration_propertiesJSON){

    saml_configuration_properties_t *saml_configuration_properties_local_var = NULL;

    // define the local variable for saml_configuration_properties->path
    saml_configuration_property_items_array_t *path_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->service_ranking
    saml_configuration_property_items_long_t *service_ranking_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->idp_url
    saml_configuration_property_items_string_t *idp_url_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->idp_cert_alias
    saml_configuration_property_items_string_t *idp_cert_alias_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->idp_http_redirect
    saml_configuration_property_items_boolean_t *idp_http_redirect_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->service_provider_entity_id
    saml_configuration_property_items_string_t *service_provider_entity_id_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->assertion_consumer_service_url
    saml_configuration_property_items_string_t *assertion_consumer_service_url_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->sp_private_key_alias
    saml_configuration_property_items_string_t *sp_private_key_alias_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->key_store_password
    saml_configuration_property_items_string_t *key_store_password_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->default_redirect_url
    saml_configuration_property_items_string_t *default_redirect_url_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->user_id_attribute
    saml_configuration_property_items_string_t *user_id_attribute_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->use_encryption
    saml_configuration_property_items_boolean_t *use_encryption_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->create_user
    saml_configuration_property_items_boolean_t *create_user_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->add_group_memberships
    saml_configuration_property_items_boolean_t *add_group_memberships_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->group_membership_attribute
    saml_configuration_property_items_string_t *group_membership_attribute_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->default_groups
    saml_configuration_property_items_array_t *default_groups_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->name_id_format
    saml_configuration_property_items_string_t *name_id_format_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->synchronize_attributes
    saml_configuration_property_items_array_t *synchronize_attributes_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->handle_logout
    saml_configuration_property_items_boolean_t *handle_logout_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->logout_url
    saml_configuration_property_items_string_t *logout_url_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->clock_tolerance
    saml_configuration_property_items_long_t *clock_tolerance_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->digest_method
    saml_configuration_property_items_string_t *digest_method_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->signature_method
    saml_configuration_property_items_string_t *signature_method_local_nonprim = NULL;

    // define the local variable for saml_configuration_properties->user_intermediate_path
    saml_configuration_property_items_string_t *user_intermediate_path_local_nonprim = NULL;

    // saml_configuration_properties->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "path");
    if (cJSON_IsNull(path)) {
        path = NULL;
    }
    if (path) { 
    path_local_nonprim = saml_configuration_property_items_array_parseFromJSON(path); //nonprimitive
    }

    // saml_configuration_properties->service_ranking
    cJSON *service_ranking = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "service.ranking");
    if (cJSON_IsNull(service_ranking)) {
        service_ranking = NULL;
    }
    if (service_ranking) { 
    service_ranking_local_nonprim = saml_configuration_property_items_long_parseFromJSON(service_ranking); //nonprimitive
    }

    // saml_configuration_properties->idp_url
    cJSON *idp_url = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "idpUrl");
    if (cJSON_IsNull(idp_url)) {
        idp_url = NULL;
    }
    if (idp_url) { 
    idp_url_local_nonprim = saml_configuration_property_items_string_parseFromJSON(idp_url); //nonprimitive
    }

    // saml_configuration_properties->idp_cert_alias
    cJSON *idp_cert_alias = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "idpCertAlias");
    if (cJSON_IsNull(idp_cert_alias)) {
        idp_cert_alias = NULL;
    }
    if (idp_cert_alias) { 
    idp_cert_alias_local_nonprim = saml_configuration_property_items_string_parseFromJSON(idp_cert_alias); //nonprimitive
    }

    // saml_configuration_properties->idp_http_redirect
    cJSON *idp_http_redirect = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "idpHttpRedirect");
    if (cJSON_IsNull(idp_http_redirect)) {
        idp_http_redirect = NULL;
    }
    if (idp_http_redirect) { 
    idp_http_redirect_local_nonprim = saml_configuration_property_items_boolean_parseFromJSON(idp_http_redirect); //nonprimitive
    }

    // saml_configuration_properties->service_provider_entity_id
    cJSON *service_provider_entity_id = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "serviceProviderEntityId");
    if (cJSON_IsNull(service_provider_entity_id)) {
        service_provider_entity_id = NULL;
    }
    if (service_provider_entity_id) { 
    service_provider_entity_id_local_nonprim = saml_configuration_property_items_string_parseFromJSON(service_provider_entity_id); //nonprimitive
    }

    // saml_configuration_properties->assertion_consumer_service_url
    cJSON *assertion_consumer_service_url = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "assertionConsumerServiceURL");
    if (cJSON_IsNull(assertion_consumer_service_url)) {
        assertion_consumer_service_url = NULL;
    }
    if (assertion_consumer_service_url) { 
    assertion_consumer_service_url_local_nonprim = saml_configuration_property_items_string_parseFromJSON(assertion_consumer_service_url); //nonprimitive
    }

    // saml_configuration_properties->sp_private_key_alias
    cJSON *sp_private_key_alias = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "spPrivateKeyAlias");
    if (cJSON_IsNull(sp_private_key_alias)) {
        sp_private_key_alias = NULL;
    }
    if (sp_private_key_alias) { 
    sp_private_key_alias_local_nonprim = saml_configuration_property_items_string_parseFromJSON(sp_private_key_alias); //nonprimitive
    }

    // saml_configuration_properties->key_store_password
    cJSON *key_store_password = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "keyStorePassword");
    if (cJSON_IsNull(key_store_password)) {
        key_store_password = NULL;
    }
    if (key_store_password) { 
    key_store_password_local_nonprim = saml_configuration_property_items_string_parseFromJSON(key_store_password); //nonprimitive
    }

    // saml_configuration_properties->default_redirect_url
    cJSON *default_redirect_url = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "defaultRedirectUrl");
    if (cJSON_IsNull(default_redirect_url)) {
        default_redirect_url = NULL;
    }
    if (default_redirect_url) { 
    default_redirect_url_local_nonprim = saml_configuration_property_items_string_parseFromJSON(default_redirect_url); //nonprimitive
    }

    // saml_configuration_properties->user_id_attribute
    cJSON *user_id_attribute = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "userIDAttribute");
    if (cJSON_IsNull(user_id_attribute)) {
        user_id_attribute = NULL;
    }
    if (user_id_attribute) { 
    user_id_attribute_local_nonprim = saml_configuration_property_items_string_parseFromJSON(user_id_attribute); //nonprimitive
    }

    // saml_configuration_properties->use_encryption
    cJSON *use_encryption = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "useEncryption");
    if (cJSON_IsNull(use_encryption)) {
        use_encryption = NULL;
    }
    if (use_encryption) { 
    use_encryption_local_nonprim = saml_configuration_property_items_boolean_parseFromJSON(use_encryption); //nonprimitive
    }

    // saml_configuration_properties->create_user
    cJSON *create_user = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "createUser");
    if (cJSON_IsNull(create_user)) {
        create_user = NULL;
    }
    if (create_user) { 
    create_user_local_nonprim = saml_configuration_property_items_boolean_parseFromJSON(create_user); //nonprimitive
    }

    // saml_configuration_properties->add_group_memberships
    cJSON *add_group_memberships = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "addGroupMemberships");
    if (cJSON_IsNull(add_group_memberships)) {
        add_group_memberships = NULL;
    }
    if (add_group_memberships) { 
    add_group_memberships_local_nonprim = saml_configuration_property_items_boolean_parseFromJSON(add_group_memberships); //nonprimitive
    }

    // saml_configuration_properties->group_membership_attribute
    cJSON *group_membership_attribute = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "groupMembershipAttribute");
    if (cJSON_IsNull(group_membership_attribute)) {
        group_membership_attribute = NULL;
    }
    if (group_membership_attribute) { 
    group_membership_attribute_local_nonprim = saml_configuration_property_items_string_parseFromJSON(group_membership_attribute); //nonprimitive
    }

    // saml_configuration_properties->default_groups
    cJSON *default_groups = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "defaultGroups");
    if (cJSON_IsNull(default_groups)) {
        default_groups = NULL;
    }
    if (default_groups) { 
    default_groups_local_nonprim = saml_configuration_property_items_array_parseFromJSON(default_groups); //nonprimitive
    }

    // saml_configuration_properties->name_id_format
    cJSON *name_id_format = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "nameIdFormat");
    if (cJSON_IsNull(name_id_format)) {
        name_id_format = NULL;
    }
    if (name_id_format) { 
    name_id_format_local_nonprim = saml_configuration_property_items_string_parseFromJSON(name_id_format); //nonprimitive
    }

    // saml_configuration_properties->synchronize_attributes
    cJSON *synchronize_attributes = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "synchronizeAttributes");
    if (cJSON_IsNull(synchronize_attributes)) {
        synchronize_attributes = NULL;
    }
    if (synchronize_attributes) { 
    synchronize_attributes_local_nonprim = saml_configuration_property_items_array_parseFromJSON(synchronize_attributes); //nonprimitive
    }

    // saml_configuration_properties->handle_logout
    cJSON *handle_logout = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "handleLogout");
    if (cJSON_IsNull(handle_logout)) {
        handle_logout = NULL;
    }
    if (handle_logout) { 
    handle_logout_local_nonprim = saml_configuration_property_items_boolean_parseFromJSON(handle_logout); //nonprimitive
    }

    // saml_configuration_properties->logout_url
    cJSON *logout_url = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "logoutUrl");
    if (cJSON_IsNull(logout_url)) {
        logout_url = NULL;
    }
    if (logout_url) { 
    logout_url_local_nonprim = saml_configuration_property_items_string_parseFromJSON(logout_url); //nonprimitive
    }

    // saml_configuration_properties->clock_tolerance
    cJSON *clock_tolerance = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "clockTolerance");
    if (cJSON_IsNull(clock_tolerance)) {
        clock_tolerance = NULL;
    }
    if (clock_tolerance) { 
    clock_tolerance_local_nonprim = saml_configuration_property_items_long_parseFromJSON(clock_tolerance); //nonprimitive
    }

    // saml_configuration_properties->digest_method
    cJSON *digest_method = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "digestMethod");
    if (cJSON_IsNull(digest_method)) {
        digest_method = NULL;
    }
    if (digest_method) { 
    digest_method_local_nonprim = saml_configuration_property_items_string_parseFromJSON(digest_method); //nonprimitive
    }

    // saml_configuration_properties->signature_method
    cJSON *signature_method = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "signatureMethod");
    if (cJSON_IsNull(signature_method)) {
        signature_method = NULL;
    }
    if (signature_method) { 
    signature_method_local_nonprim = saml_configuration_property_items_string_parseFromJSON(signature_method); //nonprimitive
    }

    // saml_configuration_properties->user_intermediate_path
    cJSON *user_intermediate_path = cJSON_GetObjectItemCaseSensitive(saml_configuration_propertiesJSON, "userIntermediatePath");
    if (cJSON_IsNull(user_intermediate_path)) {
        user_intermediate_path = NULL;
    }
    if (user_intermediate_path) { 
    user_intermediate_path_local_nonprim = saml_configuration_property_items_string_parseFromJSON(user_intermediate_path); //nonprimitive
    }



    saml_configuration_properties_local_var = saml_configuration_properties_create_internal (
        path ? path_local_nonprim : NULL,
        service_ranking ? service_ranking_local_nonprim : NULL,
        idp_url ? idp_url_local_nonprim : NULL,
        idp_cert_alias ? idp_cert_alias_local_nonprim : NULL,
        idp_http_redirect ? idp_http_redirect_local_nonprim : NULL,
        service_provider_entity_id ? service_provider_entity_id_local_nonprim : NULL,
        assertion_consumer_service_url ? assertion_consumer_service_url_local_nonprim : NULL,
        sp_private_key_alias ? sp_private_key_alias_local_nonprim : NULL,
        key_store_password ? key_store_password_local_nonprim : NULL,
        default_redirect_url ? default_redirect_url_local_nonprim : NULL,
        user_id_attribute ? user_id_attribute_local_nonprim : NULL,
        use_encryption ? use_encryption_local_nonprim : NULL,
        create_user ? create_user_local_nonprim : NULL,
        add_group_memberships ? add_group_memberships_local_nonprim : NULL,
        group_membership_attribute ? group_membership_attribute_local_nonprim : NULL,
        default_groups ? default_groups_local_nonprim : NULL,
        name_id_format ? name_id_format_local_nonprim : NULL,
        synchronize_attributes ? synchronize_attributes_local_nonprim : NULL,
        handle_logout ? handle_logout_local_nonprim : NULL,
        logout_url ? logout_url_local_nonprim : NULL,
        clock_tolerance ? clock_tolerance_local_nonprim : NULL,
        digest_method ? digest_method_local_nonprim : NULL,
        signature_method ? signature_method_local_nonprim : NULL,
        user_intermediate_path ? user_intermediate_path_local_nonprim : NULL
        );

    if (!saml_configuration_properties_local_var) {
        goto end;
    }

    return saml_configuration_properties_local_var;
end:
    if (path_local_nonprim) {
        saml_configuration_property_items_array_free(path_local_nonprim);
        path_local_nonprim = NULL;
    }
    if (service_ranking_local_nonprim) {
        saml_configuration_property_items_long_free(service_ranking_local_nonprim);
        service_ranking_local_nonprim = NULL;
    }
    if (idp_url_local_nonprim) {
        saml_configuration_property_items_string_free(idp_url_local_nonprim);
        idp_url_local_nonprim = NULL;
    }
    if (idp_cert_alias_local_nonprim) {
        saml_configuration_property_items_string_free(idp_cert_alias_local_nonprim);
        idp_cert_alias_local_nonprim = NULL;
    }
    if (idp_http_redirect_local_nonprim) {
        saml_configuration_property_items_boolean_free(idp_http_redirect_local_nonprim);
        idp_http_redirect_local_nonprim = NULL;
    }
    if (service_provider_entity_id_local_nonprim) {
        saml_configuration_property_items_string_free(service_provider_entity_id_local_nonprim);
        service_provider_entity_id_local_nonprim = NULL;
    }
    if (assertion_consumer_service_url_local_nonprim) {
        saml_configuration_property_items_string_free(assertion_consumer_service_url_local_nonprim);
        assertion_consumer_service_url_local_nonprim = NULL;
    }
    if (sp_private_key_alias_local_nonprim) {
        saml_configuration_property_items_string_free(sp_private_key_alias_local_nonprim);
        sp_private_key_alias_local_nonprim = NULL;
    }
    if (key_store_password_local_nonprim) {
        saml_configuration_property_items_string_free(key_store_password_local_nonprim);
        key_store_password_local_nonprim = NULL;
    }
    if (default_redirect_url_local_nonprim) {
        saml_configuration_property_items_string_free(default_redirect_url_local_nonprim);
        default_redirect_url_local_nonprim = NULL;
    }
    if (user_id_attribute_local_nonprim) {
        saml_configuration_property_items_string_free(user_id_attribute_local_nonprim);
        user_id_attribute_local_nonprim = NULL;
    }
    if (use_encryption_local_nonprim) {
        saml_configuration_property_items_boolean_free(use_encryption_local_nonprim);
        use_encryption_local_nonprim = NULL;
    }
    if (create_user_local_nonprim) {
        saml_configuration_property_items_boolean_free(create_user_local_nonprim);
        create_user_local_nonprim = NULL;
    }
    if (add_group_memberships_local_nonprim) {
        saml_configuration_property_items_boolean_free(add_group_memberships_local_nonprim);
        add_group_memberships_local_nonprim = NULL;
    }
    if (group_membership_attribute_local_nonprim) {
        saml_configuration_property_items_string_free(group_membership_attribute_local_nonprim);
        group_membership_attribute_local_nonprim = NULL;
    }
    if (default_groups_local_nonprim) {
        saml_configuration_property_items_array_free(default_groups_local_nonprim);
        default_groups_local_nonprim = NULL;
    }
    if (name_id_format_local_nonprim) {
        saml_configuration_property_items_string_free(name_id_format_local_nonprim);
        name_id_format_local_nonprim = NULL;
    }
    if (synchronize_attributes_local_nonprim) {
        saml_configuration_property_items_array_free(synchronize_attributes_local_nonprim);
        synchronize_attributes_local_nonprim = NULL;
    }
    if (handle_logout_local_nonprim) {
        saml_configuration_property_items_boolean_free(handle_logout_local_nonprim);
        handle_logout_local_nonprim = NULL;
    }
    if (logout_url_local_nonprim) {
        saml_configuration_property_items_string_free(logout_url_local_nonprim);
        logout_url_local_nonprim = NULL;
    }
    if (clock_tolerance_local_nonprim) {
        saml_configuration_property_items_long_free(clock_tolerance_local_nonprim);
        clock_tolerance_local_nonprim = NULL;
    }
    if (digest_method_local_nonprim) {
        saml_configuration_property_items_string_free(digest_method_local_nonprim);
        digest_method_local_nonprim = NULL;
    }
    if (signature_method_local_nonprim) {
        saml_configuration_property_items_string_free(signature_method_local_nonprim);
        signature_method_local_nonprim = NULL;
    }
    if (user_intermediate_path_local_nonprim) {
        saml_configuration_property_items_string_free(user_intermediate_path_local_nonprim);
        user_intermediate_path_local_nonprim = NULL;
    }
    return NULL;

}

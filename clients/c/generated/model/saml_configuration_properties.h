/*
 * saml_configuration_properties.h
 *
 * 
 */

#ifndef _saml_configuration_properties_H_
#define _saml_configuration_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct saml_configuration_properties_t saml_configuration_properties_t;

#include "saml_configuration_property_items_array.h"
#include "saml_configuration_property_items_boolean.h"
#include "saml_configuration_property_items_long.h"
#include "saml_configuration_property_items_string.h"



typedef struct saml_configuration_properties_t {
    struct saml_configuration_property_items_array_t *path; //model
    struct saml_configuration_property_items_long_t *service_ranking; //model
    struct saml_configuration_property_items_string_t *idp_url; //model
    struct saml_configuration_property_items_string_t *idp_cert_alias; //model
    struct saml_configuration_property_items_boolean_t *idp_http_redirect; //model
    struct saml_configuration_property_items_string_t *service_provider_entity_id; //model
    struct saml_configuration_property_items_string_t *assertion_consumer_service_url; //model
    struct saml_configuration_property_items_string_t *sp_private_key_alias; //model
    struct saml_configuration_property_items_string_t *key_store_password; //model
    struct saml_configuration_property_items_string_t *default_redirect_url; //model
    struct saml_configuration_property_items_string_t *user_id_attribute; //model
    struct saml_configuration_property_items_boolean_t *use_encryption; //model
    struct saml_configuration_property_items_boolean_t *create_user; //model
    struct saml_configuration_property_items_boolean_t *add_group_memberships; //model
    struct saml_configuration_property_items_string_t *group_membership_attribute; //model
    struct saml_configuration_property_items_array_t *default_groups; //model
    struct saml_configuration_property_items_string_t *name_id_format; //model
    struct saml_configuration_property_items_array_t *synchronize_attributes; //model
    struct saml_configuration_property_items_boolean_t *handle_logout; //model
    struct saml_configuration_property_items_string_t *logout_url; //model
    struct saml_configuration_property_items_long_t *clock_tolerance; //model
    struct saml_configuration_property_items_string_t *digest_method; //model
    struct saml_configuration_property_items_string_t *signature_method; //model
    struct saml_configuration_property_items_string_t *user_intermediate_path; //model

    int _library_owned; // Is the library responsible for freeing this object?
} saml_configuration_properties_t;

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
);

void saml_configuration_properties_free(saml_configuration_properties_t *saml_configuration_properties);

saml_configuration_properties_t *saml_configuration_properties_parseFromJSON(cJSON *saml_configuration_propertiesJSON);

cJSON *saml_configuration_properties_convertToJSON(saml_configuration_properties_t *saml_configuration_properties);

#endif /* _saml_configuration_properties_H_ */


--
-- "Adobe Experience Manager (AEM) API"
-- Prepared SQL queries for 'SamlConfigurationProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'saml_configuration_properties'
--
SELECT "path", service/ranking, idp_url, idp_cert_alias, idp_http_redirect, service_provider_entity_id, assertion_consumer_service_url, sp_private_key_alias, key_store_password, default_redirect_url, user_id_attribute, use_encryption, create_user, add_group_memberships, group_membership_attribute, default_groups, name_id_format, synchronize_attributes, handle_logout, logout_url, clock_tolerance, digest_method, signature_method, user_intermediate_path FROM saml_configuration_properties WHERE 1=1;

--
-- INSERT template for table 'saml_configuration_properties'
--
INSERT INTO saml_configuration_properties ("path", service/ranking, idp_url, idp_cert_alias, idp_http_redirect, service_provider_entity_id, assertion_consumer_service_url, sp_private_key_alias, key_store_password, default_redirect_url, user_id_attribute, use_encryption, create_user, add_group_memberships, group_membership_attribute, default_groups, name_id_format, synchronize_attributes, handle_logout, logout_url, clock_tolerance, digest_method, signature_method, user_intermediate_path) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'saml_configuration_properties'
--
UPDATE saml_configuration_properties SET "path" = ?, service/ranking = ?, idp_url = ?, idp_cert_alias = ?, idp_http_redirect = ?, service_provider_entity_id = ?, assertion_consumer_service_url = ?, sp_private_key_alias = ?, key_store_password = ?, default_redirect_url = ?, user_id_attribute = ?, use_encryption = ?, create_user = ?, add_group_memberships = ?, group_membership_attribute = ?, default_groups = ?, name_id_format = ?, synchronize_attributes = ?, handle_logout = ?, logout_url = ?, clock_tolerance = ?, digest_method = ?, signature_method = ?, user_intermediate_path = ? WHERE 1=2;

--
-- DELETE template for table 'saml_configuration_properties'
--
DELETE FROM saml_configuration_properties WHERE 1=2;


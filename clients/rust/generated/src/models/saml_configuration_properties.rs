/*
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct SamlConfigurationProperties {
    #[serde(rename = "path", skip_serializing_if = "Option::is_none")]
    pub path: Option<Box<crate::models::SamlConfigurationPropertyItemsArray>>,
    #[serde(rename = "service.ranking", skip_serializing_if = "Option::is_none")]
    pub service_ranking: Option<Box<crate::models::SamlConfigurationPropertyItemsLong>>,
    #[serde(rename = "idpUrl", skip_serializing_if = "Option::is_none")]
    pub idp_url: Option<Box<crate::models::SamlConfigurationPropertyItemsString>>,
    #[serde(rename = "idpCertAlias", skip_serializing_if = "Option::is_none")]
    pub idp_cert_alias: Option<Box<crate::models::SamlConfigurationPropertyItemsString>>,
    #[serde(rename = "idpHttpRedirect", skip_serializing_if = "Option::is_none")]
    pub idp_http_redirect: Option<Box<crate::models::SamlConfigurationPropertyItemsBoolean>>,
    #[serde(rename = "serviceProviderEntityId", skip_serializing_if = "Option::is_none")]
    pub service_provider_entity_id: Option<Box<crate::models::SamlConfigurationPropertyItemsString>>,
    #[serde(rename = "assertionConsumerServiceURL", skip_serializing_if = "Option::is_none")]
    pub assertion_consumer_service_url: Option<Box<crate::models::SamlConfigurationPropertyItemsString>>,
    #[serde(rename = "spPrivateKeyAlias", skip_serializing_if = "Option::is_none")]
    pub sp_private_key_alias: Option<Box<crate::models::SamlConfigurationPropertyItemsString>>,
    #[serde(rename = "keyStorePassword", skip_serializing_if = "Option::is_none")]
    pub key_store_password: Option<Box<crate::models::SamlConfigurationPropertyItemsString>>,
    #[serde(rename = "defaultRedirectUrl", skip_serializing_if = "Option::is_none")]
    pub default_redirect_url: Option<Box<crate::models::SamlConfigurationPropertyItemsString>>,
    #[serde(rename = "userIDAttribute", skip_serializing_if = "Option::is_none")]
    pub user_id_attribute: Option<Box<crate::models::SamlConfigurationPropertyItemsString>>,
    #[serde(rename = "useEncryption", skip_serializing_if = "Option::is_none")]
    pub use_encryption: Option<Box<crate::models::SamlConfigurationPropertyItemsBoolean>>,
    #[serde(rename = "createUser", skip_serializing_if = "Option::is_none")]
    pub create_user: Option<Box<crate::models::SamlConfigurationPropertyItemsBoolean>>,
    #[serde(rename = "addGroupMemberships", skip_serializing_if = "Option::is_none")]
    pub add_group_memberships: Option<Box<crate::models::SamlConfigurationPropertyItemsBoolean>>,
    #[serde(rename = "groupMembershipAttribute", skip_serializing_if = "Option::is_none")]
    pub group_membership_attribute: Option<Box<crate::models::SamlConfigurationPropertyItemsString>>,
    #[serde(rename = "defaultGroups", skip_serializing_if = "Option::is_none")]
    pub default_groups: Option<Box<crate::models::SamlConfigurationPropertyItemsArray>>,
    #[serde(rename = "nameIdFormat", skip_serializing_if = "Option::is_none")]
    pub name_id_format: Option<Box<crate::models::SamlConfigurationPropertyItemsString>>,
    #[serde(rename = "synchronizeAttributes", skip_serializing_if = "Option::is_none")]
    pub synchronize_attributes: Option<Box<crate::models::SamlConfigurationPropertyItemsArray>>,
    #[serde(rename = "handleLogout", skip_serializing_if = "Option::is_none")]
    pub handle_logout: Option<Box<crate::models::SamlConfigurationPropertyItemsBoolean>>,
    #[serde(rename = "logoutUrl", skip_serializing_if = "Option::is_none")]
    pub logout_url: Option<Box<crate::models::SamlConfigurationPropertyItemsString>>,
    #[serde(rename = "clockTolerance", skip_serializing_if = "Option::is_none")]
    pub clock_tolerance: Option<Box<crate::models::SamlConfigurationPropertyItemsLong>>,
    #[serde(rename = "digestMethod", skip_serializing_if = "Option::is_none")]
    pub digest_method: Option<Box<crate::models::SamlConfigurationPropertyItemsString>>,
    #[serde(rename = "signatureMethod", skip_serializing_if = "Option::is_none")]
    pub signature_method: Option<Box<crate::models::SamlConfigurationPropertyItemsString>>,
    #[serde(rename = "userIntermediatePath", skip_serializing_if = "Option::is_none")]
    pub user_intermediate_path: Option<Box<crate::models::SamlConfigurationPropertyItemsString>>,
}

impl SamlConfigurationProperties {
    pub fn new() -> SamlConfigurationProperties {
        SamlConfigurationProperties {
            path: None,
            service_ranking: None,
            idp_url: None,
            idp_cert_alias: None,
            idp_http_redirect: None,
            service_provider_entity_id: None,
            assertion_consumer_service_url: None,
            sp_private_key_alias: None,
            key_store_password: None,
            default_redirect_url: None,
            user_id_attribute: None,
            use_encryption: None,
            create_user: None,
            add_group_memberships: None,
            group_membership_attribute: None,
            default_groups: None,
            name_id_format: None,
            synchronize_attributes: None,
            handle_logout: None,
            logout_url: None,
            clock_tolerance: None,
            digest_method: None,
            signature_method: None,
            user_intermediate_path: None,
        }
    }
}



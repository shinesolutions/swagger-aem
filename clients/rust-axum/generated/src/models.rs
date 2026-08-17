#![allow(unused_qualifications)]

use http::HeaderValue;
use validator::Validate;

#[cfg(feature = "server")]
use crate::header;
use crate::{models, types::*};

#[allow(dead_code)]
pub type SSE = std::pin::Pin<std::boxed::Box<dyn futures_util::Stream<Item = std::result::Result<axum::response::sse::Event, std::convert::Infallible>> + std::marker::Send + std::marker::Sync>>;

#[allow(dead_code)]
fn from_validation_error(e: validator::ValidationError) -> validator::ValidationErrors {
  let mut errs = validator::ValidationErrors::new();
  errs.add("na", e);
  errs
}

#[allow(dead_code)]
pub fn check_xss_string(v: &str) -> std::result::Result<(), validator::ValidationError> {
    if ammonia::is_html(v) {
        std::result::Result::Err(validator::ValidationError::new("xss detected"))
    } else {
        std::result::Result::Ok(())
    }
}

#[allow(dead_code)]
pub fn check_xss_vec_string(v: &[String]) -> std::result::Result<(), validator::ValidationError> {
    if v.iter().any(|i| ammonia::is_html(i)) {
        std::result::Result::Err(validator::ValidationError::new("xss detected"))
    } else {
        std::result::Result::Ok(())
    }
}

#[allow(dead_code)]
pub fn check_xss_map_string(
    v: &std::collections::HashMap<String, String>,
) -> std::result::Result<(), validator::ValidationError> {
    if v.keys().any(|k| ammonia::is_html(k)) || v.values().any(|v| ammonia::is_html(v)) {
        std::result::Result::Err(validator::ValidationError::new("xss detected"))
    } else {
        std::result::Result::Ok(())
    }
}

#[allow(dead_code)]
pub fn check_xss_map_nested<T>(
    v: &std::collections::HashMap<String, T>,
) -> std::result::Result<(), validator::ValidationError>
where
    T: validator::Validate,
{
    if v.keys().any(|k| ammonia::is_html(k)) || v.values().any(|v| v.validate().is_err()) {
        std::result::Result::Err(validator::ValidationError::new("xss detected"))
    } else {
        std::result::Result::Ok(())
    }
}

#[allow(dead_code)]
pub fn check_xss_map<T>(v: &std::collections::HashMap<String, T>) -> std::result::Result<(), validator::ValidationError> {
    if v.keys().any(|k| ammonia::is_html(k)) {
        std::result::Result::Err(validator::ValidationError::new("xss detected"))
    } else {
        std::result::Result::Ok(())
    }
}



    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct GetBundleInfoPathParams {
                pub name: String,
    }




    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostBundlePathParams {
                pub name: String,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostBundleQueryParams {
                #[serde(rename = "action")]
                    pub action: String,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostJmxRepositoryPathParams {
                pub action: String,
    }



    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostSamlConfigurationQueryParams {
                #[serde(rename = "post")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub post: Option<bool>,
                #[serde(rename = "apply")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub apply: Option<bool>,
                #[serde(rename = "delete")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub delete: Option<bool>,
                #[serde(rename = "action")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub action: Option<String>,
                #[serde(rename = "$location")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub dollar_location: Option<String>,
                #[serde(rename = "path")]
                    #[serde(default)]
                    pub path: Vec<String>,
                #[serde(rename = "service.ranking")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub service_ranking: Option<i32>,
                #[serde(rename = "idpUrl")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub idp_url: Option<String>,
                #[serde(rename = "idpCertAlias")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub idp_cert_alias: Option<String>,
                #[serde(rename = "idpHttpRedirect")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub idp_http_redirect: Option<bool>,
                #[serde(rename = "serviceProviderEntityId")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub service_provider_entity_id: Option<String>,
                #[serde(rename = "assertionConsumerServiceURL")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub assertion_consumer_service_url: Option<String>,
                #[serde(rename = "spPrivateKeyAlias")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub sp_private_key_alias: Option<String>,
                #[serde(rename = "keyStorePassword")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub key_store_password: Option<String>,
                #[serde(rename = "defaultRedirectUrl")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub default_redirect_url: Option<String>,
                #[serde(rename = "userIDAttribute")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub user_id_attribute: Option<String>,
                #[serde(rename = "useEncryption")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub use_encryption: Option<bool>,
                #[serde(rename = "createUser")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub create_user: Option<bool>,
                #[serde(rename = "addGroupMemberships")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub add_group_memberships: Option<bool>,
                #[serde(rename = "groupMembershipAttribute")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub group_membership_attribute: Option<String>,
                #[serde(rename = "defaultGroups")]
                    #[serde(default)]
                    pub default_groups: Vec<String>,
                #[serde(rename = "nameIdFormat")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub name_id_format: Option<String>,
                #[serde(rename = "synchronizeAttributes")]
                    #[serde(default)]
                    pub synchronize_attributes: Vec<String>,
                #[serde(rename = "handleLogout")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub handle_logout: Option<bool>,
                #[serde(rename = "logoutUrl")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub logout_url: Option<String>,
                #[serde(rename = "clockTolerance")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub clock_tolerance: Option<i32>,
                #[serde(rename = "digestMethod")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub digest_method: Option<String>,
                #[serde(rename = "signatureMethod")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub signature_method: Option<String>,
                #[serde(rename = "userIntermediatePath")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub user_intermediate_path: Option<String>,
                #[serde(rename = "propertylist")]
                    #[serde(default)]
                    pub propertylist: Vec<String>,
    }



    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostCqActionsQueryParams {
                #[serde(rename = "authorizableId")]
                    pub authorizable_id: String,
                #[serde(rename = "changelog")]
                    pub changelog: String,
    }





    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostPackageServiceQueryParams {
                #[serde(rename = "cmd")]
                    pub cmd: String,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostPackageServiceJsonPathParams {
                pub path: String,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostPackageServiceJsonQueryParams {
                #[serde(rename = "cmd")]
                    pub cmd: String,
                #[serde(rename = "groupName")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub group_name: Option<String>,
                #[serde(rename = "packageName")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub package_name: Option<String>,
                #[serde(rename = "packageVersion")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub package_version: Option<String>,
                #[serde(rename = "_charset_")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub _charset_: Option<String>,
                #[serde(rename = "force")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub force: Option<bool>,
                #[serde(rename = "recursive")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub recursive: Option<bool>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostPackageUpdateQueryParams {
                #[serde(rename = "groupName")]
                    pub group_name: String,
                #[serde(rename = "packageName")]
                    pub package_name: String,
                #[serde(rename = "version")]
                    pub version: String,
                #[serde(rename = "path")]
                    pub path: String,
                #[serde(rename = "filter")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub filter: Option<String>,
                #[serde(rename = "_charset_")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub _charset_: Option<String>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostSetPasswordQueryParams {
                #[serde(rename = "old")]
                    pub old: String,
                #[serde(rename = "plain")]
                    pub plain: String,
                #[serde(rename = "verify")]
                    pub verify: String,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct GetAemHealthCheckQueryParams {
                #[serde(rename = "tags")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub tags: Option<String>,
                #[serde(rename = "combineTagsOr")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub combine_tags_or: Option<bool>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostConfigAemHealthCheckServletQueryParams {
                #[serde(rename = "bundles.ignored")]
                    #[serde(default)]
                    pub bundles_ignored: Vec<String>,
                #[serde(rename = "bundles.ignored@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub bundles_ignored_at_type_hint: Option<String>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostConfigAemPasswordResetQueryParams {
                #[serde(rename = "pwdreset.authorizables")]
                    #[serde(default)]
                    pub pwdreset_authorizables: Vec<String>,
                #[serde(rename = "pwdreset.authorizables@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub pwdreset_authorizables_at_type_hint: Option<String>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct SslSetupQueryParams {
                #[serde(rename = "keystorePassword")]
                    pub keystore_password: String,
                #[serde(rename = "keystorePasswordConfirm")]
                    pub keystore_password_confirm: String,
                #[serde(rename = "truststorePassword")]
                    pub truststore_password: String,
                #[serde(rename = "truststorePasswordConfirm")]
                    pub truststore_password_confirm: String,
                #[serde(rename = "httpsHostname")]
                    pub https_hostname: String,
                #[serde(rename = "httpsPort")]
                    pub https_port: String,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct DeleteAgentPathParams {
                pub runmode: String,
                pub name: String,
    }



    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct DeleteNodePathParams {
                pub path: String,
                pub name: String,
    }



    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct GetAgentPathParams {
                pub runmode: String,
                pub name: String,
    }



    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct GetAgentsPathParams {
                pub runmode: String,
    }



    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct GetAuthorizableKeystorePathParams {
                pub intermediate_path: String,
                pub authorizable_id: String,
    }



    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct GetKeystorePathParams {
                pub intermediate_path: String,
                pub authorizable_id: String,
    }



    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct GetNodePathParams {
                pub path: String,
                pub name: String,
    }



    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct GetPackagePathParams {
                pub group: String,
                pub name: String,
                pub version: String,
    }



    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct GetPackageFilterPathParams {
                pub group: String,
                pub name: String,
                pub version: String,
    }



    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct GetQueryQueryParams {
                #[serde(rename = "path")]
                    pub path: String,
                #[serde(rename = "p.limit")]
                    pub p_limit: f64,
                #[serde(rename = "1_property")]
                    pub param_1_property: String,
                #[serde(rename = "1_property.value")]
                    pub param_1_property_value: String,
    }




    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostAgentPathParams {
                pub runmode: String,
                pub name: String,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostAgentQueryParams {
                #[serde(rename = "jcr:content/cq:distribute")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_cq_colon_distribute: Option<bool>,
                #[serde(rename = "jcr:content/cq:distribute@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_cq_colon_distribute_at_type_hint: Option<String>,
                #[serde(rename = "jcr:content/cq:name")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_cq_colon_name: Option<String>,
                #[serde(rename = "jcr:content/cq:template")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_cq_colon_template: Option<String>,
                #[serde(rename = "jcr:content/aliasUpdate")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_alias_update: Option<bool>,
                #[serde(rename = "jcr:content/enabled")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_enabled: Option<bool>,
                #[serde(rename = "jcr:content/jcr:description")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_jcr_colon_description: Option<String>,
                #[serde(rename = "jcr:content/jcr:lastModified")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_jcr_colon_last_modified: Option<String>,
                #[serde(rename = "jcr:content/jcr:lastModifiedBy")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_jcr_colon_last_modified_by: Option<String>,
                #[serde(rename = "jcr:content/jcr:mixinTypes")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_jcr_colon_mixin_types: Option<String>,
                #[serde(rename = "jcr:content/jcr:title")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_jcr_colon_title: Option<String>,
                #[serde(rename = "jcr:content/logLevel")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_log_level: Option<String>,
                #[serde(rename = "jcr:content/noStatusUpdate")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_no_status_update: Option<bool>,
                #[serde(rename = "jcr:content/noVersioning")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_no_versioning: Option<bool>,
                #[serde(rename = "jcr:content/protocolConnectTimeout")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_protocol_connect_timeout: Option<f64>,
                #[serde(rename = "jcr:content/protocolHTTPConnectionClosed")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_protocol_http_connection_closed: Option<bool>,
                #[serde(rename = "jcr:content/protocolHTTPExpired")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_protocol_http_expired: Option<String>,
                #[serde(rename = "jcr:content/protocolHTTPHeaders")]
                    #[serde(default)]
                    pub jcr_colon_content_slash_protocol_http_headers: Vec<String>,
                #[serde(rename = "jcr:content/protocolHTTPHeaders@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_protocol_http_headers_at_type_hint: Option<String>,
                #[serde(rename = "jcr:content/protocolHTTPMethod")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_protocol_http_method: Option<String>,
                #[serde(rename = "jcr:content/protocolHTTPSRelaxed")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_protocol_https_relaxed: Option<bool>,
                #[serde(rename = "jcr:content/protocolInterface")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_protocol_interface: Option<String>,
                #[serde(rename = "jcr:content/protocolSocketTimeout")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_protocol_socket_timeout: Option<f64>,
                #[serde(rename = "jcr:content/protocolVersion")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_protocol_version: Option<String>,
                #[serde(rename = "jcr:content/proxyNTLMDomain")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_proxy_ntlm_domain: Option<String>,
                #[serde(rename = "jcr:content/proxyNTLMHost")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_proxy_ntlm_host: Option<String>,
                #[serde(rename = "jcr:content/proxyHost")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_proxy_host: Option<String>,
                #[serde(rename = "jcr:content/proxyPassword")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_proxy_password: Option<String>,
                #[serde(rename = "jcr:content/proxyPort")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_proxy_port: Option<f64>,
                #[serde(rename = "jcr:content/proxyUser")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_proxy_user: Option<String>,
                #[serde(rename = "jcr:content/queueBatchMaxSize")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_queue_batch_max_size: Option<f64>,
                #[serde(rename = "jcr:content/queueBatchMode")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_queue_batch_mode: Option<String>,
                #[serde(rename = "jcr:content/queueBatchWaitTime")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_queue_batch_wait_time: Option<f64>,
                #[serde(rename = "jcr:content/retryDelay")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_retry_delay: Option<String>,
                #[serde(rename = "jcr:content/reverseReplication")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_reverse_replication: Option<bool>,
                #[serde(rename = "jcr:content/serializationType")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_serialization_type: Option<String>,
                #[serde(rename = "jcr:content/sling:resourceType")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_sling_colon_resource_type: Option<String>,
                #[serde(rename = "jcr:content/ssl")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_ssl: Option<String>,
                #[serde(rename = "jcr:content/transportNTLMDomain")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_transport_ntlm_domain: Option<String>,
                #[serde(rename = "jcr:content/transportNTLMHost")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_transport_ntlm_host: Option<String>,
                #[serde(rename = "jcr:content/transportPassword")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_transport_password: Option<String>,
                #[serde(rename = "jcr:content/transportUri")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_transport_uri: Option<String>,
                #[serde(rename = "jcr:content/transportUser")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_transport_user: Option<String>,
                #[serde(rename = "jcr:content/triggerDistribute")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_trigger_distribute: Option<bool>,
                #[serde(rename = "jcr:content/triggerModified")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_trigger_modified: Option<bool>,
                #[serde(rename = "jcr:content/triggerOnOffTime")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_trigger_on_off_time: Option<bool>,
                #[serde(rename = "jcr:content/triggerReceive")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_trigger_receive: Option<bool>,
                #[serde(rename = "jcr:content/triggerSpecific")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_trigger_specific: Option<bool>,
                #[serde(rename = "jcr:content/userId")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_content_slash_user_id: Option<String>,
                #[serde(rename = "jcr:primaryType")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub jcr_colon_primary_type: Option<String>,
                #[serde(rename = ":operation")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub colon_operation: Option<String>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostAuthorizableKeystorePathParams {
                pub intermediate_path: String,
                pub authorizable_id: String,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostAuthorizableKeystoreQueryParams {
                #[serde(rename = ":operation")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub colon_operation: Option<String>,
                #[serde(rename = "currentPassword")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub current_password: Option<String>,
                #[serde(rename = "newPassword")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub new_password: Option<String>,
                #[serde(rename = "rePassword")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub re_password: Option<String>,
                #[serde(rename = "keyPassword")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub key_password: Option<String>,
                #[serde(rename = "keyStorePass")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub key_store_pass: Option<String>,
                #[serde(rename = "alias")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub alias: Option<String>,
                #[serde(rename = "newAlias")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub new_alias: Option<String>,
                #[serde(rename = "removeAlias")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub remove_alias: Option<String>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostAuthorizablesQueryParams {
                #[serde(rename = "authorizableId")]
                    pub authorizable_id: String,
                #[serde(rename = "intermediatePath")]
                    pub intermediate_path: String,
                #[serde(rename = "createUser")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub create_user: Option<String>,
                #[serde(rename = "createGroup")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub create_group: Option<String>,
                #[serde(rename = "rep:password")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub rep_colon_password: Option<String>,
                #[serde(rename = "profile/givenName")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub profile_slash_given_name: Option<String>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostConfigAdobeGraniteSamlAuthenticationHandlerQueryParams {
                #[serde(rename = "keyStorePassword")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub key_store_password: Option<String>,
                #[serde(rename = "keyStorePassword@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub key_store_password_at_type_hint: Option<String>,
                #[serde(rename = "service.ranking")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub service_ranking: Option<i32>,
                #[serde(rename = "service.ranking@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub service_ranking_at_type_hint: Option<String>,
                #[serde(rename = "idpHttpRedirect")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub idp_http_redirect: Option<bool>,
                #[serde(rename = "idpHttpRedirect@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub idp_http_redirect_at_type_hint: Option<String>,
                #[serde(rename = "createUser")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub create_user: Option<bool>,
                #[serde(rename = "createUser@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub create_user_at_type_hint: Option<String>,
                #[serde(rename = "defaultRedirectUrl")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub default_redirect_url: Option<String>,
                #[serde(rename = "defaultRedirectUrl@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub default_redirect_url_at_type_hint: Option<String>,
                #[serde(rename = "userIDAttribute")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub user_id_attribute: Option<String>,
                #[serde(rename = "userIDAttribute@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub user_id_attribute_at_type_hint: Option<String>,
                #[serde(rename = "defaultGroups")]
                    #[serde(default)]
                    pub default_groups: Vec<String>,
                #[serde(rename = "defaultGroups@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub default_groups_at_type_hint: Option<String>,
                #[serde(rename = "idpCertAlias")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub idp_cert_alias: Option<String>,
                #[serde(rename = "idpCertAlias@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub idp_cert_alias_at_type_hint: Option<String>,
                #[serde(rename = "addGroupMemberships")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub add_group_memberships: Option<bool>,
                #[serde(rename = "addGroupMemberships@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub add_group_memberships_at_type_hint: Option<String>,
                #[serde(rename = "path")]
                    #[serde(default)]
                    pub path: Vec<String>,
                #[serde(rename = "path@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub path_at_type_hint: Option<String>,
                #[serde(rename = "synchronizeAttributes")]
                    #[serde(default)]
                    pub synchronize_attributes: Vec<String>,
                #[serde(rename = "synchronizeAttributes@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub synchronize_attributes_at_type_hint: Option<String>,
                #[serde(rename = "clockTolerance")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub clock_tolerance: Option<i32>,
                #[serde(rename = "clockTolerance@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub clock_tolerance_at_type_hint: Option<String>,
                #[serde(rename = "groupMembershipAttribute")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub group_membership_attribute: Option<String>,
                #[serde(rename = "groupMembershipAttribute@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub group_membership_attribute_at_type_hint: Option<String>,
                #[serde(rename = "idpUrl")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub idp_url: Option<String>,
                #[serde(rename = "idpUrl@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub idp_url_at_type_hint: Option<String>,
                #[serde(rename = "logoutUrl")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub logout_url: Option<String>,
                #[serde(rename = "logoutUrl@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub logout_url_at_type_hint: Option<String>,
                #[serde(rename = "serviceProviderEntityId")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub service_provider_entity_id: Option<String>,
                #[serde(rename = "serviceProviderEntityId@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub service_provider_entity_id_at_type_hint: Option<String>,
                #[serde(rename = "assertionConsumerServiceURL")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub assertion_consumer_service_url: Option<String>,
                #[serde(rename = "assertionConsumerServiceURL@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub assertion_consumer_service_urlat_type_hint: Option<String>,
                #[serde(rename = "handleLogout")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub handle_logout: Option<bool>,
                #[serde(rename = "handleLogout@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub handle_logout_at_type_hint: Option<String>,
                #[serde(rename = "spPrivateKeyAlias")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub sp_private_key_alias: Option<String>,
                #[serde(rename = "spPrivateKeyAlias@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub sp_private_key_alias_at_type_hint: Option<String>,
                #[serde(rename = "useEncryption")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub use_encryption: Option<bool>,
                #[serde(rename = "useEncryption@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub use_encryption_at_type_hint: Option<String>,
                #[serde(rename = "nameIdFormat")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub name_id_format: Option<String>,
                #[serde(rename = "nameIdFormat@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub name_id_format_at_type_hint: Option<String>,
                #[serde(rename = "digestMethod")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub digest_method: Option<String>,
                #[serde(rename = "digestMethod@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub digest_method_at_type_hint: Option<String>,
                #[serde(rename = "signatureMethod")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub signature_method: Option<String>,
                #[serde(rename = "signatureMethod@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub signature_method_at_type_hint: Option<String>,
                #[serde(rename = "userIntermediatePath")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub user_intermediate_path: Option<String>,
                #[serde(rename = "userIntermediatePath@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub user_intermediate_path_at_type_hint: Option<String>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostConfigApacheFelixJettyBasedHttpServiceQueryParams {
                #[serde(rename = "org.apache.felix.https.nio")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_nio: Option<bool>,
                #[serde(rename = "org.apache.felix.https.nio@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_nio_at_type_hint: Option<String>,
                #[serde(rename = "org.apache.felix.https.keystore")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_keystore: Option<String>,
                #[serde(rename = "org.apache.felix.https.keystore@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_keystore_at_type_hint: Option<String>,
                #[serde(rename = "org.apache.felix.https.keystore.password")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_keystore_password: Option<String>,
                #[serde(rename = "org.apache.felix.https.keystore.password@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_keystore_password_at_type_hint: Option<String>,
                #[serde(rename = "org.apache.felix.https.keystore.key")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_keystore_key: Option<String>,
                #[serde(rename = "org.apache.felix.https.keystore.key@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_keystore_key_at_type_hint: Option<String>,
                #[serde(rename = "org.apache.felix.https.keystore.key.password")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_keystore_key_password: Option<String>,
                #[serde(rename = "org.apache.felix.https.keystore.key.password@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_keystore_key_password_at_type_hint: Option<String>,
                #[serde(rename = "org.apache.felix.https.truststore")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_truststore: Option<String>,
                #[serde(rename = "org.apache.felix.https.truststore@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_truststore_at_type_hint: Option<String>,
                #[serde(rename = "org.apache.felix.https.truststore.password")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_truststore_password: Option<String>,
                #[serde(rename = "org.apache.felix.https.truststore.password@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_truststore_password_at_type_hint: Option<String>,
                #[serde(rename = "org.apache.felix.https.clientcertificate")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_clientcertificate: Option<String>,
                #[serde(rename = "org.apache.felix.https.clientcertificate@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_clientcertificate_at_type_hint: Option<String>,
                #[serde(rename = "org.apache.felix.https.enable")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_enable: Option<bool>,
                #[serde(rename = "org.apache.felix.https.enable@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_apache_felix_https_enable_at_type_hint: Option<String>,
                #[serde(rename = "org.osgi.service.http.port.secure")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_osgi_service_http_port_secure: Option<String>,
                #[serde(rename = "org.osgi.service.http.port.secure@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub org_osgi_service_http_port_secure_at_type_hint: Option<String>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostConfigApacheHttpComponentsProxyConfigurationQueryParams {
                #[serde(rename = "proxy.host")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub proxy_host: Option<String>,
                #[serde(rename = "proxy.host@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub proxy_host_at_type_hint: Option<String>,
                #[serde(rename = "proxy.port")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub proxy_port: Option<i32>,
                #[serde(rename = "proxy.port@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub proxy_port_at_type_hint: Option<String>,
                #[serde(rename = "proxy.exceptions")]
                    #[serde(default)]
                    pub proxy_exceptions: Vec<String>,
                #[serde(rename = "proxy.exceptions@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub proxy_exceptions_at_type_hint: Option<String>,
                #[serde(rename = "proxy.enabled")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub proxy_enabled: Option<bool>,
                #[serde(rename = "proxy.enabled@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub proxy_enabled_at_type_hint: Option<String>,
                #[serde(rename = "proxy.user")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub proxy_user: Option<String>,
                #[serde(rename = "proxy.user@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub proxy_user_at_type_hint: Option<String>,
                #[serde(rename = "proxy.password")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub proxy_password: Option<String>,
                #[serde(rename = "proxy.password@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub proxy_password_at_type_hint: Option<String>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostConfigApacheSlingDavExServletQueryParams {
                #[serde(rename = "alias")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub alias: Option<String>,
                #[serde(rename = "alias@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub alias_at_type_hint: Option<String>,
                #[serde(rename = "dav.create-absolute-uri")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub dav_create_absolute_uri: Option<bool>,
                #[serde(rename = "dav.create-absolute-uri@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub dav_create_absolute_uri_at_type_hint: Option<String>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostConfigApacheSlingGetServletQueryParams {
                #[serde(rename = "json.maximumresults")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub json_maximumresults: Option<String>,
                #[serde(rename = "json.maximumresults@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub json_maximumresults_at_type_hint: Option<String>,
                #[serde(rename = "enable.html")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub enable_html: Option<bool>,
                #[serde(rename = "enable.html@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub enable_html_at_type_hint: Option<String>,
                #[serde(rename = "enable.txt")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub enable_txt: Option<bool>,
                #[serde(rename = "enable.txt@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub enable_txt_at_type_hint: Option<String>,
                #[serde(rename = "enable.xml")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub enable_xml: Option<bool>,
                #[serde(rename = "enable.xml@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub enable_xml_at_type_hint: Option<String>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostConfigApacheSlingReferrerFilterQueryParams {
                #[serde(rename = "allow.empty")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub allow_empty: Option<bool>,
                #[serde(rename = "allow.empty@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub allow_empty_at_type_hint: Option<String>,
                #[serde(rename = "allow.hosts")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub allow_hosts: Option<String>,
                #[serde(rename = "allow.hosts@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub allow_hosts_at_type_hint: Option<String>,
                #[serde(rename = "allow.hosts.regexp")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub allow_hosts_regexp: Option<String>,
                #[serde(rename = "allow.hosts.regexp@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub allow_hosts_regexp_at_type_hint: Option<String>,
                #[serde(rename = "filter.methods")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub filter_methods: Option<String>,
                #[serde(rename = "filter.methods@TypeHint")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub filter_methods_at_type_hint: Option<String>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostConfigPropertyPathParams {
                pub config_node_name: String,
    }



    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostNodePathParams {
                pub path: String,
                pub name: String,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostNodeQueryParams {
                #[serde(rename = ":operation")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub colon_operation: Option<String>,
                #[serde(rename = "deleteAuthorizable")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub delete_authorizable: Option<String>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostNodeRwPathParams {
                pub path: String,
                pub name: String,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostNodeRwQueryParams {
                #[serde(rename = "addMembers")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub add_members: Option<String>,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostPathPathParams {
                pub path: String,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostPathQueryParams {
                #[serde(rename = "jcr:primaryType")]
                    pub jcr_colon_primary_type: String,
                #[serde(rename = ":name")]
                    pub colon_name: String,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostQueryQueryParams {
                #[serde(rename = "path")]
                    pub path: String,
                #[serde(rename = "p.limit")]
                    pub p_limit: f64,
                #[serde(rename = "1_property")]
                    pub param_1_property: String,
                #[serde(rename = "1_property.value")]
                    pub param_1_property_value: String,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostTreeActivationQueryParams {
                #[serde(rename = "ignoredeactivated")]
                    pub ignoredeactivated: bool,
                #[serde(rename = "onlymodified")]
                    pub onlymodified: bool,
                #[serde(rename = "path")]
                    pub path: String,
                #[serde(rename = "cmd")]
                    pub cmd: String,
    }


    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct PostTruststoreQueryParams {
                #[serde(rename = ":operation")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub colon_operation: Option<String>,
                #[serde(rename = "newPassword")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub new_password: Option<String>,
                #[serde(rename = "rePassword")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub re_password: Option<String>,
                #[serde(rename = "keyStoreType")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub key_store_type: Option<String>,
                #[serde(rename = "removeAlias")]
                    #[serde(skip_serializing_if="Option::is_none")]
                    pub remove_alias: Option<String>,
    }




#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BundleData {
    /// Bundle ID
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<i32>,

    /// Bundle name
    #[serde(rename = "name")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// Is bundle a fragment
    #[serde(rename = "fragment")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub fragment: Option<bool>,

    /// Numeric raw bundle state value
    #[serde(rename = "stateRaw")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub state_raw: Option<i32>,

    /// Bundle state value
    #[serde(rename = "state")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub state: Option<String>,

    /// Bundle version
    #[serde(rename = "version")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub version: Option<String>,

    /// Bundle symbolic name
    #[serde(rename = "symbolicName")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub symbolic_name: Option<String>,

    /// Bundle category
    #[serde(rename = "category")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub category: Option<String>,

    #[serde(rename = "props")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub props: Option<Vec<models::BundleDataProp>>,

}



impl BundleData {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> BundleData {
        BundleData {
 id: None,
 name: None,
 fragment: None,
 state_raw: None,
 state: None,
 version: None,
 symbolic_name: None,
 category: None,
 props: None,
        }
    }
}

/// Converts the BundleData value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for BundleData {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.id.as_ref().map(|id| {
                [
                    "id".to_string(),
                    id.to_string(),
                ].join(",")
            }),


            self.name.as_ref().map(|name| {
                [
                    "name".to_string(),
                    name.to_string(),
                ].join(",")
            }),


            self.fragment.as_ref().map(|fragment| {
                [
                    "fragment".to_string(),
                    fragment.to_string(),
                ].join(",")
            }),


            self.state_raw.as_ref().map(|state_raw| {
                [
                    "stateRaw".to_string(),
                    state_raw.to_string(),
                ].join(",")
            }),


            self.state.as_ref().map(|state| {
                [
                    "state".to_string(),
                    state.to_string(),
                ].join(",")
            }),


            self.version.as_ref().map(|version| {
                [
                    "version".to_string(),
                    version.to_string(),
                ].join(",")
            }),


            self.symbolic_name.as_ref().map(|symbolic_name| {
                [
                    "symbolicName".to_string(),
                    symbolic_name.to_string(),
                ].join(",")
            }),


            self.category.as_ref().map(|category| {
                [
                    "category".to_string(),
                    category.to_string(),
                ].join(",")
            }),

            // Skipping props in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BundleData value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for BundleData {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub id: Vec<i32>,
            pub name: Vec<String>,
            pub fragment: Vec<bool>,
            pub state_raw: Vec<i32>,
            pub state: Vec<String>,
            pub version: Vec<String>,
            pub symbolic_name: Vec<String>,
            pub category: Vec<String>,
            pub props: Vec<Vec<models::BundleDataProp>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing BundleData".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "fragment" => intermediate_rep.fragment.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "stateRaw" => intermediate_rep.state_raw.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "state" => intermediate_rep.state.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "version" => intermediate_rep.version.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "symbolicName" => intermediate_rep.symbolic_name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "category" => intermediate_rep.category.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "props" => return std::result::Result::Err("Parsing a container in this style is not supported in BundleData".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing BundleData".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(BundleData {
            id: intermediate_rep.id.into_iter().next(),
            name: intermediate_rep.name.into_iter().next(),
            fragment: intermediate_rep.fragment.into_iter().next(),
            state_raw: intermediate_rep.state_raw.into_iter().next(),
            state: intermediate_rep.state.into_iter().next(),
            version: intermediate_rep.version.into_iter().next(),
            symbolic_name: intermediate_rep.symbolic_name.into_iter().next(),
            category: intermediate_rep.category.into_iter().next(),
            props: intermediate_rep.props.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<BundleData> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<BundleData>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BundleData>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for BundleData - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<BundleData> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <BundleData as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into BundleData - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BundleDataProp {
    /// Bundle data key
    #[serde(rename = "key")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub key: Option<String>,

    /// Bundle data value
    #[serde(rename = "value")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<String>,

}



impl BundleDataProp {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> BundleDataProp {
        BundleDataProp {
 key: None,
 value: None,
        }
    }
}

/// Converts the BundleDataProp value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for BundleDataProp {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.key.as_ref().map(|key| {
                [
                    "key".to_string(),
                    key.to_string(),
                ].join(",")
            }),


            self.value.as_ref().map(|value| {
                [
                    "value".to_string(),
                    value.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BundleDataProp value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for BundleDataProp {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub key: Vec<String>,
            pub value: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing BundleDataProp".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "key" => intermediate_rep.key.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "value" => intermediate_rep.value.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing BundleDataProp".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(BundleDataProp {
            key: intermediate_rep.key.into_iter().next(),
            value: intermediate_rep.value.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<BundleDataProp> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<BundleDataProp>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BundleDataProp>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for BundleDataProp - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<BundleDataProp> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <BundleDataProp as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into BundleDataProp - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BundleInfo {
    /// Status description of all bundles
    #[serde(rename = "status")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status: Option<String>,

    #[serde(rename = "s")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub s: Option<Vec<i32>>,

    #[serde(rename = "data")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data: Option<Vec<models::BundleData>>,

}



impl BundleInfo {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> BundleInfo {
        BundleInfo {
 status: None,
 s: None,
 data: None,
        }
    }
}

/// Converts the BundleInfo value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for BundleInfo {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.status.as_ref().map(|status| {
                [
                    "status".to_string(),
                    status.to_string(),
                ].join(",")
            }),


            self.s.as_ref().map(|s| {
                [
                    "s".to_string(),
                    s.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(","),
                ].join(",")
            }),

            // Skipping data in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BundleInfo value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for BundleInfo {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub status: Vec<String>,
            pub s: Vec<Vec<i32>>,
            pub data: Vec<Vec<models::BundleData>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing BundleInfo".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "status" => intermediate_rep.status.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "s" => return std::result::Result::Err("Parsing a container in this style is not supported in BundleInfo".to_string()),
                    "data" => return std::result::Result::Err("Parsing a container in this style is not supported in BundleInfo".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing BundleInfo".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(BundleInfo {
            status: intermediate_rep.status.into_iter().next(),
            s: intermediate_rep.s.into_iter().next(),
            data: intermediate_rep.data.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<BundleInfo> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<BundleInfo>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BundleInfo>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for BundleInfo - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<BundleInfo> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <BundleInfo as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into BundleInfo - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct InstallStatus {
    #[serde(rename = "status")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status: Option<models::InstallStatusStatus>,

}



impl InstallStatus {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> InstallStatus {
        InstallStatus {
 status: None,
        }
    }
}

/// Converts the InstallStatus value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for InstallStatus {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping status in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a InstallStatus value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for InstallStatus {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub status: Vec<models::InstallStatusStatus>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing InstallStatus".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "status" => intermediate_rep.status.push(<models::InstallStatusStatus as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing InstallStatus".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(InstallStatus {
            status: intermediate_rep.status.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<InstallStatus> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<InstallStatus>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<InstallStatus>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for InstallStatus - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<InstallStatus> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <InstallStatus as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into InstallStatus - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct InstallStatusStatus {
    #[serde(rename = "finished")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub finished: Option<bool>,

    #[serde(rename = "itemCount")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub item_count: Option<i32>,

}



impl InstallStatusStatus {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> InstallStatusStatus {
        InstallStatusStatus {
 finished: None,
 item_count: None,
        }
    }
}

/// Converts the InstallStatusStatus value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for InstallStatusStatus {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.finished.as_ref().map(|finished| {
                [
                    "finished".to_string(),
                    finished.to_string(),
                ].join(",")
            }),


            self.item_count.as_ref().map(|item_count| {
                [
                    "itemCount".to_string(),
                    item_count.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a InstallStatusStatus value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for InstallStatusStatus {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub finished: Vec<bool>,
            pub item_count: Vec<i32>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing InstallStatusStatus".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "finished" => intermediate_rep.finished.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "itemCount" => intermediate_rep.item_count.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing InstallStatusStatus".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(InstallStatusStatus {
            finished: intermediate_rep.finished.into_iter().next(),
            item_count: intermediate_rep.item_count.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<InstallStatusStatus> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<InstallStatusStatus>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<InstallStatusStatus>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for InstallStatusStatus - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<InstallStatusStatus> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <InstallStatusStatus as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into InstallStatusStatus - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct KeystoreChainItems {
    /// e.g. \"CN=localhost\"
    #[serde(rename = "subject")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subject: Option<String>,

    /// e.g. \"CN=Admin\"
    #[serde(rename = "issuer")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub issuer: Option<String>,

    /// e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
    #[serde(rename = "notBefore")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub not_before: Option<String>,

    /// e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
    #[serde(rename = "notAfter")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub not_after: Option<String>,

    /// 18165099476682912368
    #[serde(rename = "serialNumber")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub serial_number: Option<i32>,

}



impl KeystoreChainItems {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> KeystoreChainItems {
        KeystoreChainItems {
 subject: None,
 issuer: None,
 not_before: None,
 not_after: None,
 serial_number: None,
        }
    }
}

/// Converts the KeystoreChainItems value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for KeystoreChainItems {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.subject.as_ref().map(|subject| {
                [
                    "subject".to_string(),
                    subject.to_string(),
                ].join(",")
            }),


            self.issuer.as_ref().map(|issuer| {
                [
                    "issuer".to_string(),
                    issuer.to_string(),
                ].join(",")
            }),


            self.not_before.as_ref().map(|not_before| {
                [
                    "notBefore".to_string(),
                    not_before.to_string(),
                ].join(",")
            }),


            self.not_after.as_ref().map(|not_after| {
                [
                    "notAfter".to_string(),
                    not_after.to_string(),
                ].join(",")
            }),


            self.serial_number.as_ref().map(|serial_number| {
                [
                    "serialNumber".to_string(),
                    serial_number.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a KeystoreChainItems value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for KeystoreChainItems {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub subject: Vec<String>,
            pub issuer: Vec<String>,
            pub not_before: Vec<String>,
            pub not_after: Vec<String>,
            pub serial_number: Vec<i32>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing KeystoreChainItems".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "subject" => intermediate_rep.subject.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "issuer" => intermediate_rep.issuer.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "notBefore" => intermediate_rep.not_before.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "notAfter" => intermediate_rep.not_after.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "serialNumber" => intermediate_rep.serial_number.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing KeystoreChainItems".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(KeystoreChainItems {
            subject: intermediate_rep.subject.into_iter().next(),
            issuer: intermediate_rep.issuer.into_iter().next(),
            not_before: intermediate_rep.not_before.into_iter().next(),
            not_after: intermediate_rep.not_after.into_iter().next(),
            serial_number: intermediate_rep.serial_number.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<KeystoreChainItems> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<KeystoreChainItems>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<KeystoreChainItems>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for KeystoreChainItems - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<KeystoreChainItems> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <KeystoreChainItems as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into KeystoreChainItems - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct KeystoreInfo {
    #[serde(rename = "aliases")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub aliases: Option<Vec<models::KeystoreItems>>,

    /// False if truststore don't exist
    #[serde(rename = "exists")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub exists: Option<bool>,

}



impl KeystoreInfo {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> KeystoreInfo {
        KeystoreInfo {
 aliases: None,
 exists: None,
        }
    }
}

/// Converts the KeystoreInfo value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for KeystoreInfo {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping aliases in query parameter serialization


            self.exists.as_ref().map(|exists| {
                [
                    "exists".to_string(),
                    exists.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a KeystoreInfo value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for KeystoreInfo {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub aliases: Vec<Vec<models::KeystoreItems>>,
            pub exists: Vec<bool>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing KeystoreInfo".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    "aliases" => return std::result::Result::Err("Parsing a container in this style is not supported in KeystoreInfo".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "exists" => intermediate_rep.exists.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing KeystoreInfo".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(KeystoreInfo {
            aliases: intermediate_rep.aliases.into_iter().next(),
            exists: intermediate_rep.exists.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<KeystoreInfo> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<KeystoreInfo>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<KeystoreInfo>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for KeystoreInfo - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<KeystoreInfo> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <KeystoreInfo as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into KeystoreInfo - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct KeystoreItems {
    /// Keystore alias name
    #[serde(rename = "alias")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub alias: Option<String>,

    /// e.g. \"privateKey\"
    #[serde(rename = "entryType")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub entry_type: Option<String>,

    /// e.g. \"RSA\"
    #[serde(rename = "algorithm")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub algorithm: Option<String>,

    /// e.g. \"PKCS#8\"
    #[serde(rename = "format")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub format: Option<String>,

    #[serde(rename = "chain")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub chain: Option<Vec<models::KeystoreChainItems>>,

}



impl KeystoreItems {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> KeystoreItems {
        KeystoreItems {
 alias: None,
 entry_type: None,
 algorithm: None,
 format: None,
 chain: None,
        }
    }
}

/// Converts the KeystoreItems value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for KeystoreItems {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.alias.as_ref().map(|alias| {
                [
                    "alias".to_string(),
                    alias.to_string(),
                ].join(",")
            }),


            self.entry_type.as_ref().map(|entry_type| {
                [
                    "entryType".to_string(),
                    entry_type.to_string(),
                ].join(",")
            }),


            self.algorithm.as_ref().map(|algorithm| {
                [
                    "algorithm".to_string(),
                    algorithm.to_string(),
                ].join(",")
            }),


            self.format.as_ref().map(|format| {
                [
                    "format".to_string(),
                    format.to_string(),
                ].join(",")
            }),

            // Skipping chain in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a KeystoreItems value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for KeystoreItems {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub alias: Vec<String>,
            pub entry_type: Vec<String>,
            pub algorithm: Vec<String>,
            pub format: Vec<String>,
            pub chain: Vec<Vec<models::KeystoreChainItems>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing KeystoreItems".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "alias" => intermediate_rep.alias.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "entryType" => intermediate_rep.entry_type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "algorithm" => intermediate_rep.algorithm.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "format" => intermediate_rep.format.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "chain" => return std::result::Result::Err("Parsing a container in this style is not supported in KeystoreItems".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing KeystoreItems".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(KeystoreItems {
            alias: intermediate_rep.alias.into_iter().next(),
            entry_type: intermediate_rep.entry_type.into_iter().next(),
            algorithm: intermediate_rep.algorithm.into_iter().next(),
            format: intermediate_rep.format.into_iter().next(),
            chain: intermediate_rep.chain.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<KeystoreItems> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<KeystoreItems>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<KeystoreItems>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for KeystoreItems - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<KeystoreItems> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <KeystoreItems as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into KeystoreItems - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct SamlConfigurationInfo {
    /// Persistent Identity (PID)
    #[serde(rename = "pid")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub pid: Option<String>,

    /// Title
    #[serde(rename = "title")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub title: Option<String>,

    /// Title
    #[serde(rename = "description")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

    /// needed for configuration binding
    #[serde(rename = "bundle_location")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub bundle_location: Option<String>,

    /// needed for configuraiton binding
    #[serde(rename = "service_location")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub service_location: Option<String>,

    #[serde(rename = "properties")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub properties: Option<models::SamlConfigurationProperties>,

}



impl SamlConfigurationInfo {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> SamlConfigurationInfo {
        SamlConfigurationInfo {
 pid: None,
 title: None,
 description: None,
 bundle_location: None,
 service_location: None,
 properties: None,
        }
    }
}

/// Converts the SamlConfigurationInfo value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for SamlConfigurationInfo {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.pid.as_ref().map(|pid| {
                [
                    "pid".to_string(),
                    pid.to_string(),
                ].join(",")
            }),


            self.title.as_ref().map(|title| {
                [
                    "title".to_string(),
                    title.to_string(),
                ].join(",")
            }),


            self.description.as_ref().map(|description| {
                [
                    "description".to_string(),
                    description.to_string(),
                ].join(",")
            }),


            self.bundle_location.as_ref().map(|bundle_location| {
                [
                    "bundle_location".to_string(),
                    bundle_location.to_string(),
                ].join(",")
            }),


            self.service_location.as_ref().map(|service_location| {
                [
                    "service_location".to_string(),
                    service_location.to_string(),
                ].join(",")
            }),

            // Skipping properties in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a SamlConfigurationInfo value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for SamlConfigurationInfo {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub pid: Vec<String>,
            pub title: Vec<String>,
            pub description: Vec<String>,
            pub bundle_location: Vec<String>,
            pub service_location: Vec<String>,
            pub properties: Vec<models::SamlConfigurationProperties>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing SamlConfigurationInfo".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "pid" => intermediate_rep.pid.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "title" => intermediate_rep.title.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "bundle_location" => intermediate_rep.bundle_location.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "service_location" => intermediate_rep.service_location.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "properties" => intermediate_rep.properties.push(<models::SamlConfigurationProperties as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing SamlConfigurationInfo".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(SamlConfigurationInfo {
            pid: intermediate_rep.pid.into_iter().next(),
            title: intermediate_rep.title.into_iter().next(),
            description: intermediate_rep.description.into_iter().next(),
            bundle_location: intermediate_rep.bundle_location.into_iter().next(),
            service_location: intermediate_rep.service_location.into_iter().next(),
            properties: intermediate_rep.properties.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<SamlConfigurationInfo> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<SamlConfigurationInfo>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<SamlConfigurationInfo>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for SamlConfigurationInfo - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<SamlConfigurationInfo> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <SamlConfigurationInfo as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into SamlConfigurationInfo - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct SamlConfigurationProperties {
    #[serde(rename = "path")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub path: Option<models::SamlConfigurationPropertyItemsArray>,

    #[serde(rename = "service.ranking")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub service_ranking: Option<models::SamlConfigurationPropertyItemsLong>,

    #[serde(rename = "idpUrl")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub idp_url: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "idpCertAlias")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub idp_cert_alias: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "idpHttpRedirect")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub idp_http_redirect: Option<models::SamlConfigurationPropertyItemsBoolean>,

    #[serde(rename = "serviceProviderEntityId")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub service_provider_entity_id: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "assertionConsumerServiceURL")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub assertion_consumer_service_url: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "spPrivateKeyAlias")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sp_private_key_alias: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "keyStorePassword")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub key_store_password: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "defaultRedirectUrl")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_redirect_url: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "userIDAttribute")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_id_attribute: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "useEncryption")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub use_encryption: Option<models::SamlConfigurationPropertyItemsBoolean>,

    #[serde(rename = "createUser")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub create_user: Option<models::SamlConfigurationPropertyItemsBoolean>,

    #[serde(rename = "addGroupMemberships")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub add_group_memberships: Option<models::SamlConfigurationPropertyItemsBoolean>,

    #[serde(rename = "groupMembershipAttribute")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_membership_attribute: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "defaultGroups")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_groups: Option<models::SamlConfigurationPropertyItemsArray>,

    #[serde(rename = "nameIdFormat")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name_id_format: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "synchronizeAttributes")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub synchronize_attributes: Option<models::SamlConfigurationPropertyItemsArray>,

    #[serde(rename = "handleLogout")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub handle_logout: Option<models::SamlConfigurationPropertyItemsBoolean>,

    #[serde(rename = "logoutUrl")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub logout_url: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "clockTolerance")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub clock_tolerance: Option<models::SamlConfigurationPropertyItemsLong>,

    #[serde(rename = "digestMethod")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub digest_method: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "signatureMethod")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub signature_method: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "userIntermediatePath")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_intermediate_path: Option<models::SamlConfigurationPropertyItemsString>,

}



impl SamlConfigurationProperties {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
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

/// Converts the SamlConfigurationProperties value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for SamlConfigurationProperties {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping path in query parameter serialization

            // Skipping service.ranking in query parameter serialization

            // Skipping idpUrl in query parameter serialization

            // Skipping idpCertAlias in query parameter serialization

            // Skipping idpHttpRedirect in query parameter serialization

            // Skipping serviceProviderEntityId in query parameter serialization

            // Skipping assertionConsumerServiceURL in query parameter serialization

            // Skipping spPrivateKeyAlias in query parameter serialization

            // Skipping keyStorePassword in query parameter serialization

            // Skipping defaultRedirectUrl in query parameter serialization

            // Skipping userIDAttribute in query parameter serialization

            // Skipping useEncryption in query parameter serialization

            // Skipping createUser in query parameter serialization

            // Skipping addGroupMemberships in query parameter serialization

            // Skipping groupMembershipAttribute in query parameter serialization

            // Skipping defaultGroups in query parameter serialization

            // Skipping nameIdFormat in query parameter serialization

            // Skipping synchronizeAttributes in query parameter serialization

            // Skipping handleLogout in query parameter serialization

            // Skipping logoutUrl in query parameter serialization

            // Skipping clockTolerance in query parameter serialization

            // Skipping digestMethod in query parameter serialization

            // Skipping signatureMethod in query parameter serialization

            // Skipping userIntermediatePath in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a SamlConfigurationProperties value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for SamlConfigurationProperties {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub path: Vec<models::SamlConfigurationPropertyItemsArray>,
            pub service_ranking: Vec<models::SamlConfigurationPropertyItemsLong>,
            pub idp_url: Vec<models::SamlConfigurationPropertyItemsString>,
            pub idp_cert_alias: Vec<models::SamlConfigurationPropertyItemsString>,
            pub idp_http_redirect: Vec<models::SamlConfigurationPropertyItemsBoolean>,
            pub service_provider_entity_id: Vec<models::SamlConfigurationPropertyItemsString>,
            pub assertion_consumer_service_url: Vec<models::SamlConfigurationPropertyItemsString>,
            pub sp_private_key_alias: Vec<models::SamlConfigurationPropertyItemsString>,
            pub key_store_password: Vec<models::SamlConfigurationPropertyItemsString>,
            pub default_redirect_url: Vec<models::SamlConfigurationPropertyItemsString>,
            pub user_id_attribute: Vec<models::SamlConfigurationPropertyItemsString>,
            pub use_encryption: Vec<models::SamlConfigurationPropertyItemsBoolean>,
            pub create_user: Vec<models::SamlConfigurationPropertyItemsBoolean>,
            pub add_group_memberships: Vec<models::SamlConfigurationPropertyItemsBoolean>,
            pub group_membership_attribute: Vec<models::SamlConfigurationPropertyItemsString>,
            pub default_groups: Vec<models::SamlConfigurationPropertyItemsArray>,
            pub name_id_format: Vec<models::SamlConfigurationPropertyItemsString>,
            pub synchronize_attributes: Vec<models::SamlConfigurationPropertyItemsArray>,
            pub handle_logout: Vec<models::SamlConfigurationPropertyItemsBoolean>,
            pub logout_url: Vec<models::SamlConfigurationPropertyItemsString>,
            pub clock_tolerance: Vec<models::SamlConfigurationPropertyItemsLong>,
            pub digest_method: Vec<models::SamlConfigurationPropertyItemsString>,
            pub signature_method: Vec<models::SamlConfigurationPropertyItemsString>,
            pub user_intermediate_path: Vec<models::SamlConfigurationPropertyItemsString>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing SamlConfigurationProperties".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "path" => intermediate_rep.path.push(<models::SamlConfigurationPropertyItemsArray as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "service.ranking" => intermediate_rep.service_ranking.push(<models::SamlConfigurationPropertyItemsLong as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "idpUrl" => intermediate_rep.idp_url.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "idpCertAlias" => intermediate_rep.idp_cert_alias.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "idpHttpRedirect" => intermediate_rep.idp_http_redirect.push(<models::SamlConfigurationPropertyItemsBoolean as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "serviceProviderEntityId" => intermediate_rep.service_provider_entity_id.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "assertionConsumerServiceURL" => intermediate_rep.assertion_consumer_service_url.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "spPrivateKeyAlias" => intermediate_rep.sp_private_key_alias.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "keyStorePassword" => intermediate_rep.key_store_password.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "defaultRedirectUrl" => intermediate_rep.default_redirect_url.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "userIDAttribute" => intermediate_rep.user_id_attribute.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "useEncryption" => intermediate_rep.use_encryption.push(<models::SamlConfigurationPropertyItemsBoolean as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "createUser" => intermediate_rep.create_user.push(<models::SamlConfigurationPropertyItemsBoolean as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "addGroupMemberships" => intermediate_rep.add_group_memberships.push(<models::SamlConfigurationPropertyItemsBoolean as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "groupMembershipAttribute" => intermediate_rep.group_membership_attribute.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "defaultGroups" => intermediate_rep.default_groups.push(<models::SamlConfigurationPropertyItemsArray as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "nameIdFormat" => intermediate_rep.name_id_format.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "synchronizeAttributes" => intermediate_rep.synchronize_attributes.push(<models::SamlConfigurationPropertyItemsArray as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "handleLogout" => intermediate_rep.handle_logout.push(<models::SamlConfigurationPropertyItemsBoolean as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "logoutUrl" => intermediate_rep.logout_url.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "clockTolerance" => intermediate_rep.clock_tolerance.push(<models::SamlConfigurationPropertyItemsLong as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "digestMethod" => intermediate_rep.digest_method.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "signatureMethod" => intermediate_rep.signature_method.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "userIntermediatePath" => intermediate_rep.user_intermediate_path.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing SamlConfigurationProperties".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(SamlConfigurationProperties {
            path: intermediate_rep.path.into_iter().next(),
            service_ranking: intermediate_rep.service_ranking.into_iter().next(),
            idp_url: intermediate_rep.idp_url.into_iter().next(),
            idp_cert_alias: intermediate_rep.idp_cert_alias.into_iter().next(),
            idp_http_redirect: intermediate_rep.idp_http_redirect.into_iter().next(),
            service_provider_entity_id: intermediate_rep.service_provider_entity_id.into_iter().next(),
            assertion_consumer_service_url: intermediate_rep.assertion_consumer_service_url.into_iter().next(),
            sp_private_key_alias: intermediate_rep.sp_private_key_alias.into_iter().next(),
            key_store_password: intermediate_rep.key_store_password.into_iter().next(),
            default_redirect_url: intermediate_rep.default_redirect_url.into_iter().next(),
            user_id_attribute: intermediate_rep.user_id_attribute.into_iter().next(),
            use_encryption: intermediate_rep.use_encryption.into_iter().next(),
            create_user: intermediate_rep.create_user.into_iter().next(),
            add_group_memberships: intermediate_rep.add_group_memberships.into_iter().next(),
            group_membership_attribute: intermediate_rep.group_membership_attribute.into_iter().next(),
            default_groups: intermediate_rep.default_groups.into_iter().next(),
            name_id_format: intermediate_rep.name_id_format.into_iter().next(),
            synchronize_attributes: intermediate_rep.synchronize_attributes.into_iter().next(),
            handle_logout: intermediate_rep.handle_logout.into_iter().next(),
            logout_url: intermediate_rep.logout_url.into_iter().next(),
            clock_tolerance: intermediate_rep.clock_tolerance.into_iter().next(),
            digest_method: intermediate_rep.digest_method.into_iter().next(),
            signature_method: intermediate_rep.signature_method.into_iter().next(),
            user_intermediate_path: intermediate_rep.user_intermediate_path.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<SamlConfigurationProperties> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<SamlConfigurationProperties>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<SamlConfigurationProperties>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for SamlConfigurationProperties - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<SamlConfigurationProperties> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <SamlConfigurationProperties as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into SamlConfigurationProperties - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct SamlConfigurationPropertyItemsArray {
    /// property name
    #[serde(rename = "name")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// True if optional
    #[serde(rename = "optional")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub optional: Option<bool>,

    /// True if property is set
    #[serde(rename = "is_set")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_set: Option<bool>,

    /// Property type, 1=String, 3=long, 11=boolean, 12=Password
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub r_type: Option<i32>,

    /// Property value
    #[serde(rename = "values")]
          #[validate(custom(function = "check_xss_vec_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub values: Option<Vec<String>>,

    /// Property description
    #[serde(rename = "description")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

}



impl SamlConfigurationPropertyItemsArray {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> SamlConfigurationPropertyItemsArray {
        SamlConfigurationPropertyItemsArray {
 name: None,
 optional: None,
 is_set: None,
 r_type: None,
 values: None,
 description: None,
        }
    }
}

/// Converts the SamlConfigurationPropertyItemsArray value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for SamlConfigurationPropertyItemsArray {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.name.as_ref().map(|name| {
                [
                    "name".to_string(),
                    name.to_string(),
                ].join(",")
            }),


            self.optional.as_ref().map(|optional| {
                [
                    "optional".to_string(),
                    optional.to_string(),
                ].join(",")
            }),


            self.is_set.as_ref().map(|is_set| {
                [
                    "is_set".to_string(),
                    is_set.to_string(),
                ].join(",")
            }),


            self.r_type.as_ref().map(|r_type| {
                [
                    "type".to_string(),
                    r_type.to_string(),
                ].join(",")
            }),


            self.values.as_ref().map(|values| {
                [
                    "values".to_string(),
                    values.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(","),
                ].join(",")
            }),


            self.description.as_ref().map(|description| {
                [
                    "description".to_string(),
                    description.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a SamlConfigurationPropertyItemsArray value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for SamlConfigurationPropertyItemsArray {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub name: Vec<String>,
            pub optional: Vec<bool>,
            pub is_set: Vec<bool>,
            pub r_type: Vec<i32>,
            pub values: Vec<Vec<String>>,
            pub description: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing SamlConfigurationPropertyItemsArray".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "optional" => intermediate_rep.optional.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "is_set" => intermediate_rep.is_set.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r_type.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "values" => return std::result::Result::Err("Parsing a container in this style is not supported in SamlConfigurationPropertyItemsArray".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing SamlConfigurationPropertyItemsArray".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(SamlConfigurationPropertyItemsArray {
            name: intermediate_rep.name.into_iter().next(),
            optional: intermediate_rep.optional.into_iter().next(),
            is_set: intermediate_rep.is_set.into_iter().next(),
            r_type: intermediate_rep.r_type.into_iter().next(),
            values: intermediate_rep.values.into_iter().next(),
            description: intermediate_rep.description.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<SamlConfigurationPropertyItemsArray> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<SamlConfigurationPropertyItemsArray>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<SamlConfigurationPropertyItemsArray>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for SamlConfigurationPropertyItemsArray - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<SamlConfigurationPropertyItemsArray> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <SamlConfigurationPropertyItemsArray as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into SamlConfigurationPropertyItemsArray - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct SamlConfigurationPropertyItemsBoolean {
    /// property name
    #[serde(rename = "name")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// True if optional
    #[serde(rename = "optional")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub optional: Option<bool>,

    /// True if property is set
    #[serde(rename = "is_set")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_set: Option<bool>,

    /// Property type, 1=String, 3=long, 11=boolean, 12=Password
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub r_type: Option<i32>,

    /// Property value
    #[serde(rename = "value")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<bool>,

    /// Property description
    #[serde(rename = "description")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

}



impl SamlConfigurationPropertyItemsBoolean {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> SamlConfigurationPropertyItemsBoolean {
        SamlConfigurationPropertyItemsBoolean {
 name: None,
 optional: None,
 is_set: None,
 r_type: None,
 value: None,
 description: None,
        }
    }
}

/// Converts the SamlConfigurationPropertyItemsBoolean value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for SamlConfigurationPropertyItemsBoolean {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.name.as_ref().map(|name| {
                [
                    "name".to_string(),
                    name.to_string(),
                ].join(",")
            }),


            self.optional.as_ref().map(|optional| {
                [
                    "optional".to_string(),
                    optional.to_string(),
                ].join(",")
            }),


            self.is_set.as_ref().map(|is_set| {
                [
                    "is_set".to_string(),
                    is_set.to_string(),
                ].join(",")
            }),


            self.r_type.as_ref().map(|r_type| {
                [
                    "type".to_string(),
                    r_type.to_string(),
                ].join(",")
            }),


            self.value.as_ref().map(|value| {
                [
                    "value".to_string(),
                    value.to_string(),
                ].join(",")
            }),


            self.description.as_ref().map(|description| {
                [
                    "description".to_string(),
                    description.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a SamlConfigurationPropertyItemsBoolean value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for SamlConfigurationPropertyItemsBoolean {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub name: Vec<String>,
            pub optional: Vec<bool>,
            pub is_set: Vec<bool>,
            pub r_type: Vec<i32>,
            pub value: Vec<bool>,
            pub description: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing SamlConfigurationPropertyItemsBoolean".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "optional" => intermediate_rep.optional.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "is_set" => intermediate_rep.is_set.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r_type.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "value" => intermediate_rep.value.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing SamlConfigurationPropertyItemsBoolean".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(SamlConfigurationPropertyItemsBoolean {
            name: intermediate_rep.name.into_iter().next(),
            optional: intermediate_rep.optional.into_iter().next(),
            is_set: intermediate_rep.is_set.into_iter().next(),
            r_type: intermediate_rep.r_type.into_iter().next(),
            value: intermediate_rep.value.into_iter().next(),
            description: intermediate_rep.description.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<SamlConfigurationPropertyItemsBoolean> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<SamlConfigurationPropertyItemsBoolean>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<SamlConfigurationPropertyItemsBoolean>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for SamlConfigurationPropertyItemsBoolean - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<SamlConfigurationPropertyItemsBoolean> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <SamlConfigurationPropertyItemsBoolean as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into SamlConfigurationPropertyItemsBoolean - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct SamlConfigurationPropertyItemsLong {
    /// property name
    #[serde(rename = "name")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// True if optional
    #[serde(rename = "optional")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub optional: Option<bool>,

    /// True if property is set
    #[serde(rename = "is_set")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_set: Option<bool>,

    /// Property type, 1=String, 3=long, 11=boolean, 12=Password
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub r_type: Option<i32>,

    /// Property value
    #[serde(rename = "value")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<i32>,

    /// Property description
    #[serde(rename = "description")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

}



impl SamlConfigurationPropertyItemsLong {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> SamlConfigurationPropertyItemsLong {
        SamlConfigurationPropertyItemsLong {
 name: None,
 optional: None,
 is_set: None,
 r_type: None,
 value: None,
 description: None,
        }
    }
}

/// Converts the SamlConfigurationPropertyItemsLong value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for SamlConfigurationPropertyItemsLong {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.name.as_ref().map(|name| {
                [
                    "name".to_string(),
                    name.to_string(),
                ].join(",")
            }),


            self.optional.as_ref().map(|optional| {
                [
                    "optional".to_string(),
                    optional.to_string(),
                ].join(",")
            }),


            self.is_set.as_ref().map(|is_set| {
                [
                    "is_set".to_string(),
                    is_set.to_string(),
                ].join(",")
            }),


            self.r_type.as_ref().map(|r_type| {
                [
                    "type".to_string(),
                    r_type.to_string(),
                ].join(",")
            }),


            self.value.as_ref().map(|value| {
                [
                    "value".to_string(),
                    value.to_string(),
                ].join(",")
            }),


            self.description.as_ref().map(|description| {
                [
                    "description".to_string(),
                    description.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a SamlConfigurationPropertyItemsLong value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for SamlConfigurationPropertyItemsLong {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub name: Vec<String>,
            pub optional: Vec<bool>,
            pub is_set: Vec<bool>,
            pub r_type: Vec<i32>,
            pub value: Vec<i32>,
            pub description: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing SamlConfigurationPropertyItemsLong".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "optional" => intermediate_rep.optional.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "is_set" => intermediate_rep.is_set.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r_type.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "value" => intermediate_rep.value.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing SamlConfigurationPropertyItemsLong".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(SamlConfigurationPropertyItemsLong {
            name: intermediate_rep.name.into_iter().next(),
            optional: intermediate_rep.optional.into_iter().next(),
            is_set: intermediate_rep.is_set.into_iter().next(),
            r_type: intermediate_rep.r_type.into_iter().next(),
            value: intermediate_rep.value.into_iter().next(),
            description: intermediate_rep.description.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<SamlConfigurationPropertyItemsLong> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<SamlConfigurationPropertyItemsLong>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<SamlConfigurationPropertyItemsLong>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for SamlConfigurationPropertyItemsLong - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<SamlConfigurationPropertyItemsLong> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <SamlConfigurationPropertyItemsLong as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into SamlConfigurationPropertyItemsLong - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct SamlConfigurationPropertyItemsString {
    /// property name
    #[serde(rename = "name")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// True if optional
    #[serde(rename = "optional")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub optional: Option<bool>,

    /// True if property is set
    #[serde(rename = "is_set")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_set: Option<bool>,

    /// Property type, 1=String, 3=long, 11=boolean, 12=Password
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub r_type: Option<i32>,

    /// Property value
    #[serde(rename = "value")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<String>,

    /// Property description
    #[serde(rename = "description")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

}



impl SamlConfigurationPropertyItemsString {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> SamlConfigurationPropertyItemsString {
        SamlConfigurationPropertyItemsString {
 name: None,
 optional: None,
 is_set: None,
 r_type: None,
 value: None,
 description: None,
        }
    }
}

/// Converts the SamlConfigurationPropertyItemsString value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for SamlConfigurationPropertyItemsString {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.name.as_ref().map(|name| {
                [
                    "name".to_string(),
                    name.to_string(),
                ].join(",")
            }),


            self.optional.as_ref().map(|optional| {
                [
                    "optional".to_string(),
                    optional.to_string(),
                ].join(",")
            }),


            self.is_set.as_ref().map(|is_set| {
                [
                    "is_set".to_string(),
                    is_set.to_string(),
                ].join(",")
            }),


            self.r_type.as_ref().map(|r_type| {
                [
                    "type".to_string(),
                    r_type.to_string(),
                ].join(",")
            }),


            self.value.as_ref().map(|value| {
                [
                    "value".to_string(),
                    value.to_string(),
                ].join(",")
            }),


            self.description.as_ref().map(|description| {
                [
                    "description".to_string(),
                    description.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a SamlConfigurationPropertyItemsString value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for SamlConfigurationPropertyItemsString {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub name: Vec<String>,
            pub optional: Vec<bool>,
            pub is_set: Vec<bool>,
            pub r_type: Vec<i32>,
            pub value: Vec<String>,
            pub description: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing SamlConfigurationPropertyItemsString".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "optional" => intermediate_rep.optional.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "is_set" => intermediate_rep.is_set.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r_type.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "value" => intermediate_rep.value.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing SamlConfigurationPropertyItemsString".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(SamlConfigurationPropertyItemsString {
            name: intermediate_rep.name.into_iter().next(),
            optional: intermediate_rep.optional.into_iter().next(),
            is_set: intermediate_rep.is_set.into_iter().next(),
            r_type: intermediate_rep.r_type.into_iter().next(),
            value: intermediate_rep.value.into_iter().next(),
            description: intermediate_rep.description.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<SamlConfigurationPropertyItemsString> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<SamlConfigurationPropertyItemsString>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<SamlConfigurationPropertyItemsString>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for SamlConfigurationPropertyItemsString - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<SamlConfigurationPropertyItemsString> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into SamlConfigurationPropertyItemsString - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct TruststoreInfo {
    #[serde(rename = "aliases")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub aliases: Option<Vec<models::TruststoreItems>>,

    /// False if truststore don't exist
    #[serde(rename = "exists")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub exists: Option<bool>,

}



impl TruststoreInfo {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> TruststoreInfo {
        TruststoreInfo {
 aliases: None,
 exists: None,
        }
    }
}

/// Converts the TruststoreInfo value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for TruststoreInfo {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping aliases in query parameter serialization


            self.exists.as_ref().map(|exists| {
                [
                    "exists".to_string(),
                    exists.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a TruststoreInfo value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for TruststoreInfo {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub aliases: Vec<Vec<models::TruststoreItems>>,
            pub exists: Vec<bool>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing TruststoreInfo".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    "aliases" => return std::result::Result::Err("Parsing a container in this style is not supported in TruststoreInfo".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "exists" => intermediate_rep.exists.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing TruststoreInfo".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(TruststoreInfo {
            aliases: intermediate_rep.aliases.into_iter().next(),
            exists: intermediate_rep.exists.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<TruststoreInfo> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<TruststoreInfo>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<TruststoreInfo>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for TruststoreInfo - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<TruststoreInfo> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <TruststoreInfo as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into TruststoreInfo - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct TruststoreItems {
    /// Truststore alias name
    #[serde(rename = "alias")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub alias: Option<String>,

    #[serde(rename = "entryType")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub entry_type: Option<String>,

    /// e.g. \"CN=localhost\"
    #[serde(rename = "subject")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subject: Option<String>,

    /// e.g. \"CN=Admin\"
    #[serde(rename = "issuer")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub issuer: Option<String>,

    /// e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
    #[serde(rename = "notBefore")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub not_before: Option<String>,

    /// e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
    #[serde(rename = "notAfter")]
          #[validate(custom(function = "check_xss_string"))]
    #[serde(skip_serializing_if="Option::is_none")]
    pub not_after: Option<String>,

    /// 18165099476682912368
    #[serde(rename = "serialNumber")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub serial_number: Option<i32>,

}



impl TruststoreItems {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> TruststoreItems {
        TruststoreItems {
 alias: None,
 entry_type: None,
 subject: None,
 issuer: None,
 not_before: None,
 not_after: None,
 serial_number: None,
        }
    }
}

/// Converts the TruststoreItems value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for TruststoreItems {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.alias.as_ref().map(|alias| {
                [
                    "alias".to_string(),
                    alias.to_string(),
                ].join(",")
            }),


            self.entry_type.as_ref().map(|entry_type| {
                [
                    "entryType".to_string(),
                    entry_type.to_string(),
                ].join(",")
            }),


            self.subject.as_ref().map(|subject| {
                [
                    "subject".to_string(),
                    subject.to_string(),
                ].join(",")
            }),


            self.issuer.as_ref().map(|issuer| {
                [
                    "issuer".to_string(),
                    issuer.to_string(),
                ].join(",")
            }),


            self.not_before.as_ref().map(|not_before| {
                [
                    "notBefore".to_string(),
                    not_before.to_string(),
                ].join(",")
            }),


            self.not_after.as_ref().map(|not_after| {
                [
                    "notAfter".to_string(),
                    not_after.to_string(),
                ].join(",")
            }),


            self.serial_number.as_ref().map(|serial_number| {
                [
                    "serialNumber".to_string(),
                    serial_number.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a TruststoreItems value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for TruststoreItems {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub alias: Vec<String>,
            pub entry_type: Vec<String>,
            pub subject: Vec<String>,
            pub issuer: Vec<String>,
            pub not_before: Vec<String>,
            pub not_after: Vec<String>,
            pub serial_number: Vec<i32>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing TruststoreItems".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "alias" => intermediate_rep.alias.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "entryType" => intermediate_rep.entry_type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "subject" => intermediate_rep.subject.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "issuer" => intermediate_rep.issuer.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "notBefore" => intermediate_rep.not_before.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "notAfter" => intermediate_rep.not_after.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "serialNumber" => intermediate_rep.serial_number.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing TruststoreItems".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(TruststoreItems {
            alias: intermediate_rep.alias.into_iter().next(),
            entry_type: intermediate_rep.entry_type.into_iter().next(),
            subject: intermediate_rep.subject.into_iter().next(),
            issuer: intermediate_rep.issuer.into_iter().next(),
            not_before: intermediate_rep.not_before.into_iter().next(),
            not_after: intermediate_rep.not_after.into_iter().next(),
            serial_number: intermediate_rep.serial_number.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<TruststoreItems> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<TruststoreItems>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<TruststoreItems>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for TruststoreItems - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<TruststoreItems> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <TruststoreItems as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into TruststoreItems - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



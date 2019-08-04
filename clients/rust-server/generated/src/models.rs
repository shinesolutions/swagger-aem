#![allow(unused_imports, unused_qualifications, unused_extern_crates)]
extern crate chrono;
extern crate uuid;


use serde::ser::Serializer;

use std::collections::HashMap;
use models;
use swagger;


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InstallStatus {
    #[serde(rename = "status")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status: Option<models::InstallStatusStatus>,

}

impl InstallStatus {
    pub fn new() -> InstallStatus {
        InstallStatus {
            status: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InstallStatusStatus {
    #[serde(rename = "finished")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub finished: Option<bool>,

    #[serde(rename = "itemCount")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub item_count: Option<i32>,

}

impl InstallStatusStatus {
    pub fn new() -> InstallStatusStatus {
        InstallStatusStatus {
            finished: None,
            item_count: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct KeystoreChainItems {
    /// e.g. \"CN=localhost\"
    #[serde(rename = "subject")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subject: Option<String>,

    /// e.g. \"CN=Admin\"
    #[serde(rename = "issuer")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub issuer: Option<String>,

    /// e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
    #[serde(rename = "notBefore")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub not_before: Option<String>,

    /// e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
    #[serde(rename = "notAfter")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub not_after: Option<String>,

    /// 18165099476682912368
    #[serde(rename = "serialNumber")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub serial_number: Option<i32>,

}

impl KeystoreChainItems {
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

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct KeystoreInfo {
    #[serde(rename = "aliases")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub aliases: Option<Vec<models::KeystoreItems>>,

    /// False if truststore don't exist
    #[serde(rename = "exists")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub exists: Option<bool>,

}

impl KeystoreInfo {
    pub fn new() -> KeystoreInfo {
        KeystoreInfo {
            aliases: None,
            exists: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct KeystoreItems {
    /// Keystore alias name
    #[serde(rename = "alias")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub alias: Option<String>,

    /// e.g. \"privateKey\"
    #[serde(rename = "entryType")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub entry_type: Option<String>,

    /// e.g. \"RSA\"
    #[serde(rename = "algorithm")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub algorithm: Option<String>,

    /// e.g. \"PKCS#8\"
    #[serde(rename = "format")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub format: Option<String>,

    #[serde(rename = "chain")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub chain: Option<Vec<models::KeystoreChainItems>>,

}

impl KeystoreItems {
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

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct SamlConfigurationInfo {
    /// Persistent Identity (PID)
    #[serde(rename = "pid")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub pid: Option<String>,

    /// Title
    #[serde(rename = "title")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub title: Option<String>,

    /// Title
    #[serde(rename = "description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

    /// needed for configuration binding
    #[serde(rename = "bundle_location")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub bundle_location: Option<String>,

    /// needed for configuraiton binding
    #[serde(rename = "service_location")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub service_location: Option<String>,

    #[serde(rename = "properties")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub properties: Option<models::SamlConfigurationProperties>,

}

impl SamlConfigurationInfo {
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

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct SamlConfigurationProperties {
    #[serde(rename = "path")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub path: Option<models::SamlConfigurationPropertyItemsArray>,

    #[serde(rename = "service.ranking")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub service_ranking: Option<models::SamlConfigurationPropertyItemsLong>,

    #[serde(rename = "idpUrl")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub idp_url: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "idpCertAlias")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub idp_cert_alias: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "idpHttpRedirect")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub idp_http_redirect: Option<models::SamlConfigurationPropertyItemsBoolean>,

    #[serde(rename = "serviceProviderEntityId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub service_provider_entity_id: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "assertionConsumerServiceURL")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub assertion_consumer_service_url: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "spPrivateKeyAlias")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sp_private_key_alias: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "keyStorePassword")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub key_store_password: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "defaultRedirectUrl")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_redirect_url: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "userIDAttribute")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_id_attribute: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "useEncryption")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub use_encryption: Option<models::SamlConfigurationPropertyItemsBoolean>,

    #[serde(rename = "createUser")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub create_user: Option<models::SamlConfigurationPropertyItemsBoolean>,

    #[serde(rename = "addGroupMemberships")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub add_group_memberships: Option<models::SamlConfigurationPropertyItemsBoolean>,

    #[serde(rename = "groupMembershipAttribute")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_membership_attribute: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "defaultGroups")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_groups: Option<models::SamlConfigurationPropertyItemsArray>,

    #[serde(rename = "nameIdFormat")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name_id_format: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "synchronizeAttributes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub synchronize_attributes: Option<models::SamlConfigurationPropertyItemsArray>,

    #[serde(rename = "handleLogout")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub handle_logout: Option<models::SamlConfigurationPropertyItemsBoolean>,

    #[serde(rename = "logoutUrl")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub logout_url: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "clockTolerance")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub clock_tolerance: Option<models::SamlConfigurationPropertyItemsLong>,

    #[serde(rename = "digestMethod")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub digest_method: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "signatureMethod")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub signature_method: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "userIntermediatePath")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_intermediate_path: Option<models::SamlConfigurationPropertyItemsString>,

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

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct SamlConfigurationPropertyItemsArray {
    /// property name
    #[serde(rename = "name")]
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
    pub _type: Option<i32>,

    /// Property value
    #[serde(rename = "values")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub values: Option<Vec<String>>,

    /// Property description
    #[serde(rename = "description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

}

impl SamlConfigurationPropertyItemsArray {
    pub fn new() -> SamlConfigurationPropertyItemsArray {
        SamlConfigurationPropertyItemsArray {
            name: None,
            optional: None,
            is_set: None,
            _type: None,
            values: None,
            description: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct SamlConfigurationPropertyItemsBoolean {
    /// property name
    #[serde(rename = "name")]
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
    pub _type: Option<i32>,

    /// Property value
    #[serde(rename = "value")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<bool>,

    /// Property description
    #[serde(rename = "description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

}

impl SamlConfigurationPropertyItemsBoolean {
    pub fn new() -> SamlConfigurationPropertyItemsBoolean {
        SamlConfigurationPropertyItemsBoolean {
            name: None,
            optional: None,
            is_set: None,
            _type: None,
            value: None,
            description: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct SamlConfigurationPropertyItemsLong {
    /// property name
    #[serde(rename = "name")]
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
    pub _type: Option<i32>,

    /// Property value
    #[serde(rename = "value")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<i32>,

    /// Property description
    #[serde(rename = "description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

}

impl SamlConfigurationPropertyItemsLong {
    pub fn new() -> SamlConfigurationPropertyItemsLong {
        SamlConfigurationPropertyItemsLong {
            name: None,
            optional: None,
            is_set: None,
            _type: None,
            value: None,
            description: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct SamlConfigurationPropertyItemsString {
    /// property name
    #[serde(rename = "name")]
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
    pub _type: Option<i32>,

    /// Property value
    #[serde(rename = "value")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<String>,

    /// Property description
    #[serde(rename = "description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

}

impl SamlConfigurationPropertyItemsString {
    pub fn new() -> SamlConfigurationPropertyItemsString {
        SamlConfigurationPropertyItemsString {
            name: None,
            optional: None,
            is_set: None,
            _type: None,
            value: None,
            description: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TruststoreInfo {
    #[serde(rename = "aliases")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub aliases: Option<Vec<models::TruststoreItems>>,

    /// False if truststore don't exist
    #[serde(rename = "exists")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub exists: Option<bool>,

}

impl TruststoreInfo {
    pub fn new() -> TruststoreInfo {
        TruststoreInfo {
            aliases: None,
            exists: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct TruststoreItems {
    /// Truststore alias name
    #[serde(rename = "alias")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub alias: Option<String>,

    #[serde(rename = "entryType")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub entry_type: Option<String>,

    /// e.g. \"CN=localhost\"
    #[serde(rename = "subject")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subject: Option<String>,

    /// e.g. \"CN=Admin\"
    #[serde(rename = "issuer")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub issuer: Option<String>,

    /// e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
    #[serde(rename = "notBefore")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub not_before: Option<String>,

    /// e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
    #[serde(rename = "notAfter")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub not_after: Option<String>,

    /// 18165099476682912368
    #[serde(rename = "serialNumber")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub serial_number: Option<i32>,

}

impl TruststoreItems {
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

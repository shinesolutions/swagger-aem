#![allow(unused_qualifications)]

use crate::models;
#[cfg(any(feature = "client", feature = "server"))]
use crate::header;

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BundleData {
    /// Bundle ID
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<isize>,

    /// Bundle name
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// Is bundle a fragment
    #[serde(rename = "fragment")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub fragment: Option<bool>,

    /// Numeric raw bundle state value
    #[serde(rename = "stateRaw")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub state_raw: Option<isize>,

    /// Bundle state value
    #[serde(rename = "state")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub state: Option<String>,

    /// Bundle version
    #[serde(rename = "version")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub version: Option<String>,

    /// Bundle symbolic name
    #[serde(rename = "symbolicName")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub symbolic_name: Option<String>,

    /// Bundle category
    #[serde(rename = "category")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub category: Option<String>,

    #[serde(rename = "props")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub props: Option<Vec<models::BundleDataProp>>,

}

impl BundleData {
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
impl std::string::ToString for BundleData {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref id) = self.id {
            params.push("id".to_string());
            params.push(id.to_string());
        }


        if let Some(ref name) = self.name {
            params.push("name".to_string());
            params.push(name.to_string());
        }


        if let Some(ref fragment) = self.fragment {
            params.push("fragment".to_string());
            params.push(fragment.to_string());
        }


        if let Some(ref state_raw) = self.state_raw {
            params.push("stateRaw".to_string());
            params.push(state_raw.to_string());
        }


        if let Some(ref state) = self.state {
            params.push("state".to_string());
            params.push(state.to_string());
        }


        if let Some(ref version) = self.version {
            params.push("version".to_string());
            params.push(version.to_string());
        }


        if let Some(ref symbolic_name) = self.symbolic_name {
            params.push("symbolicName".to_string());
            params.push(symbolic_name.to_string());
        }


        if let Some(ref category) = self.category {
            params.push("category".to_string());
            params.push(category.to_string());
        }

        // Skipping props in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BundleData value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for BundleData {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub id: Vec<isize>,
            pub name: Vec<String>,
            pub fragment: Vec<bool>,
            pub state_raw: Vec<isize>,
            pub state: Vec<String>,
            pub version: Vec<String>,
            pub symbolic_name: Vec<String>,
            pub category: Vec<String>,
            pub props: Vec<Vec<models::BundleDataProp>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing BundleData".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "id" => intermediate_rep.id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "fragment" => intermediate_rep.fragment.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "stateRaw" => intermediate_rep.state_raw.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "state" => intermediate_rep.state.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "version" => intermediate_rep.version.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "symbolicName" => intermediate_rep.symbolic_name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "category" => intermediate_rep.category.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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

// Methods for converting between header::IntoHeaderValue<BundleData> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<BundleData>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BundleData>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for BundleData - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<BundleData> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <BundleData as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into BundleData - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl BundleData {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BundleDataProp {
    /// Bundle data key
    #[serde(rename = "key")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub key: Option<String>,

    /// Bundle data value
    #[serde(rename = "value")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<String>,

}

impl BundleDataProp {
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
impl std::string::ToString for BundleDataProp {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref key) = self.key {
            params.push("key".to_string());
            params.push(key.to_string());
        }


        if let Some(ref value) = self.value {
            params.push("value".to_string());
            params.push(value.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BundleDataProp value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for BundleDataProp {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub key: Vec<String>,
            pub value: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing BundleDataProp".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "key" => intermediate_rep.key.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "value" => intermediate_rep.value.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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

// Methods for converting between header::IntoHeaderValue<BundleDataProp> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<BundleDataProp>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BundleDataProp>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for BundleDataProp - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<BundleDataProp> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <BundleDataProp as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into BundleDataProp - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl BundleDataProp {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BundleInfo {
    /// Status description of all bundles
    #[serde(rename = "status")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status: Option<String>,

    #[serde(rename = "s")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub s: Option<Vec<i32>>,

    #[serde(rename = "data")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data: Option<Vec<models::BundleData>>,

}

impl BundleInfo {
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
impl std::string::ToString for BundleInfo {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref status) = self.status {
            params.push("status".to_string());
            params.push(status.to_string());
        }


        if let Some(ref s) = self.s {
            params.push("s".to_string());
            params.push(s.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(",").to_string());
        }

        // Skipping data in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BundleInfo value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for BundleInfo {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub status: Vec<String>,
            pub s: Vec<Vec<i32>>,
            pub data: Vec<Vec<models::BundleData>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing BundleInfo".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "status" => intermediate_rep.status.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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

// Methods for converting between header::IntoHeaderValue<BundleInfo> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<BundleInfo>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BundleInfo>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for BundleInfo - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<BundleInfo> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <BundleInfo as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into BundleInfo - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl BundleInfo {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
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

/// Converts the InstallStatus value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for InstallStatus {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping status in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a InstallStatus value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for InstallStatus {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub status: Vec<models::InstallStatusStatus>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing InstallStatus".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "status" => intermediate_rep.status.push(<models::InstallStatusStatus as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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

// Methods for converting between header::IntoHeaderValue<InstallStatus> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<InstallStatus>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<InstallStatus>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for InstallStatus - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<InstallStatus> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <InstallStatus as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into InstallStatus - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl InstallStatus {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct InstallStatusStatus {
    #[serde(rename = "finished")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub finished: Option<bool>,

    #[serde(rename = "itemCount")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub item_count: Option<isize>,

}

impl InstallStatusStatus {
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
impl std::string::ToString for InstallStatusStatus {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref finished) = self.finished {
            params.push("finished".to_string());
            params.push(finished.to_string());
        }


        if let Some(ref item_count) = self.item_count {
            params.push("itemCount".to_string());
            params.push(item_count.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a InstallStatusStatus value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for InstallStatusStatus {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub finished: Vec<bool>,
            pub item_count: Vec<isize>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing InstallStatusStatus".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "finished" => intermediate_rep.finished.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "itemCount" => intermediate_rep.item_count.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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

// Methods for converting between header::IntoHeaderValue<InstallStatusStatus> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<InstallStatusStatus>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<InstallStatusStatus>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for InstallStatusStatus - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<InstallStatusStatus> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <InstallStatusStatus as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into InstallStatusStatus - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl InstallStatusStatus {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
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
    pub serial_number: Option<isize>,

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

/// Converts the KeystoreChainItems value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for KeystoreChainItems {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref subject) = self.subject {
            params.push("subject".to_string());
            params.push(subject.to_string());
        }


        if let Some(ref issuer) = self.issuer {
            params.push("issuer".to_string());
            params.push(issuer.to_string());
        }


        if let Some(ref not_before) = self.not_before {
            params.push("notBefore".to_string());
            params.push(not_before.to_string());
        }


        if let Some(ref not_after) = self.not_after {
            params.push("notAfter".to_string());
            params.push(not_after.to_string());
        }


        if let Some(ref serial_number) = self.serial_number {
            params.push("serialNumber".to_string());
            params.push(serial_number.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a KeystoreChainItems value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for KeystoreChainItems {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub subject: Vec<String>,
            pub issuer: Vec<String>,
            pub not_before: Vec<String>,
            pub not_after: Vec<String>,
            pub serial_number: Vec<isize>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing KeystoreChainItems".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "subject" => intermediate_rep.subject.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "issuer" => intermediate_rep.issuer.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "notBefore" => intermediate_rep.not_before.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "notAfter" => intermediate_rep.not_after.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "serialNumber" => intermediate_rep.serial_number.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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

// Methods for converting between header::IntoHeaderValue<KeystoreChainItems> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<KeystoreChainItems>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<KeystoreChainItems>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for KeystoreChainItems - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<KeystoreChainItems> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <KeystoreChainItems as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into KeystoreChainItems - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl KeystoreChainItems {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
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

/// Converts the KeystoreInfo value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for KeystoreInfo {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping aliases in query parameter serialization


        if let Some(ref exists) = self.exists {
            params.push("exists".to_string());
            params.push(exists.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a KeystoreInfo value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for KeystoreInfo {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub aliases: Vec<Vec<models::KeystoreItems>>,
            pub exists: Vec<bool>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing KeystoreInfo".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "aliases" => return std::result::Result::Err("Parsing a container in this style is not supported in KeystoreInfo".to_string()),
                    "exists" => intermediate_rep.exists.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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

// Methods for converting between header::IntoHeaderValue<KeystoreInfo> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<KeystoreInfo>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<KeystoreInfo>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for KeystoreInfo - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<KeystoreInfo> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <KeystoreInfo as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into KeystoreInfo - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl KeystoreInfo {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
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

/// Converts the KeystoreItems value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for KeystoreItems {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref alias) = self.alias {
            params.push("alias".to_string());
            params.push(alias.to_string());
        }


        if let Some(ref entry_type) = self.entry_type {
            params.push("entryType".to_string());
            params.push(entry_type.to_string());
        }


        if let Some(ref algorithm) = self.algorithm {
            params.push("algorithm".to_string());
            params.push(algorithm.to_string());
        }


        if let Some(ref format) = self.format {
            params.push("format".to_string());
            params.push(format.to_string());
        }

        // Skipping chain in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a KeystoreItems value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for KeystoreItems {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub alias: Vec<String>,
            pub entry_type: Vec<String>,
            pub algorithm: Vec<String>,
            pub format: Vec<String>,
            pub chain: Vec<Vec<models::KeystoreChainItems>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing KeystoreItems".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "alias" => intermediate_rep.alias.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "entryType" => intermediate_rep.entry_type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "algorithm" => intermediate_rep.algorithm.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "format" => intermediate_rep.format.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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

// Methods for converting between header::IntoHeaderValue<KeystoreItems> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<KeystoreItems>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<KeystoreItems>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for KeystoreItems - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<KeystoreItems> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <KeystoreItems as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into KeystoreItems - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl KeystoreItems {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
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

/// Converts the SamlConfigurationInfo value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for SamlConfigurationInfo {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref pid) = self.pid {
            params.push("pid".to_string());
            params.push(pid.to_string());
        }


        if let Some(ref title) = self.title {
            params.push("title".to_string());
            params.push(title.to_string());
        }


        if let Some(ref description) = self.description {
            params.push("description".to_string());
            params.push(description.to_string());
        }


        if let Some(ref bundle_location) = self.bundle_location {
            params.push("bundle_location".to_string());
            params.push(bundle_location.to_string());
        }


        if let Some(ref service_location) = self.service_location {
            params.push("service_location".to_string());
            params.push(service_location.to_string());
        }

        // Skipping properties in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a SamlConfigurationInfo value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for SamlConfigurationInfo {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
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
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing SamlConfigurationInfo".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "pid" => intermediate_rep.pid.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "title" => intermediate_rep.title.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "bundle_location" => intermediate_rep.bundle_location.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "service_location" => intermediate_rep.service_location.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "properties" => intermediate_rep.properties.push(<models::SamlConfigurationProperties as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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

// Methods for converting between header::IntoHeaderValue<SamlConfigurationInfo> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<SamlConfigurationInfo>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<SamlConfigurationInfo>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for SamlConfigurationInfo - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<SamlConfigurationInfo> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <SamlConfigurationInfo as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into SamlConfigurationInfo - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl SamlConfigurationInfo {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
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

/// Converts the SamlConfigurationProperties value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for SamlConfigurationProperties {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
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

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a SamlConfigurationProperties value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for SamlConfigurationProperties {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
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
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing SamlConfigurationProperties".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "path" => intermediate_rep.path.push(<models::SamlConfigurationPropertyItemsArray as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "service.ranking" => intermediate_rep.service_ranking.push(<models::SamlConfigurationPropertyItemsLong as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "idpUrl" => intermediate_rep.idp_url.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "idpCertAlias" => intermediate_rep.idp_cert_alias.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "idpHttpRedirect" => intermediate_rep.idp_http_redirect.push(<models::SamlConfigurationPropertyItemsBoolean as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "serviceProviderEntityId" => intermediate_rep.service_provider_entity_id.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "assertionConsumerServiceURL" => intermediate_rep.assertion_consumer_service_url.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "spPrivateKeyAlias" => intermediate_rep.sp_private_key_alias.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "keyStorePassword" => intermediate_rep.key_store_password.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "defaultRedirectUrl" => intermediate_rep.default_redirect_url.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "userIDAttribute" => intermediate_rep.user_id_attribute.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "useEncryption" => intermediate_rep.use_encryption.push(<models::SamlConfigurationPropertyItemsBoolean as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "createUser" => intermediate_rep.create_user.push(<models::SamlConfigurationPropertyItemsBoolean as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "addGroupMemberships" => intermediate_rep.add_group_memberships.push(<models::SamlConfigurationPropertyItemsBoolean as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "groupMembershipAttribute" => intermediate_rep.group_membership_attribute.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "defaultGroups" => intermediate_rep.default_groups.push(<models::SamlConfigurationPropertyItemsArray as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "nameIdFormat" => intermediate_rep.name_id_format.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "synchronizeAttributes" => intermediate_rep.synchronize_attributes.push(<models::SamlConfigurationPropertyItemsArray as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "handleLogout" => intermediate_rep.handle_logout.push(<models::SamlConfigurationPropertyItemsBoolean as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "logoutUrl" => intermediate_rep.logout_url.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "clockTolerance" => intermediate_rep.clock_tolerance.push(<models::SamlConfigurationPropertyItemsLong as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "digestMethod" => intermediate_rep.digest_method.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "signatureMethod" => intermediate_rep.signature_method.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "userIntermediatePath" => intermediate_rep.user_intermediate_path.push(<models::SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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

// Methods for converting between header::IntoHeaderValue<SamlConfigurationProperties> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<SamlConfigurationProperties>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<SamlConfigurationProperties>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for SamlConfigurationProperties - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<SamlConfigurationProperties> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <SamlConfigurationProperties as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into SamlConfigurationProperties - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl SamlConfigurationProperties {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
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
    pub type_: Option<isize>,

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
            type_: None,
            values: None,
            description: None,
        }
    }
}

/// Converts the SamlConfigurationPropertyItemsArray value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for SamlConfigurationPropertyItemsArray {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref name) = self.name {
            params.push("name".to_string());
            params.push(name.to_string());
        }


        if let Some(ref optional) = self.optional {
            params.push("optional".to_string());
            params.push(optional.to_string());
        }


        if let Some(ref is_set) = self.is_set {
            params.push("is_set".to_string());
            params.push(is_set.to_string());
        }


        if let Some(ref type_) = self.type_ {
            params.push("type".to_string());
            params.push(type_.to_string());
        }


        if let Some(ref values) = self.values {
            params.push("values".to_string());
            params.push(values.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(",").to_string());
        }


        if let Some(ref description) = self.description {
            params.push("description".to_string());
            params.push(description.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a SamlConfigurationPropertyItemsArray value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for SamlConfigurationPropertyItemsArray {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub name: Vec<String>,
            pub optional: Vec<bool>,
            pub is_set: Vec<bool>,
            pub type_: Vec<isize>,
            pub values: Vec<Vec<String>>,
            pub description: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing SamlConfigurationPropertyItemsArray".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "optional" => intermediate_rep.optional.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "is_set" => intermediate_rep.is_set.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "type" => intermediate_rep.type_.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "values" => return std::result::Result::Err("Parsing a container in this style is not supported in SamlConfigurationPropertyItemsArray".to_string()),
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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
            type_: intermediate_rep.type_.into_iter().next(),
            values: intermediate_rep.values.into_iter().next(),
            description: intermediate_rep.description.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<SamlConfigurationPropertyItemsArray> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<SamlConfigurationPropertyItemsArray>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<SamlConfigurationPropertyItemsArray>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for SamlConfigurationPropertyItemsArray - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<SamlConfigurationPropertyItemsArray> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <SamlConfigurationPropertyItemsArray as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into SamlConfigurationPropertyItemsArray - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl SamlConfigurationPropertyItemsArray {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
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
    pub type_: Option<isize>,

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
            type_: None,
            value: None,
            description: None,
        }
    }
}

/// Converts the SamlConfigurationPropertyItemsBoolean value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for SamlConfigurationPropertyItemsBoolean {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref name) = self.name {
            params.push("name".to_string());
            params.push(name.to_string());
        }


        if let Some(ref optional) = self.optional {
            params.push("optional".to_string());
            params.push(optional.to_string());
        }


        if let Some(ref is_set) = self.is_set {
            params.push("is_set".to_string());
            params.push(is_set.to_string());
        }


        if let Some(ref type_) = self.type_ {
            params.push("type".to_string());
            params.push(type_.to_string());
        }


        if let Some(ref value) = self.value {
            params.push("value".to_string());
            params.push(value.to_string());
        }


        if let Some(ref description) = self.description {
            params.push("description".to_string());
            params.push(description.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a SamlConfigurationPropertyItemsBoolean value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for SamlConfigurationPropertyItemsBoolean {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub name: Vec<String>,
            pub optional: Vec<bool>,
            pub is_set: Vec<bool>,
            pub type_: Vec<isize>,
            pub value: Vec<bool>,
            pub description: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing SamlConfigurationPropertyItemsBoolean".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "optional" => intermediate_rep.optional.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "is_set" => intermediate_rep.is_set.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "type" => intermediate_rep.type_.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "value" => intermediate_rep.value.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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
            type_: intermediate_rep.type_.into_iter().next(),
            value: intermediate_rep.value.into_iter().next(),
            description: intermediate_rep.description.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<SamlConfigurationPropertyItemsBoolean> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<SamlConfigurationPropertyItemsBoolean>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<SamlConfigurationPropertyItemsBoolean>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for SamlConfigurationPropertyItemsBoolean - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<SamlConfigurationPropertyItemsBoolean> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <SamlConfigurationPropertyItemsBoolean as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into SamlConfigurationPropertyItemsBoolean - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl SamlConfigurationPropertyItemsBoolean {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
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
    pub type_: Option<isize>,

    /// Property value
    #[serde(rename = "value")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<isize>,

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
            type_: None,
            value: None,
            description: None,
        }
    }
}

/// Converts the SamlConfigurationPropertyItemsLong value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for SamlConfigurationPropertyItemsLong {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref name) = self.name {
            params.push("name".to_string());
            params.push(name.to_string());
        }


        if let Some(ref optional) = self.optional {
            params.push("optional".to_string());
            params.push(optional.to_string());
        }


        if let Some(ref is_set) = self.is_set {
            params.push("is_set".to_string());
            params.push(is_set.to_string());
        }


        if let Some(ref type_) = self.type_ {
            params.push("type".to_string());
            params.push(type_.to_string());
        }


        if let Some(ref value) = self.value {
            params.push("value".to_string());
            params.push(value.to_string());
        }


        if let Some(ref description) = self.description {
            params.push("description".to_string());
            params.push(description.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a SamlConfigurationPropertyItemsLong value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for SamlConfigurationPropertyItemsLong {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub name: Vec<String>,
            pub optional: Vec<bool>,
            pub is_set: Vec<bool>,
            pub type_: Vec<isize>,
            pub value: Vec<isize>,
            pub description: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing SamlConfigurationPropertyItemsLong".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "optional" => intermediate_rep.optional.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "is_set" => intermediate_rep.is_set.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "type" => intermediate_rep.type_.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "value" => intermediate_rep.value.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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
            type_: intermediate_rep.type_.into_iter().next(),
            value: intermediate_rep.value.into_iter().next(),
            description: intermediate_rep.description.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<SamlConfigurationPropertyItemsLong> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<SamlConfigurationPropertyItemsLong>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<SamlConfigurationPropertyItemsLong>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for SamlConfigurationPropertyItemsLong - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<SamlConfigurationPropertyItemsLong> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <SamlConfigurationPropertyItemsLong as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into SamlConfigurationPropertyItemsLong - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl SamlConfigurationPropertyItemsLong {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
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
    pub type_: Option<isize>,

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
            type_: None,
            value: None,
            description: None,
        }
    }
}

/// Converts the SamlConfigurationPropertyItemsString value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for SamlConfigurationPropertyItemsString {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref name) = self.name {
            params.push("name".to_string());
            params.push(name.to_string());
        }


        if let Some(ref optional) = self.optional {
            params.push("optional".to_string());
            params.push(optional.to_string());
        }


        if let Some(ref is_set) = self.is_set {
            params.push("is_set".to_string());
            params.push(is_set.to_string());
        }


        if let Some(ref type_) = self.type_ {
            params.push("type".to_string());
            params.push(type_.to_string());
        }


        if let Some(ref value) = self.value {
            params.push("value".to_string());
            params.push(value.to_string());
        }


        if let Some(ref description) = self.description {
            params.push("description".to_string());
            params.push(description.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a SamlConfigurationPropertyItemsString value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for SamlConfigurationPropertyItemsString {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub name: Vec<String>,
            pub optional: Vec<bool>,
            pub is_set: Vec<bool>,
            pub type_: Vec<isize>,
            pub value: Vec<String>,
            pub description: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing SamlConfigurationPropertyItemsString".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "optional" => intermediate_rep.optional.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "is_set" => intermediate_rep.is_set.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "type" => intermediate_rep.type_.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "value" => intermediate_rep.value.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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
            type_: intermediate_rep.type_.into_iter().next(),
            value: intermediate_rep.value.into_iter().next(),
            description: intermediate_rep.description.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<SamlConfigurationPropertyItemsString> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<SamlConfigurationPropertyItemsString>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<SamlConfigurationPropertyItemsString>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for SamlConfigurationPropertyItemsString - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<SamlConfigurationPropertyItemsString> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into SamlConfigurationPropertyItemsString - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl SamlConfigurationPropertyItemsString {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
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

/// Converts the TruststoreInfo value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for TruststoreInfo {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping aliases in query parameter serialization


        if let Some(ref exists) = self.exists {
            params.push("exists".to_string());
            params.push(exists.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a TruststoreInfo value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for TruststoreInfo {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub aliases: Vec<Vec<models::TruststoreItems>>,
            pub exists: Vec<bool>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing TruststoreInfo".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "aliases" => return std::result::Result::Err("Parsing a container in this style is not supported in TruststoreInfo".to_string()),
                    "exists" => intermediate_rep.exists.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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

// Methods for converting between header::IntoHeaderValue<TruststoreInfo> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<TruststoreInfo>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<TruststoreInfo>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for TruststoreInfo - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<TruststoreInfo> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <TruststoreInfo as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into TruststoreInfo - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl TruststoreInfo {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
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
    pub serial_number: Option<isize>,

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

/// Converts the TruststoreItems value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for TruststoreItems {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref alias) = self.alias {
            params.push("alias".to_string());
            params.push(alias.to_string());
        }


        if let Some(ref entry_type) = self.entry_type {
            params.push("entryType".to_string());
            params.push(entry_type.to_string());
        }


        if let Some(ref subject) = self.subject {
            params.push("subject".to_string());
            params.push(subject.to_string());
        }


        if let Some(ref issuer) = self.issuer {
            params.push("issuer".to_string());
            params.push(issuer.to_string());
        }


        if let Some(ref not_before) = self.not_before {
            params.push("notBefore".to_string());
            params.push(not_before.to_string());
        }


        if let Some(ref not_after) = self.not_after {
            params.push("notAfter".to_string());
            params.push(not_after.to_string());
        }


        if let Some(ref serial_number) = self.serial_number {
            params.push("serialNumber".to_string());
            params.push(serial_number.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a TruststoreItems value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for TruststoreItems {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub alias: Vec<String>,
            pub entry_type: Vec<String>,
            pub subject: Vec<String>,
            pub issuer: Vec<String>,
            pub not_before: Vec<String>,
            pub not_after: Vec<String>,
            pub serial_number: Vec<isize>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing TruststoreItems".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "alias" => intermediate_rep.alias.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "entryType" => intermediate_rep.entry_type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "subject" => intermediate_rep.subject.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "issuer" => intermediate_rep.issuer.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "notBefore" => intermediate_rep.not_before.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "notAfter" => intermediate_rep.not_after.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "serialNumber" => intermediate_rep.serial_number.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
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

// Methods for converting between header::IntoHeaderValue<TruststoreItems> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<TruststoreItems>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<TruststoreItems>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for TruststoreItems - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<TruststoreItems> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <TruststoreItems as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into TruststoreItems - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


impl TruststoreItems {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn to_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

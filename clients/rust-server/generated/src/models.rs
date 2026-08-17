#![allow(unused_qualifications)]
#[cfg(not(feature = "validate"))]
use validator::Validate;

use crate::models;
#[cfg(any(feature = "client", feature = "server"))]
use crate::header;
#[cfg(feature = "validate")]
use serde_valid::Validate;

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BundleData {
    /// Bundle ID
    #[serde(rename = "id")]

    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<i32>,

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
    pub state_raw: Option<i32>,

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

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub props: Option<Vec<models::BundleDataProp>>,

}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for BundleData {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for BundleData {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl BundleData {
    #[allow(clippy::new_without_default)]
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
/// specified in <https://swagger.io/docs/specification/serialization/>
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
            // Skipping non-primitive type props in query parameter serialization
        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BundleData value
/// as specified in <https://swagger.io/docs/specification/serialization/>
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

// Methods for converting between header::IntoHeaderValue<BundleData> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<BundleData>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BundleData>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for BundleData - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into BundleData - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<BundleData>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<BundleData>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<BundleData>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<BundleData> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <BundleData as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into BundleData - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl BundleData {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
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

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for BundleDataProp {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for BundleDataProp {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl BundleDataProp {
    #[allow(clippy::new_without_default)]
    pub fn new() -> BundleDataProp {
        BundleDataProp {
            key: None,
            value: None,
        }
    }
}

/// Converts the BundleDataProp value to the Query Parameters representation (style=form, explode=false)
/// specified in <https://swagger.io/docs/specification/serialization/>
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
/// as specified in <https://swagger.io/docs/specification/serialization/>
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

// Methods for converting between header::IntoHeaderValue<BundleDataProp> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<BundleDataProp>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BundleDataProp>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for BundleDataProp - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into BundleDataProp - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<BundleDataProp>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<BundleDataProp>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<BundleDataProp>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<BundleDataProp> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <BundleDataProp as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into BundleDataProp - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl BundleDataProp {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
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

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data: Option<Vec<models::BundleData>>,

}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for BundleInfo {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for BundleInfo {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl BundleInfo {
    #[allow(clippy::new_without_default)]
    pub fn new() -> BundleInfo {
        BundleInfo {
            status: None,
            s: None,
            data: None,
        }
    }
}

/// Converts the BundleInfo value to the Query Parameters representation (style=form, explode=false)
/// specified in <https://swagger.io/docs/specification/serialization/>
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
            // Skipping non-primitive type data in query parameter serialization
        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BundleInfo value
/// as specified in <https://swagger.io/docs/specification/serialization/>
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

// Methods for converting between header::IntoHeaderValue<BundleInfo> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<BundleInfo>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BundleInfo>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for BundleInfo - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into BundleInfo - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<BundleInfo>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<BundleInfo>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<BundleInfo>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<BundleInfo> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <BundleInfo as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into BundleInfo - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl BundleInfo {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct InstallStatus {
    #[serde(rename = "status")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status: Option<models::InstallStatusStatus>,

}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for InstallStatus {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for InstallStatus {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl InstallStatus {
    #[allow(clippy::new_without_default)]
    pub fn new() -> InstallStatus {
        InstallStatus {
            status: None,
        }
    }
}

/// Converts the InstallStatus value to the Query Parameters representation (style=form, explode=false)
/// specified in <https://swagger.io/docs/specification/serialization/>
/// Should be implemented in a serde serializer
impl std::fmt::Display for InstallStatus {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping non-primitive type status in query parameter serialization
        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a InstallStatus value
/// as specified in <https://swagger.io/docs/specification/serialization/>
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

// Methods for converting between header::IntoHeaderValue<InstallStatus> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<InstallStatus>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<InstallStatus>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for InstallStatus - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into InstallStatus - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<InstallStatus>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<InstallStatus>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<InstallStatus>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<InstallStatus> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <InstallStatus as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into InstallStatus - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl InstallStatus {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct InstallStatusStatus {
    #[serde(rename = "finished")]

    #[serde(skip_serializing_if="Option::is_none")]
    pub finished: Option<bool>,

    #[serde(rename = "itemCount")]

    #[serde(skip_serializing_if="Option::is_none")]
    pub item_count: Option<i32>,

}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for InstallStatusStatus {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for InstallStatusStatus {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl InstallStatusStatus {
    #[allow(clippy::new_without_default)]
    pub fn new() -> InstallStatusStatus {
        InstallStatusStatus {
            finished: None,
            item_count: None,
        }
    }
}

/// Converts the InstallStatusStatus value to the Query Parameters representation (style=form, explode=false)
/// specified in <https://swagger.io/docs/specification/serialization/>
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
/// as specified in <https://swagger.io/docs/specification/serialization/>
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

// Methods for converting between header::IntoHeaderValue<InstallStatusStatus> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<InstallStatusStatus>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<InstallStatusStatus>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for InstallStatusStatus - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into InstallStatusStatus - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<InstallStatusStatus>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<InstallStatusStatus>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<InstallStatusStatus>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<InstallStatusStatus> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <InstallStatusStatus as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into InstallStatusStatus - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl InstallStatusStatus {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
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
    pub serial_number: Option<i32>,

}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for KeystoreChainItems {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for KeystoreChainItems {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl KeystoreChainItems {
    #[allow(clippy::new_without_default)]
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
/// specified in <https://swagger.io/docs/specification/serialization/>
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
/// as specified in <https://swagger.io/docs/specification/serialization/>
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

// Methods for converting between header::IntoHeaderValue<KeystoreChainItems> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<KeystoreChainItems>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<KeystoreChainItems>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for KeystoreChainItems - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into KeystoreChainItems - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<KeystoreChainItems>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<KeystoreChainItems>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<KeystoreChainItems>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<KeystoreChainItems> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <KeystoreChainItems as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into KeystoreChainItems - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl KeystoreChainItems {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct KeystoreInfo {
    #[serde(rename = "aliases")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub aliases: Option<Vec<models::KeystoreItems>>,

    /// False if truststore don't exist
    #[serde(rename = "exists")]

    #[serde(skip_serializing_if="Option::is_none")]
    pub exists: Option<bool>,

}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for KeystoreInfo {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for KeystoreInfo {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl KeystoreInfo {
    #[allow(clippy::new_without_default)]
    pub fn new() -> KeystoreInfo {
        KeystoreInfo {
            aliases: None,
            exists: None,
        }
    }
}

/// Converts the KeystoreInfo value to the Query Parameters representation (style=form, explode=false)
/// specified in <https://swagger.io/docs/specification/serialization/>
/// Should be implemented in a serde serializer
impl std::fmt::Display for KeystoreInfo {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping non-primitive type aliases in query parameter serialization
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
/// as specified in <https://swagger.io/docs/specification/serialization/>
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

// Methods for converting between header::IntoHeaderValue<KeystoreInfo> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<KeystoreInfo>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<KeystoreInfo>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for KeystoreInfo - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into KeystoreInfo - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<KeystoreInfo>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<KeystoreInfo>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<KeystoreInfo>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<KeystoreInfo> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <KeystoreInfo as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into KeystoreInfo - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl KeystoreInfo {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
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

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub chain: Option<Vec<models::KeystoreChainItems>>,

}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for KeystoreItems {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for KeystoreItems {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl KeystoreItems {
    #[allow(clippy::new_without_default)]
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
/// specified in <https://swagger.io/docs/specification/serialization/>
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
            // Skipping non-primitive type chain in query parameter serialization
        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a KeystoreItems value
/// as specified in <https://swagger.io/docs/specification/serialization/>
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

// Methods for converting between header::IntoHeaderValue<KeystoreItems> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<KeystoreItems>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<KeystoreItems>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for KeystoreItems - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into KeystoreItems - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<KeystoreItems>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<KeystoreItems>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<KeystoreItems>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<KeystoreItems> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <KeystoreItems as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into KeystoreItems - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl KeystoreItems {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
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

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub properties: Option<models::SamlConfigurationProperties>,

}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for SamlConfigurationInfo {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for SamlConfigurationInfo {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl SamlConfigurationInfo {
    #[allow(clippy::new_without_default)]
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
/// specified in <https://swagger.io/docs/specification/serialization/>
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
            // Skipping non-primitive type properties in query parameter serialization
        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a SamlConfigurationInfo value
/// as specified in <https://swagger.io/docs/specification/serialization/>
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

// Methods for converting between header::IntoHeaderValue<SamlConfigurationInfo> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<SamlConfigurationInfo>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<SamlConfigurationInfo>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for SamlConfigurationInfo - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into SamlConfigurationInfo - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<SamlConfigurationInfo>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<SamlConfigurationInfo>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<SamlConfigurationInfo>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<SamlConfigurationInfo> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <SamlConfigurationInfo as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into SamlConfigurationInfo - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl SamlConfigurationInfo {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct SamlConfigurationProperties {
    #[serde(rename = "path")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub path: Option<models::SamlConfigurationPropertyItemsArray>,

    #[serde(rename = "service.ranking")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub service_ranking: Option<models::SamlConfigurationPropertyItemsLong>,

    #[serde(rename = "idpUrl")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub idp_url: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "idpCertAlias")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub idp_cert_alias: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "idpHttpRedirect")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub idp_http_redirect: Option<models::SamlConfigurationPropertyItemsBoolean>,

    #[serde(rename = "serviceProviderEntityId")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub service_provider_entity_id: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "assertionConsumerServiceURL")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub assertion_consumer_service_url: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "spPrivateKeyAlias")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sp_private_key_alias: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "keyStorePassword")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub key_store_password: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "defaultRedirectUrl")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_redirect_url: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "userIDAttribute")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_id_attribute: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "useEncryption")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub use_encryption: Option<models::SamlConfigurationPropertyItemsBoolean>,

    #[serde(rename = "createUser")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub create_user: Option<models::SamlConfigurationPropertyItemsBoolean>,

    #[serde(rename = "addGroupMemberships")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub add_group_memberships: Option<models::SamlConfigurationPropertyItemsBoolean>,

    #[serde(rename = "groupMembershipAttribute")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub group_membership_attribute: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "defaultGroups")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_groups: Option<models::SamlConfigurationPropertyItemsArray>,

    #[serde(rename = "nameIdFormat")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name_id_format: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "synchronizeAttributes")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub synchronize_attributes: Option<models::SamlConfigurationPropertyItemsArray>,

    #[serde(rename = "handleLogout")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub handle_logout: Option<models::SamlConfigurationPropertyItemsBoolean>,

    #[serde(rename = "logoutUrl")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub logout_url: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "clockTolerance")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub clock_tolerance: Option<models::SamlConfigurationPropertyItemsLong>,

    #[serde(rename = "digestMethod")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub digest_method: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "signatureMethod")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub signature_method: Option<models::SamlConfigurationPropertyItemsString>,

    #[serde(rename = "userIntermediatePath")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_intermediate_path: Option<models::SamlConfigurationPropertyItemsString>,

}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for SamlConfigurationProperties {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for SamlConfigurationProperties {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl SamlConfigurationProperties {
    #[allow(clippy::new_without_default)]
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
/// specified in <https://swagger.io/docs/specification/serialization/>
/// Should be implemented in a serde serializer
impl std::fmt::Display for SamlConfigurationProperties {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping non-primitive type path in query parameter serialization
            // Skipping non-primitive type service.ranking in query parameter serialization
            // Skipping non-primitive type idpUrl in query parameter serialization
            // Skipping non-primitive type idpCertAlias in query parameter serialization
            // Skipping non-primitive type idpHttpRedirect in query parameter serialization
            // Skipping non-primitive type serviceProviderEntityId in query parameter serialization
            // Skipping non-primitive type assertionConsumerServiceURL in query parameter serialization
            // Skipping non-primitive type spPrivateKeyAlias in query parameter serialization
            // Skipping non-primitive type keyStorePassword in query parameter serialization
            // Skipping non-primitive type defaultRedirectUrl in query parameter serialization
            // Skipping non-primitive type userIDAttribute in query parameter serialization
            // Skipping non-primitive type useEncryption in query parameter serialization
            // Skipping non-primitive type createUser in query parameter serialization
            // Skipping non-primitive type addGroupMemberships in query parameter serialization
            // Skipping non-primitive type groupMembershipAttribute in query parameter serialization
            // Skipping non-primitive type defaultGroups in query parameter serialization
            // Skipping non-primitive type nameIdFormat in query parameter serialization
            // Skipping non-primitive type synchronizeAttributes in query parameter serialization
            // Skipping non-primitive type handleLogout in query parameter serialization
            // Skipping non-primitive type logoutUrl in query parameter serialization
            // Skipping non-primitive type clockTolerance in query parameter serialization
            // Skipping non-primitive type digestMethod in query parameter serialization
            // Skipping non-primitive type signatureMethod in query parameter serialization
            // Skipping non-primitive type userIntermediatePath in query parameter serialization
        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a SamlConfigurationProperties value
/// as specified in <https://swagger.io/docs/specification/serialization/>
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

// Methods for converting between header::IntoHeaderValue<SamlConfigurationProperties> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<SamlConfigurationProperties>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<SamlConfigurationProperties>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for SamlConfigurationProperties - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into SamlConfigurationProperties - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<SamlConfigurationProperties>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<SamlConfigurationProperties>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<SamlConfigurationProperties>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<SamlConfigurationProperties> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <SamlConfigurationProperties as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into SamlConfigurationProperties - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl SamlConfigurationProperties {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
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
    pub r#type: Option<i32>,

    /// Property value
    #[serde(rename = "values")]

    #[serde(skip_serializing_if="Option::is_none")]
    pub values: Option<Vec<String>>,

    /// Property description
    #[serde(rename = "description")]

    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for SamlConfigurationPropertyItemsArray {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for SamlConfigurationPropertyItemsArray {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl SamlConfigurationPropertyItemsArray {
    #[allow(clippy::new_without_default)]
    pub fn new() -> SamlConfigurationPropertyItemsArray {
        SamlConfigurationPropertyItemsArray {
            name: None,
            optional: None,
            is_set: None,
            r#type: None,
            values: None,
            description: None,
        }
    }
}

/// Converts the SamlConfigurationPropertyItemsArray value to the Query Parameters representation (style=form, explode=false)
/// specified in <https://swagger.io/docs/specification/serialization/>
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
            self.r#type.as_ref().map(|r#type| {
                [
                    "type".to_string(),
                    r#type.to_string(),
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
/// as specified in <https://swagger.io/docs/specification/serialization/>
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
            pub r#type: Vec<i32>,
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
                    "type" => intermediate_rep.r#type.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
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
            r#type: intermediate_rep.r#type.into_iter().next(),
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
                 format!("Invalid header value for SamlConfigurationPropertyItemsArray - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into SamlConfigurationPropertyItemsArray - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<SamlConfigurationPropertyItemsArray>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<SamlConfigurationPropertyItemsArray>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<SamlConfigurationPropertyItemsArray>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<SamlConfigurationPropertyItemsArray> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <SamlConfigurationPropertyItemsArray as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into SamlConfigurationPropertyItemsArray - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl SamlConfigurationPropertyItemsArray {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
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
    pub r#type: Option<i32>,

    /// Property value
    #[serde(rename = "value")]

    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<bool>,

    /// Property description
    #[serde(rename = "description")]

    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for SamlConfigurationPropertyItemsBoolean {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for SamlConfigurationPropertyItemsBoolean {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl SamlConfigurationPropertyItemsBoolean {
    #[allow(clippy::new_without_default)]
    pub fn new() -> SamlConfigurationPropertyItemsBoolean {
        SamlConfigurationPropertyItemsBoolean {
            name: None,
            optional: None,
            is_set: None,
            r#type: None,
            value: None,
            description: None,
        }
    }
}

/// Converts the SamlConfigurationPropertyItemsBoolean value to the Query Parameters representation (style=form, explode=false)
/// specified in <https://swagger.io/docs/specification/serialization/>
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
            self.r#type.as_ref().map(|r#type| {
                [
                    "type".to_string(),
                    r#type.to_string(),
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
/// as specified in <https://swagger.io/docs/specification/serialization/>
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
            pub r#type: Vec<i32>,
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
                    "type" => intermediate_rep.r#type.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
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
            r#type: intermediate_rep.r#type.into_iter().next(),
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
                 format!("Invalid header value for SamlConfigurationPropertyItemsBoolean - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into SamlConfigurationPropertyItemsBoolean - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<SamlConfigurationPropertyItemsBoolean>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<SamlConfigurationPropertyItemsBoolean>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<SamlConfigurationPropertyItemsBoolean>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<SamlConfigurationPropertyItemsBoolean> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <SamlConfigurationPropertyItemsBoolean as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into SamlConfigurationPropertyItemsBoolean - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl SamlConfigurationPropertyItemsBoolean {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
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
    pub r#type: Option<i32>,

    /// Property value
    #[serde(rename = "value")]

    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<i32>,

    /// Property description
    #[serde(rename = "description")]

    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for SamlConfigurationPropertyItemsLong {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for SamlConfigurationPropertyItemsLong {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl SamlConfigurationPropertyItemsLong {
    #[allow(clippy::new_without_default)]
    pub fn new() -> SamlConfigurationPropertyItemsLong {
        SamlConfigurationPropertyItemsLong {
            name: None,
            optional: None,
            is_set: None,
            r#type: None,
            value: None,
            description: None,
        }
    }
}

/// Converts the SamlConfigurationPropertyItemsLong value to the Query Parameters representation (style=form, explode=false)
/// specified in <https://swagger.io/docs/specification/serialization/>
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
            self.r#type.as_ref().map(|r#type| {
                [
                    "type".to_string(),
                    r#type.to_string(),
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
/// as specified in <https://swagger.io/docs/specification/serialization/>
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
            pub r#type: Vec<i32>,
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
                    "type" => intermediate_rep.r#type.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
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
            r#type: intermediate_rep.r#type.into_iter().next(),
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
                 format!("Invalid header value for SamlConfigurationPropertyItemsLong - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into SamlConfigurationPropertyItemsLong - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<SamlConfigurationPropertyItemsLong>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<SamlConfigurationPropertyItemsLong>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<SamlConfigurationPropertyItemsLong>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<SamlConfigurationPropertyItemsLong> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <SamlConfigurationPropertyItemsLong as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into SamlConfigurationPropertyItemsLong - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl SamlConfigurationPropertyItemsLong {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
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
    pub r#type: Option<i32>,

    /// Property value
    #[serde(rename = "value")]

    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<String>,

    /// Property description
    #[serde(rename = "description")]

    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for SamlConfigurationPropertyItemsString {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for SamlConfigurationPropertyItemsString {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl SamlConfigurationPropertyItemsString {
    #[allow(clippy::new_without_default)]
    pub fn new() -> SamlConfigurationPropertyItemsString {
        SamlConfigurationPropertyItemsString {
            name: None,
            optional: None,
            is_set: None,
            r#type: None,
            value: None,
            description: None,
        }
    }
}

/// Converts the SamlConfigurationPropertyItemsString value to the Query Parameters representation (style=form, explode=false)
/// specified in <https://swagger.io/docs/specification/serialization/>
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
            self.r#type.as_ref().map(|r#type| {
                [
                    "type".to_string(),
                    r#type.to_string(),
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
/// as specified in <https://swagger.io/docs/specification/serialization/>
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
            pub r#type: Vec<i32>,
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
                    "type" => intermediate_rep.r#type.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
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
            r#type: intermediate_rep.r#type.into_iter().next(),
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
                 format!("Invalid header value for SamlConfigurationPropertyItemsString - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into SamlConfigurationPropertyItemsString - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<SamlConfigurationPropertyItemsString>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<SamlConfigurationPropertyItemsString>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<SamlConfigurationPropertyItemsString>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<SamlConfigurationPropertyItemsString> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <SamlConfigurationPropertyItemsString as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into SamlConfigurationPropertyItemsString - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl SamlConfigurationPropertyItemsString {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct TruststoreInfo {
    #[serde(rename = "aliases")]

    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub aliases: Option<Vec<models::TruststoreItems>>,

    /// False if truststore don't exist
    #[serde(rename = "exists")]

    #[serde(skip_serializing_if="Option::is_none")]
    pub exists: Option<bool>,

}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for TruststoreInfo {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for TruststoreInfo {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl TruststoreInfo {
    #[allow(clippy::new_without_default)]
    pub fn new() -> TruststoreInfo {
        TruststoreInfo {
            aliases: None,
            exists: None,
        }
    }
}

/// Converts the TruststoreInfo value to the Query Parameters representation (style=form, explode=false)
/// specified in <https://swagger.io/docs/specification/serialization/>
/// Should be implemented in a serde serializer
impl std::fmt::Display for TruststoreInfo {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping non-primitive type aliases in query parameter serialization
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
/// as specified in <https://swagger.io/docs/specification/serialization/>
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

// Methods for converting between header::IntoHeaderValue<TruststoreInfo> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<TruststoreInfo>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<TruststoreInfo>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for TruststoreInfo - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into TruststoreInfo - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<TruststoreInfo>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<TruststoreInfo>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<TruststoreInfo>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<TruststoreInfo> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <TruststoreInfo as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into TruststoreInfo - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl TruststoreInfo {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
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
    pub serial_number: Option<i32>,

}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMinLength for TruststoreItems {
    fn validate_composited_min_length(
        &self,
        _min_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MinLengthError>> {
        Ok(())
    }
}

#[cfg(feature = "validate")]
impl serde_valid::validation::ValidateCompositedMaxLength for TruststoreItems {
    fn validate_composited_max_length(
        &self,
        _max_length: usize,
    ) -> Result<(), serde_valid::validation::Composited<serde_valid::validation::error::MaxLengthError>> {
        Ok(())
    }
}


impl TruststoreItems {
    #[allow(clippy::new_without_default)]
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
/// specified in <https://swagger.io/docs/specification/serialization/>
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
/// as specified in <https://swagger.io/docs/specification/serialization/>
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

// Methods for converting between header::IntoHeaderValue<TruststoreItems> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<TruststoreItems>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<TruststoreItems>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for TruststoreItems - value: {hdr_value} is invalid {e}"))
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
                            format!("Unable to convert header value '{value}' into TruststoreItems - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<TruststoreItems>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<TruststoreItems>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<TruststoreItems>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<TruststoreItems> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <TruststoreItems as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into TruststoreItems - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

impl TruststoreItems {
    /// Helper function to allow us to convert this model to an XML string.
    /// Will panic if serialisation fails.
    #[allow(dead_code)]
    pub(crate) fn as_xml(&self) -> String {
        serde_xml_rs::to_string(&self).expect("impossible to fail to serialize")
    }
}

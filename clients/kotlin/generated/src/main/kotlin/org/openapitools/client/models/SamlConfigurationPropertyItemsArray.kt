/**
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param name property name
 * @param optional True if optional
 * @param isSet True if property is set
 * @param type Property type, 1=String, 3=long, 11=boolean, 12=Password
 * @param propertyValues Property value
 * @param description Property description
 */

data class SamlConfigurationPropertyItemsArray (

    /* property name */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* True if optional */
    @Json(name = "optional")
    val optional: kotlin.Boolean? = null,

    /* True if property is set */
    @Json(name = "is_set")
    val isSet: kotlin.Boolean? = null,

    /* Property type, 1=String, 3=long, 11=boolean, 12=Password */
    @Json(name = "type")
    val type: kotlin.Int? = null,

    /* Property value */
    @Json(name = "values")
    val propertyValues: kotlin.collections.List<kotlin.String>? = null,

    /* Property description */
    @Json(name = "description")
    val description: kotlin.String? = null

)


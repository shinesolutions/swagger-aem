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

import org.openapitools.client.models.TruststoreItems

import com.squareup.moshi.Json

/**
 * 
 *
 * @param aliases 
 * @param exists False if truststore don't exist
 */

data class TruststoreInfo (

    @Json(name = "aliases")
    val aliases: kotlin.collections.List<TruststoreItems>? = null,

    /* False if truststore don't exist */
    @Json(name = "exists")
    val exists: kotlin.Boolean? = null

)


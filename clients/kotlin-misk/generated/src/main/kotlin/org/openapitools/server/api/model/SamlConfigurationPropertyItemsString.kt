package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SamlConfigurationPropertyItemsString(
    /** property name */
    val name: kotlin.String? = null,
    /** True if optional */
    val optional: kotlin.Boolean? = null,
    /** True if property is set */
    val isSet: kotlin.Boolean? = null,
    /** Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password */
    val type: kotlin.Int? = null,
    /** Property value */
    val `value`: kotlin.String? = null,
    /** Property description */
    val description: kotlin.String? = null
)

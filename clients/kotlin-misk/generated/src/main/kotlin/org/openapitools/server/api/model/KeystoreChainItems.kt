package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeystoreChainItems(
    /** e.g. \&quot;CN&#x3D;localhost\&quot; */
    val subject: kotlin.String? = null,
    /** e.g. \&quot;CN&#x3D;Admin\&quot; */
    val issuer: kotlin.String? = null,
    /** e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot; */
    val notBefore: kotlin.String? = null,
    /** e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot; */
    val notAfter: kotlin.String? = null,
    /** 18165099476682912368 */
    val serialNumber: kotlin.Int? = null
)

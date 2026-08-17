package org.openapitools.server.api.model

import org.openapitools.server.api.model.KeystoreChainItems
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeystoreItems(
    /** Keystore alias name */
    val alias: kotlin.String? = null,
    /** e.g. \&quot;privateKey\&quot; */
    val entryType: kotlin.String? = null,
    /** e.g. \&quot;RSA\&quot; */
    val algorithm: kotlin.String? = null,
    /** e.g. \&quot;PKCS#8\&quot; */
    val format: kotlin.String? = null,
    val chain: kotlin.collections.List<KeystoreChainItems>? = null
)

@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class ConsoleApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getAemProductInfo.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetAemProductInfoStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getAemProductInfo(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetAemProductInfoStubBuilder =
        GetAemProductInfoStubBuilder(objectMapper, get(urlPathTemplate("/system/console/status-productinfo.json"))
            .configurer()
        )

    /**
     * Construct a stub for the operation getBundleInfo.
     *
     * @param name path parameter name pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetBundleInfoStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getBundleInfo(name: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetBundleInfoStubBuilder =
        GetBundleInfoStubBuilder(objectMapper, get(urlPathTemplate("/system/console/bundles/{name}.json"))
            .withPathParam("name", name)
            .configurer()
        )

    /**
     * Construct a stub for the operation getConfigMgr.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetConfigMgrStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getConfigMgr(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetConfigMgrStubBuilder =
        GetConfigMgrStubBuilder(objectMapper, get(urlPathTemplate("/system/console/configMgr"))
            .configurer()
        )

    /**
     * Construct a stub for the operation postBundle.
     *
     * @param name path parameter name pattern.
     * @param action query parameter action pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostBundleStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postBundle(name: StringValuePattern, action: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostBundleStubBuilder =
        PostBundleStubBuilder(objectMapper, post(urlPathTemplate("/system/console/bundles/{name}"))
            .withPathParam("name", name)
            .apply { action?.let { withQueryParam("action", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postJmxRepository.
     *
     * @param action path parameter action pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostJmxRepositoryStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postJmxRepository(action: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostJmxRepositoryStubBuilder =
        PostJmxRepositoryStubBuilder(objectMapper, post(urlPathTemplate("/system/console/jmx/com.adobe.granite:type=Repository/op/{action}"))
            .withPathParam("action", action)
            .configurer()
        )

    /**
     * Construct a stub for the operation postSamlConfiguration.
     *
     * @param post query parameter post pattern.
     * @param apply query parameter apply pattern.
     * @param delete query parameter delete pattern.
     * @param action query parameter action pattern.
     * @param dollarLocation query parameter dollarLocation pattern.
     * @param path query parameter path pattern.
     * @param serviceRanking query parameter serviceRanking pattern.
     * @param idpUrl query parameter idpUrl pattern.
     * @param idpCertAlias query parameter idpCertAlias pattern.
     * @param idpHttpRedirect query parameter idpHttpRedirect pattern.
     * @param serviceProviderEntityId query parameter serviceProviderEntityId pattern.
     * @param assertionConsumerServiceURL query parameter assertionConsumerServiceURL pattern.
     * @param spPrivateKeyAlias query parameter spPrivateKeyAlias pattern.
     * @param keyStorePassword query parameter keyStorePassword pattern.
     * @param defaultRedirectUrl query parameter defaultRedirectUrl pattern.
     * @param userIDAttribute query parameter userIDAttribute pattern.
     * @param useEncryption query parameter useEncryption pattern.
     * @param createUser query parameter createUser pattern.
     * @param addGroupMemberships query parameter addGroupMemberships pattern.
     * @param groupMembershipAttribute query parameter groupMembershipAttribute pattern.
     * @param defaultGroups query parameter defaultGroups pattern.
     * @param nameIdFormat query parameter nameIdFormat pattern.
     * @param synchronizeAttributes query parameter synchronizeAttributes pattern.
     * @param handleLogout query parameter handleLogout pattern.
     * @param logoutUrl query parameter logoutUrl pattern.
     * @param clockTolerance query parameter clockTolerance pattern.
     * @param digestMethod query parameter digestMethod pattern.
     * @param signatureMethod query parameter signatureMethod pattern.
     * @param userIntermediatePath query parameter userIntermediatePath pattern.
     * @param propertylist query parameter propertylist pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostSamlConfigurationStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postSamlConfiguration(post: StringValuePattern? = null, apply: StringValuePattern? = null, delete: StringValuePattern? = null, action: StringValuePattern? = null, dollarLocation: StringValuePattern? = null, path: StringValuePattern? = null, serviceRanking: StringValuePattern? = null, idpUrl: StringValuePattern? = null, idpCertAlias: StringValuePattern? = null, idpHttpRedirect: StringValuePattern? = null, serviceProviderEntityId: StringValuePattern? = null, assertionConsumerServiceURL: StringValuePattern? = null, spPrivateKeyAlias: StringValuePattern? = null, keyStorePassword: StringValuePattern? = null, defaultRedirectUrl: StringValuePattern? = null, userIDAttribute: StringValuePattern? = null, useEncryption: StringValuePattern? = null, createUser: StringValuePattern? = null, addGroupMemberships: StringValuePattern? = null, groupMembershipAttribute: StringValuePattern? = null, defaultGroups: StringValuePattern? = null, nameIdFormat: StringValuePattern? = null, synchronizeAttributes: StringValuePattern? = null, handleLogout: StringValuePattern? = null, logoutUrl: StringValuePattern? = null, clockTolerance: StringValuePattern? = null, digestMethod: StringValuePattern? = null, signatureMethod: StringValuePattern? = null, userIntermediatePath: StringValuePattern? = null, propertylist: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostSamlConfigurationStubBuilder =
        PostSamlConfigurationStubBuilder(objectMapper, post(urlPathTemplate("/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler"))
            .apply { post?.let { withQueryParam("post", it) } }
            .apply { apply?.let { withQueryParam("apply", it) } }
            .apply { delete?.let { withQueryParam("delete", it) } }
            .apply { action?.let { withQueryParam("action", it) } }
            .apply { dollarLocation?.let { withQueryParam("$location", it) } }
            .apply { path?.let { withQueryParam("path", it) } }
            .apply { serviceRanking?.let { withQueryParam("service.ranking", it) } }
            .apply { idpUrl?.let { withQueryParam("idpUrl", it) } }
            .apply { idpCertAlias?.let { withQueryParam("idpCertAlias", it) } }
            .apply { idpHttpRedirect?.let { withQueryParam("idpHttpRedirect", it) } }
            .apply { serviceProviderEntityId?.let { withQueryParam("serviceProviderEntityId", it) } }
            .apply { assertionConsumerServiceURL?.let { withQueryParam("assertionConsumerServiceURL", it) } }
            .apply { spPrivateKeyAlias?.let { withQueryParam("spPrivateKeyAlias", it) } }
            .apply { keyStorePassword?.let { withQueryParam("keyStorePassword", it) } }
            .apply { defaultRedirectUrl?.let { withQueryParam("defaultRedirectUrl", it) } }
            .apply { userIDAttribute?.let { withQueryParam("userIDAttribute", it) } }
            .apply { useEncryption?.let { withQueryParam("useEncryption", it) } }
            .apply { createUser?.let { withQueryParam("createUser", it) } }
            .apply { addGroupMemberships?.let { withQueryParam("addGroupMemberships", it) } }
            .apply { groupMembershipAttribute?.let { withQueryParam("groupMembershipAttribute", it) } }
            .apply { defaultGroups?.let { withQueryParam("defaultGroups", it) } }
            .apply { nameIdFormat?.let { withQueryParam("nameIdFormat", it) } }
            .apply { synchronizeAttributes?.let { withQueryParam("synchronizeAttributes", it) } }
            .apply { handleLogout?.let { withQueryParam("handleLogout", it) } }
            .apply { logoutUrl?.let { withQueryParam("logoutUrl", it) } }
            .apply { clockTolerance?.let { withQueryParam("clockTolerance", it) } }
            .apply { digestMethod?.let { withQueryParam("digestMethod", it) } }
            .apply { signatureMethod?.let { withQueryParam("signatureMethod", it) } }
            .apply { userIntermediatePath?.let { withQueryParam("userIntermediatePath", it) } }
            .apply { propertylist?.let { withQueryParam("propertylist", it) } }
            .configurer()
        )
}

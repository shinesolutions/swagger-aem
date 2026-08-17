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
open class SlingApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation deleteAgent.
     *
     * @param runmode path parameter runmode pattern.
     * @param name path parameter name pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteAgentStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteAgent(runmode: StringValuePattern, name: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteAgentStubBuilder =
        DeleteAgentStubBuilder(objectMapper, delete(urlPathTemplate("/etc/replication/agents.{runmode}/{name}"))
            .withPathParam("runmode", runmode)
            .withPathParam("name", name)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteNode.
     *
     * @param path path parameter path pattern.
     * @param name path parameter name pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteNodeStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteNode(path: StringValuePattern, name: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteNodeStubBuilder =
        DeleteNodeStubBuilder(objectMapper, delete(urlPathTemplate("/{path}/{name}"))
            .withPathParam("path", path)
            .withPathParam("name", name)
            .configurer()
        )

    /**
     * Construct a stub for the operation getAgent.
     *
     * @param runmode path parameter runmode pattern.
     * @param name path parameter name pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetAgentStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getAgent(runmode: StringValuePattern, name: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetAgentStubBuilder =
        GetAgentStubBuilder(objectMapper, get(urlPathTemplate("/etc/replication/agents.{runmode}/{name}"))
            .withPathParam("runmode", runmode)
            .withPathParam("name", name)
            .configurer()
        )

    /**
     * Construct a stub for the operation getAgents.
     *
     * @param runmode path parameter runmode pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetAgentsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getAgents(runmode: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetAgentsStubBuilder =
        GetAgentsStubBuilder(objectMapper, get(urlPathTemplate("/etc/replication/agents.{runmode}.-1.json"))
            .withPathParam("runmode", runmode)
            .configurer()
        )

    /**
     * Construct a stub for the operation getAuthorizableKeystore.
     *
     * @param intermediatePath path parameter intermediatePath pattern.
     * @param authorizableId path parameter authorizableId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetAuthorizableKeystoreStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getAuthorizableKeystore(intermediatePath: StringValuePattern, authorizableId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetAuthorizableKeystoreStubBuilder =
        GetAuthorizableKeystoreStubBuilder(objectMapper, get(urlPathTemplate("/{intermediatePath}/{authorizableId}.ks.json"))
            .withPathParam("intermediatePath", intermediatePath)
            .withPathParam("authorizableId", authorizableId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getKeystore.
     *
     * @param intermediatePath path parameter intermediatePath pattern.
     * @param authorizableId path parameter authorizableId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetKeystoreStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getKeystore(intermediatePath: StringValuePattern, authorizableId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetKeystoreStubBuilder =
        GetKeystoreStubBuilder(objectMapper, get(urlPathTemplate("/{intermediatePath}/{authorizableId}/keystore/store.p12"))
            .withPathParam("intermediatePath", intermediatePath)
            .withPathParam("authorizableId", authorizableId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getNode.
     *
     * @param path path parameter path pattern.
     * @param name path parameter name pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetNodeStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getNode(path: StringValuePattern, name: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetNodeStubBuilder =
        GetNodeStubBuilder(objectMapper, get(urlPathTemplate("/{path}/{name}"))
            .withPathParam("path", path)
            .withPathParam("name", name)
            .configurer()
        )

    /**
     * Construct a stub for the operation getPackage.
     *
     * @param group path parameter group pattern.
     * @param name path parameter name pattern.
     * @param version path parameter version pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetPackageStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getPackage(group: StringValuePattern, name: StringValuePattern, version: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetPackageStubBuilder =
        GetPackageStubBuilder(objectMapper, get(urlPathTemplate("/etc/packages/{group}/{name}-{version}.zip"))
            .withPathParam("group", group)
            .withPathParam("name", name)
            .withPathParam("version", version)
            .configurer()
        )

    /**
     * Construct a stub for the operation getPackageFilter.
     *
     * @param group path parameter group pattern.
     * @param name path parameter name pattern.
     * @param version path parameter version pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetPackageFilterStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getPackageFilter(group: StringValuePattern, name: StringValuePattern, version: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetPackageFilterStubBuilder =
        GetPackageFilterStubBuilder(objectMapper, get(urlPathTemplate("/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json"))
            .withPathParam("group", group)
            .withPathParam("name", name)
            .withPathParam("version", version)
            .configurer()
        )

    /**
     * Construct a stub for the operation getQuery.
     *
     * @param path query parameter path pattern.
     * @param pLimit query parameter pLimit pattern.
     * @param &#x60;1property&#x60; query parameter &#x60;1property&#x60; pattern.
     * @param &#x60;1propertyValue&#x60; query parameter &#x60;1propertyValue&#x60; pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetQueryStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getQuery(path: StringValuePattern? = null, pLimit: StringValuePattern? = null, &#x60;1property&#x60;: StringValuePattern? = null, &#x60;1propertyValue&#x60;: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetQueryStubBuilder =
        GetQueryStubBuilder(objectMapper, get(urlPathTemplate("/bin/querybuilder.json"))
            .apply { path?.let { withQueryParam("path", it) } }
            .apply { pLimit?.let { withQueryParam("p.limit", it) } }
            .apply { &#x60;1property&#x60;?.let { withQueryParam("1_property", it) } }
            .apply { &#x60;1propertyValue&#x60;?.let { withQueryParam("1_property.value", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getTruststore.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetTruststoreStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getTruststore(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetTruststoreStubBuilder =
        GetTruststoreStubBuilder(objectMapper, get(urlPathTemplate("/etc/truststore/truststore.p12"))
            .configurer()
        )

    /**
     * Construct a stub for the operation getTruststoreInfo.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetTruststoreInfoStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getTruststoreInfo(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetTruststoreInfoStubBuilder =
        GetTruststoreInfoStubBuilder(objectMapper, get(urlPathTemplate("/libs/granite/security/truststore.json"))
            .configurer()
        )

    /**
     * Construct a stub for the operation postAgent.
     *
     * @param runmode path parameter runmode pattern.
     * @param name path parameter name pattern.
     * @param jcrContentCqDistribute query parameter jcrContentCqDistribute pattern.
     * @param jcrContentCqDistributeAtTypeHint query parameter jcrContentCqDistributeAtTypeHint pattern.
     * @param jcrContentCqName query parameter jcrContentCqName pattern.
     * @param jcrContentCqTemplate query parameter jcrContentCqTemplate pattern.
     * @param jcrContentAliasUpdate query parameter jcrContentAliasUpdate pattern.
     * @param jcrContentEnabled query parameter jcrContentEnabled pattern.
     * @param jcrContentJcrDescription query parameter jcrContentJcrDescription pattern.
     * @param jcrContentJcrLastModified query parameter jcrContentJcrLastModified pattern.
     * @param jcrContentJcrLastModifiedBy query parameter jcrContentJcrLastModifiedBy pattern.
     * @param jcrContentJcrMixinTypes query parameter jcrContentJcrMixinTypes pattern.
     * @param jcrContentJcrTitle query parameter jcrContentJcrTitle pattern.
     * @param jcrContentLogLevel query parameter jcrContentLogLevel pattern.
     * @param jcrContentNoStatusUpdate query parameter jcrContentNoStatusUpdate pattern.
     * @param jcrContentNoVersioning query parameter jcrContentNoVersioning pattern.
     * @param jcrContentProtocolConnectTimeout query parameter jcrContentProtocolConnectTimeout pattern.
     * @param jcrContentProtocolHTTPConnectionClosed query parameter jcrContentProtocolHTTPConnectionClosed pattern.
     * @param jcrContentProtocolHTTPExpired query parameter jcrContentProtocolHTTPExpired pattern.
     * @param jcrContentProtocolHTTPHeaders query parameter jcrContentProtocolHTTPHeaders pattern.
     * @param jcrContentProtocolHTTPHeadersAtTypeHint query parameter jcrContentProtocolHTTPHeadersAtTypeHint pattern.
     * @param jcrContentProtocolHTTPMethod query parameter jcrContentProtocolHTTPMethod pattern.
     * @param jcrContentProtocolHTTPSRelaxed query parameter jcrContentProtocolHTTPSRelaxed pattern.
     * @param jcrContentProtocolInterface query parameter jcrContentProtocolInterface pattern.
     * @param jcrContentProtocolSocketTimeout query parameter jcrContentProtocolSocketTimeout pattern.
     * @param jcrContentProtocolVersion query parameter jcrContentProtocolVersion pattern.
     * @param jcrContentProxyNTLMDomain query parameter jcrContentProxyNTLMDomain pattern.
     * @param jcrContentProxyNTLMHost query parameter jcrContentProxyNTLMHost pattern.
     * @param jcrContentProxyHost query parameter jcrContentProxyHost pattern.
     * @param jcrContentProxyPassword query parameter jcrContentProxyPassword pattern.
     * @param jcrContentProxyPort query parameter jcrContentProxyPort pattern.
     * @param jcrContentProxyUser query parameter jcrContentProxyUser pattern.
     * @param jcrContentQueueBatchMaxSize query parameter jcrContentQueueBatchMaxSize pattern.
     * @param jcrContentQueueBatchMode query parameter jcrContentQueueBatchMode pattern.
     * @param jcrContentQueueBatchWaitTime query parameter jcrContentQueueBatchWaitTime pattern.
     * @param jcrContentRetryDelay query parameter jcrContentRetryDelay pattern.
     * @param jcrContentReverseReplication query parameter jcrContentReverseReplication pattern.
     * @param jcrContentSerializationType query parameter jcrContentSerializationType pattern.
     * @param jcrContentSlingResourceType query parameter jcrContentSlingResourceType pattern.
     * @param jcrContentSsl query parameter jcrContentSsl pattern.
     * @param jcrContentTransportNTLMDomain query parameter jcrContentTransportNTLMDomain pattern.
     * @param jcrContentTransportNTLMHost query parameter jcrContentTransportNTLMHost pattern.
     * @param jcrContentTransportPassword query parameter jcrContentTransportPassword pattern.
     * @param jcrContentTransportUri query parameter jcrContentTransportUri pattern.
     * @param jcrContentTransportUser query parameter jcrContentTransportUser pattern.
     * @param jcrContentTriggerDistribute query parameter jcrContentTriggerDistribute pattern.
     * @param jcrContentTriggerModified query parameter jcrContentTriggerModified pattern.
     * @param jcrContentTriggerOnOffTime query parameter jcrContentTriggerOnOffTime pattern.
     * @param jcrContentTriggerReceive query parameter jcrContentTriggerReceive pattern.
     * @param jcrContentTriggerSpecific query parameter jcrContentTriggerSpecific pattern.
     * @param jcrContentUserId query parameter jcrContentUserId pattern.
     * @param jcrPrimaryType query parameter jcrPrimaryType pattern.
     * @param operation query parameter operation pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostAgentStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postAgent(runmode: StringValuePattern, name: StringValuePattern, jcrContentCqDistribute: StringValuePattern? = null, jcrContentCqDistributeAtTypeHint: StringValuePattern? = null, jcrContentCqName: StringValuePattern? = null, jcrContentCqTemplate: StringValuePattern? = null, jcrContentAliasUpdate: StringValuePattern? = null, jcrContentEnabled: StringValuePattern? = null, jcrContentJcrDescription: StringValuePattern? = null, jcrContentJcrLastModified: StringValuePattern? = null, jcrContentJcrLastModifiedBy: StringValuePattern? = null, jcrContentJcrMixinTypes: StringValuePattern? = null, jcrContentJcrTitle: StringValuePattern? = null, jcrContentLogLevel: StringValuePattern? = null, jcrContentNoStatusUpdate: StringValuePattern? = null, jcrContentNoVersioning: StringValuePattern? = null, jcrContentProtocolConnectTimeout: StringValuePattern? = null, jcrContentProtocolHTTPConnectionClosed: StringValuePattern? = null, jcrContentProtocolHTTPExpired: StringValuePattern? = null, jcrContentProtocolHTTPHeaders: StringValuePattern? = null, jcrContentProtocolHTTPHeadersAtTypeHint: StringValuePattern? = null, jcrContentProtocolHTTPMethod: StringValuePattern? = null, jcrContentProtocolHTTPSRelaxed: StringValuePattern? = null, jcrContentProtocolInterface: StringValuePattern? = null, jcrContentProtocolSocketTimeout: StringValuePattern? = null, jcrContentProtocolVersion: StringValuePattern? = null, jcrContentProxyNTLMDomain: StringValuePattern? = null, jcrContentProxyNTLMHost: StringValuePattern? = null, jcrContentProxyHost: StringValuePattern? = null, jcrContentProxyPassword: StringValuePattern? = null, jcrContentProxyPort: StringValuePattern? = null, jcrContentProxyUser: StringValuePattern? = null, jcrContentQueueBatchMaxSize: StringValuePattern? = null, jcrContentQueueBatchMode: StringValuePattern? = null, jcrContentQueueBatchWaitTime: StringValuePattern? = null, jcrContentRetryDelay: StringValuePattern? = null, jcrContentReverseReplication: StringValuePattern? = null, jcrContentSerializationType: StringValuePattern? = null, jcrContentSlingResourceType: StringValuePattern? = null, jcrContentSsl: StringValuePattern? = null, jcrContentTransportNTLMDomain: StringValuePattern? = null, jcrContentTransportNTLMHost: StringValuePattern? = null, jcrContentTransportPassword: StringValuePattern? = null, jcrContentTransportUri: StringValuePattern? = null, jcrContentTransportUser: StringValuePattern? = null, jcrContentTriggerDistribute: StringValuePattern? = null, jcrContentTriggerModified: StringValuePattern? = null, jcrContentTriggerOnOffTime: StringValuePattern? = null, jcrContentTriggerReceive: StringValuePattern? = null, jcrContentTriggerSpecific: StringValuePattern? = null, jcrContentUserId: StringValuePattern? = null, jcrPrimaryType: StringValuePattern? = null, operation: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostAgentStubBuilder =
        PostAgentStubBuilder(objectMapper, post(urlPathTemplate("/etc/replication/agents.{runmode}/{name}"))
            .withPathParam("runmode", runmode)
            .withPathParam("name", name)
            .apply { jcrContentCqDistribute?.let { withQueryParam("jcr:content/cq:distribute", it) } }
            .apply { jcrContentCqDistributeAtTypeHint?.let { withQueryParam("jcr:content/cq:distribute@TypeHint", it) } }
            .apply { jcrContentCqName?.let { withQueryParam("jcr:content/cq:name", it) } }
            .apply { jcrContentCqTemplate?.let { withQueryParam("jcr:content/cq:template", it) } }
            .apply { jcrContentAliasUpdate?.let { withQueryParam("jcr:content/aliasUpdate", it) } }
            .apply { jcrContentEnabled?.let { withQueryParam("jcr:content/enabled", it) } }
            .apply { jcrContentJcrDescription?.let { withQueryParam("jcr:content/jcr:description", it) } }
            .apply { jcrContentJcrLastModified?.let { withQueryParam("jcr:content/jcr:lastModified", it) } }
            .apply { jcrContentJcrLastModifiedBy?.let { withQueryParam("jcr:content/jcr:lastModifiedBy", it) } }
            .apply { jcrContentJcrMixinTypes?.let { withQueryParam("jcr:content/jcr:mixinTypes", it) } }
            .apply { jcrContentJcrTitle?.let { withQueryParam("jcr:content/jcr:title", it) } }
            .apply { jcrContentLogLevel?.let { withQueryParam("jcr:content/logLevel", it) } }
            .apply { jcrContentNoStatusUpdate?.let { withQueryParam("jcr:content/noStatusUpdate", it) } }
            .apply { jcrContentNoVersioning?.let { withQueryParam("jcr:content/noVersioning", it) } }
            .apply { jcrContentProtocolConnectTimeout?.let { withQueryParam("jcr:content/protocolConnectTimeout", it) } }
            .apply { jcrContentProtocolHTTPConnectionClosed?.let { withQueryParam("jcr:content/protocolHTTPConnectionClosed", it) } }
            .apply { jcrContentProtocolHTTPExpired?.let { withQueryParam("jcr:content/protocolHTTPExpired", it) } }
            .apply { jcrContentProtocolHTTPHeaders?.let { withQueryParam("jcr:content/protocolHTTPHeaders", it) } }
            .apply { jcrContentProtocolHTTPHeadersAtTypeHint?.let { withQueryParam("jcr:content/protocolHTTPHeaders@TypeHint", it) } }
            .apply { jcrContentProtocolHTTPMethod?.let { withQueryParam("jcr:content/protocolHTTPMethod", it) } }
            .apply { jcrContentProtocolHTTPSRelaxed?.let { withQueryParam("jcr:content/protocolHTTPSRelaxed", it) } }
            .apply { jcrContentProtocolInterface?.let { withQueryParam("jcr:content/protocolInterface", it) } }
            .apply { jcrContentProtocolSocketTimeout?.let { withQueryParam("jcr:content/protocolSocketTimeout", it) } }
            .apply { jcrContentProtocolVersion?.let { withQueryParam("jcr:content/protocolVersion", it) } }
            .apply { jcrContentProxyNTLMDomain?.let { withQueryParam("jcr:content/proxyNTLMDomain", it) } }
            .apply { jcrContentProxyNTLMHost?.let { withQueryParam("jcr:content/proxyNTLMHost", it) } }
            .apply { jcrContentProxyHost?.let { withQueryParam("jcr:content/proxyHost", it) } }
            .apply { jcrContentProxyPassword?.let { withQueryParam("jcr:content/proxyPassword", it) } }
            .apply { jcrContentProxyPort?.let { withQueryParam("jcr:content/proxyPort", it) } }
            .apply { jcrContentProxyUser?.let { withQueryParam("jcr:content/proxyUser", it) } }
            .apply { jcrContentQueueBatchMaxSize?.let { withQueryParam("jcr:content/queueBatchMaxSize", it) } }
            .apply { jcrContentQueueBatchMode?.let { withQueryParam("jcr:content/queueBatchMode", it) } }
            .apply { jcrContentQueueBatchWaitTime?.let { withQueryParam("jcr:content/queueBatchWaitTime", it) } }
            .apply { jcrContentRetryDelay?.let { withQueryParam("jcr:content/retryDelay", it) } }
            .apply { jcrContentReverseReplication?.let { withQueryParam("jcr:content/reverseReplication", it) } }
            .apply { jcrContentSerializationType?.let { withQueryParam("jcr:content/serializationType", it) } }
            .apply { jcrContentSlingResourceType?.let { withQueryParam("jcr:content/sling:resourceType", it) } }
            .apply { jcrContentSsl?.let { withQueryParam("jcr:content/ssl", it) } }
            .apply { jcrContentTransportNTLMDomain?.let { withQueryParam("jcr:content/transportNTLMDomain", it) } }
            .apply { jcrContentTransportNTLMHost?.let { withQueryParam("jcr:content/transportNTLMHost", it) } }
            .apply { jcrContentTransportPassword?.let { withQueryParam("jcr:content/transportPassword", it) } }
            .apply { jcrContentTransportUri?.let { withQueryParam("jcr:content/transportUri", it) } }
            .apply { jcrContentTransportUser?.let { withQueryParam("jcr:content/transportUser", it) } }
            .apply { jcrContentTriggerDistribute?.let { withQueryParam("jcr:content/triggerDistribute", it) } }
            .apply { jcrContentTriggerModified?.let { withQueryParam("jcr:content/triggerModified", it) } }
            .apply { jcrContentTriggerOnOffTime?.let { withQueryParam("jcr:content/triggerOnOffTime", it) } }
            .apply { jcrContentTriggerReceive?.let { withQueryParam("jcr:content/triggerReceive", it) } }
            .apply { jcrContentTriggerSpecific?.let { withQueryParam("jcr:content/triggerSpecific", it) } }
            .apply { jcrContentUserId?.let { withQueryParam("jcr:content/userId", it) } }
            .apply { jcrPrimaryType?.let { withQueryParam("jcr:primaryType", it) } }
            .apply { operation?.let { withQueryParam(":operation", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postAuthorizableKeystore.
     *
     * @param intermediatePath path parameter intermediatePath pattern.
     * @param authorizableId path parameter authorizableId pattern.
     * @param operation query parameter operation pattern.
     * @param currentPassword query parameter currentPassword pattern.
     * @param newPassword query parameter newPassword pattern.
     * @param rePassword query parameter rePassword pattern.
     * @param keyPassword query parameter keyPassword pattern.
     * @param keyStorePass query parameter keyStorePass pattern.
     * @param alias query parameter alias pattern.
     * @param newAlias query parameter newAlias pattern.
     * @param removeAlias query parameter removeAlias pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostAuthorizableKeystoreStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postAuthorizableKeystore(intermediatePath: StringValuePattern, authorizableId: StringValuePattern, operation: StringValuePattern? = null, currentPassword: StringValuePattern? = null, newPassword: StringValuePattern? = null, rePassword: StringValuePattern? = null, keyPassword: StringValuePattern? = null, keyStorePass: StringValuePattern? = null, alias: StringValuePattern? = null, newAlias: StringValuePattern? = null, removeAlias: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostAuthorizableKeystoreStubBuilder =
        PostAuthorizableKeystoreStubBuilder(objectMapper, post(urlPathTemplate("/{intermediatePath}/{authorizableId}.ks.html"))
            .withPathParam("intermediatePath", intermediatePath)
            .withPathParam("authorizableId", authorizableId)
            .apply { operation?.let { withQueryParam(":operation", it) } }
            .apply { currentPassword?.let { withQueryParam("currentPassword", it) } }
            .apply { newPassword?.let { withQueryParam("newPassword", it) } }
            .apply { rePassword?.let { withQueryParam("rePassword", it) } }
            .apply { keyPassword?.let { withQueryParam("keyPassword", it) } }
            .apply { keyStorePass?.let { withQueryParam("keyStorePass", it) } }
            .apply { alias?.let { withQueryParam("alias", it) } }
            .apply { newAlias?.let { withQueryParam("newAlias", it) } }
            .apply { removeAlias?.let { withQueryParam("removeAlias", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postAuthorizables.
     *
     * @param authorizableId query parameter authorizableId pattern.
     * @param intermediatePath query parameter intermediatePath pattern.
     * @param createUser query parameter createUser pattern.
     * @param createGroup query parameter createGroup pattern.
     * @param repPassword query parameter repPassword pattern.
     * @param profileGivenName query parameter profileGivenName pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostAuthorizablesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postAuthorizables(authorizableId: StringValuePattern? = null, intermediatePath: StringValuePattern? = null, createUser: StringValuePattern? = null, createGroup: StringValuePattern? = null, repPassword: StringValuePattern? = null, profileGivenName: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostAuthorizablesStubBuilder =
        PostAuthorizablesStubBuilder(objectMapper, post(urlPathTemplate("/libs/granite/security/post/authorizables"))
            .apply { authorizableId?.let { withQueryParam("authorizableId", it) } }
            .apply { intermediatePath?.let { withQueryParam("intermediatePath", it) } }
            .apply { createUser?.let { withQueryParam("createUser", it) } }
            .apply { createGroup?.let { withQueryParam("createGroup", it) } }
            .apply { repPassword?.let { withQueryParam("rep:password", it) } }
            .apply { profileGivenName?.let { withQueryParam("profile/givenName", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postConfigAdobeGraniteSamlAuthenticationHandler.
     *
     * @param keyStorePassword query parameter keyStorePassword pattern.
     * @param keyStorePasswordAtTypeHint query parameter keyStorePasswordAtTypeHint pattern.
     * @param serviceRanking query parameter serviceRanking pattern.
     * @param serviceRankingAtTypeHint query parameter serviceRankingAtTypeHint pattern.
     * @param idpHttpRedirect query parameter idpHttpRedirect pattern.
     * @param idpHttpRedirectAtTypeHint query parameter idpHttpRedirectAtTypeHint pattern.
     * @param createUser query parameter createUser pattern.
     * @param createUserAtTypeHint query parameter createUserAtTypeHint pattern.
     * @param defaultRedirectUrl query parameter defaultRedirectUrl pattern.
     * @param defaultRedirectUrlAtTypeHint query parameter defaultRedirectUrlAtTypeHint pattern.
     * @param userIDAttribute query parameter userIDAttribute pattern.
     * @param userIDAttributeAtTypeHint query parameter userIDAttributeAtTypeHint pattern.
     * @param defaultGroups query parameter defaultGroups pattern.
     * @param defaultGroupsAtTypeHint query parameter defaultGroupsAtTypeHint pattern.
     * @param idpCertAlias query parameter idpCertAlias pattern.
     * @param idpCertAliasAtTypeHint query parameter idpCertAliasAtTypeHint pattern.
     * @param addGroupMemberships query parameter addGroupMemberships pattern.
     * @param addGroupMembershipsAtTypeHint query parameter addGroupMembershipsAtTypeHint pattern.
     * @param path query parameter path pattern.
     * @param pathAtTypeHint query parameter pathAtTypeHint pattern.
     * @param synchronizeAttributes query parameter synchronizeAttributes pattern.
     * @param synchronizeAttributesAtTypeHint query parameter synchronizeAttributesAtTypeHint pattern.
     * @param clockTolerance query parameter clockTolerance pattern.
     * @param clockToleranceAtTypeHint query parameter clockToleranceAtTypeHint pattern.
     * @param groupMembershipAttribute query parameter groupMembershipAttribute pattern.
     * @param groupMembershipAttributeAtTypeHint query parameter groupMembershipAttributeAtTypeHint pattern.
     * @param idpUrl query parameter idpUrl pattern.
     * @param idpUrlAtTypeHint query parameter idpUrlAtTypeHint pattern.
     * @param logoutUrl query parameter logoutUrl pattern.
     * @param logoutUrlAtTypeHint query parameter logoutUrlAtTypeHint pattern.
     * @param serviceProviderEntityId query parameter serviceProviderEntityId pattern.
     * @param serviceProviderEntityIdAtTypeHint query parameter serviceProviderEntityIdAtTypeHint pattern.
     * @param assertionConsumerServiceURL query parameter assertionConsumerServiceURL pattern.
     * @param assertionConsumerServiceURLAtTypeHint query parameter assertionConsumerServiceURLAtTypeHint pattern.
     * @param handleLogout query parameter handleLogout pattern.
     * @param handleLogoutAtTypeHint query parameter handleLogoutAtTypeHint pattern.
     * @param spPrivateKeyAlias query parameter spPrivateKeyAlias pattern.
     * @param spPrivateKeyAliasAtTypeHint query parameter spPrivateKeyAliasAtTypeHint pattern.
     * @param useEncryption query parameter useEncryption pattern.
     * @param useEncryptionAtTypeHint query parameter useEncryptionAtTypeHint pattern.
     * @param nameIdFormat query parameter nameIdFormat pattern.
     * @param nameIdFormatAtTypeHint query parameter nameIdFormatAtTypeHint pattern.
     * @param digestMethod query parameter digestMethod pattern.
     * @param digestMethodAtTypeHint query parameter digestMethodAtTypeHint pattern.
     * @param signatureMethod query parameter signatureMethod pattern.
     * @param signatureMethodAtTypeHint query parameter signatureMethodAtTypeHint pattern.
     * @param userIntermediatePath query parameter userIntermediatePath pattern.
     * @param userIntermediatePathAtTypeHint query parameter userIntermediatePathAtTypeHint pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostConfigAdobeGraniteSamlAuthenticationHandlerStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword: StringValuePattern? = null, keyStorePasswordAtTypeHint: StringValuePattern? = null, serviceRanking: StringValuePattern? = null, serviceRankingAtTypeHint: StringValuePattern? = null, idpHttpRedirect: StringValuePattern? = null, idpHttpRedirectAtTypeHint: StringValuePattern? = null, createUser: StringValuePattern? = null, createUserAtTypeHint: StringValuePattern? = null, defaultRedirectUrl: StringValuePattern? = null, defaultRedirectUrlAtTypeHint: StringValuePattern? = null, userIDAttribute: StringValuePattern? = null, userIDAttributeAtTypeHint: StringValuePattern? = null, defaultGroups: StringValuePattern? = null, defaultGroupsAtTypeHint: StringValuePattern? = null, idpCertAlias: StringValuePattern? = null, idpCertAliasAtTypeHint: StringValuePattern? = null, addGroupMemberships: StringValuePattern? = null, addGroupMembershipsAtTypeHint: StringValuePattern? = null, path: StringValuePattern? = null, pathAtTypeHint: StringValuePattern? = null, synchronizeAttributes: StringValuePattern? = null, synchronizeAttributesAtTypeHint: StringValuePattern? = null, clockTolerance: StringValuePattern? = null, clockToleranceAtTypeHint: StringValuePattern? = null, groupMembershipAttribute: StringValuePattern? = null, groupMembershipAttributeAtTypeHint: StringValuePattern? = null, idpUrl: StringValuePattern? = null, idpUrlAtTypeHint: StringValuePattern? = null, logoutUrl: StringValuePattern? = null, logoutUrlAtTypeHint: StringValuePattern? = null, serviceProviderEntityId: StringValuePattern? = null, serviceProviderEntityIdAtTypeHint: StringValuePattern? = null, assertionConsumerServiceURL: StringValuePattern? = null, assertionConsumerServiceURLAtTypeHint: StringValuePattern? = null, handleLogout: StringValuePattern? = null, handleLogoutAtTypeHint: StringValuePattern? = null, spPrivateKeyAlias: StringValuePattern? = null, spPrivateKeyAliasAtTypeHint: StringValuePattern? = null, useEncryption: StringValuePattern? = null, useEncryptionAtTypeHint: StringValuePattern? = null, nameIdFormat: StringValuePattern? = null, nameIdFormatAtTypeHint: StringValuePattern? = null, digestMethod: StringValuePattern? = null, digestMethodAtTypeHint: StringValuePattern? = null, signatureMethod: StringValuePattern? = null, signatureMethodAtTypeHint: StringValuePattern? = null, userIntermediatePath: StringValuePattern? = null, userIntermediatePathAtTypeHint: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostConfigAdobeGraniteSamlAuthenticationHandlerStubBuilder =
        PostConfigAdobeGraniteSamlAuthenticationHandlerStubBuilder(objectMapper, post(urlPathTemplate("/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config"))
            .apply { keyStorePassword?.let { withQueryParam("keyStorePassword", it) } }
            .apply { keyStorePasswordAtTypeHint?.let { withQueryParam("keyStorePassword@TypeHint", it) } }
            .apply { serviceRanking?.let { withQueryParam("service.ranking", it) } }
            .apply { serviceRankingAtTypeHint?.let { withQueryParam("service.ranking@TypeHint", it) } }
            .apply { idpHttpRedirect?.let { withQueryParam("idpHttpRedirect", it) } }
            .apply { idpHttpRedirectAtTypeHint?.let { withQueryParam("idpHttpRedirect@TypeHint", it) } }
            .apply { createUser?.let { withQueryParam("createUser", it) } }
            .apply { createUserAtTypeHint?.let { withQueryParam("createUser@TypeHint", it) } }
            .apply { defaultRedirectUrl?.let { withQueryParam("defaultRedirectUrl", it) } }
            .apply { defaultRedirectUrlAtTypeHint?.let { withQueryParam("defaultRedirectUrl@TypeHint", it) } }
            .apply { userIDAttribute?.let { withQueryParam("userIDAttribute", it) } }
            .apply { userIDAttributeAtTypeHint?.let { withQueryParam("userIDAttribute@TypeHint", it) } }
            .apply { defaultGroups?.let { withQueryParam("defaultGroups", it) } }
            .apply { defaultGroupsAtTypeHint?.let { withQueryParam("defaultGroups@TypeHint", it) } }
            .apply { idpCertAlias?.let { withQueryParam("idpCertAlias", it) } }
            .apply { idpCertAliasAtTypeHint?.let { withQueryParam("idpCertAlias@TypeHint", it) } }
            .apply { addGroupMemberships?.let { withQueryParam("addGroupMemberships", it) } }
            .apply { addGroupMembershipsAtTypeHint?.let { withQueryParam("addGroupMemberships@TypeHint", it) } }
            .apply { path?.let { withQueryParam("path", it) } }
            .apply { pathAtTypeHint?.let { withQueryParam("path@TypeHint", it) } }
            .apply { synchronizeAttributes?.let { withQueryParam("synchronizeAttributes", it) } }
            .apply { synchronizeAttributesAtTypeHint?.let { withQueryParam("synchronizeAttributes@TypeHint", it) } }
            .apply { clockTolerance?.let { withQueryParam("clockTolerance", it) } }
            .apply { clockToleranceAtTypeHint?.let { withQueryParam("clockTolerance@TypeHint", it) } }
            .apply { groupMembershipAttribute?.let { withQueryParam("groupMembershipAttribute", it) } }
            .apply { groupMembershipAttributeAtTypeHint?.let { withQueryParam("groupMembershipAttribute@TypeHint", it) } }
            .apply { idpUrl?.let { withQueryParam("idpUrl", it) } }
            .apply { idpUrlAtTypeHint?.let { withQueryParam("idpUrl@TypeHint", it) } }
            .apply { logoutUrl?.let { withQueryParam("logoutUrl", it) } }
            .apply { logoutUrlAtTypeHint?.let { withQueryParam("logoutUrl@TypeHint", it) } }
            .apply { serviceProviderEntityId?.let { withQueryParam("serviceProviderEntityId", it) } }
            .apply { serviceProviderEntityIdAtTypeHint?.let { withQueryParam("serviceProviderEntityId@TypeHint", it) } }
            .apply { assertionConsumerServiceURL?.let { withQueryParam("assertionConsumerServiceURL", it) } }
            .apply { assertionConsumerServiceURLAtTypeHint?.let { withQueryParam("assertionConsumerServiceURL@TypeHint", it) } }
            .apply { handleLogout?.let { withQueryParam("handleLogout", it) } }
            .apply { handleLogoutAtTypeHint?.let { withQueryParam("handleLogout@TypeHint", it) } }
            .apply { spPrivateKeyAlias?.let { withQueryParam("spPrivateKeyAlias", it) } }
            .apply { spPrivateKeyAliasAtTypeHint?.let { withQueryParam("spPrivateKeyAlias@TypeHint", it) } }
            .apply { useEncryption?.let { withQueryParam("useEncryption", it) } }
            .apply { useEncryptionAtTypeHint?.let { withQueryParam("useEncryption@TypeHint", it) } }
            .apply { nameIdFormat?.let { withQueryParam("nameIdFormat", it) } }
            .apply { nameIdFormatAtTypeHint?.let { withQueryParam("nameIdFormat@TypeHint", it) } }
            .apply { digestMethod?.let { withQueryParam("digestMethod", it) } }
            .apply { digestMethodAtTypeHint?.let { withQueryParam("digestMethod@TypeHint", it) } }
            .apply { signatureMethod?.let { withQueryParam("signatureMethod", it) } }
            .apply { signatureMethodAtTypeHint?.let { withQueryParam("signatureMethod@TypeHint", it) } }
            .apply { userIntermediatePath?.let { withQueryParam("userIntermediatePath", it) } }
            .apply { userIntermediatePathAtTypeHint?.let { withQueryParam("userIntermediatePath@TypeHint", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postConfigApacheFelixJettyBasedHttpService.
     *
     * @param orgApacheFelixHttpsNio query parameter orgApacheFelixHttpsNio pattern.
     * @param orgApacheFelixHttpsNioAtTypeHint query parameter orgApacheFelixHttpsNioAtTypeHint pattern.
     * @param orgApacheFelixHttpsKeystore query parameter orgApacheFelixHttpsKeystore pattern.
     * @param orgApacheFelixHttpsKeystoreAtTypeHint query parameter orgApacheFelixHttpsKeystoreAtTypeHint pattern.
     * @param orgApacheFelixHttpsKeystorePassword query parameter orgApacheFelixHttpsKeystorePassword pattern.
     * @param orgApacheFelixHttpsKeystorePasswordAtTypeHint query parameter orgApacheFelixHttpsKeystorePasswordAtTypeHint pattern.
     * @param orgApacheFelixHttpsKeystoreKey query parameter orgApacheFelixHttpsKeystoreKey pattern.
     * @param orgApacheFelixHttpsKeystoreKeyAtTypeHint query parameter orgApacheFelixHttpsKeystoreKeyAtTypeHint pattern.
     * @param orgApacheFelixHttpsKeystoreKeyPassword query parameter orgApacheFelixHttpsKeystoreKeyPassword pattern.
     * @param orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint query parameter orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint pattern.
     * @param orgApacheFelixHttpsTruststore query parameter orgApacheFelixHttpsTruststore pattern.
     * @param orgApacheFelixHttpsTruststoreAtTypeHint query parameter orgApacheFelixHttpsTruststoreAtTypeHint pattern.
     * @param orgApacheFelixHttpsTruststorePassword query parameter orgApacheFelixHttpsTruststorePassword pattern.
     * @param orgApacheFelixHttpsTruststorePasswordAtTypeHint query parameter orgApacheFelixHttpsTruststorePasswordAtTypeHint pattern.
     * @param orgApacheFelixHttpsClientcertificate query parameter orgApacheFelixHttpsClientcertificate pattern.
     * @param orgApacheFelixHttpsClientcertificateAtTypeHint query parameter orgApacheFelixHttpsClientcertificateAtTypeHint pattern.
     * @param orgApacheFelixHttpsEnable query parameter orgApacheFelixHttpsEnable pattern.
     * @param orgApacheFelixHttpsEnableAtTypeHint query parameter orgApacheFelixHttpsEnableAtTypeHint pattern.
     * @param orgOsgiServiceHttpPortSecure query parameter orgOsgiServiceHttpPortSecure pattern.
     * @param orgOsgiServiceHttpPortSecureAtTypeHint query parameter orgOsgiServiceHttpPortSecureAtTypeHint pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostConfigApacheFelixJettyBasedHttpServiceStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio: StringValuePattern? = null, orgApacheFelixHttpsNioAtTypeHint: StringValuePattern? = null, orgApacheFelixHttpsKeystore: StringValuePattern? = null, orgApacheFelixHttpsKeystoreAtTypeHint: StringValuePattern? = null, orgApacheFelixHttpsKeystorePassword: StringValuePattern? = null, orgApacheFelixHttpsKeystorePasswordAtTypeHint: StringValuePattern? = null, orgApacheFelixHttpsKeystoreKey: StringValuePattern? = null, orgApacheFelixHttpsKeystoreKeyAtTypeHint: StringValuePattern? = null, orgApacheFelixHttpsKeystoreKeyPassword: StringValuePattern? = null, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint: StringValuePattern? = null, orgApacheFelixHttpsTruststore: StringValuePattern? = null, orgApacheFelixHttpsTruststoreAtTypeHint: StringValuePattern? = null, orgApacheFelixHttpsTruststorePassword: StringValuePattern? = null, orgApacheFelixHttpsTruststorePasswordAtTypeHint: StringValuePattern? = null, orgApacheFelixHttpsClientcertificate: StringValuePattern? = null, orgApacheFelixHttpsClientcertificateAtTypeHint: StringValuePattern? = null, orgApacheFelixHttpsEnable: StringValuePattern? = null, orgApacheFelixHttpsEnableAtTypeHint: StringValuePattern? = null, orgOsgiServiceHttpPortSecure: StringValuePattern? = null, orgOsgiServiceHttpPortSecureAtTypeHint: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostConfigApacheFelixJettyBasedHttpServiceStubBuilder =
        PostConfigApacheFelixJettyBasedHttpServiceStubBuilder(objectMapper, post(urlPathTemplate("/apps/system/config/org.apache.felix.http"))
            .apply { orgApacheFelixHttpsNio?.let { withQueryParam("org.apache.felix.https.nio", it) } }
            .apply { orgApacheFelixHttpsNioAtTypeHint?.let { withQueryParam("org.apache.felix.https.nio@TypeHint", it) } }
            .apply { orgApacheFelixHttpsKeystore?.let { withQueryParam("org.apache.felix.https.keystore", it) } }
            .apply { orgApacheFelixHttpsKeystoreAtTypeHint?.let { withQueryParam("org.apache.felix.https.keystore@TypeHint", it) } }
            .apply { orgApacheFelixHttpsKeystorePassword?.let { withQueryParam("org.apache.felix.https.keystore.password", it) } }
            .apply { orgApacheFelixHttpsKeystorePasswordAtTypeHint?.let { withQueryParam("org.apache.felix.https.keystore.password@TypeHint", it) } }
            .apply { orgApacheFelixHttpsKeystoreKey?.let { withQueryParam("org.apache.felix.https.keystore.key", it) } }
            .apply { orgApacheFelixHttpsKeystoreKeyAtTypeHint?.let { withQueryParam("org.apache.felix.https.keystore.key@TypeHint", it) } }
            .apply { orgApacheFelixHttpsKeystoreKeyPassword?.let { withQueryParam("org.apache.felix.https.keystore.key.password", it) } }
            .apply { orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint?.let { withQueryParam("org.apache.felix.https.keystore.key.password@TypeHint", it) } }
            .apply { orgApacheFelixHttpsTruststore?.let { withQueryParam("org.apache.felix.https.truststore", it) } }
            .apply { orgApacheFelixHttpsTruststoreAtTypeHint?.let { withQueryParam("org.apache.felix.https.truststore@TypeHint", it) } }
            .apply { orgApacheFelixHttpsTruststorePassword?.let { withQueryParam("org.apache.felix.https.truststore.password", it) } }
            .apply { orgApacheFelixHttpsTruststorePasswordAtTypeHint?.let { withQueryParam("org.apache.felix.https.truststore.password@TypeHint", it) } }
            .apply { orgApacheFelixHttpsClientcertificate?.let { withQueryParam("org.apache.felix.https.clientcertificate", it) } }
            .apply { orgApacheFelixHttpsClientcertificateAtTypeHint?.let { withQueryParam("org.apache.felix.https.clientcertificate@TypeHint", it) } }
            .apply { orgApacheFelixHttpsEnable?.let { withQueryParam("org.apache.felix.https.enable", it) } }
            .apply { orgApacheFelixHttpsEnableAtTypeHint?.let { withQueryParam("org.apache.felix.https.enable@TypeHint", it) } }
            .apply { orgOsgiServiceHttpPortSecure?.let { withQueryParam("org.osgi.service.http.port.secure", it) } }
            .apply { orgOsgiServiceHttpPortSecureAtTypeHint?.let { withQueryParam("org.osgi.service.http.port.secure@TypeHint", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postConfigApacheHttpComponentsProxyConfiguration.
     *
     * @param proxyHost query parameter proxyHost pattern.
     * @param proxyHostAtTypeHint query parameter proxyHostAtTypeHint pattern.
     * @param proxyPort query parameter proxyPort pattern.
     * @param proxyPortAtTypeHint query parameter proxyPortAtTypeHint pattern.
     * @param proxyExceptions query parameter proxyExceptions pattern.
     * @param proxyExceptionsAtTypeHint query parameter proxyExceptionsAtTypeHint pattern.
     * @param proxyEnabled query parameter proxyEnabled pattern.
     * @param proxyEnabledAtTypeHint query parameter proxyEnabledAtTypeHint pattern.
     * @param proxyUser query parameter proxyUser pattern.
     * @param proxyUserAtTypeHint query parameter proxyUserAtTypeHint pattern.
     * @param proxyPassword query parameter proxyPassword pattern.
     * @param proxyPasswordAtTypeHint query parameter proxyPasswordAtTypeHint pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostConfigApacheHttpComponentsProxyConfigurationStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postConfigApacheHttpComponentsProxyConfiguration(proxyHost: StringValuePattern? = null, proxyHostAtTypeHint: StringValuePattern? = null, proxyPort: StringValuePattern? = null, proxyPortAtTypeHint: StringValuePattern? = null, proxyExceptions: StringValuePattern? = null, proxyExceptionsAtTypeHint: StringValuePattern? = null, proxyEnabled: StringValuePattern? = null, proxyEnabledAtTypeHint: StringValuePattern? = null, proxyUser: StringValuePattern? = null, proxyUserAtTypeHint: StringValuePattern? = null, proxyPassword: StringValuePattern? = null, proxyPasswordAtTypeHint: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostConfigApacheHttpComponentsProxyConfigurationStubBuilder =
        PostConfigApacheHttpComponentsProxyConfigurationStubBuilder(objectMapper, post(urlPathTemplate("/apps/system/config/org.apache.http.proxyconfigurator.config"))
            .apply { proxyHost?.let { withQueryParam("proxy.host", it) } }
            .apply { proxyHostAtTypeHint?.let { withQueryParam("proxy.host@TypeHint", it) } }
            .apply { proxyPort?.let { withQueryParam("proxy.port", it) } }
            .apply { proxyPortAtTypeHint?.let { withQueryParam("proxy.port@TypeHint", it) } }
            .apply { proxyExceptions?.let { withQueryParam("proxy.exceptions", it) } }
            .apply { proxyExceptionsAtTypeHint?.let { withQueryParam("proxy.exceptions@TypeHint", it) } }
            .apply { proxyEnabled?.let { withQueryParam("proxy.enabled", it) } }
            .apply { proxyEnabledAtTypeHint?.let { withQueryParam("proxy.enabled@TypeHint", it) } }
            .apply { proxyUser?.let { withQueryParam("proxy.user", it) } }
            .apply { proxyUserAtTypeHint?.let { withQueryParam("proxy.user@TypeHint", it) } }
            .apply { proxyPassword?.let { withQueryParam("proxy.password", it) } }
            .apply { proxyPasswordAtTypeHint?.let { withQueryParam("proxy.password@TypeHint", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postConfigApacheSlingDavExServlet.
     *
     * @param alias query parameter alias pattern.
     * @param aliasAtTypeHint query parameter aliasAtTypeHint pattern.
     * @param davCreateAbsoluteUri query parameter davCreateAbsoluteUri pattern.
     * @param davCreateAbsoluteUriAtTypeHint query parameter davCreateAbsoluteUriAtTypeHint pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostConfigApacheSlingDavExServletStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postConfigApacheSlingDavExServlet(alias: StringValuePattern? = null, aliasAtTypeHint: StringValuePattern? = null, davCreateAbsoluteUri: StringValuePattern? = null, davCreateAbsoluteUriAtTypeHint: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostConfigApacheSlingDavExServletStubBuilder =
        PostConfigApacheSlingDavExServletStubBuilder(objectMapper, post(urlPathTemplate("/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet"))
            .apply { alias?.let { withQueryParam("alias", it) } }
            .apply { aliasAtTypeHint?.let { withQueryParam("alias@TypeHint", it) } }
            .apply { davCreateAbsoluteUri?.let { withQueryParam("dav.create-absolute-uri", it) } }
            .apply { davCreateAbsoluteUriAtTypeHint?.let { withQueryParam("dav.create-absolute-uri@TypeHint", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postConfigApacheSlingGetServlet.
     *
     * @param jsonMaximumresults query parameter jsonMaximumresults pattern.
     * @param jsonMaximumresultsAtTypeHint query parameter jsonMaximumresultsAtTypeHint pattern.
     * @param enableHtml query parameter enableHtml pattern.
     * @param enableHtmlAtTypeHint query parameter enableHtmlAtTypeHint pattern.
     * @param enableTxt query parameter enableTxt pattern.
     * @param enableTxtAtTypeHint query parameter enableTxtAtTypeHint pattern.
     * @param enableXml query parameter enableXml pattern.
     * @param enableXmlAtTypeHint query parameter enableXmlAtTypeHint pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostConfigApacheSlingGetServletStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postConfigApacheSlingGetServlet(jsonMaximumresults: StringValuePattern? = null, jsonMaximumresultsAtTypeHint: StringValuePattern? = null, enableHtml: StringValuePattern? = null, enableHtmlAtTypeHint: StringValuePattern? = null, enableTxt: StringValuePattern? = null, enableTxtAtTypeHint: StringValuePattern? = null, enableXml: StringValuePattern? = null, enableXmlAtTypeHint: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostConfigApacheSlingGetServletStubBuilder =
        PostConfigApacheSlingGetServletStubBuilder(objectMapper, post(urlPathTemplate("/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet"))
            .apply { jsonMaximumresults?.let { withQueryParam("json.maximumresults", it) } }
            .apply { jsonMaximumresultsAtTypeHint?.let { withQueryParam("json.maximumresults@TypeHint", it) } }
            .apply { enableHtml?.let { withQueryParam("enable.html", it) } }
            .apply { enableHtmlAtTypeHint?.let { withQueryParam("enable.html@TypeHint", it) } }
            .apply { enableTxt?.let { withQueryParam("enable.txt", it) } }
            .apply { enableTxtAtTypeHint?.let { withQueryParam("enable.txt@TypeHint", it) } }
            .apply { enableXml?.let { withQueryParam("enable.xml", it) } }
            .apply { enableXmlAtTypeHint?.let { withQueryParam("enable.xml@TypeHint", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postConfigApacheSlingReferrerFilter.
     *
     * @param allowEmpty query parameter allowEmpty pattern.
     * @param allowEmptyAtTypeHint query parameter allowEmptyAtTypeHint pattern.
     * @param allowHosts query parameter allowHosts pattern.
     * @param allowHostsAtTypeHint query parameter allowHostsAtTypeHint pattern.
     * @param allowHostsRegexp query parameter allowHostsRegexp pattern.
     * @param allowHostsRegexpAtTypeHint query parameter allowHostsRegexpAtTypeHint pattern.
     * @param filterMethods query parameter filterMethods pattern.
     * @param filterMethodsAtTypeHint query parameter filterMethodsAtTypeHint pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostConfigApacheSlingReferrerFilterStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postConfigApacheSlingReferrerFilter(allowEmpty: StringValuePattern? = null, allowEmptyAtTypeHint: StringValuePattern? = null, allowHosts: StringValuePattern? = null, allowHostsAtTypeHint: StringValuePattern? = null, allowHostsRegexp: StringValuePattern? = null, allowHostsRegexpAtTypeHint: StringValuePattern? = null, filterMethods: StringValuePattern? = null, filterMethodsAtTypeHint: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostConfigApacheSlingReferrerFilterStubBuilder =
        PostConfigApacheSlingReferrerFilterStubBuilder(objectMapper, post(urlPathTemplate("/apps/system/config/org.apache.sling.security.impl.ReferrerFilter"))
            .apply { allowEmpty?.let { withQueryParam("allow.empty", it) } }
            .apply { allowEmptyAtTypeHint?.let { withQueryParam("allow.empty@TypeHint", it) } }
            .apply { allowHosts?.let { withQueryParam("allow.hosts", it) } }
            .apply { allowHostsAtTypeHint?.let { withQueryParam("allow.hosts@TypeHint", it) } }
            .apply { allowHostsRegexp?.let { withQueryParam("allow.hosts.regexp", it) } }
            .apply { allowHostsRegexpAtTypeHint?.let { withQueryParam("allow.hosts.regexp@TypeHint", it) } }
            .apply { filterMethods?.let { withQueryParam("filter.methods", it) } }
            .apply { filterMethodsAtTypeHint?.let { withQueryParam("filter.methods@TypeHint", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postConfigProperty.
     *
     * @param configNodeName path parameter configNodeName pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostConfigPropertyStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postConfigProperty(configNodeName: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostConfigPropertyStubBuilder =
        PostConfigPropertyStubBuilder(objectMapper, post(urlPathTemplate("/apps/system/config/{configNodeName}"))
            .withPathParam("configNodeName", configNodeName)
            .configurer()
        )

    /**
     * Construct a stub for the operation postNode.
     *
     * @param path path parameter path pattern.
     * @param name path parameter name pattern.
     * @param operation query parameter operation pattern.
     * @param deleteAuthorizable query parameter deleteAuthorizable pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostNodeStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postNode(path: StringValuePattern, name: StringValuePattern, operation: StringValuePattern? = null, deleteAuthorizable: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostNodeStubBuilder =
        PostNodeStubBuilder(objectMapper, post(urlPathTemplate("/{path}/{name}"))
            .withPathParam("path", path)
            .withPathParam("name", name)
            .apply { operation?.let { withQueryParam(":operation", it) } }
            .apply { deleteAuthorizable?.let { withQueryParam("deleteAuthorizable", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postNodeRw.
     *
     * @param path path parameter path pattern.
     * @param name path parameter name pattern.
     * @param addMembers query parameter addMembers pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostNodeRwStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postNodeRw(path: StringValuePattern, name: StringValuePattern, addMembers: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostNodeRwStubBuilder =
        PostNodeRwStubBuilder(objectMapper, post(urlPathTemplate("/{path}/{name}.rw.html"))
            .withPathParam("path", path)
            .withPathParam("name", name)
            .apply { addMembers?.let { withQueryParam("addMembers", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postPath.
     *
     * @param path path parameter path pattern.
     * @param jcrPrimaryType query parameter jcrPrimaryType pattern.
     * @param name query parameter name pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostPathStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postPath(path: StringValuePattern, jcrPrimaryType: StringValuePattern? = null, name: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostPathStubBuilder =
        PostPathStubBuilder(objectMapper, post(urlPathTemplate("/{path}/"))
            .withPathParam("path", path)
            .apply { jcrPrimaryType?.let { withQueryParam("jcr:primaryType", it) } }
            .apply { name?.let { withQueryParam(":name", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postQuery.
     *
     * @param path query parameter path pattern.
     * @param pLimit query parameter pLimit pattern.
     * @param &#x60;1property&#x60; query parameter &#x60;1property&#x60; pattern.
     * @param &#x60;1propertyValue&#x60; query parameter &#x60;1propertyValue&#x60; pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostQueryStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postQuery(path: StringValuePattern? = null, pLimit: StringValuePattern? = null, &#x60;1property&#x60;: StringValuePattern? = null, &#x60;1propertyValue&#x60;: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostQueryStubBuilder =
        PostQueryStubBuilder(objectMapper, post(urlPathTemplate("/bin/querybuilder.json"))
            .apply { path?.let { withQueryParam("path", it) } }
            .apply { pLimit?.let { withQueryParam("p.limit", it) } }
            .apply { &#x60;1property&#x60;?.let { withQueryParam("1_property", it) } }
            .apply { &#x60;1propertyValue&#x60;?.let { withQueryParam("1_property.value", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postTreeActivation.
     *
     * @param ignoredeactivated query parameter ignoredeactivated pattern.
     * @param onlymodified query parameter onlymodified pattern.
     * @param path query parameter path pattern.
     * @param cmd query parameter cmd pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostTreeActivationStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postTreeActivation(ignoredeactivated: StringValuePattern? = null, onlymodified: StringValuePattern? = null, path: StringValuePattern? = null, cmd: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostTreeActivationStubBuilder =
        PostTreeActivationStubBuilder(objectMapper, post(urlPathTemplate("/libs/replication/treeactivation.html"))
            .apply { ignoredeactivated?.let { withQueryParam("ignoredeactivated", it) } }
            .apply { onlymodified?.let { withQueryParam("onlymodified", it) } }
            .apply { path?.let { withQueryParam("path", it) } }
            .apply { cmd?.let { withQueryParam("cmd", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postTruststore.
     *
     * @param operation query parameter operation pattern.
     * @param newPassword query parameter newPassword pattern.
     * @param rePassword query parameter rePassword pattern.
     * @param keyStoreType query parameter keyStoreType pattern.
     * @param removeAlias query parameter removeAlias pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostTruststoreStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postTruststore(operation: StringValuePattern? = null, newPassword: StringValuePattern? = null, rePassword: StringValuePattern? = null, keyStoreType: StringValuePattern? = null, removeAlias: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PostTruststoreStubBuilder =
        PostTruststoreStubBuilder(objectMapper, post(urlPathTemplate("/libs/granite/security/post/truststore"))
            .apply { operation?.let { withQueryParam(":operation", it) } }
            .apply { newPassword?.let { withQueryParam("newPassword", it) } }
            .apply { rePassword?.let { withQueryParam("rePassword", it) } }
            .apply { keyStoreType?.let { withQueryParam("keyStoreType", it) } }
            .apply { removeAlias?.let { withQueryParam("removeAlias", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation postTruststorePKCS12.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PostTruststorePKCS12StubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun postTruststorePKCS12(configurer: MappingBuilder.() -> MappingBuilder = { this }): PostTruststorePKCS12StubBuilder =
        PostTruststorePKCS12StubBuilder(objectMapper, post(urlPathTemplate("/etc/truststore"))
            .configurer()
        )
}

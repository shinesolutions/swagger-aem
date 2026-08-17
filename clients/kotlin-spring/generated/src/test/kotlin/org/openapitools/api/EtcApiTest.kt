package org.openapitools.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class EtcApiTest {

    private val api: EtcApiController = EtcApiController()

    /**
     * To test EtcApiController.deleteAgent
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteAgentTest() {
        val runmode: kotlin.String = TODO()
        val name: kotlin.String = TODO()
        
        
        val response: ResponseEntity<Unit> = api.deleteAgent(runmode, name)

        // TODO: test validations
    }

    /**
     * To test EtcApiController.getAgent
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAgentTest() {
        val runmode: kotlin.String = TODO()
        val name: kotlin.String = TODO()
        
        
        val response: ResponseEntity<Unit> = api.getAgent(runmode, name)

        // TODO: test validations
    }

    /**
     * To test EtcApiController.getAgents
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAgentsTest() {
        val runmode: kotlin.String = TODO()
        
        
        val response: ResponseEntity<kotlin.String> = api.getAgents(runmode)

        // TODO: test validations
    }

    /**
     * To test EtcApiController.getPackage
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPackageTest() {
        val group: kotlin.String = TODO()
        val name: kotlin.String = TODO()
        val version: kotlin.String = TODO()
        
        
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.getPackage(group, name, version)

        // TODO: test validations
    }

    /**
     * To test EtcApiController.getPackageFilter
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getPackageFilterTest() {
        val group: kotlin.String = TODO()
        val name: kotlin.String = TODO()
        val version: kotlin.String = TODO()
        
        
        val response: ResponseEntity<kotlin.String> = api.getPackageFilter(group, name, version)

        // TODO: test validations
    }

    /**
     * To test EtcApiController.getTruststore
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getTruststoreTest() {
        
        
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.getTruststore()

        // TODO: test validations
    }

    /**
     * To test EtcApiController.postAgent
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postAgentTest() {
        val runmode: kotlin.String = TODO()
        val name: kotlin.String = TODO()
        val jcrContentCqDistribute: kotlin.Boolean? = TODO()
        val jcrContentCqDistributeAtTypeHint: kotlin.String? = TODO()
        val jcrContentCqName: kotlin.String? = TODO()
        val jcrContentCqTemplate: kotlin.String? = TODO()
        val jcrContentAliasUpdate: kotlin.Boolean? = TODO()
        val jcrContentEnabled: kotlin.Boolean? = TODO()
        val jcrContentJcrDescription: kotlin.String? = TODO()
        val jcrContentJcrLastModified: kotlin.String? = TODO()
        val jcrContentJcrLastModifiedBy: kotlin.String? = TODO()
        val jcrContentJcrMixinTypes: kotlin.String? = TODO()
        val jcrContentJcrTitle: kotlin.String? = TODO()
        val jcrContentLogLevel: kotlin.String? = TODO()
        val jcrContentNoStatusUpdate: kotlin.Boolean? = TODO()
        val jcrContentNoVersioning: kotlin.Boolean? = TODO()
        val jcrContentProtocolConnectTimeout: java.math.BigDecimal? = TODO()
        val jcrContentProtocolHTTPConnectionClosed: kotlin.Boolean? = TODO()
        val jcrContentProtocolHTTPExpired: kotlin.String? = TODO()
        val jcrContentProtocolHTTPHeaders: kotlin.collections.List<kotlin.String>? = TODO()
        val jcrContentProtocolHTTPHeadersAtTypeHint: kotlin.String? = TODO()
        val jcrContentProtocolHTTPMethod: kotlin.String? = TODO()
        val jcrContentProtocolHTTPSRelaxed: kotlin.Boolean? = TODO()
        val jcrContentProtocolInterface: kotlin.String? = TODO()
        val jcrContentProtocolSocketTimeout: java.math.BigDecimal? = TODO()
        val jcrContentProtocolVersion: kotlin.String? = TODO()
        val jcrContentProxyNTLMDomain: kotlin.String? = TODO()
        val jcrContentProxyNTLMHost: kotlin.String? = TODO()
        val jcrContentProxyHost: kotlin.String? = TODO()
        val jcrContentProxyPassword: kotlin.String? = TODO()
        val jcrContentProxyPort: java.math.BigDecimal? = TODO()
        val jcrContentProxyUser: kotlin.String? = TODO()
        val jcrContentQueueBatchMaxSize: java.math.BigDecimal? = TODO()
        val jcrContentQueueBatchMode: kotlin.String? = TODO()
        val jcrContentQueueBatchWaitTime: java.math.BigDecimal? = TODO()
        val jcrContentRetryDelay: kotlin.String? = TODO()
        val jcrContentReverseReplication: kotlin.Boolean? = TODO()
        val jcrContentSerializationType: kotlin.String? = TODO()
        val jcrContentSlingResourceType: kotlin.String? = TODO()
        val jcrContentSsl: kotlin.String? = TODO()
        val jcrContentTransportNTLMDomain: kotlin.String? = TODO()
        val jcrContentTransportNTLMHost: kotlin.String? = TODO()
        val jcrContentTransportPassword: kotlin.String? = TODO()
        val jcrContentTransportUri: kotlin.String? = TODO()
        val jcrContentTransportUser: kotlin.String? = TODO()
        val jcrContentTriggerDistribute: kotlin.Boolean? = TODO()
        val jcrContentTriggerModified: kotlin.Boolean? = TODO()
        val jcrContentTriggerOnOffTime: kotlin.Boolean? = TODO()
        val jcrContentTriggerReceive: kotlin.Boolean? = TODO()
        val jcrContentTriggerSpecific: kotlin.Boolean? = TODO()
        val jcrContentUserId: kotlin.String? = TODO()
        val jcrPrimaryType: kotlin.String? = TODO()
        val operation: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<Unit> = api.postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeAtTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersAtTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation)

        // TODO: test validations
    }

    /**
     * To test EtcApiController.postTruststorePKCS12
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun postTruststorePKCS12Test() {
        val truststoreP12: org.springframework.web.multipart.MultipartFile = TODO()
        
        
        val response: ResponseEntity<kotlin.String> = api.postTruststorePKCS12(truststoreP12)

        // TODO: test validations
    }
}

package com.shinesolutions.swaggeraem4j;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.shinesolutions.swaggeraem4j.api.SlingApi;

public class FlushAgentTest {

	private SlingApi sling;

	@Before
	public void init() {
		sling = TestHelper.createSlingApi();

		// Ensure agent doesn't exist prior to testing
		try {
			String runMode = "author";
			String name = "some-flush-agent";
			ApiResponse<Void> response = sling.deleteAgentWithHttpInfo(runMode,
					name);
			// Delete agent when it exists
			assertTrue((response.getStatusCode() == 200)
					|| (response.getStatusCode() == 204));
		} catch (ApiException e) {
			// Ignore when agent does not exist
			assertEquals(404, e.getCode());
		}

		try {
			String runMode = "author";
			String name = "some-flush-agent";
			sling.getAgentWithHttpInfo(runMode, name);
			fail();
		} catch (ApiException e) {
			assertEquals(404, e.getCode());
		}
	}

	@Test
	public void testFlushAgent() throws ApiException {
		// Create a new flush agent
		String runMode = "author";
		String name = "some-flush-agent";
		String jcrPrimaryType = "cq:Page";
		String jcrContentCqName = "some-flush-agent";
		String jcrContentJcrTitle = "Some Flush Agent Title";
		String jcrContentJcrDescription = "Some Flush Agent Description";
		String jcrContentSlingResourceType = "/libs/cq/replication/components/agent";
		String jcrContentTransportUri = "http://somehost:8080/dispatcher/invalidate.cache";
		String jcrContentTransportUser = "";
		String jcrContentTransportPassword = "";
		String jcrContentLogLevel = "error";
		boolean jcrContentNoVersioning = true;
		List<String> jcrContentProtocolHTTPHeaders = Arrays.asList("CQ-Action:{action}", "CQ-Handle:{path}", "CQ-Path:{path}");
		String jcrContentProtocolHTTPHeadersTypeHint = "String[]";
		String jcrContentProtocolHTTPMethod = "GET";
		String jcrContentRetryDelay = "30000";
		String jcrContentSerializationType = "flush";
		String jcrContentJcrMixinTypes = "cq:ReplicationStatus";
		boolean jcrContentTriggerReceive = true;
		boolean jcrContentTriggerSpecific = true;
		String jcrContentCqTemplate = "/libs/cq/replication/templates/agent";
		boolean jcrContentEnabled = true;
		boolean jcrContentReverseReplication = true;
		String operation = null;
		Boolean jcrContentTriggerDistribute = null;
		Boolean jcrContentTriggerModified = null;
		String jcrContentUserId = null;
		Boolean jcrContentProtocolHTTPSRelaxed = null;
		String jcrContentjcrlastModified = null;
		String jcrContentjcrlastModifiedBy = null;
		Boolean jcrContentnoStatusUpdate = null;
		Boolean jcrContentprotocolHTTPConnectionClose = null;
		BigDecimal jcrContentprotocolConnectTimeout = null;
		String jcrContentprotocolHTTPExpired = null;
		String jcrContentprotocolInterface = null;
		BigDecimal jcrContentprotocolSocketTimeout = null;
		String jcrContentprotocolVersion = null;
		String jcrContentproxyNTLMDomain = null;
		String jcrContentproxyNTLMHost = null;
		String jcrContentproxyHost = null;
		BigDecimal jcrContentproxyPort = null;
		String jcrContentproxyUser = null;
		String jcrContentproxyPassword = null;
		BigDecimal jcrContentqueueBatchMaxSize = null;
		String jcrContentqueueBatchMode = null;
		BigDecimal jcrContentqueueBatchWaitTime = null;
		String jcrContentssl = null;
		String jcrContenttransportNTLMDomain = null;
		String jcrContenttransportNTLMHost = null;
		Boolean jcrContenttriggerOnOffTime = null;

		ApiResponse<Void> response = sling.postAgentWithHttpInfo(runMode, name,
			jcrContentCqName,
			jcrContentCqTemplate,
			jcrContentEnabled,
			jcrContentJcrDescription,
			jcrContentjcrlastModified,
			jcrContentjcrlastModifiedBy,
			jcrContentJcrMixinTypes,
			jcrContentJcrTitle,
			jcrContentLogLevel,
			jcrContentnoStatusUpdate,
			jcrContentNoVersioning,
			jcrContentprotocolConnectTimeout,
			jcrContentprotocolHTTPConnectionClose,
			jcrContentprotocolHTTPExpired,
			jcrContentProtocolHTTPHeaders,
			jcrContentProtocolHTTPHeadersTypeHint,
			jcrContentProtocolHTTPMethod,
			jcrContentProtocolHTTPSRelaxed,
			jcrContentprotocolInterface,
			jcrContentprotocolSocketTimeout,
			jcrContentprotocolVersion,
			jcrContentproxyHost,
			jcrContentproxyNTLMDomain,
			jcrContentproxyNTLMHost,
			jcrContentproxyPassword,
			jcrContentproxyPort,
			jcrContentproxyUser,
			jcrContentqueueBatchMaxSize,
			jcrContentqueueBatchMode,
			jcrContentqueueBatchWaitTime,
			jcrContentRetryDelay,
			jcrContentReverseReplication,
			jcrContentSerializationType,
			jcrContentSlingResourceType,
			jcrContentssl,
			jcrContenttransportNTLMDomain,
			jcrContenttransportNTLMHost,
			jcrContentTransportPassword,
			jcrContentTransportUri,
			jcrContentTransportUser,
			jcrContentTriggerDistribute,
			jcrContentTriggerModified,
			jcrContenttriggerOnOffTime,
			jcrContentTriggerReceive,
			jcrContentTriggerSpecific,
			jcrContentUserId,
			jcrPrimaryType,
			operation);

		assertEquals(201, response.getStatusCode());

		// Update an existing flush agent
		runMode = "author";
		name = "some-flush-agent";
		jcrContentCqName = "some-flush-agent";
		jcrContentCqTemplate = "";
		jcrContentEnabled = false;
		jcrContentJcrDescription = "Some New Flush Agent Description";
		jcrContentJcrMixinTypes = null;
		jcrContentJcrTitle = "Some New Flush Agent Title";
		jcrContentLogLevel = "";
		jcrContentNoVersioning = false;
		jcrContentProtocolHTTPHeaders = Collections.emptyList();
		jcrContentProtocolHTTPHeadersTypeHint = "";
		jcrContentProtocolHTTPMethod = "";
		jcrContentRetryDelay = "";
		jcrContentSerializationType = "";
		jcrContentSlingResourceType = "";
		jcrContentTransportPassword = "";
		jcrContentTransportUri = "";
		jcrContentTransportUser = "";
		jcrContentTriggerReceive = false;
		jcrContentTriggerSpecific = false;
		jcrPrimaryType = "cq:Page";
		jcrContentReverseReplication = false;
		jcrContentProtocolHTTPSRelaxed = null;
		jcrContentTriggerDistribute = null;
		jcrContentTriggerModified = null;
		jcrContentUserId = null;
		operation = null;
		jcrContentjcrlastModified = null;
		jcrContentjcrlastModifiedBy = null;
		jcrContentnoStatusUpdate = null;
		jcrContentprotocolHTTPConnectionClose = null;
		jcrContentprotocolConnectTimeout = null;
		jcrContentprotocolHTTPExpired = null;
		jcrContentprotocolInterface = null;
		jcrContentprotocolSocketTimeout = null;
		jcrContentprotocolVersion = null;
		jcrContentproxyNTLMDomain = null;
		jcrContentproxyNTLMHost = null;
		jcrContentproxyHost = null;
		jcrContentproxyPort = null;
		jcrContentproxyUser = null;
		jcrContentproxyPassword = null;
		jcrContentqueueBatchMaxSize = null;
		jcrContentqueueBatchMode = null;
		jcrContentqueueBatchWaitTime = null;
		jcrContentssl = null;
		jcrContenttransportNTLMDomain = null;
		jcrContenttransportNTLMHost = null;
		jcrContenttriggerOnOffTime = null;

		response = sling.postAgentWithHttpInfo(runMode, name,
			jcrContentCqName,
			jcrContentCqTemplate,
			jcrContentEnabled,
			jcrContentJcrDescription,
			jcrContentjcrlastModified,
			jcrContentjcrlastModifiedBy,
			jcrContentJcrMixinTypes,
			jcrContentJcrTitle,
			jcrContentLogLevel,
			jcrContentnoStatusUpdate,
			jcrContentNoVersioning,
			jcrContentprotocolConnectTimeout,
			jcrContentprotocolHTTPConnectionClose,
			jcrContentprotocolHTTPExpired,
			jcrContentProtocolHTTPHeaders,
			jcrContentProtocolHTTPHeadersTypeHint,
			jcrContentProtocolHTTPMethod,
			jcrContentProtocolHTTPSRelaxed,
			jcrContentprotocolInterface,
			jcrContentprotocolSocketTimeout,
			jcrContentprotocolVersion,
			jcrContentproxyHost,
			jcrContentproxyNTLMDomain,
			jcrContentproxyNTLMHost,
			jcrContentproxyPassword,
			jcrContentproxyPort,
			jcrContentproxyUser,
			jcrContentqueueBatchMaxSize,
			jcrContentqueueBatchMode,
			jcrContentqueueBatchWaitTime,
			jcrContentRetryDelay,
			jcrContentReverseReplication,
			jcrContentSerializationType,
			jcrContentSlingResourceType,
			jcrContentssl,
			jcrContenttransportNTLMDomain,
			jcrContenttransportNTLMHost,
			jcrContentTransportPassword,
			jcrContentTransportUri,
			jcrContentTransportUser,
			jcrContentTriggerDistribute,
			jcrContentTriggerModified,
			jcrContenttriggerOnOffTime,
			jcrContentTriggerReceive,
			jcrContentTriggerSpecific,
			jcrContentUserId,
			jcrPrimaryType,
			operation);

		assertEquals(200, response.getStatusCode());
	}
}

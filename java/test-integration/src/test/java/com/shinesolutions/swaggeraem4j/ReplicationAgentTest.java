package com.shinesolutions.swaggeraem4j;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.shinesolutions.swaggeraem4j.api.SlingApi;

public class ReplicationAgentTest {

	SlingApi sling;

	@Before
	public void init() throws ApiException {
		sling = TestHelper.createSlingApi();

		// Ensure agent doesn't exist prior to testing
		try {
			String runMode = "author";
			String name = "some-replication-agent";
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
			String name = "some-replication-agent";
			sling.getAgentWithHttpInfo(runMode, name);
			fail();
		} catch (ApiException e) {
			assertEquals(404, e.getCode());
		}

	}

	@Test
	public void testPathActivation() throws ApiException {
		// Create a new replication agent
		String runMode = "author";
		String name = "some-replication-agent";
		String jcrPrimaryType = "cq:Page";
		String jcrContentCqName = "some-replication-agent";
		String jcrContentJcrTitle = "Some Replication Agent Title";
		String jcrContentJcrDescription = "Some Replication Agent Description";
		String jcrContentSlingResourceType = "/libs/cq/replication/components/agent";
		String jcrContentTransportUri = "http://somehost:8080/bin/receive?sling:authRequestLogin=1";
		String jcrContentTransportUser = "admin";
		String jcrContentTransportPassword = "admin";
		String jcrContentLogLevel = "error";
		boolean jcrContentNoVersioning = false;
		List<String> jcrContentProtocolHTTPHeaders = Collections.emptyList();
		String jcrContentProtocolHTTPHeadersTypeHint = "";
		String jcrContentProtocolHTTPMethod = "";
		String jcrContentRetryDelay = "30000";
		String jcrContentSerializationType = "durbo";
		String jcrContentJcrMixinTypes = null;
		boolean jcrContentTriggerReceive = false;
		boolean jcrContentTriggerSpecific = false;
		String jcrContentCqTemplate = "/libs/cq/replication/templates/agent";
		boolean jcrContentEnabled = true;
		boolean jcrContentReverseReplication = false;
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

		// Update an existing replication agent
		runMode = "author";
		name = "some-replication-agent";
		jcrContentCqName = "some-replication-agent";
		jcrContentCqTemplate = "";
		jcrContentEnabled = true;
		jcrContentJcrDescription = "Some Replication Agent Description";
		jcrContentJcrMixinTypes = null;
		jcrContentJcrTitle = "Some Replication Agent Title";
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

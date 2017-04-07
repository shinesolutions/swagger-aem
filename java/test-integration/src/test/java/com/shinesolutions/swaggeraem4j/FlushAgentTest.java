package com.shinesolutions.swaggeraem4j;

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
		boolean jcrReverseReplication = true;
		String operation = null;
		Boolean jcrContentTriggerDistribute = null;
		Boolean jcrContentTriggerModified = null;
		String jcrContentUserId = null;
		Boolean jcrContentProtocolHTTPSRelaxed = null;

		ApiResponse<Void> response = sling.postAgentWithHttpInfo(runMode, name,
				jcrContentCqName, jcrContentCqTemplate, jcrContentEnabled,
				jcrContentJcrDescription, jcrContentJcrMixinTypes, jcrContentJcrTitle,
				jcrContentLogLevel, jcrContentNoVersioning, jcrContentProtocolHTTPHeaders,
				jcrContentProtocolHTTPHeadersTypeHint, jcrContentProtocolHTTPMethod,
				jcrContentProtocolHTTPSRelaxed, jcrContentRetryDelay, jcrReverseReplication,
				jcrContentSerializationType, jcrContentSlingResourceType,
				jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser,
				jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerReceive,
				jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType,
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
		jcrReverseReplication = false;
		jcrContentProtocolHTTPSRelaxed = null;
		jcrContentTriggerDistribute = null;
		jcrContentTriggerModified = null;
		jcrContentUserId = null;
		operation = null;

		response = sling.postAgentWithHttpInfo(runMode, name,
			jcrContentCqName, jcrContentCqTemplate, jcrContentEnabled,
			jcrContentJcrDescription, jcrContentJcrMixinTypes, jcrContentJcrTitle,
			jcrContentLogLevel, jcrContentNoVersioning, jcrContentProtocolHTTPHeaders,
			jcrContentProtocolHTTPHeadersTypeHint, jcrContentProtocolHTTPMethod,
			jcrContentProtocolHTTPSRelaxed, jcrContentRetryDelay, jcrReverseReplication,
			jcrContentSerializationType, jcrContentSlingResourceType,
			jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser,
			jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerReceive,
			jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType,
			operation);

		assertEquals(200, response.getStatusCode());
	}
}

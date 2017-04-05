package com.shinesolutions.swaggeraem4j;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.shinesolutions.swaggeraem4j.api.SlingApi;

public class ReverseReplicationAgentTest {

	SlingApi sling;

	@Before
	public void init() throws ApiException {
		sling = TestHelper.createSlingApi();

		// Ensure agent doesn't exist prior to testing
		try {
			String runMode = "author";
			String name = "some-reverse-replication-agent";
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
			String name = "some-reverse-replication-agent";
			sling.getAgentWithHttpInfo(runMode, name);
			fail();
		} catch (ApiException e) {
			assertEquals(404, e.getCode());
		}

	}

	@Test
	public void testPathActivation() throws ApiException {
		// Create a new reverse replication agent
		String runMode = "author";
		String name = "some-reverse-replication-agent";
		String jcrPrimaryType = "cq:Page";
		String jcrContentCqName = "some-reverse-replication-agent";
		String jcrContentJcrTitle = "Some Reverse Replication Agent Title";
		String jcrContentJcrDescription = "Some Reverse Replication Agent Description";
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
		boolean jcrReverseReplication = true;
		String operation = null;
		Boolean jcrcontenttriggerDistribute = null;
		Boolean jcrcontenttriggerModified = null;
		String jcrcontentuserId = "admin";
		Boolean jcrcontentprotocolHTTPSRelaxed = null;

		ApiResponse<Void> response = sling.postAgentWithHttpInfo(runMode, name,
				jcrPrimaryType, jcrContentCqName, jcrContentJcrTitle,
				jcrContentJcrDescription, jcrContentSlingResourceType,
				jcrContentTransportUri, jcrContentTransportUser,
				jcrContentTransportPassword, jcrContentLogLevel,
				jcrContentNoVersioning, jcrContentProtocolHTTPHeaders,
				jcrContentProtocolHTTPHeadersTypeHint,
				jcrContentProtocolHTTPMethod, jcrContentRetryDelay,
				jcrContentSerializationType, jcrContentJcrMixinTypes,
				jcrContentTriggerReceive, jcrContentTriggerSpecific,
				jcrContentCqTemplate, jcrContentEnabled, jcrReverseReplication,
				operation, jcrcontenttriggerDistribute, jcrcontenttriggerModified,
				jcrcontentuserId, jcrcontentprotocolHTTPSRelaxed);

		assertEquals(201, response.getStatusCode());

		// Update an existing reverse replication agent
		runMode = "author";
		name = "some-reverse-replication-agent";
		jcrPrimaryType = "cq:Page";
		jcrContentCqName = "some-reverse-replication-agent";
		jcrContentJcrTitle = "Some Reverse Replication Agent Title";
		jcrContentJcrDescription = "Some Reverse Replication Agent Description";
		jcrContentSlingResourceType = "";
		jcrContentTransportUri = "";
		jcrContentTransportUser = "";
		jcrContentTransportPassword = "";
		jcrContentLogLevel = "";
		jcrContentNoVersioning = false;
		jcrContentProtocolHTTPHeaders = Collections.emptyList();
		jcrContentProtocolHTTPHeadersTypeHint = "";
		jcrContentProtocolHTTPMethod = "";
		jcrContentRetryDelay = "";
		jcrContentSerializationType = "";
		jcrContentJcrMixinTypes = null;
		jcrContentTriggerReceive = false;
		jcrContentTriggerSpecific = false;
		jcrContentCqTemplate = "";
		jcrContentEnabled = true;
		jcrReverseReplication = true;
		operation = null;
		jcrcontenttriggerDistribute = null;
		jcrcontenttriggerModified = null;
		jcrcontentuserId = "admin";
		jcrcontentprotocolHTTPSRelaxed = null;

		response = sling.postAgentWithHttpInfo(runMode, name, jcrPrimaryType,
				jcrContentCqName, jcrContentJcrTitle, jcrContentJcrDescription,
				jcrContentSlingResourceType, jcrContentTransportUri,
				jcrContentTransportUser, jcrContentTransportPassword,
				jcrContentLogLevel, jcrContentNoVersioning,
				jcrContentProtocolHTTPHeaders,
				jcrContentProtocolHTTPHeadersTypeHint,
				jcrContentProtocolHTTPMethod, jcrContentRetryDelay,
				jcrContentSerializationType, jcrContentJcrMixinTypes,
				jcrContentTriggerReceive, jcrContentTriggerSpecific,
				jcrContentCqTemplate, jcrContentEnabled, jcrReverseReplication,
				operation, jcrcontenttriggerDistribute, jcrcontenttriggerModified,
				jcrcontentuserId, jcrcontentprotocolHTTPSRelaxed);

		assertEquals(200, response.getStatusCode());
	}

}
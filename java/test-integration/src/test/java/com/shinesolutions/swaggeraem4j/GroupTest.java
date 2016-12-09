package com.shinesolutions.swaggeraem4j;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.shinesolutions.swaggeraem4j.api.CqApi;
import com.shinesolutions.swaggeraem4j.api.SlingApi;

public class GroupTest {

	SlingApi sling;
	CqApi cq;

	String authorizableId;

	@Before
	public void init() throws ApiException {
		sling = TestHelper.createSlingApi();
		cq = TestHelper.createCqApi();

		// Ensure group doesn't exist prior to testing
		String id = TestHelper.findAuthorizableId(sling, "/home/groups/s",
				"somegroup");
		if (id != null) {
			String path = "home/groups/s";
			String name = id;
			ApiResponse<Void> response = sling.deleteNodeWithHttpInfo(path,
					name);
			assertEquals(204, response.getStatusCode());
		}

		// Create group
		id = "somegroup";
		String intermediatePath = "/home/groups/s";
		String createUser = null;
		String createGroup = "";
		String reppassword = null;
		String profilegivenName = "somegroup";
		ApiResponse<String> response = sling.postAuthorizablesWithHttpInfo(id,
				intermediatePath, createUser, createGroup, reppassword,
				profilegivenName);
		assertEquals(201, response.getStatusCode());

		authorizableId = TestHelper.findAuthorizableId(sling, "/home/groups/s",
				"somegroup");
	}

	@Test
	public void testGroupCreate() throws ApiException {
		// Should succeed existence check
		try {
			String path = "home/groups/s";
			String name = authorizableId;
			sling.getNodeWithHttpInfo(path, name);
			fail();
		} catch (ApiException e) {
			assertEquals(302, e.getCode());
		}

		// Should succeed permission setting
		String id = "somegroup";
		String changelog = "path:/etc/replication,read:true,modify:true";
		ApiResponse<Void> response = cq
				.postCqActionsWithHttpInfo(id, changelog);
		assertEquals(200, response.getStatusCode());

		// Should succeed being added to another group

		// Ensure member group doesn't exist prior to testing
		id = TestHelper.findAuthorizableId(sling, "/home/groups/s",
				"somemembergroup");
		if (id != null) {
			String path = "home/groups/s";
			String name = id;
			response = sling.deleteNodeWithHttpInfo(path, name);
			assertEquals(204, response.getStatusCode());
		}

		// Create member group
		id = "somemembergroup";
		String intermediatePath = "/home/groups/s";
		String createUser = null;
		String createGroup = "";
		String reppassword = null;
		String profilegivenName = "somemembergroup";
		ApiResponse<String> responseString = sling
				.postAuthorizablesWithHttpInfo(id, intermediatePath,
						createUser, createGroup, reppassword, profilegivenName);
		assertEquals(201, responseString.getStatusCode());

		// Add member group to the main group
		String path = "home/groups/s";
		String name = authorizableId;
		String addMembers = "somemembergroup";
		response = sling.postNodeRwWithHttpInfo(path, name, addMembers);
		assertEquals(200, response.getStatusCode());
	}
}

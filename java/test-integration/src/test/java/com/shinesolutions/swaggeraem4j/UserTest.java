package com.shinesolutions.swaggeraem4j;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.shinesolutions.swaggeraem4j.api.ConsoleApi;
import com.shinesolutions.swaggeraem4j.api.CqApi;
import com.shinesolutions.swaggeraem4j.api.CrxApi;
import com.shinesolutions.swaggeraem4j.api.SlingApi;

public class UserTest {

	SlingApi sling;
	CqApi cq;
	CrxApi crx;

	String authorizableId;

	@Before
	public void init() throws ApiException {
		sling = TestHelper.createSlingApi();
		cq = TestHelper.createCqApi();
		crx = TestHelper.createCrxApi();

		// Ensure user doesn't exist prior to testing
		String id = TestHelper.findAuthorizableId(sling, "/home/users/s",
				"someuser");
		if (id != null) {
			String path = "home/users/s";
			String name = id;
			ApiResponse<Void> response = sling.deleteNodeWithHttpInfo(path,
					name);
			assertEquals(204, response.getStatusCode());
		}

		// Create user
		id = "someuser";
		String intermediatePath = "/home/users/s";
		String createUser = "";
		String createGroup = "";
		String reppassword = "somepassword";
		String profilegivenName = "";
		ApiResponse<String> response = sling.postAuthorizablesWithHttpInfo(id,
				intermediatePath, createUser, createGroup, reppassword,
				profilegivenName);
		assertEquals(201, response.getStatusCode());

		authorizableId = TestHelper.findAuthorizableId(sling, "/home/users/s",
				"someuser");
	}

	@Test
	public void testUserCreate() throws ApiException {
		// Should succeed existence check
		try {
			String path = "home/users/s";
			String name = authorizableId;
			sling.getNodeWithHttpInfo(path, name);
			fail();
		} catch (ApiException e) {
			assertEquals(302, e.getCode());
		}

		// Should succeed permission setting
		String authorizableId = "someuser";
		String changeLog = "path:/etc/replication,read:true,modify:true";
		ApiResponse<Void> response = cq.postCqActionsWithHttpInfo(
				authorizableId, changeLog);
		assertEquals(200, response.getStatusCode());

		// Should succeed admin password change
		String old = "admin";
		String plain = "admin";
		String verify = "admin";
		response = crx.postSetPasswordWithHttpInfo(old, plain, verify);
		assertEquals(200, response.getStatusCode());

		// Should succeed created user password change
		ApiClient client = new ApiClient();
		client.setBasePath("http://localhost:4502");
		client.setUsername("someuser");
		client.setPassword("somepassword");
		client.setDebugging(false);
		CrxApi crx2 = new CrxApi(client);

		old = "somepassword";
		plain = "somenewpassword";
		verify = "somenewpassword";
		response = crx2.postSetPasswordWithHttpInfo(old, plain, verify);
		assertEquals(200, response.getStatusCode());

		// Ensure group doesn't exist prior to testing
		String id = TestHelper.findAuthorizableId(sling, "/home/groups/s",
				"somegroup");
		if (id != null) {
			String path = "home/groups/s";
			String name = id;
			response = sling.deleteNodeWithHttpInfo(path, name);
			assertEquals(204, response.getStatusCode());
		}

		// Create group
		id = "somegroup";
		String intermediatePath = "/home/groups/s";
		String createUser = "";
		String createGroup = "";
		String reppassword = "";
		String profilegivenName = "somegroup";
		ApiResponse<String> responseString = sling
				.postAuthorizablesWithHttpInfo(id, intermediatePath,
						createUser, createGroup, reppassword, profilegivenName);
		assertEquals(201, responseString.getStatusCode());
		authorizableId = TestHelper.findAuthorizableId(sling, "/home/groups/s",
				"somegroup");

		// Add user as member to the group
		String path = "home/groups/s";
		String name = authorizableId;
		String addMembers = "someuser";
		response = sling.postNodeRwWithHttpInfo(path, name, addMembers);
		assertEquals(200, response.getStatusCode());
	}
}

package com.shinesolutions.swaggeraem4j;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.shinesolutions.swaggeraem4j.api.SlingApi;

public class NodeTest {

	SlingApi sling;

	@Before
	public void init() {
		sling = TestHelper.createSlingApi();

		// Ensure node doesn't exist prior to testing
		try {
			String path = "apps/system";
			String name = "somefolder";
			ApiResponse<Void> response = sling.deleteNodeWithHttpInfo(path,
					name);
			// Delete node when it exists
			assertEquals(204, response.getStatusCode());
		} catch (ApiException e) {
			// Ignore when node does not exist
			assertEquals(404, e.getCode());
		}
	}

	@Test
	public void testCreateNonExistingNode() throws ApiException {
		String path = "apps/system";
		String jcrPrimaryType = "sling:Folder";
		String name = "somefolder";
		ApiResponse<Void> response = sling.postPathWithHttpInfo(path,
				jcrPrimaryType, name);
		assertTrue((response.getStatusCode() == 200)
				|| (response.getStatusCode() == 201));
	}

	@Test
	public void testCreateAlreadyExistingNode() throws ApiException {
		// Create node
		String path = "apps/system";
		String jcrPrimaryType = "sling:Folder";
		String name = "somefolder";
		ApiResponse<Void> response = sling.postPathWithHttpInfo(path,
				jcrPrimaryType, name);
		assertTrue((response.getStatusCode() == 200)
				|| (response.getStatusCode() == 201));

		// Create the same node the second time
		try {
			path = "apps/system";
			jcrPrimaryType = "sling:Folder";
			name = "somefolder";
			sling.postPathWithHttpInfo(path, jcrPrimaryType, name);
			fail();
		} catch (ApiException e) {
			assertEquals(500, e.getCode());
		}
	}

	@Test
	public void testCheckExistenceWhenNodeAlreadyExists() throws ApiException {
		// Node does not exist
		try {
			String path = "apps/system";
			String name = "somefolder";
			sling.getNodeWithHttpInfo(path, name);
			fail();
		} catch (ApiException e) {
			assertEquals(404, e.getCode());
		}

		// Create node
		String path = "apps/system";
		String jcrPrimaryType = "sling:Folder";
		String name = "somefolder";
		ApiResponse<Void> response = sling.postPathWithHttpInfo(path,
				jcrPrimaryType, name);
		assertTrue((response.getStatusCode() == 200)
				|| (response.getStatusCode() == 201));

		// Node should exist
		// Swagger client automatically considers non-200 as an error
		try {
			path = "apps/system";
			name = "somefolder";
			sling.getNodeWithHttpInfo(path, name);
			fail();
		} catch (ApiException e) {
			assertEquals(302, e.getCode());
		}
	}

	@Test
	public void testDeleteNode() throws ApiException {
		// Ensure node exists prior to deletion
		String path = "apps/system";
		String jcrPrimaryType = "sling:Folder";
		String name = "somefolder";
		ApiResponse<Void> response = sling.postPathWithHttpInfo(path,
				jcrPrimaryType, name);
		assertTrue((response.getStatusCode() == 200)
				|| (response.getStatusCode() == 201));

		path = "apps/system";
		name = "somefolder";
		response = sling.deleteNodeWithHttpInfo(path, name);
		assertEquals(204, response.getStatusCode());
	}

	@Test
	public void testNodeExists() throws ApiException {
		// Ensure node exists prior to deletion
		String path = "apps/system";
		String jcrPrimaryType = "sling:Folder";
		String name = "somefolder";
		ApiResponse<Void> response = sling.postPathWithHttpInfo(path,
				jcrPrimaryType, name);
		assertTrue((response.getStatusCode() == 200)
				|| (response.getStatusCode() == 201));

		try {
			path = "apps/system";
			name = "somefolder";
			sling.getNodeWithHttpInfo(path, name);
			fail();
		} catch (ApiException e) {
			assertEquals(302, e.getCode());
		}
	}
}

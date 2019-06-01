package com.shinesolutions.swaggeraem4j;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.shinesolutions.swaggeraem4j.api.SlingApi;

public class PathTest {

	SlingApi sling;

	@Before
	public void init() throws ApiException {
		sling = TestHelper.createSlingApi();
	}

	@Test
	public void testPathActivation() throws ApiException {
		boolean ignoreDeactivated = true;
		boolean onlyModified = false;
		String path = "/etc/designs/geometrixx";
		ApiResponse<Void> response = sling.postTreeActivationWithHttpInfo(
				ignoreDeactivated, onlyModified, path);
		assertEquals(200, response.getStatusCode());

		// Tree activation returns 200 regardless whether the path exists or not
		ignoreDeactivated = true;
		onlyModified = false;
		path = "/some/inexisting/path";
		response = sling.postTreeActivationWithHttpInfo(ignoreDeactivated,
				onlyModified, path);
		assertEquals(200, response.getStatusCode());
	}

}

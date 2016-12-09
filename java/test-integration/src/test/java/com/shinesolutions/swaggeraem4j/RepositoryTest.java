package com.shinesolutions.swaggeraem4j;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.shinesolutions.swaggeraem4j.api.ConsoleApi;

public class RepositoryTest {

	ConsoleApi console;

	@Before
	public void init() throws ApiException {
		console = TestHelper.createConsoleApi();
	}

	@Test
	public void testBlockRepositoryWrites() throws ApiException {
		String action = "blockRepositoryWrites";
		ApiResponse<Void> response = console
				.postJmxRepositoryWithHttpInfo(action);
		assertEquals(200, response.getStatusCode());
	}

	@Test
	public void testUnblockRepositoryWrites() throws ApiException {
		String action = "unblockRepositoryWrites";
		ApiResponse<Void> response = console
				.postJmxRepositoryWithHttpInfo(action);
		assertEquals(200, response.getStatusCode());
	}
}

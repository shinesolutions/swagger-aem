
package com.shinesolutions.swaggeraem4j;

import com.shinesolutions.swaggeraem4j.api.ConsoleApi;
import com.shinesolutions.swaggeraem4j.api.CqApi;
import com.shinesolutions.swaggeraem4j.api.CrxApi;
import com.shinesolutions.swaggeraem4j.api.SlingApi;

public class TestHelper {

	public static ConsoleApi createConsoleApi() {
		return new ConsoleApi(createApiClient());
	}
	
	public static SlingApi createSlingApi() {
		return new SlingApi(createApiClient());
	}
	
	public static CqApi createCqApi() {
		return new CqApi(createApiClient());
	}
	
	public static CrxApi createCrxApi() {
		return new CrxApi(createApiClient());
	}
	
	private static ApiClient createApiClient() {
		ApiClient client = new ApiClient();
		client.setBasePath("http://localhost:4502");
		client.setUsername("admin");
		client.setPassword("admin");
		client.setDebugging(false);
		return client;
	}

}


package com.shinesolutions.swaggeraem4j;

import com.shinesolutions.swaggeraem4j.api.ConsoleApi;

public class TestHelper {

	public static ConsoleApi createConsoleApi() {
		ApiClient client = new ApiClient();
		client.setBasePath("http://localhost:4502");
		client.setUsername("admin");
		client.setPassword("admin");
		client.setDebugging(false);
		//conf.params_encoding = :multi

		return new ConsoleApi(client);
	}

}

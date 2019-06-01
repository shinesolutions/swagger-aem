package com.shinesolutions.swaggeraem4j;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
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

		// HTTP return code 302 is used in tests and should not be redirected
		client.getHttpClient().setFollowRedirects(false);

		return client;
	}

	public static String findAuthorizableId(SlingApi sling, String path,
			String name) {
		try {
			BigDecimal pLimit = new BigDecimal(-1.0);
			String _1Property = "rep:authorizableId";
			String _1PropertyValue = name;
			ApiResponse<String> response = sling.postQueryWithHttpInfo(path,
					pLimit, _1Property, _1PropertyValue);
			assertEquals(200, response.getStatusCode());

			String data = response.getData();

			InputStream is = new ByteArrayInputStream(data.getBytes());

			Gson gson = new Gson();
			JsonReader reader = new JsonReader(new InputStreamReader(is));
			ResponseJson json = gson.fromJson(reader, ResponseJson.class);

			if (json.success && (json.hits.size() == 1)) {
				String authorizableId = json.hits.get(0).name;
				return authorizableId;
			}
		} catch (ApiException e) {
			// Ignore when authorizable does not exist
			assertEquals(404, e.getCode());
		}
		return null;
	}

	private static class ResponseJson {
		public boolean success;
		public int results;
		public int total;
		public boolean more;
		public int offset;
		public List<HitJson> hits;

		private static class HitJson {
			public String name;
		}
	}
}

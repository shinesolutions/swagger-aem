package com.shinesolutions.swaggeraem4j;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.shinesolutions.swaggeraem4j.api.SlingApi;

public class ConfigPropertyTest {

	private SlingApi sling;

	@Before
	public void init() {
		sling = TestHelper.createSlingApi();

		// Ensure config.author already exists
		try {
			String path = "apps/system";
			String jcrPrimaryType = "sling:Folder";
			String name = "config.author";
			ApiResponse<Void> response = sling.postPathWithHttpInfo(path,
					jcrPrimaryType, name);
			// Create config.author when it does not exist
			assertTrue((response.getStatusCode() == 200)
					|| (response.getStatusCode() == 201));
		} catch (ApiException e) {
			// Ignore when it already exists
			assertEquals(500, e.getCode());
		}
	}

	@Test
	public void testApacheFelixJettyBasedHttpServiceConfigProperties() throws ApiException {
		// Ensure http OSGI config node exists
		try {
			String path = "apps/system/config.author";
			String jcrPrimaryType = "sling:OsgiConfig";
			String name = "org.apache.felix.http";
			ApiResponse<Void> response = sling.postPathWithHttpInfo(path,
					jcrPrimaryType, name);
			// Create config when it does not exist
			assertTrue((response.getStatusCode() == 200)
					|| (response.getStatusCode() == 201));
		} catch (ApiException e) {
			// Ignore when it already exists
			assertEquals(500, e.getCode());
		}

		String runmode = "author";
		Boolean orgApacheFelixHttpsNio = true;
		String orgApacheFelixHttpsNioTypeHint = "Boolean";
		String orgApacheFelixHttpsKeystore = "/some/path/to/keystore";
		String orgApacheFelixHttpsKeystoreTypeHint = "String";
		String orgApacheFelixHttpsKeystorePassword = "somepassword";
		String orgApacheFelixHttpsKeystorePasswordTypeHint = "String";
		String orgApacheFelixHttpsKeystoreKey = "somekey";
		String orgApacheFelixHttpsKeystoreKeyTypeHint = "String";
		String orgApacheFelixHttpsKeystoreKeyPassword = "somekeypassword";
		String orgApacheFelixHttpsKeystoreKeyPasswordTypeHint = "String";
		String orgApacheFelixHttpsTruststore = "/some/path/to/truststore";
		String orgApacheFelixHttpsTruststoreTypeHint = "String";
		String orgApacheFelixHttpsTruststorePassword = "sometruststorepassword";
		String orgApacheFelixHttpsTruststorePasswordTypeHint = "String";
		String orgApacheFelixHttpsClientcertificate = "none";
		String orgApacheFelixHttpsClientcertificateTypeHint = "String";
		Boolean orgApacheFelixHttpsEnable = false;
		String orgApacheFelixHttpsEnableTypeHint = "Boolean";
		String orgOsgiServiceHttpPortSecure = "4503";
		String orgOsgiServiceHttpPortSecureTypeHint = "Long";

		ApiResponse<Void> response = sling.postConfigApacheFelixJettyBasedHttpServiceWithHttpInfo(runmode,
				orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint,
				orgApacheFelixHttpsKeystore,
				orgApacheFelixHttpsKeystoreTypeHint,
				orgApacheFelixHttpsKeystorePassword,
				orgApacheFelixHttpsKeystorePasswordTypeHint,
				orgApacheFelixHttpsKeystoreKey,
				orgApacheFelixHttpsKeystoreKeyTypeHint,
				orgApacheFelixHttpsKeystoreKeyPassword,
				orgApacheFelixHttpsKeystoreKeyPasswordTypeHint,
				orgApacheFelixHttpsTruststore,
				orgApacheFelixHttpsTruststoreTypeHint,
				orgApacheFelixHttpsTruststorePassword,
				orgApacheFelixHttpsTruststorePasswordTypeHint,
				orgApacheFelixHttpsClientcertificate,
				orgApacheFelixHttpsClientcertificateTypeHint,
				orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint,
				orgOsgiServiceHttpPortSecure,
				orgOsgiServiceHttpPortSecureTypeHint);
		assertTrue((response.getStatusCode() == 200)
				|| (response.getStatusCode() == 201));
	}

}

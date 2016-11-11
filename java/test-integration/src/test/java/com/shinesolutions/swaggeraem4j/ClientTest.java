
package com.shinesolutions.swaggeraem4j;

import org.junit.Test;

import static org.junit.Assert.*;

import com.shinesolutions.swaggeraem4j.api.SlingApi;

public class ClientTest {

    @Test
    public void testApiCallWithIncorrectCredentials() throws ApiException {
		ApiClient client = new ApiClient();
		client.setBasePath("http://localhost:4502");
		client.setUsername("someinexistingusername");
		client.setPassword("someinexistingpassword");
		client.setDebugging(false);

		SlingApi sling = new SlingApi(client);

    	try {
    		boolean ignoreDeactivated = true;
    		boolean onlyModified = false;
    		String path = "/etc/designs/geometrixx";
    		sling.postTreeActivationWithHttpInfo(ignoreDeactivated, onlyModified, path);
	    	fail();
    	} catch (ApiException e) {
        	assertEquals(401, e.getCode());
    	}
    }

}

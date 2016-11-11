
package com.shinesolutions.swaggeraem4j;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.shinesolutions.swaggeraem4j.api.ConsoleApi;

public class BundleTest {

	private ConsoleApi console;
	
	@Before
	public void init() {
		console = TestHelper.createConsoleApi();
	}
	
    @Test
    public void testStopExistingBundle() throws ApiException {
    	String name = "com.adobe.cq.social.cq-social-forum";
    	String action = "stop";
    	ApiResponse<Void> response = console.postBundleWithHttpInfo(name, action);
    	assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testStopNonExistingBundle() {
    	try {
	    	String name = "someinexistingbundle";
	    	String action = "stop";
	    	console.postBundleWithHttpInfo(name, action);
	    	fail();
    	} catch (ApiException e) {
        	assertEquals(404, e.getCode());    		
    	}
    }

    @Test
    public void testStartExistingBundle() throws ApiException {
    	String name = "com.adobe.cq.social.cq-social-forum";
    	String action = "start";
    	ApiResponse<Void> response = console.postBundleWithHttpInfo(name, action);
    	assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testStartNonExistingBundle() {
    	try {
	    	String name = "someinexistingbundle";
	    	String action = "start";
	    	console.postBundleWithHttpInfo(name, action);
	    	fail();
    	} catch (ApiException e) {
        	assertEquals(404, e.getCode());    		
    	}
    }

}

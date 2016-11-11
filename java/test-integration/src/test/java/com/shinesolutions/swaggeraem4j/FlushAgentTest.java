
package com.shinesolutions.swaggeraem4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.shinesolutions.swaggeraem4j.api.SlingApi;

public class FlushAgentTest {

	private SlingApi sling;
	
	@Before
	public void init() {
		sling = TestHelper.createSlingApi();
		
	    // Ensure agent doesn't exist prior to testing
    	try {
    		String runMode = "author";
    		String name = "some-flush-agent";
    		ApiResponse<Void> response = sling.deleteAgentWithHttpInfo(runMode, name);
    		// Delete agent when it exists
        	assertTrue((response.getStatusCode() == 200) || (response.getStatusCode() == 204));
    	} catch (ApiException e) {
  	      	// Ignore when agent does not exist
        	assertEquals(404, e.getCode());
    	}

    	try {
    		String runMode = "author";
    		String name = "some-flush-agent";
    		sling.getAgentWithHttpInfo(runMode, name);
    		fail();
    	} catch (ApiException e) {
        	assertEquals(404, e.getCode());
    	}
	}
	
    @Test
    public void testCreateNewFlushAgent() throws ApiException {
    	String runMode = "author";
    	String name = "some-flush-agent";
    	String jcrPrimaryType = "cq:Page";
    	String jcrContentCqName = "some-flush-agent";
		String jcrContentJcrTitle = "Some Flush Agent Title";
		String jcrContentJcrDescription = "Some Flush Agent Description";
		String jcrContentSlingResourceType = "/libs/cq/replication/components/agent";
		String jcrContentTransportUri = "httpString //somehostString 8080/dispatcher/invalidate.cache";
		String jcrContentTransportUser = "";
		String jcrContentTransportPassword = "";
		String jcrContentLogLevel = "error";
		boolean jcrContentNoVersioning = true;
		List<String> jcrContentProtocolHTTPHeaders = Arrays.asList("CQ-ActionString {action}", "CQ-HandleString {path}", "CQ-PathString {path}");
		String jcrContentProtocolHTTPHeadersTypeHint = "String[]";
		String jcrContentProtocolHTTPMethod = "GET";
		String jcrContentRetryDelay = "30000";
		String jcrContentSerializationType = "flush";
		String jcrContentJcrMixinTypes = "cqString ReplicationStatus";
		boolean jcrContentTriggerReceive = true;
		boolean jcrContentTriggerSpecific = true;
		String jcrContentCqTemplate = "/libs/cq/replication/templates/agent";
		boolean jcrContentEnabled = true;
    	
        ApiResponse<Void> response = sling.postAgentWithHttpInfo(
    		runMode, 
    		name, 
    		jcrPrimaryType, 
    		jcrContentCqName, 
    		jcrContentJcrTitle, 
    		jcrContentJcrDescription, 
    		jcrContentSlingResourceType, 
    		jcrContentTransportUri, 
    		jcrContentTransportUser, 
    		jcrContentTransportPassword, 
    		jcrContentLogLevel, 
    		jcrContentNoVersioning, 
    		jcrContentProtocolHTTPHeaders, 
    		jcrContentProtocolHTTPHeadersTypeHint, 
    		jcrContentProtocolHTTPMethod, 
    		jcrContentRetryDelay, 
    		jcrContentSerializationType, 
    		jcrContentJcrMixinTypes, 
    		jcrContentTriggerReceive, 
    		jcrContentTriggerSpecific, 
    		jcrContentCqTemplate, 
    		jcrContentEnabled
		);
        
    	assertEquals(201, response.getStatusCode());
    	
    	runMode = "author";
    	name = "some-flush-agent";
    	jcrPrimaryType = "cq:Page";
    	jcrContentCqName = "some-flush-agent";
		jcrContentJcrTitle = "Some New Flush Agent Title";
		jcrContentJcrDescription = "Some New Flush Agent Description";
		jcrContentSlingResourceType = "";
		jcrContentTransportUri = "";
		jcrContentTransportUser = "";
		jcrContentTransportPassword = "";
		jcrContentLogLevel = "";
		jcrContentNoVersioning = false;
		jcrContentProtocolHTTPHeaders = Collections.emptyList();
		jcrContentProtocolHTTPHeadersTypeHint = "";
		jcrContentProtocolHTTPMethod = "";
		jcrContentRetryDelay = "";
		jcrContentSerializationType = "";
		jcrContentJcrMixinTypes = "";
		jcrContentTriggerReceive = false;
		jcrContentTriggerSpecific = false;
		jcrContentCqTemplate = "";
		jcrContentEnabled = false;
    	
        response = sling.postAgentWithHttpInfo(
    		runMode, 
    		name, 
    		jcrPrimaryType, 
    		jcrContentCqName, 
    		jcrContentJcrTitle, 
    		jcrContentJcrDescription, 
    		jcrContentSlingResourceType, 
    		jcrContentTransportUri, 
    		jcrContentTransportUser, 
    		jcrContentTransportPassword, 
    		jcrContentLogLevel, 
    		jcrContentNoVersioning, 
    		jcrContentProtocolHTTPHeaders, 
    		jcrContentProtocolHTTPHeadersTypeHint, 
    		jcrContentProtocolHTTPMethod, 
    		jcrContentRetryDelay, 
    		jcrContentSerializationType, 
    		jcrContentJcrMixinTypes, 
    		jcrContentTriggerReceive, 
    		jcrContentTriggerSpecific, 
    		jcrContentCqTemplate, 
    		jcrContentEnabled
		);

    	assertEquals(200, response.getStatusCode());
    }
}

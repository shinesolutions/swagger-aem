package com.shinesolutions.swaggeraem4j;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.shinesolutions.swaggeraem4j.api.CqApi;

public class AemTest {

	private CqApi cq;

	@Before
	public void init() {
		cq = TestHelper.createCqApi();
	}

	@Test
	public void testGetLoginPage() throws ApiException {
		ApiResponse<Void> response = cq.getLoginPageWithHttpInfo();
		assertEquals(200, response.getStatusCode());
    // TODO: investigate if generated Java client also doesn't return data due to swallowed return type
    //       https://github.com/shinesolutions/swagger-aem/commit/6b1dbf00c27930627ac0702f65e0a560761c1bf0#diff-db60b8b509c67ab54bfcc8564c866537R62
    // System.out.println(response.getData());
    // assertTrue(String.valueOf(response.getData()).contains("QUICKSTART_HOMEPAGE"));
	}

}

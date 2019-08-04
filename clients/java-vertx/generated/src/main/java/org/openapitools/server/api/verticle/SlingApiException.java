package org.openapitools.server.api.verticle;

import java.math.BigDecimal;
import java.io.File;
import org.openapitools.server.api.model.KeystoreInfo;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.TruststoreInfo;

public final class SlingApiException extends MainApiException {
    public SlingApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final SlingApiException Sling_getAuthorizableKeystore_0_Exception = new SlingApiException(0, "Default response");
    public static final SlingApiException Sling_getTruststoreInfo_0_Exception = new SlingApiException(0, "Default response");
    public static final SlingApiException Sling_postAuthorizableKeystore_0_Exception = new SlingApiException(0, "Default response");
    

}
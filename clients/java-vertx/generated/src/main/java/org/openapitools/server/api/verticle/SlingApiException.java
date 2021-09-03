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
    
    public static final SlingApiException Sling_getAuthorizableKeystore_200_Exception = new SlingApiException(200, "Retrieved Authorizable Keystore info");
    public static final SlingApiException Sling_getTruststoreInfo_200_Exception = new SlingApiException(200, "Retrieved AEM Truststore info");
    public static final SlingApiException Sling_postAuthorizableKeystore_200_Exception = new SlingApiException(200, "Retrieved Authorizable Keystore info");
    

}
package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.BundleInfo;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SamlConfigurationInfo;

public final class ConsoleApiException extends MainApiException {
    public ConsoleApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final ConsoleApiException Console_getBundleInfo_200_Exception = new ConsoleApiException(200, "Retrieved bundle info");
    public static final ConsoleApiException Console_getConfigMgr_200_Exception = new ConsoleApiException(200, "OK");
    public static final ConsoleApiException Console_getConfigMgr_5XX_Exception = new ConsoleApiException(5XX, "Unexpected error.");
    public static final ConsoleApiException Console_postSamlConfiguration_200_Exception = new ConsoleApiException(200, "Retrieved AEM SAML Configuration");
    public static final ConsoleApiException Console_postSamlConfiguration_302_Exception = new ConsoleApiException(302, "Default response");
    

}
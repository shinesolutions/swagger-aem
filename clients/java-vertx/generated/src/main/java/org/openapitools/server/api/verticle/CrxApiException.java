package org.openapitools.server.api.verticle;

import java.io.File;
import org.openapitools.server.api.model.InstallStatus;
import org.openapitools.server.api.MainApiException;

public final class CrxApiException extends MainApiException {
    public CrxApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final CrxApiException Crx_getCrxdeStatus_200_Exception = new CrxApiException(200, "CRXDE is enabled");
    public static final CrxApiException Crx_getCrxdeStatus_404_Exception = new CrxApiException(404, "CRXDE is disabled");
    public static final CrxApiException Crx_getInstallStatus_200_Exception = new CrxApiException(200, "Retrieved CRX package manager install status");
    public static final CrxApiException Crx_getPackageManagerServlet_404_Exception = new CrxApiException(404, "Package Manager Servlet is disabled");
    public static final CrxApiException Crx_getPackageManagerServlet_405_Exception = new CrxApiException(405, "Package Manager Servlet is active");
    

}
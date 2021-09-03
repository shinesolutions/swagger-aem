package org.openapitools.server.api.verticle;

import java.io.File;
import org.openapitools.server.api.MainApiException;

public final class GraniteApiException extends MainApiException {
    public GraniteApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    

}
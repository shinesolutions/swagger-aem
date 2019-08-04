package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class CqApiException extends MainApiException {
    public CqApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    

}
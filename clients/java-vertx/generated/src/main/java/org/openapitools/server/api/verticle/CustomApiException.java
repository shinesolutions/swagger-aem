package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class CustomApiException extends MainApiException {
    public CustomApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    

}
/*
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI spec version: 2.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraem4j.api;

import com.shinesolutions.swaggeraem4j.ApiCallback;
import com.shinesolutions.swaggeraem4j.ApiClient;
import com.shinesolutions.swaggeraem4j.ApiException;
import com.shinesolutions.swaggeraem4j.ApiResponse;
import com.shinesolutions.swaggeraem4j.Configuration;
import com.shinesolutions.swaggeraem4j.Pair;
import com.shinesolutions.swaggeraem4j.ProgressRequestBody;
import com.shinesolutions.swaggeraem4j.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomApi {
    private ApiClient apiClient;

    public CustomApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAemHealthCheck
     * @param tags  (optional)
     * @param combineTagsOr  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAemHealthCheckCall(String tags, Boolean combineTagsOr, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/system/health";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tags", tags));
        if (combineTagsOr != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("combineTagsOr", combineTagsOr));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "aemAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAemHealthCheckValidateBeforeCall(String tags, Boolean combineTagsOr, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getAemHealthCheckCall(tags, combineTagsOr, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param tags  (optional)
     * @param combineTagsOr  (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getAemHealthCheck(String tags, Boolean combineTagsOr) throws ApiException {
        ApiResponse<String> resp = getAemHealthCheckWithHttpInfo(tags, combineTagsOr);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param tags  (optional)
     * @param combineTagsOr  (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getAemHealthCheckWithHttpInfo(String tags, Boolean combineTagsOr) throws ApiException {
        com.squareup.okhttp.Call call = getAemHealthCheckValidateBeforeCall(tags, combineTagsOr, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param tags  (optional)
     * @param combineTagsOr  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAemHealthCheckAsync(String tags, Boolean combineTagsOr, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAemHealthCheckValidateBeforeCall(tags, combineTagsOr, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postConfigAemHealthCheckServlet
     * @param runmode  (required)
     * @param bundlesIgnored  (optional)
     * @param bundlesIgnoredTypeHint  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postConfigAemHealthCheckServletCall(String runmode, List<String> bundlesIgnored, String bundlesIgnoredTypeHint, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck"
            .replaceAll("\\{" + "runmode" + "\\}", apiClient.escapeString(runmode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (bundlesIgnored != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "bundles.ignored", bundlesIgnored));
        if (bundlesIgnoredTypeHint != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("bundles.ignored@TypeHint", bundlesIgnoredTypeHint));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "aemAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postConfigAemHealthCheckServletValidateBeforeCall(String runmode, List<String> bundlesIgnored, String bundlesIgnoredTypeHint, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'runmode' is set
        if (runmode == null) {
            throw new ApiException("Missing the required parameter 'runmode' when calling postConfigAemHealthCheckServlet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postConfigAemHealthCheckServletCall(runmode, bundlesIgnored, bundlesIgnoredTypeHint, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param runmode  (required)
     * @param bundlesIgnored  (optional)
     * @param bundlesIgnoredTypeHint  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postConfigAemHealthCheckServlet(String runmode, List<String> bundlesIgnored, String bundlesIgnoredTypeHint) throws ApiException {
        postConfigAemHealthCheckServletWithHttpInfo(runmode, bundlesIgnored, bundlesIgnoredTypeHint);
    }

    /**
     * 
     * 
     * @param runmode  (required)
     * @param bundlesIgnored  (optional)
     * @param bundlesIgnoredTypeHint  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postConfigAemHealthCheckServletWithHttpInfo(String runmode, List<String> bundlesIgnored, String bundlesIgnoredTypeHint) throws ApiException {
        com.squareup.okhttp.Call call = postConfigAemHealthCheckServletValidateBeforeCall(runmode, bundlesIgnored, bundlesIgnoredTypeHint, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * 
     * @param runmode  (required)
     * @param bundlesIgnored  (optional)
     * @param bundlesIgnoredTypeHint  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postConfigAemHealthCheckServletAsync(String runmode, List<String> bundlesIgnored, String bundlesIgnoredTypeHint, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postConfigAemHealthCheckServletValidateBeforeCall(runmode, bundlesIgnored, bundlesIgnoredTypeHint, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for postConfigAemPasswordReset
     * @param runmode  (required)
     * @param pwdresetAuthorizables  (optional)
     * @param pwdresetAuthorizablesTypeHint  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postConfigAemPasswordResetCall(String runmode, List<String> pwdresetAuthorizables, String pwdresetAuthorizablesTypeHint, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator"
            .replaceAll("\\{" + "runmode" + "\\}", apiClient.escapeString(runmode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pwdresetAuthorizables != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "pwdreset.authorizables", pwdresetAuthorizables));
        if (pwdresetAuthorizablesTypeHint != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pwdreset.authorizables@TypeHint", pwdresetAuthorizablesTypeHint));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "aemAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postConfigAemPasswordResetValidateBeforeCall(String runmode, List<String> pwdresetAuthorizables, String pwdresetAuthorizablesTypeHint, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'runmode' is set
        if (runmode == null) {
            throw new ApiException("Missing the required parameter 'runmode' when calling postConfigAemPasswordReset(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postConfigAemPasswordResetCall(runmode, pwdresetAuthorizables, pwdresetAuthorizablesTypeHint, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param runmode  (required)
     * @param pwdresetAuthorizables  (optional)
     * @param pwdresetAuthorizablesTypeHint  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postConfigAemPasswordReset(String runmode, List<String> pwdresetAuthorizables, String pwdresetAuthorizablesTypeHint) throws ApiException {
        postConfigAemPasswordResetWithHttpInfo(runmode, pwdresetAuthorizables, pwdresetAuthorizablesTypeHint);
    }

    /**
     * 
     * 
     * @param runmode  (required)
     * @param pwdresetAuthorizables  (optional)
     * @param pwdresetAuthorizablesTypeHint  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postConfigAemPasswordResetWithHttpInfo(String runmode, List<String> pwdresetAuthorizables, String pwdresetAuthorizablesTypeHint) throws ApiException {
        com.squareup.okhttp.Call call = postConfigAemPasswordResetValidateBeforeCall(runmode, pwdresetAuthorizables, pwdresetAuthorizablesTypeHint, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * 
     * @param runmode  (required)
     * @param pwdresetAuthorizables  (optional)
     * @param pwdresetAuthorizablesTypeHint  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postConfigAemPasswordResetAsync(String runmode, List<String> pwdresetAuthorizables, String pwdresetAuthorizablesTypeHint, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postConfigAemPasswordResetValidateBeforeCall(runmode, pwdresetAuthorizables, pwdresetAuthorizablesTypeHint, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}

/**
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis


import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class GraniteApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.openapitools.client.baseUrl", "http://localhost")
        }
    }

    /**
    * 
    * 
    * @param keystorePassword  
    * @param keystorePasswordConfirm  
    * @param truststorePassword  
    * @param truststorePasswordConfirm  
    * @param httpsHostname  
    * @param httpsPort  
    * @param privatekeyFile  (optional)
    * @param certificateFile  (optional)
    * @return kotlin.String
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun sslSetup(keystorePassword: kotlin.String, keystorePasswordConfirm: kotlin.String, truststorePassword: kotlin.String, truststorePasswordConfirm: kotlin.String, httpsHostname: kotlin.String, httpsPort: kotlin.String, privatekeyFile: java.io.File?, certificateFile: java.io.File?) : kotlin.String {
        val localVariableConfig = sslSetupRequestConfig(keystorePassword = keystorePassword, keystorePasswordConfirm = keystorePasswordConfirm, truststorePassword = truststorePassword, truststorePasswordConfirm = truststorePasswordConfirm, httpsHostname = httpsHostname, httpsPort = httpsPort, privatekeyFile = privatekeyFile, certificateFile = certificateFile)

        val localVarResponse = request<Map<String, Any?>, kotlin.String>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.String
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation sslSetup
    *
    * @param keystorePassword  
    * @param keystorePasswordConfirm  
    * @param truststorePassword  
    * @param truststorePasswordConfirm  
    * @param httpsHostname  
    * @param httpsPort  
    * @param privatekeyFile  (optional)
    * @param certificateFile  (optional)
    * @return RequestConfig
    */
    fun sslSetupRequestConfig(keystorePassword: kotlin.String, keystorePasswordConfirm: kotlin.String, truststorePassword: kotlin.String, truststorePasswordConfirm: kotlin.String, httpsHostname: kotlin.String, httpsPort: kotlin.String, privatekeyFile: java.io.File?, certificateFile: java.io.File?) : RequestConfig<Map<String, Any?>> {
        val localVariableBody = mapOf("privatekeyFile" to privatekeyFile, "certificateFile" to certificateFile)
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("keystorePassword", listOf(keystorePassword.toString()))
                put("keystorePasswordConfirm", listOf(keystorePasswordConfirm.toString()))
                put("truststorePassword", listOf(truststorePassword.toString()))
                put("truststorePasswordConfirm", listOf(truststorePasswordConfirm.toString()))
                put("httpsHostname", listOf(httpsHostname.toString()))
                put("httpsPort", listOf(httpsPort.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/libs/granite/security/post/sslSetup.html",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}

/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object CqApi {

  def apply(baseUrl: String = "http://localhost") = new CqApi(baseUrl)
}

class CqApi(baseUrl: String) {
  
  /**
   * Expected answers:
   *   code 0 : String (Default response)
   */
  def getLoginPage(): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, baseUrl, "/libs/granite/core/content/login.html", "application/json")
      .withDefaultErrorResponse[String]
      

  /**
   * Expected answers:
   *   code 0 :  (Default response)
   * 
   * Available security schemes:
   *   aemAuth (http)
   * 
   * @param authorizableId 
   * @param changelog 
   */
  def postCqActions(authorizableId: String, changelog: String)(implicit basicAuth: BasicCredentials): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/.cqactions.html", "application/json")
      .withCredentials(basicAuth).withQueryParam("authorizableId", authorizableId)
      .withQueryParam("changelog", changelog)
      .withDefaultErrorResponse[Unit]
      



}


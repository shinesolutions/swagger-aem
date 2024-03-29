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

object CustomApi {

  def apply(baseUrl: String = "http://localhost") = new CustomApi(baseUrl)
}

class CustomApi(baseUrl: String) {
  
  /**
   * Expected answers:
   *   code 0 : String (Default response)
   * 
   * Available security schemes:
   *   aemAuth (http)
   * 
   * @param tags 
   * @param combineTagsOr 
   */
  def getAemHealthCheck(tags: Option[String] = None, combineTagsOr: Option[Boolean] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, baseUrl, "/system/health", "application/json")
      .withCredentials(basicAuth).withQueryParam("tags", tags)
      .withQueryParam("combineTagsOr", combineTagsOr)
      .withDefaultErrorResponse[String]
      

  /**
   * Expected answers:
   *   code 0 :  (Default response)
   * 
   * Available security schemes:
   *   aemAuth (http)
   * 
   * @param bundlesIgnored 
   * @param bundlesIgnoredTypeHint 
   */
  def postConfigAemHealthCheckServlet(bundlesIgnored: Seq[String], bundlesIgnoredTypeHint: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck", "application/json")
      .withCredentials(basicAuth).withQueryParam("bundles.ignored", ArrayValues(bundlesIgnored, MULTI))
      .withQueryParam("bundles.ignored@TypeHint", bundlesIgnoredTypeHint)
      .withDefaultErrorResponse[Unit]
      

  /**
   * Expected answers:
   *   code 0 :  (Default response)
   * 
   * Available security schemes:
   *   aemAuth (http)
   * 
   * @param pwdresetAuthorizables 
   * @param pwdresetAuthorizablesTypeHint 
   */
  def postConfigAemPasswordReset(pwdresetAuthorizables: Seq[String], pwdresetAuthorizablesTypeHint: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator", "application/json")
      .withCredentials(basicAuth).withQueryParam("pwdreset.authorizables", ArrayValues(pwdresetAuthorizables, MULTI))
      .withQueryParam("pwdreset.authorizables@TypeHint", pwdresetAuthorizablesTypeHint)
      .withDefaultErrorResponse[Unit]
      



}


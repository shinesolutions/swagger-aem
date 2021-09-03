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

package io.swagger.client.model
import play.api.libs.json._

case class BundleData (
            /* Bundle ID */
                  id: Option[Int],
            /* Bundle name */
                  name: Option[String],
            /* Is bundle a fragment */
                  fragment: Option[Boolean],
            /* Numeric raw bundle state value */
                  stateRaw: Option[Int],
            /* Bundle state value */
                  state: Option[String],
            /* Bundle version */
                  version: Option[String],
            /* Bundle symbolic name */
                  symbolicName: Option[String],
            /* Bundle category */
                  category: Option[String],
                  props: Option[Seq[BundleDataProp]]
)

object BundleData {
implicit val format: Format[BundleData] = Json.format
}

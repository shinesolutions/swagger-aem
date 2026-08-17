package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BundleData.
  * @param id Bundle ID
  * @param name Bundle name
  * @param fragment Is bundle a fragment
  * @param stateRaw Numeric raw bundle state value
  * @param state Bundle state value
  * @param version Bundle version
  * @param symbolicName Bundle symbolic name
  * @param category Bundle category
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BundleData(
  id: Option[Int],
  name: Option[String],
  fragment: Option[Boolean],
  stateRaw: Option[Int],
  state: Option[String],
  version: Option[String],
  symbolicName: Option[String],
  category: Option[String],
  props: Option[List[BundleDataProp]]
)

object BundleData {
  implicit lazy val bundleDataJsonFormat: Format[BundleData] = Json.format[BundleData]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BundleDataProp.
  * @param key Bundle data key
  * @param value Bundle data value
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T01:24:15.341341283Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BundleDataProp(
  key: Option[String],
  value: Option[String]
)

object BundleDataProp {
  implicit lazy val bundleDataPropJsonFormat: Format[BundleDataProp] = Json.format[BundleDataProp]
}


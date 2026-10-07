package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BundleInfo.
  * @param status Status description of all bundles
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T01:24:15.341341283Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BundleInfo(
  status: Option[String],
  s: Option[List[Int]],
  data: Option[List[BundleData]]
)

object BundleInfo {
  implicit lazy val bundleInfoJsonFormat: Format[BundleInfo] = Json.format[BundleInfo]
}


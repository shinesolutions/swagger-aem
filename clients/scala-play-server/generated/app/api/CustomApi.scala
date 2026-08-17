package api

import play.api.libs.json._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T07:15:43.105475754Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait CustomApi {
  /**
    */
  def getAemHealthCheck(tags: Option[String], combineTagsOr: Option[Boolean]): String

  /**
    */
  def postConfigAemHealthCheckServlet(bundlesPeriodignored: Option[List[String]], bundlesPeriodignoredAtTypeHint: Option[String]): Unit

  /**
    */
  def postConfigAemPasswordReset(pwdresetPeriodauthorizables: Option[List[String]], pwdresetPeriodauthorizablesAtTypeHint: Option[String]): Unit
}

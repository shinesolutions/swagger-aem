package api

import play.api.libs.json._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T07:15:43.105475754Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait CqApi {
  /**
    */
  def getLoginPage(): String

  /**
    */
  def postCqActions(authorizableId: String, changelog: String): Unit
}

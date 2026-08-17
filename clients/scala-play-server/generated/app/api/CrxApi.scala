package api

import play.api.libs.json._
import model.InstallStatus
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait CrxApi {
  /**
    */
  def getCrxdeStatus(): String

  /**
    */
  def getInstallStatus(): InstallStatus

  /**
    */
  def getPackageManagerServlet(): Unit

  /**
    */
  def postPackageService(cmd: String): String

  /**
    */
  def postPackageServiceJson(path: String, cmd: String, groupName: Option[String], packageName: Option[String], packageVersion: Option[String], charset: Option[String], force: Option[Boolean], recursive: Option[Boolean], `package`: Option[TemporaryFile]): String

  /**
    */
  def postPackageUpdate(groupName: String, packageName: String, version: String, path: String, filter: Option[String], charset: Option[String]): String

  /**
    */
  def postSetPassword(old: String, plain: String, verify: String): String
}

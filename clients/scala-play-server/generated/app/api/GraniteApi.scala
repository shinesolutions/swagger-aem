package api

import play.api.libs.json._
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T01:24:15.341341283Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait GraniteApi {
  /**
    */
  def sslSetup(keystorePassword: String, keystorePasswordConfirm: String, truststorePassword: String, truststorePasswordConfirm: String, httpsHostname: String, httpsPort: String, privatekeyFile: Option[TemporaryFile], certificateFile: Option[TemporaryFile]): String
}

package api

import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[GraniteApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class GraniteApiImpl extends GraniteApi {
  /**
    * @inheritdoc
    */
  override def sslSetup(keystorePassword: String, keystorePasswordConfirm: String, truststorePassword: String, truststorePasswordConfirm: String, httpsHostname: String, httpsPort: String, privatekeyFile: Option[TemporaryFile], certificateFile: Option[TemporaryFile]): String = {
    // TODO: Implement better logic

    ""
  }
}

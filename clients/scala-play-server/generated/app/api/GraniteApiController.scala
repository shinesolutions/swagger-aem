package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class GraniteApiController @Inject()(cc: ControllerComponents, api: GraniteApi) extends AbstractController(cc) {
  /**
    * POST /libs/granite/security/post/sslSetup.html?keystorePassword=[value]&keystorePasswordConfirm=[value]&truststorePassword=[value]&truststorePasswordConfirm=[value]&httpsHostname=[value]&httpsPort=[value]
    */
  def sslSetup(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val keystorePassword = request.getQueryString("keystorePassword")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("keystorePassword", "query string")
        }
        
      val keystorePasswordConfirm = request.getQueryString("keystorePasswordConfirm")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("keystorePasswordConfirm", "query string")
        }
        
      val truststorePassword = request.getQueryString("truststorePassword")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("truststorePassword", "query string")
        }
        
      val truststorePasswordConfirm = request.getQueryString("truststorePasswordConfirm")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("truststorePasswordConfirm", "query string")
        }
        
      val httpsHostname = request.getQueryString("httpsHostname")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("httpsHostname", "query string")
        }
        
      val httpsPort = request.getQueryString("httpsPort")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("httpsPort", "query string")
        }
        
      val privatekeyFile = request.body.asMultipartFormData.flatMap(_.file("privatekeyFile").map(_.ref: TemporaryFile))
        
      val certificateFile = request.body.asMultipartFormData.flatMap(_.file("certificateFile").map(_.ref: TemporaryFile))
        
      api.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFile, certificateFile)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}

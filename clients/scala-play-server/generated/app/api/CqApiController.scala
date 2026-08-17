package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class CqApiController @Inject()(cc: ControllerComponents, api: CqApi) extends AbstractController(cc) {
  /**
    * GET /libs/granite/core/content/login.html
    */
  def getLoginPage(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      api.getLoginPage()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /.cqactions.html?authorizableId=[value]&changelog=[value]
    */
  def postCqActions(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val authorizableId = request.getQueryString("authorizableId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("authorizableId", "query string")
        }
        
      val changelog = request.getQueryString("changelog")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("changelog", "query string")
        }
        
      api.postCqActions(authorizableId, changelog)
    }

    executeApi()
    Ok
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

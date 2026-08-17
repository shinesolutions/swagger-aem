package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class CustomApiController @Inject()(cc: ControllerComponents, api: CustomApi) extends AbstractController(cc) {
  /**
    * GET /system/health?tags=[value]&combineTagsOr=[value]
    */
  def getAemHealthCheck(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val tags = request.getQueryString("tags")
        
      val combineTagsOr = request.getQueryString("combineTagsOr")
        .map(value => value.toBoolean)
        
      api.getAemHealthCheck(tags, combineTagsOr)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck?bundlesPeriodignored=[value]&bundlesPeriodignoredAtTypeHint=[value]
    */
  def postConfigAemHealthCheckServlet(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val bundlesPeriodignored = request.queryString.get("bundles.ignored")
        .map(_.toList)
        
      val bundlesPeriodignoredAtTypeHint = request.getQueryString("bundles.ignored@TypeHint")
        
      api.postConfigAemHealthCheckServlet(bundlesPeriodignored, bundlesPeriodignoredAtTypeHint)
    }

    executeApi()
    Ok
  }

  /**
    * POST /apps/system/config/com.shinesolutions.aem.passwordreset.Activator?pwdresetPeriodauthorizables=[value]&pwdresetPeriodauthorizablesAtTypeHint=[value]
    */
  def postConfigAemPasswordReset(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val pwdresetPeriodauthorizables = request.queryString.get("pwdreset.authorizables")
        .map(_.toList)
        
      val pwdresetPeriodauthorizablesAtTypeHint = request.getQueryString("pwdreset.authorizables@TypeHint")
        
      api.postConfigAemPasswordReset(pwdresetPeriodauthorizables, pwdresetPeriodauthorizablesAtTypeHint)
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

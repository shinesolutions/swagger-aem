package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.InstallStatus
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class CrxApiController @Inject()(cc: ControllerComponents, api: CrxApi) extends AbstractController(cc) {
  /**
    * GET /crx/server/crx.default/jcr:root/.1.json
    */
  def getCrxdeStatus(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      api.getCrxdeStatus()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /crx/packmgr/installstatus.jsp
    */
  def getInstallStatus(): Action[AnyContent] = Action { request =>
    def executeApi(): InstallStatus = {
      api.getInstallStatus()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /crx/packmgr/service/script.html
    */
  def getPackageManagerServlet(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.getPackageManagerServlet()
    }

    executeApi()
    Ok
  }

  /**
    * POST /crx/packmgr/service.jsp?cmd=[value]
    */
  def postPackageService(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val cmd = request.getQueryString("cmd")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("cmd", "query string")
        }
        
      api.postPackageService(cmd)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /crx/packmgr/service/.json/:path?cmd=[value]&groupName=[value]&packageName=[value]&packageVersion=[value]&charset=[value]&force=[value]&recursive=[value]
    */
  def postPackageServiceJson(path: String): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val cmd = request.getQueryString("cmd")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("cmd", "query string")
        }
        
      val groupName = request.getQueryString("groupName")
        
      val packageName = request.getQueryString("packageName")
        
      val packageVersion = request.getQueryString("packageVersion")
        
      val charset = request.getQueryString("_charset_")
        
      val force = request.getQueryString("force")
        .map(value => value.toBoolean)
        
      val recursive = request.getQueryString("recursive")
        .map(value => value.toBoolean)
        
      val `package` = request.body.asMultipartFormData.flatMap(_.file("package").map(_.ref: TemporaryFile))
        
      api.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, `package`)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /crx/packmgr/update.jsp?groupName=[value]&packageName=[value]&version=[value]&path=[value]&filter=[value]&charset=[value]
    */
  def postPackageUpdate(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val groupName = request.getQueryString("groupName")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("groupName", "query string")
        }
        
      val packageName = request.getQueryString("packageName")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("packageName", "query string")
        }
        
      val version = request.getQueryString("version")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("version", "query string")
        }
        
      val path = request.getQueryString("path")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("path", "query string")
        }
        
      val filter = request.getQueryString("filter")
        
      val charset = request.getQueryString("_charset_")
        
      api.postPackageUpdate(groupName, packageName, version, path, filter, charset)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /crx/explorer/ui/setpassword.jsp?old=[value]&plain=[value]&verify=[value]
    */
  def postSetPassword(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val old = request.getQueryString("old")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("old", "query string")
        }
        
      val plain = request.getQueryString("plain")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("plain", "query string")
        }
        
      val verify = request.getQueryString("verify")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("verify", "query string")
        }
        
      api.postSetPassword(old, plain, verify)
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

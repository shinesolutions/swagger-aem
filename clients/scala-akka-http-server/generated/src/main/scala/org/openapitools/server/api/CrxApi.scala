package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.StringDirectives
import org.openapitools.server.MultipartDirectives
import org.openapitools.server.FileField
import org.openapitools.server.PartsAndFiles
import java.io.File
import org.openapitools.server.model.InstallStatus
import scala.util.Try
import akka.http.scaladsl.server.MalformedRequestContentRejection
import akka.http.scaladsl.server.directives.FileInfo


class CrxApi(
    crxService: CrxApiService,
    crxMarshaller: CrxApiMarshaller
)  extends MultipartDirectives with StringDirectives {

  
  import crxMarshaller._

  lazy val route: Route =
    path("crx" / "server" / "crx.default" / "jcr:root" / ".1.json") { 
      get {  
            crxService.getCrxdeStatus()
      }
    } ~
    path("crx" / "packmgr" / "installstatus.jsp") { 
      get {  
            crxService.getInstallStatus()
      }
    } ~
    path("crx" / "packmgr" / "service" / "script.html") { 
      get {  
            crxService.getPackageManagerServlet()
      }
    } ~
    path("crx" / "packmgr" / "service.jsp") { 
      post { 
        parameters("cmd".as[String]) { (cmd) => 
            crxService.postPackageService(cmd = cmd)
        }
      }
    } ~
    path("crx" / "packmgr" / "service" / ".json" / Segment) { (path) => 
      post { 
        parameters("cmd".as[String], "groupName".as[String].?, "packageName".as[String].?, "packageVersion".as[String].?, "_charset_".as[String].?, "force".as[Boolean].?, "recursive".as[Boolean].?) { (cmd, groupName, packageName, packageVersion, charset, force, recursive) => 
        formAndFiles(FileField("package")),  { partsAndFiles => 
          val _____ : Try[Route] = for {
            package <- optToTry(partsAndFiles.files.get("package"), s"File package missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
              crxService.postPackageServiceJson(path = path, cmd = cmd, groupName = groupName, packageName = packageName, packageVersion = packageVersion, charset = charset, force = force, recursive = recursive, `package` = `package`)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
        }
      }
    } ~
    path("crx" / "packmgr" / "update.jsp") { 
      post { 
        parameters("groupName".as[String], "packageName".as[String], "version".as[String], "path".as[String], "filter".as[String].?, "_charset_".as[String].?) { (groupName, packageName, version, path, filter, charset) => 
            crxService.postPackageUpdate(groupName = groupName, packageName = packageName, version = version, path = path, filter = filter, charset = charset)
        }
      }
    } ~
    path("crx" / "explorer" / "ui" / "setpassword.jsp") { 
      post { 
        parameters("old".as[String], "plain".as[String], "verify".as[String]) { (old, plain, verify) => 
            crxService.postSetPassword(old = old, plain = plain, verify = verify)
        }
      }
    }
}


trait CrxApiService {

  def getCrxdeStatus200(responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((200, responseString))
  def getCrxdeStatus404(responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((404, responseString))
  /**
   * Code: 200, Message: CRXDE is enabled, DataType: String
   * Code: 404, Message: CRXDE is disabled, DataType: String
   */
  def getCrxdeStatus(): Route

  def getInstallStatus200(responseInstallStatus: InstallStatus)(implicit toEntityMarshallerInstallStatus: ToEntityMarshaller[InstallStatus]): Route =
    complete((200, responseInstallStatus))
  def getInstallStatusDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 200, Message: Retrieved CRX package manager install status, DataType: InstallStatus
   * Code: 0, Message: Default response, DataType: String
   */
  def getInstallStatus()
      (implicit toEntityMarshallerInstallStatus: ToEntityMarshaller[InstallStatus]): Route

  def getPackageManagerServlet404(responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((404, responseString))
  def getPackageManagerServlet405(responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((405, responseString))
  /**
   * Code: 404, Message: Package Manager Servlet is disabled, DataType: String
   * Code: 405, Message: Package Manager Servlet is active, DataType: String
   */
  def getPackageManagerServlet(): Route

  def postPackageServiceDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def postPackageService(cmd: String): Route

  def postPackageServiceJsonDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def postPackageServiceJson(path: String, cmd: String, groupName: Option[String], packageName: Option[String], packageVersion: Option[String], charset: Option[String], force: Option[Boolean], recursive: Option[Boolean], `package`: (FileInfo, File)): Route

  def postPackageUpdateDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def postPackageUpdate(groupName: String, packageName: String, version: String, path: String, filter: Option[String], charset: Option[String]): Route

  def postSetPasswordDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def postSetPassword(old: String, plain: String, verify: String): Route

}

trait CrxApiMarshaller {


  implicit def toEntityMarshallerInstallStatus: ToEntityMarshaller[InstallStatus]

}


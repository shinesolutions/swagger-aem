package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.StringDirectives
import org.openapitools.server.MultipartDirectives
import org.openapitools.server.FileField
import org.openapitools.server.PartsAndFiles
import java.io.File
import scala.util.Try
import akka.http.scaladsl.server.MalformedRequestContentRejection
import akka.http.scaladsl.server.directives.FileInfo


class GraniteApi(
    graniteService: GraniteApiService
)  extends MultipartDirectives with StringDirectives {

  
  
  lazy val route: Route =
    path("libs" / "granite" / "security" / "post" / "sslSetup.html") { 
      post { 
        parameters("keystorePassword".as[String], "keystorePasswordConfirm".as[String], "truststorePassword".as[String], "truststorePasswordConfirm".as[String], "httpsHostname".as[String], "httpsPort".as[String]) { (keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort) => 
        formAndFiles(FileField("privatekeyFile"))FileField("certificateFile")) { partsAndFiles => 
          val _____ : Try[Route] = for {
            privatekeyFile <- optToTry(partsAndFiles.files.get("privatekeyFile"), s"File privatekeyFile missing")
certificateFile <- optToTry(partsAndFiles.files.get("certificateFile"), s"File certificateFile missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
              graniteService.sslSetup(keystorePassword = keystorePassword, keystorePasswordConfirm = keystorePasswordConfirm, truststorePassword = truststorePassword, truststorePasswordConfirm = truststorePasswordConfirm, httpsHostname = httpsHostname, httpsPort = httpsPort, privatekeyFile = privatekeyFile, certificateFile = certificateFile)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
        }
      }
    }
}


trait GraniteApiService {

  def sslSetupDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def sslSetup(keystorePassword: String, keystorePasswordConfirm: String, truststorePassword: String, truststorePasswordConfirm: String, httpsHostname: String, httpsPort: String, privatekeyFile: (FileInfo, File), certificateFile: (FileInfo, File)): Route

}



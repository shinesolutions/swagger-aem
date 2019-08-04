package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import java.io.File
import org.openapitools.models.InstallStatus
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.time._

object CrxApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        getCrxdeStatus(da) :+:
        getInstallStatus(da) :+:
        getPackageManagerServlet(da) :+:
        postPackageService(da) :+:
        postPackageServiceJson(da) :+:
        postPackageUpdate(da) :+:
        postSetPassword(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a String
        */
        private def getCrxdeStatus(da: DataAccessor): Endpoint[String] =
        get("crx" :: "server" :: "crx.default" :: "jcr:root" :: ".1.json") { () =>
          da.Crx_getCrxdeStatus() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a InstallStatus
        */
        private def getInstallStatus(da: DataAccessor): Endpoint[InstallStatus] =
        get("crx" :: "packmgr" :: "installstatus.jsp") { () =>
          da.Crx_getInstallStatus() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Unit
        */
        private def getPackageManagerServlet(da: DataAccessor): Endpoint[Unit] =
        get("crx" :: "packmgr" :: "service" :: "script.html") { () =>
          da.Crx_getPackageManagerServlet() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a String
        */
        private def postPackageService(da: DataAccessor): Endpoint[String] =
        post("crx" :: "packmgr" :: "service.jsp" :: param("cmd")) { (cmd: String) =>
          da.Crx_postPackageService(cmd) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a String
        */
        private def postPackageServiceJson(da: DataAccessor): Endpoint[String] =
        post("crx" :: "packmgr" :: "service" :: ".json" :: string :: param("cmd") :: paramOption("groupName") :: paramOption("packageName") :: paramOption("packageVersion") :: paramOption("_charset_") :: paramOption("force").map(_.map(_.toBoolean)) :: paramOption("recursive").map(_.map(_.toBoolean)) :: fileUpload("_package")) { (path: String, cmd: String, groupName: Option[String], packageName: Option[String], packageVersion: Option[String], charset: Option[String], force: Option[Boolean], recursive: Option[Boolean], _package: FileUpload) =>
          da.Crx_postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a String
        */
        private def postPackageUpdate(da: DataAccessor): Endpoint[String] =
        post("crx" :: "packmgr" :: "update.jsp" :: param("groupName") :: param("packageName") :: param("version") :: param("path") :: paramOption("filter") :: paramOption("_charset_")) { (groupName: String, packageName: String, version: String, path: String, filter: Option[String], charset: Option[String]) =>
          da.Crx_postPackageUpdate(groupName, packageName, version, path, filter, charset) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a String
        */
        private def postSetPassword(da: DataAccessor): Endpoint[String] =
        post("crx" :: "explorer" :: "ui" :: "setpassword.jsp" :: param("old") :: param("plain") :: param("verify")) { (old: String, plain: String, verify: String) =>
          da.Crx_postSetPassword(old, plain, verify) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = File.createTempFile("tmpCrxApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

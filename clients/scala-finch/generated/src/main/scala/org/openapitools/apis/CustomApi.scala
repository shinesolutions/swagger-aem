package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
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
import java.nio.file.Files
import java.time._

object CustomApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        getAemHealthCheck(da) :+:
        postConfigAemHealthCheckServlet(da) :+:
        postConfigAemPasswordReset(da)


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
        private def getAemHealthCheck(da: DataAccessor): Endpoint[String] =
        get("system" :: "health" :: paramOption("tags") :: paramOption("combineTagsOr").map(_.map(_.toBoolean))) { (tags: Option[String], combineTagsOr: Option[Boolean]) =>
          da.Custom_getAemHealthCheck(tags, combineTagsOr) match {
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
        private def postConfigAemHealthCheckServlet(da: DataAccessor): Endpoint[Unit] =
        post("apps" :: "system" :: "config" :: "com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck" :: params("bundles.ignored") :: paramOption("bundles.ignored@TypeHint")) { (bundlesPeriodignored: Seq[String], bundlesPeriodignoredAtTypeHint: Option[String]) =>
          da.Custom_postConfigAemHealthCheckServlet(bundlesPeriodignored, bundlesPeriodignoredAtTypeHint) match {
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
        private def postConfigAemPasswordReset(da: DataAccessor): Endpoint[Unit] =
        post("apps" :: "system" :: "config" :: "com.shinesolutions.aem.passwordreset.Activator" :: params("pwdreset.authorizables") :: paramOption("pwdreset.authorizables@TypeHint")) { (pwdresetPeriodauthorizables: Seq[String], pwdresetPeriodauthorizablesAtTypeHint: Option[String]) =>
          da.Custom_postConfigAemPasswordReset(pwdresetPeriodauthorizables, pwdresetPeriodauthorizablesAtTypeHint) match {
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
      val file = Files.createTempFile("tmpCustomApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

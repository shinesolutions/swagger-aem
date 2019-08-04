package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.SamlConfigurationInfo
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

object ConsoleApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        getAemProductInfo(da) :+:
        getConfigMgr(da) :+:
        postBundle(da) :+:
        postJmxRepository(da) :+:
        postSamlConfiguration(da)


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
        * @return An endpoint representing a Seq[String]
        */
        private def getAemProductInfo(da: DataAccessor): Endpoint[Seq[String]] =
        get("system" :: "console" :: "status-productinfo.json") { () =>
          da.Console_getAemProductInfo() match {
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
        private def getConfigMgr(da: DataAccessor): Endpoint[String] =
        get("system" :: "console" :: "configMgr") { () =>
          da.Console_getConfigMgr() match {
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
        private def postBundle(da: DataAccessor): Endpoint[Unit] =
        post("system" :: "console" :: "bundles" :: string :: param("action")) { (name: String, action: String) =>
          da.Console_postBundle(name, action) match {
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
        private def postJmxRepository(da: DataAccessor): Endpoint[Unit] =
        post("system" :: "console" :: "jmx" :: "com.adobe.granite:type=Repository" :: "op" :: string) { (action: String) =>
          da.Console_postJmxRepository(action) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a SamlConfigurationInfo
        */
        private def postSamlConfiguration(da: DataAccessor): Endpoint[SamlConfigurationInfo] =
        post("system" :: "console" :: "configMgr" :: "com.adobe.granite.auth.saml.SamlAuthenticationHandler" :: paramOption("post").map(_.map(_.toBoolean)) :: paramOption("apply").map(_.map(_.toBoolean)) :: paramOption("delete").map(_.map(_.toBoolean)) :: paramOption("action") :: paramOption("$location") :: params("path") :: paramOption("service.ranking").map(_.map(_.toInt)) :: paramOption("idpUrl") :: paramOption("idpCertAlias") :: paramOption("idpHttpRedirect").map(_.map(_.toBoolean)) :: paramOption("serviceProviderEntityId") :: paramOption("assertionConsumerServiceURL") :: paramOption("spPrivateKeyAlias") :: paramOption("keyStorePassword") :: paramOption("defaultRedirectUrl") :: paramOption("userIDAttribute") :: paramOption("useEncryption").map(_.map(_.toBoolean)) :: paramOption("createUser").map(_.map(_.toBoolean)) :: paramOption("addGroupMemberships").map(_.map(_.toBoolean)) :: paramOption("groupMembershipAttribute") :: params("defaultGroups") :: paramOption("nameIdFormat") :: params("synchronizeAttributes") :: paramOption("handleLogout").map(_.map(_.toBoolean)) :: paramOption("logoutUrl") :: paramOption("clockTolerance").map(_.map(_.toInt)) :: paramOption("digestMethod") :: paramOption("signatureMethod") :: paramOption("userIntermediatePath") :: params("propertylist")) { (post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], path: Seq[String], servicePeriodranking: Option[Int], idpUrl: Option[String], idpCertAlias: Option[String], idpHttpRedirect: Option[Boolean], serviceProviderEntityId: Option[String], assertionConsumerServiceURL: Option[String], spPrivateKeyAlias: Option[String], keyStorePassword: Option[String], defaultRedirectUrl: Option[String], userIDAttribute: Option[String], useEncryption: Option[Boolean], createUser: Option[Boolean], addGroupMemberships: Option[Boolean], groupMembershipAttribute: Option[String], defaultGroups: Seq[String], nameIdFormat: Option[String], synchronizeAttributes: Seq[String], handleLogout: Option[Boolean], logoutUrl: Option[String], clockTolerance: Option[Int], digestMethod: Option[String], signatureMethod: Option[String], userIntermediatePath: Option[String], propertylist: Seq[String]) =>
          da.Console_postSamlConfiguration(post, apply, delete, action, Dollarlocation, path, servicePeriodranking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist) match {
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
      val file = File.createTempFile("tmpConsoleApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

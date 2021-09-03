package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.BigDecimal
import java.io.File
import org.openapitools.models.KeystoreInfo
import org.openapitools.models.TruststoreInfo
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

object SlingApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        deleteAgent(da) :+:
        deleteNode(da) :+:
        getAgent(da) :+:
        getAgents(da) :+:
        getAuthorizableKeystore(da) :+:
        getKeystore(da) :+:
        getNode(da) :+:
        getPackage(da) :+:
        getPackageFilter(da) :+:
        getQuery(da) :+:
        getTruststore(da) :+:
        getTruststoreInfo(da) :+:
        postAgent(da) :+:
        postAuthorizableKeystore(da) :+:
        postAuthorizables(da) :+:
        postConfigAdobeGraniteSamlAuthenticationHandler(da) :+:
        postConfigApacheFelixJettyBasedHttpService(da) :+:
        postConfigApacheHttpComponentsProxyConfiguration(da) :+:
        postConfigApacheSlingDavExServlet(da) :+:
        postConfigApacheSlingGetServlet(da) :+:
        postConfigApacheSlingReferrerFilter(da) :+:
        postConfigProperty(da) :+:
        postNode(da) :+:
        postNodeRw(da) :+:
        postPath(da) :+:
        postQuery(da) :+:
        postTreeActivation(da) :+:
        postTruststore(da) :+:
        postTruststorePKCS12(da)


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
        * @return An endpoint representing a Unit
        */
        private def deleteAgent(da: DataAccessor): Endpoint[Unit] =
        delete("etc" :: "replication" :: "agents.{runmode}" :: string) { (runmode: String, name: String) =>
          da.Sling_deleteAgent(runmode, name) match {
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
        private def deleteNode(da: DataAccessor): Endpoint[Unit] =
        delete(string :: string) { (path: String, name: String) =>
          da.Sling_deleteNode(path, name) match {
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
        private def getAgent(da: DataAccessor): Endpoint[Unit] =
        get("etc" :: "replication" :: "agents.{runmode}" :: string) { (runmode: String, name: String) =>
          da.Sling_getAgent(runmode, name) match {
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
        private def getAgents(da: DataAccessor): Endpoint[String] =
        get("etc" :: "replication" :: "agents.{runmode}.-1.json") { (runmode: String) =>
          da.Sling_getAgents(runmode) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a KeystoreInfo
        */
        private def getAuthorizableKeystore(da: DataAccessor): Endpoint[KeystoreInfo] =
        get(string :: "{authorizableId}.ks.json") { (intermediatePath: String, authorizableId: String) =>
          da.Sling_getAuthorizableKeystore(intermediatePath, authorizableId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a File
        */
        private def getKeystore(da: DataAccessor): Endpoint[File] =
        get(string :: string :: "keystore" :: "store.p12") { (intermediatePath: String, authorizableId: String) =>
          da.Sling_getKeystore(intermediatePath, authorizableId) match {
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
        private def getNode(da: DataAccessor): Endpoint[Unit] =
        get(string :: string) { (path: String, name: String) =>
          da.Sling_getNode(path, name) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a File
        */
        private def getPackage(da: DataAccessor): Endpoint[File] =
        get("etc" :: "packages" :: string :: "{name}-{version}.zip") { (group: String, name: String, version: String) =>
          da.Sling_getPackage(group, name, version) match {
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
        private def getPackageFilter(da: DataAccessor): Endpoint[String] =
        get("etc" :: "packages" :: string :: "{name}-{version}.zip" :: "jcr:content" :: "vlt:definition" :: "filter.tidy.2.json") { (group: String, name: String, version: String) =>
          da.Sling_getPackageFilter(group, name, version) match {
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
        private def getQuery(da: DataAccessor): Endpoint[String] =
        get("bin" :: "querybuilder.json" :: param("path") :: param("p.limit").map(_.toBigDecimal) :: param("1_property") :: param("1_property.value")) { (path: String, pPeriodlimit: BigDecimal, 1Property: String, 1PropertyPeriodvalue: String) =>
          da.Sling_getQuery(path, pPeriodlimit, 1Property, 1PropertyPeriodvalue) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a File
        */
        private def getTruststore(da: DataAccessor): Endpoint[File] =
        get("etc" :: "truststore" :: "truststore.p12") { () =>
          da.Sling_getTruststore() match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a TruststoreInfo
        */
        private def getTruststoreInfo(da: DataAccessor): Endpoint[TruststoreInfo] =
        get("libs" :: "granite" :: "security" :: "truststore.json") { () =>
          da.Sling_getTruststoreInfo() match {
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
        private def postAgent(da: DataAccessor): Endpoint[Unit] =
        post("etc" :: "replication" :: "agents.{runmode}" :: string :: paramOption("jcr:content/cq:distribute").map(_.map(_.toBoolean)) :: paramOption("jcr:content/cq:distribute@TypeHint") :: paramOption("jcr:content/cq:name") :: paramOption("jcr:content/cq:template") :: paramOption("jcr:content/enabled").map(_.map(_.toBoolean)) :: paramOption("jcr:content/jcr:description") :: paramOption("jcr:content/jcr:lastModified") :: paramOption("jcr:content/jcr:lastModifiedBy") :: paramOption("jcr:content/jcr:mixinTypes") :: paramOption("jcr:content/jcr:title") :: paramOption("jcr:content/logLevel") :: paramOption("jcr:content/noStatusUpdate").map(_.map(_.toBoolean)) :: paramOption("jcr:content/noVersioning").map(_.map(_.toBoolean)) :: paramOption("jcr:content/protocolConnectTimeout").map(_.map(_.toBigDecimal)) :: paramOption("jcr:content/protocolHTTPConnectionClosed").map(_.map(_.toBoolean)) :: paramOption("jcr:content/protocolHTTPExpired") :: params("jcr:content/protocolHTTPHeaders") :: paramOption("jcr:content/protocolHTTPHeaders@TypeHint") :: paramOption("jcr:content/protocolHTTPMethod") :: paramOption("jcr:content/protocolHTTPSRelaxed").map(_.map(_.toBoolean)) :: paramOption("jcr:content/protocolInterface") :: paramOption("jcr:content/protocolSocketTimeout").map(_.map(_.toBigDecimal)) :: paramOption("jcr:content/protocolVersion") :: paramOption("jcr:content/proxyNTLMDomain") :: paramOption("jcr:content/proxyNTLMHost") :: paramOption("jcr:content/proxyHost") :: paramOption("jcr:content/proxyPassword") :: paramOption("jcr:content/proxyPort").map(_.map(_.toBigDecimal)) :: paramOption("jcr:content/proxyUser") :: paramOption("jcr:content/queueBatchMaxSize").map(_.map(_.toBigDecimal)) :: paramOption("jcr:content/queueBatchMode") :: paramOption("jcr:content/queueBatchWaitTime").map(_.map(_.toBigDecimal)) :: paramOption("jcr:content/retryDelay") :: paramOption("jcr:content/reverseReplication").map(_.map(_.toBoolean)) :: paramOption("jcr:content/serializationType") :: paramOption("jcr:content/sling:resourceType") :: paramOption("jcr:content/ssl") :: paramOption("jcr:content/transportNTLMDomain") :: paramOption("jcr:content/transportNTLMHost") :: paramOption("jcr:content/transportPassword") :: paramOption("jcr:content/transportUri") :: paramOption("jcr:content/transportUser") :: paramOption("jcr:content/triggerDistribute").map(_.map(_.toBoolean)) :: paramOption("jcr:content/triggerModified").map(_.map(_.toBoolean)) :: paramOption("jcr:content/triggerOnOffTime").map(_.map(_.toBoolean)) :: paramOption("jcr:content/triggerReceive").map(_.map(_.toBoolean)) :: paramOption("jcr:content/triggerSpecific").map(_.map(_.toBoolean)) :: paramOption("jcr:content/userId") :: paramOption("jcr:primaryType") :: paramOption(":operation")) { (runmode: String, name: String, jcrContentSlashcqDistribute: Option[Boolean], jcrContentSlashcqDistributeAtTypeHint: Option[String], jcrContentSlashcqName: Option[String], jcrContentSlashcqTemplate: Option[String], jcrContentSlashenabled: Option[Boolean], jcrContentSlashjcrDescription: Option[String], jcrContentSlashjcrLastModified: Option[String], jcrContentSlashjcrLastModifiedBy: Option[String], jcrContentSlashjcrMixinTypes: Option[String], jcrContentSlashjcrTitle: Option[String], jcrContentSlashlogLevel: Option[String], jcrContentSlashnoStatusUpdate: Option[Boolean], jcrContentSlashnoVersioning: Option[Boolean], jcrContentSlashprotocolConnectTimeout: Option[BigDecimal], jcrContentSlashprotocolHTTPConnectionClosed: Option[Boolean], jcrContentSlashprotocolHTTPExpired: Option[String], jcrContentSlashprotocolHTTPHeaders: Seq[String], jcrContentSlashprotocolHTTPHeadersAtTypeHint: Option[String], jcrContentSlashprotocolHTTPMethod: Option[String], jcrContentSlashprotocolHTTPSRelaxed: Option[Boolean], jcrContentSlashprotocolInterface: Option[String], jcrContentSlashprotocolSocketTimeout: Option[BigDecimal], jcrContentSlashprotocolVersion: Option[String], jcrContentSlashproxyNTLMDomain: Option[String], jcrContentSlashproxyNTLMHost: Option[String], jcrContentSlashproxyHost: Option[String], jcrContentSlashproxyPassword: Option[String], jcrContentSlashproxyPort: Option[BigDecimal], jcrContentSlashproxyUser: Option[String], jcrContentSlashqueueBatchMaxSize: Option[BigDecimal], jcrContentSlashqueueBatchMode: Option[String], jcrContentSlashqueueBatchWaitTime: Option[BigDecimal], jcrContentSlashretryDelay: Option[String], jcrContentSlashreverseReplication: Option[Boolean], jcrContentSlashserializationType: Option[String], jcrContentSlashslingResourceType: Option[String], jcrContentSlashssl: Option[String], jcrContentSlashtransportNTLMDomain: Option[String], jcrContentSlashtransportNTLMHost: Option[String], jcrContentSlashtransportPassword: Option[String], jcrContentSlashtransportUri: Option[String], jcrContentSlashtransportUser: Option[String], jcrContentSlashtriggerDistribute: Option[Boolean], jcrContentSlashtriggerModified: Option[Boolean], jcrContentSlashtriggerOnOffTime: Option[Boolean], jcrContentSlashtriggerReceive: Option[Boolean], jcrContentSlashtriggerSpecific: Option[Boolean], jcrContentSlashuserId: Option[String], jcrPrimaryType: Option[String], operation: Option[String]) =>
          da.Sling_postAgent(runmode, name, jcrContentSlashcqDistribute, jcrContentSlashcqDistributeAtTypeHint, jcrContentSlashcqName, jcrContentSlashcqTemplate, jcrContentSlashenabled, jcrContentSlashjcrDescription, jcrContentSlashjcrLastModified, jcrContentSlashjcrLastModifiedBy, jcrContentSlashjcrMixinTypes, jcrContentSlashjcrTitle, jcrContentSlashlogLevel, jcrContentSlashnoStatusUpdate, jcrContentSlashnoVersioning, jcrContentSlashprotocolConnectTimeout, jcrContentSlashprotocolHTTPConnectionClosed, jcrContentSlashprotocolHTTPExpired, jcrContentSlashprotocolHTTPHeaders, jcrContentSlashprotocolHTTPHeadersAtTypeHint, jcrContentSlashprotocolHTTPMethod, jcrContentSlashprotocolHTTPSRelaxed, jcrContentSlashprotocolInterface, jcrContentSlashprotocolSocketTimeout, jcrContentSlashprotocolVersion, jcrContentSlashproxyNTLMDomain, jcrContentSlashproxyNTLMHost, jcrContentSlashproxyHost, jcrContentSlashproxyPassword, jcrContentSlashproxyPort, jcrContentSlashproxyUser, jcrContentSlashqueueBatchMaxSize, jcrContentSlashqueueBatchMode, jcrContentSlashqueueBatchWaitTime, jcrContentSlashretryDelay, jcrContentSlashreverseReplication, jcrContentSlashserializationType, jcrContentSlashslingResourceType, jcrContentSlashssl, jcrContentSlashtransportNTLMDomain, jcrContentSlashtransportNTLMHost, jcrContentSlashtransportPassword, jcrContentSlashtransportUri, jcrContentSlashtransportUser, jcrContentSlashtriggerDistribute, jcrContentSlashtriggerModified, jcrContentSlashtriggerOnOffTime, jcrContentSlashtriggerReceive, jcrContentSlashtriggerSpecific, jcrContentSlashuserId, jcrPrimaryType, operation) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a KeystoreInfo
        */
        private def postAuthorizableKeystore(da: DataAccessor): Endpoint[KeystoreInfo] =
        post(string :: "{authorizableId}.ks.html" :: paramOption(":operation") :: paramOption("currentPassword") :: paramOption("newPassword") :: paramOption("rePassword") :: paramOption("keyPassword") :: paramOption("keyStorePass") :: paramOption("alias") :: paramOption("newAlias") :: paramOption("removeAlias") :: fileUpload("certChain") :: fileUpload("pk") :: fileUpload("keyStore")) { (intermediatePath: String, authorizableId: String, operation: Option[String], currentPassword: Option[String], newPassword: Option[String], rePassword: Option[String], keyPassword: Option[String], keyStorePass: Option[String], alias: Option[String], newAlias: Option[String], removeAlias: Option[String], certChain: FileUpload, pk: FileUpload, keyStore: FileUpload) =>
          da.Sling_postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore) match {
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
        private def postAuthorizables(da: DataAccessor): Endpoint[String] =
        post("libs" :: "granite" :: "security" :: "post" :: "authorizables" :: param("authorizableId") :: param("intermediatePath") :: paramOption("createUser") :: paramOption("createGroup") :: paramOption("rep:password") :: paramOption("profile/givenName")) { (authorizableId: String, intermediatePath: String, createUser: Option[String], createGroup: Option[String], repPassword: Option[String], profileSlashgivenName: Option[String]) =>
          da.Sling_postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileSlashgivenName) match {
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
        private def postConfigAdobeGraniteSamlAuthenticationHandler(da: DataAccessor): Endpoint[Unit] =
        post("apps" :: "system" :: "config" :: "com.adobe.granite.auth.saml.SamlAuthenticationHandler.config" :: paramOption("keyStorePassword") :: paramOption("keyStorePassword@TypeHint") :: paramOption("service.ranking").map(_.map(_.toInt)) :: paramOption("service.ranking@TypeHint") :: paramOption("idpHttpRedirect").map(_.map(_.toBoolean)) :: paramOption("idpHttpRedirect@TypeHint") :: paramOption("createUser").map(_.map(_.toBoolean)) :: paramOption("createUser@TypeHint") :: paramOption("defaultRedirectUrl") :: paramOption("defaultRedirectUrl@TypeHint") :: paramOption("userIDAttribute") :: paramOption("userIDAttribute@TypeHint") :: params("defaultGroups") :: paramOption("defaultGroups@TypeHint") :: paramOption("idpCertAlias") :: paramOption("idpCertAlias@TypeHint") :: paramOption("addGroupMemberships").map(_.map(_.toBoolean)) :: paramOption("addGroupMemberships@TypeHint") :: params("path") :: paramOption("path@TypeHint") :: params("synchronizeAttributes") :: paramOption("synchronizeAttributes@TypeHint") :: paramOption("clockTolerance").map(_.map(_.toInt)) :: paramOption("clockTolerance@TypeHint") :: paramOption("groupMembershipAttribute") :: paramOption("groupMembershipAttribute@TypeHint") :: paramOption("idpUrl") :: paramOption("idpUrl@TypeHint") :: paramOption("logoutUrl") :: paramOption("logoutUrl@TypeHint") :: paramOption("serviceProviderEntityId") :: paramOption("serviceProviderEntityId@TypeHint") :: paramOption("assertionConsumerServiceURL") :: paramOption("assertionConsumerServiceURL@TypeHint") :: paramOption("handleLogout").map(_.map(_.toBoolean)) :: paramOption("handleLogout@TypeHint") :: paramOption("spPrivateKeyAlias") :: paramOption("spPrivateKeyAlias@TypeHint") :: paramOption("useEncryption").map(_.map(_.toBoolean)) :: paramOption("useEncryption@TypeHint") :: paramOption("nameIdFormat") :: paramOption("nameIdFormat@TypeHint") :: paramOption("digestMethod") :: paramOption("digestMethod@TypeHint") :: paramOption("signatureMethod") :: paramOption("signatureMethod@TypeHint") :: paramOption("userIntermediatePath") :: paramOption("userIntermediatePath@TypeHint")) { (keyStorePassword: Option[String], keyStorePasswordAtTypeHint: Option[String], servicePeriodranking: Option[Int], servicePeriodrankingAtTypeHint: Option[String], idpHttpRedirect: Option[Boolean], idpHttpRedirectAtTypeHint: Option[String], createUser: Option[Boolean], createUserAtTypeHint: Option[String], defaultRedirectUrl: Option[String], defaultRedirectUrlAtTypeHint: Option[String], userIDAttribute: Option[String], userIDAttributeAtTypeHint: Option[String], defaultGroups: Seq[String], defaultGroupsAtTypeHint: Option[String], idpCertAlias: Option[String], idpCertAliasAtTypeHint: Option[String], addGroupMemberships: Option[Boolean], addGroupMembershipsAtTypeHint: Option[String], path: Seq[String], pathAtTypeHint: Option[String], synchronizeAttributes: Seq[String], synchronizeAttributesAtTypeHint: Option[String], clockTolerance: Option[Int], clockToleranceAtTypeHint: Option[String], groupMembershipAttribute: Option[String], groupMembershipAttributeAtTypeHint: Option[String], idpUrl: Option[String], idpUrlAtTypeHint: Option[String], logoutUrl: Option[String], logoutUrlAtTypeHint: Option[String], serviceProviderEntityId: Option[String], serviceProviderEntityIdAtTypeHint: Option[String], assertionConsumerServiceURL: Option[String], assertionConsumerServiceURLAtTypeHint: Option[String], handleLogout: Option[Boolean], handleLogoutAtTypeHint: Option[String], spPrivateKeyAlias: Option[String], spPrivateKeyAliasAtTypeHint: Option[String], useEncryption: Option[Boolean], useEncryptionAtTypeHint: Option[String], nameIdFormat: Option[String], nameIdFormatAtTypeHint: Option[String], digestMethod: Option[String], digestMethodAtTypeHint: Option[String], signatureMethod: Option[String], signatureMethodAtTypeHint: Option[String], userIntermediatePath: Option[String], userIntermediatePathAtTypeHint: Option[String]) =>
          da.Sling_postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, servicePeriodranking, servicePeriodrankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint) match {
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
        private def postConfigApacheFelixJettyBasedHttpService(da: DataAccessor): Endpoint[Unit] =
        post("apps" :: "system" :: "config" :: "org.apache.felix.http" :: paramOption("org.apache.felix.https.nio").map(_.map(_.toBoolean)) :: paramOption("org.apache.felix.https.nio@TypeHint") :: paramOption("org.apache.felix.https.keystore") :: paramOption("org.apache.felix.https.keystore@TypeHint") :: paramOption("org.apache.felix.https.keystore.password") :: paramOption("org.apache.felix.https.keystore.password@TypeHint") :: paramOption("org.apache.felix.https.keystore.key") :: paramOption("org.apache.felix.https.keystore.key@TypeHint") :: paramOption("org.apache.felix.https.keystore.key.password") :: paramOption("org.apache.felix.https.keystore.key.password@TypeHint") :: paramOption("org.apache.felix.https.truststore") :: paramOption("org.apache.felix.https.truststore@TypeHint") :: paramOption("org.apache.felix.https.truststore.password") :: paramOption("org.apache.felix.https.truststore.password@TypeHint") :: paramOption("org.apache.felix.https.clientcertificate") :: paramOption("org.apache.felix.https.clientcertificate@TypeHint") :: paramOption("org.apache.felix.https.enable").map(_.map(_.toBoolean)) :: paramOption("org.apache.felix.https.enable@TypeHint") :: paramOption("org.osgi.service.http.port.secure") :: paramOption("org.osgi.service.http.port.secure@TypeHint")) { (orgPeriodapachePeriodfelixPeriodhttpsPeriodnio: Option[Boolean], orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodenable: Option[Boolean], orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint: Option[String], orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure: Option[String], orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint: Option[String]) =>
          da.Sling_postConfigApacheFelixJettyBasedHttpService(orgPeriodapachePeriodfelixPeriodhttpsPeriodnio, orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodenable, orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint) match {
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
        private def postConfigApacheHttpComponentsProxyConfiguration(da: DataAccessor): Endpoint[Unit] =
        post("apps" :: "system" :: "config" :: "org.apache.http.proxyconfigurator.config" :: paramOption("proxy.host") :: paramOption("proxy.host@TypeHint") :: paramOption("proxy.port").map(_.map(_.toInt)) :: paramOption("proxy.port@TypeHint") :: params("proxy.exceptions") :: paramOption("proxy.exceptions@TypeHint") :: paramOption("proxy.enabled").map(_.map(_.toBoolean)) :: paramOption("proxy.enabled@TypeHint") :: paramOption("proxy.user") :: paramOption("proxy.user@TypeHint") :: paramOption("proxy.password") :: paramOption("proxy.password@TypeHint")) { (proxyPeriodhost: Option[String], proxyPeriodhostAtTypeHint: Option[String], proxyPeriodport: Option[Int], proxyPeriodportAtTypeHint: Option[String], proxyPeriodexceptions: Seq[String], proxyPeriodexceptionsAtTypeHint: Option[String], proxyPeriodenabled: Option[Boolean], proxyPeriodenabledAtTypeHint: Option[String], proxyPerioduser: Option[String], proxyPerioduserAtTypeHint: Option[String], proxyPeriodpassword: Option[String], proxyPeriodpasswordAtTypeHint: Option[String]) =>
          da.Sling_postConfigApacheHttpComponentsProxyConfiguration(proxyPeriodhost, proxyPeriodhostAtTypeHint, proxyPeriodport, proxyPeriodportAtTypeHint, proxyPeriodexceptions, proxyPeriodexceptionsAtTypeHint, proxyPeriodenabled, proxyPeriodenabledAtTypeHint, proxyPerioduser, proxyPerioduserAtTypeHint, proxyPeriodpassword, proxyPeriodpasswordAtTypeHint) match {
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
        private def postConfigApacheSlingDavExServlet(da: DataAccessor): Endpoint[Unit] =
        post("apps" :: "system" :: "config" :: "org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet" :: paramOption("alias") :: paramOption("alias@TypeHint") :: paramOption("dav.create-absolute-uri").map(_.map(_.toBoolean)) :: paramOption("dav.create-absolute-uri@TypeHint")) { (alias: Option[String], aliasAtTypeHint: Option[String], davPeriodcreateAbsoluteUri: Option[Boolean], davPeriodcreateAbsoluteUriAtTypeHint: Option[String]) =>
          da.Sling_postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davPeriodcreateAbsoluteUri, davPeriodcreateAbsoluteUriAtTypeHint) match {
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
        private def postConfigApacheSlingGetServlet(da: DataAccessor): Endpoint[Unit] =
        post("apps" :: "system" :: "config" :: "org.apache.sling.servlets.get.DefaultGetServlet" :: paramOption("json.maximumresults") :: paramOption("json.maximumresults@TypeHint") :: paramOption("enable.html").map(_.map(_.toBoolean)) :: paramOption("enable.html@TypeHint") :: paramOption("enable.txt").map(_.map(_.toBoolean)) :: paramOption("enable.txt@TypeHint") :: paramOption("enable.xml").map(_.map(_.toBoolean)) :: paramOption("enable.xml@TypeHint")) { (jsonPeriodmaximumresults: Option[String], jsonPeriodmaximumresultsAtTypeHint: Option[String], enablePeriodhtml: Option[Boolean], enablePeriodhtmlAtTypeHint: Option[String], enablePeriodtxt: Option[Boolean], enablePeriodtxtAtTypeHint: Option[String], enablePeriodxml: Option[Boolean], enablePeriodxmlAtTypeHint: Option[String]) =>
          da.Sling_postConfigApacheSlingGetServlet(jsonPeriodmaximumresults, jsonPeriodmaximumresultsAtTypeHint, enablePeriodhtml, enablePeriodhtmlAtTypeHint, enablePeriodtxt, enablePeriodtxtAtTypeHint, enablePeriodxml, enablePeriodxmlAtTypeHint) match {
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
        private def postConfigApacheSlingReferrerFilter(da: DataAccessor): Endpoint[Unit] =
        post("apps" :: "system" :: "config" :: "org.apache.sling.security.impl.ReferrerFilter" :: paramOption("allow.empty").map(_.map(_.toBoolean)) :: paramOption("allow.empty@TypeHint") :: paramOption("allow.hosts") :: paramOption("allow.hosts@TypeHint") :: paramOption("allow.hosts.regexp") :: paramOption("allow.hosts.regexp@TypeHint") :: paramOption("filter.methods") :: paramOption("filter.methods@TypeHint")) { (allowPeriodempty: Option[Boolean], allowPeriodemptyAtTypeHint: Option[String], allowPeriodhosts: Option[String], allowPeriodhostsAtTypeHint: Option[String], allowPeriodhostsPeriodregexp: Option[String], allowPeriodhostsPeriodregexpAtTypeHint: Option[String], filterPeriodmethods: Option[String], filterPeriodmethodsAtTypeHint: Option[String]) =>
          da.Sling_postConfigApacheSlingReferrerFilter(allowPeriodempty, allowPeriodemptyAtTypeHint, allowPeriodhosts, allowPeriodhostsAtTypeHint, allowPeriodhostsPeriodregexp, allowPeriodhostsPeriodregexpAtTypeHint, filterPeriodmethods, filterPeriodmethodsAtTypeHint) match {
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
        private def postConfigProperty(da: DataAccessor): Endpoint[Unit] =
        post("apps" :: "system" :: "config" :: string) { (configNodeName: String) =>
          da.Sling_postConfigProperty(configNodeName) match {
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
        private def postNode(da: DataAccessor): Endpoint[Unit] =
        post(string :: string :: paramOption(":operation") :: paramOption("deleteAuthorizable") :: fileUpload("file")) { (path: String, name: String, operation: Option[String], deleteAuthorizable: Option[String], file: FileUpload) =>
          da.Sling_postNode(path, name, operation, deleteAuthorizable, file) match {
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
        private def postNodeRw(da: DataAccessor): Endpoint[Unit] =
        post(string :: "{name}.rw.html" :: paramOption("addMembers")) { (path: String, name: String, addMembers: Option[String]) =>
          da.Sling_postNodeRw(path, name, addMembers) match {
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
        private def postPath(da: DataAccessor): Endpoint[Unit] =
        post(string :: param("jcr:primaryType") :: param(":name")) { (path: String, jcrPrimaryType: String, name: String) =>
          da.Sling_postPath(path, jcrPrimaryType, name) match {
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
        private def postQuery(da: DataAccessor): Endpoint[String] =
        post("bin" :: "querybuilder.json" :: param("path") :: param("p.limit").map(_.toBigDecimal) :: param("1_property") :: param("1_property.value")) { (path: String, pPeriodlimit: BigDecimal, 1Property: String, 1PropertyPeriodvalue: String) =>
          da.Sling_postQuery(path, pPeriodlimit, 1Property, 1PropertyPeriodvalue) match {
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
        private def postTreeActivation(da: DataAccessor): Endpoint[Unit] =
        post("etc" :: "replication" :: "treeactivation.html" :: param("ignoredeactivated").map(_.toBoolean) :: param("onlymodified").map(_.toBoolean) :: param("path")) { (ignoredeactivated: Boolean, onlymodified: Boolean, path: String) =>
          da.Sling_postTreeActivation(ignoredeactivated, onlymodified, path) match {
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
        private def postTruststore(da: DataAccessor): Endpoint[String] =
        post("libs" :: "granite" :: "security" :: "post" :: "truststore" :: paramOption(":operation") :: paramOption("newPassword") :: paramOption("rePassword") :: paramOption("keyStoreType") :: paramOption("removeAlias") :: fileUpload("certificate")) { (operation: Option[String], newPassword: Option[String], rePassword: Option[String], keyStoreType: Option[String], removeAlias: Option[String], certificate: FileUpload) =>
          da.Sling_postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate) match {
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
        private def postTruststorePKCS12(da: DataAccessor): Endpoint[String] =
        post("etc" :: "truststore" :: fileUpload("truststorePeriodp12")) { (truststorePeriodp12: FileUpload) =>
          da.Sling_postTruststorePKCS12(truststorePeriodp12) match {
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
      val file = Files.createTempFile("tmpSlingApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}

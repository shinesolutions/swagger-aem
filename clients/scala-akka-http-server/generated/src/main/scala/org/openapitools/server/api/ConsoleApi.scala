package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.BundleInfo
import org.openapitools.server.model.SamlConfigurationInfo


class ConsoleApi(
    consoleService: ConsoleApiService,
    consoleMarshaller: ConsoleApiMarshaller
) {

  
  import consoleMarshaller._

  lazy val route: Route =
    path("system" / "console" / "status-productinfo.json") { 
      get {  
            consoleService.getAemProductInfo()
      }
    } ~
    path("system" / "console" / "bundles" / "{name}.json") { (name) => 
      get {  
            consoleService.getBundleInfo(name = name)
      }
    } ~
    path("system" / "console" / "configMgr") { 
      get {  
            consoleService.getConfigMgr()
      }
    } ~
    path("system" / "console" / "bundles" / Segment) { (name) => 
      post { 
        parameters("action".as[String]) { (action) => 
            consoleService.postBundle(name = name, action = action)
        }
      }
    } ~
    path("system" / "console" / "jmx" / "com.adobe.granite:type&#x3D;Repository" / "op" / Segment) { (action) => 
      post {  
            consoleService.postJmxRepository(action = action)
      }
    } ~
    path("system" / "console" / "configMgr" / "com.adobe.granite.auth.saml.SamlAuthenticationHandler") { 
      post { 
        parameters("post".as[Boolean].?, "apply".as[Boolean].?, "delete".as[Boolean].?, "action".as[String].?, "$location".as[String].?, "path".as[String].?, "service.ranking".as[Int].?, "idpUrl".as[String].?, "idpCertAlias".as[String].?, "idpHttpRedirect".as[Boolean].?, "serviceProviderEntityId".as[String].?, "assertionConsumerServiceURL".as[String].?, "spPrivateKeyAlias".as[String].?, "keyStorePassword".as[String].?, "defaultRedirectUrl".as[String].?, "userIDAttribute".as[String].?, "useEncryption".as[Boolean].?, "createUser".as[Boolean].?, "addGroupMemberships".as[Boolean].?, "groupMembershipAttribute".as[String].?, "defaultGroups".as[String].?, "nameIdFormat".as[String].?, "synchronizeAttributes".as[String].?, "handleLogout".as[Boolean].?, "logoutUrl".as[String].?, "clockTolerance".as[Int].?, "digestMethod".as[String].?, "signatureMethod".as[String].?, "userIntermediatePath".as[String].?, "propertylist".as[String].?) { (post, apply, delete, action, Dollarlocation, path, servicePeriodranking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist) => 
            consoleService.postSamlConfiguration(post = post, apply = apply, delete = delete, action = action, Dollarlocation = Dollarlocation, path = path, servicePeriodranking = servicePeriodranking, idpUrl = idpUrl, idpCertAlias = idpCertAlias, idpHttpRedirect = idpHttpRedirect, serviceProviderEntityId = serviceProviderEntityId, assertionConsumerServiceURL = assertionConsumerServiceURL, spPrivateKeyAlias = spPrivateKeyAlias, keyStorePassword = keyStorePassword, defaultRedirectUrl = defaultRedirectUrl, userIDAttribute = userIDAttribute, useEncryption = useEncryption, createUser = createUser, addGroupMemberships = addGroupMemberships, groupMembershipAttribute = groupMembershipAttribute, defaultGroups = defaultGroups, nameIdFormat = nameIdFormat, synchronizeAttributes = synchronizeAttributes, handleLogout = handleLogout, logoutUrl = logoutUrl, clockTolerance = clockTolerance, digestMethod = digestMethod, signatureMethod = signatureMethod, userIntermediatePath = userIntermediatePath, propertylist = propertylist)
        }
      }
    }
}


trait ConsoleApiService {

  def getAemProductInfoDefault(statusCode: Int, responseStringarray: Seq[String])(implicit toEntityMarshallerStringarray: ToEntityMarshaller[Seq[String]]): Route =
    complete((statusCode, responseStringarray))
  /**
   * Code: 0, Message: Default response, DataType: Seq[String]
   */
  def getAemProductInfo(): Route

  def getBundleInfo200(responseBundleInfo: BundleInfo)(implicit toEntityMarshallerBundleInfo: ToEntityMarshaller[BundleInfo]): Route =
    complete((200, responseBundleInfo))
  def getBundleInfoDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 200, Message: Retrieved bundle info, DataType: BundleInfo
   * Code: 0, Message: Default response, DataType: String
   */
  def getBundleInfo(name: String)
      (implicit toEntityMarshallerBundleInfo: ToEntityMarshaller[BundleInfo]): Route

  def getConfigMgr200(responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((200, responseString))
  def getConfigMgr5XX: Route =
    complete((5XX, "Unexpected error."))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 5XX, Message: Unexpected error.
   */
  def getConfigMgr(): Route

  def postBundleDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postBundle(name: String, action: String): Route

  def postJmxRepositoryDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postJmxRepository(action: String): Route

  def postSamlConfiguration200(responseSamlConfigurationInfo: SamlConfigurationInfo)(implicit toEntityMarshallerSamlConfigurationInfo: ToEntityMarshaller[SamlConfigurationInfo]): Route =
    complete((200, responseSamlConfigurationInfo))
  def postSamlConfiguration302(responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((302, responseString))
  def postSamlConfigurationDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 200, Message: Retrieved AEM SAML Configuration, DataType: SamlConfigurationInfo
   * Code: 302, Message: Default response, DataType: String
   * Code: 0, Message: Default response, DataType: String
   */
  def postSamlConfiguration(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], path: Option[String], servicePeriodranking: Option[Int], idpUrl: Option[String], idpCertAlias: Option[String], idpHttpRedirect: Option[Boolean], serviceProviderEntityId: Option[String], assertionConsumerServiceURL: Option[String], spPrivateKeyAlias: Option[String], keyStorePassword: Option[String], defaultRedirectUrl: Option[String], userIDAttribute: Option[String], useEncryption: Option[Boolean], createUser: Option[Boolean], addGroupMemberships: Option[Boolean], groupMembershipAttribute: Option[String], defaultGroups: Option[String], nameIdFormat: Option[String], synchronizeAttributes: Option[String], handleLogout: Option[Boolean], logoutUrl: Option[String], clockTolerance: Option[Int], digestMethod: Option[String], signatureMethod: Option[String], userIntermediatePath: Option[String], propertylist: Option[String])
      (implicit toEntityMarshallerSamlConfigurationInfo: ToEntityMarshaller[SamlConfigurationInfo]): Route

}

trait ConsoleApiMarshaller {


  implicit def toEntityMarshallerBundleInfo: ToEntityMarshaller[BundleInfo]

  implicit def toEntityMarshallerSamlConfigurationInfo: ToEntityMarshaller[SamlConfigurationInfo]

}


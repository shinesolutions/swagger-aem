package api

import play.api.libs.json._
import model.BundleInfo
import model.SamlConfigurationInfo

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait ConsoleApi {
  /**
    */
  def getAemProductInfo(): List[String]

  /**
    */
  def getBundleInfo(name: String): BundleInfo

  /**
    */
  def getConfigMgr(): String

  /**
    */
  def postBundle(name: String, action: String): Unit

  /**
    */
  def postJmxRepository(action: String): Unit

  /**
    */
  def postSamlConfiguration(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], path: Option[List[String]], servicePeriodranking: Option[Int], idpUrl: Option[String], idpCertAlias: Option[String], idpHttpRedirect: Option[Boolean], serviceProviderEntityId: Option[String], assertionConsumerServiceURL: Option[String], spPrivateKeyAlias: Option[String], keyStorePassword: Option[String], defaultRedirectUrl: Option[String], userIDAttribute: Option[String], useEncryption: Option[Boolean], createUser: Option[Boolean], addGroupMemberships: Option[Boolean], groupMembershipAttribute: Option[String], defaultGroups: Option[List[String]], nameIdFormat: Option[String], synchronizeAttributes: Option[List[String]], handleLogout: Option[Boolean], logoutUrl: Option[String], clockTolerance: Option[Int], digestMethod: Option[String], signatureMethod: Option[String], userIntermediatePath: Option[String], propertylist: Option[List[String]]): SamlConfigurationInfo
}

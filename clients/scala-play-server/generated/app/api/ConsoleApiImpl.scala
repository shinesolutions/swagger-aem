package api

import model.BundleInfo
import model.SamlConfigurationInfo

/**
  * Provides a default implementation for [[ConsoleApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class ConsoleApiImpl extends ConsoleApi {
  /**
    * @inheritdoc
    */
  override def getAemProductInfo(): List[String] = {
    // TODO: Implement better logic

    List.empty[String]
  }

  /**
    * @inheritdoc
    */
  override def getBundleInfo(name: String): BundleInfo = {
    // TODO: Implement better logic

    BundleInfo(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getConfigMgr(): String = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def postBundle(name: String, action: String): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def postJmxRepository(action: String): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def postSamlConfiguration(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], path: Option[List[String]], servicePeriodranking: Option[Int], idpUrl: Option[String], idpCertAlias: Option[String], idpHttpRedirect: Option[Boolean], serviceProviderEntityId: Option[String], assertionConsumerServiceURL: Option[String], spPrivateKeyAlias: Option[String], keyStorePassword: Option[String], defaultRedirectUrl: Option[String], userIDAttribute: Option[String], useEncryption: Option[Boolean], createUser: Option[Boolean], addGroupMemberships: Option[Boolean], groupMembershipAttribute: Option[String], defaultGroups: Option[List[String]], nameIdFormat: Option[String], synchronizeAttributes: Option[List[String]], handleLogout: Option[Boolean], logoutUrl: Option[String], clockTolerance: Option[Int], digestMethod: Option[String], signatureMethod: Option[String], userIntermediatePath: Option[String], propertylist: Option[List[String]]): SamlConfigurationInfo = {
    // TODO: Implement better logic

    SamlConfigurationInfo(None, None, None, None, None, None)
  }
}

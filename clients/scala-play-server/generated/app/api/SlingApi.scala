package api

import play.api.libs.json._
import model.BigDecimal
import model.KeystoreInfo
import play.api.libs.Files.TemporaryFile
import model.TruststoreInfo

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait SlingApi {
  /**
    */
  def deleteAgent(runmode: String, name: String): Unit

  /**
    */
  def deleteNode(path: String, name: String): Unit

  /**
    */
  def getAgent(runmode: String, name: String): Unit

  /**
    */
  def getAgents(runmode: String): String

  /**
    */
  def getAuthorizableKeystore(intermediatePath: String, authorizableId: String): KeystoreInfo

  /**
    */
  def getKeystore(intermediatePath: String, authorizableId: String): TemporaryFile

  /**
    */
  def getNode(path: String, name: String): Unit

  /**
    */
  def getPackage(group: String, name: String, version: String): TemporaryFile

  /**
    */
  def getPackageFilter(group: String, name: String, version: String): String

  /**
    */
  def getQuery(path: String, pPeriodlimit: BigDecimal, 1Property: String, 1PropertyPeriodvalue: String): String

  /**
    */
  def getTruststore(): TemporaryFile

  /**
    */
  def getTruststoreInfo(): TruststoreInfo

  /**
    */
  def postAgent(runmode: String, name: String, jcrContentSlashcqDistribute: Option[Boolean], jcrContentSlashcqDistributeAtTypeHint: Option[String], jcrContentSlashcqName: Option[String], jcrContentSlashcqTemplate: Option[String], jcrContentSlashaliasUpdate: Option[Boolean], jcrContentSlashenabled: Option[Boolean], jcrContentSlashjcrDescription: Option[String], jcrContentSlashjcrLastModified: Option[String], jcrContentSlashjcrLastModifiedBy: Option[String], jcrContentSlashjcrMixinTypes: Option[String], jcrContentSlashjcrTitle: Option[String], jcrContentSlashlogLevel: Option[String], jcrContentSlashnoStatusUpdate: Option[Boolean], jcrContentSlashnoVersioning: Option[Boolean], jcrContentSlashprotocolConnectTimeout: Option[BigDecimal], jcrContentSlashprotocolHTTPConnectionClosed: Option[Boolean], jcrContentSlashprotocolHTTPExpired: Option[String], jcrContentSlashprotocolHTTPHeaders: Option[List[String]], jcrContentSlashprotocolHTTPHeadersAtTypeHint: Option[String], jcrContentSlashprotocolHTTPMethod: Option[String], jcrContentSlashprotocolHTTPSRelaxed: Option[Boolean], jcrContentSlashprotocolInterface: Option[String], jcrContentSlashprotocolSocketTimeout: Option[BigDecimal], jcrContentSlashprotocolVersion: Option[String], jcrContentSlashproxyNTLMDomain: Option[String], jcrContentSlashproxyNTLMHost: Option[String], jcrContentSlashproxyHost: Option[String], jcrContentSlashproxyPassword: Option[String], jcrContentSlashproxyPort: Option[BigDecimal], jcrContentSlashproxyUser: Option[String], jcrContentSlashqueueBatchMaxSize: Option[BigDecimal], jcrContentSlashqueueBatchMode: Option[String], jcrContentSlashqueueBatchWaitTime: Option[BigDecimal], jcrContentSlashretryDelay: Option[String], jcrContentSlashreverseReplication: Option[Boolean], jcrContentSlashserializationType: Option[String], jcrContentSlashslingResourceType: Option[String], jcrContentSlashssl: Option[String], jcrContentSlashtransportNTLMDomain: Option[String], jcrContentSlashtransportNTLMHost: Option[String], jcrContentSlashtransportPassword: Option[String], jcrContentSlashtransportUri: Option[String], jcrContentSlashtransportUser: Option[String], jcrContentSlashtriggerDistribute: Option[Boolean], jcrContentSlashtriggerModified: Option[Boolean], jcrContentSlashtriggerOnOffTime: Option[Boolean], jcrContentSlashtriggerReceive: Option[Boolean], jcrContentSlashtriggerSpecific: Option[Boolean], jcrContentSlashuserId: Option[String], jcrPrimaryType: Option[String], operation: Option[String]): Unit

  /**
    */
  def postAuthorizableKeystore(intermediatePath: String, authorizableId: String, operation: Option[String], currentPassword: Option[String], newPassword: Option[String], rePassword: Option[String], keyPassword: Option[String], keyStorePass: Option[String], alias: Option[String], newAlias: Option[String], removeAlias: Option[String], certChain: Option[TemporaryFile], pk: Option[TemporaryFile], keyStore: Option[TemporaryFile]): KeystoreInfo

  /**
    */
  def postAuthorizables(authorizableId: String, intermediatePath: String, createUser: Option[String], createGroup: Option[String], repPassword: Option[String], profileSlashgivenName: Option[String]): String

  /**
    */
  def postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword: Option[String], keyStorePasswordAtTypeHint: Option[String], servicePeriodranking: Option[Int], servicePeriodrankingAtTypeHint: Option[String], idpHttpRedirect: Option[Boolean], idpHttpRedirectAtTypeHint: Option[String], createUser: Option[Boolean], createUserAtTypeHint: Option[String], defaultRedirectUrl: Option[String], defaultRedirectUrlAtTypeHint: Option[String], userIDAttribute: Option[String], userIDAttributeAtTypeHint: Option[String], defaultGroups: Option[List[String]], defaultGroupsAtTypeHint: Option[String], idpCertAlias: Option[String], idpCertAliasAtTypeHint: Option[String], addGroupMemberships: Option[Boolean], addGroupMembershipsAtTypeHint: Option[String], path: Option[List[String]], pathAtTypeHint: Option[String], synchronizeAttributes: Option[List[String]], synchronizeAttributesAtTypeHint: Option[String], clockTolerance: Option[Int], clockToleranceAtTypeHint: Option[String], groupMembershipAttribute: Option[String], groupMembershipAttributeAtTypeHint: Option[String], idpUrl: Option[String], idpUrlAtTypeHint: Option[String], logoutUrl: Option[String], logoutUrlAtTypeHint: Option[String], serviceProviderEntityId: Option[String], serviceProviderEntityIdAtTypeHint: Option[String], assertionConsumerServiceURL: Option[String], assertionConsumerServiceURLAtTypeHint: Option[String], handleLogout: Option[Boolean], handleLogoutAtTypeHint: Option[String], spPrivateKeyAlias: Option[String], spPrivateKeyAliasAtTypeHint: Option[String], useEncryption: Option[Boolean], useEncryptionAtTypeHint: Option[String], nameIdFormat: Option[String], nameIdFormatAtTypeHint: Option[String], digestMethod: Option[String], digestMethodAtTypeHint: Option[String], signatureMethod: Option[String], signatureMethodAtTypeHint: Option[String], userIntermediatePath: Option[String], userIntermediatePathAtTypeHint: Option[String]): Unit

  /**
    */
  def postConfigApacheFelixJettyBasedHttpService(orgPeriodapachePeriodfelixPeriodhttpsPeriodnio: Option[Boolean], orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodenable: Option[Boolean], orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint: Option[String], orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure: Option[String], orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint: Option[String]): Unit

  /**
    */
  def postConfigApacheHttpComponentsProxyConfiguration(proxyPeriodhost: Option[String], proxyPeriodhostAtTypeHint: Option[String], proxyPeriodport: Option[Int], proxyPeriodportAtTypeHint: Option[String], proxyPeriodexceptions: Option[List[String]], proxyPeriodexceptionsAtTypeHint: Option[String], proxyPeriodenabled: Option[Boolean], proxyPeriodenabledAtTypeHint: Option[String], proxyPerioduser: Option[String], proxyPerioduserAtTypeHint: Option[String], proxyPeriodpassword: Option[String], proxyPeriodpasswordAtTypeHint: Option[String]): Unit

  /**
    */
  def postConfigApacheSlingDavExServlet(alias: Option[String], aliasAtTypeHint: Option[String], davPeriodcreateAbsoluteUri: Option[Boolean], davPeriodcreateAbsoluteUriAtTypeHint: Option[String]): Unit

  /**
    */
  def postConfigApacheSlingGetServlet(jsonPeriodmaximumresults: Option[String], jsonPeriodmaximumresultsAtTypeHint: Option[String], enablePeriodhtml: Option[Boolean], enablePeriodhtmlAtTypeHint: Option[String], enablePeriodtxt: Option[Boolean], enablePeriodtxtAtTypeHint: Option[String], enablePeriodxml: Option[Boolean], enablePeriodxmlAtTypeHint: Option[String]): Unit

  /**
    */
  def postConfigApacheSlingReferrerFilter(allowPeriodempty: Option[Boolean], allowPeriodemptyAtTypeHint: Option[String], allowPeriodhosts: Option[String], allowPeriodhostsAtTypeHint: Option[String], allowPeriodhostsPeriodregexp: Option[String], allowPeriodhostsPeriodregexpAtTypeHint: Option[String], filterPeriodmethods: Option[String], filterPeriodmethodsAtTypeHint: Option[String]): Unit

  /**
    */
  def postConfigProperty(configNodeName: String): Unit

  /**
    */
  def postNode(path: String, name: String, operation: Option[String], deleteAuthorizable: Option[String], file: Option[TemporaryFile]): Unit

  /**
    */
  def postNodeRw(path: String, name: String, addMembers: Option[String]): Unit

  /**
    */
  def postPath(path: String, jcrPrimaryType: String, name: String): Unit

  /**
    */
  def postQuery(path: String, pPeriodlimit: BigDecimal, 1Property: String, 1PropertyPeriodvalue: String): String

  /**
    */
  def postTreeActivation(ignoredeactivated: Boolean, onlymodified: Boolean, path: String, cmd: String): Unit

  /**
    */
  def postTruststore(operation: Option[String], newPassword: Option[String], rePassword: Option[String], keyStoreType: Option[String], removeAlias: Option[String], certificate: Option[TemporaryFile]): String

  /**
    */
  def postTruststorePKCS12(truststorePeriodp12: Option[TemporaryFile]): String
}

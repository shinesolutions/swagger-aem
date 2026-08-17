package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.KeystoreInfo
import play.api.libs.Files.TemporaryFile
import model.TruststoreInfo

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class SlingApiController @Inject()(cc: ControllerComponents, api: SlingApi) extends AbstractController(cc) {
  /**
    * DELETE /etc/replication/agents.:runmode/:name
    */
  def deleteAgent(runmode: String, name: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.deleteAgent(runmode, name)
    }

    executeApi()
    Ok
  }

  /**
    * DELETE /:path/:name
    */
  def deleteNode(path: String, name: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.deleteNode(path, name)
    }

    executeApi()
    Ok
  }

  /**
    * GET /etc/replication/agents.:runmode/:name
    */
  def getAgent(runmode: String, name: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.getAgent(runmode, name)
    }

    executeApi()
    Ok
  }

  /**
    * GET /etc/replication/agents.:runmode.-1.json
    */
  def getAgents(runmode: String): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      api.getAgents(runmode)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /:intermediatePath/:authorizableId.ks.json
    */
  def getAuthorizableKeystore(intermediatePath: String, authorizableId: String): Action[AnyContent] = Action { request =>
    def executeApi(): KeystoreInfo = {
      api.getAuthorizableKeystore(intermediatePath, authorizableId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /:intermediatePath/:authorizableId/keystore/store.p12
    */
  def getKeystore(intermediatePath: String, authorizableId: String): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      api.getKeystore(intermediatePath, authorizableId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /:path/:name
    */
  def getNode(path: String, name: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.getNode(path, name)
    }

    executeApi()
    Ok
  }

  /**
    * GET /etc/packages/:group/:name-:version.zip
    */
  def getPackage(group: String, name: String, version: String): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      api.getPackage(group, name, version)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /etc/packages/:group/:name-:version.zip/jcr:content/vlt:definition/filter.tidy.2.json
    */
  def getPackageFilter(group: String, name: String, version: String): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      api.getPackageFilter(group, name, version)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /bin/querybuilder.json?path=[value]&pPeriodlimit=[value]&1Property=[value]&1PropertyPeriodvalue=[value]
    */
  def getQuery(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val path = request.getQueryString("path")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("path", "query string")
        }
        
      val pPeriodlimit = request.getQueryString("p.limit")
        .map(value => BigDecimal(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("p.limit", "query string")
        }
        
      val 1Property = request.getQueryString("1_property")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("1_property", "query string")
        }
        
      val 1PropertyPeriodvalue = request.getQueryString("1_property.value")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("1_property.value", "query string")
        }
        
      api.getQuery(path, pPeriodlimit, 1Property, 1PropertyPeriodvalue)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /etc/truststore/truststore.p12
    */
  def getTruststore(): Action[AnyContent] = Action { request =>
    def executeApi(): TemporaryFile = {
      api.getTruststore()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /libs/granite/security/truststore.json
    */
  def getTruststoreInfo(): Action[AnyContent] = Action { request =>
    def executeApi(): TruststoreInfo = {
      api.getTruststoreInfo()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /etc/replication/agents.:runmode/:name?jcrContentSlashcqDistribute=[value]&jcrContentSlashcqDistributeAtTypeHint=[value]&jcrContentSlashcqName=[value]&jcrContentSlashcqTemplate=[value]&jcrContentSlashaliasUpdate=[value]&jcrContentSlashenabled=[value]&jcrContentSlashjcrDescription=[value]&jcrContentSlashjcrLastModified=[value]&jcrContentSlashjcrLastModifiedBy=[value]&jcrContentSlashjcrMixinTypes=[value]&jcrContentSlashjcrTitle=[value]&jcrContentSlashlogLevel=[value]&jcrContentSlashnoStatusUpdate=[value]&jcrContentSlashnoVersioning=[value]&jcrContentSlashprotocolConnectTimeout=[value]&jcrContentSlashprotocolHTTPConnectionClosed=[value]&jcrContentSlashprotocolHTTPExpired=[value]&jcrContentSlashprotocolHTTPHeaders=[value]&jcrContentSlashprotocolHTTPHeadersAtTypeHint=[value]&jcrContentSlashprotocolHTTPMethod=[value]&jcrContentSlashprotocolHTTPSRelaxed=[value]&jcrContentSlashprotocolInterface=[value]&jcrContentSlashprotocolSocketTimeout=[value]&jcrContentSlashprotocolVersion=[value]&jcrContentSlashproxyNTLMDomain=[value]&jcrContentSlashproxyNTLMHost=[value]&jcrContentSlashproxyHost=[value]&jcrContentSlashproxyPassword=[value]&jcrContentSlashproxyPort=[value]&jcrContentSlashproxyUser=[value]&jcrContentSlashqueueBatchMaxSize=[value]&jcrContentSlashqueueBatchMode=[value]&jcrContentSlashqueueBatchWaitTime=[value]&jcrContentSlashretryDelay=[value]&jcrContentSlashreverseReplication=[value]&jcrContentSlashserializationType=[value]&jcrContentSlashslingResourceType=[value]&jcrContentSlashssl=[value]&jcrContentSlashtransportNTLMDomain=[value]&jcrContentSlashtransportNTLMHost=[value]&jcrContentSlashtransportPassword=[value]&jcrContentSlashtransportUri=[value]&jcrContentSlashtransportUser=[value]&jcrContentSlashtriggerDistribute=[value]&jcrContentSlashtriggerModified=[value]&jcrContentSlashtriggerOnOffTime=[value]&jcrContentSlashtriggerReceive=[value]&jcrContentSlashtriggerSpecific=[value]&jcrContentSlashuserId=[value]&jcrPrimaryType=[value]&operation=[value]
    */
  def postAgent(runmode: String, name: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val jcrContentSlashcqDistribute = request.getQueryString("jcr:content/cq:distribute")
        .map(value => value.toBoolean)
        
      val jcrContentSlashcqDistributeAtTypeHint = request.getQueryString("jcr:content/cq:distribute@TypeHint")
        
      val jcrContentSlashcqName = request.getQueryString("jcr:content/cq:name")
        
      val jcrContentSlashcqTemplate = request.getQueryString("jcr:content/cq:template")
        
      val jcrContentSlashaliasUpdate = request.getQueryString("jcr:content/aliasUpdate")
        .map(value => value.toBoolean)
        
      val jcrContentSlashenabled = request.getQueryString("jcr:content/enabled")
        .map(value => value.toBoolean)
        
      val jcrContentSlashjcrDescription = request.getQueryString("jcr:content/jcr:description")
        
      val jcrContentSlashjcrLastModified = request.getQueryString("jcr:content/jcr:lastModified")
        
      val jcrContentSlashjcrLastModifiedBy = request.getQueryString("jcr:content/jcr:lastModifiedBy")
        
      val jcrContentSlashjcrMixinTypes = request.getQueryString("jcr:content/jcr:mixinTypes")
        
      val jcrContentSlashjcrTitle = request.getQueryString("jcr:content/jcr:title")
        
      val jcrContentSlashlogLevel = request.getQueryString("jcr:content/logLevel")
        
      val jcrContentSlashnoStatusUpdate = request.getQueryString("jcr:content/noStatusUpdate")
        .map(value => value.toBoolean)
        
      val jcrContentSlashnoVersioning = request.getQueryString("jcr:content/noVersioning")
        .map(value => value.toBoolean)
        
      val jcrContentSlashprotocolConnectTimeout = request.getQueryString("jcr:content/protocolConnectTimeout")
        .map(value => BigDecimal(value))
        
      val jcrContentSlashprotocolHTTPConnectionClosed = request.getQueryString("jcr:content/protocolHTTPConnectionClosed")
        .map(value => value.toBoolean)
        
      val jcrContentSlashprotocolHTTPExpired = request.getQueryString("jcr:content/protocolHTTPExpired")
        
      val jcrContentSlashprotocolHTTPHeaders = request.queryString.get("jcr:content/protocolHTTPHeaders")
        .map(_.toList)
        
      val jcrContentSlashprotocolHTTPHeadersAtTypeHint = request.getQueryString("jcr:content/protocolHTTPHeaders@TypeHint")
        
      val jcrContentSlashprotocolHTTPMethod = request.getQueryString("jcr:content/protocolHTTPMethod")
        
      val jcrContentSlashprotocolHTTPSRelaxed = request.getQueryString("jcr:content/protocolHTTPSRelaxed")
        .map(value => value.toBoolean)
        
      val jcrContentSlashprotocolInterface = request.getQueryString("jcr:content/protocolInterface")
        
      val jcrContentSlashprotocolSocketTimeout = request.getQueryString("jcr:content/protocolSocketTimeout")
        .map(value => BigDecimal(value))
        
      val jcrContentSlashprotocolVersion = request.getQueryString("jcr:content/protocolVersion")
        
      val jcrContentSlashproxyNTLMDomain = request.getQueryString("jcr:content/proxyNTLMDomain")
        
      val jcrContentSlashproxyNTLMHost = request.getQueryString("jcr:content/proxyNTLMHost")
        
      val jcrContentSlashproxyHost = request.getQueryString("jcr:content/proxyHost")
        
      val jcrContentSlashproxyPassword = request.getQueryString("jcr:content/proxyPassword")
        
      val jcrContentSlashproxyPort = request.getQueryString("jcr:content/proxyPort")
        .map(value => BigDecimal(value))
        
      val jcrContentSlashproxyUser = request.getQueryString("jcr:content/proxyUser")
        
      val jcrContentSlashqueueBatchMaxSize = request.getQueryString("jcr:content/queueBatchMaxSize")
        .map(value => BigDecimal(value))
        
      val jcrContentSlashqueueBatchMode = request.getQueryString("jcr:content/queueBatchMode")
        
      val jcrContentSlashqueueBatchWaitTime = request.getQueryString("jcr:content/queueBatchWaitTime")
        .map(value => BigDecimal(value))
        
      val jcrContentSlashretryDelay = request.getQueryString("jcr:content/retryDelay")
        
      val jcrContentSlashreverseReplication = request.getQueryString("jcr:content/reverseReplication")
        .map(value => value.toBoolean)
        
      val jcrContentSlashserializationType = request.getQueryString("jcr:content/serializationType")
        
      val jcrContentSlashslingResourceType = request.getQueryString("jcr:content/sling:resourceType")
        
      val jcrContentSlashssl = request.getQueryString("jcr:content/ssl")
        
      val jcrContentSlashtransportNTLMDomain = request.getQueryString("jcr:content/transportNTLMDomain")
        
      val jcrContentSlashtransportNTLMHost = request.getQueryString("jcr:content/transportNTLMHost")
        
      val jcrContentSlashtransportPassword = request.getQueryString("jcr:content/transportPassword")
        
      val jcrContentSlashtransportUri = request.getQueryString("jcr:content/transportUri")
        
      val jcrContentSlashtransportUser = request.getQueryString("jcr:content/transportUser")
        
      val jcrContentSlashtriggerDistribute = request.getQueryString("jcr:content/triggerDistribute")
        .map(value => value.toBoolean)
        
      val jcrContentSlashtriggerModified = request.getQueryString("jcr:content/triggerModified")
        .map(value => value.toBoolean)
        
      val jcrContentSlashtriggerOnOffTime = request.getQueryString("jcr:content/triggerOnOffTime")
        .map(value => value.toBoolean)
        
      val jcrContentSlashtriggerReceive = request.getQueryString("jcr:content/triggerReceive")
        .map(value => value.toBoolean)
        
      val jcrContentSlashtriggerSpecific = request.getQueryString("jcr:content/triggerSpecific")
        .map(value => value.toBoolean)
        
      val jcrContentSlashuserId = request.getQueryString("jcr:content/userId")
        
      val jcrPrimaryType = request.getQueryString("jcr:primaryType")
        
      val operation = request.getQueryString(":operation")
        
      api.postAgent(runmode, name, jcrContentSlashcqDistribute, jcrContentSlashcqDistributeAtTypeHint, jcrContentSlashcqName, jcrContentSlashcqTemplate, jcrContentSlashaliasUpdate, jcrContentSlashenabled, jcrContentSlashjcrDescription, jcrContentSlashjcrLastModified, jcrContentSlashjcrLastModifiedBy, jcrContentSlashjcrMixinTypes, jcrContentSlashjcrTitle, jcrContentSlashlogLevel, jcrContentSlashnoStatusUpdate, jcrContentSlashnoVersioning, jcrContentSlashprotocolConnectTimeout, jcrContentSlashprotocolHTTPConnectionClosed, jcrContentSlashprotocolHTTPExpired, jcrContentSlashprotocolHTTPHeaders, jcrContentSlashprotocolHTTPHeadersAtTypeHint, jcrContentSlashprotocolHTTPMethod, jcrContentSlashprotocolHTTPSRelaxed, jcrContentSlashprotocolInterface, jcrContentSlashprotocolSocketTimeout, jcrContentSlashprotocolVersion, jcrContentSlashproxyNTLMDomain, jcrContentSlashproxyNTLMHost, jcrContentSlashproxyHost, jcrContentSlashproxyPassword, jcrContentSlashproxyPort, jcrContentSlashproxyUser, jcrContentSlashqueueBatchMaxSize, jcrContentSlashqueueBatchMode, jcrContentSlashqueueBatchWaitTime, jcrContentSlashretryDelay, jcrContentSlashreverseReplication, jcrContentSlashserializationType, jcrContentSlashslingResourceType, jcrContentSlashssl, jcrContentSlashtransportNTLMDomain, jcrContentSlashtransportNTLMHost, jcrContentSlashtransportPassword, jcrContentSlashtransportUri, jcrContentSlashtransportUser, jcrContentSlashtriggerDistribute, jcrContentSlashtriggerModified, jcrContentSlashtriggerOnOffTime, jcrContentSlashtriggerReceive, jcrContentSlashtriggerSpecific, jcrContentSlashuserId, jcrPrimaryType, operation)
    }

    executeApi()
    Ok
  }

  /**
    * POST /:intermediatePath/:authorizableId.ks.html?operation=[value]&currentPassword=[value]&newPassword=[value]&rePassword=[value]&keyPassword=[value]&keyStorePass=[value]&alias=[value]&newAlias=[value]&removeAlias=[value]
    */
  def postAuthorizableKeystore(intermediatePath: String, authorizableId: String): Action[AnyContent] = Action { request =>
    def executeApi(): KeystoreInfo = {
      val operation = request.getQueryString(":operation")
        
      val currentPassword = request.getQueryString("currentPassword")
        
      val newPassword = request.getQueryString("newPassword")
        
      val rePassword = request.getQueryString("rePassword")
        
      val keyPassword = request.getQueryString("keyPassword")
        
      val keyStorePass = request.getQueryString("keyStorePass")
        
      val alias = request.getQueryString("alias")
        
      val newAlias = request.getQueryString("newAlias")
        
      val removeAlias = request.getQueryString("removeAlias")
        
      val certChain = request.body.asMultipartFormData.flatMap(_.file("cert-chain").map(_.ref: TemporaryFile))
        
      val pk = request.body.asMultipartFormData.flatMap(_.file("pk").map(_.ref: TemporaryFile))
        
      val keyStore = request.body.asMultipartFormData.flatMap(_.file("keyStore").map(_.ref: TemporaryFile))
        
      api.postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /libs/granite/security/post/authorizables?authorizableId=[value]&intermediatePath=[value]&createUser=[value]&createGroup=[value]&repPassword=[value]&profileSlashgivenName=[value]
    */
  def postAuthorizables(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val authorizableId = request.getQueryString("authorizableId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("authorizableId", "query string")
        }
        
      val intermediatePath = request.getQueryString("intermediatePath")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("intermediatePath", "query string")
        }
        
      val createUser = request.getQueryString("createUser")
        
      val createGroup = request.getQueryString("createGroup")
        
      val repPassword = request.getQueryString("rep:password")
        
      val profileSlashgivenName = request.getQueryString("profile/givenName")
        
      api.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileSlashgivenName)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config?keyStorePassword=[value]&keyStorePasswordAtTypeHint=[value]&servicePeriodranking=[value]&servicePeriodrankingAtTypeHint=[value]&idpHttpRedirect=[value]&idpHttpRedirectAtTypeHint=[value]&createUser=[value]&createUserAtTypeHint=[value]&defaultRedirectUrl=[value]&defaultRedirectUrlAtTypeHint=[value]&userIDAttribute=[value]&userIDAttributeAtTypeHint=[value]&defaultGroups=[value]&defaultGroupsAtTypeHint=[value]&idpCertAlias=[value]&idpCertAliasAtTypeHint=[value]&addGroupMemberships=[value]&addGroupMembershipsAtTypeHint=[value]&path=[value]&pathAtTypeHint=[value]&synchronizeAttributes=[value]&synchronizeAttributesAtTypeHint=[value]&clockTolerance=[value]&clockToleranceAtTypeHint=[value]&groupMembershipAttribute=[value]&groupMembershipAttributeAtTypeHint=[value]&idpUrl=[value]&idpUrlAtTypeHint=[value]&logoutUrl=[value]&logoutUrlAtTypeHint=[value]&serviceProviderEntityId=[value]&serviceProviderEntityIdAtTypeHint=[value]&assertionConsumerServiceURL=[value]&assertionConsumerServiceURLAtTypeHint=[value]&handleLogout=[value]&handleLogoutAtTypeHint=[value]&spPrivateKeyAlias=[value]&spPrivateKeyAliasAtTypeHint=[value]&useEncryption=[value]&useEncryptionAtTypeHint=[value]&nameIdFormat=[value]&nameIdFormatAtTypeHint=[value]&digestMethod=[value]&digestMethodAtTypeHint=[value]&signatureMethod=[value]&signatureMethodAtTypeHint=[value]&userIntermediatePath=[value]&userIntermediatePathAtTypeHint=[value]
    */
  def postConfigAdobeGraniteSamlAuthenticationHandler(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val keyStorePassword = request.getQueryString("keyStorePassword")
        
      val keyStorePasswordAtTypeHint = request.getQueryString("keyStorePassword@TypeHint")
        
      val servicePeriodranking = request.getQueryString("service.ranking")
        .map(value => value.toInt)
        
      val servicePeriodrankingAtTypeHint = request.getQueryString("service.ranking@TypeHint")
        
      val idpHttpRedirect = request.getQueryString("idpHttpRedirect")
        .map(value => value.toBoolean)
        
      val idpHttpRedirectAtTypeHint = request.getQueryString("idpHttpRedirect@TypeHint")
        
      val createUser = request.getQueryString("createUser")
        .map(value => value.toBoolean)
        
      val createUserAtTypeHint = request.getQueryString("createUser@TypeHint")
        
      val defaultRedirectUrl = request.getQueryString("defaultRedirectUrl")
        
      val defaultRedirectUrlAtTypeHint = request.getQueryString("defaultRedirectUrl@TypeHint")
        
      val userIDAttribute = request.getQueryString("userIDAttribute")
        
      val userIDAttributeAtTypeHint = request.getQueryString("userIDAttribute@TypeHint")
        
      val defaultGroups = request.queryString.get("defaultGroups")
        .map(_.toList)
        
      val defaultGroupsAtTypeHint = request.getQueryString("defaultGroups@TypeHint")
        
      val idpCertAlias = request.getQueryString("idpCertAlias")
        
      val idpCertAliasAtTypeHint = request.getQueryString("idpCertAlias@TypeHint")
        
      val addGroupMemberships = request.getQueryString("addGroupMemberships")
        .map(value => value.toBoolean)
        
      val addGroupMembershipsAtTypeHint = request.getQueryString("addGroupMemberships@TypeHint")
        
      val path = request.queryString.get("path")
        .map(_.toList)
        
      val pathAtTypeHint = request.getQueryString("path@TypeHint")
        
      val synchronizeAttributes = request.queryString.get("synchronizeAttributes")
        .map(_.toList)
        
      val synchronizeAttributesAtTypeHint = request.getQueryString("synchronizeAttributes@TypeHint")
        
      val clockTolerance = request.getQueryString("clockTolerance")
        .map(value => value.toInt)
        
      val clockToleranceAtTypeHint = request.getQueryString("clockTolerance@TypeHint")
        
      val groupMembershipAttribute = request.getQueryString("groupMembershipAttribute")
        
      val groupMembershipAttributeAtTypeHint = request.getQueryString("groupMembershipAttribute@TypeHint")
        
      val idpUrl = request.getQueryString("idpUrl")
        
      val idpUrlAtTypeHint = request.getQueryString("idpUrl@TypeHint")
        
      val logoutUrl = request.getQueryString("logoutUrl")
        
      val logoutUrlAtTypeHint = request.getQueryString("logoutUrl@TypeHint")
        
      val serviceProviderEntityId = request.getQueryString("serviceProviderEntityId")
        
      val serviceProviderEntityIdAtTypeHint = request.getQueryString("serviceProviderEntityId@TypeHint")
        
      val assertionConsumerServiceURL = request.getQueryString("assertionConsumerServiceURL")
        
      val assertionConsumerServiceURLAtTypeHint = request.getQueryString("assertionConsumerServiceURL@TypeHint")
        
      val handleLogout = request.getQueryString("handleLogout")
        .map(value => value.toBoolean)
        
      val handleLogoutAtTypeHint = request.getQueryString("handleLogout@TypeHint")
        
      val spPrivateKeyAlias = request.getQueryString("spPrivateKeyAlias")
        
      val spPrivateKeyAliasAtTypeHint = request.getQueryString("spPrivateKeyAlias@TypeHint")
        
      val useEncryption = request.getQueryString("useEncryption")
        .map(value => value.toBoolean)
        
      val useEncryptionAtTypeHint = request.getQueryString("useEncryption@TypeHint")
        
      val nameIdFormat = request.getQueryString("nameIdFormat")
        
      val nameIdFormatAtTypeHint = request.getQueryString("nameIdFormat@TypeHint")
        
      val digestMethod = request.getQueryString("digestMethod")
        
      val digestMethodAtTypeHint = request.getQueryString("digestMethod@TypeHint")
        
      val signatureMethod = request.getQueryString("signatureMethod")
        
      val signatureMethodAtTypeHint = request.getQueryString("signatureMethod@TypeHint")
        
      val userIntermediatePath = request.getQueryString("userIntermediatePath")
        
      val userIntermediatePathAtTypeHint = request.getQueryString("userIntermediatePath@TypeHint")
        
      api.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, servicePeriodranking, servicePeriodrankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint)
    }

    executeApi()
    Ok
  }

  /**
    * POST /apps/system/config/org.apache.felix.http?orgPeriodapachePeriodfelixPeriodhttpsPeriodnio=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodenable=[value]&orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint=[value]&orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure=[value]&orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint=[value]
    */
  def postConfigApacheFelixJettyBasedHttpService(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodnio = request.getQueryString("org.apache.felix.https.nio")
        .map(value => value.toBoolean)
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint = request.getQueryString("org.apache.felix.https.nio@TypeHint")
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore = request.getQueryString("org.apache.felix.https.keystore")
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint = request.getQueryString("org.apache.felix.https.keystore@TypeHint")
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword = request.getQueryString("org.apache.felix.https.keystore.password")
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint = request.getQueryString("org.apache.felix.https.keystore.password@TypeHint")
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey = request.getQueryString("org.apache.felix.https.keystore.key")
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint = request.getQueryString("org.apache.felix.https.keystore.key@TypeHint")
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword = request.getQueryString("org.apache.felix.https.keystore.key.password")
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint = request.getQueryString("org.apache.felix.https.keystore.key.password@TypeHint")
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore = request.getQueryString("org.apache.felix.https.truststore")
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint = request.getQueryString("org.apache.felix.https.truststore@TypeHint")
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword = request.getQueryString("org.apache.felix.https.truststore.password")
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint = request.getQueryString("org.apache.felix.https.truststore.password@TypeHint")
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate = request.getQueryString("org.apache.felix.https.clientcertificate")
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint = request.getQueryString("org.apache.felix.https.clientcertificate@TypeHint")
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodenable = request.getQueryString("org.apache.felix.https.enable")
        .map(value => value.toBoolean)
        
      val orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint = request.getQueryString("org.apache.felix.https.enable@TypeHint")
        
      val orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure = request.getQueryString("org.osgi.service.http.port.secure")
        
      val orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint = request.getQueryString("org.osgi.service.http.port.secure@TypeHint")
        
      api.postConfigApacheFelixJettyBasedHttpService(orgPeriodapachePeriodfelixPeriodhttpsPeriodnio, orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodenable, orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint)
    }

    executeApi()
    Ok
  }

  /**
    * POST /apps/system/config/org.apache.http.proxyconfigurator.config?proxyPeriodhost=[value]&proxyPeriodhostAtTypeHint=[value]&proxyPeriodport=[value]&proxyPeriodportAtTypeHint=[value]&proxyPeriodexceptions=[value]&proxyPeriodexceptionsAtTypeHint=[value]&proxyPeriodenabled=[value]&proxyPeriodenabledAtTypeHint=[value]&proxyPerioduser=[value]&proxyPerioduserAtTypeHint=[value]&proxyPeriodpassword=[value]&proxyPeriodpasswordAtTypeHint=[value]
    */
  def postConfigApacheHttpComponentsProxyConfiguration(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val proxyPeriodhost = request.getQueryString("proxy.host")
        
      val proxyPeriodhostAtTypeHint = request.getQueryString("proxy.host@TypeHint")
        
      val proxyPeriodport = request.getQueryString("proxy.port")
        .map(value => value.toInt)
        
      val proxyPeriodportAtTypeHint = request.getQueryString("proxy.port@TypeHint")
        
      val proxyPeriodexceptions = request.queryString.get("proxy.exceptions")
        .map(_.toList)
        
      val proxyPeriodexceptionsAtTypeHint = request.getQueryString("proxy.exceptions@TypeHint")
        
      val proxyPeriodenabled = request.getQueryString("proxy.enabled")
        .map(value => value.toBoolean)
        
      val proxyPeriodenabledAtTypeHint = request.getQueryString("proxy.enabled@TypeHint")
        
      val proxyPerioduser = request.getQueryString("proxy.user")
        
      val proxyPerioduserAtTypeHint = request.getQueryString("proxy.user@TypeHint")
        
      val proxyPeriodpassword = request.getQueryString("proxy.password")
        
      val proxyPeriodpasswordAtTypeHint = request.getQueryString("proxy.password@TypeHint")
        
      api.postConfigApacheHttpComponentsProxyConfiguration(proxyPeriodhost, proxyPeriodhostAtTypeHint, proxyPeriodport, proxyPeriodportAtTypeHint, proxyPeriodexceptions, proxyPeriodexceptionsAtTypeHint, proxyPeriodenabled, proxyPeriodenabledAtTypeHint, proxyPerioduser, proxyPerioduserAtTypeHint, proxyPeriodpassword, proxyPeriodpasswordAtTypeHint)
    }

    executeApi()
    Ok
  }

  /**
    * POST /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet?alias=[value]&aliasAtTypeHint=[value]&davPeriodcreateAbsoluteUri=[value]&davPeriodcreateAbsoluteUriAtTypeHint=[value]
    */
  def postConfigApacheSlingDavExServlet(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val alias = request.getQueryString("alias")
        
      val aliasAtTypeHint = request.getQueryString("alias@TypeHint")
        
      val davPeriodcreateAbsoluteUri = request.getQueryString("dav.create-absolute-uri")
        .map(value => value.toBoolean)
        
      val davPeriodcreateAbsoluteUriAtTypeHint = request.getQueryString("dav.create-absolute-uri@TypeHint")
        
      api.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davPeriodcreateAbsoluteUri, davPeriodcreateAbsoluteUriAtTypeHint)
    }

    executeApi()
    Ok
  }

  /**
    * POST /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet?jsonPeriodmaximumresults=[value]&jsonPeriodmaximumresultsAtTypeHint=[value]&enablePeriodhtml=[value]&enablePeriodhtmlAtTypeHint=[value]&enablePeriodtxt=[value]&enablePeriodtxtAtTypeHint=[value]&enablePeriodxml=[value]&enablePeriodxmlAtTypeHint=[value]
    */
  def postConfigApacheSlingGetServlet(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val jsonPeriodmaximumresults = request.getQueryString("json.maximumresults")
        
      val jsonPeriodmaximumresultsAtTypeHint = request.getQueryString("json.maximumresults@TypeHint")
        
      val enablePeriodhtml = request.getQueryString("enable.html")
        .map(value => value.toBoolean)
        
      val enablePeriodhtmlAtTypeHint = request.getQueryString("enable.html@TypeHint")
        
      val enablePeriodtxt = request.getQueryString("enable.txt")
        .map(value => value.toBoolean)
        
      val enablePeriodtxtAtTypeHint = request.getQueryString("enable.txt@TypeHint")
        
      val enablePeriodxml = request.getQueryString("enable.xml")
        .map(value => value.toBoolean)
        
      val enablePeriodxmlAtTypeHint = request.getQueryString("enable.xml@TypeHint")
        
      api.postConfigApacheSlingGetServlet(jsonPeriodmaximumresults, jsonPeriodmaximumresultsAtTypeHint, enablePeriodhtml, enablePeriodhtmlAtTypeHint, enablePeriodtxt, enablePeriodtxtAtTypeHint, enablePeriodxml, enablePeriodxmlAtTypeHint)
    }

    executeApi()
    Ok
  }

  /**
    * POST /apps/system/config/org.apache.sling.security.impl.ReferrerFilter?allowPeriodempty=[value]&allowPeriodemptyAtTypeHint=[value]&allowPeriodhosts=[value]&allowPeriodhostsAtTypeHint=[value]&allowPeriodhostsPeriodregexp=[value]&allowPeriodhostsPeriodregexpAtTypeHint=[value]&filterPeriodmethods=[value]&filterPeriodmethodsAtTypeHint=[value]
    */
  def postConfigApacheSlingReferrerFilter(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val allowPeriodempty = request.getQueryString("allow.empty")
        .map(value => value.toBoolean)
        
      val allowPeriodemptyAtTypeHint = request.getQueryString("allow.empty@TypeHint")
        
      val allowPeriodhosts = request.getQueryString("allow.hosts")
        
      val allowPeriodhostsAtTypeHint = request.getQueryString("allow.hosts@TypeHint")
        
      val allowPeriodhostsPeriodregexp = request.getQueryString("allow.hosts.regexp")
        
      val allowPeriodhostsPeriodregexpAtTypeHint = request.getQueryString("allow.hosts.regexp@TypeHint")
        
      val filterPeriodmethods = request.getQueryString("filter.methods")
        
      val filterPeriodmethodsAtTypeHint = request.getQueryString("filter.methods@TypeHint")
        
      api.postConfigApacheSlingReferrerFilter(allowPeriodempty, allowPeriodemptyAtTypeHint, allowPeriodhosts, allowPeriodhostsAtTypeHint, allowPeriodhostsPeriodregexp, allowPeriodhostsPeriodregexpAtTypeHint, filterPeriodmethods, filterPeriodmethodsAtTypeHint)
    }

    executeApi()
    Ok
  }

  /**
    * POST /apps/system/config/:configNodeName
    */
  def postConfigProperty(configNodeName: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.postConfigProperty(configNodeName)
    }

    executeApi()
    Ok
  }

  /**
    * POST /:path/:name?operation=[value]&deleteAuthorizable=[value]
    */
  def postNode(path: String, name: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val operation = request.getQueryString(":operation")
        
      val deleteAuthorizable = request.getQueryString("deleteAuthorizable")
        
      val file = request.body.asMultipartFormData.flatMap(_.file("file").map(_.ref: TemporaryFile))
        
      api.postNode(path, name, operation, deleteAuthorizable, file)
    }

    executeApi()
    Ok
  }

  /**
    * POST /:path/:name.rw.html?addMembers=[value]
    */
  def postNodeRw(path: String, name: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val addMembers = request.getQueryString("addMembers")
        
      api.postNodeRw(path, name, addMembers)
    }

    executeApi()
    Ok
  }

  /**
    * POST /:path/?jcrPrimaryType=[value]&name=[value]
    */
  def postPath(path: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val jcrPrimaryType = request.getQueryString("jcr:primaryType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("jcr:primaryType", "query string")
        }
        
      val name = request.getQueryString(":name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException(":name", "query string")
        }
        
      api.postPath(path, jcrPrimaryType, name)
    }

    executeApi()
    Ok
  }

  /**
    * POST /bin/querybuilder.json?path=[value]&pPeriodlimit=[value]&1Property=[value]&1PropertyPeriodvalue=[value]
    */
  def postQuery(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val path = request.getQueryString("path")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("path", "query string")
        }
        
      val pPeriodlimit = request.getQueryString("p.limit")
        .map(value => BigDecimal(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("p.limit", "query string")
        }
        
      val 1Property = request.getQueryString("1_property")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("1_property", "query string")
        }
        
      val 1PropertyPeriodvalue = request.getQueryString("1_property.value")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("1_property.value", "query string")
        }
        
      api.postQuery(path, pPeriodlimit, 1Property, 1PropertyPeriodvalue)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /libs/replication/treeactivation.html?ignoredeactivated=[value]&onlymodified=[value]&path=[value]&cmd=[value]
    */
  def postTreeActivation(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val ignoredeactivated = request.getQueryString("ignoredeactivated")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ignoredeactivated", "query string")
        }
        
      val onlymodified = request.getQueryString("onlymodified")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("onlymodified", "query string")
        }
        
      val path = request.getQueryString("path")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("path", "query string")
        }
        
      val cmd = request.getQueryString("cmd")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("cmd", "query string")
        }
        
      api.postTreeActivation(ignoredeactivated, onlymodified, path, cmd)
    }

    executeApi()
    Ok
  }

  /**
    * POST /libs/granite/security/post/truststore?operation=[value]&newPassword=[value]&rePassword=[value]&keyStoreType=[value]&removeAlias=[value]
    */
  def postTruststore(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val operation = request.getQueryString(":operation")
        
      val newPassword = request.getQueryString("newPassword")
        
      val rePassword = request.getQueryString("rePassword")
        
      val keyStoreType = request.getQueryString("keyStoreType")
        
      val removeAlias = request.getQueryString("removeAlias")
        
      val certificate = request.body.asMultipartFormData.flatMap(_.file("certificate").map(_.ref: TemporaryFile))
        
      api.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /etc/truststore
    */
  def postTruststorePKCS12(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val truststorePeriodp12 = request.body.asMultipartFormData.flatMap(_.file("truststore.p12").map(_.ref: TemporaryFile))
        
      api.postTruststorePKCS12(truststorePeriodp12)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}

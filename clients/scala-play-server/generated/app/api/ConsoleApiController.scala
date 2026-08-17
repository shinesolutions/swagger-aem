package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BundleInfo
import model.SamlConfigurationInfo

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-17T02:18:11.620114289Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class ConsoleApiController @Inject()(cc: ControllerComponents, api: ConsoleApi) extends AbstractController(cc) {
  /**
    * GET /system/console/status-productinfo.json
    */
  def getAemProductInfo(): Action[AnyContent] = Action { request =>
    def executeApi(): List[String] = {
      api.getAemProductInfo()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /system/console/bundles/:name.json
    */
  def getBundleInfo(name: String): Action[AnyContent] = Action { request =>
    def executeApi(): BundleInfo = {
      api.getBundleInfo(name)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /system/console/configMgr
    */
  def getConfigMgr(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      api.getConfigMgr()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /system/console/bundles/:name?action=[value]
    */
  def postBundle(name: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val action = request.getQueryString("action")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("action", "query string")
        }
        
      api.postBundle(name, action)
    }

    executeApi()
    Ok
  }

  /**
    * POST /system/console/jmx/com.adobe.granite:type=Repository/op/:action
    */
  def postJmxRepository(action: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.postJmxRepository(action)
    }

    executeApi()
    Ok
  }

  /**
    * POST /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler?post=[value]&apply=[value]&delete=[value]&action=[value]&Dollarlocation=[value]&path=[value]&servicePeriodranking=[value]&idpUrl=[value]&idpCertAlias=[value]&idpHttpRedirect=[value]&serviceProviderEntityId=[value]&assertionConsumerServiceURL=[value]&spPrivateKeyAlias=[value]&keyStorePassword=[value]&defaultRedirectUrl=[value]&userIDAttribute=[value]&useEncryption=[value]&createUser=[value]&addGroupMemberships=[value]&groupMembershipAttribute=[value]&defaultGroups=[value]&nameIdFormat=[value]&synchronizeAttributes=[value]&handleLogout=[value]&logoutUrl=[value]&clockTolerance=[value]&digestMethod=[value]&signatureMethod=[value]&userIntermediatePath=[value]&propertylist=[value]
    */
  def postSamlConfiguration(): Action[AnyContent] = Action { request =>
    def executeApi(): SamlConfigurationInfo = {
      val post = request.getQueryString("post")
        .map(value => value.toBoolean)
        
      val apply = request.getQueryString("apply")
        .map(value => value.toBoolean)
        
      val delete = request.getQueryString("delete")
        .map(value => value.toBoolean)
        
      val action = request.getQueryString("action")
        
      val Dollarlocation = request.getQueryString("$location")
        
      val path = request.queryString.get("path")
        .map(_.toList)
        
      val servicePeriodranking = request.getQueryString("service.ranking")
        .map(value => value.toInt)
        
      val idpUrl = request.getQueryString("idpUrl")
        
      val idpCertAlias = request.getQueryString("idpCertAlias")
        
      val idpHttpRedirect = request.getQueryString("idpHttpRedirect")
        .map(value => value.toBoolean)
        
      val serviceProviderEntityId = request.getQueryString("serviceProviderEntityId")
        
      val assertionConsumerServiceURL = request.getQueryString("assertionConsumerServiceURL")
        
      val spPrivateKeyAlias = request.getQueryString("spPrivateKeyAlias")
        
      val keyStorePassword = request.getQueryString("keyStorePassword")
        
      val defaultRedirectUrl = request.getQueryString("defaultRedirectUrl")
        
      val userIDAttribute = request.getQueryString("userIDAttribute")
        
      val useEncryption = request.getQueryString("useEncryption")
        .map(value => value.toBoolean)
        
      val createUser = request.getQueryString("createUser")
        .map(value => value.toBoolean)
        
      val addGroupMemberships = request.getQueryString("addGroupMemberships")
        .map(value => value.toBoolean)
        
      val groupMembershipAttribute = request.getQueryString("groupMembershipAttribute")
        
      val defaultGroups = request.queryString.get("defaultGroups")
        .map(_.toList)
        
      val nameIdFormat = request.getQueryString("nameIdFormat")
        
      val synchronizeAttributes = request.queryString.get("synchronizeAttributes")
        .map(_.toList)
        
      val handleLogout = request.getQueryString("handleLogout")
        .map(value => value.toBoolean)
        
      val logoutUrl = request.getQueryString("logoutUrl")
        
      val clockTolerance = request.getQueryString("clockTolerance")
        .map(value => value.toInt)
        
      val digestMethod = request.getQueryString("digestMethod")
        
      val signatureMethod = request.getQueryString("signatureMethod")
        
      val userIntermediatePath = request.getQueryString("userIntermediatePath")
        
      val propertylist = request.getQueryString("propertylist")
        .map(values => splitCollectionParam(values, "csv"))
        
      api.postSamlConfiguration(post, apply, delete, action, Dollarlocation, path, servicePeriodranking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)
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

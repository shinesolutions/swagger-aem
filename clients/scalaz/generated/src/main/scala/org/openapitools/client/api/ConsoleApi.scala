package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.BundleInfo
import org.openapitools.client.api.SamlConfigurationInfo

object ConsoleApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getAemProductInfo(host: String): Task[List[String]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[String]] = jsonOf[List[String]]

    val path = "/system/console/status-productinfo.json"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[String]](req)

    } yield resp
  }
  
  def getBundleInfo(host: String, name: String): Task[BundleInfo] = {
    implicit val returnTypeDecoder: EntityDecoder[BundleInfo] = jsonOf[BundleInfo]

    val path = "/system/console/bundles/{name}.json".replaceAll("\\{" + "name" + "\\}",escape(name.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BundleInfo](req)

    } yield resp
  }
  
  def getConfigMgr(host: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/system/console/configMgr"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def postBundle(host: String, name: String, action: String)(implicit actionQuery: QueryParam[String]): Task[Unit] = {
    val path = "/system/console/bundles/{name}".replaceAll("\\{" + "name" + "\\}",escape(name.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("action", Some(actionQuery.toParamString(action))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def postJmxRepository(host: String, action: String): Task[Unit] = {
    val path = "/system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action}".replaceAll("\\{" + "action" + "\\}",escape(action.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def postSamlConfiguration(host: String, post: Boolean, apply: Boolean, delete: Boolean, action: String, location: String, `path`: List[String] = List.empty[String] , serviceRanking: Integer, idpUrl: String, idpCertAlias: String, idpHttpRedirect: Boolean, serviceProviderEntityId: String, assertionConsumerServiceURL: String, spPrivateKeyAlias: String, keyStorePassword: String, defaultRedirectUrl: String, userIDAttribute: String, useEncryption: Boolean, createUser: Boolean, addGroupMemberships: Boolean, groupMembershipAttribute: String, defaultGroups: List[String] = List.empty[String] , nameIdFormat: String, synchronizeAttributes: List[String] = List.empty[String] , handleLogout: Boolean, logoutUrl: String, clockTolerance: Integer, digestMethod: String, signatureMethod: String, userIntermediatePath: String, propertylist: List[String] = List.empty[String] )(implicit postQuery: QueryParam[Boolean], applyQuery: QueryParam[Boolean], deleteQuery: QueryParam[Boolean], actionQuery: QueryParam[String], locationQuery: QueryParam[String], `path`Query: QueryParam[List[String]], serviceRankingQuery: QueryParam[Integer], idpUrlQuery: QueryParam[String], idpCertAliasQuery: QueryParam[String], idpHttpRedirectQuery: QueryParam[Boolean], serviceProviderEntityIdQuery: QueryParam[String], assertionConsumerServiceURLQuery: QueryParam[String], spPrivateKeyAliasQuery: QueryParam[String], keyStorePasswordQuery: QueryParam[String], defaultRedirectUrlQuery: QueryParam[String], userIDAttributeQuery: QueryParam[String], useEncryptionQuery: QueryParam[Boolean], createUserQuery: QueryParam[Boolean], addGroupMembershipsQuery: QueryParam[Boolean], groupMembershipAttributeQuery: QueryParam[String], defaultGroupsQuery: QueryParam[List[String]], nameIdFormatQuery: QueryParam[String], synchronizeAttributesQuery: QueryParam[List[String]], handleLogoutQuery: QueryParam[Boolean], logoutUrlQuery: QueryParam[String], clockToleranceQuery: QueryParam[Integer], digestMethodQuery: QueryParam[String], signatureMethodQuery: QueryParam[String], userIntermediatePathQuery: QueryParam[String], propertylistQuery: QueryParam[List[String]]): Task[SamlConfigurationInfo] = {
    implicit val returnTypeDecoder: EntityDecoder[SamlConfigurationInfo] = jsonOf[SamlConfigurationInfo]

    val path = "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("post", Some(postQuery.toParamString(post))), ("apply", Some(applyQuery.toParamString(apply))), ("delete", Some(deleteQuery.toParamString(delete))), ("action", Some(actionQuery.toParamString(action))), ("location", Some($locationQuery.toParamString($location))), ("`path`", Some(pathQuery.toParamString(path))), ("serviceRanking", Some(service.rankingQuery.toParamString(service.ranking))), ("idpUrl", Some(idpUrlQuery.toParamString(idpUrl))), ("idpCertAlias", Some(idpCertAliasQuery.toParamString(idpCertAlias))), ("idpHttpRedirect", Some(idpHttpRedirectQuery.toParamString(idpHttpRedirect))), ("serviceProviderEntityId", Some(serviceProviderEntityIdQuery.toParamString(serviceProviderEntityId))), ("assertionConsumerServiceURL", Some(assertionConsumerServiceURLQuery.toParamString(assertionConsumerServiceURL))), ("spPrivateKeyAlias", Some(spPrivateKeyAliasQuery.toParamString(spPrivateKeyAlias))), ("keyStorePassword", Some(keyStorePasswordQuery.toParamString(keyStorePassword))), ("defaultRedirectUrl", Some(defaultRedirectUrlQuery.toParamString(defaultRedirectUrl))), ("userIDAttribute", Some(userIDAttributeQuery.toParamString(userIDAttribute))), ("useEncryption", Some(useEncryptionQuery.toParamString(useEncryption))), ("createUser", Some(createUserQuery.toParamString(createUser))), ("addGroupMemberships", Some(addGroupMembershipsQuery.toParamString(addGroupMemberships))), ("groupMembershipAttribute", Some(groupMembershipAttributeQuery.toParamString(groupMembershipAttribute))), ("defaultGroups", Some(defaultGroupsQuery.toParamString(defaultGroups))), ("nameIdFormat", Some(nameIdFormatQuery.toParamString(nameIdFormat))), ("synchronizeAttributes", Some(synchronizeAttributesQuery.toParamString(synchronizeAttributes))), ("handleLogout", Some(handleLogoutQuery.toParamString(handleLogout))), ("logoutUrl", Some(logoutUrlQuery.toParamString(logoutUrl))), ("clockTolerance", Some(clockToleranceQuery.toParamString(clockTolerance))), ("digestMethod", Some(digestMethodQuery.toParamString(digestMethod))), ("signatureMethod", Some(signatureMethodQuery.toParamString(signatureMethod))), ("userIntermediatePath", Some(userIntermediatePathQuery.toParamString(userIntermediatePath))), ("propertylist", Some(propertylistQuery.toParamString(propertylist))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SamlConfigurationInfo](req)

    } yield resp
  }
  
}

class HttpServiceConsoleApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getAemProductInfo(): Task[List[String]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[String]] = jsonOf[List[String]]

    val path = "/system/console/status-productinfo.json"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[String]](req)

    } yield resp
  }
  
  def getBundleInfo(name: String): Task[BundleInfo] = {
    implicit val returnTypeDecoder: EntityDecoder[BundleInfo] = jsonOf[BundleInfo]

    val path = "/system/console/bundles/{name}.json".replaceAll("\\{" + "name" + "\\}",escape(name.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[BundleInfo](req)

    } yield resp
  }
  
  def getConfigMgr(): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/system/console/configMgr"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def postBundle(name: String, action: String)(implicit actionQuery: QueryParam[String]): Task[Unit] = {
    val path = "/system/console/bundles/{name}".replaceAll("\\{" + "name" + "\\}",escape(name.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("action", Some(actionQuery.toParamString(action))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def postJmxRepository(action: String): Task[Unit] = {
    val path = "/system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action}".replaceAll("\\{" + "action" + "\\}",escape(action.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def postSamlConfiguration(post: Boolean, apply: Boolean, delete: Boolean, action: String, location: String, `path`: List[String] = List.empty[String] , serviceRanking: Integer, idpUrl: String, idpCertAlias: String, idpHttpRedirect: Boolean, serviceProviderEntityId: String, assertionConsumerServiceURL: String, spPrivateKeyAlias: String, keyStorePassword: String, defaultRedirectUrl: String, userIDAttribute: String, useEncryption: Boolean, createUser: Boolean, addGroupMemberships: Boolean, groupMembershipAttribute: String, defaultGroups: List[String] = List.empty[String] , nameIdFormat: String, synchronizeAttributes: List[String] = List.empty[String] , handleLogout: Boolean, logoutUrl: String, clockTolerance: Integer, digestMethod: String, signatureMethod: String, userIntermediatePath: String, propertylist: List[String] = List.empty[String] )(implicit postQuery: QueryParam[Boolean], applyQuery: QueryParam[Boolean], deleteQuery: QueryParam[Boolean], actionQuery: QueryParam[String], locationQuery: QueryParam[String], `path`Query: QueryParam[List[String]], serviceRankingQuery: QueryParam[Integer], idpUrlQuery: QueryParam[String], idpCertAliasQuery: QueryParam[String], idpHttpRedirectQuery: QueryParam[Boolean], serviceProviderEntityIdQuery: QueryParam[String], assertionConsumerServiceURLQuery: QueryParam[String], spPrivateKeyAliasQuery: QueryParam[String], keyStorePasswordQuery: QueryParam[String], defaultRedirectUrlQuery: QueryParam[String], userIDAttributeQuery: QueryParam[String], useEncryptionQuery: QueryParam[Boolean], createUserQuery: QueryParam[Boolean], addGroupMembershipsQuery: QueryParam[Boolean], groupMembershipAttributeQuery: QueryParam[String], defaultGroupsQuery: QueryParam[List[String]], nameIdFormatQuery: QueryParam[String], synchronizeAttributesQuery: QueryParam[List[String]], handleLogoutQuery: QueryParam[Boolean], logoutUrlQuery: QueryParam[String], clockToleranceQuery: QueryParam[Integer], digestMethodQuery: QueryParam[String], signatureMethodQuery: QueryParam[String], userIntermediatePathQuery: QueryParam[String], propertylistQuery: QueryParam[List[String]]): Task[SamlConfigurationInfo] = {
    implicit val returnTypeDecoder: EntityDecoder[SamlConfigurationInfo] = jsonOf[SamlConfigurationInfo]

    val path = "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("post", Some(postQuery.toParamString(post))), ("apply", Some(applyQuery.toParamString(apply))), ("delete", Some(deleteQuery.toParamString(delete))), ("action", Some(actionQuery.toParamString(action))), ("location", Some($locationQuery.toParamString($location))), ("`path`", Some(pathQuery.toParamString(path))), ("serviceRanking", Some(service.rankingQuery.toParamString(service.ranking))), ("idpUrl", Some(idpUrlQuery.toParamString(idpUrl))), ("idpCertAlias", Some(idpCertAliasQuery.toParamString(idpCertAlias))), ("idpHttpRedirect", Some(idpHttpRedirectQuery.toParamString(idpHttpRedirect))), ("serviceProviderEntityId", Some(serviceProviderEntityIdQuery.toParamString(serviceProviderEntityId))), ("assertionConsumerServiceURL", Some(assertionConsumerServiceURLQuery.toParamString(assertionConsumerServiceURL))), ("spPrivateKeyAlias", Some(spPrivateKeyAliasQuery.toParamString(spPrivateKeyAlias))), ("keyStorePassword", Some(keyStorePasswordQuery.toParamString(keyStorePassword))), ("defaultRedirectUrl", Some(defaultRedirectUrlQuery.toParamString(defaultRedirectUrl))), ("userIDAttribute", Some(userIDAttributeQuery.toParamString(userIDAttribute))), ("useEncryption", Some(useEncryptionQuery.toParamString(useEncryption))), ("createUser", Some(createUserQuery.toParamString(createUser))), ("addGroupMemberships", Some(addGroupMembershipsQuery.toParamString(addGroupMemberships))), ("groupMembershipAttribute", Some(groupMembershipAttributeQuery.toParamString(groupMembershipAttribute))), ("defaultGroups", Some(defaultGroupsQuery.toParamString(defaultGroups))), ("nameIdFormat", Some(nameIdFormatQuery.toParamString(nameIdFormat))), ("synchronizeAttributes", Some(synchronizeAttributesQuery.toParamString(synchronizeAttributes))), ("handleLogout", Some(handleLogoutQuery.toParamString(handleLogout))), ("logoutUrl", Some(logoutUrlQuery.toParamString(logoutUrl))), ("clockTolerance", Some(clockToleranceQuery.toParamString(clockTolerance))), ("digestMethod", Some(digestMethodQuery.toParamString(digestMethod))), ("signatureMethod", Some(signatureMethodQuery.toParamString(signatureMethod))), ("userIntermediatePath", Some(userIntermediatePathQuery.toParamString(userIntermediatePath))), ("propertylist", Some(propertylistQuery.toParamString(propertylist))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[SamlConfigurationInfo](req)

    } yield resp
  }
  
}

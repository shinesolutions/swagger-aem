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

import org.openapitools.client.api.BigDecimal
import java.io.File
import org.openapitools.client.api.KeystoreInfo
import org.openapitools.client.api.TruststoreInfo

object SlingApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteAgent(host: String, runmode: String, name: String): Task[Unit] = {
    val path = "/etc/replication/agents.{runmode}/{name}".replaceAll("\\{" + "runmode" + "\\}",escape(runmode.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString))

    val httpMethod = Method.DELETE
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

  def deleteNode(host: String, `path`: String, name: String): Task[Unit] = {
    val path = "/{path}/{name}".replaceAll("\\{" + "path" + "\\}",escape(`path`.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString))

    val httpMethod = Method.DELETE
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

  def getAgent(host: String, runmode: String, name: String): Task[Unit] = {
    val path = "/etc/replication/agents.{runmode}/{name}".replaceAll("\\{" + "runmode" + "\\}",escape(runmode.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString))

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
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def getAgents(host: String, runmode: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/etc/replication/agents.{runmode}.-1.json".replaceAll("\\{" + "runmode" + "\\}",escape(runmode.toString))

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

  def getAuthorizableKeystore(host: String, intermediatePath: String, authorizableId: String): Task[KeystoreInfo] = {
    implicit val returnTypeDecoder: EntityDecoder[KeystoreInfo] = jsonOf[KeystoreInfo]

    val path = "/{intermediatePath}/{authorizableId}.ks.json".replaceAll("\\{" + "intermediatePath" + "\\}",escape(intermediatePath.toString)).replaceAll("\\{" + "authorizableId" + "\\}",escape(authorizableId.toString))

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
      resp          <- client.expect[KeystoreInfo](req)

    } yield resp
  }

  def getKeystore(host: String, intermediatePath: String, authorizableId: String): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/{intermediatePath}/{authorizableId}/keystore/store.p12".replaceAll("\\{" + "intermediatePath" + "\\}",escape(intermediatePath.toString)).replaceAll("\\{" + "authorizableId" + "\\}",escape(authorizableId.toString))

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
      resp          <- client.expect[File](req)

    } yield resp
  }

  def getNode(host: String, `path`: String, name: String): Task[Unit] = {
    val path = "/{path}/{name}".replaceAll("\\{" + "path" + "\\}",escape(`path`.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString))

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
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def getPackage(host: String, group: String, name: String, version: String): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/etc/packages/{group}/{name}-{version}.zip".replaceAll("\\{" + "group" + "\\}",escape(group.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString)).replaceAll("\\{" + "version" + "\\}",escape(version.toString))

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
      resp          <- client.expect[File](req)

    } yield resp
  }

  def getPackageFilter(host: String, group: String, name: String, version: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json".replaceAll("\\{" + "group" + "\\}",escape(group.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString)).replaceAll("\\{" + "version" + "\\}",escape(version.toString))

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

  def getQuery(host: String, `path`: String, pLimit: BigDecimal, `1property`: String, `1propertyValue`: String)(implicit `path`Query: QueryParam[String], pLimitQuery: QueryParam[BigDecimal], `1property`Query: QueryParam[String], `1propertyValue`Query: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/bin/querybuilder.json"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("`path`", Some(pathQuery.toParamString(path))), ("pLimit", Some(p.limitQuery.toParamString(p.limit))), ("`1property`", Some(1_propertyQuery.toParamString(1_property))), ("`1propertyValue`", Some(1_property.valueQuery.toParamString(1_property.value))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }

  def getTruststore(host: String): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/etc/truststore/truststore.p12"

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
      resp          <- client.expect[File](req)

    } yield resp
  }

  def getTruststoreInfo(host: String): Task[TruststoreInfo] = {
    implicit val returnTypeDecoder: EntityDecoder[TruststoreInfo] = jsonOf[TruststoreInfo]

    val path = "/libs/granite/security/truststore.json"

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
      resp          <- client.expect[TruststoreInfo](req)

    } yield resp
  }

  def postAgent(host: String, runmode: String, name: String, jcrContentCqDistribute: Boolean, jcrContentCqDistributeTypeHint: String, jcrContentCqName: String, jcrContentCqTemplate: String, jcrContentAliasUpdate: Boolean, jcrContentEnabled: Boolean, jcrContentJcrDescription: String, jcrContentJcrLastModified: String, jcrContentJcrLastModifiedBy: String, jcrContentJcrMixinTypes: String, jcrContentJcrTitle: String, jcrContentLogLevel: String, jcrContentNoStatusUpdate: Boolean, jcrContentNoVersioning: Boolean, jcrContentProtocolConnectTimeout: BigDecimal, jcrContentProtocolHTTPConnectionClosed: Boolean, jcrContentProtocolHTTPExpired: String, jcrContentProtocolHTTPHeaders: List[String] = List.empty[String] , jcrContentProtocolHTTPHeadersTypeHint: String, jcrContentProtocolHTTPMethod: String, jcrContentProtocolHTTPSRelaxed: Boolean, jcrContentProtocolInterface: String, jcrContentProtocolSocketTimeout: BigDecimal, jcrContentProtocolVersion: String, jcrContentProxyNTLMDomain: String, jcrContentProxyNTLMHost: String, jcrContentProxyHost: String, jcrContentProxyPassword: String, jcrContentProxyPort: BigDecimal, jcrContentProxyUser: String, jcrContentQueueBatchMaxSize: BigDecimal, jcrContentQueueBatchMode: String, jcrContentQueueBatchWaitTime: BigDecimal, jcrContentRetryDelay: String, jcrContentReverseReplication: Boolean, jcrContentSerializationType: String, jcrContentSlingResourceType: String, jcrContentSsl: String, jcrContentTransportNTLMDomain: String, jcrContentTransportNTLMHost: String, jcrContentTransportPassword: String, jcrContentTransportUri: String, jcrContentTransportUser: String, jcrContentTriggerDistribute: Boolean, jcrContentTriggerModified: Boolean, jcrContentTriggerOnOffTime: Boolean, jcrContentTriggerReceive: Boolean, jcrContentTriggerSpecific: Boolean, jcrContentUserId: String, jcrPrimaryType: String, operation: String)(implicit jcrContentCqDistributeQuery: QueryParam[Boolean], jcrContentCqDistributeTypeHintQuery: QueryParam[String], jcrContentCqNameQuery: QueryParam[String], jcrContentCqTemplateQuery: QueryParam[String], jcrContentAliasUpdateQuery: QueryParam[Boolean], jcrContentEnabledQuery: QueryParam[Boolean], jcrContentJcrDescriptionQuery: QueryParam[String], jcrContentJcrLastModifiedQuery: QueryParam[String], jcrContentJcrLastModifiedByQuery: QueryParam[String], jcrContentJcrMixinTypesQuery: QueryParam[String], jcrContentJcrTitleQuery: QueryParam[String], jcrContentLogLevelQuery: QueryParam[String], jcrContentNoStatusUpdateQuery: QueryParam[Boolean], jcrContentNoVersioningQuery: QueryParam[Boolean], jcrContentProtocolConnectTimeoutQuery: QueryParam[BigDecimal], jcrContentProtocolHTTPConnectionClosedQuery: QueryParam[Boolean], jcrContentProtocolHTTPExpiredQuery: QueryParam[String], jcrContentProtocolHTTPHeadersQuery: QueryParam[List[String]], jcrContentProtocolHTTPHeadersTypeHintQuery: QueryParam[String], jcrContentProtocolHTTPMethodQuery: QueryParam[String], jcrContentProtocolHTTPSRelaxedQuery: QueryParam[Boolean], jcrContentProtocolInterfaceQuery: QueryParam[String], jcrContentProtocolSocketTimeoutQuery: QueryParam[BigDecimal], jcrContentProtocolVersionQuery: QueryParam[String], jcrContentProxyNTLMDomainQuery: QueryParam[String], jcrContentProxyNTLMHostQuery: QueryParam[String], jcrContentProxyHostQuery: QueryParam[String], jcrContentProxyPasswordQuery: QueryParam[String], jcrContentProxyPortQuery: QueryParam[BigDecimal], jcrContentProxyUserQuery: QueryParam[String], jcrContentQueueBatchMaxSizeQuery: QueryParam[BigDecimal], jcrContentQueueBatchModeQuery: QueryParam[String], jcrContentQueueBatchWaitTimeQuery: QueryParam[BigDecimal], jcrContentRetryDelayQuery: QueryParam[String], jcrContentReverseReplicationQuery: QueryParam[Boolean], jcrContentSerializationTypeQuery: QueryParam[String], jcrContentSlingResourceTypeQuery: QueryParam[String], jcrContentSslQuery: QueryParam[String], jcrContentTransportNTLMDomainQuery: QueryParam[String], jcrContentTransportNTLMHostQuery: QueryParam[String], jcrContentTransportPasswordQuery: QueryParam[String], jcrContentTransportUriQuery: QueryParam[String], jcrContentTransportUserQuery: QueryParam[String], jcrContentTriggerDistributeQuery: QueryParam[Boolean], jcrContentTriggerModifiedQuery: QueryParam[Boolean], jcrContentTriggerOnOffTimeQuery: QueryParam[Boolean], jcrContentTriggerReceiveQuery: QueryParam[Boolean], jcrContentTriggerSpecificQuery: QueryParam[Boolean], jcrContentUserIdQuery: QueryParam[String], jcrPrimaryTypeQuery: QueryParam[String], operationQuery: QueryParam[String]): Task[Unit] = {
    val path = "/etc/replication/agents.{runmode}/{name}".replaceAll("\\{" + "runmode" + "\\}",escape(runmode.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("jcrContentCqDistribute", Some(jcr:content/cq:distributeQuery.toParamString(jcr:content/cq:distribute))), ("jcrContentCqDistributeTypeHint", Some(jcr:content/cq:distribute@TypeHintQuery.toParamString(jcr:content/cq:distribute@TypeHint))), ("jcrContentCqName", Some(jcr:content/cq:nameQuery.toParamString(jcr:content/cq:name))), ("jcrContentCqTemplate", Some(jcr:content/cq:templateQuery.toParamString(jcr:content/cq:template))), ("jcrContentAliasUpdate", Some(jcr:content/aliasUpdateQuery.toParamString(jcr:content/aliasUpdate))), ("jcrContentEnabled", Some(jcr:content/enabledQuery.toParamString(jcr:content/enabled))), ("jcrContentJcrDescription", Some(jcr:content/jcr:descriptionQuery.toParamString(jcr:content/jcr:description))), ("jcrContentJcrLastModified", Some(jcr:content/jcr:lastModifiedQuery.toParamString(jcr:content/jcr:lastModified))), ("jcrContentJcrLastModifiedBy", Some(jcr:content/jcr:lastModifiedByQuery.toParamString(jcr:content/jcr:lastModifiedBy))), ("jcrContentJcrMixinTypes", Some(jcr:content/jcr:mixinTypesQuery.toParamString(jcr:content/jcr:mixinTypes))), ("jcrContentJcrTitle", Some(jcr:content/jcr:titleQuery.toParamString(jcr:content/jcr:title))), ("jcrContentLogLevel", Some(jcr:content/logLevelQuery.toParamString(jcr:content/logLevel))), ("jcrContentNoStatusUpdate", Some(jcr:content/noStatusUpdateQuery.toParamString(jcr:content/noStatusUpdate))), ("jcrContentNoVersioning", Some(jcr:content/noVersioningQuery.toParamString(jcr:content/noVersioning))), ("jcrContentProtocolConnectTimeout", Some(jcr:content/protocolConnectTimeoutQuery.toParamString(jcr:content/protocolConnectTimeout))), ("jcrContentProtocolHTTPConnectionClosed", Some(jcr:content/protocolHTTPConnectionClosedQuery.toParamString(jcr:content/protocolHTTPConnectionClosed))), ("jcrContentProtocolHTTPExpired", Some(jcr:content/protocolHTTPExpiredQuery.toParamString(jcr:content/protocolHTTPExpired))), ("jcrContentProtocolHTTPHeaders", Some(jcr:content/protocolHTTPHeadersQuery.toParamString(jcr:content/protocolHTTPHeaders))), ("jcrContentProtocolHTTPHeadersTypeHint", Some(jcr:content/protocolHTTPHeaders@TypeHintQuery.toParamString(jcr:content/protocolHTTPHeaders@TypeHint))), ("jcrContentProtocolHTTPMethod", Some(jcr:content/protocolHTTPMethodQuery.toParamString(jcr:content/protocolHTTPMethod))), ("jcrContentProtocolHTTPSRelaxed", Some(jcr:content/protocolHTTPSRelaxedQuery.toParamString(jcr:content/protocolHTTPSRelaxed))), ("jcrContentProtocolInterface", Some(jcr:content/protocolInterfaceQuery.toParamString(jcr:content/protocolInterface))), ("jcrContentProtocolSocketTimeout", Some(jcr:content/protocolSocketTimeoutQuery.toParamString(jcr:content/protocolSocketTimeout))), ("jcrContentProtocolVersion", Some(jcr:content/protocolVersionQuery.toParamString(jcr:content/protocolVersion))), ("jcrContentProxyNTLMDomain", Some(jcr:content/proxyNTLMDomainQuery.toParamString(jcr:content/proxyNTLMDomain))), ("jcrContentProxyNTLMHost", Some(jcr:content/proxyNTLMHostQuery.toParamString(jcr:content/proxyNTLMHost))), ("jcrContentProxyHost", Some(jcr:content/proxyHostQuery.toParamString(jcr:content/proxyHost))), ("jcrContentProxyPassword", Some(jcr:content/proxyPasswordQuery.toParamString(jcr:content/proxyPassword))), ("jcrContentProxyPort", Some(jcr:content/proxyPortQuery.toParamString(jcr:content/proxyPort))), ("jcrContentProxyUser", Some(jcr:content/proxyUserQuery.toParamString(jcr:content/proxyUser))), ("jcrContentQueueBatchMaxSize", Some(jcr:content/queueBatchMaxSizeQuery.toParamString(jcr:content/queueBatchMaxSize))), ("jcrContentQueueBatchMode", Some(jcr:content/queueBatchModeQuery.toParamString(jcr:content/queueBatchMode))), ("jcrContentQueueBatchWaitTime", Some(jcr:content/queueBatchWaitTimeQuery.toParamString(jcr:content/queueBatchWaitTime))), ("jcrContentRetryDelay", Some(jcr:content/retryDelayQuery.toParamString(jcr:content/retryDelay))), ("jcrContentReverseReplication", Some(jcr:content/reverseReplicationQuery.toParamString(jcr:content/reverseReplication))), ("jcrContentSerializationType", Some(jcr:content/serializationTypeQuery.toParamString(jcr:content/serializationType))), ("jcrContentSlingResourceType", Some(jcr:content/sling:resourceTypeQuery.toParamString(jcr:content/sling:resourceType))), ("jcrContentSsl", Some(jcr:content/sslQuery.toParamString(jcr:content/ssl))), ("jcrContentTransportNTLMDomain", Some(jcr:content/transportNTLMDomainQuery.toParamString(jcr:content/transportNTLMDomain))), ("jcrContentTransportNTLMHost", Some(jcr:content/transportNTLMHostQuery.toParamString(jcr:content/transportNTLMHost))), ("jcrContentTransportPassword", Some(jcr:content/transportPasswordQuery.toParamString(jcr:content/transportPassword))), ("jcrContentTransportUri", Some(jcr:content/transportUriQuery.toParamString(jcr:content/transportUri))), ("jcrContentTransportUser", Some(jcr:content/transportUserQuery.toParamString(jcr:content/transportUser))), ("jcrContentTriggerDistribute", Some(jcr:content/triggerDistributeQuery.toParamString(jcr:content/triggerDistribute))), ("jcrContentTriggerModified", Some(jcr:content/triggerModifiedQuery.toParamString(jcr:content/triggerModified))), ("jcrContentTriggerOnOffTime", Some(jcr:content/triggerOnOffTimeQuery.toParamString(jcr:content/triggerOnOffTime))), ("jcrContentTriggerReceive", Some(jcr:content/triggerReceiveQuery.toParamString(jcr:content/triggerReceive))), ("jcrContentTriggerSpecific", Some(jcr:content/triggerSpecificQuery.toParamString(jcr:content/triggerSpecific))), ("jcrContentUserId", Some(jcr:content/userIdQuery.toParamString(jcr:content/userId))), ("jcrPrimaryType", Some(jcr:primaryTypeQuery.toParamString(jcr:primaryType))), ("operation", Some(:operationQuery.toParamString(:operation))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postAuthorizableKeystore(host: String, intermediatePath: String, authorizableId: String, operation: String, currentPassword: String, newPassword: String, rePassword: String, keyPassword: String, keyStorePass: String, alias: String, newAlias: String, removeAlias: String, certChain: File, pk: File, keyStore: File)(implicit operationQuery: QueryParam[String], currentPasswordQuery: QueryParam[String], newPasswordQuery: QueryParam[String], rePasswordQuery: QueryParam[String], keyPasswordQuery: QueryParam[String], keyStorePassQuery: QueryParam[String], aliasQuery: QueryParam[String], newAliasQuery: QueryParam[String], removeAliasQuery: QueryParam[String]): Task[KeystoreInfo] = {
    implicit val returnTypeDecoder: EntityDecoder[KeystoreInfo] = jsonOf[KeystoreInfo]

    val path = "/{intermediatePath}/{authorizableId}.ks.html".replaceAll("\\{" + "intermediatePath" + "\\}",escape(intermediatePath.toString)).replaceAll("\\{" + "authorizableId" + "\\}",escape(authorizableId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("operation", Some(:operationQuery.toParamString(:operation))), ("currentPassword", Some(currentPasswordQuery.toParamString(currentPassword))), ("newPassword", Some(newPasswordQuery.toParamString(newPassword))), ("rePassword", Some(rePasswordQuery.toParamString(rePassword))), ("keyPassword", Some(keyPasswordQuery.toParamString(keyPassword))), ("keyStorePass", Some(keyStorePassQuery.toParamString(keyStorePass))), ("alias", Some(aliasQuery.toParamString(alias))), ("newAlias", Some(newAliasQuery.toParamString(newAlias))), ("removeAlias", Some(removeAliasQuery.toParamString(removeAlias))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[KeystoreInfo](req)

    } yield resp
  }

  def postAuthorizables(host: String, authorizableId: String, intermediatePath: String, createUser: String, createGroup: String, repPassword: String, profileGivenName: String)(implicit authorizableIdQuery: QueryParam[String], intermediatePathQuery: QueryParam[String], createUserQuery: QueryParam[String], createGroupQuery: QueryParam[String], repPasswordQuery: QueryParam[String], profileGivenNameQuery: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/libs/granite/security/post/authorizables"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("authorizableId", Some(authorizableIdQuery.toParamString(authorizableId))), ("intermediatePath", Some(intermediatePathQuery.toParamString(intermediatePath))), ("createUser", Some(createUserQuery.toParamString(createUser))), ("createGroup", Some(createGroupQuery.toParamString(createGroup))), ("repPassword", Some(rep:passwordQuery.toParamString(rep:password))), ("profileGivenName", Some(profile/givenNameQuery.toParamString(profile/givenName))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }

  def postConfigAdobeGraniteSamlAuthenticationHandler(host: String, keyStorePassword: String, keyStorePasswordTypeHint: String, serviceRanking: Integer, serviceRankingTypeHint: String, idpHttpRedirect: Boolean, idpHttpRedirectTypeHint: String, createUser: Boolean, createUserTypeHint: String, defaultRedirectUrl: String, defaultRedirectUrlTypeHint: String, userIDAttribute: String, userIDAttributeTypeHint: String, defaultGroups: List[String] = List.empty[String] , defaultGroupsTypeHint: String, idpCertAlias: String, idpCertAliasTypeHint: String, addGroupMemberships: Boolean, addGroupMembershipsTypeHint: String, `path`: List[String] = List.empty[String] , pathTypeHint: String, synchronizeAttributes: List[String] = List.empty[String] , synchronizeAttributesTypeHint: String, clockTolerance: Integer, clockToleranceTypeHint: String, groupMembershipAttribute: String, groupMembershipAttributeTypeHint: String, idpUrl: String, idpUrlTypeHint: String, logoutUrl: String, logoutUrlTypeHint: String, serviceProviderEntityId: String, serviceProviderEntityIdTypeHint: String, assertionConsumerServiceURL: String, assertionConsumerServiceURLTypeHint: String, handleLogout: Boolean, handleLogoutTypeHint: String, spPrivateKeyAlias: String, spPrivateKeyAliasTypeHint: String, useEncryption: Boolean, useEncryptionTypeHint: String, nameIdFormat: String, nameIdFormatTypeHint: String, digestMethod: String, digestMethodTypeHint: String, signatureMethod: String, signatureMethodTypeHint: String, userIntermediatePath: String, userIntermediatePathTypeHint: String)(implicit keyStorePasswordQuery: QueryParam[String], keyStorePasswordTypeHintQuery: QueryParam[String], serviceRankingQuery: QueryParam[Integer], serviceRankingTypeHintQuery: QueryParam[String], idpHttpRedirectQuery: QueryParam[Boolean], idpHttpRedirectTypeHintQuery: QueryParam[String], createUserQuery: QueryParam[Boolean], createUserTypeHintQuery: QueryParam[String], defaultRedirectUrlQuery: QueryParam[String], defaultRedirectUrlTypeHintQuery: QueryParam[String], userIDAttributeQuery: QueryParam[String], userIDAttributeTypeHintQuery: QueryParam[String], defaultGroupsQuery: QueryParam[List[String]], defaultGroupsTypeHintQuery: QueryParam[String], idpCertAliasQuery: QueryParam[String], idpCertAliasTypeHintQuery: QueryParam[String], addGroupMembershipsQuery: QueryParam[Boolean], addGroupMembershipsTypeHintQuery: QueryParam[String], `path`Query: QueryParam[List[String]], pathTypeHintQuery: QueryParam[String], synchronizeAttributesQuery: QueryParam[List[String]], synchronizeAttributesTypeHintQuery: QueryParam[String], clockToleranceQuery: QueryParam[Integer], clockToleranceTypeHintQuery: QueryParam[String], groupMembershipAttributeQuery: QueryParam[String], groupMembershipAttributeTypeHintQuery: QueryParam[String], idpUrlQuery: QueryParam[String], idpUrlTypeHintQuery: QueryParam[String], logoutUrlQuery: QueryParam[String], logoutUrlTypeHintQuery: QueryParam[String], serviceProviderEntityIdQuery: QueryParam[String], serviceProviderEntityIdTypeHintQuery: QueryParam[String], assertionConsumerServiceURLQuery: QueryParam[String], assertionConsumerServiceURLTypeHintQuery: QueryParam[String], handleLogoutQuery: QueryParam[Boolean], handleLogoutTypeHintQuery: QueryParam[String], spPrivateKeyAliasQuery: QueryParam[String], spPrivateKeyAliasTypeHintQuery: QueryParam[String], useEncryptionQuery: QueryParam[Boolean], useEncryptionTypeHintQuery: QueryParam[String], nameIdFormatQuery: QueryParam[String], nameIdFormatTypeHintQuery: QueryParam[String], digestMethodQuery: QueryParam[String], digestMethodTypeHintQuery: QueryParam[String], signatureMethodQuery: QueryParam[String], signatureMethodTypeHintQuery: QueryParam[String], userIntermediatePathQuery: QueryParam[String], userIntermediatePathTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("keyStorePassword", Some(keyStorePasswordQuery.toParamString(keyStorePassword))), ("keyStorePasswordTypeHint", Some(keyStorePassword@TypeHintQuery.toParamString(keyStorePassword@TypeHint))), ("serviceRanking", Some(service.rankingQuery.toParamString(service.ranking))), ("serviceRankingTypeHint", Some(service.ranking@TypeHintQuery.toParamString(service.ranking@TypeHint))), ("idpHttpRedirect", Some(idpHttpRedirectQuery.toParamString(idpHttpRedirect))), ("idpHttpRedirectTypeHint", Some(idpHttpRedirect@TypeHintQuery.toParamString(idpHttpRedirect@TypeHint))), ("createUser", Some(createUserQuery.toParamString(createUser))), ("createUserTypeHint", Some(createUser@TypeHintQuery.toParamString(createUser@TypeHint))), ("defaultRedirectUrl", Some(defaultRedirectUrlQuery.toParamString(defaultRedirectUrl))), ("defaultRedirectUrlTypeHint", Some(defaultRedirectUrl@TypeHintQuery.toParamString(defaultRedirectUrl@TypeHint))), ("userIDAttribute", Some(userIDAttributeQuery.toParamString(userIDAttribute))), ("userIDAttributeTypeHint", Some(userIDAttribute@TypeHintQuery.toParamString(userIDAttribute@TypeHint))), ("defaultGroups", Some(defaultGroupsQuery.toParamString(defaultGroups))), ("defaultGroupsTypeHint", Some(defaultGroups@TypeHintQuery.toParamString(defaultGroups@TypeHint))), ("idpCertAlias", Some(idpCertAliasQuery.toParamString(idpCertAlias))), ("idpCertAliasTypeHint", Some(idpCertAlias@TypeHintQuery.toParamString(idpCertAlias@TypeHint))), ("addGroupMemberships", Some(addGroupMembershipsQuery.toParamString(addGroupMemberships))), ("addGroupMembershipsTypeHint", Some(addGroupMemberships@TypeHintQuery.toParamString(addGroupMemberships@TypeHint))), ("`path`", Some(pathQuery.toParamString(path))), ("pathTypeHint", Some(path@TypeHintQuery.toParamString(path@TypeHint))), ("synchronizeAttributes", Some(synchronizeAttributesQuery.toParamString(synchronizeAttributes))), ("synchronizeAttributesTypeHint", Some(synchronizeAttributes@TypeHintQuery.toParamString(synchronizeAttributes@TypeHint))), ("clockTolerance", Some(clockToleranceQuery.toParamString(clockTolerance))), ("clockToleranceTypeHint", Some(clockTolerance@TypeHintQuery.toParamString(clockTolerance@TypeHint))), ("groupMembershipAttribute", Some(groupMembershipAttributeQuery.toParamString(groupMembershipAttribute))), ("groupMembershipAttributeTypeHint", Some(groupMembershipAttribute@TypeHintQuery.toParamString(groupMembershipAttribute@TypeHint))), ("idpUrl", Some(idpUrlQuery.toParamString(idpUrl))), ("idpUrlTypeHint", Some(idpUrl@TypeHintQuery.toParamString(idpUrl@TypeHint))), ("logoutUrl", Some(logoutUrlQuery.toParamString(logoutUrl))), ("logoutUrlTypeHint", Some(logoutUrl@TypeHintQuery.toParamString(logoutUrl@TypeHint))), ("serviceProviderEntityId", Some(serviceProviderEntityIdQuery.toParamString(serviceProviderEntityId))), ("serviceProviderEntityIdTypeHint", Some(serviceProviderEntityId@TypeHintQuery.toParamString(serviceProviderEntityId@TypeHint))), ("assertionConsumerServiceURL", Some(assertionConsumerServiceURLQuery.toParamString(assertionConsumerServiceURL))), ("assertionConsumerServiceURLTypeHint", Some(assertionConsumerServiceURL@TypeHintQuery.toParamString(assertionConsumerServiceURL@TypeHint))), ("handleLogout", Some(handleLogoutQuery.toParamString(handleLogout))), ("handleLogoutTypeHint", Some(handleLogout@TypeHintQuery.toParamString(handleLogout@TypeHint))), ("spPrivateKeyAlias", Some(spPrivateKeyAliasQuery.toParamString(spPrivateKeyAlias))), ("spPrivateKeyAliasTypeHint", Some(spPrivateKeyAlias@TypeHintQuery.toParamString(spPrivateKeyAlias@TypeHint))), ("useEncryption", Some(useEncryptionQuery.toParamString(useEncryption))), ("useEncryptionTypeHint", Some(useEncryption@TypeHintQuery.toParamString(useEncryption@TypeHint))), ("nameIdFormat", Some(nameIdFormatQuery.toParamString(nameIdFormat))), ("nameIdFormatTypeHint", Some(nameIdFormat@TypeHintQuery.toParamString(nameIdFormat@TypeHint))), ("digestMethod", Some(digestMethodQuery.toParamString(digestMethod))), ("digestMethodTypeHint", Some(digestMethod@TypeHintQuery.toParamString(digestMethod@TypeHint))), ("signatureMethod", Some(signatureMethodQuery.toParamString(signatureMethod))), ("signatureMethodTypeHint", Some(signatureMethod@TypeHintQuery.toParamString(signatureMethod@TypeHint))), ("userIntermediatePath", Some(userIntermediatePathQuery.toParamString(userIntermediatePath))), ("userIntermediatePathTypeHint", Some(userIntermediatePath@TypeHintQuery.toParamString(userIntermediatePath@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postConfigApacheFelixJettyBasedHttpService(host: String, orgApacheFelixHttpsNio: Boolean, orgApacheFelixHttpsNioTypeHint: String, orgApacheFelixHttpsKeystore: String, orgApacheFelixHttpsKeystoreTypeHint: String, orgApacheFelixHttpsKeystorePassword: String, orgApacheFelixHttpsKeystorePasswordTypeHint: String, orgApacheFelixHttpsKeystoreKey: String, orgApacheFelixHttpsKeystoreKeyTypeHint: String, orgApacheFelixHttpsKeystoreKeyPassword: String, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint: String, orgApacheFelixHttpsTruststore: String, orgApacheFelixHttpsTruststoreTypeHint: String, orgApacheFelixHttpsTruststorePassword: String, orgApacheFelixHttpsTruststorePasswordTypeHint: String, orgApacheFelixHttpsClientcertificate: String, orgApacheFelixHttpsClientcertificateTypeHint: String, orgApacheFelixHttpsEnable: Boolean, orgApacheFelixHttpsEnableTypeHint: String, orgOsgiServiceHttpPortSecure: String, orgOsgiServiceHttpPortSecureTypeHint: String)(implicit orgApacheFelixHttpsNioQuery: QueryParam[Boolean], orgApacheFelixHttpsNioTypeHintQuery: QueryParam[String], orgApacheFelixHttpsKeystoreQuery: QueryParam[String], orgApacheFelixHttpsKeystoreTypeHintQuery: QueryParam[String], orgApacheFelixHttpsKeystorePasswordQuery: QueryParam[String], orgApacheFelixHttpsKeystorePasswordTypeHintQuery: QueryParam[String], orgApacheFelixHttpsKeystoreKeyQuery: QueryParam[String], orgApacheFelixHttpsKeystoreKeyTypeHintQuery: QueryParam[String], orgApacheFelixHttpsKeystoreKeyPasswordQuery: QueryParam[String], orgApacheFelixHttpsKeystoreKeyPasswordTypeHintQuery: QueryParam[String], orgApacheFelixHttpsTruststoreQuery: QueryParam[String], orgApacheFelixHttpsTruststoreTypeHintQuery: QueryParam[String], orgApacheFelixHttpsTruststorePasswordQuery: QueryParam[String], orgApacheFelixHttpsTruststorePasswordTypeHintQuery: QueryParam[String], orgApacheFelixHttpsClientcertificateQuery: QueryParam[String], orgApacheFelixHttpsClientcertificateTypeHintQuery: QueryParam[String], orgApacheFelixHttpsEnableQuery: QueryParam[Boolean], orgApacheFelixHttpsEnableTypeHintQuery: QueryParam[String], orgOsgiServiceHttpPortSecureQuery: QueryParam[String], orgOsgiServiceHttpPortSecureTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/org.apache.felix.http"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("orgApacheFelixHttpsNio", Some(org.apache.felix.https.nioQuery.toParamString(org.apache.felix.https.nio))), ("orgApacheFelixHttpsNioTypeHint", Some(org.apache.felix.https.nio@TypeHintQuery.toParamString(org.apache.felix.https.nio@TypeHint))), ("orgApacheFelixHttpsKeystore", Some(org.apache.felix.https.keystoreQuery.toParamString(org.apache.felix.https.keystore))), ("orgApacheFelixHttpsKeystoreTypeHint", Some(org.apache.felix.https.keystore@TypeHintQuery.toParamString(org.apache.felix.https.keystore@TypeHint))), ("orgApacheFelixHttpsKeystorePassword", Some(org.apache.felix.https.keystore.passwordQuery.toParamString(org.apache.felix.https.keystore.password))), ("orgApacheFelixHttpsKeystorePasswordTypeHint", Some(org.apache.felix.https.keystore.password@TypeHintQuery.toParamString(org.apache.felix.https.keystore.password@TypeHint))), ("orgApacheFelixHttpsKeystoreKey", Some(org.apache.felix.https.keystore.keyQuery.toParamString(org.apache.felix.https.keystore.key))), ("orgApacheFelixHttpsKeystoreKeyTypeHint", Some(org.apache.felix.https.keystore.key@TypeHintQuery.toParamString(org.apache.felix.https.keystore.key@TypeHint))), ("orgApacheFelixHttpsKeystoreKeyPassword", Some(org.apache.felix.https.keystore.key.passwordQuery.toParamString(org.apache.felix.https.keystore.key.password))), ("orgApacheFelixHttpsKeystoreKeyPasswordTypeHint", Some(org.apache.felix.https.keystore.key.password@TypeHintQuery.toParamString(org.apache.felix.https.keystore.key.password@TypeHint))), ("orgApacheFelixHttpsTruststore", Some(org.apache.felix.https.truststoreQuery.toParamString(org.apache.felix.https.truststore))), ("orgApacheFelixHttpsTruststoreTypeHint", Some(org.apache.felix.https.truststore@TypeHintQuery.toParamString(org.apache.felix.https.truststore@TypeHint))), ("orgApacheFelixHttpsTruststorePassword", Some(org.apache.felix.https.truststore.passwordQuery.toParamString(org.apache.felix.https.truststore.password))), ("orgApacheFelixHttpsTruststorePasswordTypeHint", Some(org.apache.felix.https.truststore.password@TypeHintQuery.toParamString(org.apache.felix.https.truststore.password@TypeHint))), ("orgApacheFelixHttpsClientcertificate", Some(org.apache.felix.https.clientcertificateQuery.toParamString(org.apache.felix.https.clientcertificate))), ("orgApacheFelixHttpsClientcertificateTypeHint", Some(org.apache.felix.https.clientcertificate@TypeHintQuery.toParamString(org.apache.felix.https.clientcertificate@TypeHint))), ("orgApacheFelixHttpsEnable", Some(org.apache.felix.https.enableQuery.toParamString(org.apache.felix.https.enable))), ("orgApacheFelixHttpsEnableTypeHint", Some(org.apache.felix.https.enable@TypeHintQuery.toParamString(org.apache.felix.https.enable@TypeHint))), ("orgOsgiServiceHttpPortSecure", Some(org.osgi.service.http.port.secureQuery.toParamString(org.osgi.service.http.port.secure))), ("orgOsgiServiceHttpPortSecureTypeHint", Some(org.osgi.service.http.port.secure@TypeHintQuery.toParamString(org.osgi.service.http.port.secure@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postConfigApacheHttpComponentsProxyConfiguration(host: String, proxyHost: String, proxyHostTypeHint: String, proxyPort: Integer, proxyPortTypeHint: String, proxyExceptions: List[String] = List.empty[String] , proxyExceptionsTypeHint: String, proxyEnabled: Boolean, proxyEnabledTypeHint: String, proxyUser: String, proxyUserTypeHint: String, proxyPassword: String, proxyPasswordTypeHint: String)(implicit proxyHostQuery: QueryParam[String], proxyHostTypeHintQuery: QueryParam[String], proxyPortQuery: QueryParam[Integer], proxyPortTypeHintQuery: QueryParam[String], proxyExceptionsQuery: QueryParam[List[String]], proxyExceptionsTypeHintQuery: QueryParam[String], proxyEnabledQuery: QueryParam[Boolean], proxyEnabledTypeHintQuery: QueryParam[String], proxyUserQuery: QueryParam[String], proxyUserTypeHintQuery: QueryParam[String], proxyPasswordQuery: QueryParam[String], proxyPasswordTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/org.apache.http.proxyconfigurator.config"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("proxyHost", Some(proxy.hostQuery.toParamString(proxy.host))), ("proxyHostTypeHint", Some(proxy.host@TypeHintQuery.toParamString(proxy.host@TypeHint))), ("proxyPort", Some(proxy.portQuery.toParamString(proxy.port))), ("proxyPortTypeHint", Some(proxy.port@TypeHintQuery.toParamString(proxy.port@TypeHint))), ("proxyExceptions", Some(proxy.exceptionsQuery.toParamString(proxy.exceptions))), ("proxyExceptionsTypeHint", Some(proxy.exceptions@TypeHintQuery.toParamString(proxy.exceptions@TypeHint))), ("proxyEnabled", Some(proxy.enabledQuery.toParamString(proxy.enabled))), ("proxyEnabledTypeHint", Some(proxy.enabled@TypeHintQuery.toParamString(proxy.enabled@TypeHint))), ("proxyUser", Some(proxy.userQuery.toParamString(proxy.user))), ("proxyUserTypeHint", Some(proxy.user@TypeHintQuery.toParamString(proxy.user@TypeHint))), ("proxyPassword", Some(proxy.passwordQuery.toParamString(proxy.password))), ("proxyPasswordTypeHint", Some(proxy.password@TypeHintQuery.toParamString(proxy.password@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postConfigApacheSlingDavExServlet(host: String, alias: String, aliasTypeHint: String, davCreateAbsoluteUri: Boolean, davCreateAbsoluteUriTypeHint: String)(implicit aliasQuery: QueryParam[String], aliasTypeHintQuery: QueryParam[String], davCreateAbsoluteUriQuery: QueryParam[Boolean], davCreateAbsoluteUriTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("alias", Some(aliasQuery.toParamString(alias))), ("aliasTypeHint", Some(alias@TypeHintQuery.toParamString(alias@TypeHint))), ("davCreateAbsoluteUri", Some(dav.create-absolute-uriQuery.toParamString(dav.create-absolute-uri))), ("davCreateAbsoluteUriTypeHint", Some(dav.create-absolute-uri@TypeHintQuery.toParamString(dav.create-absolute-uri@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postConfigApacheSlingGetServlet(host: String, jsonMaximumresults: String, jsonMaximumresultsTypeHint: String, enableHtml: Boolean, enableHtmlTypeHint: String, enableTxt: Boolean, enableTxtTypeHint: String, enableXml: Boolean, enableXmlTypeHint: String)(implicit jsonMaximumresultsQuery: QueryParam[String], jsonMaximumresultsTypeHintQuery: QueryParam[String], enableHtmlQuery: QueryParam[Boolean], enableHtmlTypeHintQuery: QueryParam[String], enableTxtQuery: QueryParam[Boolean], enableTxtTypeHintQuery: QueryParam[String], enableXmlQuery: QueryParam[Boolean], enableXmlTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("jsonMaximumresults", Some(json.maximumresultsQuery.toParamString(json.maximumresults))), ("jsonMaximumresultsTypeHint", Some(json.maximumresults@TypeHintQuery.toParamString(json.maximumresults@TypeHint))), ("enableHtml", Some(enable.htmlQuery.toParamString(enable.html))), ("enableHtmlTypeHint", Some(enable.html@TypeHintQuery.toParamString(enable.html@TypeHint))), ("enableTxt", Some(enable.txtQuery.toParamString(enable.txt))), ("enableTxtTypeHint", Some(enable.txt@TypeHintQuery.toParamString(enable.txt@TypeHint))), ("enableXml", Some(enable.xmlQuery.toParamString(enable.xml))), ("enableXmlTypeHint", Some(enable.xml@TypeHintQuery.toParamString(enable.xml@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postConfigApacheSlingReferrerFilter(host: String, allowEmpty: Boolean, allowEmptyTypeHint: String, allowHosts: String, allowHostsTypeHint: String, allowHostsRegexp: String, allowHostsRegexpTypeHint: String, filterMethods: String, filterMethodsTypeHint: String)(implicit allowEmptyQuery: QueryParam[Boolean], allowEmptyTypeHintQuery: QueryParam[String], allowHostsQuery: QueryParam[String], allowHostsTypeHintQuery: QueryParam[String], allowHostsRegexpQuery: QueryParam[String], allowHostsRegexpTypeHintQuery: QueryParam[String], filterMethodsQuery: QueryParam[String], filterMethodsTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("allowEmpty", Some(allow.emptyQuery.toParamString(allow.empty))), ("allowEmptyTypeHint", Some(allow.empty@TypeHintQuery.toParamString(allow.empty@TypeHint))), ("allowHosts", Some(allow.hostsQuery.toParamString(allow.hosts))), ("allowHostsTypeHint", Some(allow.hosts@TypeHintQuery.toParamString(allow.hosts@TypeHint))), ("allowHostsRegexp", Some(allow.hosts.regexpQuery.toParamString(allow.hosts.regexp))), ("allowHostsRegexpTypeHint", Some(allow.hosts.regexp@TypeHintQuery.toParamString(allow.hosts.regexp@TypeHint))), ("filterMethods", Some(filter.methodsQuery.toParamString(filter.methods))), ("filterMethodsTypeHint", Some(filter.methods@TypeHintQuery.toParamString(filter.methods@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postConfigProperty(host: String, configNodeName: String): Task[Unit] = {
    val path = "/apps/system/config/{configNodeName}".replaceAll("\\{" + "configNodeName" + "\\}",escape(configNodeName.toString))

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

  def postNode(host: String, `path`: String, name: String, operation: String, deleteAuthorizable: String, file: File)(implicit operationQuery: QueryParam[String], deleteAuthorizableQuery: QueryParam[String]): Task[Unit] = {
    val path = "/{path}/{name}".replaceAll("\\{" + "path" + "\\}",escape(`path`.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("operation", Some(:operationQuery.toParamString(:operation))), ("deleteAuthorizable", Some(deleteAuthorizableQuery.toParamString(deleteAuthorizable))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postNodeRw(host: String, `path`: String, name: String, addMembers: String)(implicit addMembersQuery: QueryParam[String]): Task[Unit] = {
    val path = "/{path}/{name}.rw.html".replaceAll("\\{" + "path" + "\\}",escape(`path`.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("addMembers", Some(addMembersQuery.toParamString(addMembers))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postPath(host: String, `path`: String, jcrPrimaryType: String, name: String)(implicit jcrPrimaryTypeQuery: QueryParam[String], nameQuery: QueryParam[String]): Task[Unit] = {
    val path = "/{path}/".replaceAll("\\{" + "path" + "\\}",escape(`path`.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("jcrPrimaryType", Some(jcr:primaryTypeQuery.toParamString(jcr:primaryType))), ("name", Some(:nameQuery.toParamString(:name))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postQuery(host: String, `path`: String, pLimit: BigDecimal, `1property`: String, `1propertyValue`: String)(implicit `path`Query: QueryParam[String], pLimitQuery: QueryParam[BigDecimal], `1property`Query: QueryParam[String], `1propertyValue`Query: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/bin/querybuilder.json"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("`path`", Some(pathQuery.toParamString(path))), ("pLimit", Some(p.limitQuery.toParamString(p.limit))), ("`1property`", Some(1_propertyQuery.toParamString(1_property))), ("`1propertyValue`", Some(1_property.valueQuery.toParamString(1_property.value))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }

  def postTreeActivation(host: String, ignoredeactivated: Boolean, onlymodified: Boolean, `path`: String, cmd: String = activate)(implicit ignoredeactivatedQuery: QueryParam[Boolean], onlymodifiedQuery: QueryParam[Boolean], `path`Query: QueryParam[String], cmdQuery: QueryParam[String]): Task[Unit] = {
    val path = "/libs/replication/treeactivation.html"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("ignoredeactivated", Some(ignoredeactivatedQuery.toParamString(ignoredeactivated))), ("onlymodified", Some(onlymodifiedQuery.toParamString(onlymodified))), ("`path`", Some(pathQuery.toParamString(path))), ("cmd", Some(cmdQuery.toParamString(cmd))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postTruststore(host: String, operation: String, newPassword: String, rePassword: String, keyStoreType: String, removeAlias: String, certificate: File)(implicit operationQuery: QueryParam[String], newPasswordQuery: QueryParam[String], rePasswordQuery: QueryParam[String], keyStoreTypeQuery: QueryParam[String], removeAliasQuery: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/libs/granite/security/post/truststore"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("operation", Some(:operationQuery.toParamString(:operation))), ("newPassword", Some(newPasswordQuery.toParamString(newPassword))), ("rePassword", Some(rePasswordQuery.toParamString(rePassword))), ("keyStoreType", Some(keyStoreTypeQuery.toParamString(keyStoreType))), ("removeAlias", Some(removeAliasQuery.toParamString(removeAlias))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }

  def postTruststorePKCS12(host: String, truststoreP12: File): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/etc/truststore"

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
      resp          <- client.expect[String](req)

    } yield resp
  }

}

class HttpServiceSlingApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteAgent(runmode: String, name: String): Task[Unit] = {
    val path = "/etc/replication/agents.{runmode}/{name}".replaceAll("\\{" + "runmode" + "\\}",escape(runmode.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString))

    val httpMethod = Method.DELETE
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

  def deleteNode(`path`: String, name: String): Task[Unit] = {
    val path = "/{path}/{name}".replaceAll("\\{" + "path" + "\\}",escape(`path`.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString))

    val httpMethod = Method.DELETE
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

  def getAgent(runmode: String, name: String): Task[Unit] = {
    val path = "/etc/replication/agents.{runmode}/{name}".replaceAll("\\{" + "runmode" + "\\}",escape(runmode.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString))

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
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def getAgents(runmode: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/etc/replication/agents.{runmode}.-1.json".replaceAll("\\{" + "runmode" + "\\}",escape(runmode.toString))

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

  def getAuthorizableKeystore(intermediatePath: String, authorizableId: String): Task[KeystoreInfo] = {
    implicit val returnTypeDecoder: EntityDecoder[KeystoreInfo] = jsonOf[KeystoreInfo]

    val path = "/{intermediatePath}/{authorizableId}.ks.json".replaceAll("\\{" + "intermediatePath" + "\\}",escape(intermediatePath.toString)).replaceAll("\\{" + "authorizableId" + "\\}",escape(authorizableId.toString))

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
      resp          <- client.expect[KeystoreInfo](req)

    } yield resp
  }

  def getKeystore(intermediatePath: String, authorizableId: String): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/{intermediatePath}/{authorizableId}/keystore/store.p12".replaceAll("\\{" + "intermediatePath" + "\\}",escape(intermediatePath.toString)).replaceAll("\\{" + "authorizableId" + "\\}",escape(authorizableId.toString))

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
      resp          <- client.expect[File](req)

    } yield resp
  }

  def getNode(`path`: String, name: String): Task[Unit] = {
    val path = "/{path}/{name}".replaceAll("\\{" + "path" + "\\}",escape(`path`.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString))

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
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def getPackage(group: String, name: String, version: String): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/etc/packages/{group}/{name}-{version}.zip".replaceAll("\\{" + "group" + "\\}",escape(group.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString)).replaceAll("\\{" + "version" + "\\}",escape(version.toString))

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
      resp          <- client.expect[File](req)

    } yield resp
  }

  def getPackageFilter(group: String, name: String, version: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json".replaceAll("\\{" + "group" + "\\}",escape(group.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString)).replaceAll("\\{" + "version" + "\\}",escape(version.toString))

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

  def getQuery(`path`: String, pLimit: BigDecimal, `1property`: String, `1propertyValue`: String)(implicit `path`Query: QueryParam[String], pLimitQuery: QueryParam[BigDecimal], `1property`Query: QueryParam[String], `1propertyValue`Query: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/bin/querybuilder.json"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("`path`", Some(pathQuery.toParamString(path))), ("pLimit", Some(p.limitQuery.toParamString(p.limit))), ("`1property`", Some(1_propertyQuery.toParamString(1_property))), ("`1propertyValue`", Some(1_property.valueQuery.toParamString(1_property.value))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }

  def getTruststore(): Task[File] = {
    implicit val returnTypeDecoder: EntityDecoder[File] = jsonOf[File]

    val path = "/etc/truststore/truststore.p12"

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
      resp          <- client.expect[File](req)

    } yield resp
  }

  def getTruststoreInfo(): Task[TruststoreInfo] = {
    implicit val returnTypeDecoder: EntityDecoder[TruststoreInfo] = jsonOf[TruststoreInfo]

    val path = "/libs/granite/security/truststore.json"

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
      resp          <- client.expect[TruststoreInfo](req)

    } yield resp
  }

  def postAgent(runmode: String, name: String, jcrContentCqDistribute: Boolean, jcrContentCqDistributeTypeHint: String, jcrContentCqName: String, jcrContentCqTemplate: String, jcrContentAliasUpdate: Boolean, jcrContentEnabled: Boolean, jcrContentJcrDescription: String, jcrContentJcrLastModified: String, jcrContentJcrLastModifiedBy: String, jcrContentJcrMixinTypes: String, jcrContentJcrTitle: String, jcrContentLogLevel: String, jcrContentNoStatusUpdate: Boolean, jcrContentNoVersioning: Boolean, jcrContentProtocolConnectTimeout: BigDecimal, jcrContentProtocolHTTPConnectionClosed: Boolean, jcrContentProtocolHTTPExpired: String, jcrContentProtocolHTTPHeaders: List[String] = List.empty[String] , jcrContentProtocolHTTPHeadersTypeHint: String, jcrContentProtocolHTTPMethod: String, jcrContentProtocolHTTPSRelaxed: Boolean, jcrContentProtocolInterface: String, jcrContentProtocolSocketTimeout: BigDecimal, jcrContentProtocolVersion: String, jcrContentProxyNTLMDomain: String, jcrContentProxyNTLMHost: String, jcrContentProxyHost: String, jcrContentProxyPassword: String, jcrContentProxyPort: BigDecimal, jcrContentProxyUser: String, jcrContentQueueBatchMaxSize: BigDecimal, jcrContentQueueBatchMode: String, jcrContentQueueBatchWaitTime: BigDecimal, jcrContentRetryDelay: String, jcrContentReverseReplication: Boolean, jcrContentSerializationType: String, jcrContentSlingResourceType: String, jcrContentSsl: String, jcrContentTransportNTLMDomain: String, jcrContentTransportNTLMHost: String, jcrContentTransportPassword: String, jcrContentTransportUri: String, jcrContentTransportUser: String, jcrContentTriggerDistribute: Boolean, jcrContentTriggerModified: Boolean, jcrContentTriggerOnOffTime: Boolean, jcrContentTriggerReceive: Boolean, jcrContentTriggerSpecific: Boolean, jcrContentUserId: String, jcrPrimaryType: String, operation: String)(implicit jcrContentCqDistributeQuery: QueryParam[Boolean], jcrContentCqDistributeTypeHintQuery: QueryParam[String], jcrContentCqNameQuery: QueryParam[String], jcrContentCqTemplateQuery: QueryParam[String], jcrContentAliasUpdateQuery: QueryParam[Boolean], jcrContentEnabledQuery: QueryParam[Boolean], jcrContentJcrDescriptionQuery: QueryParam[String], jcrContentJcrLastModifiedQuery: QueryParam[String], jcrContentJcrLastModifiedByQuery: QueryParam[String], jcrContentJcrMixinTypesQuery: QueryParam[String], jcrContentJcrTitleQuery: QueryParam[String], jcrContentLogLevelQuery: QueryParam[String], jcrContentNoStatusUpdateQuery: QueryParam[Boolean], jcrContentNoVersioningQuery: QueryParam[Boolean], jcrContentProtocolConnectTimeoutQuery: QueryParam[BigDecimal], jcrContentProtocolHTTPConnectionClosedQuery: QueryParam[Boolean], jcrContentProtocolHTTPExpiredQuery: QueryParam[String], jcrContentProtocolHTTPHeadersQuery: QueryParam[List[String]], jcrContentProtocolHTTPHeadersTypeHintQuery: QueryParam[String], jcrContentProtocolHTTPMethodQuery: QueryParam[String], jcrContentProtocolHTTPSRelaxedQuery: QueryParam[Boolean], jcrContentProtocolInterfaceQuery: QueryParam[String], jcrContentProtocolSocketTimeoutQuery: QueryParam[BigDecimal], jcrContentProtocolVersionQuery: QueryParam[String], jcrContentProxyNTLMDomainQuery: QueryParam[String], jcrContentProxyNTLMHostQuery: QueryParam[String], jcrContentProxyHostQuery: QueryParam[String], jcrContentProxyPasswordQuery: QueryParam[String], jcrContentProxyPortQuery: QueryParam[BigDecimal], jcrContentProxyUserQuery: QueryParam[String], jcrContentQueueBatchMaxSizeQuery: QueryParam[BigDecimal], jcrContentQueueBatchModeQuery: QueryParam[String], jcrContentQueueBatchWaitTimeQuery: QueryParam[BigDecimal], jcrContentRetryDelayQuery: QueryParam[String], jcrContentReverseReplicationQuery: QueryParam[Boolean], jcrContentSerializationTypeQuery: QueryParam[String], jcrContentSlingResourceTypeQuery: QueryParam[String], jcrContentSslQuery: QueryParam[String], jcrContentTransportNTLMDomainQuery: QueryParam[String], jcrContentTransportNTLMHostQuery: QueryParam[String], jcrContentTransportPasswordQuery: QueryParam[String], jcrContentTransportUriQuery: QueryParam[String], jcrContentTransportUserQuery: QueryParam[String], jcrContentTriggerDistributeQuery: QueryParam[Boolean], jcrContentTriggerModifiedQuery: QueryParam[Boolean], jcrContentTriggerOnOffTimeQuery: QueryParam[Boolean], jcrContentTriggerReceiveQuery: QueryParam[Boolean], jcrContentTriggerSpecificQuery: QueryParam[Boolean], jcrContentUserIdQuery: QueryParam[String], jcrPrimaryTypeQuery: QueryParam[String], operationQuery: QueryParam[String]): Task[Unit] = {
    val path = "/etc/replication/agents.{runmode}/{name}".replaceAll("\\{" + "runmode" + "\\}",escape(runmode.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("jcrContentCqDistribute", Some(jcr:content/cq:distributeQuery.toParamString(jcr:content/cq:distribute))), ("jcrContentCqDistributeTypeHint", Some(jcr:content/cq:distribute@TypeHintQuery.toParamString(jcr:content/cq:distribute@TypeHint))), ("jcrContentCqName", Some(jcr:content/cq:nameQuery.toParamString(jcr:content/cq:name))), ("jcrContentCqTemplate", Some(jcr:content/cq:templateQuery.toParamString(jcr:content/cq:template))), ("jcrContentAliasUpdate", Some(jcr:content/aliasUpdateQuery.toParamString(jcr:content/aliasUpdate))), ("jcrContentEnabled", Some(jcr:content/enabledQuery.toParamString(jcr:content/enabled))), ("jcrContentJcrDescription", Some(jcr:content/jcr:descriptionQuery.toParamString(jcr:content/jcr:description))), ("jcrContentJcrLastModified", Some(jcr:content/jcr:lastModifiedQuery.toParamString(jcr:content/jcr:lastModified))), ("jcrContentJcrLastModifiedBy", Some(jcr:content/jcr:lastModifiedByQuery.toParamString(jcr:content/jcr:lastModifiedBy))), ("jcrContentJcrMixinTypes", Some(jcr:content/jcr:mixinTypesQuery.toParamString(jcr:content/jcr:mixinTypes))), ("jcrContentJcrTitle", Some(jcr:content/jcr:titleQuery.toParamString(jcr:content/jcr:title))), ("jcrContentLogLevel", Some(jcr:content/logLevelQuery.toParamString(jcr:content/logLevel))), ("jcrContentNoStatusUpdate", Some(jcr:content/noStatusUpdateQuery.toParamString(jcr:content/noStatusUpdate))), ("jcrContentNoVersioning", Some(jcr:content/noVersioningQuery.toParamString(jcr:content/noVersioning))), ("jcrContentProtocolConnectTimeout", Some(jcr:content/protocolConnectTimeoutQuery.toParamString(jcr:content/protocolConnectTimeout))), ("jcrContentProtocolHTTPConnectionClosed", Some(jcr:content/protocolHTTPConnectionClosedQuery.toParamString(jcr:content/protocolHTTPConnectionClosed))), ("jcrContentProtocolHTTPExpired", Some(jcr:content/protocolHTTPExpiredQuery.toParamString(jcr:content/protocolHTTPExpired))), ("jcrContentProtocolHTTPHeaders", Some(jcr:content/protocolHTTPHeadersQuery.toParamString(jcr:content/protocolHTTPHeaders))), ("jcrContentProtocolHTTPHeadersTypeHint", Some(jcr:content/protocolHTTPHeaders@TypeHintQuery.toParamString(jcr:content/protocolHTTPHeaders@TypeHint))), ("jcrContentProtocolHTTPMethod", Some(jcr:content/protocolHTTPMethodQuery.toParamString(jcr:content/protocolHTTPMethod))), ("jcrContentProtocolHTTPSRelaxed", Some(jcr:content/protocolHTTPSRelaxedQuery.toParamString(jcr:content/protocolHTTPSRelaxed))), ("jcrContentProtocolInterface", Some(jcr:content/protocolInterfaceQuery.toParamString(jcr:content/protocolInterface))), ("jcrContentProtocolSocketTimeout", Some(jcr:content/protocolSocketTimeoutQuery.toParamString(jcr:content/protocolSocketTimeout))), ("jcrContentProtocolVersion", Some(jcr:content/protocolVersionQuery.toParamString(jcr:content/protocolVersion))), ("jcrContentProxyNTLMDomain", Some(jcr:content/proxyNTLMDomainQuery.toParamString(jcr:content/proxyNTLMDomain))), ("jcrContentProxyNTLMHost", Some(jcr:content/proxyNTLMHostQuery.toParamString(jcr:content/proxyNTLMHost))), ("jcrContentProxyHost", Some(jcr:content/proxyHostQuery.toParamString(jcr:content/proxyHost))), ("jcrContentProxyPassword", Some(jcr:content/proxyPasswordQuery.toParamString(jcr:content/proxyPassword))), ("jcrContentProxyPort", Some(jcr:content/proxyPortQuery.toParamString(jcr:content/proxyPort))), ("jcrContentProxyUser", Some(jcr:content/proxyUserQuery.toParamString(jcr:content/proxyUser))), ("jcrContentQueueBatchMaxSize", Some(jcr:content/queueBatchMaxSizeQuery.toParamString(jcr:content/queueBatchMaxSize))), ("jcrContentQueueBatchMode", Some(jcr:content/queueBatchModeQuery.toParamString(jcr:content/queueBatchMode))), ("jcrContentQueueBatchWaitTime", Some(jcr:content/queueBatchWaitTimeQuery.toParamString(jcr:content/queueBatchWaitTime))), ("jcrContentRetryDelay", Some(jcr:content/retryDelayQuery.toParamString(jcr:content/retryDelay))), ("jcrContentReverseReplication", Some(jcr:content/reverseReplicationQuery.toParamString(jcr:content/reverseReplication))), ("jcrContentSerializationType", Some(jcr:content/serializationTypeQuery.toParamString(jcr:content/serializationType))), ("jcrContentSlingResourceType", Some(jcr:content/sling:resourceTypeQuery.toParamString(jcr:content/sling:resourceType))), ("jcrContentSsl", Some(jcr:content/sslQuery.toParamString(jcr:content/ssl))), ("jcrContentTransportNTLMDomain", Some(jcr:content/transportNTLMDomainQuery.toParamString(jcr:content/transportNTLMDomain))), ("jcrContentTransportNTLMHost", Some(jcr:content/transportNTLMHostQuery.toParamString(jcr:content/transportNTLMHost))), ("jcrContentTransportPassword", Some(jcr:content/transportPasswordQuery.toParamString(jcr:content/transportPassword))), ("jcrContentTransportUri", Some(jcr:content/transportUriQuery.toParamString(jcr:content/transportUri))), ("jcrContentTransportUser", Some(jcr:content/transportUserQuery.toParamString(jcr:content/transportUser))), ("jcrContentTriggerDistribute", Some(jcr:content/triggerDistributeQuery.toParamString(jcr:content/triggerDistribute))), ("jcrContentTriggerModified", Some(jcr:content/triggerModifiedQuery.toParamString(jcr:content/triggerModified))), ("jcrContentTriggerOnOffTime", Some(jcr:content/triggerOnOffTimeQuery.toParamString(jcr:content/triggerOnOffTime))), ("jcrContentTriggerReceive", Some(jcr:content/triggerReceiveQuery.toParamString(jcr:content/triggerReceive))), ("jcrContentTriggerSpecific", Some(jcr:content/triggerSpecificQuery.toParamString(jcr:content/triggerSpecific))), ("jcrContentUserId", Some(jcr:content/userIdQuery.toParamString(jcr:content/userId))), ("jcrPrimaryType", Some(jcr:primaryTypeQuery.toParamString(jcr:primaryType))), ("operation", Some(:operationQuery.toParamString(:operation))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postAuthorizableKeystore(intermediatePath: String, authorizableId: String, operation: String, currentPassword: String, newPassword: String, rePassword: String, keyPassword: String, keyStorePass: String, alias: String, newAlias: String, removeAlias: String, certChain: File, pk: File, keyStore: File)(implicit operationQuery: QueryParam[String], currentPasswordQuery: QueryParam[String], newPasswordQuery: QueryParam[String], rePasswordQuery: QueryParam[String], keyPasswordQuery: QueryParam[String], keyStorePassQuery: QueryParam[String], aliasQuery: QueryParam[String], newAliasQuery: QueryParam[String], removeAliasQuery: QueryParam[String]): Task[KeystoreInfo] = {
    implicit val returnTypeDecoder: EntityDecoder[KeystoreInfo] = jsonOf[KeystoreInfo]

    val path = "/{intermediatePath}/{authorizableId}.ks.html".replaceAll("\\{" + "intermediatePath" + "\\}",escape(intermediatePath.toString)).replaceAll("\\{" + "authorizableId" + "\\}",escape(authorizableId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("operation", Some(:operationQuery.toParamString(:operation))), ("currentPassword", Some(currentPasswordQuery.toParamString(currentPassword))), ("newPassword", Some(newPasswordQuery.toParamString(newPassword))), ("rePassword", Some(rePasswordQuery.toParamString(rePassword))), ("keyPassword", Some(keyPasswordQuery.toParamString(keyPassword))), ("keyStorePass", Some(keyStorePassQuery.toParamString(keyStorePass))), ("alias", Some(aliasQuery.toParamString(alias))), ("newAlias", Some(newAliasQuery.toParamString(newAlias))), ("removeAlias", Some(removeAliasQuery.toParamString(removeAlias))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[KeystoreInfo](req)

    } yield resp
  }

  def postAuthorizables(authorizableId: String, intermediatePath: String, createUser: String, createGroup: String, repPassword: String, profileGivenName: String)(implicit authorizableIdQuery: QueryParam[String], intermediatePathQuery: QueryParam[String], createUserQuery: QueryParam[String], createGroupQuery: QueryParam[String], repPasswordQuery: QueryParam[String], profileGivenNameQuery: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/libs/granite/security/post/authorizables"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("authorizableId", Some(authorizableIdQuery.toParamString(authorizableId))), ("intermediatePath", Some(intermediatePathQuery.toParamString(intermediatePath))), ("createUser", Some(createUserQuery.toParamString(createUser))), ("createGroup", Some(createGroupQuery.toParamString(createGroup))), ("repPassword", Some(rep:passwordQuery.toParamString(rep:password))), ("profileGivenName", Some(profile/givenNameQuery.toParamString(profile/givenName))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }

  def postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword: String, keyStorePasswordTypeHint: String, serviceRanking: Integer, serviceRankingTypeHint: String, idpHttpRedirect: Boolean, idpHttpRedirectTypeHint: String, createUser: Boolean, createUserTypeHint: String, defaultRedirectUrl: String, defaultRedirectUrlTypeHint: String, userIDAttribute: String, userIDAttributeTypeHint: String, defaultGroups: List[String] = List.empty[String] , defaultGroupsTypeHint: String, idpCertAlias: String, idpCertAliasTypeHint: String, addGroupMemberships: Boolean, addGroupMembershipsTypeHint: String, `path`: List[String] = List.empty[String] , pathTypeHint: String, synchronizeAttributes: List[String] = List.empty[String] , synchronizeAttributesTypeHint: String, clockTolerance: Integer, clockToleranceTypeHint: String, groupMembershipAttribute: String, groupMembershipAttributeTypeHint: String, idpUrl: String, idpUrlTypeHint: String, logoutUrl: String, logoutUrlTypeHint: String, serviceProviderEntityId: String, serviceProviderEntityIdTypeHint: String, assertionConsumerServiceURL: String, assertionConsumerServiceURLTypeHint: String, handleLogout: Boolean, handleLogoutTypeHint: String, spPrivateKeyAlias: String, spPrivateKeyAliasTypeHint: String, useEncryption: Boolean, useEncryptionTypeHint: String, nameIdFormat: String, nameIdFormatTypeHint: String, digestMethod: String, digestMethodTypeHint: String, signatureMethod: String, signatureMethodTypeHint: String, userIntermediatePath: String, userIntermediatePathTypeHint: String)(implicit keyStorePasswordQuery: QueryParam[String], keyStorePasswordTypeHintQuery: QueryParam[String], serviceRankingQuery: QueryParam[Integer], serviceRankingTypeHintQuery: QueryParam[String], idpHttpRedirectQuery: QueryParam[Boolean], idpHttpRedirectTypeHintQuery: QueryParam[String], createUserQuery: QueryParam[Boolean], createUserTypeHintQuery: QueryParam[String], defaultRedirectUrlQuery: QueryParam[String], defaultRedirectUrlTypeHintQuery: QueryParam[String], userIDAttributeQuery: QueryParam[String], userIDAttributeTypeHintQuery: QueryParam[String], defaultGroupsQuery: QueryParam[List[String]], defaultGroupsTypeHintQuery: QueryParam[String], idpCertAliasQuery: QueryParam[String], idpCertAliasTypeHintQuery: QueryParam[String], addGroupMembershipsQuery: QueryParam[Boolean], addGroupMembershipsTypeHintQuery: QueryParam[String], `path`Query: QueryParam[List[String]], pathTypeHintQuery: QueryParam[String], synchronizeAttributesQuery: QueryParam[List[String]], synchronizeAttributesTypeHintQuery: QueryParam[String], clockToleranceQuery: QueryParam[Integer], clockToleranceTypeHintQuery: QueryParam[String], groupMembershipAttributeQuery: QueryParam[String], groupMembershipAttributeTypeHintQuery: QueryParam[String], idpUrlQuery: QueryParam[String], idpUrlTypeHintQuery: QueryParam[String], logoutUrlQuery: QueryParam[String], logoutUrlTypeHintQuery: QueryParam[String], serviceProviderEntityIdQuery: QueryParam[String], serviceProviderEntityIdTypeHintQuery: QueryParam[String], assertionConsumerServiceURLQuery: QueryParam[String], assertionConsumerServiceURLTypeHintQuery: QueryParam[String], handleLogoutQuery: QueryParam[Boolean], handleLogoutTypeHintQuery: QueryParam[String], spPrivateKeyAliasQuery: QueryParam[String], spPrivateKeyAliasTypeHintQuery: QueryParam[String], useEncryptionQuery: QueryParam[Boolean], useEncryptionTypeHintQuery: QueryParam[String], nameIdFormatQuery: QueryParam[String], nameIdFormatTypeHintQuery: QueryParam[String], digestMethodQuery: QueryParam[String], digestMethodTypeHintQuery: QueryParam[String], signatureMethodQuery: QueryParam[String], signatureMethodTypeHintQuery: QueryParam[String], userIntermediatePathQuery: QueryParam[String], userIntermediatePathTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("keyStorePassword", Some(keyStorePasswordQuery.toParamString(keyStorePassword))), ("keyStorePasswordTypeHint", Some(keyStorePassword@TypeHintQuery.toParamString(keyStorePassword@TypeHint))), ("serviceRanking", Some(service.rankingQuery.toParamString(service.ranking))), ("serviceRankingTypeHint", Some(service.ranking@TypeHintQuery.toParamString(service.ranking@TypeHint))), ("idpHttpRedirect", Some(idpHttpRedirectQuery.toParamString(idpHttpRedirect))), ("idpHttpRedirectTypeHint", Some(idpHttpRedirect@TypeHintQuery.toParamString(idpHttpRedirect@TypeHint))), ("createUser", Some(createUserQuery.toParamString(createUser))), ("createUserTypeHint", Some(createUser@TypeHintQuery.toParamString(createUser@TypeHint))), ("defaultRedirectUrl", Some(defaultRedirectUrlQuery.toParamString(defaultRedirectUrl))), ("defaultRedirectUrlTypeHint", Some(defaultRedirectUrl@TypeHintQuery.toParamString(defaultRedirectUrl@TypeHint))), ("userIDAttribute", Some(userIDAttributeQuery.toParamString(userIDAttribute))), ("userIDAttributeTypeHint", Some(userIDAttribute@TypeHintQuery.toParamString(userIDAttribute@TypeHint))), ("defaultGroups", Some(defaultGroupsQuery.toParamString(defaultGroups))), ("defaultGroupsTypeHint", Some(defaultGroups@TypeHintQuery.toParamString(defaultGroups@TypeHint))), ("idpCertAlias", Some(idpCertAliasQuery.toParamString(idpCertAlias))), ("idpCertAliasTypeHint", Some(idpCertAlias@TypeHintQuery.toParamString(idpCertAlias@TypeHint))), ("addGroupMemberships", Some(addGroupMembershipsQuery.toParamString(addGroupMemberships))), ("addGroupMembershipsTypeHint", Some(addGroupMemberships@TypeHintQuery.toParamString(addGroupMemberships@TypeHint))), ("`path`", Some(pathQuery.toParamString(path))), ("pathTypeHint", Some(path@TypeHintQuery.toParamString(path@TypeHint))), ("synchronizeAttributes", Some(synchronizeAttributesQuery.toParamString(synchronizeAttributes))), ("synchronizeAttributesTypeHint", Some(synchronizeAttributes@TypeHintQuery.toParamString(synchronizeAttributes@TypeHint))), ("clockTolerance", Some(clockToleranceQuery.toParamString(clockTolerance))), ("clockToleranceTypeHint", Some(clockTolerance@TypeHintQuery.toParamString(clockTolerance@TypeHint))), ("groupMembershipAttribute", Some(groupMembershipAttributeQuery.toParamString(groupMembershipAttribute))), ("groupMembershipAttributeTypeHint", Some(groupMembershipAttribute@TypeHintQuery.toParamString(groupMembershipAttribute@TypeHint))), ("idpUrl", Some(idpUrlQuery.toParamString(idpUrl))), ("idpUrlTypeHint", Some(idpUrl@TypeHintQuery.toParamString(idpUrl@TypeHint))), ("logoutUrl", Some(logoutUrlQuery.toParamString(logoutUrl))), ("logoutUrlTypeHint", Some(logoutUrl@TypeHintQuery.toParamString(logoutUrl@TypeHint))), ("serviceProviderEntityId", Some(serviceProviderEntityIdQuery.toParamString(serviceProviderEntityId))), ("serviceProviderEntityIdTypeHint", Some(serviceProviderEntityId@TypeHintQuery.toParamString(serviceProviderEntityId@TypeHint))), ("assertionConsumerServiceURL", Some(assertionConsumerServiceURLQuery.toParamString(assertionConsumerServiceURL))), ("assertionConsumerServiceURLTypeHint", Some(assertionConsumerServiceURL@TypeHintQuery.toParamString(assertionConsumerServiceURL@TypeHint))), ("handleLogout", Some(handleLogoutQuery.toParamString(handleLogout))), ("handleLogoutTypeHint", Some(handleLogout@TypeHintQuery.toParamString(handleLogout@TypeHint))), ("spPrivateKeyAlias", Some(spPrivateKeyAliasQuery.toParamString(spPrivateKeyAlias))), ("spPrivateKeyAliasTypeHint", Some(spPrivateKeyAlias@TypeHintQuery.toParamString(spPrivateKeyAlias@TypeHint))), ("useEncryption", Some(useEncryptionQuery.toParamString(useEncryption))), ("useEncryptionTypeHint", Some(useEncryption@TypeHintQuery.toParamString(useEncryption@TypeHint))), ("nameIdFormat", Some(nameIdFormatQuery.toParamString(nameIdFormat))), ("nameIdFormatTypeHint", Some(nameIdFormat@TypeHintQuery.toParamString(nameIdFormat@TypeHint))), ("digestMethod", Some(digestMethodQuery.toParamString(digestMethod))), ("digestMethodTypeHint", Some(digestMethod@TypeHintQuery.toParamString(digestMethod@TypeHint))), ("signatureMethod", Some(signatureMethodQuery.toParamString(signatureMethod))), ("signatureMethodTypeHint", Some(signatureMethod@TypeHintQuery.toParamString(signatureMethod@TypeHint))), ("userIntermediatePath", Some(userIntermediatePathQuery.toParamString(userIntermediatePath))), ("userIntermediatePathTypeHint", Some(userIntermediatePath@TypeHintQuery.toParamString(userIntermediatePath@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio: Boolean, orgApacheFelixHttpsNioTypeHint: String, orgApacheFelixHttpsKeystore: String, orgApacheFelixHttpsKeystoreTypeHint: String, orgApacheFelixHttpsKeystorePassword: String, orgApacheFelixHttpsKeystorePasswordTypeHint: String, orgApacheFelixHttpsKeystoreKey: String, orgApacheFelixHttpsKeystoreKeyTypeHint: String, orgApacheFelixHttpsKeystoreKeyPassword: String, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint: String, orgApacheFelixHttpsTruststore: String, orgApacheFelixHttpsTruststoreTypeHint: String, orgApacheFelixHttpsTruststorePassword: String, orgApacheFelixHttpsTruststorePasswordTypeHint: String, orgApacheFelixHttpsClientcertificate: String, orgApacheFelixHttpsClientcertificateTypeHint: String, orgApacheFelixHttpsEnable: Boolean, orgApacheFelixHttpsEnableTypeHint: String, orgOsgiServiceHttpPortSecure: String, orgOsgiServiceHttpPortSecureTypeHint: String)(implicit orgApacheFelixHttpsNioQuery: QueryParam[Boolean], orgApacheFelixHttpsNioTypeHintQuery: QueryParam[String], orgApacheFelixHttpsKeystoreQuery: QueryParam[String], orgApacheFelixHttpsKeystoreTypeHintQuery: QueryParam[String], orgApacheFelixHttpsKeystorePasswordQuery: QueryParam[String], orgApacheFelixHttpsKeystorePasswordTypeHintQuery: QueryParam[String], orgApacheFelixHttpsKeystoreKeyQuery: QueryParam[String], orgApacheFelixHttpsKeystoreKeyTypeHintQuery: QueryParam[String], orgApacheFelixHttpsKeystoreKeyPasswordQuery: QueryParam[String], orgApacheFelixHttpsKeystoreKeyPasswordTypeHintQuery: QueryParam[String], orgApacheFelixHttpsTruststoreQuery: QueryParam[String], orgApacheFelixHttpsTruststoreTypeHintQuery: QueryParam[String], orgApacheFelixHttpsTruststorePasswordQuery: QueryParam[String], orgApacheFelixHttpsTruststorePasswordTypeHintQuery: QueryParam[String], orgApacheFelixHttpsClientcertificateQuery: QueryParam[String], orgApacheFelixHttpsClientcertificateTypeHintQuery: QueryParam[String], orgApacheFelixHttpsEnableQuery: QueryParam[Boolean], orgApacheFelixHttpsEnableTypeHintQuery: QueryParam[String], orgOsgiServiceHttpPortSecureQuery: QueryParam[String], orgOsgiServiceHttpPortSecureTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/org.apache.felix.http"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("orgApacheFelixHttpsNio", Some(org.apache.felix.https.nioQuery.toParamString(org.apache.felix.https.nio))), ("orgApacheFelixHttpsNioTypeHint", Some(org.apache.felix.https.nio@TypeHintQuery.toParamString(org.apache.felix.https.nio@TypeHint))), ("orgApacheFelixHttpsKeystore", Some(org.apache.felix.https.keystoreQuery.toParamString(org.apache.felix.https.keystore))), ("orgApacheFelixHttpsKeystoreTypeHint", Some(org.apache.felix.https.keystore@TypeHintQuery.toParamString(org.apache.felix.https.keystore@TypeHint))), ("orgApacheFelixHttpsKeystorePassword", Some(org.apache.felix.https.keystore.passwordQuery.toParamString(org.apache.felix.https.keystore.password))), ("orgApacheFelixHttpsKeystorePasswordTypeHint", Some(org.apache.felix.https.keystore.password@TypeHintQuery.toParamString(org.apache.felix.https.keystore.password@TypeHint))), ("orgApacheFelixHttpsKeystoreKey", Some(org.apache.felix.https.keystore.keyQuery.toParamString(org.apache.felix.https.keystore.key))), ("orgApacheFelixHttpsKeystoreKeyTypeHint", Some(org.apache.felix.https.keystore.key@TypeHintQuery.toParamString(org.apache.felix.https.keystore.key@TypeHint))), ("orgApacheFelixHttpsKeystoreKeyPassword", Some(org.apache.felix.https.keystore.key.passwordQuery.toParamString(org.apache.felix.https.keystore.key.password))), ("orgApacheFelixHttpsKeystoreKeyPasswordTypeHint", Some(org.apache.felix.https.keystore.key.password@TypeHintQuery.toParamString(org.apache.felix.https.keystore.key.password@TypeHint))), ("orgApacheFelixHttpsTruststore", Some(org.apache.felix.https.truststoreQuery.toParamString(org.apache.felix.https.truststore))), ("orgApacheFelixHttpsTruststoreTypeHint", Some(org.apache.felix.https.truststore@TypeHintQuery.toParamString(org.apache.felix.https.truststore@TypeHint))), ("orgApacheFelixHttpsTruststorePassword", Some(org.apache.felix.https.truststore.passwordQuery.toParamString(org.apache.felix.https.truststore.password))), ("orgApacheFelixHttpsTruststorePasswordTypeHint", Some(org.apache.felix.https.truststore.password@TypeHintQuery.toParamString(org.apache.felix.https.truststore.password@TypeHint))), ("orgApacheFelixHttpsClientcertificate", Some(org.apache.felix.https.clientcertificateQuery.toParamString(org.apache.felix.https.clientcertificate))), ("orgApacheFelixHttpsClientcertificateTypeHint", Some(org.apache.felix.https.clientcertificate@TypeHintQuery.toParamString(org.apache.felix.https.clientcertificate@TypeHint))), ("orgApacheFelixHttpsEnable", Some(org.apache.felix.https.enableQuery.toParamString(org.apache.felix.https.enable))), ("orgApacheFelixHttpsEnableTypeHint", Some(org.apache.felix.https.enable@TypeHintQuery.toParamString(org.apache.felix.https.enable@TypeHint))), ("orgOsgiServiceHttpPortSecure", Some(org.osgi.service.http.port.secureQuery.toParamString(org.osgi.service.http.port.secure))), ("orgOsgiServiceHttpPortSecureTypeHint", Some(org.osgi.service.http.port.secure@TypeHintQuery.toParamString(org.osgi.service.http.port.secure@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postConfigApacheHttpComponentsProxyConfiguration(proxyHost: String, proxyHostTypeHint: String, proxyPort: Integer, proxyPortTypeHint: String, proxyExceptions: List[String] = List.empty[String] , proxyExceptionsTypeHint: String, proxyEnabled: Boolean, proxyEnabledTypeHint: String, proxyUser: String, proxyUserTypeHint: String, proxyPassword: String, proxyPasswordTypeHint: String)(implicit proxyHostQuery: QueryParam[String], proxyHostTypeHintQuery: QueryParam[String], proxyPortQuery: QueryParam[Integer], proxyPortTypeHintQuery: QueryParam[String], proxyExceptionsQuery: QueryParam[List[String]], proxyExceptionsTypeHintQuery: QueryParam[String], proxyEnabledQuery: QueryParam[Boolean], proxyEnabledTypeHintQuery: QueryParam[String], proxyUserQuery: QueryParam[String], proxyUserTypeHintQuery: QueryParam[String], proxyPasswordQuery: QueryParam[String], proxyPasswordTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/org.apache.http.proxyconfigurator.config"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("proxyHost", Some(proxy.hostQuery.toParamString(proxy.host))), ("proxyHostTypeHint", Some(proxy.host@TypeHintQuery.toParamString(proxy.host@TypeHint))), ("proxyPort", Some(proxy.portQuery.toParamString(proxy.port))), ("proxyPortTypeHint", Some(proxy.port@TypeHintQuery.toParamString(proxy.port@TypeHint))), ("proxyExceptions", Some(proxy.exceptionsQuery.toParamString(proxy.exceptions))), ("proxyExceptionsTypeHint", Some(proxy.exceptions@TypeHintQuery.toParamString(proxy.exceptions@TypeHint))), ("proxyEnabled", Some(proxy.enabledQuery.toParamString(proxy.enabled))), ("proxyEnabledTypeHint", Some(proxy.enabled@TypeHintQuery.toParamString(proxy.enabled@TypeHint))), ("proxyUser", Some(proxy.userQuery.toParamString(proxy.user))), ("proxyUserTypeHint", Some(proxy.user@TypeHintQuery.toParamString(proxy.user@TypeHint))), ("proxyPassword", Some(proxy.passwordQuery.toParamString(proxy.password))), ("proxyPasswordTypeHint", Some(proxy.password@TypeHintQuery.toParamString(proxy.password@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postConfigApacheSlingDavExServlet(alias: String, aliasTypeHint: String, davCreateAbsoluteUri: Boolean, davCreateAbsoluteUriTypeHint: String)(implicit aliasQuery: QueryParam[String], aliasTypeHintQuery: QueryParam[String], davCreateAbsoluteUriQuery: QueryParam[Boolean], davCreateAbsoluteUriTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("alias", Some(aliasQuery.toParamString(alias))), ("aliasTypeHint", Some(alias@TypeHintQuery.toParamString(alias@TypeHint))), ("davCreateAbsoluteUri", Some(dav.create-absolute-uriQuery.toParamString(dav.create-absolute-uri))), ("davCreateAbsoluteUriTypeHint", Some(dav.create-absolute-uri@TypeHintQuery.toParamString(dav.create-absolute-uri@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postConfigApacheSlingGetServlet(jsonMaximumresults: String, jsonMaximumresultsTypeHint: String, enableHtml: Boolean, enableHtmlTypeHint: String, enableTxt: Boolean, enableTxtTypeHint: String, enableXml: Boolean, enableXmlTypeHint: String)(implicit jsonMaximumresultsQuery: QueryParam[String], jsonMaximumresultsTypeHintQuery: QueryParam[String], enableHtmlQuery: QueryParam[Boolean], enableHtmlTypeHintQuery: QueryParam[String], enableTxtQuery: QueryParam[Boolean], enableTxtTypeHintQuery: QueryParam[String], enableXmlQuery: QueryParam[Boolean], enableXmlTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("jsonMaximumresults", Some(json.maximumresultsQuery.toParamString(json.maximumresults))), ("jsonMaximumresultsTypeHint", Some(json.maximumresults@TypeHintQuery.toParamString(json.maximumresults@TypeHint))), ("enableHtml", Some(enable.htmlQuery.toParamString(enable.html))), ("enableHtmlTypeHint", Some(enable.html@TypeHintQuery.toParamString(enable.html@TypeHint))), ("enableTxt", Some(enable.txtQuery.toParamString(enable.txt))), ("enableTxtTypeHint", Some(enable.txt@TypeHintQuery.toParamString(enable.txt@TypeHint))), ("enableXml", Some(enable.xmlQuery.toParamString(enable.xml))), ("enableXmlTypeHint", Some(enable.xml@TypeHintQuery.toParamString(enable.xml@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postConfigApacheSlingReferrerFilter(allowEmpty: Boolean, allowEmptyTypeHint: String, allowHosts: String, allowHostsTypeHint: String, allowHostsRegexp: String, allowHostsRegexpTypeHint: String, filterMethods: String, filterMethodsTypeHint: String)(implicit allowEmptyQuery: QueryParam[Boolean], allowEmptyTypeHintQuery: QueryParam[String], allowHostsQuery: QueryParam[String], allowHostsTypeHintQuery: QueryParam[String], allowHostsRegexpQuery: QueryParam[String], allowHostsRegexpTypeHintQuery: QueryParam[String], filterMethodsQuery: QueryParam[String], filterMethodsTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("allowEmpty", Some(allow.emptyQuery.toParamString(allow.empty))), ("allowEmptyTypeHint", Some(allow.empty@TypeHintQuery.toParamString(allow.empty@TypeHint))), ("allowHosts", Some(allow.hostsQuery.toParamString(allow.hosts))), ("allowHostsTypeHint", Some(allow.hosts@TypeHintQuery.toParamString(allow.hosts@TypeHint))), ("allowHostsRegexp", Some(allow.hosts.regexpQuery.toParamString(allow.hosts.regexp))), ("allowHostsRegexpTypeHint", Some(allow.hosts.regexp@TypeHintQuery.toParamString(allow.hosts.regexp@TypeHint))), ("filterMethods", Some(filter.methodsQuery.toParamString(filter.methods))), ("filterMethodsTypeHint", Some(filter.methods@TypeHintQuery.toParamString(filter.methods@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postConfigProperty(configNodeName: String): Task[Unit] = {
    val path = "/apps/system/config/{configNodeName}".replaceAll("\\{" + "configNodeName" + "\\}",escape(configNodeName.toString))

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

  def postNode(`path`: String, name: String, operation: String, deleteAuthorizable: String, file: File)(implicit operationQuery: QueryParam[String], deleteAuthorizableQuery: QueryParam[String]): Task[Unit] = {
    val path = "/{path}/{name}".replaceAll("\\{" + "path" + "\\}",escape(`path`.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("operation", Some(:operationQuery.toParamString(:operation))), ("deleteAuthorizable", Some(deleteAuthorizableQuery.toParamString(deleteAuthorizable))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postNodeRw(`path`: String, name: String, addMembers: String)(implicit addMembersQuery: QueryParam[String]): Task[Unit] = {
    val path = "/{path}/{name}.rw.html".replaceAll("\\{" + "path" + "\\}",escape(`path`.toString)).replaceAll("\\{" + "name" + "\\}",escape(name.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("addMembers", Some(addMembersQuery.toParamString(addMembers))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postPath(`path`: String, jcrPrimaryType: String, name: String)(implicit jcrPrimaryTypeQuery: QueryParam[String], nameQuery: QueryParam[String]): Task[Unit] = {
    val path = "/{path}/".replaceAll("\\{" + "path" + "\\}",escape(`path`.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("jcrPrimaryType", Some(jcr:primaryTypeQuery.toParamString(jcr:primaryType))), ("name", Some(:nameQuery.toParamString(:name))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postQuery(`path`: String, pLimit: BigDecimal, `1property`: String, `1propertyValue`: String)(implicit `path`Query: QueryParam[String], pLimitQuery: QueryParam[BigDecimal], `1property`Query: QueryParam[String], `1propertyValue`Query: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/bin/querybuilder.json"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("`path`", Some(pathQuery.toParamString(path))), ("pLimit", Some(p.limitQuery.toParamString(p.limit))), ("`1property`", Some(1_propertyQuery.toParamString(1_property))), ("`1propertyValue`", Some(1_property.valueQuery.toParamString(1_property.value))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }

  def postTreeActivation(ignoredeactivated: Boolean, onlymodified: Boolean, `path`: String, cmd: String = activate)(implicit ignoredeactivatedQuery: QueryParam[Boolean], onlymodifiedQuery: QueryParam[Boolean], `path`Query: QueryParam[String], cmdQuery: QueryParam[String]): Task[Unit] = {
    val path = "/libs/replication/treeactivation.html"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("ignoredeactivated", Some(ignoredeactivatedQuery.toParamString(ignoredeactivated))), ("onlymodified", Some(onlymodifiedQuery.toParamString(onlymodified))), ("`path`", Some(pathQuery.toParamString(path))), ("cmd", Some(cmdQuery.toParamString(cmd))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def postTruststore(operation: String, newPassword: String, rePassword: String, keyStoreType: String, removeAlias: String, certificate: File)(implicit operationQuery: QueryParam[String], newPasswordQuery: QueryParam[String], rePasswordQuery: QueryParam[String], keyStoreTypeQuery: QueryParam[String], removeAliasQuery: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/libs/granite/security/post/truststore"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("operation", Some(:operationQuery.toParamString(:operation))), ("newPassword", Some(newPasswordQuery.toParamString(newPassword))), ("rePassword", Some(rePasswordQuery.toParamString(rePassword))), ("keyStoreType", Some(keyStoreTypeQuery.toParamString(keyStoreType))), ("removeAlias", Some(removeAliasQuery.toParamString(removeAlias))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }

  def postTruststorePKCS12(truststoreP12: File): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/etc/truststore"

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
      resp          <- client.expect[String](req)

    } yield resp
  }

}

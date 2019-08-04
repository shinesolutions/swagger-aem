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

object CustomApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getAemHealthCheck(host: String, tags: String, combineTagsOr: Boolean)(implicit tagsQuery: QueryParam[String], combineTagsOrQuery: QueryParam[Boolean]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/system/health"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("tags", Some(tagsQuery.toParamString(tags))), ("combineTagsOr", Some(combineTagsOrQuery.toParamString(combineTagsOr))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def postConfigAemHealthCheckServlet(host: String, bundlesIgnored: List[String], bundlesIgnoredTypeHint: String)(implicit bundlesIgnoredQuery: QueryParam[List[String]], bundlesIgnoredTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bundlesIgnored", Some(bundles.ignoredQuery.toParamString(bundles.ignored))), ("bundlesIgnoredTypeHint", Some(bundles.ignored@TypeHintQuery.toParamString(bundles.ignored@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def postConfigAemPasswordReset(host: String, pwdresetAuthorizables: List[String], pwdresetAuthorizablesTypeHint: String)(implicit pwdresetAuthorizablesQuery: QueryParam[List[String]], pwdresetAuthorizablesTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pwdresetAuthorizables", Some(pwdreset.authorizablesQuery.toParamString(pwdreset.authorizables))), ("pwdresetAuthorizablesTypeHint", Some(pwdreset.authorizables@TypeHintQuery.toParamString(pwdreset.authorizables@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
}

class HttpServiceCustomApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getAemHealthCheck(tags: String, combineTagsOr: Boolean)(implicit tagsQuery: QueryParam[String], combineTagsOrQuery: QueryParam[Boolean]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/system/health"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("tags", Some(tagsQuery.toParamString(tags))), ("combineTagsOr", Some(combineTagsOrQuery.toParamString(combineTagsOr))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def postConfigAemHealthCheckServlet(bundlesIgnored: List[String], bundlesIgnoredTypeHint: String)(implicit bundlesIgnoredQuery: QueryParam[List[String]], bundlesIgnoredTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("bundlesIgnored", Some(bundles.ignoredQuery.toParamString(bundles.ignored))), ("bundlesIgnoredTypeHint", Some(bundles.ignored@TypeHintQuery.toParamString(bundles.ignored@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def postConfigAemPasswordReset(pwdresetAuthorizables: List[String], pwdresetAuthorizablesTypeHint: String)(implicit pwdresetAuthorizablesQuery: QueryParam[List[String]], pwdresetAuthorizablesTypeHintQuery: QueryParam[String]): Task[Unit] = {
    val path = "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("pwdresetAuthorizables", Some(pwdreset.authorizablesQuery.toParamString(pwdreset.authorizables))), ("pwdresetAuthorizablesTypeHint", Some(pwdreset.authorizables@TypeHintQuery.toParamString(pwdreset.authorizables@TypeHint))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
}

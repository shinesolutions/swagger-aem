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

import java.io.File
import org.openapitools.client.api.InstallStatus

object CrxApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getCrxdeStatus(host: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/crx/server/crx.default/jcr:root/.1.json"
    
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
  
  def getInstallStatus(host: String): Task[InstallStatus] = {
    implicit val returnTypeDecoder: EntityDecoder[InstallStatus] = jsonOf[InstallStatus]

    val path = "/crx/packmgr/installstatus.jsp"
    
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
      resp          <- client.expect[InstallStatus](req)

    } yield resp
  }
  
  def getPackageManagerServlet(host: String): Task[Unit] = {
    val path = "/crx/packmgr/service/script.html"
    
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
  
  def postPackageService(host: String, cmd: String)(implicit cmdQuery: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/crx/packmgr/service.jsp"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("cmd", Some(cmdQuery.toParamString(cmd))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def postPackageServiceJson(host: String, `path`: String, cmd: String, groupName: String, packageName: String, packageVersion: String, charset: String, force: Boolean, recursive: Boolean, `package`: File)(implicit cmdQuery: QueryParam[String], groupNameQuery: QueryParam[String], packageNameQuery: QueryParam[String], packageVersionQuery: QueryParam[String], charsetQuery: QueryParam[String], forceQuery: QueryParam[Boolean], recursiveQuery: QueryParam[Boolean]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/crx/packmgr/service/.json/{path}".replaceAll("\\{" + "path" + "\\}",escape(`path`.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("cmd", Some(cmdQuery.toParamString(cmd))), ("groupName", Some(groupNameQuery.toParamString(groupName))), ("packageName", Some(packageNameQuery.toParamString(packageName))), ("packageVersion", Some(packageVersionQuery.toParamString(packageVersion))), ("charset", Some(_charset_Query.toParamString(_charset_))), ("force", Some(forceQuery.toParamString(force))), ("recursive", Some(recursiveQuery.toParamString(recursive))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def postPackageUpdate(host: String, groupName: String, packageName: String, version: String, `path`: String, filter: String, charset: String)(implicit groupNameQuery: QueryParam[String], packageNameQuery: QueryParam[String], versionQuery: QueryParam[String], `path`Query: QueryParam[String], filterQuery: QueryParam[String], charsetQuery: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/crx/packmgr/update.jsp"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("groupName", Some(groupNameQuery.toParamString(groupName))), ("packageName", Some(packageNameQuery.toParamString(packageName))), ("version", Some(versionQuery.toParamString(version))), ("`path`", Some(pathQuery.toParamString(path))), ("filter", Some(filterQuery.toParamString(filter))), ("charset", Some(_charset_Query.toParamString(_charset_))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def postSetPassword(host: String, old: String, plain: String, verify: String)(implicit oldQuery: QueryParam[String], plainQuery: QueryParam[String], verifyQuery: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/crx/explorer/ui/setpassword.jsp"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("old", Some(oldQuery.toParamString(old))), ("plain", Some(plainQuery.toParamString(plain))), ("verify", Some(verifyQuery.toParamString(verify))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
}

class HttpServiceCrxApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getCrxdeStatus(): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/crx/server/crx.default/jcr:root/.1.json"
    
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
  
  def getInstallStatus(): Task[InstallStatus] = {
    implicit val returnTypeDecoder: EntityDecoder[InstallStatus] = jsonOf[InstallStatus]

    val path = "/crx/packmgr/installstatus.jsp"
    
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
      resp          <- client.expect[InstallStatus](req)

    } yield resp
  }
  
  def getPackageManagerServlet(): Task[Unit] = {
    val path = "/crx/packmgr/service/script.html"
    
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
  
  def postPackageService(cmd: String)(implicit cmdQuery: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/crx/packmgr/service.jsp"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("cmd", Some(cmdQuery.toParamString(cmd))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def postPackageServiceJson(`path`: String, cmd: String, groupName: String, packageName: String, packageVersion: String, charset: String, force: Boolean, recursive: Boolean, `package`: File)(implicit cmdQuery: QueryParam[String], groupNameQuery: QueryParam[String], packageNameQuery: QueryParam[String], packageVersionQuery: QueryParam[String], charsetQuery: QueryParam[String], forceQuery: QueryParam[Boolean], recursiveQuery: QueryParam[Boolean]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/crx/packmgr/service/.json/{path}".replaceAll("\\{" + "path" + "\\}",escape(`path`.toString))
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("cmd", Some(cmdQuery.toParamString(cmd))), ("groupName", Some(groupNameQuery.toParamString(groupName))), ("packageName", Some(packageNameQuery.toParamString(packageName))), ("packageVersion", Some(packageVersionQuery.toParamString(packageVersion))), ("charset", Some(_charset_Query.toParamString(_charset_))), ("force", Some(forceQuery.toParamString(force))), ("recursive", Some(recursiveQuery.toParamString(recursive))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def postPackageUpdate(groupName: String, packageName: String, version: String, `path`: String, filter: String, charset: String)(implicit groupNameQuery: QueryParam[String], packageNameQuery: QueryParam[String], versionQuery: QueryParam[String], `path`Query: QueryParam[String], filterQuery: QueryParam[String], charsetQuery: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/crx/packmgr/update.jsp"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("groupName", Some(groupNameQuery.toParamString(groupName))), ("packageName", Some(packageNameQuery.toParamString(packageName))), ("version", Some(versionQuery.toParamString(version))), ("`path`", Some(pathQuery.toParamString(path))), ("filter", Some(filterQuery.toParamString(filter))), ("charset", Some(_charset_Query.toParamString(_charset_))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def postSetPassword(old: String, plain: String, verify: String)(implicit oldQuery: QueryParam[String], plainQuery: QueryParam[String], verifyQuery: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/crx/explorer/ui/setpassword.jsp"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("old", Some(oldQuery.toParamString(old))), ("plain", Some(plainQuery.toParamString(plain))), ("verify", Some(verifyQuery.toParamString(verify))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
}

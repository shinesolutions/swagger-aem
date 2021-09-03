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

object GraniteApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def sslSetup(host: String, keystorePassword: String, keystorePasswordConfirm: String, truststorePassword: String, truststorePasswordConfirm: String, httpsHostname: String, httpsPort: String, privatekeyFile: File, certificateFile: File)(implicit keystorePasswordQuery: QueryParam[String], keystorePasswordConfirmQuery: QueryParam[String], truststorePasswordQuery: QueryParam[String], truststorePasswordConfirmQuery: QueryParam[String], httpsHostnameQuery: QueryParam[String], httpsPortQuery: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/libs/granite/security/post/sslSetup.html"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("keystorePassword", Some(keystorePasswordQuery.toParamString(keystorePassword))), ("keystorePasswordConfirm", Some(keystorePasswordConfirmQuery.toParamString(keystorePasswordConfirm))), ("truststorePassword", Some(truststorePasswordQuery.toParamString(truststorePassword))), ("truststorePasswordConfirm", Some(truststorePasswordConfirmQuery.toParamString(truststorePasswordConfirm))), ("httpsHostname", Some(httpsHostnameQuery.toParamString(httpsHostname))), ("httpsPort", Some(httpsPortQuery.toParamString(httpsPort))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
}

class HttpServiceGraniteApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def sslSetup(keystorePassword: String, keystorePasswordConfirm: String, truststorePassword: String, truststorePasswordConfirm: String, httpsHostname: String, httpsPort: String, privatekeyFile: File, certificateFile: File)(implicit keystorePasswordQuery: QueryParam[String], keystorePasswordConfirmQuery: QueryParam[String], truststorePasswordQuery: QueryParam[String], truststorePasswordConfirmQuery: QueryParam[String], httpsHostnameQuery: QueryParam[String], httpsPortQuery: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/libs/granite/security/post/sslSetup.html"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("keystorePassword", Some(keystorePasswordQuery.toParamString(keystorePassword))), ("keystorePasswordConfirm", Some(keystorePasswordConfirmQuery.toParamString(keystorePasswordConfirm))), ("truststorePassword", Some(truststorePasswordQuery.toParamString(truststorePassword))), ("truststorePasswordConfirm", Some(truststorePasswordConfirmQuery.toParamString(truststorePasswordConfirm))), ("httpsHostname", Some(httpsHostnameQuery.toParamString(httpsHostname))), ("httpsPort", Some(httpsPortQuery.toParamString(httpsPort))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
}

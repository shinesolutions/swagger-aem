package org.openapitools.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import org.openapitools.server.api.ConsoleApi
import org.openapitools.server.api.CqApi
import org.openapitools.server.api.CrxApi
import org.openapitools.server.api.CustomApi
import org.openapitools.server.api.GraniteApi
import org.openapitools.server.api.SlingApi

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.Materializer

class Controller(console: ConsoleApi, cq: CqApi, crx: CrxApi, custom: CustomApi, granite: GraniteApi, sling: SlingApi)(implicit system: ActorSystem, materializer: Materializer) {

    lazy val routes: Route = console.route ~ cq.route ~ crx.route ~ custom.route ~ granite.route ~ sling.route 

    Http().newServerAt("0.0.0.0", 9000).bind(routes)
}

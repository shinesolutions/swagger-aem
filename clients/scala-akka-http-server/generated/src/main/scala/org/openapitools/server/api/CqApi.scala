package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class CqApi(
    cqService: CqApiService
) {

  
  
  lazy val route: Route =
    path("libs" / "granite" / "core" / "content" / "login.html") { 
      get {  
            cqService.getLoginPage()
      }
    } ~
    path(".cqactions.html") { 
      post { 
        parameters("authorizableId".as[String], "changelog".as[String]) { (authorizableId, changelog) => 
            cqService.postCqActions(authorizableId = authorizableId, changelog = changelog)
        }
      }
    }
}


trait CqApiService {

  def getLoginPageDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def getLoginPage(): Route

  def postCqActionsDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postCqActions(authorizableId: String, changelog: String): Route

}



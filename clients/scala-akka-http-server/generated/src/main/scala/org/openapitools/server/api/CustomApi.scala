package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class CustomApi(
    customService: CustomApiService
) {

  
  
  lazy val route: Route =
    path("system" / "health") { 
      get { 
        parameters("tags".as[String].?, "combineTagsOr".as[Boolean].?) { (tags, combineTagsOr) => 
            customService.getAemHealthCheck(tags = tags, combineTagsOr = combineTagsOr)
        }
      }
    } ~
    path("apps" / "system" / "config" / "com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck") { 
      post { 
        parameters("bundles.ignored".as[String].?, "bundles.ignored@TypeHint".as[String].?) { (bundlesPeriodignored, bundlesPeriodignoredAtTypeHint) => 
            customService.postConfigAemHealthCheckServlet(bundlesPeriodignored = bundlesPeriodignored, bundlesPeriodignoredAtTypeHint = bundlesPeriodignoredAtTypeHint)
        }
      }
    } ~
    path("apps" / "system" / "config" / "com.shinesolutions.aem.passwordreset.Activator") { 
      post { 
        parameters("pwdreset.authorizables".as[String].?, "pwdreset.authorizables@TypeHint".as[String].?) { (pwdresetPeriodauthorizables, pwdresetPeriodauthorizablesAtTypeHint) => 
            customService.postConfigAemPasswordReset(pwdresetPeriodauthorizables = pwdresetPeriodauthorizables, pwdresetPeriodauthorizablesAtTypeHint = pwdresetPeriodauthorizablesAtTypeHint)
        }
      }
    }
}


trait CustomApiService {

  def getAemHealthCheckDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def getAemHealthCheck(tags: Option[String], combineTagsOr: Option[Boolean]): Route

  def postConfigAemHealthCheckServletDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postConfigAemHealthCheckServlet(bundlesPeriodignored: Option[String], bundlesPeriodignoredAtTypeHint: Option[String]): Route

  def postConfigAemPasswordResetDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postConfigAemPasswordReset(pwdresetPeriodauthorizables: Option[String], pwdresetPeriodauthorizablesAtTypeHint: Option[String]): Route

}



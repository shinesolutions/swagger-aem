/**
* Adobe Experience Manager (AEM) API
* Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
*
* The version of the OpenAPI document: 3.5.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.apis

import com.google.gson.Gson
import io.ktor.application.*
import io.ktor.auth.*
import io.ktor.http.*
import io.ktor.response.*
import org.openapitools.server.Paths
import io.ktor.locations.*
import io.ktor.routing.*
import org.openapitools.server.infrastructure.ApiPrincipal

@KtorExperimentalLocationsAPI
fun Route.CqApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    get<Paths.getLoginPage> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    authenticate("aemAuth") {
    post<Paths.postCqActions> {
        val principal = call.authentication.principal<UserIdPrincipal>()!!
        
        call.respond(HttpStatusCode.NotImplemented)
    }
    }

}

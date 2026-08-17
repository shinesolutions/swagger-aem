package org.openapitools.server

import io.ktor.server.routing.*
import org.openapitools.server.apis.ConsoleApi
import org.openapitools.server.apis.CqApi
import org.openapitools.server.apis.CrxApi
import org.openapitools.server.apis.CustomApi
import org.openapitools.server.apis.GraniteApi
import org.openapitools.server.apis.SlingApi



fun Route.AllApis() {
    ConsoleApi()
    CqApi()
    CrxApi()
    CustomApi()
    GraniteApi()
    SlingApi()
}

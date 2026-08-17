package org.openapitools.server.api.api

import misk.inject.KAbstractModule
import misk.web.WebActionModule
import jakarta.inject.Singleton
import org.openapitools.server.api.api.ConsoleApiAction
import org.openapitools.server.api.api.CqApiAction
import org.openapitools.server.api.api.CrxApiAction
import org.openapitools.server.api.api.CustomApiAction
import org.openapitools.server.api.api.GraniteApiAction
import org.openapitools.server.api.api.SlingApiAction

@Singleton
class OpenApiModule : KAbstractModule() {
    override fun configure() {
        install(WebActionModule.create<ConsoleApiAction>())
        install(WebActionModule.create<CqApiAction>())
        install(WebActionModule.create<CrxApiAction>())
        install(WebActionModule.create<CustomApiAction>())
        install(WebActionModule.create<GraniteApiAction>())
        install(WebActionModule.create<SlingApiAction>())
    }
}
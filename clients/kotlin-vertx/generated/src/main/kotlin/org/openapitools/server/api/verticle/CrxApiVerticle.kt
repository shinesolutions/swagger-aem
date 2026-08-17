package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CrxApiVerticle())
}

class CrxApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.CrxApiImpl").newInstance() as CrxApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CrxApi.address)
            .register(CrxApi::class.java,instance)
    }
}
package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(GraniteApiVerticle())
}

class GraniteApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.GraniteApiImpl").newInstance() as GraniteApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(GraniteApi.address)
            .register(GraniteApi::class.java,instance)
    }
}
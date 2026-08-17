package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CqApiVerticle())
}

class CqApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.CqApiImpl").newInstance() as CqApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CqApi.address)
            .register(CqApi::class.java,instance)
    }
}
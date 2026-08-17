package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(SlingApiVerticle())
}

class SlingApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.SlingApiImpl").newInstance() as SlingApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(SlingApi.address)
            .register(SlingApi::class.java,instance)
    }
}
package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CustomApiVerticle())
}

class CustomApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.CustomApiImpl").newInstance() as CustomApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CustomApi.address)
            .register(CustomApi::class.java,instance)
    }
}
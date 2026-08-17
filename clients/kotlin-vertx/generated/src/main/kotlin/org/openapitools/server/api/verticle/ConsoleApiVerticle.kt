package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ConsoleApiVerticle())
}

class ConsoleApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ConsoleApiImpl").newInstance() as ConsoleApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ConsoleApi.address)
            .register(ConsoleApi::class.java,instance)
    }
}
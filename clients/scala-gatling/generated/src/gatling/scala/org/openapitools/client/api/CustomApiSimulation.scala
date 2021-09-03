package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class CustomApiSimulation extends Simulation {

    def getCurrentDirectory = new File("").getAbsolutePath
    def userDataDirectory = getCurrentDirectory + "/src/gatling/resources/data"

    // basic test setup
    val configName = System.getProperty("testConfig", "baseline")
    val config = ConfigFactory.load(configName).withFallback(ConfigFactory.load("default"))
    val durationSeconds = config.getInt("performance.durationSeconds")
    val rampUpSeconds = config.getInt("performance.rampUpSeconds")
    val rampDownSeconds = config.getInt("performance.rampDownSeconds")
    val authentication = config.getString("performance.authorizationHeader")
    val acceptHeader = config.getString("performance.acceptType")
    val contentTypeHeader = config.getString("performance.contentType")
    val rateMultiplier = config.getDouble("performance.rateMultiplier")
    val instanceMultiplier = config.getDouble("performance.instanceMultiplier")

    // global assertion data
    val globalResponseTimeMinLTE = config.getInt("performance.global.assertions.responseTime.min.lte")
    val globalResponseTimeMinGTE = config.getInt("performance.global.assertions.responseTime.min.gte")
    val globalResponseTimeMaxLTE = config.getInt("performance.global.assertions.responseTime.max.lte")
    val globalResponseTimeMaxGTE = config.getInt("performance.global.assertions.responseTime.max.gte")
    val globalResponseTimeMeanLTE = config.getInt("performance.global.assertions.responseTime.mean.lte")
    val globalResponseTimeMeanGTE = config.getInt("performance.global.assertions.responseTime.mean.gte")
    val globalResponseTimeFailedRequestsPercentLTE = config.getDouble("performance.global.assertions.failedRequests.percent.lte")
    val globalResponseTimeFailedRequestsPercentGTE = config.getDouble("performance.global.assertions.failedRequests.percent.gte")
    val globalResponseTimeSuccessfulRequestsPercentLTE = config.getDouble("performance.global.assertions.successfulRequests.percent.lte")
    val globalResponseTimeSuccessfulRequestsPercentGTE = config.getDouble("performance.global.assertions.successfulRequests.percent.gte")

// Setup http protocol configuration
    val httpConf = http
        .baseURL("http://localhost")
        .doNotTrackHeader("1")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .acceptEncodingHeader("gzip, deflate")
        .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")
        .acceptHeader(acceptHeader)
        .contentTypeHeader(contentTypeHeader)

    // set authorization header if it has been modified from config
    if(!authentication.equals("~MANUAL_ENTRY")){
        httpConf.authorizationHeader(authentication)
    }

    // Setup all the operations per second for the test to ultimately be generated from configs
    val getAemHealthCheckPerSecond = config.getDouble("performance.operationsPerSecond.getAemHealthCheck") * rateMultiplier * instanceMultiplier
    val postConfigAemHealthCheckServletPerSecond = config.getDouble("performance.operationsPerSecond.postConfigAemHealthCheckServlet") * rateMultiplier * instanceMultiplier
    val postConfigAemPasswordResetPerSecond = config.getDouble("performance.operationsPerSecond.postConfigAemPasswordReset") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val getAemHealthCheckQUERYFeeder = csv(userDataDirectory + File.separator + "getAemHealthCheck-queryParams.csv").random
    val postConfigAemHealthCheckServletQUERYFeeder = csv(userDataDirectory + File.separator + "postConfigAemHealthCheckServlet-queryParams.csv").random
    val postConfigAemPasswordResetQUERYFeeder = csv(userDataDirectory + File.separator + "postConfigAemPasswordReset-queryParams.csv").random

    // Setup all scenarios

    
    val scngetAemHealthCheck = scenario("getAemHealthCheckSimulation")
        .feed(getAemHealthCheckQUERYFeeder)
        .exec(http("getAemHealthCheck")
        .httpRequest("GET","/system/health")
        .queryParam("tags","${tags}")
        .queryParam("combineTagsOr","${combineTagsOr}")
)

    // Run scngetAemHealthCheck with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAemHealthCheck.inject(
        rampUsersPerSec(1) to(getAemHealthCheckPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAemHealthCheckPerSecond) during(durationSeconds),
        rampUsersPerSec(getAemHealthCheckPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostConfigAemHealthCheckServlet = scenario("postConfigAemHealthCheckServletSimulation")
        .feed(postConfigAemHealthCheckServletQUERYFeeder)
        .exec(http("postConfigAemHealthCheckServlet")
        .httpRequest("POST","/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck")
        .queryParam("bundles.ignored","${bundles.ignored}")
        .queryParam("bundles.ignored@TypeHint","${bundles.ignored@TypeHint}")
)

    // Run scnpostConfigAemHealthCheckServlet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostConfigAemHealthCheckServlet.inject(
        rampUsersPerSec(1) to(postConfigAemHealthCheckServletPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postConfigAemHealthCheckServletPerSecond) during(durationSeconds),
        rampUsersPerSec(postConfigAemHealthCheckServletPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostConfigAemPasswordReset = scenario("postConfigAemPasswordResetSimulation")
        .feed(postConfigAemPasswordResetQUERYFeeder)
        .exec(http("postConfigAemPasswordReset")
        .httpRequest("POST","/apps/system/config/com.shinesolutions.aem.passwordreset.Activator")
        .queryParam("pwdreset.authorizables@TypeHint","${pwdreset.authorizables@TypeHint}")
        .queryParam("pwdreset.authorizables","${pwdreset.authorizables}")
)

    // Run scnpostConfigAemPasswordReset with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostConfigAemPasswordReset.inject(
        rampUsersPerSec(1) to(postConfigAemPasswordResetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postConfigAemPasswordResetPerSecond) during(durationSeconds),
        rampUsersPerSec(postConfigAemPasswordResetPerSecond) to(1) during(rampDownSeconds)
    )

    setUp(
        scenarioBuilders.toList
    ).protocols(httpConf).assertions(
        global.responseTime.min.lte(globalResponseTimeMinLTE),
        global.responseTime.min.gte(globalResponseTimeMinGTE),
        global.responseTime.max.lte(globalResponseTimeMaxLTE),
        global.responseTime.max.gte(globalResponseTimeMaxGTE),
        global.responseTime.mean.lte(globalResponseTimeMeanLTE),
        global.responseTime.mean.gte(globalResponseTimeMeanGTE),
        global.failedRequests.percent.lte(globalResponseTimeFailedRequestsPercentLTE),
        global.failedRequests.percent.gte(globalResponseTimeFailedRequestsPercentGTE),
        global.successfulRequests.percent.lte(globalResponseTimeSuccessfulRequestsPercentLTE),
        global.successfulRequests.percent.gte(globalResponseTimeSuccessfulRequestsPercentGTE)
    )
}

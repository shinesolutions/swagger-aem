package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class CrxApiSimulation extends Simulation {

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
    val getCrxdeStatusPerSecond = config.getDouble("performance.operationsPerSecond.getCrxdeStatus") * rateMultiplier * instanceMultiplier
    val getInstallStatusPerSecond = config.getDouble("performance.operationsPerSecond.getInstallStatus") * rateMultiplier * instanceMultiplier
    val getPackageManagerServletPerSecond = config.getDouble("performance.operationsPerSecond.getPackageManagerServlet") * rateMultiplier * instanceMultiplier
    val postPackageServicePerSecond = config.getDouble("performance.operationsPerSecond.postPackageService") * rateMultiplier * instanceMultiplier
    val postPackageServiceJsonPerSecond = config.getDouble("performance.operationsPerSecond.postPackageServiceJson") * rateMultiplier * instanceMultiplier
    val postPackageUpdatePerSecond = config.getDouble("performance.operationsPerSecond.postPackageUpdate") * rateMultiplier * instanceMultiplier
    val postSetPasswordPerSecond = config.getDouble("performance.operationsPerSecond.postSetPassword") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val postPackageServiceQUERYFeeder = csv(userDataDirectory + File.separator + "postPackageService-queryParams.csv").random
    val postPackageServiceJsonQUERYFeeder = csv(userDataDirectory + File.separator + "postPackageServiceJson-queryParams.csv").random
    val postPackageServiceJsonPATHFeeder = csv(userDataDirectory + File.separator + "postPackageServiceJson-pathParams.csv").random
    val postPackageUpdateQUERYFeeder = csv(userDataDirectory + File.separator + "postPackageUpdate-queryParams.csv").random
    val postSetPasswordQUERYFeeder = csv(userDataDirectory + File.separator + "postSetPassword-queryParams.csv").random

    // Setup all scenarios

    
    val scngetCrxdeStatus = scenario("getCrxdeStatusSimulation")
        .exec(http("getCrxdeStatus")
        .httpRequest("GET","/crx/server/crx.default/jcr:root/.1.json")
)

    // Run scngetCrxdeStatus with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCrxdeStatus.inject(
        rampUsersPerSec(1) to(getCrxdeStatusPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCrxdeStatusPerSecond) during(durationSeconds),
        rampUsersPerSec(getCrxdeStatusPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetInstallStatus = scenario("getInstallStatusSimulation")
        .exec(http("getInstallStatus")
        .httpRequest("GET","/crx/packmgr/installstatus.jsp")
)

    // Run scngetInstallStatus with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetInstallStatus.inject(
        rampUsersPerSec(1) to(getInstallStatusPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getInstallStatusPerSecond) during(durationSeconds),
        rampUsersPerSec(getInstallStatusPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetPackageManagerServlet = scenario("getPackageManagerServletSimulation")
        .exec(http("getPackageManagerServlet")
        .httpRequest("GET","/crx/packmgr/service/script.html")
)

    // Run scngetPackageManagerServlet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetPackageManagerServlet.inject(
        rampUsersPerSec(1) to(getPackageManagerServletPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getPackageManagerServletPerSecond) during(durationSeconds),
        rampUsersPerSec(getPackageManagerServletPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostPackageService = scenario("postPackageServiceSimulation")
        .feed(postPackageServiceQUERYFeeder)
        .exec(http("postPackageService")
        .httpRequest("POST","/crx/packmgr/service.jsp")
        .queryParam("cmd","${cmd}")
)

    // Run scnpostPackageService with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostPackageService.inject(
        rampUsersPerSec(1) to(postPackageServicePerSecond) during(rampUpSeconds),
        constantUsersPerSec(postPackageServicePerSecond) during(durationSeconds),
        rampUsersPerSec(postPackageServicePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostPackageServiceJson = scenario("postPackageServiceJsonSimulation")
        .feed(postPackageServiceJsonQUERYFeeder)
        .feed(postPackageServiceJsonPATHFeeder)
        .exec(http("postPackageServiceJson")
        .httpRequest("POST","/crx/packmgr/service/.json/${path}")
        .queryParam("packageVersion","${packageVersion}")
        .queryParam("force","${force}")
        .queryParam("cmd","${cmd}")
        .queryParam("groupName","${groupName}")
        .queryParam("recursive","${recursive}")
        .queryParam("packageName","${packageName}")
        .queryParam("_charset_","${_charset_}")
)

    // Run scnpostPackageServiceJson with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostPackageServiceJson.inject(
        rampUsersPerSec(1) to(postPackageServiceJsonPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postPackageServiceJsonPerSecond) during(durationSeconds),
        rampUsersPerSec(postPackageServiceJsonPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostPackageUpdate = scenario("postPackageUpdateSimulation")
        .feed(postPackageUpdateQUERYFeeder)
        .exec(http("postPackageUpdate")
        .httpRequest("POST","/crx/packmgr/update.jsp")
        .queryParam("version","${version}")
        .queryParam("filter","${filter}")
        .queryParam("packageName","${packageName}")
        .queryParam("groupName","${groupName}")
        .queryParam("path","${path}")
        .queryParam("_charset_","${_charset_}")
)

    // Run scnpostPackageUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostPackageUpdate.inject(
        rampUsersPerSec(1) to(postPackageUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(postPackageUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(postPackageUpdatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostSetPassword = scenario("postSetPasswordSimulation")
        .feed(postSetPasswordQUERYFeeder)
        .exec(http("postSetPassword")
        .httpRequest("POST","/crx/explorer/ui/setpassword.jsp")
        .queryParam("old","${old}")
        .queryParam("verify","${verify}")
        .queryParam("plain","${plain}")
)

    // Run scnpostSetPassword with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostSetPassword.inject(
        rampUsersPerSec(1) to(postSetPasswordPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postSetPasswordPerSecond) during(durationSeconds),
        rampUsersPerSec(postSetPasswordPerSecond) to(1) during(rampDownSeconds)
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

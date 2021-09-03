package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ConsoleApiSimulation extends Simulation {

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
    val getAemProductInfoPerSecond = config.getDouble("performance.operationsPerSecond.getAemProductInfo") * rateMultiplier * instanceMultiplier
    val getBundleInfoPerSecond = config.getDouble("performance.operationsPerSecond.getBundleInfo") * rateMultiplier * instanceMultiplier
    val getConfigMgrPerSecond = config.getDouble("performance.operationsPerSecond.getConfigMgr") * rateMultiplier * instanceMultiplier
    val postBundlePerSecond = config.getDouble("performance.operationsPerSecond.postBundle") * rateMultiplier * instanceMultiplier
    val postJmxRepositoryPerSecond = config.getDouble("performance.operationsPerSecond.postJmxRepository") * rateMultiplier * instanceMultiplier
    val postSamlConfigurationPerSecond = config.getDouble("performance.operationsPerSecond.postSamlConfiguration") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val getBundleInfoPATHFeeder = csv(userDataDirectory + File.separator + "getBundleInfo-pathParams.csv").random
    val postBundleQUERYFeeder = csv(userDataDirectory + File.separator + "postBundle-queryParams.csv").random
    val postBundlePATHFeeder = csv(userDataDirectory + File.separator + "postBundle-pathParams.csv").random
    val postJmxRepositoryPATHFeeder = csv(userDataDirectory + File.separator + "postJmxRepository-pathParams.csv").random
    val postSamlConfigurationQUERYFeeder = csv(userDataDirectory + File.separator + "postSamlConfiguration-queryParams.csv").random

    // Setup all scenarios

    
    val scngetAemProductInfo = scenario("getAemProductInfoSimulation")
        .exec(http("getAemProductInfo")
        .httpRequest("GET","/system/console/status-productinfo.json")
)

    // Run scngetAemProductInfo with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAemProductInfo.inject(
        rampUsersPerSec(1) to(getAemProductInfoPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAemProductInfoPerSecond) during(durationSeconds),
        rampUsersPerSec(getAemProductInfoPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetBundleInfo = scenario("getBundleInfoSimulation")
        .feed(getBundleInfoPATHFeeder)
        .exec(http("getBundleInfo")
        .httpRequest("GET","/system/console/bundles/${name}.json")
)

    // Run scngetBundleInfo with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetBundleInfo.inject(
        rampUsersPerSec(1) to(getBundleInfoPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getBundleInfoPerSecond) during(durationSeconds),
        rampUsersPerSec(getBundleInfoPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetConfigMgr = scenario("getConfigMgrSimulation")
        .exec(http("getConfigMgr")
        .httpRequest("GET","/system/console/configMgr")
)

    // Run scngetConfigMgr with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetConfigMgr.inject(
        rampUsersPerSec(1) to(getConfigMgrPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getConfigMgrPerSecond) during(durationSeconds),
        rampUsersPerSec(getConfigMgrPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostBundle = scenario("postBundleSimulation")
        .feed(postBundleQUERYFeeder)
        .feed(postBundlePATHFeeder)
        .exec(http("postBundle")
        .httpRequest("POST","/system/console/bundles/${name}")
        .queryParam("action","${action}")
)

    // Run scnpostBundle with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostBundle.inject(
        rampUsersPerSec(1) to(postBundlePerSecond) during(rampUpSeconds),
        constantUsersPerSec(postBundlePerSecond) during(durationSeconds),
        rampUsersPerSec(postBundlePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostJmxRepository = scenario("postJmxRepositorySimulation")
        .feed(postJmxRepositoryPATHFeeder)
        .exec(http("postJmxRepository")
        .httpRequest("POST","/system/console/jmx/com.adobe.granite:type=Repository/op/${action}")
)

    // Run scnpostJmxRepository with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostJmxRepository.inject(
        rampUsersPerSec(1) to(postJmxRepositoryPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postJmxRepositoryPerSecond) during(durationSeconds),
        rampUsersPerSec(postJmxRepositoryPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostSamlConfiguration = scenario("postSamlConfigurationSimulation")
        .feed(postSamlConfigurationQUERYFeeder)
        .exec(http("postSamlConfiguration")
        .httpRequest("POST","/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler")
        .queryParam("post","${post}")
        .queryParam("idpHttpRedirect","${idpHttpRedirect}")
        .queryParam("userIDAttribute","${userIDAttribute}")
        .queryParam("serviceProviderEntityId","${serviceProviderEntityId}")
        .queryParam("createUser","${createUser}")
        .queryParam("clockTolerance","${clockTolerance}")
        .queryParam("userIntermediatePath","${userIntermediatePath}")
        .queryParam("synchronizeAttributes","${synchronizeAttributes}")
        .queryParam("delete","${delete}")
        .queryParam("defaultGroups","${defaultGroups}")
        .queryParam("addGroupMemberships","${addGroupMemberships}")
        .queryParam("signatureMethod","${signatureMethod}")
        .queryParam("path","${path}")
        .queryParam("apply","${apply}")
        .queryParam("propertylist","${propertylist}")
        .queryParam("service.ranking","${service.ranking}")
        .queryParam("idpUrl","${idpUrl}")
        .queryParam("logoutUrl","${logoutUrl}")
        .queryParam("spPrivateKeyAlias","${spPrivateKeyAlias}")
        .queryParam("defaultRedirectUrl","${defaultRedirectUrl}")
        .queryParam("handleLogout","${handleLogout}")
        .queryParam("$location","${$location}")
        .queryParam("action","${action}")
        .queryParam("useEncryption","${useEncryption}")
        .queryParam("keyStorePassword","${keyStorePassword}")
        .queryParam("nameIdFormat","${nameIdFormat}")
        .queryParam("digestMethod","${digestMethod}")
        .queryParam("groupMembershipAttribute","${groupMembershipAttribute}")
        .queryParam("idpCertAlias","${idpCertAlias}")
        .queryParam("assertionConsumerServiceURL","${assertionConsumerServiceURL}")
)

    // Run scnpostSamlConfiguration with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostSamlConfiguration.inject(
        rampUsersPerSec(1) to(postSamlConfigurationPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postSamlConfigurationPerSecond) during(durationSeconds),
        rampUsersPerSec(postSamlConfigurationPerSecond) to(1) during(rampDownSeconds)
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

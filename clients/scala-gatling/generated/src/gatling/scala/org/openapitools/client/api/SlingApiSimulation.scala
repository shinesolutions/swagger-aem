package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class SlingApiSimulation extends Simulation {

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
    val deleteAgentPerSecond = config.getDouble("performance.operationsPerSecond.deleteAgent") * rateMultiplier * instanceMultiplier
    val deleteNodePerSecond = config.getDouble("performance.operationsPerSecond.deleteNode") * rateMultiplier * instanceMultiplier
    val getAgentPerSecond = config.getDouble("performance.operationsPerSecond.getAgent") * rateMultiplier * instanceMultiplier
    val getAgentsPerSecond = config.getDouble("performance.operationsPerSecond.getAgents") * rateMultiplier * instanceMultiplier
    val getAuthorizableKeystorePerSecond = config.getDouble("performance.operationsPerSecond.getAuthorizableKeystore") * rateMultiplier * instanceMultiplier
    val getKeystorePerSecond = config.getDouble("performance.operationsPerSecond.getKeystore") * rateMultiplier * instanceMultiplier
    val getNodePerSecond = config.getDouble("performance.operationsPerSecond.getNode") * rateMultiplier * instanceMultiplier
    val getPackagePerSecond = config.getDouble("performance.operationsPerSecond.getPackage") * rateMultiplier * instanceMultiplier
    val getPackageFilterPerSecond = config.getDouble("performance.operationsPerSecond.getPackageFilter") * rateMultiplier * instanceMultiplier
    val getQueryPerSecond = config.getDouble("performance.operationsPerSecond.getQuery") * rateMultiplier * instanceMultiplier
    val getTruststorePerSecond = config.getDouble("performance.operationsPerSecond.getTruststore") * rateMultiplier * instanceMultiplier
    val getTruststoreInfoPerSecond = config.getDouble("performance.operationsPerSecond.getTruststoreInfo") * rateMultiplier * instanceMultiplier
    val postAgentPerSecond = config.getDouble("performance.operationsPerSecond.postAgent") * rateMultiplier * instanceMultiplier
    val postAuthorizableKeystorePerSecond = config.getDouble("performance.operationsPerSecond.postAuthorizableKeystore") * rateMultiplier * instanceMultiplier
    val postAuthorizablesPerSecond = config.getDouble("performance.operationsPerSecond.postAuthorizables") * rateMultiplier * instanceMultiplier
    val postConfigAdobeGraniteSamlAuthenticationHandlerPerSecond = config.getDouble("performance.operationsPerSecond.postConfigAdobeGraniteSamlAuthenticationHandler") * rateMultiplier * instanceMultiplier
    val postConfigApacheFelixJettyBasedHttpServicePerSecond = config.getDouble("performance.operationsPerSecond.postConfigApacheFelixJettyBasedHttpService") * rateMultiplier * instanceMultiplier
    val postConfigApacheHttpComponentsProxyConfigurationPerSecond = config.getDouble("performance.operationsPerSecond.postConfigApacheHttpComponentsProxyConfiguration") * rateMultiplier * instanceMultiplier
    val postConfigApacheSlingDavExServletPerSecond = config.getDouble("performance.operationsPerSecond.postConfigApacheSlingDavExServlet") * rateMultiplier * instanceMultiplier
    val postConfigApacheSlingGetServletPerSecond = config.getDouble("performance.operationsPerSecond.postConfigApacheSlingGetServlet") * rateMultiplier * instanceMultiplier
    val postConfigApacheSlingReferrerFilterPerSecond = config.getDouble("performance.operationsPerSecond.postConfigApacheSlingReferrerFilter") * rateMultiplier * instanceMultiplier
    val postConfigPropertyPerSecond = config.getDouble("performance.operationsPerSecond.postConfigProperty") * rateMultiplier * instanceMultiplier
    val postNodePerSecond = config.getDouble("performance.operationsPerSecond.postNode") * rateMultiplier * instanceMultiplier
    val postNodeRwPerSecond = config.getDouble("performance.operationsPerSecond.postNodeRw") * rateMultiplier * instanceMultiplier
    val postPathPerSecond = config.getDouble("performance.operationsPerSecond.postPath") * rateMultiplier * instanceMultiplier
    val postQueryPerSecond = config.getDouble("performance.operationsPerSecond.postQuery") * rateMultiplier * instanceMultiplier
    val postTreeActivationPerSecond = config.getDouble("performance.operationsPerSecond.postTreeActivation") * rateMultiplier * instanceMultiplier
    val postTruststorePerSecond = config.getDouble("performance.operationsPerSecond.postTruststore") * rateMultiplier * instanceMultiplier
    val postTruststorePKCS12PerSecond = config.getDouble("performance.operationsPerSecond.postTruststorePKCS12") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val deleteAgentPATHFeeder = csv(userDataDirectory + File.separator + "deleteAgent-pathParams.csv").random
    val deleteNodePATHFeeder = csv(userDataDirectory + File.separator + "deleteNode-pathParams.csv").random
    val getAgentPATHFeeder = csv(userDataDirectory + File.separator + "getAgent-pathParams.csv").random
    val getAgentsPATHFeeder = csv(userDataDirectory + File.separator + "getAgents-pathParams.csv").random
    val getAuthorizableKeystorePATHFeeder = csv(userDataDirectory + File.separator + "getAuthorizableKeystore-pathParams.csv").random
    val getKeystorePATHFeeder = csv(userDataDirectory + File.separator + "getKeystore-pathParams.csv").random
    val getNodePATHFeeder = csv(userDataDirectory + File.separator + "getNode-pathParams.csv").random
    val getPackagePATHFeeder = csv(userDataDirectory + File.separator + "getPackage-pathParams.csv").random
    val getPackageFilterPATHFeeder = csv(userDataDirectory + File.separator + "getPackageFilter-pathParams.csv").random
    val getQueryQUERYFeeder = csv(userDataDirectory + File.separator + "getQuery-queryParams.csv").random
    val postAgentQUERYFeeder = csv(userDataDirectory + File.separator + "postAgent-queryParams.csv").random
    val postAgentPATHFeeder = csv(userDataDirectory + File.separator + "postAgent-pathParams.csv").random
    val postAuthorizableKeystoreQUERYFeeder = csv(userDataDirectory + File.separator + "postAuthorizableKeystore-queryParams.csv").random
    val postAuthorizableKeystorePATHFeeder = csv(userDataDirectory + File.separator + "postAuthorizableKeystore-pathParams.csv").random
    val postAuthorizablesQUERYFeeder = csv(userDataDirectory + File.separator + "postAuthorizables-queryParams.csv").random
    val postConfigAdobeGraniteSamlAuthenticationHandlerQUERYFeeder = csv(userDataDirectory + File.separator + "postConfigAdobeGraniteSamlAuthenticationHandler-queryParams.csv").random
    val postConfigApacheFelixJettyBasedHttpServiceQUERYFeeder = csv(userDataDirectory + File.separator + "postConfigApacheFelixJettyBasedHttpService-queryParams.csv").random
    val postConfigApacheHttpComponentsProxyConfigurationQUERYFeeder = csv(userDataDirectory + File.separator + "postConfigApacheHttpComponentsProxyConfiguration-queryParams.csv").random
    val postConfigApacheSlingDavExServletQUERYFeeder = csv(userDataDirectory + File.separator + "postConfigApacheSlingDavExServlet-queryParams.csv").random
    val postConfigApacheSlingGetServletQUERYFeeder = csv(userDataDirectory + File.separator + "postConfigApacheSlingGetServlet-queryParams.csv").random
    val postConfigApacheSlingReferrerFilterQUERYFeeder = csv(userDataDirectory + File.separator + "postConfigApacheSlingReferrerFilter-queryParams.csv").random
    val postConfigPropertyPATHFeeder = csv(userDataDirectory + File.separator + "postConfigProperty-pathParams.csv").random
    val postNodeQUERYFeeder = csv(userDataDirectory + File.separator + "postNode-queryParams.csv").random
    val postNodePATHFeeder = csv(userDataDirectory + File.separator + "postNode-pathParams.csv").random
    val postNodeRwQUERYFeeder = csv(userDataDirectory + File.separator + "postNodeRw-queryParams.csv").random
    val postNodeRwPATHFeeder = csv(userDataDirectory + File.separator + "postNodeRw-pathParams.csv").random
    val postPathQUERYFeeder = csv(userDataDirectory + File.separator + "postPath-queryParams.csv").random
    val postPathPATHFeeder = csv(userDataDirectory + File.separator + "postPath-pathParams.csv").random
    val postQueryQUERYFeeder = csv(userDataDirectory + File.separator + "postQuery-queryParams.csv").random
    val postTreeActivationQUERYFeeder = csv(userDataDirectory + File.separator + "postTreeActivation-queryParams.csv").random
    val postTruststoreQUERYFeeder = csv(userDataDirectory + File.separator + "postTruststore-queryParams.csv").random

    // Setup all scenarios

    
    val scndeleteAgent = scenario("deleteAgentSimulation")
        .feed(deleteAgentPATHFeeder)
        .exec(http("deleteAgent")
        .httpRequest("DELETE","/etc/replication/agents.${runmode}/${name}")
)

    // Run scndeleteAgent with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteAgent.inject(
        rampUsersPerSec(1) to(deleteAgentPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteAgentPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteAgentPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndeleteNode = scenario("deleteNodeSimulation")
        .feed(deleteNodePATHFeeder)
        .exec(http("deleteNode")
        .httpRequest("DELETE","/${path}/${name}")
)

    // Run scndeleteNode with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteNode.inject(
        rampUsersPerSec(1) to(deleteNodePerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteNodePerSecond) during(durationSeconds),
        rampUsersPerSec(deleteNodePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetAgent = scenario("getAgentSimulation")
        .feed(getAgentPATHFeeder)
        .exec(http("getAgent")
        .httpRequest("GET","/etc/replication/agents.${runmode}/${name}")
)

    // Run scngetAgent with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAgent.inject(
        rampUsersPerSec(1) to(getAgentPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAgentPerSecond) during(durationSeconds),
        rampUsersPerSec(getAgentPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetAgents = scenario("getAgentsSimulation")
        .feed(getAgentsPATHFeeder)
        .exec(http("getAgents")
        .httpRequest("GET","/etc/replication/agents.${runmode}.-1.json")
)

    // Run scngetAgents with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAgents.inject(
        rampUsersPerSec(1) to(getAgentsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAgentsPerSecond) during(durationSeconds),
        rampUsersPerSec(getAgentsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetAuthorizableKeystore = scenario("getAuthorizableKeystoreSimulation")
        .feed(getAuthorizableKeystorePATHFeeder)
        .exec(http("getAuthorizableKeystore")
        .httpRequest("GET","/${intermediatePath}/${authorizableId}.ks.json")
)

    // Run scngetAuthorizableKeystore with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetAuthorizableKeystore.inject(
        rampUsersPerSec(1) to(getAuthorizableKeystorePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getAuthorizableKeystorePerSecond) during(durationSeconds),
        rampUsersPerSec(getAuthorizableKeystorePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetKeystore = scenario("getKeystoreSimulation")
        .feed(getKeystorePATHFeeder)
        .exec(http("getKeystore")
        .httpRequest("GET","/${intermediatePath}/${authorizableId}/keystore/store.p12")
)

    // Run scngetKeystore with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetKeystore.inject(
        rampUsersPerSec(1) to(getKeystorePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getKeystorePerSecond) during(durationSeconds),
        rampUsersPerSec(getKeystorePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetNode = scenario("getNodeSimulation")
        .feed(getNodePATHFeeder)
        .exec(http("getNode")
        .httpRequest("GET","/${path}/${name}")
)

    // Run scngetNode with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetNode.inject(
        rampUsersPerSec(1) to(getNodePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getNodePerSecond) during(durationSeconds),
        rampUsersPerSec(getNodePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetPackage = scenario("getPackageSimulation")
        .feed(getPackagePATHFeeder)
        .exec(http("getPackage")
        .httpRequest("GET","/etc/packages/${group}/${name}-${version}.zip")
)

    // Run scngetPackage with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetPackage.inject(
        rampUsersPerSec(1) to(getPackagePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getPackagePerSecond) during(durationSeconds),
        rampUsersPerSec(getPackagePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetPackageFilter = scenario("getPackageFilterSimulation")
        .feed(getPackageFilterPATHFeeder)
        .exec(http("getPackageFilter")
        .httpRequest("GET","/etc/packages/${group}/${name}-${version}.zip/jcr:content/vlt:definition/filter.tidy.2.json")
)

    // Run scngetPackageFilter with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetPackageFilter.inject(
        rampUsersPerSec(1) to(getPackageFilterPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getPackageFilterPerSecond) during(durationSeconds),
        rampUsersPerSec(getPackageFilterPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetQuery = scenario("getQuerySimulation")
        .feed(getQueryQUERYFeeder)
        .exec(http("getQuery")
        .httpRequest("GET","/bin/querybuilder.json")
        .queryParam("1_property","${1_property}")
        .queryParam("1_property.value","${1_property.value}")
        .queryParam("path","${path}")
        .queryParam("p.limit","${p.limit}")
)

    // Run scngetQuery with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetQuery.inject(
        rampUsersPerSec(1) to(getQueryPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getQueryPerSecond) during(durationSeconds),
        rampUsersPerSec(getQueryPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetTruststore = scenario("getTruststoreSimulation")
        .exec(http("getTruststore")
        .httpRequest("GET","/etc/truststore/truststore.p12")
)

    // Run scngetTruststore with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetTruststore.inject(
        rampUsersPerSec(1) to(getTruststorePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getTruststorePerSecond) during(durationSeconds),
        rampUsersPerSec(getTruststorePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetTruststoreInfo = scenario("getTruststoreInfoSimulation")
        .exec(http("getTruststoreInfo")
        .httpRequest("GET","/libs/granite/security/truststore.json")
)

    // Run scngetTruststoreInfo with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetTruststoreInfo.inject(
        rampUsersPerSec(1) to(getTruststoreInfoPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getTruststoreInfoPerSecond) during(durationSeconds),
        rampUsersPerSec(getTruststoreInfoPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostAgent = scenario("postAgentSimulation")
        .feed(postAgentQUERYFeeder)
        .feed(postAgentPATHFeeder)
        .exec(http("postAgent")
        .httpRequest("POST","/etc/replication/agents.${runmode}/${name}")
        .queryParam("jcr:content/proxyNTLMHost","${jcr:content/proxyNTLMHost}")
        .queryParam("jcr:content/enabled","${jcr:content/enabled}")
        .queryParam("jcr:content/protocolHTTPHeaders","${jcr:content/protocolHTTPHeaders}")
        .queryParam("jcr:content/sling:resourceType","${jcr:content/sling:resourceType}")
        .queryParam("jcr:content/protocolSocketTimeout","${jcr:content/protocolSocketTimeout}")
        .queryParam("jcr:content/jcr:lastModified","${jcr:content/jcr:lastModified}")
        .queryParam("jcr:content/jcr:description","${jcr:content/jcr:description}")
        .queryParam("jcr:content/triggerReceive","${jcr:content/triggerReceive}")
        .queryParam("jcr:content/cq:name","${jcr:content/cq:name}")
        .queryParam("jcr:content/protocolHTTPHeaders@TypeHint","${jcr:content/protocolHTTPHeaders@TypeHint}")
        .queryParam("jcr:content/cq:template","${jcr:content/cq:template}")
        .queryParam("jcr:content/retryDelay","${jcr:content/retryDelay}")
        .queryParam("jcr:content/triggerSpecific","${jcr:content/triggerSpecific}")
        .queryParam("jcr:content/transportUri","${jcr:content/transportUri}")
        .queryParam("jcr:content/triggerDistribute","${jcr:content/triggerDistribute}")
        .queryParam("jcr:content/protocolHTTPMethod","${jcr:content/protocolHTTPMethod}")
        .queryParam(":operation","${:operation}")
        .queryParam("jcr:content/logLevel","${jcr:content/logLevel}")
        .queryParam("jcr:content/proxyPassword","${jcr:content/proxyPassword}")
        .queryParam("jcr:content/noVersioning","${jcr:content/noVersioning}")
        .queryParam("jcr:content/cq:distribute","${jcr:content/cq:distribute}")
        .queryParam("jcr:content/queueBatchWaitTime","${jcr:content/queueBatchWaitTime}")
        .queryParam("jcr:content/protocolHTTPExpired","${jcr:content/protocolHTTPExpired}")
        .queryParam("jcr:content/triggerModified","${jcr:content/triggerModified}")
        .queryParam("jcr:content/cq:distribute@TypeHint","${jcr:content/cq:distribute@TypeHint}")
        .queryParam("jcr:content/proxyUser","${jcr:content/proxyUser}")
        .queryParam("jcr:content/transportNTLMDomain","${jcr:content/transportNTLMDomain}")
        .queryParam("jcr:content/proxyNTLMDomain","${jcr:content/proxyNTLMDomain}")
        .queryParam("jcr:content/proxyHost","${jcr:content/proxyHost}")
        .queryParam("jcr:content/triggerOnOffTime","${jcr:content/triggerOnOffTime}")
        .queryParam("jcr:content/noStatusUpdate","${jcr:content/noStatusUpdate}")
        .queryParam("jcr:content/queueBatchMaxSize","${jcr:content/queueBatchMaxSize}")
        .queryParam("jcr:content/jcr:lastModifiedBy","${jcr:content/jcr:lastModifiedBy}")
        .queryParam("jcr:content/reverseReplication","${jcr:content/reverseReplication}")
        .queryParam("jcr:content/ssl","${jcr:content/ssl}")
        .queryParam("jcr:content/transportPassword","${jcr:content/transportPassword}")
        .queryParam("jcr:content/jcr:title","${jcr:content/jcr:title}")
        .queryParam("jcr:content/proxyPort","${jcr:content/proxyPort}")
        .queryParam("jcr:content/serializationType","${jcr:content/serializationType}")
        .queryParam("jcr:content/transportUser","${jcr:content/transportUser}")
        .queryParam("jcr:content/transportNTLMHost","${jcr:content/transportNTLMHost}")
        .queryParam("jcr:content/userId","${jcr:content/userId}")
        .queryParam("jcr:content/protocolHTTPSRelaxed","${jcr:content/protocolHTTPSRelaxed}")
        .queryParam("jcr:primaryType","${jcr:primaryType}")
        .queryParam("jcr:content/jcr:mixinTypes","${jcr:content/jcr:mixinTypes}")
        .queryParam("jcr:content/protocolInterface","${jcr:content/protocolInterface}")
        .queryParam("jcr:content/protocolHTTPConnectionClosed","${jcr:content/protocolHTTPConnectionClosed}")
        .queryParam("jcr:content/protocolConnectTimeout","${jcr:content/protocolConnectTimeout}")
        .queryParam("jcr:content/protocolVersion","${jcr:content/protocolVersion}")
        .queryParam("jcr:content/queueBatchMode","${jcr:content/queueBatchMode}")
)

    // Run scnpostAgent with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostAgent.inject(
        rampUsersPerSec(1) to(postAgentPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postAgentPerSecond) during(durationSeconds),
        rampUsersPerSec(postAgentPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostAuthorizableKeystore = scenario("postAuthorizableKeystoreSimulation")
        .feed(postAuthorizableKeystoreQUERYFeeder)
        .feed(postAuthorizableKeystorePATHFeeder)
        .exec(http("postAuthorizableKeystore")
        .httpRequest("POST","/${intermediatePath}/${authorizableId}.ks.html")
        .queryParam("newPassword","${newPassword}")
        .queryParam("rePassword","${rePassword}")
        .queryParam("alias","${alias}")
        .queryParam(":operation","${:operation}")
        .queryParam("removeAlias","${removeAlias}")
        .queryParam("newAlias","${newAlias}")
        .queryParam("currentPassword","${currentPassword}")
        .queryParam("keyPassword","${keyPassword}")
        .queryParam("keyStorePass","${keyStorePass}")
)

    // Run scnpostAuthorizableKeystore with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostAuthorizableKeystore.inject(
        rampUsersPerSec(1) to(postAuthorizableKeystorePerSecond) during(rampUpSeconds),
        constantUsersPerSec(postAuthorizableKeystorePerSecond) during(durationSeconds),
        rampUsersPerSec(postAuthorizableKeystorePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostAuthorizables = scenario("postAuthorizablesSimulation")
        .feed(postAuthorizablesQUERYFeeder)
        .exec(http("postAuthorizables")
        .httpRequest("POST","/libs/granite/security/post/authorizables")
        .queryParam("createUser","${createUser}")
        .queryParam("authorizableId","${authorizableId}")
        .queryParam("createGroup","${createGroup}")
        .queryParam("rep:password","${rep:password}")
        .queryParam("profile/givenName","${profile/givenName}")
        .queryParam("intermediatePath","${intermediatePath}")
)

    // Run scnpostAuthorizables with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostAuthorizables.inject(
        rampUsersPerSec(1) to(postAuthorizablesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postAuthorizablesPerSecond) during(durationSeconds),
        rampUsersPerSec(postAuthorizablesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostConfigAdobeGraniteSamlAuthenticationHandler = scenario("postConfigAdobeGraniteSamlAuthenticationHandlerSimulation")
        .feed(postConfigAdobeGraniteSamlAuthenticationHandlerQUERYFeeder)
        .exec(http("postConfigAdobeGraniteSamlAuthenticationHandler")
        .httpRequest("POST","/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config")
        .queryParam("idpHttpRedirect","${idpHttpRedirect}")
        .queryParam("addGroupMemberships@TypeHint","${addGroupMemberships@TypeHint}")
        .queryParam("userIDAttribute","${userIDAttribute}")
        .queryParam("defaultGroups@TypeHint","${defaultGroups@TypeHint}")
        .queryParam("serviceProviderEntityId","${serviceProviderEntityId}")
        .queryParam("userIDAttribute@TypeHint","${userIDAttribute@TypeHint}")
        .queryParam("nameIdFormat@TypeHint","${nameIdFormat@TypeHint}")
        .queryParam("userIntermediatePath@TypeHint","${userIntermediatePath@TypeHint}")
        .queryParam("createUser","${createUser}")
        .queryParam("clockTolerance","${clockTolerance}")
        .queryParam("userIntermediatePath","${userIntermediatePath}")
        .queryParam("keyStorePassword@TypeHint","${keyStorePassword@TypeHint}")
        .queryParam("synchronizeAttributes","${synchronizeAttributes}")
        .queryParam("defaultGroups","${defaultGroups}")
        .queryParam("serviceProviderEntityId@TypeHint","${serviceProviderEntityId@TypeHint}")
        .queryParam("addGroupMemberships","${addGroupMemberships}")
        .queryParam("signatureMethod","${signatureMethod}")
        .queryParam("idpHttpRedirect@TypeHint","${idpHttpRedirect@TypeHint}")
        .queryParam("digestMethod@TypeHint","${digestMethod@TypeHint}")
        .queryParam("path","${path}")
        .queryParam("synchronizeAttributes@TypeHint","${synchronizeAttributes@TypeHint}")
        .queryParam("idpUrl@TypeHint","${idpUrl@TypeHint}")
        .queryParam("service.ranking@TypeHint","${service.ranking@TypeHint}")
        .queryParam("service.ranking","${service.ranking}")
        .queryParam("idpUrl","${idpUrl}")
        .queryParam("spPrivateKeyAlias@TypeHint","${spPrivateKeyAlias@TypeHint}")
        .queryParam("path@TypeHint","${path@TypeHint}")
        .queryParam("logoutUrl","${logoutUrl}")
        .queryParam("idpCertAlias@TypeHint","${idpCertAlias@TypeHint}")
        .queryParam("spPrivateKeyAlias","${spPrivateKeyAlias}")
        .queryParam("defaultRedirectUrl","${defaultRedirectUrl}")
        .queryParam("groupMembershipAttribute@TypeHint","${groupMembershipAttribute@TypeHint}")
        .queryParam("handleLogout","${handleLogout}")
        .queryParam("assertionConsumerServiceURL@TypeHint","${assertionConsumerServiceURL@TypeHint}")
        .queryParam("useEncryption","${useEncryption}")
        .queryParam("keyStorePassword","${keyStorePassword}")
        .queryParam("useEncryption@TypeHint","${useEncryption@TypeHint}")
        .queryParam("logoutUrl@TypeHint","${logoutUrl@TypeHint}")
        .queryParam("nameIdFormat","${nameIdFormat}")
        .queryParam("defaultRedirectUrl@TypeHint","${defaultRedirectUrl@TypeHint}")
        .queryParam("digestMethod","${digestMethod}")
        .queryParam("createUser@TypeHint","${createUser@TypeHint}")
        .queryParam("clockTolerance@TypeHint","${clockTolerance@TypeHint}")
        .queryParam("groupMembershipAttribute","${groupMembershipAttribute}")
        .queryParam("handleLogout@TypeHint","${handleLogout@TypeHint}")
        .queryParam("signatureMethod@TypeHint","${signatureMethod@TypeHint}")
        .queryParam("idpCertAlias","${idpCertAlias}")
        .queryParam("assertionConsumerServiceURL","${assertionConsumerServiceURL}")
)

    // Run scnpostConfigAdobeGraniteSamlAuthenticationHandler with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostConfigAdobeGraniteSamlAuthenticationHandler.inject(
        rampUsersPerSec(1) to(postConfigAdobeGraniteSamlAuthenticationHandlerPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postConfigAdobeGraniteSamlAuthenticationHandlerPerSecond) during(durationSeconds),
        rampUsersPerSec(postConfigAdobeGraniteSamlAuthenticationHandlerPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostConfigApacheFelixJettyBasedHttpService = scenario("postConfigApacheFelixJettyBasedHttpServiceSimulation")
        .feed(postConfigApacheFelixJettyBasedHttpServiceQUERYFeeder)
        .exec(http("postConfigApacheFelixJettyBasedHttpService")
        .httpRequest("POST","/apps/system/config/org.apache.felix.http")
        .queryParam("org.apache.felix.https.nio@TypeHint","${org.apache.felix.https.nio@TypeHint}")
        .queryParam("org.apache.felix.https.truststore@TypeHint","${org.apache.felix.https.truststore@TypeHint}")
        .queryParam("org.apache.felix.https.clientcertificate@TypeHint","${org.apache.felix.https.clientcertificate@TypeHint}")
        .queryParam("org.apache.felix.https.enable","${org.apache.felix.https.enable}")
        .queryParam("org.apache.felix.https.truststore.password@TypeHint","${org.apache.felix.https.truststore.password@TypeHint}")
        .queryParam("org.apache.felix.https.keystore.password","${org.apache.felix.https.keystore.password}")
        .queryParam("org.osgi.service.http.port.secure","${org.osgi.service.http.port.secure}")
        .queryParam("org.apache.felix.https.truststore","${org.apache.felix.https.truststore}")
        .queryParam("org.apache.felix.https.keystore.password@TypeHint","${org.apache.felix.https.keystore.password@TypeHint}")
        .queryParam("org.apache.felix.https.nio","${org.apache.felix.https.nio}")
        .queryParam("org.apache.felix.https.keystore","${org.apache.felix.https.keystore}")
        .queryParam("org.apache.felix.https.keystore.key.password@TypeHint","${org.apache.felix.https.keystore.key.password@TypeHint}")
        .queryParam("org.apache.felix.https.truststore.password","${org.apache.felix.https.truststore.password}")
        .queryParam("org.apache.felix.https.keystore@TypeHint","${org.apache.felix.https.keystore@TypeHint}")
        .queryParam("org.apache.felix.https.keystore.key","${org.apache.felix.https.keystore.key}")
        .queryParam("org.apache.felix.https.keystore.key@TypeHint","${org.apache.felix.https.keystore.key@TypeHint}")
        .queryParam("org.apache.felix.https.keystore.key.password","${org.apache.felix.https.keystore.key.password}")
        .queryParam("org.osgi.service.http.port.secure@TypeHint","${org.osgi.service.http.port.secure@TypeHint}")
        .queryParam("org.apache.felix.https.clientcertificate","${org.apache.felix.https.clientcertificate}")
        .queryParam("org.apache.felix.https.enable@TypeHint","${org.apache.felix.https.enable@TypeHint}")
)

    // Run scnpostConfigApacheFelixJettyBasedHttpService with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostConfigApacheFelixJettyBasedHttpService.inject(
        rampUsersPerSec(1) to(postConfigApacheFelixJettyBasedHttpServicePerSecond) during(rampUpSeconds),
        constantUsersPerSec(postConfigApacheFelixJettyBasedHttpServicePerSecond) during(durationSeconds),
        rampUsersPerSec(postConfigApacheFelixJettyBasedHttpServicePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostConfigApacheHttpComponentsProxyConfiguration = scenario("postConfigApacheHttpComponentsProxyConfigurationSimulation")
        .feed(postConfigApacheHttpComponentsProxyConfigurationQUERYFeeder)
        .exec(http("postConfigApacheHttpComponentsProxyConfiguration")
        .httpRequest("POST","/apps/system/config/org.apache.http.proxyconfigurator.config")
        .queryParam("proxy.host@TypeHint","${proxy.host@TypeHint}")
        .queryParam("proxy.port@TypeHint","${proxy.port@TypeHint}")
        .queryParam("proxy.exceptions","${proxy.exceptions}")
        .queryParam("proxy.password@TypeHint","${proxy.password@TypeHint}")
        .queryParam("proxy.user@TypeHint","${proxy.user@TypeHint}")
        .queryParam("proxy.password","${proxy.password}")
        .queryParam("proxy.enabled","${proxy.enabled}")
        .queryParam("proxy.exceptions@TypeHint","${proxy.exceptions@TypeHint}")
        .queryParam("proxy.port","${proxy.port}")
        .queryParam("proxy.host","${proxy.host}")
        .queryParam("proxy.user","${proxy.user}")
        .queryParam("proxy.enabled@TypeHint","${proxy.enabled@TypeHint}")
)

    // Run scnpostConfigApacheHttpComponentsProxyConfiguration with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostConfigApacheHttpComponentsProxyConfiguration.inject(
        rampUsersPerSec(1) to(postConfigApacheHttpComponentsProxyConfigurationPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postConfigApacheHttpComponentsProxyConfigurationPerSecond) during(durationSeconds),
        rampUsersPerSec(postConfigApacheHttpComponentsProxyConfigurationPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostConfigApacheSlingDavExServlet = scenario("postConfigApacheSlingDavExServletSimulation")
        .feed(postConfigApacheSlingDavExServletQUERYFeeder)
        .exec(http("postConfigApacheSlingDavExServlet")
        .httpRequest("POST","/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet")
        .queryParam("alias@TypeHint","${alias@TypeHint}")
        .queryParam("dav.create-absolute-uri","${dav.create-absolute-uri}")
        .queryParam("alias","${alias}")
        .queryParam("dav.create-absolute-uri@TypeHint","${dav.create-absolute-uri@TypeHint}")
)

    // Run scnpostConfigApacheSlingDavExServlet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostConfigApacheSlingDavExServlet.inject(
        rampUsersPerSec(1) to(postConfigApacheSlingDavExServletPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postConfigApacheSlingDavExServletPerSecond) during(durationSeconds),
        rampUsersPerSec(postConfigApacheSlingDavExServletPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostConfigApacheSlingGetServlet = scenario("postConfigApacheSlingGetServletSimulation")
        .feed(postConfigApacheSlingGetServletQUERYFeeder)
        .exec(http("postConfigApacheSlingGetServlet")
        .httpRequest("POST","/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet")
        .queryParam("enable.txt","${enable.txt}")
        .queryParam("enable.xml","${enable.xml}")
        .queryParam("enable.txt@TypeHint","${enable.txt@TypeHint}")
        .queryParam("enable.html@TypeHint","${enable.html@TypeHint}")
        .queryParam("json.maximumresults","${json.maximumresults}")
        .queryParam("enable.html","${enable.html}")
        .queryParam("json.maximumresults@TypeHint","${json.maximumresults@TypeHint}")
        .queryParam("enable.xml@TypeHint","${enable.xml@TypeHint}")
)

    // Run scnpostConfigApacheSlingGetServlet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostConfigApacheSlingGetServlet.inject(
        rampUsersPerSec(1) to(postConfigApacheSlingGetServletPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postConfigApacheSlingGetServletPerSecond) during(durationSeconds),
        rampUsersPerSec(postConfigApacheSlingGetServletPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostConfigApacheSlingReferrerFilter = scenario("postConfigApacheSlingReferrerFilterSimulation")
        .feed(postConfigApacheSlingReferrerFilterQUERYFeeder)
        .exec(http("postConfigApacheSlingReferrerFilter")
        .httpRequest("POST","/apps/system/config/org.apache.sling.security.impl.ReferrerFilter")
        .queryParam("allow.hosts.regexp@TypeHint","${allow.hosts.regexp@TypeHint}")
        .queryParam("filter.methods@TypeHint","${filter.methods@TypeHint}")
        .queryParam("allow.empty","${allow.empty}")
        .queryParam("allow.hosts@TypeHint","${allow.hosts@TypeHint}")
        .queryParam("allow.hosts","${allow.hosts}")
        .queryParam("allow.hosts.regexp","${allow.hosts.regexp}")
        .queryParam("allow.empty@TypeHint","${allow.empty@TypeHint}")
        .queryParam("filter.methods","${filter.methods}")
)

    // Run scnpostConfigApacheSlingReferrerFilter with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostConfigApacheSlingReferrerFilter.inject(
        rampUsersPerSec(1) to(postConfigApacheSlingReferrerFilterPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postConfigApacheSlingReferrerFilterPerSecond) during(durationSeconds),
        rampUsersPerSec(postConfigApacheSlingReferrerFilterPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostConfigProperty = scenario("postConfigPropertySimulation")
        .feed(postConfigPropertyPATHFeeder)
        .exec(http("postConfigProperty")
        .httpRequest("POST","/apps/system/config/${configNodeName}")
)

    // Run scnpostConfigProperty with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostConfigProperty.inject(
        rampUsersPerSec(1) to(postConfigPropertyPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postConfigPropertyPerSecond) during(durationSeconds),
        rampUsersPerSec(postConfigPropertyPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostNode = scenario("postNodeSimulation")
        .feed(postNodeQUERYFeeder)
        .feed(postNodePATHFeeder)
        .exec(http("postNode")
        .httpRequest("POST","/${path}/${name}")
        .queryParam("deleteAuthorizable","${deleteAuthorizable}")
        .queryParam(":operation","${:operation}")
)

    // Run scnpostNode with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostNode.inject(
        rampUsersPerSec(1) to(postNodePerSecond) during(rampUpSeconds),
        constantUsersPerSec(postNodePerSecond) during(durationSeconds),
        rampUsersPerSec(postNodePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostNodeRw = scenario("postNodeRwSimulation")
        .feed(postNodeRwQUERYFeeder)
        .feed(postNodeRwPATHFeeder)
        .exec(http("postNodeRw")
        .httpRequest("POST","/${path}/${name}.rw.html")
        .queryParam("addMembers","${addMembers}")
)

    // Run scnpostNodeRw with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostNodeRw.inject(
        rampUsersPerSec(1) to(postNodeRwPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postNodeRwPerSecond) during(durationSeconds),
        rampUsersPerSec(postNodeRwPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostPath = scenario("postPathSimulation")
        .feed(postPathQUERYFeeder)
        .feed(postPathPATHFeeder)
        .exec(http("postPath")
        .httpRequest("POST","/${path}/")
        .queryParam(":name","${:name}")
        .queryParam("jcr:primaryType","${jcr:primaryType}")
)

    // Run scnpostPath with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostPath.inject(
        rampUsersPerSec(1) to(postPathPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postPathPerSecond) during(durationSeconds),
        rampUsersPerSec(postPathPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostQuery = scenario("postQuerySimulation")
        .feed(postQueryQUERYFeeder)
        .exec(http("postQuery")
        .httpRequest("POST","/bin/querybuilder.json")
        .queryParam("1_property","${1_property}")
        .queryParam("1_property.value","${1_property.value}")
        .queryParam("path","${path}")
        .queryParam("p.limit","${p.limit}")
)

    // Run scnpostQuery with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostQuery.inject(
        rampUsersPerSec(1) to(postQueryPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postQueryPerSecond) during(durationSeconds),
        rampUsersPerSec(postQueryPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostTreeActivation = scenario("postTreeActivationSimulation")
        .feed(postTreeActivationQUERYFeeder)
        .exec(http("postTreeActivation")
        .httpRequest("POST","/etc/replication/treeactivation.html")
        .queryParam("ignoredeactivated","${ignoredeactivated}")
        .queryParam("onlymodified","${onlymodified}")
        .queryParam("path","${path}")
)

    // Run scnpostTreeActivation with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostTreeActivation.inject(
        rampUsersPerSec(1) to(postTreeActivationPerSecond) during(rampUpSeconds),
        constantUsersPerSec(postTreeActivationPerSecond) during(durationSeconds),
        rampUsersPerSec(postTreeActivationPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostTruststore = scenario("postTruststoreSimulation")
        .feed(postTruststoreQUERYFeeder)
        .exec(http("postTruststore")
        .httpRequest("POST","/libs/granite/security/post/truststore")
        .queryParam("newPassword","${newPassword}")
        .queryParam("rePassword","${rePassword}")
        .queryParam(":operation","${:operation}")
        .queryParam("keyStoreType","${keyStoreType}")
        .queryParam("removeAlias","${removeAlias}")
)

    // Run scnpostTruststore with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostTruststore.inject(
        rampUsersPerSec(1) to(postTruststorePerSecond) during(rampUpSeconds),
        constantUsersPerSec(postTruststorePerSecond) during(durationSeconds),
        rampUsersPerSec(postTruststorePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpostTruststorePKCS12 = scenario("postTruststorePKCS12Simulation")
        .exec(http("postTruststorePKCS12")
        .httpRequest("POST","/etc/truststore")
)

    // Run scnpostTruststorePKCS12 with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpostTruststorePKCS12.inject(
        rampUsersPerSec(1) to(postTruststorePKCS12PerSecond) during(rampUpSeconds),
        constantUsersPerSec(postTruststorePKCS12PerSecond) during(durationSeconds),
        rampUsersPerSec(postTruststorePKCS12PerSecond) to(1) during(rampDownSeconds)
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

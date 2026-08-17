package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.StringDirectives
import org.openapitools.server.MultipartDirectives
import org.openapitools.server.FileField
import org.openapitools.server.PartsAndFiles
import java.io.File
import org.openapitools.server.model.KeystoreInfo
import org.openapitools.server.model.TruststoreInfo
import scala.util.Try
import akka.http.scaladsl.server.MalformedRequestContentRejection
import akka.http.scaladsl.server.directives.FileInfo


class SlingApi(
    slingService: SlingApiService,
    slingMarshaller: SlingApiMarshaller
)  extends MultipartDirectives with StringDirectives {

  
  import slingMarshaller._

  lazy val route: Route =
    path("etc" / "replication" / "agents.{runmode}" / Segment) { (runmode, name) => 
      delete {  
            slingService.deleteAgent(runmode = runmode, name = name)
      }
    } ~
    path(Segment / Segment) { (path, name) => 
      delete {  
            slingService.deleteNode(path = path, name = name)
      }
    } ~
    path("etc" / "replication" / "agents.{runmode}" / Segment) { (runmode, name) => 
      get {  
            slingService.getAgent(runmode = runmode, name = name)
      }
    } ~
    path("etc" / "replication" / "agents.{runmode}.-1.json") { (runmode) => 
      get {  
            slingService.getAgents(runmode = runmode)
      }
    } ~
    path(Segment / "{authorizableId}.ks.json") { (intermediatePath, authorizableId) => 
      get {  
            slingService.getAuthorizableKeystore(intermediatePath = intermediatePath, authorizableId = authorizableId)
      }
    } ~
    path(Segment / Segment / "keystore" / "store.p12") { (intermediatePath, authorizableId) => 
      get {  
            slingService.getKeystore(intermediatePath = intermediatePath, authorizableId = authorizableId)
      }
    } ~
    path(Segment / Segment) { (path, name) => 
      get {  
            slingService.getNode(path = path, name = name)
      }
    } ~
    path("etc" / "packages" / Segment / "{name}-{version}.zip") { (group, name, version) => 
      get {  
            slingService.getPackage(group = group, name = name, version = version)
      }
    } ~
    path("etc" / "packages" / Segment / "{name}-{version}.zip" / "jcr:content" / "vlt:definition" / "filter.tidy.2.json") { (group, name, version) => 
      get {  
            slingService.getPackageFilter(group = group, name = name, version = version)
      }
    } ~
    path("bin" / "querybuilder.json") { 
      get { 
        parameters("path".as[String], "p.limit".as[Double], "1_property".as[String], "1_property.value".as[String]) { (path, pPeriodlimit, 1Property, 1PropertyPeriodvalue) => 
            slingService.getQuery(path = path, pPeriodlimit = pPeriodlimit, 1Property = 1Property, 1PropertyPeriodvalue = 1PropertyPeriodvalue)
        }
      }
    } ~
    path("etc" / "truststore" / "truststore.p12") { 
      get {  
            slingService.getTruststore()
      }
    } ~
    path("libs" / "granite" / "security" / "truststore.json") { 
      get {  
            slingService.getTruststoreInfo()
      }
    } ~
    path("etc" / "replication" / "agents.{runmode}" / Segment) { (runmode, name) => 
      post { 
        parameters("jcr:content/cq:distribute".as[Boolean].?, "jcr:content/cq:distribute@TypeHint".as[String].?, "jcr:content/cq:name".as[String].?, "jcr:content/cq:template".as[String].?, "jcr:content/aliasUpdate".as[Boolean].?, "jcr:content/enabled".as[Boolean].?, "jcr:content/jcr:description".as[String].?, "jcr:content/jcr:lastModified".as[String].?, "jcr:content/jcr:lastModifiedBy".as[String].?, "jcr:content/jcr:mixinTypes".as[String].?, "jcr:content/jcr:title".as[String].?, "jcr:content/logLevel".as[String].?, "jcr:content/noStatusUpdate".as[Boolean].?, "jcr:content/noVersioning".as[Boolean].?, "jcr:content/protocolConnectTimeout".as[Double].?, "jcr:content/protocolHTTPConnectionClosed".as[Boolean].?, "jcr:content/protocolHTTPExpired".as[String].?, "jcr:content/protocolHTTPHeaders".as[String].?, "jcr:content/protocolHTTPHeaders@TypeHint".as[String].?, "jcr:content/protocolHTTPMethod".as[String].?, "jcr:content/protocolHTTPSRelaxed".as[Boolean].?, "jcr:content/protocolInterface".as[String].?, "jcr:content/protocolSocketTimeout".as[Double].?, "jcr:content/protocolVersion".as[String].?, "jcr:content/proxyNTLMDomain".as[String].?, "jcr:content/proxyNTLMHost".as[String].?, "jcr:content/proxyHost".as[String].?, "jcr:content/proxyPassword".as[String].?, "jcr:content/proxyPort".as[Double].?, "jcr:content/proxyUser".as[String].?, "jcr:content/queueBatchMaxSize".as[Double].?, "jcr:content/queueBatchMode".as[String].?, "jcr:content/queueBatchWaitTime".as[Double].?, "jcr:content/retryDelay".as[String].?, "jcr:content/reverseReplication".as[Boolean].?, "jcr:content/serializationType".as[String].?, "jcr:content/sling:resourceType".as[String].?, "jcr:content/ssl".as[String].?, "jcr:content/transportNTLMDomain".as[String].?, "jcr:content/transportNTLMHost".as[String].?, "jcr:content/transportPassword".as[String].?, "jcr:content/transportUri".as[String].?, "jcr:content/transportUser".as[String].?, "jcr:content/triggerDistribute".as[Boolean].?, "jcr:content/triggerModified".as[Boolean].?, "jcr:content/triggerOnOffTime".as[Boolean].?, "jcr:content/triggerReceive".as[Boolean].?, "jcr:content/triggerSpecific".as[Boolean].?, "jcr:content/userId".as[String].?, "jcr:primaryType".as[String].?, ":operation".as[String].?) { (jcrContentSlashcqDistribute, jcrContentSlashcqDistributeAtTypeHint, jcrContentSlashcqName, jcrContentSlashcqTemplate, jcrContentSlashaliasUpdate, jcrContentSlashenabled, jcrContentSlashjcrDescription, jcrContentSlashjcrLastModified, jcrContentSlashjcrLastModifiedBy, jcrContentSlashjcrMixinTypes, jcrContentSlashjcrTitle, jcrContentSlashlogLevel, jcrContentSlashnoStatusUpdate, jcrContentSlashnoVersioning, jcrContentSlashprotocolConnectTimeout, jcrContentSlashprotocolHTTPConnectionClosed, jcrContentSlashprotocolHTTPExpired, jcrContentSlashprotocolHTTPHeaders, jcrContentSlashprotocolHTTPHeadersAtTypeHint, jcrContentSlashprotocolHTTPMethod, jcrContentSlashprotocolHTTPSRelaxed, jcrContentSlashprotocolInterface, jcrContentSlashprotocolSocketTimeout, jcrContentSlashprotocolVersion, jcrContentSlashproxyNTLMDomain, jcrContentSlashproxyNTLMHost, jcrContentSlashproxyHost, jcrContentSlashproxyPassword, jcrContentSlashproxyPort, jcrContentSlashproxyUser, jcrContentSlashqueueBatchMaxSize, jcrContentSlashqueueBatchMode, jcrContentSlashqueueBatchWaitTime, jcrContentSlashretryDelay, jcrContentSlashreverseReplication, jcrContentSlashserializationType, jcrContentSlashslingResourceType, jcrContentSlashssl, jcrContentSlashtransportNTLMDomain, jcrContentSlashtransportNTLMHost, jcrContentSlashtransportPassword, jcrContentSlashtransportUri, jcrContentSlashtransportUser, jcrContentSlashtriggerDistribute, jcrContentSlashtriggerModified, jcrContentSlashtriggerOnOffTime, jcrContentSlashtriggerReceive, jcrContentSlashtriggerSpecific, jcrContentSlashuserId, jcrPrimaryType, operation) => 
            slingService.postAgent(runmode = runmode, name = name, jcrContentSlashcqDistribute = jcrContentSlashcqDistribute, jcrContentSlashcqDistributeAtTypeHint = jcrContentSlashcqDistributeAtTypeHint, jcrContentSlashcqName = jcrContentSlashcqName, jcrContentSlashcqTemplate = jcrContentSlashcqTemplate, jcrContentSlashaliasUpdate = jcrContentSlashaliasUpdate, jcrContentSlashenabled = jcrContentSlashenabled, jcrContentSlashjcrDescription = jcrContentSlashjcrDescription, jcrContentSlashjcrLastModified = jcrContentSlashjcrLastModified, jcrContentSlashjcrLastModifiedBy = jcrContentSlashjcrLastModifiedBy, jcrContentSlashjcrMixinTypes = jcrContentSlashjcrMixinTypes, jcrContentSlashjcrTitle = jcrContentSlashjcrTitle, jcrContentSlashlogLevel = jcrContentSlashlogLevel, jcrContentSlashnoStatusUpdate = jcrContentSlashnoStatusUpdate, jcrContentSlashnoVersioning = jcrContentSlashnoVersioning, jcrContentSlashprotocolConnectTimeout = jcrContentSlashprotocolConnectTimeout, jcrContentSlashprotocolHTTPConnectionClosed = jcrContentSlashprotocolHTTPConnectionClosed, jcrContentSlashprotocolHTTPExpired = jcrContentSlashprotocolHTTPExpired, jcrContentSlashprotocolHTTPHeaders = jcrContentSlashprotocolHTTPHeaders, jcrContentSlashprotocolHTTPHeadersAtTypeHint = jcrContentSlashprotocolHTTPHeadersAtTypeHint, jcrContentSlashprotocolHTTPMethod = jcrContentSlashprotocolHTTPMethod, jcrContentSlashprotocolHTTPSRelaxed = jcrContentSlashprotocolHTTPSRelaxed, jcrContentSlashprotocolInterface = jcrContentSlashprotocolInterface, jcrContentSlashprotocolSocketTimeout = jcrContentSlashprotocolSocketTimeout, jcrContentSlashprotocolVersion = jcrContentSlashprotocolVersion, jcrContentSlashproxyNTLMDomain = jcrContentSlashproxyNTLMDomain, jcrContentSlashproxyNTLMHost = jcrContentSlashproxyNTLMHost, jcrContentSlashproxyHost = jcrContentSlashproxyHost, jcrContentSlashproxyPassword = jcrContentSlashproxyPassword, jcrContentSlashproxyPort = jcrContentSlashproxyPort, jcrContentSlashproxyUser = jcrContentSlashproxyUser, jcrContentSlashqueueBatchMaxSize = jcrContentSlashqueueBatchMaxSize, jcrContentSlashqueueBatchMode = jcrContentSlashqueueBatchMode, jcrContentSlashqueueBatchWaitTime = jcrContentSlashqueueBatchWaitTime, jcrContentSlashretryDelay = jcrContentSlashretryDelay, jcrContentSlashreverseReplication = jcrContentSlashreverseReplication, jcrContentSlashserializationType = jcrContentSlashserializationType, jcrContentSlashslingResourceType = jcrContentSlashslingResourceType, jcrContentSlashssl = jcrContentSlashssl, jcrContentSlashtransportNTLMDomain = jcrContentSlashtransportNTLMDomain, jcrContentSlashtransportNTLMHost = jcrContentSlashtransportNTLMHost, jcrContentSlashtransportPassword = jcrContentSlashtransportPassword, jcrContentSlashtransportUri = jcrContentSlashtransportUri, jcrContentSlashtransportUser = jcrContentSlashtransportUser, jcrContentSlashtriggerDistribute = jcrContentSlashtriggerDistribute, jcrContentSlashtriggerModified = jcrContentSlashtriggerModified, jcrContentSlashtriggerOnOffTime = jcrContentSlashtriggerOnOffTime, jcrContentSlashtriggerReceive = jcrContentSlashtriggerReceive, jcrContentSlashtriggerSpecific = jcrContentSlashtriggerSpecific, jcrContentSlashuserId = jcrContentSlashuserId, jcrPrimaryType = jcrPrimaryType, operation = operation)
        }
      }
    } ~
    path(Segment / "{authorizableId}.ks.html") { (intermediatePath, authorizableId) => 
      post { 
        parameters(":operation".as[String].?, "currentPassword".as[String].?, "newPassword".as[String].?, "rePassword".as[String].?, "keyPassword".as[String].?, "keyStorePass".as[String].?, "alias".as[String].?, "newAlias".as[String].?, "removeAlias".as[String].?) { (operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias) => 
        formAndFiles(FileField("cert-chain"))FileField("pk"))FileField("keyStore")),  { partsAndFiles => 
          val _____ : Try[Route] = for {
            cert-chain <- optToTry(partsAndFiles.files.get("cert-chain"), s"File cert-chain missing")
pk <- optToTry(partsAndFiles.files.get("pk"), s"File pk missing")
keyStore <- optToTry(partsAndFiles.files.get("keyStore"), s"File keyStore missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
              slingService.postAuthorizableKeystore(intermediatePath = intermediatePath, authorizableId = authorizableId, operation = operation, currentPassword = currentPassword, newPassword = newPassword, rePassword = rePassword, keyPassword = keyPassword, keyStorePass = keyStorePass, alias = alias, newAlias = newAlias, removeAlias = removeAlias, certChain = certChain, pk = pk, keyStore = keyStore)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
        }
      }
    } ~
    path("libs" / "granite" / "security" / "post" / "authorizables") { 
      post { 
        parameters("authorizableId".as[String], "intermediatePath".as[String], "createUser".as[String].?, "createGroup".as[String].?, "rep:password".as[String].?, "profile/givenName".as[String].?) { (authorizableId, intermediatePath, createUser, createGroup, repPassword, profileSlashgivenName) => 
            slingService.postAuthorizables(authorizableId = authorizableId, intermediatePath = intermediatePath, createUser = createUser, createGroup = createGroup, repPassword = repPassword, profileSlashgivenName = profileSlashgivenName)
        }
      }
    } ~
    path("apps" / "system" / "config" / "com.adobe.granite.auth.saml.SamlAuthenticationHandler.config") { 
      post { 
        parameters("keyStorePassword".as[String].?, "keyStorePassword@TypeHint".as[String].?, "service.ranking".as[Int].?, "service.ranking@TypeHint".as[String].?, "idpHttpRedirect".as[Boolean].?, "idpHttpRedirect@TypeHint".as[String].?, "createUser".as[Boolean].?, "createUser@TypeHint".as[String].?, "defaultRedirectUrl".as[String].?, "defaultRedirectUrl@TypeHint".as[String].?, "userIDAttribute".as[String].?, "userIDAttribute@TypeHint".as[String].?, "defaultGroups".as[String].?, "defaultGroups@TypeHint".as[String].?, "idpCertAlias".as[String].?, "idpCertAlias@TypeHint".as[String].?, "addGroupMemberships".as[Boolean].?, "addGroupMemberships@TypeHint".as[String].?, "path".as[String].?, "path@TypeHint".as[String].?, "synchronizeAttributes".as[String].?, "synchronizeAttributes@TypeHint".as[String].?, "clockTolerance".as[Int].?, "clockTolerance@TypeHint".as[String].?, "groupMembershipAttribute".as[String].?, "groupMembershipAttribute@TypeHint".as[String].?, "idpUrl".as[String].?, "idpUrl@TypeHint".as[String].?, "logoutUrl".as[String].?, "logoutUrl@TypeHint".as[String].?, "serviceProviderEntityId".as[String].?, "serviceProviderEntityId@TypeHint".as[String].?, "assertionConsumerServiceURL".as[String].?, "assertionConsumerServiceURL@TypeHint".as[String].?, "handleLogout".as[Boolean].?, "handleLogout@TypeHint".as[String].?, "spPrivateKeyAlias".as[String].?, "spPrivateKeyAlias@TypeHint".as[String].?, "useEncryption".as[Boolean].?, "useEncryption@TypeHint".as[String].?, "nameIdFormat".as[String].?, "nameIdFormat@TypeHint".as[String].?, "digestMethod".as[String].?, "digestMethod@TypeHint".as[String].?, "signatureMethod".as[String].?, "signatureMethod@TypeHint".as[String].?, "userIntermediatePath".as[String].?, "userIntermediatePath@TypeHint".as[String].?) { (keyStorePassword, keyStorePasswordAtTypeHint, servicePeriodranking, servicePeriodrankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint) => 
            slingService.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword = keyStorePassword, keyStorePasswordAtTypeHint = keyStorePasswordAtTypeHint, servicePeriodranking = servicePeriodranking, servicePeriodrankingAtTypeHint = servicePeriodrankingAtTypeHint, idpHttpRedirect = idpHttpRedirect, idpHttpRedirectAtTypeHint = idpHttpRedirectAtTypeHint, createUser = createUser, createUserAtTypeHint = createUserAtTypeHint, defaultRedirectUrl = defaultRedirectUrl, defaultRedirectUrlAtTypeHint = defaultRedirectUrlAtTypeHint, userIDAttribute = userIDAttribute, userIDAttributeAtTypeHint = userIDAttributeAtTypeHint, defaultGroups = defaultGroups, defaultGroupsAtTypeHint = defaultGroupsAtTypeHint, idpCertAlias = idpCertAlias, idpCertAliasAtTypeHint = idpCertAliasAtTypeHint, addGroupMemberships = addGroupMemberships, addGroupMembershipsAtTypeHint = addGroupMembershipsAtTypeHint, path = path, pathAtTypeHint = pathAtTypeHint, synchronizeAttributes = synchronizeAttributes, synchronizeAttributesAtTypeHint = synchronizeAttributesAtTypeHint, clockTolerance = clockTolerance, clockToleranceAtTypeHint = clockToleranceAtTypeHint, groupMembershipAttribute = groupMembershipAttribute, groupMembershipAttributeAtTypeHint = groupMembershipAttributeAtTypeHint, idpUrl = idpUrl, idpUrlAtTypeHint = idpUrlAtTypeHint, logoutUrl = logoutUrl, logoutUrlAtTypeHint = logoutUrlAtTypeHint, serviceProviderEntityId = serviceProviderEntityId, serviceProviderEntityIdAtTypeHint = serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL = assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint = assertionConsumerServiceURLAtTypeHint, handleLogout = handleLogout, handleLogoutAtTypeHint = handleLogoutAtTypeHint, spPrivateKeyAlias = spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint = spPrivateKeyAliasAtTypeHint, useEncryption = useEncryption, useEncryptionAtTypeHint = useEncryptionAtTypeHint, nameIdFormat = nameIdFormat, nameIdFormatAtTypeHint = nameIdFormatAtTypeHint, digestMethod = digestMethod, digestMethodAtTypeHint = digestMethodAtTypeHint, signatureMethod = signatureMethod, signatureMethodAtTypeHint = signatureMethodAtTypeHint, userIntermediatePath = userIntermediatePath, userIntermediatePathAtTypeHint = userIntermediatePathAtTypeHint)
        }
      }
    } ~
    path("apps" / "system" / "config" / "org.apache.felix.http") { 
      post { 
        parameters("org.apache.felix.https.nio".as[Boolean].?, "org.apache.felix.https.nio@TypeHint".as[String].?, "org.apache.felix.https.keystore".as[String].?, "org.apache.felix.https.keystore@TypeHint".as[String].?, "org.apache.felix.https.keystore.password".as[String].?, "org.apache.felix.https.keystore.password@TypeHint".as[String].?, "org.apache.felix.https.keystore.key".as[String].?, "org.apache.felix.https.keystore.key@TypeHint".as[String].?, "org.apache.felix.https.keystore.key.password".as[String].?, "org.apache.felix.https.keystore.key.password@TypeHint".as[String].?, "org.apache.felix.https.truststore".as[String].?, "org.apache.felix.https.truststore@TypeHint".as[String].?, "org.apache.felix.https.truststore.password".as[String].?, "org.apache.felix.https.truststore.password@TypeHint".as[String].?, "org.apache.felix.https.clientcertificate".as[String].?, "org.apache.felix.https.clientcertificate@TypeHint".as[String].?, "org.apache.felix.https.enable".as[Boolean].?, "org.apache.felix.https.enable@TypeHint".as[String].?, "org.osgi.service.http.port.secure".as[String].?, "org.osgi.service.http.port.secure@TypeHint".as[String].?) { (orgPeriodapachePeriodfelixPeriodhttpsPeriodnio, orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodenable, orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint) => 
            slingService.postConfigApacheFelixJettyBasedHttpService(orgPeriodapachePeriodfelixPeriodhttpsPeriodnio = orgPeriodapachePeriodfelixPeriodhttpsPeriodnio, orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint = orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint = orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore = orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint = orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword = orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword, orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint = orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate = orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate, orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint = orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint, orgPeriodapachePeriodfelixPeriodhttpsPeriodenable = orgPeriodapachePeriodfelixPeriodhttpsPeriodenable, orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint = orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure = orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure, orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint = orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint)
        }
      }
    } ~
    path("apps" / "system" / "config" / "org.apache.http.proxyconfigurator.config") { 
      post { 
        parameters("proxy.host".as[String].?, "proxy.host@TypeHint".as[String].?, "proxy.port".as[Int].?, "proxy.port@TypeHint".as[String].?, "proxy.exceptions".as[String].?, "proxy.exceptions@TypeHint".as[String].?, "proxy.enabled".as[Boolean].?, "proxy.enabled@TypeHint".as[String].?, "proxy.user".as[String].?, "proxy.user@TypeHint".as[String].?, "proxy.password".as[String].?, "proxy.password@TypeHint".as[String].?) { (proxyPeriodhost, proxyPeriodhostAtTypeHint, proxyPeriodport, proxyPeriodportAtTypeHint, proxyPeriodexceptions, proxyPeriodexceptionsAtTypeHint, proxyPeriodenabled, proxyPeriodenabledAtTypeHint, proxyPerioduser, proxyPerioduserAtTypeHint, proxyPeriodpassword, proxyPeriodpasswordAtTypeHint) => 
            slingService.postConfigApacheHttpComponentsProxyConfiguration(proxyPeriodhost = proxyPeriodhost, proxyPeriodhostAtTypeHint = proxyPeriodhostAtTypeHint, proxyPeriodport = proxyPeriodport, proxyPeriodportAtTypeHint = proxyPeriodportAtTypeHint, proxyPeriodexceptions = proxyPeriodexceptions, proxyPeriodexceptionsAtTypeHint = proxyPeriodexceptionsAtTypeHint, proxyPeriodenabled = proxyPeriodenabled, proxyPeriodenabledAtTypeHint = proxyPeriodenabledAtTypeHint, proxyPerioduser = proxyPerioduser, proxyPerioduserAtTypeHint = proxyPerioduserAtTypeHint, proxyPeriodpassword = proxyPeriodpassword, proxyPeriodpasswordAtTypeHint = proxyPeriodpasswordAtTypeHint)
        }
      }
    } ~
    path("apps" / "system" / "config" / "org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet") { 
      post { 
        parameters("alias".as[String].?, "alias@TypeHint".as[String].?, "dav.create-absolute-uri".as[Boolean].?, "dav.create-absolute-uri@TypeHint".as[String].?) { (alias, aliasAtTypeHint, davPeriodcreateAbsoluteUri, davPeriodcreateAbsoluteUriAtTypeHint) => 
            slingService.postConfigApacheSlingDavExServlet(alias = alias, aliasAtTypeHint = aliasAtTypeHint, davPeriodcreateAbsoluteUri = davPeriodcreateAbsoluteUri, davPeriodcreateAbsoluteUriAtTypeHint = davPeriodcreateAbsoluteUriAtTypeHint)
        }
      }
    } ~
    path("apps" / "system" / "config" / "org.apache.sling.servlets.get.DefaultGetServlet") { 
      post { 
        parameters("json.maximumresults".as[String].?, "json.maximumresults@TypeHint".as[String].?, "enable.html".as[Boolean].?, "enable.html@TypeHint".as[String].?, "enable.txt".as[Boolean].?, "enable.txt@TypeHint".as[String].?, "enable.xml".as[Boolean].?, "enable.xml@TypeHint".as[String].?) { (jsonPeriodmaximumresults, jsonPeriodmaximumresultsAtTypeHint, enablePeriodhtml, enablePeriodhtmlAtTypeHint, enablePeriodtxt, enablePeriodtxtAtTypeHint, enablePeriodxml, enablePeriodxmlAtTypeHint) => 
            slingService.postConfigApacheSlingGetServlet(jsonPeriodmaximumresults = jsonPeriodmaximumresults, jsonPeriodmaximumresultsAtTypeHint = jsonPeriodmaximumresultsAtTypeHint, enablePeriodhtml = enablePeriodhtml, enablePeriodhtmlAtTypeHint = enablePeriodhtmlAtTypeHint, enablePeriodtxt = enablePeriodtxt, enablePeriodtxtAtTypeHint = enablePeriodtxtAtTypeHint, enablePeriodxml = enablePeriodxml, enablePeriodxmlAtTypeHint = enablePeriodxmlAtTypeHint)
        }
      }
    } ~
    path("apps" / "system" / "config" / "org.apache.sling.security.impl.ReferrerFilter") { 
      post { 
        parameters("allow.empty".as[Boolean].?, "allow.empty@TypeHint".as[String].?, "allow.hosts".as[String].?, "allow.hosts@TypeHint".as[String].?, "allow.hosts.regexp".as[String].?, "allow.hosts.regexp@TypeHint".as[String].?, "filter.methods".as[String].?, "filter.methods@TypeHint".as[String].?) { (allowPeriodempty, allowPeriodemptyAtTypeHint, allowPeriodhosts, allowPeriodhostsAtTypeHint, allowPeriodhostsPeriodregexp, allowPeriodhostsPeriodregexpAtTypeHint, filterPeriodmethods, filterPeriodmethodsAtTypeHint) => 
            slingService.postConfigApacheSlingReferrerFilter(allowPeriodempty = allowPeriodempty, allowPeriodemptyAtTypeHint = allowPeriodemptyAtTypeHint, allowPeriodhosts = allowPeriodhosts, allowPeriodhostsAtTypeHint = allowPeriodhostsAtTypeHint, allowPeriodhostsPeriodregexp = allowPeriodhostsPeriodregexp, allowPeriodhostsPeriodregexpAtTypeHint = allowPeriodhostsPeriodregexpAtTypeHint, filterPeriodmethods = filterPeriodmethods, filterPeriodmethodsAtTypeHint = filterPeriodmethodsAtTypeHint)
        }
      }
    } ~
    path("apps" / "system" / "config" / Segment) { (configNodeName) => 
      post {  
            slingService.postConfigProperty(configNodeName = configNodeName)
      }
    } ~
    path(Segment / Segment) { (path, name) => 
      post { 
        parameters(":operation".as[String].?, "deleteAuthorizable".as[String].?) { (operation, deleteAuthorizable) => 
        formAndFiles(FileField("file")),  { partsAndFiles => 
          val _____ : Try[Route] = for {
            file <- optToTry(partsAndFiles.files.get("file"), s"File file missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
              slingService.postNode(path = path, name = name, operation = operation, deleteAuthorizable = deleteAuthorizable, file = file)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
        }
      }
    } ~
    path(Segment / "{name}.rw.html") { (path, name) => 
      post { 
        parameters("addMembers".as[String].?) { (addMembers) => 
            slingService.postNodeRw(path = path, name = name, addMembers = addMembers)
        }
      }
    } ~
    path(Segment) { (path) => 
      post { 
        parameters("jcr:primaryType".as[String], ":name".as[String]) { (jcrPrimaryType, name) => 
            slingService.postPath(path = path, jcrPrimaryType = jcrPrimaryType, name = name)
        }
      }
    } ~
    path("bin" / "querybuilder.json") { 
      post { 
        parameters("path".as[String], "p.limit".as[Double], "1_property".as[String], "1_property.value".as[String]) { (path, pPeriodlimit, 1Property, 1PropertyPeriodvalue) => 
            slingService.postQuery(path = path, pPeriodlimit = pPeriodlimit, 1Property = 1Property, 1PropertyPeriodvalue = 1PropertyPeriodvalue)
        }
      }
    } ~
    path("libs" / "replication" / "treeactivation.html") { 
      post { 
        parameters("ignoredeactivated".as[Boolean], "onlymodified".as[Boolean], "path".as[String], "cmd".as[String]) { (ignoredeactivated, onlymodified, path, cmd) => 
            slingService.postTreeActivation(ignoredeactivated = ignoredeactivated, onlymodified = onlymodified, path = path, cmd = cmd)
        }
      }
    } ~
    path("libs" / "granite" / "security" / "post" / "truststore") { 
      post { 
        parameters(":operation".as[String].?, "newPassword".as[String].?, "rePassword".as[String].?, "keyStoreType".as[String].?, "removeAlias".as[String].?) { (operation, newPassword, rePassword, keyStoreType, removeAlias) => 
        formAndFiles(FileField("certificate")),  { partsAndFiles => 
          val _____ : Try[Route] = for {
            certificate <- optToTry(partsAndFiles.files.get("certificate"), s"File certificate missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
              slingService.postTruststore(operation = operation, newPassword = newPassword, rePassword = rePassword, keyStoreType = keyStoreType, removeAlias = removeAlias, certificate = certificate)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
        }
      }
    } ~
    path("etc" / "truststore") { 
      post {  
        formAndFiles(FileField("truststore.p12")) { partsAndFiles => 
          val _____ : Try[Route] = for {
            truststore.p12 <- optToTry(partsAndFiles.files.get("truststore.p12"), s"File truststore.p12 missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
              slingService.postTruststorePKCS12(truststorePeriodp12 = truststorePeriodp12)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
      }
    }
}


trait SlingApiService {

  def deleteAgentDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def deleteAgent(runmode: String, name: String): Route

  def deleteNodeDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def deleteNode(path: String, name: String): Route

  def getAgentDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def getAgent(runmode: String, name: String): Route

  def getAgentsDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def getAgents(runmode: String): Route

  def getAuthorizableKeystore200(responseKeystoreInfo: KeystoreInfo)(implicit toEntityMarshallerKeystoreInfo: ToEntityMarshaller[KeystoreInfo]): Route =
    complete((200, responseKeystoreInfo))
  def getAuthorizableKeystoreDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 200, Message: Retrieved Authorizable Keystore info, DataType: KeystoreInfo
   * Code: 0, Message: Default response, DataType: String
   */
  def getAuthorizableKeystore(intermediatePath: String, authorizableId: String)
      (implicit toEntityMarshallerKeystoreInfo: ToEntityMarshaller[KeystoreInfo]): Route

  def getKeystoreDefault(statusCode: Int, responseFile: File)(implicit toEntityMarshallerFile: ToEntityMarshaller[File]): Route =
    complete((statusCode, responseFile))
  /**
   * Code: 0, Message: Default response, DataType: File
   */
  def getKeystore(intermediatePath: String, authorizableId: String)
      (implicit toEntityMarshallerFile: ToEntityMarshaller[File]): Route

  def getNodeDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def getNode(path: String, name: String): Route

  def getPackageDefault(statusCode: Int, responseFile: File)(implicit toEntityMarshallerFile: ToEntityMarshaller[File]): Route =
    complete((statusCode, responseFile))
  /**
   * Code: 0, Message: Default response, DataType: File
   */
  def getPackage(group: String, name: String, version: String)
      (implicit toEntityMarshallerFile: ToEntityMarshaller[File]): Route

  def getPackageFilterDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def getPackageFilter(group: String, name: String, version: String): Route

  def getQueryDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def getQuery(path: String, pPeriodlimit: Double, 1Property: String, 1PropertyPeriodvalue: String): Route

  def getTruststoreDefault(statusCode: Int, responseFile: File)(implicit toEntityMarshallerFile: ToEntityMarshaller[File]): Route =
    complete((statusCode, responseFile))
  /**
   * Code: 0, Message: Default response, DataType: File
   */
  def getTruststore()
      (implicit toEntityMarshallerFile: ToEntityMarshaller[File]): Route

  def getTruststoreInfo200(responseTruststoreInfo: TruststoreInfo)(implicit toEntityMarshallerTruststoreInfo: ToEntityMarshaller[TruststoreInfo]): Route =
    complete((200, responseTruststoreInfo))
  def getTruststoreInfoDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 200, Message: Retrieved AEM Truststore info, DataType: TruststoreInfo
   * Code: 0, Message: Default response, DataType: String
   */
  def getTruststoreInfo()
      (implicit toEntityMarshallerTruststoreInfo: ToEntityMarshaller[TruststoreInfo]): Route

  def postAgentDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postAgent(runmode: String, name: String, jcrContentSlashcqDistribute: Option[Boolean], jcrContentSlashcqDistributeAtTypeHint: Option[String], jcrContentSlashcqName: Option[String], jcrContentSlashcqTemplate: Option[String], jcrContentSlashaliasUpdate: Option[Boolean], jcrContentSlashenabled: Option[Boolean], jcrContentSlashjcrDescription: Option[String], jcrContentSlashjcrLastModified: Option[String], jcrContentSlashjcrLastModifiedBy: Option[String], jcrContentSlashjcrMixinTypes: Option[String], jcrContentSlashjcrTitle: Option[String], jcrContentSlashlogLevel: Option[String], jcrContentSlashnoStatusUpdate: Option[Boolean], jcrContentSlashnoVersioning: Option[Boolean], jcrContentSlashprotocolConnectTimeout: Option[Double], jcrContentSlashprotocolHTTPConnectionClosed: Option[Boolean], jcrContentSlashprotocolHTTPExpired: Option[String], jcrContentSlashprotocolHTTPHeaders: Option[String], jcrContentSlashprotocolHTTPHeadersAtTypeHint: Option[String], jcrContentSlashprotocolHTTPMethod: Option[String], jcrContentSlashprotocolHTTPSRelaxed: Option[Boolean], jcrContentSlashprotocolInterface: Option[String], jcrContentSlashprotocolSocketTimeout: Option[Double], jcrContentSlashprotocolVersion: Option[String], jcrContentSlashproxyNTLMDomain: Option[String], jcrContentSlashproxyNTLMHost: Option[String], jcrContentSlashproxyHost: Option[String], jcrContentSlashproxyPassword: Option[String], jcrContentSlashproxyPort: Option[Double], jcrContentSlashproxyUser: Option[String], jcrContentSlashqueueBatchMaxSize: Option[Double], jcrContentSlashqueueBatchMode: Option[String], jcrContentSlashqueueBatchWaitTime: Option[Double], jcrContentSlashretryDelay: Option[String], jcrContentSlashreverseReplication: Option[Boolean], jcrContentSlashserializationType: Option[String], jcrContentSlashslingResourceType: Option[String], jcrContentSlashssl: Option[String], jcrContentSlashtransportNTLMDomain: Option[String], jcrContentSlashtransportNTLMHost: Option[String], jcrContentSlashtransportPassword: Option[String], jcrContentSlashtransportUri: Option[String], jcrContentSlashtransportUser: Option[String], jcrContentSlashtriggerDistribute: Option[Boolean], jcrContentSlashtriggerModified: Option[Boolean], jcrContentSlashtriggerOnOffTime: Option[Boolean], jcrContentSlashtriggerReceive: Option[Boolean], jcrContentSlashtriggerSpecific: Option[Boolean], jcrContentSlashuserId: Option[String], jcrPrimaryType: Option[String], operation: Option[String]): Route

  def postAuthorizableKeystore200(responseKeystoreInfo: KeystoreInfo)(implicit toEntityMarshallerKeystoreInfo: ToEntityMarshaller[KeystoreInfo]): Route =
    complete((200, responseKeystoreInfo))
  def postAuthorizableKeystoreDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 200, Message: Retrieved Authorizable Keystore info, DataType: KeystoreInfo
   * Code: 0, Message: Default response, DataType: String
   */
  def postAuthorizableKeystore(intermediatePath: String, authorizableId: String, operation: Option[String], currentPassword: Option[String], newPassword: Option[String], rePassword: Option[String], keyPassword: Option[String], keyStorePass: Option[String], alias: Option[String], newAlias: Option[String], removeAlias: Option[String], certChain: (FileInfo, File), pk: (FileInfo, File), keyStore: (FileInfo, File))
      (implicit toEntityMarshallerKeystoreInfo: ToEntityMarshaller[KeystoreInfo]): Route

  def postAuthorizablesDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def postAuthorizables(authorizableId: String, intermediatePath: String, createUser: Option[String], createGroup: Option[String], repPassword: Option[String], profileSlashgivenName: Option[String]): Route

  def postConfigAdobeGraniteSamlAuthenticationHandlerDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword: Option[String], keyStorePasswordAtTypeHint: Option[String], servicePeriodranking: Option[Int], servicePeriodrankingAtTypeHint: Option[String], idpHttpRedirect: Option[Boolean], idpHttpRedirectAtTypeHint: Option[String], createUser: Option[Boolean], createUserAtTypeHint: Option[String], defaultRedirectUrl: Option[String], defaultRedirectUrlAtTypeHint: Option[String], userIDAttribute: Option[String], userIDAttributeAtTypeHint: Option[String], defaultGroups: Option[String], defaultGroupsAtTypeHint: Option[String], idpCertAlias: Option[String], idpCertAliasAtTypeHint: Option[String], addGroupMemberships: Option[Boolean], addGroupMembershipsAtTypeHint: Option[String], path: Option[String], pathAtTypeHint: Option[String], synchronizeAttributes: Option[String], synchronizeAttributesAtTypeHint: Option[String], clockTolerance: Option[Int], clockToleranceAtTypeHint: Option[String], groupMembershipAttribute: Option[String], groupMembershipAttributeAtTypeHint: Option[String], idpUrl: Option[String], idpUrlAtTypeHint: Option[String], logoutUrl: Option[String], logoutUrlAtTypeHint: Option[String], serviceProviderEntityId: Option[String], serviceProviderEntityIdAtTypeHint: Option[String], assertionConsumerServiceURL: Option[String], assertionConsumerServiceURLAtTypeHint: Option[String], handleLogout: Option[Boolean], handleLogoutAtTypeHint: Option[String], spPrivateKeyAlias: Option[String], spPrivateKeyAliasAtTypeHint: Option[String], useEncryption: Option[Boolean], useEncryptionAtTypeHint: Option[String], nameIdFormat: Option[String], nameIdFormatAtTypeHint: Option[String], digestMethod: Option[String], digestMethodAtTypeHint: Option[String], signatureMethod: Option[String], signatureMethodAtTypeHint: Option[String], userIntermediatePath: Option[String], userIntermediatePathAtTypeHint: Option[String]): Route

  def postConfigApacheFelixJettyBasedHttpServiceDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postConfigApacheFelixJettyBasedHttpService(orgPeriodapachePeriodfelixPeriodhttpsPeriodnio: Option[Boolean], orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodenable: Option[Boolean], orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint: Option[String], orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure: Option[String], orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint: Option[String]): Route

  def postConfigApacheHttpComponentsProxyConfigurationDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postConfigApacheHttpComponentsProxyConfiguration(proxyPeriodhost: Option[String], proxyPeriodhostAtTypeHint: Option[String], proxyPeriodport: Option[Int], proxyPeriodportAtTypeHint: Option[String], proxyPeriodexceptions: Option[String], proxyPeriodexceptionsAtTypeHint: Option[String], proxyPeriodenabled: Option[Boolean], proxyPeriodenabledAtTypeHint: Option[String], proxyPerioduser: Option[String], proxyPerioduserAtTypeHint: Option[String], proxyPeriodpassword: Option[String], proxyPeriodpasswordAtTypeHint: Option[String]): Route

  def postConfigApacheSlingDavExServletDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postConfigApacheSlingDavExServlet(alias: Option[String], aliasAtTypeHint: Option[String], davPeriodcreateAbsoluteUri: Option[Boolean], davPeriodcreateAbsoluteUriAtTypeHint: Option[String]): Route

  def postConfigApacheSlingGetServletDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postConfigApacheSlingGetServlet(jsonPeriodmaximumresults: Option[String], jsonPeriodmaximumresultsAtTypeHint: Option[String], enablePeriodhtml: Option[Boolean], enablePeriodhtmlAtTypeHint: Option[String], enablePeriodtxt: Option[Boolean], enablePeriodtxtAtTypeHint: Option[String], enablePeriodxml: Option[Boolean], enablePeriodxmlAtTypeHint: Option[String]): Route

  def postConfigApacheSlingReferrerFilterDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postConfigApacheSlingReferrerFilter(allowPeriodempty: Option[Boolean], allowPeriodemptyAtTypeHint: Option[String], allowPeriodhosts: Option[String], allowPeriodhostsAtTypeHint: Option[String], allowPeriodhostsPeriodregexp: Option[String], allowPeriodhostsPeriodregexpAtTypeHint: Option[String], filterPeriodmethods: Option[String], filterPeriodmethodsAtTypeHint: Option[String]): Route

  def postConfigPropertyDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postConfigProperty(configNodeName: String): Route

  def postNodeDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postNode(path: String, name: String, operation: Option[String], deleteAuthorizable: Option[String], file: (FileInfo, File)): Route

  def postNodeRwDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postNodeRw(path: String, name: String, addMembers: Option[String]): Route

  def postPathDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postPath(path: String, jcrPrimaryType: String, name: String): Route

  def postQueryDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def postQuery(path: String, pPeriodlimit: Double, 1Property: String, 1PropertyPeriodvalue: String): Route

  def postTreeActivationDefault(statusCode: Int): Route =
    complete((statusCode, "Default response"))
  /**
   * Code: 0, Message: Default response
   */
  def postTreeActivation(ignoredeactivated: Boolean, onlymodified: Boolean, path: String, cmd: String): Route

  def postTruststoreDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def postTruststore(operation: Option[String], newPassword: Option[String], rePassword: Option[String], keyStoreType: Option[String], removeAlias: Option[String], certificate: (FileInfo, File)): Route

  def postTruststorePKCS12Default(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def postTruststorePKCS12(truststorePeriodp12: (FileInfo, File)): Route

}

trait SlingApiMarshaller {


  implicit def toEntityMarshallerTruststoreInfo: ToEntityMarshaller[TruststoreInfo]

  implicit def toEntityMarshallerKeystoreInfo: ToEntityMarshaller[KeystoreInfo]

  implicit def toEntityMarshallerFile: ToEntityMarshaller[File]

}


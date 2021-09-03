package org.openapitools

// TODO: properly handle custom imports
import java.io._
import java.util.UUID
import java.time._
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}

import org.openapitools.models._

trait DataAccessor {
    // TODO: apiInfo -> apis -> operations = TODO error
    private object TODO extends CommonError("Not implemented") {
        def message = "Not implemented"
    }

        /**
        * 
        * @return A Seq[String]
        */
        def Console_getAemProductInfo(): Either[CommonError,Seq[String]] = Left(TODO)

        /**
        * 
        * @return A BundleInfo
        */
        def Console_getBundleInfo(name: String): Either[CommonError,BundleInfo] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Console_getConfigMgr(): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Console_postBundle(name: String, action: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Console_postJmxRepository(action: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A SamlConfigurationInfo
        */
        def Console_postSamlConfiguration(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], path: Seq[String], servicePeriodranking: Option[Int], idpUrl: Option[String], idpCertAlias: Option[String], idpHttpRedirect: Option[Boolean], serviceProviderEntityId: Option[String], assertionConsumerServiceURL: Option[String], spPrivateKeyAlias: Option[String], keyStorePassword: Option[String], defaultRedirectUrl: Option[String], userIDAttribute: Option[String], useEncryption: Option[Boolean], createUser: Option[Boolean], addGroupMemberships: Option[Boolean], groupMembershipAttribute: Option[String], defaultGroups: Seq[String], nameIdFormat: Option[String], synchronizeAttributes: Seq[String], handleLogout: Option[Boolean], logoutUrl: Option[String], clockTolerance: Option[Int], digestMethod: Option[String], signatureMethod: Option[String], userIntermediatePath: Option[String], propertylist: Seq[String]): Either[CommonError,SamlConfigurationInfo] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Cq_getLoginPage(): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Cq_postCqActions(authorizableId: String, changelog: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Crx_getCrxdeStatus(): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A InstallStatus
        */
        def Crx_getInstallStatus(): Either[CommonError,InstallStatus] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Crx_getPackageManagerServlet(): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Crx_postPackageService(cmd: String): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Crx_postPackageServiceJson(path: String, cmd: String, groupName: Option[String], packageName: Option[String], packageVersion: Option[String], charset: Option[String], force: Option[Boolean], recursive: Option[Boolean], _package: FileUpload): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Crx_postPackageUpdate(groupName: String, packageName: String, version: String, path: String, filter: Option[String], charset: Option[String]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Crx_postSetPassword(old: String, plain: String, verify: String): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Custom_getAemHealthCheck(tags: Option[String], combineTagsOr: Option[Boolean]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Custom_postConfigAemHealthCheckServlet(bundlesPeriodignored: Seq[String], bundlesPeriodignoredAtTypeHint: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Custom_postConfigAemPasswordReset(pwdresetPeriodauthorizables: Seq[String], pwdresetPeriodauthorizablesAtTypeHint: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Granite_sslSetup(keystorePassword: String, keystorePasswordConfirm: String, truststorePassword: String, truststorePasswordConfirm: String, httpsHostname: String, httpsPort: String, privatekeyFile: FileUpload, certificateFile: FileUpload): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_deleteAgent(runmode: String, name: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_deleteNode(path: String, name: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_getAgent(runmode: String, name: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Sling_getAgents(runmode: String): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A KeystoreInfo
        */
        def Sling_getAuthorizableKeystore(intermediatePath: String, authorizableId: String): Either[CommonError,KeystoreInfo] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Sling_getKeystore(intermediatePath: String, authorizableId: String): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_getNode(path: String, name: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Sling_getPackage(group: String, name: String, version: String): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Sling_getPackageFilter(group: String, name: String, version: String): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Sling_getQuery(path: String, pPeriodlimit: BigDecimal, 1Property: String, 1PropertyPeriodvalue: String): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A File
        */
        def Sling_getTruststore(): Either[CommonError,File] = Left(TODO)

        /**
        * 
        * @return A TruststoreInfo
        */
        def Sling_getTruststoreInfo(): Either[CommonError,TruststoreInfo] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_postAgent(runmode: String, name: String, jcrContentSlashcqDistribute: Option[Boolean], jcrContentSlashcqDistributeAtTypeHint: Option[String], jcrContentSlashcqName: Option[String], jcrContentSlashcqTemplate: Option[String], jcrContentSlashenabled: Option[Boolean], jcrContentSlashjcrDescription: Option[String], jcrContentSlashjcrLastModified: Option[String], jcrContentSlashjcrLastModifiedBy: Option[String], jcrContentSlashjcrMixinTypes: Option[String], jcrContentSlashjcrTitle: Option[String], jcrContentSlashlogLevel: Option[String], jcrContentSlashnoStatusUpdate: Option[Boolean], jcrContentSlashnoVersioning: Option[Boolean], jcrContentSlashprotocolConnectTimeout: Option[BigDecimal], jcrContentSlashprotocolHTTPConnectionClosed: Option[Boolean], jcrContentSlashprotocolHTTPExpired: Option[String], jcrContentSlashprotocolHTTPHeaders: Seq[String], jcrContentSlashprotocolHTTPHeadersAtTypeHint: Option[String], jcrContentSlashprotocolHTTPMethod: Option[String], jcrContentSlashprotocolHTTPSRelaxed: Option[Boolean], jcrContentSlashprotocolInterface: Option[String], jcrContentSlashprotocolSocketTimeout: Option[BigDecimal], jcrContentSlashprotocolVersion: Option[String], jcrContentSlashproxyNTLMDomain: Option[String], jcrContentSlashproxyNTLMHost: Option[String], jcrContentSlashproxyHost: Option[String], jcrContentSlashproxyPassword: Option[String], jcrContentSlashproxyPort: Option[BigDecimal], jcrContentSlashproxyUser: Option[String], jcrContentSlashqueueBatchMaxSize: Option[BigDecimal], jcrContentSlashqueueBatchMode: Option[String], jcrContentSlashqueueBatchWaitTime: Option[BigDecimal], jcrContentSlashretryDelay: Option[String], jcrContentSlashreverseReplication: Option[Boolean], jcrContentSlashserializationType: Option[String], jcrContentSlashslingResourceType: Option[String], jcrContentSlashssl: Option[String], jcrContentSlashtransportNTLMDomain: Option[String], jcrContentSlashtransportNTLMHost: Option[String], jcrContentSlashtransportPassword: Option[String], jcrContentSlashtransportUri: Option[String], jcrContentSlashtransportUser: Option[String], jcrContentSlashtriggerDistribute: Option[Boolean], jcrContentSlashtriggerModified: Option[Boolean], jcrContentSlashtriggerOnOffTime: Option[Boolean], jcrContentSlashtriggerReceive: Option[Boolean], jcrContentSlashtriggerSpecific: Option[Boolean], jcrContentSlashuserId: Option[String], jcrPrimaryType: Option[String], operation: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A KeystoreInfo
        */
        def Sling_postAuthorizableKeystore(intermediatePath: String, authorizableId: String, operation: Option[String], currentPassword: Option[String], newPassword: Option[String], rePassword: Option[String], keyPassword: Option[String], keyStorePass: Option[String], alias: Option[String], newAlias: Option[String], removeAlias: Option[String], certChain: FileUpload, pk: FileUpload, keyStore: FileUpload): Either[CommonError,KeystoreInfo] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Sling_postAuthorizables(authorizableId: String, intermediatePath: String, createUser: Option[String], createGroup: Option[String], repPassword: Option[String], profileSlashgivenName: Option[String]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword: Option[String], keyStorePasswordAtTypeHint: Option[String], servicePeriodranking: Option[Int], servicePeriodrankingAtTypeHint: Option[String], idpHttpRedirect: Option[Boolean], idpHttpRedirectAtTypeHint: Option[String], createUser: Option[Boolean], createUserAtTypeHint: Option[String], defaultRedirectUrl: Option[String], defaultRedirectUrlAtTypeHint: Option[String], userIDAttribute: Option[String], userIDAttributeAtTypeHint: Option[String], defaultGroups: Seq[String], defaultGroupsAtTypeHint: Option[String], idpCertAlias: Option[String], idpCertAliasAtTypeHint: Option[String], addGroupMemberships: Option[Boolean], addGroupMembershipsAtTypeHint: Option[String], path: Seq[String], pathAtTypeHint: Option[String], synchronizeAttributes: Seq[String], synchronizeAttributesAtTypeHint: Option[String], clockTolerance: Option[Int], clockToleranceAtTypeHint: Option[String], groupMembershipAttribute: Option[String], groupMembershipAttributeAtTypeHint: Option[String], idpUrl: Option[String], idpUrlAtTypeHint: Option[String], logoutUrl: Option[String], logoutUrlAtTypeHint: Option[String], serviceProviderEntityId: Option[String], serviceProviderEntityIdAtTypeHint: Option[String], assertionConsumerServiceURL: Option[String], assertionConsumerServiceURLAtTypeHint: Option[String], handleLogout: Option[Boolean], handleLogoutAtTypeHint: Option[String], spPrivateKeyAlias: Option[String], spPrivateKeyAliasAtTypeHint: Option[String], useEncryption: Option[Boolean], useEncryptionAtTypeHint: Option[String], nameIdFormat: Option[String], nameIdFormatAtTypeHint: Option[String], digestMethod: Option[String], digestMethodAtTypeHint: Option[String], signatureMethod: Option[String], signatureMethodAtTypeHint: Option[String], userIntermediatePath: Option[String], userIntermediatePathAtTypeHint: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_postConfigApacheFelixJettyBasedHttpService(orgPeriodapachePeriodfelixPeriodhttpsPeriodnio: Option[Boolean], orgPeriodapachePeriodfelixPeriodhttpsPeriodnioAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystoreAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpasswordAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkey: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpasswordAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststoreAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpasswordAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificateAtTypeHint: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodenable: Option[Boolean], orgPeriodapachePeriodfelixPeriodhttpsPeriodenableAtTypeHint: Option[String], orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure: Option[String], orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecureAtTypeHint: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_postConfigApacheHttpComponentsProxyConfiguration(proxyPeriodhost: Option[String], proxyPeriodhostAtTypeHint: Option[String], proxyPeriodport: Option[Int], proxyPeriodportAtTypeHint: Option[String], proxyPeriodexceptions: Seq[String], proxyPeriodexceptionsAtTypeHint: Option[String], proxyPeriodenabled: Option[Boolean], proxyPeriodenabledAtTypeHint: Option[String], proxyPerioduser: Option[String], proxyPerioduserAtTypeHint: Option[String], proxyPeriodpassword: Option[String], proxyPeriodpasswordAtTypeHint: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_postConfigApacheSlingDavExServlet(alias: Option[String], aliasAtTypeHint: Option[String], davPeriodcreateAbsoluteUri: Option[Boolean], davPeriodcreateAbsoluteUriAtTypeHint: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_postConfigApacheSlingGetServlet(jsonPeriodmaximumresults: Option[String], jsonPeriodmaximumresultsAtTypeHint: Option[String], enablePeriodhtml: Option[Boolean], enablePeriodhtmlAtTypeHint: Option[String], enablePeriodtxt: Option[Boolean], enablePeriodtxtAtTypeHint: Option[String], enablePeriodxml: Option[Boolean], enablePeriodxmlAtTypeHint: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_postConfigApacheSlingReferrerFilter(allowPeriodempty: Option[Boolean], allowPeriodemptyAtTypeHint: Option[String], allowPeriodhosts: Option[String], allowPeriodhostsAtTypeHint: Option[String], allowPeriodhostsPeriodregexp: Option[String], allowPeriodhostsPeriodregexpAtTypeHint: Option[String], filterPeriodmethods: Option[String], filterPeriodmethodsAtTypeHint: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_postConfigProperty(configNodeName: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_postNode(path: String, name: String, operation: Option[String], deleteAuthorizable: Option[String], file: FileUpload): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_postNodeRw(path: String, name: String, addMembers: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_postPath(path: String, jcrPrimaryType: String, name: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Sling_postQuery(path: String, pPeriodlimit: BigDecimal, 1Property: String, 1PropertyPeriodvalue: String): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Sling_postTreeActivation(ignoredeactivated: Boolean, onlymodified: Boolean, path: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Sling_postTruststore(operation: Option[String], newPassword: Option[String], rePassword: Option[String], keyStoreType: Option[String], removeAlias: Option[String], certificate: FileUpload): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Sling_postTruststorePKCS12(truststorePeriodp12: FileUpload): Either[CommonError,String] = Left(TODO)

}
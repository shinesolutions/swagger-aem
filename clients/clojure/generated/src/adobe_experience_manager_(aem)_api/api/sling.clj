(ns adobe-experience-manager-(aem)-api.api.sling
  (:require [adobe-experience-manager-(aem)-api.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [adobe-experience-manager-(aem)-api.specs.truststore-items :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string :refer :all]
            [adobe-experience-manager-(aem)-api.specs.install-status-status :refer :all]
            [adobe-experience-manager-(aem)-api.specs.bundle-data :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-long :refer :all]
            [adobe-experience-manager-(aem)-api.specs.install-status :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-properties :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-info :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-array :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-boolean :refer :all]
            [adobe-experience-manager-(aem)-api.specs.bundle-data-prop :refer :all]
            [adobe-experience-manager-(aem)-api.specs.keystore-info :refer :all]
            [adobe-experience-manager-(aem)-api.specs.keystore-chain-items :refer :all]
            [adobe-experience-manager-(aem)-api.specs.bundle-info :refer :all]
            [adobe-experience-manager-(aem)-api.specs.keystore-items :refer :all]
            [adobe-experience-manager-(aem)-api.specs.truststore-info :refer :all]
            )
  (:import (java.io File)))


(defn-spec delete-agent-with-http-info any?
  ""
  [runmode string?, name string?]
  (check-required-params runmode name)
  (call-api "/etc/replication/agents.{runmode}/{name}" :delete
            {:path-params   {"runmode" runmode "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn-spec delete-agent any?
  ""
  [runmode string?, name string?]
  (let [res (:data (delete-agent-with-http-info runmode name))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec delete-node-with-http-info any?
  ""
  [path string?, name string?]
  (check-required-params path name)
  (call-api "/{path}/{name}" :delete
            {:path-params   {"path" path "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn-spec delete-node any?
  ""
  [path string?, name string?]
  (let [res (:data (delete-node-with-http-info path name))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-agent-with-http-info any?
  ""
  [runmode string?, name string?]
  (check-required-params runmode name)
  (call-api "/etc/replication/agents.{runmode}/{name}" :get
            {:path-params   {"runmode" runmode "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn-spec get-agent any?
  ""
  [runmode string?, name string?]
  (let [res (:data (get-agent-with-http-info runmode name))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-agents-with-http-info any?
  ""
  [runmode string?]
  (check-required-params runmode)
  (call-api "/etc/replication/agents.{runmode}.-1.json" :get
            {:path-params   {"runmode" runmode }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["aemAuth"]}))

(defn-spec get-agents string?
  ""
  [runmode string?]
  (let [res (:data (get-agents-with-http-info runmode))]
    (if (:decode-models *api-context*)
       (st/decode string? res st/string-transformer)
       res)))


(defn-spec get-authorizable-keystore-with-http-info any?
  ""
  [intermediatePath string?, authorizableId string?]
  (check-required-params intermediatePath authorizableId)
  (call-api "/{intermediatePath}/{authorizableId}.ks.json" :get
            {:path-params   {"intermediatePath" intermediatePath "authorizableId" authorizableId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["text/plain"]
             :auth-names    ["aemAuth"]}))

(defn-spec get-authorizable-keystore keystore-info-spec
  ""
  [intermediatePath string?, authorizableId string?]
  (let [res (:data (get-authorizable-keystore-with-http-info intermediatePath authorizableId))]
    (if (:decode-models *api-context*)
       (st/decode keystore-info-spec res st/string-transformer)
       res)))


(defn-spec get-keystore-with-http-info any?
  ""
  [intermediatePath string?, authorizableId string?]
  (check-required-params intermediatePath authorizableId)
  (call-api "/{intermediatePath}/{authorizableId}/keystore/store.p12" :get
            {:path-params   {"intermediatePath" intermediatePath "authorizableId" authorizableId }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/octet-stream"]
             :auth-names    ["aemAuth"]}))

(defn-spec get-keystore any?
  ""
  [intermediatePath string?, authorizableId string?]
  (let [res (:data (get-keystore-with-http-info intermediatePath authorizableId))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-node-with-http-info any?
  ""
  [path string?, name string?]
  (check-required-params path name)
  (call-api "/{path}/{name}" :get
            {:path-params   {"path" path "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn-spec get-node any?
  ""
  [path string?, name string?]
  (let [res (:data (get-node-with-http-info path name))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-package-with-http-info any?
  ""
  [group string?, name string?, version string?]
  (check-required-params group name version)
  (call-api "/etc/packages/{group}/{name}-{version}.zip" :get
            {:path-params   {"group" group "name" name "version" version }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/octet-stream"]
             :auth-names    ["aemAuth"]}))

(defn-spec get-package any?
  ""
  [group string?, name string?, version string?]
  (let [res (:data (get-package-with-http-info group name version))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-package-filter-with-http-info any?
  ""
  [group string?, name string?, version string?]
  (check-required-params group name version)
  (call-api "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json" :get
            {:path-params   {"group" group "name" name "version" version }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["aemAuth"]}))

(defn-spec get-package-filter string?
  ""
  [group string?, name string?, version string?]
  (let [res (:data (get-package-filter-with-http-info group name version))]
    (if (:decode-models *api-context*)
       (st/decode string? res st/string-transformer)
       res)))


(defn-spec get-query-with-http-info any?
  ""
  [path string?, plimit float?, 1_property string?, 1_propertyvalue string?]
  (check-required-params path plimit 1_property 1_propertyvalue)
  (call-api "/bin/querybuilder.json" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"path" path "p.limit" plimit "1_property" 1_property "1_property.value" 1_propertyvalue }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["aemAuth"]}))

(defn-spec get-query string?
  ""
  [path string?, plimit float?, 1_property string?, 1_propertyvalue string?]
  (let [res (:data (get-query-with-http-info path plimit 1_property 1_propertyvalue))]
    (if (:decode-models *api-context*)
       (st/decode string? res st/string-transformer)
       res)))


(defn-spec get-truststore-with-http-info any?
  ""
  []
  (call-api "/etc/truststore/truststore.p12" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/octet-stream"]
             :auth-names    ["aemAuth"]}))

(defn-spec get-truststore any?
  ""
  []
  (let [res (:data (get-truststore-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-truststore-info-with-http-info any?
  ""
  []
  (call-api "/libs/granite/security/truststore.json" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["aemAuth"]}))

(defn-spec get-truststore-info truststore-info-spec
  ""
  []
  (let [res (:data (get-truststore-info-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode truststore-info-spec res st/string-transformer)
       res)))


(defn-spec post-agent-with-http-info any?
  ""
  ([runmode string?, name string?, ] (post-agent-with-http-info runmode name nil))
  ([runmode string?, name string?, {:keys [jcrcontentcqdistribute jcrcontentcqdistributeTypeHint jcrcontentcqname jcrcontentcqtemplate jcrcontentenabled jcrcontentjcrdescription jcrcontentjcrlastModified jcrcontentjcrlastModifiedBy jcrcontentjcrmixinTypes jcrcontentjcrtitle jcrcontentlogLevel jcrcontentnoStatusUpdate jcrcontentnoVersioning jcrcontentprotocolConnectTimeout jcrcontentprotocolHTTPConnectionClosed jcrcontentprotocolHTTPExpired jcrcontentprotocolHTTPHeaders jcrcontentprotocolHTTPHeadersTypeHint jcrcontentprotocolHTTPMethod jcrcontentprotocolHTTPSRelaxed jcrcontentprotocolInterface jcrcontentprotocolSocketTimeout jcrcontentprotocolVersion jcrcontentproxyNTLMDomain jcrcontentproxyNTLMHost jcrcontentproxyHost jcrcontentproxyPassword jcrcontentproxyPort jcrcontentproxyUser jcrcontentqueueBatchMaxSize jcrcontentqueueBatchMode jcrcontentqueueBatchWaitTime jcrcontentretryDelay jcrcontentreverseReplication jcrcontentserializationType jcrcontentslingresourceType jcrcontentssl jcrcontenttransportNTLMDomain jcrcontenttransportNTLMHost jcrcontenttransportPassword jcrcontenttransportUri jcrcontenttransportUser jcrcontenttriggerDistribute jcrcontenttriggerModified jcrcontenttriggerOnOffTime jcrcontenttriggerReceive jcrcontenttriggerSpecific jcrcontentuserId jcrprimaryType operation]} (s/map-of keyword? any?)]
   (check-required-params runmode name)
   (call-api "/etc/replication/agents.{runmode}/{name}" :post
             {:path-params   {"runmode" runmode "name" name }
              :header-params {}
              :query-params  {"jcr:content/cq:distribute" jcrcontentcqdistribute "jcr:content/cq:distribute@TypeHint" jcrcontentcqdistributeTypeHint "jcr:content/cq:name" jcrcontentcqname "jcr:content/cq:template" jcrcontentcqtemplate "jcr:content/enabled" jcrcontentenabled "jcr:content/jcr:description" jcrcontentjcrdescription "jcr:content/jcr:lastModified" jcrcontentjcrlastModified "jcr:content/jcr:lastModifiedBy" jcrcontentjcrlastModifiedBy "jcr:content/jcr:mixinTypes" jcrcontentjcrmixinTypes "jcr:content/jcr:title" jcrcontentjcrtitle "jcr:content/logLevel" jcrcontentlogLevel "jcr:content/noStatusUpdate" jcrcontentnoStatusUpdate "jcr:content/noVersioning" jcrcontentnoVersioning "jcr:content/protocolConnectTimeout" jcrcontentprotocolConnectTimeout "jcr:content/protocolHTTPConnectionClosed" jcrcontentprotocolHTTPConnectionClosed "jcr:content/protocolHTTPExpired" jcrcontentprotocolHTTPExpired "jcr:content/protocolHTTPHeaders" (with-collection-format jcrcontentprotocolHTTPHeaders :multi) "jcr:content/protocolHTTPHeaders@TypeHint" jcrcontentprotocolHTTPHeadersTypeHint "jcr:content/protocolHTTPMethod" jcrcontentprotocolHTTPMethod "jcr:content/protocolHTTPSRelaxed" jcrcontentprotocolHTTPSRelaxed "jcr:content/protocolInterface" jcrcontentprotocolInterface "jcr:content/protocolSocketTimeout" jcrcontentprotocolSocketTimeout "jcr:content/protocolVersion" jcrcontentprotocolVersion "jcr:content/proxyNTLMDomain" jcrcontentproxyNTLMDomain "jcr:content/proxyNTLMHost" jcrcontentproxyNTLMHost "jcr:content/proxyHost" jcrcontentproxyHost "jcr:content/proxyPassword" jcrcontentproxyPassword "jcr:content/proxyPort" jcrcontentproxyPort "jcr:content/proxyUser" jcrcontentproxyUser "jcr:content/queueBatchMaxSize" jcrcontentqueueBatchMaxSize "jcr:content/queueBatchMode" jcrcontentqueueBatchMode "jcr:content/queueBatchWaitTime" jcrcontentqueueBatchWaitTime "jcr:content/retryDelay" jcrcontentretryDelay "jcr:content/reverseReplication" jcrcontentreverseReplication "jcr:content/serializationType" jcrcontentserializationType "jcr:content/sling:resourceType" jcrcontentslingresourceType "jcr:content/ssl" jcrcontentssl "jcr:content/transportNTLMDomain" jcrcontenttransportNTLMDomain "jcr:content/transportNTLMHost" jcrcontenttransportNTLMHost "jcr:content/transportPassword" jcrcontenttransportPassword "jcr:content/transportUri" jcrcontenttransportUri "jcr:content/transportUser" jcrcontenttransportUser "jcr:content/triggerDistribute" jcrcontenttriggerDistribute "jcr:content/triggerModified" jcrcontenttriggerModified "jcr:content/triggerOnOffTime" jcrcontenttriggerOnOffTime "jcr:content/triggerReceive" jcrcontenttriggerReceive "jcr:content/triggerSpecific" jcrcontenttriggerSpecific "jcr:content/userId" jcrcontentuserId "jcr:primaryType" jcrprimaryType ":operation" operation }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn-spec post-agent any?
  ""
  ([runmode string?, name string?, ] (post-agent runmode name nil))
  ([runmode string?, name string?, optional-params any?]
   (let [res (:data (post-agent-with-http-info runmode name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec post-authorizable-keystore-with-http-info any?
  ""
  ([intermediatePath string?, authorizableId string?, ] (post-authorizable-keystore-with-http-info intermediatePath authorizableId nil))
  ([intermediatePath string?, authorizableId string?, {:keys [operation currentPassword newPassword rePassword keyPassword keyStorePass alias newAlias removeAlias ^File cert-chain ^File pk ^File keyStore]} (s/map-of keyword? any?)]
   (check-required-params intermediatePath authorizableId)
   (call-api "/{intermediatePath}/{authorizableId}.ks.html" :post
             {:path-params   {"intermediatePath" intermediatePath "authorizableId" authorizableId }
              :header-params {}
              :query-params  {":operation" operation "currentPassword" currentPassword "newPassword" newPassword "rePassword" rePassword "keyPassword" keyPassword "keyStorePass" keyStorePass "alias" alias "newAlias" newAlias "removeAlias" removeAlias }
              :form-params   {"cert-chain" cert-chain "pk" pk "keyStore" keyStore }
              :content-types ["multipart/form-data"]
              :accepts       ["text/plain"]
              :auth-names    ["aemAuth"]})))

(defn-spec post-authorizable-keystore keystore-info-spec
  ""
  ([intermediatePath string?, authorizableId string?, ] (post-authorizable-keystore intermediatePath authorizableId nil))
  ([intermediatePath string?, authorizableId string?, optional-params any?]
   (let [res (:data (post-authorizable-keystore-with-http-info intermediatePath authorizableId optional-params))]
     (if (:decode-models *api-context*)
        (st/decode keystore-info-spec res st/string-transformer)
        res))))


(defn-spec post-authorizables-with-http-info any?
  ""
  ([authorizableId string?, intermediatePath string?, ] (post-authorizables-with-http-info authorizableId intermediatePath nil))
  ([authorizableId string?, intermediatePath string?, {:keys [createUser createGroup reppassword profilegivenName]} (s/map-of keyword? any?)]
   (check-required-params authorizableId intermediatePath)
   (call-api "/libs/granite/security/post/authorizables" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"authorizableId" authorizableId "intermediatePath" intermediatePath "createUser" createUser "createGroup" createGroup "rep:password" reppassword "profile/givenName" profilegivenName }
              :form-params   {}
              :content-types []
              :accepts       ["text/html"]
              :auth-names    ["aemAuth"]})))

(defn-spec post-authorizables string?
  ""
  ([authorizableId string?, intermediatePath string?, ] (post-authorizables authorizableId intermediatePath nil))
  ([authorizableId string?, intermediatePath string?, optional-params any?]
   (let [res (:data (post-authorizables-with-http-info authorizableId intermediatePath optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec post-config-adobe-granite-saml-authentication-handler-with-http-info any?
  ""
  ([] (post-config-adobe-granite-saml-authentication-handler-with-http-info nil))
  ([{:keys [keyStorePassword keyStorePasswordTypeHint serviceranking servicerankingTypeHint idpHttpRedirect idpHttpRedirectTypeHint createUser createUserTypeHint defaultRedirectUrl defaultRedirectUrlTypeHint userIDAttribute userIDAttributeTypeHint defaultGroups defaultGroupsTypeHint idpCertAlias idpCertAliasTypeHint addGroupMemberships addGroupMembershipsTypeHint path pathTypeHint synchronizeAttributes synchronizeAttributesTypeHint clockTolerance clockToleranceTypeHint groupMembershipAttribute groupMembershipAttributeTypeHint idpUrl idpUrlTypeHint logoutUrl logoutUrlTypeHint serviceProviderEntityId serviceProviderEntityIdTypeHint assertionConsumerServiceURL assertionConsumerServiceURLTypeHint handleLogout handleLogoutTypeHint spPrivateKeyAlias spPrivateKeyAliasTypeHint useEncryption useEncryptionTypeHint nameIdFormat nameIdFormatTypeHint digestMethod digestMethodTypeHint signatureMethod signatureMethodTypeHint userIntermediatePath userIntermediatePathTypeHint]} (s/map-of keyword? any?)]
   (call-api "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"keyStorePassword" keyStorePassword "keyStorePassword@TypeHint" keyStorePasswordTypeHint "service.ranking" serviceranking "service.ranking@TypeHint" servicerankingTypeHint "idpHttpRedirect" idpHttpRedirect "idpHttpRedirect@TypeHint" idpHttpRedirectTypeHint "createUser" createUser "createUser@TypeHint" createUserTypeHint "defaultRedirectUrl" defaultRedirectUrl "defaultRedirectUrl@TypeHint" defaultRedirectUrlTypeHint "userIDAttribute" userIDAttribute "userIDAttribute@TypeHint" userIDAttributeTypeHint "defaultGroups" (with-collection-format defaultGroups :multi) "defaultGroups@TypeHint" defaultGroupsTypeHint "idpCertAlias" idpCertAlias "idpCertAlias@TypeHint" idpCertAliasTypeHint "addGroupMemberships" addGroupMemberships "addGroupMemberships@TypeHint" addGroupMembershipsTypeHint "path" (with-collection-format path :multi) "path@TypeHint" pathTypeHint "synchronizeAttributes" (with-collection-format synchronizeAttributes :multi) "synchronizeAttributes@TypeHint" synchronizeAttributesTypeHint "clockTolerance" clockTolerance "clockTolerance@TypeHint" clockToleranceTypeHint "groupMembershipAttribute" groupMembershipAttribute "groupMembershipAttribute@TypeHint" groupMembershipAttributeTypeHint "idpUrl" idpUrl "idpUrl@TypeHint" idpUrlTypeHint "logoutUrl" logoutUrl "logoutUrl@TypeHint" logoutUrlTypeHint "serviceProviderEntityId" serviceProviderEntityId "serviceProviderEntityId@TypeHint" serviceProviderEntityIdTypeHint "assertionConsumerServiceURL" assertionConsumerServiceURL "assertionConsumerServiceURL@TypeHint" assertionConsumerServiceURLTypeHint "handleLogout" handleLogout "handleLogout@TypeHint" handleLogoutTypeHint "spPrivateKeyAlias" spPrivateKeyAlias "spPrivateKeyAlias@TypeHint" spPrivateKeyAliasTypeHint "useEncryption" useEncryption "useEncryption@TypeHint" useEncryptionTypeHint "nameIdFormat" nameIdFormat "nameIdFormat@TypeHint" nameIdFormatTypeHint "digestMethod" digestMethod "digestMethod@TypeHint" digestMethodTypeHint "signatureMethod" signatureMethod "signatureMethod@TypeHint" signatureMethodTypeHint "userIntermediatePath" userIntermediatePath "userIntermediatePath@TypeHint" userIntermediatePathTypeHint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn-spec post-config-adobe-granite-saml-authentication-handler any?
  ""
  ([] (post-config-adobe-granite-saml-authentication-handler nil))
  ([optional-params any?]
   (let [res (:data (post-config-adobe-granite-saml-authentication-handler-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec post-config-apache-felix-jetty-based-http-service-with-http-info any?
  ""
  ([] (post-config-apache-felix-jetty-based-http-service-with-http-info nil))
  ([{:keys [orgapachefelixhttpsnio orgapachefelixhttpsnioTypeHint orgapachefelixhttpskeystore orgapachefelixhttpskeystoreTypeHint orgapachefelixhttpskeystorepassword orgapachefelixhttpskeystorepasswordTypeHint orgapachefelixhttpskeystorekey orgapachefelixhttpskeystorekeyTypeHint orgapachefelixhttpskeystorekeypassword orgapachefelixhttpskeystorekeypasswordTypeHint orgapachefelixhttpstruststore orgapachefelixhttpstruststoreTypeHint orgapachefelixhttpstruststorepassword orgapachefelixhttpstruststorepasswordTypeHint orgapachefelixhttpsclientcertificate orgapachefelixhttpsclientcertificateTypeHint orgapachefelixhttpsenable orgapachefelixhttpsenableTypeHint orgosgiservicehttpportsecure orgosgiservicehttpportsecureTypeHint]} (s/map-of keyword? any?)]
   (call-api "/apps/system/config/org.apache.felix.http" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"org.apache.felix.https.nio" orgapachefelixhttpsnio "org.apache.felix.https.nio@TypeHint" orgapachefelixhttpsnioTypeHint "org.apache.felix.https.keystore" orgapachefelixhttpskeystore "org.apache.felix.https.keystore@TypeHint" orgapachefelixhttpskeystoreTypeHint "org.apache.felix.https.keystore.password" orgapachefelixhttpskeystorepassword "org.apache.felix.https.keystore.password@TypeHint" orgapachefelixhttpskeystorepasswordTypeHint "org.apache.felix.https.keystore.key" orgapachefelixhttpskeystorekey "org.apache.felix.https.keystore.key@TypeHint" orgapachefelixhttpskeystorekeyTypeHint "org.apache.felix.https.keystore.key.password" orgapachefelixhttpskeystorekeypassword "org.apache.felix.https.keystore.key.password@TypeHint" orgapachefelixhttpskeystorekeypasswordTypeHint "org.apache.felix.https.truststore" orgapachefelixhttpstruststore "org.apache.felix.https.truststore@TypeHint" orgapachefelixhttpstruststoreTypeHint "org.apache.felix.https.truststore.password" orgapachefelixhttpstruststorepassword "org.apache.felix.https.truststore.password@TypeHint" orgapachefelixhttpstruststorepasswordTypeHint "org.apache.felix.https.clientcertificate" orgapachefelixhttpsclientcertificate "org.apache.felix.https.clientcertificate@TypeHint" orgapachefelixhttpsclientcertificateTypeHint "org.apache.felix.https.enable" orgapachefelixhttpsenable "org.apache.felix.https.enable@TypeHint" orgapachefelixhttpsenableTypeHint "org.osgi.service.http.port.secure" orgosgiservicehttpportsecure "org.osgi.service.http.port.secure@TypeHint" orgosgiservicehttpportsecureTypeHint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn-spec post-config-apache-felix-jetty-based-http-service any?
  ""
  ([] (post-config-apache-felix-jetty-based-http-service nil))
  ([optional-params any?]
   (let [res (:data (post-config-apache-felix-jetty-based-http-service-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec post-config-apache-http-components-proxy-configuration-with-http-info any?
  ""
  ([] (post-config-apache-http-components-proxy-configuration-with-http-info nil))
  ([{:keys [proxyhost proxyhostTypeHint proxyport proxyportTypeHint proxyexceptions proxyexceptionsTypeHint proxyenabled proxyenabledTypeHint proxyuser proxyuserTypeHint proxypassword proxypasswordTypeHint]} (s/map-of keyword? any?)]
   (call-api "/apps/system/config/org.apache.http.proxyconfigurator.config" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"proxy.host" proxyhost "proxy.host@TypeHint" proxyhostTypeHint "proxy.port" proxyport "proxy.port@TypeHint" proxyportTypeHint "proxy.exceptions" (with-collection-format proxyexceptions :multi) "proxy.exceptions@TypeHint" proxyexceptionsTypeHint "proxy.enabled" proxyenabled "proxy.enabled@TypeHint" proxyenabledTypeHint "proxy.user" proxyuser "proxy.user@TypeHint" proxyuserTypeHint "proxy.password" proxypassword "proxy.password@TypeHint" proxypasswordTypeHint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn-spec post-config-apache-http-components-proxy-configuration any?
  ""
  ([] (post-config-apache-http-components-proxy-configuration nil))
  ([optional-params any?]
   (let [res (:data (post-config-apache-http-components-proxy-configuration-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec post-config-apache-sling-dav-ex-servlet-with-http-info any?
  ""
  ([] (post-config-apache-sling-dav-ex-servlet-with-http-info nil))
  ([{:keys [alias aliasTypeHint davcreate-absolute-uri davcreate-absolute-uriTypeHint]} (s/map-of keyword? any?)]
   (call-api "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"alias" alias "alias@TypeHint" aliasTypeHint "dav.create-absolute-uri" davcreate-absolute-uri "dav.create-absolute-uri@TypeHint" davcreate-absolute-uriTypeHint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn-spec post-config-apache-sling-dav-ex-servlet any?
  ""
  ([] (post-config-apache-sling-dav-ex-servlet nil))
  ([optional-params any?]
   (let [res (:data (post-config-apache-sling-dav-ex-servlet-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec post-config-apache-sling-get-servlet-with-http-info any?
  ""
  ([] (post-config-apache-sling-get-servlet-with-http-info nil))
  ([{:keys [jsonmaximumresults jsonmaximumresultsTypeHint enablehtml enablehtmlTypeHint enabletxt enabletxtTypeHint enablexml enablexmlTypeHint]} (s/map-of keyword? any?)]
   (call-api "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"json.maximumresults" jsonmaximumresults "json.maximumresults@TypeHint" jsonmaximumresultsTypeHint "enable.html" enablehtml "enable.html@TypeHint" enablehtmlTypeHint "enable.txt" enabletxt "enable.txt@TypeHint" enabletxtTypeHint "enable.xml" enablexml "enable.xml@TypeHint" enablexmlTypeHint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn-spec post-config-apache-sling-get-servlet any?
  ""
  ([] (post-config-apache-sling-get-servlet nil))
  ([optional-params any?]
   (let [res (:data (post-config-apache-sling-get-servlet-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec post-config-apache-sling-referrer-filter-with-http-info any?
  ""
  ([] (post-config-apache-sling-referrer-filter-with-http-info nil))
  ([{:keys [allowempty allowemptyTypeHint allowhosts allowhostsTypeHint allowhostsregexp allowhostsregexpTypeHint filtermethods filtermethodsTypeHint]} (s/map-of keyword? any?)]
   (call-api "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"allow.empty" allowempty "allow.empty@TypeHint" allowemptyTypeHint "allow.hosts" allowhosts "allow.hosts@TypeHint" allowhostsTypeHint "allow.hosts.regexp" allowhostsregexp "allow.hosts.regexp@TypeHint" allowhostsregexpTypeHint "filter.methods" filtermethods "filter.methods@TypeHint" filtermethodsTypeHint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn-spec post-config-apache-sling-referrer-filter any?
  ""
  ([] (post-config-apache-sling-referrer-filter nil))
  ([optional-params any?]
   (let [res (:data (post-config-apache-sling-referrer-filter-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec post-config-property-with-http-info any?
  ""
  [configNodeName string?]
  (check-required-params configNodeName)
  (call-api "/apps/system/config/{configNodeName}" :post
            {:path-params   {"configNodeName" configNodeName }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn-spec post-config-property any?
  ""
  [configNodeName string?]
  (let [res (:data (post-config-property-with-http-info configNodeName))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec post-node-with-http-info any?
  ""
  ([path string?, name string?, ] (post-node-with-http-info path name nil))
  ([path string?, name string?, {:keys [operation deleteAuthorizable ^File file]} (s/map-of keyword? any?)]
   (check-required-params path name)
   (call-api "/{path}/{name}" :post
             {:path-params   {"path" path "name" name }
              :header-params {}
              :query-params  {":operation" operation "deleteAuthorizable" deleteAuthorizable }
              :form-params   {"file" file }
              :content-types ["multipart/form-data"]
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn-spec post-node any?
  ""
  ([path string?, name string?, ] (post-node path name nil))
  ([path string?, name string?, optional-params any?]
   (let [res (:data (post-node-with-http-info path name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec post-node-rw-with-http-info any?
  ""
  ([path string?, name string?, ] (post-node-rw-with-http-info path name nil))
  ([path string?, name string?, {:keys [addMembers]} (s/map-of keyword? any?)]
   (check-required-params path name)
   (call-api "/{path}/{name}.rw.html" :post
             {:path-params   {"path" path "name" name }
              :header-params {}
              :query-params  {"addMembers" addMembers }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn-spec post-node-rw any?
  ""
  ([path string?, name string?, ] (post-node-rw path name nil))
  ([path string?, name string?, optional-params any?]
   (let [res (:data (post-node-rw-with-http-info path name optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec post-path-with-http-info any?
  ""
  [path string?, jcrprimaryType string?, name string?]
  (check-required-params path jcrprimaryType name)
  (call-api "/{path}/" :post
            {:path-params   {"path" path }
             :header-params {}
             :query-params  {"jcr:primaryType" jcrprimaryType ":name" name }
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn-spec post-path any?
  ""
  [path string?, jcrprimaryType string?, name string?]
  (let [res (:data (post-path-with-http-info path jcrprimaryType name))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec post-query-with-http-info any?
  ""
  [path string?, plimit float?, 1_property string?, 1_propertyvalue string?]
  (check-required-params path plimit 1_property 1_propertyvalue)
  (call-api "/bin/querybuilder.json" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"path" path "p.limit" plimit "1_property" 1_property "1_property.value" 1_propertyvalue }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["aemAuth"]}))

(defn-spec post-query string?
  ""
  [path string?, plimit float?, 1_property string?, 1_propertyvalue string?]
  (let [res (:data (post-query-with-http-info path plimit 1_property 1_propertyvalue))]
    (if (:decode-models *api-context*)
       (st/decode string? res st/string-transformer)
       res)))


(defn-spec post-tree-activation-with-http-info any?
  ""
  [ignoredeactivated boolean?, onlymodified boolean?, path string?]
  (check-required-params ignoredeactivated onlymodified path)
  (call-api "/etc/replication/treeactivation.html" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"ignoredeactivated" ignoredeactivated "onlymodified" onlymodified "path" path }
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn-spec post-tree-activation any?
  ""
  [ignoredeactivated boolean?, onlymodified boolean?, path string?]
  (let [res (:data (post-tree-activation-with-http-info ignoredeactivated onlymodified path))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec post-truststore-with-http-info any?
  ""
  ([] (post-truststore-with-http-info nil))
  ([{:keys [operation newPassword rePassword keyStoreType removeAlias ^File certificate]} (s/map-of keyword? any?)]
   (call-api "/libs/granite/security/post/truststore" :post
             {:path-params   {}
              :header-params {}
              :query-params  {":operation" operation "newPassword" newPassword "rePassword" rePassword "keyStoreType" keyStoreType "removeAlias" removeAlias }
              :form-params   {"certificate" certificate }
              :content-types ["multipart/form-data"]
              :accepts       ["text/plain"]
              :auth-names    ["aemAuth"]})))

(defn-spec post-truststore string?
  ""
  ([] (post-truststore nil))
  ([optional-params any?]
   (let [res (:data (post-truststore-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec post-truststore-pkcs12-with-http-info any?
  ""
  ([] (post-truststore-pkcs12-with-http-info nil))
  ([{:keys [^File truststorep12]} (s/map-of keyword? any?)]
   (call-api "/etc/truststore" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"truststore.p12" truststorep12 }
              :content-types ["multipart/form-data"]
              :accepts       ["text/plain"]
              :auth-names    ["aemAuth"]})))

(defn-spec post-truststore-pkcs12 string?
  ""
  ([] (post-truststore-pkcs12 nil))
  ([optional-params any?]
   (let [res (:data (post-truststore-pkcs12-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))



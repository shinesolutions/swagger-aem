(ns adobe-experience-manager-(aem)-api.api.sling
  (:require [adobe-experience-manager-(aem)-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn delete-agent-with-http-info
  ""
  [runmode name ]
  (check-required-params runmode name)
  (call-api "/etc/replication/agents.{runmode}/{name}" :delete
            {:path-params   {"runmode" runmode "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn delete-agent
  ""
  [runmode name ]
  (:data (delete-agent-with-http-info runmode name)))

(defn delete-node-with-http-info
  ""
  [path name ]
  (check-required-params path name)
  (call-api "/{path}/{name}" :delete
            {:path-params   {"path" path "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn delete-node
  ""
  [path name ]
  (:data (delete-node-with-http-info path name)))

(defn get-agent-with-http-info
  ""
  [runmode name ]
  (check-required-params runmode name)
  (call-api "/etc/replication/agents.{runmode}/{name}" :get
            {:path-params   {"runmode" runmode "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn get-agent
  ""
  [runmode name ]
  (:data (get-agent-with-http-info runmode name)))

(defn get-agents-with-http-info
  ""
  [runmode ]
  (check-required-params runmode)
  (call-api "/etc/replication/agents.{runmode}.-1.json" :get
            {:path-params   {"runmode" runmode }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["aemAuth"]}))

(defn get-agents
  ""
  [runmode ]
  (:data (get-agents-with-http-info runmode)))

(defn get-authorizable-keystore-with-http-info
  ""
  [intermediate-path authorizable-id ]
  (check-required-params intermediate-path authorizable-id)
  (call-api "/{intermediatePath}/{authorizableId}.ks.json" :get
            {:path-params   {"intermediatePath" intermediate-path "authorizableId" authorizable-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["text/plain"]
             :auth-names    ["aemAuth"]}))

(defn get-authorizable-keystore
  ""
  [intermediate-path authorizable-id ]
  (:data (get-authorizable-keystore-with-http-info intermediate-path authorizable-id)))

(defn get-keystore-with-http-info
  ""
  [intermediate-path authorizable-id ]
  (check-required-params intermediate-path authorizable-id)
  (call-api "/{intermediatePath}/{authorizableId}/keystore/store.p12" :get
            {:path-params   {"intermediatePath" intermediate-path "authorizableId" authorizable-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/octet-stream"]
             :auth-names    ["aemAuth"]}))

(defn get-keystore
  ""
  [intermediate-path authorizable-id ]
  (:data (get-keystore-with-http-info intermediate-path authorizable-id)))

(defn get-node-with-http-info
  ""
  [path name ]
  (check-required-params path name)
  (call-api "/{path}/{name}" :get
            {:path-params   {"path" path "name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn get-node
  ""
  [path name ]
  (:data (get-node-with-http-info path name)))

(defn get-package-with-http-info
  ""
  [group name version ]
  (check-required-params group name version)
  (call-api "/etc/packages/{group}/{name}-{version}.zip" :get
            {:path-params   {"group" group "name" name "version" version }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/octet-stream"]
             :auth-names    ["aemAuth"]}))

(defn get-package
  ""
  [group name version ]
  (:data (get-package-with-http-info group name version)))

(defn get-package-filter-with-http-info
  ""
  [group name version ]
  (check-required-params group name version)
  (call-api "/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json" :get
            {:path-params   {"group" group "name" name "version" version }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["aemAuth"]}))

(defn get-package-filter
  ""
  [group name version ]
  (:data (get-package-filter-with-http-info group name version)))

(defn get-query-with-http-info
  ""
  [path plimit 1-property 1-propertyvalue ]
  (check-required-params path plimit 1-property 1-propertyvalue)
  (call-api "/bin/querybuilder.json" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"path" path "p.limit" plimit "1_property" 1-property "1_property.value" 1-propertyvalue }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["aemAuth"]}))

(defn get-query
  ""
  [path plimit 1-property 1-propertyvalue ]
  (:data (get-query-with-http-info path plimit 1-property 1-propertyvalue)))

(defn get-truststore-with-http-info
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

(defn get-truststore
  ""
  []
  (:data (get-truststore-with-http-info)))

(defn get-truststore-info-with-http-info
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

(defn get-truststore-info
  ""
  []
  (:data (get-truststore-info-with-http-info)))

(defn post-agent-with-http-info
  ""
  ([runmode name ] (post-agent-with-http-info runmode name nil))
  ([runmode name {:keys [jcrcontentcqdistribute jcrcontentcqdistribute-type-hint jcrcontentcqname jcrcontentcqtemplate jcrcontentenabled jcrcontentjcrdescription jcrcontentjcrlast-modified jcrcontentjcrlast-modified-by jcrcontentjcrmixin-types jcrcontentjcrtitle jcrcontentlog-level jcrcontentno-status-update jcrcontentno-versioning jcrcontentprotocol-connect-timeout jcrcontentprotocol-http-connection-closed jcrcontentprotocol-http-expired jcrcontentprotocol-http-headers jcrcontentprotocol-http-headers-type-hint jcrcontentprotocol-http-method jcrcontentprotocol-https-relaxed jcrcontentprotocol-interface jcrcontentprotocol-socket-timeout jcrcontentprotocol-version jcrcontentproxy-ntlm-domain jcrcontentproxy-ntlm-host jcrcontentproxy-host jcrcontentproxy-password jcrcontentproxy-port jcrcontentproxy-user jcrcontentqueue-batch-max-size jcrcontentqueue-batch-mode jcrcontentqueue-batch-wait-time jcrcontentretry-delay jcrcontentreverse-replication jcrcontentserialization-type jcrcontentslingresource-type jcrcontentssl jcrcontenttransport-ntlm-domain jcrcontenttransport-ntlm-host jcrcontenttransport-password jcrcontenttransport-uri jcrcontenttransport-user jcrcontenttrigger-distribute jcrcontenttrigger-modified jcrcontenttrigger-on-off-time jcrcontenttrigger-receive jcrcontenttrigger-specific jcrcontentuser-id jcrprimary-type operation ]}]
   (check-required-params runmode name)
   (call-api "/etc/replication/agents.{runmode}/{name}" :post
             {:path-params   {"runmode" runmode "name" name }
              :header-params {}
              :query-params  {"jcr:content/cq:distribute" jcrcontentcqdistribute "jcr:content/cq:distribute@TypeHint" jcrcontentcqdistribute-type-hint "jcr:content/cq:name" jcrcontentcqname "jcr:content/cq:template" jcrcontentcqtemplate "jcr:content/enabled" jcrcontentenabled "jcr:content/jcr:description" jcrcontentjcrdescription "jcr:content/jcr:lastModified" jcrcontentjcrlast-modified "jcr:content/jcr:lastModifiedBy" jcrcontentjcrlast-modified-by "jcr:content/jcr:mixinTypes" jcrcontentjcrmixin-types "jcr:content/jcr:title" jcrcontentjcrtitle "jcr:content/logLevel" jcrcontentlog-level "jcr:content/noStatusUpdate" jcrcontentno-status-update "jcr:content/noVersioning" jcrcontentno-versioning "jcr:content/protocolConnectTimeout" jcrcontentprotocol-connect-timeout "jcr:content/protocolHTTPConnectionClosed" jcrcontentprotocol-http-connection-closed "jcr:content/protocolHTTPExpired" jcrcontentprotocol-http-expired "jcr:content/protocolHTTPHeaders" (with-collection-format jcrcontentprotocol-http-headers :multi) "jcr:content/protocolHTTPHeaders@TypeHint" jcrcontentprotocol-http-headers-type-hint "jcr:content/protocolHTTPMethod" jcrcontentprotocol-http-method "jcr:content/protocolHTTPSRelaxed" jcrcontentprotocol-https-relaxed "jcr:content/protocolInterface" jcrcontentprotocol-interface "jcr:content/protocolSocketTimeout" jcrcontentprotocol-socket-timeout "jcr:content/protocolVersion" jcrcontentprotocol-version "jcr:content/proxyNTLMDomain" jcrcontentproxy-ntlm-domain "jcr:content/proxyNTLMHost" jcrcontentproxy-ntlm-host "jcr:content/proxyHost" jcrcontentproxy-host "jcr:content/proxyPassword" jcrcontentproxy-password "jcr:content/proxyPort" jcrcontentproxy-port "jcr:content/proxyUser" jcrcontentproxy-user "jcr:content/queueBatchMaxSize" jcrcontentqueue-batch-max-size "jcr:content/queueBatchMode" jcrcontentqueue-batch-mode "jcr:content/queueBatchWaitTime" jcrcontentqueue-batch-wait-time "jcr:content/retryDelay" jcrcontentretry-delay "jcr:content/reverseReplication" jcrcontentreverse-replication "jcr:content/serializationType" jcrcontentserialization-type "jcr:content/sling:resourceType" jcrcontentslingresource-type "jcr:content/ssl" jcrcontentssl "jcr:content/transportNTLMDomain" jcrcontenttransport-ntlm-domain "jcr:content/transportNTLMHost" jcrcontenttransport-ntlm-host "jcr:content/transportPassword" jcrcontenttransport-password "jcr:content/transportUri" jcrcontenttransport-uri "jcr:content/transportUser" jcrcontenttransport-user "jcr:content/triggerDistribute" jcrcontenttrigger-distribute "jcr:content/triggerModified" jcrcontenttrigger-modified "jcr:content/triggerOnOffTime" jcrcontenttrigger-on-off-time "jcr:content/triggerReceive" jcrcontenttrigger-receive "jcr:content/triggerSpecific" jcrcontenttrigger-specific "jcr:content/userId" jcrcontentuser-id "jcr:primaryType" jcrprimary-type ":operation" operation }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn post-agent
  ""
  ([runmode name ] (post-agent runmode name nil))
  ([runmode name optional-params]
   (:data (post-agent-with-http-info runmode name optional-params))))

(defn post-authorizable-keystore-with-http-info
  ""
  ([intermediate-path authorizable-id ] (post-authorizable-keystore-with-http-info intermediate-path authorizable-id nil))
  ([intermediate-path authorizable-id {:keys [operation current-password new-password re-password key-password key-store-pass alias new-alias remove-alias ^File cert-chain ^File pk ^File key-store ]}]
   (check-required-params intermediate-path authorizable-id)
   (call-api "/{intermediatePath}/{authorizableId}.ks.html" :post
             {:path-params   {"intermediatePath" intermediate-path "authorizableId" authorizable-id }
              :header-params {}
              :query-params  {":operation" operation "currentPassword" current-password "newPassword" new-password "rePassword" re-password "keyPassword" key-password "keyStorePass" key-store-pass "alias" alias "newAlias" new-alias "removeAlias" remove-alias }
              :form-params   {"cert-chain" cert-chain "pk" pk "keyStore" key-store }
              :content-types ["multipart/form-data"]
              :accepts       ["text/plain"]
              :auth-names    ["aemAuth"]})))

(defn post-authorizable-keystore
  ""
  ([intermediate-path authorizable-id ] (post-authorizable-keystore intermediate-path authorizable-id nil))
  ([intermediate-path authorizable-id optional-params]
   (:data (post-authorizable-keystore-with-http-info intermediate-path authorizable-id optional-params))))

(defn post-authorizables-with-http-info
  ""
  ([authorizable-id intermediate-path ] (post-authorizables-with-http-info authorizable-id intermediate-path nil))
  ([authorizable-id intermediate-path {:keys [create-user create-group reppassword profilegiven-name ]}]
   (check-required-params authorizable-id intermediate-path)
   (call-api "/libs/granite/security/post/authorizables" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"authorizableId" authorizable-id "intermediatePath" intermediate-path "createUser" create-user "createGroup" create-group "rep:password" reppassword "profile/givenName" profilegiven-name }
              :form-params   {}
              :content-types []
              :accepts       ["text/html"]
              :auth-names    ["aemAuth"]})))

(defn post-authorizables
  ""
  ([authorizable-id intermediate-path ] (post-authorizables authorizable-id intermediate-path nil))
  ([authorizable-id intermediate-path optional-params]
   (:data (post-authorizables-with-http-info authorizable-id intermediate-path optional-params))))

(defn post-config-adobe-granite-saml-authentication-handler-with-http-info
  ""
  ([] (post-config-adobe-granite-saml-authentication-handler-with-http-info nil))
  ([{:keys [key-store-password key-store-password-type-hint serviceranking serviceranking-type-hint idp-http-redirect idp-http-redirect-type-hint create-user create-user-type-hint default-redirect-url default-redirect-url-type-hint user-id-attribute user-id-attribute-type-hint default-groups default-groups-type-hint idp-cert-alias idp-cert-alias-type-hint add-group-memberships add-group-memberships-type-hint path path-type-hint synchronize-attributes synchronize-attributes-type-hint clock-tolerance clock-tolerance-type-hint group-membership-attribute group-membership-attribute-type-hint idp-url idp-url-type-hint logout-url logout-url-type-hint service-provider-entity-id service-provider-entity-id-type-hint assertion-consumer-service-url assertion-consumer-service-url-type-hint handle-logout handle-logout-type-hint sp-private-key-alias sp-private-key-alias-type-hint use-encryption use-encryption-type-hint name-id-format name-id-format-type-hint digest-method digest-method-type-hint signature-method signature-method-type-hint user-intermediate-path user-intermediate-path-type-hint ]}]
   (call-api "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"keyStorePassword" key-store-password "keyStorePassword@TypeHint" key-store-password-type-hint "service.ranking" serviceranking "service.ranking@TypeHint" serviceranking-type-hint "idpHttpRedirect" idp-http-redirect "idpHttpRedirect@TypeHint" idp-http-redirect-type-hint "createUser" create-user "createUser@TypeHint" create-user-type-hint "defaultRedirectUrl" default-redirect-url "defaultRedirectUrl@TypeHint" default-redirect-url-type-hint "userIDAttribute" user-id-attribute "userIDAttribute@TypeHint" user-id-attribute-type-hint "defaultGroups" (with-collection-format default-groups :multi) "defaultGroups@TypeHint" default-groups-type-hint "idpCertAlias" idp-cert-alias "idpCertAlias@TypeHint" idp-cert-alias-type-hint "addGroupMemberships" add-group-memberships "addGroupMemberships@TypeHint" add-group-memberships-type-hint "path" (with-collection-format path :multi) "path@TypeHint" path-type-hint "synchronizeAttributes" (with-collection-format synchronize-attributes :multi) "synchronizeAttributes@TypeHint" synchronize-attributes-type-hint "clockTolerance" clock-tolerance "clockTolerance@TypeHint" clock-tolerance-type-hint "groupMembershipAttribute" group-membership-attribute "groupMembershipAttribute@TypeHint" group-membership-attribute-type-hint "idpUrl" idp-url "idpUrl@TypeHint" idp-url-type-hint "logoutUrl" logout-url "logoutUrl@TypeHint" logout-url-type-hint "serviceProviderEntityId" service-provider-entity-id "serviceProviderEntityId@TypeHint" service-provider-entity-id-type-hint "assertionConsumerServiceURL" assertion-consumer-service-url "assertionConsumerServiceURL@TypeHint" assertion-consumer-service-url-type-hint "handleLogout" handle-logout "handleLogout@TypeHint" handle-logout-type-hint "spPrivateKeyAlias" sp-private-key-alias "spPrivateKeyAlias@TypeHint" sp-private-key-alias-type-hint "useEncryption" use-encryption "useEncryption@TypeHint" use-encryption-type-hint "nameIdFormat" name-id-format "nameIdFormat@TypeHint" name-id-format-type-hint "digestMethod" digest-method "digestMethod@TypeHint" digest-method-type-hint "signatureMethod" signature-method "signatureMethod@TypeHint" signature-method-type-hint "userIntermediatePath" user-intermediate-path "userIntermediatePath@TypeHint" user-intermediate-path-type-hint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn post-config-adobe-granite-saml-authentication-handler
  ""
  ([] (post-config-adobe-granite-saml-authentication-handler nil))
  ([optional-params]
   (:data (post-config-adobe-granite-saml-authentication-handler-with-http-info optional-params))))

(defn post-config-apache-felix-jetty-based-http-service-with-http-info
  ""
  ([] (post-config-apache-felix-jetty-based-http-service-with-http-info nil))
  ([{:keys [orgapachefelixhttpsnio orgapachefelixhttpsnio-type-hint orgapachefelixhttpskeystore orgapachefelixhttpskeystore-type-hint orgapachefelixhttpskeystorepassword orgapachefelixhttpskeystorepassword-type-hint orgapachefelixhttpskeystorekey orgapachefelixhttpskeystorekey-type-hint orgapachefelixhttpskeystorekeypassword orgapachefelixhttpskeystorekeypassword-type-hint orgapachefelixhttpstruststore orgapachefelixhttpstruststore-type-hint orgapachefelixhttpstruststorepassword orgapachefelixhttpstruststorepassword-type-hint orgapachefelixhttpsclientcertificate orgapachefelixhttpsclientcertificate-type-hint orgapachefelixhttpsenable orgapachefelixhttpsenable-type-hint orgosgiservicehttpportsecure orgosgiservicehttpportsecure-type-hint ]}]
   (call-api "/apps/system/config/org.apache.felix.http" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"org.apache.felix.https.nio" orgapachefelixhttpsnio "org.apache.felix.https.nio@TypeHint" orgapachefelixhttpsnio-type-hint "org.apache.felix.https.keystore" orgapachefelixhttpskeystore "org.apache.felix.https.keystore@TypeHint" orgapachefelixhttpskeystore-type-hint "org.apache.felix.https.keystore.password" orgapachefelixhttpskeystorepassword "org.apache.felix.https.keystore.password@TypeHint" orgapachefelixhttpskeystorepassword-type-hint "org.apache.felix.https.keystore.key" orgapachefelixhttpskeystorekey "org.apache.felix.https.keystore.key@TypeHint" orgapachefelixhttpskeystorekey-type-hint "org.apache.felix.https.keystore.key.password" orgapachefelixhttpskeystorekeypassword "org.apache.felix.https.keystore.key.password@TypeHint" orgapachefelixhttpskeystorekeypassword-type-hint "org.apache.felix.https.truststore" orgapachefelixhttpstruststore "org.apache.felix.https.truststore@TypeHint" orgapachefelixhttpstruststore-type-hint "org.apache.felix.https.truststore.password" orgapachefelixhttpstruststorepassword "org.apache.felix.https.truststore.password@TypeHint" orgapachefelixhttpstruststorepassword-type-hint "org.apache.felix.https.clientcertificate" orgapachefelixhttpsclientcertificate "org.apache.felix.https.clientcertificate@TypeHint" orgapachefelixhttpsclientcertificate-type-hint "org.apache.felix.https.enable" orgapachefelixhttpsenable "org.apache.felix.https.enable@TypeHint" orgapachefelixhttpsenable-type-hint "org.osgi.service.http.port.secure" orgosgiservicehttpportsecure "org.osgi.service.http.port.secure@TypeHint" orgosgiservicehttpportsecure-type-hint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn post-config-apache-felix-jetty-based-http-service
  ""
  ([] (post-config-apache-felix-jetty-based-http-service nil))
  ([optional-params]
   (:data (post-config-apache-felix-jetty-based-http-service-with-http-info optional-params))))

(defn post-config-apache-http-components-proxy-configuration-with-http-info
  ""
  ([] (post-config-apache-http-components-proxy-configuration-with-http-info nil))
  ([{:keys [proxyhost proxyhost-type-hint proxyport proxyport-type-hint proxyexceptions proxyexceptions-type-hint proxyenabled proxyenabled-type-hint proxyuser proxyuser-type-hint proxypassword proxypassword-type-hint ]}]
   (call-api "/apps/system/config/org.apache.http.proxyconfigurator.config" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"proxy.host" proxyhost "proxy.host@TypeHint" proxyhost-type-hint "proxy.port" proxyport "proxy.port@TypeHint" proxyport-type-hint "proxy.exceptions" (with-collection-format proxyexceptions :multi) "proxy.exceptions@TypeHint" proxyexceptions-type-hint "proxy.enabled" proxyenabled "proxy.enabled@TypeHint" proxyenabled-type-hint "proxy.user" proxyuser "proxy.user@TypeHint" proxyuser-type-hint "proxy.password" proxypassword "proxy.password@TypeHint" proxypassword-type-hint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn post-config-apache-http-components-proxy-configuration
  ""
  ([] (post-config-apache-http-components-proxy-configuration nil))
  ([optional-params]
   (:data (post-config-apache-http-components-proxy-configuration-with-http-info optional-params))))

(defn post-config-apache-sling-dav-ex-servlet-with-http-info
  ""
  ([] (post-config-apache-sling-dav-ex-servlet-with-http-info nil))
  ([{:keys [alias alias-type-hint davcreate-absolute-uri davcreate-absolute-uri-type-hint ]}]
   (call-api "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"alias" alias "alias@TypeHint" alias-type-hint "dav.create-absolute-uri" davcreate-absolute-uri "dav.create-absolute-uri@TypeHint" davcreate-absolute-uri-type-hint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn post-config-apache-sling-dav-ex-servlet
  ""
  ([] (post-config-apache-sling-dav-ex-servlet nil))
  ([optional-params]
   (:data (post-config-apache-sling-dav-ex-servlet-with-http-info optional-params))))

(defn post-config-apache-sling-get-servlet-with-http-info
  ""
  ([] (post-config-apache-sling-get-servlet-with-http-info nil))
  ([{:keys [jsonmaximumresults jsonmaximumresults-type-hint enablehtml enablehtml-type-hint enabletxt enabletxt-type-hint enablexml enablexml-type-hint ]}]
   (call-api "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"json.maximumresults" jsonmaximumresults "json.maximumresults@TypeHint" jsonmaximumresults-type-hint "enable.html" enablehtml "enable.html@TypeHint" enablehtml-type-hint "enable.txt" enabletxt "enable.txt@TypeHint" enabletxt-type-hint "enable.xml" enablexml "enable.xml@TypeHint" enablexml-type-hint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn post-config-apache-sling-get-servlet
  ""
  ([] (post-config-apache-sling-get-servlet nil))
  ([optional-params]
   (:data (post-config-apache-sling-get-servlet-with-http-info optional-params))))

(defn post-config-apache-sling-referrer-filter-with-http-info
  ""
  ([] (post-config-apache-sling-referrer-filter-with-http-info nil))
  ([{:keys [allowempty allowempty-type-hint allowhosts allowhosts-type-hint allowhostsregexp allowhostsregexp-type-hint filtermethods filtermethods-type-hint ]}]
   (call-api "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"allow.empty" allowempty "allow.empty@TypeHint" allowempty-type-hint "allow.hosts" allowhosts "allow.hosts@TypeHint" allowhosts-type-hint "allow.hosts.regexp" allowhostsregexp "allow.hosts.regexp@TypeHint" allowhostsregexp-type-hint "filter.methods" filtermethods "filter.methods@TypeHint" filtermethods-type-hint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn post-config-apache-sling-referrer-filter
  ""
  ([] (post-config-apache-sling-referrer-filter nil))
  ([optional-params]
   (:data (post-config-apache-sling-referrer-filter-with-http-info optional-params))))

(defn post-node-with-http-info
  ""
  ([path name ] (post-node-with-http-info path name nil))
  ([path name {:keys [operation delete-authorizable ^File file ]}]
   (check-required-params path name)
   (call-api "/{path}/{name}" :post
             {:path-params   {"path" path "name" name }
              :header-params {}
              :query-params  {":operation" operation "deleteAuthorizable" delete-authorizable }
              :form-params   {"file" file }
              :content-types ["multipart/form-data"]
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn post-node
  ""
  ([path name ] (post-node path name nil))
  ([path name optional-params]
   (:data (post-node-with-http-info path name optional-params))))

(defn post-node-rw-with-http-info
  ""
  ([path name ] (post-node-rw-with-http-info path name nil))
  ([path name {:keys [add-members ]}]
   (check-required-params path name)
   (call-api "/{path}/{name}.rw.html" :post
             {:path-params   {"path" path "name" name }
              :header-params {}
              :query-params  {"addMembers" add-members }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn post-node-rw
  ""
  ([path name ] (post-node-rw path name nil))
  ([path name optional-params]
   (:data (post-node-rw-with-http-info path name optional-params))))

(defn post-path-with-http-info
  ""
  [path jcrprimary-type name ]
  (check-required-params path jcrprimary-type name)
  (call-api "/{path}/" :post
            {:path-params   {"path" path }
             :header-params {}
             :query-params  {"jcr:primaryType" jcrprimary-type ":name" name }
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn post-path
  ""
  [path jcrprimary-type name ]
  (:data (post-path-with-http-info path jcrprimary-type name)))

(defn post-query-with-http-info
  ""
  [path plimit 1-property 1-propertyvalue ]
  (check-required-params path plimit 1-property 1-propertyvalue)
  (call-api "/bin/querybuilder.json" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"path" path "p.limit" plimit "1_property" 1-property "1_property.value" 1-propertyvalue }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["aemAuth"]}))

(defn post-query
  ""
  [path plimit 1-property 1-propertyvalue ]
  (:data (post-query-with-http-info path plimit 1-property 1-propertyvalue)))

(defn post-tree-activation-with-http-info
  ""
  [ignoredeactivated onlymodified path ]
  (check-required-params ignoredeactivated onlymodified path)
  (call-api "/etc/replication/treeactivation.html" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"ignoredeactivated" ignoredeactivated "onlymodified" onlymodified "path" path }
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn post-tree-activation
  ""
  [ignoredeactivated onlymodified path ]
  (:data (post-tree-activation-with-http-info ignoredeactivated onlymodified path)))

(defn post-truststore-with-http-info
  ""
  ([] (post-truststore-with-http-info nil))
  ([{:keys [operation new-password re-password key-store-type remove-alias ^File certificate ]}]
   (call-api "/libs/granite/security/post/truststore" :post
             {:path-params   {}
              :header-params {}
              :query-params  {":operation" operation "newPassword" new-password "rePassword" re-password "keyStoreType" key-store-type "removeAlias" remove-alias }
              :form-params   {"certificate" certificate }
              :content-types ["multipart/form-data"]
              :accepts       ["text/plain"]
              :auth-names    ["aemAuth"]})))

(defn post-truststore
  ""
  ([] (post-truststore nil))
  ([optional-params]
   (:data (post-truststore-with-http-info optional-params))))

(defn post-truststore-pkcs12-with-http-info
  ""
  ([] (post-truststore-pkcs12-with-http-info nil))
  ([{:keys [^File truststorep12 ]}]
   (call-api "/etc/truststore" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"truststore.p12" truststorep12 }
              :content-types ["multipart/form-data"]
              :accepts       ["text/plain"]
              :auth-names    ["aemAuth"]})))

(defn post-truststore-pkcs12
  ""
  ([] (post-truststore-pkcs12 nil))
  ([optional-params]
   (:data (post-truststore-pkcs12-with-http-info optional-params))))


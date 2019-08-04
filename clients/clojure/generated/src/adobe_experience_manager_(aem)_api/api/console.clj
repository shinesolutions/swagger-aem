(ns adobe-experience-manager-(aem)-api.api.console
  (:require [adobe-experience-manager-(aem)-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-aem-product-info-with-http-info
  ""
  []
  (call-api "/system/console/status-productinfo.json" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["aemAuth"]}))

(defn get-aem-product-info
  ""
  []
  (:data (get-aem-product-info-with-http-info)))

(defn get-config-mgr-with-http-info
  ""
  []
  (call-api "/system/console/configMgr" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["text/xml"]
             :auth-names    ["aemAuth"]}))

(defn get-config-mgr
  ""
  []
  (:data (get-config-mgr-with-http-info)))

(defn post-bundle-with-http-info
  ""
  [name action ]
  (check-required-params name action)
  (call-api "/system/console/bundles/{name}" :post
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {"action" action }
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn post-bundle
  ""
  [name action ]
  (:data (post-bundle-with-http-info name action)))

(defn post-jmx-repository-with-http-info
  ""
  [action ]
  (check-required-params action)
  (call-api "/system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action}" :post
            {:path-params   {"action" action }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn post-jmx-repository
  ""
  [action ]
  (:data (post-jmx-repository-with-http-info action)))

(defn post-saml-configuration-with-http-info
  ""
  ([] (post-saml-configuration-with-http-info nil))
  ([{:keys [post apply delete action location path serviceranking idp-url idp-cert-alias idp-http-redirect service-provider-entity-id assertion-consumer-service-url sp-private-key-alias key-store-password default-redirect-url user-id-attribute use-encryption create-user add-group-memberships group-membership-attribute default-groups name-id-format synchronize-attributes handle-logout logout-url clock-tolerance digest-method signature-method user-intermediate-path propertylist ]}]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "path" (with-collection-format path :multi) "service.ranking" serviceranking "idpUrl" idp-url "idpCertAlias" idp-cert-alias "idpHttpRedirect" idp-http-redirect "serviceProviderEntityId" service-provider-entity-id "assertionConsumerServiceURL" assertion-consumer-service-url "spPrivateKeyAlias" sp-private-key-alias "keyStorePassword" key-store-password "defaultRedirectUrl" default-redirect-url "userIDAttribute" user-id-attribute "useEncryption" use-encryption "createUser" create-user "addGroupMemberships" add-group-memberships "groupMembershipAttribute" group-membership-attribute "defaultGroups" (with-collection-format default-groups :multi) "nameIdFormat" name-id-format "synchronizeAttributes" (with-collection-format synchronize-attributes :multi) "handleLogout" handle-logout "logoutUrl" logout-url "clockTolerance" clock-tolerance "digestMethod" digest-method "signatureMethod" signature-method "userIntermediatePath" user-intermediate-path "propertylist" (with-collection-format propertylist :csv) }
              :form-params   {}
              :content-types []
              :accepts       ["text/plain"]
              :auth-names    ["aemAuth"]})))

(defn post-saml-configuration
  ""
  ([] (post-saml-configuration nil))
  ([optional-params]
   (:data (post-saml-configuration-with-http-info optional-params))))


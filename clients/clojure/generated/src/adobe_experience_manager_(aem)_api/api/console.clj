(ns adobe-experience-manager-(aem)-api.api.console
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


(defn-spec get-aem-product-info-with-http-info any?
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

(defn-spec get-aem-product-info (s/coll-of string?)
  ""
  []
  (let [res (:data (get-aem-product-info-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode (s/coll-of string?) res st/string-transformer)
       res)))


(defn-spec get-bundle-info-with-http-info any?
  ""
  [name string?]
  (check-required-params name)
  (call-api "/system/console/bundles/{name}.json" :get
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["aemAuth"]}))

(defn-spec get-bundle-info bundle-info-spec
  ""
  [name string?]
  (let [res (:data (get-bundle-info-with-http-info name))]
    (if (:decode-models *api-context*)
       (st/decode bundle-info-spec res st/string-transformer)
       res)))


(defn-spec get-config-mgr-with-http-info any?
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

(defn-spec get-config-mgr string?
  ""
  []
  (let [res (:data (get-config-mgr-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode string? res st/string-transformer)
       res)))


(defn-spec post-bundle-with-http-info any?
  ""
  [name string?, action string?]
  (check-required-params name action)
  (call-api "/system/console/bundles/{name}" :post
            {:path-params   {"name" name }
             :header-params {}
             :query-params  {"action" action }
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn-spec post-bundle any?
  ""
  [name string?, action string?]
  (let [res (:data (post-bundle-with-http-info name action))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec post-jmx-repository-with-http-info any?
  ""
  [action string?]
  (check-required-params action)
  (call-api "/system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action}" :post
            {:path-params   {"action" action }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn-spec post-jmx-repository any?
  ""
  [action string?]
  (let [res (:data (post-jmx-repository-with-http-info action))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec post-saml-configuration-with-http-info any?
  ""
  ([] (post-saml-configuration-with-http-info nil))
  ([{:keys [post apply delete action location path serviceranking idpUrl idpCertAlias idpHttpRedirect serviceProviderEntityId assertionConsumerServiceURL spPrivateKeyAlias keyStorePassword defaultRedirectUrl userIDAttribute useEncryption createUser addGroupMemberships groupMembershipAttribute defaultGroups nameIdFormat synchronizeAttributes handleLogout logoutUrl clockTolerance digestMethod signatureMethod userIntermediatePath propertylist]} (s/map-of keyword? any?)]
   (call-api "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"post" post "apply" apply "delete" delete "action" action "$location" location "path" (with-collection-format path :multi) "service.ranking" serviceranking "idpUrl" idpUrl "idpCertAlias" idpCertAlias "idpHttpRedirect" idpHttpRedirect "serviceProviderEntityId" serviceProviderEntityId "assertionConsumerServiceURL" assertionConsumerServiceURL "spPrivateKeyAlias" spPrivateKeyAlias "keyStorePassword" keyStorePassword "defaultRedirectUrl" defaultRedirectUrl "userIDAttribute" userIDAttribute "useEncryption" useEncryption "createUser" createUser "addGroupMemberships" addGroupMemberships "groupMembershipAttribute" groupMembershipAttribute "defaultGroups" (with-collection-format defaultGroups :multi) "nameIdFormat" nameIdFormat "synchronizeAttributes" (with-collection-format synchronizeAttributes :multi) "handleLogout" handleLogout "logoutUrl" logoutUrl "clockTolerance" clockTolerance "digestMethod" digestMethod "signatureMethod" signatureMethod "userIntermediatePath" userIntermediatePath "propertylist" (with-collection-format propertylist :csv) }
              :form-params   {}
              :content-types []
              :accepts       ["text/plain"]
              :auth-names    ["aemAuth"]})))

(defn-spec post-saml-configuration saml-configuration-info-spec
  ""
  ([] (post-saml-configuration nil))
  ([optional-params any?]
   (let [res (:data (post-saml-configuration-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode saml-configuration-info-spec res st/string-transformer)
        res))))



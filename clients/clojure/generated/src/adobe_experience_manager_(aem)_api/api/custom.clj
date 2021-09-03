(ns adobe-experience-manager-(aem)-api.api.custom
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


(defn-spec get-aem-health-check-with-http-info any?
  ""
  ([] (get-aem-health-check-with-http-info nil))
  ([{:keys [tags combineTagsOr]} (s/map-of keyword? any?)]
   (call-api "/system/health" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"tags" tags "combineTagsOr" combineTagsOr }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["aemAuth"]})))

(defn-spec get-aem-health-check string?
  ""
  ([] (get-aem-health-check nil))
  ([optional-params any?]
   (let [res (:data (get-aem-health-check-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec post-config-aem-health-check-servlet-with-http-info any?
  ""
  ([] (post-config-aem-health-check-servlet-with-http-info nil))
  ([{:keys [bundlesignored bundlesignoredTypeHint]} (s/map-of keyword? any?)]
   (call-api "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"bundles.ignored" (with-collection-format bundlesignored :multi) "bundles.ignored@TypeHint" bundlesignoredTypeHint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn-spec post-config-aem-health-check-servlet any?
  ""
  ([] (post-config-aem-health-check-servlet nil))
  ([optional-params any?]
   (let [res (:data (post-config-aem-health-check-servlet-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec post-config-aem-password-reset-with-http-info any?
  ""
  ([] (post-config-aem-password-reset-with-http-info nil))
  ([{:keys [pwdresetauthorizables pwdresetauthorizablesTypeHint]} (s/map-of keyword? any?)]
   (call-api "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pwdreset.authorizables" (with-collection-format pwdresetauthorizables :multi) "pwdreset.authorizables@TypeHint" pwdresetauthorizablesTypeHint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn-spec post-config-aem-password-reset any?
  ""
  ([] (post-config-aem-password-reset nil))
  ([optional-params any?]
   (let [res (:data (post-config-aem-password-reset-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))



(ns adobe-experience-manager-(aem)-api.api.cq
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


(defn-spec get-login-page-with-http-info any?
  ""
  []
  (call-api "/libs/granite/core/content/login.html" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["text/html"]
             :auth-names    []}))

(defn-spec get-login-page string?
  ""
  []
  (let [res (:data (get-login-page-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode string? res st/string-transformer)
       res)))


(defn-spec post-cq-actions-with-http-info any?
  ""
  [authorizableId string?, changelog string?]
  (check-required-params authorizableId changelog)
  (call-api "/.cqactions.html" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"authorizableId" authorizableId "changelog" changelog }
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn-spec post-cq-actions any?
  ""
  [authorizableId string?, changelog string?]
  (let [res (:data (post-cq-actions-with-http-info authorizableId changelog))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))



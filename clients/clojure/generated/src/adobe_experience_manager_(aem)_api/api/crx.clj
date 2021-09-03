(ns adobe-experience-manager-(aem)-api.api.crx
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


(defn-spec get-crxde-status-with-http-info any?
  ""
  []
  (call-api "/crx/server/crx.default/jcr:root/.1.json" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["plain/text"]
             :auth-names    ["aemAuth"]}))

(defn-spec get-crxde-status string?
  ""
  []
  (let [res (:data (get-crxde-status-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode string? res st/string-transformer)
       res)))


(defn-spec get-install-status-with-http-info any?
  ""
  []
  (call-api "/crx/packmgr/installstatus.jsp" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["aemAuth"]}))

(defn-spec get-install-status install-status-spec
  ""
  []
  (let [res (:data (get-install-status-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode install-status-spec res st/string-transformer)
       res)))


(defn-spec get-package-manager-servlet-with-http-info any?
  ""
  []
  (call-api "/crx/packmgr/service/script.html" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["text/html"]
             :auth-names    ["aemAuth"]}))

(defn-spec get-package-manager-servlet any?
  ""
  []
  (let [res (:data (get-package-manager-servlet-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec post-package-service-with-http-info any?
  ""
  [cmd string?]
  (check-required-params cmd)
  (call-api "/crx/packmgr/service.jsp" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"cmd" cmd }
             :form-params   {}
             :content-types []
             :accepts       ["text/xml"]
             :auth-names    ["aemAuth"]}))

(defn-spec post-package-service string?
  ""
  [cmd string?]
  (let [res (:data (post-package-service-with-http-info cmd))]
    (if (:decode-models *api-context*)
       (st/decode string? res st/string-transformer)
       res)))


(defn-spec post-package-service-json-with-http-info any?
  ""
  ([path string?, cmd string?, ] (post-package-service-json-with-http-info path cmd nil))
  ([path string?, cmd string?, {:keys [groupName packageName packageVersion _charset_ force recursive ^File package]} (s/map-of keyword? any?)]
   (check-required-params path cmd)
   (call-api "/crx/packmgr/service/.json/{path}" :post
             {:path-params   {"path" path }
              :header-params {}
              :query-params  {"cmd" cmd "groupName" groupName "packageName" packageName "packageVersion" packageVersion "_charset_" _charset_ "force" force "recursive" recursive }
              :form-params   {"package" package }
              :content-types ["multipart/form-data"]
              :accepts       ["application/json"]
              :auth-names    ["aemAuth"]})))

(defn-spec post-package-service-json string?
  ""
  ([path string?, cmd string?, ] (post-package-service-json path cmd nil))
  ([path string?, cmd string?, optional-params any?]
   (let [res (:data (post-package-service-json-with-http-info path cmd optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec post-package-update-with-http-info any?
  ""
  ([groupName string?, packageName string?, version string?, path string?, ] (post-package-update-with-http-info groupName packageName version path nil))
  ([groupName string?, packageName string?, version string?, path string?, {:keys [filter _charset_]} (s/map-of keyword? any?)]
   (check-required-params groupName packageName version path)
   (call-api "/crx/packmgr/update.jsp" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"groupName" groupName "packageName" packageName "version" version "path" path "filter" filter "_charset_" _charset_ }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["aemAuth"]})))

(defn-spec post-package-update string?
  ""
  ([groupName string?, packageName string?, version string?, path string?, ] (post-package-update groupName packageName version path nil))
  ([groupName string?, packageName string?, version string?, path string?, optional-params any?]
   (let [res (:data (post-package-update-with-http-info groupName packageName version path optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))


(defn-spec post-set-password-with-http-info any?
  ""
  [old string?, plain string?, verify string?]
  (check-required-params old plain verify)
  (call-api "/crx/explorer/ui/setpassword.jsp" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"old" old "plain" plain "verify" verify }
             :form-params   {}
             :content-types []
             :accepts       ["text/plain"]
             :auth-names    ["aemAuth"]}))

(defn-spec post-set-password string?
  ""
  [old string?, plain string?, verify string?]
  (let [res (:data (post-set-password-with-http-info old plain verify))]
    (if (:decode-models *api-context*)
       (st/decode string? res st/string-transformer)
       res)))



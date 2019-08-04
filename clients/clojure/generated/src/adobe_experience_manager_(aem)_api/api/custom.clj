(ns adobe-experience-manager-(aem)-api.api.custom
  (:require [adobe-experience-manager-(aem)-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-aem-health-check-with-http-info
  ""
  ([] (get-aem-health-check-with-http-info nil))
  ([{:keys [tags combine-tags-or ]}]
   (call-api "/system/health" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"tags" tags "combineTagsOr" combine-tags-or }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["aemAuth"]})))

(defn get-aem-health-check
  ""
  ([] (get-aem-health-check nil))
  ([optional-params]
   (:data (get-aem-health-check-with-http-info optional-params))))

(defn post-config-aem-health-check-servlet-with-http-info
  ""
  ([] (post-config-aem-health-check-servlet-with-http-info nil))
  ([{:keys [bundlesignored bundlesignored-type-hint ]}]
   (call-api "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"bundles.ignored" (with-collection-format bundlesignored :multi) "bundles.ignored@TypeHint" bundlesignored-type-hint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn post-config-aem-health-check-servlet
  ""
  ([] (post-config-aem-health-check-servlet nil))
  ([optional-params]
   (:data (post-config-aem-health-check-servlet-with-http-info optional-params))))

(defn post-config-aem-password-reset-with-http-info
  ""
  ([] (post-config-aem-password-reset-with-http-info nil))
  ([{:keys [pwdresetauthorizables pwdresetauthorizables-type-hint ]}]
   (call-api "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pwdreset.authorizables" (with-collection-format pwdresetauthorizables :multi) "pwdreset.authorizables@TypeHint" pwdresetauthorizables-type-hint }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    ["aemAuth"]})))

(defn post-config-aem-password-reset
  ""
  ([] (post-config-aem-password-reset nil))
  ([optional-params]
   (:data (post-config-aem-password-reset-with-http-info optional-params))))


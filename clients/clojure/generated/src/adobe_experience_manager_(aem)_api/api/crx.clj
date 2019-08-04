(ns adobe-experience-manager-(aem)-api.api.crx
  (:require [adobe-experience-manager-(aem)-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-crxde-status-with-http-info
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

(defn get-crxde-status
  ""
  []
  (:data (get-crxde-status-with-http-info)))

(defn get-install-status-with-http-info
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

(defn get-install-status
  ""
  []
  (:data (get-install-status-with-http-info)))

(defn get-package-manager-servlet-with-http-info
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

(defn get-package-manager-servlet
  ""
  []
  (:data (get-package-manager-servlet-with-http-info)))

(defn post-package-service-with-http-info
  ""
  [cmd ]
  (check-required-params cmd)
  (call-api "/crx/packmgr/service.jsp" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"cmd" cmd }
             :form-params   {}
             :content-types []
             :accepts       ["text/xml"]
             :auth-names    ["aemAuth"]}))

(defn post-package-service
  ""
  [cmd ]
  (:data (post-package-service-with-http-info cmd)))

(defn post-package-service-json-with-http-info
  ""
  ([path cmd ] (post-package-service-json-with-http-info path cmd nil))
  ([path cmd {:keys [group-name package-name package-version -charset- force recursive ^File package ]}]
   (check-required-params path cmd)
   (call-api "/crx/packmgr/service/.json/{path}" :post
             {:path-params   {"path" path }
              :header-params {}
              :query-params  {"cmd" cmd "groupName" group-name "packageName" package-name "packageVersion" package-version "_charset_" -charset- "force" force "recursive" recursive }
              :form-params   {"package" package }
              :content-types ["multipart/form-data"]
              :accepts       ["application/json"]
              :auth-names    ["aemAuth"]})))

(defn post-package-service-json
  ""
  ([path cmd ] (post-package-service-json path cmd nil))
  ([path cmd optional-params]
   (:data (post-package-service-json-with-http-info path cmd optional-params))))

(defn post-package-update-with-http-info
  ""
  ([group-name package-name version path ] (post-package-update-with-http-info group-name package-name version path nil))
  ([group-name package-name version path {:keys [filter -charset- ]}]
   (check-required-params group-name package-name version path)
   (call-api "/crx/packmgr/update.jsp" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"groupName" group-name "packageName" package-name "version" version "path" path "filter" filter "_charset_" -charset- }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["aemAuth"]})))

(defn post-package-update
  ""
  ([group-name package-name version path ] (post-package-update group-name package-name version path nil))
  ([group-name package-name version path optional-params]
   (:data (post-package-update-with-http-info group-name package-name version path optional-params))))

(defn post-set-password-with-http-info
  ""
  [old plain verify ]
  (check-required-params old plain verify)
  (call-api "/crx/explorer/ui/setpassword.jsp" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"old" old "plain" plain "verify" verify }
             :form-params   {}
             :content-types []
             :accepts       ["text/plain"]
             :auth-names    ["aemAuth"]}))

(defn post-set-password
  ""
  [old plain verify ]
  (:data (post-set-password-with-http-info old plain verify)))


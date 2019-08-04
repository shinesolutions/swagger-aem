(ns adobe-experience-manager-(aem)-api.api.cq
  (:require [adobe-experience-manager-(aem)-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-login-page-with-http-info
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

(defn get-login-page
  ""
  []
  (:data (get-login-page-with-http-info)))

(defn post-cq-actions-with-http-info
  ""
  [authorizable-id changelog ]
  (check-required-params authorizable-id changelog)
  (call-api "/.cqactions.html" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"authorizableId" authorizable-id "changelog" changelog }
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["aemAuth"]}))

(defn post-cq-actions
  ""
  [authorizable-id changelog ]
  (:data (post-cq-actions-with-http-info authorizable-id changelog)))


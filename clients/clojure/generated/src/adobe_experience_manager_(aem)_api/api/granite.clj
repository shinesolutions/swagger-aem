(ns adobe-experience-manager-(aem)-api.api.granite
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


(defn-spec ssl-setup-with-http-info any?
  ""
  ([keystorePassword string?, keystorePasswordConfirm string?, truststorePassword string?, truststorePasswordConfirm string?, httpsHostname string?, httpsPort string?, ] (ssl-setup-with-http-info keystorePassword keystorePasswordConfirm truststorePassword truststorePasswordConfirm httpsHostname httpsPort nil))
  ([keystorePassword string?, keystorePasswordConfirm string?, truststorePassword string?, truststorePasswordConfirm string?, httpsHostname string?, httpsPort string?, {:keys [^File privatekeyFile ^File certificateFile]} (s/map-of keyword? any?)]
   (check-required-params keystorePassword keystorePasswordConfirm truststorePassword truststorePasswordConfirm httpsHostname httpsPort)
   (call-api "/libs/granite/security/post/sslSetup.html" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"keystorePassword" keystorePassword "keystorePasswordConfirm" keystorePasswordConfirm "truststorePassword" truststorePassword "truststorePasswordConfirm" truststorePasswordConfirm "httpsHostname" httpsHostname "httpsPort" httpsPort }
              :form-params   {"privatekeyFile" privatekeyFile "certificateFile" certificateFile }
              :content-types ["multipart/form-data"]
              :accepts       ["text/plain"]
              :auth-names    ["aemAuth"]})))

(defn-spec ssl-setup string?
  ""
  ([keystorePassword string?, keystorePasswordConfirm string?, truststorePassword string?, truststorePasswordConfirm string?, httpsHostname string?, httpsPort string?, ] (ssl-setup keystorePassword keystorePasswordConfirm truststorePassword truststorePasswordConfirm httpsHostname httpsPort nil))
  ([keystorePassword string?, keystorePasswordConfirm string?, truststorePassword string?, truststorePasswordConfirm string?, httpsHostname string?, httpsPort string?, optional-params any?]
   (let [res (:data (ssl-setup-with-http-info keystorePassword keystorePasswordConfirm truststorePassword truststorePasswordConfirm httpsHostname httpsPort optional-params))]
     (if (:decode-models *api-context*)
        (st/decode string? res st/string-transformer)
        res))))



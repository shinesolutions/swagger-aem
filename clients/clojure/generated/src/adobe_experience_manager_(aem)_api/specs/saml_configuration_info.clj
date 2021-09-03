(ns adobe-experience-manager-(aem)-api.specs.saml-configuration-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-properties :refer :all]
            )
  (:import (java.io File)))


(def saml-configuration-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   (ds/opt :properties) saml-configuration-properties-spec
   })

(def saml-configuration-info-spec
  (ds/spec
    {:name ::saml-configuration-info
     :spec saml-configuration-info-data}))

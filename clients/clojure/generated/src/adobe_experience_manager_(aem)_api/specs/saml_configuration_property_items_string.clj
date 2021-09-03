(ns adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def saml-configuration-property-items-string-data
  {
   (ds/opt :name) string?
   (ds/opt :optional) boolean?
   (ds/opt :is_set) boolean?
   (ds/opt :type) int?
   (ds/opt :value) string?
   (ds/opt :description) string?
   })

(def saml-configuration-property-items-string-spec
  (ds/spec
    {:name ::saml-configuration-property-items-string
     :spec saml-configuration-property-items-string-data}))

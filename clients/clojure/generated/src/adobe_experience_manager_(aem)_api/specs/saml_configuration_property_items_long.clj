(ns adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-long
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def saml-configuration-property-items-long-data
  {
   (ds/opt :name) string?
   (ds/opt :optional) boolean?
   (ds/opt :is_set) boolean?
   (ds/opt :type) int?
   (ds/opt :value) int?
   (ds/opt :description) string?
   })

(def saml-configuration-property-items-long-spec
  (ds/spec
    {:name ::saml-configuration-property-items-long
     :spec saml-configuration-property-items-long-data}))

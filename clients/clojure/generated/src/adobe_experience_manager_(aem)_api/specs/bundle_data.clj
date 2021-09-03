(ns adobe-experience-manager-(aem)-api.specs.bundle-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-(aem)-api.specs.bundle-data-prop :refer :all]
            )
  (:import (java.io File)))


(def bundle-data-data
  {
   (ds/opt :id) int?
   (ds/opt :name) string?
   (ds/opt :fragment) boolean?
   (ds/opt :stateRaw) int?
   (ds/opt :state) string?
   (ds/opt :version) string?
   (ds/opt :symbolicName) string?
   (ds/opt :category) string?
   (ds/opt :props) (s/coll-of bundle-data-prop-spec)
   })

(def bundle-data-spec
  (ds/spec
    {:name ::bundle-data
     :spec bundle-data-data}))

(ns adobe-experience-manager-(aem)-api.specs.bundle-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-(aem)-api.specs.bundle-data :refer :all]
            )
  (:import (java.io File)))


(def bundle-info-data
  {
   (ds/opt :status) string?
   (ds/opt :s) (s/coll-of int?)
   (ds/opt :data) (s/coll-of bundle-data-spec)
   })

(def bundle-info-spec
  (ds/spec
    {:name ::bundle-info
     :spec bundle-info-data}))

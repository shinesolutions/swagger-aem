(ns adobe-experience-manager-(aem)-api.specs.bundle-data-prop
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bundle-data-prop-data
  {
   (ds/opt :key) string?
   (ds/opt :value) string?
   })

(def bundle-data-prop-spec
  (ds/spec
    {:name ::bundle-data-prop
     :spec bundle-data-prop-data}))

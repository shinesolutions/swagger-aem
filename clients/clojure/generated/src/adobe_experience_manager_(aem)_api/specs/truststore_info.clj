(ns adobe-experience-manager-(aem)-api.specs.truststore-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-(aem)-api.specs.truststore-items :refer :all]
            )
  (:import (java.io File)))


(def truststore-info-data
  {
   (ds/opt :aliases) (s/coll-of truststore-items-spec)
   (ds/opt :exists) boolean?
   })

(def truststore-info-spec
  (ds/spec
    {:name ::truststore-info
     :spec truststore-info-data}))

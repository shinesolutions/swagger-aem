(ns adobe-experience-manager-(aem)-api.specs.keystore-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-(aem)-api.specs.keystore-items :refer :all]
            )
  (:import (java.io File)))


(def keystore-info-data
  {
   (ds/opt :aliases) (s/coll-of keystore-items-spec)
   (ds/opt :exists) boolean?
   })

(def keystore-info-spec
  (ds/spec
    {:name ::keystore-info
     :spec keystore-info-data}))

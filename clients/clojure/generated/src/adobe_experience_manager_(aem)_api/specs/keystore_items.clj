(ns adobe-experience-manager-(aem)-api.specs.keystore-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-(aem)-api.specs.keystore-chain-items :refer :all]
            )
  (:import (java.io File)))


(def keystore-items-data
  {
   (ds/opt :alias) string?
   (ds/opt :entryType) string?
   (ds/opt :algorithm) string?
   (ds/opt :format) string?
   (ds/opt :chain) (s/coll-of keystore-chain-items-spec)
   })

(def keystore-items-spec
  (ds/spec
    {:name ::keystore-items
     :spec keystore-items-data}))

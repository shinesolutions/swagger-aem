(ns adobe-experience-manager-(aem)-api.specs.truststore-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def truststore-items-data
  {
   (ds/opt :alias) string?
   (ds/opt :entryType) string?
   (ds/opt :subject) string?
   (ds/opt :issuer) string?
   (ds/opt :notBefore) string?
   (ds/opt :notAfter) string?
   (ds/opt :serialNumber) int?
   })

(def truststore-items-spec
  (ds/spec
    {:name ::truststore-items
     :spec truststore-items-data}))

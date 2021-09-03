(ns adobe-experience-manager-(aem)-api.specs.keystore-chain-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def keystore-chain-items-data
  {
   (ds/opt :subject) string?
   (ds/opt :issuer) string?
   (ds/opt :notBefore) string?
   (ds/opt :notAfter) string?
   (ds/opt :serialNumber) int?
   })

(def keystore-chain-items-spec
  (ds/spec
    {:name ::keystore-chain-items
     :spec keystore-chain-items-data}))

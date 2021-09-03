(ns adobe-experience-manager-(aem)-api.specs.install-status-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def install-status-status-data
  {
   (ds/opt :finished) boolean?
   (ds/opt :itemCount) int?
   })

(def install-status-status-spec
  (ds/spec
    {:name ::install-status-status
     :spec install-status-status-data}))

(ns adobe-experience-manager-(aem)-api.specs.install-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-(aem)-api.specs.install-status-status :refer :all]
            )
  (:import (java.io File)))


(def install-status-data
  {
   (ds/opt :status) install-status-status-spec
   })

(def install-status-spec
  (ds/spec
    {:name ::install-status
     :spec install-status-data}))

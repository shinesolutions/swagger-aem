(ns adobe-experience-manager-(aem)-api.specs.saml-configuration-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-array :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-long :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-boolean :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-boolean :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-boolean :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-boolean :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-array :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-array :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-boolean :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-long :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string :refer :all]
            [adobe-experience-manager-(aem)-api.specs.saml-configuration-property-items-string :refer :all]
            )
  (:import (java.io File)))


(def saml-configuration-properties-data
  {
   (ds/opt :path) saml-configuration-property-items-array-spec
   (ds/opt :serviceranking) saml-configuration-property-items-long-spec
   (ds/opt :idpUrl) saml-configuration-property-items-string-spec
   (ds/opt :idpCertAlias) saml-configuration-property-items-string-spec
   (ds/opt :idpHttpRedirect) saml-configuration-property-items-boolean-spec
   (ds/opt :serviceProviderEntityId) saml-configuration-property-items-string-spec
   (ds/opt :assertionConsumerServiceURL) saml-configuration-property-items-string-spec
   (ds/opt :spPrivateKeyAlias) saml-configuration-property-items-string-spec
   (ds/opt :keyStorePassword) saml-configuration-property-items-string-spec
   (ds/opt :defaultRedirectUrl) saml-configuration-property-items-string-spec
   (ds/opt :userIDAttribute) saml-configuration-property-items-string-spec
   (ds/opt :useEncryption) saml-configuration-property-items-boolean-spec
   (ds/opt :createUser) saml-configuration-property-items-boolean-spec
   (ds/opt :addGroupMemberships) saml-configuration-property-items-boolean-spec
   (ds/opt :groupMembershipAttribute) saml-configuration-property-items-string-spec
   (ds/opt :defaultGroups) saml-configuration-property-items-array-spec
   (ds/opt :nameIdFormat) saml-configuration-property-items-string-spec
   (ds/opt :synchronizeAttributes) saml-configuration-property-items-array-spec
   (ds/opt :handleLogout) saml-configuration-property-items-boolean-spec
   (ds/opt :logoutUrl) saml-configuration-property-items-string-spec
   (ds/opt :clockTolerance) saml-configuration-property-items-long-spec
   (ds/opt :digestMethod) saml-configuration-property-items-string-spec
   (ds/opt :signatureMethod) saml-configuration-property-items-string-spec
   (ds/opt :userIntermediatePath) saml-configuration-property-items-string-spec
   })

(def saml-configuration-properties-spec
  (ds/spec
    {:name ::saml-configuration-properties
     :spec saml-configuration-properties-data}))

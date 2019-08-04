package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class KeystoreChainItemsList implements ListWrapper {
        // This declaration below of _KeystoreChainItems_obj_class is to force flash compiler to include this class
        private var _keystoreChainItems_obj_class: org.openapitools.client.model.KeystoreChainItems = null;
        [XmlElements(name="keystoreChainItems", type="org.openapitools.client.model.KeystoreChainItems")]
        public var keystoreChainItems: Array = new Array();

        public function getList(): Array{
            return keystoreChainItems;
        }

}

}

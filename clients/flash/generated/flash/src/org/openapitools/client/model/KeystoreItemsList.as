package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.KeystoreChainItems;

    public class KeystoreItemsList implements ListWrapper {
        // This declaration below of _KeystoreItems_obj_class is to force flash compiler to include this class
        private var _keystoreItems_obj_class: org.openapitools.client.model.KeystoreItems = null;
        [XmlElements(name="keystoreItems", type="org.openapitools.client.model.KeystoreItems")]
        public var keystoreItems: Array = new Array();

        public function getList(): Array{
            return keystoreItems;
        }

}

}

package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.KeystoreItems;

    public class KeystoreInfoList implements ListWrapper {
        // This declaration below of _KeystoreInfo_obj_class is to force flash compiler to include this class
        private var _keystoreInfo_obj_class: org.openapitools.client.model.KeystoreInfo = null;
        [XmlElements(name="keystoreInfo", type="org.openapitools.client.model.KeystoreInfo")]
        public var keystoreInfo: Array = new Array();

        public function getList(): Array{
            return keystoreInfo;
        }

}

}

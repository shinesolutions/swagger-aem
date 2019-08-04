package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TruststoreItems;

    public class TruststoreInfoList implements ListWrapper {
        // This declaration below of _TruststoreInfo_obj_class is to force flash compiler to include this class
        private var _truststoreInfo_obj_class: org.openapitools.client.model.TruststoreInfo = null;
        [XmlElements(name="truststoreInfo", type="org.openapitools.client.model.TruststoreInfo")]
        public var truststoreInfo: Array = new Array();

        public function getList(): Array{
            return truststoreInfo;
        }

}

}

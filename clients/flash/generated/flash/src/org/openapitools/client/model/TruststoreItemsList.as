package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TruststoreItemsList implements ListWrapper {
        // This declaration below of _TruststoreItems_obj_class is to force flash compiler to include this class
        private var _truststoreItems_obj_class: org.openapitools.client.model.TruststoreItems = null;
        [XmlElements(name="truststoreItems", type="org.openapitools.client.model.TruststoreItems")]
        public var truststoreItems: Array = new Array();

        public function getList(): Array{
            return truststoreItems;
        }

}

}

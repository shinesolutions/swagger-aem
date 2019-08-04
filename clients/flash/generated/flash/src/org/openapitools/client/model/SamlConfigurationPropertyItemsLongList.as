package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class SamlConfigurationPropertyItemsLongList implements ListWrapper {
        // This declaration below of _SamlConfigurationPropertyItemsLong_obj_class is to force flash compiler to include this class
        private var _samlConfigurationPropertyItemsLong_obj_class: org.openapitools.client.model.SamlConfigurationPropertyItemsLong = null;
        [XmlElements(name="samlConfigurationPropertyItemsLong", type="org.openapitools.client.model.SamlConfigurationPropertyItemsLong")]
        public var samlConfigurationPropertyItemsLong: Array = new Array();

        public function getList(): Array{
            return samlConfigurationPropertyItemsLong;
        }

}

}

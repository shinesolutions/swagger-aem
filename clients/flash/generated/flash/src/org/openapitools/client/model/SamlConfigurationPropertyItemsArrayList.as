package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class SamlConfigurationPropertyItemsArrayList implements ListWrapper {
        // This declaration below of _SamlConfigurationPropertyItemsArray_obj_class is to force flash compiler to include this class
        private var _samlConfigurationPropertyItemsArray_obj_class: org.openapitools.client.model.SamlConfigurationPropertyItemsArray = null;
        [XmlElements(name="samlConfigurationPropertyItemsArray", type="org.openapitools.client.model.SamlConfigurationPropertyItemsArray")]
        public var samlConfigurationPropertyItemsArray: Array = new Array();

        public function getList(): Array{
            return samlConfigurationPropertyItemsArray;
        }

}

}

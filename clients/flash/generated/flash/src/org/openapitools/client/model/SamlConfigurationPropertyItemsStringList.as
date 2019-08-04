package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class SamlConfigurationPropertyItemsStringList implements ListWrapper {
        // This declaration below of _SamlConfigurationPropertyItemsString_obj_class is to force flash compiler to include this class
        private var _samlConfigurationPropertyItemsString_obj_class: org.openapitools.client.model.SamlConfigurationPropertyItemsString = null;
        [XmlElements(name="samlConfigurationPropertyItemsString", type="org.openapitools.client.model.SamlConfigurationPropertyItemsString")]
        public var samlConfigurationPropertyItemsString: Array = new Array();

        public function getList(): Array{
            return samlConfigurationPropertyItemsString;
        }

}

}

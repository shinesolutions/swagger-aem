package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class SamlConfigurationPropertyItemsBooleanList implements ListWrapper {
        // This declaration below of _SamlConfigurationPropertyItemsBoolean_obj_class is to force flash compiler to include this class
        private var _samlConfigurationPropertyItemsBoolean_obj_class: org.openapitools.client.model.SamlConfigurationPropertyItemsBoolean = null;
        [XmlElements(name="samlConfigurationPropertyItemsBoolean", type="org.openapitools.client.model.SamlConfigurationPropertyItemsBoolean")]
        public var samlConfigurationPropertyItemsBoolean: Array = new Array();

        public function getList(): Array{
            return samlConfigurationPropertyItemsBoolean;
        }

}

}

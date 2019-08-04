package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.SamlConfigurationPropertyItemsArray;
import org.openapitools.client.model.SamlConfigurationPropertyItemsBoolean;
import org.openapitools.client.model.SamlConfigurationPropertyItemsLong;
import org.openapitools.client.model.SamlConfigurationPropertyItemsString;

    public class SamlConfigurationPropertiesList implements ListWrapper {
        // This declaration below of _SamlConfigurationProperties_obj_class is to force flash compiler to include this class
        private var _samlConfigurationProperties_obj_class: org.openapitools.client.model.SamlConfigurationProperties = null;
        [XmlElements(name="samlConfigurationProperties", type="org.openapitools.client.model.SamlConfigurationProperties")]
        public var samlConfigurationProperties: Array = new Array();

        public function getList(): Array{
            return samlConfigurationProperties;
        }

}

}

package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.SamlConfigurationProperties;

    public class SamlConfigurationInfoList implements ListWrapper {
        // This declaration below of _SamlConfigurationInfo_obj_class is to force flash compiler to include this class
        private var _samlConfigurationInfo_obj_class: org.openapitools.client.model.SamlConfigurationInfo = null;
        [XmlElements(name="samlConfigurationInfo", type="org.openapitools.client.model.SamlConfigurationInfo")]
        public var samlConfigurationInfo: Array = new Array();

        public function getList(): Array{
            return samlConfigurationInfo;
        }

}

}

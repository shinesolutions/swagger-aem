package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.InstallStatusStatus;

    public class InstallStatusList implements ListWrapper {
        // This declaration below of _InstallStatus_obj_class is to force flash compiler to include this class
        private var _installStatus_obj_class: org.openapitools.client.model.InstallStatus = null;
        [XmlElements(name="installStatus", type="org.openapitools.client.model.InstallStatus")]
        public var installStatus: Array = new Array();

        public function getList(): Array{
            return installStatus;
        }

}

}

package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class InstallStatusStatusList implements ListWrapper {
        // This declaration below of _InstallStatus_status_obj_class is to force flash compiler to include this class
        private var _installStatusStatus_obj_class: org.openapitools.client.model.InstallStatusStatus = null;
        [XmlElements(name="installStatusStatus", type="org.openapitools.client.model.InstallStatusStatus")]
        public var installStatusStatus: Array = new Array();

        public function getList(): Array{
            return installStatusStatus;
        }

}

}

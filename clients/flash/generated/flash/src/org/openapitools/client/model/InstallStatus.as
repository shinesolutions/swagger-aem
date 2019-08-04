package org.openapitools.client.model {

import org.openapitools.client.model.InstallStatusStatus;

    [XmlRootNode(name="InstallStatus")]
    public class InstallStatus {
                [XmlElement(name="status")]
        public var status: InstallStatusStatus = NaN;

    public function toString(): String {
        var str: String = "InstallStatus: ";
        str += " (status: " + status + ")";
        return str;
    }

}

}

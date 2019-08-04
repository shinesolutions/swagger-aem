package org.openapitools.client.model {

import org.openapitools.client.model.SamlConfigurationProperties;

    [XmlRootNode(name="SamlConfigurationInfo")]
    public class SamlConfigurationInfo {
        /* Persistent Identity (PID) */
        [XmlElement(name="pid")]
        public var pid: String = null;
        /* Title */
        [XmlElement(name="title")]
        public var title: String = null;
        /* Title */
        [XmlElement(name="description")]
        public var description: String = null;
        /* needed for configuration binding */
        [XmlElement(name="bundle_location")]
        public var bundleLocation: String = null;
        /* needed for configuraiton binding */
        [XmlElement(name="service_location")]
        public var serviceLocation: String = null;
                [XmlElement(name="properties")]
        public var properties: SamlConfigurationProperties = NaN;

    public function toString(): String {
        var str: String = "SamlConfigurationInfo: ";
        str += " (pid: " + pid + ")";
        str += " (title: " + title + ")";
        str += " (description: " + description + ")";
        str += " (bundleLocation: " + bundleLocation + ")";
        str += " (serviceLocation: " + serviceLocation + ")";
        str += " (properties: " + properties + ")";
        return str;
    }

}

}

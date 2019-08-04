package org.openapitools.client.model {


    [XmlRootNode(name="TruststoreItems")]
    public class TruststoreItems {
        /* Truststore alias name */
        [XmlElement(name="alias")]
        public var alias: String = null;
                [XmlElement(name="entryType")]
        public var entryType: String = null;
        /* e.g. \&quot;CN&#x3D;localhost\&quot; */
        [XmlElement(name="subject")]
        public var subject: String = null;
        /* e.g. \&quot;CN&#x3D;Admin\&quot; */
        [XmlElement(name="issuer")]
        public var issuer: String = null;
        /* e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot; */
        [XmlElement(name="notBefore")]
        public var notBefore: String = null;
        /* e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot; */
        [XmlElement(name="notAfter")]
        public var notAfter: String = null;
        /* 18165099476682912368 */
        [XmlElement(name="serialNumber")]
        public var serialNumber: Number = 0;

    public function toString(): String {
        var str: String = "TruststoreItems: ";
        str += " (alias: " + alias + ")";
        str += " (entryType: " + entryType + ")";
        str += " (subject: " + subject + ")";
        str += " (issuer: " + issuer + ")";
        str += " (notBefore: " + notBefore + ")";
        str += " (notAfter: " + notAfter + ")";
        str += " (serialNumber: " + serialNumber + ")";
        return str;
    }

}

}

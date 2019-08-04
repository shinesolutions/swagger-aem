package org.openapitools.client.model {

import org.openapitools.client.model.KeystoreChainItems;

    [XmlRootNode(name="KeystoreItems")]
    public class KeystoreItems {
        /* Keystore alias name */
        [XmlElement(name="alias")]
        public var alias: String = null;
        /* e.g. \&quot;privateKey\&quot; */
        [XmlElement(name="entryType")]
        public var entryType: String = null;
        /* e.g. \&quot;RSA\&quot; */
        [XmlElement(name="algorithm")]
        public var algorithm: String = null;
        /* e.g. \&quot;PKCS#8\&quot; */
        [XmlElement(name="format")]
        public var format: String = null;
                // This declaration below of _chain_obj_class is to force flash compiler to include this class
        private var _chain_obj_class: Array = null;
        [XmlElementWrapper(name="chain")]
        [XmlElements(name="chain", type="Array")]
                public var chain: Array = new Array();

    public function toString(): String {
        var str: String = "KeystoreItems: ";
        str += " (alias: " + alias + ")";
        str += " (entryType: " + entryType + ")";
        str += " (algorithm: " + algorithm + ")";
        str += " (format: " + format + ")";
        str += " (chain: " + chain + ")";
        return str;
    }

}

}

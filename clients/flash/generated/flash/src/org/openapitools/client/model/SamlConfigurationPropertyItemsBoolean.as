package org.openapitools.client.model {


    [XmlRootNode(name="SamlConfigurationPropertyItemsBoolean")]
    public class SamlConfigurationPropertyItemsBoolean {
        /* property name */
        [XmlElement(name="name")]
        public var name: String = null;
        /* True if optional */
        [XmlElement(name="optional")]
        public var optional: Boolean = false;
        /* True if property is set */
        [XmlElement(name="is_set")]
        public var isSet: Boolean = false;
        /* Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password */
        [XmlElement(name="type")]
        public var type: Number = 0;
        /* Property value */
        [XmlElement(name="value")]
        public var value: Boolean = false;
        /* Property description */
        [XmlElement(name="description")]
        public var description: String = null;

    public function toString(): String {
        var str: String = "SamlConfigurationPropertyItemsBoolean: ";
        str += " (name: " + name + ")";
        str += " (optional: " + optional + ")";
        str += " (isSet: " + isSet + ")";
        str += " (type: " + type + ")";
        str += " (value: " + value + ")";
        str += " (description: " + description + ")";
        return str;
    }

}

}

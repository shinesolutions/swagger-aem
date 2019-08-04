package org.openapitools.client.model {


    [XmlRootNode(name="InstallStatusStatus")]
    public class InstallStatusStatus {
                [XmlElement(name="finished")]
        public var finished: Boolean = false;
                [XmlElement(name="itemCount")]
        public var itemCount: Number = 0;

    public function toString(): String {
        var str: String = "InstallStatusStatus: ";
        str += " (finished: " + finished + ")";
        str += " (itemCount: " + itemCount + ")";
        return str;
    }

}

}

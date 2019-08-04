package org.openapitools.client.model {

import org.openapitools.client.model.SamlConfigurationPropertyItemsArray;
import org.openapitools.client.model.SamlConfigurationPropertyItemsBoolean;
import org.openapitools.client.model.SamlConfigurationPropertyItemsLong;
import org.openapitools.client.model.SamlConfigurationPropertyItemsString;

    [XmlRootNode(name="SamlConfigurationProperties")]
    public class SamlConfigurationProperties {
                [XmlElement(name="path")]
        public var path: SamlConfigurationPropertyItemsArray = NaN;
                [XmlElement(name="service.ranking")]
        public var serviceRanking: SamlConfigurationPropertyItemsLong = NaN;
                [XmlElement(name="idpUrl")]
        public var idpUrl: SamlConfigurationPropertyItemsString = NaN;
                [XmlElement(name="idpCertAlias")]
        public var idpCertAlias: SamlConfigurationPropertyItemsString = NaN;
                [XmlElement(name="idpHttpRedirect")]
        public var idpHttpRedirect: SamlConfigurationPropertyItemsBoolean = NaN;
                [XmlElement(name="serviceProviderEntityId")]
        public var serviceProviderEntityId: SamlConfigurationPropertyItemsString = NaN;
                [XmlElement(name="assertionConsumerServiceURL")]
        public var assertionConsumerServiceURL: SamlConfigurationPropertyItemsString = NaN;
                [XmlElement(name="spPrivateKeyAlias")]
        public var spPrivateKeyAlias: SamlConfigurationPropertyItemsString = NaN;
                [XmlElement(name="keyStorePassword")]
        public var keyStorePassword: SamlConfigurationPropertyItemsString = NaN;
                [XmlElement(name="defaultRedirectUrl")]
        public var defaultRedirectUrl: SamlConfigurationPropertyItemsString = NaN;
                [XmlElement(name="userIDAttribute")]
        public var userIDAttribute: SamlConfigurationPropertyItemsString = NaN;
                [XmlElement(name="useEncryption")]
        public var useEncryption: SamlConfigurationPropertyItemsBoolean = NaN;
                [XmlElement(name="createUser")]
        public var createUser: SamlConfigurationPropertyItemsBoolean = NaN;
                [XmlElement(name="addGroupMemberships")]
        public var addGroupMemberships: SamlConfigurationPropertyItemsBoolean = NaN;
                [XmlElement(name="groupMembershipAttribute")]
        public var groupMembershipAttribute: SamlConfigurationPropertyItemsString = NaN;
                [XmlElement(name="defaultGroups")]
        public var defaultGroups: SamlConfigurationPropertyItemsArray = NaN;
                [XmlElement(name="nameIdFormat")]
        public var nameIdFormat: SamlConfigurationPropertyItemsString = NaN;
                [XmlElement(name="synchronizeAttributes")]
        public var synchronizeAttributes: SamlConfigurationPropertyItemsArray = NaN;
                [XmlElement(name="handleLogout")]
        public var handleLogout: SamlConfigurationPropertyItemsBoolean = NaN;
                [XmlElement(name="logoutUrl")]
        public var logoutUrl: SamlConfigurationPropertyItemsString = NaN;
                [XmlElement(name="clockTolerance")]
        public var clockTolerance: SamlConfigurationPropertyItemsLong = NaN;
                [XmlElement(name="digestMethod")]
        public var digestMethod: SamlConfigurationPropertyItemsString = NaN;
                [XmlElement(name="signatureMethod")]
        public var signatureMethod: SamlConfigurationPropertyItemsString = NaN;
                [XmlElement(name="userIntermediatePath")]
        public var userIntermediatePath: SamlConfigurationPropertyItemsString = NaN;

    public function toString(): String {
        var str: String = "SamlConfigurationProperties: ";
        str += " (path: " + path + ")";
        str += " (serviceRanking: " + serviceRanking + ")";
        str += " (idpUrl: " + idpUrl + ")";
        str += " (idpCertAlias: " + idpCertAlias + ")";
        str += " (idpHttpRedirect: " + idpHttpRedirect + ")";
        str += " (serviceProviderEntityId: " + serviceProviderEntityId + ")";
        str += " (assertionConsumerServiceURL: " + assertionConsumerServiceURL + ")";
        str += " (spPrivateKeyAlias: " + spPrivateKeyAlias + ")";
        str += " (keyStorePassword: " + keyStorePassword + ")";
        str += " (defaultRedirectUrl: " + defaultRedirectUrl + ")";
        str += " (userIDAttribute: " + userIDAttribute + ")";
        str += " (useEncryption: " + useEncryption + ")";
        str += " (createUser: " + createUser + ")";
        str += " (addGroupMemberships: " + addGroupMemberships + ")";
        str += " (groupMembershipAttribute: " + groupMembershipAttribute + ")";
        str += " (defaultGroups: " + defaultGroups + ")";
        str += " (nameIdFormat: " + nameIdFormat + ")";
        str += " (synchronizeAttributes: " + synchronizeAttributes + ")";
        str += " (handleLogout: " + handleLogout + ")";
        str += " (logoutUrl: " + logoutUrl + ")";
        str += " (clockTolerance: " + clockTolerance + ")";
        str += " (digestMethod: " + digestMethod + ")";
        str += " (signatureMethod: " + signatureMethod + ")";
        str += " (userIntermediatePath: " + userIntermediatePath + ")";
        return str;
    }

}

}

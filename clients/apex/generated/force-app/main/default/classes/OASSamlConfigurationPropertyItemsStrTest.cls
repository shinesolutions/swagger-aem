@isTest
private class OASSamlConfigurationPropertyItemsStrTest {
    @isTest
    private static void equalsSameInstance() {
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString1 = OASSamlConfigurationPropertyItemsStr.getExample();
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString2 = samlConfigurationPropertyItemsString1;
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString3 = new OASSamlConfigurationPropertyItemsStr();
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString4 = samlConfigurationPropertyItemsString3;

        System.assert(samlConfigurationPropertyItemsString1.equals(samlConfigurationPropertyItemsString2));
        System.assert(samlConfigurationPropertyItemsString2.equals(samlConfigurationPropertyItemsString1));
        System.assert(samlConfigurationPropertyItemsString1.equals(samlConfigurationPropertyItemsString1));
        System.assert(samlConfigurationPropertyItemsString3.equals(samlConfigurationPropertyItemsString4));
        System.assert(samlConfigurationPropertyItemsString4.equals(samlConfigurationPropertyItemsString3));
        System.assert(samlConfigurationPropertyItemsString3.equals(samlConfigurationPropertyItemsString3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString1 = OASSamlConfigurationPropertyItemsStr.getExample();
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString2 = OASSamlConfigurationPropertyItemsStr.getExample();
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString3 = new OASSamlConfigurationPropertyItemsStr();
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString4 = new OASSamlConfigurationPropertyItemsStr();

        System.assert(samlConfigurationPropertyItemsString1.equals(samlConfigurationPropertyItemsString2));
        System.assert(samlConfigurationPropertyItemsString2.equals(samlConfigurationPropertyItemsString1));
        System.assert(samlConfigurationPropertyItemsString3.equals(samlConfigurationPropertyItemsString4));
        System.assert(samlConfigurationPropertyItemsString4.equals(samlConfigurationPropertyItemsString3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString1 = OASSamlConfigurationPropertyItemsStr.getExample();
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString2 = new OASSamlConfigurationPropertyItemsStr();

        System.assertEquals(false, samlConfigurationPropertyItemsString1.equals('foo'));
        System.assertEquals(false, samlConfigurationPropertyItemsString2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString1 = OASSamlConfigurationPropertyItemsStr.getExample();
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString2 = new OASSamlConfigurationPropertyItemsStr();
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString3;

        System.assertEquals(false, samlConfigurationPropertyItemsString1.equals(samlConfigurationPropertyItemsString3));
        System.assertEquals(false, samlConfigurationPropertyItemsString2.equals(samlConfigurationPropertyItemsString3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString1 = OASSamlConfigurationPropertyItemsStr.getExample();
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString2 = new OASSamlConfigurationPropertyItemsStr();

        System.assertEquals(samlConfigurationPropertyItemsString1.hashCode(), samlConfigurationPropertyItemsString1.hashCode());
        System.assertEquals(samlConfigurationPropertyItemsString2.hashCode(), samlConfigurationPropertyItemsString2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString1 = OASSamlConfigurationPropertyItemsStr.getExample();
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString2 = OASSamlConfigurationPropertyItemsStr.getExample();
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString3 = new OASSamlConfigurationPropertyItemsStr();
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString4 = new OASSamlConfigurationPropertyItemsStr();

        System.assert(samlConfigurationPropertyItemsString1.equals(samlConfigurationPropertyItemsString2));
        System.assert(samlConfigurationPropertyItemsString3.equals(samlConfigurationPropertyItemsString4));
        System.assertEquals(samlConfigurationPropertyItemsString1.hashCode(), samlConfigurationPropertyItemsString2.hashCode());
        System.assertEquals(samlConfigurationPropertyItemsString3.hashCode(), samlConfigurationPropertyItemsString4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSamlConfigurationPropertyItemsStr samlConfigurationPropertyItemsString = new OASSamlConfigurationPropertyItemsStr();
        Map<String, String> propertyMappings = samlConfigurationPropertyItemsString.getPropertyMappings();
        System.assertEquals('isSet', propertyMappings.get('is_set'));
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}

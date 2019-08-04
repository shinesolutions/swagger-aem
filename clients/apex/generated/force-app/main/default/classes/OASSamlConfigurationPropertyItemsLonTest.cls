@isTest
private class OASSamlConfigurationPropertyItemsLonTest {
    @isTest
    private static void equalsSameInstance() {
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong1 = OASSamlConfigurationPropertyItemsLon.getExample();
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong2 = samlConfigurationPropertyItemsLong1;
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong3 = new OASSamlConfigurationPropertyItemsLon();
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong4 = samlConfigurationPropertyItemsLong3;

        System.assert(samlConfigurationPropertyItemsLong1.equals(samlConfigurationPropertyItemsLong2));
        System.assert(samlConfigurationPropertyItemsLong2.equals(samlConfigurationPropertyItemsLong1));
        System.assert(samlConfigurationPropertyItemsLong1.equals(samlConfigurationPropertyItemsLong1));
        System.assert(samlConfigurationPropertyItemsLong3.equals(samlConfigurationPropertyItemsLong4));
        System.assert(samlConfigurationPropertyItemsLong4.equals(samlConfigurationPropertyItemsLong3));
        System.assert(samlConfigurationPropertyItemsLong3.equals(samlConfigurationPropertyItemsLong3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong1 = OASSamlConfigurationPropertyItemsLon.getExample();
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong2 = OASSamlConfigurationPropertyItemsLon.getExample();
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong3 = new OASSamlConfigurationPropertyItemsLon();
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong4 = new OASSamlConfigurationPropertyItemsLon();

        System.assert(samlConfigurationPropertyItemsLong1.equals(samlConfigurationPropertyItemsLong2));
        System.assert(samlConfigurationPropertyItemsLong2.equals(samlConfigurationPropertyItemsLong1));
        System.assert(samlConfigurationPropertyItemsLong3.equals(samlConfigurationPropertyItemsLong4));
        System.assert(samlConfigurationPropertyItemsLong4.equals(samlConfigurationPropertyItemsLong3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong1 = OASSamlConfigurationPropertyItemsLon.getExample();
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong2 = new OASSamlConfigurationPropertyItemsLon();

        System.assertEquals(false, samlConfigurationPropertyItemsLong1.equals('foo'));
        System.assertEquals(false, samlConfigurationPropertyItemsLong2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong1 = OASSamlConfigurationPropertyItemsLon.getExample();
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong2 = new OASSamlConfigurationPropertyItemsLon();
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong3;

        System.assertEquals(false, samlConfigurationPropertyItemsLong1.equals(samlConfigurationPropertyItemsLong3));
        System.assertEquals(false, samlConfigurationPropertyItemsLong2.equals(samlConfigurationPropertyItemsLong3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong1 = OASSamlConfigurationPropertyItemsLon.getExample();
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong2 = new OASSamlConfigurationPropertyItemsLon();

        System.assertEquals(samlConfigurationPropertyItemsLong1.hashCode(), samlConfigurationPropertyItemsLong1.hashCode());
        System.assertEquals(samlConfigurationPropertyItemsLong2.hashCode(), samlConfigurationPropertyItemsLong2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong1 = OASSamlConfigurationPropertyItemsLon.getExample();
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong2 = OASSamlConfigurationPropertyItemsLon.getExample();
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong3 = new OASSamlConfigurationPropertyItemsLon();
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong4 = new OASSamlConfigurationPropertyItemsLon();

        System.assert(samlConfigurationPropertyItemsLong1.equals(samlConfigurationPropertyItemsLong2));
        System.assert(samlConfigurationPropertyItemsLong3.equals(samlConfigurationPropertyItemsLong4));
        System.assertEquals(samlConfigurationPropertyItemsLong1.hashCode(), samlConfigurationPropertyItemsLong2.hashCode());
        System.assertEquals(samlConfigurationPropertyItemsLong3.hashCode(), samlConfigurationPropertyItemsLong4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSamlConfigurationPropertyItemsLon samlConfigurationPropertyItemsLong = new OASSamlConfigurationPropertyItemsLon();
        Map<String, String> propertyMappings = samlConfigurationPropertyItemsLong.getPropertyMappings();
        System.assertEquals('isSet', propertyMappings.get('is_set'));
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}

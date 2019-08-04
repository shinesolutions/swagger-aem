@isTest
private class OASSamlConfigurationInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASSamlConfigurationInfo samlConfigurationInfo1 = OASSamlConfigurationInfo.getExample();
        OASSamlConfigurationInfo samlConfigurationInfo2 = samlConfigurationInfo1;
        OASSamlConfigurationInfo samlConfigurationInfo3 = new OASSamlConfigurationInfo();
        OASSamlConfigurationInfo samlConfigurationInfo4 = samlConfigurationInfo3;

        System.assert(samlConfigurationInfo1.equals(samlConfigurationInfo2));
        System.assert(samlConfigurationInfo2.equals(samlConfigurationInfo1));
        System.assert(samlConfigurationInfo1.equals(samlConfigurationInfo1));
        System.assert(samlConfigurationInfo3.equals(samlConfigurationInfo4));
        System.assert(samlConfigurationInfo4.equals(samlConfigurationInfo3));
        System.assert(samlConfigurationInfo3.equals(samlConfigurationInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSamlConfigurationInfo samlConfigurationInfo1 = OASSamlConfigurationInfo.getExample();
        OASSamlConfigurationInfo samlConfigurationInfo2 = OASSamlConfigurationInfo.getExample();
        OASSamlConfigurationInfo samlConfigurationInfo3 = new OASSamlConfigurationInfo();
        OASSamlConfigurationInfo samlConfigurationInfo4 = new OASSamlConfigurationInfo();

        System.assert(samlConfigurationInfo1.equals(samlConfigurationInfo2));
        System.assert(samlConfigurationInfo2.equals(samlConfigurationInfo1));
        System.assert(samlConfigurationInfo3.equals(samlConfigurationInfo4));
        System.assert(samlConfigurationInfo4.equals(samlConfigurationInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSamlConfigurationInfo samlConfigurationInfo1 = OASSamlConfigurationInfo.getExample();
        OASSamlConfigurationInfo samlConfigurationInfo2 = new OASSamlConfigurationInfo();

        System.assertEquals(false, samlConfigurationInfo1.equals('foo'));
        System.assertEquals(false, samlConfigurationInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSamlConfigurationInfo samlConfigurationInfo1 = OASSamlConfigurationInfo.getExample();
        OASSamlConfigurationInfo samlConfigurationInfo2 = new OASSamlConfigurationInfo();
        OASSamlConfigurationInfo samlConfigurationInfo3;

        System.assertEquals(false, samlConfigurationInfo1.equals(samlConfigurationInfo3));
        System.assertEquals(false, samlConfigurationInfo2.equals(samlConfigurationInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSamlConfigurationInfo samlConfigurationInfo1 = OASSamlConfigurationInfo.getExample();
        OASSamlConfigurationInfo samlConfigurationInfo2 = new OASSamlConfigurationInfo();

        System.assertEquals(samlConfigurationInfo1.hashCode(), samlConfigurationInfo1.hashCode());
        System.assertEquals(samlConfigurationInfo2.hashCode(), samlConfigurationInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSamlConfigurationInfo samlConfigurationInfo1 = OASSamlConfigurationInfo.getExample();
        OASSamlConfigurationInfo samlConfigurationInfo2 = OASSamlConfigurationInfo.getExample();
        OASSamlConfigurationInfo samlConfigurationInfo3 = new OASSamlConfigurationInfo();
        OASSamlConfigurationInfo samlConfigurationInfo4 = new OASSamlConfigurationInfo();

        System.assert(samlConfigurationInfo1.equals(samlConfigurationInfo2));
        System.assert(samlConfigurationInfo3.equals(samlConfigurationInfo4));
        System.assertEquals(samlConfigurationInfo1.hashCode(), samlConfigurationInfo2.hashCode());
        System.assertEquals(samlConfigurationInfo3.hashCode(), samlConfigurationInfo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSamlConfigurationInfo samlConfigurationInfo = new OASSamlConfigurationInfo();
        Map<String, String> propertyMappings = samlConfigurationInfo.getPropertyMappings();
        System.assertEquals('bundleLocation', propertyMappings.get('bundle_location'));
        System.assertEquals('serviceLocation', propertyMappings.get('service_location'));
    }
}

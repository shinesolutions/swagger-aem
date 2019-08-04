@isTest
private class OASSamlConfigurationPropertiesTest {
    @isTest
    private static void equalsSameInstance() {
        OASSamlConfigurationProperties samlConfigurationProperties1 = OASSamlConfigurationProperties.getExample();
        OASSamlConfigurationProperties samlConfigurationProperties2 = samlConfigurationProperties1;
        OASSamlConfigurationProperties samlConfigurationProperties3 = new OASSamlConfigurationProperties();
        OASSamlConfigurationProperties samlConfigurationProperties4 = samlConfigurationProperties3;

        System.assert(samlConfigurationProperties1.equals(samlConfigurationProperties2));
        System.assert(samlConfigurationProperties2.equals(samlConfigurationProperties1));
        System.assert(samlConfigurationProperties1.equals(samlConfigurationProperties1));
        System.assert(samlConfigurationProperties3.equals(samlConfigurationProperties4));
        System.assert(samlConfigurationProperties4.equals(samlConfigurationProperties3));
        System.assert(samlConfigurationProperties3.equals(samlConfigurationProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSamlConfigurationProperties samlConfigurationProperties1 = OASSamlConfigurationProperties.getExample();
        OASSamlConfigurationProperties samlConfigurationProperties2 = OASSamlConfigurationProperties.getExample();
        OASSamlConfigurationProperties samlConfigurationProperties3 = new OASSamlConfigurationProperties();
        OASSamlConfigurationProperties samlConfigurationProperties4 = new OASSamlConfigurationProperties();

        System.assert(samlConfigurationProperties1.equals(samlConfigurationProperties2));
        System.assert(samlConfigurationProperties2.equals(samlConfigurationProperties1));
        System.assert(samlConfigurationProperties3.equals(samlConfigurationProperties4));
        System.assert(samlConfigurationProperties4.equals(samlConfigurationProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSamlConfigurationProperties samlConfigurationProperties1 = OASSamlConfigurationProperties.getExample();
        OASSamlConfigurationProperties samlConfigurationProperties2 = new OASSamlConfigurationProperties();

        System.assertEquals(false, samlConfigurationProperties1.equals('foo'));
        System.assertEquals(false, samlConfigurationProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSamlConfigurationProperties samlConfigurationProperties1 = OASSamlConfigurationProperties.getExample();
        OASSamlConfigurationProperties samlConfigurationProperties2 = new OASSamlConfigurationProperties();
        OASSamlConfigurationProperties samlConfigurationProperties3;

        System.assertEquals(false, samlConfigurationProperties1.equals(samlConfigurationProperties3));
        System.assertEquals(false, samlConfigurationProperties2.equals(samlConfigurationProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSamlConfigurationProperties samlConfigurationProperties1 = OASSamlConfigurationProperties.getExample();
        OASSamlConfigurationProperties samlConfigurationProperties2 = new OASSamlConfigurationProperties();

        System.assertEquals(samlConfigurationProperties1.hashCode(), samlConfigurationProperties1.hashCode());
        System.assertEquals(samlConfigurationProperties2.hashCode(), samlConfigurationProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSamlConfigurationProperties samlConfigurationProperties1 = OASSamlConfigurationProperties.getExample();
        OASSamlConfigurationProperties samlConfigurationProperties2 = OASSamlConfigurationProperties.getExample();
        OASSamlConfigurationProperties samlConfigurationProperties3 = new OASSamlConfigurationProperties();
        OASSamlConfigurationProperties samlConfigurationProperties4 = new OASSamlConfigurationProperties();

        System.assert(samlConfigurationProperties1.equals(samlConfigurationProperties2));
        System.assert(samlConfigurationProperties3.equals(samlConfigurationProperties4));
        System.assertEquals(samlConfigurationProperties1.hashCode(), samlConfigurationProperties2.hashCode());
        System.assertEquals(samlConfigurationProperties3.hashCode(), samlConfigurationProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSamlConfigurationProperties samlConfigurationProperties = new OASSamlConfigurationProperties();
        Map<String, String> propertyMappings = samlConfigurationProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
    }
}

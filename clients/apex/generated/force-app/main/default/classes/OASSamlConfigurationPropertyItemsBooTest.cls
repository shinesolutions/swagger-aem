@isTest
private class OASSamlConfigurationPropertyItemsBooTest {
    @isTest
    private static void equalsSameInstance() {
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean1 = OASSamlConfigurationPropertyItemsBoo.getExample();
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean2 = samlConfigurationPropertyItemsBoolean1;
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean3 = new OASSamlConfigurationPropertyItemsBoo();
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean4 = samlConfigurationPropertyItemsBoolean3;

        System.assert(samlConfigurationPropertyItemsBoolean1.equals(samlConfigurationPropertyItemsBoolean2));
        System.assert(samlConfigurationPropertyItemsBoolean2.equals(samlConfigurationPropertyItemsBoolean1));
        System.assert(samlConfigurationPropertyItemsBoolean1.equals(samlConfigurationPropertyItemsBoolean1));
        System.assert(samlConfigurationPropertyItemsBoolean3.equals(samlConfigurationPropertyItemsBoolean4));
        System.assert(samlConfigurationPropertyItemsBoolean4.equals(samlConfigurationPropertyItemsBoolean3));
        System.assert(samlConfigurationPropertyItemsBoolean3.equals(samlConfigurationPropertyItemsBoolean3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean1 = OASSamlConfigurationPropertyItemsBoo.getExample();
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean2 = OASSamlConfigurationPropertyItemsBoo.getExample();
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean3 = new OASSamlConfigurationPropertyItemsBoo();
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean4 = new OASSamlConfigurationPropertyItemsBoo();

        System.assert(samlConfigurationPropertyItemsBoolean1.equals(samlConfigurationPropertyItemsBoolean2));
        System.assert(samlConfigurationPropertyItemsBoolean2.equals(samlConfigurationPropertyItemsBoolean1));
        System.assert(samlConfigurationPropertyItemsBoolean3.equals(samlConfigurationPropertyItemsBoolean4));
        System.assert(samlConfigurationPropertyItemsBoolean4.equals(samlConfigurationPropertyItemsBoolean3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean1 = OASSamlConfigurationPropertyItemsBoo.getExample();
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean2 = new OASSamlConfigurationPropertyItemsBoo();

        System.assertEquals(false, samlConfigurationPropertyItemsBoolean1.equals('foo'));
        System.assertEquals(false, samlConfigurationPropertyItemsBoolean2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean1 = OASSamlConfigurationPropertyItemsBoo.getExample();
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean2 = new OASSamlConfigurationPropertyItemsBoo();
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean3;

        System.assertEquals(false, samlConfigurationPropertyItemsBoolean1.equals(samlConfigurationPropertyItemsBoolean3));
        System.assertEquals(false, samlConfigurationPropertyItemsBoolean2.equals(samlConfigurationPropertyItemsBoolean3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean1 = OASSamlConfigurationPropertyItemsBoo.getExample();
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean2 = new OASSamlConfigurationPropertyItemsBoo();

        System.assertEquals(samlConfigurationPropertyItemsBoolean1.hashCode(), samlConfigurationPropertyItemsBoolean1.hashCode());
        System.assertEquals(samlConfigurationPropertyItemsBoolean2.hashCode(), samlConfigurationPropertyItemsBoolean2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean1 = OASSamlConfigurationPropertyItemsBoo.getExample();
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean2 = OASSamlConfigurationPropertyItemsBoo.getExample();
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean3 = new OASSamlConfigurationPropertyItemsBoo();
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean4 = new OASSamlConfigurationPropertyItemsBoo();

        System.assert(samlConfigurationPropertyItemsBoolean1.equals(samlConfigurationPropertyItemsBoolean2));
        System.assert(samlConfigurationPropertyItemsBoolean3.equals(samlConfigurationPropertyItemsBoolean4));
        System.assertEquals(samlConfigurationPropertyItemsBoolean1.hashCode(), samlConfigurationPropertyItemsBoolean2.hashCode());
        System.assertEquals(samlConfigurationPropertyItemsBoolean3.hashCode(), samlConfigurationPropertyItemsBoolean4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSamlConfigurationPropertyItemsBoo samlConfigurationPropertyItemsBoolean = new OASSamlConfigurationPropertyItemsBoo();
        Map<String, String> propertyMappings = samlConfigurationPropertyItemsBoolean.getPropertyMappings();
        System.assertEquals('isSet', propertyMappings.get('is_set'));
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}

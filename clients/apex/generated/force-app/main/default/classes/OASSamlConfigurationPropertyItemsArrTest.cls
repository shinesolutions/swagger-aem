@isTest
private class OASSamlConfigurationPropertyItemsArrTest {
    @isTest
    private static void equalsSameInstance() {
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray1 = OASSamlConfigurationPropertyItemsArr.getExample();
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray2 = samlConfigurationPropertyItemsArray1;
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray3 = new OASSamlConfigurationPropertyItemsArr();
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray4 = samlConfigurationPropertyItemsArray3;

        System.assert(samlConfigurationPropertyItemsArray1.equals(samlConfigurationPropertyItemsArray2));
        System.assert(samlConfigurationPropertyItemsArray2.equals(samlConfigurationPropertyItemsArray1));
        System.assert(samlConfigurationPropertyItemsArray1.equals(samlConfigurationPropertyItemsArray1));
        System.assert(samlConfigurationPropertyItemsArray3.equals(samlConfigurationPropertyItemsArray4));
        System.assert(samlConfigurationPropertyItemsArray4.equals(samlConfigurationPropertyItemsArray3));
        System.assert(samlConfigurationPropertyItemsArray3.equals(samlConfigurationPropertyItemsArray3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray1 = OASSamlConfigurationPropertyItemsArr.getExample();
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray2 = OASSamlConfigurationPropertyItemsArr.getExample();
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray3 = new OASSamlConfigurationPropertyItemsArr();
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray4 = new OASSamlConfigurationPropertyItemsArr();

        System.assert(samlConfigurationPropertyItemsArray1.equals(samlConfigurationPropertyItemsArray2));
        System.assert(samlConfigurationPropertyItemsArray2.equals(samlConfigurationPropertyItemsArray1));
        System.assert(samlConfigurationPropertyItemsArray3.equals(samlConfigurationPropertyItemsArray4));
        System.assert(samlConfigurationPropertyItemsArray4.equals(samlConfigurationPropertyItemsArray3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray1 = OASSamlConfigurationPropertyItemsArr.getExample();
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray2 = new OASSamlConfigurationPropertyItemsArr();

        System.assertEquals(false, samlConfigurationPropertyItemsArray1.equals('foo'));
        System.assertEquals(false, samlConfigurationPropertyItemsArray2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray1 = OASSamlConfigurationPropertyItemsArr.getExample();
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray2 = new OASSamlConfigurationPropertyItemsArr();
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray3;

        System.assertEquals(false, samlConfigurationPropertyItemsArray1.equals(samlConfigurationPropertyItemsArray3));
        System.assertEquals(false, samlConfigurationPropertyItemsArray2.equals(samlConfigurationPropertyItemsArray3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray1 = OASSamlConfigurationPropertyItemsArr.getExample();
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray2 = new OASSamlConfigurationPropertyItemsArr();

        System.assertEquals(samlConfigurationPropertyItemsArray1.hashCode(), samlConfigurationPropertyItemsArray1.hashCode());
        System.assertEquals(samlConfigurationPropertyItemsArray2.hashCode(), samlConfigurationPropertyItemsArray2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray1 = OASSamlConfigurationPropertyItemsArr.getExample();
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray2 = OASSamlConfigurationPropertyItemsArr.getExample();
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray3 = new OASSamlConfigurationPropertyItemsArr();
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray4 = new OASSamlConfigurationPropertyItemsArr();

        System.assert(samlConfigurationPropertyItemsArray1.equals(samlConfigurationPropertyItemsArray2));
        System.assert(samlConfigurationPropertyItemsArray3.equals(samlConfigurationPropertyItemsArray4));
        System.assertEquals(samlConfigurationPropertyItemsArray1.hashCode(), samlConfigurationPropertyItemsArray2.hashCode());
        System.assertEquals(samlConfigurationPropertyItemsArray3.hashCode(), samlConfigurationPropertyItemsArray4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray = new OASSamlConfigurationPropertyItemsArr();
        Map<String, String> propertyMappings = samlConfigurationPropertyItemsArray.getPropertyMappings();
        System.assertEquals('isSet', propertyMappings.get('is_set'));
        System.assertEquals('r_type', propertyMappings.get('type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSamlConfigurationPropertyItemsArr samlConfigurationPropertyItemsArray = new OASSamlConfigurationPropertyItemsArr();
        System.assertEquals(new List<String>(), samlConfigurationPropertyItemsArray.values);
        System.assertEquals(null, samlConfigurationPropertyItemsArray.name);
        System.assertEquals(null, samlConfigurationPropertyItemsArray.optional);
        System.assertEquals(null, samlConfigurationPropertyItemsArray.isSet);
        System.assertEquals(null, samlConfigurationPropertyItemsArray.r_type);
        System.assertEquals(null, samlConfigurationPropertyItemsArray.description);
    }
}

@isTest
private class OASKeystoreItemsTest {
    @isTest
    private static void equalsSameInstance() {
        OASKeystoreItems keystoreItems1 = OASKeystoreItems.getExample();
        OASKeystoreItems keystoreItems2 = keystoreItems1;
        OASKeystoreItems keystoreItems3 = new OASKeystoreItems();
        OASKeystoreItems keystoreItems4 = keystoreItems3;

        System.assert(keystoreItems1.equals(keystoreItems2));
        System.assert(keystoreItems2.equals(keystoreItems1));
        System.assert(keystoreItems1.equals(keystoreItems1));
        System.assert(keystoreItems3.equals(keystoreItems4));
        System.assert(keystoreItems4.equals(keystoreItems3));
        System.assert(keystoreItems3.equals(keystoreItems3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASKeystoreItems keystoreItems1 = OASKeystoreItems.getExample();
        OASKeystoreItems keystoreItems2 = OASKeystoreItems.getExample();
        OASKeystoreItems keystoreItems3 = new OASKeystoreItems();
        OASKeystoreItems keystoreItems4 = new OASKeystoreItems();

        System.assert(keystoreItems1.equals(keystoreItems2));
        System.assert(keystoreItems2.equals(keystoreItems1));
        System.assert(keystoreItems3.equals(keystoreItems4));
        System.assert(keystoreItems4.equals(keystoreItems3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASKeystoreItems keystoreItems1 = OASKeystoreItems.getExample();
        OASKeystoreItems keystoreItems2 = new OASKeystoreItems();

        System.assertEquals(false, keystoreItems1.equals('foo'));
        System.assertEquals(false, keystoreItems2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASKeystoreItems keystoreItems1 = OASKeystoreItems.getExample();
        OASKeystoreItems keystoreItems2 = new OASKeystoreItems();
        OASKeystoreItems keystoreItems3;

        System.assertEquals(false, keystoreItems1.equals(keystoreItems3));
        System.assertEquals(false, keystoreItems2.equals(keystoreItems3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASKeystoreItems keystoreItems1 = OASKeystoreItems.getExample();
        OASKeystoreItems keystoreItems2 = new OASKeystoreItems();

        System.assertEquals(keystoreItems1.hashCode(), keystoreItems1.hashCode());
        System.assertEquals(keystoreItems2.hashCode(), keystoreItems2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASKeystoreItems keystoreItems1 = OASKeystoreItems.getExample();
        OASKeystoreItems keystoreItems2 = OASKeystoreItems.getExample();
        OASKeystoreItems keystoreItems3 = new OASKeystoreItems();
        OASKeystoreItems keystoreItems4 = new OASKeystoreItems();

        System.assert(keystoreItems1.equals(keystoreItems2));
        System.assert(keystoreItems3.equals(keystoreItems4));
        System.assertEquals(keystoreItems1.hashCode(), keystoreItems2.hashCode());
        System.assertEquals(keystoreItems3.hashCode(), keystoreItems4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASKeystoreItems keystoreItems = new OASKeystoreItems();
        System.assertEquals(new List<OASKeystoreChainItems>(), keystoreItems.chain);
        System.assertEquals(null, keystoreItems.alias);
        System.assertEquals(null, keystoreItems.entryType);
        System.assertEquals(null, keystoreItems.algorithm);
        System.assertEquals(null, keystoreItems.format);
    }
}

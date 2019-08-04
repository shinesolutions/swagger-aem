@isTest
private class OASKeystoreChainItemsTest {
    @isTest
    private static void equalsSameInstance() {
        OASKeystoreChainItems keystoreChainItems1 = OASKeystoreChainItems.getExample();
        OASKeystoreChainItems keystoreChainItems2 = keystoreChainItems1;
        OASKeystoreChainItems keystoreChainItems3 = new OASKeystoreChainItems();
        OASKeystoreChainItems keystoreChainItems4 = keystoreChainItems3;

        System.assert(keystoreChainItems1.equals(keystoreChainItems2));
        System.assert(keystoreChainItems2.equals(keystoreChainItems1));
        System.assert(keystoreChainItems1.equals(keystoreChainItems1));
        System.assert(keystoreChainItems3.equals(keystoreChainItems4));
        System.assert(keystoreChainItems4.equals(keystoreChainItems3));
        System.assert(keystoreChainItems3.equals(keystoreChainItems3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASKeystoreChainItems keystoreChainItems1 = OASKeystoreChainItems.getExample();
        OASKeystoreChainItems keystoreChainItems2 = OASKeystoreChainItems.getExample();
        OASKeystoreChainItems keystoreChainItems3 = new OASKeystoreChainItems();
        OASKeystoreChainItems keystoreChainItems4 = new OASKeystoreChainItems();

        System.assert(keystoreChainItems1.equals(keystoreChainItems2));
        System.assert(keystoreChainItems2.equals(keystoreChainItems1));
        System.assert(keystoreChainItems3.equals(keystoreChainItems4));
        System.assert(keystoreChainItems4.equals(keystoreChainItems3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASKeystoreChainItems keystoreChainItems1 = OASKeystoreChainItems.getExample();
        OASKeystoreChainItems keystoreChainItems2 = new OASKeystoreChainItems();

        System.assertEquals(false, keystoreChainItems1.equals('foo'));
        System.assertEquals(false, keystoreChainItems2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASKeystoreChainItems keystoreChainItems1 = OASKeystoreChainItems.getExample();
        OASKeystoreChainItems keystoreChainItems2 = new OASKeystoreChainItems();
        OASKeystoreChainItems keystoreChainItems3;

        System.assertEquals(false, keystoreChainItems1.equals(keystoreChainItems3));
        System.assertEquals(false, keystoreChainItems2.equals(keystoreChainItems3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASKeystoreChainItems keystoreChainItems1 = OASKeystoreChainItems.getExample();
        OASKeystoreChainItems keystoreChainItems2 = new OASKeystoreChainItems();

        System.assertEquals(keystoreChainItems1.hashCode(), keystoreChainItems1.hashCode());
        System.assertEquals(keystoreChainItems2.hashCode(), keystoreChainItems2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASKeystoreChainItems keystoreChainItems1 = OASKeystoreChainItems.getExample();
        OASKeystoreChainItems keystoreChainItems2 = OASKeystoreChainItems.getExample();
        OASKeystoreChainItems keystoreChainItems3 = new OASKeystoreChainItems();
        OASKeystoreChainItems keystoreChainItems4 = new OASKeystoreChainItems();

        System.assert(keystoreChainItems1.equals(keystoreChainItems2));
        System.assert(keystoreChainItems3.equals(keystoreChainItems4));
        System.assertEquals(keystoreChainItems1.hashCode(), keystoreChainItems2.hashCode());
        System.assertEquals(keystoreChainItems3.hashCode(), keystoreChainItems4.hashCode());
    }
}

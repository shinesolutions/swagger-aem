@isTest
private class OASTruststoreItemsTest {
    @isTest
    private static void equalsSameInstance() {
        OASTruststoreItems truststoreItems1 = OASTruststoreItems.getExample();
        OASTruststoreItems truststoreItems2 = truststoreItems1;
        OASTruststoreItems truststoreItems3 = new OASTruststoreItems();
        OASTruststoreItems truststoreItems4 = truststoreItems3;

        System.assert(truststoreItems1.equals(truststoreItems2));
        System.assert(truststoreItems2.equals(truststoreItems1));
        System.assert(truststoreItems1.equals(truststoreItems1));
        System.assert(truststoreItems3.equals(truststoreItems4));
        System.assert(truststoreItems4.equals(truststoreItems3));
        System.assert(truststoreItems3.equals(truststoreItems3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTruststoreItems truststoreItems1 = OASTruststoreItems.getExample();
        OASTruststoreItems truststoreItems2 = OASTruststoreItems.getExample();
        OASTruststoreItems truststoreItems3 = new OASTruststoreItems();
        OASTruststoreItems truststoreItems4 = new OASTruststoreItems();

        System.assert(truststoreItems1.equals(truststoreItems2));
        System.assert(truststoreItems2.equals(truststoreItems1));
        System.assert(truststoreItems3.equals(truststoreItems4));
        System.assert(truststoreItems4.equals(truststoreItems3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTruststoreItems truststoreItems1 = OASTruststoreItems.getExample();
        OASTruststoreItems truststoreItems2 = new OASTruststoreItems();

        System.assertEquals(false, truststoreItems1.equals('foo'));
        System.assertEquals(false, truststoreItems2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTruststoreItems truststoreItems1 = OASTruststoreItems.getExample();
        OASTruststoreItems truststoreItems2 = new OASTruststoreItems();
        OASTruststoreItems truststoreItems3;

        System.assertEquals(false, truststoreItems1.equals(truststoreItems3));
        System.assertEquals(false, truststoreItems2.equals(truststoreItems3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTruststoreItems truststoreItems1 = OASTruststoreItems.getExample();
        OASTruststoreItems truststoreItems2 = new OASTruststoreItems();

        System.assertEquals(truststoreItems1.hashCode(), truststoreItems1.hashCode());
        System.assertEquals(truststoreItems2.hashCode(), truststoreItems2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTruststoreItems truststoreItems1 = OASTruststoreItems.getExample();
        OASTruststoreItems truststoreItems2 = OASTruststoreItems.getExample();
        OASTruststoreItems truststoreItems3 = new OASTruststoreItems();
        OASTruststoreItems truststoreItems4 = new OASTruststoreItems();

        System.assert(truststoreItems1.equals(truststoreItems2));
        System.assert(truststoreItems3.equals(truststoreItems4));
        System.assertEquals(truststoreItems1.hashCode(), truststoreItems2.hashCode());
        System.assertEquals(truststoreItems3.hashCode(), truststoreItems4.hashCode());
    }
}

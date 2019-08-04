@isTest
private class OASTruststoreInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASTruststoreInfo truststoreInfo1 = OASTruststoreInfo.getExample();
        OASTruststoreInfo truststoreInfo2 = truststoreInfo1;
        OASTruststoreInfo truststoreInfo3 = new OASTruststoreInfo();
        OASTruststoreInfo truststoreInfo4 = truststoreInfo3;

        System.assert(truststoreInfo1.equals(truststoreInfo2));
        System.assert(truststoreInfo2.equals(truststoreInfo1));
        System.assert(truststoreInfo1.equals(truststoreInfo1));
        System.assert(truststoreInfo3.equals(truststoreInfo4));
        System.assert(truststoreInfo4.equals(truststoreInfo3));
        System.assert(truststoreInfo3.equals(truststoreInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTruststoreInfo truststoreInfo1 = OASTruststoreInfo.getExample();
        OASTruststoreInfo truststoreInfo2 = OASTruststoreInfo.getExample();
        OASTruststoreInfo truststoreInfo3 = new OASTruststoreInfo();
        OASTruststoreInfo truststoreInfo4 = new OASTruststoreInfo();

        System.assert(truststoreInfo1.equals(truststoreInfo2));
        System.assert(truststoreInfo2.equals(truststoreInfo1));
        System.assert(truststoreInfo3.equals(truststoreInfo4));
        System.assert(truststoreInfo4.equals(truststoreInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTruststoreInfo truststoreInfo1 = OASTruststoreInfo.getExample();
        OASTruststoreInfo truststoreInfo2 = new OASTruststoreInfo();

        System.assertEquals(false, truststoreInfo1.equals('foo'));
        System.assertEquals(false, truststoreInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTruststoreInfo truststoreInfo1 = OASTruststoreInfo.getExample();
        OASTruststoreInfo truststoreInfo2 = new OASTruststoreInfo();
        OASTruststoreInfo truststoreInfo3;

        System.assertEquals(false, truststoreInfo1.equals(truststoreInfo3));
        System.assertEquals(false, truststoreInfo2.equals(truststoreInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTruststoreInfo truststoreInfo1 = OASTruststoreInfo.getExample();
        OASTruststoreInfo truststoreInfo2 = new OASTruststoreInfo();

        System.assertEquals(truststoreInfo1.hashCode(), truststoreInfo1.hashCode());
        System.assertEquals(truststoreInfo2.hashCode(), truststoreInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTruststoreInfo truststoreInfo1 = OASTruststoreInfo.getExample();
        OASTruststoreInfo truststoreInfo2 = OASTruststoreInfo.getExample();
        OASTruststoreInfo truststoreInfo3 = new OASTruststoreInfo();
        OASTruststoreInfo truststoreInfo4 = new OASTruststoreInfo();

        System.assert(truststoreInfo1.equals(truststoreInfo2));
        System.assert(truststoreInfo3.equals(truststoreInfo4));
        System.assertEquals(truststoreInfo1.hashCode(), truststoreInfo2.hashCode());
        System.assertEquals(truststoreInfo3.hashCode(), truststoreInfo4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTruststoreInfo truststoreInfo = new OASTruststoreInfo();
        System.assertEquals(new List<OASTruststoreItems>(), truststoreInfo.aliases);
        System.assertEquals(null, truststoreInfo.exists);
    }
}

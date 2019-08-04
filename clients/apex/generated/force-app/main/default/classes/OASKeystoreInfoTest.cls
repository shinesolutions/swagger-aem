@isTest
private class OASKeystoreInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASKeystoreInfo keystoreInfo1 = OASKeystoreInfo.getExample();
        OASKeystoreInfo keystoreInfo2 = keystoreInfo1;
        OASKeystoreInfo keystoreInfo3 = new OASKeystoreInfo();
        OASKeystoreInfo keystoreInfo4 = keystoreInfo3;

        System.assert(keystoreInfo1.equals(keystoreInfo2));
        System.assert(keystoreInfo2.equals(keystoreInfo1));
        System.assert(keystoreInfo1.equals(keystoreInfo1));
        System.assert(keystoreInfo3.equals(keystoreInfo4));
        System.assert(keystoreInfo4.equals(keystoreInfo3));
        System.assert(keystoreInfo3.equals(keystoreInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASKeystoreInfo keystoreInfo1 = OASKeystoreInfo.getExample();
        OASKeystoreInfo keystoreInfo2 = OASKeystoreInfo.getExample();
        OASKeystoreInfo keystoreInfo3 = new OASKeystoreInfo();
        OASKeystoreInfo keystoreInfo4 = new OASKeystoreInfo();

        System.assert(keystoreInfo1.equals(keystoreInfo2));
        System.assert(keystoreInfo2.equals(keystoreInfo1));
        System.assert(keystoreInfo3.equals(keystoreInfo4));
        System.assert(keystoreInfo4.equals(keystoreInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASKeystoreInfo keystoreInfo1 = OASKeystoreInfo.getExample();
        OASKeystoreInfo keystoreInfo2 = new OASKeystoreInfo();

        System.assertEquals(false, keystoreInfo1.equals('foo'));
        System.assertEquals(false, keystoreInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASKeystoreInfo keystoreInfo1 = OASKeystoreInfo.getExample();
        OASKeystoreInfo keystoreInfo2 = new OASKeystoreInfo();
        OASKeystoreInfo keystoreInfo3;

        System.assertEquals(false, keystoreInfo1.equals(keystoreInfo3));
        System.assertEquals(false, keystoreInfo2.equals(keystoreInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASKeystoreInfo keystoreInfo1 = OASKeystoreInfo.getExample();
        OASKeystoreInfo keystoreInfo2 = new OASKeystoreInfo();

        System.assertEquals(keystoreInfo1.hashCode(), keystoreInfo1.hashCode());
        System.assertEquals(keystoreInfo2.hashCode(), keystoreInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASKeystoreInfo keystoreInfo1 = OASKeystoreInfo.getExample();
        OASKeystoreInfo keystoreInfo2 = OASKeystoreInfo.getExample();
        OASKeystoreInfo keystoreInfo3 = new OASKeystoreInfo();
        OASKeystoreInfo keystoreInfo4 = new OASKeystoreInfo();

        System.assert(keystoreInfo1.equals(keystoreInfo2));
        System.assert(keystoreInfo3.equals(keystoreInfo4));
        System.assertEquals(keystoreInfo1.hashCode(), keystoreInfo2.hashCode());
        System.assertEquals(keystoreInfo3.hashCode(), keystoreInfo4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASKeystoreInfo keystoreInfo = new OASKeystoreInfo();
        System.assertEquals(new List<OASKeystoreItems>(), keystoreInfo.aliases);
        System.assertEquals(null, keystoreInfo.exists);
    }
}

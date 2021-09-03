@isTest
private class OASBundleInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASBundleInfo bundleInfo1 = OASBundleInfo.getExample();
        OASBundleInfo bundleInfo2 = bundleInfo1;
        OASBundleInfo bundleInfo3 = new OASBundleInfo();
        OASBundleInfo bundleInfo4 = bundleInfo3;

        System.assert(bundleInfo1.equals(bundleInfo2));
        System.assert(bundleInfo2.equals(bundleInfo1));
        System.assert(bundleInfo1.equals(bundleInfo1));
        System.assert(bundleInfo3.equals(bundleInfo4));
        System.assert(bundleInfo4.equals(bundleInfo3));
        System.assert(bundleInfo3.equals(bundleInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBundleInfo bundleInfo1 = OASBundleInfo.getExample();
        OASBundleInfo bundleInfo2 = OASBundleInfo.getExample();
        OASBundleInfo bundleInfo3 = new OASBundleInfo();
        OASBundleInfo bundleInfo4 = new OASBundleInfo();

        System.assert(bundleInfo1.equals(bundleInfo2));
        System.assert(bundleInfo2.equals(bundleInfo1));
        System.assert(bundleInfo3.equals(bundleInfo4));
        System.assert(bundleInfo4.equals(bundleInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBundleInfo bundleInfo1 = OASBundleInfo.getExample();
        OASBundleInfo bundleInfo2 = new OASBundleInfo();

        System.assertEquals(false, bundleInfo1.equals('foo'));
        System.assertEquals(false, bundleInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBundleInfo bundleInfo1 = OASBundleInfo.getExample();
        OASBundleInfo bundleInfo2 = new OASBundleInfo();
        OASBundleInfo bundleInfo3;

        System.assertEquals(false, bundleInfo1.equals(bundleInfo3));
        System.assertEquals(false, bundleInfo2.equals(bundleInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBundleInfo bundleInfo1 = OASBundleInfo.getExample();
        OASBundleInfo bundleInfo2 = new OASBundleInfo();

        System.assertEquals(bundleInfo1.hashCode(), bundleInfo1.hashCode());
        System.assertEquals(bundleInfo2.hashCode(), bundleInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBundleInfo bundleInfo1 = OASBundleInfo.getExample();
        OASBundleInfo bundleInfo2 = OASBundleInfo.getExample();
        OASBundleInfo bundleInfo3 = new OASBundleInfo();
        OASBundleInfo bundleInfo4 = new OASBundleInfo();

        System.assert(bundleInfo1.equals(bundleInfo2));
        System.assert(bundleInfo3.equals(bundleInfo4));
        System.assertEquals(bundleInfo1.hashCode(), bundleInfo2.hashCode());
        System.assertEquals(bundleInfo3.hashCode(), bundleInfo4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBundleInfo bundleInfo = new OASBundleInfo();
        System.assertEquals(new List<Integer>(), bundleInfo.s);
        System.assertEquals(new List<OASBundleData>(), bundleInfo.data);
        System.assertEquals(null, bundleInfo.status);
    }
}

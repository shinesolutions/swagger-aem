@isTest
private class OASBundleDataPropTest {
    @isTest
    private static void equalsSameInstance() {
        OASBundleDataProp bundleDataProp1 = OASBundleDataProp.getExample();
        OASBundleDataProp bundleDataProp2 = bundleDataProp1;
        OASBundleDataProp bundleDataProp3 = new OASBundleDataProp();
        OASBundleDataProp bundleDataProp4 = bundleDataProp3;

        System.assert(bundleDataProp1.equals(bundleDataProp2));
        System.assert(bundleDataProp2.equals(bundleDataProp1));
        System.assert(bundleDataProp1.equals(bundleDataProp1));
        System.assert(bundleDataProp3.equals(bundleDataProp4));
        System.assert(bundleDataProp4.equals(bundleDataProp3));
        System.assert(bundleDataProp3.equals(bundleDataProp3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBundleDataProp bundleDataProp1 = OASBundleDataProp.getExample();
        OASBundleDataProp bundleDataProp2 = OASBundleDataProp.getExample();
        OASBundleDataProp bundleDataProp3 = new OASBundleDataProp();
        OASBundleDataProp bundleDataProp4 = new OASBundleDataProp();

        System.assert(bundleDataProp1.equals(bundleDataProp2));
        System.assert(bundleDataProp2.equals(bundleDataProp1));
        System.assert(bundleDataProp3.equals(bundleDataProp4));
        System.assert(bundleDataProp4.equals(bundleDataProp3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBundleDataProp bundleDataProp1 = OASBundleDataProp.getExample();
        OASBundleDataProp bundleDataProp2 = new OASBundleDataProp();

        System.assertEquals(false, bundleDataProp1.equals('foo'));
        System.assertEquals(false, bundleDataProp2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBundleDataProp bundleDataProp1 = OASBundleDataProp.getExample();
        OASBundleDataProp bundleDataProp2 = new OASBundleDataProp();
        OASBundleDataProp bundleDataProp3;

        System.assertEquals(false, bundleDataProp1.equals(bundleDataProp3));
        System.assertEquals(false, bundleDataProp2.equals(bundleDataProp3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBundleDataProp bundleDataProp1 = OASBundleDataProp.getExample();
        OASBundleDataProp bundleDataProp2 = new OASBundleDataProp();

        System.assertEquals(bundleDataProp1.hashCode(), bundleDataProp1.hashCode());
        System.assertEquals(bundleDataProp2.hashCode(), bundleDataProp2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBundleDataProp bundleDataProp1 = OASBundleDataProp.getExample();
        OASBundleDataProp bundleDataProp2 = OASBundleDataProp.getExample();
        OASBundleDataProp bundleDataProp3 = new OASBundleDataProp();
        OASBundleDataProp bundleDataProp4 = new OASBundleDataProp();

        System.assert(bundleDataProp1.equals(bundleDataProp2));
        System.assert(bundleDataProp3.equals(bundleDataProp4));
        System.assertEquals(bundleDataProp1.hashCode(), bundleDataProp2.hashCode());
        System.assertEquals(bundleDataProp3.hashCode(), bundleDataProp4.hashCode());
    }
}

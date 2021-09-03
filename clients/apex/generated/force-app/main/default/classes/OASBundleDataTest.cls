@isTest
private class OASBundleDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASBundleData bundleData1 = OASBundleData.getExample();
        OASBundleData bundleData2 = bundleData1;
        OASBundleData bundleData3 = new OASBundleData();
        OASBundleData bundleData4 = bundleData3;

        System.assert(bundleData1.equals(bundleData2));
        System.assert(bundleData2.equals(bundleData1));
        System.assert(bundleData1.equals(bundleData1));
        System.assert(bundleData3.equals(bundleData4));
        System.assert(bundleData4.equals(bundleData3));
        System.assert(bundleData3.equals(bundleData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBundleData bundleData1 = OASBundleData.getExample();
        OASBundleData bundleData2 = OASBundleData.getExample();
        OASBundleData bundleData3 = new OASBundleData();
        OASBundleData bundleData4 = new OASBundleData();

        System.assert(bundleData1.equals(bundleData2));
        System.assert(bundleData2.equals(bundleData1));
        System.assert(bundleData3.equals(bundleData4));
        System.assert(bundleData4.equals(bundleData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBundleData bundleData1 = OASBundleData.getExample();
        OASBundleData bundleData2 = new OASBundleData();

        System.assertEquals(false, bundleData1.equals('foo'));
        System.assertEquals(false, bundleData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBundleData bundleData1 = OASBundleData.getExample();
        OASBundleData bundleData2 = new OASBundleData();
        OASBundleData bundleData3;

        System.assertEquals(false, bundleData1.equals(bundleData3));
        System.assertEquals(false, bundleData2.equals(bundleData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBundleData bundleData1 = OASBundleData.getExample();
        OASBundleData bundleData2 = new OASBundleData();

        System.assertEquals(bundleData1.hashCode(), bundleData1.hashCode());
        System.assertEquals(bundleData2.hashCode(), bundleData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBundleData bundleData1 = OASBundleData.getExample();
        OASBundleData bundleData2 = OASBundleData.getExample();
        OASBundleData bundleData3 = new OASBundleData();
        OASBundleData bundleData4 = new OASBundleData();

        System.assert(bundleData1.equals(bundleData2));
        System.assert(bundleData3.equals(bundleData4));
        System.assertEquals(bundleData1.hashCode(), bundleData2.hashCode());
        System.assertEquals(bundleData3.hashCode(), bundleData4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBundleData bundleData = new OASBundleData();
        System.assertEquals(new List<OASBundleDataProp>(), bundleData.props);
        System.assertEquals(null, bundleData.id);
        System.assertEquals(null, bundleData.name);
        System.assertEquals(null, bundleData.fragment);
        System.assertEquals(null, bundleData.stateRaw);
        System.assertEquals(null, bundleData.state);
        System.assertEquals(null, bundleData.version);
        System.assertEquals(null, bundleData.symbolicName);
        System.assertEquals(null, bundleData.category);
    }
}

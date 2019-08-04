@isTest
private class OASInstallStatusTest {
    @isTest
    private static void equalsSameInstance() {
        OASInstallStatus installStatus1 = OASInstallStatus.getExample();
        OASInstallStatus installStatus2 = installStatus1;
        OASInstallStatus installStatus3 = new OASInstallStatus();
        OASInstallStatus installStatus4 = installStatus3;

        System.assert(installStatus1.equals(installStatus2));
        System.assert(installStatus2.equals(installStatus1));
        System.assert(installStatus1.equals(installStatus1));
        System.assert(installStatus3.equals(installStatus4));
        System.assert(installStatus4.equals(installStatus3));
        System.assert(installStatus3.equals(installStatus3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInstallStatus installStatus1 = OASInstallStatus.getExample();
        OASInstallStatus installStatus2 = OASInstallStatus.getExample();
        OASInstallStatus installStatus3 = new OASInstallStatus();
        OASInstallStatus installStatus4 = new OASInstallStatus();

        System.assert(installStatus1.equals(installStatus2));
        System.assert(installStatus2.equals(installStatus1));
        System.assert(installStatus3.equals(installStatus4));
        System.assert(installStatus4.equals(installStatus3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInstallStatus installStatus1 = OASInstallStatus.getExample();
        OASInstallStatus installStatus2 = new OASInstallStatus();

        System.assertEquals(false, installStatus1.equals('foo'));
        System.assertEquals(false, installStatus2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInstallStatus installStatus1 = OASInstallStatus.getExample();
        OASInstallStatus installStatus2 = new OASInstallStatus();
        OASInstallStatus installStatus3;

        System.assertEquals(false, installStatus1.equals(installStatus3));
        System.assertEquals(false, installStatus2.equals(installStatus3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInstallStatus installStatus1 = OASInstallStatus.getExample();
        OASInstallStatus installStatus2 = new OASInstallStatus();

        System.assertEquals(installStatus1.hashCode(), installStatus1.hashCode());
        System.assertEquals(installStatus2.hashCode(), installStatus2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInstallStatus installStatus1 = OASInstallStatus.getExample();
        OASInstallStatus installStatus2 = OASInstallStatus.getExample();
        OASInstallStatus installStatus3 = new OASInstallStatus();
        OASInstallStatus installStatus4 = new OASInstallStatus();

        System.assert(installStatus1.equals(installStatus2));
        System.assert(installStatus3.equals(installStatus4));
        System.assertEquals(installStatus1.hashCode(), installStatus2.hashCode());
        System.assertEquals(installStatus3.hashCode(), installStatus4.hashCode());
    }
}

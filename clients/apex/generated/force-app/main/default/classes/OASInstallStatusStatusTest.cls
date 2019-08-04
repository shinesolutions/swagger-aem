@isTest
private class OASInstallStatusStatusTest {
    @isTest
    private static void equalsSameInstance() {
        OASInstallStatusStatus installStatusStatus1 = OASInstallStatusStatus.getExample();
        OASInstallStatusStatus installStatusStatus2 = installStatusStatus1;
        OASInstallStatusStatus installStatusStatus3 = new OASInstallStatusStatus();
        OASInstallStatusStatus installStatusStatus4 = installStatusStatus3;

        System.assert(installStatusStatus1.equals(installStatusStatus2));
        System.assert(installStatusStatus2.equals(installStatusStatus1));
        System.assert(installStatusStatus1.equals(installStatusStatus1));
        System.assert(installStatusStatus3.equals(installStatusStatus4));
        System.assert(installStatusStatus4.equals(installStatusStatus3));
        System.assert(installStatusStatus3.equals(installStatusStatus3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInstallStatusStatus installStatusStatus1 = OASInstallStatusStatus.getExample();
        OASInstallStatusStatus installStatusStatus2 = OASInstallStatusStatus.getExample();
        OASInstallStatusStatus installStatusStatus3 = new OASInstallStatusStatus();
        OASInstallStatusStatus installStatusStatus4 = new OASInstallStatusStatus();

        System.assert(installStatusStatus1.equals(installStatusStatus2));
        System.assert(installStatusStatus2.equals(installStatusStatus1));
        System.assert(installStatusStatus3.equals(installStatusStatus4));
        System.assert(installStatusStatus4.equals(installStatusStatus3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInstallStatusStatus installStatusStatus1 = OASInstallStatusStatus.getExample();
        OASInstallStatusStatus installStatusStatus2 = new OASInstallStatusStatus();

        System.assertEquals(false, installStatusStatus1.equals('foo'));
        System.assertEquals(false, installStatusStatus2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInstallStatusStatus installStatusStatus1 = OASInstallStatusStatus.getExample();
        OASInstallStatusStatus installStatusStatus2 = new OASInstallStatusStatus();
        OASInstallStatusStatus installStatusStatus3;

        System.assertEquals(false, installStatusStatus1.equals(installStatusStatus3));
        System.assertEquals(false, installStatusStatus2.equals(installStatusStatus3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInstallStatusStatus installStatusStatus1 = OASInstallStatusStatus.getExample();
        OASInstallStatusStatus installStatusStatus2 = new OASInstallStatusStatus();

        System.assertEquals(installStatusStatus1.hashCode(), installStatusStatus1.hashCode());
        System.assertEquals(installStatusStatus2.hashCode(), installStatusStatus2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInstallStatusStatus installStatusStatus1 = OASInstallStatusStatus.getExample();
        OASInstallStatusStatus installStatusStatus2 = OASInstallStatusStatus.getExample();
        OASInstallStatusStatus installStatusStatus3 = new OASInstallStatusStatus();
        OASInstallStatusStatus installStatusStatus4 = new OASInstallStatusStatus();

        System.assert(installStatusStatus1.equals(installStatusStatus2));
        System.assert(installStatusStatus3.equals(installStatusStatus4));
        System.assertEquals(installStatusStatus1.hashCode(), installStatusStatus2.hashCode());
        System.assertEquals(installStatusStatus3.hashCode(), installStatusStatus4.hashCode());
    }
}

import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ConsoleApi
void main() {
  final instance = Openapi().getConsoleApi();

  group(ConsoleApi, () {
    //Future<BuiltList<String>> getAemProductInfo() async
    test('test getAemProductInfo', () async {
      // TODO
    });

    //Future<BundleInfo> getBundleInfo(String name) async
    test('test getBundleInfo', () async {
      // TODO
    });

    //Future<String> getConfigMgr() async
    test('test getConfigMgr', () async {
      // TODO
    });

    //Future postBundle(String name, String action) async
    test('test postBundle', () async {
      // TODO
    });

    //Future postJmxRepository(String action) async
    test('test postJmxRepository', () async {
      // TODO
    });

    //Future<SamlConfigurationInfo> postSamlConfiguration({ bool post, bool apply, bool delete, String action, String dollarLocation, BuiltList<String> path, int servicePeriodRanking, String idpUrl, String idpCertAlias, bool idpHttpRedirect, String serviceProviderEntityId, String assertionConsumerServiceURL, String spPrivateKeyAlias, String keyStorePassword, String defaultRedirectUrl, String userIDAttribute, bool useEncryption, bool createUser, bool addGroupMemberships, String groupMembershipAttribute, BuiltList<String> defaultGroups, String nameIdFormat, BuiltList<String> synchronizeAttributes, bool handleLogout, String logoutUrl, int clockTolerance, String digestMethod, String signatureMethod, String userIntermediatePath, BuiltList<String> propertylist }) async
    test('test postSamlConfiguration', () async {
      // TODO
    });

  });
}

import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for CustomApi
void main() {
  final instance = Openapi().getCustomApi();

  group(CustomApi, () {
    //Future<String> getAemHealthCheck({ String tags, bool combineTagsOr }) async
    test('test getAemHealthCheck', () async {
      // TODO
    });

    //Future postConfigAemHealthCheckServlet({ BuiltList<String> bundlesPeriodIgnored, String bundlesPeriodIgnoredAtTypeHint }) async
    test('test postConfigAemHealthCheckServlet', () async {
      // TODO
    });

    //Future postConfigAemPasswordReset({ BuiltList<String> pwdresetPeriodAuthorizables, String pwdresetPeriodAuthorizablesAtTypeHint }) async
    test('test postConfigAemPasswordReset', () async {
      // TODO
    });

  });
}

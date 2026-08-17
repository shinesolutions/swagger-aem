import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for GraniteApi
void main() {
  final instance = Openapi().getGraniteApi();

  group(GraniteApi, () {
    //Future<String> sslSetup(String keystorePassword, String keystorePasswordConfirm, String truststorePassword, String truststorePasswordConfirm, String httpsHostname, String httpsPort, { MultipartFile privatekeyFile, MultipartFile certificateFile }) async
    test('test sslSetup', () async {
      // TODO
    });

  });
}

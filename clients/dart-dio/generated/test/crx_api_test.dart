import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for CrxApi
void main() {
  final instance = Openapi().getCrxApi();

  group(CrxApi, () {
    //Future<String> getCrxdeStatus() async
    test('test getCrxdeStatus', () async {
      // TODO
    });

    //Future<InstallStatus> getInstallStatus() async
    test('test getInstallStatus', () async {
      // TODO
    });

    //Future getPackageManagerServlet() async
    test('test getPackageManagerServlet', () async {
      // TODO
    });

    //Future<String> postPackageService(String cmd) async
    test('test postPackageService', () async {
      // TODO
    });

    //Future<String> postPackageServiceJson(String path, String cmd, { String groupName, String packageName, String packageVersion, String charset, bool force, bool recursive, MultipartFile package }) async
    test('test postPackageServiceJson', () async {
      // TODO
    });

    //Future<String> postPackageUpdate(String groupName, String packageName, String version, String path, { String filter, String charset }) async
    test('test postPackageUpdate', () async {
      // TODO
    });

    //Future<String> postSetPassword(String old, String plain, String verify) async
    test('test postSetPassword', () async {
      // TODO
    });

  });
}

import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for CqApi
void main() {
  final instance = Openapi().getCqApi();

  group(CqApi, () {
    //Future<String> getLoginPage() async
    test('test getLoginPage', () async {
      // TODO
    });

    //Future postCqActions(String authorizableId, String changelog) async
    test('test postCqActions', () async {
      // TODO
    });

  });
}

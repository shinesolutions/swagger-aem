part of openapi.api;

class KeystoreChainItems {
  /* e.g. \"CN=localhost\" */
  String subject = null;
  /* e.g. \"CN=Admin\" */
  String issuer = null;
  /* e.g. \"Sun Jul 01 12:00:00 AEST 2018\" */
  String notBefore = null;
  /* e.g. \"Sun Jun 30 23:59:50 AEST 2019\" */
  String notAfter = null;
  /* 18165099476682912368 */
  int serialNumber = null;
  KeystoreChainItems();

  @override
  String toString() {
    return 'KeystoreChainItems[subject=$subject, issuer=$issuer, notBefore=$notBefore, notAfter=$notAfter, serialNumber=$serialNumber, ]';
  }

  KeystoreChainItems.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    subject = json['subject'];
    issuer = json['issuer'];
    notBefore = json['notBefore'];
    notAfter = json['notAfter'];
    serialNumber = json['serialNumber'];
  }

  Map<String, dynamic> toJson() {
    return {
      'subject': subject,
      'issuer': issuer,
      'notBefore': notBefore,
      'notAfter': notAfter,
      'serialNumber': serialNumber
    };
  }

  static List<KeystoreChainItems> listFromJson(List<dynamic> json) {
    return json == null ? new List<KeystoreChainItems>() : json.map((value) => new KeystoreChainItems.fromJson(value)).toList();
  }

  static Map<String, KeystoreChainItems> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, KeystoreChainItems>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new KeystoreChainItems.fromJson(value));
    }
    return map;
  }
}


part of openapi.api;

class TruststoreItems {
  /* Truststore alias name */
  String alias = null;
  
  String entryType = null;
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
  TruststoreItems();

  @override
  String toString() {
    return 'TruststoreItems[alias=$alias, entryType=$entryType, subject=$subject, issuer=$issuer, notBefore=$notBefore, notAfter=$notAfter, serialNumber=$serialNumber, ]';
  }

  TruststoreItems.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    alias = json['alias'];
    entryType = json['entryType'];
    subject = json['subject'];
    issuer = json['issuer'];
    notBefore = json['notBefore'];
    notAfter = json['notAfter'];
    serialNumber = json['serialNumber'];
  }

  Map<String, dynamic> toJson() {
    return {
      'alias': alias,
      'entryType': entryType,
      'subject': subject,
      'issuer': issuer,
      'notBefore': notBefore,
      'notAfter': notAfter,
      'serialNumber': serialNumber
    };
  }

  static List<TruststoreItems> listFromJson(List<dynamic> json) {
    return json == null ? new List<TruststoreItems>() : json.map((value) => new TruststoreItems.fromJson(value)).toList();
  }

  static Map<String, TruststoreItems> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, TruststoreItems>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new TruststoreItems.fromJson(value));
    }
    return map;
  }
}


part of openapi.api;

class KeystoreInfo {
  
  List<KeystoreItems> aliases = [];
  /* False if truststore don't exist */
  bool exists = null;
  KeystoreInfo();

  @override
  String toString() {
    return 'KeystoreInfo[aliases=$aliases, exists=$exists, ]';
  }

  KeystoreInfo.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    aliases = KeystoreItems.listFromJson(json['aliases']);
    exists = json['exists'];
  }

  Map<String, dynamic> toJson() {
    return {
      'aliases': aliases,
      'exists': exists
    };
  }

  static List<KeystoreInfo> listFromJson(List<dynamic> json) {
    return json == null ? new List<KeystoreInfo>() : json.map((value) => new KeystoreInfo.fromJson(value)).toList();
  }

  static Map<String, KeystoreInfo> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, KeystoreInfo>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new KeystoreInfo.fromJson(value));
    }
    return map;
  }
}


part of openapi.api;

class KeystoreItems {
  /* Keystore alias name */
  String alias = null;
  /* e.g. \"privateKey\" */
  String entryType = null;
  /* e.g. \"RSA\" */
  String algorithm = null;
  /* e.g. \"PKCS#8\" */
  String format = null;
  
  List<KeystoreChainItems> chain = [];
  KeystoreItems();

  @override
  String toString() {
    return 'KeystoreItems[alias=$alias, entryType=$entryType, algorithm=$algorithm, format=$format, chain=$chain, ]';
  }

  KeystoreItems.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    alias = json['alias'];
    entryType = json['entryType'];
    algorithm = json['algorithm'];
    format = json['format'];
    chain = KeystoreChainItems.listFromJson(json['chain']);
  }

  Map<String, dynamic> toJson() {
    return {
      'alias': alias,
      'entryType': entryType,
      'algorithm': algorithm,
      'format': format,
      'chain': chain
    };
  }

  static List<KeystoreItems> listFromJson(List<dynamic> json) {
    return json == null ? new List<KeystoreItems>() : json.map((value) => new KeystoreItems.fromJson(value)).toList();
  }

  static Map<String, KeystoreItems> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, KeystoreItems>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new KeystoreItems.fromJson(value));
    }
    return map;
  }
}


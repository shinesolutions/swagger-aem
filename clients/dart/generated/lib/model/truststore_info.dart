part of openapi.api;

class TruststoreInfo {
  
  List<TruststoreItems> aliases = [];
  /* False if truststore don't exist */
  bool exists = null;
  TruststoreInfo();

  @override
  String toString() {
    return 'TruststoreInfo[aliases=$aliases, exists=$exists, ]';
  }

  TruststoreInfo.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    aliases = TruststoreItems.listFromJson(json['aliases']);
    exists = json['exists'];
  }

  Map<String, dynamic> toJson() {
    return {
      'aliases': aliases,
      'exists': exists
    };
  }

  static List<TruststoreInfo> listFromJson(List<dynamic> json) {
    return json == null ? new List<TruststoreInfo>() : json.map((value) => new TruststoreInfo.fromJson(value)).toList();
  }

  static Map<String, TruststoreInfo> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, TruststoreInfo>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new TruststoreInfo.fromJson(value));
    }
    return map;
  }
}


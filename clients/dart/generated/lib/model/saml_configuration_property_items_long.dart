part of openapi.api;

class SamlConfigurationPropertyItemsLong {
  /* property name */
  String name = null;
  /* True if optional */
  bool optional = null;
  /* True if property is set */
  bool isSet = null;
  /* Property type, 1=String, 3=long, 11=boolean, 12=Password */
  int type = null;
  /* Property value */
  int value = null;
  /* Property description */
  String description = null;
  SamlConfigurationPropertyItemsLong();

  @override
  String toString() {
    return 'SamlConfigurationPropertyItemsLong[name=$name, optional=$optional, isSet=$isSet, type=$type, value=$value, description=$description, ]';
  }

  SamlConfigurationPropertyItemsLong.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name = json['name'];
    optional = json['optional'];
    isSet = json['is_set'];
    type = json['type'];
    value = json['value'];
    description = json['description'];
  }

  Map<String, dynamic> toJson() {
    return {
      'name': name,
      'optional': optional,
      'is_set': isSet,
      'type': type,
      'value': value,
      'description': description
    };
  }

  static List<SamlConfigurationPropertyItemsLong> listFromJson(List<dynamic> json) {
    return json == null ? new List<SamlConfigurationPropertyItemsLong>() : json.map((value) => new SamlConfigurationPropertyItemsLong.fromJson(value)).toList();
  }

  static Map<String, SamlConfigurationPropertyItemsLong> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, SamlConfigurationPropertyItemsLong>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new SamlConfigurationPropertyItemsLong.fromJson(value));
    }
    return map;
  }
}


part of openapi.api;

class SamlConfigurationPropertyItemsString {
  /* property name */
  String name = null;
  /* True if optional */
  bool optional = null;
  /* True if property is set */
  bool isSet = null;
  /* Property type, 1=String, 3=long, 11=boolean, 12=Password */
  int type = null;
  /* Property value */
  String value = null;
  /* Property description */
  String description = null;
  SamlConfigurationPropertyItemsString();

  @override
  String toString() {
    return 'SamlConfigurationPropertyItemsString[name=$name, optional=$optional, isSet=$isSet, type=$type, value=$value, description=$description, ]';
  }

  SamlConfigurationPropertyItemsString.fromJson(Map<String, dynamic> json) {
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

  static List<SamlConfigurationPropertyItemsString> listFromJson(List<dynamic> json) {
    return json == null ? new List<SamlConfigurationPropertyItemsString>() : json.map((value) => new SamlConfigurationPropertyItemsString.fromJson(value)).toList();
  }

  static Map<String, SamlConfigurationPropertyItemsString> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, SamlConfigurationPropertyItemsString>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new SamlConfigurationPropertyItemsString.fromJson(value));
    }
    return map;
  }
}


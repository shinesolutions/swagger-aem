part of openapi.api;

class SamlConfigurationPropertyItemsBoolean {
  /* property name */
  String name = null;
  /* True if optional */
  bool optional = null;
  /* True if property is set */
  bool isSet = null;
  /* Property type, 1=String, 3=long, 11=boolean, 12=Password */
  int type = null;
  /* Property value */
  bool value = null;
  /* Property description */
  String description = null;
  SamlConfigurationPropertyItemsBoolean();

  @override
  String toString() {
    return 'SamlConfigurationPropertyItemsBoolean[name=$name, optional=$optional, isSet=$isSet, type=$type, value=$value, description=$description, ]';
  }

  SamlConfigurationPropertyItemsBoolean.fromJson(Map<String, dynamic> json) {
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

  static List<SamlConfigurationPropertyItemsBoolean> listFromJson(List<dynamic> json) {
    return json == null ? new List<SamlConfigurationPropertyItemsBoolean>() : json.map((value) => new SamlConfigurationPropertyItemsBoolean.fromJson(value)).toList();
  }

  static Map<String, SamlConfigurationPropertyItemsBoolean> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, SamlConfigurationPropertyItemsBoolean>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new SamlConfigurationPropertyItemsBoolean.fromJson(value));
    }
    return map;
  }
}


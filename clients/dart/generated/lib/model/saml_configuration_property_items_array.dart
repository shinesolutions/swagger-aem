part of openapi.api;

class SamlConfigurationPropertyItemsArray {
  /* property name */
  String name = null;
  /* True if optional */
  bool optional = null;
  /* True if property is set */
  bool isSet = null;
  /* Property type, 1=String, 3=long, 11=boolean, 12=Password */
  int type = null;
  /* Property value */
  List<String> values = [];
  /* Property description */
  String description = null;
  SamlConfigurationPropertyItemsArray();

  @override
  String toString() {
    return 'SamlConfigurationPropertyItemsArray[name=$name, optional=$optional, isSet=$isSet, type=$type, values=$values, description=$description, ]';
  }

  SamlConfigurationPropertyItemsArray.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name = json['name'];
    optional = json['optional'];
    isSet = json['is_set'];
    type = json['type'];
    values = (json['values'] as List).map((item) => item as String).toList();
    description = json['description'];
  }

  Map<String, dynamic> toJson() {
    return {
      'name': name,
      'optional': optional,
      'is_set': isSet,
      'type': type,
      'values': values,
      'description': description
    };
  }

  static List<SamlConfigurationPropertyItemsArray> listFromJson(List<dynamic> json) {
    return json == null ? new List<SamlConfigurationPropertyItemsArray>() : json.map((value) => new SamlConfigurationPropertyItemsArray.fromJson(value)).toList();
  }

  static Map<String, SamlConfigurationPropertyItemsArray> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, SamlConfigurationPropertyItemsArray>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new SamlConfigurationPropertyItemsArray.fromJson(value));
    }
    return map;
  }
}


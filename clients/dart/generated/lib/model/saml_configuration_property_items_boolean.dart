//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SamlConfigurationPropertyItemsBoolean {
  /// Returns a new [SamlConfigurationPropertyItemsBoolean] instance.
  SamlConfigurationPropertyItemsBoolean({
    this.name,
    this.optional,
    this.isSet,
    this.type,
    this.value,
    this.description,
  });

  /// property name
  String name;

  /// True if optional
  bool optional;

  /// True if property is set
  bool isSet;

  /// Property type, 1=String, 3=long, 11=boolean, 12=Password
  int type;

  /// Property value
  bool value;

  /// Property description
  String description;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SamlConfigurationPropertyItemsBoolean &&
     other.name == name &&
     other.optional == optional &&
     other.isSet == isSet &&
     other.type == type &&
     other.value == value &&
     other.description == description;

  @override
  int get hashCode =>
    (name == null ? 0 : name.hashCode) +
    (optional == null ? 0 : optional.hashCode) +
    (isSet == null ? 0 : isSet.hashCode) +
    (type == null ? 0 : type.hashCode) +
    (value == null ? 0 : value.hashCode) +
    (description == null ? 0 : description.hashCode);

  @override
  String toString() => 'SamlConfigurationPropertyItemsBoolean[name=$name, optional=$optional, isSet=$isSet, type=$type, value=$value, description=$description]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (name != null) {
      json[r'name'] = name;
    }
    if (optional != null) {
      json[r'optional'] = optional;
    }
    if (isSet != null) {
      json[r'is_set'] = isSet;
    }
    if (type != null) {
      json[r'type'] = type;
    }
    if (value != null) {
      json[r'value'] = value;
    }
    if (description != null) {
      json[r'description'] = description;
    }
    return json;
  }

  /// Returns a new [SamlConfigurationPropertyItemsBoolean] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static SamlConfigurationPropertyItemsBoolean fromJson(Map<String, dynamic> json) => json == null
    ? null
    : SamlConfigurationPropertyItemsBoolean(
        name: json[r'name'],
        optional: json[r'optional'],
        isSet: json[r'is_set'],
        type: json[r'type'],
        value: json[r'value'],
        description: json[r'description'],
    );

  static List<SamlConfigurationPropertyItemsBoolean> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <SamlConfigurationPropertyItemsBoolean>[]
      : json.map((dynamic value) => SamlConfigurationPropertyItemsBoolean.fromJson(value)).toList(growable: true == growable);

  static Map<String, SamlConfigurationPropertyItemsBoolean> mapFromJson(Map<String, dynamic> json) {
    final map = <String, SamlConfigurationPropertyItemsBoolean>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = SamlConfigurationPropertyItemsBoolean.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of SamlConfigurationPropertyItemsBoolean-objects as value to a dart map
  static Map<String, List<SamlConfigurationPropertyItemsBoolean>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<SamlConfigurationPropertyItemsBoolean>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = SamlConfigurationPropertyItemsBoolean.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}


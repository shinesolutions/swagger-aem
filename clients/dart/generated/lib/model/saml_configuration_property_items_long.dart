//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SamlConfigurationPropertyItemsLong {
  /// Returns a new [SamlConfigurationPropertyItemsLong] instance.
  SamlConfigurationPropertyItemsLong({
    this.name,
    this.optional,
    this.isSet,
    this.type,
    this.value,
    this.description,
  });

  /// property name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// True if optional
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? optional;

  /// True if property is set
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isSet;

  /// Property type, 1=String, 3=long, 11=boolean, 12=Password
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? type;

  /// Property value
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? value;

  /// Property description
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SamlConfigurationPropertyItemsLong &&
    other.name == name &&
    other.optional == optional &&
    other.isSet == isSet &&
    other.type == type &&
    other.value == value &&
    other.description == description;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (optional == null ? 0 : optional!.hashCode) +
    (isSet == null ? 0 : isSet!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (value == null ? 0 : value!.hashCode) +
    (description == null ? 0 : description!.hashCode);

  @override
  String toString() => 'SamlConfigurationPropertyItemsLong[name=$name, optional=$optional, isSet=$isSet, type=$type, value=$value, description=$description]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.optional != null) {
      json[r'optional'] = this.optional;
    } else {
      json[r'optional'] = null;
    }
    if (this.isSet != null) {
      json[r'is_set'] = this.isSet;
    } else {
      json[r'is_set'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.value != null) {
      json[r'value'] = this.value;
    } else {
      json[r'value'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    return json;
  }

  /// Returns a new [SamlConfigurationPropertyItemsLong] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SamlConfigurationPropertyItemsLong? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return SamlConfigurationPropertyItemsLong(
        name: mapValueOfType<String>(json, r'name'),
        optional: mapValueOfType<bool>(json, r'optional'),
        isSet: mapValueOfType<bool>(json, r'is_set'),
        type: mapValueOfType<int>(json, r'type'),
        value: mapValueOfType<int>(json, r'value'),
        description: mapValueOfType<String>(json, r'description'),
      );
    }
    return null;
  }

  static List<SamlConfigurationPropertyItemsLong> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SamlConfigurationPropertyItemsLong>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SamlConfigurationPropertyItemsLong.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SamlConfigurationPropertyItemsLong> mapFromJson(dynamic json) {
    final map = <String, SamlConfigurationPropertyItemsLong>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SamlConfigurationPropertyItemsLong.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SamlConfigurationPropertyItemsLong-objects as value to a dart map
  static Map<String, List<SamlConfigurationPropertyItemsLong>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SamlConfigurationPropertyItemsLong>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SamlConfigurationPropertyItemsLong.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


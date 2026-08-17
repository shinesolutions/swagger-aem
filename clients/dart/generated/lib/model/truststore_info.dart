//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TruststoreInfo {
  /// Returns a new [TruststoreInfo] instance.
  TruststoreInfo({
    this.aliases = const [],
    this.exists,
  });

  List<TruststoreItems> aliases;

  /// False if truststore don't exist
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? exists;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TruststoreInfo &&
    _deepEquality.equals(other.aliases, aliases) &&
    other.exists == exists;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (aliases.hashCode) +
    (exists == null ? 0 : exists!.hashCode);

  @override
  String toString() => 'TruststoreInfo[aliases=$aliases, exists=$exists]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'aliases'] = this.aliases;
    if (this.exists != null) {
      json[r'exists'] = this.exists;
    } else {
      json[r'exists'] = null;
    }
    return json;
  }

  /// Returns a new [TruststoreInfo] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TruststoreInfo? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return TruststoreInfo(
        aliases: TruststoreItems.listFromJson(json[r'aliases']),
        exists: mapValueOfType<bool>(json, r'exists'),
      );
    }
    return null;
  }

  static List<TruststoreInfo> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TruststoreInfo>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TruststoreInfo.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TruststoreInfo> mapFromJson(dynamic json) {
    final map = <String, TruststoreInfo>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TruststoreInfo.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TruststoreInfo-objects as value to a dart map
  static Map<String, List<TruststoreInfo>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TruststoreInfo>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TruststoreInfo.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class KeystoreItems {
  /// Returns a new [KeystoreItems] instance.
  KeystoreItems({
    this.alias,
    this.entryType,
    this.algorithm,
    this.format,
    this.chain = const [],
  });

  /// Keystore alias name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? alias;

  /// e.g. \"privateKey\"
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? entryType;

  /// e.g. \"RSA\"
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? algorithm;

  /// e.g. \"PKCS#8\"
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? format;

  List<KeystoreChainItems> chain;

  @override
  bool operator ==(Object other) => identical(this, other) || other is KeystoreItems &&
    other.alias == alias &&
    other.entryType == entryType &&
    other.algorithm == algorithm &&
    other.format == format &&
    _deepEquality.equals(other.chain, chain);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (alias == null ? 0 : alias!.hashCode) +
    (entryType == null ? 0 : entryType!.hashCode) +
    (algorithm == null ? 0 : algorithm!.hashCode) +
    (format == null ? 0 : format!.hashCode) +
    (chain.hashCode);

  @override
  String toString() => 'KeystoreItems[alias=$alias, entryType=$entryType, algorithm=$algorithm, format=$format, chain=$chain]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.alias != null) {
      json[r'alias'] = this.alias;
    } else {
      json[r'alias'] = null;
    }
    if (this.entryType != null) {
      json[r'entryType'] = this.entryType;
    } else {
      json[r'entryType'] = null;
    }
    if (this.algorithm != null) {
      json[r'algorithm'] = this.algorithm;
    } else {
      json[r'algorithm'] = null;
    }
    if (this.format != null) {
      json[r'format'] = this.format;
    } else {
      json[r'format'] = null;
    }
      json[r'chain'] = this.chain;
    return json;
  }

  /// Returns a new [KeystoreItems] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static KeystoreItems? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return KeystoreItems(
        alias: mapValueOfType<String>(json, r'alias'),
        entryType: mapValueOfType<String>(json, r'entryType'),
        algorithm: mapValueOfType<String>(json, r'algorithm'),
        format: mapValueOfType<String>(json, r'format'),
        chain: KeystoreChainItems.listFromJson(json[r'chain']),
      );
    }
    return null;
  }

  static List<KeystoreItems> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <KeystoreItems>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = KeystoreItems.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, KeystoreItems> mapFromJson(dynamic json) {
    final map = <String, KeystoreItems>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = KeystoreItems.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of KeystoreItems-objects as value to a dart map
  static Map<String, List<KeystoreItems>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<KeystoreItems>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = KeystoreItems.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


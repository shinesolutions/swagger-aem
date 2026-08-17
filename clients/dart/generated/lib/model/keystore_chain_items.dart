//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class KeystoreChainItems {
  /// Returns a new [KeystoreChainItems] instance.
  KeystoreChainItems({
    this.subject,
    this.issuer,
    this.notBefore,
    this.notAfter,
    this.serialNumber,
  });

  /// e.g. \"CN=localhost\"
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? subject;

  /// e.g. \"CN=Admin\"
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? issuer;

  /// e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? notBefore;

  /// e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? notAfter;

  /// 18165099476682912368
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? serialNumber;

  @override
  bool operator ==(Object other) => identical(this, other) || other is KeystoreChainItems &&
    other.subject == subject &&
    other.issuer == issuer &&
    other.notBefore == notBefore &&
    other.notAfter == notAfter &&
    other.serialNumber == serialNumber;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (subject == null ? 0 : subject!.hashCode) +
    (issuer == null ? 0 : issuer!.hashCode) +
    (notBefore == null ? 0 : notBefore!.hashCode) +
    (notAfter == null ? 0 : notAfter!.hashCode) +
    (serialNumber == null ? 0 : serialNumber!.hashCode);

  @override
  String toString() => 'KeystoreChainItems[subject=$subject, issuer=$issuer, notBefore=$notBefore, notAfter=$notAfter, serialNumber=$serialNumber]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.subject != null) {
      json[r'subject'] = this.subject;
    } else {
      json[r'subject'] = null;
    }
    if (this.issuer != null) {
      json[r'issuer'] = this.issuer;
    } else {
      json[r'issuer'] = null;
    }
    if (this.notBefore != null) {
      json[r'notBefore'] = this.notBefore;
    } else {
      json[r'notBefore'] = null;
    }
    if (this.notAfter != null) {
      json[r'notAfter'] = this.notAfter;
    } else {
      json[r'notAfter'] = null;
    }
    if (this.serialNumber != null) {
      json[r'serialNumber'] = this.serialNumber;
    } else {
      json[r'serialNumber'] = null;
    }
    return json;
  }

  /// Returns a new [KeystoreChainItems] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static KeystoreChainItems? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return KeystoreChainItems(
        subject: mapValueOfType<String>(json, r'subject'),
        issuer: mapValueOfType<String>(json, r'issuer'),
        notBefore: mapValueOfType<String>(json, r'notBefore'),
        notAfter: mapValueOfType<String>(json, r'notAfter'),
        serialNumber: mapValueOfType<int>(json, r'serialNumber'),
      );
    }
    return null;
  }

  static List<KeystoreChainItems> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <KeystoreChainItems>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = KeystoreChainItems.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, KeystoreChainItems> mapFromJson(dynamic json) {
    final map = <String, KeystoreChainItems>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = KeystoreChainItems.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of KeystoreChainItems-objects as value to a dart map
  static Map<String, List<KeystoreChainItems>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<KeystoreChainItems>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = KeystoreChainItems.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


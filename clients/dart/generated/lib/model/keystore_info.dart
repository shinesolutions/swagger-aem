//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class KeystoreInfo {
  /// Returns a new [KeystoreInfo] instance.
  KeystoreInfo({
    this.aliases = const [],
    this.exists,
  });

  List<KeystoreItems> aliases;

  /// False if truststore don't exist
  bool exists;

  @override
  bool operator ==(Object other) => identical(this, other) || other is KeystoreInfo &&
     other.aliases == aliases &&
     other.exists == exists;

  @override
  int get hashCode =>
    (aliases == null ? 0 : aliases.hashCode) +
    (exists == null ? 0 : exists.hashCode);

  @override
  String toString() => 'KeystoreInfo[aliases=$aliases, exists=$exists]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (aliases != null) {
      json[r'aliases'] = aliases;
    }
    if (exists != null) {
      json[r'exists'] = exists;
    }
    return json;
  }

  /// Returns a new [KeystoreInfo] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static KeystoreInfo fromJson(Map<String, dynamic> json) => json == null
    ? null
    : KeystoreInfo(
        aliases: KeystoreItems.listFromJson(json[r'aliases']),
        exists: json[r'exists'],
    );

  static List<KeystoreInfo> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <KeystoreInfo>[]
      : json.map((dynamic value) => KeystoreInfo.fromJson(value)).toList(growable: true == growable);

  static Map<String, KeystoreInfo> mapFromJson(Map<String, dynamic> json) {
    final map = <String, KeystoreInfo>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = KeystoreInfo.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of KeystoreInfo-objects as value to a dart map
  static Map<String, List<KeystoreInfo>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<KeystoreInfo>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = KeystoreInfo.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}


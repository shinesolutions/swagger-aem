//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
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
  String alias;

  /// e.g. \"privateKey\"
  String entryType;

  /// e.g. \"RSA\"
  String algorithm;

  /// e.g. \"PKCS#8\"
  String format;

  List<KeystoreChainItems> chain;

  @override
  bool operator ==(Object other) => identical(this, other) || other is KeystoreItems &&
     other.alias == alias &&
     other.entryType == entryType &&
     other.algorithm == algorithm &&
     other.format == format &&
     other.chain == chain;

  @override
  int get hashCode =>
    (alias == null ? 0 : alias.hashCode) +
    (entryType == null ? 0 : entryType.hashCode) +
    (algorithm == null ? 0 : algorithm.hashCode) +
    (format == null ? 0 : format.hashCode) +
    (chain == null ? 0 : chain.hashCode);

  @override
  String toString() => 'KeystoreItems[alias=$alias, entryType=$entryType, algorithm=$algorithm, format=$format, chain=$chain]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (alias != null) {
      json[r'alias'] = alias;
    }
    if (entryType != null) {
      json[r'entryType'] = entryType;
    }
    if (algorithm != null) {
      json[r'algorithm'] = algorithm;
    }
    if (format != null) {
      json[r'format'] = format;
    }
    if (chain != null) {
      json[r'chain'] = chain;
    }
    return json;
  }

  /// Returns a new [KeystoreItems] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static KeystoreItems fromJson(Map<String, dynamic> json) => json == null
    ? null
    : KeystoreItems(
        alias: json[r'alias'],
        entryType: json[r'entryType'],
        algorithm: json[r'algorithm'],
        format: json[r'format'],
        chain: KeystoreChainItems.listFromJson(json[r'chain']),
    );

  static List<KeystoreItems> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <KeystoreItems>[]
      : json.map((dynamic value) => KeystoreItems.fromJson(value)).toList(growable: true == growable);

  static Map<String, KeystoreItems> mapFromJson(Map<String, dynamic> json) {
    final map = <String, KeystoreItems>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = KeystoreItems.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of KeystoreItems-objects as value to a dart map
  static Map<String, List<KeystoreItems>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<KeystoreItems>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = KeystoreItems.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}


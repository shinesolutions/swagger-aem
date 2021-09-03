//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
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
  bool exists;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TruststoreInfo &&
     other.aliases == aliases &&
     other.exists == exists;

  @override
  int get hashCode =>
    (aliases == null ? 0 : aliases.hashCode) +
    (exists == null ? 0 : exists.hashCode);

  @override
  String toString() => 'TruststoreInfo[aliases=$aliases, exists=$exists]';

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

  /// Returns a new [TruststoreInfo] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static TruststoreInfo fromJson(Map<String, dynamic> json) => json == null
    ? null
    : TruststoreInfo(
        aliases: TruststoreItems.listFromJson(json[r'aliases']),
        exists: json[r'exists'],
    );

  static List<TruststoreInfo> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <TruststoreInfo>[]
      : json.map((dynamic value) => TruststoreInfo.fromJson(value)).toList(growable: true == growable);

  static Map<String, TruststoreInfo> mapFromJson(Map<String, dynamic> json) {
    final map = <String, TruststoreInfo>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = TruststoreInfo.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of TruststoreInfo-objects as value to a dart map
  static Map<String, List<TruststoreInfo>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<TruststoreInfo>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = TruststoreInfo.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}


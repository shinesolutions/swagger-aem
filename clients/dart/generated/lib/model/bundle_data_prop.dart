//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BundleDataProp {
  /// Returns a new [BundleDataProp] instance.
  BundleDataProp({
    this.key,
    this.value,
  });

  /// Bundle data key
  String key;

  /// Bundle data value
  String value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BundleDataProp &&
     other.key == key &&
     other.value == value;

  @override
  int get hashCode =>
    (key == null ? 0 : key.hashCode) +
    (value == null ? 0 : value.hashCode);

  @override
  String toString() => 'BundleDataProp[key=$key, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (key != null) {
      json[r'key'] = key;
    }
    if (value != null) {
      json[r'value'] = value;
    }
    return json;
  }

  /// Returns a new [BundleDataProp] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static BundleDataProp fromJson(Map<String, dynamic> json) => json == null
    ? null
    : BundleDataProp(
        key: json[r'key'],
        value: json[r'value'],
    );

  static List<BundleDataProp> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <BundleDataProp>[]
      : json.map((dynamic value) => BundleDataProp.fromJson(value)).toList(growable: true == growable);

  static Map<String, BundleDataProp> mapFromJson(Map<String, dynamic> json) {
    final map = <String, BundleDataProp>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = BundleDataProp.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of BundleDataProp-objects as value to a dart map
  static Map<String, List<BundleDataProp>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<BundleDataProp>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = BundleDataProp.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}


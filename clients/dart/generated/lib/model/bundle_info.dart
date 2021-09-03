//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BundleInfo {
  /// Returns a new [BundleInfo] instance.
  BundleInfo({
    this.status,
    this.s = const [],
    this.data = const [],
  });

  /// Status description of all bundles
  String status;

  List<int> s;

  List<BundleData> data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BundleInfo &&
     other.status == status &&
     other.s == s &&
     other.data == data;

  @override
  int get hashCode =>
    (status == null ? 0 : status.hashCode) +
    (s == null ? 0 : s.hashCode) +
    (data == null ? 0 : data.hashCode);

  @override
  String toString() => 'BundleInfo[status=$status, s=$s, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (status != null) {
      json[r'status'] = status;
    }
    if (s != null) {
      json[r's'] = s;
    }
    if (data != null) {
      json[r'data'] = data;
    }
    return json;
  }

  /// Returns a new [BundleInfo] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static BundleInfo fromJson(Map<String, dynamic> json) => json == null
    ? null
    : BundleInfo(
        status: json[r'status'],
        s: json[r's'] == null
          ? null
          : (json[r's'] as List).cast<int>(),
        data: BundleData.listFromJson(json[r'data']),
    );

  static List<BundleInfo> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <BundleInfo>[]
      : json.map((dynamic value) => BundleInfo.fromJson(value)).toList(growable: true == growable);

  static Map<String, BundleInfo> mapFromJson(Map<String, dynamic> json) {
    final map = <String, BundleInfo>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = BundleInfo.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of BundleInfo-objects as value to a dart map
  static Map<String, List<BundleInfo>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<BundleInfo>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = BundleInfo.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}


//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BundleData {
  /// Returns a new [BundleData] instance.
  BundleData({
    this.id,
    this.name,
    this.fragment,
    this.stateRaw,
    this.state,
    this.version,
    this.symbolicName,
    this.category,
    this.props = const [],
  });

  /// Bundle ID
  int id;

  /// Bundle name
  String name;

  /// Is bundle a fragment
  bool fragment;

  /// Numeric raw bundle state value
  int stateRaw;

  /// Bundle state value
  String state;

  /// Bundle version
  String version;

  /// Bundle symbolic name
  String symbolicName;

  /// Bundle category
  String category;

  List<BundleDataProp> props;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BundleData &&
     other.id == id &&
     other.name == name &&
     other.fragment == fragment &&
     other.stateRaw == stateRaw &&
     other.state == state &&
     other.version == version &&
     other.symbolicName == symbolicName &&
     other.category == category &&
     other.props == props;

  @override
  int get hashCode =>
    (id == null ? 0 : id.hashCode) +
    (name == null ? 0 : name.hashCode) +
    (fragment == null ? 0 : fragment.hashCode) +
    (stateRaw == null ? 0 : stateRaw.hashCode) +
    (state == null ? 0 : state.hashCode) +
    (version == null ? 0 : version.hashCode) +
    (symbolicName == null ? 0 : symbolicName.hashCode) +
    (category == null ? 0 : category.hashCode) +
    (props == null ? 0 : props.hashCode);

  @override
  String toString() => 'BundleData[id=$id, name=$name, fragment=$fragment, stateRaw=$stateRaw, state=$state, version=$version, symbolicName=$symbolicName, category=$category, props=$props]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (id != null) {
      json[r'id'] = id;
    }
    if (name != null) {
      json[r'name'] = name;
    }
    if (fragment != null) {
      json[r'fragment'] = fragment;
    }
    if (stateRaw != null) {
      json[r'stateRaw'] = stateRaw;
    }
    if (state != null) {
      json[r'state'] = state;
    }
    if (version != null) {
      json[r'version'] = version;
    }
    if (symbolicName != null) {
      json[r'symbolicName'] = symbolicName;
    }
    if (category != null) {
      json[r'category'] = category;
    }
    if (props != null) {
      json[r'props'] = props;
    }
    return json;
  }

  /// Returns a new [BundleData] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static BundleData fromJson(Map<String, dynamic> json) => json == null
    ? null
    : BundleData(
        id: json[r'id'],
        name: json[r'name'],
        fragment: json[r'fragment'],
        stateRaw: json[r'stateRaw'],
        state: json[r'state'],
        version: json[r'version'],
        symbolicName: json[r'symbolicName'],
        category: json[r'category'],
        props: BundleDataProp.listFromJson(json[r'props']),
    );

  static List<BundleData> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <BundleData>[]
      : json.map((dynamic value) => BundleData.fromJson(value)).toList(growable: true == growable);

  static Map<String, BundleData> mapFromJson(Map<String, dynamic> json) {
    final map = <String, BundleData>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = BundleData.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of BundleData-objects as value to a dart map
  static Map<String, List<BundleData>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<BundleData>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = BundleData.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}


//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
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
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? id;

  /// Bundle name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// Is bundle a fragment
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? fragment;

  /// Numeric raw bundle state value
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? stateRaw;

  /// Bundle state value
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? state;

  /// Bundle version
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? version;

  /// Bundle symbolic name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? symbolicName;

  /// Bundle category
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? category;

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
    _deepEquality.equals(other.props, props);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (fragment == null ? 0 : fragment!.hashCode) +
    (stateRaw == null ? 0 : stateRaw!.hashCode) +
    (state == null ? 0 : state!.hashCode) +
    (version == null ? 0 : version!.hashCode) +
    (symbolicName == null ? 0 : symbolicName!.hashCode) +
    (category == null ? 0 : category!.hashCode) +
    (props.hashCode);

  @override
  String toString() => 'BundleData[id=$id, name=$name, fragment=$fragment, stateRaw=$stateRaw, state=$state, version=$version, symbolicName=$symbolicName, category=$category, props=$props]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.fragment != null) {
      json[r'fragment'] = this.fragment;
    } else {
      json[r'fragment'] = null;
    }
    if (this.stateRaw != null) {
      json[r'stateRaw'] = this.stateRaw;
    } else {
      json[r'stateRaw'] = null;
    }
    if (this.state != null) {
      json[r'state'] = this.state;
    } else {
      json[r'state'] = null;
    }
    if (this.version != null) {
      json[r'version'] = this.version;
    } else {
      json[r'version'] = null;
    }
    if (this.symbolicName != null) {
      json[r'symbolicName'] = this.symbolicName;
    } else {
      json[r'symbolicName'] = null;
    }
    if (this.category != null) {
      json[r'category'] = this.category;
    } else {
      json[r'category'] = null;
    }
      json[r'props'] = this.props;
    return json;
  }

  /// Returns a new [BundleData] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BundleData? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return BundleData(
        id: mapValueOfType<int>(json, r'id'),
        name: mapValueOfType<String>(json, r'name'),
        fragment: mapValueOfType<bool>(json, r'fragment'),
        stateRaw: mapValueOfType<int>(json, r'stateRaw'),
        state: mapValueOfType<String>(json, r'state'),
        version: mapValueOfType<String>(json, r'version'),
        symbolicName: mapValueOfType<String>(json, r'symbolicName'),
        category: mapValueOfType<String>(json, r'category'),
        props: BundleDataProp.listFromJson(json[r'props']),
      );
    }
    return null;
  }

  static List<BundleData> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BundleData>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BundleData.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BundleData> mapFromJson(dynamic json) {
    final map = <String, BundleData>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BundleData.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BundleData-objects as value to a dart map
  static Map<String, List<BundleData>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BundleData>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BundleData.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


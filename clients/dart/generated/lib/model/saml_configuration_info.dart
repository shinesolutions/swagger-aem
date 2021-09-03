//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SamlConfigurationInfo {
  /// Returns a new [SamlConfigurationInfo] instance.
  SamlConfigurationInfo({
    this.pid,
    this.title,
    this.description,
    this.bundleLocation,
    this.serviceLocation,
    this.properties,
  });

  /// Persistent Identity (PID)
  String pid;

  /// Title
  String title;

  /// Title
  String description;

  /// needed for configuration binding
  String bundleLocation;

  /// needed for configuraiton binding
  String serviceLocation;

  SamlConfigurationProperties properties;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SamlConfigurationInfo &&
     other.pid == pid &&
     other.title == title &&
     other.description == description &&
     other.bundleLocation == bundleLocation &&
     other.serviceLocation == serviceLocation &&
     other.properties == properties;

  @override
  int get hashCode =>
    (pid == null ? 0 : pid.hashCode) +
    (title == null ? 0 : title.hashCode) +
    (description == null ? 0 : description.hashCode) +
    (bundleLocation == null ? 0 : bundleLocation.hashCode) +
    (serviceLocation == null ? 0 : serviceLocation.hashCode) +
    (properties == null ? 0 : properties.hashCode);

  @override
  String toString() => 'SamlConfigurationInfo[pid=$pid, title=$title, description=$description, bundleLocation=$bundleLocation, serviceLocation=$serviceLocation, properties=$properties]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (pid != null) {
      json[r'pid'] = pid;
    }
    if (title != null) {
      json[r'title'] = title;
    }
    if (description != null) {
      json[r'description'] = description;
    }
    if (bundleLocation != null) {
      json[r'bundle_location'] = bundleLocation;
    }
    if (serviceLocation != null) {
      json[r'service_location'] = serviceLocation;
    }
    if (properties != null) {
      json[r'properties'] = properties;
    }
    return json;
  }

  /// Returns a new [SamlConfigurationInfo] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static SamlConfigurationInfo fromJson(Map<String, dynamic> json) => json == null
    ? null
    : SamlConfigurationInfo(
        pid: json[r'pid'],
        title: json[r'title'],
        description: json[r'description'],
        bundleLocation: json[r'bundle_location'],
        serviceLocation: json[r'service_location'],
        properties: SamlConfigurationProperties.fromJson(json[r'properties']),
    );

  static List<SamlConfigurationInfo> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <SamlConfigurationInfo>[]
      : json.map((dynamic value) => SamlConfigurationInfo.fromJson(value)).toList(growable: true == growable);

  static Map<String, SamlConfigurationInfo> mapFromJson(Map<String, dynamic> json) {
    final map = <String, SamlConfigurationInfo>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = SamlConfigurationInfo.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of SamlConfigurationInfo-objects as value to a dart map
  static Map<String, List<SamlConfigurationInfo>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<SamlConfigurationInfo>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = SamlConfigurationInfo.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}


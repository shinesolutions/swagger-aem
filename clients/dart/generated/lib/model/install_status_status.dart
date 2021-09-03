//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InstallStatusStatus {
  /// Returns a new [InstallStatusStatus] instance.
  InstallStatusStatus({
    this.finished,
    this.itemCount,
  });

  bool finished;

  int itemCount;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InstallStatusStatus &&
     other.finished == finished &&
     other.itemCount == itemCount;

  @override
  int get hashCode =>
    (finished == null ? 0 : finished.hashCode) +
    (itemCount == null ? 0 : itemCount.hashCode);

  @override
  String toString() => 'InstallStatusStatus[finished=$finished, itemCount=$itemCount]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (finished != null) {
      json[r'finished'] = finished;
    }
    if (itemCount != null) {
      json[r'itemCount'] = itemCount;
    }
    return json;
  }

  /// Returns a new [InstallStatusStatus] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static InstallStatusStatus fromJson(Map<String, dynamic> json) => json == null
    ? null
    : InstallStatusStatus(
        finished: json[r'finished'],
        itemCount: json[r'itemCount'],
    );

  static List<InstallStatusStatus> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <InstallStatusStatus>[]
      : json.map((dynamic value) => InstallStatusStatus.fromJson(value)).toList(growable: true == growable);

  static Map<String, InstallStatusStatus> mapFromJson(Map<String, dynamic> json) {
    final map = <String, InstallStatusStatus>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = InstallStatusStatus.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of InstallStatusStatus-objects as value to a dart map
  static Map<String, List<InstallStatusStatus>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<InstallStatusStatus>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = InstallStatusStatus.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}


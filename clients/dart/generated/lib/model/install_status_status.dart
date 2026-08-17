//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InstallStatusStatus {
  /// Returns a new [InstallStatusStatus] instance.
  InstallStatusStatus({
    this.finished,
    this.itemCount,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? finished;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? itemCount;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InstallStatusStatus &&
    other.finished == finished &&
    other.itemCount == itemCount;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (finished == null ? 0 : finished!.hashCode) +
    (itemCount == null ? 0 : itemCount!.hashCode);

  @override
  String toString() => 'InstallStatusStatus[finished=$finished, itemCount=$itemCount]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.finished != null) {
      json[r'finished'] = this.finished;
    } else {
      json[r'finished'] = null;
    }
    if (this.itemCount != null) {
      json[r'itemCount'] = this.itemCount;
    } else {
      json[r'itemCount'] = null;
    }
    return json;
  }

  /// Returns a new [InstallStatusStatus] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static InstallStatusStatus? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return InstallStatusStatus(
        finished: mapValueOfType<bool>(json, r'finished'),
        itemCount: mapValueOfType<int>(json, r'itemCount'),
      );
    }
    return null;
  }

  static List<InstallStatusStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InstallStatusStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InstallStatusStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, InstallStatusStatus> mapFromJson(dynamic json) {
    final map = <String, InstallStatusStatus>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = InstallStatusStatus.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of InstallStatusStatus-objects as value to a dart map
  static Map<String, List<InstallStatusStatus>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<InstallStatusStatus>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = InstallStatusStatus.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


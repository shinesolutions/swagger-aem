//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TruststoreItems {
  /// Returns a new [TruststoreItems] instance.
  TruststoreItems({
    this.alias,
    this.entryType,
    this.subject,
    this.issuer,
    this.notBefore,
    this.notAfter,
    this.serialNumber,
  });

  /// Truststore alias name
  String alias;

  String entryType;

  /// e.g. \"CN=localhost\"
  String subject;

  /// e.g. \"CN=Admin\"
  String issuer;

  /// e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
  String notBefore;

  /// e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
  String notAfter;

  /// 18165099476682912368
  int serialNumber;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TruststoreItems &&
     other.alias == alias &&
     other.entryType == entryType &&
     other.subject == subject &&
     other.issuer == issuer &&
     other.notBefore == notBefore &&
     other.notAfter == notAfter &&
     other.serialNumber == serialNumber;

  @override
  int get hashCode =>
    (alias == null ? 0 : alias.hashCode) +
    (entryType == null ? 0 : entryType.hashCode) +
    (subject == null ? 0 : subject.hashCode) +
    (issuer == null ? 0 : issuer.hashCode) +
    (notBefore == null ? 0 : notBefore.hashCode) +
    (notAfter == null ? 0 : notAfter.hashCode) +
    (serialNumber == null ? 0 : serialNumber.hashCode);

  @override
  String toString() => 'TruststoreItems[alias=$alias, entryType=$entryType, subject=$subject, issuer=$issuer, notBefore=$notBefore, notAfter=$notAfter, serialNumber=$serialNumber]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (alias != null) {
      json[r'alias'] = alias;
    }
    if (entryType != null) {
      json[r'entryType'] = entryType;
    }
    if (subject != null) {
      json[r'subject'] = subject;
    }
    if (issuer != null) {
      json[r'issuer'] = issuer;
    }
    if (notBefore != null) {
      json[r'notBefore'] = notBefore;
    }
    if (notAfter != null) {
      json[r'notAfter'] = notAfter;
    }
    if (serialNumber != null) {
      json[r'serialNumber'] = serialNumber;
    }
    return json;
  }

  /// Returns a new [TruststoreItems] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static TruststoreItems fromJson(Map<String, dynamic> json) => json == null
    ? null
    : TruststoreItems(
        alias: json[r'alias'],
        entryType: json[r'entryType'],
        subject: json[r'subject'],
        issuer: json[r'issuer'],
        notBefore: json[r'notBefore'],
        notAfter: json[r'notAfter'],
        serialNumber: json[r'serialNumber'],
    );

  static List<TruststoreItems> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <TruststoreItems>[]
      : json.map((dynamic value) => TruststoreItems.fromJson(value)).toList(growable: true == growable);

  static Map<String, TruststoreItems> mapFromJson(Map<String, dynamic> json) {
    final map = <String, TruststoreItems>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = TruststoreItems.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of TruststoreItems-objects as value to a dart map
  static Map<String, List<TruststoreItems>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<TruststoreItems>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = TruststoreItems.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}


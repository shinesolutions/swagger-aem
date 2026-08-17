//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_import

import 'package:one_of_serializer/any_of_serializer.dart';
import 'package:one_of_serializer/one_of_serializer.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:built_value/standard_json_plugin.dart';
import 'package:built_value/iso_8601_date_time_serializer.dart';
import 'package:openapi/src/date_serializer.dart';
import 'package:openapi/src/model/date.dart';

import 'package:openapi/src/model/bundle_data.dart';
import 'package:openapi/src/model/bundle_data_prop.dart';
import 'package:openapi/src/model/bundle_info.dart';
import 'package:openapi/src/model/install_status.dart';
import 'package:openapi/src/model/install_status_status.dart';
import 'package:openapi/src/model/keystore_chain_items.dart';
import 'package:openapi/src/model/keystore_info.dart';
import 'package:openapi/src/model/keystore_items.dart';
import 'package:openapi/src/model/saml_configuration_info.dart';
import 'package:openapi/src/model/saml_configuration_properties.dart';
import 'package:openapi/src/model/saml_configuration_property_items_array.dart';
import 'package:openapi/src/model/saml_configuration_property_items_boolean.dart';
import 'package:openapi/src/model/saml_configuration_property_items_long.dart';
import 'package:openapi/src/model/saml_configuration_property_items_string.dart';
import 'package:openapi/src/model/truststore_info.dart';
import 'package:openapi/src/model/truststore_items.dart';

part 'serializers.g.dart';

@SerializersFor([
  BundleData,
  BundleDataProp,
  BundleInfo,
  InstallStatus,
  InstallStatusStatus,
  KeystoreChainItems,
  KeystoreInfo,
  KeystoreItems,
  SamlConfigurationInfo,
  SamlConfigurationProperties,
  SamlConfigurationPropertyItemsArray,
  SamlConfigurationPropertyItemsBoolean,
  SamlConfigurationPropertyItemsLong,
  SamlConfigurationPropertyItemsString,
  TruststoreInfo,
  TruststoreItems,
])
Serializers serializers = (_$serializers.toBuilder()
      ..addBuilderFactory(
        const FullType(BuiltList, [FullType(KeystoreChainItems)]),
        () => ListBuilder<KeystoreChainItems>(),
      )
      ..addBuilderFactory(
        const FullType(BuiltList, [FullType(int)]),
        () => ListBuilder<int>(),
      )
      ..addBuilderFactory(
        const FullType(BuiltList, [FullType(BundleDataProp)]),
        () => ListBuilder<BundleDataProp>(),
      )
      ..addBuilderFactory(
        const FullType(BuiltList, [FullType(BundleData)]),
        () => ListBuilder<BundleData>(),
      )
      ..addBuilderFactory(
        const FullType(BuiltList, [FullType(KeystoreItems)]),
        () => ListBuilder<KeystoreItems>(),
      )
      ..addBuilderFactory(
        const FullType(BuiltList, [FullType(TruststoreItems)]),
        () => ListBuilder<TruststoreItems>(),
      )
      ..addBuilderFactory(
        const FullType(BuiltList, [FullType(String)]),
        () => ListBuilder<String>(),
      )
      ..add(const OneOfSerializer())
      ..add(const AnyOfSerializer())
      ..add(const DateSerializer())
      ..add(Iso8601DateTimeSerializer())
    ).build();

Serializers standardSerializers =
    (serializers.toBuilder()..addPlugin(StandardJsonPlugin())).build();

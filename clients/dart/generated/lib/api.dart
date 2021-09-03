//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

library openapi.api;

import 'dart:async';
import 'dart:convert';
import 'dart:io';

import 'package:http/http.dart';
import 'package:intl/intl.dart';
import 'package:meta/meta.dart';

part 'api_client.dart';
part 'api_helper.dart';
part 'api_exception.dart';
part 'auth/authentication.dart';
part 'auth/api_key_auth.dart';
part 'auth/oauth.dart';
part 'auth/http_basic_auth.dart';
part 'auth/http_bearer_auth.dart';

part 'api/console_api.dart';
part 'api/cq_api.dart';
part 'api/crx_api.dart';
part 'api/custom_api.dart';
part 'api/granite_api.dart';
part 'api/sling_api.dart';

part 'model/bundle_data.dart';
part 'model/bundle_data_prop.dart';
part 'model/bundle_info.dart';
part 'model/install_status.dart';
part 'model/install_status_status.dart';
part 'model/keystore_chain_items.dart';
part 'model/keystore_info.dart';
part 'model/keystore_items.dart';
part 'model/saml_configuration_info.dart';
part 'model/saml_configuration_properties.dart';
part 'model/saml_configuration_property_items_array.dart';
part 'model/saml_configuration_property_items_boolean.dart';
part 'model/saml_configuration_property_items_long.dart';
part 'model/saml_configuration_property_items_string.dart';
part 'model/truststore_info.dart';
part 'model/truststore_items.dart';


const _delimiters = {'csv': ',', 'ssv': ' ', 'tsv': '\t', 'pipes': '|'};
const _dateEpochMarker = 'epoch';
final _dateFormatter = DateFormat('yyyy-MM-dd');
final _regList = RegExp(r'^List<(.*)>$');
final _regSet = RegExp(r'^Set<(.*)>$');
final _regMap = RegExp(r'^Map<String,(.*)>$');

ApiClient defaultApiClient = ApiClient();

-module(openapi_saml_configuration_property_items_boolean).

-include("openapi.hrl").

-export([openapi_saml_configuration_property_items_boolean/0]).

-export([openapi_saml_configuration_property_items_boolean/1]).

-export_type([openapi_saml_configuration_property_items_boolean/0]).

-type openapi_saml_configuration_property_items_boolean() ::
  [ {'name', binary() }
  | {'optional', boolean() }
  | {'is_set', boolean() }
  | {'type', integer() }
  | {'value', boolean() }
  | {'description', binary() }
  ].


openapi_saml_configuration_property_items_boolean() ->
    openapi_saml_configuration_property_items_boolean([]).

openapi_saml_configuration_property_items_boolean(Fields) ->
  Default = [ {'name', binary() }
            , {'optional', boolean() }
            , {'is_set', boolean() }
            , {'type', integer() }
            , {'value', boolean() }
            , {'description', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


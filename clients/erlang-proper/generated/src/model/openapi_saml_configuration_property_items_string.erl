-module(openapi_saml_configuration_property_items_string).

-include("openapi.hrl").

-export([openapi_saml_configuration_property_items_string/0]).

-export([openapi_saml_configuration_property_items_string/1]).

-export_type([openapi_saml_configuration_property_items_string/0]).

-type openapi_saml_configuration_property_items_string() ::
  [ {'name', binary() }
  | {'optional', boolean() }
  | {'is_set', boolean() }
  | {'type', integer() }
  | {'value', binary() }
  | {'description', binary() }
  ].


openapi_saml_configuration_property_items_string() ->
    openapi_saml_configuration_property_items_string([]).

openapi_saml_configuration_property_items_string(Fields) ->
  Default = [ {'name', binary() }
            , {'optional', boolean() }
            , {'is_set', boolean() }
            , {'type', integer() }
            , {'value', binary() }
            , {'description', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


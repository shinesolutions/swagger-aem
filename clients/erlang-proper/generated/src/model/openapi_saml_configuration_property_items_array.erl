-module(openapi_saml_configuration_property_items_array).

-include("openapi.hrl").

-export([openapi_saml_configuration_property_items_array/0]).

-export([openapi_saml_configuration_property_items_array/1]).

-export_type([openapi_saml_configuration_property_items_array/0]).

-type openapi_saml_configuration_property_items_array() ::
  [ {'name', binary() }
  | {'optional', boolean() }
  | {'is_set', boolean() }
  | {'type', integer() }
  | {'values', list(binary()) }
  | {'description', binary() }
  ].


openapi_saml_configuration_property_items_array() ->
    openapi_saml_configuration_property_items_array([]).

openapi_saml_configuration_property_items_array(Fields) ->
  Default = [ {'name', binary() }
            , {'optional', boolean() }
            , {'is_set', boolean() }
            , {'type', integer() }
            , {'values', list(binary()) }
            , {'description', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


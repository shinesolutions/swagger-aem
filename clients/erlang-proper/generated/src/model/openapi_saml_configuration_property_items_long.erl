-module(openapi_saml_configuration_property_items_long).

-include("openapi.hrl").

-export([openapi_saml_configuration_property_items_long/0]).

-export([openapi_saml_configuration_property_items_long/1]).

-export_type([openapi_saml_configuration_property_items_long/0]).

-type openapi_saml_configuration_property_items_long() ::
  [ {'name', binary() }
  | {'optional', boolean() }
  | {'is_set', boolean() }
  | {'type', integer() }
  | {'value', integer() }
  | {'description', binary() }
  ].


openapi_saml_configuration_property_items_long() ->
    openapi_saml_configuration_property_items_long([]).

openapi_saml_configuration_property_items_long(Fields) ->
  Default = [ {'name', binary() }
            , {'optional', boolean() }
            , {'is_set', boolean() }
            , {'type', integer() }
            , {'value', integer() }
            , {'description', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


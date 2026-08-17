-module(openapi_saml_configuration_info).

-include("openapi.hrl").

-export([openapi_saml_configuration_info/0]).

-export([openapi_saml_configuration_info/1]).

-export_type([openapi_saml_configuration_info/0]).

-type openapi_saml_configuration_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  | {'properties', openapi_saml_configuration_properties:openapi_saml_configuration_properties() }
  ].


openapi_saml_configuration_info() ->
    openapi_saml_configuration_info([]).

openapi_saml_configuration_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            , {'properties', openapi_saml_configuration_properties:openapi_saml_configuration_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


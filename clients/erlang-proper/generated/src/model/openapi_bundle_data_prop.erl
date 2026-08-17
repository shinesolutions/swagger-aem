-module(openapi_bundle_data_prop).

-include("openapi.hrl").

-export([openapi_bundle_data_prop/0]).

-export([openapi_bundle_data_prop/1]).

-export_type([openapi_bundle_data_prop/0]).

-type openapi_bundle_data_prop() ::
  [ {'key', binary() }
  | {'value', binary() }
  ].


openapi_bundle_data_prop() ->
    openapi_bundle_data_prop([]).

openapi_bundle_data_prop(Fields) ->
  Default = [ {'key', binary() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


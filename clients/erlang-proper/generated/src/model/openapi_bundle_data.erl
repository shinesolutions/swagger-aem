-module(openapi_bundle_data).

-include("openapi.hrl").

-export([openapi_bundle_data/0]).

-export([openapi_bundle_data/1]).

-export_type([openapi_bundle_data/0]).

-type openapi_bundle_data() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'fragment', boolean() }
  | {'stateRaw', integer() }
  | {'state', binary() }
  | {'version', binary() }
  | {'symbolicName', binary() }
  | {'category', binary() }
  | {'props', list(openapi_bundle_data_prop:openapi_bundle_data_prop()) }
  ].


openapi_bundle_data() ->
    openapi_bundle_data([]).

openapi_bundle_data(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'fragment', boolean() }
            , {'stateRaw', integer() }
            , {'state', binary() }
            , {'version', binary() }
            , {'symbolicName', binary() }
            , {'category', binary() }
            , {'props', list(openapi_bundle_data_prop:openapi_bundle_data_prop()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


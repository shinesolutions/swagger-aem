-module(openapi_bundle_info).

-include("openapi.hrl").

-export([openapi_bundle_info/0]).

-export([openapi_bundle_info/1]).

-export_type([openapi_bundle_info/0]).

-type openapi_bundle_info() ::
  [ {'status', binary() }
  | {'s', list(integer()) }
  | {'data', list(openapi_bundle_data:openapi_bundle_data()) }
  ].


openapi_bundle_info() ->
    openapi_bundle_info([]).

openapi_bundle_info(Fields) ->
  Default = [ {'status', binary() }
            , {'s', list(integer()) }
            , {'data', list(openapi_bundle_data:openapi_bundle_data()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


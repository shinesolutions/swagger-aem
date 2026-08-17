-module(openapi_keystore_info).

-include("openapi.hrl").

-export([openapi_keystore_info/0]).

-export([openapi_keystore_info/1]).

-export_type([openapi_keystore_info/0]).

-type openapi_keystore_info() ::
  [ {'aliases', list(openapi_keystore_items:openapi_keystore_items()) }
  | {'exists', boolean() }
  ].


openapi_keystore_info() ->
    openapi_keystore_info([]).

openapi_keystore_info(Fields) ->
  Default = [ {'aliases', list(openapi_keystore_items:openapi_keystore_items()) }
            , {'exists', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


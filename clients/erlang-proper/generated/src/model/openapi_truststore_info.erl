-module(openapi_truststore_info).

-include("openapi.hrl").

-export([openapi_truststore_info/0]).

-export([openapi_truststore_info/1]).

-export_type([openapi_truststore_info/0]).

-type openapi_truststore_info() ::
  [ {'aliases', list(openapi_truststore_items:openapi_truststore_items()) }
  | {'exists', boolean() }
  ].


openapi_truststore_info() ->
    openapi_truststore_info([]).

openapi_truststore_info(Fields) ->
  Default = [ {'aliases', list(openapi_truststore_items:openapi_truststore_items()) }
            , {'exists', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


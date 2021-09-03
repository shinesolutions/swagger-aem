-module(openapi_bundle_info).

-export([encode/1]).

-export_type([openapi_bundle_info/0]).

-type openapi_bundle_info() ::
    #{ 'status' => binary(),
       's' => list(),
       'data' => list()
     }.

encode(#{ 'status' := Status,
          's' := S,
          'data' := Data
        }) ->
    #{ 'status' => Status,
       's' => S,
       'data' => Data
     }.

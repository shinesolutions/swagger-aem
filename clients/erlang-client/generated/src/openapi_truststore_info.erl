-module(openapi_truststore_info).

-export([encode/1]).

-export_type([openapi_truststore_info/0]).

-type openapi_truststore_info() ::
    #{ 'aliases' => list(),
       'exists' => boolean()
     }.

encode(#{ 'aliases' := Aliases,
          'exists' := Exists
        }) ->
    #{ 'aliases' => Aliases,
       'exists' => Exists
     }.

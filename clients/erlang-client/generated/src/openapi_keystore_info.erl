-module(openapi_keystore_info).

-export([encode/1]).

-export_type([openapi_keystore_info/0]).

-type openapi_keystore_info() ::
    #{ 'aliases' => list(),
       'exists' => boolean()
     }.

encode(#{ 'aliases' := Aliases,
          'exists' := Exists
        }) ->
    #{ 'aliases' => Aliases,
       'exists' => Exists
     }.

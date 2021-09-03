-module(openapi_bundle_data_prop).

-export([encode/1]).

-export_type([openapi_bundle_data_prop/0]).

-type openapi_bundle_data_prop() ::
    #{ 'key' => binary(),
       'value' => binary()
     }.

encode(#{ 'key' := Key,
          'value' := Value
        }) ->
    #{ 'key' => Key,
       'value' => Value
     }.

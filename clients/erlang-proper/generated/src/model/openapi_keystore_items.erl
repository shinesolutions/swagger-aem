-module(openapi_keystore_items).

-include("openapi.hrl").

-export([openapi_keystore_items/0]).

-export([openapi_keystore_items/1]).

-export_type([openapi_keystore_items/0]).

-type openapi_keystore_items() ::
  [ {'alias', binary() }
  | {'entryType', binary() }
  | {'algorithm', binary() }
  | {'format', binary() }
  | {'chain', list(openapi_keystore_chain_items:openapi_keystore_chain_items()) }
  ].


openapi_keystore_items() ->
    openapi_keystore_items([]).

openapi_keystore_items(Fields) ->
  Default = [ {'alias', binary() }
            , {'entryType', binary() }
            , {'algorithm', binary() }
            , {'format', binary() }
            , {'chain', list(openapi_keystore_chain_items:openapi_keystore_chain_items()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


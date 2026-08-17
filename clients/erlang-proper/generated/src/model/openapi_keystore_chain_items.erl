-module(openapi_keystore_chain_items).

-include("openapi.hrl").

-export([openapi_keystore_chain_items/0]).

-export([openapi_keystore_chain_items/1]).

-export_type([openapi_keystore_chain_items/0]).

-type openapi_keystore_chain_items() ::
  [ {'subject', binary() }
  | {'issuer', binary() }
  | {'notBefore', binary() }
  | {'notAfter', binary() }
  | {'serialNumber', integer() }
  ].


openapi_keystore_chain_items() ->
    openapi_keystore_chain_items([]).

openapi_keystore_chain_items(Fields) ->
  Default = [ {'subject', binary() }
            , {'issuer', binary() }
            , {'notBefore', binary() }
            , {'notAfter', binary() }
            , {'serialNumber', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


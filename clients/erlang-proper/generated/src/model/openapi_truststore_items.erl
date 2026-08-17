-module(openapi_truststore_items).

-include("openapi.hrl").

-export([openapi_truststore_items/0]).

-export([openapi_truststore_items/1]).

-export_type([openapi_truststore_items/0]).

-type openapi_truststore_items() ::
  [ {'alias', binary() }
  | {'entryType', binary() }
  | {'subject', binary() }
  | {'issuer', binary() }
  | {'notBefore', binary() }
  | {'notAfter', binary() }
  | {'serialNumber', integer() }
  ].


openapi_truststore_items() ->
    openapi_truststore_items([]).

openapi_truststore_items(Fields) ->
  Default = [ {'alias', binary() }
            , {'entryType', binary() }
            , {'subject', binary() }
            , {'issuer', binary() }
            , {'notBefore', binary() }
            , {'notAfter', binary() }
            , {'serialNumber', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


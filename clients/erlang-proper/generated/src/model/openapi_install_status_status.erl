-module(openapi_install_status_status).

-include("openapi.hrl").

-export([openapi_install_status_status/0]).

-export([openapi_install_status_status/1]).

-export_type([openapi_install_status_status/0]).

-type openapi_install_status_status() ::
  [ {'finished', boolean() }
  | {'itemCount', integer() }
  ].


openapi_install_status_status() ->
    openapi_install_status_status([]).

openapi_install_status_status(Fields) ->
  Default = [ {'finished', boolean() }
            , {'itemCount', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


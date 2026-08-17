-module(openapi_install_status).

-include("openapi.hrl").

-export([openapi_install_status/0]).

-export([openapi_install_status/1]).

-export_type([openapi_install_status/0]).

-type openapi_install_status() ::
  [ {'status', openapi_install_status_status:openapi_install_status_status() }
  ].


openapi_install_status() ->
    openapi_install_status([]).

openapi_install_status(Fields) ->
  Default = [ {'status', openapi_install_status_status:openapi_install_status_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


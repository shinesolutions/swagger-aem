-module(openapi_install_status_status).

-export([encode/1]).

-export_type([openapi_install_status_status/0]).

-type openapi_install_status_status() ::
    #{ 'finished' => boolean(),
       'itemCount' => integer()
     }.

encode(#{ 'finished' := Finished,
          'itemCount' := ItemCount
        }) ->
    #{ 'finished' => Finished,
       'itemCount' => ItemCount
     }.

-module(openapi_install_status).

-export([encode/1]).

-export_type([openapi_install_status/0]).

-type openapi_install_status() ::
    #{ 'status' => openapi_install_status_status:openapi_install_status_status()
     }.

encode(#{ 'status' := Status
        }) ->
    #{ 'status' => Status
     }.

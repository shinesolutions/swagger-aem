-module(openapi_logic_handler).

-export([handle_request/4]).
-type context() :: #{binary() => any()}.
-type handler_response() ::{
    Status :: cowboy:http_status(),
    Headers :: cowboy:http_headers(),
    Body :: jsx:json_term()}.

-export_type([handler_response/0]).



-callback handle_request(OperationID :: openapi_api:operation_id(), cowboy_req:req(), Context :: context()) ->
    handler_response().

-spec handle_request(
    Handler :: atom(),
    OperationID :: openapi_api:operation_id(),
    Request :: cowboy_req:req(),
    Context :: context()
) ->
    handler_response().

handle_request(Handler, OperationID, Req, Context) ->
    Handler:handle_request(OperationID, Req, Context).


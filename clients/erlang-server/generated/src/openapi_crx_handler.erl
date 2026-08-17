-module(openapi_crx_handler).
-moduledoc """
Exposes the following operation IDs:

- `GET` to `/crx/server/crx.default/jcr:root/.1.json`, OperationId: `getCrxdeStatus`:
.


- `GET` to `/crx/packmgr/installstatus.jsp`, OperationId: `getInstallStatus`:
.


- `GET` to `/crx/packmgr/service/script.html`, OperationId: `getPackageManagerServlet`:
.


- `POST` to `/crx/packmgr/service.jsp`, OperationId: `postPackageService`:
.


- `POST` to `/crx/packmgr/service/.json/:path`, OperationId: `postPackageServiceJson`:
.


- `POST` to `/crx/packmgr/update.jsp`, OperationId: `postPackageUpdate`:
.


- `POST` to `/crx/explorer/ui/setpassword.jsp`, OperationId: `postSetPassword`:
.


""".

-behaviour(cowboy_rest).

-include_lib("kernel/include/logger.hrl").

%% Cowboy REST callbacks
-export([init/2]).
-export([allowed_methods/2]).
-export([content_types_accepted/2]).
-export([content_types_provided/2]).
-export([delete_resource/2]).
-export([is_authorized/2]).
-export([valid_content_headers/2]).
-export([handle_type_accepted/2, handle_type_provided/2]).

-ignore_xref([handle_type_accepted/2, handle_type_provided/2]).

-export_type([class/0, operation_id/0]).

-type class() :: 'crx'.

-type operation_id() ::
    'getCrxdeStatus' %% 
    | 'getInstallStatus' %% 
    | 'getPackageManagerServlet' %% 
    | 'postPackageService' %% 
    | 'postPackageServiceJson' %% 
    | 'postPackageUpdate' %% 
    | 'postSetPassword'. %% 


-record(state,
        {operation_id :: operation_id(),
         accept_callback :: openapi_logic_handler:accept_callback(),
         provide_callback :: openapi_logic_handler:provide_callback(),
         api_key_callback :: openapi_logic_handler:api_key_callback(),
         context = #{} :: openapi_logic_handler:context()}).

-type state() :: #state{}.

-spec init(cowboy_req:req(), openapi_router:init_opts()) ->
    {cowboy_rest, cowboy_req:req(), state()}.
init(Req, {Operations, Module}) ->
    Method = cowboy_req:method(Req),
    OperationID = maps:get(Method, Operations, undefined),
    ?LOG_INFO(#{what => "Attempt to process operation",
                method => Method,
                operation_id => OperationID}),
    State = #state{operation_id = OperationID,
                   accept_callback = fun Module:accept_callback/4,
                   provide_callback = fun Module:provide_callback/4,
                   api_key_callback = fun Module:api_key_callback/2},
    {cowboy_rest, Req, State}.

-spec allowed_methods(cowboy_req:req(), state()) ->
    {[binary()], cowboy_req:req(), state()}.
allowed_methods(Req, #state{operation_id = 'getCrxdeStatus'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getInstallStatus'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getPackageManagerServlet'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postPackageService'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postPackageServiceJson'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postPackageUpdate'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postSetPassword'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req0,
              #state{operation_id = 'getCrxdeStatus' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getInstallStatus' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getPackageManagerServlet' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postPackageService' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postPackageServiceJson' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postPackageUpdate' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postSetPassword' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_accepted(Req, #state{operation_id = 'getCrxdeStatus'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getInstallStatus'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getPackageManagerServlet'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postPackageService'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postPackageServiceJson'} = State) ->
    {[
      {<<"multipart/form-data">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'postPackageUpdate'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postSetPassword'} = State) ->
    {[], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'getCrxdeStatus'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getInstallStatus'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getPackageManagerServlet'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postPackageService'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postPackageServiceJson'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postPackageUpdate'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postSetPassword'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'getCrxdeStatus'} = State) ->
    {[
      {<<"plain/text">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getInstallStatus'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getPackageManagerServlet'} = State) ->
    {[
      {<<"text/html">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'postPackageService'} = State) ->
    {[
      {<<"text/xml">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'postPackageServiceJson'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'postPackageUpdate'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'postSetPassword'} = State) ->
    {[
      {<<"text/plain">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, State) ->
    {[], Req, State}.

-spec delete_resource(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
delete_resource(Req, State) ->
    {Res, Req1, State1} = handle_type_accepted(Req, State),
    {true =:= Res, Req1, State1}.

-spec handle_type_accepted(cowboy_req:req(), state()) ->
    { openapi_logic_handler:accept_callback_return(), cowboy_req:req(), state()}.
handle_type_accepted(Req, #state{operation_id = OperationID,
                                 accept_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(crx, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(crx, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

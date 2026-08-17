-module(openapi_sling_handler).
-moduledoc """
Exposes the following operation IDs:

- `DELETE` to `/etc/replication/agents.:runmode/:name`, OperationId: `deleteAgent`:
.


- `DELETE` to `/:path/:name`, OperationId: `deleteNode`:
.


- `GET` to `/etc/replication/agents.:runmode/:name`, OperationId: `getAgent`:
.


- `GET` to `/etc/replication/agents.:runmode.-1.json`, OperationId: `getAgents`:
.


- `GET` to `/:intermediatePath/:authorizableId.ks.json`, OperationId: `getAuthorizableKeystore`:
.


- `GET` to `/:intermediatePath/:authorizableId/keystore/store.p12`, OperationId: `getKeystore`:
.


- `GET` to `/:path/:name`, OperationId: `getNode`:
.


- `GET` to `/etc/packages/:group/:name-:version.zip`, OperationId: `getPackage`:
.


- `GET` to `/etc/packages/:group/:name-:version.zip/jcr:content/vlt:definition/filter.tidy.2.json`, OperationId: `getPackageFilter`:
.


- `GET` to `/bin/querybuilder.json`, OperationId: `getQuery`:
.


- `GET` to `/etc/truststore/truststore.p12`, OperationId: `getTruststore`:
.


- `GET` to `/libs/granite/security/truststore.json`, OperationId: `getTruststoreInfo`:
.


- `POST` to `/etc/replication/agents.:runmode/:name`, OperationId: `postAgent`:
.


- `POST` to `/:intermediatePath/:authorizableId.ks.html`, OperationId: `postAuthorizableKeystore`:
.


- `POST` to `/libs/granite/security/post/authorizables`, OperationId: `postAuthorizables`:
.


- `POST` to `/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config`, OperationId: `postConfigAdobeGraniteSamlAuthenticationHandler`:
.


- `POST` to `/apps/system/config/org.apache.felix.http`, OperationId: `postConfigApacheFelixJettyBasedHttpService`:
.


- `POST` to `/apps/system/config/org.apache.http.proxyconfigurator.config`, OperationId: `postConfigApacheHttpComponentsProxyConfiguration`:
.


- `POST` to `/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet`, OperationId: `postConfigApacheSlingDavExServlet`:
.


- `POST` to `/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet`, OperationId: `postConfigApacheSlingGetServlet`:
.


- `POST` to `/apps/system/config/org.apache.sling.security.impl.ReferrerFilter`, OperationId: `postConfigApacheSlingReferrerFilter`:
.


- `POST` to `/apps/system/config/:configNodeName`, OperationId: `postConfigProperty`:
.


- `POST` to `/:path/:name`, OperationId: `postNode`:
.


- `POST` to `/:path/:name.rw.html`, OperationId: `postNodeRw`:
.


- `POST` to `/:path/`, OperationId: `postPath`:
.


- `POST` to `/bin/querybuilder.json`, OperationId: `postQuery`:
.


- `POST` to `/libs/replication/treeactivation.html`, OperationId: `postTreeActivation`:
.


- `POST` to `/libs/granite/security/post/truststore`, OperationId: `postTruststore`:
.


- `POST` to `/etc/truststore`, OperationId: `postTruststorePKCS12`:
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

-type class() :: 'sling'.

-type operation_id() ::
    'deleteAgent' %% 
    | 'deleteNode' %% 
    | 'getAgent' %% 
    | 'getAgents' %% 
    | 'getAuthorizableKeystore' %% 
    | 'getKeystore' %% 
    | 'getNode' %% 
    | 'getPackage' %% 
    | 'getPackageFilter' %% 
    | 'getQuery' %% 
    | 'getTruststore' %% 
    | 'getTruststoreInfo' %% 
    | 'postAgent' %% 
    | 'postAuthorizableKeystore' %% 
    | 'postAuthorizables' %% 
    | 'postConfigAdobeGraniteSamlAuthenticationHandler' %% 
    | 'postConfigApacheFelixJettyBasedHttpService' %% 
    | 'postConfigApacheHttpComponentsProxyConfiguration' %% 
    | 'postConfigApacheSlingDavExServlet' %% 
    | 'postConfigApacheSlingGetServlet' %% 
    | 'postConfigApacheSlingReferrerFilter' %% 
    | 'postConfigProperty' %% 
    | 'postNode' %% 
    | 'postNodeRw' %% 
    | 'postPath' %% 
    | 'postQuery' %% 
    | 'postTreeActivation' %% 
    | 'postTruststore' %% 
    | 'postTruststorePKCS12'. %% 


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
allowed_methods(Req, #state{operation_id = 'deleteAgent'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'deleteNode'} = State) ->
    {[<<"DELETE">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getAgent'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getAgents'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getAuthorizableKeystore'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getKeystore'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getNode'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getPackage'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getPackageFilter'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getQuery'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getTruststore'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'getTruststoreInfo'} = State) ->
    {[<<"GET">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postAgent'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postAuthorizableKeystore'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postAuthorizables'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postConfigAdobeGraniteSamlAuthenticationHandler'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postConfigApacheFelixJettyBasedHttpService'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postConfigApacheHttpComponentsProxyConfiguration'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postConfigApacheSlingDavExServlet'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postConfigApacheSlingGetServlet'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postConfigApacheSlingReferrerFilter'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postConfigProperty'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postNode'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postNodeRw'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postPath'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postQuery'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postTreeActivation'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postTruststore'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, #state{operation_id = 'postTruststorePKCS12'} = State) ->
    {[<<"POST">>], Req, State};
allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(cowboy_req:req(), state()) ->
    {true | {false, iodata()}, cowboy_req:req(), state()}.
is_authorized(Req0,
              #state{operation_id = 'deleteAgent' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'deleteNode' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getAgent' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getAgents' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getAuthorizableKeystore' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getKeystore' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getNode' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getPackage' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getPackageFilter' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getQuery' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getTruststore' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'getTruststoreInfo' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postAgent' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postAuthorizableKeystore' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postAuthorizables' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postConfigAdobeGraniteSamlAuthenticationHandler' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postConfigApacheFelixJettyBasedHttpService' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postConfigApacheHttpComponentsProxyConfiguration' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postConfigApacheSlingDavExServlet' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postConfigApacheSlingGetServlet' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postConfigApacheSlingReferrerFilter' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postConfigProperty' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postNode' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postNodeRw' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postPath' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postQuery' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postTreeActivation' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postTruststore' = OperationID,
                     api_key_callback = Handler} = State) ->
    case openapi_auth:authorize_api_key(Handler, OperationID, header, <<"authorization">>, Req0) of
        {true, Context, Req} ->
            {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->
            {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req0,
              #state{operation_id = 'postTruststorePKCS12' = OperationID,
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
content_types_accepted(Req, #state{operation_id = 'deleteAgent'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'deleteNode'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getAgent'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getAgents'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getAuthorizableKeystore'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getKeystore'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getNode'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getPackage'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getPackageFilter'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getQuery'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getTruststore'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'getTruststoreInfo'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postAgent'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postAuthorizableKeystore'} = State) ->
    {[
      {<<"multipart/form-data">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'postAuthorizables'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postConfigAdobeGraniteSamlAuthenticationHandler'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postConfigApacheFelixJettyBasedHttpService'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postConfigApacheHttpComponentsProxyConfiguration'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postConfigApacheSlingDavExServlet'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postConfigApacheSlingGetServlet'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postConfigApacheSlingReferrerFilter'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postConfigProperty'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postNode'} = State) ->
    {[
      {<<"multipart/form-data">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'postNodeRw'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postPath'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postQuery'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postTreeActivation'} = State) ->
    {[], Req, State};
content_types_accepted(Req, #state{operation_id = 'postTruststore'} = State) ->
    {[
      {<<"multipart/form-data">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, #state{operation_id = 'postTruststorePKCS12'} = State) ->
    {[
      {<<"multipart/form-data">>, handle_type_accepted}
     ], Req, State};
content_types_accepted(Req, State) ->
    {[], Req, State}.

-spec valid_content_headers(cowboy_req:req(), state()) ->
    {boolean(), cowboy_req:req(), state()}.
valid_content_headers(Req, #state{operation_id = 'deleteAgent'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'deleteNode'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getAgent'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getAgents'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getAuthorizableKeystore'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getKeystore'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getNode'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getPackage'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getPackageFilter'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getQuery'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getTruststore'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'getTruststoreInfo'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postAgent'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postAuthorizableKeystore'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postAuthorizables'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postConfigAdobeGraniteSamlAuthenticationHandler'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postConfigApacheFelixJettyBasedHttpService'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postConfigApacheHttpComponentsProxyConfiguration'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postConfigApacheSlingDavExServlet'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postConfigApacheSlingGetServlet'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postConfigApacheSlingReferrerFilter'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postConfigProperty'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postNode'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postNodeRw'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postPath'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postQuery'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postTreeActivation'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postTruststore'} = State) ->
    {true, Req, State};
valid_content_headers(Req, #state{operation_id = 'postTruststorePKCS12'} = State) ->
    {true, Req, State};
valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(cowboy_req:req(), state()) ->
    {[{binary(), atom()}], cowboy_req:req(), state()}.
content_types_provided(Req, #state{operation_id = 'deleteAgent'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'deleteNode'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getAgent'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getAgents'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getAuthorizableKeystore'} = State) ->
    {[
      {<<"text/plain">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getKeystore'} = State) ->
    {[
      {<<"application/octet-stream">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getNode'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'getPackage'} = State) ->
    {[
      {<<"application/octet-stream">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getPackageFilter'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getQuery'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getTruststore'} = State) ->
    {[
      {<<"application/octet-stream">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'getTruststoreInfo'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'postAgent'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'postAuthorizableKeystore'} = State) ->
    {[
      {<<"text/plain">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'postAuthorizables'} = State) ->
    {[
      {<<"text/html">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'postConfigAdobeGraniteSamlAuthenticationHandler'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'postConfigApacheFelixJettyBasedHttpService'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'postConfigApacheHttpComponentsProxyConfiguration'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'postConfigApacheSlingDavExServlet'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'postConfigApacheSlingGetServlet'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'postConfigApacheSlingReferrerFilter'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'postConfigProperty'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'postNode'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'postNodeRw'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'postPath'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'postQuery'} = State) ->
    {[
      {<<"application/json">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'postTreeActivation'} = State) ->
    {[], Req, State};
content_types_provided(Req, #state{operation_id = 'postTruststore'} = State) ->
    {[
      {<<"text/plain">>, handle_type_provided}
     ], Req, State};
content_types_provided(Req, #state{operation_id = 'postTruststorePKCS12'} = State) ->
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
    {Res, Req1, Context1} = Handler(sling, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

-spec handle_type_provided(cowboy_req:req(), state()) ->
    { openapi_logic_handler:provide_callback_return(), cowboy_req:req(), state()}.
handle_type_provided(Req, #state{operation_id = OperationID,
                                 provide_callback = Handler,
                                 context = Context} = State) ->
    {Res, Req1, Context1} = Handler(sling, OperationID, Req, Context),
    {Res, Req1, State#state{context = Context1}}.

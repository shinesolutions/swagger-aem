-module(openapi_bundle_data).

-export([encode/1]).

-export_type([openapi_bundle_data/0]).

-type openapi_bundle_data() ::
    #{ 'id' => integer(),
       'name' => binary(),
       'fragment' => boolean(),
       'stateRaw' => integer(),
       'state' => binary(),
       'version' => binary(),
       'symbolicName' => binary(),
       'category' => binary(),
       'props' => list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'fragment' := Fragment,
          'stateRaw' := StateRaw,
          'state' := State,
          'version' := Version,
          'symbolicName' := SymbolicName,
          'category' := Category,
          'props' := Props
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'fragment' => Fragment,
       'stateRaw' => StateRaw,
       'state' => State,
       'version' => Version,
       'symbolicName' => SymbolicName,
       'category' => Category,
       'props' => Props
     }.

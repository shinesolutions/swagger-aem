-module(openapi_keystore_items).

-export([encode/1]).

-export_type([openapi_keystore_items/0]).

-type openapi_keystore_items() ::
    #{ 'alias' => binary(),
       'entryType' => binary(),
       'algorithm' => binary(),
       'format' => binary(),
       'chain' => list()
     }.

encode(#{ 'alias' := Alias,
          'entryType' := EntryType,
          'algorithm' := Algorithm,
          'format' := Format,
          'chain' := Chain
        }) ->
    #{ 'alias' => Alias,
       'entryType' => EntryType,
       'algorithm' => Algorithm,
       'format' => Format,
       'chain' => Chain
     }.

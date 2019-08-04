-module(openapi_truststore_items).

-export([encode/1]).

-export_type([openapi_truststore_items/0]).

-type openapi_truststore_items() ::
    #{ 'alias' => binary(),
       'entryType' => binary(),
       'subject' => binary(),
       'issuer' => binary(),
       'notBefore' => binary(),
       'notAfter' => binary(),
       'serialNumber' => integer()
     }.

encode(#{ 'alias' := Alias,
          'entryType' := EntryType,
          'subject' := Subject,
          'issuer' := Issuer,
          'notBefore' := NotBefore,
          'notAfter' := NotAfter,
          'serialNumber' := SerialNumber
        }) ->
    #{ 'alias' => Alias,
       'entryType' => EntryType,
       'subject' => Subject,
       'issuer' => Issuer,
       'notBefore' => NotBefore,
       'notAfter' => NotAfter,
       'serialNumber' => SerialNumber
     }.

-module(openapi_keystore_chain_items).

-export([encode/1]).

-export_type([openapi_keystore_chain_items/0]).

-type openapi_keystore_chain_items() ::
    #{ 'subject' => binary(),
       'issuer' => binary(),
       'notBefore' => binary(),
       'notAfter' => binary(),
       'serialNumber' => integer()
     }.

encode(#{ 'subject' := Subject,
          'issuer' := Issuer,
          'notBefore' := NotBefore,
          'notAfter' := NotAfter,
          'serialNumber' := SerialNumber
        }) ->
    #{ 'subject' => Subject,
       'issuer' => Issuer,
       'notBefore' => NotBefore,
       'notAfter' => NotAfter,
       'serialNumber' => SerialNumber
     }.

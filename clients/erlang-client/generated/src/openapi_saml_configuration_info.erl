-module(openapi_saml_configuration_info).

-export([encode/1]).

-export_type([openapi_saml_configuration_info/0]).

-type openapi_saml_configuration_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'bundle_location' => binary(),
       'service_location' => binary(),
       'properties' => openapi_saml_configuration_properties:openapi_saml_configuration_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'bundle_location' := BundleLocation,
          'service_location' := ServiceLocation,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'bundle_location' => BundleLocation,
       'service_location' => ServiceLocation,
       'properties' => Properties
     }.

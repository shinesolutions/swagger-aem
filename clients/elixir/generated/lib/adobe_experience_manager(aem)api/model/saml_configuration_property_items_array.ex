# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManager(AEM)API.Model.SamlConfigurationPropertyItemsArray do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"name",
    :"optional",
    :"is_set",
    :"type",
    :"values",
    :"description"
  ]

  @type t :: %__MODULE__{
    :"name" => String.t | nil,
    :"optional" => boolean() | nil,
    :"is_set" => boolean() | nil,
    :"type" => integer() | nil,
    :"values" => [String.t] | nil,
    :"description" => String.t | nil
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManager(AEM)API.Model.SamlConfigurationPropertyItemsArray do
  def decode(value, _options) do
    value
  end
end


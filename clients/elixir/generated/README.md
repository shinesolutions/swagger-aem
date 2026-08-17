# AdobeExperienceManager(AEM)API

Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

## Building

To install the required dependencies and to build the elixir project, run:

```console
mix local.hex --force
mix do deps.get, compile
```

## Installation

If [available in Hex][], the package can be installed by adding `adobe_experience_manager(aem)api` to
your list of dependencies in `mix.exs`:

```elixir
def deps do
  [{:"adobe_experience_manager(aem)api", "~> 1.0.0"}]
end
```

Documentation can be generated with [ExDoc][] and published on [HexDocs][]. Once published, the docs can be found at
[https://hexdocs.pm/adobe_experience_manager(aem)api][docs].

## Configuration

You can override the URL of your server (e.g. if you have a separate development and production server in your
configuration files).

```elixir
config :adobe_experience_manager(aem)api, base_url: "http://localhost"
```

Multiple clients for the same API with different URLs can be created passing different `base_url`s when calling
`AdobeExperienceManager(AEM)API.Connection.new/1`:

```elixir
client = AdobeExperienceManager(AEM)API.Connection.new(base_url: "http://localhost")
```

[exdoc]: https://github.com/elixir-lang/ex_doc
[hexdocs]: https://hexdocs.pm
[available in hex]: https://hex.pm/docs/publish
[docs]: https://hexdocs.pm/adobe_experience_manager(aem)api

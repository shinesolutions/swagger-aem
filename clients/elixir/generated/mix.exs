defmodule AdobeExperienceManager(AEM)API.Mixfile do
  use Mix.Project

  def project do
    [
      app: :"adobe_experience_manager(aem)api",
      version: "1.0.0",
      elixir: "~> 1.18",
      build_embedded: Mix.env() == :prod,
      start_permanent: Mix.env() == :prod,
      package: package(),
      description: """
      Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
      """,
      deps: deps()
    ]
  end

  # Configuration for the OTP application
  #
  # Type "mix help compile.app" for more information
  def application do
    # Specify extra applications you'll use from Erlang/Elixir
    [extra_applications: [:logger]]
  end

  # Dependencies can be Hex packages:
  #
  #   {:my_dep, "~> 0.3.0"}
  #
  # Or git/path repositories:
  #
  #   {:my_dep, git: "https://github.com/elixir-lang/my_dep.git", tag: "0.3.0"}
  #
  # Type "mix help deps" for more examples and options
  defp deps do
    [
      {:tesla, "~> 1.14"},
      {:ex_doc, "~> 0.37.3", only: :dev, runtime: false},
      {:dialyxir, "~> 1.4", only: [:dev, :test], runtime: false}
    ]
  end

   defp package do
      [
        name: "adobe_experience_manager(aem)api",
        files: ~w(.formatter.exs config lib mix.exs README* LICENSE*),
      ]
  end
end

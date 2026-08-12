# OpenAPI Client Generator Project Standards

This repository contains an OpenAPI client generation project following a
unified standard for tooling, build automation, and coding conventions.

The key components of the standard include:

- Build automation (Swaggy C)
- API client generation (OpenAPI Generator)
- Multi-language primary targets (JavaScript, Python, Ruby)
- Contract-first API workflows (specification-driven)
- Documentation generation (Bootprint)

This document outlines the common conventions that apply across OpenAPI client
generator projects.

## Runtime & Dependencies

- **Node.js Version**: 22+
- **Container Runtime**: Docker
- **Primary Language Toolchains**: npm, Python, Ruby
- **Configuration Tooling**: yq

### Adding Dependencies

```bash
npm install package_name          # Add Node.js dependency
npm install --save-dev pkg_name   # Add Node.js development dependency
make deps                         # Pull generator image and install toolchain deps
```

## Project Structure

```text
project/
├── clients/                  # Generated client outputs per generator
├── specification/            # OpenAPI specifications
├── test/                     # Multi-language tests (javascript/python/ruby)
├── .github/                  # GitHub workflows
├── Makefile                  # Build automation (Swaggy C)
├── swaggy-c.yml              # Swaggy C project configuration
└── README.md                 # Project README
```

## Build Automation (Swaggy C)

This project uses **Swaggy C** as a standard build automation tool for
specification-driven API client generation.

### Common Commands

```bash
make ci                    # Full validation/generate/build/test/doc pipeline
make clean                 # Remove generated outputs and stage files
make deps                  # Pull generator images and install dependencies
make init-spec             # Initialize local spec from file path or URL
make init-generators-config # Initialize generator config for all targets
make generate-primary      # Generate JavaScript/Python/Ruby clients
make build-javascript      # Build JavaScript client
make build-python          # Build Python client
make build-ruby            # Build Ruby client
make test-javascript       # Test JavaScript client and fixtures
make test-python           # Test Python client and fixtures
make test-ruby             # Test Ruby client and fixtures
make doc                   # Generate API documentation
```

### Update Targets

```bash
make update-to-latest      # Update Makefile to latest Swaggy C main
make update-to-version     # Update Makefile to a specific Swaggy C version
```

## Development Environment

This project is designed to be developed in a consistent environment via Docker
image `cliffano/studio`.

You can run the container using: `docker run --rm --workdir /opt/workspace -v /var/run/docker.sock:/var/run/docker.sock -v $PWD:/opt/workspace -i -t cliffano/studio` and then run the build commands inside the container.

## Code Style and Linting

Applies to: `.github/workflows/**/*.yml`, `.github/workflows/**/*.yaml`, `specification/**/*.yml`, `specification/**/*.yaml`, `swaggy-c.yml`, `Makefile`

- Keep OpenAPI specification changes explicit and backward-compatible when possible
- Keep generator config updates small and reproducible

### Specification-First Development

- Treat the OpenAPI specification as the source of truth
- Keep schema changes explicit and reviewable
- Avoid hidden behavior changes in generated clients by documenting spec updates

### Style & Formatting

#### YAML and Workflow Files

Guidelines:

- Use two-space indentation in YAML files
- Keep workflow conditions and expressions readable
- Prefer explicit keys and step names in workflows
- Keep shell fragments small and deterministic

#### Makefile and Generator Config

Guidelines:

- Keep generation/build/test targets composable
- Prefer clear variable names for generator and version values
- Avoid hardcoded local-only paths when shared config variables exist

### Generation Conventions

- Use `generate-primary` for routine CI flows unless all generators are required
- Keep language-specific build/test behavior isolated to dedicated targets
- Ensure generated client paths remain stable across runs

### Validation

- Treat pipeline failures as contract or build regressions
- Validate spec initialization and generation before testing
- Keep workflow changes aligned with Makefile target behavior

## Testing

Applies to: `test/javascript/**/*.js`, `test/python/**/*.py`, `test/ruby/**/*.rb`, `.github/workflows/**/*.yml`, `.github/workflows/**/*.yaml`

- Language-specific tests live in `test/javascript/`, `test/python/`, and `test/ruby/`
- Run tests with `make test` or language-specific targets

### Test Structure

- JavaScript tests live in `test/javascript/`
- Python tests live in `test/python/`
- Ruby tests live in `test/ruby/`
- Keep fixtures deterministic and tied to stable spec behavior

### Running Tests

```bash
make test               # Run all primary language tests
make test-javascript    # Run JavaScript tests only
make test-python        # Run Python tests only
make test-ruby          # Run Ruby tests only
```

### Test Expectations

- Validate generated client behavior, not generator internals
- Assert exact values for deterministic transformations
- Keep tests resilient to formatting-only regeneration
- Fail fast when required outputs or artifacts are missing

### Regression Prevention

When specification or generator configuration changes:

1. Run `make init-spec`
2. Run `make generate-primary`
3. Run `make test`
4. Regenerate docs with `make doc` when API surface changes

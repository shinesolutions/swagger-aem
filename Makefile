################################################################
# Swaggy C: A Makefile for generating API clients using OpenAPI Generator
# https://github.com/oapicf/swaggy-c
################################################################

# Swaggy C info
SWAGGY_C_VERSION = 6.3.0

# The version of OpenAPI Generator (https://openapi-generator.tech/) used for generating the API clients
OPENAPI_GENERATOR_VERSION = 7.24.0

UPDATE_GH_ID = oapicf
UPDATE_MAKEFILE = swaggy-c
UPDATE_GENERATOR = openapi-generator
UPDATE_DOTFILES = .github/. .gitignore .rtk.json AGENTS.md
UPDATE_PARTIALS = AVATAR BADGES BUILD_REPORTS DEVELOPERS_GUIDE

# GENERATORS_ALL lists the generators supported by the given OPENAPI_GENERATOR_VERSION
GENERATORS_ALL = ada ada-server android apache2 apex asciidoc aspnet-fastendpoints aspnetcore avro-schema bash crystal c clojure cwiki cpp-httplib-server cpp-boost-beast-client cpp-oatpp-client cpp-qt-client cpp-qt-qhttpengine-server cpp-oatpp-server cpp-pistache-server cpp-restbed-server cpp-restbed-server-deprecated cpp-restsdk cpp-tiny cpp-tizen cpp-ue4 csharp csharp-functions dart dart-dio eiffel elixir elm erlang-client erlang-proper erlang-server fsharp-functions fsharp-giraffe-server gdscript go go-echo-server go-server go-gin-server graphql-schema graphql-nodejs-express-server groovy haskell-http-client haskell haskell-yesod java java-dubbo jaxrs-cxf-client java-helidon-client java-helidon-server java-inflector java-micronaut-client java-micronaut-server java-msf4j java-pkmst java-play-framework java-undertow-server java-vertx-web java-camel jaxrs-cxf jaxrs-cxf-extended jaxrs-cxf-cdi jaxrs-jersey java-microprofile jaxrs-resteasy jaxrs-resteasy-eap jaxrs-spec javascript javascript-flowtyped javascript-closure-angular java-wiremock jetbrains-http-client jmeter julia-client julia-server k6 kotlin kotlin-misk kotlin-server kotlin-spring kotlin-vertx kotlin-wiremock ktorm-schema lua markdown mysql-schema n4js nim nodejs-express-server objc ocaml openapi openapi-yaml plantuml perl php php-flight php-nextgen php-lumen php-slim4 php-symfony php-mezzio-ph php-dt php-laravel postgresql-schema postman-collection powershell protobuf-schema python python-pydantic-v1 python-fastapi python-flask python-aiohttp python-blueplanet r ruby ruby-nextgen ruby-on-rails ruby-sinatra rust-axum rust rust-salvo rust-server rust-server-deprecated scalatra scala-akka scala-cask scala-pekko scala-akka-http-server scala-gatling scala-http4s scala-http4s-server scala-play-server scala-sttp scala-sttp4 scala-sttp4-jsoniter scalaz spring dynamic-html html html2 swift6 swift-combine terraform-provider typescript typescript-angular typescript-aurelia typescript-axios typescript-fetch typescript-inversify typescript-jquery typescript-nestjs typescript-nestjs-server typescript-node typescript-redux-query typescript-rxjs wsdl-schema xojo-client zapier

# GENERATORS_PRIMARY lists the generators which will be built and published to public package registries
GENERATORS_PRIMARY = javascript python ruby

# The location where OpenAPI specification file will be placed within the project
LOCAL_SPEC_PATH = stage/specification.yml

################################################################
# User configuration variables
# https://github.com/oapicf/swaggy-c#configuration
# Configuration variables should be stored in swaggy-c.yml config file

# SPEC_URI is the file path or URL where the OpenAPI specification is located, for example:
# - local file path: spec/some-app.yaml
# - remote URL: https://some-app.com/some-app.yaml
SPEC_URI=$(shell yq .spec_uri swaggy-c.yml)

# APP_VERSION is version of the application using Swaggy C
APP_VERSION ?= $(shell yq .version swaggy-c.yml)

# Contact details to be amended to the OpenAPI specification .info.contact.* properties
CONTACT_NAME ?= $(shell yq .contact.name swaggy-c.yml)
CONTACT_URL ?= $(shell yq .contact.url swaggy-c.yml)
CONTACT_EMAIL ?= $(shell yq .contact.email swaggy-c.yml)

# SCM details to be amended to the OpenAPI Generator configuration .git_* properties
SCM_GIT_USER ?= $(shell yq .scm.git_user swaggy-c.yml)
SCM_GIT_REPO ?= $(shell yq .scm.git_repo swaggy-c.yml)

# APP_BASE_DIR is the absolute path where the application base directory is located, for example:
# - MacOS user workspace as a local directory: /Users/some-user/some-path/some-app
#   This is used when no environment variable is specified.
# - GitHub Actions workspace directory: /home/runner/work/some-app/some-app
#   This is used when GITHUB_ACTIONS environment variable is specified.
# - Custom directory to overwrite the other directories: /any/path/to/some-app
#   This is used when CUSTOM environment variable is specified.
ifdef CUSTOM
APP_BASE_DIR=$(shell yq .base_dir.custom swaggy-c.yml)
else
  ifdef GITHUB_ACTIONS
	APP_BASE_DIR=$(shell yq .base_dir.github_actions swaggy-c.yml)
	else
  APP_BASE_DIR=$(shell yq .base_dir.local swaggy-c.yml)
	endif
endif

$(info ################################################################)
$(info Building Swaggy C application with user configurations...)
$(info - OpenAPI specification URI = ${SPEC_URI})
$(info - Application version = ${APP_VERSION})
$(info - Application base directory = ${APP_BASE_DIR})

define python_venv
	. .venv/bin/activate && $(1)
endef

################################################################
# Base targets

# CI target to be executed by CI/CD tool
ci: clean deps init-spec generate build-javascript build-python build-ruby test-javascript test-python test-ruby doc

# All target as an alias for CI target
all: ci

# Ensure stage directory exists
stage:
	mkdir -p stage stage/gh-pages/

# Remove all generated API clients code
clean:
	rm -rf stage/ clients/*/generated

# Retrieve the OpenAPI Generator Docker image and npm modules
deps:
	docker pull openapitools/openapi-generator-cli:v$(OPENAPI_GENERATOR_VERSION)
	npm install -g bootprint bootprint-openapi gh-pages
	$(call deps_extra)

deps-extra-apt:
	apt-get install -y markdownlint

deps-upgrade:
	echo "PLACEHOLDER"

# Initialise OpenAPI specification from either a local file path or a remote URL
# This target requires the following parameters to be supplied by user
# - SPEC_URI parameter
# - CONTACT_NAME parameter
# - CONTACT_ parameter
# - CONTACT_NAME parameter
init-spec: stage
	if test $(findstring https, $(SPEC_URI)); then \
	  curl $(SPEC_URI) --output $(LOCAL_SPEC_PATH); \
	else \
	  cp $(SPEC_URI) $(LOCAL_SPEC_PATH); \
	fi
	yq -i '.info.contact.name = "$(CONTACT_NAME)" | .info.contact.url = "$(CONTACT_URL)" | .info.contact.email = "$(CONTACT_EMAIL)"' "$(LOCAL_SPEC_PATH)"

# Shows a list of available generators supported by the given OPENAPI_GENERATOR_VERSION
# Output is a space-separated list of generator names to be used in GENERATORS_ALL variable
list-generators:
	docker \
		run \
		--rm \
		-v .:/local openapitools/openapi-generator-cli:v$(OPENAPI_GENERATOR_VERSION) \
		list --short | tr ',' ' '

# Initialise basic configuration file for all generators
init-generators-config:
	for generator in ${GENERATORS_ALL} ; do \
	  if [ ! -d clients/$$generator ]; then \
	    mkdir -p clients/$$generator/; \
	    echo "{\n  \"gitUserId\": \"$(SCM_GIT_USER)\",\n  \"gitRepoId\": \"$(SCM_GIT_REPO)\"\n}" > clients/$$generator/conf.json; \
	  fi; \
	done

################################################################
# API clients generate targets

# Alias for generate-all target
generate: generate-all

# Generate API clients for all generators, this is separate from generate-primary target in order to
# reduce the build time when processing primary generators
# This target requires APP_BASE_DIR parameter to be supplied by user
generate-all:
	for generator in ${GENERATORS_ALL} ; do \
	  docker \
		  run \
		  --rm \
		  -v $(APP_BASE_DIR):/local openapitools/openapi-generator-cli:v$(OPENAPI_GENERATOR_VERSION) \
		  generate \
		  --input-spec /local/$(LOCAL_SPEC_PATH) \
		  --config /local/clients/$$generator/conf.json \
		  --generator-name $$generator \
		  --output /local/clients/$$generator/generated; \
	done
	$(call run_hook,x-post-generate-all)

# Generate API clients for primary generators only
# This target requires APP_BASE_DIR parameter to be supplied by user
generate-primary:
	for generator in ${GENERATORS_PRIMARY} ; do \
	  docker \
		  run \
		  --rm \
		  -v $(APP_BASE_DIR):/local openapitools/openapi-generator-cli:v$(OPENAPI_GENERATOR_VERSION) \
		  generate \
		  --input-spec /local/$(LOCAL_SPEC_PATH) \
		  --config /local/clients/$$generator/conf.json \
		  --generator-name $$generator \
		  --output /local/clients/$$generator/generated; \
	done
	$(call run_hook,x-post-generate-primary)

################################################################
# API clients building targets for primary generators

build-javascript: UPDATE_GENERATOR_INPUTS_GITHUB_ID = $(shell yq .generator.inputs.github_id $(UPDATE_MAKEFILE).yml)
build-javascript: UPDATE_GENERATOR_INPUTS_GITHUB_REPO = $(shell yq .generator.inputs.github_repo $(UPDATE_MAKEFILE).yml)
build-javascript:
	$(call run_hook,x-pre-build-javascript)
	npm install -g babel-cli
	cd clients/javascript/generated/ && \
	  yq -i '.repository.url = "https://github.com/$(UPDATE_GENERATOR_INPUTS_GITHUB_ID)/$(UPDATE_GENERATOR_INPUTS_GITHUB_REPO)"' package.json && \
	  npm install && \
	  npm link && \
	  npm run build

build-python:
	$(call run_hook,x-pre-build-python)
	cd clients/python/generated/ && \
	  python3 -m venv .venv && \
	  $(call python_venv,pip install twine wheel pytest setuptools) && \
	  $(call python_venv,pip install -r requirements.txt) && \
	  $(call python_venv,python3 setup.py sdist bdist_wheel) && \
	  $(call python_venv,python3 setup.py install --single-version-externally-managed --record record.txt)

build-ruby:
	$(call run_hook,x-pre-build-ruby)
	apt-get install libyaml-dev
	cd clients/ruby/generated/ && \
	  rm -f *.gem && \
	  gem install bundler && \
	  bundle install && \
	  bundle binstubs --all && \
	  gem build *.gemspec && \
	  gem install ./*.gem

################################################################
# API clients testing targets for primary generators

# Test target is a convenience target to run tests for all primary generators
test: test-javascript test-python test-ruby

test-javascript: build-javascript
	$(call run_hook,x-pre-test-javascript)
	npm install validator
	cd clients/javascript/generated/ && \
	  npm install --dev && \
	  npm run test
	cd test/javascript/ && \
	  npm link ../../clients/javascript/generated/ && \
	  ../../clients/javascript/generated/node_modules/.bin/mocha --timeout 5000 .

test-python: build-python
	cd clients/python/generated/ && \
	  $(call python_venv,pip install validators) && \
	  $(call python_venv,twine check dist/*) && \
	  $(call python_venv,pytest -v ../../../test/python/*.py --capture=no)

test-ruby: build-ruby
	cd clients/ruby/generated/ && \
	  rm -f *.gem && \
	  bundle exec rspec --format documentation && \
	  bundle exec rspec ../../../test/ruby/ --format documentation

test-examples:
	mkdir -p stage/test-examples/
	cd examples && \
	for f in *.sh; do \
	  bash -x "$$f"; \
	done

################################################################
# API clients package publishing targets for primary generators

publish-javascript: build-javascript
	cd clients/javascript/generated/ && \
	  npm publish

publish-python: build-python
	cd clients/python/generated/ && \
	  $(call python_venv,twine upload dist/*)

publish-ruby: build-ruby
	cd clients/ruby/generated/ && \
	  gem push `ls *.gem`

################################################################
# Documentation targets

# Alias for doc-latest target
doc: doc-latest

# Generate API documentation locally as the latest version
doc-latest: stage
	bootprint openapi $(LOCAL_SPEC_PATH) stage/gh-pages/api/latest/

# Generate API documentation locally as the application's version
# This target requires APP_VERSION parameter to be supplied by user
doc-version: stage
	bootprint openapi $(LOCAL_SPEC_PATH) stage/gh-pages/api/$(APP_VERSION)/

################################################################
# MAKE IT SO - Utility Makefile functions and targets
################################################################

define run_hook
	@if [ -f Makefile-extras ] && grep -q "^$(1):" Makefile-extras; then \
		$(MAKE) -f Makefile-extras $(1); \
	fi
endef

define deps_extra
	@if command -v apt-get > /dev/null 2>&1; then \
		if [ "$$(id -u)" = "0" ]; then \
			$(MAKE) deps-extra-apt; \
		else \
			sudo $(MAKE) deps-extra-apt; \
		fi; \
	fi
endef

define update_dotfiles_from_generator
	cd stage/ && \
	  rm -rf generator-$(1)/ && \
	  git clone https://github.com/$(UPDATE_GH_ID)/generator-$(1) && \
	  cd generator-$(1) && \
	  make deps && \
	  node_modules/.bin/plop $(UPDATE_GENERATOR_COMPONENT) -- \
	    --project_id "$(UPDATE_GENERATOR_INPUTS_PROJECT_ID)" \
		--project_name "$(UPDATE_GENERATOR_INPUTS_PROJECT_NAME)" \
		--project_desc "$(UPDATE_GENERATOR_INPUTS_PROJECT_DESC)" \
		--author_name "$(UPDATE_GENERATOR_INPUTS_AUTHOR_NAME)" \
		--author_email "$(UPDATE_GENERATOR_INPUTS_AUTHOR_EMAIL)" \
		--author_url "$(UPDATE_GENERATOR_INPUTS_AUTHOR_URL)" \
		--github_id "$(UPDATE_GENERATOR_INPUTS_GITHUB_ID)" \
		--github_repo "$(UPDATE_GENERATOR_INPUTS_GITHUB_REPO)" \
		--github_token_prefix "$(UPDATE_GENERATOR_INPUTS_GITHUB_TOKEN_PREFIX)"
	cd stage/generator-$(1)/stage/$(UPDATE_GENERATOR_COMPONENT) && \
	  for dotfile in $(2); do \
		cp -R "$$dotfile" ../../../../"$$dotfile"; \
	  done
endef

define update_partials_from_generator
	cd stage/ && \
	  rm -rf generator-$(1)/ && \
	  git clone https://github.com/$(UPDATE_GH_ID)/generator-$(1) && \
	  cd generator-$(1) && \
	  make deps && \
	  node_modules/.bin/plop $(UPDATE_GENERATOR_COMPONENT)-partials -- \
	    --project_id "$(UPDATE_GENERATOR_INPUTS_PROJECT_ID)" \
		--project_name "$(UPDATE_GENERATOR_INPUTS_PROJECT_NAME)" \
		--project_desc "$(UPDATE_GENERATOR_INPUTS_PROJECT_DESC)" \
		--author_name "$(UPDATE_GENERATOR_INPUTS_AUTHOR_NAME)" \
		--author_email "$(UPDATE_GENERATOR_INPUTS_AUTHOR_EMAIL)" \
		--author_url "$(UPDATE_GENERATOR_INPUTS_AUTHOR_URL)" \
		--github_id "$(UPDATE_GENERATOR_INPUTS_GITHUB_ID)" \
		--github_repo "$(UPDATE_GENERATOR_INPUTS_GITHUB_REPO)" \
		--github_token_prefix "$(UPDATE_GENERATOR_INPUTS_GITHUB_TOKEN_PREFIX)"
	for block in $(2); do \
	  partial_file=$$(printf "%s" "$$block" | tr "A-Z" "a-z"); \
	  ex -s \
	    -c "/<!-- BEGIN:$$block -->/+1,/<!-- END:$$block -->/-1d" \
	    -c "/<!-- BEGIN:$$block -->/r stage/generator-$(1)/stage/$(UPDATE_GENERATOR_COMPONENT)-partials/$$partial_file.txt" \
	    -c 'wq' \
	    README.md; \
	done
endef

define set_generator_vars
$(1): UPDATE_GENERATOR_COMPONENT = $$(shell yq .generator.component $(2).yml)
$(1): UPDATE_GENERATOR_INPUTS_PROJECT_ID = $$(shell yq .generator.inputs.project_id $(2).yml)
$(1): UPDATE_GENERATOR_INPUTS_PROJECT_NAME = $$(shell yq .generator.inputs.project_name $(2).yml)
$(1): UPDATE_GENERATOR_INPUTS_PROJECT_DESC = $$(shell yq .generator.inputs.project_desc $(2).yml)
$(1): UPDATE_GENERATOR_INPUTS_AUTHOR_NAME = $$(shell yq .generator.inputs.author_name $(2).yml)
$(1): UPDATE_GENERATOR_INPUTS_AUTHOR_EMAIL = $$(shell yq .generator.inputs.author_email $(2).yml)
$(1): UPDATE_GENERATOR_INPUTS_AUTHOR_URL = $$(shell yq .generator.inputs.author_url $(2).yml)
$(1): UPDATE_GENERATOR_INPUTS_GITHUB_ID = $$(shell yq .generator.inputs.github_id $(2).yml)
$(1): UPDATE_GENERATOR_INPUTS_GITHUB_REPO = $$(shell yq .generator.inputs.github_repo $(2).yml)
$(1): UPDATE_GENERATOR_INPUTS_GITHUB_TOKEN_PREFIX = $$(shell yq .generator.inputs.github_token_prefix $(2).yml)
endef

# Update Makefile to the latest version tag
update-to-latest: UPDATE_TARGET_VERSION = $(shell curl -s https://api.github.com/repos/$(UPDATE_GH_ID)/$(UPDATE_MAKEFILE)/tags | jq -r '.[0].name')
update-to-latest: update-to-version

# Update Makefile to the main branch
update-to-main:
	curl https://raw.githubusercontent.com/$(UPDATE_GH_ID)/$(UPDATE_MAKEFILE)/main/src/Makefile-$(UPDATE_MAKEFILE) -o Makefile

# Update Makefile to the version defined in UPDATE_TARGET_VERSION parameter
update-to-version:
	curl https://raw.githubusercontent.com/$(UPDATE_GH_ID)/$(UPDATE_MAKEFILE)/$(UPDATE_TARGET_VERSION)/src/Makefile-$(UPDATE_MAKEFILE) -o Makefile

# Update dotfiles using the generator
$(eval $(call set_generator_vars,update-dotfiles,$(UPDATE_MAKEFILE)))
update-dotfiles: stage
	$(call update_dotfiles_from_generator,$(UPDATE_GENERATOR),$(UPDATE_DOTFILES))
	$(call run_hook,x-post-update-dotfiles)

# Update partial snippets using the generator
$(eval $(call set_generator_vars,update-partials,$(UPDATE_MAKEFILE)))
update-partials: stage
	$(call update_partials_from_generator,$(UPDATE_GENERATOR),$(UPDATE_PARTIALS))

release-major:
	rtk release --release-increment-type major

release-minor:
	rtk release --release-increment-type minor

release-patch:
	rtk release --release-increment-type patch

################################################################

.PHONY: $(1) all test ci stage clean deps init-spec init-generators-config generate generate-all generate-primary build-javascript build-python build-ruby test-javascript test-python test-ruby publish-javascript publish-python publish-ruby doc doc-latest doc-version update-to-latest update-dotfiles update-partials
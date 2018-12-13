LANGS = java javascript python ruby

ci: clean tools lint build-docker doc

clean:
	rm -rf doc

doc:
	bootprint openapi conf/api.yml doc/api/master/

doc-publish:
	gh-pages --dist doc/

lint:
	swagger-cli validate conf/*.yml

tools:
	npm install -g bootprint bootprint-openapi gh-pages swagger-cli swaggy-c
	docker pull cliffano/swaggy-c

################################################################################
# Targets for generating API client for the supported languages.
################################################################################

# generate Java API client
java:
	$(call build, java-clean java-gen java-deps java-test java-build java-install)

# generate JavaScript/node.js API client
javascript:
	$(call build, javascript-clean javascript-gen javascript-deps javascript-install)

# generate Python API client
python:
	$(call build, python-clean python-gen python-deps python-test python-build python-install)

# generate Ruby API client
ruby:
	$(call build, ruby-clean ruby-gen ruby-deps ruby-test ruby-build ruby-install)

define build
	swaggy-c \
    $(if $(SWAGGER_CODEGEN_CLI_JAR), --jar $(SWAGGER_CODEGEN_CLI_JAR)) \
		--api-spec conf/api.yml \
		--conf-file {lang}/conf/client.json \
		--out-dir {lang}/generated/ \
		--log-dir {lang}/log/ \
		$(1)
endef

# generate all API clients using Swaggy-C on the host server
build: $(LANGS)

# generate all API clients via Swaggy-C within a Docker container
build-docker:
	docker run \
 	  --rm \
	  --workdir /opt/workspace \
	  -v `pwd`:/opt/workspace \
	  -t cliffano/swaggy-c \
	  make $(LANGS) \
	  SWAGGER_CODEGEN_CLI_JAR=/opt/swagger-codegen/repo/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar

.PHONY: ci clean doc doc-publish lint tools java javascript python ruby build build-docker

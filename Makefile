LANGS = java javascript python ruby

ci: clean tools lint build-docker doc

clean:
	rm -rf doc

doc:
	bootprint openapi conf/api.yml doc/api/master/

doc-publish:
	gh-pages --dist doc/

lint:
	swagger validate conf/*.yml

tools:
	npm install -g bootprint bootprint-openapi gh-pages swagger-cli swaggy-c
	docker pull cliffano/swaggy-c

define build
	swaggy-c \
    $(if $(SWAGGER_CODEGEN_CLI_JAR), --jar $(SWAGGER_CODEGEN_CLI_JAR)) \
		--api-spec conf/api.yml \
		--conf-file {lang}/conf/client.json \
		--out-dir {lang}/generated/ \
		--log-dir {lang}/log/ \
		$(1)
endef

java:
	$(call build, java-clean java-gen java-deps java-test java-build java-install)

javascript:
	$(call build, javascript-clean javascript-gen javascript-deps javascript-install)
	
python:
	$(call build, python-clean python-gen python-deps python-test python-build python-install)

ruby:
	$(call build, ruby-clean ruby-gen ruby-deps ruby-test ruby-build ruby-install)

build: $(LANGS)

build-docker:
	docker run \
 	  --rm \
	  --workdir /opt/workspace \
	  -v `pwd`:/opt/workspace \
	  -t cliffano/swaggy-c \
	  make $(LANGS) \
	  SWAGGER_CODEGEN_CLI_JAR=/opt/swagger-codegen/repo/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar

.PHONY: $(LANGS) all build build-docker ci clean doc doc-publish lint tools

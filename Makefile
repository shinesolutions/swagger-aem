# OpenAPI Generator supported languages except Python and Ruby since they're handled by separate build targets
LANGS = ada ada-server android apache2 apex aspnetcore bash clojure cwiki cpp-qt5 cpp-qt5-qhttpengine-server cpp-pistache-server cpp-restbed-server cpp-restsdk cpp-tizen csharp csharp-dotnet2 csharp-nancyfx dart eiffel elixir elm erlang-client erlang-server flash scala-finch go go-server groovy kotlin kotlin-server haskell-http-client haskell java jaxrs-cxf-client java-inflector java-msf4j java-pkmst java-play-framework java-undertow-server java-vertx jaxrs-cxf jaxrs-cxf-cdi jaxrs-jersey jaxrs-resteasy jaxrs-resteasy-eap jaxrs-spec javascript javascript-flowtyped javascript-closure-angular jmeter lua nodejs-server objc openapi openapi-yaml perl php php-laravel php-lumen php-slim php-silex php-symfony php-ze-ph powershell python-flask r ruby-on-rails ruby-sinatra rust rust-server scalatra scala-akka scala-httpclient scala-gatling scala-lagom-server scalaz spring dynamic-html html html2 swift2-deprecated swift3 swift4 typescript-angular typescript-angularjs typescript-aurelia typescript-fetch typescript-inversify typescript-jquery typescript-node

ci: clean deps openapi-generator-version lint generate doc
ci-python: clean deps-python openapi-generator-version lint generate-python doc
ci-ruby: clean deps-ruby openapi-generator-version lint generate-ruby doc

clean:
	rm -rf doc stage

stage:
	mkdir -p stage

deps: stage
	npm install .
	wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/5.2.1/openapi-generator-cli-5.2.1.jar -O stage/openapi-generator-cli.jar

deps-python: stage
	npm install .
	wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/5.1.0/openapi-generator-cli-5.1.0.jar -O stage/openapi-generator-cli.jar

deps-ruby: stage
	npm install .
	wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/4.3.1/openapi-generator-cli-4.3.1.jar -O stage/openapi-generator-cli.jar

openapi-generator-version:
	java -jar stage/openapi-generator-cli.jar --version

lint:
	node_modules/.bin/swagger-cli validate conf/*.yml
	node_modules/.bin/jsonlint clients/java/conf/client.json
	node_modules/.bin/jsonlint clients/javascript/conf/client.json
	node_modules/.bin/jsonlint clients/python/conf/client.json
	node_modules/.bin/jsonlint clients/ruby/conf/client.json

doc:
	node_modules/.bin/bootprint openapi conf/api.yml doc/api/master/

doc-publish:
	node_modules/.bin/gh-pages --dist doc/

release-major:
	rtk release --release-increment-type major

release-minor:
	rtk release --release-increment-type minor

release-patch:
	rtk release --release-increment-type patch

release: release-minor

################################################################################
# Targets for generating API client for the supported languages.
################################################################################

# generate Java API client
java:
	cd clients/java && make ci && cd ..

# generate JavaScript/node.js API client
javascript:
	cd clients/javascript && make ci && cd ..

# generate Python API client
python:
	cd clients/python && make ci && cd ..

# generate Ruby API client
ruby:
	cd clients/ruby && make ci && cd ..

genxyz:
	for lang in ${LANGS} ; do \
		pwd; \
		mkdir -p clients/$$lang/conf/; \
		echo "{}" >> clients/$$lang/conf/client.json; \
		cd clients/$$lang; \
		pwd; \
		cd ../..; \
	done

generate:
	for lang in ${LANGS} ; do \
		java -jar stage/openapi-generator-cli.jar generate \
		  --input-spec conf/api.yml \
		  --config clients/$$lang/conf/client.json \
		  --generator-name $$lang \
		  --output clients/$$lang/generated/; \
	done

generate-python:
	java -jar stage/openapi-generator-cli.jar generate \
		--input-spec conf/api.yml \
		--config clients/python/conf/client.json \
		--generator-name python \
		--output clients/python/generated/

generate-ruby:
	lang=ruby
	java -jar stage/openapi-generator-cli.jar generate \
		--input-spec conf/api.yml \
		--config clients/ruby/conf/client.json \
		--generator-name ruby \
		--output clients/ruby/generated/


.PHONY: ci ci-python ci-ruby clean stage deps deps-python deps-ruby openapi-generator-version lint doc doc-publish release release-major release-minor release-patch generate generate-python generate-ruby $(LANGS)

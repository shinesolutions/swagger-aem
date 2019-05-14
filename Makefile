LANGS = java javascript python ruby
LANGS = ruby

ci: clean deps lint $(LANGS) doc

clean:
	rm -rf doc

deps:
	npm install -g bootprint@1.0.2 bootprint-openapi@1.1.1 gh-pages@2.0.1 jsonlint@1.6.3 swagger-cli@2.2.1 swaggy-c@0.1.0
	docker pull openapitools/openapi-generator-cli:v3.3.4

lint:
	swagger-cli validate conf/*.yml
	jsonlint java/conf/client.json
	jsonlint javascript/conf/client.json
	jsonlint python/conf/client.json
	jsonlint ruby/conf/client.json

doc:
	bootprint openapi conf/api.yml doc/api/master/

doc-publish:
	gh-pages --dist doc/

################################################################################
# Targets for generating API client for the supported languages.
################################################################################

# generate Java API client
java:
	$(call build, java, java-clean java-gen java-deps java-test java-build java-install)

# generate JavaScript/node.js API client
javascript:
	$(call build, javascript, javascript-clean javascript-gen javascript-deps javascript-install)

# generate Python API client
python:
	$(call build, python, python-clean python-gen python-deps python-test python-build python-install)

# generate Ruby API client
ruby:
	cd ruby && make ci && cd ..

release:
	rtk release

.PHONY: ci clean deps lint doc doc-publish java javascript python ruby release

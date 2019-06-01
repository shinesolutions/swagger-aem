ifndef SWAGGER_CODEGEN_CLI_JAR
	SWAGGER_CODEGEN = swagger-codegen
else
	SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_CLI_JAR)
endif

all: deps clean build install test-unit test-integration doc

deps:
	pip install -r requirements-dev.txt

clean:
	rm -rf generated/

build:
	$(SWAGGER_CODEGEN) generate \
	  --input-spec ../conf/api.yml \
		--lang python \
		--output generated/ \
		--config conf/client.json

install:
	cd generated/ && \
	  python setup.py install

test-unit:
	cd generated/ && \
	  nose2

test-integration:
	nose2

doc:
	cd generated/ && \
	  sphinx-apidoc -o ../../doc/python/master/stage/ --full -H "Swagger AEM" -A "Shine Solutions" swaggeraem && \
		cd ../../doc/python/master/stage/ && \
		make html && \
		cd .. && \
		cp -R stage/_build/html/* ./ && \
		rm -rf stage/

publish:
	cd generated/ && \
	  gem push `ls swagger_aem-*.gem`

publish-test:
	cd generated/ && \
	  python setup.py register -r pypitest && \
		python setup.py sdist upload -r pypitest

.PHONY: all deps clean build install test-unit test-integration doc publish publish-test

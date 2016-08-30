ifndef SWAGGER_CODEGEN_JAR
	SWAGGER_CODEGEN = swagger-codegen
else
	SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_JAR)
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
	  echo "Not supported by swagger-codegen yet"

test-integration:
	nose2

doc:
	cd generated/ && \
	  sphinx-apidoc -o ../../doc/latest/python/stage/ --full -H "Swagger AEM" -A "Shine Solutions" swaggeraem && \
		cd ../../doc/latest/python/stage/ && \
		make html && \
		cd .. && \
		cp -R stage/_build/html/* ./ && \
		rm -rf stage/

.PHONY: all travis deps clean build install test-unit test-integration doc

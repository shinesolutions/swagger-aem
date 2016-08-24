ifndef SWAGGER_CODEGEN_JAR
	SWAGGER_CODEGEN = swagger-codegen
else
	SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_JAR)
endif

all: deps clean build install test-unit test-integration doc

deps:
	echo "TODO"

clean:
	rm -rf generated/

build:
	$(SWAGGER_CODEGEN) generate \
	  --input-spec ../conf/api.yml \
		--lang javascript \
		--output generated/ \
		--config conf/client.json

install:
	cd generated/ && \
	  echo "TODO"

test-unit:
	cd generated/ && \
	  echo "TODO"

doc:
	cd generated/ && \
	  echo "TODO"

.PHONY: all travis deps clean build install test-unit test-integration doc

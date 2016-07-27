ifndef SWAGGER_CODEGEN_JAR
	SWAGGER_CODEGEN = swagger-codegen
else
	SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_JAR)
endif

all: deps clean build install test doc

deps:
	echo "TODO"
	
clean:
	rm -rf generated/

build:
	$(SWAGGER_CODEGEN) generate \
	  --input-spec ../conf/api.yml \
		--lang java \
		--output generated/ \
		--config conf/client.json && \
	  cd generated/ && \
		mvn package

install:
	cd generated/ && \
	  mvn install

test:
	echo "TODO"

doc:
	echo "TODO"

.PHONY: all travis deps clean build install test doc

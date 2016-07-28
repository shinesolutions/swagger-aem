ifndef SWAGGER_CODEGEN_JAR
	SWAGGER_CODEGEN = swagger-codegen
else
	SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_JAR)
endif

all: clean build install test doc

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
	cd generated/ && \
	  mvn javadoc:javadoc && \
		mkdir -p ../../doc/latest/java/ && \
		cp -R target/site/apidocs/ ../../doc/latest/java/

.PHONY: all clean build install test doc

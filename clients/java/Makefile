ifndef SWAGGER_CODEGEN_CLI_JAR
	SWAGGER_CODEGEN = swagger-codegen
else
	SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_CLI_JAR)
endif

all: clean build install test-unit doc

clean:
	rm -rf generated/
	cd test-integration/ && \
	  mvn clean

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

test-unit:
	cd generated/ && \
	  mvn test

test-integration: install
	cd test-integration/ && \
	  mvn test

doc:
	cd generated/ && \
	  mvn javadoc:javadoc && \
		mkdir -p ../../doc/java/master/ && \
		cp -R target/site/apidocs/ ../../doc/java/master/

publish:
	cd generated/ && \
	  mvn deploy -P sign-artifacts

.PHONY: all clean build install test-unit test-integration doc publish

all: clean build install test-unit doc
ci: clean build install test-unit doc

clean:
	cd test-integration/ && \
	  mvn clean

build:
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

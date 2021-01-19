all: deps clean install test-unit test-integration doc
ci: deps clean install test-unit test-integration doc

deps:
	npm install -g mocha

clean:
	

install:
	cd generated/ && \
	  npm link

test-unit:
	cd generated/ && \
	  npm test

test-integration:
	cd generated/ && \
	  mocha --recursive ../test-integration

doc:
	cd generated/ && \
	  echo "TODO"

.PHONY: all deps clean build install test-unit test-integration doc

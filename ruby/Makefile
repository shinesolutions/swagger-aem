ifndef SWAGGER_CODEGEN_JAR
	SWAGGER_CODEGEN = swagger-codegen
else
	SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_JAR)
endif

all: deps clean build install test-unit test-integration doc
ci: deps clean build install test-unit doc

deps:
	gem install bundler
	bundle install

clean:
	rm -rf generated/

build:
	$(SWAGGER_CODEGEN) generate \
	  --input-spec ../conf/api.yml \
		--lang ruby \
		--output generated/ \
		--config conf/client.json

install:
	cd generated/ && \
	  rm -f swagger_aem-*.gem && \
	  gem build swagger_aem.gemspec && \
	  gem install `ls swagger_aem-*.gem`

test-unit:
	cd generated/ && \
	  rspec spec/

test-integration:
	rspec test-integration/

doc:
	cd generated/ && \
    yard doc \
    --output-dir ../../doc/ruby/latest/

publish:
	cd generated/ && \
	  gem push `ls swagger_aem-*.gem`

.PHONY: all ci deps clean build install test-unit test-integration doc publish

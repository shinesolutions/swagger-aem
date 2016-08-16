ifndef SWAGGER_CODEGEN_JAR
	SWAGGER_CODEGEN = swagger-codegen
else
	SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_JAR)
endif

all: deps clean build install test-unit test-integration doc

deps:
	gem install bundler
	BUNDLE_GEMFILE=Gemfile bundle install

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
	  gem build swagger_aem.gemspec && \
	  gem install swagger_aem-0.0.1.gem

test-unit:
	cd generated/ && \
	  rspec spec/

test-integration:
	rspec test-integration/

doc:
	cd generated/ && \
    yard doc \
    --output-dir ../../doc/latest/ruby/

.PHONY: all travis deps clean build install test-unit test-integration doc

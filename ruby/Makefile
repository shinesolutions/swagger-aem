ifndef SWAGGER_CODEGEN_CLI_JAR
	SWAGGER_CODEGEN = swagger-codegen
else
	SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_CLI_JAR)
endif

all: clean deps build install test-unit test-integration doc
ci: clean deps build install test-unit doc

deps:
	gem install bundler
	bundle install --binstubs

clean:
	rm -rf generated/ Gemfile.lock

build: clean
	$(SWAGGER_CODEGEN) generate \
	  --input-spec ../conf/api.yml \
		--lang ruby \
		--output generated/ \
		--config conf/client.json

install:
	cd generated/ && \
	  rm -f swagger_aem-*.gem && \
		bundle install && \
	  gem build swagger_aem.gemspec && \
	  gem install `ls swagger_aem-*.gem`

test-unit:
	cd generated/ && \
	  rm -f swagger_aem-*.gem && \
	  bundle exec rspec spec/

test-integration:
	bundle exec rspec test-integration/

# TODO: replace `yard` with `bundle exec yard` when generated Gemfile contains yard
doc:
	cd generated/ && \
	  rm -f swagger_aem-*.gem && \
	  yard doc \
            --output-dir ../../doc/ruby/master/

publish: install
	cd generated/ && \
	  gem push `ls swagger_aem-*.gem`

.PHONY: all ci deps clean build install test-unit test-integration doc publish

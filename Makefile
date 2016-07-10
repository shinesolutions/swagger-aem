ifndef SWAGGER_CODEGEN_JAR
		SWAGGER_CODEGEN = swagger-codegen
else
    SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_JAR)
endif

all: ruby doc

ruby: ruby-clean ruby-build ruby-install ruby-test

ruby-deps:
	gem install bundler
	BUNDLE_GEMFILE=ruby/Gemfile bundle install

ruby-clean:
	rm -rf ruby/generated/

ruby-build:
	$(SWAGGER_CODEGEN) generate \
	  --input-spec conf/api.yml \
		--lang ruby \
		--output ruby/generated/ \
		--config ruby/conf/client.json

ruby-install:
	cd ruby/generated/ && \
	  gem build swagger_aem.gemspec && \
	  gem install swagger_aem-0.0.1.gem

ruby-test:
	rspec ruby/test/

ruby-doc:
	cd ruby/generated/ && \
	  yard doc \
		--output-dir ../doc/

clean:
	rm -rf doc

doc:
	bootprint openapi conf/api.yml doc

tools:
	npm install -g bootprint bootprint-openapi

tools-osx: tools
	brew install swagger-codegen

.PHONY: all doc ruby ruby-deps ruby-clean ruby-build ruby-install ruby-test tools tools-osx

all: ruby

ruby: ruby-clean ruby-build-with-jar ruby-install ruby-test

ruby-deps:
	gem install bundler
	bundle install

ruby-clean:
	rm -rf ruby/generated/

ruby-build:
	mkdir -p generated/ruby/
	swagger-codegen generate \
	  --input-spec conf/api.yml \
		--lang ruby \
		--output ruby/generated/ \
		--config ruby/conf/client.json

ruby-build-with-jar:
	mkdir -p generated/ruby/
	java -jar $(SWAGGER_CODEGEN_JAR) generate \
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

tools-osx:
	brew install swagger-codegen

.PHONY: all ruby ruby-deps ruby-clean ruby-build ruby-build-with-jar ruby-install ruby-test tools-osx

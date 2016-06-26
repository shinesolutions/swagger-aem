all: ruby

ruby: ruby-clean ruby-build ruby-install ruby-test

ruby-deps:
	gem install bundler
	bundle install

ruby-clean:
	rm -rf generated/ruby/

ruby-build:
	mkdir -p generated/ruby/
	swagger-codegen generate \
	  --input-spec conf/api.yml \
		--lang ruby \
		--output generated/ruby/ \
		--config conf/ruby.json

ruby-install: ruby-build
	cd generated/ruby && \
	  gem build swagger_aem.gemspec && \
	  gem install swagger_aem-0.0.1.gem

ruby-test:
	rspec test/ruby

tools-osx:
	brew install swagger-codegen

.PHONY: all ruby ruby-deps ruby-clean ruby-build ruby-install ruby-test tools-osx

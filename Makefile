tools-osx:
	brew install swagger-codegen

ruby: ruby-clean ruby-build ruby-install ruby-test

ruby-deps:
	gem install bundler
	bundle install

ruby-clean:
	rm -rf generated/ruby/

ruby-build:
	mkdir -p generated/ruby/
	swagger-codegen generate --input-spec conf/api.yml --lang ruby --output generated/ruby/

ruby-install: ruby-build
	cd generated/ruby && \
	  gem build swagger_client.gemspec && \
	  gem install swagger_client-1.0.0.gem

ruby-test:
	rspec test/ruby

.PHONY: tools-osx ruby ruby-deps ruby-clean ruby-build ruby-install ruby-test

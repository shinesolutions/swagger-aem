tools-osx:
	brew install swagger-codegen

ruby: ruby-clean ruby-build ruby-install

ruby-clean:
	rm -rf generated/ruby/

ruby-build:
	mkdir -p generated/ruby/
	swagger-codegen generate --input-spec conf/api.yml --lang ruby --output generated/ruby/

ruby-install:
	cd generated/ruby && \
	  gem build swagger_client.gemspec && \
	  gem install swagger_client-1.0.0.gem

.PHONY: tools-osx ruby ruby-clean ruby-build ruby-install ruby-test

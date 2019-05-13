all: clean deps build install test-unit test-integration doc
ci: clean deps build install test-unit doc

clean:
	rm -rf generated/ Gemfile.lock

deps:
	gem install bundler
	bundle install --binstubs

build: clean
	mkdir -p generated/
	docker \
	  run \
	  -v /Users/cliffano/dev/workspace-shine/swagger-aem/ruby/..:/local/ \
	  openapitools/openapi-generator-cli \
	  generate \
	  --input-spec /local/conf/api.yml \
	  --config /local/ruby/conf/client.json \
	  --output /local/ruby/generated/ \
	  --generator-name ruby;
	cd generated/ && bundle install

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

fixtures:
	# based on AEM documentation at https://helpx.adobe.com/experience-manager/kt/platform-repository/using/ssl-wizard-technical-video-use.html#generate-key-cert
	# you will be prompted for private key password, the integration tests are expecting 'someprivatekeypassword' as the password for the fixtures data
	mkdir -p test-integration/fixtures/
	openssl genrsa -aes256 -out test-integration/fixtures/private_key.key 4096
	openssl req -sha256 -new -key test-integration/fixtures/private_key.key -out test-integration/fixtures/cert_sign_request.csr -subj '/CN=localhost'
	openssl x509 -req -days 365 -in test-integration/fixtures/cert_sign_request.csr -signkey test-integration/fixtures/private_key.key -out test-integration/fixtures/cert_chain.crt
	openssl pkcs8 -topk8 -inform PEM -outform DER -in test-integration/fixtures/private_key.key -out test-integration/fixtures/private_key.der -nocrypt

# TODO: replace `yard` with `bundle exec yard` when generated Gemfile contains yard
doc:
	cd generated/ && \
	  rm -f swagger_aem-*.gem && \
	  yard doc \
            --output-dir ../../doc/ruby/master/

publish: install
	cd generated/ && \
	  gem push `ls swagger_aem-*.gem`

release:
	rtk release

.PHONY: all ci deps clean build install test-unit test-integration fixtures doc publish release

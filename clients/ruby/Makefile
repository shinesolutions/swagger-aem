all: clean deps install test-unit test-integration doc
ci: clean deps install test-unit doc

clean:
	rm -rf Gemfile.lock

deps:
	gem install bundler --version=1.17.3
	bundle install --binstubs

install:
	cd generated/ && \
	  rm -f swagger_aem-*.gem Gemfile.lock && \
		bundle install && \
	  gem build swagger_aem.gemspec && \
	  gem install `ls swagger_aem-*.gem`

test-unit: install
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

.PHONY: all ci deps clean install test-unit test-integration fixtures doc publish release

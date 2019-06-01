[![Build Status](https://img.shields.io/travis/shinesolutions/swagger-aem.svg)](http://travis-ci.org/shinesolutions/swagger-aem)
[![Published Version](https://badge.fury.io/rb/swagger_aem.svg)](https://rubygems.org/gems/swagger_aem)

swagger_aem
-----------

swagger_aem is a Ruby client generated from [Swagger AEM specification](https://github.com/shinesolutions/swagger-aem) using [Swagger Code Generator](https://github.com/swagger-api/swagger-codegen).

This Ruby client returns raw HTTP response AS-IS. Check out [ruby_aem](https://github.com/shinesolutions/ruby_aem) for an abstraction layer with resource-oriented API and convenient response handling.

Learn more about swagger_aem:

* [Installation](https://github.com/shinesolutions/swagger-aem/tree/master/ruby#installation)
* [Error Handling](https://github.com/shinesolutions/swagger-aem/tree/master/ruby#error-handling)
* [Development](https://github.com/shinesolutions/swagger-aem/tree/master/ruby#development)
* [Testing](https://github.com/shinesolutions/swagger-aem/tree/master/ruby#testing)
* [Versions History](https://github.com/shinesolutions/swagger-aem/blob/master/docs/ruby/versions.md)

swagger_aem is part of [AEM OpenCloud](https://aemopencloud.io) platform.

Installation
------------

    gem install swagger_aem

swagger_aem will install some native dependencies, the following packages need to be available on your OS.

| Operating System | Packages        |
|------------------|-----------------|
| Amazon Linux     | gcc, ruby-devel |

Usage
-----

Initialise client:

    require 'swagger_aem'

    SwaggerAemClient.configure { |conf| [
      conf.host = 'http://localhost:4502',
      conf.username = 'admin',
      conf.password = 'admin',
      conf.debugging = false,
      conf.params_encoding = :multi
    ]}

    console = SwaggerAemClient::ConsoleApi.new
    cq = SwaggerAemClient::CqApi.new
    crx = SwaggerAemClient::CrxApi.new
    sling = SwaggerAemClient::SlingApi.new

Console API - Bundle:

    # stop bundle
    data, status_code, headers = console.post_bundle_with_http_info(
      name = 'com.adobe.cq.social.cq-social-forum',
      action = 'stop'
    )

    # start bundle
    data, status_code, headers = console.post_bundle_with_http_info(
      name = 'com.adobe.cq.social.cq-social-forum',
      action = 'start'
    )

Console API - Repository:

    # block repository writes
    data, status_code, headers = console.post_jmx_repository_with_http_info(
      action = 'blockRepositoryWrites'
    )

    # unblock repository writes
    data, status_code, headers = console.post_jmx_repository_with_http_info(
      action = 'unblockRepositoryWrites'
    )

CQ API - AEM:

    # retrieve login page
    data, status_code, headers = cq.get_login_page_with_http_info()

CQ API - Group:

    # set permission
    data, status_code, headers = cq.post_cq_actions_with_http_info(
      authorizable_id = 'somegroup',
      changelog = 'path:/etc/replication,read:true,modify:true'
    )

CRX API - Package:

    # create package
    data, status_code, headers = crx.post_package_service_json_with_http_info(
      path = 'etc/packages/somepackage',
      cmd = 'create',
      {
        :group_name => 'somepackagegroup',
        :package_name => 'somepackage',
        :package_version => '1.2.3',
        :charset => 'utf-8'
      }
    )

    # build package
    data, status_code, headers = crx.post_package_service_json_with_http_info(
      path = 'etc/packages/somepackagegroup/somepackage-1.2.3.zip',
      cmd = 'build'
    )

    # upload package
    File.open("/path/to/somepackage-1.2.3.zip", 'r') { |file|
      data, status_code, headers = crx.post_package_service_json_with_http_info(
        path = '',
        cmd = 'upload',
        {
          :force => true,
          :package => file
        }
      )
    }

    # update package filter
    data, status_code, headers = crx.post_package_update_with_http_info(
      groupName = 'somepackagegroup',
      packageName = 'somepackage',
      version = '1.2.3',
      path = '/etc/packages/somepackagegroup/somepackage-1.2.3.zip',
      {
        :filter => '[{"root":"/apps/geometrixx","rules":[]}]',
        :charset => 'utf-8'
      }
    )

    # install package
    data, status_code, headers = crx.post_package_service_json_with_http_info(
      path = 'etc/packages/somepackagegroup/somepackage-1.2.3.zip',
      cmd = 'install',
      {
        :recursive => true
      }
    )

    # replicate package
    data, status_code, headers = crx.post_package_service_json_with_http_info(
      path = 'etc/packages/somepackagegroup/somepackage-1.2.3.zip',
      cmd = 'replicate'
    )

    # list packages
    data, status_code, headers = crx.post_package_service_with_http_info(
      cmd = 'ls'
    )

    # delete package
    data, status_code, headers = crx.post_package_service_json_with_http_info(
      path = 'etc/packages/somepackagegroup/somepackage-1.2.3.zip',
      cmd = 'delete'
    )

CRX API - User:

    # change user password
    data, status_code, headers = crx.post_set_password_with_http_info(
      old = 'somepassword',
      plain = 'somenewpassword',
      verify = 'somenewpassword'
    )

Sling API - Authorizable Keystore:

    # create authorizable keystore
    data, status_code, headers = @sling.post_authorizable_keystore_with_http_info(
      intermediate_path = '/home/users/system',
      authorizable_id = 'authentication-service',
      {
        :new_password => 'somekeystorepassword',
        :re_password  => 'somekeystorepassword',
        :operation    => 'createStore'
      }
    )

    # get authorizable keystore
    data, status_code, headers = @sling.get_authorizable_keystore_with_http_info(
      intermediate_path = '/home/users/system',
      authorizable_id = 'authentication-service'
    )

    # upload certificate chain and private key into an authorizable keystore
    File.open("/path/to/cert_chain.crt", 'r') { |keystore_cert_chain_file|
      File.open("/path/to/private_key.der", 'r') { |keystore_private_key_file|
        data, status_code, headers = @sling.post_authorizable_keystore_with_http_info(
          intermediate_path = '/home/users/system',
          authorizable_id = 'authentication-service',
          {
            :_alias => 'somecertchainalias',
            :cert_chain => keystore_cert_chain_file,
            :pk => keystore_private_key_file
          }
        )
        expect(status_code).to eq(200)
      }
    }

    # download authorizable keystore
    data, status_code, headers = @sling.get_keystore_with_http_info(
      intermediate_path = '/home/users/system',
      authorizable_id = 'authentication-service'
    )

    # re-upload the downloaded authorizable keystore
    # NOTE: the parameters here are quite confusing
    # - `key_password` is the password for the downloaded keystore
    # - `key_store_pass` is the password for the existing keystore on AEM, which will then be overwritten by this keystore we're uploading
    File.open("/path/to/somekeystore.pkcs12", 'r') { |file|
      data, status_code, headers = @sling.post_authorizable_keystore_with_http_info(
        intermediate_path = '/home/users/system',
        authorizable_id = 'authentication-service',
        {
          :new_alias => 'somekeystorealias',
          :key_store => file,
          :key_store_pass => 'somekeystorepassword',
          :_alias => 'somecertchainalias',
          :key_password => 'somekeystorepassword'
        }
      )
      expect(status_code).to eq(200)
    }

    # delete authorizable keystore
    data, status_code, headers = @sling.post_node_with_http_info(
      path = '/home/users/system/authentication-service/keystore',
      name = 'store.p12',
      {
        :operation => 'delete'
      }
    )

Sling API - Flush agent:

    # create flush agent
    data, status_code, headers = sling.post_agent_with_http_info(
      runmode = 'author',
      name = 'some-flush-agent',
      {
        :jcrprimary_type => 'cq:Page',
        :jcrcontentcqname => 'some-flush-agent',
        :jcrcontentjcrtitle => 'Some Flush Agent Title',
        :jcrcontentjcrdescription => 'Some Flush Agent Description',
        :jcrcontentslingresource_type => '/libs/cq/replication/components/agent',
        :jcrcontenttransport_uri => 'http://somehost:8080/dispatcher/invalidate.cache',
        :jcrcontentlog_level => 'error',
        :jcrcontentno_versioning => true,
        :jcrcontentprotocol_http_headers => ['CQ-Action:{action}', 'CQ-Handle:{path}', 'CQ-Path:{path}'],
        :jcrcontentprotocol_http_headers_type_hint => 'String[]',
        :jcrcontentprotocol_http_method => 'GET',
        :jcrcontentretry_delay => '30000',
        :jcrcontentserialization_type => 'flush',
        :jcrcontentjcrmixin_types => 'cq:ReplicationStatus',
        :jcrcontenttrigger_receive => true,
        :jcrcontenttrigger_specific => true,
        :jcrcontentcqtemplate => '/libs/cq/replication/templates/agent',
        :jcrcontentenabled => true
      }
    )

    # delete flush agent
    data, status_code, headers = sling.delete_agent_with_http_info(
      runmode = 'author',
      name = 'some-flush-agent'
    )

Sling API - Group:

    # create group
    data, status_code, headers = sling.post_authorizables_with_http_info(
      authorizable_id = 'somegroup',
      intermediate_path = '/home/groups/s',
      {
        :create_group => '',
        :profilegiven_name => 'somegroup'
      }
    )

    # find group's authorizable ID
    data, status_code, headers = sling.post_query_with_http_info(
      path = 'home/groups/s',
      p_limit = -1,
      _1_property = 'rep:authorizableId',
      _1_property_value = 'somegroup'
    )

    # check group's existence
    begin
      data, status_code, headers = sling.get_node_with_http_info(
        path = 'home/groups/s',
        name = 'somegroup-authorizable-id'
      )
    rescue SwaggerAemClient::ApiError => err
      # AEM returns 302 when node exists, which Swagger considers to be an error
    end

    # add member
    data, status_code, headers = sling.post_node_rw_with_http_info(
      path = 'home/groups/s',
      name = 'somegroup-authorizable-id',
      {
        :add_members => 'somemembergroup'
      }
    )

    # delete group
    data, status_code, headers = sling.delete_node_with_http_info(
      path = 'home/groups/s',
      name = 'somegroup-authorizable-id'
    )

Sling API - Node:

    # create node
    data, status_code, headers = sling.post_path_with_http_info(
      path = 'apps/system',
      jcrprimary_type = 'sling:Folder',
      name = 'somefolder'
    )

    # check node's existence
    begin
      data, status_code, headers = sling.get_node_with_http_info(
        path = 'apps/system',
        name = 'somefolder'
      )
    rescue SwaggerAemClient::ApiError => err
      # AEM returns 302 when node exists, which Swagger considers to be an error
    end

    # delete node
    data, status_code, headers = sling.delete_node_with_http_info(
      path = 'apps/system',
      name = 'somefolder'
    )

Sling API - Node Property:

    # create node
    data, status_code, headers = sling.post_path_with_http_info(
      path = 'apps/system/config.author',
      jcrprimary_type = 'sling:OsgiConfig',
      name = 'org.apache.felix.http'
    )

    # set node Property
    # due to Swagger not allowing dynamic params,
    # parameters have to be declared in Swagger spec
    data, status_code, headers = sling.post_config_with_http_info(
      runmode = 'author',
      name = 'org.apache.felix.http',
      opts = {
        :org_apache_felix_https_enable => false
      }
    )

Sling API - Package:

    # download package
    data, status_code, headers = sling.get_package_with_http_info(
      group = 'somepackagegroup',
      name = 'somepackage',
      version = '1.2.3'
    )

    # get package filter
    data, status_code, headers = sling.get_package_filter_with_http_info(
      group = 'somepackagegroup',
      name = 'somepackage',
      version = '1.2.3'
    )

Sling API - Path:

    # activate path
    data, status_code, headers = sling.post_tree_activation_with_http_info(
      ignoredeactivated = true,
      onlymodified = false,
      path = '/etc/designs/geometrixx'
    )

Sling API - Replication agent:

    # create replication agent
    data, status_code, headers = sling.post_agent_with_http_info(
      runmode = 'author',
      name = 'some-replication-agent',
      {
        :jcrprimary_type => 'cq:Page',
        :jcrcontentcqname => 'some-replication-agent',
        :jcrcontentjcrtitle => 'Some Replication Agent Title',
        :jcrcontentjcrdescription => 'Some Replication Agent Description',
        :jcrcontentslingresource_type => '/libs/cq/replication/components/agent',
        :jcrcontentserialization_type => 'durbo',
        :jcrcontenttransport_uri => 'http://somehost:8080/bin/receive?sling:authRequestLogin=1',
        :jcrcontenttransport_user => 'admin',
        :jcrcontenttransport_password => 'admin',
        :jcrcontentlog_level => 'error',
        :jcrcontentretry_delay => '30000',
        :jcrcontentcqtemplate => '/libs/cq/replication/templates/agent',
        :jcrcontentenabled => true,
        :jcrcontentrelaxedssl => true
      }
    )

    # delete replication agent
    data, status_code, headers = sling.delete_agent_with_http_info(
      runmode = 'author',
      name = 'some-replication-agent'
    )

Sling API - Outbox replication agent:

    # create outbox replication agent
    data, status_code, headers = sling.post_agent_with_http_info(
      runmode = 'publish',
      name = 'some-outbox-replication-agent',
      {
        :jcrprimary_type => 'cq:Page',
        :jcrcontentcqname => 'some-outbox-replication-agent',
        :jcrcontentjcrtitle => 'Some Outbox Replication Agent Title',
        :jcrcontentjcrdescription => 'Some Outbox Replication Agent Description',
        :jcrcontentslingresource_type => 'cq/replication/components/agent',
        :jcrcontenttransport_uri => 'repo://var/replication/outbox',
        :jcrcontentno_versioning => true,
        :jcrcontentlog_level => 'error',
        :jcrcontentcqtemplate => '/libs/cq/replication/templates/agent',
        :jcrcontentenabled => true,
        :jcrcontenttrigger_distribute => true,
        :jcrcontenttrigger_modified => true,
        :jcrcontenttrigger_specific => true,
        :jcrcontentuser_id => 'admin'
      }
    )

    # delete outbox replication agent
    data, status_code, headers = sling.post_agent_with_http_info(
      runmode = 'publish',
      name = 'some-outbox-replication-agent',
      {
        :jcrprimary_type => 'cq:Page',
        :jcrcontentcqname => 'some-outbox-replication-agent',
        :jcrcontentjcrtitle => 'Some New Outbox Replication Agent Title',
        :jcrcontentjcrdescription => 'Some New Outbox Replication Agent Description'        }
    )

Sling API - Reverse replication agent:

    # create reverse replication agent
    data, status_code, headers = sling.post_agent_with_http_info(
      runmode = 'author',
      name = 'some-reverse-replication-agent',
      {
        :jcrprimary_type => 'cq:Page',
        :jcrcontentcqname => 'some-replication-agent',
        :jcrcontentjcrtitle => 'Some Replication Agent Title',
        :jcrcontentjcrdescription => 'Some Reverse Replication Agent Description',
        :jcrcontentslingresource_type => '/libs/cq/replication/components/agent',
        :jcrcontentserialization_type => 'durbo',
        :jcrcontenttransport_uri => 'http://somehost:8080/bin/receive?sling:authRequestLogin=1',
        :jcrcontenttransport_user => 'admin',
        :jcrcontenttransport_password => 'admin',
        :jcrcontentlog_level => 'error',
        :jcrcontentretry_delay => '30000',
        :jcrcontentcqtemplate => '/libs/cq/replication/templates/agent',
        :jcrcontentenabled => true,
        :jcrcontentreverse_replication => true
      }
    )

    # delete reverse replication agent
    data, status_code, headers = sling.delete_agent_with_http_info(
      runmode = 'author',
      name = 'some-reverse-replication-agent'
    )

Sling API - Truststore:

    # create truststore
    data, status_code, headers = @sling.post_truststore_with_http_info(
      {
        :new_password => 'somepassword',
        :re_password  => 'somepassword',
        :operation    => 'createStore'
      }
    )

    # check truststore's exist
    data, status_code, headers = @sling.get_truststore_informations_with_http_info

    # download truststore
    data, status_code, headers = @sling.get_truststore_with_http_info

    # upload truststore
    File.open("/path/to/sometruststore.p12", 'r') { |file|
      data, status_code, headers = @sling.post_truststore_pkcs12_with_http_info(
        {
          :truststore_p12 => file
        }
      )
    }

    # delete truststore
    data, status_code, headers = @sling.post_node_with_http_info(
      path = '/etc/truststore/',
      name = 'truststore.p12',
      {
        :operation => 'delete'
      }
    )

Sling API - User:

    # create user
    data, status_code, headers = sling.post_authorizables_with_http_info(
      authorizable_id = 'someuser',
      intermediate_path = '/home/users/s',
      {
        :create_user => '',
        :reppassword => 'somepassword'
      }
    )

Custom API - AEM Password Reset config property:

  data, status_code, headers = @custom.post_config_aem_password_reset_with_http_info(
    runmode = 'author',
    opts = {
      :pwdreset_authorizables => ['orchestrator', 'replicator', 'deployer'],
      :pwdreset_authorizables_type_hint => 'String[]',
    }
  )

Custom API - Get Health Check:
    data, status_code, headers = @custom.get_aem_health_check_with_http_info(
      opts = {
        :tags => 'shallow',
        :combinetagsor => false
      }
    )

Error Handling
--------------

Any API error will be thrown as [SwaggerAemClient::ApiError](https://shinesolutions.github.io/swagger-aem/ruby/master/SwaggerAemClient/ApiError.html) .

    begin
      data, status_code, headers = console.post_bundle_with_http_info(
        name = 'com.adobe.cq.social.cq-social-forum',
        action = 'stop'
      )
    rescue SwaggerAemClient::ApiError => err
      puts err.response_body
      puts err.code
      puts err.response_headers
    end

Development
-----------

To regenerate the client with a custom Swagger Codegen:

    SWAGGER_CODEGEN_CLI_JAR=/path/to/swagger-codegen-cli.jar make build

Testing
-------

Integration tests require an AEM instance with [Shine Solutions AEM Health Check](https://github.com/shinesolutions/aem-healthcheck) package installed.

By default it uses AEM running on http://localhost:4502 with `admin` username and `admin` password. AEM instance parameters can be configured using environment variables `aem_protocol`, `aem_host`, `aem_port`, `aem_username`, `aem_password`, and `aem_debug`. For example:

    aem_port=45642 make test-integration

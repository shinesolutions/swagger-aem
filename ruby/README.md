[![Published Version](https://badge.fury.io/rb/swagger_aem.svg)](https://rubygems.org/gems/swagger_aem)

swagger_aem
-----------

swagger_aem is a ruby client generated from [Swagger AEM specification](https://github.com/shinesolutions/swagger-aem) using [Swagger Code Generator](https://github.com/swagger-api/swagger-codegen).

This ruby client returns raw HTTP response AS-IS. Check out [ruby_aem](https://github.com/shinesolutions/ruby_aem) for an abstraction layer with resource-oriented API and convenient response handling.

| swagger_aem                                                                 | Supported AEM          | Supported Ruby          | Swagger Codegen CLI |
|-----------------------------------------------------------------------------|------------------------|-------------------------|---------------------|
| [0.9.1](https://shinesolutions.github.io/swagger-aem/ruby/0.9.1/index.html) | 6.0, 6.1, 6.2          | 1.9, 2.0, 2.1, 2.2, 2.3 | 20160902            |

Install
-------

    gem install swagger_aem

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
      cmd = 'install'
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

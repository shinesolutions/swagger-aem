swaggeraem4j
------------

swaggeraem4j is a Java client generated from [Swagger AEM specification](https://github.com/shinesolutions/swagger-aem) using [Swagger Code Generator](https://github.com/swagger-api/swagger-codegen).

This Java client returns raw HTTP response AS-IS. An abstraction layer with resource-oriented API and convenient response handling (a la [ruby_aem](https://github.com/shinesolutions/ruby_aem)) is still a work in progress.

| swaggeraem4j | Supported AEM          | Supported JDK       | Swagger Codegen CLI | Documentation                                                                   |
|--------------|------------------------|---------------------|---------------------|---------------------------------------------------------------------------------|
| 0.9.0        | 6.0, 6.1, 6.2          | 1.8                 | 20161104            | [API](https://shinesolutions.github.io/swagger-aem/java/0.9.0/index.html) |

Install
-------

Maven:

    <dependency>
        <groupId>com.shinesolutions</groupId>
        <artifactId>swaggeraem4j</artifactId>
    </dependency>

Gradle:

    compile group: 'com.shinesolutions', name: 'swaggeraem4j'

Usage
-----

Initialise client:

    import com.shinesolutions.swaggeraem4j.ApiClient;
    import com.shinesolutions.swaggeraem4j.api.ConsoleApi;
    import com.shinesolutions.swaggeraem4j.api.CqApi;
    import com.shinesolutions.swaggeraem4j.api.CrxApi;
    import com.shinesolutions.swaggeraem4j.api.SlingApi;

    ApiClient client = new ApiClient();
    client.setBasePath("http://localhost:4502");
    client.setUsername("admin");
    client.setPassword("admin");
    client.setDebugging(false);

    ConsoleApi console = new ConsoleApi(client);
    SlingApi sling = new SlingApi(client);
    CqApi cq = new CqApi(client);
    CrxApi crx = new CrxApi(client);

Console API - Bundle:

    // stop bundle
    String name = "com.adobe.cq.social.cq-social-forum";
		String action = "stop";
		ApiResponse<Void> response = console.postBundleWithHttpInfo(name, action);

    // start bundle
    String name = "com.adobe.cq.social.cq-social-forum";
		String action = "start";
		ApiResponse<Void> response = console.postBundleWithHttpInfo(name, action);

Console API - Repository:

    // block repository writes
    String action = "blockRepositoryWrites";
		ApiResponse<Void> response = console.postJmxRepositoryWithHttpInfo(action);

    // unblock repository writes
    String action = "unblockRepositoryWrites";
		ApiResponse<Void> response = console.postJmxRepositoryWithHttpInfo(action);

CQ API - Group:

    // set permission
    String id = "somegroup";
		String changelog = "path:/etc/replication,read:true,modify:true";
		ApiResponse<Void> response = cq.postCqActionsWithHttpInfo(id, changelog);

CRX API - Package:

    // create package
    String path = "etc/packages/somepackage";
		String cmd = "create";
		String groupName = "somepackagegroup";
		String packageName = "somepackage";
		String packageVersion = "1.2.3";
		String charset = "utf-8";
		ApiResponse<String> response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, groupName,
				packageName, packageVersion, charset, false, fakeFile);

    // build package
    String path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		String cmd = "build";
		ApiResponse<String> response = crx.postPackageServiceJsonWithHttpInfo(
				path, cmd, "", "", "", "", false, fakeFile);

    // upload package
    path = "";
		cmd = "upload";
		boolean force = true;
		File packageFile = new File(tmpDir.getRoot().toString()
				+ "/somepackage-1.2.3.zip");
    ApiResponse<String> response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, "", "", "", "", force, packageFile);

    // update package filter
    String groupName = "somepackagegroup";
		String packageName = "somepackage";
		String version = "1.2.3";
		String path = "/etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		String filter = "[{\"root\":\"/apps/geometrixx\",\"rules\":[]}]";
		String charset = "utf-8";
		ApiResponse<String> response = crx.postPackageUpdateWithHttpInfo(groupName, packageName, version, path, filter, charset);

    // install package
    String path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		String cmd = "install";
		ApiResponse<String> response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, "", "", "", "", false, someFile);

    // replicate package
    path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		cmd = "replicate";
		ApiResponse<String> response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, "", "", "", "", false, someFile);

    // list packages
    String cmd = "ls";
		ApiResponse<String> response = crx.postPackageServiceWithHttpInfo(cmd);

    // delete package
    String path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		String cmd = "delete";
		ApiResponse<String> response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, "", "", "", "", false, someFile);

CRX API - User:

    // change user password
    String old = "admin";
		String plain = "admin";
		String verify = "admin";
		ApiResponse<Void> response = crx.postSetPasswordWithHttpInfo(old, plain, verify);

Sling API - Group:

    // create group
    String id = "somegroup";
		String intermediatePath = "/home/groups/s";
		String createUser = null;
		String createGroup = "";
		String reppassword = null;
		String profilegivenName = "somegroup";
		ApiResponse<String> response = sling.postAuthorizablesWithHttpInfo(id, intermediatePath, createUser, createGroup, reppassword, profilegivenName);

    // find group's authorizable ID
    BigDecimal pLimit = new BigDecimal(-1.0);
    String _1Property = "rep:authorizableId";
    String _1PropertyValue = name;
    ApiResponse<String> response = sling.postQueryWithHttpInfo(path, pLimit, _1Property, _1PropertyValue);

    // check group's existence
    String path = "home/groups/s";
    String name = "somegroup-authorizable-id";
    try {
        sling.getNodeWithHttpInfo(path, name);
    } catch (ApiException e) {
        // AEM returns 302 when node exists, which Swagger considers to be an error
    }

    // add member
    String path = "home/groups/s";
		String name = "somegroup-authorizable-id";
		String addMembers = "somemembergroup";
		response = sling.postNodeRwWithHttpInfo(path, name, addMembers);

    // delete group
    String path = "home/groups/s";
    String name = "somegroup-authorizable-id";
    ApiResponse<Void> response = sling.deleteNodeWithHttpInfo(path, name);

Sling API - Node:

    // create node
    String path = "apps/system";
		String jcrPrimaryType = "sling:Folder";
		String name = "somefolder";
		ApiResponse<Void> response = sling.postPathWithHttpInfo(path, jcrPrimaryType, name);

    // check node's existence
    String path = "apps/system";
    String name = "somefolder";
    try {
        sling.getNodeWithHttpInfo(path, name);
    } catch (ApiException e) {
        // AEM returns 302 when node exists, which Swagger considers to be an error
    }

    // delete node
    String path = "apps/system";
		String name = "somefolder";
		ApiResponse<Void> response = sling.deleteNodeWithHttpInfo(path, name);

Sling API - Node Property:

    // create node
    String path = "apps/system/config.author";
		String jcrPrimaryType = "sling:OsgiConfig";
		String name = "org.apache.felix.http";
		ApiResponse<Void> response = sling.postPathWithHttpInfo(path, jcrPrimaryType, name);

    // set node Property
    // due to Swagger not allowing dynamic params,
    // parameters have to be declared in Swagger spec
    // TODO: add sample snippet

Sling API - Package:

    // download package
    String group = "somepackagegroup";
		String name = "somepackage";
		String version = "1.2.3";
		ApiResponse<File> fileResponse = sling.getPackageWithHttpInfo(group, name, version);

    // get package filter
    String group = "somepackagegroup";
		String name = "somepackage";
		String version = "1.2.3";
		ApiResponse<String> response = sling.getPackageFilterWithHttpInfo(group, name, version);

Sling API - Path:

    // activate path
    boolean ignoreDeactivated = true;
    boolean onlyModified = false;
    String path = "/some/inexisting/path";
    ApiResponse<Void> response = sling.postTreeActivationWithHttpInfo(ignoreDeactivated, onlyModified, path);

Sling API - User:

    // create user
    String id = "someuser";
		String intermediatePath = "/home/users/s";
		String createUser = "";
		String createGroup = "";
		String reppassword = "somepassword";
		String profilegivenName = "";
		ApiResponse<String> response = sling.postAuthorizablesWithHttpInfo(id, intermediatePath, createUser, createGroup, reppassword, profilegivenName);

Error handling
--------------

Any API error will be thrown as [ApiException](https://shinesolutions.github.io/swagger-aem/java/master/com/shinesolutions/swaggeraem4j/ApiException.html) .

    try {
      String name = "someinexistingbundle";
      String action = "stop";
      console.postBundleWithHttpInfo(name, action);
    } catch (ApiException e) {
      System.out.println(e.getResponseBody());
      System.out.println(e.getCode());
      System.out.println(e.getResponseHeaders());
    }

Development
-----------

To regenerate the client with a custom Swagger Codegen:

    SWAGGER_CODEGEN_CLI_JAR=/path/to/swagger-codegen-cli.jar make build

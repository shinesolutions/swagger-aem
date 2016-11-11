package com.shinesolutions.swaggeraem4j;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import static org.junit.Assert.*;

import com.shinesolutions.swaggeraem4j.api.CrxApi;
import com.shinesolutions.swaggeraem4j.api.SlingApi;

public class PackageTest {

	CrxApi crx;
	SlingApi sling;

	@Rule
	public TemporaryFolder tmpDir = new TemporaryFolder();

	@Before
	public void init() throws ApiException {
		crx = TestHelper.createCrxApi();
		sling = TestHelper.createSlingApi();

		// Ensure package does not exist
		String path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		String cmd = "delete";
		ApiResponse<String> response = crx.postPackageServiceJsonWithHttpInfo(
				path, cmd, "", "", "", "", false, null);
		assertEquals(200, response.getStatusCode());

		// Create package
		path = "etc/packages/somepackage";
		cmd = "create";
		String groupName = "somepackagegroup";
		String packageName = "somepackage";
		String packageVersion = "1.2.3";
		String charset = "utf-8";
		crx.postPackageServiceJsonWithHttpInfo(path, cmd, groupName,
				packageName, packageVersion, charset, false, null);
		assertEquals(200, response.getStatusCode());
	}

	@Test
	public void testBuildInstallReplicateDownloadPackage() throws ApiException,
			IOException {
		// Build package
		String path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		String cmd = "build";
		ApiResponse<String> response = crx.postPackageServiceJsonWithHttpInfo(
				path, cmd, "", "", "", "", false, null);
		assertEquals(200, response.getStatusCode());

		// Install package
		path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		cmd = "install";
		response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, "", "",
				"", "", false, null);
		assertEquals(200, response.getStatusCode());

		// Replicate package
		path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		cmd = "replicate";
		response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, "", "",
				"", "", false, null);
		assertEquals(200, response.getStatusCode());

		// Download package
		String group = "somepackagegroup";
		String name = "somepackage";
		String version = "1.2.3";
		ApiResponse<File> fileResponse = sling.getPackageWithHttpInfo(group,
				name, version);
		assertEquals(200, response.getStatusCode());

		File data = fileResponse.getData();

		// Data is a temporary file created by Swagger API client
		Files.copy(data.toPath(), tmpDir.newFile("somepackage-1.2.3.zip")
				.toPath());
		String filePath = tmpDir.getRoot().toString()
				+ "/somepackage-1.2.3.zip";
		assertTrue(new File(filePath).exists());
		data.delete();
	}

	@Test
	public void testUploadRebuildInstallReplicatePackage() throws ApiException {
		// Upload package
		String path = "";
		String cmd = "upload";
		boolean force = true;
		File packageFile = new File(tmpDir.getRoot().toString()
				+ "/somepackage-1.2.3.zip");
		ApiResponse<String> response = crx.postPackageServiceJsonWithHttpInfo(
				path, cmd, "", "", "", "", force, packageFile);
		assertEquals(200, response.getStatusCode());

		// Rebuild package
		path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		cmd = "build";
		response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, "", "",
				"", "", false, null);
		assertEquals(200, response.getStatusCode());

		// Install package
		path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		cmd = "install";
		response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, "", "",
				"", "", false, null);
		assertEquals(200, response.getStatusCode());

		// Replicate package
		path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		cmd = "replicate";
		response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, "", "",
				"", "", false, null);
		assertEquals(200, response.getStatusCode());
	}

	@Test
	public void testUpdatePackageAndGetFilter() throws ApiException {
		// Update package filter
		String groupName = "somepackagegroup";
		String packageName = "somepackage";
		String version = "1.2.3";
		String path = "/etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		String filter = "[{\"root\":\"/apps/geometrixx\",\"rules\":[]}]";
		String charset = "utf-8";
		ApiResponse<String> response = crx.postPackageUpdateWithHttpInfo(
				groupName, packageName, version, path, filter, charset);
		assertEquals(200, response.getStatusCode());

		// Get package filter
		String group = "somepackagegroup";
		String name = "somepackage";
		version = "1.2.3";
		response = sling.getPackageFilterWithHttpInfo(group, name, version);
		assertEquals(200, response.getStatusCode());

		try {
			group = "somepackagegroup";
			name = "somepackage";
			version = "1.2.3";
			response = sling.getPackageFilterWithHttpInfo(group, name, version);
			fail();
		} catch (ApiException e) {
			assertEquals(404, response.getStatusCode());
		}
	}

	@Test
	public void testListPackages() throws ApiException {
		String cmd = "ls";
		ApiResponse<String> response = crx.postPackageServiceWithHttpInfo(cmd);
		assertEquals(200, response.getStatusCode());
	}

}

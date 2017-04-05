package com.shinesolutions.swaggeraem4j;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import static org.junit.Assert.*;

import com.shinesolutions.swaggeraem4j.api.CrxApi;
import com.shinesolutions.swaggeraem4j.api.SlingApi;

public class PackageTest {

	private CrxApi crx;
	private SlingApi sling;

	private File fakeFile; // Fake empty file, temporary solution

	@Rule
	public TemporaryFolder tmpDir = new TemporaryFolder();

	@Before
	public void init() throws ApiException, IOException {
		crx = TestHelper.createCrxApi();
		sling = TestHelper.createSlingApi();

		// Fake empty file for calls to crx.postPackageServiceJsonWithHttpInfo,
		// postPackageServiceJsonWithHttpInfo throws exceptions without a file
		fakeFile = tmpDir.newFile("fakeFile.txt");

		// Ensure package does not exist
		String path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		String cmd = "delete";
		ApiResponse<String> response = crx.postPackageServiceJsonWithHttpInfo(
				path, cmd, "", "", "", "", false, true, fakeFile);
		assertEquals(200, response.getStatusCode());

		// Create package
		path = "etc/packages/somepackage";
		cmd = "create";
		String groupName = "somepackagegroup";
		String packageName = "somepackage";
		String packageVersion = "1.2.3";
		String charset = "utf-8";
		crx.postPackageServiceJsonWithHttpInfo(path, cmd, groupName,
				packageName, packageVersion, charset, false, true, fakeFile);
		assertEquals(200, response.getStatusCode());
	}

	@Test
	public void testBuildInstallReplicateDownloadPackage() throws ApiException,
			IOException {
		// Build package
		String path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		String cmd = "build";
		ApiResponse<String> response = crx.postPackageServiceJsonWithHttpInfo(
				path, cmd, "", "", "", "", false, true, fakeFile);
		assertEquals(200, response.getStatusCode());

		// Install package
		path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		cmd = "install";
		response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, "", "",
				"", "", false, true, fakeFile);
		assertEquals(200, response.getStatusCode());

		// Replicate package
		path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		cmd = "replicate";
		response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, "", "",
				"", "", false, true, fakeFile);
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
		Path filePath = tmpDir.getRoot().toPath()
				.resolve("somepackage-1.2.3.zip");
		Files.copy(data.toPath(), filePath);
		assertTrue(filePath.toFile().exists());
		data.delete();

		// Upload package
		path = "";
		cmd = "upload";
		boolean force = true;
		boolean recursive = true;
		File packageFile = new File(tmpDir.getRoot().toString()
				+ "/somepackage-1.2.3.zip");
		response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, "", "",
				"", "", force, recursive, packageFile);
		assertEquals(200, response.getStatusCode());

		// Rebuild package
		path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		cmd = "build";
		response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, "", "",
				"", "", false, recursive, fakeFile);
		assertEquals(200, response.getStatusCode());

		// Install package
		path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		cmd = "install";
		response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, "", "",
				"", "", false, recursive, fakeFile);
		assertEquals(200, response.getStatusCode());

		// Replicate package
		path = "etc/packages/somepackagegroup/somepackage-1.2.3.zip";
		cmd = "replicate";
		response = crx.postPackageServiceJsonWithHttpInfo(path, cmd, "", "",
				"", "", false, recursive, fakeFile);
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
	}

	@Test
	public void testGetNonExistingFilter() throws ApiException {
		try {
			String group = "somepackagegroup";
			String name = "somepackage";
			String version = "1.2.3";
			sling.getPackageFilterWithHttpInfo(group, name, version);
			fail();
		} catch (ApiException e) {
			assertEquals(404, e.getCode());
		}
	}

	@Test
	public void testListPackages() throws ApiException {
		String cmd = "ls";
		ApiResponse<String> response = crx.postPackageServiceWithHttpInfo(cmd);
		assertEquals(200, response.getStatusCode());
	}

}

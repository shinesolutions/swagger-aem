package com.prokarma.pkmst.controller;

import java.io.File;
import com.prokarma.pkmst.model.InstallStatus;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-04T23:41:29.600Z[GMT]")

@Controller
public class CrxApiController implements CrxApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CrxApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<String> getCrxdeStatus(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<InstallStatus> getInstallStatus(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<InstallStatus>(objectMapper.readValue("", InstallStatus.class), HttpStatus.OK);
        }

        return new ResponseEntity<InstallStatus>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getPackageManagerServlet(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<String> postPackageService(@ApiParam(value = "", required = true)  @RequestParam(value = "cmd", required = true) String cmd,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<String> postPackageServiceJson(@ApiParam(value = "",required=true ) @PathVariable("path") String path,
        @ApiParam(value = "", required = true)  @RequestParam(value = "cmd", required = true) String cmd,
        @ApiParam(value = "")  @RequestParam(value = "groupName", required = false) String groupName,
        @ApiParam(value = "")  @RequestParam(value = "packageName", required = false) String packageName,
        @ApiParam(value = "")  @RequestParam(value = "packageVersion", required = false) String packageVersion,
        @ApiParam(value = "")  @RequestParam(value = "_charset_", required = false) String charset,
        @ApiParam(value = "")  @RequestParam(value = "force", required = false) Boolean force,
        @ApiParam(value = "")  @RequestParam(value = "recursive", required = false) Boolean recursive,
        @ApiParam(value = "file detail")  @RequestPart("file") MultipartFile package,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<String> postPackageUpdate(@ApiParam(value = "", required = true)  @RequestParam(value = "groupName", required = true) String groupName,
        @ApiParam(value = "", required = true)  @RequestParam(value = "packageName", required = true) String packageName,
        @ApiParam(value = "", required = true)  @RequestParam(value = "version", required = true) String version,
        @ApiParam(value = "", required = true)  @RequestParam(value = "path", required = true) String path,
        @ApiParam(value = "")  @RequestParam(value = "filter", required = false) String filter,
        @ApiParam(value = "")  @RequestParam(value = "_charset_", required = false) String charset,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<String> postSetPassword(@ApiParam(value = "", required = true)  @RequestParam(value = "old", required = true) String old,
        @ApiParam(value = "", required = true)  @RequestParam(value = "plain", required = true) String plain,
        @ApiParam(value = "", required = true)  @RequestParam(value = "verify", required = true) String verify,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}

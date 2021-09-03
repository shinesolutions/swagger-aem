package com.prokarma.pkmst.controller;

import java.io.File;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2021-09-03T15:25:27.791+10:00[Australia/Melbourne]")
@Controller
public class GraniteApiController implements GraniteApi {
    private final ObjectMapper objectMapper;
@Autowired
    public GraniteApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<String> sslSetup(@ApiParam(value = "", required = true)  @RequestParam(value = "keystorePassword", required = true) String keystorePassword,
        @ApiParam(value = "", required = true)  @RequestParam(value = "keystorePasswordConfirm", required = true) String keystorePasswordConfirm,
        @ApiParam(value = "", required = true)  @RequestParam(value = "truststorePassword", required = true) String truststorePassword,
        @ApiParam(value = "", required = true)  @RequestParam(value = "truststorePasswordConfirm", required = true) String truststorePasswordConfirm,
        @ApiParam(value = "", required = true)  @RequestParam(value = "httpsHostname", required = true) String httpsHostname,
        @ApiParam(value = "", required = true)  @RequestParam(value = "httpsPort", required = true) String httpsPort,
        @ApiParam(value = "file detail")  @RequestPart("file") MultipartFile privatekeyFile,
        @ApiParam(value = "file detail")  @RequestPart("file") MultipartFile certificateFile,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}

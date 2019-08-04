package com.prokarma.pkmst.controller;


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
public class CustomApiController implements CustomApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CustomApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<String> getAemHealthCheck(@ApiParam(value = "")  @RequestParam(value = "tags", required = false) String tags,
        @ApiParam(value = "")  @RequestParam(value = "combineTagsOr", required = false) Boolean combineTagsOr,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postConfigAemHealthCheckServlet(@ApiParam(value = "")  @RequestParam(value = "bundles.ignored", required = false) List<String> bundlesIgnored,
        @ApiParam(value = "")  @RequestParam(value = "bundles.ignored@TypeHint", required = false) String bundlesIgnoredAtTypeHint,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postConfigAemPasswordReset(@ApiParam(value = "")  @RequestParam(value = "pwdreset.authorizables", required = false) List<String> pwdresetAuthorizables,
        @ApiParam(value = "")  @RequestParam(value = "pwdreset.authorizables@TypeHint", required = false) String pwdresetAuthorizablesAtTypeHint,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

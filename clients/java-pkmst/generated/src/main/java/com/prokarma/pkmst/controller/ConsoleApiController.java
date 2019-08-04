package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.SamlConfigurationInfo;

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
public class ConsoleApiController implements ConsoleApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ConsoleApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<List<String>> getAemProductInfo(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<String>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<String>>(HttpStatus.OK);
    }

    public ResponseEntity<String> getConfigMgr(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postBundle(@ApiParam(value = "",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "", required = true)  @RequestParam(value = "action", required = true) String action,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> postJmxRepository(@ApiParam(value = "",required=true ) @PathVariable("action") String action,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<SamlConfigurationInfo> postSamlConfiguration(@ApiParam(value = "")  @RequestParam(value = "post", required = false) Boolean post,
        @ApiParam(value = "")  @RequestParam(value = "apply", required = false) Boolean apply,
        @ApiParam(value = "")  @RequestParam(value = "delete", required = false) Boolean delete,
        @ApiParam(value = "")  @RequestParam(value = "action", required = false) String action,
        @ApiParam(value = "")  @RequestParam(value = "$location", required = false) String $location,
        @ApiParam(value = "")  @RequestParam(value = "path", required = false) List<String> path,
        @ApiParam(value = "")  @RequestParam(value = "service.ranking", required = false) Integer serviceRanking,
        @ApiParam(value = "")  @RequestParam(value = "idpUrl", required = false) String idpUrl,
        @ApiParam(value = "")  @RequestParam(value = "idpCertAlias", required = false) String idpCertAlias,
        @ApiParam(value = "")  @RequestParam(value = "idpHttpRedirect", required = false) Boolean idpHttpRedirect,
        @ApiParam(value = "")  @RequestParam(value = "serviceProviderEntityId", required = false) String serviceProviderEntityId,
        @ApiParam(value = "")  @RequestParam(value = "assertionConsumerServiceURL", required = false) String assertionConsumerServiceURL,
        @ApiParam(value = "")  @RequestParam(value = "spPrivateKeyAlias", required = false) String spPrivateKeyAlias,
        @ApiParam(value = "")  @RequestParam(value = "keyStorePassword", required = false) String keyStorePassword,
        @ApiParam(value = "")  @RequestParam(value = "defaultRedirectUrl", required = false) String defaultRedirectUrl,
        @ApiParam(value = "")  @RequestParam(value = "userIDAttribute", required = false) String userIDAttribute,
        @ApiParam(value = "")  @RequestParam(value = "useEncryption", required = false) Boolean useEncryption,
        @ApiParam(value = "")  @RequestParam(value = "createUser", required = false) Boolean createUser,
        @ApiParam(value = "")  @RequestParam(value = "addGroupMemberships", required = false) Boolean addGroupMemberships,
        @ApiParam(value = "")  @RequestParam(value = "groupMembershipAttribute", required = false) String groupMembershipAttribute,
        @ApiParam(value = "")  @RequestParam(value = "defaultGroups", required = false) List<String> defaultGroups,
        @ApiParam(value = "")  @RequestParam(value = "nameIdFormat", required = false) String nameIdFormat,
        @ApiParam(value = "")  @RequestParam(value = "synchronizeAttributes", required = false) List<String> synchronizeAttributes,
        @ApiParam(value = "")  @RequestParam(value = "handleLogout", required = false) Boolean handleLogout,
        @ApiParam(value = "")  @RequestParam(value = "logoutUrl", required = false) String logoutUrl,
        @ApiParam(value = "")  @RequestParam(value = "clockTolerance", required = false) Integer clockTolerance,
        @ApiParam(value = "")  @RequestParam(value = "digestMethod", required = false) String digestMethod,
        @ApiParam(value = "")  @RequestParam(value = "signatureMethod", required = false) String signatureMethod,
        @ApiParam(value = "")  @RequestParam(value = "userIntermediatePath", required = false) String userIntermediatePath,
        @ApiParam(value = "")  @RequestParam(value = "propertylist", required = false) List<String> propertylist,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("")) {
            return new ResponseEntity<SamlConfigurationInfo>(objectMapper.readValue("", SamlConfigurationInfo.class), HttpStatus.OK);
        }

        return new ResponseEntity<SamlConfigurationInfo>(HttpStatus.OK);
    }

}

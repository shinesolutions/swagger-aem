package org.openapitools.api.consumer;

import org.openapitools.model.KeystoreInfo;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.IntermediatePathService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/{intermediatePath}")
public class IntermediatePathServiceController {

    @DubboReference
    private IntermediatePathService intermediatePathService;

    @RequestMapping(method = RequestMethod.GET, value = "/{authorizableId}.ks.json")
    public KeystoreInfo getAuthorizableKeystore(
        @RequestParam(name = "intermediatePath") String intermediatePath,
        @RequestParam(name = "authorizableId") String authorizableId
    ) {
        return intermediatePathService.getAuthorizableKeystore(intermediatePath, authorizableId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{authorizableId}/keystore/store.p12")
    public org.springframework.web.multipart.MultipartFile getKeystore(
        @RequestParam(name = "intermediatePath") String intermediatePath,
        @RequestParam(name = "authorizableId") String authorizableId
    ) {
        return intermediatePathService.getKeystore(intermediatePath, authorizableId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{authorizableId}.ks.html")
    public KeystoreInfo postAuthorizableKeystore(
        @RequestParam(name = "intermediatePath") String intermediatePath,
        @RequestParam(name = "authorizableId") String authorizableId,
        @RequestParam(name = "operation") String operation,
        @RequestParam(name = "currentPassword") String currentPassword,
        @RequestParam(name = "newPassword") String newPassword,
        @RequestParam(name = "rePassword") String rePassword,
        @RequestParam(name = "keyPassword") String keyPassword,
        @RequestParam(name = "keyStorePass") String keyStorePass,
        @RequestParam(name = "alias") String alias,
        @RequestParam(name = "newAlias") String newAlias,
        @RequestParam(name = "removeAlias") String removeAlias,
        @RequestParam(name = "certChain") org.springframework.web.multipart.MultipartFile certChain,
        @RequestParam(name = "pk") org.springframework.web.multipart.MultipartFile pk,
        @RequestParam(name = "keyStore") org.springframework.web.multipart.MultipartFile keyStore
    ) {
        return intermediatePathService.postAuthorizableKeystore(intermediatePath, authorizableId, operation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore);
    }
}

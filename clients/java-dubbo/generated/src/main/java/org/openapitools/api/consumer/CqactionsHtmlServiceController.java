package org.openapitools.api.consumer;

import org.openapitools.model.*;
import org.openapitools.api.interfaces.CqactionsHtmlService;
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
@RequestMapping("/.cqactions.html")
public class CqactionsHtmlServiceController {

    @DubboReference
    private CqactionsHtmlService cqactionsHtmlService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public void postCqActions(
        @RequestParam(name = "authorizableId") String authorizableId,
        @RequestParam(name = "changelog") String changelog
    ) {
        cqactionsHtmlService.postCqActions(authorizableId, changelog);
    }
}

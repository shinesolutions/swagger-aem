package org.openapitools.api.consumer;

import java.math.BigDecimal;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.BinService;
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
@RequestMapping("/bin")
public class BinServiceController {

    @DubboReference
    private BinService binService;

    @RequestMapping(method = RequestMethod.GET, value = "/querybuilder.json")
    public String getQuery(
        @RequestParam(name = "path") String path,
        @RequestParam(name = "pLimit") BigDecimal pLimit,
        @RequestParam(name = "_1property") String _1property,
        @RequestParam(name = "_1propertyValue") String _1propertyValue
    ) {
        return binService.getQuery(path, pLimit, _1property, _1propertyValue);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/querybuilder.json")
    public String postQuery(
        @RequestParam(name = "path") String path,
        @RequestParam(name = "pLimit") BigDecimal pLimit,
        @RequestParam(name = "_1property") String _1property,
        @RequestParam(name = "_1propertyValue") String _1propertyValue
    ) {
        return binService.postQuery(path, pLimit, _1property, _1propertyValue);
    }
}

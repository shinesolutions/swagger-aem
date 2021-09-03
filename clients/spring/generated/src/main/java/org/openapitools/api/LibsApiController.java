package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-03T15:28:35.636+10:00[Australia/Melbourne]")
@Controller
@RequestMapping("${openapi.adobeExperienceManagerAEM.base-path:}")
public class LibsApiController implements LibsApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LibsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}

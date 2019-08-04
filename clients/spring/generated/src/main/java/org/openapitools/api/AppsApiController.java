package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-04T23:44:43.219Z[GMT]")

@Controller
@RequestMapping("${openapi.adobeExperienceManagerAEM.base-path:/}")
public class AppsApiController implements AppsApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AppsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}

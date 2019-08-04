package controllers;


import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface CustomApiControllerImpInterface {
    String getAemHealthCheck(String tags, Boolean combineTagsOr) throws Exception;

    void postConfigAemHealthCheckServlet(List<String> bundlesIgnored, String bundlesIgnoredAtTypeHint) throws Exception;

    void postConfigAemPasswordReset(List<String> pwdresetAuthorizables, String pwdresetAuthorizablesAtTypeHint) throws Exception;

}

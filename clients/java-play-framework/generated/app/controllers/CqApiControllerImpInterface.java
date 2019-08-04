package controllers;


import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface CqApiControllerImpInterface {
    String getLoginPage() throws Exception;

    void postCqActions( @NotNull String authorizableId,  @NotNull String changelog) throws Exception;

}

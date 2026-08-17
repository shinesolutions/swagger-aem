package org.openapitools.api.consumer;

import org.openapitools.model.InstallStatus;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.CrxService;
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
@RequestMapping("/crx")
public class CrxServiceController {

    @DubboReference
    private CrxService crxService;

    @RequestMapping(method = RequestMethod.GET, value = "/server/crx.default/jcr:root/.1.json")
    public String getCrxdeStatus(
    ) {
        return crxService.getCrxdeStatus();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/packmgr/installstatus.jsp")
    public InstallStatus getInstallStatus(
    ) {
        return crxService.getInstallStatus();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/packmgr/service/script.html")
    public void getPackageManagerServlet(
    ) {
        crxService.getPackageManagerServlet();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/packmgr/service.jsp")
    public String postPackageService(
        @RequestParam(name = "cmd") String cmd
    ) {
        return crxService.postPackageService(cmd);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/packmgr/service/.json/{path}")
    public String postPackageServiceJson(
        @RequestParam(name = "path") String path,
        @RequestParam(name = "cmd") String cmd,
        @RequestParam(name = "groupName") String groupName,
        @RequestParam(name = "packageName") String packageName,
        @RequestParam(name = "packageVersion") String packageVersion,
        @RequestParam(name = "charset") String charset,
        @RequestParam(name = "force") Boolean force,
        @RequestParam(name = "recursive") Boolean recursive,
        @RequestParam(name = "_package") org.springframework.web.multipart.MultipartFile _package
    ) {
        return crxService.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/packmgr/update.jsp")
    public String postPackageUpdate(
        @RequestParam(name = "groupName") String groupName,
        @RequestParam(name = "packageName") String packageName,
        @RequestParam(name = "version") String version,
        @RequestParam(name = "path") String path,
        @RequestParam(name = "filter") String filter,
        @RequestParam(name = "charset") String charset
    ) {
        return crxService.postPackageUpdate(groupName, packageName, version, path, filter, charset);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/explorer/ui/setpassword.jsp")
    public String postSetPassword(
        @RequestParam(name = "old") String old,
        @RequestParam(name = "plain") String plain,
        @RequestParam(name = "verify") String verify
    ) {
        return crxService.postSetPassword(old, plain, verify);
    }
}

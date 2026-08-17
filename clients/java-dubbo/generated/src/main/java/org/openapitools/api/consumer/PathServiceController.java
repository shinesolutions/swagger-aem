package org.openapitools.api.consumer;

import org.openapitools.model.*;
import org.openapitools.api.interfaces.PathService;
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
@RequestMapping("/{path}")
public class PathServiceController {

    @DubboReference
    private PathService pathService;

    @RequestMapping(method = RequestMethod.DELETE, value = "/{name}")
    public void deleteNode(
        @RequestParam(name = "path") String path,
        @RequestParam(name = "name") String name
    ) {
        pathService.deleteNode(path, name);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{name}")
    public void getNode(
        @RequestParam(name = "path") String path,
        @RequestParam(name = "name") String name
    ) {
        pathService.getNode(path, name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{name}")
    public void postNode(
        @RequestParam(name = "path") String path,
        @RequestParam(name = "name") String name,
        @RequestParam(name = "operation") String operation,
        @RequestParam(name = "deleteAuthorizable") String deleteAuthorizable,
        @RequestParam(name = "_file") org.springframework.web.multipart.MultipartFile _file
    ) {
        pathService.postNode(path, name, operation, deleteAuthorizable, _file);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{name}.rw.html")
    public void postNodeRw(
        @RequestParam(name = "path") String path,
        @RequestParam(name = "name") String name,
        @RequestParam(name = "addMembers") String addMembers
    ) {
        pathService.postNodeRw(path, name, addMembers);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public void postPath(
        @RequestParam(name = "path") String path,
        @RequestParam(name = "jcrPrimaryType") String jcrPrimaryType,
        @RequestParam(name = "name") String name
    ) {
        pathService.postPath(path, jcrPrimaryType, name);
    }
}

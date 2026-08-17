package org.openapitools.api.provider;

import org.openapitools.model.*;
import org.openapitools.api.interfaces.PathService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@DubboService
public class PathServiceImpl implements PathService {

    private static final Logger logger = LoggerFactory.getLogger(PathServiceImpl.class);

    @Override
    public void deleteNode(
        String path,
        String name
    ) {
        logger.info("Dubbo service method deleteNode called with parameters: path={}, name={}", path, name);
        
        // TODO: Implement your business logic here
    }

    @Override
    public void getNode(
        String path,
        String name
    ) {
        logger.info("Dubbo service method getNode called with parameters: path={}, name={}", path, name);
        
        // TODO: Implement your business logic here
    }

    @Override
    public void postNode(
        String path,
        String name,
        String operation,
        String deleteAuthorizable,
        org.springframework.web.multipart.MultipartFile _file
    ) {
        logger.info("Dubbo service method postNode called with parameters: path={}, name={}, operation={}, deleteAuthorizable={}, _file={}", path, name, operation, deleteAuthorizable, _file);
        
        // TODO: Implement your business logic here
    }

    @Override
    public void postNodeRw(
        String path,
        String name,
        String addMembers
    ) {
        logger.info("Dubbo service method postNodeRw called with parameters: path={}, name={}, addMembers={}", path, name, addMembers);
        
        // TODO: Implement your business logic here
    }

    @Override
    public void postPath(
        String path,
        String jcrPrimaryType,
        String name
    ) {
        logger.info("Dubbo service method postPath called with parameters: path={}, jcrPrimaryType={}, name={}", path, jcrPrimaryType, name);
        
        // TODO: Implement your business logic here
    }
}

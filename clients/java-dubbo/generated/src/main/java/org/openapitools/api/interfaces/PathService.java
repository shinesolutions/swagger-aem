package org.openapitools.api.interfaces;

import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface PathService {

    /**
     * 
     * 
     *
     * @param path  (required)
     * @param name  (required)
     * @return void
     */
    void deleteNode(
        String path,
        String name
    );

    /**
     * 
     * 
     *
     * @param path  (required)
     * @param name  (required)
     * @return void
     */
    void getNode(
        String path,
        String name
    );

    /**
     * 
     * 
     *
     * @param path  (required)
     * @param name  (required)
     * @param operation  (optional)
     * @param deleteAuthorizable  (optional)
     * @param _file  (optional)
     * @return void
     */
    void postNode(
        String path,
        String name,
        String operation,
        String deleteAuthorizable,
        org.springframework.web.multipart.MultipartFile _file
    );

    /**
     * 
     * 
     *
     * @param path  (required)
     * @param name  (required)
     * @param addMembers  (optional)
     * @return void
     */
    void postNodeRw(
        String path,
        String name,
        String addMembers
    );

    /**
     * 
     * 
     *
     * @param path  (required)
     * @param jcrPrimaryType  (required)
     * @param name  (required)
     * @return void
     */
    void postPath(
        String path,
        String jcrPrimaryType,
        String name
    );
}

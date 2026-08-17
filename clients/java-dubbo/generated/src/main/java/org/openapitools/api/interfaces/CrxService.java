package org.openapitools.api.interfaces;

import org.openapitools.model.InstallStatus;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface CrxService {

    /**
     * 
     * 
     *
     * @return String
     */
    String getCrxdeStatus(
    );

    /**
     * 
     * 
     *
     * @return InstallStatus
     */
    InstallStatus getInstallStatus(
    );

    /**
     * 
     * 
     *
     * @return void
     */
    void getPackageManagerServlet(
    );

    /**
     * 
     * 
     *
     * @param cmd  (required)
     * @return String
     */
    String postPackageService(
        String cmd
    );

    /**
     * 
     * 
     *
     * @param path  (required)
     * @param cmd  (required)
     * @param groupName  (optional)
     * @param packageName  (optional)
     * @param packageVersion  (optional)
     * @param charset  (optional)
     * @param force  (optional)
     * @param recursive  (optional)
     * @param _package  (optional)
     * @return String
     */
    String postPackageServiceJson(
        String path,
        String cmd,
        String groupName,
        String packageName,
        String packageVersion,
        String charset,
        Boolean force,
        Boolean recursive,
        org.springframework.web.multipart.MultipartFile _package
    );

    /**
     * 
     * 
     *
     * @param groupName  (required)
     * @param packageName  (required)
     * @param version  (required)
     * @param path  (required)
     * @param filter  (optional)
     * @param charset  (optional)
     * @return String
     */
    String postPackageUpdate(
        String groupName,
        String packageName,
        String version,
        String path,
        String filter,
        String charset
    );

    /**
     * 
     * 
     *
     * @param old  (required)
     * @param plain  (required)
     * @param verify  (required)
     * @return String
     */
    String postSetPassword(
        String old,
        String plain,
        String verify
    );
}

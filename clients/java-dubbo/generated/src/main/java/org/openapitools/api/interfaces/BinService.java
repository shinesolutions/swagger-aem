package org.openapitools.api.interfaces;

import java.math.BigDecimal;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface BinService {

    /**
     * 
     * 
     *
     * @param path  (required)
     * @param pLimit  (required)
     * @param _1property  (required)
     * @param _1propertyValue  (required)
     * @return String
     */
    String getQuery(
        String path,
        BigDecimal pLimit,
        String _1property,
        String _1propertyValue
    );

    /**
     * 
     * 
     *
     * @param path  (required)
     * @param pLimit  (required)
     * @param _1property  (required)
     * @param _1propertyValue  (required)
     * @return String
     */
    String postQuery(
        String path,
        BigDecimal pLimit,
        String _1property,
        String _1propertyValue
    );
}

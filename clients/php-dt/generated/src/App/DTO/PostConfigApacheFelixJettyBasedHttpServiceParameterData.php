<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for postConfigApacheFelixJettyBasedHttpService
 */
class PostConfigApacheFelixJettyBasedHttpServiceParameterData
{
    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.nio@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_nio_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.keystore.password@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_keystore_password_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.truststore@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_truststore_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.enable", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $org_apache_felix_https_enable = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.keystore.key.password", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_keystore_key_password = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.keystore.key", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_keystore_key = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.clientcertificate@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_clientcertificate_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.enable@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_enable_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.keystore", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_keystore = null;

    /**
     * @DTA\Data(subset="query", field="org.osgi.service.http.port.secure@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_osgi_service_http_port_secure_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.nio", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $org_apache_felix_https_nio = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.clientcertificate", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_clientcertificate = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.keystore.key.password@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_keystore_key_password_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.truststore.password", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_truststore_password = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.truststore", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_truststore = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.keystore.key@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_keystore_key_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.truststore.password@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_truststore_password_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.keystore.password", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_keystore_password = null;

    /**
     * @DTA\Data(subset="query", field="org.osgi.service.http.port.secure", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_osgi_service_http_port_secure = null;

    /**
     * @DTA\Data(subset="query", field="org.apache.felix.https.keystore@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $org_apache_felix_https_keystore_type_hint = null;

}

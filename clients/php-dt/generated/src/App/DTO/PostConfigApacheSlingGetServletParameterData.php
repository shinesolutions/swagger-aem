<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for postConfigApacheSlingGetServlet
 */
class PostConfigApacheSlingGetServletParameterData
{
    /**
     * @DTA\Data(subset="query", field="enable.txt", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $enable_txt = null;

    /**
     * @DTA\Data(subset="query", field="enable.html@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $enable_html_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="enable.html", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $enable_html = null;

    /**
     * @DTA\Data(subset="query", field="json.maximumresults", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $json_maximumresults = null;

    /**
     * @DTA\Data(subset="query", field="json.maximumresults@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $json_maximumresults_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="enable.xml", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $enable_xml = null;

    /**
     * @DTA\Data(subset="query", field="enable.txt@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $enable_txt_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="enable.xml@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $enable_xml_type_hint = null;

}

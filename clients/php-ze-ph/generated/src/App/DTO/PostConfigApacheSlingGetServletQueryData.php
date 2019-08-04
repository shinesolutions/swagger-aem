<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for postConfigApacheSlingGetServlet
 */
class PostConfigApacheSlingGetServletQueryData
{
    /**
     * @DTA\Data(field="enable.txt", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $enable_txt;
    /**
     * @DTA\Data(field="enable.html@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $enable_html_type_hint;
    /**
     * @DTA\Data(field="enable.html", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $enable_html;
    /**
     * @DTA\Data(field="json.maximumresults", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $json_maximumresults;
    /**
     * @DTA\Data(field="json.maximumresults@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $json_maximumresults_type_hint;
    /**
     * @DTA\Data(field="enable.xml", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $enable_xml;
    /**
     * @DTA\Data(field="enable.txt@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $enable_txt_type_hint;
    /**
     * @DTA\Data(field="enable.xml@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $enable_xml_type_hint;
}

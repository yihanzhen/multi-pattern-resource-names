<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataproc/v1/workflow_templates.proto

namespace Google\Cloud\Dataproc\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Validation based on regular expressions.
 *
 * Generated from protobuf message <code>google.cloud.dataproc.v1.RegexValidation</code>
 */
final class RegexValidation extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. RE2 regular expressions used to validate the parameter's value.
     * The value must match the regex in its entirety (substring
     * matches are not sufficient).
     *
     * Generated from protobuf field <code>repeated string regexes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private $regexes;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string[]|\Google\Protobuf\Internal\RepeatedField $regexes
     *           Required. RE2 regular expressions used to validate the parameter's value.
     *           The value must match the regex in its entirety (substring
     *           matches are not sufficient).
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Dataproc\V1\WorkflowTemplates::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. RE2 regular expressions used to validate the parameter's value.
     * The value must match the regex in its entirety (substring
     * matches are not sufficient).
     *
     * Generated from protobuf field <code>repeated string regexes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getRegexes()
    {
        return $this->regexes;
    }

    /**
     * Required. RE2 regular expressions used to validate the parameter's value.
     * The value must match the regex in its entirety (substring
     * matches are not sufficient).
     *
     * Generated from protobuf field <code>repeated string regexes = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setRegexes($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->regexes = $arr;

        return $this;
    }

}


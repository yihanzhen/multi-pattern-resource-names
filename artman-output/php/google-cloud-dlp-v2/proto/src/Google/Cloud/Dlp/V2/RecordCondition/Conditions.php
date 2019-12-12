<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/dlp.proto

namespace Google\Cloud\Dlp\V2\RecordCondition;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A collection of conditions.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.RecordCondition.Conditions</code>
 */
final class Conditions extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2.RecordCondition.Condition conditions = 1;</code>
     */
    private $conditions;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Cloud\Dlp\V2\RecordCondition\Condition[]|\Google\Protobuf\Internal\RepeatedField $conditions
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Privacy\Dlp\V2\Dlp::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2.RecordCondition.Condition conditions = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getConditions()
    {
        return $this->conditions;
    }

    /**
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2.RecordCondition.Condition conditions = 1;</code>
     * @param \Google\Cloud\Dlp\V2\RecordCondition\Condition[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setConditions($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Cloud\Dlp\V2\RecordCondition\Condition::class);
        $this->conditions = $arr;

        return $this;
    }

}

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(Conditions::class, \Google\Cloud\Dlp\V2\RecordCondition_Conditions::class);


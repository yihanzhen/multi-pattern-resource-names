<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/dlp.proto

namespace Google\Cloud\Dlp\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Details information about an error encountered during job execution or
 * the results of an unsuccessful activation of the JobTrigger.
 * Output only field.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.Error</code>
 */
final class Error extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.google.rpc.Status details = 1;</code>
     */
    private $details = null;
    /**
     * The times the error occurred.
     *
     * Generated from protobuf field <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     */
    private $timestamps;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Rpc\Status $details
     *     @type \Google\Protobuf\Timestamp[]|\Google\Protobuf\Internal\RepeatedField $timestamps
     *           The times the error occurred.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Privacy\Dlp\V2\Dlp::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.google.rpc.Status details = 1;</code>
     * @return \Google\Rpc\Status
     */
    public function getDetails()
    {
        return $this->details;
    }

    /**
     * Generated from protobuf field <code>.google.rpc.Status details = 1;</code>
     * @param \Google\Rpc\Status $var
     * @return $this
     */
    public function setDetails($var)
    {
        GPBUtil::checkMessage($var, \Google\Rpc\Status::class);
        $this->details = $var;

        return $this;
    }

    /**
     * The times the error occurred.
     *
     * Generated from protobuf field <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getTimestamps()
    {
        return $this->timestamps;
    }

    /**
     * The times the error occurred.
     *
     * Generated from protobuf field <code>repeated .google.protobuf.Timestamp timestamps = 2;</code>
     * @param \Google\Protobuf\Timestamp[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setTimestamps($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Protobuf\Timestamp::class);
        $this->timestamps = $arr;

        return $this;
    }

}


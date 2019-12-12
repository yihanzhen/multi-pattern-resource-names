<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/dlp.proto

namespace Google\Cloud\Dlp\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Shifts dates by random number of days, with option to be consistent for the
 * same context. See https://cloud.google.com/dlp/docs/concepts-date-shifting
 * to learn more.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.DateShiftConfig</code>
 */
final class DateShiftConfig extends \Google\Protobuf\Internal\Message
{
    /**
     * Range of shift in days. Actual shift will be selected at random within this
     * range (inclusive ends). Negative means shift to earlier in time. Must not
     * be more than 365250 days (1000 years) each direction.
     * For example, 3 means shift date to at most 3 days into the future.
     * [Required]
     *
     * Generated from protobuf field <code>int32 upper_bound_days = 1;</code>
     */
    private $upper_bound_days = 0;
    /**
     * For example, -5 means shift date to at most 5 days back in the past.
     * [Required]
     *
     * Generated from protobuf field <code>int32 lower_bound_days = 2;</code>
     */
    private $lower_bound_days = 0;
    /**
     * Points to the field that contains the context, for example, an entity id.
     * If set, must also set cryptoKey. If set, shift will be consistent for the
     * given context.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.FieldId context = 3;</code>
     */
    private $context = null;
    protected $method;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $upper_bound_days
     *           Range of shift in days. Actual shift will be selected at random within this
     *           range (inclusive ends). Negative means shift to earlier in time. Must not
     *           be more than 365250 days (1000 years) each direction.
     *           For example, 3 means shift date to at most 3 days into the future.
     *           [Required]
     *     @type int $lower_bound_days
     *           For example, -5 means shift date to at most 5 days back in the past.
     *           [Required]
     *     @type \Google\Cloud\Dlp\V2\FieldId $context
     *           Points to the field that contains the context, for example, an entity id.
     *           If set, must also set cryptoKey. If set, shift will be consistent for the
     *           given context.
     *     @type \Google\Cloud\Dlp\V2\CryptoKey $crypto_key
     *           Causes the shift to be computed based on this key and the context. This
     *           results in the same shift for the same context and crypto_key. If
     *           set, must also set context. Can only be applied to table items.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Privacy\Dlp\V2\Dlp::initOnce();
        parent::__construct($data);
    }

    /**
     * Range of shift in days. Actual shift will be selected at random within this
     * range (inclusive ends). Negative means shift to earlier in time. Must not
     * be more than 365250 days (1000 years) each direction.
     * For example, 3 means shift date to at most 3 days into the future.
     * [Required]
     *
     * Generated from protobuf field <code>int32 upper_bound_days = 1;</code>
     * @return int
     */
    public function getUpperBoundDays()
    {
        return $this->upper_bound_days;
    }

    /**
     * Range of shift in days. Actual shift will be selected at random within this
     * range (inclusive ends). Negative means shift to earlier in time. Must not
     * be more than 365250 days (1000 years) each direction.
     * For example, 3 means shift date to at most 3 days into the future.
     * [Required]
     *
     * Generated from protobuf field <code>int32 upper_bound_days = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setUpperBoundDays($var)
    {
        GPBUtil::checkInt32($var);
        $this->upper_bound_days = $var;

        return $this;
    }

    /**
     * For example, -5 means shift date to at most 5 days back in the past.
     * [Required]
     *
     * Generated from protobuf field <code>int32 lower_bound_days = 2;</code>
     * @return int
     */
    public function getLowerBoundDays()
    {
        return $this->lower_bound_days;
    }

    /**
     * For example, -5 means shift date to at most 5 days back in the past.
     * [Required]
     *
     * Generated from protobuf field <code>int32 lower_bound_days = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setLowerBoundDays($var)
    {
        GPBUtil::checkInt32($var);
        $this->lower_bound_days = $var;

        return $this;
    }

    /**
     * Points to the field that contains the context, for example, an entity id.
     * If set, must also set cryptoKey. If set, shift will be consistent for the
     * given context.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.FieldId context = 3;</code>
     * @return \Google\Cloud\Dlp\V2\FieldId
     */
    public function getContext()
    {
        return $this->context;
    }

    /**
     * Points to the field that contains the context, for example, an entity id.
     * If set, must also set cryptoKey. If set, shift will be consistent for the
     * given context.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.FieldId context = 3;</code>
     * @param \Google\Cloud\Dlp\V2\FieldId $var
     * @return $this
     */
    public function setContext($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\FieldId::class);
        $this->context = $var;

        return $this;
    }

    /**
     * Causes the shift to be computed based on this key and the context. This
     * results in the same shift for the same context and crypto_key. If
     * set, must also set context. Can only be applied to table items.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 4;</code>
     * @return \Google\Cloud\Dlp\V2\CryptoKey
     */
    public function getCryptoKey()
    {
        return $this->readOneof(4);
    }

    /**
     * Causes the shift to be computed based on this key and the context. This
     * results in the same shift for the same context and crypto_key. If
     * set, must also set context. Can only be applied to table items.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 4;</code>
     * @param \Google\Cloud\Dlp\V2\CryptoKey $var
     * @return $this
     */
    public function setCryptoKey($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\CryptoKey::class);
        $this->writeOneof(4, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getMethod()
    {
        return $this->whichOneof("method");
    }

}


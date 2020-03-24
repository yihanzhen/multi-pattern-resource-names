<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/logging/v2/logging_config.proto

namespace Google\Cloud\Logging\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Specifies a set of log entries that are not to be stored in
 * Logging. If your GCP resource receives a large volume of logs, you can
 * use exclusions to reduce your chargeable logs. Exclusions are
 * processed after log sinks, so you can export log entries before they are
 * excluded. Note that organization-level and folder-level exclusions don't
 * apply to child resources, and that you can't exclude audit log entries.
 *
 * Generated from protobuf message <code>google.logging.v2.LogExclusion</code>
 */
class LogExclusion extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. A client-assigned identifier, such as `"load-balancer-exclusion"`.
     * Identifiers are limited to 100 characters and can include only letters,
     * digits, underscores, hyphens, and periods. First character has to be
     * alphanumeric.
     *
     * Generated from protobuf field <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    protected $name = '';
    /**
     * Optional. A description of this exclusion.
     *
     * Generated from protobuf field <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    protected $description = '';
    /**
     * Required. An [advanced logs filter](/logging/docs/view/advanced-queries)
     * that matches the log entries to be excluded. By using the
     * [sample function](/logging/docs/view/advanced-queries#sample),
     * you can exclude less than 100% of the matching log entries.
     * For example, the following query matches 99% of low-severity log
     * entries from Google Cloud Storage buckets:
     * `"resource.type=gcs_bucket severity<ERROR sample(insertId, 0.99)"`
     *
     * Generated from protobuf field <code>string filter = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    protected $filter = '';
    /**
     * Optional. If set to True, then this exclusion is disabled and it does not
     * exclude any log entries. You can [update an
     * exclusion][google.logging.v2.ConfigServiceV2.UpdateExclusion] to change the
     * value of this field.
     *
     * Generated from protobuf field <code>bool disabled = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    protected $disabled = false;
    /**
     * Output only. The creation timestamp of the exclusion.
     * This field may not be present for older exclusions.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    protected $create_time = null;
    /**
     * Output only. The last update timestamp of the exclusion.
     * This field may not be present for older exclusions.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    protected $update_time = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *           Required. A client-assigned identifier, such as `"load-balancer-exclusion"`.
     *           Identifiers are limited to 100 characters and can include only letters,
     *           digits, underscores, hyphens, and periods. First character has to be
     *           alphanumeric.
     *     @type string $description
     *           Optional. A description of this exclusion.
     *     @type string $filter
     *           Required. An [advanced logs filter](/logging/docs/view/advanced-queries)
     *           that matches the log entries to be excluded. By using the
     *           [sample function](/logging/docs/view/advanced-queries#sample),
     *           you can exclude less than 100% of the matching log entries.
     *           For example, the following query matches 99% of low-severity log
     *           entries from Google Cloud Storage buckets:
     *           `"resource.type=gcs_bucket severity<ERROR sample(insertId, 0.99)"`
     *     @type bool $disabled
     *           Optional. If set to True, then this exclusion is disabled and it does not
     *           exclude any log entries. You can [update an
     *           exclusion][google.logging.v2.ConfigServiceV2.UpdateExclusion] to change the
     *           value of this field.
     *     @type \Google\Protobuf\Timestamp $create_time
     *           Output only. The creation timestamp of the exclusion.
     *           This field may not be present for older exclusions.
     *     @type \Google\Protobuf\Timestamp $update_time
     *           Output only. The last update timestamp of the exclusion.
     *           This field may not be present for older exclusions.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Logging\V2\LoggingConfig::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. A client-assigned identifier, such as `"load-balancer-exclusion"`.
     * Identifiers are limited to 100 characters and can include only letters,
     * digits, underscores, hyphens, and periods. First character has to be
     * alphanumeric.
     *
     * Generated from protobuf field <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Required. A client-assigned identifier, such as `"load-balancer-exclusion"`.
     * Identifiers are limited to 100 characters and can include only letters,
     * digits, underscores, hyphens, and periods. First character has to be
     * alphanumeric.
     *
     * Generated from protobuf field <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

    /**
     * Optional. A description of this exclusion.
     *
     * Generated from protobuf field <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * Optional. A description of this exclusion.
     *
     * Generated from protobuf field <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setDescription($var)
    {
        GPBUtil::checkString($var, True);
        $this->description = $var;

        return $this;
    }

    /**
     * Required. An [advanced logs filter](/logging/docs/view/advanced-queries)
     * that matches the log entries to be excluded. By using the
     * [sample function](/logging/docs/view/advanced-queries#sample),
     * you can exclude less than 100% of the matching log entries.
     * For example, the following query matches 99% of low-severity log
     * entries from Google Cloud Storage buckets:
     * `"resource.type=gcs_bucket severity<ERROR sample(insertId, 0.99)"`
     *
     * Generated from protobuf field <code>string filter = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return string
     */
    public function getFilter()
    {
        return $this->filter;
    }

    /**
     * Required. An [advanced logs filter](/logging/docs/view/advanced-queries)
     * that matches the log entries to be excluded. By using the
     * [sample function](/logging/docs/view/advanced-queries#sample),
     * you can exclude less than 100% of the matching log entries.
     * For example, the following query matches 99% of low-severity log
     * entries from Google Cloud Storage buckets:
     * `"resource.type=gcs_bucket severity<ERROR sample(insertId, 0.99)"`
     *
     * Generated from protobuf field <code>string filter = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param string $var
     * @return $this
     */
    public function setFilter($var)
    {
        GPBUtil::checkString($var, True);
        $this->filter = $var;

        return $this;
    }

    /**
     * Optional. If set to True, then this exclusion is disabled and it does not
     * exclude any log entries. You can [update an
     * exclusion][google.logging.v2.ConfigServiceV2.UpdateExclusion] to change the
     * value of this field.
     *
     * Generated from protobuf field <code>bool disabled = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return bool
     */
    public function getDisabled()
    {
        return $this->disabled;
    }

    /**
     * Optional. If set to True, then this exclusion is disabled and it does not
     * exclude any log entries. You can [update an
     * exclusion][google.logging.v2.ConfigServiceV2.UpdateExclusion] to change the
     * value of this field.
     *
     * Generated from protobuf field <code>bool disabled = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param bool $var
     * @return $this
     */
    public function setDisabled($var)
    {
        GPBUtil::checkBool($var);
        $this->disabled = $var;

        return $this;
    }

    /**
     * Output only. The creation timestamp of the exclusion.
     * This field may not be present for older exclusions.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getCreateTime()
    {
        return $this->create_time;
    }

    /**
     * Output only. The creation timestamp of the exclusion.
     * This field may not be present for older exclusions.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setCreateTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->create_time = $var;

        return $this;
    }

    /**
     * Output only. The last update timestamp of the exclusion.
     * This field may not be present for older exclusions.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getUpdateTime()
    {
        return $this->update_time;
    }

    /**
     * Output only. The last update timestamp of the exclusion.
     * This field may not be present for older exclusions.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setUpdateTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->update_time = $var;

        return $this;
    }

}


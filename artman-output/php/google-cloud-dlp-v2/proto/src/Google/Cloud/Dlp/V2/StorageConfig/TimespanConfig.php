<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/storage.proto

namespace Google\Cloud\Dlp\V2\StorageConfig;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Configuration of the timespan of the items to include in scanning.
 * Currently only supported when inspecting Google Cloud Storage and BigQuery.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.StorageConfig.TimespanConfig</code>
 */
class TimespanConfig extends \Google\Protobuf\Internal\Message
{
    /**
     * Exclude files or rows older than this value.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    protected $start_time = null;
    /**
     * Exclude files or rows newer than this value.
     * If set to zero, no upper time limit is applied.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    protected $end_time = null;
    /**
     * Specification of the field containing the timestamp of scanned items.
     * Used for data sources like Datastore and BigQuery.
     * For BigQuery:
     * Required to filter out rows based on the given start and
     * end times. If not specified and the table was modified between the given
     * start and end times, the entire table will be scanned.
     * The valid data types of the timestamp field are: `INTEGER`, `DATE`,
     * `TIMESTAMP`, or `DATETIME` BigQuery column.
     * For Datastore.
     * Valid data types of the timestamp field are: `TIMESTAMP`.
     * Datastore entity will be scanned if the timestamp property does not
     * exist or its value is empty or invalid.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.FieldId timestamp_field = 3;</code>
     */
    protected $timestamp_field = null;
    /**
     * When the job is started by a JobTrigger we will automatically figure out
     * a valid start_time to avoid scanning files that have not been modified
     * since the last time the JobTrigger executed. This will be based on the
     * time of the execution of the last run of the JobTrigger.
     *
     * Generated from protobuf field <code>bool enable_auto_population_of_timespan_config = 4;</code>
     */
    protected $enable_auto_population_of_timespan_config = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Protobuf\Timestamp $start_time
     *           Exclude files or rows older than this value.
     *     @type \Google\Protobuf\Timestamp $end_time
     *           Exclude files or rows newer than this value.
     *           If set to zero, no upper time limit is applied.
     *     @type \Google\Cloud\Dlp\V2\FieldId $timestamp_field
     *           Specification of the field containing the timestamp of scanned items.
     *           Used for data sources like Datastore and BigQuery.
     *           For BigQuery:
     *           Required to filter out rows based on the given start and
     *           end times. If not specified and the table was modified between the given
     *           start and end times, the entire table will be scanned.
     *           The valid data types of the timestamp field are: `INTEGER`, `DATE`,
     *           `TIMESTAMP`, or `DATETIME` BigQuery column.
     *           For Datastore.
     *           Valid data types of the timestamp field are: `TIMESTAMP`.
     *           Datastore entity will be scanned if the timestamp property does not
     *           exist or its value is empty or invalid.
     *     @type bool $enable_auto_population_of_timespan_config
     *           When the job is started by a JobTrigger we will automatically figure out
     *           a valid start_time to avoid scanning files that have not been modified
     *           since the last time the JobTrigger executed. This will be based on the
     *           time of the execution of the last run of the JobTrigger.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Privacy\Dlp\V2\Storage::initOnce();
        parent::__construct($data);
    }

    /**
     * Exclude files or rows older than this value.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp start_time = 1;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getStartTime()
    {
        return $this->start_time;
    }

    /**
     * Exclude files or rows older than this value.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp start_time = 1;</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setStartTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->start_time = $var;

        return $this;
    }

    /**
     * Exclude files or rows newer than this value.
     * If set to zero, no upper time limit is applied.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp end_time = 2;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getEndTime()
    {
        return $this->end_time;
    }

    /**
     * Exclude files or rows newer than this value.
     * If set to zero, no upper time limit is applied.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp end_time = 2;</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setEndTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->end_time = $var;

        return $this;
    }

    /**
     * Specification of the field containing the timestamp of scanned items.
     * Used for data sources like Datastore and BigQuery.
     * For BigQuery:
     * Required to filter out rows based on the given start and
     * end times. If not specified and the table was modified between the given
     * start and end times, the entire table will be scanned.
     * The valid data types of the timestamp field are: `INTEGER`, `DATE`,
     * `TIMESTAMP`, or `DATETIME` BigQuery column.
     * For Datastore.
     * Valid data types of the timestamp field are: `TIMESTAMP`.
     * Datastore entity will be scanned if the timestamp property does not
     * exist or its value is empty or invalid.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.FieldId timestamp_field = 3;</code>
     * @return \Google\Cloud\Dlp\V2\FieldId
     */
    public function getTimestampField()
    {
        return $this->timestamp_field;
    }

    /**
     * Specification of the field containing the timestamp of scanned items.
     * Used for data sources like Datastore and BigQuery.
     * For BigQuery:
     * Required to filter out rows based on the given start and
     * end times. If not specified and the table was modified between the given
     * start and end times, the entire table will be scanned.
     * The valid data types of the timestamp field are: `INTEGER`, `DATE`,
     * `TIMESTAMP`, or `DATETIME` BigQuery column.
     * For Datastore.
     * Valid data types of the timestamp field are: `TIMESTAMP`.
     * Datastore entity will be scanned if the timestamp property does not
     * exist or its value is empty or invalid.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.FieldId timestamp_field = 3;</code>
     * @param \Google\Cloud\Dlp\V2\FieldId $var
     * @return $this
     */
    public function setTimestampField($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\FieldId::class);
        $this->timestamp_field = $var;

        return $this;
    }

    /**
     * When the job is started by a JobTrigger we will automatically figure out
     * a valid start_time to avoid scanning files that have not been modified
     * since the last time the JobTrigger executed. This will be based on the
     * time of the execution of the last run of the JobTrigger.
     *
     * Generated from protobuf field <code>bool enable_auto_population_of_timespan_config = 4;</code>
     * @return bool
     */
    public function getEnableAutoPopulationOfTimespanConfig()
    {
        return $this->enable_auto_population_of_timespan_config;
    }

    /**
     * When the job is started by a JobTrigger we will automatically figure out
     * a valid start_time to avoid scanning files that have not been modified
     * since the last time the JobTrigger executed. This will be based on the
     * time of the execution of the last run of the JobTrigger.
     *
     * Generated from protobuf field <code>bool enable_auto_population_of_timespan_config = 4;</code>
     * @param bool $var
     * @return $this
     */
    public function setEnableAutoPopulationOfTimespanConfig($var)
    {
        GPBUtil::checkBool($var);
        $this->enable_auto_population_of_timespan_config = $var;

        return $this;
    }

}

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(TimespanConfig::class, \Google\Cloud\Dlp\V2\StorageConfig_TimespanConfig::class);


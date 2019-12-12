<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/dlp.proto

namespace Google\Cloud\Dlp\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Combines all of the information about a DLP job.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.DlpJob</code>
 */
final class DlpJob extends \Google\Protobuf\Internal\Message
{
    /**
     * The server-assigned name.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';
    /**
     * The type of job.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.DlpJobType type = 2;</code>
     */
    private $type = 0;
    /**
     * State of a job.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.DlpJob.JobState state = 3;</code>
     */
    private $state = 0;
    /**
     * Time when the job was created.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 6;</code>
     */
    private $create_time = null;
    /**
     * Time when the job started.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp start_time = 7;</code>
     */
    private $start_time = null;
    /**
     * Time when the job finished.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp end_time = 8;</code>
     */
    private $end_time = null;
    /**
     * If created by a job trigger, the resource name of the trigger that
     * instantiated the job.
     *
     * Generated from protobuf field <code>string job_trigger_name = 10;</code>
     */
    private $job_trigger_name = '';
    /**
     * A stream of errors encountered running the job.
     *
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2.Error errors = 11;</code>
     */
    private $errors;
    protected $details;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *           The server-assigned name.
     *     @type int $type
     *           The type of job.
     *     @type int $state
     *           State of a job.
     *     @type \Google\Cloud\Dlp\V2\AnalyzeDataSourceRiskDetails $risk_details
     *           Results from analyzing risk of a data source.
     *     @type \Google\Cloud\Dlp\V2\InspectDataSourceDetails $inspect_details
     *           Results from inspecting a data source.
     *     @type \Google\Protobuf\Timestamp $create_time
     *           Time when the job was created.
     *     @type \Google\Protobuf\Timestamp $start_time
     *           Time when the job started.
     *     @type \Google\Protobuf\Timestamp $end_time
     *           Time when the job finished.
     *     @type string $job_trigger_name
     *           If created by a job trigger, the resource name of the trigger that
     *           instantiated the job.
     *     @type \Google\Cloud\Dlp\V2\Error[]|\Google\Protobuf\Internal\RepeatedField $errors
     *           A stream of errors encountered running the job.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Privacy\Dlp\V2\Dlp::initOnce();
        parent::__construct($data);
    }

    /**
     * The server-assigned name.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * The server-assigned name.
     *
     * Generated from protobuf field <code>string name = 1;</code>
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
     * The type of job.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.DlpJobType type = 2;</code>
     * @return int
     */
    public function getType()
    {
        return $this->type;
    }

    /**
     * The type of job.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.DlpJobType type = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setType($var)
    {
        GPBUtil::checkEnum($var, \Google\Cloud\Dlp\V2\DlpJobType::class);
        $this->type = $var;

        return $this;
    }

    /**
     * State of a job.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.DlpJob.JobState state = 3;</code>
     * @return int
     */
    public function getState()
    {
        return $this->state;
    }

    /**
     * State of a job.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.DlpJob.JobState state = 3;</code>
     * @param int $var
     * @return $this
     */
    public function setState($var)
    {
        GPBUtil::checkEnum($var, \Google\Cloud\Dlp\V2\DlpJob_JobState::class);
        $this->state = $var;

        return $this;
    }

    /**
     * Results from analyzing risk of a data source.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails risk_details = 4;</code>
     * @return \Google\Cloud\Dlp\V2\AnalyzeDataSourceRiskDetails
     */
    public function getRiskDetails()
    {
        return $this->readOneof(4);
    }

    /**
     * Results from analyzing risk of a data source.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.AnalyzeDataSourceRiskDetails risk_details = 4;</code>
     * @param \Google\Cloud\Dlp\V2\AnalyzeDataSourceRiskDetails $var
     * @return $this
     */
    public function setRiskDetails($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\AnalyzeDataSourceRiskDetails::class);
        $this->writeOneof(4, $var);

        return $this;
    }

    /**
     * Results from inspecting a data source.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.InspectDataSourceDetails inspect_details = 5;</code>
     * @return \Google\Cloud\Dlp\V2\InspectDataSourceDetails
     */
    public function getInspectDetails()
    {
        return $this->readOneof(5);
    }

    /**
     * Results from inspecting a data source.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.InspectDataSourceDetails inspect_details = 5;</code>
     * @param \Google\Cloud\Dlp\V2\InspectDataSourceDetails $var
     * @return $this
     */
    public function setInspectDetails($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\InspectDataSourceDetails::class);
        $this->writeOneof(5, $var);

        return $this;
    }

    /**
     * Time when the job was created.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 6;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getCreateTime()
    {
        return $this->create_time;
    }

    /**
     * Time when the job was created.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 6;</code>
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
     * Time when the job started.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp start_time = 7;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getStartTime()
    {
        return $this->start_time;
    }

    /**
     * Time when the job started.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp start_time = 7;</code>
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
     * Time when the job finished.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp end_time = 8;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getEndTime()
    {
        return $this->end_time;
    }

    /**
     * Time when the job finished.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp end_time = 8;</code>
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
     * If created by a job trigger, the resource name of the trigger that
     * instantiated the job.
     *
     * Generated from protobuf field <code>string job_trigger_name = 10;</code>
     * @return string
     */
    public function getJobTriggerName()
    {
        return $this->job_trigger_name;
    }

    /**
     * If created by a job trigger, the resource name of the trigger that
     * instantiated the job.
     *
     * Generated from protobuf field <code>string job_trigger_name = 10;</code>
     * @param string $var
     * @return $this
     */
    public function setJobTriggerName($var)
    {
        GPBUtil::checkString($var, True);
        $this->job_trigger_name = $var;

        return $this;
    }

    /**
     * A stream of errors encountered running the job.
     *
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2.Error errors = 11;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getErrors()
    {
        return $this->errors;
    }

    /**
     * A stream of errors encountered running the job.
     *
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2.Error errors = 11;</code>
     * @param \Google\Cloud\Dlp\V2\Error[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setErrors($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Cloud\Dlp\V2\Error::class);
        $this->errors = $arr;

        return $this;
    }

    /**
     * @return string
     */
    public function getDetails()
    {
        return $this->whichOneof("details");
    }

}


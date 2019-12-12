<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataproc/v1beta2/jobs.proto

namespace Google\Cloud\Dataproc\V1beta2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Encapsulates the full scoping used to reference a job.
 *
 * Generated from protobuf message <code>google.cloud.dataproc.v1beta2.JobReference</code>
 */
final class JobReference extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The ID of the Google Cloud Platform project that the job
     * belongs to.
     *
     * Generated from protobuf field <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private $project_id = '';
    /**
     * Optional. The job ID, which must be unique within the project.
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or hyphens (-). The maximum length is 100 characters.
     * If not specified by the caller, the job ID will be provided by the server.
     *
     * Generated from protobuf field <code>string job_id = 2;</code>
     */
    private $job_id = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $project_id
     *           Required. The ID of the Google Cloud Platform project that the job
     *           belongs to.
     *     @type string $job_id
     *           Optional. The job ID, which must be unique within the project.
     *           The ID must contain only letters (a-z, A-Z), numbers (0-9),
     *           underscores (_), or hyphens (-). The maximum length is 100 characters.
     *           If not specified by the caller, the job ID will be provided by the server.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Dataproc\V1Beta2\Jobs::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. The ID of the Google Cloud Platform project that the job
     * belongs to.
     *
     * Generated from protobuf field <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return string
     */
    public function getProjectId()
    {
        return $this->project_id;
    }

    /**
     * Required. The ID of the Google Cloud Platform project that the job
     * belongs to.
     *
     * Generated from protobuf field <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param string $var
     * @return $this
     */
    public function setProjectId($var)
    {
        GPBUtil::checkString($var, True);
        $this->project_id = $var;

        return $this;
    }

    /**
     * Optional. The job ID, which must be unique within the project.
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or hyphens (-). The maximum length is 100 characters.
     * If not specified by the caller, the job ID will be provided by the server.
     *
     * Generated from protobuf field <code>string job_id = 2;</code>
     * @return string
     */
    public function getJobId()
    {
        return $this->job_id;
    }

    /**
     * Optional. The job ID, which must be unique within the project.
     * The ID must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or hyphens (-). The maximum length is 100 characters.
     * If not specified by the caller, the job ID will be provided by the server.
     *
     * Generated from protobuf field <code>string job_id = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setJobId($var)
    {
        GPBUtil::checkString($var, True);
        $this->job_id = $var;

        return $this;
    }

}


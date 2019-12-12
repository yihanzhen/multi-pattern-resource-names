<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4beta1/job_service.proto

namespace Google\Cloud\Talent\V4beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Delete job request.
 *
 * Generated from protobuf message <code>google.cloud.talent.v4beta1.DeleteJobRequest</code>
 */
final class DeleteJobRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The resource name of the job to be deleted.
     * The format is
     * "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}". For
     * example, "projects/foo/tenants/bar/jobs/baz".
     * If tenant id is unspecified, the default tenant is used. For
     * example, "projects/foo/jobs/bar".
     *
     * Generated from protobuf field <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private $name = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *           Required. The resource name of the job to be deleted.
     *           The format is
     *           "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}". For
     *           example, "projects/foo/tenants/bar/jobs/baz".
     *           If tenant id is unspecified, the default tenant is used. For
     *           example, "projects/foo/jobs/bar".
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Talent\V4Beta1\JobService::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. The resource name of the job to be deleted.
     * The format is
     * "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}". For
     * example, "projects/foo/tenants/bar/jobs/baz".
     * If tenant id is unspecified, the default tenant is used. For
     * example, "projects/foo/jobs/bar".
     *
     * Generated from protobuf field <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Required. The resource name of the job to be deleted.
     * The format is
     * "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}". For
     * example, "projects/foo/tenants/bar/jobs/baz".
     * If tenant id is unspecified, the default tenant is used. For
     * example, "projects/foo/jobs/bar".
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

}


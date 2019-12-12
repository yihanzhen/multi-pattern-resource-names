<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataproc/v1/autoscaling_policies.proto

namespace Google\Cloud\Dataproc\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A request to update an autoscaling policy.
 *
 * Generated from protobuf message <code>google.cloud.dataproc.v1.UpdateAutoscalingPolicyRequest</code>
 */
final class UpdateAutoscalingPolicyRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The updated autoscaling policy.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private $policy = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Cloud\Dataproc\V1\AutoscalingPolicy $policy
     *           Required. The updated autoscaling policy.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Dataproc\V1\AutoscalingPolicies::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. The updated autoscaling policy.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return \Google\Cloud\Dataproc\V1\AutoscalingPolicy
     */
    public function getPolicy()
    {
        return $this->policy;
    }

    /**
     * Required. The updated autoscaling policy.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param \Google\Cloud\Dataproc\V1\AutoscalingPolicy $var
     * @return $this
     */
    public function setPolicy($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1\AutoscalingPolicy::class);
        $this->policy = $var;

        return $this;
    }

}

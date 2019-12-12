<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataproc/v1beta2/autoscaling_policies.proto

namespace Google\Cloud\Dataproc\V1beta2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Basic autoscaling configurations for YARN.
 *
 * Generated from protobuf message <code>google.cloud.dataproc.v1beta2.BasicYarnAutoscalingConfig</code>
 */
final class BasicYarnAutoscalingConfig extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. Timeout for YARN graceful decommissioning of Node Managers.
     * Specifies the duration to wait for jobs to complete before forcefully
     * removing workers (and potentially interrupting jobs). Only applicable to
     * downscaling operations.
     * Bounds: [0s, 1d].
     *
     * Generated from protobuf field <code>.google.protobuf.Duration graceful_decommission_timeout = 5 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private $graceful_decommission_timeout = null;
    /**
     * Required. Fraction of average pending memory in the last cooldown period
     * for which to add workers. A scale-up factor of 1.0 will result in scaling
     * up so that there is no pending memory remaining after the update (more
     * aggressive scaling). A scale-up factor closer to 0 will result in a smaller
     * magnitude of scaling up (less aggressive scaling).
     * Bounds: [0.0, 1.0].
     *
     * Generated from protobuf field <code>double scale_up_factor = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private $scale_up_factor = 0.0;
    /**
     * Required. Fraction of average pending memory in the last cooldown period
     * for which to remove workers. A scale-down factor of 1 will result in
     * scaling down so that there is no available memory remaining after the
     * update (more aggressive scaling). A scale-down factor of 0 disables
     * removing workers, which can be beneficial for autoscaling a single job.
     * Bounds: [0.0, 1.0].
     *
     * Generated from protobuf field <code>double scale_down_factor = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private $scale_down_factor = 0.0;
    /**
     * Optional. Minimum scale-up threshold as a fraction of total cluster size
     * before scaling occurs. For example, in a 20-worker cluster, a threshold of
     * 0.1 means the autoscaler must recommend at least a 2-worker scale-up for
     * the cluster to scale. A threshold of 0 means the autoscaler will scale up
     * on any recommended change.
     * Bounds: [0.0, 1.0]. Default: 0.0.
     *
     * Generated from protobuf field <code>double scale_up_min_worker_fraction = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $scale_up_min_worker_fraction = 0.0;
    /**
     * Optional. Minimum scale-down threshold as a fraction of total cluster size
     * before scaling occurs. For example, in a 20-worker cluster, a threshold of
     * 0.1 means the autoscaler must recommend at least a 2 worker scale-down for
     * the cluster to scale. A threshold of 0 means the autoscaler will scale down
     * on any recommended change.
     * Bounds: [0.0, 1.0]. Default: 0.0.
     *
     * Generated from protobuf field <code>double scale_down_min_worker_fraction = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $scale_down_min_worker_fraction = 0.0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Protobuf\Duration $graceful_decommission_timeout
     *           Required. Timeout for YARN graceful decommissioning of Node Managers.
     *           Specifies the duration to wait for jobs to complete before forcefully
     *           removing workers (and potentially interrupting jobs). Only applicable to
     *           downscaling operations.
     *           Bounds: [0s, 1d].
     *     @type float $scale_up_factor
     *           Required. Fraction of average pending memory in the last cooldown period
     *           for which to add workers. A scale-up factor of 1.0 will result in scaling
     *           up so that there is no pending memory remaining after the update (more
     *           aggressive scaling). A scale-up factor closer to 0 will result in a smaller
     *           magnitude of scaling up (less aggressive scaling).
     *           Bounds: [0.0, 1.0].
     *     @type float $scale_down_factor
     *           Required. Fraction of average pending memory in the last cooldown period
     *           for which to remove workers. A scale-down factor of 1 will result in
     *           scaling down so that there is no available memory remaining after the
     *           update (more aggressive scaling). A scale-down factor of 0 disables
     *           removing workers, which can be beneficial for autoscaling a single job.
     *           Bounds: [0.0, 1.0].
     *     @type float $scale_up_min_worker_fraction
     *           Optional. Minimum scale-up threshold as a fraction of total cluster size
     *           before scaling occurs. For example, in a 20-worker cluster, a threshold of
     *           0.1 means the autoscaler must recommend at least a 2-worker scale-up for
     *           the cluster to scale. A threshold of 0 means the autoscaler will scale up
     *           on any recommended change.
     *           Bounds: [0.0, 1.0]. Default: 0.0.
     *     @type float $scale_down_min_worker_fraction
     *           Optional. Minimum scale-down threshold as a fraction of total cluster size
     *           before scaling occurs. For example, in a 20-worker cluster, a threshold of
     *           0.1 means the autoscaler must recommend at least a 2 worker scale-down for
     *           the cluster to scale. A threshold of 0 means the autoscaler will scale down
     *           on any recommended change.
     *           Bounds: [0.0, 1.0]. Default: 0.0.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Dataproc\V1Beta2\AutoscalingPolicies::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. Timeout for YARN graceful decommissioning of Node Managers.
     * Specifies the duration to wait for jobs to complete before forcefully
     * removing workers (and potentially interrupting jobs). Only applicable to
     * downscaling operations.
     * Bounds: [0s, 1d].
     *
     * Generated from protobuf field <code>.google.protobuf.Duration graceful_decommission_timeout = 5 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return \Google\Protobuf\Duration
     */
    public function getGracefulDecommissionTimeout()
    {
        return $this->graceful_decommission_timeout;
    }

    /**
     * Required. Timeout for YARN graceful decommissioning of Node Managers.
     * Specifies the duration to wait for jobs to complete before forcefully
     * removing workers (and potentially interrupting jobs). Only applicable to
     * downscaling operations.
     * Bounds: [0s, 1d].
     *
     * Generated from protobuf field <code>.google.protobuf.Duration graceful_decommission_timeout = 5 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param \Google\Protobuf\Duration $var
     * @return $this
     */
    public function setGracefulDecommissionTimeout($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Duration::class);
        $this->graceful_decommission_timeout = $var;

        return $this;
    }

    /**
     * Required. Fraction of average pending memory in the last cooldown period
     * for which to add workers. A scale-up factor of 1.0 will result in scaling
     * up so that there is no pending memory remaining after the update (more
     * aggressive scaling). A scale-up factor closer to 0 will result in a smaller
     * magnitude of scaling up (less aggressive scaling).
     * Bounds: [0.0, 1.0].
     *
     * Generated from protobuf field <code>double scale_up_factor = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return float
     */
    public function getScaleUpFactor()
    {
        return $this->scale_up_factor;
    }

    /**
     * Required. Fraction of average pending memory in the last cooldown period
     * for which to add workers. A scale-up factor of 1.0 will result in scaling
     * up so that there is no pending memory remaining after the update (more
     * aggressive scaling). A scale-up factor closer to 0 will result in a smaller
     * magnitude of scaling up (less aggressive scaling).
     * Bounds: [0.0, 1.0].
     *
     * Generated from protobuf field <code>double scale_up_factor = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param float $var
     * @return $this
     */
    public function setScaleUpFactor($var)
    {
        GPBUtil::checkDouble($var);
        $this->scale_up_factor = $var;

        return $this;
    }

    /**
     * Required. Fraction of average pending memory in the last cooldown period
     * for which to remove workers. A scale-down factor of 1 will result in
     * scaling down so that there is no available memory remaining after the
     * update (more aggressive scaling). A scale-down factor of 0 disables
     * removing workers, which can be beneficial for autoscaling a single job.
     * Bounds: [0.0, 1.0].
     *
     * Generated from protobuf field <code>double scale_down_factor = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return float
     */
    public function getScaleDownFactor()
    {
        return $this->scale_down_factor;
    }

    /**
     * Required. Fraction of average pending memory in the last cooldown period
     * for which to remove workers. A scale-down factor of 1 will result in
     * scaling down so that there is no available memory remaining after the
     * update (more aggressive scaling). A scale-down factor of 0 disables
     * removing workers, which can be beneficial for autoscaling a single job.
     * Bounds: [0.0, 1.0].
     *
     * Generated from protobuf field <code>double scale_down_factor = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param float $var
     * @return $this
     */
    public function setScaleDownFactor($var)
    {
        GPBUtil::checkDouble($var);
        $this->scale_down_factor = $var;

        return $this;
    }

    /**
     * Optional. Minimum scale-up threshold as a fraction of total cluster size
     * before scaling occurs. For example, in a 20-worker cluster, a threshold of
     * 0.1 means the autoscaler must recommend at least a 2-worker scale-up for
     * the cluster to scale. A threshold of 0 means the autoscaler will scale up
     * on any recommended change.
     * Bounds: [0.0, 1.0]. Default: 0.0.
     *
     * Generated from protobuf field <code>double scale_up_min_worker_fraction = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return float
     */
    public function getScaleUpMinWorkerFraction()
    {
        return $this->scale_up_min_worker_fraction;
    }

    /**
     * Optional. Minimum scale-up threshold as a fraction of total cluster size
     * before scaling occurs. For example, in a 20-worker cluster, a threshold of
     * 0.1 means the autoscaler must recommend at least a 2-worker scale-up for
     * the cluster to scale. A threshold of 0 means the autoscaler will scale up
     * on any recommended change.
     * Bounds: [0.0, 1.0]. Default: 0.0.
     *
     * Generated from protobuf field <code>double scale_up_min_worker_fraction = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param float $var
     * @return $this
     */
    public function setScaleUpMinWorkerFraction($var)
    {
        GPBUtil::checkDouble($var);
        $this->scale_up_min_worker_fraction = $var;

        return $this;
    }

    /**
     * Optional. Minimum scale-down threshold as a fraction of total cluster size
     * before scaling occurs. For example, in a 20-worker cluster, a threshold of
     * 0.1 means the autoscaler must recommend at least a 2 worker scale-down for
     * the cluster to scale. A threshold of 0 means the autoscaler will scale down
     * on any recommended change.
     * Bounds: [0.0, 1.0]. Default: 0.0.
     *
     * Generated from protobuf field <code>double scale_down_min_worker_fraction = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return float
     */
    public function getScaleDownMinWorkerFraction()
    {
        return $this->scale_down_min_worker_fraction;
    }

    /**
     * Optional. Minimum scale-down threshold as a fraction of total cluster size
     * before scaling occurs. For example, in a 20-worker cluster, a threshold of
     * 0.1 means the autoscaler must recommend at least a 2 worker scale-down for
     * the cluster to scale. A threshold of 0 means the autoscaler will scale down
     * on any recommended change.
     * Bounds: [0.0, 1.0]. Default: 0.0.
     *
     * Generated from protobuf field <code>double scale_down_min_worker_fraction = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param float $var
     * @return $this
     */
    public function setScaleDownMinWorkerFraction($var)
    {
        GPBUtil::checkDouble($var);
        $this->scale_down_min_worker_fraction = $var;

        return $this;
    }

}


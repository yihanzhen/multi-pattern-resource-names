<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataproc/v1beta2/clusters.proto

namespace Google\Cloud\Dataproc\V1beta2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The cluster config.
 *
 * Generated from protobuf message <code>google.cloud.dataproc.v1beta2.ClusterConfig</code>
 */
final class ClusterConfig extends \Google\Protobuf\Internal\Message
{
    /**
     * Optional. A Google Cloud Storage bucket used to stage job
     * dependencies, config files, and job driver console output.
     * If you do not specify a staging bucket, Cloud
     * Dataproc will determine a Cloud Storage location (US,
     * ASIA, or EU) for your cluster's staging bucket according to the Google
     * Compute Engine zone where your cluster is deployed, and then create
     * and manage this project-level, per-location bucket (see
     * [Cloud Dataproc staging
     * bucket](/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
     *
     * Generated from protobuf field <code>string config_bucket = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $config_bucket = '';
    /**
     * Optional. The shared Compute Engine config settings for
     * all instances in a cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.GceClusterConfig gce_cluster_config = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $gce_cluster_config = null;
    /**
     * Optional. The Compute Engine config settings for
     * the master instance in a cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig master_config = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $master_config = null;
    /**
     * Optional. The Compute Engine config settings for
     * worker instances in a cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig worker_config = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $worker_config = null;
    /**
     * Optional. The Compute Engine config settings for
     * additional worker instances in a cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig secondary_worker_config = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $secondary_worker_config = null;
    /**
     * Optional. The config settings for software inside the cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.SoftwareConfig software_config = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $software_config = null;
    /**
     * Optional. The config setting for auto delete cluster schedule.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.LifecycleConfig lifecycle_config = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $lifecycle_config = null;
    /**
     * Optional. Commands to execute on each node after config is
     * completed. By default, executables are run on master and all worker nodes.
     * You can test a node's <code>role</code> metadata to run an executable on
     * a master or worker node, as shown below using `curl` (you can also use
     * `wget`):
     *     ROLE=$(curl -H Metadata-Flavor:Google
     *     http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role)
     *     if [[ "${ROLE}" == 'Master' ]]; then
     *       ... master specific actions ...
     *     else
     *       ... worker specific actions ...
     *     fi
     *
     * Generated from protobuf field <code>repeated .google.cloud.dataproc.v1beta2.NodeInitializationAction initialization_actions = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $initialization_actions;
    /**
     * Optional. Encryption settings for the cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.EncryptionConfig encryption_config = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $encryption_config = null;
    /**
     * Optional. Autoscaling config for the policy associated with the cluster.
     * Cluster does not autoscale if this field is unset.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.AutoscalingConfig autoscaling_config = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $autoscaling_config = null;
    /**
     * Optional. Port/endpoint configuration for this cluster
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.EndpointConfig endpoint_config = 17 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $endpoint_config = null;
    /**
     * Optional. Security related configuration.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.SecurityConfig security_config = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $security_config = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $config_bucket
     *           Optional. A Google Cloud Storage bucket used to stage job
     *           dependencies, config files, and job driver console output.
     *           If you do not specify a staging bucket, Cloud
     *           Dataproc will determine a Cloud Storage location (US,
     *           ASIA, or EU) for your cluster's staging bucket according to the Google
     *           Compute Engine zone where your cluster is deployed, and then create
     *           and manage this project-level, per-location bucket (see
     *           [Cloud Dataproc staging
     *           bucket](/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
     *     @type \Google\Cloud\Dataproc\V1beta2\GceClusterConfig $gce_cluster_config
     *           Optional. The shared Compute Engine config settings for
     *           all instances in a cluster.
     *     @type \Google\Cloud\Dataproc\V1beta2\InstanceGroupConfig $master_config
     *           Optional. The Compute Engine config settings for
     *           the master instance in a cluster.
     *     @type \Google\Cloud\Dataproc\V1beta2\InstanceGroupConfig $worker_config
     *           Optional. The Compute Engine config settings for
     *           worker instances in a cluster.
     *     @type \Google\Cloud\Dataproc\V1beta2\InstanceGroupConfig $secondary_worker_config
     *           Optional. The Compute Engine config settings for
     *           additional worker instances in a cluster.
     *     @type \Google\Cloud\Dataproc\V1beta2\SoftwareConfig $software_config
     *           Optional. The config settings for software inside the cluster.
     *     @type \Google\Cloud\Dataproc\V1beta2\LifecycleConfig $lifecycle_config
     *           Optional. The config setting for auto delete cluster schedule.
     *     @type \Google\Cloud\Dataproc\V1beta2\NodeInitializationAction[]|\Google\Protobuf\Internal\RepeatedField $initialization_actions
     *           Optional. Commands to execute on each node after config is
     *           completed. By default, executables are run on master and all worker nodes.
     *           You can test a node's <code>role</code> metadata to run an executable on
     *           a master or worker node, as shown below using `curl` (you can also use
     *           `wget`):
     *               ROLE=$(curl -H Metadata-Flavor:Google
     *               http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role)
     *               if [[ "${ROLE}" == 'Master' ]]; then
     *                 ... master specific actions ...
     *               else
     *                 ... worker specific actions ...
     *               fi
     *     @type \Google\Cloud\Dataproc\V1beta2\EncryptionConfig $encryption_config
     *           Optional. Encryption settings for the cluster.
     *     @type \Google\Cloud\Dataproc\V1beta2\AutoscalingConfig $autoscaling_config
     *           Optional. Autoscaling config for the policy associated with the cluster.
     *           Cluster does not autoscale if this field is unset.
     *     @type \Google\Cloud\Dataproc\V1beta2\EndpointConfig $endpoint_config
     *           Optional. Port/endpoint configuration for this cluster
     *     @type \Google\Cloud\Dataproc\V1beta2\SecurityConfig $security_config
     *           Optional. Security related configuration.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Dataproc\V1Beta2\Clusters::initOnce();
        parent::__construct($data);
    }

    /**
     * Optional. A Google Cloud Storage bucket used to stage job
     * dependencies, config files, and job driver console output.
     * If you do not specify a staging bucket, Cloud
     * Dataproc will determine a Cloud Storage location (US,
     * ASIA, or EU) for your cluster's staging bucket according to the Google
     * Compute Engine zone where your cluster is deployed, and then create
     * and manage this project-level, per-location bucket (see
     * [Cloud Dataproc staging
     * bucket](/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
     *
     * Generated from protobuf field <code>string config_bucket = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getConfigBucket()
    {
        return $this->config_bucket;
    }

    /**
     * Optional. A Google Cloud Storage bucket used to stage job
     * dependencies, config files, and job driver console output.
     * If you do not specify a staging bucket, Cloud
     * Dataproc will determine a Cloud Storage location (US,
     * ASIA, or EU) for your cluster's staging bucket according to the Google
     * Compute Engine zone where your cluster is deployed, and then create
     * and manage this project-level, per-location bucket (see
     * [Cloud Dataproc staging
     * bucket](/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
     *
     * Generated from protobuf field <code>string config_bucket = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setConfigBucket($var)
    {
        GPBUtil::checkString($var, True);
        $this->config_bucket = $var;

        return $this;
    }

    /**
     * Optional. The shared Compute Engine config settings for
     * all instances in a cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.GceClusterConfig gce_cluster_config = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return \Google\Cloud\Dataproc\V1beta2\GceClusterConfig
     */
    public function getGceClusterConfig()
    {
        return $this->gce_cluster_config;
    }

    /**
     * Optional. The shared Compute Engine config settings for
     * all instances in a cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.GceClusterConfig gce_cluster_config = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param \Google\Cloud\Dataproc\V1beta2\GceClusterConfig $var
     * @return $this
     */
    public function setGceClusterConfig($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\GceClusterConfig::class);
        $this->gce_cluster_config = $var;

        return $this;
    }

    /**
     * Optional. The Compute Engine config settings for
     * the master instance in a cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig master_config = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return \Google\Cloud\Dataproc\V1beta2\InstanceGroupConfig
     */
    public function getMasterConfig()
    {
        return $this->master_config;
    }

    /**
     * Optional. The Compute Engine config settings for
     * the master instance in a cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig master_config = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param \Google\Cloud\Dataproc\V1beta2\InstanceGroupConfig $var
     * @return $this
     */
    public function setMasterConfig($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\InstanceGroupConfig::class);
        $this->master_config = $var;

        return $this;
    }

    /**
     * Optional. The Compute Engine config settings for
     * worker instances in a cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig worker_config = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return \Google\Cloud\Dataproc\V1beta2\InstanceGroupConfig
     */
    public function getWorkerConfig()
    {
        return $this->worker_config;
    }

    /**
     * Optional. The Compute Engine config settings for
     * worker instances in a cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig worker_config = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param \Google\Cloud\Dataproc\V1beta2\InstanceGroupConfig $var
     * @return $this
     */
    public function setWorkerConfig($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\InstanceGroupConfig::class);
        $this->worker_config = $var;

        return $this;
    }

    /**
     * Optional. The Compute Engine config settings for
     * additional worker instances in a cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig secondary_worker_config = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return \Google\Cloud\Dataproc\V1beta2\InstanceGroupConfig
     */
    public function getSecondaryWorkerConfig()
    {
        return $this->secondary_worker_config;
    }

    /**
     * Optional. The Compute Engine config settings for
     * additional worker instances in a cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig secondary_worker_config = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param \Google\Cloud\Dataproc\V1beta2\InstanceGroupConfig $var
     * @return $this
     */
    public function setSecondaryWorkerConfig($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\InstanceGroupConfig::class);
        $this->secondary_worker_config = $var;

        return $this;
    }

    /**
     * Optional. The config settings for software inside the cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.SoftwareConfig software_config = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return \Google\Cloud\Dataproc\V1beta2\SoftwareConfig
     */
    public function getSoftwareConfig()
    {
        return $this->software_config;
    }

    /**
     * Optional. The config settings for software inside the cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.SoftwareConfig software_config = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param \Google\Cloud\Dataproc\V1beta2\SoftwareConfig $var
     * @return $this
     */
    public function setSoftwareConfig($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\SoftwareConfig::class);
        $this->software_config = $var;

        return $this;
    }

    /**
     * Optional. The config setting for auto delete cluster schedule.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.LifecycleConfig lifecycle_config = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return \Google\Cloud\Dataproc\V1beta2\LifecycleConfig
     */
    public function getLifecycleConfig()
    {
        return $this->lifecycle_config;
    }

    /**
     * Optional. The config setting for auto delete cluster schedule.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.LifecycleConfig lifecycle_config = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param \Google\Cloud\Dataproc\V1beta2\LifecycleConfig $var
     * @return $this
     */
    public function setLifecycleConfig($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\LifecycleConfig::class);
        $this->lifecycle_config = $var;

        return $this;
    }

    /**
     * Optional. Commands to execute on each node after config is
     * completed. By default, executables are run on master and all worker nodes.
     * You can test a node's <code>role</code> metadata to run an executable on
     * a master or worker node, as shown below using `curl` (you can also use
     * `wget`):
     *     ROLE=$(curl -H Metadata-Flavor:Google
     *     http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role)
     *     if [[ "${ROLE}" == 'Master' ]]; then
     *       ... master specific actions ...
     *     else
     *       ... worker specific actions ...
     *     fi
     *
     * Generated from protobuf field <code>repeated .google.cloud.dataproc.v1beta2.NodeInitializationAction initialization_actions = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getInitializationActions()
    {
        return $this->initialization_actions;
    }

    /**
     * Optional. Commands to execute on each node after config is
     * completed. By default, executables are run on master and all worker nodes.
     * You can test a node's <code>role</code> metadata to run an executable on
     * a master or worker node, as shown below using `curl` (you can also use
     * `wget`):
     *     ROLE=$(curl -H Metadata-Flavor:Google
     *     http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role)
     *     if [[ "${ROLE}" == 'Master' ]]; then
     *       ... master specific actions ...
     *     else
     *       ... worker specific actions ...
     *     fi
     *
     * Generated from protobuf field <code>repeated .google.cloud.dataproc.v1beta2.NodeInitializationAction initialization_actions = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param \Google\Cloud\Dataproc\V1beta2\NodeInitializationAction[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setInitializationActions($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Cloud\Dataproc\V1beta2\NodeInitializationAction::class);
        $this->initialization_actions = $arr;

        return $this;
    }

    /**
     * Optional. Encryption settings for the cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.EncryptionConfig encryption_config = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return \Google\Cloud\Dataproc\V1beta2\EncryptionConfig
     */
    public function getEncryptionConfig()
    {
        return $this->encryption_config;
    }

    /**
     * Optional. Encryption settings for the cluster.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.EncryptionConfig encryption_config = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param \Google\Cloud\Dataproc\V1beta2\EncryptionConfig $var
     * @return $this
     */
    public function setEncryptionConfig($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\EncryptionConfig::class);
        $this->encryption_config = $var;

        return $this;
    }

    /**
     * Optional. Autoscaling config for the policy associated with the cluster.
     * Cluster does not autoscale if this field is unset.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.AutoscalingConfig autoscaling_config = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return \Google\Cloud\Dataproc\V1beta2\AutoscalingConfig
     */
    public function getAutoscalingConfig()
    {
        return $this->autoscaling_config;
    }

    /**
     * Optional. Autoscaling config for the policy associated with the cluster.
     * Cluster does not autoscale if this field is unset.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.AutoscalingConfig autoscaling_config = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param \Google\Cloud\Dataproc\V1beta2\AutoscalingConfig $var
     * @return $this
     */
    public function setAutoscalingConfig($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\AutoscalingConfig::class);
        $this->autoscaling_config = $var;

        return $this;
    }

    /**
     * Optional. Port/endpoint configuration for this cluster
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.EndpointConfig endpoint_config = 17 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return \Google\Cloud\Dataproc\V1beta2\EndpointConfig
     */
    public function getEndpointConfig()
    {
        return $this->endpoint_config;
    }

    /**
     * Optional. Port/endpoint configuration for this cluster
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.EndpointConfig endpoint_config = 17 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param \Google\Cloud\Dataproc\V1beta2\EndpointConfig $var
     * @return $this
     */
    public function setEndpointConfig($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\EndpointConfig::class);
        $this->endpoint_config = $var;

        return $this;
    }

    /**
     * Optional. Security related configuration.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.SecurityConfig security_config = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return \Google\Cloud\Dataproc\V1beta2\SecurityConfig
     */
    public function getSecurityConfig()
    {
        return $this->security_config;
    }

    /**
     * Optional. Security related configuration.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.SecurityConfig security_config = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param \Google\Cloud\Dataproc\V1beta2\SecurityConfig $var
     * @return $this
     */
    public function setSecurityConfig($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\SecurityConfig::class);
        $this->security_config = $var;

        return $this;
    }

}


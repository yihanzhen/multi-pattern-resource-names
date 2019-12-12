// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/clusters.proto

package com.google.cloud.dataproc.v1beta2;

public interface ClusterConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.ClusterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. A Google Cloud Storage bucket used to stage job
   * dependencies, config files, and job driver console output.
   * If you do not specify a staging bucket, Cloud
   * Dataproc will determine a Cloud Storage location (US,
   * ASIA, or EU) for your cluster's staging bucket according to the Google
   * Compute Engine zone where your cluster is deployed, and then create
   * and manage this project-level, per-location bucket (see
   * [Cloud Dataproc staging
   * bucket](/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
   * </pre>
   *
   * <code>string config_bucket = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getConfigBucket();
  /**
   * <pre>
   * Optional. A Google Cloud Storage bucket used to stage job
   * dependencies, config files, and job driver console output.
   * If you do not specify a staging bucket, Cloud
   * Dataproc will determine a Cloud Storage location (US,
   * ASIA, or EU) for your cluster's staging bucket according to the Google
   * Compute Engine zone where your cluster is deployed, and then create
   * and manage this project-level, per-location bucket (see
   * [Cloud Dataproc staging
   * bucket](/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
   * </pre>
   *
   * <code>string config_bucket = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString
      getConfigBucketBytes();

  /**
   * <pre>
   * Optional. The shared Compute Engine config settings for
   * all instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.GceClusterConfig gce_cluster_config = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean hasGceClusterConfig();
  /**
   * <pre>
   * Optional. The shared Compute Engine config settings for
   * all instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.GceClusterConfig gce_cluster_config = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.GceClusterConfig getGceClusterConfig();
  /**
   * <pre>
   * Optional. The shared Compute Engine config settings for
   * all instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.GceClusterConfig gce_cluster_config = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.GceClusterConfigOrBuilder getGceClusterConfigOrBuilder();

  /**
   * <pre>
   * Optional. The Compute Engine config settings for
   * the master instance in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig master_config = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean hasMasterConfig();
  /**
   * <pre>
   * Optional. The Compute Engine config settings for
   * the master instance in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig master_config = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.InstanceGroupConfig getMasterConfig();
  /**
   * <pre>
   * Optional. The Compute Engine config settings for
   * the master instance in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig master_config = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.InstanceGroupConfigOrBuilder getMasterConfigOrBuilder();

  /**
   * <pre>
   * Optional. The Compute Engine config settings for
   * worker instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig worker_config = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean hasWorkerConfig();
  /**
   * <pre>
   * Optional. The Compute Engine config settings for
   * worker instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig worker_config = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.InstanceGroupConfig getWorkerConfig();
  /**
   * <pre>
   * Optional. The Compute Engine config settings for
   * worker instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig worker_config = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.InstanceGroupConfigOrBuilder getWorkerConfigOrBuilder();

  /**
   * <pre>
   * Optional. The Compute Engine config settings for
   * additional worker instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig secondary_worker_config = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean hasSecondaryWorkerConfig();
  /**
   * <pre>
   * Optional. The Compute Engine config settings for
   * additional worker instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig secondary_worker_config = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.InstanceGroupConfig getSecondaryWorkerConfig();
  /**
   * <pre>
   * Optional. The Compute Engine config settings for
   * additional worker instances in a cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.InstanceGroupConfig secondary_worker_config = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.InstanceGroupConfigOrBuilder getSecondaryWorkerConfigOrBuilder();

  /**
   * <pre>
   * Optional. The config settings for software inside the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SoftwareConfig software_config = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean hasSoftwareConfig();
  /**
   * <pre>
   * Optional. The config settings for software inside the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SoftwareConfig software_config = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.SoftwareConfig getSoftwareConfig();
  /**
   * <pre>
   * Optional. The config settings for software inside the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SoftwareConfig software_config = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.SoftwareConfigOrBuilder getSoftwareConfigOrBuilder();

  /**
   * <pre>
   * Optional. The config setting for auto delete cluster schedule.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.LifecycleConfig lifecycle_config = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean hasLifecycleConfig();
  /**
   * <pre>
   * Optional. The config setting for auto delete cluster schedule.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.LifecycleConfig lifecycle_config = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.LifecycleConfig getLifecycleConfig();
  /**
   * <pre>
   * Optional. The config setting for auto delete cluster schedule.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.LifecycleConfig lifecycle_config = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.LifecycleConfigOrBuilder getLifecycleConfigOrBuilder();

  /**
   * <pre>
   * Optional. Commands to execute on each node after config is
   * completed. By default, executables are run on master and all worker nodes.
   * You can test a node's &lt;code&gt;role&lt;/code&gt; metadata to run an executable on
   * a master or worker node, as shown below using `curl` (you can also use
   * `wget`):
   *     ROLE=$(curl -H Metadata-Flavor:Google
   *     http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role)
   *     if [[ "${ROLE}" == 'Master' ]]; then
   *       ... master specific actions ...
   *     else
   *       ... worker specific actions ...
   *     fi
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.NodeInitializationAction initialization_actions = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.dataproc.v1beta2.NodeInitializationAction> 
      getInitializationActionsList();
  /**
   * <pre>
   * Optional. Commands to execute on each node after config is
   * completed. By default, executables are run on master and all worker nodes.
   * You can test a node's &lt;code&gt;role&lt;/code&gt; metadata to run an executable on
   * a master or worker node, as shown below using `curl` (you can also use
   * `wget`):
   *     ROLE=$(curl -H Metadata-Flavor:Google
   *     http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role)
   *     if [[ "${ROLE}" == 'Master' ]]; then
   *       ... master specific actions ...
   *     else
   *       ... worker specific actions ...
   *     fi
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.NodeInitializationAction initialization_actions = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.NodeInitializationAction getInitializationActions(int index);
  /**
   * <pre>
   * Optional. Commands to execute on each node after config is
   * completed. By default, executables are run on master and all worker nodes.
   * You can test a node's &lt;code&gt;role&lt;/code&gt; metadata to run an executable on
   * a master or worker node, as shown below using `curl` (you can also use
   * `wget`):
   *     ROLE=$(curl -H Metadata-Flavor:Google
   *     http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role)
   *     if [[ "${ROLE}" == 'Master' ]]; then
   *       ... master specific actions ...
   *     else
   *       ... worker specific actions ...
   *     fi
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.NodeInitializationAction initialization_actions = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getInitializationActionsCount();
  /**
   * <pre>
   * Optional. Commands to execute on each node after config is
   * completed. By default, executables are run on master and all worker nodes.
   * You can test a node's &lt;code&gt;role&lt;/code&gt; metadata to run an executable on
   * a master or worker node, as shown below using `curl` (you can also use
   * `wget`):
   *     ROLE=$(curl -H Metadata-Flavor:Google
   *     http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role)
   *     if [[ "${ROLE}" == 'Master' ]]; then
   *       ... master specific actions ...
   *     else
   *       ... worker specific actions ...
   *     fi
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.NodeInitializationAction initialization_actions = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1beta2.NodeInitializationActionOrBuilder> 
      getInitializationActionsOrBuilderList();
  /**
   * <pre>
   * Optional. Commands to execute on each node after config is
   * completed. By default, executables are run on master and all worker nodes.
   * You can test a node's &lt;code&gt;role&lt;/code&gt; metadata to run an executable on
   * a master or worker node, as shown below using `curl` (you can also use
   * `wget`):
   *     ROLE=$(curl -H Metadata-Flavor:Google
   *     http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role)
   *     if [[ "${ROLE}" == 'Master' ]]; then
   *       ... master specific actions ...
   *     else
   *       ... worker specific actions ...
   *     fi
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.NodeInitializationAction initialization_actions = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.NodeInitializationActionOrBuilder getInitializationActionsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Encryption settings for the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.EncryptionConfig encryption_config = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean hasEncryptionConfig();
  /**
   * <pre>
   * Optional. Encryption settings for the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.EncryptionConfig encryption_config = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.EncryptionConfig getEncryptionConfig();
  /**
   * <pre>
   * Optional. Encryption settings for the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.EncryptionConfig encryption_config = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.EncryptionConfigOrBuilder getEncryptionConfigOrBuilder();

  /**
   * <pre>
   * Optional. Autoscaling config for the policy associated with the cluster.
   * Cluster does not autoscale if this field is unset.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.AutoscalingConfig autoscaling_config = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean hasAutoscalingConfig();
  /**
   * <pre>
   * Optional. Autoscaling config for the policy associated with the cluster.
   * Cluster does not autoscale if this field is unset.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.AutoscalingConfig autoscaling_config = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.AutoscalingConfig getAutoscalingConfig();
  /**
   * <pre>
   * Optional. Autoscaling config for the policy associated with the cluster.
   * Cluster does not autoscale if this field is unset.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.AutoscalingConfig autoscaling_config = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.AutoscalingConfigOrBuilder getAutoscalingConfigOrBuilder();

  /**
   * <pre>
   * Optional. Port/endpoint configuration for this cluster
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.EndpointConfig endpoint_config = 17 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean hasEndpointConfig();
  /**
   * <pre>
   * Optional. Port/endpoint configuration for this cluster
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.EndpointConfig endpoint_config = 17 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.EndpointConfig getEndpointConfig();
  /**
   * <pre>
   * Optional. Port/endpoint configuration for this cluster
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.EndpointConfig endpoint_config = 17 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.EndpointConfigOrBuilder getEndpointConfigOrBuilder();

  /**
   * <pre>
   * Optional. Security related configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SecurityConfig security_config = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean hasSecurityConfig();
  /**
   * <pre>
   * Optional. Security related configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SecurityConfig security_config = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.SecurityConfig getSecurityConfig();
  /**
   * <pre>
   * Optional. Security related configuration.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.SecurityConfig security_config = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1beta2.SecurityConfigOrBuilder getSecurityConfigOrBuilder();
}

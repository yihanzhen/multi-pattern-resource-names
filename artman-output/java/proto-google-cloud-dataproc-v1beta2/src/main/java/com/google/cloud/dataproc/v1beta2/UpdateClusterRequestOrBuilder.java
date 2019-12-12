// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/clusters.proto

package com.google.cloud.dataproc.v1beta2;

public interface UpdateClusterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.UpdateClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the Google Cloud Platform project the
   * cluster belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Required. The ID of the Google Cloud Platform project the
   * cluster belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Required. The Cloud Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * Required. The Cloud Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * Required. The cluster name.
   * </pre>
   *
   * <code>string cluster_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getClusterName();
  /**
   * <pre>
   * Required. The cluster name.
   * </pre>
   *
   * <code>string cluster_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getClusterNameBytes();

  /**
   * <pre>
   * Required. The changes to the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasCluster();
  /**
   * <pre>
   * Required. The changes to the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataproc.v1beta2.Cluster getCluster();
  /**
   * <pre>
   * Required. The changes to the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataproc.v1beta2.ClusterOrBuilder getClusterOrBuilder();

  /**
   * <pre>
   * Optional. Timeout for graceful YARN decomissioning. Graceful
   * decommissioning allows removing nodes from the cluster without
   * interrupting jobs in progress. Timeout specifies how long to wait for jobs
   * in progress to finish before forcefully removing nodes (and potentially
   * interrupting jobs). Default timeout is 0 (for forceful decommission), and
   * the maximum allowed timeout is 1 day.
   * Only supported on Dataproc image versions 1.2 and higher.
   * </pre>
   *
   * <code>.google.protobuf.Duration graceful_decommission_timeout = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean hasGracefulDecommissionTimeout();
  /**
   * <pre>
   * Optional. Timeout for graceful YARN decomissioning. Graceful
   * decommissioning allows removing nodes from the cluster without
   * interrupting jobs in progress. Timeout specifies how long to wait for jobs
   * in progress to finish before forcefully removing nodes (and potentially
   * interrupting jobs). Default timeout is 0 (for forceful decommission), and
   * the maximum allowed timeout is 1 day.
   * Only supported on Dataproc image versions 1.2 and higher.
   * </pre>
   *
   * <code>.google.protobuf.Duration graceful_decommission_timeout = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.Duration getGracefulDecommissionTimeout();
  /**
   * <pre>
   * Optional. Timeout for graceful YARN decomissioning. Graceful
   * decommissioning allows removing nodes from the cluster without
   * interrupting jobs in progress. Timeout specifies how long to wait for jobs
   * in progress to finish before forcefully removing nodes (and potentially
   * interrupting jobs). Default timeout is 0 (for forceful decommission), and
   * the maximum allowed timeout is 1 day.
   * Only supported on Dataproc image versions 1.2 and higher.
   * </pre>
   *
   * <code>.google.protobuf.Duration graceful_decommission_timeout = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.DurationOrBuilder getGracefulDecommissionTimeoutOrBuilder();

  /**
   * <pre>
   * Required. Specifies the path, relative to `Cluster`, of
   * the field to update. For example, to change the number of workers
   * in a cluster to 5, the `update_mask` parameter would be
   * specified as `config.worker_config.num_instances`,
   * and the `PATCH` request body would specify the new value, as follows:
   *     {
   *       "config":{
   *         "workerConfig":{
   *           "numInstances":"5"
   *         }
   *       }
   *     }
   * Similarly, to change the number of preemptible workers in a cluster to 5,
   * the `update_mask` parameter would be
   * `config.secondary_worker_config.num_instances`, and the `PATCH` request
   * body would be set as follows:
   *     {
   *       "config":{
   *         "secondaryWorkerConfig":{
   *           "numInstances":"5"
   *         }
   *       }
   *     }
   * &lt;strong&gt;Note:&lt;/strong&gt; currently only the following fields can be updated:
   * &lt;table&gt;
   * &lt;tr&gt;
   * &lt;td&gt;&lt;strong&gt;Mask&lt;/strong&gt;&lt;/td&gt;&lt;td&gt;&lt;strong&gt;Purpose&lt;/strong&gt;&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;labels&lt;/td&gt;&lt;td&gt;Updates labels&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.worker_config.num_instances&lt;/td&gt;&lt;td&gt;Resize primary worker
   * group&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.secondary_worker_config.num_instances&lt;/td&gt;&lt;td&gt;Resize secondary
   * worker group&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.lifecycle_config.auto_delete_ttl&lt;/td&gt;&lt;td&gt;Reset MAX TTL
   * duration&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.lifecycle_config.auto_delete_time&lt;/td&gt;&lt;td&gt;Update MAX TTL
   * deletion timestamp&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.lifecycle_config.idle_delete_ttl&lt;/td&gt;&lt;td&gt;Update Idle TTL
   * duration&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.autoscaling_config.policy_uri&lt;/td&gt;&lt;td&gt;Use, stop using, or change
   * autoscaling policies&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;/table&gt;
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. Specifies the path, relative to `Cluster`, of
   * the field to update. For example, to change the number of workers
   * in a cluster to 5, the `update_mask` parameter would be
   * specified as `config.worker_config.num_instances`,
   * and the `PATCH` request body would specify the new value, as follows:
   *     {
   *       "config":{
   *         "workerConfig":{
   *           "numInstances":"5"
   *         }
   *       }
   *     }
   * Similarly, to change the number of preemptible workers in a cluster to 5,
   * the `update_mask` parameter would be
   * `config.secondary_worker_config.num_instances`, and the `PATCH` request
   * body would be set as follows:
   *     {
   *       "config":{
   *         "secondaryWorkerConfig":{
   *           "numInstances":"5"
   *         }
   *       }
   *     }
   * &lt;strong&gt;Note:&lt;/strong&gt; currently only the following fields can be updated:
   * &lt;table&gt;
   * &lt;tr&gt;
   * &lt;td&gt;&lt;strong&gt;Mask&lt;/strong&gt;&lt;/td&gt;&lt;td&gt;&lt;strong&gt;Purpose&lt;/strong&gt;&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;labels&lt;/td&gt;&lt;td&gt;Updates labels&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.worker_config.num_instances&lt;/td&gt;&lt;td&gt;Resize primary worker
   * group&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.secondary_worker_config.num_instances&lt;/td&gt;&lt;td&gt;Resize secondary
   * worker group&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.lifecycle_config.auto_delete_ttl&lt;/td&gt;&lt;td&gt;Reset MAX TTL
   * duration&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.lifecycle_config.auto_delete_time&lt;/td&gt;&lt;td&gt;Update MAX TTL
   * deletion timestamp&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.lifecycle_config.idle_delete_ttl&lt;/td&gt;&lt;td&gt;Update Idle TTL
   * duration&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.autoscaling_config.policy_uri&lt;/td&gt;&lt;td&gt;Use, stop using, or change
   * autoscaling policies&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;/table&gt;
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. Specifies the path, relative to `Cluster`, of
   * the field to update. For example, to change the number of workers
   * in a cluster to 5, the `update_mask` parameter would be
   * specified as `config.worker_config.num_instances`,
   * and the `PATCH` request body would specify the new value, as follows:
   *     {
   *       "config":{
   *         "workerConfig":{
   *           "numInstances":"5"
   *         }
   *       }
   *     }
   * Similarly, to change the number of preemptible workers in a cluster to 5,
   * the `update_mask` parameter would be
   * `config.secondary_worker_config.num_instances`, and the `PATCH` request
   * body would be set as follows:
   *     {
   *       "config":{
   *         "secondaryWorkerConfig":{
   *           "numInstances":"5"
   *         }
   *       }
   *     }
   * &lt;strong&gt;Note:&lt;/strong&gt; currently only the following fields can be updated:
   * &lt;table&gt;
   * &lt;tr&gt;
   * &lt;td&gt;&lt;strong&gt;Mask&lt;/strong&gt;&lt;/td&gt;&lt;td&gt;&lt;strong&gt;Purpose&lt;/strong&gt;&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;labels&lt;/td&gt;&lt;td&gt;Updates labels&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.worker_config.num_instances&lt;/td&gt;&lt;td&gt;Resize primary worker
   * group&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.secondary_worker_config.num_instances&lt;/td&gt;&lt;td&gt;Resize secondary
   * worker group&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.lifecycle_config.auto_delete_ttl&lt;/td&gt;&lt;td&gt;Reset MAX TTL
   * duration&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.lifecycle_config.auto_delete_time&lt;/td&gt;&lt;td&gt;Update MAX TTL
   * deletion timestamp&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.lifecycle_config.idle_delete_ttl&lt;/td&gt;&lt;td&gt;Update Idle TTL
   * duration&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;tr&gt;
   * &lt;td&gt;config.autoscaling_config.policy_uri&lt;/td&gt;&lt;td&gt;Use, stop using, or change
   * autoscaling policies&lt;/td&gt;
   * &lt;/tr&gt;
   * &lt;/table&gt;
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Optional. A unique id used to identify the request. If the server
   * receives two [UpdateClusterRequest][google.cloud.dataproc.v1beta2.UpdateClusterRequest] requests  with the same
   * id, then the second request will be ignored and the
   * first [google.longrunning.Operation][google.longrunning.Operation] created and stored in the
   * backend is returned.
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. A unique id used to identify the request. If the server
   * receives two [UpdateClusterRequest][google.cloud.dataproc.v1beta2.UpdateClusterRequest] requests  with the same
   * id, then the second request will be ignored and the
   * first [google.longrunning.Operation][google.longrunning.Operation] created and stored in the
   * backend is returned.
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
